package com.easyplex.data.local.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.easyplex.data.local.converters.CastConverter;
import com.easyplex.data.local.converters.GenreConverter;
import com.easyplex.data.local.converters.MediaStreamConverter;
import com.easyplex.data.local.converters.MediaSubstitlesConverter;
import com.easyplex.data.local.converters.SaisonConverter;
import com.easyplex.data.local.entity.Animes;
import com.easyplex.data.local.entity.Series;
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
public final class SeriesDao_Impl implements SeriesDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Series> __insertionAdapterOfSeries;

  private final EntityDeletionOrUpdateAdapter<Series> __deletionAdapterOfSeries;

  private final EntityDeletionOrUpdateAdapter<Animes> __deletionAdapterOfAnimes;

  public SeriesDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSeries = new EntityInsertionAdapter<Series>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `series` (`id`,`series_tmdb_id`,`series_posterPath`,`series_name`,`deviceId`,`skiprecapStartIn`,`hasrecap`,`imdbExternalId`,`title`,`subtitle`,`type`,`substype`,`contentLength`,`overview`,`genreName`,`linkpreview`,`minicover`,`backdropPath`,`previewPath`,`trailerUrl`,`voteAverage`,`voteCount`,`live`,`premuim`,`newEpisodes`,`userHistoryId`,`vip`,`hls`,`streamhls`,`link`,`embed`,`youtubelink`,`resumeWindow`,`resumePosition`,`isAnime`,`popularity`,`views`,`status`,`substitles`,`seasons`,`runtime`,`releaseDate`,`genre`,`firstAirDate`,`trailerId`,`createdAt`,`updatedAt`,`hd`,`downloads`,`videos`,`genres`,`cast`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Series value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getTmdbId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTmdbId());
        }
        if (value.getPosterPath() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPosterPath());
        }
        if (value.getName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getName());
        }
        if (value.getDeviceId() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDeviceId());
        }
        if (value.getSkiprecapStartIn() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getSkiprecapStartIn());
        }
        if (value.getHasrecap() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, value.getHasrecap());
        }
        if (value.getImdbExternalId() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getImdbExternalId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getTitle());
        }
        if (value.getSubtitle() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getSubtitle());
        }
        if (value.getType() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getType());
        }
        if (value.getSubstype() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getSubstype());
        }
        stmt.bindLong(13, value.getContentLength());
        if (value.getOverview() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getOverview());
        }
        if (value.getGenreName() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getGenreName());
        }
        if (value.getLinkpreview() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getLinkpreview());
        }
        if (value.getMinicover() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getMinicover());
        }
        if (value.getBackdropPath() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.getBackdropPath());
        }
        if (value.getPreviewPath() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.getPreviewPath());
        }
        if (value.getTrailerUrl() == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, value.getTrailerUrl());
        }
        stmt.bindDouble(21, value.getVoteAverage());
        if (value.getVoteCount() == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindString(22, value.getVoteCount());
        }
        stmt.bindLong(23, value.getLive());
        stmt.bindLong(24, value.getPremuim());
        stmt.bindLong(25, value.getNewEpisodes());
        stmt.bindLong(26, value.getUserHistoryId());
        stmt.bindLong(27, value.getVip());
        stmt.bindLong(28, value.getHls());
        stmt.bindLong(29, value.getStreamhls());
        if (value.getLink() == null) {
          stmt.bindNull(30);
        } else {
          stmt.bindString(30, value.getLink());
        }
        stmt.bindLong(31, value.getEmbed());
        stmt.bindLong(32, value.getYoutubelink());
        stmt.bindLong(33, value.getResumeWindow());
        stmt.bindLong(34, value.getResumePosition());
        stmt.bindLong(35, value.getIsAnime());
        if (value.getPopularity() == null) {
          stmt.bindNull(36);
        } else {
          stmt.bindString(36, value.getPopularity());
        }
        if (value.getViews() == null) {
          stmt.bindNull(37);
        } else {
          stmt.bindString(37, value.getViews());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(38);
        } else {
          stmt.bindString(38, value.getStatus());
        }
        final String _tmp = MediaSubstitlesConverter.convertListToString(value.getSubstitles());
        if (_tmp == null) {
          stmt.bindNull(39);
        } else {
          stmt.bindString(39, _tmp);
        }
        final String _tmp_1 = SaisonConverter.convertListToString(value.getSeasons());
        if (_tmp_1 == null) {
          stmt.bindNull(40);
        } else {
          stmt.bindString(40, _tmp_1);
        }
        if (value.getRuntime() == null) {
          stmt.bindNull(41);
        } else {
          stmt.bindString(41, value.getRuntime());
        }
        if (value.getReleaseDate() == null) {
          stmt.bindNull(42);
        } else {
          stmt.bindString(42, value.getReleaseDate());
        }
        if (value.getGenre() == null) {
          stmt.bindNull(43);
        } else {
          stmt.bindString(43, value.getGenre());
        }
        if (value.getFirstAirDate() == null) {
          stmt.bindNull(44);
        } else {
          stmt.bindString(44, value.getFirstAirDate());
        }
        if (value.getTrailerId() == null) {
          stmt.bindNull(45);
        } else {
          stmt.bindString(45, value.getTrailerId());
        }
        if (value.getCreatedAt() == null) {
          stmt.bindNull(46);
        } else {
          stmt.bindString(46, value.getCreatedAt());
        }
        if (value.getUpdatedAt() == null) {
          stmt.bindNull(47);
        } else {
          stmt.bindString(47, value.getUpdatedAt());
        }
        if (value.getHd() == null) {
          stmt.bindNull(48);
        } else {
          stmt.bindLong(48, value.getHd());
        }
        final String _tmp_2 = MediaStreamConverter.convertListToString(value.getDownloads());
        if (_tmp_2 == null) {
          stmt.bindNull(49);
        } else {
          stmt.bindString(49, _tmp_2);
        }
        final String _tmp_3 = MediaStreamConverter.convertListToString(value.getVideos());
        if (_tmp_3 == null) {
          stmt.bindNull(50);
        } else {
          stmt.bindString(50, _tmp_3);
        }
        final String _tmp_4 = GenreConverter.fromArrayList(value.getGenres());
        if (_tmp_4 == null) {
          stmt.bindNull(51);
        } else {
          stmt.bindString(51, _tmp_4);
        }
        final String _tmp_5 = CastConverter.convertListToString(value.getCast());
        if (_tmp_5 == null) {
          stmt.bindNull(52);
        } else {
          stmt.bindString(52, _tmp_5);
        }
      }
    };
    this.__deletionAdapterOfSeries = new EntityDeletionOrUpdateAdapter<Series>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `series` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Series value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
      }
    };
    this.__deletionAdapterOfAnimes = new EntityDeletionOrUpdateAdapter<Animes>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `animes` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Animes value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
      }
    };
  }

  @Override
  public void saveMediaToFavorite(final Series series) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfSeries.insert(series);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteMediaFromFavorite(final Series series) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfSeries.handle(series);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteMediaFromFavorite(final Animes animes) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfAnimes.handle(animes);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Flowable<List<Series>> getFavoriteMovies() {
    final String _sql = "SELECT * FROM series";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, false, new String[]{"series"}, new Callable<List<Series>>() {
      @Override
      public List<Series> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTmdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "series_tmdb_id");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "series_posterPath");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "series_name");
          final int _cursorIndexOfDeviceId = CursorUtil.getColumnIndexOrThrow(_cursor, "deviceId");
          final int _cursorIndexOfSkiprecapStartIn = CursorUtil.getColumnIndexOrThrow(_cursor, "skiprecapStartIn");
          final int _cursorIndexOfHasrecap = CursorUtil.getColumnIndexOrThrow(_cursor, "hasrecap");
          final int _cursorIndexOfImdbExternalId = CursorUtil.getColumnIndexOrThrow(_cursor, "imdbExternalId");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfSubtitle = CursorUtil.getColumnIndexOrThrow(_cursor, "subtitle");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfSubstype = CursorUtil.getColumnIndexOrThrow(_cursor, "substype");
          final int _cursorIndexOfContentLength = CursorUtil.getColumnIndexOrThrow(_cursor, "contentLength");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfGenreName = CursorUtil.getColumnIndexOrThrow(_cursor, "genreName");
          final int _cursorIndexOfLinkpreview = CursorUtil.getColumnIndexOrThrow(_cursor, "linkpreview");
          final int _cursorIndexOfMinicover = CursorUtil.getColumnIndexOrThrow(_cursor, "minicover");
          final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdropPath");
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
          final int _cursorIndexOfLink = CursorUtil.getColumnIndexOrThrow(_cursor, "link");
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
          final List<Series> _result = new ArrayList<Series>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Series _item;
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
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            _item = new Series(_tmpId,_tmpTmdbId,_tmpPosterPath,_tmpName);
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
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            _item.setTitle(_tmpTitle);
            final String _tmpSubtitle;
            if (_cursor.isNull(_cursorIndexOfSubtitle)) {
              _tmpSubtitle = null;
            } else {
              _tmpSubtitle = _cursor.getString(_cursorIndexOfSubtitle);
            }
            _item.setSubtitle(_tmpSubtitle);
            final String _tmpType;
            if (_cursor.isNull(_cursorIndexOfType)) {
              _tmpType = null;
            } else {
              _tmpType = _cursor.getString(_cursorIndexOfType);
            }
            _item.setType(_tmpType);
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
            final String _tmpBackdropPath;
            if (_cursor.isNull(_cursorIndexOfBackdropPath)) {
              _tmpBackdropPath = null;
            } else {
              _tmpBackdropPath = _cursor.getString(_cursorIndexOfBackdropPath);
            }
            _item.setBackdropPath(_tmpBackdropPath);
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
            final String _tmpLink;
            if (_cursor.isNull(_cursorIndexOfLink)) {
              _tmpLink = null;
            } else {
              _tmpLink = _cursor.getString(_cursorIndexOfLink);
            }
            _item.setLink(_tmpLink);
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
  public LiveData<Series> isFavoriteMovie(final int id) {
    final String _sql = "SELECT * FROM series WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return __db.getInvalidationTracker().createLiveData(new String[]{"series"}, false, new Callable<Series>() {
      @Override
      public Series call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTmdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "series_tmdb_id");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "series_posterPath");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "series_name");
          final int _cursorIndexOfDeviceId = CursorUtil.getColumnIndexOrThrow(_cursor, "deviceId");
          final int _cursorIndexOfSkiprecapStartIn = CursorUtil.getColumnIndexOrThrow(_cursor, "skiprecapStartIn");
          final int _cursorIndexOfHasrecap = CursorUtil.getColumnIndexOrThrow(_cursor, "hasrecap");
          final int _cursorIndexOfImdbExternalId = CursorUtil.getColumnIndexOrThrow(_cursor, "imdbExternalId");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfSubtitle = CursorUtil.getColumnIndexOrThrow(_cursor, "subtitle");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfSubstype = CursorUtil.getColumnIndexOrThrow(_cursor, "substype");
          final int _cursorIndexOfContentLength = CursorUtil.getColumnIndexOrThrow(_cursor, "contentLength");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfGenreName = CursorUtil.getColumnIndexOrThrow(_cursor, "genreName");
          final int _cursorIndexOfLinkpreview = CursorUtil.getColumnIndexOrThrow(_cursor, "linkpreview");
          final int _cursorIndexOfMinicover = CursorUtil.getColumnIndexOrThrow(_cursor, "minicover");
          final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdropPath");
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
          final int _cursorIndexOfLink = CursorUtil.getColumnIndexOrThrow(_cursor, "link");
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
          final Series _result;
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
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            _result = new Series(_tmpId,_tmpTmdbId,_tmpPosterPath,_tmpName);
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
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            _result.setTitle(_tmpTitle);
            final String _tmpSubtitle;
            if (_cursor.isNull(_cursorIndexOfSubtitle)) {
              _tmpSubtitle = null;
            } else {
              _tmpSubtitle = _cursor.getString(_cursorIndexOfSubtitle);
            }
            _result.setSubtitle(_tmpSubtitle);
            final String _tmpType;
            if (_cursor.isNull(_cursorIndexOfType)) {
              _tmpType = null;
            } else {
              _tmpType = _cursor.getString(_cursorIndexOfType);
            }
            _result.setType(_tmpType);
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
            final String _tmpBackdropPath;
            if (_cursor.isNull(_cursorIndexOfBackdropPath)) {
              _tmpBackdropPath = null;
            } else {
              _tmpBackdropPath = _cursor.getString(_cursorIndexOfBackdropPath);
            }
            _result.setBackdropPath(_tmpBackdropPath);
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
            final String _tmpLink;
            if (_cursor.isNull(_cursorIndexOfLink)) {
              _tmpLink = null;
            } else {
              _tmpLink = _cursor.getString(_cursorIndexOfLink);
            }
            _result.setLink(_tmpLink);
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

  @Override
  public boolean hasHistory(final int id) {
    final String _sql = "SELECT * FROM series WHERE id=?";
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
  public boolean isSerieFavorite(final int id) {
    final String _sql = "SELECT EXISTS(SELECT * FROM series WHERE id = ?)";
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

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
