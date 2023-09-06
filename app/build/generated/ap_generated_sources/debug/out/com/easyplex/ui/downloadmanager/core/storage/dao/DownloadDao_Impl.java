package com.easyplex.ui.downloadmanager.core.storage.dao;

import android.database.Cursor;
import android.net.Uri;
import androidx.collection.ArrayMap;
import androidx.room.EmptyResultSetException;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.easyplex.ui.downloadmanager.core.model.data.entity.DownloadInfo;
import com.easyplex.ui.downloadmanager.core.model.data.entity.DownloadPiece;
import com.easyplex.ui.downloadmanager.core.model.data.entity.Header;
import com.easyplex.ui.downloadmanager.core.model.data.entity.InfoAndPieces;
import com.easyplex.ui.downloadmanager.core.storage.converter.UUIDConverter;
import com.easyplex.ui.downloadmanager.core.storage.converter.UriConverter;
import io.reactivex.Flowable;
import io.reactivex.Single;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class DownloadDao_Impl extends DownloadDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<DownloadPiece> __insertionAdapterOfDownloadPiece;

  private final EntityInsertionAdapter<Header> __insertionAdapterOfHeader;

  private final EntityInsertionAdapter<DownloadInfo> __insertionAdapterOfDownloadInfo;

  private final EntityDeletionOrUpdateAdapter<DownloadInfo> __deletionAdapterOfDownloadInfo;

  private final EntityDeletionOrUpdateAdapter<DownloadInfo> __updateAdapterOfDownloadInfo;

  private final EntityDeletionOrUpdateAdapter<DownloadPiece> __updateAdapterOfDownloadPiece;

  private final SharedSQLiteStatement __preparedStmtOfDeleteInfoByUrl;

  private final SharedSQLiteStatement __preparedStmtOfDeletePieces;

  public DownloadDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDownloadPiece = new EntityInsertionAdapter<DownloadPiece>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `DownloadPiece` (`pieceIndex`,`infoId`,`size`,`curBytes`,`statusCode`,`statusMsg`,`speed`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DownloadPiece value) {
        stmt.bindLong(1, value.index);
        final String _tmp = UUIDConverter.fromUUID(value.infoId);
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
        stmt.bindLong(3, value.size);
        stmt.bindLong(4, value.curBytes);
        stmt.bindLong(5, value.statusCode);
        if (value.statusMsg == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.statusMsg);
        }
        stmt.bindLong(7, value.speed);
      }
    };
    this.__insertionAdapterOfHeader = new EntityInsertionAdapter<Header>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `download_info_headers` (`id`,`infoId`,`name`,`value`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Header value) {
        stmt.bindLong(1, value.id);
        final String _tmp = UUIDConverter.fromUUID(value.infoId);
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
        if (value.name == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.name);
        }
        if (value.value == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.value);
        }
      }
    };
    this.__insertionAdapterOfDownloadInfo = new EntityInsertionAdapter<DownloadInfo>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `DownloadInfo` (`id`,`dirPath`,`url`,`fileName`,`mediaName`,`mediaBackdrop`,`mediaId`,`mediatype`,`refer`,`description`,`mimeType`,`totalBytes`,`numPieces`,`statusCode`,`unmeteredConnectionsOnly`,`retry`,`partialSupport`,`statusMsg`,`dateAdded`,`visibility`,`hasMetadata`,`userAgent`,`numFailed`,`retryAfter`,`lastModify`,`checksum`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DownloadInfo value) {
        final String _tmp = UUIDConverter.fromUUID(value.id);
        if (_tmp == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, _tmp);
        }
        final String _tmp_1 = UriConverter.fromUri(value.dirPath);
        if (_tmp_1 == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp_1);
        }
        if (value.url == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.url);
        }
        if (value.fileName == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.fileName);
        }
        if (value.mediaName == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.mediaName);
        }
        if (value.mediaBackdrop == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.mediaBackdrop);
        }
        if (value.mediaId == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.mediaId);
        }
        if (value.mediatype == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.mediatype);
        }
        if (value.refer == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.refer);
        }
        if (value.description == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.description);
        }
        if (value.mimeType == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.mimeType);
        }
        stmt.bindLong(12, value.totalBytes);
        stmt.bindLong(13, value.getNumPieces());
        stmt.bindLong(14, value.statusCode);
        final int _tmp_2 = value.unmeteredConnectionsOnly ? 1 : 0;
        stmt.bindLong(15, _tmp_2);
        final int _tmp_3 = value.retry ? 1 : 0;
        stmt.bindLong(16, _tmp_3);
        final int _tmp_4 = value.partialSupport ? 1 : 0;
        stmt.bindLong(17, _tmp_4);
        if (value.statusMsg == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.statusMsg);
        }
        stmt.bindLong(19, value.dateAdded);
        stmt.bindLong(20, value.visibility);
        final int _tmp_5 = value.hasMetadata ? 1 : 0;
        stmt.bindLong(21, _tmp_5);
        if (value.userAgent == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindString(22, value.userAgent);
        }
        stmt.bindLong(23, value.numFailed);
        stmt.bindLong(24, value.retryAfter);
        stmt.bindLong(25, value.lastModify);
        if (value.checksum == null) {
          stmt.bindNull(26);
        } else {
          stmt.bindString(26, value.checksum);
        }
      }
    };
    this.__deletionAdapterOfDownloadInfo = new EntityDeletionOrUpdateAdapter<DownloadInfo>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `DownloadInfo` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DownloadInfo value) {
        final String _tmp = UUIDConverter.fromUUID(value.id);
        if (_tmp == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, _tmp);
        }
      }
    };
    this.__updateAdapterOfDownloadInfo = new EntityDeletionOrUpdateAdapter<DownloadInfo>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `DownloadInfo` SET `id` = ?,`dirPath` = ?,`url` = ?,`fileName` = ?,`mediaName` = ?,`mediaBackdrop` = ?,`mediaId` = ?,`mediatype` = ?,`refer` = ?,`description` = ?,`mimeType` = ?,`totalBytes` = ?,`numPieces` = ?,`statusCode` = ?,`unmeteredConnectionsOnly` = ?,`retry` = ?,`partialSupport` = ?,`statusMsg` = ?,`dateAdded` = ?,`visibility` = ?,`hasMetadata` = ?,`userAgent` = ?,`numFailed` = ?,`retryAfter` = ?,`lastModify` = ?,`checksum` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DownloadInfo value) {
        final String _tmp = UUIDConverter.fromUUID(value.id);
        if (_tmp == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, _tmp);
        }
        final String _tmp_1 = UriConverter.fromUri(value.dirPath);
        if (_tmp_1 == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp_1);
        }
        if (value.url == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.url);
        }
        if (value.fileName == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.fileName);
        }
        if (value.mediaName == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.mediaName);
        }
        if (value.mediaBackdrop == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.mediaBackdrop);
        }
        if (value.mediaId == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.mediaId);
        }
        if (value.mediatype == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.mediatype);
        }
        if (value.refer == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.refer);
        }
        if (value.description == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.description);
        }
        if (value.mimeType == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.mimeType);
        }
        stmt.bindLong(12, value.totalBytes);
        stmt.bindLong(13, value.getNumPieces());
        stmt.bindLong(14, value.statusCode);
        final int _tmp_2 = value.unmeteredConnectionsOnly ? 1 : 0;
        stmt.bindLong(15, _tmp_2);
        final int _tmp_3 = value.retry ? 1 : 0;
        stmt.bindLong(16, _tmp_3);
        final int _tmp_4 = value.partialSupport ? 1 : 0;
        stmt.bindLong(17, _tmp_4);
        if (value.statusMsg == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.statusMsg);
        }
        stmt.bindLong(19, value.dateAdded);
        stmt.bindLong(20, value.visibility);
        final int _tmp_5 = value.hasMetadata ? 1 : 0;
        stmt.bindLong(21, _tmp_5);
        if (value.userAgent == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindString(22, value.userAgent);
        }
        stmt.bindLong(23, value.numFailed);
        stmt.bindLong(24, value.retryAfter);
        stmt.bindLong(25, value.lastModify);
        if (value.checksum == null) {
          stmt.bindNull(26);
        } else {
          stmt.bindString(26, value.checksum);
        }
        final String _tmp_6 = UUIDConverter.fromUUID(value.id);
        if (_tmp_6 == null) {
          stmt.bindNull(27);
        } else {
          stmt.bindString(27, _tmp_6);
        }
      }
    };
    this.__updateAdapterOfDownloadPiece = new EntityDeletionOrUpdateAdapter<DownloadPiece>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `DownloadPiece` SET `pieceIndex` = ?,`infoId` = ?,`size` = ?,`curBytes` = ?,`statusCode` = ?,`statusMsg` = ?,`speed` = ? WHERE `pieceIndex` = ? AND `infoId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DownloadPiece value) {
        stmt.bindLong(1, value.index);
        final String _tmp = UUIDConverter.fromUUID(value.infoId);
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
        stmt.bindLong(3, value.size);
        stmt.bindLong(4, value.curBytes);
        stmt.bindLong(5, value.statusCode);
        if (value.statusMsg == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.statusMsg);
        }
        stmt.bindLong(7, value.speed);
        stmt.bindLong(8, value.index);
        final String _tmp_1 = UUIDConverter.fromUUID(value.infoId);
        if (_tmp_1 == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, _tmp_1);
        }
      }
    };
    this.__preparedStmtOfDeleteInfoByUrl = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM DownloadInfo WHERE url = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeletePieces = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM DownloadPiece WHERE infoId = ?";
        return _query;
      }
    };
  }

  @Override
  public void addPieces(final List<DownloadPiece> pieces) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfDownloadPiece.insert(pieces);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void addHeaders(final List<Header> headers) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfHeader.insert(headers);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void addHeader(final Header header) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfHeader.insert(header);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void add_info(final DownloadInfo info) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfDownloadInfo.insert(info);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteInfo(final DownloadInfo info) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfDownloadInfo.handle(info);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateInfo(final DownloadInfo info) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfDownloadInfo.handle(info);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int updatePiece(final DownloadPiece piece) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__updateAdapterOfDownloadPiece.handle(piece);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void addInfo(final DownloadInfo info) {
    __db.beginTransaction();
    try {
      DownloadDao_Impl.super.addInfo(info);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void addInfo(final DownloadInfo info, final List<Header> headers) {
    __db.beginTransaction();
    try {
      DownloadDao_Impl.super.addInfo(info, headers);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void replaceInfoByUrl(final DownloadInfo info, final List<Header> headers) {
    __db.beginTransaction();
    try {
      DownloadDao_Impl.super.replaceInfoByUrl(info, headers);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateInfoWithPieces(final DownloadInfo info) {
    __db.beginTransaction();
    try {
      DownloadDao_Impl.super.updateInfoWithPieces(info);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteInfoByUrl(final String url) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteInfoByUrl.acquire();
    int _argIndex = 1;
    if (url == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, url);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteInfoByUrl.release(_stmt);
    }
  }

  @Override
  public void deletePieces(final UUID infoId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeletePieces.acquire();
    int _argIndex = 1;
    final String _tmp = UUIDConverter.fromUUID(infoId);
    if (_tmp == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, _tmp);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeletePieces.release(_stmt);
    }
  }

  @Override
  public List<DownloadInfo> getAllInfo() {
    final String _sql = "SELECT * FROM DownloadInfo";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfDirPath = CursorUtil.getColumnIndexOrThrow(_cursor, "dirPath");
      final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
      final int _cursorIndexOfFileName = CursorUtil.getColumnIndexOrThrow(_cursor, "fileName");
      final int _cursorIndexOfMediaName = CursorUtil.getColumnIndexOrThrow(_cursor, "mediaName");
      final int _cursorIndexOfMediaBackdrop = CursorUtil.getColumnIndexOrThrow(_cursor, "mediaBackdrop");
      final int _cursorIndexOfMediaId = CursorUtil.getColumnIndexOrThrow(_cursor, "mediaId");
      final int _cursorIndexOfMediatype = CursorUtil.getColumnIndexOrThrow(_cursor, "mediatype");
      final int _cursorIndexOfRefer = CursorUtil.getColumnIndexOrThrow(_cursor, "refer");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfMimeType = CursorUtil.getColumnIndexOrThrow(_cursor, "mimeType");
      final int _cursorIndexOfTotalBytes = CursorUtil.getColumnIndexOrThrow(_cursor, "totalBytes");
      final int _cursorIndexOfNumPieces = CursorUtil.getColumnIndexOrThrow(_cursor, "numPieces");
      final int _cursorIndexOfStatusCode = CursorUtil.getColumnIndexOrThrow(_cursor, "statusCode");
      final int _cursorIndexOfUnmeteredConnectionsOnly = CursorUtil.getColumnIndexOrThrow(_cursor, "unmeteredConnectionsOnly");
      final int _cursorIndexOfRetry = CursorUtil.getColumnIndexOrThrow(_cursor, "retry");
      final int _cursorIndexOfPartialSupport = CursorUtil.getColumnIndexOrThrow(_cursor, "partialSupport");
      final int _cursorIndexOfStatusMsg = CursorUtil.getColumnIndexOrThrow(_cursor, "statusMsg");
      final int _cursorIndexOfDateAdded = CursorUtil.getColumnIndexOrThrow(_cursor, "dateAdded");
      final int _cursorIndexOfVisibility = CursorUtil.getColumnIndexOrThrow(_cursor, "visibility");
      final int _cursorIndexOfHasMetadata = CursorUtil.getColumnIndexOrThrow(_cursor, "hasMetadata");
      final int _cursorIndexOfUserAgent = CursorUtil.getColumnIndexOrThrow(_cursor, "userAgent");
      final int _cursorIndexOfNumFailed = CursorUtil.getColumnIndexOrThrow(_cursor, "numFailed");
      final int _cursorIndexOfRetryAfter = CursorUtil.getColumnIndexOrThrow(_cursor, "retryAfter");
      final int _cursorIndexOfLastModify = CursorUtil.getColumnIndexOrThrow(_cursor, "lastModify");
      final int _cursorIndexOfChecksum = CursorUtil.getColumnIndexOrThrow(_cursor, "checksum");
      final List<DownloadInfo> _result = new ArrayList<DownloadInfo>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final DownloadInfo _item;
        final Uri _tmpDirPath;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfDirPath)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfDirPath);
        }
        _tmpDirPath = UriConverter.toUri(_tmp);
        final String _tmpUrl;
        if (_cursor.isNull(_cursorIndexOfUrl)) {
          _tmpUrl = null;
        } else {
          _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
        }
        final String _tmpFileName;
        if (_cursor.isNull(_cursorIndexOfFileName)) {
          _tmpFileName = null;
        } else {
          _tmpFileName = _cursor.getString(_cursorIndexOfFileName);
        }
        final String _tmpMediaName;
        if (_cursor.isNull(_cursorIndexOfMediaName)) {
          _tmpMediaName = null;
        } else {
          _tmpMediaName = _cursor.getString(_cursorIndexOfMediaName);
        }
        final String _tmpMediaBackdrop;
        if (_cursor.isNull(_cursorIndexOfMediaBackdrop)) {
          _tmpMediaBackdrop = null;
        } else {
          _tmpMediaBackdrop = _cursor.getString(_cursorIndexOfMediaBackdrop);
        }
        final String _tmpMediaId;
        if (_cursor.isNull(_cursorIndexOfMediaId)) {
          _tmpMediaId = null;
        } else {
          _tmpMediaId = _cursor.getString(_cursorIndexOfMediaId);
        }
        final String _tmpMediatype;
        if (_cursor.isNull(_cursorIndexOfMediatype)) {
          _tmpMediatype = null;
        } else {
          _tmpMediatype = _cursor.getString(_cursorIndexOfMediatype);
        }
        final String _tmpRefer;
        if (_cursor.isNull(_cursorIndexOfRefer)) {
          _tmpRefer = null;
        } else {
          _tmpRefer = _cursor.getString(_cursorIndexOfRefer);
        }
        _item = new DownloadInfo(_tmpDirPath,_tmpUrl,_tmpFileName,_tmpMediaName,_tmpMediatype,_tmpMediaId,_tmpMediaBackdrop,_tmpRefer);
        final String _tmp_1;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getString(_cursorIndexOfId);
        }
        _item.id = UUIDConverter.toUUID(_tmp_1);
        if (_cursor.isNull(_cursorIndexOfDescription)) {
          _item.description = null;
        } else {
          _item.description = _cursor.getString(_cursorIndexOfDescription);
        }
        if (_cursor.isNull(_cursorIndexOfMimeType)) {
          _item.mimeType = null;
        } else {
          _item.mimeType = _cursor.getString(_cursorIndexOfMimeType);
        }
        _item.totalBytes = _cursor.getLong(_cursorIndexOfTotalBytes);
        final int _tmpNumPieces;
        _tmpNumPieces = _cursor.getInt(_cursorIndexOfNumPieces);
        _item.setNumPieces(_tmpNumPieces);
        _item.statusCode = _cursor.getInt(_cursorIndexOfStatusCode);
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfUnmeteredConnectionsOnly);
        _item.unmeteredConnectionsOnly = _tmp_2 != 0;
        final int _tmp_3;
        _tmp_3 = _cursor.getInt(_cursorIndexOfRetry);
        _item.retry = _tmp_3 != 0;
        final int _tmp_4;
        _tmp_4 = _cursor.getInt(_cursorIndexOfPartialSupport);
        _item.partialSupport = _tmp_4 != 0;
        if (_cursor.isNull(_cursorIndexOfStatusMsg)) {
          _item.statusMsg = null;
        } else {
          _item.statusMsg = _cursor.getString(_cursorIndexOfStatusMsg);
        }
        _item.dateAdded = _cursor.getLong(_cursorIndexOfDateAdded);
        _item.visibility = _cursor.getInt(_cursorIndexOfVisibility);
        final int _tmp_5;
        _tmp_5 = _cursor.getInt(_cursorIndexOfHasMetadata);
        _item.hasMetadata = _tmp_5 != 0;
        if (_cursor.isNull(_cursorIndexOfUserAgent)) {
          _item.userAgent = null;
        } else {
          _item.userAgent = _cursor.getString(_cursorIndexOfUserAgent);
        }
        _item.numFailed = _cursor.getInt(_cursorIndexOfNumFailed);
        _item.retryAfter = _cursor.getInt(_cursorIndexOfRetryAfter);
        _item.lastModify = _cursor.getLong(_cursorIndexOfLastModify);
        if (_cursor.isNull(_cursorIndexOfChecksum)) {
          _item.checksum = null;
        } else {
          _item.checksum = _cursor.getString(_cursorIndexOfChecksum);
        }
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Flowable<List<InfoAndPieces>> observeAllInfoAndPieces() {
    final String _sql = "SELECT * FROM DownloadInfo";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, true, new String[]{"DownloadPiece","DownloadInfo"}, new Callable<List<InfoAndPieces>>() {
      @Override
      public List<InfoAndPieces> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final int _cursorIndexOfDirPath = CursorUtil.getColumnIndexOrThrow(_cursor, "dirPath");
            final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
            final int _cursorIndexOfFileName = CursorUtil.getColumnIndexOrThrow(_cursor, "fileName");
            final int _cursorIndexOfMediaName = CursorUtil.getColumnIndexOrThrow(_cursor, "mediaName");
            final int _cursorIndexOfMediaBackdrop = CursorUtil.getColumnIndexOrThrow(_cursor, "mediaBackdrop");
            final int _cursorIndexOfMediaId = CursorUtil.getColumnIndexOrThrow(_cursor, "mediaId");
            final int _cursorIndexOfMediatype = CursorUtil.getColumnIndexOrThrow(_cursor, "mediatype");
            final int _cursorIndexOfRefer = CursorUtil.getColumnIndexOrThrow(_cursor, "refer");
            final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
            final int _cursorIndexOfMimeType = CursorUtil.getColumnIndexOrThrow(_cursor, "mimeType");
            final int _cursorIndexOfTotalBytes = CursorUtil.getColumnIndexOrThrow(_cursor, "totalBytes");
            final int _cursorIndexOfNumPieces = CursorUtil.getColumnIndexOrThrow(_cursor, "numPieces");
            final int _cursorIndexOfStatusCode = CursorUtil.getColumnIndexOrThrow(_cursor, "statusCode");
            final int _cursorIndexOfUnmeteredConnectionsOnly = CursorUtil.getColumnIndexOrThrow(_cursor, "unmeteredConnectionsOnly");
            final int _cursorIndexOfRetry = CursorUtil.getColumnIndexOrThrow(_cursor, "retry");
            final int _cursorIndexOfPartialSupport = CursorUtil.getColumnIndexOrThrow(_cursor, "partialSupport");
            final int _cursorIndexOfStatusMsg = CursorUtil.getColumnIndexOrThrow(_cursor, "statusMsg");
            final int _cursorIndexOfDateAdded = CursorUtil.getColumnIndexOrThrow(_cursor, "dateAdded");
            final int _cursorIndexOfVisibility = CursorUtil.getColumnIndexOrThrow(_cursor, "visibility");
            final int _cursorIndexOfHasMetadata = CursorUtil.getColumnIndexOrThrow(_cursor, "hasMetadata");
            final int _cursorIndexOfUserAgent = CursorUtil.getColumnIndexOrThrow(_cursor, "userAgent");
            final int _cursorIndexOfNumFailed = CursorUtil.getColumnIndexOrThrow(_cursor, "numFailed");
            final int _cursorIndexOfRetryAfter = CursorUtil.getColumnIndexOrThrow(_cursor, "retryAfter");
            final int _cursorIndexOfLastModify = CursorUtil.getColumnIndexOrThrow(_cursor, "lastModify");
            final int _cursorIndexOfChecksum = CursorUtil.getColumnIndexOrThrow(_cursor, "checksum");
            final ArrayMap<String, ArrayList<DownloadPiece>> _collectionPieces = new ArrayMap<String, ArrayList<DownloadPiece>>();
            while (_cursor.moveToNext()) {
              final String _tmpKey = _cursor.getString(_cursorIndexOfId);
              ArrayList<DownloadPiece> _tmpPiecesCollection = _collectionPieces.get(_tmpKey);
              if (_tmpPiecesCollection == null) {
                _tmpPiecesCollection = new ArrayList<DownloadPiece>();
                _collectionPieces.put(_tmpKey, _tmpPiecesCollection);
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipDownloadPieceAscomEasyplexUiDownloadmanagerCoreModelDataEntityDownloadPiece(_collectionPieces);
            final List<InfoAndPieces> _result = new ArrayList<InfoAndPieces>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final InfoAndPieces _item;
              final DownloadInfo _tmpInfo;
              final Uri _tmpDirPath;
              final String _tmp;
              if (_cursor.isNull(_cursorIndexOfDirPath)) {
                _tmp = null;
              } else {
                _tmp = _cursor.getString(_cursorIndexOfDirPath);
              }
              _tmpDirPath = UriConverter.toUri(_tmp);
              final String _tmpUrl;
              if (_cursor.isNull(_cursorIndexOfUrl)) {
                _tmpUrl = null;
              } else {
                _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
              }
              final String _tmpFileName;
              if (_cursor.isNull(_cursorIndexOfFileName)) {
                _tmpFileName = null;
              } else {
                _tmpFileName = _cursor.getString(_cursorIndexOfFileName);
              }
              final String _tmpMediaName;
              if (_cursor.isNull(_cursorIndexOfMediaName)) {
                _tmpMediaName = null;
              } else {
                _tmpMediaName = _cursor.getString(_cursorIndexOfMediaName);
              }
              final String _tmpMediaBackdrop;
              if (_cursor.isNull(_cursorIndexOfMediaBackdrop)) {
                _tmpMediaBackdrop = null;
              } else {
                _tmpMediaBackdrop = _cursor.getString(_cursorIndexOfMediaBackdrop);
              }
              final String _tmpMediaId;
              if (_cursor.isNull(_cursorIndexOfMediaId)) {
                _tmpMediaId = null;
              } else {
                _tmpMediaId = _cursor.getString(_cursorIndexOfMediaId);
              }
              final String _tmpMediatype;
              if (_cursor.isNull(_cursorIndexOfMediatype)) {
                _tmpMediatype = null;
              } else {
                _tmpMediatype = _cursor.getString(_cursorIndexOfMediatype);
              }
              final String _tmpRefer;
              if (_cursor.isNull(_cursorIndexOfRefer)) {
                _tmpRefer = null;
              } else {
                _tmpRefer = _cursor.getString(_cursorIndexOfRefer);
              }
              _tmpInfo = new DownloadInfo(_tmpDirPath,_tmpUrl,_tmpFileName,_tmpMediaName,_tmpMediatype,_tmpMediaId,_tmpMediaBackdrop,_tmpRefer);
              final String _tmp_1;
              if (_cursor.isNull(_cursorIndexOfId)) {
                _tmp_1 = null;
              } else {
                _tmp_1 = _cursor.getString(_cursorIndexOfId);
              }
              _tmpInfo.id = UUIDConverter.toUUID(_tmp_1);
              if (_cursor.isNull(_cursorIndexOfDescription)) {
                _tmpInfo.description = null;
              } else {
                _tmpInfo.description = _cursor.getString(_cursorIndexOfDescription);
              }
              if (_cursor.isNull(_cursorIndexOfMimeType)) {
                _tmpInfo.mimeType = null;
              } else {
                _tmpInfo.mimeType = _cursor.getString(_cursorIndexOfMimeType);
              }
              _tmpInfo.totalBytes = _cursor.getLong(_cursorIndexOfTotalBytes);
              final int _tmpNumPieces;
              _tmpNumPieces = _cursor.getInt(_cursorIndexOfNumPieces);
              _tmpInfo.setNumPieces(_tmpNumPieces);
              _tmpInfo.statusCode = _cursor.getInt(_cursorIndexOfStatusCode);
              final int _tmp_2;
              _tmp_2 = _cursor.getInt(_cursorIndexOfUnmeteredConnectionsOnly);
              _tmpInfo.unmeteredConnectionsOnly = _tmp_2 != 0;
              final int _tmp_3;
              _tmp_3 = _cursor.getInt(_cursorIndexOfRetry);
              _tmpInfo.retry = _tmp_3 != 0;
              final int _tmp_4;
              _tmp_4 = _cursor.getInt(_cursorIndexOfPartialSupport);
              _tmpInfo.partialSupport = _tmp_4 != 0;
              if (_cursor.isNull(_cursorIndexOfStatusMsg)) {
                _tmpInfo.statusMsg = null;
              } else {
                _tmpInfo.statusMsg = _cursor.getString(_cursorIndexOfStatusMsg);
              }
              _tmpInfo.dateAdded = _cursor.getLong(_cursorIndexOfDateAdded);
              _tmpInfo.visibility = _cursor.getInt(_cursorIndexOfVisibility);
              final int _tmp_5;
              _tmp_5 = _cursor.getInt(_cursorIndexOfHasMetadata);
              _tmpInfo.hasMetadata = _tmp_5 != 0;
              if (_cursor.isNull(_cursorIndexOfUserAgent)) {
                _tmpInfo.userAgent = null;
              } else {
                _tmpInfo.userAgent = _cursor.getString(_cursorIndexOfUserAgent);
              }
              _tmpInfo.numFailed = _cursor.getInt(_cursorIndexOfNumFailed);
              _tmpInfo.retryAfter = _cursor.getInt(_cursorIndexOfRetryAfter);
              _tmpInfo.lastModify = _cursor.getLong(_cursorIndexOfLastModify);
              if (_cursor.isNull(_cursorIndexOfChecksum)) {
                _tmpInfo.checksum = null;
              } else {
                _tmpInfo.checksum = _cursor.getString(_cursorIndexOfChecksum);
              }
              ArrayList<DownloadPiece> _tmpPiecesCollection_1 = null;
              final String _tmpKey_1 = _cursor.getString(_cursorIndexOfId);
              _tmpPiecesCollection_1 = _collectionPieces.get(_tmpKey_1);
              if (_tmpPiecesCollection_1 == null) {
                _tmpPiecesCollection_1 = new ArrayList<DownloadPiece>();
              }
              _item = new InfoAndPieces();
              _item.info = _tmpInfo;
              _item.pieces = _tmpPiecesCollection_1;
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flowable<InfoAndPieces> observeInfoAndPiecesById(final UUID id) {
    final String _sql = "SELECT * FROM DownloadInfo WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final String _tmp = UUIDConverter.fromUUID(id);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    return RxRoom.createFlowable(__db, true, new String[]{"DownloadPiece","DownloadInfo"}, new Callable<InfoAndPieces>() {
      @Override
      public InfoAndPieces call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final int _cursorIndexOfDirPath = CursorUtil.getColumnIndexOrThrow(_cursor, "dirPath");
            final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
            final int _cursorIndexOfFileName = CursorUtil.getColumnIndexOrThrow(_cursor, "fileName");
            final int _cursorIndexOfMediaName = CursorUtil.getColumnIndexOrThrow(_cursor, "mediaName");
            final int _cursorIndexOfMediaBackdrop = CursorUtil.getColumnIndexOrThrow(_cursor, "mediaBackdrop");
            final int _cursorIndexOfMediaId = CursorUtil.getColumnIndexOrThrow(_cursor, "mediaId");
            final int _cursorIndexOfMediatype = CursorUtil.getColumnIndexOrThrow(_cursor, "mediatype");
            final int _cursorIndexOfRefer = CursorUtil.getColumnIndexOrThrow(_cursor, "refer");
            final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
            final int _cursorIndexOfMimeType = CursorUtil.getColumnIndexOrThrow(_cursor, "mimeType");
            final int _cursorIndexOfTotalBytes = CursorUtil.getColumnIndexOrThrow(_cursor, "totalBytes");
            final int _cursorIndexOfNumPieces = CursorUtil.getColumnIndexOrThrow(_cursor, "numPieces");
            final int _cursorIndexOfStatusCode = CursorUtil.getColumnIndexOrThrow(_cursor, "statusCode");
            final int _cursorIndexOfUnmeteredConnectionsOnly = CursorUtil.getColumnIndexOrThrow(_cursor, "unmeteredConnectionsOnly");
            final int _cursorIndexOfRetry = CursorUtil.getColumnIndexOrThrow(_cursor, "retry");
            final int _cursorIndexOfPartialSupport = CursorUtil.getColumnIndexOrThrow(_cursor, "partialSupport");
            final int _cursorIndexOfStatusMsg = CursorUtil.getColumnIndexOrThrow(_cursor, "statusMsg");
            final int _cursorIndexOfDateAdded = CursorUtil.getColumnIndexOrThrow(_cursor, "dateAdded");
            final int _cursorIndexOfVisibility = CursorUtil.getColumnIndexOrThrow(_cursor, "visibility");
            final int _cursorIndexOfHasMetadata = CursorUtil.getColumnIndexOrThrow(_cursor, "hasMetadata");
            final int _cursorIndexOfUserAgent = CursorUtil.getColumnIndexOrThrow(_cursor, "userAgent");
            final int _cursorIndexOfNumFailed = CursorUtil.getColumnIndexOrThrow(_cursor, "numFailed");
            final int _cursorIndexOfRetryAfter = CursorUtil.getColumnIndexOrThrow(_cursor, "retryAfter");
            final int _cursorIndexOfLastModify = CursorUtil.getColumnIndexOrThrow(_cursor, "lastModify");
            final int _cursorIndexOfChecksum = CursorUtil.getColumnIndexOrThrow(_cursor, "checksum");
            final ArrayMap<String, ArrayList<DownloadPiece>> _collectionPieces = new ArrayMap<String, ArrayList<DownloadPiece>>();
            while (_cursor.moveToNext()) {
              final String _tmpKey = _cursor.getString(_cursorIndexOfId);
              ArrayList<DownloadPiece> _tmpPiecesCollection = _collectionPieces.get(_tmpKey);
              if (_tmpPiecesCollection == null) {
                _tmpPiecesCollection = new ArrayList<DownloadPiece>();
                _collectionPieces.put(_tmpKey, _tmpPiecesCollection);
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipDownloadPieceAscomEasyplexUiDownloadmanagerCoreModelDataEntityDownloadPiece(_collectionPieces);
            final InfoAndPieces _result;
            if(_cursor.moveToFirst()) {
              final DownloadInfo _tmpInfo;
              final Uri _tmpDirPath;
              final String _tmp_1;
              if (_cursor.isNull(_cursorIndexOfDirPath)) {
                _tmp_1 = null;
              } else {
                _tmp_1 = _cursor.getString(_cursorIndexOfDirPath);
              }
              _tmpDirPath = UriConverter.toUri(_tmp_1);
              final String _tmpUrl;
              if (_cursor.isNull(_cursorIndexOfUrl)) {
                _tmpUrl = null;
              } else {
                _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
              }
              final String _tmpFileName;
              if (_cursor.isNull(_cursorIndexOfFileName)) {
                _tmpFileName = null;
              } else {
                _tmpFileName = _cursor.getString(_cursorIndexOfFileName);
              }
              final String _tmpMediaName;
              if (_cursor.isNull(_cursorIndexOfMediaName)) {
                _tmpMediaName = null;
              } else {
                _tmpMediaName = _cursor.getString(_cursorIndexOfMediaName);
              }
              final String _tmpMediaBackdrop;
              if (_cursor.isNull(_cursorIndexOfMediaBackdrop)) {
                _tmpMediaBackdrop = null;
              } else {
                _tmpMediaBackdrop = _cursor.getString(_cursorIndexOfMediaBackdrop);
              }
              final String _tmpMediaId;
              if (_cursor.isNull(_cursorIndexOfMediaId)) {
                _tmpMediaId = null;
              } else {
                _tmpMediaId = _cursor.getString(_cursorIndexOfMediaId);
              }
              final String _tmpMediatype;
              if (_cursor.isNull(_cursorIndexOfMediatype)) {
                _tmpMediatype = null;
              } else {
                _tmpMediatype = _cursor.getString(_cursorIndexOfMediatype);
              }
              final String _tmpRefer;
              if (_cursor.isNull(_cursorIndexOfRefer)) {
                _tmpRefer = null;
              } else {
                _tmpRefer = _cursor.getString(_cursorIndexOfRefer);
              }
              _tmpInfo = new DownloadInfo(_tmpDirPath,_tmpUrl,_tmpFileName,_tmpMediaName,_tmpMediatype,_tmpMediaId,_tmpMediaBackdrop,_tmpRefer);
              final String _tmp_2;
              if (_cursor.isNull(_cursorIndexOfId)) {
                _tmp_2 = null;
              } else {
                _tmp_2 = _cursor.getString(_cursorIndexOfId);
              }
              _tmpInfo.id = UUIDConverter.toUUID(_tmp_2);
              if (_cursor.isNull(_cursorIndexOfDescription)) {
                _tmpInfo.description = null;
              } else {
                _tmpInfo.description = _cursor.getString(_cursorIndexOfDescription);
              }
              if (_cursor.isNull(_cursorIndexOfMimeType)) {
                _tmpInfo.mimeType = null;
              } else {
                _tmpInfo.mimeType = _cursor.getString(_cursorIndexOfMimeType);
              }
              _tmpInfo.totalBytes = _cursor.getLong(_cursorIndexOfTotalBytes);
              final int _tmpNumPieces;
              _tmpNumPieces = _cursor.getInt(_cursorIndexOfNumPieces);
              _tmpInfo.setNumPieces(_tmpNumPieces);
              _tmpInfo.statusCode = _cursor.getInt(_cursorIndexOfStatusCode);
              final int _tmp_3;
              _tmp_3 = _cursor.getInt(_cursorIndexOfUnmeteredConnectionsOnly);
              _tmpInfo.unmeteredConnectionsOnly = _tmp_3 != 0;
              final int _tmp_4;
              _tmp_4 = _cursor.getInt(_cursorIndexOfRetry);
              _tmpInfo.retry = _tmp_4 != 0;
              final int _tmp_5;
              _tmp_5 = _cursor.getInt(_cursorIndexOfPartialSupport);
              _tmpInfo.partialSupport = _tmp_5 != 0;
              if (_cursor.isNull(_cursorIndexOfStatusMsg)) {
                _tmpInfo.statusMsg = null;
              } else {
                _tmpInfo.statusMsg = _cursor.getString(_cursorIndexOfStatusMsg);
              }
              _tmpInfo.dateAdded = _cursor.getLong(_cursorIndexOfDateAdded);
              _tmpInfo.visibility = _cursor.getInt(_cursorIndexOfVisibility);
              final int _tmp_6;
              _tmp_6 = _cursor.getInt(_cursorIndexOfHasMetadata);
              _tmpInfo.hasMetadata = _tmp_6 != 0;
              if (_cursor.isNull(_cursorIndexOfUserAgent)) {
                _tmpInfo.userAgent = null;
              } else {
                _tmpInfo.userAgent = _cursor.getString(_cursorIndexOfUserAgent);
              }
              _tmpInfo.numFailed = _cursor.getInt(_cursorIndexOfNumFailed);
              _tmpInfo.retryAfter = _cursor.getInt(_cursorIndexOfRetryAfter);
              _tmpInfo.lastModify = _cursor.getLong(_cursorIndexOfLastModify);
              if (_cursor.isNull(_cursorIndexOfChecksum)) {
                _tmpInfo.checksum = null;
              } else {
                _tmpInfo.checksum = _cursor.getString(_cursorIndexOfChecksum);
              }
              ArrayList<DownloadPiece> _tmpPiecesCollection_1 = null;
              final String _tmpKey_1 = _cursor.getString(_cursorIndexOfId);
              _tmpPiecesCollection_1 = _collectionPieces.get(_tmpKey_1);
              if (_tmpPiecesCollection_1 == null) {
                _tmpPiecesCollection_1 = new ArrayList<DownloadPiece>();
              }
              _result = new InfoAndPieces();
              _result.info = _tmpInfo;
              _result.pieces = _tmpPiecesCollection_1;
            } else {
              _result = null;
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Single<List<InfoAndPieces>> getAllInfoAndPiecesSingle() {
    final String _sql = "SELECT * FROM DownloadInfo";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createSingle(new Callable<List<InfoAndPieces>>() {
      @Override
      public List<InfoAndPieces> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final int _cursorIndexOfDirPath = CursorUtil.getColumnIndexOrThrow(_cursor, "dirPath");
            final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
            final int _cursorIndexOfFileName = CursorUtil.getColumnIndexOrThrow(_cursor, "fileName");
            final int _cursorIndexOfMediaName = CursorUtil.getColumnIndexOrThrow(_cursor, "mediaName");
            final int _cursorIndexOfMediaBackdrop = CursorUtil.getColumnIndexOrThrow(_cursor, "mediaBackdrop");
            final int _cursorIndexOfMediaId = CursorUtil.getColumnIndexOrThrow(_cursor, "mediaId");
            final int _cursorIndexOfMediatype = CursorUtil.getColumnIndexOrThrow(_cursor, "mediatype");
            final int _cursorIndexOfRefer = CursorUtil.getColumnIndexOrThrow(_cursor, "refer");
            final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
            final int _cursorIndexOfMimeType = CursorUtil.getColumnIndexOrThrow(_cursor, "mimeType");
            final int _cursorIndexOfTotalBytes = CursorUtil.getColumnIndexOrThrow(_cursor, "totalBytes");
            final int _cursorIndexOfNumPieces = CursorUtil.getColumnIndexOrThrow(_cursor, "numPieces");
            final int _cursorIndexOfStatusCode = CursorUtil.getColumnIndexOrThrow(_cursor, "statusCode");
            final int _cursorIndexOfUnmeteredConnectionsOnly = CursorUtil.getColumnIndexOrThrow(_cursor, "unmeteredConnectionsOnly");
            final int _cursorIndexOfRetry = CursorUtil.getColumnIndexOrThrow(_cursor, "retry");
            final int _cursorIndexOfPartialSupport = CursorUtil.getColumnIndexOrThrow(_cursor, "partialSupport");
            final int _cursorIndexOfStatusMsg = CursorUtil.getColumnIndexOrThrow(_cursor, "statusMsg");
            final int _cursorIndexOfDateAdded = CursorUtil.getColumnIndexOrThrow(_cursor, "dateAdded");
            final int _cursorIndexOfVisibility = CursorUtil.getColumnIndexOrThrow(_cursor, "visibility");
            final int _cursorIndexOfHasMetadata = CursorUtil.getColumnIndexOrThrow(_cursor, "hasMetadata");
            final int _cursorIndexOfUserAgent = CursorUtil.getColumnIndexOrThrow(_cursor, "userAgent");
            final int _cursorIndexOfNumFailed = CursorUtil.getColumnIndexOrThrow(_cursor, "numFailed");
            final int _cursorIndexOfRetryAfter = CursorUtil.getColumnIndexOrThrow(_cursor, "retryAfter");
            final int _cursorIndexOfLastModify = CursorUtil.getColumnIndexOrThrow(_cursor, "lastModify");
            final int _cursorIndexOfChecksum = CursorUtil.getColumnIndexOrThrow(_cursor, "checksum");
            final ArrayMap<String, ArrayList<DownloadPiece>> _collectionPieces = new ArrayMap<String, ArrayList<DownloadPiece>>();
            while (_cursor.moveToNext()) {
              final String _tmpKey = _cursor.getString(_cursorIndexOfId);
              ArrayList<DownloadPiece> _tmpPiecesCollection = _collectionPieces.get(_tmpKey);
              if (_tmpPiecesCollection == null) {
                _tmpPiecesCollection = new ArrayList<DownloadPiece>();
                _collectionPieces.put(_tmpKey, _tmpPiecesCollection);
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipDownloadPieceAscomEasyplexUiDownloadmanagerCoreModelDataEntityDownloadPiece(_collectionPieces);
            final List<InfoAndPieces> _result = new ArrayList<InfoAndPieces>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final InfoAndPieces _item;
              final DownloadInfo _tmpInfo;
              final Uri _tmpDirPath;
              final String _tmp;
              if (_cursor.isNull(_cursorIndexOfDirPath)) {
                _tmp = null;
              } else {
                _tmp = _cursor.getString(_cursorIndexOfDirPath);
              }
              _tmpDirPath = UriConverter.toUri(_tmp);
              final String _tmpUrl;
              if (_cursor.isNull(_cursorIndexOfUrl)) {
                _tmpUrl = null;
              } else {
                _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
              }
              final String _tmpFileName;
              if (_cursor.isNull(_cursorIndexOfFileName)) {
                _tmpFileName = null;
              } else {
                _tmpFileName = _cursor.getString(_cursorIndexOfFileName);
              }
              final String _tmpMediaName;
              if (_cursor.isNull(_cursorIndexOfMediaName)) {
                _tmpMediaName = null;
              } else {
                _tmpMediaName = _cursor.getString(_cursorIndexOfMediaName);
              }
              final String _tmpMediaBackdrop;
              if (_cursor.isNull(_cursorIndexOfMediaBackdrop)) {
                _tmpMediaBackdrop = null;
              } else {
                _tmpMediaBackdrop = _cursor.getString(_cursorIndexOfMediaBackdrop);
              }
              final String _tmpMediaId;
              if (_cursor.isNull(_cursorIndexOfMediaId)) {
                _tmpMediaId = null;
              } else {
                _tmpMediaId = _cursor.getString(_cursorIndexOfMediaId);
              }
              final String _tmpMediatype;
              if (_cursor.isNull(_cursorIndexOfMediatype)) {
                _tmpMediatype = null;
              } else {
                _tmpMediatype = _cursor.getString(_cursorIndexOfMediatype);
              }
              final String _tmpRefer;
              if (_cursor.isNull(_cursorIndexOfRefer)) {
                _tmpRefer = null;
              } else {
                _tmpRefer = _cursor.getString(_cursorIndexOfRefer);
              }
              _tmpInfo = new DownloadInfo(_tmpDirPath,_tmpUrl,_tmpFileName,_tmpMediaName,_tmpMediatype,_tmpMediaId,_tmpMediaBackdrop,_tmpRefer);
              final String _tmp_1;
              if (_cursor.isNull(_cursorIndexOfId)) {
                _tmp_1 = null;
              } else {
                _tmp_1 = _cursor.getString(_cursorIndexOfId);
              }
              _tmpInfo.id = UUIDConverter.toUUID(_tmp_1);
              if (_cursor.isNull(_cursorIndexOfDescription)) {
                _tmpInfo.description = null;
              } else {
                _tmpInfo.description = _cursor.getString(_cursorIndexOfDescription);
              }
              if (_cursor.isNull(_cursorIndexOfMimeType)) {
                _tmpInfo.mimeType = null;
              } else {
                _tmpInfo.mimeType = _cursor.getString(_cursorIndexOfMimeType);
              }
              _tmpInfo.totalBytes = _cursor.getLong(_cursorIndexOfTotalBytes);
              final int _tmpNumPieces;
              _tmpNumPieces = _cursor.getInt(_cursorIndexOfNumPieces);
              _tmpInfo.setNumPieces(_tmpNumPieces);
              _tmpInfo.statusCode = _cursor.getInt(_cursorIndexOfStatusCode);
              final int _tmp_2;
              _tmp_2 = _cursor.getInt(_cursorIndexOfUnmeteredConnectionsOnly);
              _tmpInfo.unmeteredConnectionsOnly = _tmp_2 != 0;
              final int _tmp_3;
              _tmp_3 = _cursor.getInt(_cursorIndexOfRetry);
              _tmpInfo.retry = _tmp_3 != 0;
              final int _tmp_4;
              _tmp_4 = _cursor.getInt(_cursorIndexOfPartialSupport);
              _tmpInfo.partialSupport = _tmp_4 != 0;
              if (_cursor.isNull(_cursorIndexOfStatusMsg)) {
                _tmpInfo.statusMsg = null;
              } else {
                _tmpInfo.statusMsg = _cursor.getString(_cursorIndexOfStatusMsg);
              }
              _tmpInfo.dateAdded = _cursor.getLong(_cursorIndexOfDateAdded);
              _tmpInfo.visibility = _cursor.getInt(_cursorIndexOfVisibility);
              final int _tmp_5;
              _tmp_5 = _cursor.getInt(_cursorIndexOfHasMetadata);
              _tmpInfo.hasMetadata = _tmp_5 != 0;
              if (_cursor.isNull(_cursorIndexOfUserAgent)) {
                _tmpInfo.userAgent = null;
              } else {
                _tmpInfo.userAgent = _cursor.getString(_cursorIndexOfUserAgent);
              }
              _tmpInfo.numFailed = _cursor.getInt(_cursorIndexOfNumFailed);
              _tmpInfo.retryAfter = _cursor.getInt(_cursorIndexOfRetryAfter);
              _tmpInfo.lastModify = _cursor.getLong(_cursorIndexOfLastModify);
              if (_cursor.isNull(_cursorIndexOfChecksum)) {
                _tmpInfo.checksum = null;
              } else {
                _tmpInfo.checksum = _cursor.getString(_cursorIndexOfChecksum);
              }
              ArrayList<DownloadPiece> _tmpPiecesCollection_1 = null;
              final String _tmpKey_1 = _cursor.getString(_cursorIndexOfId);
              _tmpPiecesCollection_1 = _collectionPieces.get(_tmpKey_1);
              if (_tmpPiecesCollection_1 == null) {
                _tmpPiecesCollection_1 = new ArrayList<DownloadPiece>();
              }
              _item = new InfoAndPieces();
              _item.info = _tmpInfo;
              _item.pieces = _tmpPiecesCollection_1;
              _result.add(_item);
            }
            if(_result == null) {
              throw new EmptyResultSetException("Query returned empty result set: " + _statement.getSql());
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public DownloadInfo getInfoById(final UUID id) {
    final String _sql = "SELECT * FROM DownloadInfo WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final String _tmp = UUIDConverter.fromUUID(id);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfDirPath = CursorUtil.getColumnIndexOrThrow(_cursor, "dirPath");
      final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
      final int _cursorIndexOfFileName = CursorUtil.getColumnIndexOrThrow(_cursor, "fileName");
      final int _cursorIndexOfMediaName = CursorUtil.getColumnIndexOrThrow(_cursor, "mediaName");
      final int _cursorIndexOfMediaBackdrop = CursorUtil.getColumnIndexOrThrow(_cursor, "mediaBackdrop");
      final int _cursorIndexOfMediaId = CursorUtil.getColumnIndexOrThrow(_cursor, "mediaId");
      final int _cursorIndexOfMediatype = CursorUtil.getColumnIndexOrThrow(_cursor, "mediatype");
      final int _cursorIndexOfRefer = CursorUtil.getColumnIndexOrThrow(_cursor, "refer");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfMimeType = CursorUtil.getColumnIndexOrThrow(_cursor, "mimeType");
      final int _cursorIndexOfTotalBytes = CursorUtil.getColumnIndexOrThrow(_cursor, "totalBytes");
      final int _cursorIndexOfNumPieces = CursorUtil.getColumnIndexOrThrow(_cursor, "numPieces");
      final int _cursorIndexOfStatusCode = CursorUtil.getColumnIndexOrThrow(_cursor, "statusCode");
      final int _cursorIndexOfUnmeteredConnectionsOnly = CursorUtil.getColumnIndexOrThrow(_cursor, "unmeteredConnectionsOnly");
      final int _cursorIndexOfRetry = CursorUtil.getColumnIndexOrThrow(_cursor, "retry");
      final int _cursorIndexOfPartialSupport = CursorUtil.getColumnIndexOrThrow(_cursor, "partialSupport");
      final int _cursorIndexOfStatusMsg = CursorUtil.getColumnIndexOrThrow(_cursor, "statusMsg");
      final int _cursorIndexOfDateAdded = CursorUtil.getColumnIndexOrThrow(_cursor, "dateAdded");
      final int _cursorIndexOfVisibility = CursorUtil.getColumnIndexOrThrow(_cursor, "visibility");
      final int _cursorIndexOfHasMetadata = CursorUtil.getColumnIndexOrThrow(_cursor, "hasMetadata");
      final int _cursorIndexOfUserAgent = CursorUtil.getColumnIndexOrThrow(_cursor, "userAgent");
      final int _cursorIndexOfNumFailed = CursorUtil.getColumnIndexOrThrow(_cursor, "numFailed");
      final int _cursorIndexOfRetryAfter = CursorUtil.getColumnIndexOrThrow(_cursor, "retryAfter");
      final int _cursorIndexOfLastModify = CursorUtil.getColumnIndexOrThrow(_cursor, "lastModify");
      final int _cursorIndexOfChecksum = CursorUtil.getColumnIndexOrThrow(_cursor, "checksum");
      final DownloadInfo _result;
      if(_cursor.moveToFirst()) {
        final Uri _tmpDirPath;
        final String _tmp_1;
        if (_cursor.isNull(_cursorIndexOfDirPath)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getString(_cursorIndexOfDirPath);
        }
        _tmpDirPath = UriConverter.toUri(_tmp_1);
        final String _tmpUrl;
        if (_cursor.isNull(_cursorIndexOfUrl)) {
          _tmpUrl = null;
        } else {
          _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
        }
        final String _tmpFileName;
        if (_cursor.isNull(_cursorIndexOfFileName)) {
          _tmpFileName = null;
        } else {
          _tmpFileName = _cursor.getString(_cursorIndexOfFileName);
        }
        final String _tmpMediaName;
        if (_cursor.isNull(_cursorIndexOfMediaName)) {
          _tmpMediaName = null;
        } else {
          _tmpMediaName = _cursor.getString(_cursorIndexOfMediaName);
        }
        final String _tmpMediaBackdrop;
        if (_cursor.isNull(_cursorIndexOfMediaBackdrop)) {
          _tmpMediaBackdrop = null;
        } else {
          _tmpMediaBackdrop = _cursor.getString(_cursorIndexOfMediaBackdrop);
        }
        final String _tmpMediaId;
        if (_cursor.isNull(_cursorIndexOfMediaId)) {
          _tmpMediaId = null;
        } else {
          _tmpMediaId = _cursor.getString(_cursorIndexOfMediaId);
        }
        final String _tmpMediatype;
        if (_cursor.isNull(_cursorIndexOfMediatype)) {
          _tmpMediatype = null;
        } else {
          _tmpMediatype = _cursor.getString(_cursorIndexOfMediatype);
        }
        final String _tmpRefer;
        if (_cursor.isNull(_cursorIndexOfRefer)) {
          _tmpRefer = null;
        } else {
          _tmpRefer = _cursor.getString(_cursorIndexOfRefer);
        }
        _result = new DownloadInfo(_tmpDirPath,_tmpUrl,_tmpFileName,_tmpMediaName,_tmpMediatype,_tmpMediaId,_tmpMediaBackdrop,_tmpRefer);
        final String _tmp_2;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmp_2 = null;
        } else {
          _tmp_2 = _cursor.getString(_cursorIndexOfId);
        }
        _result.id = UUIDConverter.toUUID(_tmp_2);
        if (_cursor.isNull(_cursorIndexOfDescription)) {
          _result.description = null;
        } else {
          _result.description = _cursor.getString(_cursorIndexOfDescription);
        }
        if (_cursor.isNull(_cursorIndexOfMimeType)) {
          _result.mimeType = null;
        } else {
          _result.mimeType = _cursor.getString(_cursorIndexOfMimeType);
        }
        _result.totalBytes = _cursor.getLong(_cursorIndexOfTotalBytes);
        final int _tmpNumPieces;
        _tmpNumPieces = _cursor.getInt(_cursorIndexOfNumPieces);
        _result.setNumPieces(_tmpNumPieces);
        _result.statusCode = _cursor.getInt(_cursorIndexOfStatusCode);
        final int _tmp_3;
        _tmp_3 = _cursor.getInt(_cursorIndexOfUnmeteredConnectionsOnly);
        _result.unmeteredConnectionsOnly = _tmp_3 != 0;
        final int _tmp_4;
        _tmp_4 = _cursor.getInt(_cursorIndexOfRetry);
        _result.retry = _tmp_4 != 0;
        final int _tmp_5;
        _tmp_5 = _cursor.getInt(_cursorIndexOfPartialSupport);
        _result.partialSupport = _tmp_5 != 0;
        if (_cursor.isNull(_cursorIndexOfStatusMsg)) {
          _result.statusMsg = null;
        } else {
          _result.statusMsg = _cursor.getString(_cursorIndexOfStatusMsg);
        }
        _result.dateAdded = _cursor.getLong(_cursorIndexOfDateAdded);
        _result.visibility = _cursor.getInt(_cursorIndexOfVisibility);
        final int _tmp_6;
        _tmp_6 = _cursor.getInt(_cursorIndexOfHasMetadata);
        _result.hasMetadata = _tmp_6 != 0;
        if (_cursor.isNull(_cursorIndexOfUserAgent)) {
          _result.userAgent = null;
        } else {
          _result.userAgent = _cursor.getString(_cursorIndexOfUserAgent);
        }
        _result.numFailed = _cursor.getInt(_cursorIndexOfNumFailed);
        _result.retryAfter = _cursor.getInt(_cursorIndexOfRetryAfter);
        _result.lastModify = _cursor.getLong(_cursorIndexOfLastModify);
        if (_cursor.isNull(_cursorIndexOfChecksum)) {
          _result.checksum = null;
        } else {
          _result.checksum = _cursor.getString(_cursorIndexOfChecksum);
        }
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Single<DownloadInfo> getInfoByIdSingle(final UUID id) {
    final String _sql = "SELECT * FROM DownloadInfo WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final String _tmp = UUIDConverter.fromUUID(id);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    return RxRoom.createSingle(new Callable<DownloadInfo>() {
      @Override
      public DownloadInfo call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfDirPath = CursorUtil.getColumnIndexOrThrow(_cursor, "dirPath");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final int _cursorIndexOfFileName = CursorUtil.getColumnIndexOrThrow(_cursor, "fileName");
          final int _cursorIndexOfMediaName = CursorUtil.getColumnIndexOrThrow(_cursor, "mediaName");
          final int _cursorIndexOfMediaBackdrop = CursorUtil.getColumnIndexOrThrow(_cursor, "mediaBackdrop");
          final int _cursorIndexOfMediaId = CursorUtil.getColumnIndexOrThrow(_cursor, "mediaId");
          final int _cursorIndexOfMediatype = CursorUtil.getColumnIndexOrThrow(_cursor, "mediatype");
          final int _cursorIndexOfRefer = CursorUtil.getColumnIndexOrThrow(_cursor, "refer");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfMimeType = CursorUtil.getColumnIndexOrThrow(_cursor, "mimeType");
          final int _cursorIndexOfTotalBytes = CursorUtil.getColumnIndexOrThrow(_cursor, "totalBytes");
          final int _cursorIndexOfNumPieces = CursorUtil.getColumnIndexOrThrow(_cursor, "numPieces");
          final int _cursorIndexOfStatusCode = CursorUtil.getColumnIndexOrThrow(_cursor, "statusCode");
          final int _cursorIndexOfUnmeteredConnectionsOnly = CursorUtil.getColumnIndexOrThrow(_cursor, "unmeteredConnectionsOnly");
          final int _cursorIndexOfRetry = CursorUtil.getColumnIndexOrThrow(_cursor, "retry");
          final int _cursorIndexOfPartialSupport = CursorUtil.getColumnIndexOrThrow(_cursor, "partialSupport");
          final int _cursorIndexOfStatusMsg = CursorUtil.getColumnIndexOrThrow(_cursor, "statusMsg");
          final int _cursorIndexOfDateAdded = CursorUtil.getColumnIndexOrThrow(_cursor, "dateAdded");
          final int _cursorIndexOfVisibility = CursorUtil.getColumnIndexOrThrow(_cursor, "visibility");
          final int _cursorIndexOfHasMetadata = CursorUtil.getColumnIndexOrThrow(_cursor, "hasMetadata");
          final int _cursorIndexOfUserAgent = CursorUtil.getColumnIndexOrThrow(_cursor, "userAgent");
          final int _cursorIndexOfNumFailed = CursorUtil.getColumnIndexOrThrow(_cursor, "numFailed");
          final int _cursorIndexOfRetryAfter = CursorUtil.getColumnIndexOrThrow(_cursor, "retryAfter");
          final int _cursorIndexOfLastModify = CursorUtil.getColumnIndexOrThrow(_cursor, "lastModify");
          final int _cursorIndexOfChecksum = CursorUtil.getColumnIndexOrThrow(_cursor, "checksum");
          final DownloadInfo _result;
          if(_cursor.moveToFirst()) {
            final Uri _tmpDirPath;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfDirPath)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfDirPath);
            }
            _tmpDirPath = UriConverter.toUri(_tmp_1);
            final String _tmpUrl;
            if (_cursor.isNull(_cursorIndexOfUrl)) {
              _tmpUrl = null;
            } else {
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            }
            final String _tmpFileName;
            if (_cursor.isNull(_cursorIndexOfFileName)) {
              _tmpFileName = null;
            } else {
              _tmpFileName = _cursor.getString(_cursorIndexOfFileName);
            }
            final String _tmpMediaName;
            if (_cursor.isNull(_cursorIndexOfMediaName)) {
              _tmpMediaName = null;
            } else {
              _tmpMediaName = _cursor.getString(_cursorIndexOfMediaName);
            }
            final String _tmpMediaBackdrop;
            if (_cursor.isNull(_cursorIndexOfMediaBackdrop)) {
              _tmpMediaBackdrop = null;
            } else {
              _tmpMediaBackdrop = _cursor.getString(_cursorIndexOfMediaBackdrop);
            }
            final String _tmpMediaId;
            if (_cursor.isNull(_cursorIndexOfMediaId)) {
              _tmpMediaId = null;
            } else {
              _tmpMediaId = _cursor.getString(_cursorIndexOfMediaId);
            }
            final String _tmpMediatype;
            if (_cursor.isNull(_cursorIndexOfMediatype)) {
              _tmpMediatype = null;
            } else {
              _tmpMediatype = _cursor.getString(_cursorIndexOfMediatype);
            }
            final String _tmpRefer;
            if (_cursor.isNull(_cursorIndexOfRefer)) {
              _tmpRefer = null;
            } else {
              _tmpRefer = _cursor.getString(_cursorIndexOfRefer);
            }
            _result = new DownloadInfo(_tmpDirPath,_tmpUrl,_tmpFileName,_tmpMediaName,_tmpMediatype,_tmpMediaId,_tmpMediaBackdrop,_tmpRefer);
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfId);
            }
            _result.id = UUIDConverter.toUUID(_tmp_2);
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _result.description = null;
            } else {
              _result.description = _cursor.getString(_cursorIndexOfDescription);
            }
            if (_cursor.isNull(_cursorIndexOfMimeType)) {
              _result.mimeType = null;
            } else {
              _result.mimeType = _cursor.getString(_cursorIndexOfMimeType);
            }
            _result.totalBytes = _cursor.getLong(_cursorIndexOfTotalBytes);
            final int _tmpNumPieces;
            _tmpNumPieces = _cursor.getInt(_cursorIndexOfNumPieces);
            _result.setNumPieces(_tmpNumPieces);
            _result.statusCode = _cursor.getInt(_cursorIndexOfStatusCode);
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfUnmeteredConnectionsOnly);
            _result.unmeteredConnectionsOnly = _tmp_3 != 0;
            final int _tmp_4;
            _tmp_4 = _cursor.getInt(_cursorIndexOfRetry);
            _result.retry = _tmp_4 != 0;
            final int _tmp_5;
            _tmp_5 = _cursor.getInt(_cursorIndexOfPartialSupport);
            _result.partialSupport = _tmp_5 != 0;
            if (_cursor.isNull(_cursorIndexOfStatusMsg)) {
              _result.statusMsg = null;
            } else {
              _result.statusMsg = _cursor.getString(_cursorIndexOfStatusMsg);
            }
            _result.dateAdded = _cursor.getLong(_cursorIndexOfDateAdded);
            _result.visibility = _cursor.getInt(_cursorIndexOfVisibility);
            final int _tmp_6;
            _tmp_6 = _cursor.getInt(_cursorIndexOfHasMetadata);
            _result.hasMetadata = _tmp_6 != 0;
            if (_cursor.isNull(_cursorIndexOfUserAgent)) {
              _result.userAgent = null;
            } else {
              _result.userAgent = _cursor.getString(_cursorIndexOfUserAgent);
            }
            _result.numFailed = _cursor.getInt(_cursorIndexOfNumFailed);
            _result.retryAfter = _cursor.getInt(_cursorIndexOfRetryAfter);
            _result.lastModify = _cursor.getLong(_cursorIndexOfLastModify);
            if (_cursor.isNull(_cursorIndexOfChecksum)) {
              _result.checksum = null;
            } else {
              _result.checksum = _cursor.getString(_cursorIndexOfChecksum);
            }
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

  @Override
  public List<DownloadPiece> getPiecesById(final UUID infoId) {
    final String _sql = "SELECT * FROM DownloadPiece WHERE infoId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final String _tmp = UUIDConverter.fromUUID(infoId);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfIndex = CursorUtil.getColumnIndexOrThrow(_cursor, "pieceIndex");
      final int _cursorIndexOfInfoId = CursorUtil.getColumnIndexOrThrow(_cursor, "infoId");
      final int _cursorIndexOfSize = CursorUtil.getColumnIndexOrThrow(_cursor, "size");
      final int _cursorIndexOfCurBytes = CursorUtil.getColumnIndexOrThrow(_cursor, "curBytes");
      final int _cursorIndexOfStatusCode = CursorUtil.getColumnIndexOrThrow(_cursor, "statusCode");
      final int _cursorIndexOfStatusMsg = CursorUtil.getColumnIndexOrThrow(_cursor, "statusMsg");
      final int _cursorIndexOfSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "speed");
      final List<DownloadPiece> _result = new ArrayList<DownloadPiece>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final DownloadPiece _item;
        final int _tmpIndex;
        _tmpIndex = _cursor.getInt(_cursorIndexOfIndex);
        final UUID _tmpInfoId;
        final String _tmp_1;
        if (_cursor.isNull(_cursorIndexOfInfoId)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getString(_cursorIndexOfInfoId);
        }
        _tmpInfoId = UUIDConverter.toUUID(_tmp_1);
        final long _tmpSize;
        _tmpSize = _cursor.getLong(_cursorIndexOfSize);
        final long _tmpCurBytes;
        _tmpCurBytes = _cursor.getLong(_cursorIndexOfCurBytes);
        _item = new DownloadPiece(_tmpInfoId,_tmpIndex,_tmpSize,_tmpCurBytes);
        _item.statusCode = _cursor.getInt(_cursorIndexOfStatusCode);
        if (_cursor.isNull(_cursorIndexOfStatusMsg)) {
          _item.statusMsg = null;
        } else {
          _item.statusMsg = _cursor.getString(_cursorIndexOfStatusMsg);
        }
        _item.speed = _cursor.getLong(_cursorIndexOfSpeed);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<DownloadPiece> getPiecesByIdSorted(final UUID infoId) {
    final String _sql = "SELECT * FROM DownloadPiece WHERE infoId = ? ORDER BY statusCode ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final String _tmp = UUIDConverter.fromUUID(infoId);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfIndex = CursorUtil.getColumnIndexOrThrow(_cursor, "pieceIndex");
      final int _cursorIndexOfInfoId = CursorUtil.getColumnIndexOrThrow(_cursor, "infoId");
      final int _cursorIndexOfSize = CursorUtil.getColumnIndexOrThrow(_cursor, "size");
      final int _cursorIndexOfCurBytes = CursorUtil.getColumnIndexOrThrow(_cursor, "curBytes");
      final int _cursorIndexOfStatusCode = CursorUtil.getColumnIndexOrThrow(_cursor, "statusCode");
      final int _cursorIndexOfStatusMsg = CursorUtil.getColumnIndexOrThrow(_cursor, "statusMsg");
      final int _cursorIndexOfSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "speed");
      final List<DownloadPiece> _result = new ArrayList<DownloadPiece>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final DownloadPiece _item;
        final int _tmpIndex;
        _tmpIndex = _cursor.getInt(_cursorIndexOfIndex);
        final UUID _tmpInfoId;
        final String _tmp_1;
        if (_cursor.isNull(_cursorIndexOfInfoId)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getString(_cursorIndexOfInfoId);
        }
        _tmpInfoId = UUIDConverter.toUUID(_tmp_1);
        final long _tmpSize;
        _tmpSize = _cursor.getLong(_cursorIndexOfSize);
        final long _tmpCurBytes;
        _tmpCurBytes = _cursor.getLong(_cursorIndexOfCurBytes);
        _item = new DownloadPiece(_tmpInfoId,_tmpIndex,_tmpSize,_tmpCurBytes);
        _item.statusCode = _cursor.getInt(_cursorIndexOfStatusCode);
        if (_cursor.isNull(_cursorIndexOfStatusMsg)) {
          _item.statusMsg = null;
        } else {
          _item.statusMsg = _cursor.getString(_cursorIndexOfStatusMsg);
        }
        _item.speed = _cursor.getLong(_cursorIndexOfSpeed);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public DownloadPiece getPiece(final int index, final UUID infoId) {
    final String _sql = "SELECT * FROM DownloadPiece WHERE pieceIndex = ? AND infoId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, index);
    _argIndex = 2;
    final String _tmp = UUIDConverter.fromUUID(infoId);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfIndex = CursorUtil.getColumnIndexOrThrow(_cursor, "pieceIndex");
      final int _cursorIndexOfInfoId = CursorUtil.getColumnIndexOrThrow(_cursor, "infoId");
      final int _cursorIndexOfSize = CursorUtil.getColumnIndexOrThrow(_cursor, "size");
      final int _cursorIndexOfCurBytes = CursorUtil.getColumnIndexOrThrow(_cursor, "curBytes");
      final int _cursorIndexOfStatusCode = CursorUtil.getColumnIndexOrThrow(_cursor, "statusCode");
      final int _cursorIndexOfStatusMsg = CursorUtil.getColumnIndexOrThrow(_cursor, "statusMsg");
      final int _cursorIndexOfSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "speed");
      final DownloadPiece _result;
      if(_cursor.moveToFirst()) {
        final int _tmpIndex;
        _tmpIndex = _cursor.getInt(_cursorIndexOfIndex);
        final UUID _tmpInfoId;
        final String _tmp_1;
        if (_cursor.isNull(_cursorIndexOfInfoId)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getString(_cursorIndexOfInfoId);
        }
        _tmpInfoId = UUIDConverter.toUUID(_tmp_1);
        final long _tmpSize;
        _tmpSize = _cursor.getLong(_cursorIndexOfSize);
        final long _tmpCurBytes;
        _tmpCurBytes = _cursor.getLong(_cursorIndexOfCurBytes);
        _result = new DownloadPiece(_tmpInfoId,_tmpIndex,_tmpSize,_tmpCurBytes);
        _result.statusCode = _cursor.getInt(_cursorIndexOfStatusCode);
        if (_cursor.isNull(_cursorIndexOfStatusMsg)) {
          _result.statusMsg = null;
        } else {
          _result.statusMsg = _cursor.getString(_cursorIndexOfStatusMsg);
        }
        _result.speed = _cursor.getLong(_cursorIndexOfSpeed);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Header> getHeadersById(final UUID infoId) {
    final String _sql = "SELECT * FROM download_info_headers WHERE infoId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final String _tmp = UUIDConverter.fromUUID(infoId);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfInfoId = CursorUtil.getColumnIndexOrThrow(_cursor, "infoId");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfValue = CursorUtil.getColumnIndexOrThrow(_cursor, "value");
      final List<Header> _result = new ArrayList<Header>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Header _item;
        final UUID _tmpInfoId;
        final String _tmp_1;
        if (_cursor.isNull(_cursorIndexOfInfoId)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getString(_cursorIndexOfInfoId);
        }
        _tmpInfoId = UUIDConverter.toUUID(_tmp_1);
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpValue;
        if (_cursor.isNull(_cursorIndexOfValue)) {
          _tmpValue = null;
        } else {
          _tmpValue = _cursor.getString(_cursorIndexOfValue);
        }
        _item = new Header(_tmpInfoId,_tmpName,_tmpValue);
        _item.id = _cursor.getLong(_cursorIndexOfId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }

  private void __fetchRelationshipDownloadPieceAscomEasyplexUiDownloadmanagerCoreModelDataEntityDownloadPiece(
      final ArrayMap<String, ArrayList<DownloadPiece>> _map) {
    final Set<String> __mapKeySet = _map.keySet();
    if (__mapKeySet.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      ArrayMap<String, ArrayList<DownloadPiece>> _tmpInnerMap = new ArrayMap<String, ArrayList<DownloadPiece>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipDownloadPieceAscomEasyplexUiDownloadmanagerCoreModelDataEntityDownloadPiece(_tmpInnerMap);
          _tmpInnerMap = new ArrayMap<String, ArrayList<DownloadPiece>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipDownloadPieceAscomEasyplexUiDownloadmanagerCoreModelDataEntityDownloadPiece(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `pieceIndex`,`infoId`,`size`,`curBytes`,`statusCode`,`statusMsg`,`speed` FROM `DownloadPiece` WHERE `infoId` IN (");
    final int _inputSize = __mapKeySet.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (String _item : __mapKeySet) {
      if (_item == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, _item);
      }
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "infoId");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfIndex = 0;
      final int _cursorIndexOfInfoId = 1;
      final int _cursorIndexOfSize = 2;
      final int _cursorIndexOfCurBytes = 3;
      final int _cursorIndexOfStatusCode = 4;
      final int _cursorIndexOfStatusMsg = 5;
      final int _cursorIndexOfSpeed = 6;
      while(_cursor.moveToNext()) {
        final String _tmpKey = _cursor.getString(_itemKeyIndex);
        ArrayList<DownloadPiece> _tmpRelation = _map.get(_tmpKey);
        if (_tmpRelation != null) {
          final DownloadPiece _item_1;
          final int _tmpIndex_1;
          _tmpIndex_1 = _cursor.getInt(_cursorIndexOfIndex);
          final UUID _tmpInfoId;
          final String _tmp;
          if (_cursor.isNull(_cursorIndexOfInfoId)) {
            _tmp = null;
          } else {
            _tmp = _cursor.getString(_cursorIndexOfInfoId);
          }
          _tmpInfoId = UUIDConverter.toUUID(_tmp);
          final long _tmpSize;
          _tmpSize = _cursor.getLong(_cursorIndexOfSize);
          final long _tmpCurBytes;
          _tmpCurBytes = _cursor.getLong(_cursorIndexOfCurBytes);
          _item_1 = new DownloadPiece(_tmpInfoId,_tmpIndex_1,_tmpSize,_tmpCurBytes);
          _item_1.statusCode = _cursor.getInt(_cursorIndexOfStatusCode);
          if (_cursor.isNull(_cursorIndexOfStatusMsg)) {
            _item_1.statusMsg = null;
          } else {
            _item_1.statusMsg = _cursor.getString(_cursorIndexOfStatusMsg);
          }
          _item_1.speed = _cursor.getLong(_cursorIndexOfSpeed);
          _tmpRelation.add(_item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }
}
