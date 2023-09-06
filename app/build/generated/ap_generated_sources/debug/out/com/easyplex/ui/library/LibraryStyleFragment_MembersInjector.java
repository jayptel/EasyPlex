package com.easyplex.ui.library;

import androidx.lifecycle.ViewModelProvider;
import com.easyplex.data.repository.MediaRepository;
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
public final class LibraryStyleFragment_MembersInjector implements MembersInjector<LibraryStyleFragment> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<MediaRepository> mediaRepositoryProvider;

  public LibraryStyleFragment_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<MediaRepository> mediaRepositoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.mediaRepositoryProvider = mediaRepositoryProvider;
  }

  public static MembersInjector<LibraryStyleFragment> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<MediaRepository> mediaRepositoryProvider) {
    return new LibraryStyleFragment_MembersInjector(viewModelFactoryProvider, mediaRepositoryProvider);
  }

  @Override
  public void injectMembers(LibraryStyleFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectMediaRepository(instance, mediaRepositoryProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.ui.library.LibraryStyleFragment.viewModelFactory")
  public static void injectViewModelFactory(LibraryStyleFragment instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  @InjectedFieldSignature("com.easyplex.ui.library.LibraryStyleFragment.mediaRepository")
  public static void injectMediaRepository(LibraryStyleFragment instance,
      MediaRepository mediaRepository) {
    instance.mediaRepository = mediaRepository;
  }
}
