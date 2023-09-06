package com.easyplex.databinding;
import com.easyplex.R;
import com.easyplex.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ItemAnimeDetailBindingImpl extends ItemAnimeDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appbar, 1);
        sViewsWithIds.put(R.id.toolbar, 2);
        sViewsWithIds.put(R.id.backbutton, 3);
        sViewsWithIds.put(R.id.serie_name, 4);
        sViewsWithIds.put(R.id.serieCoordinator, 5);
        sViewsWithIds.put(R.id.image_movie_poster, 6);
        sViewsWithIds.put(R.id.floating_comment_icon, 7);
        sViewsWithIds.put(R.id.scrollView, 8);
        sViewsWithIds.put(R.id.topResume, 9);
        sViewsWithIds.put(R.id.resumePlay, 10);
        sViewsWithIds.put(R.id.resumePlayTitle, 11);
        sViewsWithIds.put(R.id.timeRemaning, 12);
        sViewsWithIds.put(R.id.linear_resume_progress_bar, 13);
        sViewsWithIds.put(R.id.resume_progress_bar, 14);
        sViewsWithIds.put(R.id.serieTitle, 15);
        sViewsWithIds.put(R.id.userReview, 16);
        sViewsWithIds.put(R.id.rating_bar, 17);
        sViewsWithIds.put(R.id.view_movie_views, 18);
        sViewsWithIds.put(R.id.view_movie_rating, 19);
        sViewsWithIds.put(R.id.mrelease, 20);
        sViewsWithIds.put(R.id.dot_genre, 21);
        sViewsWithIds.put(R.id.mgenres, 22);
        sViewsWithIds.put(R.id.commentsizeLinear, 23);
        sViewsWithIds.put(R.id.commentsize, 24);
        sViewsWithIds.put(R.id.mseason, 25);
        sViewsWithIds.put(R.id.serieOverview, 26);
        sViewsWithIds.put(R.id.ButtonPlayTrailer, 27);
        sViewsWithIds.put(R.id.maxNativeAds, 28);
        sViewsWithIds.put(R.id.fl_adplaceholder, 29);
        sViewsWithIds.put(R.id.NavigationTabLayout, 30);
        sViewsWithIds.put(R.id.favoriteIcon, 31);
        sViewsWithIds.put(R.id.favoriteImage, 32);
        sViewsWithIds.put(R.id.report, 33);
        sViewsWithIds.put(R.id.reportImage, 34);
        sViewsWithIds.put(R.id.review, 35);
        sViewsWithIds.put(R.id.reviewImage, 36);
        sViewsWithIds.put(R.id.shareIcon, 37);
        sViewsWithIds.put(R.id.recycler_view_cast_movie_detail, 38);
        sViewsWithIds.put(R.id.rv_mylike, 39);
        sViewsWithIds.put(R.id.related_not_found, 40);
        sViewsWithIds.put(R.id.planets_spinner, 41);
        sViewsWithIds.put(R.id.recycler_view_episodes, 42);
        sViewsWithIds.put(R.id.progress_bar, 43);
        sViewsWithIds.put(R.id.maxAdView, 44);
        sViewsWithIds.put(R.id.ad_view_container, 45);
        sViewsWithIds.put(R.id.banner_container, 46);
        sViewsWithIds.put(R.id.unity_banner_view_container, 47);
        sViewsWithIds.put(R.id.VungleBannerContainerIron, 48);
        sViewsWithIds.put(R.id.appodealBannerView, 49);
        sViewsWithIds.put(R.id.bannerAppNext, 50);
        sViewsWithIds.put(R.id.bannerContainerIron, 51);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemAnimeDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 52, sIncludes, sViewsWithIds));
    }
    private ItemAnimeDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[27]
            , (android.widget.LinearLayout) bindings[30]
            , (android.widget.FrameLayout) bindings[48]
            , (android.widget.FrameLayout) bindings[45]
            , (com.google.android.material.appbar.AppBarLayout) bindings[1]
            , (com.appodeal.ads.BannerView) bindings[49]
            , (android.widget.ImageView) bindings[3]
            , (com.appnext.banners.BannerView) bindings[50]
            , (android.widget.LinearLayout) bindings[46]
            , (android.widget.FrameLayout) bindings[51]
            , (android.widget.TextView) bindings[24]
            , (android.widget.LinearLayout) bindings[23]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.TextView) bindings[21]
            , (android.widget.LinearLayout) bindings[31]
            , (android.widget.ImageView) bindings[32]
            , (android.widget.FrameLayout) bindings[29]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[7]
            , (com.easyplex.util.GridItemImageView) bindings[6]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.FrameLayout) bindings[44]
            , (android.widget.FrameLayout) bindings[28]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[25]
            , (com.chivorn.smartmaterialspinner.SmartMaterialSpinner) bindings[41]
            , (android.widget.ProgressBar) bindings[43]
            , (androidx.appcompat.widget.AppCompatRatingBar) bindings[17]
            , (androidx.recyclerview.widget.RecyclerView) bindings[38]
            , (androidx.recyclerview.widget.RecyclerView) bindings[42]
            , (android.widget.LinearLayout) bindings[40]
            , (android.widget.LinearLayout) bindings[33]
            , (android.widget.ImageView) bindings[34]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.ProgressBar) bindings[14]
            , (android.widget.LinearLayout) bindings[35]
            , (android.widget.ImageView) bindings[36]
            , (androidx.recyclerview.widget.RecyclerView) bindings[39]
            , (android.widget.ScrollView) bindings[8]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[26]
            , (android.widget.TextView) bindings[15]
            , (android.widget.LinearLayout) bindings[37]
            , (android.widget.TextView) bindings[12]
            , (androidx.appcompat.widget.Toolbar) bindings[2]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.RelativeLayout) bindings[47]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[18]
            );
        this.constraintLayout.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}