package com.easyplex.data.local.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.easyplex.data.local.converters.CastConverter;
import com.easyplex.data.local.converters.GenreConverter;
import com.easyplex.data.local.converters.MediaStreamConverter;
import com.easyplex.data.local.converters.MediaSubstitlesConverter;
import com.easyplex.data.local.converters.SaisonConverter;
import com.easyplex.data.local.entity.History;
import com.easyplex.data.model.credits.Cast;
import com.easyplex.data.model.genres.Genre;
import com.easyplex.data.model.serie.Season;
import com.easyplex.data.model.stream.MediaStream;
import com.easyplex.data.model.substitles.MediaSubstitle;
import io.reactivex.Flowable;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
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
public final class HistoryDao_Impl implements HistoryDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<History> __insertionAdapterOfHistory;

  private final EntityDeletionOrUpdateAdapter<History> __deletionAdapterOfHistory;

  private final SharedSQLiteStatement __preparedStmtOfDeleteHistory;

  public HistoryDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfHistory = new EntityInsertionAdapter<History>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `history` (`userprofile_history`,`id`,`tmdbId_history`,`posterpath_history`,`serieName_history`,`title_history`,`backdrop_path_history`,`link_history`,`tv_history`,`type_history`,`positionEpisode_history`,`externalId_history`,`seasonsNumber_history`,`seasondbId_history`,`mediaGenre_history`,`seasonId_history`,`episodeNmber_history`,`postion_history`,`episodeName_history`,`currentSeasons_history`,`episodeId_history`,`serieId_history`,`episodeTmdb_history`,`deviceId`,`skiprecapStartIn`,`hasrecap`,`imdbExternalId`,`subtitle`,`name`,`substype`,`contentLength`,`overview`,`genreName`,`linkpreview`,`minicover`,`previewPath`,`trailerUrl`,`voteAverage`,`voteCount`,`live`,`premuim`,`newEpisodes`,`userHistoryId`,`vip`,`hls`,`streamhls`,`embed`,`youtubelink`,`resumeWindow`,`resumePosition`,`isAnime`,`popularity`,`views`,`status`,`substitles`,`seasons`,`runtime`,`releaseDate`,`genre`,`firstAirDate`,`trailerId`,`createdAt`,`updatedAt`,`hd`,`downloads`,`videos`,`genres`,`cast`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, History value) {
        if (value.getUserProfile() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getUserProfile());
        }
        if (value.getId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getId());
        }
        if (value.getTmdbId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTmdbId());
        }
        if (value.getPosterPath() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPosterPath());
        }
        if (value.getSerieName() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getSerieName());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getTitle());
        }
        if (value.getBackdropPath() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getBackdropPath());
        }
        if (value.getLink() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getLink());
        }
        if (value.getTv() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getTv());
        }
        if (value.getType() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getType());
        }
        if (value.getPositionEpisode() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getPositionEpisode());
        }
        if (value.getExternalId() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getExternalId());
        }
        if (value.getSeasonsNumber() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getSeasonsNumber());
        }
        stmt.bindLong(14, value.getSeasondbId());
        if (value.getMediaGenre() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getMediaGenre());
        }
        if (value.getSeasonsId() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getSeasonsId());
        }
        if (value.getEpisodeNmber() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getEpisodeNmber());
        }
        stmt.bindLong(18, value.getPosition());
        if (value.getEpisodeName() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.getEpisodeName());
        }
        if (value.getCurrentSeasons() == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, value.getCurrentSeasons());
        }
        if (value.getEpisodeId() == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindString(21, value.getEpisodeId());
        }
        if (value.getSerieId() == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindString(22, value.getSerieId());
        }
        if (value.getEpisodeTmdb() == null) {
          stmt.bindNull(23);
        } else {
          stmt.bindString(23, value.getEpisodeTmdb());
        }
        if (value.getDeviceId() == null) {
          stmt.bindNull(24);
        } else {
          stmt.bindString(24, value.getDeviceId());
        }
        if (value.getSkiprecapStartIn() == null) {
          stmt.bindNull(25);
        } else {
          stmt.bindLong(25, value.getSkiprecapStartIn());
        }
        if (value.getHasrecap() == null) {
          stmt.bindNull(26);
        } else {
          stmt.bindLong(26, value.getHasrecap());
        }
        if (value.getImdbExternalId() == null) {
          stmt.bindNull(27);
        } else {
          stmt.bindString(27, value.getImdbExternalId());
        }
        if (value.getSubtitle() == null) {
          stmt.bindNull(28);
        } else {
          stmt.bindString(28, value.getSubtitle());
        }
        if (value.getName() == null) {
          stmt.bindNull(29);
        } else {
          stmt.bindString(29, value.getName());
        }
        if (value.getSubstype() == null) {
          stmt.bindNull(30);
        } else {
          stmt.bindString(30, value.getSubstype());
        }
        stmt.bindLong(31, value.getContentLength());
        if (value.getOverview() == null) {
          stmt.bindNull(32);
        } else {
          stmt.bindString(32, value.getOverview());
        }
        if (value.getGenreName() == null) {
          stmt.bindNull(33);
        } else {
          stmt.bindString(33, value.getGenreName());
        }
        if (value.getLinkpreview() == null) {
          stmt.bindNull(34);
        } else {
          stmt.bindString(34, value.getLinkpreview());
        }
        if (value.getMinicover() == null) {
          stmt.bindNull(35);
        } else {
          stmt.bindString(35, value.getMinicover());
        }
        if (value.getPreviewPath() == null) {
          stmt.bindNull(36);
        } else {
          stmt.bindString(36, value.getPreviewPath());
        }
        if (value.getTrailerUrl() == null) {
          stmt.bindNull(37);
        } else {
          stmt.bindString(37, value.getTrailerUrl());
        }
        stmt.bindDouble(38, value.getVoteAverage());
        if (value.getVoteCount() == null) {
          stmt.bindNull(39);
        } else {
          stmt.bindString(39, value.getVoteCount());
        }
        stmt.bindLong(40, value.getLive());
        stmt.bindLong(41, value.getPremuim());
        stmt.bindLong(42, value.getNewEpisodes());
        stmt.bindLong(43, value.getUserHistoryId());
        stmt.bindLong(44, value.getVip());
        stmt.bindLong(45, value.getHls());
        stmt.bindLong(46, value.getStreamhls());
        stmt.bindLong(47, value.getEmbed());
        stmt.bindLong(48, value.getYoutubelink());
        stmt.bindLong(49, value.getResumeWindow());
        stmt.bindLong(50, value.getResumePosition());
        stmt.bindLong(51, value.getIsAnime());
        if (value.getPopularity() == null) {
          stmt.bindNull(52);
        } else {
          stmt.bindString(52, value.getPopularity());
        }
        if (value.getViews() == null) {
          stmt.bindNull(53);
        } else {
          stmt.bindString(53, value.getViews());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(54);
        } else {
          stmt.bindString(54, value.getStatus());
        }
        final String _tmp = MediaSubstitlesConverter.convertListToString(value.getSubstitles());
        if (_tmp == null) {
          stmt.bindNull(55);
        } else {
          stmt.bindString(55, _tmp);
        }
        final String _tmp_1 = SaisonConverter.convertListToString(value.getSeasons());
        if (_tmp_1 == null) {
          stmt.bindNull(56);
        } else {
          stmt.bindString(56, _tmp_1);
        }
        if (value.getRuntime() == null) {
          stmt.bindNull(57);
        } else {
          stmt.bindString(57, value.getRuntime());
        }
        if (value.getReleaseDate() == null) {
          stmt.bindNull(58);
        } else {
          stmt.bindString(58, value.getReleaseDate());
        }
        if (value.getGenre() == null) {
          stmt.bindNull(59);
        } else {
          stmt.bindString(59, value.getGenre());
        }
        if (value.getFirstAirDate() == null) {
          stmt.bindNull(60);
        } else {
          stmt.bindString(60, value.getFirstAirDate());
        }
        if (value.getTrailerId() == null) {
          stmt.bindNull(61);
        } else {
          stmt.bindString(61, value.getTrailerId());
        }
        if (value.getCreatedAt() == null) {
          stmt.bindNull(62);
        } else {
          stmt.bindString(62, value.getCreatedAt());
        }
        if (value.getUpdatedAt() == null) {
          stmt.bindNull(63);
        } else {
          stmt.bindString(63, value.getUpdatedAt());
        }
        if (value.getHd() == null) {
          stmt.bindNull(64);
        } else {
          stmt.bindLong(64, value.getHd());
        }
        final String _tmp_2 = MediaStreamConverter.convertListToString(value.getDownloads());
        if (_tmp_2 == null) {
          stmt.bindNull(65);
        } else {
          stmt.bindString(65, _tmp_2);
        }
        final String _tmp_3 = MediaStreamConverter.convertListToString(value.getVideos());
        if (_tmp_3 == null) {
          stmt.bindNull(66);
        } else {
          stmt.bindString(66, _tmp_3);
        }
        final String _tmp_4 = GenreConverter.fromArrayList(value.getGenres());
        if (_tmp_4 == null) {
          stmt.bindNull(67);
        } else {
          stmt.bindString(67, _tmp_4);
        }
        final String _tmp_5 = CastConverter.convertListToString(value.getCast());
        if (_tmp_5 == null) {
          stmt.bindNull(68);
        } else {
          stmt.bindString(68, _tmp_5);
        }
      }
    };
    this.__deletionAdapterOfHistory = new EntityDeletionOrUpdateAdapter<History>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `history` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, History value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
      }
    };
    this.__preparedStmtOfDeleteHistory = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM history";
        return _query;
      }
    };
  }

  @Override
  public void saveMediaToFavorite(final History history) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfHistory.insert(history);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteMediaFromHistory(final History mediaDetail) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfHistory.handle(mediaDetail);
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
  public Flowable<List<History>> getHistory() {
    final String _sql = "SELECT * FROM history  ORDER BY createdAt DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, false, new String[]{"history"}, new Callable<List<History>>() {
      @Override
      public List<History> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUserProfile = CursorUtil.getColumnIndexOrThrow(_cursor, "userprofile_history");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTmdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "tmdbId_history");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "posterpath_history");
          final int _cursorIndexOfSerieName = CursorUtil.getColumnIndexOrThrow(_cursor, "serieName_history");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title_history");
          final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdrop_path_history");
          final int _cursorIndexOfLink = CursorUtil.getColumnIndexOrThrow(_cursor, "link_history");
          final int _cursorIndexOfTv = CursorUtil.getColumnIndexOrThrow(_cursor, "tv_history");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type_history");
          final int _cursorIndexOfPositionEpisode = CursorUtil.getColumnIndexOrThrow(_cursor, "positionEpisode_history");
          final int _cursorIndexOfExternalId = CursorUtil.getColumnIndexOrThrow(_cursor, "externalId_history");
          final int _cursorIndexOfSeasonsNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "seasonsNumber_history");
          final int _cursorIndexOfSeasondbId = CursorUtil.getColumnIndexOrThrow(_cursor, "seasondbId_history");
          final int _cursorIndexOfMediaGenre = CursorUtil.getColumnIndexOrThrow(_cursor, "mediaGenre_history");
          final int _cursorIndexOfSeasonsId = CursorUtil.getColumnIndexOrThrow(_cursor, "seasonId_history");
          final int _cursorIndexOfEpisodeNmber = CursorUtil.getColumnIndexOrThrow(_cursor, "episodeNmber_history");
          final int _cursorIndexOfPosition = CursorUtil.getColumnIndexOrThrow(_cursor, "postion_history");
          final int _cursorIndexOfEpisodeName = CursorUtil.getColumnIndexOrThrow(_cursor, "episodeName_history");
          final int _cursorIndexOfCurrentSeasons = CursorUtil.getColumnIndexOrThrow(_cursor, "currentSeasons_history");
          final int _cursorIndexOfEpisodeId = CursorUtil.getColumnIndexOrThrow(_cursor, "episodeId_history");
          final int _cursorIndexOfSerieId = CursorUtil.getColumnIndexOrThrow(_cursor, "serieId_history");
          final int _cursorIndexOfEpisodeTmdb = CursorUtil.getColumnIndexOrThrow(_cursor, "episodeTmdb_history");
          final int _cursorIndexOfDeviceId = CursorUtil.getColumnIndexOrThrow(_cursor, "deviceId");
          final int _cursorIndexOfSkiprecapStartIn = CursorUtil.getColumnIndexOrThrow(_cursor, "skiprecapStartIn");
          final int _cursorIndexOfHasrecap = CursorUtil.getColumnIndexOrThrow(_cursor, "hasrecap");
          final int _cursorIndexOfImdbExternalId = CursorUtil.getColumnIndexOrThrow(_cursor, "imdbExternalId");
          final int _cursorIndexOfSubtitle = CursorUtil.getColumnIndexOrThrow(_cursor, "subtitle");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfSubstype = CursorUtil.getColumnIndexOrThrow(_cursor, "substype");
          final int _cursorIndexOfContentLength = CursorUtil.getColumnIndexOrThrow(_cursor, "contentLength");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfGenreName = CursorUtil.getColumnIndexOrThrow(_cursor, "genreName");
          final int _cursorIndexOfLinkpreview = CursorUtil.getColumnIndexOrThrow(_cursor, "linkpreview");
          final int _cursorIndexOfMinicover = CursorUtil.getColumnIndexOrThrow(_cursor, "minicover");
          final int _cursorIndexOfPreviewPath = CursorUtil.getColumnIndexOrThrow(_cursor, "previewPath");
          final int _cursorIndexOfTrailerUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "trailerUrl");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "voteAverage");
          final int _cursorIndexOfVoteCount = CursorUtil.getColumnIndexOrThrow(_cursor, "voteCount");
          final int _cursorIndexOfLive = CursorUtil.getColumnIndexOrThrow(_cursor, "live");
          final int _cursorIndexOfPremuim = CursorUtil.getColumnIndexOrThrow(_cursor, "premuim");
          final int _cursorIndexOfNewEpisodes = CursorUtil.getColumnIndexOrThrow(_cursor, "newEpisodes");
          final int _cursorIndexOfUserHistoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "userHistoryId");
          final int _cursorIndexOfVip = CursorUtil.getColumnIndexOrThrow(_cursor, "vip");
          final int _cursorIndexOfHls = CursorUtil.getColumnIndexOrThrow(_cursor, "hls");
          final int _cursorIndexOfStreamhls = CursorUtil.getColumnIndexOrThrow(_cursor, "streamhls");
          final int _cursorIndexOfEmbed = CursorUtil.getColumnIndexOrThrow(_cursor, "embed");
          final int _cursorIndexOfYoutubelink = CursorUtil.getColumnIndexOrThrow(_cursor, "youtubelink");
          final int _cursorIndexOfResumeWindow = CursorUtil.getColumnIndexOrThrow(_cursor, "resumeWindow");
          final int _cursorIndexOfResumePosition = CursorUtil.getColumnIndexOrThrow(_cursor, "resumePosition");
          final int _cursorIndexOfIsAnime = CursorUtil.getColumnIndexOrThrow(_cursor, "isAnime");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
          final int _cursorIndexOfViews = CursorUtil.getColumnIndexOrThrow(_cursor, "views");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfSubstitles = CursorUtil.getColumnIndexOrThrow(_cursor, "substitles");
          final int _cursorIndexOfSeasons = CursorUtil.getColumnIndexOrThrow(_cursor, "seasons");
          final int _cursorIndexOfRuntime = CursorUtil.getColumnIndexOrThrow(_cursor, "runtime");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseDate");
          final int _cursorIndexOfGenre = CursorUtil.getColumnIndexOrThrow(_cursor, "genre");
          final int _cursorIndexOfFirstAirDate = CursorUtil.getColumnIndexOrThrow(_cursor, "firstAirDate");
          final int _cursorIndexOfTrailerId = CursorUtil.getColumnIndexOrThrow(_cursor, "trailerId");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
          final int _cursorIndexOfHd = CursorUtil.getColumnIndexOrThrow(_cursor, "hd");
          final int _cursorIndexOfDownloads = CursorUtil.getColumnIndexOrThrow(_cursor, "downloads");
          final int _cursorIndexOfVideos = CursorUtil.getColumnIndexOrThrow(_cursor, "videos");
          final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
          final int _cursorIndexOfCast = CursorUtil.getColumnIndexOrThrow(_cursor, "cast");
          final List<History> _result = new ArrayList<History>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final History _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpTmdbId;
            if (_cursor.isNull(_cursorIndexOfTmdbId)) {
              _tmpTmdbId = null;
            } else {
              _tmpTmdbId = _cursor.getString(_cursorIndexOfTmdbId);
            }
            final String _tmpPosterPath;
            if (_cursor.isNull(_cursorIndexOfPosterPath)) {
              _tmpPosterPath = null;
            } else {
              _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpBackdropPath;
            if (_cursor.isNull(_cursorIndexOfBackdropPath)) {
              _tmpBackdropPath = null;
            } else {
              _tmpBackdropPath = _cursor.getString(_cursorIndexOfBackdropPath);
            }
            final String _tmpLink;
            if (_cursor.isNull(_cursorIndexOfLink)) {
              _tmpLink = null;
            } else {
              _tmpLink = _cursor.getString(_cursorIndexOfLink);
            }
            _item = new History(_tmpId,_tmpTmdbId,_tmpPosterPath,_tmpTitle,_tmpBackdropPath,_tmpLink);
            final String _tmpUserProfile;
            if (_cursor.isNull(_cursorIndexOfUserProfile)) {
              _tmpUserProfile = null;
            } else {
              _tmpUserProfile = _cursor.getString(_cursorIndexOfUserProfile);
            }
            _item.setUserProfile(_tmpUserProfile);
            final String _tmpSerieName;
            if (_cursor.isNull(_cursorIndexOfSerieName)) {
              _tmpSerieName = null;
            } else {
              _tmpSerieName = _cursor.getString(_cursorIndexOfSerieName);
            }
            _item.setSerieName(_tmpSerieName);
            final String _tmpTv;
            if (_cursor.isNull(_cursorIndexOfTv)) {
              _tmpTv = null;
            } else {
              _tmpTv = _cursor.getString(_cursorIndexOfTv);
            }
            _item.setTv(_tmpTv);
            final String _tmpType;
            if (_cursor.isNull(_cursorIndexOfType)) {
              _tmpType = null;
            } else {
              _tmpType = _cursor.getString(_cursorIndexOfType);
            }
            _item.setType(_tmpType);
            final String _tmpPositionEpisode;
            if (_cursor.isNull(_cursorIndexOfPositionEpisode)) {
              _tmpPositionEpisode = null;
            } else {
              _tmpPositionEpisode = _cursor.getString(_cursorIndexOfPositionEpisode);
            }
            _item.setPositionEpisode(_tmpPositionEpisode);
            final String _tmpExternalId;
            if (_cursor.isNull(_cursorIndexOfExternalId)) {
              _tmpExternalId = null;
            } else {
              _tmpExternalId = _cursor.getString(_cursorIndexOfExternalId);
            }
            _item.setExternalId(_tmpExternalId);
            final String _tmpSeasonsNumber;
            if (_cursor.isNull(_cursorIndexOfSeasonsNumber)) {
              _tmpSeasonsNumber = null;
            } else {
              _tmpSeasonsNumber = _cursor.getString(_cursorIndexOfSeasonsNumber);
            }
            _item.setSeasonsNumber(_tmpSeasonsNumber);
            final int _tmpSeasondbId;
            _tmpSeasondbId = _cursor.getInt(_cursorIndexOfSeasondbId);
            _item.setSeasondbId(_tmpSeasondbId);
            final String _tmpMediaGenre;
            if (_cursor.isNull(_cursorIndexOfMediaGenre)) {
              _tmpMediaGenre = null;
            } else {
              _tmpMediaGenre = _cursor.getString(_cursorIndexOfMediaGenre);
            }
            _item.setMediaGenre(_tmpMediaGenre);
            final String _tmpSeasonsId;
            if (_cursor.isNull(_cursorIndexOfSeasonsId)) {
              _tmpSeasonsId = null;
            } else {
              _tmpSeasonsId = _cursor.getString(_cursorIndexOfSeasonsId);
            }
            _item.setSeasonsId(_tmpSeasonsId);
            final String _tmpEpisodeNmber;
            if (_cursor.isNull(_cursorIndexOfEpisodeNmber)) {
              _tmpEpisodeNmber = null;
            } else {
              _tmpEpisodeNmber = _cursor.getString(_cursorIndexOfEpisodeNmber);
            }
            _item.setEpisodeNmber(_tmpEpisodeNmber);
            final int _tmpPosition;
            _tmpPosition = _cursor.getInt(_cursorIndexOfPosition);
            _item.setPosition(_tmpPosition);
            final String _tmpEpisodeName;
            if (_cursor.isNull(_cursorIndexOfEpisodeName)) {
              _tmpEpisodeName = null;
            } else {
              _tmpEpisodeName = _cursor.getString(_cursorIndexOfEpisodeName);
            }
            _item.setEpisodeName(_tmpEpisodeName);
            final String _tmpCurrentSeasons;
            if (_cursor.isNull(_cursorIndexOfCurrentSeasons)) {
              _tmpCurrentSeasons = null;
            } else {
              _tmpCurrentSeasons = _cursor.getString(_cursorIndexOfCurrentSeasons);
            }
            _item.setCurrentSeasons(_tmpCurrentSeasons);
            final String _tmpEpisodeId;
            if (_cursor.isNull(_cursorIndexOfEpisodeId)) {
              _tmpEpisodeId = null;
            } else {
              _tmpEpisodeId = _cursor.getString(_cursorIndexOfEpisodeId);
            }
            _item.setEpisodeId(_tmpEpisodeId);
            final String _tmpSerieId;
            if (_cursor.isNull(_cursorIndexOfSerieId)) {
              _tmpSerieId = null;
            } else {
              _tmpSerieId = _cursor.getString(_cursorIndexOfSerieId);
            }
            _item.setSerieId(_tmpSerieId);
            final String _tmpEpisodeTmdb;
            if (_cursor.isNull(_cursorIndexOfEpisodeTmdb)) {
              _tmpEpisodeTmdb = null;
            } else {
              _tmpEpisodeTmdb = _cursor.getString(_cursorIndexOfEpisodeTmdb);
            }
            _item.setEpisodeTmdb(_tmpEpisodeTmdb);
            final String _tmpDeviceId;
            if (_cursor.isNull(_cursorIndexOfDeviceId)) {
              _tmpDeviceId = null;
            } else {
              _tmpDeviceId = _cursor.getString(_cursorIndexOfDeviceId);
            }
            _item.setDeviceId(_tmpDeviceId);
            final Integer _tmpSkiprecapStartIn;
            if (_cursor.isNull(_cursorIndexOfSkiprecapStartIn)) {
              _tmpSkiprecapStartIn = null;
            } else {
              _tmpSkiprecapStartIn = _cursor.getInt(_cursorIndexOfSkiprecapStartIn);
            }
            _item.setSkiprecapStartIn(_tmpSkiprecapStartIn);
            final Integer _tmpHasrecap;
            if (_cursor.isNull(_cursorIndexOfHasrecap)) {
              _tmpHasrecap = null;
            } else {
              _tmpHasrecap = _cursor.getInt(_cursorIndexOfHasrecap);
            }
            _item.setHasrecap(_tmpHasrecap);
            final String _tmpImdbExternalId;
            if (_cursor.isNull(_cursorIndexOfImdbExternalId)) {
              _tmpImdbExternalId = null;
            } else {
              _tmpImdbExternalId = _cursor.getString(_cursorIndexOfImdbExternalId);
            }
            _item.setImdbExternalId(_tmpImdbExternalId);
            final String _tmpSubtitle;
            if (_cursor.isNull(_cursorIndexOfSubtitle)) {
              _tmpSubtitle = null;
            } else {
              _tmpSubtitle = _cursor.getString(_cursorIndexOfSubtitle);
            }
            _item.setSubtitle(_tmpSubtitle);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            _item.setName(_tmpName);
            final String _tmpSubstype;
            if (_cursor.isNull(_cursorIndexOfSubstype)) {
              _tmpSubstype = null;
            } else {
              _tmpSubstype = _cursor.getString(_cursorIndexOfSubstype);
            }
            _item.setSubstype(_tmpSubstype);
            final long _tmpContentLength;
            _tmpContentLength = _cursor.getLong(_cursorIndexOfContentLength);
            _item.setContentLength(_tmpContentLength);
            final String _tmpOverview;
            if (_cursor.isNull(_cursorIndexOfOverview)) {
              _tmpOverview = null;
            } else {
              _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            }
            _item.setOverview(_tmpOverview);
            final String _tmpGenreName;
            if (_cursor.isNull(_cursorIndexOfGenreName)) {
              _tmpGenreName = null;
            } else {
              _tmpGenreName = _cursor.getString(_cursorIndexOfGenreName);
            }
            _item.setGenreName(_tmpGenreName);
            final String _tmpLinkpreview;
            if (_cursor.isNull(_cursorIndexOfLinkpreview)) {
              _tmpLinkpreview = null;
            } else {
              _tmpLinkpreview = _cursor.getString(_cursorIndexOfLinkpreview);
            }
            _item.setLinkpreview(_tmpLinkpreview);
            final String _tmpMinicover;
            if (_cursor.isNull(_cursorIndexOfMinicover)) {
              _tmpMinicover = null;
            } else {
              _tmpMinicover = _cursor.getString(_cursorIndexOfMinicover);
            }
            _item.setMinicover(_tmpMinicover);
            final String _tmpPreviewPath;
            if (_cursor.isNull(_cursorIndexOfPreviewPath)) {
              _tmpPreviewPath = null;
            } else {
              _tmpPreviewPath = _cursor.getString(_cursorIndexOfPreviewPath);
            }
            _item.setPreviewPath(_tmpPreviewPath);
            final String _tmpTrailerUrl;
            if (_cursor.isNull(_cursorIndexOfTrailerUrl)) {
              _tmpTrailerUrl = null;
            } else {
              _tmpTrailerUrl = _cursor.getString(_cursorIndexOfTrailerUrl);
            }
            _item.setTrailerUrl(_tmpTrailerUrl);
            final float _tmpVoteAverage;
            _tmpVoteAverage = _cursor.getFloat(_cursorIndexOfVoteAverage);
            _item.setVoteAverage(_tmpVoteAverage);
            final String _tmpVoteCount;
            if (_cursor.isNull(_cursorIndexOfVoteCount)) {
              _tmpVoteCount = null;
            } else {
              _tmpVoteCount = _cursor.getString(_cursorIndexOfVoteCount);
            }
            _item.setVoteCount(_tmpVoteCount);
            final int _tmpLive;
            _tmpLive = _cursor.getInt(_cursorIndexOfLive);
            _item.setLive(_tmpLive);
            final int _tmpPremuim;
            _tmpPremuim = _cursor.getInt(_cursorIndexOfPremuim);
            _item.setPremuim(_tmpPremuim);
            final int _tmpNewEpisodes;
            _tmpNewEpisodes = _cursor.getInt(_cursorIndexOfNewEpisodes);
            _item.setNewEpisodes(_tmpNewEpisodes);
            final int _tmpUserHistoryId;
            _tmpUserHistoryId = _cursor.getInt(_cursorIndexOfUserHistoryId);
            _item.setUserHistoryId(_tmpUserHistoryId);
            final int _tmpVip;
            _tmpVip = _cursor.getInt(_cursorIndexOfVip);
            _item.setVip(_tmpVip);
            final int _tmpHls;
            _tmpHls = _cursor.getInt(_cursorIndexOfHls);
            _item.setHls(_tmpHls);
            final int _tmpStreamhls;
            _tmpStreamhls = _cursor.getInt(_cursorIndexOfStreamhls);
            _item.setStreamhls(_tmpStreamhls);
            final int _tmpEmbed;
            _tmpEmbed = _cursor.getInt(_cursorIndexOfEmbed);
            _item.setEmbed(_tmpEmbed);
            final int _tmpYoutubelink;
            _tmpYoutubelink = _cursor.getInt(_cursorIndexOfYoutubelink);
            _item.setYoutubelink(_tmpYoutubelink);
            final int _tmpResumeWindow;
            _tmpResumeWindow = _cursor.getInt(_cursorIndexOfResumeWindow);
            _item.setResumeWindow(_tmpResumeWindow);
            final long _tmpResumePosition;
            _tmpResumePosition = _cursor.getLong(_cursorIndexOfResumePosition);
            _item.setResumePosition(_tmpResumePosition);
            final int _tmpIsAnime;
            _tmpIsAnime = _cursor.getInt(_cursorIndexOfIsAnime);
            _item.setIsAnime(_tmpIsAnime);
            final String _tmpPopularity;
            if (_cursor.isNull(_cursorIndexOfPopularity)) {
              _tmpPopularity = null;
            } else {
              _tmpPopularity = _cursor.getString(_cursorIndexOfPopularity);
            }
            _item.setPopularity(_tmpPopularity);
            final String _tmpViews;
            if (_cursor.isNull(_cursorIndexOfViews)) {
              _tmpViews = null;
            } else {
              _tmpViews = _cursor.getString(_cursorIndexOfViews);
            }
            _item.setViews(_tmpViews);
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            _item.setStatus(_tmpStatus);
            final List<MediaSubstitle> _tmpSubstitles;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfSubstitles)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfSubstitles);
            }
            _tmpSubstitles = MediaSubstitlesConverter.convertStringToList(_tmp);
            _item.setSubstitles(_tmpSubstitles);
            final List<Season> _tmpSeasons;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfSeasons)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfSeasons);
            }
            _tmpSeasons = SaisonConverter.convertStringToList(_tmp_1);
            _item.setSeasons(_tmpSeasons);
            final String _tmpRuntime;
            if (_cursor.isNull(_cursorIndexOfRuntime)) {
              _tmpRuntime = null;
            } else {
              _tmpRuntime = _cursor.getString(_cursorIndexOfRuntime);
            }
            _item.setRuntime(_tmpRuntime);
            final String _tmpReleaseDate;
            if (_cursor.isNull(_cursorIndexOfReleaseDate)) {
              _tmpReleaseDate = null;
            } else {
              _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
            }
            _item.setReleaseDate(_tmpReleaseDate);
            final String _tmpGenre;
            if (_cursor.isNull(_cursorIndexOfGenre)) {
              _tmpGenre = null;
            } else {
              _tmpGenre = _cursor.getString(_cursorIndexOfGenre);
            }
            _item.setGenre(_tmpGenre);
            final String _tmpFirstAirDate;
            if (_cursor.isNull(_cursorIndexOfFirstAirDate)) {
              _tmpFirstAirDate = null;
            } else {
              _tmpFirstAirDate = _cursor.getString(_cursorIndexOfFirstAirDate);
            }
            _item.setFirstAirDate(_tmpFirstAirDate);
            final String _tmpTrailerId;
            if (_cursor.isNull(_cursorIndexOfTrailerId)) {
              _tmpTrailerId = null;
            } else {
              _tmpTrailerId = _cursor.getString(_cursorIndexOfTrailerId);
            }
            _item.setTrailerId(_tmpTrailerId);
            final String _tmpCreatedAt;
            if (_cursor.isNull(_cursorIndexOfCreatedAt)) {
              _tmpCreatedAt = null;
            } else {
              _tmpCreatedAt = _cursor.getString(_cursorIndexOfCreatedAt);
            }
            _item.setCreatedAt(_tmpCreatedAt);
            final String _tmpUpdatedAt;
            if (_cursor.isNull(_cursorIndexOfUpdatedAt)) {
              _tmpUpdatedAt = null;
            } else {
              _tmpUpdatedAt = _cursor.getString(_cursorIndexOfUpdatedAt);
            }
            _item.setUpdatedAt(_tmpUpdatedAt);
            final Integer _tmpHd;
            if (_cursor.isNull(_cursorIndexOfHd)) {
              _tmpHd = null;
            } else {
              _tmpHd = _cursor.getInt(_cursorIndexOfHd);
            }
            _item.setHd(_tmpHd);
            final List<MediaStream> _tmpDownloads;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfDownloads)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfDownloads);
            }
            _tmpDownloads = MediaStreamConverter.convertStringToList(_tmp_2);
            _item.setDownloads(_tmpDownloads);
            final List<MediaStream> _tmpVideos;
            final String _tmp_3;
            if (_cursor.isNull(_cursorIndexOfVideos)) {
              _tmp_3 = null;
            } else {
              _tmp_3 = _cursor.getString(_cursorIndexOfVideos);
            }
            _tmpVideos = MediaStreamConverter.convertStringToList(_tmp_3);
            _item.setVideos(_tmpVideos);
            final List<Genre> _tmpGenres;
            final String _tmp_4;
            if (_cursor.isNull(_cursorIndexOfGenres)) {
              _tmp_4 = null;
            } else {
              _tmp_4 = _cursor.getString(_cursorIndexOfGenres);
            }
            _tmpGenres = GenreConverter.fromString(_tmp_4);
            _item.setGenres(_tmpGenres);
            final List<Cast> _tmpCast;
            final String _tmp_5;
            if (_cursor.isNull(_cursorIndexOfCast)) {
              _tmp_5 = null;
            } else {
              _tmp_5 = _cursor.getString(_cursorIndexOfCast);
            }
            _tmpCast = CastConverter.convertStringToList(_tmp_5);
            _item.setCast(_tmpCast);
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
  public Flowable<List<History>> getHistoryForProfiles(final int id) {
    final String _sql = "SELECT * FROM history WHERE userprofile_history=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return RxRoom.createFlowable(__db, false, new String[]{"history"}, new Callable<List<History>>() {
      @Override
      public List<History> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUserProfile = CursorUtil.getColumnIndexOrThrow(_cursor, "userprofile_history");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTmdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "tmdbId_history");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "posterpath_history");
          final int _cursorIndexOfSerieName = CursorUtil.getColumnIndexOrThrow(_cursor, "serieName_history");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title_history");
          final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdrop_path_history");
          final int _cursorIndexOfLink = CursorUtil.getColumnIndexOrThrow(_cursor, "link_history");
          final int _cursorIndexOfTv = CursorUtil.getColumnIndexOrThrow(_cursor, "tv_history");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type_history");
          final int _cursorIndexOfPositionEpisode = CursorUtil.getColumnIndexOrThrow(_cursor, "positionEpisode_history");
          final int _cursorIndexOfExternalId = CursorUtil.getColumnIndexOrThrow(_cursor, "externalId_history");
          final int _cursorIndexOfSeasonsNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "seasonsNumber_history");
          final int _cursorIndexOfSeasondbId = CursorUtil.getColumnIndexOrThrow(_cursor, "seasondbId_history");
          final int _cursorIndexOfMediaGenre = CursorUtil.getColumnIndexOrThrow(_cursor, "mediaGenre_history");
          final int _cursorIndexOfSeasonsId = CursorUtil.getColumnIndexOrThrow(_cursor, "seasonId_history");
          final int _cursorIndexOfEpisodeNmber = CursorUtil.getColumnIndexOrThrow(_cursor, "episodeNmber_history");
          final int _cursorIndexOfPosition = CursorUtil.getColumnIndexOrThrow(_cursor, "postion_history");
          final int _cursorIndexOfEpisodeName = CursorUtil.getColumnIndexOrThrow(_cursor, "episodeName_history");
          final int _cursorIndexOfCurrentSeasons = CursorUtil.getColumnIndexOrThrow(_cursor, "currentSeasons_history");
          final int _cursorIndexOfEpisodeId = CursorUtil.getColumnIndexOrThrow(_cursor, "episodeId_history");
          final int _cursorIndexOfSerieId = CursorUtil.getColumnIndexOrThrow(_cursor, "serieId_history");
          final int _cursorIndexOfEpisodeTmdb = CursorUtil.getColumnIndexOrThrow(_cursor, "episodeTmdb_history");
          final int _cursorIndexOfDeviceId = CursorUtil.getColumnIndexOrThrow(_cursor, "deviceId");
          final int _cursorIndexOfSkiprecapStartIn = CursorUtil.getColumnIndexOrThrow(_cursor, "skiprecapStartIn");
          final int _cursorIndexOfHasrecap = CursorUtil.getColumnIndexOrThrow(_cursor, "hasrecap");
          final int _cursorIndexOfImdbExternalId = CursorUtil.getColumnIndexOrThrow(_cursor, "imdbExternalId");
          final int _cursorIndexOfSubtitle = CursorUtil.getColumnIndexOrThrow(_cursor, "subtitle");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfSubstype = CursorUtil.getColumnIndexOrThrow(_cursor, "substype");
          final int _cursorIndexOfContentLength = CursorUtil.getColumnIndexOrThrow(_cursor, "contentLength");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfGenreName = CursorUtil.getColumnIndexOrThrow(_cursor, "genreName");
          final int _cursorIndexOfLinkpreview = CursorUtil.getColumnIndexOrThrow(_cursor, "linkpreview");
          final int _cursorIndexOfMinicover = CursorUtil.getColumnIndexOrThrow(_cursor, "minicover");
          final int _cursorIndexOfPreviewPath = CursorUtil.getColumnIndexOrThrow(_cursor, "previewPath");
          final int _cursorIndexOfTrailerUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "trailerUrl");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "voteAverage");
          final int _cursorIndexOfVoteCount = CursorUtil.getColumnIndexOrThrow(_cursor, "voteCount");
          final int _cursorIndexOfLive = CursorUtil.getColumnIndexOrThrow(_cursor, "live");
          final int _cursorIndexOfPremuim = CursorUtil.getColumnIndexOrThrow(_cursor, "premuim");
          final int _cursorIndexOfNewEpisodes = CursorUtil.getColumnIndexOrThrow(_cursor, "newEpisodes");
          final int _cursorIndexOfUserHistoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "userHistoryId");
          final int _cursorIndexOfVip = CursorUtil.getColumnIndexOrThrow(_cursor, "vip");
          final int _cursorIndexOfHls = CursorUtil.getColumnIndexOrThrow(_cursor, "hls");
          final int _cursorIndexOfStreamhls = CursorUtil.getColumnIndexOrThrow(_cursor, "streamhls");
          final int _cursorIndexOfEmbed = CursorUtil.getColumnIndexOrThrow(_cursor, "embed");
          final int _cursorIndexOfYoutubelink = CursorUtil.getColumnIndexOrThrow(_cursor, "youtubelink");
          final int _cursorIndexOfResumeWindow = CursorUtil.getColumnIndexOrThrow(_cursor, "resumeWindow");
          final int _cursorIndexOfResumePosition = CursorUtil.getColumnIndexOrThrow(_cursor, "resumePosition");
          final int _cursorIndexOfIsAnime = CursorUtil.getColumnIndexOrThrow(_cursor, "isAnime");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
          final int _cursorIndexOfViews = CursorUtil.getColumnIndexOrThrow(_cursor, "views");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfSubstitles = CursorUtil.getColumnIndexOrThrow(_cursor, "substitles");
          final int _cursorIndexOfSeasons = CursorUtil.getColumnIndexOrThrow(_cursor, "seasons");
          final int _cursorIndexOfRuntime = CursorUtil.getColumnIndexOrThrow(_cursor, "runtime");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseDate");
          final int _cursorIndexOfGenre = CursorUtil.getColumnIndexOrThrow(_cursor, "genre");
          final int _cursorIndexOfFirstAirDate = CursorUtil.getColumnIndexOrThrow(_cursor, "firstAirDate");
          final int _cursorIndexOfTrailerId = CursorUtil.getColumnIndexOrThrow(_cursor, "trailerId");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
          final int _cursorIndexOfHd = CursorUtil.getColumnIndexOrThrow(_cursor, "hd");
          final int _cursorIndexOfDownloads = CursorUtil.getColumnIndexOrThrow(_cursor, "downloads");
          final int _cursorIndexOfVideos = CursorUtil.getColumnIndexOrThrow(_cursor, "videos");
          final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
          final int _cursorIndexOfCast = CursorUtil.getColumnIndexOrThrow(_cursor, "cast");
          final List<History> _result = new ArrayList<History>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final History _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpTmdbId;
            if (_cursor.isNull(_cursorIndexOfTmdbId)) {
              _tmpTmdbId = null;
            } else {
              _tmpTmdbId = _cursor.getString(_cursorIndexOfTmdbId);
            }
            final String _tmpPosterPath;
            if (_cursor.isNull(_cursorIndexOfPosterPath)) {
              _tmpPosterPath = null;
            } else {
              _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpBackdropPath;
            if (_cursor.isNull(_cursorIndexOfBackdropPath)) {
              _tmpBackdropPath = null;
            } else {
              _tmpBackdropPath = _cursor.getString(_cursorIndexOfBackdropPath);
            }
            final String _tmpLink;
            if (_cursor.isNull(_cursorIndexOfLink)) {
              _tmpLink = null;
            } else {
              _tmpLink = _cursor.getString(_cursorIndexOfLink);
            }
            _item = new History(_tmpId,_tmpTmdbId,_tmpPosterPath,_tmpTitle,_tmpBackdropPath,_tmpLink);
            final String _tmpUserProfile;
            if (_cursor.isNull(_cursorIndexOfUserProfile)) {
              _tmpUserProfile = null;
            } else {
              _tmpUserProfile = _cursor.getString(_cursorIndexOfUserProfile);
            }
            _item.setUserProfile(_tmpUserProfile);
            final String _tmpSerieName;
            if (_cursor.isNull(_cursorIndexOfSerieName)) {
              _tmpSerieName = null;
            } else {
              _tmpSerieName = _cursor.getString(_cursorIndexOfSerieName);
            }
            _item.setSerieName(_tmpSerieName);
            final String _tmpTv;
            if (_cursor.isNull(_cursorIndexOfTv)) {
              _tmpTv = null;
            } else {
              _tmpTv = _cursor.getString(_cursorIndexOfTv);
            }
            _item.setTv(_tmpTv);
            final String _tmpType;
            if (_cursor.isNull(_cursorIndexOfType)) {
              _tmpType = null;
            } else {
              _tmpType = _cursor.getString(_cursorIndexOfType);
            }
            _item.setType(_tmpType);
            final String _tmpPositionEpisode;
            if (_cursor.isNull(_cursorIndexOfPositionEpisode)) {
              _tmpPositionEpisode = null;
            } else {
              _tmpPositionEpisode = _cursor.getString(_cursorIndexOfPositionEpisode);
            }
            _item.setPositionEpisode(_tmpPositionEpisode);
            final String _tmpExternalId;
            if (_cursor.isNull(_cursorIndexOfExternalId)) {
              _tmpExternalId = null;
            } else {
              _tmpExternalId = _cursor.getString(_cursorIndexOfExternalId);
            }
            _item.setExternalId(_tmpExternalId);
            final String _tmpSeasonsNumber;
            if (_cursor.isNull(_cursorIndexOfSeasonsNumber)) {
              _tmpSeasonsNumber = null;
            } else {
              _tmpSeasonsNumber = _cursor.getString(_cursorIndexOfSeasonsNumber);
            }
            _item.setSeasonsNumber(_tmpSeasonsNumber);
            final int _tmpSeasondbId;
            _tmpSeasondbId = _cursor.getInt(_cursorIndexOfSeasondbId);
            _item.setSeasondbId(_tmpSeasondbId);
            final String _tmpMediaGenre;
            if (_cursor.isNull(_cursorIndexOfMediaGenre)) {
              _tmpMediaGenre = null;
            } else {
              _tmpMediaGenre = _cursor.getString(_cursorIndexOfMediaGenre);
            }
            _item.setMediaGenre(_tmpMediaGenre);
            final String _tmpSeasonsId;
            if (_cursor.isNull(_cursorIndexOfSeasonsId)) {
              _tmpSeasonsId = null;
            } else {
              _tmpSeasonsId = _cursor.getString(_cursorIndexOfSeasonsId);
            }
            _item.setSeasonsId(_tmpSeasonsId);
            final String _tmpEpisodeNmber;
            if (_cursor.isNull(_cursorIndexOfEpisodeNmber)) {
              _tmpEpisodeNmber = null;
            } else {
              _tmpEpisodeNmber = _cursor.getString(_cursorIndexOfEpisodeNmber);
            }
            _item.setEpisodeNmber(_tmpEpisodeNmber);
            final int _tmpPosition;
            _tmpPosition = _cursor.getInt(_cursorIndexOfPosition);
            _item.setPosition(_tmpPosition);
            final String _tmpEpisodeName;
            if (_cursor.isNull(_cursorIndexOfEpisodeName)) {
              _tmpEpisodeName = null;
            } else {
              _tmpEpisodeName = _cursor.getString(_cursorIndexOfEpisodeName);
            }
            _item.setEpisodeName(_tmpEpisodeName);
            final String _tmpCurrentSeasons;
            if (_cursor.isNull(_cursorIndexOfCurrentSeasons)) {
              _tmpCurrentSeasons = null;
            } else {
              _tmpCurrentSeasons = _cursor.getString(_cursorIndexOfCurrentSeasons);
            }
            _item.setCurrentSeasons(_tmpCurrentSeasons);
            final String _tmpEpisodeId;
            if (_cursor.isNull(_cursorIndexOfEpisodeId)) {
              _tmpEpisodeId = null;
            } else {
              _tmpEpisodeId = _cursor.getString(_cursorIndexOfEpisodeId);
            }
            _item.setEpisodeId(_tmpEpisodeId);
            final String _tmpSerieId;
            if (_cursor.isNull(_cursorIndexOfSerieId)) {
              _tmpSerieId = null;
            } else {
              _tmpSerieId = _cursor.getString(_cursorIndexOfSerieId);
            }
            _item.setSerieId(_tmpSerieId);
            final String _tmpEpisodeTmdb;
            if (_cursor.isNull(_cursorIndexOfEpisodeTmdb)) {
              _tmpEpisodeTmdb = null;
            } else {
              _tmpEpisodeTmdb = _cursor.getString(_cursorIndexOfEpisodeTmdb);
            }
            _item.setEpisodeTmdb(_tmpEpisodeTmdb);
            final String _tmpDeviceId;
            if (_cursor.isNull(_cursorIndexOfDeviceId)) {
              _tmpDeviceId = null;
            } else {
              _tmpDeviceId = _cursor.getString(_cursorIndexOfDeviceId);
            }
            _item.setDeviceId(_tmpDeviceId);
            final Integer _tmpSkiprecapStartIn;
            if (_cursor.isNull(_cursorIndexOfSkiprecapStartIn)) {
              _tmpSkiprecapStartIn = null;
            } else {
              _tmpSkiprecapStartIn = _cursor.getInt(_cursorIndexOfSkiprecapStartIn);
            }
            _item.setSkiprecapStartIn(_tmpSkiprecapStartIn);
            final Integer _tmpHasrecap;
            if (_cursor.isNull(_cursorIndexOfHasrecap)) {
              _tmpHasrecap = null;
            } else {
              _tmpHasrecap = _cursor.getInt(_cursorIndexOfHasrecap);
            }
            _item.setHasrecap(_tmpHasrecap);
            final String _tmpImdbExternalId;
            if (_cursor.isNull(_cursorIndexOfImdbExternalId)) {
              _tmpImdbExternalId = null;
            } else {
              _tmpImdbExternalId = _cursor.getString(_cursorIndexOfImdbExternalId);
            }
            _item.setImdbExternalId(_tmpImdbExternalId);
            final String _tmpSubtitle;
            if (_cursor.isNull(_cursorIndexOfSubtitle)) {
              _tmpSubtitle = null;
            } else {
              _tmpSubtitle = _cursor.getString(_cursorIndexOfSubtitle);
            }
            _item.setSubtitle(_tmpSubtitle);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            _item.setName(_tmpName);
            final String _tmpSubstype;
            if (_cursor.isNull(_cursorIndexOfSubstype)) {
              _tmpSubstype = null;
            } else {
              _tmpSubstype = _cursor.getString(_cursorIndexOfSubstype);
            }
            _item.setSubstype(_tmpSubstype);
            final long _tmpContentLength;
            _tmpContentLength = _cursor.getLong(_cursorIndexOfContentLength);
            _item.setContentLength(_tmpContentLength);
            final String _tmpOverview;
            if (_cursor.isNull(_cursorIndexOfOverview)) {
              _tmpOverview = null;
            } else {
              _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            }
            _item.setOverview(_tmpOverview);
            final String _tmpGenreName;
            if (_cursor.isNull(_cursorIndexOfGenreName)) {
              _tmpGenreName = null;
            } else {
              _tmpGenreName = _cursor.getString(_cursorIndexOfGenreName);
            }
            _item.setGenreName(_tmpGenreName);
            final String _tmpLinkpreview;
            if (_cursor.isNull(_cursorIndexOfLinkpreview)) {
              _tmpLinkpreview = null;
            } else {
              _tmpLinkpreview = _cursor.getString(_cursorIndexOfLinkpreview);
            }
            _item.setLinkpreview(_tmpLinkpreview);
            final String _tmpMinicover;
            if (_cursor.isNull(_cursorIndexOfMinicover)) {
              _tmpMinicover = null;
            } else {
              _tmpMinicover = _cursor.getString(_cursorIndexOfMinicover);
            }
            _item.setMinicover(_tmpMinicover);
            final String _tmpPreviewPath;
            if (_cursor.isNull(_cursorIndexOfPreviewPath)) {
              _tmpPreviewPath = null;
            } else {
              _tmpPreviewPath = _cursor.getString(_cursorIndexOfPreviewPath);
            }
            _item.setPreviewPath(_tmpPreviewPath);
            final String _tmpTrailerUrl;
            if (_cursor.isNull(_cursorIndexOfTrailerUrl)) {
              _tmpTrailerUrl = null;
            } else {
              _tmpTrailerUrl = _cursor.getString(_cursorIndexOfTrailerUrl);
            }
            _item.setTrailerUrl(_tmpTrailerUrl);
            final float _tmpVoteAverage;
            _tmpVoteAverage = _cursor.getFloat(_cursorIndexOfVoteAverage);
            _item.setVoteAverage(_tmpVoteAverage);
            final String _tmpVoteCount;
            if (_cursor.isNull(_cursorIndexOfVoteCount)) {
              _tmpVoteCount = null;
            } else {
              _tmpVoteCount = _cursor.getString(_cursorIndexOfVoteCount);
            }
            _item.setVoteCount(_tmpVoteCount);
            final int _tmpLive;
            _tmpLive = _cursor.getInt(_cursorIndexOfLive);
            _item.setLive(_tmpLive);
            final int _tmpPremuim;
            _tmpPremuim = _cursor.getInt(_cursorIndexOfPremuim);
            _item.setPremuim(_tmpPremuim);
            final int _tmpNewEpisodes;
            _tmpNewEpisodes = _cursor.getInt(_cursorIndexOfNewEpisodes);
            _item.setNewEpisodes(_tmpNewEpisodes);
            final int _tmpUserHistoryId;
            _tmpUserHistoryId = _cursor.getInt(_cursorIndexOfUserHistoryId);
            _item.setUserHistoryId(_tmpUserHistoryId);
            final int _tmpVip;
            _tmpVip = _cursor.getInt(_cursorIndexOfVip);
            _item.setVip(_tmpVip);
            final int _tmpHls;
            _tmpHls = _cursor.getInt(_cursorIndexOfHls);
            _item.setHls(_tmpHls);
            final int _tmpStreamhls;
            _tmpStreamhls = _cursor.getInt(_cursorIndexOfStreamhls);
            _item.setStreamhls(_tmpStreamhls);
            final int _tmpEmbed;
            _tmpEmbed = _cursor.getInt(_cursorIndexOfEmbed);
            _item.setEmbed(_tmpEmbed);
            final int _tmpYoutubelink;
            _tmpYoutubelink = _cursor.getInt(_cursorIndexOfYoutubelink);
            _item.setYoutubelink(_tmpYoutubelink);
            final int _tmpResumeWindow;
            _tmpResumeWindow = _cursor.getInt(_cursorIndexOfResumeWindow);
            _item.setResumeWindow(_tmpResumeWindow);
            final long _tmpResumePosition;
            _tmpResumePosition = _cursor.getLong(_cursorIndexOfResumePosition);
            _item.setResumePosition(_tmpResumePosition);
            final int _tmpIsAnime;
            _tmpIsAnime = _cursor.getInt(_cursorIndexOfIsAnime);
            _item.setIsAnime(_tmpIsAnime);
            final String _tmpPopularity;
            if (_cursor.isNull(_cursorIndexOfPopularity)) {
              _tmpPopularity = null;
            } else {
              _tmpPopularity = _cursor.getString(_cursorIndexOfPopularity);
            }
            _item.setPopularity(_tmpPopularity);
            final String _tmpViews;
            if (_cursor.isNull(_cursorIndexOfViews)) {
              _tmpViews = null;
            } else {
              _tmpViews = _cursor.getString(_cursorIndexOfViews);
            }
            _item.setViews(_tmpViews);
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            _item.setStatus(_tmpStatus);
            final List<MediaSubstitle> _tmpSubstitles;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfSubstitles)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfSubstitles);
            }
            _tmpSubstitles = MediaSubstitlesConverter.convertStringToList(_tmp);
            _item.setSubstitles(_tmpSubstitles);
            final List<Season> _tmpSeasons;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfSeasons)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfSeasons);
            }
            _tmpSeasons = SaisonConverter.convertStringToList(_tmp_1);
            _item.setSeasons(_tmpSeasons);
            final String _tmpRuntime;
            if (_cursor.isNull(_cursorIndexOfRuntime)) {
              _tmpRuntime = null;
            } else {
              _tmpRuntime = _cursor.getString(_cursorIndexOfRuntime);
            }
            _item.setRuntime(_tmpRuntime);
            final String _tmpReleaseDate;
            if (_cursor.isNull(_cursorIndexOfReleaseDate)) {
              _tmpReleaseDate = null;
            } else {
              _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
            }
            _item.setReleaseDate(_tmpReleaseDate);
            final String _tmpGenre;
            if (_cursor.isNull(_cursorIndexOfGenre)) {
              _tmpGenre = null;
            } else {
              _tmpGenre = _cursor.getString(_cursorIndexOfGenre);
            }
            _item.setGenre(_tmpGenre);
            final String _tmpFirstAirDate;
            if (_cursor.isNull(_cursorIndexOfFirstAirDate)) {
              _tmpFirstAirDate = null;
            } else {
              _tmpFirstAirDate = _cursor.getString(_cursorIndexOfFirstAirDate);
            }
            _item.setFirstAirDate(_tmpFirstAirDate);
            final String _tmpTrailerId;
            if (_cursor.isNull(_cursorIndexOfTrailerId)) {
              _tmpTrailerId = null;
            } else {
              _tmpTrailerId = _cursor.getString(_cursorIndexOfTrailerId);
            }
            _item.setTrailerId(_tmpTrailerId);
            final String _tmpCreatedAt;
            if (_cursor.isNull(_cursorIndexOfCreatedAt)) {
              _tmpCreatedAt = null;
            } else {
              _tmpCreatedAt = _cursor.getString(_cursorIndexOfCreatedAt);
            }
            _item.setCreatedAt(_tmpCreatedAt);
            final String _tmpUpdatedAt;
            if (_cursor.isNull(_cursorIndexOfUpdatedAt)) {
              _tmpUpdatedAt = null;
            } else {
              _tmpUpdatedAt = _cursor.getString(_cursorIndexOfUpdatedAt);
            }
            _item.setUpdatedAt(_tmpUpdatedAt);
            final Integer _tmpHd;
            if (_cursor.isNull(_cursorIndexOfHd)) {
              _tmpHd = null;
            } else {
              _tmpHd = _cursor.getInt(_cursorIndexOfHd);
            }
            _item.setHd(_tmpHd);
            final List<MediaStream> _tmpDownloads;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfDownloads)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfDownloads);
            }
            _tmpDownloads = MediaStreamConverter.convertStringToList(_tmp_2);
            _item.setDownloads(_tmpDownloads);
            final List<MediaStream> _tmpVideos;
            final String _tmp_3;
            if (_cursor.isNull(_cursorIndexOfVideos)) {
              _tmp_3 = null;
            } else {
              _tmp_3 = _cursor.getString(_cursorIndexOfVideos);
            }
            _tmpVideos = MediaStreamConverter.convertStringToList(_tmp_3);
            _item.setVideos(_tmpVideos);
            final List<Genre> _tmpGenres;
            final String _tmp_4;
            if (_cursor.isNull(_cursorIndexOfGenres)) {
              _tmp_4 = null;
            } else {
              _tmp_4 = _cursor.getString(_cursorIndexOfGenres);
            }
            _tmpGenres = GenreConverter.fromString(_tmp_4);
            _item.setGenres(_tmpGenres);
            final List<Cast> _tmpCast;
            final String _tmp_5;
            if (_cursor.isNull(_cursorIndexOfCast)) {
              _tmp_5 = null;
            } else {
              _tmp_5 = _cursor.getString(_cursorIndexOfCast);
            }
            _tmpCast = CastConverter.convertStringToList(_tmp_5);
            _item.setCast(_tmpCast);
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
  public boolean hasHistory(final int id) {
    final String _sql = "SELECT * FROM history WHERE id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final boolean _result;
      if(_cursor.moveToFirst()) {
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
  public LiveData<History> hasHistory2(final int id, final String type) {
    final String _sql = "SELECT * FROM history WHERE id=? AND type_history=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    _argIndex = 2;
    if (type == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, type);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"history"}, false, new Callable<History>() {
      @Override
      public History call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUserProfile = CursorUtil.getColumnIndexOrThrow(_cursor, "userprofile_history");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTmdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "tmdbId_history");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "posterpath_history");
          final int _cursorIndexOfSerieName = CursorUtil.getColumnIndexOrThrow(_cursor, "serieName_history");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title_history");
          final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdrop_path_history");
          final int _cursorIndexOfLink = CursorUtil.getColumnIndexOrThrow(_cursor, "link_history");
          final int _cursorIndexOfTv = CursorUtil.getColumnIndexOrThrow(_cursor, "tv_history");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type_history");
          final int _cursorIndexOfPositionEpisode = CursorUtil.getColumnIndexOrThrow(_cursor, "positionEpisode_history");
          final int _cursorIndexOfExternalId = CursorUtil.getColumnIndexOrThrow(_cursor, "externalId_history");
          final int _cursorIndexOfSeasonsNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "seasonsNumber_history");
          final int _cursorIndexOfSeasondbId = CursorUtil.getColumnIndexOrThrow(_cursor, "seasondbId_history");
          final int _cursorIndexOfMediaGenre = CursorUtil.getColumnIndexOrThrow(_cursor, "mediaGenre_history");
          final int _cursorIndexOfSeasonsId = CursorUtil.getColumnIndexOrThrow(_cursor, "seasonId_history");
          final int _cursorIndexOfEpisodeNmber = CursorUtil.getColumnIndexOrThrow(_cursor, "episodeNmber_history");
          final int _cursorIndexOfPosition = CursorUtil.getColumnIndexOrThrow(_cursor, "postion_history");
          final int _cursorIndexOfEpisodeName = CursorUtil.getColumnIndexOrThrow(_cursor, "episodeName_history");
          final int _cursorIndexOfCurrentSeasons = CursorUtil.getColumnIndexOrThrow(_cursor, "currentSeasons_history");
          final int _cursorIndexOfEpisodeId = CursorUtil.getColumnIndexOrThrow(_cursor, "episodeId_history");
          final int _cursorIndexOfSerieId = CursorUtil.getColumnIndexOrThrow(_cursor, "serieId_history");
          final int _cursorIndexOfEpisodeTmdb = CursorUtil.getColumnIndexOrThrow(_cursor, "episodeTmdb_history");
          final int _cursorIndexOfDeviceId = CursorUtil.getColumnIndexOrThrow(_cursor, "deviceId");
          final int _cursorIndexOfSkiprecapStartIn = CursorUtil.getColumnIndexOrThrow(_cursor, "skiprecapStartIn");
          final int _cursorIndexOfHasrecap = CursorUtil.getColumnIndexOrThrow(_cursor, "hasrecap");
          final int _cursorIndexOfImdbExternalId = CursorUtil.getColumnIndexOrThrow(_cursor, "imdbExternalId");
          final int _cursorIndexOfSubtitle = CursorUtil.getColumnIndexOrThrow(_cursor, "subtitle");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfSubstype = CursorUtil.getColumnIndexOrThrow(_cursor, "substype");
          final int _cursorIndexOfContentLength = CursorUtil.getColumnIndexOrThrow(_cursor, "contentLength");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfGenreName = CursorUtil.getColumnIndexOrThrow(_cursor, "genreName");
          final int _cursorIndexOfLinkpreview = CursorUtil.getColumnIndexOrThrow(_cursor, "linkpreview");
          final int _cursorIndexOfMinicover = CursorUtil.getColumnIndexOrThrow(_cursor, "minicover");
          final int _cursorIndexOfPreviewPath = CursorUtil.getColumnIndexOrThrow(_cursor, "previewPath");
          final int _cursorIndexOfTrailerUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "trailerUrl");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "voteAverage");
          final int _cursorIndexOfVoteCount = CursorUtil.getColumnIndexOrThrow(_cursor, "voteCount");
          final int _cursorIndexOfLive = CursorUtil.getColumnIndexOrThrow(_cursor, "live");
          final int _cursorIndexOfPremuim = CursorUtil.getColumnIndexOrThrow(_cursor, "premuim");
          final int _cursorIndexOfNewEpisodes = CursorUtil.getColumnIndexOrThrow(_cursor, "newEpisodes");
          final int _cursorIndexOfUserHistoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "userHistoryId");
          final int _cursorIndexOfVip = CursorUtil.getColumnIndexOrThrow(_cursor, "vip");
          final int _cursorIndexOfHls = CursorUtil.getColumnIndexOrThrow(_cursor, "hls");
          final int _cursorIndexOfStreamhls = CursorUtil.getColumnIndexOrThrow(_cursor, "streamhls");
          final int _cursorIndexOfEmbed = CursorUtil.getColumnIndexOrThrow(_cursor, "embed");
          final int _cursorIndexOfYoutubelink = CursorUtil.getColumnIndexOrThrow(_cursor, "youtubelink");
          final int _cursorIndexOfResumeWindow = CursorUtil.getColumnIndexOrThrow(_cursor, "resumeWindow");
          final int _cursorIndexOfResumePosition = CursorUtil.getColumnIndexOrThrow(_cursor, "resumePosition");
          final int _cursorIndexOfIsAnime = CursorUtil.getColumnIndexOrThrow(_cursor, "isAnime");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
          final int _cursorIndexOfViews = CursorUtil.getColumnIndexOrThrow(_cursor, "views");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfSubstitles = CursorUtil.getColumnIndexOrThrow(_cursor, "substitles");
          final int _cursorIndexOfSeasons = CursorUtil.getColumnIndexOrThrow(_cursor, "seasons");
          final int _cursorIndexOfRuntime = CursorUtil.getColumnIndexOrThrow(_cursor, "runtime");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseDate");
          final int _cursorIndexOfGenre = CursorUtil.getColumnIndexOrThrow(_cursor, "genre");
          final int _cursorIndexOfFirstAirDate = CursorUtil.getColumnIndexOrThrow(_cursor, "firstAirDate");
          final int _cursorIndexOfTrailerId = CursorUtil.getColumnIndexOrThrow(_cursor, "trailerId");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
          final int _cursorIndexOfHd = CursorUtil.getColumnIndexOrThrow(_cursor, "hd");
          final int _cursorIndexOfDownloads = CursorUtil.getColumnIndexOrThrow(_cursor, "downloads");
          final int _cursorIndexOfVideos = CursorUtil.getColumnIndexOrThrow(_cursor, "videos");
          final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
          final int _cursorIndexOfCast = CursorUtil.getColumnIndexOrThrow(_cursor, "cast");
          final History _result;
          if(_cursor.moveToFirst()) {
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpTmdbId;
            if (_cursor.isNull(_cursorIndexOfTmdbId)) {
              _tmpTmdbId = null;
            } else {
              _tmpTmdbId = _cursor.getString(_cursorIndexOfTmdbId);
            }
            final String _tmpPosterPath;
            if (_cursor.isNull(_cursorIndexOfPosterPath)) {
              _tmpPosterPath = null;
            } else {
              _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpBackdropPath;
            if (_cursor.isNull(_cursorIndexOfBackdropPath)) {
              _tmpBackdropPath = null;
            } else {
              _tmpBackdropPath = _cursor.getString(_cursorIndexOfBackdropPath);
            }
            final String _tmpLink;
            if (_cursor.isNull(_cursorIndexOfLink)) {
              _tmpLink = null;
            } else {
              _tmpLink = _cursor.getString(_cursorIndexOfLink);
            }
            _result = new History(_tmpId,_tmpTmdbId,_tmpPosterPath,_tmpTitle,_tmpBackdropPath,_tmpLink);
            final String _tmpUserProfile;
            if (_cursor.isNull(_cursorIndexOfUserProfile)) {
              _tmpUserProfile = null;
            } else {
              _tmpUserProfile = _cursor.getString(_cursorIndexOfUserProfile);
            }
            _result.setUserProfile(_tmpUserProfile);
            final String _tmpSerieName;
            if (_cursor.isNull(_cursorIndexOfSerieName)) {
              _tmpSerieName = null;
            } else {
              _tmpSerieName = _cursor.getString(_cursorIndexOfSerieName);
            }
            _result.setSerieName(_tmpSerieName);
            final String _tmpTv;
            if (_cursor.isNull(_cursorIndexOfTv)) {
              _tmpTv = null;
            } else {
              _tmpTv = _cursor.getString(_cursorIndexOfTv);
            }
            _result.setTv(_tmpTv);
            final String _tmpType;
            if (_cursor.isNull(_cursorIndexOfType)) {
              _tmpType = null;
            } else {
              _tmpType = _cursor.getString(_cursorIndexOfType);
            }
            _result.setType(_tmpType);
            final String _tmpPositionEpisode;
            if (_cursor.isNull(_cursorIndexOfPositionEpisode)) {
              _tmpPositionEpisode = null;
            } else {
              _tmpPositionEpisode = _cursor.getString(_cursorIndexOfPositionEpisode);
            }
            _result.setPositionEpisode(_tmpPositionEpisode);
            final String _tmpExternalId;
            if (_cursor.isNull(_cursorIndexOfExternalId)) {
              _tmpExternalId = null;
            } else {
              _tmpExternalId = _cursor.getString(_cursorIndexOfExternalId);
            }
            _result.setExternalId(_tmpExternalId);
            final String _tmpSeasonsNumber;
            if (_cursor.isNull(_cursorIndexOfSeasonsNumber)) {
              _tmpSeasonsNumber = null;
            } else {
              _tmpSeasonsNumber = _cursor.getString(_cursorIndexOfSeasonsNumber);
            }
            _result.setSeasonsNumber(_tmpSeasonsNumber);
            final int _tmpSeasondbId;
            _tmpSeasondbId = _cursor.getInt(_cursorIndexOfSeasondbId);
            _result.setSeasondbId(_tmpSeasondbId);
            final String _tmpMediaGenre;
            if (_cursor.isNull(_cursorIndexOfMediaGenre)) {
              _tmpMediaGenre = null;
            } else {
              _tmpMediaGenre = _cursor.getString(_cursorIndexOfMediaGenre);
            }
            _result.setMediaGenre(_tmpMediaGenre);
            final String _tmpSeasonsId;
            if (_cursor.isNull(_cursorIndexOfSeasonsId)) {
              _tmpSeasonsId = null;
            } else {
              _tmpSeasonsId = _cursor.getString(_cursorIndexOfSeasonsId);
            }
            _result.setSeasonsId(_tmpSeasonsId);
            final String _tmpEpisodeNmber;
            if (_cursor.isNull(_cursorIndexOfEpisodeNmber)) {
              _tmpEpisodeNmber = null;
            } else {
              _tmpEpisodeNmber = _cursor.getString(_cursorIndexOfEpisodeNmber);
            }
            _result.setEpisodeNmber(_tmpEpisodeNmber);
            final int _tmpPosition;
            _tmpPosition = _cursor.getInt(_cursorIndexOfPosition);
            _result.setPosition(_tmpPosition);
            final String _tmpEpisodeName;
            if (_cursor.isNull(_cursorIndexOfEpisodeName)) {
              _tmpEpisodeName = null;
            } else {
              _tmpEpisodeName = _cursor.getString(_cursorIndexOfEpisodeName);
            }
            _result.setEpisodeName(_tmpEpisodeName);
            final String _tmpCurrentSeasons;
            if (_cursor.isNull(_cursorIndexOfCurrentSeasons)) {
              _tmpCurrentSeasons = null;
            } else {
              _tmpCurrentSeasons = _cursor.getString(_cursorIndexOfCurrentSeasons);
            }
            _result.setCurrentSeasons(_tmpCurrentSeasons);
            final String _tmpEpisodeId;
            if (_cursor.isNull(_cursorIndexOfEpisodeId)) {
              _tmpEpisodeId = null;
            } else {
              _tmpEpisodeId = _cursor.getString(_cursorIndexOfEpisodeId);
            }
            _result.setEpisodeId(_tmpEpisodeId);
            final String _tmpSerieId;
            if (_cursor.isNull(_cursorIndexOfSerieId)) {
              _tmpSerieId = null;
            } else {
              _tmpSerieId = _cursor.getString(_cursorIndexOfSerieId);
            }
            _result.setSerieId(_tmpSerieId);
            final String _tmpEpisodeTmdb;
            if (_cursor.isNull(_cursorIndexOfEpisodeTmdb)) {
              _tmpEpisodeTmdb = null;
            } else {
              _tmpEpisodeTmdb = _cursor.getString(_cursorIndexOfEpisodeTmdb);
            }
            _result.setEpisodeTmdb(_tmpEpisodeTmdb);
            final String _tmpDeviceId;
            if (_cursor.isNull(_cursorIndexOfDeviceId)) {
              _tmpDeviceId = null;
            } else {
              _tmpDeviceId = _cursor.getString(_cursorIndexOfDeviceId);
            }
            _result.setDeviceId(_tmpDeviceId);
            final Integer _tmpSkiprecapStartIn;
            if (_cursor.isNull(_cursorIndexOfSkiprecapStartIn)) {
              _tmpSkiprecapStartIn = null;
            } else {
              _tmpSkiprecapStartIn = _cursor.getInt(_cursorIndexOfSkiprecapStartIn);
            }
            _result.setSkiprecapStartIn(_tmpSkiprecapStartIn);
            final Integer _tmpHasrecap;
            if (_cursor.isNull(_cursorIndexOfHasrecap)) {
              _tmpHasrecap = null;
            } else {
              _tmpHasrecap = _cursor.getInt(_cursorIndexOfHasrecap);
            }
            _result.setHasrecap(_tmpHasrecap);
            final String _tmpImdbExternalId;
            if (_cursor.isNull(_cursorIndexOfImdbExternalId)) {
              _tmpImdbExternalId = null;
            } else {
              _tmpImdbExternalId = _cursor.getString(_cursorIndexOfImdbExternalId);
            }
            _result.setImdbExternalId(_tmpImdbExternalId);
            final String _tmpSubtitle;
            if (_cursor.isNull(_cursorIndexOfSubtitle)) {
              _tmpSubtitle = null;
            } else {
              _tmpSubtitle = _cursor.getString(_cursorIndexOfSubtitle);
            }
            _result.setSubtitle(_tmpSubtitle);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            _result.setName(_tmpName);
            final String _tmpSubstype;
            if (_cursor.isNull(_cursorIndexOfSubstype)) {
              _tmpSubstype = null;
            } else {
              _tmpSubstype = _cursor.getString(_cursorIndexOfSubstype);
            }
            _result.setSubstype(_tmpSubstype);
            final long _tmpContentLength;
            _tmpContentLength = _cursor.getLong(_cursorIndexOfContentLength);
            _result.setContentLength(_tmpContentLength);
            final String _tmpOverview;
            if (_cursor.isNull(_cursorIndexOfOverview)) {
              _tmpOverview = null;
            } else {
              _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            }
            _result.setOverview(_tmpOverview);
            final String _tmpGenreName;
            if (_cursor.isNull(_cursorIndexOfGenreName)) {
              _tmpGenreName = null;
            } else {
              _tmpGenreName = _cursor.getString(_cursorIndexOfGenreName);
            }
            _result.setGenreName(_tmpGenreName);
            final String _tmpLinkpreview;
            if (_cursor.isNull(_cursorIndexOfLinkpreview)) {
              _tmpLinkpreview = null;
            } else {
              _tmpLinkpreview = _cursor.getString(_cursorIndexOfLinkpreview);
            }
            _result.setLinkpreview(_tmpLinkpreview);
            final String _tmpMinicover;
            if (_cursor.isNull(_cursorIndexOfMinicover)) {
              _tmpMinicover = null;
            } else {
              _tmpMinicover = _cursor.getString(_cursorIndexOfMinicover);
            }
            _result.setMinicover(_tmpMinicover);
            final String _tmpPreviewPath;
            if (_cursor.isNull(_cursorIndexOfPreviewPath)) {
              _tmpPreviewPath = null;
            } else {
              _tmpPreviewPath = _cursor.getString(_cursorIndexOfPreviewPath);
            }
            _result.setPreviewPath(_tmpPreviewPath);
            final String _tmpTrailerUrl;
            if (_cursor.isNull(_cursorIndexOfTrailerUrl)) {
              _tmpTrailerUrl = null;
            } else {
              _tmpTrailerUrl = _cursor.getString(_cursorIndexOfTrailerUrl);
            }
            _result.setTrailerUrl(_tmpTrailerUrl);
            final float _tmpVoteAverage;
            _tmpVoteAverage = _cursor.getFloat(_cursorIndexOfVoteAverage);
            _result.setVoteAverage(_tmpVoteAverage);
            final String _tmpVoteCount;
            if (_cursor.isNull(_cursorIndexOfVoteCount)) {
              _tmpVoteCount = null;
            } else {
              _tmpVoteCount = _cursor.getString(_cursorIndexOfVoteCount);
            }
            _result.setVoteCount(_tmpVoteCount);
            final int _tmpLive;
            _tmpLive = _cursor.getInt(_cursorIndexOfLive);
            _result.setLive(_tmpLive);
            final int _tmpPremuim;
            _tmpPremuim = _cursor.getInt(_cursorIndexOfPremuim);
            _result.setPremuim(_tmpPremuim);
            final int _tmpNewEpisodes;
            _tmpNewEpisodes = _cursor.getInt(_cursorIndexOfNewEpisodes);
            _result.setNewEpisodes(_tmpNewEpisodes);
            final int _tmpUserHistoryId;
            _tmpUserHistoryId = _cursor.getInt(_cursorIndexOfUserHistoryId);
            _result.setUserHistoryId(_tmpUserHistoryId);
            final int _tmpVip;
            _tmpVip = _cursor.getInt(_cursorIndexOfVip);
            _result.setVip(_tmpVip);
            final int _tmpHls;
            _tmpHls = _cursor.getInt(_cursorIndexOfHls);
            _result.setHls(_tmpHls);
            final int _tmpStreamhls;
            _tmpStreamhls = _cursor.getInt(_cursorIndexOfStreamhls);
            _result.setStreamhls(_tmpStreamhls);
            final int _tmpEmbed;
            _tmpEmbed = _cursor.getInt(_cursorIndexOfEmbed);
            _result.setEmbed(_tmpEmbed);
            final int _tmpYoutubelink;
            _tmpYoutubelink = _cursor.getInt(_cursorIndexOfYoutubelink);
            _result.setYoutubelink(_tmpYoutubelink);
            final int _tmpResumeWindow;
            _tmpResumeWindow = _cursor.getInt(_cursorIndexOfResumeWindow);
            _result.setResumeWindow(_tmpResumeWindow);
            final long _tmpResumePosition;
            _tmpResumePosition = _cursor.getLong(_cursorIndexOfResumePosition);
            _result.setResumePosition(_tmpResumePosition);
            final int _tmpIsAnime;
            _tmpIsAnime = _cursor.getInt(_cursorIndexOfIsAnime);
            _result.setIsAnime(_tmpIsAnime);
            final String _tmpPopularity;
            if (_cursor.isNull(_cursorIndexOfPopularity)) {
              _tmpPopularity = null;
            } else {
              _tmpPopularity = _cursor.getString(_cursorIndexOfPopularity);
            }
            _result.setPopularity(_tmpPopularity);
            final String _tmpViews;
            if (_cursor.isNull(_cursorIndexOfViews)) {
              _tmpViews = null;
            } else {
              _tmpViews = _cursor.getString(_cursorIndexOfViews);
            }
            _result.setViews(_tmpViews);
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            _result.setStatus(_tmpStatus);
            final List<MediaSubstitle> _tmpSubstitles;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfSubstitles)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfSubstitles);
            }
            _tmpSubstitles = MediaSubstitlesConverter.convertStringToList(_tmp);
            _result.setSubstitles(_tmpSubstitles);
            final List<Season> _tmpSeasons;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfSeasons)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfSeasons);
            }
            _tmpSeasons = SaisonConverter.convertStringToList(_tmp_1);
            _result.setSeasons(_tmpSeasons);
            final String _tmpRuntime;
            if (_cursor.isNull(_cursorIndexOfRuntime)) {
              _tmpRuntime = null;
            } else {
              _tmpRuntime = _cursor.getString(_cursorIndexOfRuntime);
            }
            _result.setRuntime(_tmpRuntime);
            final String _tmpReleaseDate;
            if (_cursor.isNull(_cursorIndexOfReleaseDate)) {
              _tmpReleaseDate = null;
            } else {
              _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
            }
            _result.setReleaseDate(_tmpReleaseDate);
            final String _tmpGenre;
            if (_cursor.isNull(_cursorIndexOfGenre)) {
              _tmpGenre = null;
            } else {
              _tmpGenre = _cursor.getString(_cursorIndexOfGenre);
            }
            _result.setGenre(_tmpGenre);
            final String _tmpFirstAirDate;
            if (_cursor.isNull(_cursorIndexOfFirstAirDate)) {
              _tmpFirstAirDate = null;
            } else {
              _tmpFirstAirDate = _cursor.getString(_cursorIndexOfFirstAirDate);
            }
            _result.setFirstAirDate(_tmpFirstAirDate);
            final String _tmpTrailerId;
            if (_cursor.isNull(_cursorIndexOfTrailerId)) {
              _tmpTrailerId = null;
            } else {
              _tmpTrailerId = _cursor.getString(_cursorIndexOfTrailerId);
            }
            _result.setTrailerId(_tmpTrailerId);
            final String _tmpCreatedAt;
            if (_cursor.isNull(_cursorIndexOfCreatedAt)) {
              _tmpCreatedAt = null;
            } else {
              _tmpCreatedAt = _cursor.getString(_cursorIndexOfCreatedAt);
            }
            _result.setCreatedAt(_tmpCreatedAt);
            final String _tmpUpdatedAt;
            if (_cursor.isNull(_cursorIndexOfUpdatedAt)) {
              _tmpUpdatedAt = null;
            } else {
              _tmpUpdatedAt = _cursor.getString(_cursorIndexOfUpdatedAt);
            }
            _result.setUpdatedAt(_tmpUpdatedAt);
            final Integer _tmpHd;
            if (_cursor.isNull(_cursorIndexOfHd)) {
              _tmpHd = null;
            } else {
              _tmpHd = _cursor.getInt(_cursorIndexOfHd);
            }
            _result.setHd(_tmpHd);
            final List<MediaStream> _tmpDownloads;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfDownloads)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfDownloads);
            }
            _tmpDownloads = MediaStreamConverter.convertStringToList(_tmp_2);
            _result.setDownloads(_tmpDownloads);
            final List<MediaStream> _tmpVideos;
            final String _tmp_3;
            if (_cursor.isNull(_cursorIndexOfVideos)) {
              _tmp_3 = null;
            } else {
              _tmp_3 = _cursor.getString(_cursorIndexOfVideos);
            }
            _tmpVideos = MediaStreamConverter.convertStringToList(_tmp_3);
            _result.setVideos(_tmpVideos);
            final List<Genre> _tmpGenres;
            final String _tmp_4;
            if (_cursor.isNull(_cursorIndexOfGenres)) {
              _tmp_4 = null;
            } else {
              _tmp_4 = _cursor.getString(_cursorIndexOfGenres);
            }
            _tmpGenres = GenreConverter.fromString(_tmp_4);
            _result.setGenres(_tmpGenres);
            final List<Cast> _tmpCast;
            final String _tmp_5;
            if (_cursor.isNull(_cursorIndexOfCast)) {
              _tmp_5 = null;
            } else {
              _tmp_5 = _cursor.getString(_cursorIndexOfCast);
            }
            _tmpCast = CastConverter.convertStringToList(_tmp_5);
            _result.setCast(_tmpCast);
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
