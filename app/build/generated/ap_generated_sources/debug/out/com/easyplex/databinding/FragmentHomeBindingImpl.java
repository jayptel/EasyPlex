package com.easyplex.databinding;
import com.easyplex.R;
import com.easyplex.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentHomeBindingImpl extends FragmentHomeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(90);
        sIncludes.setIncludes(1, 
            new String[] {"main_toolbar"},
            new int[] {2},
            new int[] {com.easyplex.R.layout.main_toolbar});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.fragment_container, 3);
        sViewsWithIds.put(R.id.constraintLayout, 4);
        sViewsWithIds.put(R.id.main_content, 5);
        sViewsWithIds.put(R.id.swipe_container, 6);
        sViewsWithIds.put(R.id.scrollView, 7);
        sViewsWithIds.put(R.id.rv_featured, 8);
        sViewsWithIds.put(R.id.indicator, 9);
        sViewsWithIds.put(R.id.customBanner, 10);
        sViewsWithIds.put(R.id.linear_watch, 11);
        sViewsWithIds.put(R.id.linear_watch_image, 12);
        sViewsWithIds.put(R.id.coutinueWatchingTitle, 13);
        sViewsWithIds.put(R.id.clearHistory, 14);
        sViewsWithIds.put(R.id.rv_countinue_watching, 15);
        sViewsWithIds.put(R.id.linear_networks, 16);
        sViewsWithIds.put(R.id.linear_networks_image, 17);
        sViewsWithIds.put(R.id.genres, 18);
        sViewsWithIds.put(R.id.rv_networks, 19);
        sViewsWithIds.put(R.id.linear_pinned, 20);
        sViewsWithIds.put(R.id.linear_pinned_image, 21);
        sViewsWithIds.put(R.id.pinned, 22);
        sViewsWithIds.put(R.id.rv_pinned, 23);
        sViewsWithIds.put(R.id.linear_popular_casters, 24);
        sViewsWithIds.put(R.id.linear_popular_casters_image, 25);
        sViewsWithIds.put(R.id.popular_casters, 26);
        sViewsWithIds.put(R.id.casters_all, 27);
        sViewsWithIds.put(R.id.rv_popular_casters, 28);
        sViewsWithIds.put(R.id.linear_upcoming, 29);
        sViewsWithIds.put(R.id.upcoming_pinned_image, 30);
        sViewsWithIds.put(R.id.rv_upcoming, 31);
        sViewsWithIds.put(R.id.linear_latest_channels, 32);
        sViewsWithIds.put(R.id.linear_latest_channels_image, 33);
        sViewsWithIds.put(R.id.sreaming_all, 34);
        sViewsWithIds.put(R.id.rv_latest_streaming, 35);
        sViewsWithIds.put(R.id.rv_tv_movies_linear, 36);
        sViewsWithIds.put(R.id.top20_all, 37);
        sViewsWithIds.put(R.id.rv_tv_movies, 38);
        sViewsWithIds.put(R.id.rv_latest_linear, 39);
        sViewsWithIds.put(R.id.new_releases_all, 40);
        sViewsWithIds.put(R.id.rv_latest, 41);
        sViewsWithIds.put(R.id.linear_episodes_channels, 42);
        sViewsWithIds.put(R.id.linear_latest_episodes_image, 43);
        sViewsWithIds.put(R.id.episodes_all, 44);
        sViewsWithIds.put(R.id.rv_episodes_latest, 45);
        sViewsWithIds.put(R.id.linear_episodes_animes, 46);
        sViewsWithIds.put(R.id.linear_latest_episodes_image__animes, 47);
        sViewsWithIds.put(R.id.animes_episodes_all, 48);
        sViewsWithIds.put(R.id.rv_episodes_latest_animes, 49);
        sViewsWithIds.put(R.id.rv_recommended_linear, 50);
        sViewsWithIds.put(R.id.recommended_all, 51);
        sViewsWithIds.put(R.id.rv_recommended, 52);
        sViewsWithIds.put(R.id.rv_trending_linear, 53);
        sViewsWithIds.put(R.id.trending_all, 54);
        sViewsWithIds.put(R.id.rv_trending, 55);
        sViewsWithIds.put(R.id.choosedLinear, 56);
        sViewsWithIds.put(R.id.choosed_all, 57);
        sViewsWithIds.put(R.id.choosed, 58);
        sViewsWithIds.put(R.id.nativeAdsSpace, 59);
        sViewsWithIds.put(R.id.image_ads, 60);
        sViewsWithIds.put(R.id.view_ad_text, 61);
        sViewsWithIds.put(R.id.maxNativeAds, 62);
        sViewsWithIds.put(R.id.fl_adplaceholder, 63);
        sViewsWithIds.put(R.id.rv_series_popular_linear, 64);
        sViewsWithIds.put(R.id.popular_series_all, 65);
        sViewsWithIds.put(R.id.rv_series_popular, 66);
        sViewsWithIds.put(R.id.rv_series_recents_linear, 67);
        sViewsWithIds.put(R.id.latest_series_all, 68);
        sViewsWithIds.put(R.id.rv_series_recents, 69);
        sViewsWithIds.put(R.id.newthisweek_linear, 70);
        sViewsWithIds.put(R.id.this_week_all, 71);
        sViewsWithIds.put(R.id.rv_newthisweek, 72);
        sViewsWithIds.put(R.id.rv_animes_linear, 73);
        sViewsWithIds.put(R.id.animes_all, 74);
        sViewsWithIds.put(R.id.rv_animes, 75);
        sViewsWithIds.put(R.id.popular_linear, 76);
        sViewsWithIds.put(R.id.most_popular_all, 77);
        sViewsWithIds.put(R.id.rv_popular, 78);
        sViewsWithIds.put(R.id.bottom_sheet, 79);
        sViewsWithIds.put(R.id.progress_bar, 80);
        sViewsWithIds.put(R.id.view_mantenance_mode, 81);
        sViewsWithIds.put(R.id.movie_image, 82);
        sViewsWithIds.put(R.id.mantenance_mode_message, 83);
        sViewsWithIds.put(R.id.restartApp, 84);
        sViewsWithIds.put(R.id.close_status, 85);
        sViewsWithIds.put(R.id.view_plans, 86);
        sViewsWithIds.put(R.id.recycler_view_plans, 87);
        sViewsWithIds.put(R.id.close_plans, 88);
        sViewsWithIds.put(R.id.nav_view, 89);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 90, sIncludes, sViewsWithIds));
    }
    private FragmentHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.easyplex.util.GridItemImageView) bindings[74]
            , (android.widget.ImageView) bindings[48]
            , (com.google.android.material.appbar.AppBarLayout) bindings[1]
            , (android.widget.FrameLayout) bindings[79]
            , (android.widget.ImageView) bindings[27]
            , (androidx.recyclerview.widget.RecyclerView) bindings[58]
            , (com.easyplex.util.GridItemImageView) bindings[57]
            , (android.widget.LinearLayout) bindings[56]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.ImageView) bindings[88]
            , (android.widget.ImageView) bindings[85]
            , (android.widget.RelativeLayout) bindings[4]
            , (android.widget.TextView) bindings[13]
            , (android.widget.ImageView) bindings[10]
            , (androidx.drawerlayout.widget.DrawerLayout) bindings[0]
            , (android.widget.ImageView) bindings[44]
            , (android.widget.FrameLayout) bindings[63]
            , (android.widget.FrameLayout) bindings[3]
            , (android.widget.TextView) bindings[18]
            , (com.easyplex.util.GridItemImageView) bindings[60]
            , (me.relex.circleindicator.CircleIndicator2) bindings[9]
            , (com.easyplex.util.GridItemImageView) bindings[68]
            , (android.widget.LinearLayout) bindings[46]
            , (android.widget.LinearLayout) bindings[42]
            , (android.widget.LinearLayout) bindings[32]
            , (android.widget.ImageView) bindings[33]
            , (android.widget.ImageView) bindings[43]
            , (android.widget.ImageView) bindings[47]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.LinearLayout) bindings[20]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.LinearLayout) bindings[24]
            , (android.widget.ImageView) bindings[25]
            , (android.widget.LinearLayout) bindings[29]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.ImageView) bindings[12]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[5]
            , (android.widget.TextView) bindings[83]
            , (android.widget.FrameLayout) bindings[62]
            , (com.easyplex.util.GridItemImageView) bindings[77]
            , (android.widget.ImageView) bindings[82]
            , (android.widget.LinearLayout) bindings[59]
            , (com.google.android.material.navigation.NavigationView) bindings[89]
            , (android.widget.ImageView) bindings[40]
            , (android.widget.LinearLayout) bindings[70]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[26]
            , (android.widget.LinearLayout) bindings[76]
            , (com.easyplex.util.GridItemImageView) bindings[65]
            , (android.widget.ProgressBar) bindings[80]
            , (com.easyplex.util.GridItemImageView) bindings[51]
            , (androidx.recyclerview.widget.RecyclerView) bindings[87]
            , (android.widget.Button) bindings[84]
            , (androidx.recyclerview.widget.RecyclerView) bindings[75]
            , (android.widget.LinearLayout) bindings[73]
            , (androidx.recyclerview.widget.RecyclerView) bindings[15]
            , (androidx.recyclerview.widget.RecyclerView) bindings[45]
            , (androidx.recyclerview.widget.RecyclerView) bindings[49]
            , (androidx.recyclerview.widget.RecyclerView) bindings[8]
            , (androidx.recyclerview.widget.RecyclerView) bindings[41]
            , (android.widget.LinearLayout) bindings[39]
            , (androidx.recyclerview.widget.RecyclerView) bindings[35]
            , (androidx.recyclerview.widget.RecyclerView) bindings[19]
            , (androidx.recyclerview.widget.RecyclerView) bindings[72]
            , (androidx.recyclerview.widget.RecyclerView) bindings[23]
            , (androidx.recyclerview.widget.RecyclerView) bindings[78]
            , (androidx.recyclerview.widget.RecyclerView) bindings[28]
            , (androidx.recyclerview.widget.RecyclerView) bindings[52]
            , (android.widget.LinearLayout) bindings[50]
            , (androidx.recyclerview.widget.RecyclerView) bindings[66]
            , (android.widget.LinearLayout) bindings[64]
            , (androidx.recyclerview.widget.RecyclerView) bindings[69]
            , (android.widget.LinearLayout) bindings[67]
            , (androidx.recyclerview.widget.RecyclerView) bindings[55]
            , (android.widget.LinearLayout) bindings[53]
            , (androidx.recyclerview.widget.RecyclerView) bindings[38]
            , (android.widget.LinearLayout) bindings[36]
            , (androidx.recyclerview.widget.RecyclerView) bindings[31]
            , (androidx.core.widget.NestedScrollView) bindings[7]
            , (android.widget.ImageView) bindings[34]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[6]
            , (com.easyplex.util.GridItemImageView) bindings[71]
            , (com.easyplex.databinding.MainToolbarBinding) bindings[2]
            , (android.widget.ImageView) bindings[37]
            , (com.easyplex.util.GridItemImageView) bindings[54]
            , (android.widget.ImageView) bindings[30]
            , (android.widget.TextView) bindings[61]
            , (android.widget.FrameLayout) bindings[81]
            , (android.widget.FrameLayout) bindings[86]
            );
        this.appbar.setTag(null);
        this.drawerLayout.setTag(null);
        setContainedBinding(this.toolbar);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        toolbar.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (toolbar.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.controller == variableId) {
            setController((com.easyplex.ui.users.MenuHandler) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setController(@Nullable com.easyplex.ui.users.MenuHandler Controller) {
        this.mController = Controller;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        toolbar.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeToolbar((com.easyplex.databinding.MainToolbarBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeToolbar(com.easyplex.databinding.MainToolbarBinding Toolbar, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        // batch finished
        executeBindingsOn(toolbar);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): toolbar
        flag 1 (0x2L): controller
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}