package com.easyplex.databinding;
import com.easyplex.R;
import com.easyplex.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ActivityEasyplexPlayerBindingImpl extends ActivityEasyplexPlayerBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.coordinator, 4);
        sViewsWithIds.put(R.id.tubitv_player, 5);
        sViewsWithIds.put(R.id.mediaGenres, 6);
        sViewsWithIds.put(R.id.mGenreStart, 7);
        sViewsWithIds.put(R.id.view_media_is_premuim, 8);
        sViewsWithIds.put(R.id.back_is_premuim, 9);
        sViewsWithIds.put(R.id.close_premuim, 10);
        sViewsWithIds.put(R.id.wifi_warning, 11);
        sViewsWithIds.put(R.id.wifi_bt_close, 12);
        sViewsWithIds.put(R.id.view_media_error, 13);
        sViewsWithIds.put(R.id.media_error_cover, 14);
        sViewsWithIds.put(R.id.close_error_media, 15);
        sViewsWithIds.put(R.id.media_error_reload, 16);
        sViewsWithIds.put(R.id.info_trailer, 17);
        sViewsWithIds.put(R.id.view_media_error_play_embed, 18);
        sViewsWithIds.put(R.id.view_start_watching, 19);
        sViewsWithIds.put(R.id.view_status, 20);
        sViewsWithIds.put(R.id.movie_image, 21);
        sViewsWithIds.put(R.id.movietitle, 22);
        sViewsWithIds.put(R.id.restartApp, 23);
        sViewsWithIds.put(R.id.close_status, 24);
        sViewsWithIds.put(R.id.frame_substitles, 25);
        sViewsWithIds.put(R.id.close_substitle, 26);
        sViewsWithIds.put(R.id.substitle_scroll, 27);
        sViewsWithIds.put(R.id.rv_substitles, 28);
        sViewsWithIds.put(R.id.frame_qualities, 29);
        sViewsWithIds.put(R.id.close_qualities, 30);
        sViewsWithIds.put(R.id.qualities_scroll, 31);
        sViewsWithIds.put(R.id.rv_qualites, 32);
        sViewsWithIds.put(R.id.frame_layout_movies_list, 33);
        sViewsWithIds.put(R.id.close_movies_list, 34);
        sViewsWithIds.put(R.id.movie_list_btn, 35);
        sViewsWithIds.put(R.id.view_text_movie_list_genre_name, 36);
        sViewsWithIds.put(R.id.movies_list_spinner, 37);
        sViewsWithIds.put(R.id.rv_featured, 38);
        sViewsWithIds.put(R.id.noResults, 39);
        sViewsWithIds.put(R.id.view_text_genre_name_selected, 40);
        sViewsWithIds.put(R.id.frame_layout_series_list, 41);
        sViewsWithIds.put(R.id.close_series_list, 42);
        sViewsWithIds.put(R.id.serie_list_btn, 43);
        sViewsWithIds.put(R.id.view_text_serie_list_genre_name, 44);
        sViewsWithIds.put(R.id.series_list_spinner, 45);
        sViewsWithIds.put(R.id.rv_series_featured, 46);
        sViewsWithIds.put(R.id.noResultsSeries, 47);
        sViewsWithIds.put(R.id.view_text_serie_genre_name_selected, 48);
        sViewsWithIds.put(R.id.frame_layout_seasons, 49);
        sViewsWithIds.put(R.id.filter_btn, 50);
        sViewsWithIds.put(R.id.current_selected_seasons, 51);
        sViewsWithIds.put(R.id.scrollView, 52);
        sViewsWithIds.put(R.id.close_episode, 53);
        sViewsWithIds.put(R.id.planets_spinner, 54);
        sViewsWithIds.put(R.id.recycler_view_episodes, 55);
        sViewsWithIds.put(R.id.frameLayoutStreaming, 56);
        sViewsWithIds.put(R.id.closeStreaming, 57);
        sViewsWithIds.put(R.id.genreStreamRelative, 58);
        sViewsWithIds.put(R.id.currentStreamingGenre, 59);
        sViewsWithIds.put(R.id.spinnerMediaStreaming, 60);
        sViewsWithIds.put(R.id.recyclerViewStreaming, 61);
        sViewsWithIds.put(R.id.framlayout_media_ended, 62);
        sViewsWithIds.put(R.id.next_cover_media, 63);
        sViewsWithIds.put(R.id.progress_bar, 64);
        sViewsWithIds.put(R.id.left_info, 65);
        sViewsWithIds.put(R.id.text_view_video_next_name, 66);
        sViewsWithIds.put(R.id.rating_bar, 67);
        sViewsWithIds.put(R.id.view_movie_rating, 68);
        sViewsWithIds.put(R.id.textViewVideoRelease, 69);
        sViewsWithIds.put(R.id.text_view_video_next_release_date, 70);
        sViewsWithIds.put(R.id.text_overview_label, 71);
        sViewsWithIds.put(R.id.close_media_ended, 72);
        sViewsWithIds.put(R.id.nextPlayLayout, 73);
        sViewsWithIds.put(R.id.image_view_movie_next, 74);
        sViewsWithIds.put(R.id.vpaid_webview, 75);
        sViewsWithIds.put(R.id.webview_player, 76);
        sViewsWithIds.put(R.id.cuepoint_indictor, 77);
        sViewsWithIds.put(R.id.frame_layout_ads_remaining, 78);
        sViewsWithIds.put(R.id.bottom_sheet, 79);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_left, 80);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_right, 81);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_bottom, 82);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_seek_left, 83);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_seek_right, 84);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityEasyplexPlayerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 85, sIncludes, sViewsWithIds));
    }
    private ActivityEasyplexPlayerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.Button) bindings[9]
            , (android.widget.FrameLayout) bindings[79]
            , (android.widget.ImageView) bindings[53]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[72]
            , (android.widget.ImageView) bindings[34]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[30]
            , (android.widget.ImageView) bindings[42]
            , (android.widget.ImageView) bindings[24]
            , (android.widget.ImageView) bindings[57]
            , (android.widget.ImageView) bindings[26]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[4]
            , (android.widget.TextView) bindings[77]
            , (android.widget.TextView) bindings[51]
            , (android.widget.TextView) bindings[59]
            , (android.widget.RelativeLayout) bindings[50]
            , (android.widget.FrameLayout) bindings[78]
            , (android.widget.FrameLayout) bindings[33]
            , (android.widget.FrameLayout) bindings[49]
            , (android.widget.FrameLayout) bindings[41]
            , (android.widget.FrameLayout) bindings[56]
            , (android.widget.FrameLayout) bindings[29]
            , (android.widget.FrameLayout) bindings[25]
            , (android.widget.FrameLayout) bindings[62]
            , (android.widget.RelativeLayout) bindings[58]
            , (com.easyplex.util.GridItemImageView) bindings[74]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.LinearLayout) bindings[65]
            , (android.widget.TextView) bindings[7]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.RelativeLayout) bindings[35]
            , (com.chivorn.smartmaterialspinner.SmartMaterialSpinner) bindings[37]
            , (android.widget.TextView) bindings[22]
            , (android.widget.ImageView) bindings[63]
            , (android.widget.FrameLayout) bindings[73]
            , (android.widget.LinearLayout) bindings[39]
            , (android.widget.LinearLayout) bindings[47]
            , (com.chivorn.smartmaterialspinner.SmartMaterialSpinner) bindings[54]
            , (android.widget.ProgressBar) bindings[64]
            , (androidx.core.widget.NestedScrollView) bindings[31]
            , (androidx.appcompat.widget.AppCompatRatingBar) bindings[67]
            , (androidx.recyclerview.widget.RecyclerView) bindings[55]
            , (androidx.recyclerview.widget.RecyclerView) bindings[61]
            , (android.widget.Button) bindings[23]
            , (androidx.recyclerview.widget.RecyclerView) bindings[38]
            , (androidx.recyclerview.widget.RecyclerView) bindings[32]
            , (androidx.recyclerview.widget.RecyclerView) bindings[46]
            , (androidx.recyclerview.widget.RecyclerView) bindings[28]
            , (androidx.core.widget.NestedScrollView) bindings[52]
            , (android.widget.RelativeLayout) bindings[43]
            , (com.chivorn.smartmaterialspinner.SmartMaterialSpinner) bindings[45]
            , (com.chivorn.smartmaterialspinner.SmartMaterialSpinner) bindings[60]
            , (androidx.core.widget.NestedScrollView) bindings[27]
            , (android.widget.TextView) bindings[71]
            , (android.widget.TextView) bindings[66]
            , (android.widget.TextView) bindings[70]
            , (android.widget.TextView) bindings[69]
            , (android.widget.TextView) bindings[2]
            , (androidx.constraintlayout.widget.Guideline) bindings[82]
            , (androidx.constraintlayout.widget.Guideline) bindings[80]
            , (androidx.constraintlayout.widget.Guideline) bindings[81]
            , (androidx.constraintlayout.widget.Guideline) bindings[83]
            , (androidx.constraintlayout.widget.Guideline) bindings[84]
            , (com.easyplex.ui.player.views.EasyPlexPlayerView) bindings[5]
            , (android.widget.FrameLayout) bindings[13]
            , (android.widget.Button) bindings[18]
            , (android.widget.FrameLayout) bindings[8]
            , (android.widget.TextView) bindings[68]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.Button) bindings[19]
            , (android.widget.FrameLayout) bindings[20]
            , (android.widget.TextView) bindings[40]
            , (android.widget.TextView) bindings[36]
            , (android.widget.TextView) bindings[48]
            , (android.widget.TextView) bindings[44]
            , (android.webkit.WebView) bindings[75]
            , (android.webkit.WebView) bindings[76]
            , (com.easyplex.util.GridItemImageView) bindings[12]
            , (androidx.cardview.widget.CardView) bindings[11]
            );
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textViewVideoTimeRemaining.setTag(null);
        this.viewSerieControllerTitle.setTag(null);
        this.viewSkipText.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
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
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.controller);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeControllerVideoName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeControllerAdsRemainInString((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeControllerTimeRemaining((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeControllerVideoName(androidx.databinding.ObservableField<java.lang.String> ControllerVideoName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerAdsRemainInString(androidx.databinding.ObservableField<java.lang.String> ControllerAdsRemainInString, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerTimeRemaining(androidx.databinding.ObservableField<java.lang.String> ControllerTimeRemaining, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.databinding.ObservableField<java.lang.String> controllerVideoName = null;
        java.lang.String controllerAdsRemainInStringGet = null;
        java.lang.String controllerVideoNameGet = null;
        java.lang.String controllerTimeRemainingGet = null;
        com.easyplex.ui.player.bindings.PlayerController controller = mController;
        androidx.databinding.ObservableField<java.lang.String> controllerAdsRemainInString = null;
        androidx.databinding.ObservableField<java.lang.String> controllerTimeRemaining = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (controller != null) {
                        // read controller.videoName
                        controllerVideoName = controller.videoName;
                    }
                    updateRegistration(0, controllerVideoName);


                    if (controllerVideoName != null) {
                        // read controller.videoName.get()
                        controllerVideoNameGet = controllerVideoName.get();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (controller != null) {
                        // read controller.adsRemainInString
                        controllerAdsRemainInString = controller.adsRemainInString;
                    }
                    updateRegistration(1, controllerAdsRemainInString);


                    if (controllerAdsRemainInString != null) {
                        // read controller.adsRemainInString.get()
                        controllerAdsRemainInStringGet = controllerAdsRemainInString.get();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (controller != null) {
                        // read controller.timeRemaining
                        controllerTimeRemaining = controller.timeRemaining;
                    }
                    updateRegistration(2, controllerTimeRemaining);


                    if (controllerTimeRemaining != null) {
                        // read controller.timeRemaining.get()
                        controllerTimeRemainingGet = controllerTimeRemaining.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewVideoTimeRemaining, controllerTimeRemainingGet);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.viewSerieControllerTitle, controllerVideoNameGet);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.viewSkipText, controllerAdsRemainInStringGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): controller.videoName
        flag 1 (0x2L): controller.adsRemainInString
        flag 2 (0x3L): controller.timeRemaining
        flag 3 (0x4L): controller
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}