package com.easyplex.ui.seriedetails;

import android.content.pm.ApplicationInfo;
import com.easyplex.data.repository.MediaRepository;
import com.easyplex.ui.manager.AuthManager;
import com.easyplex.ui.manager.SettingsManager;
import com.easyplex.ui.manager.TokenManager;
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
public final class EpisodeDetailsActivity_MembersInjector implements MembersInjector<EpisodeDetailsActivity> {
  private final Provider<Boolean> checkVpnProvider;

  private final Provider<ApplicationInfo> provideRootCheckProvider;

  private final Provider<ApplicationInfo> provideSnifferCheckProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  private final Provider<AuthManager> authManagerProvider;

  private final Provider<TokenManager> tokenManagerProvider;

  private final Provider<MediaRepository> mediaRepositoryProvider;

  public EpisodeDetailsActivity_MembersInjector(Provider<Boolean> checkVpnProvider,
      Provider<ApplicationInfo> provideRootCheckProvider,
      Provider<ApplicationInfo> provideSnifferCheckProvider,
      Provider<SettingsManager> settingsManagerProvider, Provider<AuthManager> authManagerProvider,
      Provider<TokenManager> tokenManagerProvider,
      Provider<MediaRepository> mediaRepositoryProvider) {
    this.checkVpnProvider = checkVpnProvider;
    this.provideRootCheckProvider = provideRootCheckProvider;
    this.provideSnifferCheckProvider = provideSnifferCheckProvider;
    this.settingsManagerProvider = settingsManagerProvider;
    this.authManagerProvider = authManagerProvider;
    this.tokenManagerProvider = tokenManagerProvider;
    this.mediaRepositoryProvider = mediaRepositoryProvider;
  }

  public static MembersInjector<EpisodeDetailsActivity> create(Provider<Boolean> checkVpnProvider,
      Provider<ApplicationInfo> provideRootCheckProvider,
      Provider<ApplicationInfo> provideSnifferCheckProvider,
      Provider<SettingsManager> settingsManagerProvider, Provider<AuthManager> authManagerProvider,
      Provider<TokenManager> tokenManagerProvider,
      Provider<MediaRepository> mediaRepositoryProvider) {
    return new EpisodeDetailsActivity_MembersInjector(checkVpnProvider, provideRootCheckProvider, provideSnifferCheckProvider, settingsManagerProvider, authManagerProvider, tokenManagerProvider, mediaRepositoryProvider);
  }

  @Override
  public void injectMembers(EpisodeDetailsActivity instance) {
    injectCheckVpn(instance, checkVpnProvider.get());
    injectProvideRootCheck(instance, provideRootCheckProvider.get());
    injectProvideSnifferCheck(instance, provideSnifferCheckProvider.get());
    injectSettingsManager(instance, settingsManagerProvider.get());
    injectAuthManager(instance, authManagerProvider.get());
    injectTokenManager(instance, tokenManagerProvider.get());
    injectMediaRepository(instance, mediaRepositoryProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.ui.seriedetails.EpisodeDetailsActivity.checkVpn")
  @Named("vpn")
  public static void injectCheckVpn(EpisodeDetailsActivity instance, boolean checkVpn) {
    instance.checkVpn = checkVpn;
  }

  @InjectedFieldSignature("com.easyplex.ui.seriedetails.EpisodeDetailsActivity.provideRootCheck")
  @Named("root")
  public static void injectProvideRootCheck(EpisodeDetailsActivity instance,
      ApplicationInfo provideRootCheck) {
    instance.provideRootCheck = provideRootCheck;
  }

  @InjectedFieldSignature("com.easyplex.ui.seriedetails.EpisodeDetailsActivity.provideSnifferCheck")
  @Named("sniffer")
  public static void injectProvideSnifferCheck(EpisodeDetailsActivity instance,
      ApplicationInfo provideSnifferCheck) {
    instance.provideSnifferCheck = provideSnifferCheck;
  }

  @InjectedFieldSignature("com.easyplex.ui.seriedetails.EpisodeDetailsActivity.settingsManager")
  public static void injectSettingsManager(EpisodeDetailsActivity instance,
      SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.seriedetails.EpisodeDetailsActivity.authManager")
  public static void injectAuthManager(EpisodeDetailsActivity instance, AuthManager authManager) {
    instance.authManager = authManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.seriedetails.EpisodeDetailsActivity.tokenManager")
  public static void injectTokenManager(EpisodeDetailsActivity instance,
      TokenManager tokenManager) {
    instance.tokenManager = tokenManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.seriedetails.EpisodeDetailsActivity.mediaRepository")
  public static void injectMediaRepository(EpisodeDetailsActivity instance,
      MediaRepository mediaRepository) {
    instance.mediaRepository = mediaRepository;
  }
}
