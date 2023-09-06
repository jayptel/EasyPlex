package com.easyplex.data.local;

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
import com.easyplex.data.local.dao.AnimesDao;
import com.easyplex.data.local.dao.AnimesDao_Impl;
import com.easyplex.data.local.dao.DownloadDao;
import com.easyplex.data.local.dao.DownloadDao_Impl;
import com.easyplex.data.local.dao.HistoryDao;
import com.easyplex.data.local.dao.HistoryDao_Impl;
import com.easyplex.data.local.dao.MoviesDao;
import com.easyplex.data.local.dao.MoviesDao_Impl;
import com.easyplex.data.local.dao.ResumeDao;
import com.easyplex.data.local.dao.ResumeDao_Impl;
import com.easyplex.data.local.dao.SeriesDao;
import com.easyplex.data.local.dao.SeriesDao_Impl;
import com.easyplex.data.local.dao.StreamListDao;
import com.easyplex.data.local.dao.StreamListDao_Impl;
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
public final class EasyPlexDatabase_Impl extends EasyPlexDatabase {
  private volatile MoviesDao _moviesDao;

  private volatile SeriesDao _seriesDao;

  private volatile AnimesDao _animesDao;

  private volatile DownloadDao _downloadDao;

  private volatile HistoryDao _historyDao;

  private volatile StreamListDao _streamListDao;

  private volatile ResumeDao _resumeDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(52) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `movies` (`deviceId` TEXT, `id` TEXT NOT NULL, `tmdbId` TEXT, `skiprecapStartIn` INTEGER, `hasrecap` INTEGER, `imdbExternalId` TEXT, `title` TEXT, `subtitle` TEXT, `type` TEXT, `name` TEXT, `substype` TEXT, `contentLength` INTEGER NOT NULL, `overview` TEXT, `posterPath` TEXT, `genreName` TEXT, `linkpreview` TEXT, `minicover` TEXT, `backdropPath` TEXT, `previewPath` TEXT, `trailerUrl` TEXT, `voteAverage` REAL NOT NULL, `voteCount` TEXT, `live` INTEGER NOT NULL, `premuim` INTEGER NOT NULL, `newEpisodes` INTEGER NOT NULL, `userHistoryId` INTEGER NOT NULL, `vip` INTEGER NOT NULL, `hls` INTEGER NOT NULL, `streamhls` INTEGER NOT NULL, `link` TEXT, `embed` INTEGER NOT NULL, `youtubelink` INTEGER NOT NULL, `resumeWindow` INTEGER NOT NULL, `resumePosition` INTEGER NOT NULL, `isAnime` INTEGER NOT NULL, `popularity` TEXT, `views` TEXT, `status` TEXT, `substitles` TEXT, `seasons` TEXT, `runtime` TEXT, `releaseDate` TEXT, `genre` TEXT, `firstAirDate` TEXT, `trailerId` TEXT, `createdAt` TEXT, `updatedAt` TEXT, `hd` INTEGER, `downloads` TEXT, `videos` TEXT, `genres` TEXT, `cast` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `series` (`id` TEXT NOT NULL, `series_tmdb_id` TEXT NOT NULL, `series_posterPath` TEXT, `series_name` TEXT, `deviceId` TEXT, `skiprecapStartIn` INTEGER, `hasrecap` INTEGER, `imdbExternalId` TEXT, `title` TEXT, `subtitle` TEXT, `type` TEXT, `substype` TEXT, `contentLength` INTEGER NOT NULL, `overview` TEXT, `genreName` TEXT, `linkpreview` TEXT, `minicover` TEXT, `backdropPath` TEXT, `previewPath` TEXT, `trailerUrl` TEXT, `voteAverage` REAL NOT NULL, `voteCount` TEXT, `live` INTEGER NOT NULL, `premuim` INTEGER NOT NULL, `newEpisodes` INTEGER NOT NULL, `userHistoryId` INTEGER NOT NULL, `vip` INTEGER NOT NULL, `hls` INTEGER NOT NULL, `streamhls` INTEGER NOT NULL, `link` TEXT, `embed` INTEGER NOT NULL, `youtubelink` INTEGER NOT NULL, `resumeWindow` INTEGER NOT NULL, `resumePosition` INTEGER NOT NULL, `isAnime` INTEGER NOT NULL, `popularity` TEXT, `views` TEXT, `status` TEXT, `substitles` TEXT, `seasons` TEXT, `runtime` TEXT, `releaseDate` TEXT, `genre` TEXT, `firstAirDate` TEXT, `trailerId` TEXT, `createdAt` TEXT, `updatedAt` TEXT, `hd` INTEGER, `downloads` TEXT, `videos` TEXT, `genres` TEXT, `cast` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `animes` (`id` TEXT NOT NULL, `anime_tmdb_id` TEXT, `series_posterPath` TEXT, `series_name` TEXT, `deviceId` TEXT, `skiprecapStartIn` INTEGER, `hasrecap` INTEGER, `imdbExternalId` TEXT, `title` TEXT, `subtitle` TEXT, `type` TEXT, `substype` TEXT, `contentLength` INTEGER NOT NULL, `overview` TEXT, `genreName` TEXT, `linkpreview` TEXT, `minicover` TEXT, `backdropPath` TEXT, `previewPath` TEXT, `trailerUrl` TEXT, `voteAverage` REAL NOT NULL, `voteCount` TEXT, `live` INTEGER NOT NULL, `premuim` INTEGER NOT NULL, `newEpisodes` INTEGER NOT NULL, `userHistoryId` INTEGER NOT NULL, `vip` INTEGER NOT NULL, `hls` INTEGER NOT NULL, `streamhls` INTEGER NOT NULL, `link` TEXT, `embed` INTEGER NOT NULL, `youtubelink` INTEGER NOT NULL, `resumeWindow` INTEGER NOT NULL, `resumePosition` INTEGER NOT NULL, `isAnime` INTEGER NOT NULL, `popularity` TEXT, `views` TEXT, `status` TEXT, `substitles` TEXT, `seasons` TEXT, `runtime` TEXT, `releaseDate` TEXT, `genre` TEXT, `firstAirDate` TEXT, `trailerId` TEXT, `createdAt` TEXT, `updatedAt` TEXT, `hd` INTEGER, `downloads` TEXT, `videos` TEXT, `genres` TEXT, `cast` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `download` (`id` TEXT NOT NULL, `tmdbId_download` TEXT, `episodeId_download` TEXT, `title_download` TEXT, `mediaGenre_download` TEXT, `backdropPath_download` TEXT, `link_download` TEXT, `type_download` TEXT, `linkUrl` TEXT, `tv_history` TEXT, `positionEpisode_history` TEXT, `externalId_history` TEXT, `seasonsNumber_history` TEXT, `seasonId_history` TEXT, `episodeNmber_history` TEXT, `postion_history` INTEGER NOT NULL, `episodeName_history` TEXT, `currentSeasons_history` TEXT, `serieName_history` TEXT, `serieId_history` TEXT, `episodeTmdb_history` TEXT, `deviceId` TEXT, `skiprecapStartIn` INTEGER, `hasrecap` INTEGER, `imdbExternalId` TEXT, `subtitle` TEXT, `name` TEXT, `substype` TEXT, `contentLength` INTEGER NOT NULL, `overview` TEXT, `posterPath` TEXT, `genreName` TEXT, `linkpreview` TEXT, `minicover` TEXT, `previewPath` TEXT, `trailerUrl` TEXT, `voteAverage` REAL NOT NULL, `voteCount` TEXT, `live` INTEGER NOT NULL, `premuim` INTEGER NOT NULL, `newEpisodes` INTEGER NOT NULL, `userHistoryId` INTEGER NOT NULL, `vip` INTEGER NOT NULL, `hls` INTEGER NOT NULL, `streamhls` INTEGER NOT NULL, `embed` INTEGER NOT NULL, `youtubelink` INTEGER NOT NULL, `resumeWindow` INTEGER NOT NULL, `resumePosition` INTEGER NOT NULL, `isAnime` INTEGER NOT NULL, `popularity` TEXT, `views` TEXT, `status` TEXT, `substitles` TEXT, `seasons` TEXT, `runtime` TEXT, `releaseDate` TEXT, `genre` TEXT, `firstAirDate` TEXT, `trailerId` TEXT, `createdAt` TEXT, `updatedAt` TEXT, `hd` INTEGER, `downloads` TEXT, `videos` TEXT, `genres` TEXT, `cast` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_download_tmdbId_download` ON `download` (`tmdbId_download`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `history` (`userprofile_history` TEXT, `id` TEXT NOT NULL, `tmdbId_history` TEXT NOT NULL, `posterpath_history` TEXT, `serieName_history` TEXT, `title_history` TEXT, `backdrop_path_history` TEXT, `link_history` TEXT, `tv_history` TEXT, `type_history` TEXT, `positionEpisode_history` TEXT, `externalId_history` TEXT, `seasonsNumber_history` TEXT, `seasondbId_history` INTEGER NOT NULL, `mediaGenre_history` TEXT, `seasonId_history` TEXT, `episodeNmber_history` TEXT, `postion_history` INTEGER NOT NULL, `episodeName_history` TEXT, `currentSeasons_history` TEXT, `episodeId_history` TEXT, `serieId_history` TEXT, `episodeTmdb_history` TEXT, `deviceId` TEXT, `skiprecapStartIn` INTEGER, `hasrecap` INTEGER, `imdbExternalId` TEXT, `subtitle` TEXT, `name` TEXT, `substype` TEXT, `contentLength` INTEGER NOT NULL, `overview` TEXT, `genreName` TEXT, `linkpreview` TEXT, `minicover` TEXT, `previewPath` TEXT, `trailerUrl` TEXT, `voteAverage` REAL NOT NULL, `voteCount` TEXT, `live` INTEGER NOT NULL, `premuim` INTEGER NOT NULL, `newEpisodes` INTEGER NOT NULL, `userHistoryId` INTEGER NOT NULL, `vip` INTEGER NOT NULL, `hls` INTEGER NOT NULL, `streamhls` INTEGER NOT NULL, `embed` INTEGER NOT NULL, `youtubelink` INTEGER NOT NULL, `resumeWindow` INTEGER NOT NULL, `resumePosition` INTEGER NOT NULL, `isAnime` INTEGER NOT NULL, `popularity` TEXT, `views` TEXT, `status` TEXT, `substitles` TEXT, `seasons` TEXT, `runtime` TEXT, `releaseDate` TEXT, `genre` TEXT, `firstAirDate` TEXT, `trailerId` TEXT, `createdAt` TEXT, `updatedAt` TEXT, `hd` INTEGER, `downloads` TEXT, `videos` TEXT, `genres` TEXT, `cast` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `stream` (`id` TEXT NOT NULL, `stream_tmdb` TEXT NOT NULL, `posterpath_stream` TEXT, `title_stream` TEXT, `backdrop_path_stream` TEXT, `link_stream` TEXT, `deviceId` TEXT, `skiprecapStartIn` INTEGER, `hasrecap` INTEGER, `imdbExternalId` TEXT, `subtitle` TEXT, `type` TEXT, `name` TEXT, `substype` TEXT, `contentLength` INTEGER NOT NULL, `overview` TEXT, `genreName` TEXT, `linkpreview` TEXT, `minicover` TEXT, `previewPath` TEXT, `trailerUrl` TEXT, `voteAverage` REAL NOT NULL, `voteCount` TEXT, `live` INTEGER NOT NULL, `premuim` INTEGER NOT NULL, `newEpisodes` INTEGER NOT NULL, `userHistoryId` INTEGER NOT NULL, `vip` INTEGER NOT NULL, `hls` INTEGER NOT NULL, `streamhls` INTEGER NOT NULL, `embed` INTEGER NOT NULL, `youtubelink` INTEGER NOT NULL, `resumeWindow` INTEGER NOT NULL, `resumePosition` INTEGER NOT NULL, `isAnime` INTEGER NOT NULL, `popularity` TEXT, `views` TEXT, `status` TEXT, `substitles` TEXT, `seasons` TEXT, `runtime` TEXT, `releaseDate` TEXT, `genre` TEXT, `firstAirDate` TEXT, `trailerId` TEXT, `createdAt` TEXT, `updatedAt` TEXT, `hd` INTEGER, `downloads` TEXT, `videos` TEXT, `genres` TEXT, `cast` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `resume` (`userResumeId` INTEGER NOT NULL, `tmdb` TEXT NOT NULL, `deviceId` TEXT, `resumeWindow` INTEGER, `resumePosition` INTEGER, `movieDuration` INTEGER, `type` TEXT, PRIMARY KEY(`tmdb`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'e524425a3967d5c9a0676147a961aee4')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `movies`");
        _db.execSQL("DROP TABLE IF EXISTS `series`");
        _db.execSQL("DROP TABLE IF EXISTS `animes`");
        _db.execSQL("DROP TABLE IF EXISTS `download`");
        _db.execSQL("DROP TABLE IF EXISTS `history`");
        _db.execSQL("DROP TABLE IF EXISTS `stream`");
        _db.execSQL("DROP TABLE IF EXISTS `resume`");
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
        final HashMap<String, TableInfo.Column> _columnsMovies = new HashMap<String, TableInfo.Column>(52);
        _columnsMovies.put("deviceId", new TableInfo.Column("deviceId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("tmdbId", new TableInfo.Column("tmdbId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("skiprecapStartIn", new TableInfo.Column("skiprecapStartIn", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("hasrecap", new TableInfo.Column("hasrecap", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("imdbExternalId", new TableInfo.Column("imdbExternalId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("subtitle", new TableInfo.Column("subtitle", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("type", new TableInfo.Column("type", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("substype", new TableInfo.Column("substype", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("contentLength", new TableInfo.Column("contentLength", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("overview", new TableInfo.Column("overview", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("posterPath", new TableInfo.Column("posterPath", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("genreName", new TableInfo.Column("genreName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("linkpreview", new TableInfo.Column("linkpreview", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("minicover", new TableInfo.Column("minicover", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("backdropPath", new TableInfo.Column("backdropPath", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("previewPath", new TableInfo.Column("previewPath", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("trailerUrl", new TableInfo.Column("trailerUrl", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("voteAverage", new TableInfo.Column("voteAverage", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("voteCount", new TableInfo.Column("voteCount", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("live", new TableInfo.Column("live", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("premuim", new TableInfo.Column("premuim", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("newEpisodes", new TableInfo.Column("newEpisodes", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("userHistoryId", new TableInfo.Column("userHistoryId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("vip", new TableInfo.Column("vip", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("hls", new TableInfo.Column("hls", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("streamhls", new TableInfo.Column("streamhls", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("link", new TableInfo.Column("link", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("embed", new TableInfo.Column("embed", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("youtubelink", new TableInfo.Column("youtubelink", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("resumeWindow", new TableInfo.Column("resumeWindow", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("resumePosition", new TableInfo.Column("resumePosition", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("isAnime", new TableInfo.Column("isAnime", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("popularity", new TableInfo.Column("popularity", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("views", new TableInfo.Column("views", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("status", new TableInfo.Column("status", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("substitles", new TableInfo.Column("substitles", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("seasons", new TableInfo.Column("seasons", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("runtime", new TableInfo.Column("runtime", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("releaseDate", new TableInfo.Column("releaseDate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("genre", new TableInfo.Column("genre", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("firstAirDate", new TableInfo.Column("firstAirDate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("trailerId", new TableInfo.Column("trailerId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("createdAt", new TableInfo.Column("createdAt", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("updatedAt", new TableInfo.Column("updatedAt", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("hd", new TableInfo.Column("hd", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("downloads", new TableInfo.Column("downloads", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("videos", new TableInfo.Column("videos", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("genres", new TableInfo.Column("genres", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovies.put("cast", new TableInfo.Column("cast", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMovies = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMovies = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMovies = new TableInfo("movies", _columnsMovies, _foreignKeysMovies, _indicesMovies);
        final TableInfo _existingMovies = TableInfo.read(_db, "movies");
        if (! _infoMovies.equals(_existingMovies)) {
          return new RoomOpenHelper.ValidationResult(false, "movies(com.easyplex.data.local.entity.Media).\n"
                  + " Expected:\n" + _infoMovies + "\n"
                  + " Found:\n" + _existingMovies);
        }
        final HashMap<String, TableInfo.Column> _columnsSeries = new HashMap<String, TableInfo.Column>(52);
        _columnsSeries.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("series_tmdb_id", new TableInfo.Column("series_tmdb_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("series_posterPath", new TableInfo.Column("series_posterPath", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("series_name", new TableInfo.Column("series_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("deviceId", new TableInfo.Column("deviceId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("skiprecapStartIn", new TableInfo.Column("skiprecapStartIn", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("hasrecap", new TableInfo.Column("hasrecap", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("imdbExternalId", new TableInfo.Column("imdbExternalId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("subtitle", new TableInfo.Column("subtitle", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("type", new TableInfo.Column("type", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("substype", new TableInfo.Column("substype", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("contentLength", new TableInfo.Column("contentLength", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("overview", new TableInfo.Column("overview", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("genreName", new TableInfo.Column("genreName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("linkpreview", new TableInfo.Column("linkpreview", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("minicover", new TableInfo.Column("minicover", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("backdropPath", new TableInfo.Column("backdropPath", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("previewPath", new TableInfo.Column("previewPath", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("trailerUrl", new TableInfo.Column("trailerUrl", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("voteAverage", new TableInfo.Column("voteAverage", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("voteCount", new TableInfo.Column("voteCount", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("live", new TableInfo.Column("live", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("premuim", new TableInfo.Column("premuim", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("newEpisodes", new TableInfo.Column("newEpisodes", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("userHistoryId", new TableInfo.Column("userHistoryId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("vip", new TableInfo.Column("vip", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("hls", new TableInfo.Column("hls", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("streamhls", new TableInfo.Column("streamhls", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("link", new TableInfo.Column("link", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("embed", new TableInfo.Column("embed", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("youtubelink", new TableInfo.Column("youtubelink", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("resumeWindow", new TableInfo.Column("resumeWindow", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("resumePosition", new TableInfo.Column("resumePosition", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("isAnime", new TableInfo.Column("isAnime", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("popularity", new TableInfo.Column("popularity", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("views", new TableInfo.Column("views", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("status", new TableInfo.Column("status", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("substitles", new TableInfo.Column("substitles", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("seasons", new TableInfo.Column("seasons", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("runtime", new TableInfo.Column("runtime", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("releaseDate", new TableInfo.Column("releaseDate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("genre", new TableInfo.Column("genre", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("firstAirDate", new TableInfo.Column("firstAirDate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("trailerId", new TableInfo.Column("trailerId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("createdAt", new TableInfo.Column("createdAt", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("updatedAt", new TableInfo.Column("updatedAt", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("hd", new TableInfo.Column("hd", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("downloads", new TableInfo.Column("downloads", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("videos", new TableInfo.Column("videos", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("genres", new TableInfo.Column("genres", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSeries.put("cast", new TableInfo.Column("cast", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSeries = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSeries = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSeries = new TableInfo("series", _columnsSeries, _foreignKeysSeries, _indicesSeries);
        final TableInfo _existingSeries = TableInfo.read(_db, "series");
        if (! _infoSeries.equals(_existingSeries)) {
          return new RoomOpenHelper.ValidationResult(false, "series(com.easyplex.data.local.entity.Series).\n"
                  + " Expected:\n" + _infoSeries + "\n"
                  + " Found:\n" + _existingSeries);
        }
        final HashMap<String, TableInfo.Column> _columnsAnimes = new HashMap<String, TableInfo.Column>(52);
        _columnsAnimes.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("anime_tmdb_id", new TableInfo.Column("anime_tmdb_id", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("series_posterPath", new TableInfo.Column("series_posterPath", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("series_name", new TableInfo.Column("series_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("deviceId", new TableInfo.Column("deviceId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("skiprecapStartIn", new TableInfo.Column("skiprecapStartIn", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("hasrecap", new TableInfo.Column("hasrecap", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("imdbExternalId", new TableInfo.Column("imdbExternalId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("subtitle", new TableInfo.Column("subtitle", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("type", new TableInfo.Column("type", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("substype", new TableInfo.Column("substype", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("contentLength", new TableInfo.Column("contentLength", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("overview", new TableInfo.Column("overview", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("genreName", new TableInfo.Column("genreName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("linkpreview", new TableInfo.Column("linkpreview", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("minicover", new TableInfo.Column("minicover", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("backdropPath", new TableInfo.Column("backdropPath", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("previewPath", new TableInfo.Column("previewPath", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("trailerUrl", new TableInfo.Column("trailerUrl", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("voteAverage", new TableInfo.Column("voteAverage", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("voteCount", new TableInfo.Column("voteCount", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("live", new TableInfo.Column("live", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("premuim", new TableInfo.Column("premuim", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("newEpisodes", new TableInfo.Column("newEpisodes", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("userHistoryId", new TableInfo.Column("userHistoryId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("vip", new TableInfo.Column("vip", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("hls", new TableInfo.Column("hls", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("streamhls", new TableInfo.Column("streamhls", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("link", new TableInfo.Column("link", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("embed", new TableInfo.Column("embed", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("youtubelink", new TableInfo.Column("youtubelink", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("resumeWindow", new TableInfo.Column("resumeWindow", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("resumePosition", new TableInfo.Column("resumePosition", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("isAnime", new TableInfo.Column("isAnime", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("popularity", new TableInfo.Column("popularity", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("views", new TableInfo.Column("views", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("status", new TableInfo.Column("status", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("substitles", new TableInfo.Column("substitles", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("seasons", new TableInfo.Column("seasons", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("runtime", new TableInfo.Column("runtime", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("releaseDate", new TableInfo.Column("releaseDate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("genre", new TableInfo.Column("genre", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("firstAirDate", new TableInfo.Column("firstAirDate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("trailerId", new TableInfo.Column("trailerId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("createdAt", new TableInfo.Column("createdAt", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("updatedAt", new TableInfo.Column("updatedAt", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("hd", new TableInfo.Column("hd", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("downloads", new TableInfo.Column("downloads", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("videos", new TableInfo.Column("videos", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("genres", new TableInfo.Column("genres", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimes.put("cast", new TableInfo.Column("cast", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAnimes = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesAnimes = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoAnimes = new TableInfo("animes", _columnsAnimes, _foreignKeysAnimes, _indicesAnimes);
        final TableInfo _existingAnimes = TableInfo.read(_db, "animes");
        if (! _infoAnimes.equals(_existingAnimes)) {
          return new RoomOpenHelper.ValidationResult(false, "animes(com.easyplex.data.local.entity.Animes).\n"
                  + " Expected:\n" + _infoAnimes + "\n"
                  + " Found:\n" + _existingAnimes);
        }
        final HashMap<String, TableInfo.Column> _columnsDownload = new HashMap<String, TableInfo.Column>(67);
        _columnsDownload.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("tmdbId_download", new TableInfo.Column("tmdbId_download", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("episodeId_download", new TableInfo.Column("episodeId_download", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("title_download", new TableInfo.Column("title_download", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("mediaGenre_download", new TableInfo.Column("mediaGenre_download", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("backdropPath_download", new TableInfo.Column("backdropPath_download", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("link_download", new TableInfo.Column("link_download", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("type_download", new TableInfo.Column("type_download", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("linkUrl", new TableInfo.Column("linkUrl", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("tv_history", new TableInfo.Column("tv_history", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("positionEpisode_history", new TableInfo.Column("positionEpisode_history", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("externalId_history", new TableInfo.Column("externalId_history", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("seasonsNumber_history", new TableInfo.Column("seasonsNumber_history", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("seasonId_history", new TableInfo.Column("seasonId_history", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("episodeNmber_history", new TableInfo.Column("episodeNmber_history", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("postion_history", new TableInfo.Column("postion_history", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("episodeName_history", new TableInfo.Column("episodeName_history", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("currentSeasons_history", new TableInfo.Column("currentSeasons_history", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("serieName_history", new TableInfo.Column("serieName_history", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("serieId_history", new TableInfo.Column("serieId_history", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("episodeTmdb_history", new TableInfo.Column("episodeTmdb_history", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("deviceId", new TableInfo.Column("deviceId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("skiprecapStartIn", new TableInfo.Column("skiprecapStartIn", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("hasrecap", new TableInfo.Column("hasrecap", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("imdbExternalId", new TableInfo.Column("imdbExternalId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("subtitle", new TableInfo.Column("subtitle", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("substype", new TableInfo.Column("substype", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("contentLength", new TableInfo.Column("contentLength", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("overview", new TableInfo.Column("overview", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("posterPath", new TableInfo.Column("posterPath", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("genreName", new TableInfo.Column("genreName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("linkpreview", new TableInfo.Column("linkpreview", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("minicover", new TableInfo.Column("minicover", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("previewPath", new TableInfo.Column("previewPath", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("trailerUrl", new TableInfo.Column("trailerUrl", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("voteAverage", new TableInfo.Column("voteAverage", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("voteCount", new TableInfo.Column("voteCount", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("live", new TableInfo.Column("live", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("premuim", new TableInfo.Column("premuim", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("newEpisodes", new TableInfo.Column("newEpisodes", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("userHistoryId", new TableInfo.Column("userHistoryId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("vip", new TableInfo.Column("vip", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("hls", new TableInfo.Column("hls", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("streamhls", new TableInfo.Column("streamhls", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("embed", new TableInfo.Column("embed", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("youtubelink", new TableInfo.Column("youtubelink", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("resumeWindow", new TableInfo.Column("resumeWindow", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("resumePosition", new TableInfo.Column("resumePosition", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("isAnime", new TableInfo.Column("isAnime", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("popularity", new TableInfo.Column("popularity", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("views", new TableInfo.Column("views", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("status", new TableInfo.Column("status", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("substitles", new TableInfo.Column("substitles", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("seasons", new TableInfo.Column("seasons", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("runtime", new TableInfo.Column("runtime", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("releaseDate", new TableInfo.Column("releaseDate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("genre", new TableInfo.Column("genre", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("firstAirDate", new TableInfo.Column("firstAirDate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("trailerId", new TableInfo.Column("trailerId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("createdAt", new TableInfo.Column("createdAt", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("updatedAt", new TableInfo.Column("updatedAt", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("hd", new TableInfo.Column("hd", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("downloads", new TableInfo.Column("downloads", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("videos", new TableInfo.Column("videos", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("genres", new TableInfo.Column("genres", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("cast", new TableInfo.Column("cast", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDownload = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDownload = new HashSet<TableInfo.Index>(1);
        _indicesDownload.add(new TableInfo.Index("index_download_tmdbId_download", false, Arrays.asList("tmdbId_download"), Arrays.asList("ASC")));
        final TableInfo _infoDownload = new TableInfo("download", _columnsDownload, _foreignKeysDownload, _indicesDownload);
        final TableInfo _existingDownload = TableInfo.read(_db, "download");
        if (! _infoDownload.equals(_existingDownload)) {
          return new RoomOpenHelper.ValidationResult(false, "download(com.easyplex.data.local.entity.Download).\n"
                  + " Expected:\n" + _infoDownload + "\n"
                  + " Found:\n" + _existingDownload);
        }
        final HashMap<String, TableInfo.Column> _columnsHistory = new HashMap<String, TableInfo.Column>(68);
        _columnsHistory.put("userprofile_history", new TableInfo.Column("userprofile_history", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("tmdbId_history", new TableInfo.Column("tmdbId_history", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("posterpath_history", new TableInfo.Column("posterpath_history", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("serieName_history", new TableInfo.Column("serieName_history", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("title_history", new TableInfo.Column("title_history", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("backdrop_path_history", new TableInfo.Column("backdrop_path_history", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("link_history", new TableInfo.Column("link_history", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("tv_history", new TableInfo.Column("tv_history", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("type_history", new TableInfo.Column("type_history", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("positionEpisode_history", new TableInfo.Column("positionEpisode_history", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("externalId_history", new TableInfo.Column("externalId_history", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("seasonsNumber_history", new TableInfo.Column("seasonsNumber_history", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("seasondbId_history", new TableInfo.Column("seasondbId_history", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("mediaGenre_history", new TableInfo.Column("mediaGenre_history", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("seasonId_history", new TableInfo.Column("seasonId_history", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("episodeNmber_history", new TableInfo.Column("episodeNmber_history", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("postion_history", new TableInfo.Column("postion_history", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("episodeName_history", new TableInfo.Column("episodeName_history", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("currentSeasons_history", new TableInfo.Column("currentSeasons_history", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("episodeId_history", new TableInfo.Column("episodeId_history", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("serieId_history", new TableInfo.Column("serieId_history", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("episodeTmdb_history", new TableInfo.Column("episodeTmdb_history", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("deviceId", new TableInfo.Column("deviceId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("skiprecapStartIn", new TableInfo.Column("skiprecapStartIn", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("hasrecap", new TableInfo.Column("hasrecap", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("imdbExternalId", new TableInfo.Column("imdbExternalId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("subtitle", new TableInfo.Column("subtitle", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("substype", new TableInfo.Column("substype", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("contentLength", new TableInfo.Column("contentLength", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("overview", new TableInfo.Column("overview", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("genreName", new TableInfo.Column("genreName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("linkpreview", new TableInfo.Column("linkpreview", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("minicover", new TableInfo.Column("minicover", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("previewPath", new TableInfo.Column("previewPath", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("trailerUrl", new TableInfo.Column("trailerUrl", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("voteAverage", new TableInfo.Column("voteAverage", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("voteCount", new TableInfo.Column("voteCount", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("live", new TableInfo.Column("live", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("premuim", new TableInfo.Column("premuim", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("newEpisodes", new TableInfo.Column("newEpisodes", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("userHistoryId", new TableInfo.Column("userHistoryId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("vip", new TableInfo.Column("vip", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("hls", new TableInfo.Column("hls", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("streamhls", new TableInfo.Column("streamhls", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("embed", new TableInfo.Column("embed", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("youtubelink", new TableInfo.Column("youtubelink", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("resumeWindow", new TableInfo.Column("resumeWindow", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("resumePosition", new TableInfo.Column("resumePosition", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("isAnime", new TableInfo.Column("isAnime", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("popularity", new TableInfo.Column("popularity", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("views", new TableInfo.Column("views", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("status", new TableInfo.Column("status", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("substitles", new TableInfo.Column("substitles", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("seasons", new TableInfo.Column("seasons", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("runtime", new TableInfo.Column("runtime", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("releaseDate", new TableInfo.Column("releaseDate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("genre", new TableInfo.Column("genre", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("firstAirDate", new TableInfo.Column("firstAirDate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("trailerId", new TableInfo.Column("trailerId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("createdAt", new TableInfo.Column("createdAt", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("updatedAt", new TableInfo.Column("updatedAt", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("hd", new TableInfo.Column("hd", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("downloads", new TableInfo.Column("downloads", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("videos", new TableInfo.Column("videos", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("genres", new TableInfo.Column("genres", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("cast", new TableInfo.Column("cast", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysHistory = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesHistory = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoHistory = new TableInfo("history", _columnsHistory, _foreignKeysHistory, _indicesHistory);
        final TableInfo _existingHistory = TableInfo.read(_db, "history");
        if (! _infoHistory.equals(_existingHistory)) {
          return new RoomOpenHelper.ValidationResult(false, "history(com.easyplex.data.local.entity.History).\n"
                  + " Expected:\n" + _infoHistory + "\n"
                  + " Found:\n" + _existingHistory);
        }
        final HashMap<String, TableInfo.Column> _columnsStream = new HashMap<String, TableInfo.Column>(52);
        _columnsStream.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("stream_tmdb", new TableInfo.Column("stream_tmdb", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("posterpath_stream", new TableInfo.Column("posterpath_stream", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("title_stream", new TableInfo.Column("title_stream", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("backdrop_path_stream", new TableInfo.Column("backdrop_path_stream", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("link_stream", new TableInfo.Column("link_stream", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("deviceId", new TableInfo.Column("deviceId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("skiprecapStartIn", new TableInfo.Column("skiprecapStartIn", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("hasrecap", new TableInfo.Column("hasrecap", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("imdbExternalId", new TableInfo.Column("imdbExternalId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("subtitle", new TableInfo.Column("subtitle", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("type", new TableInfo.Column("type", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("substype", new TableInfo.Column("substype", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("contentLength", new TableInfo.Column("contentLength", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("overview", new TableInfo.Column("overview", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("genreName", new TableInfo.Column("genreName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("linkpreview", new TableInfo.Column("linkpreview", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("minicover", new TableInfo.Column("minicover", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("previewPath", new TableInfo.Column("previewPath", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("trailerUrl", new TableInfo.Column("trailerUrl", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("voteAverage", new TableInfo.Column("voteAverage", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("voteCount", new TableInfo.Column("voteCount", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("live", new TableInfo.Column("live", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("premuim", new TableInfo.Column("premuim", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("newEpisodes", new TableInfo.Column("newEpisodes", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("userHistoryId", new TableInfo.Column("userHistoryId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("vip", new TableInfo.Column("vip", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("hls", new TableInfo.Column("hls", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("streamhls", new TableInfo.Column("streamhls", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("embed", new TableInfo.Column("embed", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("youtubelink", new TableInfo.Column("youtubelink", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("resumeWindow", new TableInfo.Column("resumeWindow", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("resumePosition", new TableInfo.Column("resumePosition", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("isAnime", new TableInfo.Column("isAnime", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("popularity", new TableInfo.Column("popularity", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("views", new TableInfo.Column("views", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("status", new TableInfo.Column("status", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("substitles", new TableInfo.Column("substitles", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("seasons", new TableInfo.Column("seasons", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("runtime", new TableInfo.Column("runtime", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("releaseDate", new TableInfo.Column("releaseDate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("genre", new TableInfo.Column("genre", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("firstAirDate", new TableInfo.Column("firstAirDate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("trailerId", new TableInfo.Column("trailerId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("createdAt", new TableInfo.Column("createdAt", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("updatedAt", new TableInfo.Column("updatedAt", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("hd", new TableInfo.Column("hd", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("downloads", new TableInfo.Column("downloads", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("videos", new TableInfo.Column("videos", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("genres", new TableInfo.Column("genres", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("cast", new TableInfo.Column("cast", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysStream = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesStream = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoStream = new TableInfo("stream", _columnsStream, _foreignKeysStream, _indicesStream);
        final TableInfo _existingStream = TableInfo.read(_db, "stream");
        if (! _infoStream.equals(_existingStream)) {
          return new RoomOpenHelper.ValidationResult(false, "stream(com.easyplex.data.local.entity.Stream).\n"
                  + " Expected:\n" + _infoStream + "\n"
                  + " Found:\n" + _existingStream);
        }
        final HashMap<String, TableInfo.Column> _columnsResume = new HashMap<String, TableInfo.Column>(7);
        _columnsResume.put("userResumeId", new TableInfo.Column("userResumeId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResume.put("tmdb", new TableInfo.Column("tmdb", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResume.put("deviceId", new TableInfo.Column("deviceId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResume.put("resumeWindow", new TableInfo.Column("resumeWindow", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResume.put("resumePosition", new TableInfo.Column("resumePosition", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResume.put("movieDuration", new TableInfo.Column("movieDuration", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResume.put("type", new TableInfo.Column("type", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysResume = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesResume = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoResume = new TableInfo("resume", _columnsResume, _foreignKeysResume, _indicesResume);
        final TableInfo _existingResume = TableInfo.read(_db, "resume");
        if (! _infoResume.equals(_existingResume)) {
          return new RoomOpenHelper.ValidationResult(false, "resume(com.easyplex.data.model.media.Resume).\n"
                  + " Expected:\n" + _infoResume + "\n"
                  + " Found:\n" + _existingResume);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "e524425a3967d5c9a0676147a961aee4", "7b463a4b47831fcdd44a0b8999ceb69d");
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
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "movies","series","animes","download","history","stream","resume");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `movies`");
      _db.execSQL("DELETE FROM `series`");
      _db.execSQL("DELETE FROM `animes`");
      _db.execSQL("DELETE FROM `download`");
      _db.execSQL("DELETE FROM `history`");
      _db.execSQL("DELETE FROM `stream`");
      _db.execSQL("DELETE FROM `resume`");
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
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(MoviesDao.class, MoviesDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(SeriesDao.class, SeriesDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(AnimesDao.class, AnimesDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(DownloadDao.class, DownloadDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(HistoryDao.class, HistoryDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(StreamListDao.class, StreamListDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(ResumeDao.class, ResumeDao_Impl.getRequiredConverters());
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
  public MoviesDao favoriteDao() {
    if (_moviesDao != null) {
      return _moviesDao;
    } else {
      synchronized(this) {
        if(_moviesDao == null) {
          _moviesDao = new MoviesDao_Impl(this);
        }
        return _moviesDao;
      }
    }
  }

  @Override
  public SeriesDao seriesDao() {
    if (_seriesDao != null) {
      return _seriesDao;
    } else {
      synchronized(this) {
        if(_seriesDao == null) {
          _seriesDao = new SeriesDao_Impl(this);
        }
        return _seriesDao;
      }
    }
  }

  @Override
  public AnimesDao animesDao() {
    if (_animesDao != null) {
      return _animesDao;
    } else {
      synchronized(this) {
        if(_animesDao == null) {
          _animesDao = new AnimesDao_Impl(this);
        }
        return _animesDao;
      }
    }
  }

  @Override
  public DownloadDao progressDao() {
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
  public HistoryDao historyDao() {
    if (_historyDao != null) {
      return _historyDao;
    } else {
      synchronized(this) {
        if(_historyDao == null) {
          _historyDao = new HistoryDao_Impl(this);
        }
        return _historyDao;
      }
    }
  }

  @Override
  public StreamListDao streamListDao() {
    if (_streamListDao != null) {
      return _streamListDao;
    } else {
      synchronized(this) {
        if(_streamListDao == null) {
          _streamListDao = new StreamListDao_Impl(this);
        }
        return _streamListDao;
      }
    }
  }

  @Override
  public ResumeDao resumeDao() {
    if (_resumeDao != null) {
      return _resumeDao;
    } else {
      synchronized(this) {
        if(_resumeDao == null) {
          _resumeDao = new ResumeDao_Impl(this);
        }
        return _resumeDao;
      }
    }
  }
}
