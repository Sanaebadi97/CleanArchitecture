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
public final class DocumentDao_Impl implements DocumentDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfDocumentEntity;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfDocumentEntity;

  public DocumentDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDocumentEntity = new EntityInsertionAdapter<DocumentEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `document`(`uri`,`title`,`size`,`thumbnail_uri`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DocumentEntity value) {
        if (value.getUri() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getUri());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        stmt.bindLong(3, value.getSize());
        if (value.getThumbnailUri() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getThumbnailUri());
        }
      }
    };
    this.__deletionAdapterOfDocumentEntity = new EntityDeletionOrUpdateAdapter<DocumentEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `document` WHERE `uri` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DocumentEntity value) {
        if (value.getUri() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getUri());
        }
      }
    };
  }

  @Override
  public Object addDocument(final DocumentEntity document, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfDocumentEntity.insert(document);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object removeDocument(final DocumentEntity document, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfDocumentEntity.handle(document);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object getDocuments(final Continuation<? super List<DocumentEntity>> p0) {
    final String _sql = "SELECT * FROM document";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<DocumentEntity>>() {
      @Override
      public List<DocumentEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfUri = CursorUtil.getColumnIndexOrThrow(_cursor, "uri");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfSize = CursorUtil.getColumnIndexOrThrow(_cursor, "size");
          final int _cursorIndexOfThumbnailUri = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnail_uri");
          final List<DocumentEntity> _result = new ArrayList<DocumentEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final DocumentEntity _item;
            final String _tmpUri;
            _tmpUri = _cursor.getString(_cursorIndexOfUri);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final int _tmpSize;
            _tmpSize = _cursor.getInt(_cursorIndexOfSize);
            final String _tmpThumbnailUri;
            _tmpThumbnailUri = _cursor.getString(_cursorIndexOfThumbnailUri);
            _item = new DocumentEntity(_tmpUri,_tmpTitle,_tmpSize,_tmpThumbnailUri);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }
}
