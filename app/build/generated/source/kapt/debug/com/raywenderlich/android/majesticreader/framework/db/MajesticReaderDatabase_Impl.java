package com.raywenderlich.android.majesticreader.framework.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MajesticReaderDatabase_Impl extends MajesticReaderDatabase {
  private volatile BookmarkDao _bookmarkDao;

  private volatile DocumentDao _documentDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `bookmark` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `documentUri` TEXT NOT NULL, `page` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `document` (`uri` TEXT NOT NULL, `title` TEXT NOT NULL, `size` INTEGER NOT NULL, `thumbnail_uri` TEXT NOT NULL, PRIMARY KEY(`uri`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'e0ab3e09c675b1c7778cbd9f039a82d6')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `bookmark`");
        _db.execSQL("DROP TABLE IF EXISTS `document`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
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
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsBookmark = new HashMap<String, TableInfo.Column>(3);
        _columnsBookmark.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsBookmark.put("documentUri", new TableInfo.Column("documentUri", "TEXT", true, 0));
        _columnsBookmark.put("page", new TableInfo.Column("page", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysBookmark = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesBookmark = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoBookmark = new TableInfo("bookmark", _columnsBookmark, _foreignKeysBookmark, _indicesBookmark);
        final TableInfo _existingBookmark = TableInfo.read(_db, "bookmark");
        if (! _infoBookmark.equals(_existingBookmark)) {
          throw new IllegalStateException("Migration didn't properly handle bookmark(com.raywenderlich.android.majesticreader.framework.db.BookmarkEntity).\n"
                  + " Expected:\n" + _infoBookmark + "\n"
                  + " Found:\n" + _existingBookmark);
        }
        final HashMap<String, TableInfo.Column> _columnsDocument = new HashMap<String, TableInfo.Column>(4);
        _columnsDocument.put("uri", new TableInfo.Column("uri", "TEXT", true, 1));
        _columnsDocument.put("title", new TableInfo.Column("title", "TEXT", true, 0));
        _columnsDocument.put("size", new TableInfo.Column("size", "INTEGER", true, 0));
        _columnsDocument.put("thumbnail_uri", new TableInfo.Column("thumbnail_uri", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDocument = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDocument = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDocument = new TableInfo("document", _columnsDocument, _foreignKeysDocument, _indicesDocument);
        final TableInfo _existingDocument = TableInfo.read(_db, "document");
        if (! _infoDocument.equals(_existingDocument)) {
          throw new IllegalStateException("Migration didn't properly handle document(com.raywenderlich.android.majesticreader.framework.db.DocumentEntity).\n"
                  + " Expected:\n" + _infoDocument + "\n"
                  + " Found:\n" + _existingDocument);
        }
      }
    }, "e0ab3e09c675b1c7778cbd9f039a82d6", "96508f5b6f1f4d2e8a84cbe6688a4db4");
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
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "bookmark","document");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `bookmark`");
      _db.execSQL("DELETE FROM `document`");
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
  public BookmarkDao bookmarkDao() {
    if (_bookmarkDao != null) {
      return _bookmarkDao;
    } else {
      synchronized(this) {
        if(_bookmarkDao == null) {
          _bookmarkDao = new BookmarkDao_Impl(this);
        }
        return _bookmarkDao;
      }
    }
  }

  @Override
  public DocumentDao documentDao() {
    if (_documentDao != null) {
      return _documentDao;
    } else {
      synchronized(this) {
        if(_documentDao == null) {
          _documentDao = new DocumentDao_Impl(this);
        }
        return _documentDao;
      }
    }
  }
}
