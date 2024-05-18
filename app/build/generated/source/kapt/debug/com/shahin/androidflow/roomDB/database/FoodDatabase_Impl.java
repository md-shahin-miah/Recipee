package com.shahin.androidflow.roomDB.database;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.shahin.androidflow.roomDB.dao.FoodRecipeDao;
import com.shahin.androidflow.roomDB.dao.FoodRecipeDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class FoodDatabase_Impl extends FoodDatabase {
  private volatile FoodRecipeDao _foodRecipeDao;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `favorite_recipes_table` (`AUTOid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `aggregateLikes` INTEGER NOT NULL, `cheap` INTEGER NOT NULL, `dairyFree` INTEGER NOT NULL, `glutenFree` INTEGER NOT NULL, `recipeId` INTEGER NOT NULL, `image` TEXT NOT NULL, `readyInMinutes` INTEGER NOT NULL, `sourceName` TEXT, `sourceUrl` TEXT NOT NULL, `summary` TEXT NOT NULL, `title` TEXT NOT NULL, `vegan` INTEGER NOT NULL, `vegetarian` INTEGER NOT NULL, `veryHealthy` INTEGER NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `recipes_table` (`AUTOid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `aggregateLikes` INTEGER NOT NULL, `cheap` INTEGER NOT NULL, `dairyFree` INTEGER NOT NULL, `glutenFree` INTEGER NOT NULL, `recipeId` INTEGER, `image` TEXT NOT NULL, `readyInMinutes` INTEGER NOT NULL, `sourceName` TEXT, `sourceUrl` TEXT NOT NULL, `summary` TEXT NOT NULL, `title` TEXT NOT NULL, `vegan` INTEGER NOT NULL, `vegetarian` INTEGER NOT NULL, `veryHealthy` INTEGER NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `ResultEntity` (`AUTOid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `aggregateLikes` INTEGER, `cheap` INTEGER, `dairyFree` INTEGER, `glutenFree` INTEGER, `recipeId` INTEGER, `image` TEXT NOT NULL, `readyInMinutes` INTEGER NOT NULL, `sourceName` TEXT, `sourceUrl` TEXT NOT NULL, `summary` TEXT NOT NULL, `title` TEXT NOT NULL, `vegan` INTEGER NOT NULL, `vegetarian` INTEGER NOT NULL, `veryHealthy` INTEGER NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'af8b9f456feb3cdd5f1bc98c5137ff28')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `favorite_recipes_table`");
        db.execSQL("DROP TABLE IF EXISTS `recipes_table`");
        db.execSQL("DROP TABLE IF EXISTS `ResultEntity`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsFavoriteRecipesTable = new HashMap<String, TableInfo.Column>(15);
        _columnsFavoriteRecipesTable.put("AUTOid", new TableInfo.Column("AUTOid", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteRecipesTable.put("aggregateLikes", new TableInfo.Column("aggregateLikes", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteRecipesTable.put("cheap", new TableInfo.Column("cheap", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteRecipesTable.put("dairyFree", new TableInfo.Column("dairyFree", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteRecipesTable.put("glutenFree", new TableInfo.Column("glutenFree", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteRecipesTable.put("recipeId", new TableInfo.Column("recipeId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteRecipesTable.put("image", new TableInfo.Column("image", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteRecipesTable.put("readyInMinutes", new TableInfo.Column("readyInMinutes", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteRecipesTable.put("sourceName", new TableInfo.Column("sourceName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteRecipesTable.put("sourceUrl", new TableInfo.Column("sourceUrl", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteRecipesTable.put("summary", new TableInfo.Column("summary", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteRecipesTable.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteRecipesTable.put("vegan", new TableInfo.Column("vegan", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteRecipesTable.put("vegetarian", new TableInfo.Column("vegetarian", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteRecipesTable.put("veryHealthy", new TableInfo.Column("veryHealthy", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFavoriteRecipesTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFavoriteRecipesTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFavoriteRecipesTable = new TableInfo("favorite_recipes_table", _columnsFavoriteRecipesTable, _foreignKeysFavoriteRecipesTable, _indicesFavoriteRecipesTable);
        final TableInfo _existingFavoriteRecipesTable = TableInfo.read(db, "favorite_recipes_table");
        if (!_infoFavoriteRecipesTable.equals(_existingFavoriteRecipesTable)) {
          return new RoomOpenHelper.ValidationResult(false, "favorite_recipes_table(com.shahin.androidflow.roomDB.entity.FavoritesEntity).\n"
                  + " Expected:\n" + _infoFavoriteRecipesTable + "\n"
                  + " Found:\n" + _existingFavoriteRecipesTable);
        }
        final HashMap<String, TableInfo.Column> _columnsRecipesTable = new HashMap<String, TableInfo.Column>(15);
        _columnsRecipesTable.put("AUTOid", new TableInfo.Column("AUTOid", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipesTable.put("aggregateLikes", new TableInfo.Column("aggregateLikes", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipesTable.put("cheap", new TableInfo.Column("cheap", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipesTable.put("dairyFree", new TableInfo.Column("dairyFree", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipesTable.put("glutenFree", new TableInfo.Column("glutenFree", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipesTable.put("recipeId", new TableInfo.Column("recipeId", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipesTable.put("image", new TableInfo.Column("image", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipesTable.put("readyInMinutes", new TableInfo.Column("readyInMinutes", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipesTable.put("sourceName", new TableInfo.Column("sourceName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipesTable.put("sourceUrl", new TableInfo.Column("sourceUrl", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipesTable.put("summary", new TableInfo.Column("summary", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipesTable.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipesTable.put("vegan", new TableInfo.Column("vegan", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipesTable.put("vegetarian", new TableInfo.Column("vegetarian", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipesTable.put("veryHealthy", new TableInfo.Column("veryHealthy", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRecipesTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRecipesTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRecipesTable = new TableInfo("recipes_table", _columnsRecipesTable, _foreignKeysRecipesTable, _indicesRecipesTable);
        final TableInfo _existingRecipesTable = TableInfo.read(db, "recipes_table");
        if (!_infoRecipesTable.equals(_existingRecipesTable)) {
          return new RoomOpenHelper.ValidationResult(false, "recipes_table(com.shahin.androidflow.models.ResultListing).\n"
                  + " Expected:\n" + _infoRecipesTable + "\n"
                  + " Found:\n" + _existingRecipesTable);
        }
        final HashMap<String, TableInfo.Column> _columnsResultEntity = new HashMap<String, TableInfo.Column>(15);
        _columnsResultEntity.put("AUTOid", new TableInfo.Column("AUTOid", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResultEntity.put("aggregateLikes", new TableInfo.Column("aggregateLikes", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResultEntity.put("cheap", new TableInfo.Column("cheap", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResultEntity.put("dairyFree", new TableInfo.Column("dairyFree", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResultEntity.put("glutenFree", new TableInfo.Column("glutenFree", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResultEntity.put("recipeId", new TableInfo.Column("recipeId", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResultEntity.put("image", new TableInfo.Column("image", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResultEntity.put("readyInMinutes", new TableInfo.Column("readyInMinutes", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResultEntity.put("sourceName", new TableInfo.Column("sourceName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResultEntity.put("sourceUrl", new TableInfo.Column("sourceUrl", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResultEntity.put("summary", new TableInfo.Column("summary", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResultEntity.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResultEntity.put("vegan", new TableInfo.Column("vegan", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResultEntity.put("vegetarian", new TableInfo.Column("vegetarian", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResultEntity.put("veryHealthy", new TableInfo.Column("veryHealthy", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysResultEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesResultEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoResultEntity = new TableInfo("ResultEntity", _columnsResultEntity, _foreignKeysResultEntity, _indicesResultEntity);
        final TableInfo _existingResultEntity = TableInfo.read(db, "ResultEntity");
        if (!_infoResultEntity.equals(_existingResultEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "ResultEntity(com.shahin.androidflow.models.ResultEntity).\n"
                  + " Expected:\n" + _infoResultEntity + "\n"
                  + " Found:\n" + _existingResultEntity);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "af8b9f456feb3cdd5f1bc98c5137ff28", "7a8f506035860367880bf61ce3364034");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "favorite_recipes_table","recipes_table","ResultEntity");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `favorite_recipes_table`");
      _db.execSQL("DELETE FROM `recipes_table`");
      _db.execSQL("DELETE FROM `ResultEntity`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(FoodRecipeDao.class, FoodRecipeDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public FoodRecipeDao getFoodRecipeDao() {
    if (_foodRecipeDao != null) {
      return _foodRecipeDao;
    } else {
      synchronized(this) {
        if(_foodRecipeDao == null) {
          _foodRecipeDao = new FoodRecipeDao_Impl(this);
        }
        return _foodRecipeDao;
      }
    }
  }
}
