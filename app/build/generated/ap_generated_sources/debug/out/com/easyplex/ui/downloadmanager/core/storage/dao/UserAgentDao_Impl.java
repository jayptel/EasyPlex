package com.easyplex.ui.downloadmanager.core.storage.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.easyplex.ui.downloadmanager.core.model.data.entity.UserAgent;
import java.lang.Class;
import java.lang.Exception;
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
public final class UserAgentDao_Impl implements UserAgentDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<UserAgent> __insertionAdapterOfUserAgent;

  private final EntityDeletionOrUpdateAdapter<UserAgent> __deletionAdapterOfUserAgent;

  public UserAgentDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUserAgent = new EntityInsertionAdapter<UserAgent>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `UserAgent` (`id`,`userAgent`,`readOnly`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserAgent value) {
        stmt.bindLong(1, value.id);
        if (value.userAgent == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.userAgent);
        }
        final int _tmp = value.readOnly ? 1 : 0;
        stmt.bindLong(3, _tmp);
      }
    };
    this.__deletionAdapterOfUserAgent = new EntityDeletionOrUpdateAdapter<UserAgent>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `UserAgent` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserAgent value) {
        stmt.bindLong(1, value.id);
      }
    };
  }

  @Override
  public void add(final UserAgent agent) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfUserAgent.insert(agent);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void add(final UserAgent[] agent) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfUserAgent.insert(agent);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final UserAgent agent) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfUserAgent.handle(agent);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<UserAgent>> observeAll() {
    final String _sql = "SELECT * FROM UserAgent";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"UserAgent"}, false, new Callable<List<UserAgent>>() {
      @Override
      public List<UserAgent> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfUserAgent = CursorUtil.getColumnIndexOrThrow(_cursor, "userAgent");
          final int _cursorIndexOfReadOnly = CursorUtil.getColumnIndexOrThrow(_cursor, "readOnly");
          final List<UserAgent> _result = new ArrayList<UserAgent>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final UserAgent _item;
            final String _tmpUserAgent;
            if (_cursor.isNull(_cursorIndexOfUserAgent)) {
              _tmpUserAgent = null;
            } else {
              _tmpUserAgent = _cursor.getString(_cursorIndexOfUserAgent);
            }
            _item = new UserAgent(_tmpUserAgent);
            _item.id = _cursor.getLong(_cursorIndexOfId);
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfReadOnly);
            _item.readOnly = _tmp != 0;
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

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
