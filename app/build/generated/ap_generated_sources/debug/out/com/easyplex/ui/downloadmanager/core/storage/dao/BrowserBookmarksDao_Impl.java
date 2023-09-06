package com.easyplex.ui.downloadmanager.core.storage.dao;

import android.database.Cursor;
import androidx.room.EmptyResultSetException;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.easyplex.ui.downloadmanager.core.model.data.entity.BrowserBookmark;
import io.reactivex.Flowable;
import io.reactivex.Single;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class BrowserBookmarksDao_Impl implements BrowserBookmarksDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<BrowserBookmark> __insertionAdapterOfBrowserBookmark;

  private final EntityDeletionOrUpdateAdapter<BrowserBookmark> __deletionAdapterOfBrowserBookmark;

  private final EntityDeletionOrUpdateAdapter<BrowserBookmark> __updateAdapterOfBrowserBookmark;

  public BrowserBookmarksDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfBrowserBookmark = new EntityInsertionAdapter<BrowserBookmark>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `BrowserBookmark` (`url`,`name`,`dateAdded`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, BrowserBookmark value) {
        if (value.url == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.url);
        }
        if (value.name == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.name);
        }
        stmt.bindLong(3, value.dateAdded);
      }
    };
    this.__deletionAdapterOfBrowserBookmark = new EntityDeletionOrUpdateAdapter<BrowserBookmark>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `BrowserBookmark` WHERE `url` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, BrowserBookmark value) {
        if (value.url == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.url);
        }
      }
    };
    this.__updateAdapterOfBrowserBookmark = new EntityDeletionOrUpdateAdapter<BrowserBookmark>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `BrowserBookmark` SET `url` = ?,`name` = ?,`dateAdded` = ? WHERE `url` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, BrowserBookmark value) {
        if (value.url == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.url);
        }
        if (value.name == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.name);
        }
        stmt.bindLong(3, value.dateAdded);
        if (value.url == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.url);
        }
      }
    };
  }

  @Override
  public Single<Long> add(final BrowserBookmark bookmark) {
    return Single.fromCallable(new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfBrowserBookmark.insertAndReturnId(bookmark);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Single<Integer> delete(final List<BrowserBookmark> bookmarks) {
    return Single.fromCallable(new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        int _total = 0;
        __db.beginTransaction();
        try {
          _total +=__deletionAdapterOfBrowserBookmark.handleMultiple(bookmarks);
          __db.setTransactionSuccessful();
          return _total;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Single<Integer> update(final BrowserBookmark bookmark) {
    return Single.fromCallable(new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        int _total = 0;
        __db.beginTransaction();
        try {
          _total +=__updateAdapterOfBrowserBookmark.handle(bookmark);
          __db.setTransactionSuccessful();
          return _total;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Flowable<List<BrowserBookmark>> observeAll() {
    final String _sql = "SELECT * FROM BrowserBookmark";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, false, new String[]{"BrowserBookmark"}, new Callable<List<BrowserBookmark>>() {
      @Override
      public List<BrowserBookmark> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDateAdded = CursorUtil.getColumnIndexOrThrow(_cursor, "dateAdded");
          final List<BrowserBookmark> _result = new ArrayList<BrowserBookmark>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final BrowserBookmark _item;
            final String _tmpUrl;
            if (_cursor.isNull(_cursorIndexOfUrl)) {
              _tmpUrl = null;
            } else {
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final long _tmpDateAdded;
            _tmpDateAdded = _cursor.getLong(_cursorIndexOfDateAdded);
            _item = new BrowserBookmark(_tmpUrl,_tmpName,_tmpDateAdded);
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
  public Single<BrowserBookmark> getByUrlSingle(final String url) {
    final String _sql = "SELECT * FROM BrowserBookmark WHERE url = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (url == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, url);
    }
    return RxRoom.createSingle(new Callable<BrowserBookmark>() {
      @Override
      public BrowserBookmark call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDateAdded = CursorUtil.getColumnIndexOrThrow(_cursor, "dateAdded");
          final BrowserBookmark _result;
          if(_cursor.moveToFirst()) {
            final String _tmpUrl;
            if (_cursor.isNull(_cursorIndexOfUrl)) {
              _tmpUrl = null;
            } else {
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final long _tmpDateAdded;
            _tmpDateAdded = _cursor.getLong(_cursorIndexOfDateAdded);
            _result = new BrowserBookmark(_tmpUrl,_tmpName,_tmpDateAdded);
          } else {
            _result = null;
          }
          if(_result == null) {
            throw new EmptyResultSetException("Query returned empty result set: " + _statement.getSql());
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

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
