package com.easyplex.databinding;
import com.easyplex.R;
import com.easyplex.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class UiControllerViewBindingImpl extends UiControllerViewBinding implements com.easyplex.generated.callback.OnClickListener.Listener, com.easyplex.generated.callback.OnTouchListener.Listener, com.easyplex.generated.callback.OnCheckedChangeListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.controller_panel, 68);
        sViewsWithIds.put(R.id.view_controller_chromecast_ib, 69);
        sViewsWithIds.put(R.id.view_movie_views, 70);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_top, 71);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_left, 72);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_right, 73);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_bottom, 74);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_seek_left, 75);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_seek_right, 76);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    @NonNull
    private final android.widget.ImageButton mboundView23;
    @NonNull
    private final android.widget.TextView mboundView24;
    @NonNull
    private final android.widget.ImageButton mboundView26;
    @NonNull
    private final android.widget.TextView mboundView27;
    @NonNull
    private final android.widget.ImageButton mboundView29;
    @NonNull
    private final android.widget.TextView mboundView30;
    @NonNull
    private final android.widget.ImageButton mboundView32;
    @NonNull
    private final android.widget.TextView mboundView33;
    @NonNull
    private final android.widget.ImageButton mboundView41;
    @NonNull
    private final android.widget.TextView mboundView42;
    @NonNull
    private final android.widget.ImageButton mboundView44;
    @NonNull
    private final android.widget.TextView mboundView45;
    @NonNull
    private final android.widget.ImageButton mboundView47;
    @NonNull
    private final android.widget.TextView mboundView48;
    @NonNull
    private final android.widget.ImageButton mboundView50;
    @NonNull
    private final android.widget.TextView mboundView51;
    @NonNull
    private final android.widget.ImageButton mboundView53;
    @NonNull
    private final android.widget.TextView mboundView54;
    @NonNull
    private final android.widget.TextView mboundView57;
    @NonNull
    private final android.widget.TextView mboundView58;
    @NonNull
    private final android.widget.TextView mboundView65;
    @NonNull
    private final com.easyplex.ui.player.views.AutoPlaymageButton mboundView7;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback27;
    @Nullable
    private final android.view.View.OnClickListener mCallback39;
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    @Nullable
    private final android.view.View.OnClickListener mCallback28;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback49;
    @Nullable
    private final android.view.View.OnClickListener mCallback25;
    @Nullable
    private final android.view.View.OnClickListener mCallback37;
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback38;
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    @Nullable
    private final android.view.View.OnClickListener mCallback26;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback47;
    @Nullable
    private final android.view.View.OnClickListener mCallback23;
    @Nullable
    private final android.view.View.OnClickListener mCallback35;
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    @Nullable
    private final android.view.View.OnClickListener mCallback36;
    @Nullable
    private final android.view.View.OnClickListener mCallback48;
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    @Nullable
    private final android.view.View.OnClickListener mCallback24;
    @Nullable
    private final android.view.View.OnClickListener mCallback45;
    @Nullable
    private final android.view.View.OnClickListener mCallback21;
    @Nullable
    private final android.view.View.OnClickListener mCallback33;
    @Nullable
    private final android.view.View.OnClickListener mCallback20;
    @Nullable
    private final android.view.View.OnClickListener mCallback34;
    @Nullable
    private final android.view.View.OnClickListener mCallback46;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    @Nullable
    private final android.view.View.OnClickListener mCallback22;
    @Nullable
    private final android.view.View.OnClickListener mCallback43;
    @Nullable
    private final android.view.View.OnTouchListener mCallback55;
    @Nullable
    private final android.view.View.OnClickListener mCallback30;
    @Nullable
    private final android.view.View.OnClickListener mCallback42;
    @Nullable
    private final android.view.View.OnClickListener mCallback56;
    @Nullable
    private final android.view.View.OnClickListener mCallback32;
    @Nullable
    private final android.view.View.OnClickListener mCallback44;
    @Nullable
    private final android.view.View.OnClickListener mCallback31;
    @Nullable
    private final android.view.View.OnClickListener mCallback52;
    @Nullable
    private final android.view.View.OnClickListener mCallback40;
    @Nullable
    private final android.view.View.OnClickListener mCallback54;
    @Nullable
    private final android.view.View.OnClickListener mCallback41;
    @Nullable
    private final android.view.View.OnClickListener mCallback53;
    @Nullable
    private final android.view.View.OnClickListener mCallback19;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback50;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback51;
    @Nullable
    private final android.view.View.OnClickListener mCallback17;
    @Nullable
    private final android.view.View.OnClickListener mCallback29;
    @Nullable
    private final android.widget.CompoundButton.OnCheckedChangeListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback18;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    private OnProgressChangedImpl mControllerOnProgressChangedAndroidxDatabindingAdaptersSeekBarBindingAdapterOnProgressChanged;
    private OnStartTrackingTouchImpl mControllerOnStartTrackingTouchAndroidxDatabindingAdaptersSeekBarBindingAdapterOnStartTrackingTouch;
    private OnStopTrackingTouchImpl mControllerOnStopTrackingTouchAndroidxDatabindingAdaptersSeekBarBindingAdapterOnStopTrackingTouch;
    // Inverse Binding Event Handlers

    public UiControllerViewBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 77, sIncludes, sViewsWithIds));
    }
    private UiControllerViewBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 25
            , (androidx.appcompat.widget.SwitchCompat) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[68]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[64]
            , (android.widget.FrameLayout) bindings[61]
            , (android.widget.FrameLayout) bindings[62]
            , (android.widget.ImageButton) bindings[56]
            , (android.widget.ProgressBar) bindings[66]
            , (android.widget.TextView) bindings[63]
            , (androidx.constraintlayout.widget.Guideline) bindings[74]
            , (androidx.constraintlayout.widget.Guideline) bindings[72]
            , (androidx.constraintlayout.widget.Guideline) bindings[73]
            , (androidx.constraintlayout.widget.Guideline) bindings[75]
            , (androidx.constraintlayout.widget.Guideline) bindings[76]
            , (androidx.constraintlayout.widget.Guideline) bindings[71]
            , (android.widget.Button) bindings[55]
            , (android.widget.LinearLayout) bindings[49]
            , (android.widget.LinearLayout) bindings[52]
            , (android.widget.LinearLayout) bindings[6]
            , (androidx.mediarouter.app.MediaRouteButton) bindings[69]
            , (android.widget.LinearLayout) bindings[34]
            , (android.widget.TextView) bindings[5]
            , (android.widget.LinearLayout) bindings[25]
            , (android.widget.LinearLayout) bindings[28]
            , (android.widget.TextView) bindings[70]
            , (android.widget.LinearLayout) bindings[43]
            , (android.widget.LinearLayout) bindings[40]
            , (android.widget.LinearLayout) bindings[46]
            , (android.widget.LinearLayout) bindings[22]
            , (android.widget.LinearLayout) bindings[31]
            , (android.widget.LinearLayout) bindings[37]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageButton) bindings[4]
            , (android.widget.TextView) bindings[15]
            , (android.widget.ImageButton) bindings[35]
            , (android.widget.TextView) bindings[36]
            , (android.widget.ImageButton) bindings[14]
            , (com.tubitv.ui.TubiLoadingView) bindings[67]
            , (com.easyplex.ui.player.views.PlayStateImageButton) bindings[13]
            , (android.widget.TextView) bindings[60]
            , (android.widget.ImageButton) bindings[12]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.TextView) bindings[3]
            , (android.widget.SeekBar) bindings[59]
            , (android.widget.ImageButton) bindings[38]
            , (android.widget.TextView) bindings[39]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[21]
            , (android.widget.ImageButton) bindings[17]
            , (android.widget.ImageButton) bindings[20]
            , (com.easyplex.ui.player.views.SubstitleImageButton) bindings[9]
            , (android.widget.TextView) bindings[2]
            );
        this.autoplaySwitch.setTag(null);
        this.exoArtwork.setTag(null);
        this.imageViewMovieNext.setTag(null);
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView23 = (android.widget.ImageButton) bindings[23];
        this.mboundView23.setTag(null);
        this.mboundView24 = (android.widget.TextView) bindings[24];
        this.mboundView24.setTag(null);
        this.mboundView26 = (android.widget.ImageButton) bindings[26];
        this.mboundView26.setTag(null);
        this.mboundView27 = (android.widget.TextView) bindings[27];
        this.mboundView27.setTag(null);
        this.mboundView29 = (android.widget.ImageButton) bindings[29];
        this.mboundView29.setTag(null);
        this.mboundView30 = (android.widget.TextView) bindings[30];
        this.mboundView30.setTag(null);
        this.mboundView32 = (android.widget.ImageButton) bindings[32];
        this.mboundView32.setTag(null);
        this.mboundView33 = (android.widget.TextView) bindings[33];
        this.mboundView33.setTag(null);
        this.mboundView41 = (android.widget.ImageButton) bindings[41];
        this.mboundView41.setTag(null);
        this.mboundView42 = (android.widget.TextView) bindings[42];
        this.mboundView42.setTag(null);
        this.mboundView44 = (android.widget.ImageButton) bindings[44];
        this.mboundView44.setTag(null);
        this.mboundView45 = (android.widget.TextView) bindings[45];
        this.mboundView45.setTag(null);
        this.mboundView47 = (android.widget.ImageButton) bindings[47];
        this.mboundView47.setTag(null);
        this.mboundView48 = (android.widget.TextView) bindings[48];
        this.mboundView48.setTag(null);
        this.mboundView50 = (android.widget.ImageButton) bindings[50];
        this.mboundView50.setTag(null);
        this.mboundView51 = (android.widget.TextView) bindings[51];
        this.mboundView51.setTag(null);
        this.mboundView53 = (android.widget.ImageButton) bindings[53];
        this.mboundView53.setTag(null);
        this.mboundView54 = (android.widget.TextView) bindings[54];
        this.mboundView54.setTag(null);
        this.mboundView57 = (android.widget.TextView) bindings[57];
        this.mboundView57.setTag(null);
        this.mboundView58 = (android.widget.TextView) bindings[58];
        this.mboundView58.setTag(null);
        this.mboundView65 = (android.widget.TextView) bindings[65];
        this.mboundView65.setTag(null);
        this.mboundView7 = (com.easyplex.ui.player.views.AutoPlaymageButton) bindings[7];
        this.mboundView7.setTag(null);
        this.movieSkipFramelayout.setTag(null);
        this.nextPlayFramelayout.setTag(null);
        this.playerLockedIcon.setTag(null);
        this.progressBar.setTag(null);
        this.textViewVideoTimeRemaining.setTag(null);
        this.unlockBtnSecond.setTag(null);
        this.viewAudioMovie.setTag(null);
        this.viewAudioStreaming.setTag(null);
        this.viewAutoPlay.setTag(null);
        this.viewEpisodes.setTag(null);
        this.viewIslive.setTag(null);
        this.viewLockMovie.setTag(null);
        this.viewLockSerie.setTag(null);
        this.viewMoviesList.setTag(null);
        this.viewMoviesListTv.setTag(null);
        this.viewNextEpisode.setTag(null);
        this.viewRestartMovie.setTag(null);
        this.viewSpeedStreaming.setTag(null);
        this.viewStreaming.setTag(null);
        this.viewSubstitlesAuto.setTag(null);
        this.viewSubstitlesAutoMovies.setTag(null);
        this.viewTubiControllerAppSettings.setTag(null);
        this.viewTubiControllerClose.setTag(null);
        this.viewTubiControllerElapsedTime.setTag(null);
        this.viewTubiControllerEpisodes.setTag(null);
        this.viewTubiControllerEpisodesText.setTag(null);
        this.viewTubiControllerForwardIb.setTag(null);
        this.viewTubiControllerLoading.setTag(null);
        this.viewTubiControllerPlayToggleIb.setTag(null);
        this.viewTubiControllerRemainingTime.setTag(null);
        this.viewTubiControllerRewindIb.setTag(null);
        this.viewTubiControllerScaleIb.setTag(null);
        this.viewTubiControllerSecondTitle.setTag(null);
        this.viewTubiControllerSeekBar.setTag(null);
        this.viewTubiControllerStreaming.setTag(null);
        this.viewTubiControllerStreamingText.setTag(null);
        this.viewTubiControllerSubstitleCurentLang.setTag(null);
        this.viewTubiControllerSubstitleCurentLangMovies.setTag(null);
        this.viewTubiControllerSubstitlesIcon.setTag(null);
        this.viewTubiControllerSubstitlesIconMovies.setTag(null);
        this.viewTubiControllerSubtitlesIb.setTag(null);
        this.viewTubiControllerTitle.setTag(null);
        setRootTag(root);
        // listeners
        mCallback27 = new com.easyplex.generated.callback.OnClickListener(this, 25);
        mCallback39 = new com.easyplex.generated.callback.OnClickListener(this, 37);
        mCallback15 = new com.easyplex.generated.callback.OnClickListener(this, 13);
        mCallback16 = new com.easyplex.generated.callback.OnClickListener(this, 14);
        mCallback28 = new com.easyplex.generated.callback.OnClickListener(this, 26);
        mCallback9 = new com.easyplex.generated.callback.OnClickListener(this, 7);
        mCallback49 = new com.easyplex.generated.callback.OnClickListener(this, 47);
        mCallback25 = new com.easyplex.generated.callback.OnClickListener(this, 23);
        mCallback37 = new com.easyplex.generated.callback.OnClickListener(this, 35);
        mCallback13 = new com.easyplex.generated.callback.OnClickListener(this, 11);
        mCallback8 = new com.easyplex.generated.callback.OnClickListener(this, 6);
        mCallback38 = new com.easyplex.generated.callback.OnClickListener(this, 36);
        mCallback14 = new com.easyplex.generated.callback.OnClickListener(this, 12);
        mCallback26 = new com.easyplex.generated.callback.OnClickListener(this, 24);
        mCallback7 = new com.easyplex.generated.callback.OnClickListener(this, 5);
        mCallback47 = new com.easyplex.generated.callback.OnClickListener(this, 45);
        mCallback23 = new com.easyplex.generated.callback.OnClickListener(this, 21);
        mCallback35 = new com.easyplex.generated.callback.OnClickListener(this, 33);
        mCallback11 = new com.easyplex.generated.callback.OnClickListener(this, 9);
        mCallback36 = new com.easyplex.generated.callback.OnClickListener(this, 34);
        mCallback48 = new com.easyplex.generated.callback.OnClickListener(this, 46);
        mCallback12 = new com.easyplex.generated.callback.OnClickListener(this, 10);
        mCallback24 = new com.easyplex.generated.callback.OnClickListener(this, 22);
        mCallback45 = new com.easyplex.generated.callback.OnClickListener(this, 43);
        mCallback21 = new com.easyplex.generated.callback.OnClickListener(this, 19);
        mCallback33 = new com.easyplex.generated.callback.OnClickListener(this, 31);
        mCallback20 = new com.easyplex.generated.callback.OnClickListener(this, 18);
        mCallback34 = new com.easyplex.generated.callback.OnClickListener(this, 32);
        mCallback46 = new com.easyplex.generated.callback.OnClickListener(this, 44);
        mCallback10 = new com.easyplex.generated.callback.OnClickListener(this, 8);
        mCallback22 = new com.easyplex.generated.callback.OnClickListener(this, 20);
        mCallback43 = new com.easyplex.generated.callback.OnClickListener(this, 41);
        mCallback55 = new com.easyplex.generated.callback.OnTouchListener(this, 53);
        mCallback30 = new com.easyplex.generated.callback.OnClickListener(this, 28);
        mCallback42 = new com.easyplex.generated.callback.OnClickListener(this, 40);
        mCallback56 = new com.easyplex.generated.callback.OnClickListener(this, 54);
        mCallback32 = new com.easyplex.generated.callback.OnClickListener(this, 30);
        mCallback44 = new com.easyplex.generated.callback.OnClickListener(this, 42);
        mCallback31 = new com.easyplex.generated.callback.OnClickListener(this, 29);
        mCallback52 = new com.easyplex.generated.callback.OnClickListener(this, 50);
        mCallback40 = new com.easyplex.generated.callback.OnClickListener(this, 38);
        mCallback54 = new com.easyplex.generated.callback.OnClickListener(this, 52);
        mCallback41 = new com.easyplex.generated.callback.OnClickListener(this, 39);
        mCallback53 = new com.easyplex.generated.callback.OnClickListener(this, 51);
        mCallback19 = new com.easyplex.generated.callback.OnClickListener(this, 17);
        mCallback6 = new com.easyplex.generated.callback.OnClickListener(this, 4);
        mCallback50 = new com.easyplex.generated.callback.OnClickListener(this, 48);
        mCallback5 = new com.easyplex.generated.callback.OnClickListener(this, 3);
        mCallback51 = new com.easyplex.generated.callback.OnClickListener(this, 49);
        mCallback17 = new com.easyplex.generated.callback.OnClickListener(this, 15);
        mCallback29 = new com.easyplex.generated.callback.OnClickListener(this, 27);
        mCallback4 = new com.easyplex.generated.callback.OnCheckedChangeListener(this, 2);
        mCallback18 = new com.easyplex.generated.callback.OnClickListener(this, 16);
        mCallback3 = new com.easyplex.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4000000L;
                mDirtyFlags_1 = 0x0L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0 || mDirtyFlags_1 != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.controller == variableId) {
            setController((com.easyplex.ui.player.bindings.PlayerController) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setController(@Nullable com.easyplex.ui.player.bindings.PlayerController Controller) {
        this.mController = Controller;
        synchronized(this) {
            mDirtyFlags |= 0x2000000L;
        }
        notifyPropertyChanged(BR.controller);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeControllerCurrentMediaCover((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeControllerVideoName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeControllerMediaPositionInString((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeControllerPlayerReady((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeControllerMediaSubstitleGet((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 5 :
                return onChangeControllerCurrentSpeed((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeControllerMediaTypeName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 7 :
                return onChangeControllerIsPlayerLocked((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 8 :
                return onChangeControllerMediaBufferedPosition((androidx.databinding.ObservableField<java.lang.Long>) object, fieldId);
            case 9 :
                return onChangeControllerVideoCurrentSubs((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 10 :
                return onChangeControllerSettingReady((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 11 :
                return onChangeControllerAdsRemainInString((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 12 :
                return onChangeControllerIsLive((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 13 :
                return onChangeControllerMediaEnded((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 14 :
                return onChangeControllerMediaRemainInString((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 15 :
                return onChangeControllerMediaNameSecondary((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 16 :
                return onChangeControllerMediaHasSubstitle((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 17 :
                return onChangeControllerMediaCurrentTime((androidx.databinding.ObservableField<java.lang.Long>) object, fieldId);
            case 18 :
                return onChangeControllerIsCurrentAd((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 19 :
                return onChangeControllerMediaDuration((androidx.databinding.ObservableField<java.lang.Long>) object, fieldId);
            case 20 :
                return onChangeControllerPlayerPlaybackState((androidx.databinding.ObservableInt) object, fieldId);
            case 21 :
                return onChangeControllerIsPlayerLocked2((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 22 :
                return onChangeControllerIsAutoPlayEnabled((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 23 :
                return onChangeControllerIsMediaHasSkipRecap((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 24 :
                return onChangeControllerIsVideoPlayWhenReady((androidx.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeControllerCurrentMediaCover(androidx.databinding.ObservableField<java.lang.String> ControllerCurrentMediaCover, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerVideoName(androidx.databinding.ObservableField<java.lang.String> ControllerVideoName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerMediaPositionInString(androidx.databinding.ObservableField<java.lang.String> ControllerMediaPositionInString, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerPlayerReady(androidx.databinding.ObservableField<java.lang.Boolean> ControllerPlayerReady, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerMediaSubstitleGet(androidx.databinding.ObservableField<java.lang.Boolean> ControllerMediaSubstitleGet, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerCurrentSpeed(androidx.databinding.ObservableField<java.lang.String> ControllerCurrentSpeed, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerMediaTypeName(androidx.databinding.ObservableField<java.lang.String> ControllerMediaTypeName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerIsPlayerLocked(androidx.databinding.ObservableField<java.lang.Boolean> ControllerIsPlayerLocked, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerMediaBufferedPosition(androidx.databinding.ObservableField<java.lang.Long> ControllerMediaBufferedPosition, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerVideoCurrentSubs(androidx.databinding.ObservableField<java.lang.String> ControllerVideoCurrentSubs, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerSettingReady(androidx.databinding.ObservableField<java.lang.Boolean> ControllerSettingReady, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerAdsRemainInString(androidx.databinding.ObservableField<java.lang.String> ControllerAdsRemainInString, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerIsLive(androidx.databinding.ObservableField<java.lang.Boolean> ControllerIsLive, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerMediaEnded(androidx.databinding.ObservableField<java.lang.Boolean> ControllerMediaEnded, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerMediaRemainInString(androidx.databinding.ObservableField<java.lang.String> ControllerMediaRemainInString, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerMediaNameSecondary(androidx.databinding.ObservableField<java.lang.String> ControllerMediaNameSecondary, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerMediaHasSubstitle(androidx.databinding.ObservableField<java.lang.Boolean> ControllerMediaHasSubstitle, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerMediaCurrentTime(androidx.databinding.ObservableField<java.lang.Long> ControllerMediaCurrentTime, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerIsCurrentAd(androidx.databinding.ObservableField<java.lang.Boolean> ControllerIsCurrentAd, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerMediaDuration(androidx.databinding.ObservableField<java.lang.Long> ControllerMediaDuration, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerPlayerPlaybackState(androidx.databinding.ObservableInt ControllerPlayerPlaybackState, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerIsPlayerLocked2(androidx.databinding.ObservableField<java.lang.Boolean> ControllerIsPlayerLocked2, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerIsAutoPlayEnabled(androidx.databinding.ObservableField<java.lang.Boolean> ControllerIsAutoPlayEnabled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerIsMediaHasSkipRecap(androidx.databinding.ObservableField<java.lang.Boolean> ControllerIsMediaHasSkipRecap, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerIsVideoPlayWhenReady(androidx.databinding.ObservableBoolean ControllerIsVideoPlayWhenReady, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000000L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        long dirtyFlags_1 = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
            dirtyFlags_1 = mDirtyFlags_1;
            mDirtyFlags_1 = 0;
        }
        int controllerPlayerPlaybackStateExoPlayerSTATEIDLEBooleanTrueControllerPlayerPlaybackStateExoPlayerSTATEENDEDViewVISIBLEViewGONE = 0;
        java.lang.Long controllerMediaCurrentTimeGet = null;
        androidx.databinding.ObservableField<java.lang.String> controllerCurrentMediaCover = null;
        androidx.databinding.ObservableField<java.lang.String> controllerVideoName = null;
        boolean controllerPlayerPlaybackStateExoPlayerSTATEIDLE = false;
        androidx.databinding.ObservableField<java.lang.String> controllerMediaPositionInString = null;
        int controllerIsCurrentAdViewVISIBLEViewINVISIBLE = 0;
        androidx.databinding.ObservableField<java.lang.Boolean> controllerPlayerReady = null;
        androidx.databinding.ObservableField<java.lang.Boolean> controllerMediaSubstitleGet = null;
        boolean controllerIsCurrentAdControllerIsPlayerLockedBooleanTrueControllerMediaTypeEqualsJavaLangStringStreaming = false;
        androidx.databinding.ObservableField<java.lang.String> controllerCurrentSpeed = null;
        boolean controllerPlayerPlaybackStateExoPlayerSTATEBUFFERINGBooleanTrueControllerPlayerPlaybackStateExoPlayerSTATEIDLE = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxControllerMediaSubstitleGetGet = false;
        boolean controllerMediaTypeEqualsJavaLangString0ControllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnime = false;
        androidx.databinding.ObservableField<java.lang.String> controllerMediaTypeName = null;
        java.lang.String controllerMediaType = null;
        boolean controllerIsCurrentAdControllerIsPlayerLockedBooleanFalseControllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnimeBooleanFalse = false;
        androidx.databinding.adapters.SeekBarBindingAdapter.OnProgressChanged controllerOnProgressChangedAndroidxDatabindingAdaptersSeekBarBindingAdapterOnProgressChanged = null;
        androidx.databinding.ObservableField<java.lang.Boolean> controllerIsPlayerLocked = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxControllerIsCurrentAdGet = false;
        boolean controllerIsCurrentAd = false;
        int controllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnimeControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalseControllerIsPlayerLockedBooleanFalseViewVISIBLEViewINVISIBLE = 0;
        boolean controllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnime = false;
        boolean controllerIsVideoPlayWhenReadyGet = false;
        androidx.databinding.ObservableField<java.lang.Long> controllerMediaBufferedPosition = null;
        androidx.databinding.ObservableField<java.lang.String> controllerVideoCurrentSubs = null;
        boolean controllerPlayerPlaybackStateExoPlayerSTATEIDLEBooleanTrueControllerPlayerPlaybackStateExoPlayerSTATEENDED = false;
        boolean controllerPlayerPlaybackStateExoPlayerSTATEBUFFERING = false;
        boolean controllerMediaTypeEqualsJavaLangString1 = false;
        int controllerIsLiveViewVISIBLEViewGONE = 0;
        androidx.databinding.ObservableField<java.lang.Boolean> controllerSettingReady = null;
        androidx.databinding.ObservableField<java.lang.String> controllerAdsRemainInString = null;
        boolean controllerMediaTypeEqualsJavaLangStringStreaming = false;
        boolean controllerIsCue = false;
        boolean controllerMediaTypeEqualsJavaLangStringStreamingControllerMediaEndedBooleanFalseBooleanFalse = false;
        androidx.databinding.ObservableField<java.lang.Boolean> controllerIsLive = null;
        java.lang.Boolean controllerMediaSubstitleGetGet = null;
        java.lang.String controllerMediaRemainInStringJavaLangObjectNullViewTubiControllerRemainingTimeAndroidStringControllerTimePositionTextDefaultControllerMediaRemainInString = null;
        boolean controllerMediaTypeEqualsJavaLangString0ControllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnimeControllerMediaEndedBooleanFalseBooleanFalseControllerIsPlayerLockedBooleanFalse = false;
        int controllerIsCurrentAdControllerIsPlayerLockedBooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.String controllerVideoNameGet = null;
        androidx.databinding.ObservableField<java.lang.Boolean> controllerMediaEnded = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxControllerMediaEndedGet = false;
        androidx.databinding.ObservableField<java.lang.String> controllerMediaRemainInString = null;
        androidx.databinding.ObservableField<java.lang.String> controllerMediaNameSecondary = null;
        int controllerMediaTypeEqualsJavaLangString0ControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalseControllerIsPlayerLockedBooleanFalseViewVISIBLEViewGONE = 0;
        int controllerIsCurrentAdViewINVISIBLEViewVISIBLE = 0;
        java.lang.Long controllerMediaBufferedPositionGet = null;
        androidx.databinding.ObservableField<java.lang.Boolean> controllerMediaHasSubstitle = null;
        int controllerIsMediaHasSkipRecapControllerIsCurrentAdBooleanFalseViewVISIBLEViewINVISIBLE = 0;
        int controllerMediaTypeEqualsJavaLangStringStreamingControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalseViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxControllerIsMediaHasSkipRecapGet = false;
        long androidxDatabindingViewDataBindingSafeUnboxControllerMediaDurationGet = 0;
        boolean controllerMediaTypeEqualsJavaLangString0ControllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnimeControllerMediaEndedBooleanFalseBooleanFalseControllerIsPlayerLockedBooleanFalseControllerIsCurrentAdBooleanFalse = false;
        boolean controllerIsPlayerLocked2 = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxControllerPlayerReadyGet = false;
        boolean controllerIsCurrentAdControllerIsPlayerLocked = false;
        boolean controllerPlayerPlaybackStateExoPlayerSTATEBUFFERINGControllerIsPlayerLocked = false;
        boolean controllerMediaTypeEqualsJavaLangStringStreamingControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalse = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxControllerIsLiveGet = false;
        java.lang.Boolean controllerSettingReadyGet = null;
        int controllerIsCurrentAdControllerIsPlayerLockedBooleanFalseControllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnimeBooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.String controllerMediaPositionInStringJavaLangObjectNullViewTubiControllerElapsedTimeAndroidStringControllerTimePositionTextDefaultControllerMediaPositionInString = null;
        boolean controllerIsCueControllerPlayerReadyBooleanFalse = false;
        int controllerMediaTypeEqualsJavaLangStringStreamingControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalseViewVISIBLEViewINVISIBLE = 0;
        boolean controllerMediaTypeEqualsJavaLangString0ControllerMediaTypeEqualsJavaLangString1 = false;
        java.lang.Boolean controllerIsAutoPlayEnabledGet = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxControllerMediaHasSubstitleGet = false;
        java.lang.String controllerMediaNameSecondaryGet = null;
        java.lang.Boolean controllerIsPlayerLockedGet = null;
        long androidxDatabindingViewDataBindingSafeUnboxControllerMediaBufferedPositionGet = 0;
        boolean controllerIsCurrentAdControllerIsPlayerLocked2 = false;
        androidx.databinding.ObservableField<java.lang.Long> controllerMediaCurrentTime = null;
        int controllerIsCurrentAdControllerIsPlayerLockedViewGONEViewVISIBLE = 0;
        boolean controllerMediaTypeEqualsJavaLangString0ControllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnimeControllerMediaEndedBooleanFalseBooleanFalse = false;
        java.lang.Boolean controllerIsPlayerLocked2Get = null;
        int intControllerMediaBufferedPosition = 0;
        boolean controllerPlayerPlaybackStateExoPlayerSTATEENDED = false;
        boolean controllerMediaTypeEqualsJavaLangStringAnime = false;
        androidx.databinding.ObservableField<java.lang.Boolean> ControllerIsCurrentAd1 = null;
        boolean controllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnimeControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalseControllerIsPlayerLockedBooleanFalse = false;
        boolean ControllerIsCurrentAdControllerIsPlayerLocked1 = false;
        java.lang.Long controllerMediaDurationGet = null;
        boolean controllerIsCueControllerPlayerReadyBooleanFalseControllerSettingReadyBooleanFalse = false;
        java.lang.Boolean controllerMediaHasSubstitleGet = null;
        java.lang.String controllerMediaRemainInStringGet = null;
        boolean controllerMediaTypeEqualsJavaLangString0ControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalse = false;
        boolean controllerMediaTypeEqualsJavaLangString0ControllerMediaEndedBooleanFalseBooleanFalse = false;
        int controllerIsCueControllerPlayerReadyBooleanFalseControllerSettingReadyBooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.String controllerMediaTypeNameGet = null;
        androidx.databinding.adapters.SeekBarBindingAdapter.OnStartTrackingTouch controllerOnStartTrackingTouchAndroidxDatabindingAdaptersSeekBarBindingAdapterOnStartTrackingTouch = null;
        androidx.databinding.ObservableField<java.lang.Long> controllerMediaDuration = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxControllerIsPlayerLockedGet = false;
        java.lang.Boolean controllerMediaEndedGet = null;
        boolean controllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnimeControllerMediaEndedBooleanFalseBooleanFalse = false;
        long androidxDatabindingViewDataBindingSafeUnboxControllerMediaCurrentTimeGet = 0;
        boolean controllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnimeControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalse = false;
        boolean controllerMediaRemainInStringJavaLangObjectNull = false;
        boolean controllerMediaPositionInStringJavaLangObjectNull = false;
        java.lang.String controllerAdsRemainInStringGet = null;
        java.lang.Boolean controllerPlayerReadyGet = null;
        java.lang.String controllerMediaPositionInStringGet = null;
        java.lang.Boolean controllerIsMediaHasSkipRecapGet = null;
        int controllerIsCurrentAdControllerIsPlayerLocked2ViewGONEViewVISIBLE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxControllerIsAutoPlayEnabledGet = false;
        int controllerMediaHasSubstitleControllerIsCurrentAdBooleanFalseViewVISIBLEViewGONE = 0;
        int intControllerMediaDuration = 0;
        int controllerPlayerPlaybackStateExoPlayerSTATEBUFFERINGControllerIsPlayerLockedViewINVISIBLEViewVISIBLE = 0;
        int intControllerMediaCurrentTime = 0;
        java.lang.Boolean controllerIsCurrentAdGet = null;
        boolean controllerMediaTypeEqualsJavaLangString0ControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalseControllerIsPlayerLockedBooleanFalse = false;
        int controllerPlayerPlaybackStateGet = 0;
        boolean controllerIsMediaHasSkipRecapControllerIsCurrentAdBooleanFalse = false;
        androidx.databinding.ObservableInt controllerPlayerPlaybackState = null;
        java.lang.Boolean controllerIsLiveGet = null;
        androidx.databinding.ObservableField<java.lang.Boolean> ControllerIsPlayerLocked21 = null;
        int controllerMediaTypeEqualsJavaLangString0ControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalseControllerIsPlayerLockedBooleanFalseViewVISIBLEViewINVISIBLE = 0;
        int ControllerIsCurrentAdControllerIsPlayerLockedViewGONEViewVISIBLE1 = 0;
        androidx.databinding.adapters.SeekBarBindingAdapter.OnStopTrackingTouch controllerOnStopTrackingTouchAndroidxDatabindingAdaptersSeekBarBindingAdapterOnStopTrackingTouch = null;
        boolean controllerMediaEndedBooleanFalse = false;
        androidx.databinding.ObservableField<java.lang.Boolean> controllerIsAutoPlayEnabled = null;
        java.lang.String controllerCurrentSpeedGet = null;
        boolean controllerMediaTypeEqualsJavaLangString0 = false;
        int controllerMediaTypeEqualsJavaLangString0ControllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnimeControllerMediaEndedBooleanFalseBooleanFalseControllerIsPlayerLockedBooleanFalseControllerIsCurrentAdBooleanFalseViewVISIBLEViewINVISIBLE = 0;
        int controllerIsCurrentAdControllerIsPlayerLockedBooleanTrueControllerMediaTypeEqualsJavaLangStringStreamingViewINVISIBLEViewVISIBLE = 0;
        boolean ControllerIsPlayerLocked1 = false;
        androidx.databinding.ObservableField<java.lang.Boolean> controllerIsMediaHasSkipRecap = null;
        java.lang.String controllerVideoCurrentSubsGet = null;
        com.easyplex.ui.player.bindings.PlayerController controller = mController;
        boolean androidxDatabindingViewDataBindingSafeUnboxControllerSettingReadyGet = false;
        java.lang.String controllerCurrentMediaCoverGet = null;
        boolean controllerMediaHasSubstitleControllerIsCurrentAdBooleanFalse = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxControllerIsPlayerLocked2Get = false;
        boolean controllerIsCurrentAdControllerIsPlayerLockedBooleanFalse = false;
        androidx.databinding.ObservableBoolean controllerIsVideoPlayWhenReady = null;

        if ((dirtyFlags & 0x7ffffffL) != 0) {


            if ((dirtyFlags & 0x6000001L) != 0) {

                    if (controller != null) {
                        // read controller.currentMediaCover
                        controllerCurrentMediaCover = controller.currentMediaCover;
                    }
                    updateRegistration(0, controllerCurrentMediaCover);


                    if (controllerCurrentMediaCover != null) {
                        // read controller.currentMediaCover.get()
                        controllerCurrentMediaCoverGet = controllerCurrentMediaCover.get();
                    }
            }
            if ((dirtyFlags & 0x6000002L) != 0) {

                    if (controller != null) {
                        // read controller.videoName
                        controllerVideoName = controller.videoName;
                    }
                    updateRegistration(1, controllerVideoName);


                    if (controllerVideoName != null) {
                        // read controller.videoName.get()
                        controllerVideoNameGet = controllerVideoName.get();
                    }
            }
            if ((dirtyFlags & 0x6000004L) != 0) {

                    if (controller != null) {
                        // read controller.mediaPositionInString
                        controllerMediaPositionInString = controller.mediaPositionInString;
                    }
                    updateRegistration(2, controllerMediaPositionInString);


                    if (controllerMediaPositionInString != null) {
                        // read controller.mediaPositionInString.get()
                        controllerMediaPositionInStringGet = controllerMediaPositionInString.get();
                    }


                    // read controller.mediaPositionInString.get() == null
                    controllerMediaPositionInStringJavaLangObjectNull = (controllerMediaPositionInStringGet) == (null);
                if((dirtyFlags & 0x6000004L) != 0) {
                    if(controllerMediaPositionInStringJavaLangObjectNull) {
                            dirtyFlags_1 |= 0x4L;
                    }
                    else {
                            dirtyFlags_1 |= 0x2L;
                    }
                }
            }
            if ((dirtyFlags & 0x6000010L) != 0) {

                    if (controller != null) {
                        // read controller.mediaSubstitleGet
                        controllerMediaSubstitleGet = controller.mediaSubstitleGet;
                    }
                    updateRegistration(4, controllerMediaSubstitleGet);


                    if (controllerMediaSubstitleGet != null) {
                        // read controller.mediaSubstitleGet.get()
                        controllerMediaSubstitleGetGet = controllerMediaSubstitleGet.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaSubstitleGet.get())
                    androidxDatabindingViewDataBindingSafeUnboxControllerMediaSubstitleGetGet = androidx.databinding.ViewDataBinding.safeUnbox(controllerMediaSubstitleGetGet);
            }
            if ((dirtyFlags & 0x6000020L) != 0) {

                    if (controller != null) {
                        // read controller.currentSpeed
                        controllerCurrentSpeed = controller.currentSpeed;
                    }
                    updateRegistration(5, controllerCurrentSpeed);


                    if (controllerCurrentSpeed != null) {
                        // read controller.currentSpeed.get()
                        controllerCurrentSpeedGet = controllerCurrentSpeed.get();
                    }
            }
            if ((dirtyFlags & 0x6000040L) != 0) {

                    if (controller != null) {
                        // read controller.mediaTypeName
                        controllerMediaTypeName = controller.mediaTypeName;
                    }
                    updateRegistration(6, controllerMediaTypeName);


                    if (controllerMediaTypeName != null) {
                        // read controller.mediaTypeName.get()
                        controllerMediaTypeNameGet = controllerMediaTypeName.get();
                    }
            }
            if ((dirtyFlags & 0x6042080L) != 0) {

                    if (controller != null) {
                        // read controller.mediaType
                        controllerMediaType = controller.getMediaType();
                    }


                    if (controllerMediaType != null) {
                        // read controller.mediaType.equals("1")
                        controllerMediaTypeEqualsJavaLangString1 = controllerMediaType.equals("1");
                        // read controller.mediaType.equals("anime")
                        controllerMediaTypeEqualsJavaLangStringAnime = controllerMediaType.equals("anime");
                        // read controller.mediaType.equals("0")
                        controllerMediaTypeEqualsJavaLangString0 = controllerMediaType.equals("0");
                    }
                if((dirtyFlags & 0x6042080L) != 0) {
                    if(controllerMediaTypeEqualsJavaLangString0) {
                            dirtyFlags_1 |= 0x40000L;
                    }
                    else {
                            dirtyFlags_1 |= 0x20000L;
                    }
                }


                    // read (controller.mediaType.equals("1")) | (controller.mediaType.equals("anime"))
                    controllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnime = (controllerMediaTypeEqualsJavaLangString1) | (controllerMediaTypeEqualsJavaLangStringAnime);
                    // read (controller.mediaType.equals("0")) | (controller.mediaType.equals("1"))
                    controllerMediaTypeEqualsJavaLangString0ControllerMediaTypeEqualsJavaLangString1 = (controllerMediaTypeEqualsJavaLangString0) | (controllerMediaTypeEqualsJavaLangString1);
                if((dirtyFlags & 0x6042080L) != 0) {
                    if(controllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnime) {
                            dirtyFlags_1 |= 0x400000L;
                    }
                    else {
                            dirtyFlags_1 |= 0x200000L;
                    }
                }


                    // read ((controller.mediaType.equals("0")) | (controller.mediaType.equals("1"))) | (controller.mediaType.equals("anime"))
                    controllerMediaTypeEqualsJavaLangString0ControllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnime = (controllerMediaTypeEqualsJavaLangString0ControllerMediaTypeEqualsJavaLangString1) | (controllerMediaTypeEqualsJavaLangStringAnime);
                if((dirtyFlags & 0x6042080L) != 0) {
                    if(controllerMediaTypeEqualsJavaLangString0ControllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnime) {
                            dirtyFlags_1 |= 0x400L;
                    }
                    else {
                            dirtyFlags_1 |= 0x200L;
                    }
                }
                if ((dirtyFlags & 0x6042000L) != 0) {

                        if (controllerMediaType != null) {
                            // read controller.mediaType.equals("streaming")
                            controllerMediaTypeEqualsJavaLangStringStreaming = controllerMediaType.equals("streaming");
                        }
                    if((dirtyFlags & 0x6042000L) != 0) {
                        if(controllerMediaTypeEqualsJavaLangStringStreaming) {
                                dirtyFlags |= 0x100000000000L;
                        }
                        else {
                                dirtyFlags |= 0x80000000000L;
                        }
                    }
                }
            }
            if ((dirtyFlags & 0x6000000L) != 0) {

                    if (controller != null) {
                        // read controller::onProgressChanged
                        controllerOnProgressChangedAndroidxDatabindingAdaptersSeekBarBindingAdapterOnProgressChanged = (((mControllerOnProgressChangedAndroidxDatabindingAdaptersSeekBarBindingAdapterOnProgressChanged == null) ? (mControllerOnProgressChangedAndroidxDatabindingAdaptersSeekBarBindingAdapterOnProgressChanged = new OnProgressChangedImpl()) : mControllerOnProgressChangedAndroidxDatabindingAdaptersSeekBarBindingAdapterOnProgressChanged).setValue(controller));
                        // read controller::onStartTrackingTouch
                        controllerOnStartTrackingTouchAndroidxDatabindingAdaptersSeekBarBindingAdapterOnStartTrackingTouch = (((mControllerOnStartTrackingTouchAndroidxDatabindingAdaptersSeekBarBindingAdapterOnStartTrackingTouch == null) ? (mControllerOnStartTrackingTouchAndroidxDatabindingAdaptersSeekBarBindingAdapterOnStartTrackingTouch = new OnStartTrackingTouchImpl()) : mControllerOnStartTrackingTouchAndroidxDatabindingAdaptersSeekBarBindingAdapterOnStartTrackingTouch).setValue(controller));
                        // read controller::onStopTrackingTouch
                        controllerOnStopTrackingTouchAndroidxDatabindingAdaptersSeekBarBindingAdapterOnStopTrackingTouch = (((mControllerOnStopTrackingTouchAndroidxDatabindingAdaptersSeekBarBindingAdapterOnStopTrackingTouch == null) ? (mControllerOnStopTrackingTouchAndroidxDatabindingAdaptersSeekBarBindingAdapterOnStopTrackingTouch = new OnStopTrackingTouchImpl()) : mControllerOnStopTrackingTouchAndroidxDatabindingAdaptersSeekBarBindingAdapterOnStopTrackingTouch).setValue(controller));
                    }
            }
            if ((dirtyFlags & 0x6140080L) != 0) {

                    if (controller != null) {
                        // read controller.isPlayerLocked
                        controllerIsPlayerLocked = controller.isPlayerLocked;
                    }
                    updateRegistration(7, controllerIsPlayerLocked);


                    if (controllerIsPlayerLocked != null) {
                        // read controller.isPlayerLocked.get()
                        controllerIsPlayerLockedGet = controllerIsPlayerLocked.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get())
                    androidxDatabindingViewDataBindingSafeUnboxControllerIsPlayerLockedGet = androidx.databinding.ViewDataBinding.safeUnbox(controllerIsPlayerLockedGet);

                if ((dirtyFlags & 0x6040080L) != 0) {

                        // read !androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get())
                        ControllerIsPlayerLocked1 = !androidxDatabindingViewDataBindingSafeUnboxControllerIsPlayerLockedGet;
                }
            }
            if ((dirtyFlags & 0x6000100L) != 0) {

                    if (controller != null) {
                        // read controller.mediaBufferedPosition
                        controllerMediaBufferedPosition = controller.mediaBufferedPosition;
                    }
                    updateRegistration(8, controllerMediaBufferedPosition);


                    if (controllerMediaBufferedPosition != null) {
                        // read controller.mediaBufferedPosition.get()
                        controllerMediaBufferedPositionGet = controllerMediaBufferedPosition.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaBufferedPosition.get())
                    androidxDatabindingViewDataBindingSafeUnboxControllerMediaBufferedPositionGet = androidx.databinding.ViewDataBinding.safeUnbox(controllerMediaBufferedPositionGet);


                    // read (int) androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaBufferedPosition.get())
                    intControllerMediaBufferedPosition = ((int) (androidxDatabindingViewDataBindingSafeUnboxControllerMediaBufferedPositionGet));
            }
            if ((dirtyFlags & 0x6000200L) != 0) {

                    if (controller != null) {
                        // read controller.videoCurrentSubs
                        controllerVideoCurrentSubs = controller.videoCurrentSubs;
                    }
                    updateRegistration(9, controllerVideoCurrentSubs);


                    if (controllerVideoCurrentSubs != null) {
                        // read controller.videoCurrentSubs.get()
                        controllerVideoCurrentSubsGet = controllerVideoCurrentSubs.get();
                    }
            }
            if ((dirtyFlags & 0x6000800L) != 0) {

                    if (controller != null) {
                        // read controller.adsRemainInString
                        controllerAdsRemainInString = controller.adsRemainInString;
                    }
                    updateRegistration(11, controllerAdsRemainInString);


                    if (controllerAdsRemainInString != null) {
                        // read controller.adsRemainInString.get()
                        controllerAdsRemainInStringGet = controllerAdsRemainInString.get();
                    }
            }
            if ((dirtyFlags & 0x6000408L) != 0) {

                    if (controller != null) {
                        // read controller.isCue
                        controllerIsCue = controller.isCue();
                    }
                if((dirtyFlags & 0x6000408L) != 0) {
                    if(controllerIsCue) {
                            dirtyFlags_1 |= 0x10L;
                    }
                    else {
                            dirtyFlags_1 |= 0x8L;
                    }
                }
            }
            if ((dirtyFlags & 0x6001000L) != 0) {

                    if (controller != null) {
                        // read controller.isLive
                        controllerIsLive = controller.isLive;
                    }
                    updateRegistration(12, controllerIsLive);


                    if (controllerIsLive != null) {
                        // read controller.isLive.get()
                        controllerIsLiveGet = controllerIsLive.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controller.isLive.get())
                    androidxDatabindingViewDataBindingSafeUnboxControllerIsLiveGet = androidx.databinding.ViewDataBinding.safeUnbox(controllerIsLiveGet);
                if((dirtyFlags & 0x6001000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControllerIsLiveGet) {
                            dirtyFlags |= 0x40000000000L;
                    }
                    else {
                            dirtyFlags |= 0x20000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controller.isLive.get()) ? View.VISIBLE : View.GONE
                    controllerIsLiveViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxControllerIsLiveGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x6004000L) != 0) {

                    if (controller != null) {
                        // read controller.mediaRemainInString
                        controllerMediaRemainInString = controller.mediaRemainInString;
                    }
                    updateRegistration(14, controllerMediaRemainInString);


                    if (controllerMediaRemainInString != null) {
                        // read controller.mediaRemainInString.get()
                        controllerMediaRemainInStringGet = controllerMediaRemainInString.get();
                    }


                    // read controller.mediaRemainInString.get() == null
                    controllerMediaRemainInStringJavaLangObjectNull = (controllerMediaRemainInStringGet) == (null);
                if((dirtyFlags & 0x6004000L) != 0) {
                    if(controllerMediaRemainInStringJavaLangObjectNull) {
                            dirtyFlags |= 0x400000000000L;
                    }
                    else {
                            dirtyFlags |= 0x200000000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x6008000L) != 0) {

                    if (controller != null) {
                        // read controller.mediaNameSecondary
                        controllerMediaNameSecondary = controller.mediaNameSecondary;
                    }
                    updateRegistration(15, controllerMediaNameSecondary);


                    if (controllerMediaNameSecondary != null) {
                        // read controller.mediaNameSecondary.get()
                        controllerMediaNameSecondaryGet = controllerMediaNameSecondary.get();
                    }
            }
            if ((dirtyFlags & 0x6050000L) != 0) {

                    if (controller != null) {
                        // read controller.mediaHasSubstitle
                        controllerMediaHasSubstitle = controller.mediaHasSubstitle;
                    }
                    updateRegistration(16, controllerMediaHasSubstitle);


                    if (controllerMediaHasSubstitle != null) {
                        // read controller.mediaHasSubstitle.get()
                        controllerMediaHasSubstitleGet = controllerMediaHasSubstitle.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaHasSubstitle.get())
                    androidxDatabindingViewDataBindingSafeUnboxControllerMediaHasSubstitleGet = androidx.databinding.ViewDataBinding.safeUnbox(controllerMediaHasSubstitleGet);
                if((dirtyFlags & 0x6050000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControllerMediaHasSubstitleGet) {
                            dirtyFlags_1 |= 0x100000000000L;
                    }
                    else {
                            dirtyFlags_1 |= 0x80000000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x6020000L) != 0) {

                    if (controller != null) {
                        // read controller.mediaCurrentTime
                        controllerMediaCurrentTime = controller.mediaCurrentTime;
                    }
                    updateRegistration(17, controllerMediaCurrentTime);


                    if (controllerMediaCurrentTime != null) {
                        // read controller.mediaCurrentTime.get()
                        controllerMediaCurrentTimeGet = controllerMediaCurrentTime.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaCurrentTime.get())
                    androidxDatabindingViewDataBindingSafeUnboxControllerMediaCurrentTimeGet = androidx.databinding.ViewDataBinding.safeUnbox(controllerMediaCurrentTimeGet);


                    // read (int) androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaCurrentTime.get())
                    intControllerMediaCurrentTime = ((int) (androidxDatabindingViewDataBindingSafeUnboxControllerMediaCurrentTimeGet));
            }
            if ((dirtyFlags & 0x6240080L) != 0) {

                    if (controller != null) {
                        // read controller.isCurrentAd
                        ControllerIsCurrentAd1 = controller.isCurrentAd;
                    }
                    updateRegistration(18, ControllerIsCurrentAd1);


                    if (ControllerIsCurrentAd1 != null) {
                        // read controller.isCurrentAd.get()
                        controllerIsCurrentAdGet = ControllerIsCurrentAd1.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get())
                    androidxDatabindingViewDataBindingSafeUnboxControllerIsCurrentAdGet = androidx.databinding.ViewDataBinding.safeUnbox(controllerIsCurrentAdGet);
                if((dirtyFlags & 0x6040000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControllerIsCurrentAdGet) {
                            dirtyFlags |= 0x40000000L;
                            dirtyFlags |= 0x40000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x20000000L;
                            dirtyFlags |= 0x20000000000000L;
                    }
                }

                if ((dirtyFlags & 0x6040000L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) ? View.VISIBLE : View.INVISIBLE
                        controllerIsCurrentAdViewVISIBLEViewINVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxControllerIsCurrentAdGet) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
                        // read androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) ? View.INVISIBLE : View.VISIBLE
                        controllerIsCurrentAdViewINVISIBLEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxControllerIsCurrentAdGet) ? (android.view.View.INVISIBLE) : (android.view.View.VISIBLE));
                }
                if ((dirtyFlags & 0x6040080L) != 0) {

                        // read !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get())
                        controllerIsCurrentAd = !androidxDatabindingViewDataBindingSafeUnboxControllerIsCurrentAdGet;
                        // read (androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get())) | (androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get()))
                        controllerIsCurrentAdControllerIsPlayerLocked = (androidxDatabindingViewDataBindingSafeUnboxControllerIsCurrentAdGet) | (androidxDatabindingViewDataBindingSafeUnboxControllerIsPlayerLockedGet);
                        // read (androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get())) | (!androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get()))
                        ControllerIsCurrentAdControllerIsPlayerLocked1 = (androidxDatabindingViewDataBindingSafeUnboxControllerIsCurrentAdGet) | (ControllerIsPlayerLocked1);
                    if((dirtyFlags & 0x6040080L) != 0) {
                        if(controllerIsCurrentAd) {
                                dirtyFlags_1 |= 0x400000000000L;
                        }
                        else {
                                dirtyFlags_1 |= 0x200000000000L;
                        }
                    }
                    if((dirtyFlags & 0x6040080L) != 0) {
                        if(controllerIsCurrentAdControllerIsPlayerLocked) {
                                dirtyFlags |= 0x100000000L;
                                dirtyFlags_1 |= 0x100L;
                        }
                        else {
                                dirtyFlags |= 0x80000000L;
                                dirtyFlags_1 |= 0x80L;
                        }
                    }
                    if((dirtyFlags & 0x6040080L) != 0) {
                        if(ControllerIsCurrentAdControllerIsPlayerLocked1) {
                                dirtyFlags_1 |= 0x4000000000L;
                        }
                        else {
                                dirtyFlags_1 |= 0x2000000000L;
                        }
                    }


                        // read (androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get())) | (androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get())) ? View.GONE : View.VISIBLE
                        controllerIsCurrentAdControllerIsPlayerLockedViewGONEViewVISIBLE = ((controllerIsCurrentAdControllerIsPlayerLocked) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                        // read (androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get())) | (!androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get())) ? View.GONE : View.VISIBLE
                        ControllerIsCurrentAdControllerIsPlayerLockedViewGONEViewVISIBLE1 = ((ControllerIsCurrentAdControllerIsPlayerLocked1) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                }
            }
            if ((dirtyFlags & 0x6080000L) != 0) {

                    if (controller != null) {
                        // read controller.mediaDuration
                        controllerMediaDuration = controller.mediaDuration;
                    }
                    updateRegistration(19, controllerMediaDuration);


                    if (controllerMediaDuration != null) {
                        // read controller.mediaDuration.get()
                        controllerMediaDurationGet = controllerMediaDuration.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaDuration.get())
                    androidxDatabindingViewDataBindingSafeUnboxControllerMediaDurationGet = androidx.databinding.ViewDataBinding.safeUnbox(controllerMediaDurationGet);


                    // read (int) androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaDuration.get())
                    intControllerMediaDuration = ((int) (androidxDatabindingViewDataBindingSafeUnboxControllerMediaDurationGet));
            }
            if ((dirtyFlags & 0x6100080L) != 0) {

                    if (controller != null) {
                        // read controller.playerPlaybackState
                        controllerPlayerPlaybackState = controller.playerPlaybackState;
                    }
                    updateRegistration(20, controllerPlayerPlaybackState);


                    if (controllerPlayerPlaybackState != null) {
                        // read controller.playerPlaybackState.get()
                        controllerPlayerPlaybackStateGet = controllerPlayerPlaybackState.get();
                    }

                if ((dirtyFlags & 0x6100000L) != 0) {

                        // read controller.playerPlaybackState.get() == ExoPlayer.STATE_IDLE
                        controllerPlayerPlaybackStateExoPlayerSTATEIDLE = (controllerPlayerPlaybackStateGet) == (com.google.android.exoplayer2.ExoPlayer.STATE_IDLE);
                    if((dirtyFlags & 0x6100000L) != 0) {
                        if(controllerPlayerPlaybackStateExoPlayerSTATEIDLE) {
                                dirtyFlags |= 0x10000000000L;
                        }
                        else {
                                dirtyFlags |= 0x8000000000L;
                        }
                    }
                }

                    // read controller.playerPlaybackState.get() == ExoPlayer.STATE_BUFFERING
                    controllerPlayerPlaybackStateExoPlayerSTATEBUFFERING = (controllerPlayerPlaybackStateGet) == (com.google.android.exoplayer2.ExoPlayer.STATE_BUFFERING);
                if((dirtyFlags & 0x6100000L) != 0) {
                    if(controllerPlayerPlaybackStateExoPlayerSTATEBUFFERING) {
                            dirtyFlags |= 0x400000000L;
                    }
                    else {
                            dirtyFlags |= 0x200000000L;
                    }
                }


                    // read (controller.playerPlaybackState.get() == ExoPlayer.STATE_BUFFERING) | (androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get()))
                    controllerPlayerPlaybackStateExoPlayerSTATEBUFFERINGControllerIsPlayerLocked = (controllerPlayerPlaybackStateExoPlayerSTATEBUFFERING) | (androidxDatabindingViewDataBindingSafeUnboxControllerIsPlayerLockedGet);
                if((dirtyFlags & 0x6100080L) != 0) {
                    if(controllerPlayerPlaybackStateExoPlayerSTATEBUFFERINGControllerIsPlayerLocked) {
                            dirtyFlags_1 |= 0x40000000L;
                    }
                    else {
                            dirtyFlags_1 |= 0x20000000L;
                    }
                }


                    // read (controller.playerPlaybackState.get() == ExoPlayer.STATE_BUFFERING) | (androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get())) ? View.INVISIBLE : View.VISIBLE
                    controllerPlayerPlaybackStateExoPlayerSTATEBUFFERINGControllerIsPlayerLockedViewINVISIBLEViewVISIBLE = ((controllerPlayerPlaybackStateExoPlayerSTATEBUFFERINGControllerIsPlayerLocked) ? (android.view.View.INVISIBLE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x6240000L) != 0) {

                    if (controller != null) {
                        // read controller.isPlayerLocked2
                        ControllerIsPlayerLocked21 = controller.isPlayerLocked2;
                    }
                    updateRegistration(21, ControllerIsPlayerLocked21);


                    if (ControllerIsPlayerLocked21 != null) {
                        // read controller.isPlayerLocked2.get()
                        controllerIsPlayerLocked2Get = ControllerIsPlayerLocked21.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked2.get())
                    androidxDatabindingViewDataBindingSafeUnboxControllerIsPlayerLocked2Get = androidx.databinding.ViewDataBinding.safeUnbox(controllerIsPlayerLocked2Get);


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked2.get())
                    controllerIsPlayerLocked2 = !androidxDatabindingViewDataBindingSafeUnboxControllerIsPlayerLocked2Get;


                    // read (androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get())) | (!androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked2.get()))
                    controllerIsCurrentAdControllerIsPlayerLocked2 = (androidxDatabindingViewDataBindingSafeUnboxControllerIsCurrentAdGet) | (controllerIsPlayerLocked2);
                if((dirtyFlags & 0x6240000L) != 0) {
                    if(controllerIsCurrentAdControllerIsPlayerLocked2) {
                            dirtyFlags_1 |= 0x4000000L;
                    }
                    else {
                            dirtyFlags_1 |= 0x2000000L;
                    }
                }


                    // read (androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get())) | (!androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked2.get())) ? View.GONE : View.VISIBLE
                    controllerIsCurrentAdControllerIsPlayerLocked2ViewGONEViewVISIBLE = ((controllerIsCurrentAdControllerIsPlayerLocked2) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x6400000L) != 0) {

                    if (controller != null) {
                        // read controller.isAutoPlayEnabled
                        controllerIsAutoPlayEnabled = controller.isAutoPlayEnabled;
                    }
                    updateRegistration(22, controllerIsAutoPlayEnabled);


                    if (controllerIsAutoPlayEnabled != null) {
                        // read controller.isAutoPlayEnabled.get()
                        controllerIsAutoPlayEnabledGet = controllerIsAutoPlayEnabled.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controller.isAutoPlayEnabled.get())
                    androidxDatabindingViewDataBindingSafeUnboxControllerIsAutoPlayEnabledGet = androidx.databinding.ViewDataBinding.safeUnbox(controllerIsAutoPlayEnabledGet);
            }
            if ((dirtyFlags & 0x6840000L) != 0) {

                    if (controller != null) {
                        // read controller.isMediaHasSkipRecap
                        controllerIsMediaHasSkipRecap = controller.isMediaHasSkipRecap;
                    }
                    updateRegistration(23, controllerIsMediaHasSkipRecap);


                    if (controllerIsMediaHasSkipRecap != null) {
                        // read controller.isMediaHasSkipRecap.get()
                        controllerIsMediaHasSkipRecapGet = controllerIsMediaHasSkipRecap.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controller.isMediaHasSkipRecap.get())
                    androidxDatabindingViewDataBindingSafeUnboxControllerIsMediaHasSkipRecapGet = androidx.databinding.ViewDataBinding.safeUnbox(controllerIsMediaHasSkipRecapGet);
                if((dirtyFlags & 0x6840000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControllerIsMediaHasSkipRecapGet) {
                            dirtyFlags_1 |= 0x400000000L;
                    }
                    else {
                            dirtyFlags_1 |= 0x200000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x7000000L) != 0) {

                    if (controller != null) {
                        // read controller.isVideoPlayWhenReady
                        controllerIsVideoPlayWhenReady = controller.isVideoPlayWhenReady;
                    }
                    updateRegistration(24, controllerIsVideoPlayWhenReady);


                    if (controllerIsVideoPlayWhenReady != null) {
                        // read controller.isVideoPlayWhenReady.get()
                        controllerIsVideoPlayWhenReadyGet = controllerIsVideoPlayWhenReady.get();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags_1 & 0x10L) != 0) {

                if (controller != null) {
                    // read controller.playerReady
                    controllerPlayerReady = controller.playerReady;
                }
                updateRegistration(3, controllerPlayerReady);


                if (controllerPlayerReady != null) {
                    // read controller.playerReady.get()
                    controllerPlayerReadyGet = controllerPlayerReady.get();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controller.playerReady.get())
                androidxDatabindingViewDataBindingSafeUnboxControllerPlayerReadyGet = androidx.databinding.ViewDataBinding.safeUnbox(controllerPlayerReadyGet);
        }
        if ((dirtyFlags & 0x6100000L) != 0) {

                // read controller.playerPlaybackState.get() == ExoPlayer.STATE_BUFFERING ? true : controller.playerPlaybackState.get() == ExoPlayer.STATE_IDLE
                controllerPlayerPlaybackStateExoPlayerSTATEBUFFERINGBooleanTrueControllerPlayerPlaybackStateExoPlayerSTATEIDLE = ((controllerPlayerPlaybackStateExoPlayerSTATEBUFFERING) ? (true) : (controllerPlayerPlaybackStateExoPlayerSTATEIDLE));
        }
        if ((dirtyFlags & 0x80000000L) != 0) {

                if (controllerMediaType != null) {
                    // read controller.mediaType.equals("streaming")
                    controllerMediaTypeEqualsJavaLangStringStreaming = controllerMediaType.equals("streaming");
                }
            if((dirtyFlags & 0x6042000L) != 0) {
                if(controllerMediaTypeEqualsJavaLangStringStreaming) {
                        dirtyFlags |= 0x100000000000L;
                }
                else {
                        dirtyFlags |= 0x80000000000L;
                }
            }
        }
        if ((dirtyFlags & 0x6004000L) != 0) {

                // read controller.mediaRemainInString.get() == null ? @android:string/controller_time_position_text_default : controller.mediaRemainInString.get()
                controllerMediaRemainInStringJavaLangObjectNullViewTubiControllerRemainingTimeAndroidStringControllerTimePositionTextDefaultControllerMediaRemainInString = ((controllerMediaRemainInStringJavaLangObjectNull) ? (viewTubiControllerRemainingTime.getResources().getString(R.string.controller_time_position_text_default)) : (controllerMediaRemainInStringGet));
        }
        if ((dirtyFlags_1 & 0x440400L) != 0) {

                if (controller != null) {
                    // read controller.mediaEnded
                    controllerMediaEnded = controller.mediaEnded;
                }
                updateRegistration(13, controllerMediaEnded);


                if (controllerMediaEnded != null) {
                    // read controller.mediaEnded.get()
                    controllerMediaEndedGet = controllerMediaEnded.get();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get())
                androidxDatabindingViewDataBindingSafeUnboxControllerMediaEndedGet = androidx.databinding.ViewDataBinding.safeUnbox(controllerMediaEndedGet);


                // read androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false
                controllerMediaEndedBooleanFalse = (androidxDatabindingViewDataBindingSafeUnboxControllerMediaEndedGet) == (false);
        }
        if ((dirtyFlags & 0x6000004L) != 0) {

                // read controller.mediaPositionInString.get() == null ? @android:string/controller_time_position_text_default : controller.mediaPositionInString.get()
                controllerMediaPositionInStringJavaLangObjectNullViewTubiControllerElapsedTimeAndroidStringControllerTimePositionTextDefaultControllerMediaPositionInString = ((controllerMediaPositionInStringJavaLangObjectNull) ? (viewTubiControllerElapsedTime.getResources().getString(R.string.controller_time_position_text_default)) : (controllerMediaPositionInStringGet));
        }
        if ((dirtyFlags & 0x8000000000L) != 0) {

                // read controller.playerPlaybackState.get() == ExoPlayer.STATE_ENDED
                controllerPlayerPlaybackStateExoPlayerSTATEENDED = (controllerPlayerPlaybackStateGet) == (com.google.android.exoplayer2.ExoPlayer.STATE_ENDED);
        }
        if ((dirtyFlags_1 & 0x100400000000L) != 0) {

                if (controller != null) {
                    // read controller.isCurrentAd
                    ControllerIsCurrentAd1 = controller.isCurrentAd;
                }
                updateRegistration(18, ControllerIsCurrentAd1);


                if (ControllerIsCurrentAd1 != null) {
                    // read controller.isCurrentAd.get()
                    controllerIsCurrentAdGet = ControllerIsCurrentAd1.get();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get())
                androidxDatabindingViewDataBindingSafeUnboxControllerIsCurrentAdGet = androidx.databinding.ViewDataBinding.safeUnbox(controllerIsCurrentAdGet);
            if((dirtyFlags & 0x6040000L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxControllerIsCurrentAdGet) {
                        dirtyFlags |= 0x40000000L;
                        dirtyFlags |= 0x40000000000000L;
                }
                else {
                        dirtyFlags |= 0x20000000L;
                        dirtyFlags |= 0x20000000000000L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get())
                controllerIsCurrentAd = !androidxDatabindingViewDataBindingSafeUnboxControllerIsCurrentAdGet;
            if((dirtyFlags & 0x6040080L) != 0) {
                if(controllerIsCurrentAd) {
                        dirtyFlags_1 |= 0x400000000000L;
                }
                else {
                        dirtyFlags_1 |= 0x200000000000L;
                }
            }
        }

        if ((dirtyFlags & 0x6040080L) != 0) {

                // read (androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get())) | (androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get())) ? true : controller.mediaType.equals("streaming")
                controllerIsCurrentAdControllerIsPlayerLockedBooleanTrueControllerMediaTypeEqualsJavaLangStringStreaming = ((controllerIsCurrentAdControllerIsPlayerLocked) ? (true) : (controllerMediaTypeEqualsJavaLangStringStreaming));
            if((dirtyFlags & 0x6040080L) != 0) {
                if(controllerIsCurrentAdControllerIsPlayerLockedBooleanTrueControllerMediaTypeEqualsJavaLangStringStreaming) {
                        dirtyFlags_1 |= 0x40000000000L;
                }
                else {
                        dirtyFlags_1 |= 0x20000000000L;
                }
            }


                // read (androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get())) | (androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get())) ? true : controller.mediaType.equals("streaming") ? View.INVISIBLE : View.VISIBLE
                controllerIsCurrentAdControllerIsPlayerLockedBooleanTrueControllerMediaTypeEqualsJavaLangStringStreamingViewINVISIBLEViewVISIBLE = ((controllerIsCurrentAdControllerIsPlayerLockedBooleanTrueControllerMediaTypeEqualsJavaLangStringStreaming) ? (android.view.View.INVISIBLE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x6100000L) != 0) {

                // read controller.playerPlaybackState.get() == ExoPlayer.STATE_IDLE ? true : controller.playerPlaybackState.get() == ExoPlayer.STATE_ENDED
                controllerPlayerPlaybackStateExoPlayerSTATEIDLEBooleanTrueControllerPlayerPlaybackStateExoPlayerSTATEENDED = ((controllerPlayerPlaybackStateExoPlayerSTATEIDLE) ? (true) : (controllerPlayerPlaybackStateExoPlayerSTATEENDED));
            if((dirtyFlags & 0x6100000L) != 0) {
                if(controllerPlayerPlaybackStateExoPlayerSTATEIDLEBooleanTrueControllerPlayerPlaybackStateExoPlayerSTATEENDED) {
                        dirtyFlags |= 0x10000000L;
                }
                else {
                        dirtyFlags |= 0x8000000L;
                }
            }


                // read controller.playerPlaybackState.get() == ExoPlayer.STATE_IDLE ? true : controller.playerPlaybackState.get() == ExoPlayer.STATE_ENDED ? View.VISIBLE : View.GONE
                controllerPlayerPlaybackStateExoPlayerSTATEIDLEBooleanTrueControllerPlayerPlaybackStateExoPlayerSTATEENDEDViewVISIBLEViewGONE = ((controllerPlayerPlaybackStateExoPlayerSTATEIDLEBooleanTrueControllerPlayerPlaybackStateExoPlayerSTATEENDED) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x6000408L) != 0) {

                // read controller.isCue ? androidx.databinding.ViewDataBinding.safeUnbox(controller.playerReady.get()) : false
                controllerIsCueControllerPlayerReadyBooleanFalse = ((controllerIsCue) ? (androidxDatabindingViewDataBindingSafeUnboxControllerPlayerReadyGet) : (false));
            if((dirtyFlags & 0x6000408L) != 0) {
                if(controllerIsCueControllerPlayerReadyBooleanFalse) {
                        dirtyFlags_1 |= 0x4000L;
                }
                else {
                        dirtyFlags_1 |= 0x2000L;
                }
            }
        }
        if ((dirtyFlags & 0x6042080L) != 0) {

                // read ((controller.mediaType.equals("0")) | (controller.mediaType.equals("1"))) | (controller.mediaType.equals("anime")) ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false
                controllerMediaTypeEqualsJavaLangString0ControllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnimeControllerMediaEndedBooleanFalseBooleanFalse = ((controllerMediaTypeEqualsJavaLangString0ControllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnime) ? (controllerMediaEndedBooleanFalse) : (false));
                // read controller.mediaType.equals("0") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false
                controllerMediaTypeEqualsJavaLangString0ControllerMediaEndedBooleanFalseBooleanFalse = ((controllerMediaTypeEqualsJavaLangString0) ? (controllerMediaEndedBooleanFalse) : (false));
                // read (controller.mediaType.equals("1")) | (controller.mediaType.equals("anime")) ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false
                controllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnimeControllerMediaEndedBooleanFalseBooleanFalse = ((controllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnime) ? (controllerMediaEndedBooleanFalse) : (false));
            if((dirtyFlags & 0x6042080L) != 0) {
                if(controllerMediaTypeEqualsJavaLangString0ControllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnimeControllerMediaEndedBooleanFalseBooleanFalse) {
                        dirtyFlags |= 0x1000000000000L;
                }
                else {
                        dirtyFlags |= 0x800000000000L;
                }
            }
            if((dirtyFlags & 0x6042080L) != 0) {
                if(controllerMediaTypeEqualsJavaLangString0ControllerMediaEndedBooleanFalseBooleanFalse) {
                        dirtyFlags_1 |= 0x10000L;
                }
                else {
                        dirtyFlags_1 |= 0x8000L;
                }
            }
            if((dirtyFlags & 0x6042080L) != 0) {
                if(controllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnimeControllerMediaEndedBooleanFalseBooleanFalse) {
                        dirtyFlags_1 |= 0x1000000L;
                }
                else {
                        dirtyFlags_1 |= 0x800000L;
                }
            }
        }
        if ((dirtyFlags & 0x6840000L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(controller.isMediaHasSkipRecap.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false
                controllerIsMediaHasSkipRecapControllerIsCurrentAdBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxControllerIsMediaHasSkipRecapGet) ? (controllerIsCurrentAd) : (false));
            if((dirtyFlags & 0x6840000L) != 0) {
                if(controllerIsMediaHasSkipRecapControllerIsCurrentAdBooleanFalse) {
                        dirtyFlags |= 0x100000000000000L;
                }
                else {
                        dirtyFlags |= 0x80000000000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controller.isMediaHasSkipRecap.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false ? View.VISIBLE : View.INVISIBLE
                controllerIsMediaHasSkipRecapControllerIsCurrentAdBooleanFalseViewVISIBLEViewINVISIBLE = ((controllerIsMediaHasSkipRecapControllerIsCurrentAdBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
        }
        if ((dirtyFlags & 0x6050000L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaHasSubstitle.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false
                controllerMediaHasSubstitleControllerIsCurrentAdBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxControllerMediaHasSubstitleGet) ? (controllerIsCurrentAd) : (false));
            if((dirtyFlags & 0x6050000L) != 0) {
                if(controllerMediaHasSubstitleControllerIsCurrentAdBooleanFalse) {
                        dirtyFlags_1 |= 0x10000000L;
                }
                else {
                        dirtyFlags_1 |= 0x8000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaHasSubstitle.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false ? View.VISIBLE : View.GONE
                controllerMediaHasSubstitleControllerIsCurrentAdBooleanFalseViewVISIBLEViewGONE = ((controllerMediaHasSubstitleControllerIsCurrentAdBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished

        if ((dirtyFlags & 0x1000000000000L) != 0) {

                if (controller != null) {
                    // read controller.isPlayerLocked
                    controllerIsPlayerLocked = controller.isPlayerLocked;
                }
                updateRegistration(7, controllerIsPlayerLocked);


                if (controllerIsPlayerLocked != null) {
                    // read controller.isPlayerLocked.get()
                    controllerIsPlayerLockedGet = controllerIsPlayerLocked.get();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get())
                androidxDatabindingViewDataBindingSafeUnboxControllerIsPlayerLockedGet = androidx.databinding.ViewDataBinding.safeUnbox(controllerIsPlayerLockedGet);


                // read !androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get())
                ControllerIsPlayerLocked1 = !androidxDatabindingViewDataBindingSafeUnboxControllerIsPlayerLockedGet;
        }
        if ((dirtyFlags_1 & 0x4000L) != 0) {

                if (controller != null) {
                    // read controller.settingReady
                    controllerSettingReady = controller.settingReady;
                }
                updateRegistration(10, controllerSettingReady);


                if (controllerSettingReady != null) {
                    // read controller.settingReady.get()
                    controllerSettingReadyGet = controllerSettingReady.get();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controller.settingReady.get())
                androidxDatabindingViewDataBindingSafeUnboxControllerSettingReadyGet = androidx.databinding.ViewDataBinding.safeUnbox(controllerSettingReadyGet);
        }
        if ((dirtyFlags & 0x100000000000L) != 0) {

                if (controller != null) {
                    // read controller.mediaEnded
                    controllerMediaEnded = controller.mediaEnded;
                }
                updateRegistration(13, controllerMediaEnded);


                if (controllerMediaEnded != null) {
                    // read controller.mediaEnded.get()
                    controllerMediaEndedGet = controllerMediaEnded.get();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get())
                androidxDatabindingViewDataBindingSafeUnboxControllerMediaEndedGet = androidx.databinding.ViewDataBinding.safeUnbox(controllerMediaEndedGet);


                // read androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false
                controllerMediaEndedBooleanFalse = (androidxDatabindingViewDataBindingSafeUnboxControllerMediaEndedGet) == (false);
        }
        if ((dirtyFlags_1 & 0x1010000L) != 0) {

                if (controller != null) {
                    // read controller.isCurrentAd
                    ControllerIsCurrentAd1 = controller.isCurrentAd;
                }
                updateRegistration(18, ControllerIsCurrentAd1);


                if (ControllerIsCurrentAd1 != null) {
                    // read controller.isCurrentAd.get()
                    controllerIsCurrentAdGet = ControllerIsCurrentAd1.get();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get())
                androidxDatabindingViewDataBindingSafeUnboxControllerIsCurrentAdGet = androidx.databinding.ViewDataBinding.safeUnbox(controllerIsCurrentAdGet);
            if((dirtyFlags & 0x6040000L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxControllerIsCurrentAdGet) {
                        dirtyFlags |= 0x40000000L;
                        dirtyFlags |= 0x40000000000000L;
                }
                else {
                        dirtyFlags |= 0x20000000L;
                        dirtyFlags |= 0x20000000000000L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get())
                controllerIsCurrentAd = !androidxDatabindingViewDataBindingSafeUnboxControllerIsCurrentAdGet;
            if((dirtyFlags & 0x6040080L) != 0) {
                if(controllerIsCurrentAd) {
                        dirtyFlags_1 |= 0x400000000000L;
                }
                else {
                        dirtyFlags_1 |= 0x200000000000L;
                }
            }
        }

        if ((dirtyFlags & 0x6042000L) != 0) {

                // read controller.mediaType.equals("streaming") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false
                controllerMediaTypeEqualsJavaLangStringStreamingControllerMediaEndedBooleanFalseBooleanFalse = ((controllerMediaTypeEqualsJavaLangStringStreaming) ? (controllerMediaEndedBooleanFalse) : (false));
            if((dirtyFlags & 0x6042000L) != 0) {
                if(controllerMediaTypeEqualsJavaLangStringStreamingControllerMediaEndedBooleanFalseBooleanFalse) {
                        dirtyFlags |= 0x4000000000000000L;
                }
                else {
                        dirtyFlags |= 0x2000000000000000L;
                }
            }
        }
        if ((dirtyFlags & 0x6042080L) != 0) {

                // read ((controller.mediaType.equals("0")) | (controller.mediaType.equals("1"))) | (controller.mediaType.equals("anime")) ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get()) : false
                controllerMediaTypeEqualsJavaLangString0ControllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnimeControllerMediaEndedBooleanFalseBooleanFalseControllerIsPlayerLockedBooleanFalse = ((controllerMediaTypeEqualsJavaLangString0ControllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnimeControllerMediaEndedBooleanFalseBooleanFalse) ? (ControllerIsPlayerLocked1) : (false));
                // read controller.mediaType.equals("0") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false
                controllerMediaTypeEqualsJavaLangString0ControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalse = ((controllerMediaTypeEqualsJavaLangString0ControllerMediaEndedBooleanFalseBooleanFalse) ? (controllerIsCurrentAd) : (false));
                // read (controller.mediaType.equals("1")) | (controller.mediaType.equals("anime")) ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false
                controllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnimeControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalse = ((controllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnimeControllerMediaEndedBooleanFalseBooleanFalse) ? (controllerIsCurrentAd) : (false));
            if((dirtyFlags & 0x6042080L) != 0) {
                if(controllerMediaTypeEqualsJavaLangString0ControllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnimeControllerMediaEndedBooleanFalseBooleanFalseControllerIsPlayerLockedBooleanFalse) {
                        dirtyFlags |= 0x1000000000000000L;
                }
                else {
                        dirtyFlags |= 0x800000000000000L;
                }
            }
            if((dirtyFlags & 0x6042080L) != 0) {
                if(controllerMediaTypeEqualsJavaLangString0ControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalse) {
                        dirtyFlags_1 |= 0x100000000L;
                }
                else {
                        dirtyFlags_1 |= 0x80000000L;
                }
            }
            if((dirtyFlags & 0x6042080L) != 0) {
                if(controllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnimeControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalse) {
                        dirtyFlags_1 |= 0x1000L;
                }
                else {
                        dirtyFlags_1 |= 0x800L;
                }
            }
        }
        if ((dirtyFlags & 0x6000408L) != 0) {

                // read controller.isCue ? androidx.databinding.ViewDataBinding.safeUnbox(controller.playerReady.get()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(controller.settingReady.get()) : false
                controllerIsCueControllerPlayerReadyBooleanFalseControllerSettingReadyBooleanFalse = ((controllerIsCueControllerPlayerReadyBooleanFalse) ? (androidxDatabindingViewDataBindingSafeUnboxControllerSettingReadyGet) : (false));
            if((dirtyFlags & 0x6000408L) != 0) {
                if(controllerIsCueControllerPlayerReadyBooleanFalseControllerSettingReadyBooleanFalse) {
                        dirtyFlags_1 |= 0x100000L;
                }
                else {
                        dirtyFlags_1 |= 0x80000L;
                }
            }


                // read controller.isCue ? androidx.databinding.ViewDataBinding.safeUnbox(controller.playerReady.get()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(controller.settingReady.get()) : false ? View.VISIBLE : View.GONE
                controllerIsCueControllerPlayerReadyBooleanFalseControllerSettingReadyBooleanFalseViewVISIBLEViewGONE = ((controllerIsCueControllerPlayerReadyBooleanFalseControllerSettingReadyBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished

        if ((dirtyFlags_1 & 0x100001000L) != 0) {

                if (controller != null) {
                    // read controller.isPlayerLocked
                    controllerIsPlayerLocked = controller.isPlayerLocked;
                }
                updateRegistration(7, controllerIsPlayerLocked);


                if (controllerIsPlayerLocked != null) {
                    // read controller.isPlayerLocked.get()
                    controllerIsPlayerLockedGet = controllerIsPlayerLocked.get();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get())
                androidxDatabindingViewDataBindingSafeUnboxControllerIsPlayerLockedGet = androidx.databinding.ViewDataBinding.safeUnbox(controllerIsPlayerLockedGet);


                // read !androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get())
                ControllerIsPlayerLocked1 = !androidxDatabindingViewDataBindingSafeUnboxControllerIsPlayerLockedGet;
        }
        if ((dirtyFlags & 0x5000000000000000L) != 0) {

                if (controller != null) {
                    // read controller.isCurrentAd
                    ControllerIsCurrentAd1 = controller.isCurrentAd;
                }
                updateRegistration(18, ControllerIsCurrentAd1);


                if (ControllerIsCurrentAd1 != null) {
                    // read controller.isCurrentAd.get()
                    controllerIsCurrentAdGet = ControllerIsCurrentAd1.get();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get())
                androidxDatabindingViewDataBindingSafeUnboxControllerIsCurrentAdGet = androidx.databinding.ViewDataBinding.safeUnbox(controllerIsCurrentAdGet);
            if((dirtyFlags & 0x6040000L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxControllerIsCurrentAdGet) {
                        dirtyFlags |= 0x40000000L;
                        dirtyFlags |= 0x40000000000000L;
                }
                else {
                        dirtyFlags |= 0x20000000L;
                        dirtyFlags |= 0x20000000000000L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get())
                controllerIsCurrentAd = !androidxDatabindingViewDataBindingSafeUnboxControllerIsCurrentAdGet;
            if((dirtyFlags & 0x6040080L) != 0) {
                if(controllerIsCurrentAd) {
                        dirtyFlags_1 |= 0x400000000000L;
                }
                else {
                        dirtyFlags_1 |= 0x200000000000L;
                }
            }
        }

        if ((dirtyFlags & 0x6042080L) != 0) {

                // read ((controller.mediaType.equals("0")) | (controller.mediaType.equals("1"))) | (controller.mediaType.equals("anime")) ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false
                controllerMediaTypeEqualsJavaLangString0ControllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnimeControllerMediaEndedBooleanFalseBooleanFalseControllerIsPlayerLockedBooleanFalseControllerIsCurrentAdBooleanFalse = ((controllerMediaTypeEqualsJavaLangString0ControllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnimeControllerMediaEndedBooleanFalseBooleanFalseControllerIsPlayerLockedBooleanFalse) ? (controllerIsCurrentAd) : (false));
                // read (controller.mediaType.equals("1")) | (controller.mediaType.equals("anime")) ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get()) : false
                controllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnimeControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalseControllerIsPlayerLockedBooleanFalse = ((controllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnimeControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalse) ? (ControllerIsPlayerLocked1) : (false));
                // read controller.mediaType.equals("0") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get()) : false
                controllerMediaTypeEqualsJavaLangString0ControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalseControllerIsPlayerLockedBooleanFalse = ((controllerMediaTypeEqualsJavaLangString0ControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalse) ? (ControllerIsPlayerLocked1) : (false));
            if((dirtyFlags & 0x6042080L) != 0) {
                if(controllerMediaTypeEqualsJavaLangString0ControllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnimeControllerMediaEndedBooleanFalseBooleanFalseControllerIsPlayerLockedBooleanFalseControllerIsCurrentAdBooleanFalse) {
                        dirtyFlags_1 |= 0x10000000000L;
                }
                else {
                        dirtyFlags_1 |= 0x8000000000L;
                }
            }
            if((dirtyFlags & 0x6042080L) != 0) {
                if(controllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnimeControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalseControllerIsPlayerLockedBooleanFalse) {
                        dirtyFlags |= 0x4000000000L;
                }
                else {
                        dirtyFlags |= 0x2000000000L;
                }
            }
            if((dirtyFlags & 0x6042080L) != 0) {
                if(controllerMediaTypeEqualsJavaLangString0ControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalseControllerIsPlayerLockedBooleanFalse) {
                        dirtyFlags |= 0x10000000000000L;
                        dirtyFlags_1 |= 0x1000000000L;
                }
                else {
                        dirtyFlags |= 0x8000000000000L;
                        dirtyFlags_1 |= 0x800000000L;
                }
            }


                // read ((controller.mediaType.equals("0")) | (controller.mediaType.equals("1"))) | (controller.mediaType.equals("anime")) ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false ? View.VISIBLE : View.INVISIBLE
                controllerMediaTypeEqualsJavaLangString0ControllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnimeControllerMediaEndedBooleanFalseBooleanFalseControllerIsPlayerLockedBooleanFalseControllerIsCurrentAdBooleanFalseViewVISIBLEViewINVISIBLE = ((controllerMediaTypeEqualsJavaLangString0ControllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnimeControllerMediaEndedBooleanFalseBooleanFalseControllerIsPlayerLockedBooleanFalseControllerIsCurrentAdBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
                // read (controller.mediaType.equals("1")) | (controller.mediaType.equals("anime")) ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get()) : false ? View.VISIBLE : View.INVISIBLE
                controllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnimeControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalseControllerIsPlayerLockedBooleanFalseViewVISIBLEViewINVISIBLE = ((controllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnimeControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalseControllerIsPlayerLockedBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
                // read controller.mediaType.equals("0") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get()) : false ? View.VISIBLE : View.GONE
                controllerMediaTypeEqualsJavaLangString0ControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalseControllerIsPlayerLockedBooleanFalseViewVISIBLEViewGONE = ((controllerMediaTypeEqualsJavaLangString0ControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalseControllerIsPlayerLockedBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read controller.mediaType.equals("0") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get()) : false ? View.VISIBLE : View.INVISIBLE
                controllerMediaTypeEqualsJavaLangString0ControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalseControllerIsPlayerLockedBooleanFalseViewVISIBLEViewINVISIBLE = ((controllerMediaTypeEqualsJavaLangString0ControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalseControllerIsPlayerLockedBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
        }
        if ((dirtyFlags & 0x6042000L) != 0) {

                // read controller.mediaType.equals("streaming") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false
                controllerMediaTypeEqualsJavaLangStringStreamingControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalse = ((controllerMediaTypeEqualsJavaLangStringStreamingControllerMediaEndedBooleanFalseBooleanFalse) ? (controllerIsCurrentAd) : (false));
            if((dirtyFlags & 0x6042000L) != 0) {
                if(controllerMediaTypeEqualsJavaLangStringStreamingControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalse) {
                        dirtyFlags |= 0x400000000000000L;
                        dirtyFlags_1 |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x200000000000000L;
                        dirtyFlags_1 |= 0x20L;
                }
            }


                // read controller.mediaType.equals("streaming") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false ? View.VISIBLE : View.GONE
                controllerMediaTypeEqualsJavaLangStringStreamingControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalseViewVISIBLEViewGONE = ((controllerMediaTypeEqualsJavaLangStringStreamingControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read controller.mediaType.equals("streaming") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false ? View.VISIBLE : View.INVISIBLE
                controllerMediaTypeEqualsJavaLangStringStreamingControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalseViewVISIBLEViewINVISIBLE = ((controllerMediaTypeEqualsJavaLangStringStreamingControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
        }
        // batch finished

        if ((dirtyFlags & 0x6040080L) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get()) : false
                controllerIsCurrentAdControllerIsPlayerLockedBooleanFalse = ((controllerIsCurrentAd) ? (ControllerIsPlayerLocked1) : (false));
            if((dirtyFlags & 0x6040080L) != 0) {
                if(controllerIsCurrentAdControllerIsPlayerLockedBooleanFalse) {
                        dirtyFlags |= 0x1000000000L;
                        dirtyFlags |= 0x4000000000000L;
                }
                else {
                        dirtyFlags |= 0x800000000L;
                        dirtyFlags |= 0x2000000000000L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get()) : false ? View.VISIBLE : View.GONE
                controllerIsCurrentAdControllerIsPlayerLockedBooleanFalseViewVISIBLEViewGONE = ((controllerIsCurrentAdControllerIsPlayerLockedBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished

        if ((dirtyFlags & 0x6040080L) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get()) : false ? (controller.mediaType.equals("1")) | (controller.mediaType.equals("anime")) : false
                controllerIsCurrentAdControllerIsPlayerLockedBooleanFalseControllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnimeBooleanFalse = ((controllerIsCurrentAdControllerIsPlayerLockedBooleanFalse) ? (controllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnime) : (false));
            if((dirtyFlags & 0x6040080L) != 0) {
                if(controllerIsCurrentAdControllerIsPlayerLockedBooleanFalseControllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnimeBooleanFalse) {
                        dirtyFlags_1 |= 0x1L;
                }
                else {
                        dirtyFlags |= 0x8000000000000000L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get()) : false ? (controller.mediaType.equals("1")) | (controller.mediaType.equals("anime")) : false ? View.VISIBLE : View.GONE
                controllerIsCurrentAdControllerIsPlayerLockedBooleanFalseControllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnimeBooleanFalseViewVISIBLEViewGONE = ((controllerIsCurrentAdControllerIsPlayerLockedBooleanFalseControllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnimeBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x6400000L) != 0) {
            // api target 1

            this.autoplaySwitch.setChecked(androidxDatabindingViewDataBindingSafeUnboxControllerIsAutoPlayEnabledGet);
            com.easyplex.ui.player.views.AutoPlaymageButton.onStateChanged(this.mboundView7, androidxDatabindingViewDataBindingSafeUnboxControllerIsAutoPlayEnabledGet);
        }
        if ((dirtyFlags & 0x4000000L) != 0) {
            // api target 1

            this.autoplaySwitch.setOnClickListener(mCallback5);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.autoplaySwitch, mCallback4, (androidx.databinding.InverseBindingListener)null);
            this.mboundView23.setOnClickListener(mCallback19);
            this.mboundView24.setOnClickListener(mCallback20);
            this.mboundView26.setOnClickListener(mCallback22);
            this.mboundView27.setOnClickListener(mCallback23);
            this.mboundView29.setOnClickListener(mCallback25);
            this.mboundView30.setOnClickListener(mCallback26);
            this.mboundView32.setOnClickListener(mCallback28);
            this.mboundView33.setOnClickListener(mCallback29);
            this.mboundView41.setOnClickListener(mCallback37);
            this.mboundView42.setOnClickListener(mCallback38);
            this.mboundView44.setOnClickListener(mCallback40);
            this.mboundView45.setOnClickListener(mCallback41);
            this.mboundView47.setOnClickListener(mCallback43);
            this.mboundView48.setOnClickListener(mCallback44);
            this.mboundView50.setOnClickListener(mCallback46);
            this.mboundView51.setOnClickListener(mCallback47);
            this.mboundView53.setOnClickListener(mCallback49);
            this.mboundView54.setOnClickListener(mCallback50);
            this.mboundView57.setOnClickListener(mCallback53);
            this.mboundView58.setOnClickListener(mCallback54);
            this.movieSkipFramelayout.setOnClickListener(mCallback56);
            this.playerLockedIcon.setOnClickListener(mCallback52);
            this.unlockBtnSecond.setOnClickListener(mCallback51);
            this.viewAudioMovie.setOnClickListener(mCallback45);
            this.viewAudioStreaming.setOnClickListener(mCallback48);
            this.viewEpisodes.setOnClickListener(mCallback30);
            this.viewLockMovie.setOnClickListener(mCallback21);
            this.viewLockSerie.setOnClickListener(mCallback24);
            this.viewMoviesList.setOnClickListener(mCallback39);
            this.viewMoviesListTv.setOnClickListener(mCallback36);
            this.viewNextEpisode.setOnClickListener(mCallback42);
            this.viewRestartMovie.setOnClickListener(mCallback18);
            this.viewSpeedStreaming.setOnClickListener(mCallback27);
            this.viewStreaming.setOnClickListener(mCallback33);
            this.viewSubstitlesAuto.setOnClickListener(mCallback12);
            this.viewSubstitlesAutoMovies.setOnClickListener(mCallback15);
            this.viewTubiControllerAppSettings.setOnClickListener(mCallback8);
            this.viewTubiControllerClose.setOnClickListener(mCallback3);
            this.viewTubiControllerEpisodes.setOnClickListener(mCallback31);
            this.viewTubiControllerEpisodesText.setOnClickListener(mCallback32);
            this.viewTubiControllerForwardIb.setOnClickListener(mCallback11);
            this.viewTubiControllerPlayToggleIb.setOnClickListener(mCallback10);
            this.viewTubiControllerRewindIb.setOnClickListener(mCallback9);
            this.viewTubiControllerScaleIb.setOnClickListener(mCallback7);
            this.viewTubiControllerSeekBar.setOnTouchListener(mCallback55);
            this.viewTubiControllerStreaming.setOnClickListener(mCallback34);
            this.viewTubiControllerStreamingText.setOnClickListener(mCallback35);
            this.viewTubiControllerSubstitleCurentLang.setOnClickListener(mCallback14);
            this.viewTubiControllerSubstitleCurentLangMovies.setOnClickListener(mCallback17);
            this.viewTubiControllerSubstitlesIcon.setOnClickListener(mCallback13);
            this.viewTubiControllerSubstitlesIconMovies.setOnClickListener(mCallback16);
            this.viewTubiControllerSubtitlesIb.setOnClickListener(mCallback6);
        }
        if ((dirtyFlags & 0x6000001L) != 0) {
            // api target 1

            com.easyplex.data.local.entity.Media.loadImage(this.exoArtwork, controllerCurrentMediaCoverGet);
            com.easyplex.data.local.entity.Media.loadImage(this.imageViewMovieNext, controllerCurrentMediaCoverGet);
        }
        if ((dirtyFlags & 0x6100000L) != 0) {
            // api target 1

            this.exoArtwork.setVisibility(controllerPlayerPlaybackStateExoPlayerSTATEIDLEBooleanTrueControllerPlayerPlaybackStateExoPlayerSTATEENDEDViewVISIBLEViewGONE);
            com.tubitv.ui.TubiLoadingView.onTubiLoadingViewToggle(this.viewTubiControllerLoading, controllerPlayerPlaybackStateExoPlayerSTATEBUFFERINGBooleanTrueControllerPlayerPlaybackStateExoPlayerSTATEIDLE);
        }
        if ((dirtyFlags & 0x6000408L) != 0) {
            // api target 1

            this.mboundView0.setVisibility(controllerIsCueControllerPlayerReadyBooleanFalseControllerSettingReadyBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x6000020L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView33, controllerCurrentSpeedGet);
        }
        if ((dirtyFlags & 0x6000040L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView42, controllerMediaTypeNameGet);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView45, controllerMediaTypeNameGet);
        }
        if ((dirtyFlags & 0x6040080L) != 0) {
            // api target 1

            this.mboundView57.setVisibility(ControllerIsCurrentAdControllerIsPlayerLockedViewGONEViewVISIBLE1);
            this.mboundView58.setVisibility(ControllerIsCurrentAdControllerIsPlayerLockedViewGONEViewVISIBLE1);
            this.playerLockedIcon.setVisibility(ControllerIsCurrentAdControllerIsPlayerLockedViewGONEViewVISIBLE1);
            this.viewEpisodes.setVisibility(controllerIsCurrentAdControllerIsPlayerLockedBooleanFalseControllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnimeBooleanFalseViewVISIBLEViewGONE);
            this.viewLockSerie.setVisibility(controllerIsCurrentAdControllerIsPlayerLockedBooleanFalseControllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnimeBooleanFalseViewVISIBLEViewGONE);
            this.viewMoviesListTv.setVisibility(controllerIsCurrentAdControllerIsPlayerLockedBooleanFalseControllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnimeBooleanFalseViewVISIBLEViewGONE);
            this.viewNextEpisode.setVisibility(controllerIsCurrentAdControllerIsPlayerLockedBooleanFalseControllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnimeBooleanFalseViewVISIBLEViewGONE);
            this.viewSubstitlesAuto.setVisibility(controllerIsCurrentAdControllerIsPlayerLockedBooleanFalseControllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnimeBooleanFalseViewVISIBLEViewGONE);
            this.viewTubiControllerAppSettings.setVisibility(controllerIsCurrentAdControllerIsPlayerLockedViewGONEViewVISIBLE);
            this.viewTubiControllerClose.setVisibility(controllerIsCurrentAdControllerIsPlayerLockedBooleanFalseViewVISIBLEViewGONE);
            this.viewTubiControllerElapsedTime.setVisibility(controllerIsCurrentAdControllerIsPlayerLockedBooleanTrueControllerMediaTypeEqualsJavaLangStringStreamingViewINVISIBLEViewVISIBLE);
            this.viewTubiControllerForwardIb.setVisibility(controllerIsCurrentAdControllerIsPlayerLockedBooleanTrueControllerMediaTypeEqualsJavaLangStringStreamingViewINVISIBLEViewVISIBLE);
            this.viewTubiControllerRemainingTime.setVisibility(controllerIsCurrentAdControllerIsPlayerLockedBooleanTrueControllerMediaTypeEqualsJavaLangStringStreamingViewINVISIBLEViewVISIBLE);
            this.viewTubiControllerRewindIb.setVisibility(controllerIsCurrentAdControllerIsPlayerLockedViewGONEViewVISIBLE);
            this.viewTubiControllerScaleIb.setVisibility(controllerIsCurrentAdControllerIsPlayerLockedViewGONEViewVISIBLE);
            this.viewTubiControllerSeekBar.setVisibility(controllerIsCurrentAdControllerIsPlayerLockedBooleanTrueControllerMediaTypeEqualsJavaLangStringStreamingViewINVISIBLEViewVISIBLE);
        }
        if ((dirtyFlags & 0x6000002L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView65, controllerVideoNameGet);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.viewTubiControllerSecondTitle, controllerVideoNameGet);
        }
        if ((dirtyFlags & 0x6840000L) != 0) {
            // api target 1

            this.movieSkipFramelayout.setVisibility(controllerIsMediaHasSkipRecapControllerIsCurrentAdBooleanFalseViewVISIBLEViewINVISIBLE);
        }
        if ((dirtyFlags & 0x6040000L) != 0) {
            // api target 1

            this.nextPlayFramelayout.setVisibility(controllerIsCurrentAdViewVISIBLEViewINVISIBLE);
            this.progressBar.setVisibility(controllerIsCurrentAdViewVISIBLEViewINVISIBLE);
            this.viewTubiControllerTitle.setVisibility(controllerIsCurrentAdViewINVISIBLEViewVISIBLE);
        }
        if ((dirtyFlags & 0x6080000L) != 0) {
            // api target 1

            this.progressBar.setMax(intControllerMediaDuration);
            this.viewTubiControllerSeekBar.setMax(intControllerMediaDuration);
        }
        if ((dirtyFlags & 0x6020000L) != 0) {
            // api target 1

            this.progressBar.setProgress(intControllerMediaCurrentTime);
            androidx.databinding.adapters.SeekBarBindingAdapter.setProgress(this.viewTubiControllerSeekBar, intControllerMediaCurrentTime);
        }
        if ((dirtyFlags & 0x6000800L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewVideoTimeRemaining, controllerAdsRemainInStringGet);
        }
        if ((dirtyFlags & 0x6240000L) != 0) {
            // api target 1

            this.unlockBtnSecond.setVisibility(controllerIsCurrentAdControllerIsPlayerLocked2ViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x6042080L) != 0) {
            // api target 1

            this.viewAudioMovie.setVisibility(controllerMediaTypeEqualsJavaLangString0ControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalseControllerIsPlayerLockedBooleanFalseViewVISIBLEViewINVISIBLE);
            this.viewAutoPlay.setVisibility(controllerMediaTypeEqualsJavaLangString0ControllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnimeControllerMediaEndedBooleanFalseBooleanFalseControllerIsPlayerLockedBooleanFalseControllerIsCurrentAdBooleanFalseViewVISIBLEViewINVISIBLE);
            this.viewLockMovie.setVisibility(controllerMediaTypeEqualsJavaLangString0ControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalseControllerIsPlayerLockedBooleanFalseViewVISIBLEViewGONE);
            this.viewMoviesList.setVisibility(controllerMediaTypeEqualsJavaLangString0ControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalseControllerIsPlayerLockedBooleanFalseViewVISIBLEViewGONE);
            this.viewRestartMovie.setVisibility(controllerMediaTypeEqualsJavaLangString0ControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalseControllerIsPlayerLockedBooleanFalseViewVISIBLEViewINVISIBLE);
            this.viewSubstitlesAutoMovies.setVisibility(controllerMediaTypeEqualsJavaLangString0ControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalseControllerIsPlayerLockedBooleanFalseViewVISIBLEViewINVISIBLE);
            this.viewTubiControllerSecondTitle.setVisibility(controllerMediaTypeEqualsJavaLangString1ControllerMediaTypeEqualsJavaLangStringAnimeControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalseControllerIsPlayerLockedBooleanFalseViewVISIBLEViewINVISIBLE);
        }
        if ((dirtyFlags & 0x6042000L) != 0) {
            // api target 1

            this.viewAudioStreaming.setVisibility(controllerMediaTypeEqualsJavaLangStringStreamingControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalseViewVISIBLEViewINVISIBLE);
            this.viewSpeedStreaming.setVisibility(controllerMediaTypeEqualsJavaLangStringStreamingControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalseViewVISIBLEViewINVISIBLE);
            this.viewStreaming.setVisibility(controllerMediaTypeEqualsJavaLangStringStreamingControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x6001000L) != 0) {
            // api target 1

            this.viewIslive.setVisibility(controllerIsLiveViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x6000004L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.viewTubiControllerElapsedTime, controllerMediaPositionInStringJavaLangObjectNullViewTubiControllerElapsedTimeAndroidStringControllerTimePositionTextDefaultControllerMediaPositionInString);
        }
        if ((dirtyFlags & 0x6100080L) != 0) {
            // api target 1

            this.viewTubiControllerPlayToggleIb.setVisibility(controllerPlayerPlaybackStateExoPlayerSTATEBUFFERINGControllerIsPlayerLockedViewINVISIBLEViewVISIBLE);
        }
        if ((dirtyFlags & 0x7000000L) != 0) {
            // api target 1

            com.easyplex.ui.player.views.PlayStateImageButton.onStateChanged(this.viewTubiControllerPlayToggleIb, controllerIsVideoPlayWhenReadyGet);
        }
        if ((dirtyFlags & 0x6004000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.viewTubiControllerRemainingTime, controllerMediaRemainInStringJavaLangObjectNullViewTubiControllerRemainingTimeAndroidStringControllerTimePositionTextDefaultControllerMediaRemainInString);
        }
        if ((dirtyFlags & 0x6000100L) != 0) {
            // api target 1

            this.viewTubiControllerSeekBar.setSecondaryProgress(intControllerMediaBufferedPosition);
        }
        if ((dirtyFlags & 0x6000000L) != 0) {
            // api target 1

            androidx.databinding.adapters.SeekBarBindingAdapter.setOnSeekBarChangeListener(this.viewTubiControllerSeekBar, (androidx.databinding.adapters.SeekBarBindingAdapter.OnStartTrackingTouch)controllerOnStartTrackingTouchAndroidxDatabindingAdaptersSeekBarBindingAdapterOnStartTrackingTouch, (androidx.databinding.adapters.SeekBarBindingAdapter.OnStopTrackingTouch)controllerOnStopTrackingTouchAndroidxDatabindingAdaptersSeekBarBindingAdapterOnStopTrackingTouch, (androidx.databinding.adapters.SeekBarBindingAdapter.OnProgressChanged)controllerOnProgressChangedAndroidxDatabindingAdaptersSeekBarBindingAdapterOnProgressChanged, (androidx.databinding.InverseBindingListener)null);
        }
        if ((dirtyFlags & 0x6000200L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.viewTubiControllerSubstitleCurentLang, controllerVideoCurrentSubsGet);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.viewTubiControllerSubstitleCurentLangMovies, controllerVideoCurrentSubsGet);
        }
        if ((dirtyFlags & 0x6050000L) != 0) {
            // api target 1

            this.viewTubiControllerSubtitlesIb.setVisibility(controllerMediaHasSubstitleControllerIsCurrentAdBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x6000010L) != 0) {
            // api target 1

            com.easyplex.ui.player.views.SubstitleImageButton.onStateChanged(this.viewTubiControllerSubtitlesIb, androidxDatabindingViewDataBindingSafeUnboxControllerMediaSubstitleGetGet);
        }
        if ((dirtyFlags & 0x6008000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.viewTubiControllerTitle, controllerMediaNameSecondaryGet);
        }
    }
    // Listener Stub Implementations
    public static class OnProgressChangedImpl implements androidx.databinding.adapters.SeekBarBindingAdapter.OnProgressChanged{
        private com.easyplex.ui.player.bindings.PlayerController value;
        public OnProgressChangedImpl setValue(com.easyplex.ui.player.bindings.PlayerController value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onProgressChanged(android.widget.SeekBar arg0, int arg1, boolean arg2) {
            this.value.onProgressChanged(arg0, arg1, arg2); 
        }
    }
    public static class OnStartTrackingTouchImpl implements androidx.databinding.adapters.SeekBarBindingAdapter.OnStartTrackingTouch{
        private com.easyplex.ui.player.bindings.PlayerController value;
        public OnStartTrackingTouchImpl setValue(com.easyplex.ui.player.bindings.PlayerController value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onStartTrackingTouch(android.widget.SeekBar arg0) {
            this.value.onStartTrackingTouch(arg0); 
        }
    }
    public static class OnStopTrackingTouchImpl implements androidx.databinding.adapters.SeekBarBindingAdapter.OnStopTrackingTouch{
        private com.easyplex.ui.player.bindings.PlayerController value;
        public OnStopTrackingTouchImpl setValue(com.easyplex.ui.player.bindings.PlayerController value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onStopTrackingTouch(android.widget.SeekBar arg0) {
            this.value.onStopTrackingTouch(arg0); 
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 25: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.clickPlaybackSetting();
                }
                break;
            }
            case 37: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.loadMoviesList();
                }
                break;
            }
            case 13: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.clickOnSubs();
                }
                break;
            }
            case 14: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.clickOnSubs();
                }
                break;
            }
            case 26: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.clickPlaybackSetting();
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {






                    controller.seekBy((-1500) * (10));
                }
                break;
            }
            case 47: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.onTracksMedia();
                }
                break;
            }
            case 23: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.triggerPlayerLocked();
                }
                break;
            }
            case 35: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.loadMoviesList();
                }
                break;
            }
            case 11: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.clickOnSubs();
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.onLoadSide();
                }
                break;
            }
            case 36: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.loadMoviesList();
                }
                break;
            }
            case 12: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.clickOnSubs();
                }
                break;
            }
            case 24: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.triggerPlayerLocked();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.scale();
                }
                break;
            }
            case 45: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.onTracksMedia();
                }
                break;
            }
            case 21: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.triggerPlayerLocked();
                }
                break;
            }
            case 33: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.onLoadStreaming();
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {





                    controller.seekBy((1500) * (10));
                }
                break;
            }
            case 34: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.loadMoviesList();
                }
                break;
            }
            case 46: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.onTracksMedia();
                }
                break;
            }
            case 10: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.clickOnSubs();
                }
                break;
            }
            case 22: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.triggerPlayerLocked();
                }
                break;
            }
            case 43: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.onTracksMedia();
                }
                break;
            }
            case 19: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.triggerPlayerLocked();
                }
                break;
            }
            case 31: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.onLoadStreaming();
                }
                break;
            }
            case 18: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.onLoadFromBeginning();
                }
                break;
            }
            case 32: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.onLoadStreaming();
                }
                break;
            }
            case 44: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.onTracksMedia();
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller.isVideoPlayWhenReady != null
                boolean controllerIsVideoPlayWhenReadyJavaLangObjectNull = false;
                // !controller.isVideoPlayWhenReady.get()
                boolean controllerIsVideoPlayWhenReady = false;
                // controller.isVideoPlayWhenReady
                androidx.databinding.ObservableBoolean ControllerIsVideoPlayWhenReady1 = null;
                // controller.isVideoPlayWhenReady.get()
                boolean controllerIsVideoPlayWhenReadyGet = false;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {




                    ControllerIsVideoPlayWhenReady1 = controller.isVideoPlayWhenReady;

                    controllerIsVideoPlayWhenReadyJavaLangObjectNull = (ControllerIsVideoPlayWhenReady1) != (null);
                    if (controllerIsVideoPlayWhenReadyJavaLangObjectNull) {


                        controllerIsVideoPlayWhenReadyGet = ControllerIsVideoPlayWhenReady1.get();

                        controllerIsVideoPlayWhenReady = !controllerIsVideoPlayWhenReadyGet;

                        controller.triggerPlayOrPause(controllerIsVideoPlayWhenReady);
                    }
                }
                break;
            }
            case 20: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.triggerPlayerLocked();
                }
                break;
            }
            case 41: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.nextEpisode();
                }
                break;
            }
            case 28: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.onLoadEpisodes();
                }
                break;
            }
            case 40: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.nextEpisode();
                }
                break;
            }
            case 54: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.mediaHasSkipRecap();
                }
                break;
            }
            case 30: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.onLoadEpisodes();
                }
                break;
            }
            case 42: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.nextEpisode();
                }
                break;
            }
            case 29: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.onLoadEpisodes();
                }
                break;
            }
            case 50: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.triggerPlayerLocked2();
                }
                break;
            }
            case 38: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.loadMoviesList();
                }
                break;
            }
            case 52: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.triggerPlayerLocked2();
                }
                break;
            }
            case 39: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.loadMoviesList();
                }
                break;
            }
            case 51: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.triggerPlayerLocked2();
                }
                break;
            }
            case 17: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.onLoadFromBeginning();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // !controller.mediaSubstitleGet.get()
                java.lang.Boolean controllerMediaSubstitleGet = null;
                // controller.mediaSubstitleGet != null
                boolean controllerMediaSubstitleGetJavaLangObjectNull = false;
                // controller.mediaSubstitleGet
                androidx.databinding.ObservableField<java.lang.Boolean> ControllerMediaSubstitleGet1 = null;
                // controller != null
                boolean controllerJavaLangObjectNull = false;
                // controller.mediaSubstitleGet.get()
                java.lang.Boolean controllerMediaSubstitleGetGet = null;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {




                    ControllerMediaSubstitleGet1 = controller.mediaSubstitleGet;

                    controllerMediaSubstitleGetJavaLangObjectNull = (ControllerMediaSubstitleGet1) != (null);
                    if (controllerMediaSubstitleGetJavaLangObjectNull) {


                        controllerMediaSubstitleGetGet = ControllerMediaSubstitleGet1.get();

                        controllerMediaSubstitleGet = !controllerMediaSubstitleGetGet;

                        controller.triggerSubtitlesToggle(controllerMediaSubstitleGet);
                    }
                }
                break;
            }
            case 48: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.onTracksMedia();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller.isAutoPlayEnabled
                androidx.databinding.ObservableField<java.lang.Boolean> controllerIsAutoPlayEnabled = null;
                // controller.isAutoPlayEnabled.get()
                java.lang.Boolean controllerIsAutoPlayEnabledGet = null;
                // controller != null
                boolean controllerJavaLangObjectNull = false;
                // controller.isAutoPlayEnabled != null
                boolean controllerIsAutoPlayEnabledJavaLangObjectNull = false;
                // !controller.isAutoPlayEnabled.get()
                java.lang.Boolean ControllerIsAutoPlayEnabled1 = null;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {




                    controllerIsAutoPlayEnabled = controller.isAutoPlayEnabled;

                    controllerIsAutoPlayEnabledJavaLangObjectNull = (controllerIsAutoPlayEnabled) != (null);
                    if (controllerIsAutoPlayEnabledJavaLangObjectNull) {


                        controllerIsAutoPlayEnabledGet = controllerIsAutoPlayEnabled.get();

                        ControllerIsAutoPlayEnabled1 = !controllerIsAutoPlayEnabledGet;

                        controller.triggerAutoPlay(ControllerIsAutoPlayEnabled1);
                    }
                }
                break;
            }
            case 49: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.triggerPlayerLocked();
                }
                break;
            }
            case 15: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.clickOnSubs();
                }
                break;
            }
            case 27: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.clickPlaybackSetting();
                }
                break;
            }
            case 16: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.onLoadFromBeginning();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // controller
                com.easyplex.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.closePlayer();
                }
                break;
            }
        }
    }
    public final boolean _internalCallbackOnTouch(int sourceId , android.view.View callbackArg_0, android.view.MotionEvent callbackArg_1) {
        // localize variables for thread safety
        // controller
        com.easyplex.ui.player.bindings.PlayerController controller = mController;
        // controller != null
        boolean controllerJavaLangObjectNull = false;
        // controller.isCurrentVideoAd
        boolean controllerIsCurrentVideoAd = false;



        controllerJavaLangObjectNull = (controller) != (null);
        if (controllerJavaLangObjectNull) {


            controllerIsCurrentVideoAd = controller.isCurrentVideoAd();
        }
        return controllerIsCurrentVideoAd;
    }
    public final void _internalCallbackOnCheckedChanged(int sourceId , android.widget.CompoundButton callbackArg_0, boolean callbackArg_1) {
        // localize variables for thread safety
        // controller
        com.easyplex.ui.player.bindings.PlayerController controller = mController;
        // controller != null
        boolean controllerJavaLangObjectNull = false;



        controllerJavaLangObjectNull = (controller) != (null);
        if (controllerJavaLangObjectNull) {



            controller.onCheckedChanged(callbackArg_1);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    private  long mDirtyFlags_1 = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): controller.currentMediaCover
        flag 1 (0x2L): controller.videoName
        flag 2 (0x3L): controller.mediaPositionInString
        flag 3 (0x4L): controller.playerReady
        flag 4 (0x5L): controller.mediaSubstitleGet
        flag 5 (0x6L): controller.currentSpeed
        flag 6 (0x7L): controller.mediaTypeName
        flag 7 (0x8L): controller.isPlayerLocked
        flag 8 (0x9L): controller.mediaBufferedPosition
        flag 9 (0xaL): controller.videoCurrentSubs
        flag 10 (0xbL): controller.settingReady
        flag 11 (0xcL): controller.adsRemainInString
        flag 12 (0xdL): controller.isLive
        flag 13 (0xeL): controller.mediaEnded
        flag 14 (0xfL): controller.mediaRemainInString
        flag 15 (0x10L): controller.mediaNameSecondary
        flag 16 (0x11L): controller.mediaHasSubstitle
        flag 17 (0x12L): controller.mediaCurrentTime
        flag 18 (0x13L): controller.isCurrentAd
        flag 19 (0x14L): controller.mediaDuration
        flag 20 (0x15L): controller.playerPlaybackState
        flag 21 (0x16L): controller.isPlayerLocked2
        flag 22 (0x17L): controller.isAutoPlayEnabled
        flag 23 (0x18L): controller.isMediaHasSkipRecap
        flag 24 (0x19L): controller.isVideoPlayWhenReady
        flag 25 (0x1aL): controller
        flag 26 (0x1bL): null
        flag 27 (0x1cL): controller.playerPlaybackState.get() == ExoPlayer.STATE_IDLE ? true : controller.playerPlaybackState.get() == ExoPlayer.STATE_ENDED ? View.VISIBLE : View.GONE
        flag 28 (0x1dL): controller.playerPlaybackState.get() == ExoPlayer.STATE_IDLE ? true : controller.playerPlaybackState.get() == ExoPlayer.STATE_ENDED ? View.VISIBLE : View.GONE
        flag 29 (0x1eL): androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) ? View.VISIBLE : View.INVISIBLE
        flag 30 (0x1fL): androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) ? View.VISIBLE : View.INVISIBLE
        flag 31 (0x20L): (androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get())) | (androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get())) ? true : controller.mediaType.equals("streaming")
        flag 32 (0x21L): (androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get())) | (androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get())) ? true : controller.mediaType.equals("streaming")
        flag 33 (0x22L): controller.playerPlaybackState.get() == ExoPlayer.STATE_BUFFERING ? true : controller.playerPlaybackState.get() == ExoPlayer.STATE_IDLE
        flag 34 (0x23L): controller.playerPlaybackState.get() == ExoPlayer.STATE_BUFFERING ? true : controller.playerPlaybackState.get() == ExoPlayer.STATE_IDLE
        flag 35 (0x24L): !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get()) : false ? (controller.mediaType.equals("1")) | (controller.mediaType.equals("anime")) : false
        flag 36 (0x25L): !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get()) : false ? (controller.mediaType.equals("1")) | (controller.mediaType.equals("anime")) : false
        flag 37 (0x26L): (controller.mediaType.equals("1")) | (controller.mediaType.equals("anime")) ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get()) : false ? View.VISIBLE : View.INVISIBLE
        flag 38 (0x27L): (controller.mediaType.equals("1")) | (controller.mediaType.equals("anime")) ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get()) : false ? View.VISIBLE : View.INVISIBLE
        flag 39 (0x28L): controller.playerPlaybackState.get() == ExoPlayer.STATE_IDLE ? true : controller.playerPlaybackState.get() == ExoPlayer.STATE_ENDED
        flag 40 (0x29L): controller.playerPlaybackState.get() == ExoPlayer.STATE_IDLE ? true : controller.playerPlaybackState.get() == ExoPlayer.STATE_ENDED
        flag 41 (0x2aL): androidx.databinding.ViewDataBinding.safeUnbox(controller.isLive.get()) ? View.VISIBLE : View.GONE
        flag 42 (0x2bL): androidx.databinding.ViewDataBinding.safeUnbox(controller.isLive.get()) ? View.VISIBLE : View.GONE
        flag 43 (0x2cL): controller.mediaType.equals("streaming") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false
        flag 44 (0x2dL): controller.mediaType.equals("streaming") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false
        flag 45 (0x2eL): controller.mediaRemainInString.get() == null ? @android:string/controller_time_position_text_default : controller.mediaRemainInString.get()
        flag 46 (0x2fL): controller.mediaRemainInString.get() == null ? @android:string/controller_time_position_text_default : controller.mediaRemainInString.get()
        flag 47 (0x30L): ((controller.mediaType.equals("0")) | (controller.mediaType.equals("1"))) | (controller.mediaType.equals("anime")) ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get()) : false
        flag 48 (0x31L): ((controller.mediaType.equals("0")) | (controller.mediaType.equals("1"))) | (controller.mediaType.equals("anime")) ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get()) : false
        flag 49 (0x32L): !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get()) : false ? View.VISIBLE : View.GONE
        flag 50 (0x33L): !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get()) : false ? View.VISIBLE : View.GONE
        flag 51 (0x34L): controller.mediaType.equals("0") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get()) : false ? View.VISIBLE : View.GONE
        flag 52 (0x35L): controller.mediaType.equals("0") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get()) : false ? View.VISIBLE : View.GONE
        flag 53 (0x36L): androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) ? View.INVISIBLE : View.VISIBLE
        flag 54 (0x37L): androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) ? View.INVISIBLE : View.VISIBLE
        flag 55 (0x38L): androidx.databinding.ViewDataBinding.safeUnbox(controller.isMediaHasSkipRecap.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false ? View.VISIBLE : View.INVISIBLE
        flag 56 (0x39L): androidx.databinding.ViewDataBinding.safeUnbox(controller.isMediaHasSkipRecap.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false ? View.VISIBLE : View.INVISIBLE
        flag 57 (0x3aL): controller.mediaType.equals("streaming") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false ? View.VISIBLE : View.GONE
        flag 58 (0x3bL): controller.mediaType.equals("streaming") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false ? View.VISIBLE : View.GONE
        flag 59 (0x3cL): ((controller.mediaType.equals("0")) | (controller.mediaType.equals("1"))) | (controller.mediaType.equals("anime")) ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false
        flag 60 (0x3dL): ((controller.mediaType.equals("0")) | (controller.mediaType.equals("1"))) | (controller.mediaType.equals("anime")) ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false
        flag 61 (0x3eL): controller.mediaType.equals("streaming") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false
        flag 62 (0x3fL): controller.mediaType.equals("streaming") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false
        flag 63 (0x40L): !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get()) : false ? (controller.mediaType.equals("1")) | (controller.mediaType.equals("anime")) : false ? View.VISIBLE : View.GONE
        flag 64 (0x41L): !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get()) : false ? (controller.mediaType.equals("1")) | (controller.mediaType.equals("anime")) : false ? View.VISIBLE : View.GONE
        flag 65 (0x42L): controller.mediaPositionInString.get() == null ? @android:string/controller_time_position_text_default : controller.mediaPositionInString.get()
        flag 66 (0x43L): controller.mediaPositionInString.get() == null ? @android:string/controller_time_position_text_default : controller.mediaPositionInString.get()
        flag 67 (0x44L): controller.isCue ? androidx.databinding.ViewDataBinding.safeUnbox(controller.playerReady.get()) : false
        flag 68 (0x45L): controller.isCue ? androidx.databinding.ViewDataBinding.safeUnbox(controller.playerReady.get()) : false
        flag 69 (0x46L): controller.mediaType.equals("streaming") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false ? View.VISIBLE : View.INVISIBLE
        flag 70 (0x47L): controller.mediaType.equals("streaming") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false ? View.VISIBLE : View.INVISIBLE
        flag 71 (0x48L): (androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get())) | (androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get())) ? View.GONE : View.VISIBLE
        flag 72 (0x49L): (androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get())) | (androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get())) ? View.GONE : View.VISIBLE
        flag 73 (0x4aL): ((controller.mediaType.equals("0")) | (controller.mediaType.equals("1"))) | (controller.mediaType.equals("anime")) ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false
        flag 74 (0x4bL): ((controller.mediaType.equals("0")) | (controller.mediaType.equals("1"))) | (controller.mediaType.equals("anime")) ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false
        flag 75 (0x4cL): (controller.mediaType.equals("1")) | (controller.mediaType.equals("anime")) ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get()) : false
        flag 76 (0x4dL): (controller.mediaType.equals("1")) | (controller.mediaType.equals("anime")) ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get()) : false
        flag 77 (0x4eL): controller.isCue ? androidx.databinding.ViewDataBinding.safeUnbox(controller.playerReady.get()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(controller.settingReady.get()) : false
        flag 78 (0x4fL): controller.isCue ? androidx.databinding.ViewDataBinding.safeUnbox(controller.playerReady.get()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(controller.settingReady.get()) : false
        flag 79 (0x50L): controller.mediaType.equals("0") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false
        flag 80 (0x51L): controller.mediaType.equals("0") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false
        flag 81 (0x52L): controller.mediaType.equals("0") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false
        flag 82 (0x53L): controller.mediaType.equals("0") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false
        flag 83 (0x54L): controller.isCue ? androidx.databinding.ViewDataBinding.safeUnbox(controller.playerReady.get()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(controller.settingReady.get()) : false ? View.VISIBLE : View.GONE
        flag 84 (0x55L): controller.isCue ? androidx.databinding.ViewDataBinding.safeUnbox(controller.playerReady.get()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(controller.settingReady.get()) : false ? View.VISIBLE : View.GONE
        flag 85 (0x56L): (controller.mediaType.equals("1")) | (controller.mediaType.equals("anime")) ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false
        flag 86 (0x57L): (controller.mediaType.equals("1")) | (controller.mediaType.equals("anime")) ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false
        flag 87 (0x58L): (controller.mediaType.equals("1")) | (controller.mediaType.equals("anime")) ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false
        flag 88 (0x59L): (controller.mediaType.equals("1")) | (controller.mediaType.equals("anime")) ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false
        flag 89 (0x5aL): (androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get())) | (!androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked2.get())) ? View.GONE : View.VISIBLE
        flag 90 (0x5bL): (androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get())) | (!androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked2.get())) ? View.GONE : View.VISIBLE
        flag 91 (0x5cL): androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaHasSubstitle.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false ? View.VISIBLE : View.GONE
        flag 92 (0x5dL): androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaHasSubstitle.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false ? View.VISIBLE : View.GONE
        flag 93 (0x5eL): (controller.playerPlaybackState.get() == ExoPlayer.STATE_BUFFERING) | (androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get())) ? View.INVISIBLE : View.VISIBLE
        flag 94 (0x5fL): (controller.playerPlaybackState.get() == ExoPlayer.STATE_BUFFERING) | (androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get())) ? View.INVISIBLE : View.VISIBLE
        flag 95 (0x60L): controller.mediaType.equals("0") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get()) : false
        flag 96 (0x61L): controller.mediaType.equals("0") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get()) : false
        flag 97 (0x62L): androidx.databinding.ViewDataBinding.safeUnbox(controller.isMediaHasSkipRecap.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false
        flag 98 (0x63L): androidx.databinding.ViewDataBinding.safeUnbox(controller.isMediaHasSkipRecap.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false
        flag 99 (0x64L): controller.mediaType.equals("0") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get()) : false ? View.VISIBLE : View.INVISIBLE
        flag 100 (0x65L): controller.mediaType.equals("0") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get()) : false ? View.VISIBLE : View.INVISIBLE
        flag 101 (0x66L): (androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get())) | (!androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get())) ? View.GONE : View.VISIBLE
        flag 102 (0x67L): (androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get())) | (!androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get())) ? View.GONE : View.VISIBLE
        flag 103 (0x68L): ((controller.mediaType.equals("0")) | (controller.mediaType.equals("1"))) | (controller.mediaType.equals("anime")) ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false ? View.VISIBLE : View.INVISIBLE
        flag 104 (0x69L): ((controller.mediaType.equals("0")) | (controller.mediaType.equals("1"))) | (controller.mediaType.equals("anime")) ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false ? View.VISIBLE : View.INVISIBLE
        flag 105 (0x6aL): (androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get())) | (androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get())) ? true : controller.mediaType.equals("streaming") ? View.INVISIBLE : View.VISIBLE
        flag 106 (0x6bL): (androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get())) | (androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get())) ? true : controller.mediaType.equals("streaming") ? View.INVISIBLE : View.VISIBLE
        flag 107 (0x6cL): androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaHasSubstitle.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false
        flag 108 (0x6dL): androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaHasSubstitle.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false
        flag 109 (0x6eL): !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get()) : false
        flag 110 (0x6fL): !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isPlayerLocked.get()) : false
    flag mapping end*/
    //end
}