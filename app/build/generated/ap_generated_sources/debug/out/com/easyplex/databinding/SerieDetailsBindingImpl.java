package com.easyplex.databinding;
import com.easyplex.R;
import com.easyplex.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class SerieDetailsBindingImpl extends SerieDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appbar, 1);
        sViewsWithIds.put(R.id.toolbar, 2);
        sViewsWithIds.put(R.id.MoreOptionsLinear, 3);
        sViewsWithIds.put(R.id.backbutton, 4);
        sViewsWithIds.put(R.id.serie_name, 5);
        sViewsWithIds.put(R.id.serieCoordinator, 6);
        sViewsWithIds.put(R.id.image_movie_poster, 7);
        sViewsWithIds.put(R.id.floating_comment_icon, 8);
        sViewsWithIds.put(R.id.scrollView, 9);
        sViewsWithIds.put(R.id.topResume, 10);
        sViewsWithIds.put(R.id.resumePlay, 11);
        sViewsWithIds.put(R.id.resumePlayTitle, 12);
        sViewsWithIds.put(R.id.timeRemaning, 13);
        sViewsWithIds.put(R.id.linear_resume_progress_bar, 14);
        sViewsWithIds.put(R.id.resume_progress_bar, 15);
        sViewsWithIds.put(R.id.serieTitle, 16);
        sViewsWithIds.put(R.id.userReview, 17);
        sViewsWithIds.put(R.id.rating_bar, 18);
        sViewsWithIds.put(R.id.view_movie_views, 19);
        sViewsWithIds.put(R.id.view_movie_rating, 20);
        sViewsWithIds.put(R.id.mrelease, 21);
        sViewsWithIds.put(R.id.dot_genre, 22);
        sViewsWithIds.put(R.id.mgenres, 23);
        sViewsWithIds.put(R.id.commentsizeLinear, 24);
        sViewsWithIds.put(R.id.commentsize, 25);
        sViewsWithIds.put(R.id.mseason, 26);
        sViewsWithIds.put(R.id.serieOverview, 27);
        sViewsWithIds.put(R.id.RecycleViewTrailerLayout, 28);
        sViewsWithIds.put(R.id.ButtonPlayTrailer, 29);
        sViewsWithIds.put(R.id.maxNativeAds, 30);
        sViewsWithIds.put(R.id.fl_adplaceholder, 31);
        sViewsWithIds.put(R.id.NavigationTabLayout, 32);
        sViewsWithIds.put(R.id.favoriteIcon, 33);
        sViewsWithIds.put(R.id.favoriteImage, 34);
        sViewsWithIds.put(R.id.report, 35);
        sViewsWithIds.put(R.id.reportImage, 36);
        sViewsWithIds.put(R.id.review, 37);
        sViewsWithIds.put(R.id.reviewImage, 38);
        sViewsWithIds.put(R.id.shareIcon, 39);
        sViewsWithIds.put(R.id.recycler_view_cast_movie_detail, 40);
        sViewsWithIds.put(R.id.planets_spinner, 41);
        sViewsWithIds.put(R.id.recycler_view_episodes, 42);
        sViewsWithIds.put(R.id.rv_mylike, 43);
        sViewsWithIds.put(R.id.related_not_found, 44);
        sViewsWithIds.put(R.id.progress_bar, 45);
        sViewsWithIds.put(R.id.ad_view_container, 46);
        sViewsWithIds.put(R.id.maxAdView, 47);
        sViewsWithIds.put(R.id.banner_container, 48);
        sViewsWithIds.put(R.id.VungleBannerContainerIron, 49);
        sViewsWithIds.put(R.id.unity_banner_view_container, 50);
        sViewsWithIds.put(R.id.appodealBannerView, 51);
        sViewsWithIds.put(R.id.bannerAppNext, 52);
        sViewsWithIds.put(R.id.bannerContainerIron, 53);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SerieDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 54, sIncludes, sViewsWithIds));
    }
    private SerieDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[29]
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.LinearLayout) bindings[32]
            , (android.widget.LinearLayout) bindings[28]
            , (android.widget.FrameLayout) bindings[49]
            , (android.widget.FrameLayout) bindings[46]
            , (com.google.android.material.appbar.AppBarLayout) bindings[1]
            , (com.appodeal.ads.BannerView) bindings[51]
            , (android.widget.ImageView) bindings[4]
            , (com.appnext.banners.BannerView) bindings[52]
            , (android.widget.LinearLayout) bindings[48]
            , (android.widget.FrameLayout) bindings[53]
            , (android.widget.TextView) bindings[25]
            , (android.widget.LinearLayout) bindings[24]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.TextView) bindings[22]
            , (android.widget.LinearLayout) bindings[33]
            , (android.widget.ImageView) bindings[34]
            , (android.widget.FrameLayout) bindings[31]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[8]
            , (com.easyplex.util.GridItemImageView) bindings[7]
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.FrameLayout) bindings[47]
            , (android.widget.FrameLayout) bindings[30]
            , (android.widget.TextView) bindings[23]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[26]
            , (com.chivorn.smartmaterialspinner.SmartMaterialSpinner) bindings[41]
            , (android.widget.ProgressBar) bindings[45]
            , (androidx.appcompat.widget.AppCompatRatingBar) bindings[18]
            , (androidx.recyclerview.widget.RecyclerView) bindings[40]
            , (androidx.recyclerview.widget.RecyclerView) bindings[42]
            , (android.widget.LinearLayout) bindings[44]
            , (android.widget.LinearLayout) bindings[35]
            , (android.widget.ImageView) bindings[36]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (android.widget.ProgressBar) bindings[15]
            , (android.widget.LinearLayout) bindings[37]
            , (android.widget.ImageView) bindings[38]
            , (androidx.recyclerview.widget.RecyclerView) bindings[43]
            , (androidx.core.widget.NestedScrollView) bindings[9]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (com.borjabravo.readmoretextview.ReadMoreTextView) bindings[27]
            , (android.widget.TextView) bindings[16]
            , (android.widget.LinearLayout) bindings[39]
            , (android.widget.TextView) bindings[13]
            , (androidx.appcompat.widget.Toolbar) bindings[2]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.RelativeLayout) bindings[50]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[19]
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