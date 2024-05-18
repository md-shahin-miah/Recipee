package com.shahin.androidflow.adapter


import android.content.Context
import android.view.ActionMode
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.shahin.androidflow.R


import com.shahin.androidflow.Utlis.RecipesDiffUtil
import com.shahin.androidflow.databinding.FavoriteRecipeRowLayoutBinding
import com.shahin.androidflow.roomDB.dao.FoodRecipeDao
import com.shahin.androidflow.roomDB.entity.FavoritesEntity
import com.shahin.androidflow.viewmodel.RecipesViewModel

import org.jsoup.Jsoup

class FavoriteRecipesAdapter(
    private val requireActivity: FragmentActivity,
    private val mainViewModel: RecipesViewModel,
) :
    RecyclerView.Adapter<FavoriteRecipesAdapter.MyViewHolder>(), ActionMode.Callback {

    private var multiSelection = false
    private lateinit var mActionMode: ActionMode
    private lateinit var rootView: View

    private var selectedRecipes = arrayListOf<FavoritesEntity>()
    private var myViewHolders = arrayListOf<MyViewHolder>()
    private var favoriteRecipes = emptyList<FavoritesEntity>()

    private var context: Context? = null

    class MyViewHolder(val binding: FavoriteRecipeRowLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(result: FavoritesEntity) {
            binding.favoriteTitleTextView.text = result.title
            binding.favoriteClockTextView.text = result.readyInMinutes.toString() + " min"
            binding.favoriteRecipeImageView.load(result.image) {
                crossfade(600)
                error(R.drawable.ic_error_placeholder)
            }
            binding.favoriteHeartImageView.load(R.drawable.ic_favorite)
            applyVeganColor(binding.favoriteLeafImageView, result.vegan)
            applyVeganColor(binding.favoriteLeafImageView, result.vegan)
            parseHtml(binding.favoriteDescriptionTextView, result.summary)
        }
        private fun applyVeganColor(view: View, vegan: Boolean) {
            if (vegan) {
                when (view) {
                    is TextView -> {
                        view.setTextColor(
                            ContextCompat.getColor(
                                view.context,
                                R.color.green
                            )
                        )
                    }

                    is ImageView -> {
                        view.setColorFilter(
                            ContextCompat.getColor(
                                view.context,
                                R.color.green
                            )
                        )
                    }
                }
            }
        }

        private fun parseHtml(textView: TextView, description: String?) {
            if (description != null) {
                val desc = Jsoup.parse(description).text()
                textView.text = desc
            }
        }

        companion object {
            fun from(parent: ViewGroup): MyViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = FavoriteRecipeRowLayoutBinding.inflate(layoutInflater, parent, false)
                return MyViewHolder(binding)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        context = parent.context
        return MyViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        myViewHolders.add(holder)
        rootView = holder.itemView.rootView

        val result = favoriteRecipes[position]
        holder.binding.favoriteHeartImageView.setOnClickListener {
            val favoritesEntity = FavoritesEntity(
                0,
                result.aggregateLikes,
                result.cheap,
                result.dairyFree,
                result.glutenFree,
                result.recipeId,
                result.image,
                result.readyInMinutes,
                result.sourceName,
                result.sourceUrl,
                result.summary,
                result.title,
                result.vegan,
                result.vegetarian,
                result.veryHealthy
            )
            mainViewModel.deleteFavoriteRecipe(favoritesEntity)
            showSnackBar("Remove from Favorite")
            holder.binding.favoriteHeartImageView.load(R.drawable.ic_favorite_border)
        }

        holder.bind(result)

        saveItemStateOnScroll(result, holder)

        /**
         * Single Click Listener
         * */

        holder.binding.favoriteRecipesRowLayout.setOnClickListener {
            if (multiSelection) {
                applySelection(holder, result)
            } else {
                Toast.makeText(context, "clicked", Toast.LENGTH_SHORT).show()
            }
        }

        /**
         * Long Click Listener
         */
        holder.binding.favoriteRecipesRowLayout.setOnLongClickListener {
            if (!multiSelection) {
                multiSelection = true
                requireActivity.startActionMode(this)
                applySelection(holder, result)
                true
            } else {
                applySelection(holder, result)
                true
            }
        }
    }

    override fun getItemCount(): Int {
        return favoriteRecipes.size
    }

    private fun saveItemStateOnScroll(currentRecipe: FavoritesEntity, holder: MyViewHolder) {
        if (selectedRecipes.contains(currentRecipe)) {
            changeRecipeStyle(holder, R.color.cardBackgroundLightColor, R.color.colorPrimary)
        } else {
            changeRecipeStyle(holder, R.color.cardBackgroundColor, R.color.strokeColor)
        }
    }

    private fun applySelection(holder: MyViewHolder, currentRecipe: FavoritesEntity) {
        if (selectedRecipes.contains(currentRecipe)) {
            selectedRecipes.remove(currentRecipe)
            changeRecipeStyle(holder, R.color.cardBackgroundColor, R.color.strokeColor)
            applyActionModeTitle()
        } else {
            selectedRecipes.add(currentRecipe)
            changeRecipeStyle(holder, R.color.cardBackgroundLightColor, R.color.colorPrimary)
            applyActionModeTitle()
        }
    }

    private fun changeRecipeStyle(holder: MyViewHolder, backgroundColor: Int, strokeColor: Int) {
        holder.binding.favoriteRecipesRowLayout.setBackgroundColor(
            ContextCompat.getColor(requireActivity, backgroundColor)
        )
        holder.binding.favoriteRowCardView.strokeColor =
            ContextCompat.getColor(requireActivity, strokeColor)
    }

    private fun applyActionModeTitle() {
        when (selectedRecipes.size) {
            0 -> {
                mActionMode.finish()
                multiSelection = false
            }

            1 -> mActionMode.title = "${selectedRecipes.size} item Selected"
            else -> mActionMode.title = "${selectedRecipes.size} items selected"
        }
    }

    override fun onCreateActionMode(actionMode: ActionMode?, menu: Menu?): Boolean {
        actionMode?.menuInflater?.inflate(R.menu.favorites_contextual_menu, menu)
        mActionMode = actionMode!!
        applyStatusBarColor(R.color.contextualStatusBarColor)
        return true
    }

    override fun onPrepareActionMode(actionMode: ActionMode?, menu: Menu?): Boolean {
        return true
    }

    override fun onActionItemClicked(actionMode: ActionMode?, menu: MenuItem?): Boolean {
        if (menu?.itemId == R.id.delete_favorite_recipe_menu) {
            selectedRecipes.forEach {
                mainViewModel.deleteFavoriteRecipe(it)
            }
            showSnackBar("${selectedRecipes.size} Recipe/s removed.")

            multiSelection = false
            selectedRecipes.clear()
            actionMode?.finish()
        }
        return true
    }

    override fun onDestroyActionMode(actionMode: ActionMode?) {
        myViewHolders.forEach { holder ->
            changeRecipeStyle(holder, R.color.cardBackgroundColor, R.color.strokeColor)
        }
        multiSelection = false
        selectedRecipes.clear()
        applyStatusBarColor(R.color.statusBarColor)
    }

    private fun applyStatusBarColor(color: Int) {
        requireActivity.window.statusBarColor =
            ContextCompat.getColor(requireActivity, color)
    }

    fun setData(newFavoriteRecipes: List<FavoritesEntity>, db: FoodRecipeDao) {
        val favoriteRecipesDiffUtil =
            RecipesDiffUtil(favoriteRecipes, newFavoriteRecipes)
        val diffUtilResult = DiffUtil.calculateDiff(favoriteRecipesDiffUtil)
        favoriteRecipes = newFavoriteRecipes
        diffUtilResult.dispatchUpdatesTo(this)
    }

    private fun showSnackBar(message: String) {
        Toast.makeText(context, ""+message, Toast.LENGTH_SHORT).show()
    }

    fun clearContextualActionMode() {
        if (this::mActionMode.isInitialized) {
            mActionMode.finish()
        }
    }
}