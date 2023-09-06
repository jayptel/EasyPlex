package com.easyplex.ui.home;

import android.content.SharedPreferences;
import androidx.lifecycle.ViewModelProvider;
import com.easyplex.data.repository.AnimeRepository;
import com.easyplex.data.repository.AuthRepository;
import com.easyplex.data.repository.MediaRepository;
import com.easyplex.data.repository.SettingsRepository;
import com.easyplex.ui.home.adapters.MainAdapter;
import com.easyplex.ui.manager.AdsManager;
import com.easyplex.ui.manager.AuthManager;
import com.easyplex.ui.manager.SettingsManager;
import com.easyplex.ui.manager.StatusManager;
import com.easyplex.ui.manager.TokenManager;
import com.easyplex.ui.users.MenuHandler;
import com.easyplex.util.AppController;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Named;
import javax.inject.Provider;

@QualifierMetadata("javax.inject.Named")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HomeFragment_MembersInjector implements MembersInjector<HomeFragment> {
  private final Provider<MainAdapter> mMainAdapterProvider;

  private final Provider<AppController> appControllerProvider;

  private final Provider<Boolean> shadowEnableProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<SharedPreferences> preferencesProvider;

  private final Provider<MediaRepository> mediaRepositoryProvider;

  private final Provider<AnimeRepository> animeRepositoryProvider;

  private final Provider<MenuHandler> menuHandlerProvider;

  private final Provider<SettingsRepository> settingsRepositoryProvider;

  private final Provider<AuthRepository> authRepositoryProvider;

  private final Provider<SharedPreferences.Editor> sharedPreferencesEditorProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  private final Provider<TokenManager> tokenManagerProvider;

  private final Provider<AdsManager> adsManagerProvider;

  private final Provider<String> cuePointProvider;

  private final Provider<String> cuepointUrlProvider;

  private final Provider<AuthManager> authManagerProvider;

  private final Provider<StatusManager> statusManagerProvider;

  private final Provider<String> cuePointYProvider;

  private final Provider<String> cuePointNProvider;

  private final Provider<String> cuePointWProvider;

  private final Provider<String> cuePointZProvider;

  private final Provider<String> adplayingYProvider;

  private final Provider<String> adplayingNProvider;

  private final Provider<String> adplayingWProvider;

  private final Provider<String> adplayingZProvider;

  public HomeFragment_MembersInjector(Provider<MainAdapter> mMainAdapterProvider,
      Provider<AppController> appControllerProvider, Provider<Boolean> shadowEnableProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<SharedPreferences> preferencesProvider,
      Provider<MediaRepository> mediaRepositoryProvider,
      Provider<AnimeRepository> animeRepositoryProvider, Provider<MenuHandler> menuHandlerProvider,
      Provider<SettingsRepository> settingsRepositoryProvider,
      Provider<AuthRepository> authRepositoryProvider,
      Provider<SharedPreferences.Editor> sharedPreferencesEditorProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<TokenManager> tokenManagerProvider, Provider<AdsManager> adsManagerProvider,
      Provider<String> cuePointProvider, Provider<String> cuepointUrlProvider,
      Provider<AuthManager> authManagerProvider, Provider<StatusManager> statusManagerProvider,
      Provider<String> cuePointYProvider, Provider<String> cuePointNProvider,
      Provider<String> cuePointWProvider, Provider<String> cuePointZProvider,
      Provider<String> adplayingYProvider, Provider<String> adplayingNProvider,
      Provider<String> adplayingWProvider, Provider<String> adplayingZProvider) {
    this.mMainAdapterProvider = mMainAdapterProvider;
    this.appControllerProvider = appControllerProvider;
    this.shadowEnableProvider = shadowEnableProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.preferencesProvider = preferencesProvider;
    this.mediaRepositoryProvider = mediaRepositoryProvider;
    this.animeRepositoryProvider = animeRepositoryProvider;
    this.menuHandlerProvider = menuHandlerProvider;
    this.settingsRepositoryProvider = settingsRepositoryProvider;
    this.authRepositoryProvider = authRepositoryProvider;
    this.sharedPreferencesEditorProvider = sharedPreferencesEditorProvider;
    this.settingsManagerProvider = settingsManagerProvider;
    this.tokenManagerProvider = tokenManagerProvider;
    this.adsManagerProvider = adsManagerProvider;
    this.cuePointProvider = cuePointProvider;
    this.cuepointUrlProvider = cuepointUrlProvider;
    this.authManagerProvider = authManagerProvider;
    this.statusManagerProvider = statusManagerProvider;
    this.cuePointYProvider = cuePointYProvider;
    this.cuePointNProvider = cuePointNProvider;
    this.cuePointWProvider = cuePointWProvider;
    this.cuePointZProvider = cuePointZProvider;
    this.adplayingYProvider = adplayingYProvider;
    this.adplayingNProvider = adplayingNProvider;
    this.adplayingWProvider = adplayingWProvider;
    this.adplayingZProvider = adplayingZProvider;
  }

  public static MembersInjector<HomeFragment> create(Provider<MainAdapter> mMainAdapterProvider,
      Provider<AppController> appControllerProvider, Provider<Boolean> shadowEnableProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<SharedPreferences> preferencesProvider,
      Provider<MediaRepository> mediaRepositoryProvider,
      Provider<AnimeRepository> animeRepositoryProvider, Provider<MenuHandler> menuHandlerProvider,
      Provider<SettingsRepository> settingsRepositoryProvider,
      Provider<AuthRepository> authRepositoryProvider,
      Provider<SharedPreferences.Editor> sharedPreferencesEditorProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<TokenManager> tokenManagerProvider, Provider<AdsManager> adsManagerProvider,
      Provider<String> cuePointProvider, Provider<String> cuepointUrlProvider,
      Provider<AuthManager> authManagerProvider, Provider<StatusManager> statusManagerProvider,
      Provider<String> cuePointYProvider, Provider<String> cuePointNProvider,
      Provider<String> cuePointWProvider, Provider<String> cuePointZProvider,
      Provider<String> adplayingYProvider, Provider<String> adplayingNProvider,
      Provider<String> adplayingWProvider, Provider<String> adplayingZProvider) {
    return new HomeFragment_MembersInjector(mMainAdapterProvider, appControllerProvider, shadowEnableProvider, viewModelFactoryProvider, preferencesProvider, mediaRepositoryProvider, animeRepositoryProvider, menuHandlerProvider, settingsRepositoryProvider, authRepositoryProvider, sharedPreferencesEditorProvider, settingsManagerProvider, tokenManagerProvider, adsManagerProvider, cuePointProvider, cuepointUrlProvider, authManagerProvider, statusManagerProvider, cuePointYProvider, cuePointNProvider, cuePointWProvider, cuePointZProvider, adplayingYProvider, adplayingNProvider, adplayingWProvider, adplayingZProvider);
  }

  @Override
  public void injectMembers(HomeFragment instance) {
    injectMMainAdapter(instance, mMainAdapterProvider.get());
    injectAppController(instance, appControllerProvider.get());
    injectShadowEnable(instance, shadowEnableProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectPreferences(instance, preferencesProvider.get());
    injectMediaRepository(instance, mediaRepositoryProvider.get());
    injectAnimeRepository(instance, animeRepositoryProvider.get());
    injectMenuHandler(instance, menuHandlerProvider.get());
    injectSettingsRepository(instance, settingsRepositoryProvider.get());
    injectAuthRepository(instance, authRepositoryProvider.get());
    injectSharedPreferencesEditor(instance, sharedPreferencesEditorProvider.get());
    injectSettingsManager(instance, settingsManagerProvider.get());
    injectTokenManager(instance, tokenManagerProvider.get());
    injectAdsManager(instance, adsManagerProvider.get());
    injectCuePoint(instance, cuePointProvider.get());
    injectCuepointUrl(instance, cuepointUrlProvider.get());
    injectAuthManager(instance, authManagerProvider.get());
    injectStatusManager(instance, statusManagerProvider.get());
    injectCuePointY(instance, cuePointYProvider.get());
    injectCuePointN(instance, cuePointNProvider.get());
    injectCuePointW(instance, cuePointWProvider.get());
    injectCuePointZ(instance, cuePointZProvider.get());
    injectAdplayingY(instance, adplayingYProvider.get());
    injectAdplayingN(instance, adplayingNProvider.get());
    injectAdplayingW(instance, adplayingWProvider.get());
    injectAdplayingZ(instance, adplayingZProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.ui.home.HomeFragment.mMainAdapter")
  public static void injectMMainAdapter(HomeFragment instance, MainAdapter mMainAdapter) {
    instance.mMainAdapter = mMainAdapter;
  }

  @InjectedFieldSignature("com.easyplex.ui.home.HomeFragment.appController")
  public static void injectAppController(HomeFragment instance, AppController appController) {
    instance.appController = appController;
  }

  @InjectedFieldSignature("com.easyplex.ui.home.HomeFragment.shadowEnable")
  @Named("shadowEnable")
  public static void injectShadowEnable(HomeFragment instance, boolean shadowEnable) {
    instance.shadowEnable = shadowEnable;
  }

  @InjectedFieldSignature("com.easyplex.ui.home.HomeFragment.viewModelFactory")
  public static void injectViewModelFactory(HomeFragment instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  @InjectedFieldSignature("com.easyplex.ui.home.HomeFragment.preferences")
  public static void injectPreferences(HomeFragment instance, SharedPreferences preferences) {
    instance.preferences = preferences;
  }

  @InjectedFieldSignature("com.easyplex.ui.home.HomeFragment.mediaRepository")
  public static void injectMediaRepository(HomeFragment instance, MediaRepository mediaRepository) {
    instance.mediaRepository = mediaRepository;
  }

  @InjectedFieldSignature("com.easyplex.ui.home.HomeFragment.animeRepository")
  public static void injectAnimeRepository(HomeFragment instance, AnimeRepository animeRepository) {
    instance.animeRepository = animeRepository;
  }

  @InjectedFieldSignature("com.easyplex.ui.home.HomeFragment.menuHandler")
  public static void injectMenuHandler(HomeFragment instance, MenuHandler menuHandler) {
    instance.menuHandler = menuHandler;
  }

  @InjectedFieldSignature("com.easyplex.ui.home.HomeFragment.settingsRepository")
  public static void injectSettingsRepository(HomeFragment instance,
      SettingsRepository settingsRepository) {
    instance.settingsRepository = settingsRepository;
  }

  @InjectedFieldSignature("com.easyplex.ui.home.HomeFragment.authRepository")
  public static void injectAuthRepository(HomeFragment instance, AuthRepository authRepository) {
    instance.authRepository = authRepository;
  }

  @InjectedFieldSignature("com.easyplex.ui.home.HomeFragment.sharedPreferencesEditor")
  public static void injectSharedPreferencesEditor(HomeFragment instance,
      SharedPreferences.Editor sharedPreferencesEditor) {
    instance.sharedPreferencesEditor = sharedPreferencesEditor;
  }

  @InjectedFieldSignature("com.easyplex.ui.home.HomeFragment.settingsManager")
  public static void injectSettingsManager(HomeFragment instance, SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.home.HomeFragment.tokenManager")
  public static void injectTokenManager(HomeFragment instance, TokenManager tokenManager) {
    instance.tokenManager = tokenManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.home.HomeFragment.adsManager")
  public static void injectAdsManager(HomeFragment instance, AdsManager adsManager) {
    instance.adsManager = adsManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.home.HomeFragment.cuePoint")
  @Named("cuepoint")
  public static void injectCuePoint(HomeFragment instance, String cuePoint) {
    instance.cuePoint = cuePoint;
  }

  @InjectedFieldSignature("com.easyplex.ui.home.HomeFragment.cuepointUrl")
  @Named("cuepointUrl")
  public static void injectCuepointUrl(HomeFragment instance, String cuepointUrl) {
    instance.cuepointUrl = cuepointUrl;
  }

  @InjectedFieldSignature("com.easyplex.ui.home.HomeFragment.authManager")
  public static void injectAuthManager(HomeFragment instance, AuthManager authManager) {
    instance.authManager = authManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.home.HomeFragment.statusManager")
  public static void injectStatusManager(HomeFragment instance, StatusManager statusManager) {
    instance.statusManager = statusManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.home.HomeFragment.cuePointY")
  @Named("cuepointY")
  public static void injectCuePointY(HomeFragment instance, String cuePointY) {
    instance.cuePointY = cuePointY;
  }

  @InjectedFieldSignature("com.easyplex.ui.home.HomeFragment.cuePointN")
  @Named("cuepointN")
  public static void injectCuePointN(HomeFragment instance, String cuePointN) {
    instance.cuePointN = cuePointN;
  }

  @InjectedFieldSignature("com.easyplex.ui.home.HomeFragment.cuePointW")
  @Named("cuepointW")
  public static void injectCuePointW(HomeFragment instance, String cuePointW) {
    instance.cuePointW = cuePointW;
  }

  @InjectedFieldSignature("com.easyplex.ui.home.HomeFragment.cuePointZ")
  @Named("cuepointZ")
  public static void injectCuePointZ(HomeFragment instance, String cuePointZ) {
    instance.cuePointZ = cuePointZ;
  }

  @InjectedFieldSignature("com.easyplex.ui.home.HomeFragment.adplayingY")
  @Named("adplayingY")
  public static void injectAdplayingY(HomeFragment instance, String adplayingY) {
    instance.adplayingY = adplayingY;
  }

  @InjectedFieldSignature("com.easyplex.ui.home.HomeFragment.adplayingN")
  @Named("adplayingN")
  public static void injectAdplayingN(HomeFragment instance, String adplayingN) {
    instance.adplayingN = adplayingN;
  }

  @InjectedFieldSignature("com.easyplex.ui.home.HomeFragment.adplayingW")
  @Named("adplayingW")
  public static void injectAdplayingW(HomeFragment instance, String adplayingW) {
    instance.adplayingW = adplayingW;
  }

  @InjectedFieldSignature("com.easyplex.ui.home.HomeFragment.adplayingZ")
  @Named("adplayingZ")
  public static void injectAdplayingZ(HomeFragment instance, String adplayingZ) {
    instance.adplayingZ = adplayingZ;
  }
}
