package com.shahin.androidflow.roomDB.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.shahin.androidflow.models.ResultListing;
import com.shahin.androidflow.roomDB.entity.FavoritesEntity;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class FoodRecipeDao_Impl implements FoodRecipeDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ResultListing> __insertionAdapterOfResultListing;

  private final EntityInsertionAdapter<FavoritesEntity> __insertionAdapterOfFavoritesEntity;

  private final EntityDeletionOrUpdateAdapter<FavoritesEntity> __deletionAdapterOfFavoritesEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteData;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllData;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllFavoriteRecipes;

  public FoodRecipeDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfResultListing = new EntityInsertionAdapter<ResultListing>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `recipes_table` (`AUTOid`,`aggregateLikes`,`cheap`,`dairyFree`,`glutenFree`,`recipeId`,`image`,`readyInMinutes`,`sourceName`,`sourceUrl`,`summary`,`title`,`vegan`,`vegetarian`,`veryHealthy`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ResultListing entity) {
        statement.bindLong(1, entity.getAUTOid());
        statement.bindLong(2, entity.getAggregateLikes());
        final int _tmp = entity.getCheap() ? 1 : 0;
        statement.bindLong(3, _tmp);
        final int _tmp_1 = entity.getDairyFree() ? 1 : 0;
        statement.bindLong(4, _tmp_1);
        final int _tmp_2 = entity.getGlutenFree() ? 1 : 0;
        statement.bindLong(5, _tmp_2);
        if (entity.getRecipeId() == null) {
          statement.bindNull(6);
        } else {
          statement.bindLong(6, entity.getRecipeId());
        }
        if (entity.getImage() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getImage());
        }
        statement.bindLong(8, entity.getReadyInMinutes());
        if (entity.getSourceName() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getSourceName());
        }
        if (entity.getSourceUrl() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getSourceUrl());
        }
        if (entity.getSummary() == null) {
          statement.bindNull(11);
        } else {
          statement.bindString(11, entity.getSummary());
        }
        if (entity.getTitle() == null) {
          statement.bindNull(12);
        } else {
          statement.bindString(12, entity.getTitle());
        }
        final int _tmp_3 = entity.getVegan() ? 1 : 0;
        statement.bindLong(13, _tmp_3);
        final int _tmp_4 = entity.getVegetarian() ? 1 : 0;
        statement.bindLong(14, _tmp_4);
        final int _tmp_5 = entity.getVeryHealthy() ? 1 : 0;
        statement.bindLong(15, _tmp_5);
      }
    };
    this.__insertionAdapterOfFavoritesEntity = new EntityInsertionAdapter<FavoritesEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `favorite_recipes_table` (`AUTOid`,`aggregateLikes`,`cheap`,`dairyFree`,`glutenFree`,`recipeId`,`image`,`readyInMinutes`,`sourceName`,`sourceUrl`,`summary`,`title`,`vegan`,`vegetarian`,`veryHealthy`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final FavoritesEntity entity) {
        statement.bindLong(1, entity.getAUTOid());
        statement.bindLong(2, entity.getAggregateLikes());
        final int _tmp = entity.getCheap() ? 1 : 0;
        statement.bindLong(3, _tmp);
        final int _tmp_1 = entity.getDairyFree() ? 1 : 0;
        statement.bindLong(4, _tmp_1);
        final int _tmp_2 = entity.getGlutenFree() ? 1 : 0;
        statement.bindLong(5, _tmp_2);
        statement.bindLong(6, entity.getRecipeId());
        if (entity.getImage() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getImage());
        }
        statement.bindLong(8, entity.getReadyInMinutes());
        if (entity.getSourceName() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getSourceName());
        }
        if (entity.getSourceUrl() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getSourceUrl());
        }
        if (entity.getSummary() == null) {
          statement.bindNull(11);
        } else {
          statement.bindString(11, entity.getSummary());
        }
        if (entity.getTitle() == null) {
          statement.bindNull(12);
        } else {
          statement.bindString(12, entity.getTitle());
        }
        final int _tmp_3 = entity.getVegan() ? 1 : 0;
        statement.bindLong(13, _tmp_3);
        final int _tmp_4 = entity.getVegetarian() ? 1 : 0;
        statement.bindLong(14, _tmp_4);
        final int _tmp_5 = entity.getVeryHealthy() ? 1 : 0;
        statement.bindLong(15, _tmp_5);
      }
    };
    this.__deletionAdapterOfFavoritesEntity = new EntityDeletionOrUpdateAdapter<FavoritesEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `favorite_recipes_table` WHERE `AUTOid` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final FavoritesEntity entity) {
        statement.bindLong(1, entity.getAUTOid());
      }
    };
    this.__preparedStmtOfDeleteData = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM favorite_recipes_table WHERE recipeId = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAllData = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM recipes_table";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAllFavoriteRecipes = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM favorite_recipes_table";
        return _query;
      }
    };
  }

  @Override
  public Object insertRecipes(final List<ResultListing> resultListing,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfResultListing.insert(resultListing);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public void insertFavorite(final FavoritesEntity model) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfFavoritesEntity.insert(model);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Object deleteFavoriteRecipe(final FavoritesEntity favoritesEntity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfFavoritesEntity.handle(favoritesEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public void deleteData(final int id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteData.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, id);
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfDeleteData.release(_stmt);
    }
  }

  @Override
  public void deleteAllData() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllData.acquire();
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfDeleteAllData.release(_stmt);
    }
  }

  @Override
  public Object deleteAllFavoriteRecipes(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllFavoriteRecipes.acquire();
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfDeleteAllFavoriteRecipes.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Flow<List<FavoritesEntity>> getAllFavouriteData() {
    final String _sql = "SELECT * FROM favorite_recipes_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"favorite_recipes_table"}, new Callable<List<FavoritesEntity>>() {
      @Override
      @NonNull
      public List<FavoritesEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfAUTOid = CursorUtil.getColumnIndexOrThrow(_cursor, "AUTOid");
          final int _cursorIndexOfAggregateLikes = CursorUtil.getColumnIndexOrThrow(_cursor, "aggregateLikes");
          final int _cursorIndexOfCheap = CursorUtil.getColumnIndexOrThrow(_cursor, "cheap");
          final int _cursorIndexOfDairyFree = CursorUtil.getColumnIndexOrThrow(_cursor, "dairyFree");
          final int _cursorIndexOfGlutenFree = CursorUtil.getColumnIndexOrThrow(_cursor, "glutenFree");
          final int _cursorIndexOfRecipeId = CursorUtil.getColumnIndexOrThrow(_cursor, "recipeId");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfReadyInMinutes = CursorUtil.getColumnIndexOrThrow(_cursor, "readyInMinutes");
          final int _cursorIndexOfSourceName = CursorUtil.getColumnIndexOrThrow(_cursor, "sourceName");
          final int _cursorIndexOfSourceUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "sourceUrl");
          final int _cursorIndexOfSummary = CursorUtil.getColumnIndexOrThrow(_cursor, "summary");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfVegan = CursorUtil.getColumnIndexOrThrow(_cursor, "vegan");
          final int _cursorIndexOfVegetarian = CursorUtil.getColumnIndexOrThrow(_cursor, "vegetarian");
          final int _cursorIndexOfVeryHealthy = CursorUtil.getColumnIndexOrThrow(_cursor, "veryHealthy");
          final List<FavoritesEntity> _result = new ArrayList<FavoritesEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final FavoritesEntity _item;
            final int _tmpAUTOid;
            _tmpAUTOid = _cursor.getInt(_cursorIndexOfAUTOid);
            final int _tmpAggregateLikes;
            _tmpAggregateLikes = _cursor.getInt(_cursorIndexOfAggregateLikes);
            final boolean _tmpCheap;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfCheap);
            _tmpCheap = _tmp != 0;
            final boolean _tmpDairyFree;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfDairyFree);
            _tmpDairyFree = _tmp_1 != 0;
            final boolean _tmpGlutenFree;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfGlutenFree);
            _tmpGlutenFree = _tmp_2 != 0;
            final int _tmpRecipeId;
            _tmpRecipeId = _cursor.getInt(_cursorIndexOfRecipeId);
            final String _tmpImage;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmpImage = null;
            } else {
              _tmpImage = _cursor.getString(_cursorIndexOfImage);
            }
            final int _tmpReadyInMinutes;
            _tmpReadyInMinutes = _cursor.getInt(_cursorIndexOfReadyInMinutes);
            final String _tmpSourceName;
            if (_cursor.isNull(_cursorIndexOfSourceName)) {
              _tmpSourceName = null;
            } else {
              _tmpSourceName = _cursor.getString(_cursorIndexOfSourceName);
            }
            final String _tmpSourceUrl;
            if (_cursor.isNull(_cursorIndexOfSourceUrl)) {
              _tmpSourceUrl = null;
            } else {
              _tmpSourceUrl = _cursor.getString(_cursorIndexOfSourceUrl);
            }
            final String _tmpSummary;
            if (_cursor.isNull(_cursorIndexOfSummary)) {
              _tmpSummary = null;
            } else {
              _tmpSummary = _cursor.getString(_cursorIndexOfSummary);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final boolean _tmpVegan;
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfVegan);
            _tmpVegan = _tmp_3 != 0;
            final boolean _tmpVegetarian;
            final int _tmp_4;
            _tmp_4 = _cursor.getInt(_cursorIndexOfVegetarian);
            _tmpVegetarian = _tmp_4 != 0;
            final boolean _tmpVeryHealthy;
            final int _tmp_5;
            _tmp_5 = _cursor.getInt(_cursorIndexOfVeryHealthy);
            _tmpVeryHealthy = _tmp_5 != 0;
            _item = new FavoritesEntity(_tmpAUTOid,_tmpAggregateLikes,_tmpCheap,_tmpDairyFree,_tmpGlutenFree,_tmpRecipeId,_tmpImage,_tmpReadyInMinutes,_tmpSourceName,_tmpSourceUrl,_tmpSummary,_tmpTitle,_tmpVegan,_tmpVegetarian,_tmpVeryHealthy);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public boolean isFavorite(final int id) {
    final String _sql = "SELECT EXISTS (SELECT 1 FROM favorite_recipes_table WHERE recipeId = ?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final boolean _result;
      if (_cursor.moveToFirst()) {
        final int _tmp;
        _tmp = _cursor.getInt(0);
        _result = _tmp != 0;
      } else {
        _result = false;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int getRowCount() {
    final String _sql = "SELECT COUNT (recipeId) FROM recipes_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Object getPagedList(final int limit, final int offset,
      final Continuation<? super List<ResultListing>> continuation) {
    final String _sql = "SELECT * FROM recipes_table ORDER BY recipeId ASC LIMIT ? OFFSET ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, limit);
    _argIndex = 2;
    _statement.bindLong(_argIndex, offset);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<ResultListing>>() {
      @Override
      @NonNull
      public List<ResultListing> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfAUTOid = CursorUtil.getColumnIndexOrThrow(_cursor, "AUTOid");
          final int _cursorIndexOfAggregateLikes = CursorUtil.getColumnIndexOrThrow(_cursor, "aggregateLikes");
          final int _cursorIndexOfCheap = CursorUtil.getColumnIndexOrThrow(_cursor, "cheap");
          final int _cursorIndexOfDairyFree = CursorUtil.getColumnIndexOrThrow(_cursor, "dairyFree");
          final int _cursorIndexOfGlutenFree = CursorUtil.getColumnIndexOrThrow(_cursor, "glutenFree");
          final int _cursorIndexOfRecipeId = CursorUtil.getColumnIndexOrThrow(_cursor, "recipeId");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfReadyInMinutes = CursorUtil.getColumnIndexOrThrow(_cursor, "readyInMinutes");
          final int _cursorIndexOfSourceName = CursorUtil.getColumnIndexOrThrow(_cursor, "sourceName");
          final int _cursorIndexOfSourceUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "sourceUrl");
          final int _cursorIndexOfSummary = CursorUtil.getColumnIndexOrThrow(_cursor, "summary");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfVegan = CursorUtil.getColumnIndexOrThrow(_cursor, "vegan");
          final int _cursorIndexOfVegetarian = CursorUtil.getColumnIndexOrThrow(_cursor, "vegetarian");
          final int _cursorIndexOfVeryHealthy = CursorUtil.getColumnIndexOrThrow(_cursor, "veryHealthy");
          final List<ResultListing> _result = new ArrayList<ResultListing>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final ResultListing _item;
            final int _tmpAUTOid;
            _tmpAUTOid = _cursor.getInt(_cursorIndexOfAUTOid);
            final int _tmpAggregateLikes;
            _tmpAggregateLikes = _cursor.getInt(_cursorIndexOfAggregateLikes);
            final boolean _tmpCheap;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfCheap);
            _tmpCheap = _tmp != 0;
            final boolean _tmpDairyFree;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfDairyFree);
            _tmpDairyFree = _tmp_1 != 0;
            final boolean _tmpGlutenFree;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfGlutenFree);
            _tmpGlutenFree = _tmp_2 != 0;
            final Integer _tmpRecipeId;
            if (_cursor.isNull(_cursorIndexOfRecipeId)) {
              _tmpRecipeId = null;
            } else {
              _tmpRecipeId = _cursor.getInt(_cursorIndexOfRecipeId);
            }
            final String _tmpImage;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmpImage = null;
            } else {
              _tmpImage = _cursor.getString(_cursorIndexOfImage);
            }
            final int _tmpReadyInMinutes;
            _tmpReadyInMinutes = _cursor.getInt(_cursorIndexOfReadyInMinutes);
            final String _tmpSourceName;
            if (_cursor.isNull(_cursorIndexOfSourceName)) {
              _tmpSourceName = null;
            } else {
              _tmpSourceName = _cursor.getString(_cursorIndexOfSourceName);
            }
            final String _tmpSourceUrl;
            if (_cursor.isNull(_cursorIndexOfSourceUrl)) {
              _tmpSourceUrl = null;
            } else {
              _tmpSourceUrl = _cursor.getString(_cursorIndexOfSourceUrl);
            }
            final String _tmpSummary;
            if (_cursor.isNull(_cursorIndexOfSummary)) {
              _tmpSummary = null;
            } else {
              _tmpSummary = _cursor.getString(_cursorIndexOfSummary);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final boolean _tmpVegan;
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfVegan);
            _tmpVegan = _tmp_3 != 0;
            final boolean _tmpVegetarian;
            final int _tmp_4;
            _tmp_4 = _cursor.getInt(_cursorIndexOfVegetarian);
            _tmpVegetarian = _tmp_4 != 0;
            final boolean _tmpVeryHealthy;
            final int _tmp_5;
            _tmp_5 = _cursor.getInt(_cursorIndexOfVeryHealthy);
            _tmpVeryHealthy = _tmp_5 != 0;
            _item = new ResultListing(_tmpAUTOid,_tmpAggregateLikes,_tmpCheap,_tmpDairyFree,_tmpGlutenFree,_tmpRecipeId,_tmpImage,_tmpReadyInMinutes,_tmpSourceName,_tmpSourceUrl,_tmpSummary,_tmpTitle,_tmpVegan,_tmpVegetarian,_tmpVeryHealthy);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public Flow<List<ResultListing>> readRecipes() {
    final String _sql = "SELECT * FROM recipes_table ORDER BY AUTOid ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"recipes_table"}, new Callable<List<ResultListing>>() {
      @Override
      @NonNull
      public List<ResultListing> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfAUTOid = CursorUtil.getColumnIndexOrThrow(_cursor, "AUTOid");
          final int _cursorIndexOfAggregateLikes = CursorUtil.getColumnIndexOrThrow(_cursor, "aggregateLikes");
          final int _cursorIndexOfCheap = CursorUtil.getColumnIndexOrThrow(_cursor, "cheap");
          final int _cursorIndexOfDairyFree = CursorUtil.getColumnIndexOrThrow(_cursor, "dairyFree");
          final int _cursorIndexOfGlutenFree = CursorUtil.getColumnIndexOrThrow(_cursor, "glutenFree");
          final int _cursorIndexOfRecipeId = CursorUtil.getColumnIndexOrThrow(_cursor, "recipeId");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfReadyInMinutes = CursorUtil.getColumnIndexOrThrow(_cursor, "readyInMinutes");
          final int _cursorIndexOfSourceName = CursorUtil.getColumnIndexOrThrow(_cursor, "sourceName");
          final int _cursorIndexOfSourceUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "sourceUrl");
          final int _cursorIndexOfSummary = CursorUtil.getColumnIndexOrThrow(_cursor, "summary");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfVegan = CursorUtil.getColumnIndexOrThrow(_cursor, "vegan");
          final int _cursorIndexOfVegetarian = CursorUtil.getColumnIndexOrThrow(_cursor, "vegetarian");
          final int _cursorIndexOfVeryHealthy = CursorUtil.getColumnIndexOrThrow(_cursor, "veryHealthy");
          final List<ResultListing> _result = new ArrayList<ResultListing>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final ResultListing _item;
            final int _tmpAUTOid;
            _tmpAUTOid = _cursor.getInt(_cursorIndexOfAUTOid);
            final int _tmpAggregateLikes;
            _tmpAggregateLikes = _cursor.getInt(_cursorIndexOfAggregateLikes);
            final boolean _tmpCheap;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfCheap);
            _tmpCheap = _tmp != 0;
            final boolean _tmpDairyFree;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfDairyFree);
            _tmpDairyFree = _tmp_1 != 0;
            final boolean _tmpGlutenFree;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfGlutenFree);
            _tmpGlutenFree = _tmp_2 != 0;
            final Integer _tmpRecipeId;
            if (_cursor.isNull(_cursorIndexOfRecipeId)) {
              _tmpRecipeId = null;
            } else {
              _tmpRecipeId = _cursor.getInt(_cursorIndexOfRecipeId);
            }
            final String _tmpImage;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmpImage = null;
            } else {
              _tmpImage = _cursor.getString(_cursorIndexOfImage);
            }
            final int _tmpReadyInMinutes;
            _tmpReadyInMinutes = _cursor.getInt(_cursorIndexOfReadyInMinutes);
            final String _tmpSourceName;
            if (_cursor.isNull(_cursorIndexOfSourceName)) {
              _tmpSourceName = null;
            } else {
              _tmpSourceName = _cursor.getString(_cursorIndexOfSourceName);
            }
            final String _tmpSourceUrl;
            if (_cursor.isNull(_cursorIndexOfSourceUrl)) {
              _tmpSourceUrl = null;
            } else {
              _tmpSourceUrl = _cursor.getString(_cursorIndexOfSourceUrl);
            }
            final String _tmpSummary;
            if (_cursor.isNull(_cursorIndexOfSummary)) {
              _tmpSummary = null;
            } else {
              _tmpSummary = _cursor.getString(_cursorIndexOfSummary);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final boolean _tmpVegan;
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfVegan);
            _tmpVegan = _tmp_3 != 0;
            final boolean _tmpVegetarian;
            final int _tmp_4;
            _tmp_4 = _cursor.getInt(_cursorIndexOfVegetarian);
            _tmpVegetarian = _tmp_4 != 0;
            final boolean _tmpVeryHealthy;
            final int _tmp_5;
            _tmp_5 = _cursor.getInt(_cursorIndexOfVeryHealthy);
            _tmpVeryHealthy = _tmp_5 != 0;
            _item = new ResultListing(_tmpAUTOid,_tmpAggregateLikes,_tmpCheap,_tmpDairyFree,_tmpGlutenFree,_tmpRecipeId,_tmpImage,_tmpReadyInMinutes,_tmpSourceName,_tmpSourceUrl,_tmpSummary,_tmpTitle,_tmpVegan,_tmpVegetarian,_tmpVeryHealthy);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<FavoritesEntity>> readFavoriteRecipes() {
    final String _sql = "SELECT * FROM favorite_recipes_table ORDER BY recipeId ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"favorite_recipes_table"}, new Callable<List<FavoritesEntity>>() {
      @Override
      @NonNull
      public List<FavoritesEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfAUTOid = CursorUtil.getColumnIndexOrThrow(_cursor, "AUTOid");
          final int _cursorIndexOfAggregateLikes = CursorUtil.getColumnIndexOrThrow(_cursor, "aggregateLikes");
          final int _cursorIndexOfCheap = CursorUtil.getColumnIndexOrThrow(_cursor, "cheap");
          final int _cursorIndexOfDairyFree = CursorUtil.getColumnIndexOrThrow(_cursor, "dairyFree");
          final int _cursorIndexOfGlutenFree = CursorUtil.getColumnIndexOrThrow(_cursor, "glutenFree");
          final int _cursorIndexOfRecipeId = CursorUtil.getColumnIndexOrThrow(_cursor, "recipeId");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfReadyInMinutes = CursorUtil.getColumnIndexOrThrow(_cursor, "readyInMinutes");
          final int _cursorIndexOfSourceName = CursorUtil.getColumnIndexOrThrow(_cursor, "sourceName");
          final int _cursorIndexOfSourceUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "sourceUrl");
          final int _cursorIndexOfSummary = CursorUtil.getColumnIndexOrThrow(_cursor, "summary");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfVegan = CursorUtil.getColumnIndexOrThrow(_cursor, "vegan");
          final int _cursorIndexOfVegetarian = CursorUtil.getColumnIndexOrThrow(_cursor, "vegetarian");
          final int _cursorIndexOfVeryHealthy = CursorUtil.getColumnIndexOrThrow(_cursor, "veryHealthy");
          final List<FavoritesEntity> _result = new ArrayList<FavoritesEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final FavoritesEntity _item;
            final int _tmpAUTOid;
            _tmpAUTOid = _cursor.getInt(_cursorIndexOfAUTOid);
            final int _tmpAggregateLikes;
            _tmpAggregateLikes = _cursor.getInt(_cursorIndexOfAggregateLikes);
            final boolean _tmpCheap;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfCheap);
            _tmpCheap = _tmp != 0;
            final boolean _tmpDairyFree;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfDairyFree);
            _tmpDairyFree = _tmp_1 != 0;
            final boolean _tmpGlutenFree;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfGlutenFree);
            _tmpGlutenFree = _tmp_2 != 0;
            final int _tmpRecipeId;
            _tmpRecipeId = _cursor.getInt(_cursorIndexOfRecipeId);
            final String _tmpImage;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmpImage = null;
            } else {
              _tmpImage = _cursor.getString(_cursorIndexOfImage);
            }
            final int _tmpReadyInMinutes;
            _tmpReadyInMinutes = _cursor.getInt(_cursorIndexOfReadyInMinutes);
            final String _tmpSourceName;
            if (_cursor.isNull(_cursorIndexOfSourceName)) {
              _tmpSourceName = null;
            } else {
              _tmpSourceName = _cursor.getString(_cursorIndexOfSourceName);
            }
            final String _tmpSourceUrl;
            if (_cursor.isNull(_cursorIndexOfSourceUrl)) {
              _tmpSourceUrl = null;
            } else {
              _tmpSourceUrl = _cursor.getString(_cursorIndexOfSourceUrl);
            }
            final String _tmpSummary;
            if (_cursor.isNull(_cursorIndexOfSummary)) {
              _tmpSummary = null;
            } else {
              _tmpSummary = _cursor.getString(_cursorIndexOfSummary);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final boolean _tmpVegan;
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfVegan);
            _tmpVegan = _tmp_3 != 0;
            final boolean _tmpVegetarian;
            final int _tmp_4;
            _tmp_4 = _cursor.getInt(_cursorIndexOfVegetarian);
            _tmpVegetarian = _tmp_4 != 0;
            final boolean _tmpVeryHealthy;
            final int _tmp_5;
            _tmp_5 = _cursor.getInt(_cursorIndexOfVeryHealthy);
            _tmpVeryHealthy = _tmp_5 != 0;
            _item = new FavoritesEntity(_tmpAUTOid,_tmpAggregateLikes,_tmpCheap,_tmpDairyFree,_tmpGlutenFree,_tmpRecipeId,_tmpImage,_tmpReadyInMinutes,_tmpSourceName,_tmpSourceUrl,_tmpSummary,_tmpTitle,_tmpVegan,_tmpVegetarian,_tmpVeryHealthy);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
