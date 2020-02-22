package com.raywenderlich.android.majesticreader.framework.db;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class BookmarkDao_Impl implements BookmarkDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfBookmarkEntity;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfBookmarkEntity;

  public BookmarkDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfBookmarkEntity = new EntityInsertionAdapter<BookmarkEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `bookmark`(`id`,`documentUri`,`page`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, BookmarkEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getDocumentUri() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDocumentUri());
        }
        stmt.bindLong(3, value.getPage());
      }
    };
    this.__deletionAdapterOfBookmarkEntity = new EntityDeletionOrUpdateAdapter<BookmarkEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `bookmark` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, BookmarkEntity value) {
        stmt.bindLong(1, value.getId());
      }
    };
  }

  @Override
  public Object addBookmark(final BookmarkEntity bookmark, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfBookmarkEntity.insert(bookmark);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object removeBookmark(final BookmarkEntity bookmark, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfBookmarkEntity.handle(bookmark);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object getBookmarks(final String documentUri,
      final Continuation<? super List<BookmarkEntity>> p1) {
    final String _sql = "SELECT * FROM bookmark WHERE documentUri = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (documentUri == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, documentUri);
    }
    return CoroutinesRoom.execute(__db, false, new Callable<List<BookmarkEntity>>() {
      @Override
      public List<BookmarkEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfDocumentUri = CursorUtil.getColumnIndexOrThrow(_cursor, "documentUri");
          final int _cursorIndexOfPage = CursorUtil.getColumnIndexOrThrow(_cursor, "page");
          final List<BookmarkEntity> _result = new ArrayList<BookmarkEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final BookmarkEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpDocumentUri;
            _tmpDocumentUri = _cursor.getString(_cursorIndexOfDocumentUri);
            final int _tmpPage;
            _tmpPage = _cursor.getInt(_cursorIndexOfPage);
            _item = new BookmarkEntity(_tmpId,_tmpDocumentUri,_tmpPage);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }
}
