package com.easyplex.ui.downloadmanager.core.storage;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.easyplex.ui.downloadmanager.core.storage.dao.BrowserBookmarksDao;
import com.easyplex.ui.downloadmanager.core.storage.dao.BrowserBookmarksDao_Impl;
import com.easyplex.ui.downloadmanager.core.storage.dao.DownloadDao;
import com.easyplex.ui.downloadmanager.core.storage.dao.DownloadDao_Impl;
import com.easyplex.ui.downloadmanager.core.storage.dao.UserAgentDao;
import com.easyplex.ui.downloadmanager.core.storage.dao.UserAgentDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile DownloadDao _downloadDao;

  private volatile UserAgentDao _userAgentDao;

  private volatile BrowserBookmarksDao _browserBookmarksDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(8) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `DownloadInfo` (`id` TEXT NOT NULL, `dirPath` TEXT NOT NULL, `url` TEXT NOT NULL, `fileName` TEXT NOT NULL, `mediaName` TEXT, `mediaBackdrop` TEXT, `mediaId` TEXT, `mediatype` TEXT, `refer` TEXT, `description` TEXT, `mimeType` TEXT, `totalBytes` INTEGER NOT NULL, `numPieces` INTEGER NOT NULL, `statusCode` INTEGER NOT NULL, `unmeteredConnectionsOnly` INTEGER NOT NULL, `retry` INTEGER NOT NULL, `partialSupport` INTEGER NOT NULL, `statusMsg` TEXT, `dateAdded` INTEGER NOT NULL, `visibility` INTEGER NOT NULL, `hasMetadata` INTEGER NOT NULL, `userAgent` TEXT, `numFailed` INTEGER NOT NULL, `retryAfter` INTEGER NOT NULL, `lastModify` INTEGER NOT NULL, `checksum` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `DownloadPiece` (`pieceIndex` INTEGER NOT NULL, `infoId` TEXT NOT NULL, `size` INTEGER NOT NULL, `curBytes` INTEGER NOT NULL, `statusCode` INTEGER NOT NULL, `statusMsg` TEXT, `speed` INTEGER NOT NULL, PRIMARY KEY(`pieceIndex`, `infoId`), FOREIGN KEY(`infoId`) REFERENCES `DownloadInfo`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_DownloadPiece_infoId` ON `DownloadPiece` (`infoId`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `download_info_headers` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `infoId` TEXT NOT NULL, `name` TEXT, `value` TEXT, FOREIGN KEY(`infoId`) REFERENCES `DownloadInfo`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_download_info_headers_infoId` ON `download_info_headers` (`infoId`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `UserAgent` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userAgent` TEXT NOT NULL, `readOnly` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `BrowserBookmark` (`url` TEXT NOT NULL, `name` TEXT NOT NULL, `dateAdded` INTEGER NOT NULL, PRIMARY KEY(`url`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '3482463b3f69bd7e4a94e44b4491d397')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `DownloadInfo`");
        _db.execSQL("DROP TABLE IF EXISTS `DownloadPiece`");
        _db.execSQL("DROP TABLE IF EXISTS `download_info_headers`");
        _db.execSQL("DROP TABLE IF EXISTS `UserAgent`");
        _db.execSQL("DROP TABLE IF EXISTS `BrowserBookmark`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      public void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        _db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsDownloadInfo = new HashMap<String, TableInfo.Column>(26);
        _columnsDownloadInfo.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownloadInfo.put("dirPath", new TableInfo.Column("dirPath", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownloadInfo.put("url", new TableInfo.Column("url", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownloadInfo.put("fileName", new TableInfo.Column("fileName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownloadInfo.put("mediaName", new TableInfo.Column("mediaName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownloadInfo.put("mediaBackdrop", new TableInfo.Column("mediaBackdrop", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownloadInfo.put("mediaId", new TableInfo.Column("mediaId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownloadInfo.put("mediatype", new TableInfo.Column("mediatype", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownloadInfo.put("refer", new TableInfo.Column("refer", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownloadInfo.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownloadInfo.put("mimeType", new TableInfo.Column("mimeType", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownloadInfo.put("totalBytes", new TableInfo.Column("totalBytes", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownloadInfo.put("numPieces", new TableInfo.Column("numPieces", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownloadInfo.put("statusCode", new TableInfo.Column("statusCode", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownloadInfo.put("unmeteredConnectionsOnly", new TableInfo.Column("unmeteredConnectionsOnly", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownloadInfo.put("retry", new TableInfo.Column("retry", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownloadInfo.put("partialSupport", new TableInfo.Column("partialSupport", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownloadInfo.put("statusMsg", new TableInfo.Column("statusMsg", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownloadInfo.put("dateAdded", new TableInfo.Column("dateAdded", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownloadInfo.put("visibility", new TableInfo.Column("visibility", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownloadInfo.put("hasMetadata", new TableInfo.Column("hasMetadata", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownloadInfo.put("userAgent", new TableInfo.Column("userAgent", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownloadInfo.put("numFailed", new TableInfo.Column("numFailed", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownloadInfo.put("retryAfter", new TableInfo.Column("retryAfter", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownloadInfo.put("lastModify", new TableInfo.Column("lastModify", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownloadInfo.put("checksum", new TableInfo.Column("checksum", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDownloadInfo = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDownloadInfo = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDownloadInfo = new TableInfo("DownloadInfo", _columnsDownloadInfo, _foreignKeysDownloadInfo, _indicesDownloadInfo);
        final TableInfo _existingDownloadInfo = TableInfo.read(_db, "DownloadInfo");
        if (! _infoDownloadInfo.equals(_existingDownloadInfo)) {
          return new RoomOpenHelper.ValidationResult(false, "DownloadInfo(com.easyplex.ui.downloadmanager.core.model.data.entity.DownloadInfo).\n"
                  + " Expected:\n" + _infoDownloadInfo + "\n"
                  + " Found:\n" + _existingDownloadInfo);
        }
        final HashMap<String, TableInfo.Column> _columnsDownloadPiece = new HashMap<String, TableInfo.Column>(7);
        _columnsDownloadPiece.put("pieceIndex", new TableInfo.Column("pieceIndex", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownloadPiece.put("infoId", new TableInfo.Column("infoId", "TEXT", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownloadPiece.put("size", new TableInfo.Column("size", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownloadPiece.put("curBytes", new TableInfo.Column("curBytes", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownloadPiece.put("statusCode", new TableInfo.Column("statusCode", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownloadPiece.put("statusMsg", new TableInfo.Column("statusMsg", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownloadPiece.put("speed", new TableInfo.Column("speed", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDownloadPiece = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysDownloadPiece.add(new TableInfo.ForeignKey("DownloadInfo", "CASCADE", "NO ACTION",Arrays.asList("infoId"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesDownloadPiece = new HashSet<TableInfo.Index>(1);
        _indicesDownloadPiece.add(new TableInfo.Index("index_DownloadPiece_infoId", false, Arrays.asList("infoId"), Arrays.asList("ASC")));
        final TableInfo _infoDownloadPiece = new TableInfo("DownloadPiece", _columnsDownloadPiece, _foreignKeysDownloadPiece, _indicesDownloadPiece);
        final TableInfo _existingDownloadPiece = TableInfo.read(_db, "DownloadPiece");
        if (! _infoDownloadPiece.equals(_existingDownloadPiece)) {
          return new RoomOpenHelper.ValidationResult(false, "DownloadPiece(com.easyplex.ui.downloadmanager.core.model.data.entity.DownloadPiece).\n"
                  + " Expected:\n" + _infoDownloadPiece + "\n"
                  + " Found:\n" + _existingDownloadPiece);
        }
        final HashMap<String, TableInfo.Column> _columnsDownloadInfoHeaders = new HashMap<String, TableInfo.Column>(4);
        _columnsDownloadInfoHeaders.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownloadInfoHeaders.put("infoId", new TableInfo.Column("infoId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownloadInfoHeaders.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownloadInfoHeaders.put("value", new TableInfo.Column("value", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDownloadInfoHeaders = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysDownloadInfoHeaders.add(new TableInfo.ForeignKey("DownloadInfo", "CASCADE", "NO ACTION",Arrays.asList("infoId"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesDownloadInfoHeaders = new HashSet<TableInfo.Index>(1);
        _indicesDownloadInfoHeaders.add(new TableInfo.Index("index_download_info_headers_infoId", false, Arrays.asList("infoId"), Arrays.asList("ASC")));
        final TableInfo _infoDownloadInfoHeaders = new TableInfo("download_info_headers", _columnsDownloadInfoHeaders, _foreignKeysDownloadInfoHeaders, _indicesDownloadInfoHeaders);
        final TableInfo _existingDownloadInfoHeaders = TableInfo.read(_db, "download_info_headers");
        if (! _infoDownloadInfoHeaders.equals(_existingDownloadInfoHeaders)) {
          return new RoomOpenHelper.ValidationResult(false, "download_info_headers(com.easyplex.ui.downloadmanager.core.model.data.entity.Header).\n"
                  + " Expected:\n" + _infoDownloadInfoHeaders + "\n"
                  + " Found:\n" + _existingDownloadInfoHeaders);
        }
        final HashMap<String, TableInfo.Column> _columnsUserAgent = new HashMap<String, TableInfo.Column>(3);
        _columnsUserAgent.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserAgent.put("userAgent", new TableInfo.Column("userAgent", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserAgent.put("readOnly", new TableInfo.Column("readOnly", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUserAgent = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUserAgent = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUserAgent = new TableInfo("UserAgent", _columnsUserAgent, _foreignKeysUserAgent, _indicesUserAgent);
        final TableInfo _existingUserAgent = TableInfo.read(_db, "UserAgent");
        if (! _infoUserAgent.equals(_existingUserAgent)) {
          return new RoomOpenHelper.ValidationResult(false, "UserAgent(com.easyplex.ui.downloadmanager.core.model.data.entity.UserAgent).\n"
                  + " Expected:\n" + _infoUserAgent + "\n"
                  + " Found:\n" + _existingUserAgent);
        }
        final HashMap<String, TableInfo.Column> _columnsBrowserBookmark = new HashMap<String, TableInfo.Column>(3);
        _columnsBrowserBookmark.put("url", new TableInfo.Column("url", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBrowserBookmark.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBrowserBookmark.put("dateAdded", new TableInfo.Column("dateAdded", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysBrowserBookmark = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesBrowserBookmark = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoBrowserBookmark = new TableInfo("BrowserBookmark", _columnsBrowserBookmark, _foreignKeysBrowserBookmark, _indicesBrowserBookmark);
        final TableInfo _existingBrowserBookmark = TableInfo.read(_db, "BrowserBookmark");
        if (! _infoBrowserBookmark.equals(_existingBrowserBookmark)) {
          return new RoomOpenHelper.ValidationResult(false, "BrowserBookmark(com.easyplex.ui.downloadmanager.core.model.data.entity.BrowserBookmark).\n"
                  + " Expected:\n" + _infoBrowserBookmark + "\n"
                  + " Found:\n" + _existingBrowserBookmark);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "3482463b3f69bd7e4a94e44b4491d397", "aaa33dd4909a5ad52bd5ca3ece4a2394");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "DownloadInfo","DownloadPiece","download_info_headers","UserAgent","BrowserBookmark");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    boolean _supportsDeferForeignKeys = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP;
    try {
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = FALSE");
      }
      super.beginTransaction();
      if (_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA defer_foreign_keys = TRUE");
      }
      _db.execSQL("DELETE FROM `DownloadInfo`");
      _db.execSQL("DELETE FROM `DownloadPiece`");
      _db.execSQL("DELETE FROM `download_info_headers`");
      _db.execSQL("DELETE FROM `UserAgent`");
      _db.execSQL("DELETE FROM `BrowserBookmark`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = TRUE");
      }
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(DownloadDao.class, DownloadDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(UserAgentDao.class, UserAgentDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(BrowserBookmarksDao.class, BrowserBookmarksDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public DownloadDao downloadDao() {
    if (_downloadDao != null) {
      return _downloadDao;
    } else {
      synchronized(this) {
        if(_downloadDao == null) {
          _downloadDao = new DownloadDao_Impl(this);
        }
        return _downloadDao;
      }
    }
  }

  @Override
  public UserAgentDao userAgentDao() {
    if (_userAgentDao != null) {
      return _userAgentDao;
    } else {
      synchronized(this) {
        if(_userAgentDao == null) {
          _userAgentDao = new UserAgentDao_Impl(this);
        }
        return _userAgentDao;
      }
    }
  }

  @Override
  public BrowserBookmarksDao browserBookmarksDao() {
    if (_browserBookmarksDao != null) {
      return _browserBookmarksDao;
    } else {
      synchronized(this) {
        if(_browserBookmarksDao == null) {
          _browserBookmarksDao = new BrowserBookmarksDao_Impl(this);
        }
        return _browserBookmarksDao;
      }
    }
  }
}
