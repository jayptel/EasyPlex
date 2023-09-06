package com.easyplex.ui.player.activities;

import android.content.SharedPreferences;
import androidx.lifecycle.ViewModelProvider;
import com.easyplex.data.model.ads.AdRetriever;
import com.easyplex.data.model.ads.CuePointsRetriever;
import com.easyplex.data.repository.AnimeRepository;
import com.easyplex.data.repository.MediaRepository;
import com.easyplex.ui.manager.AdsManager;
import com.easyplex.ui.manager.AuthManager;
import com.easyplex.ui.manager.SettingsManager;
import com.easyplex.ui.manager.StatusManager;
import com.easyplex.ui.manager.TokenManager;
import com.easyplex.ui.player.bindings.PlayerController;
import com.easyplex.ui.player.controller.PlayerAdLogicController;
import com.easyplex.ui.player.controller.PlayerUIController;
import com.easyplex.ui.player.fsm.callback.AdInterface;
import com.easyplex.ui.player.fsm.listener.AdPlayingMonitor;
import com.easyplex.ui.player.fsm.listener.CuePointMonitor;
import com.easyplex.ui.player.fsm.state_machine.FsmPlayer;
import com.easyplex.ui.player.interfaces.VpaidClient;
import com.easyplex.ui.player.utilities.PlaybackSettingMenu;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class EasyPlexMainPlayer_MembersInjector implements MembersInjector<EasyPlexMainPlayer> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<String> playerReadyProvider;

  private final Provider<Boolean> settingReadyProvider;

  private final Provider<SharedPreferences> sharedPreferencesProvider;

  private final Provider<AuthManager> authManagerProvider;

  private final Provider<AdsManager> adsManagerProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  private final Provider<String> cuepointUrlProvider;

  private final Provider<String> cuePointProvider;

  private final Provider<String> cuePointYProvider;

  private final Provider<String> cuePointNProvider;

  private final Provider<FsmPlayer> fsmPlayerProvider;

  private final Provider<PlayerUIController> playerUIControllerProvider;

  private final Provider<AdPlayingMonitor> adPlayingMonitorProvider;

  private final Provider<CuePointMonitor> cuePointMonitorProvider;

  private final Provider<AdRetriever> adRetrieverProvider;

  private final Provider<CuePointsRetriever> cuePointsRetrieverProvider;

  private final Provider<AdInterface> adInterfaceProvider;

  private final Provider<PlayerAdLogicController> playerComponentControllerProvider;

  private final Provider<VpaidClient> vpaidClientProvider;

  private final Provider<PlaybackSettingMenu> playbackSettingMenuProvider;

  private final Provider<SettingsManager> appSettingsManagerProvider;

  private final Provider<StatusManager> statusManagerProvider;

  private final Provider<TokenManager> tokenManagerProvider;

  private final Provider<SharedPreferences.Editor> sharedPreferencesEditorProvider;

  private final Provider<PlayerController> playerControllerProvider;

  private final Provider<MediaRepository> repositoryProvider;

  private final Provider<AnimeRepository> animeRepositoryProvider;

  public EasyPlexMainPlayer_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<String> playerReadyProvider, Provider<Boolean> settingReadyProvider,
      Provider<SharedPreferences> sharedPreferencesProvider,
      Provider<AuthManager> authManagerProvider, Provider<AdsManager> adsManagerProvider,
      Provider<SettingsManager> settingsManagerProvider, Provider<String> cuepointUrlProvider,
      Provider<String> cuePointProvider, Provider<String> cuePointYProvider,
      Provider<String> cuePointNProvider, Provider<FsmPlayer> fsmPlayerProvider,
      Provider<PlayerUIController> playerUIControllerProvider,
      Provider<AdPlayingMonitor> adPlayingMonitorProvider,
      Provider<CuePointMonitor> cuePointMonitorProvider, Provider<AdRetriever> adRetrieverProvider,
      Provider<CuePointsRetriever> cuePointsRetrieverProvider,
      Provider<AdInterface> adInterfaceProvider,
      Provider<PlayerAdLogicController> playerComponentControllerProvider,
      Provider<VpaidClient> vpaidClientProvider,
      Provider<PlaybackSettingMenu> playbackSettingMenuProvider,
      Provider<SettingsManager> appSettingsManagerProvider,
      Provider<StatusManager> statusManagerProvider, Provider<TokenManager> tokenManagerProvider,
      Provider<SharedPreferences.Editor> sharedPreferencesEditorProvider,
      Provider<PlayerController> playerControllerProvider,
      Provider<MediaRepository> repositoryProvider,
      Provider<AnimeRepository> animeRepositoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.playerReadyProvider = playerReadyProvider;
    this.settingReadyProvider = settingReadyProvider;
    this.sharedPreferencesProvider = sharedPreferencesProvider;
    this.authManagerProvider = authManagerProvider;
    this.adsManagerProvider = adsManagerProvider;
    this.settingsManagerProvider = settingsManagerProvider;
    this.cuepointUrlProvider = cuepointUrlProvider;
    this.cuePointProvider = cuePointProvider;
    this.cuePointYProvider = cuePointYProvider;
    this.cuePointNProvider = cuePointNProvider;
    this.fsmPlayerProvider = fsmPlayerProvider;
    this.playerUIControllerProvider = playerUIControllerProvider;
    this.adPlayingMonitorProvider = adPlayingMonitorProvider;
    this.cuePointMonitorProvider = cuePointMonitorProvider;
    this.adRetrieverProvider = adRetrieverProvider;
    this.cuePointsRetrieverProvider = cuePointsRetrieverProvider;
    this.adInterfaceProvider = adInterfaceProvider;
    this.playerComponentControllerProvider = playerComponentControllerProvider;
    this.vpaidClientProvider = vpaidClientProvider;
    this.playbackSettingMenuProvider = playbackSettingMenuProvider;
    this.appSettingsManagerProvider = appSettingsManagerProvider;
    this.statusManagerProvider = statusManagerProvider;
    this.tokenManagerProvider = tokenManagerProvider;
    this.sharedPreferencesEditorProvider = sharedPreferencesEditorProvider;
    this.playerControllerProvider = playerControllerProvider;
    this.repositoryProvider = repositoryProvider;
    this.animeRepositoryProvider = animeRepositoryProvider;
  }

  public static MembersInjector<EasyPlexMainPlayer> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<String> playerReadyProvider, Provider<Boolean> settingReadyProvider,
      Provider<SharedPreferences> sharedPreferencesProvider,
      Provider<AuthManager> authManagerProvider, Provider<AdsManager> adsManagerProvider,
      Provider<SettingsManager> settingsManagerProvider, Provider<String> cuepointUrlProvider,
      Provider<String> cuePointProvider, Provider<String> cuePointYProvider,
      Provider<String> cuePointNProvider, Provider<FsmPlayer> fsmPlayerProvider,
      Provider<PlayerUIController> playerUIControllerProvider,
      Provider<AdPlayingMonitor> adPlayingMonitorProvider,
      Provider<CuePointMonitor> cuePointMonitorProvider, Provider<AdRetriever> adRetrieverProvider,
      Provider<CuePointsRetriever> cuePointsRetrieverProvider,
      Provider<AdInterface> adInterfaceProvider,
      Provider<PlayerAdLogicController> playerComponentControllerProvider,
      Provider<VpaidClient> vpaidClientProvider,
      Provider<PlaybackSettingMenu> playbackSettingMenuProvider,
      Provider<SettingsManager> appSettingsManagerProvider,
      Provider<StatusManager> statusManagerProvider, Provider<TokenManager> tokenManagerProvider,
      Provider<SharedPreferences.Editor> sharedPreferencesEditorProvider,
      Provider<PlayerController> playerControllerProvider,
      Provider<MediaRepository> repositoryProvider,
      Provider<AnimeRepository> animeRepositoryProvider) {
    return new EasyPlexMainPlayer_MembersInjector(viewModelFactoryProvider, playerReadyProvider, settingReadyProvider, sharedPreferencesProvider, authManagerProvider, adsManagerProvider, settingsManagerProvider, cuepointUrlProvider, cuePointProvider, cuePointYProvider, cuePointNProvider, fsmPlayerProvider, playerUIControllerProvider, adPlayingMonitorProvider, cuePointMonitorProvider, adRetrieverProvider, cuePointsRetrieverProvider, adInterfaceProvider, playerComponentControllerProvider, vpaidClientProvider, playbackSettingMenuProvider, appSettingsManagerProvider, statusManagerProvider, tokenManagerProvider, sharedPreferencesEditorProvider, playerControllerProvider, repositoryProvider, animeRepositoryProvider);
  }

  @Override
  public void injectMembers(EasyPlexMainPlayer instance) {
    EasyPlexPlayerActivity_MembersInjector.injectViewModelFactory(instance, viewModelFactoryProvider.get());
    EasyPlexPlayerActivity_MembersInjector.injectPlayerReady(instance, playerReadyProvider.get());
    EasyPlexPlayerActivity_MembersInjector.injectSettingReady(instance, settingReadyProvider.get());
    EasyPlexPlayerActivity_MembersInjector.injectSharedPreferences(instance, sharedPreferencesProvider.get());
    EasyPlexPlayerActivity_MembersInjector.injectAuthManager(instance, authManagerProvider.get());
    EasyPlexPlayerActivity_MembersInjector.injectAdsManager(instance, adsManagerProvider.get());
    EasyPlexPlayerActivity_MembersInjector.injectSettingsManager(instance, settingsManagerProvider.get());
    EasyPlexPlayerActivity_MembersInjector.injectCuepointUrl(instance, cuepointUrlProvider.get());
    EasyPlexPlayerActivity_MembersInjector.injectCuePoint(instance, cuePointProvider.get());
    EasyPlexPlayerActivity_MembersInjector.injectCuePointY(instance, cuePointYProvider.get());
    EasyPlexPlayerActivity_MembersInjector.injectCuePointN(instance, cuePointNProvider.get());
    injectFsmPlayer(instance, fsmPlayerProvider.get());
    injectPlayerUIController(instance, playerUIControllerProvider.get());
    injectAdPlayingMonitor(instance, adPlayingMonitorProvider.get());
    injectCuePointMonitor(instance, cuePointMonitorProvider.get());
    injectAdRetriever(instance, adRetrieverProvider.get());
    injectCuePointsRetriever(instance, cuePointsRetrieverProvider.get());
    injectAdInterface(instance, adInterfaceProvider.get());
    injectPlayerComponentController(instance, playerComponentControllerProvider.get());
    injectVpaidClient(instance, vpaidClientProvider.get());
    injectPlaybackSettingMenu(instance, playbackSettingMenuProvider.get());
    injectAppSettingsManager(instance, appSettingsManagerProvider.get());
    injectStatusManager(instance, statusManagerProvider.get());
    injectTokenManager(instance, tokenManagerProvider.get());
    injectSharedPreferencesEditor(instance, sharedPreferencesEditorProvider.get());
    injectPlayerController(instance, playerControllerProvider.get());
    injectRepository(instance, repositoryProvider.get());
    injectAnimeRepository(instance, animeRepositoryProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.ui.player.activities.EasyPlexMainPlayer.fsmPlayer")
  public static void injectFsmPlayer(EasyPlexMainPlayer instance, FsmPlayer fsmPlayer) {
    instance.fsmPlayer = fsmPlayer;
  }

  @InjectedFieldSignature("com.easyplex.ui.player.activities.EasyPlexMainPlayer.playerUIController")
  public static void injectPlayerUIController(EasyPlexMainPlayer instance,
      PlayerUIController playerUIController) {
    instance.playerUIController = playerUIController;
  }

  @InjectedFieldSignature("com.easyplex.ui.player.activities.EasyPlexMainPlayer.adPlayingMonitor")
  public static void injectAdPlayingMonitor(EasyPlexMainPlayer instance,
      AdPlayingMonitor adPlayingMonitor) {
    instance.adPlayingMonitor = adPlayingMonitor;
  }

  @InjectedFieldSignature("com.easyplex.ui.player.activities.EasyPlexMainPlayer.cuePointMonitor")
  public static void injectCuePointMonitor(EasyPlexMainPlayer instance,
      CuePointMonitor cuePointMonitor) {
    instance.cuePointMonitor = cuePointMonitor;
  }

  @InjectedFieldSignature("com.easyplex.ui.player.activities.EasyPlexMainPlayer.adRetriever")
  public static void injectAdRetriever(EasyPlexMainPlayer instance, AdRetriever adRetriever) {
    instance.adRetriever = adRetriever;
  }

  @InjectedFieldSignature("com.easyplex.ui.player.activities.EasyPlexMainPlayer.cuePointsRetriever")
  public static void injectCuePointsRetriever(EasyPlexMainPlayer instance,
      CuePointsRetriever cuePointsRetriever) {
    instance.cuePointsRetriever = cuePointsRetriever;
  }

  @InjectedFieldSignature("com.easyplex.ui.player.activities.EasyPlexMainPlayer.adInterface")
  public static void injectAdInterface(EasyPlexMainPlayer instance, AdInterface adInterface) {
    instance.adInterface = adInterface;
  }

  @InjectedFieldSignature("com.easyplex.ui.player.activities.EasyPlexMainPlayer.playerComponentController")
  public static void injectPlayerComponentController(EasyPlexMainPlayer instance,
      PlayerAdLogicController playerComponentController) {
    instance.playerComponentController = playerComponentController;
  }

  @InjectedFieldSignature("com.easyplex.ui.player.activities.EasyPlexMainPlayer.vpaidClient")
  public static void injectVpaidClient(EasyPlexMainPlayer instance, VpaidClient vpaidClient) {
    instance.vpaidClient = vpaidClient;
  }

  @InjectedFieldSignature("com.easyplex.ui.player.activities.EasyPlexMainPlayer.playbackSettingMenu")
  public static void injectPlaybackSettingMenu(EasyPlexMainPlayer instance,
      PlaybackSettingMenu playbackSettingMenu) {
    instance.playbackSettingMenu = playbackSettingMenu;
  }

  @InjectedFieldSignature("com.easyplex.ui.player.activities.EasyPlexMainPlayer.appSettingsManager")
  public static void injectAppSettingsManager(EasyPlexMainPlayer instance,
      SettingsManager appSettingsManager) {
    instance.appSettingsManager = appSettingsManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.player.activities.EasyPlexMainPlayer.statusManager")
  public static void injectStatusManager(EasyPlexMainPlayer instance, StatusManager statusManager) {
    instance.statusManager = statusManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.player.activities.EasyPlexMainPlayer.tokenManager")
  public static void injectTokenManager(EasyPlexMainPlayer instance, TokenManager tokenManager) {
    instance.tokenManager = tokenManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.player.activities.EasyPlexMainPlayer.sharedPreferencesEditor")
  public static void injectSharedPreferencesEditor(EasyPlexMainPlayer instance,
      SharedPreferences.Editor sharedPreferencesEditor) {
    instance.sharedPreferencesEditor = sharedPreferencesEditor;
  }

  @InjectedFieldSignature("com.easyplex.ui.player.activities.EasyPlexMainPlayer.playerController")
  public static void injectPlayerController(EasyPlexMainPlayer instance,
      PlayerController playerController) {
    instance.playerController = playerController;
  }

  @InjectedFieldSignature("com.easyplex.ui.player.activities.EasyPlexMainPlayer.repository")
  public static void injectRepository(EasyPlexMainPlayer instance, MediaRepository repository) {
    instance.repository = repository;
  }

  @InjectedFieldSignature("com.easyplex.ui.player.activities.EasyPlexMainPlayer.animeRepository")
  public static void injectAnimeRepository(EasyPlexMainPlayer instance,
      AnimeRepository animeRepository) {
    instance.animeRepository = animeRepository;
  }
}
