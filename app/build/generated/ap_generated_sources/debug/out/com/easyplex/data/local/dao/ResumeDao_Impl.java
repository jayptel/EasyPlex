package com.easyplex.data.local.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.easyplex.data.model.media.Resume;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class ResumeDao_Impl implements ResumeDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Resume> __insertionAdapterOfResume;

  private final SharedSQLiteStatement __preparedStmtOfDeleteHistory;

  public ResumeDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfResume = new EntityInsertionAdapter<Resume>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `resume` (`userResumeId`,`tmdb`,`deviceId`,`resumeWindow`,`resumePosition`,`movieDuration`,`type`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Resume value) {
        stmt.bindLong(1, value.getUserResumeId());
        if (value.getTmdb() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTmdb());
        }
        if (value.getDeviceId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDeviceId());
        }
        if (value.getResumeWindow() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getResumeWindow());
        }
        if (value.getResumePosition() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, value.getResumePosition());
        }
        if (value.getMovieDuration() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getMovieDuration());
        }
        if (value.getType() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getType());
        }
      }
    };
    this.__preparedStmtOfDeleteHistory = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM resume";
        return _query;
      }
    };
  }

  @Override
  public void saveMediaToResume(final Resume resume) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfResume.insert(resume);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteHistory() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteHistory.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteHistory.release(_stmt);
    }
  }

  @Override
  public LiveData<Resume> hasResume(final int tmdbId) {
    final String _sql = "SELECT * FROM resume WHERE tmdb=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, tmdbId);
    return __db.getInvalidationTracker().createLiveData(new String[]{"resume"}, false, new Callable<Resume>() {
      @Override
      public Resume call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUserResumeId = CursorUtil.getColumnIndexOrThrow(_cursor, "userResumeId");
          final int _cursorIndexOfTmdb = CursorUtil.getColumnIndexOrThrow(_cursor, "tmdb");
          final int _cursorIndexOfDeviceId = CursorUtil.getColumnIndexOrThrow(_cursor, "deviceId");
          final int _cursorIndexOfResumeWindow = CursorUtil.getColumnIndexOrThrow(_cursor, "resumeWindow");
          final int _cursorIndexOfResumePosition = CursorUtil.getColumnIndexOrThrow(_cursor, "resumePosition");
          final int _cursorIndexOfMovieDuration = CursorUtil.getColumnIndexOrThrow(_cursor, "movieDuration");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final Resume _result;
          if(_cursor.moveToFirst()) {
            final String _tmpTmdb;
            if (_cursor.isNull(_cursorIndexOfTmdb)) {
              _tmpTmdb = null;
            } else {
              _tmpTmdb = _cursor.getString(_cursorIndexOfTmdb);
            }
            _result = new Resume(_tmpTmdb);
            final int _tmpUserResumeId;
            _tmpUserResumeId = _cursor.getInt(_cursorIndexOfUserResumeId);
            _result.setUserResumeId(_tmpUserResumeId);
            final String _tmpDeviceId;
            if (_cursor.isNull(_cursorIndexOfDeviceId)) {
              _tmpDeviceId = null;
            } else {
              _tmpDeviceId = _cursor.getString(_cursorIndexOfDeviceId);
            }
            _result.setDeviceId(_tmpDeviceId);
            final Integer _tmpResumeWindow;
            if (_cursor.isNull(_cursorIndexOfResumeWindow)) {
              _tmpResumeWindow = null;
            } else {
              _tmpResumeWindow = _cursor.getInt(_cursorIndexOfResumeWindow);
            }
            _result.setResumeWindow(_tmpResumeWindow);
            final Integer _tmpResumePosition;
            if (_cursor.isNull(_cursorIndexOfResumePosition)) {
              _tmpResumePosition = null;
            } else {
              _tmpResumePosition = _cursor.getInt(_cursorIndexOfResumePosition);
            }
            _result.setResumePosition(_tmpResumePosition);
            final Integer _tmpMovieDuration;
            if (_cursor.isNull(_cursorIndexOfMovieDuration)) {
              _tmpMovieDuration = null;
            } else {
              _tmpMovieDuration = _cursor.getInt(_cursorIndexOfMovieDuration);
            }
            _result.setMovieDuration(_tmpMovieDuration);
            final String _tmpType;
            if (_cursor.isNull(_cursorIndexOfType)) {
              _tmpType = null;
            } else {
              _tmpType = _cursor.getString(_cursorIndexOfType);
            }
            _result.setType(_tmpType);
          } else {
            _result = null;
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
