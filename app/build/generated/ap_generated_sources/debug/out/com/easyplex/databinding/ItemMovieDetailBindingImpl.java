package com.easyplex.databinding;
import com.easyplex.R;
import com.easyplex.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ItemMovieDetailBindingImpl extends ItemMovieDetailBinding  {

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
        sViewsWithIds.put(R.id.myCoordinatorLayout, 6);
        sViewsWithIds.put(R.id.image_movie_poster, 7);
        sViewsWithIds.put(R.id.floating_comment_icon, 8);
        sViewsWithIds.put(R.id.item_detail_container, 9);
        sViewsWithIds.put(R.id.resumeProgressCheck, 10);
        sViewsWithIds.put(R.id.resumeLinear, 11);
        sViewsWithIds.put(R.id.epResumeTitle, 12);
        sViewsWithIds.put(R.id.timeRemaning, 13);
        sViewsWithIds.put(R.id.resumePlayProgress, 14);
        sViewsWithIds.put(R.id.resume_progress_bar, 15);
        sViewsWithIds.put(R.id.movie_premuim, 16);
        sViewsWithIds.put(R.id.text_movie_title, 17);
        sViewsWithIds.put(R.id.userReview, 18);
        sViewsWithIds.put(R.id.rating_bar, 19);
        sViewsWithIds.put(R.id.view_movie_views, 20);
        sViewsWithIds.put(R.id.textMovieRelease, 21);
        sViewsWithIds.put(R.id.dot_genre, 22);
        sViewsWithIds.put(R.id.mgenres, 23);
        sViewsWithIds.put(R.id.commentsizeLinear, 24);
        sViewsWithIds.put(R.id.commentsize, 25);
        sViewsWithIds.put(R.id.text_overview_label, 26);
        sViewsWithIds.put(R.id.RecycleViewTrailerLayout, 27);
        sViewsWithIds.put(R.id.PlayButtonIcon, 28);
        sViewsWithIds.put(R.id.resumePlay, 29);
        sViewsWithIds.put(R.id.ButtonPlayTrailer, 30);
        sViewsWithIds.put(R.id.maxNativeAds, 31);
        sViewsWithIds.put(R.id.fl_adplaceholder, 32);
        sViewsWithIds.put(R.id.NavigationTabLayout, 33);
        sViewsWithIds.put(R.id.favoriteIcon, 34);
        sViewsWithIds.put(R.id.favoriteImage, 35);
        sViewsWithIds.put(R.id.report, 36);
        sViewsWithIds.put(R.id.reportImage, 37);
        sViewsWithIds.put(R.id.review, 38);
        sViewsWithIds.put(R.id.reviewImage, 39);
        sViewsWithIds.put(R.id.shareIcon, 40);
        sViewsWithIds.put(R.id.downloadMovie, 41);
        sViewsWithIds.put(R.id.downloadMovieImage, 42);
        sViewsWithIds.put(R.id.recycler_view_cast_movie_detail, 43);
        sViewsWithIds.put(R.id.rv_mylike, 44);
        sViewsWithIds.put(R.id.related_not_found, 45);
        sViewsWithIds.put(R.id.progress_bar, 46);
        sViewsWithIds.put(R.id.maxAdView, 47);
        sViewsWithIds.put(R.id.ad_view_container, 48);
        sViewsWithIds.put(R.id.adcolony_ad_container, 49);
        sViewsWithIds.put(R.id.VungleBannerContainerIron, 50);
        sViewsWithIds.put(R.id.bannerContainerIron, 51);
        sViewsWithIds.put(R.id.banner_container, 52);
        sViewsWithIds.put(R.id.unity_banner_view_container, 53);
        sViewsWithIds.put(R.id.appodealBannerView, 54);
        sViewsWithIds.put(R.id.bannerAppNext, 55);
        sViewsWithIds.put(R.id.bottom_sheet, 56);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemMovieDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 57, sIncludes, sViewsWithIds));
    }
    private ItemMovieDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[30]
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.LinearLayout) bindings[33]
            , (android.widget.LinearLayout) bindings[28]
            , (android.widget.LinearLayout) bindings[27]
            , (android.widget.FrameLayout) bindings[50]
            , (android.widget.FrameLayout) bindings[48]
            , (android.widget.RelativeLayout) bindings[49]
            , (com.google.android.material.appbar.AppBarLayout) bindings[1]
            , (com.appodeal.ads.BannerView) bindings[54]
            , (android.widget.ImageView) bindings[4]
            , (com.appnext.banners.BannerView) bindings[55]
            , (android.widget.LinearLayout) bindings[52]
            , (android.widget.FrameLayout) bindings[51]
            , (android.widget.FrameLayout) bindings[56]
            , (android.widget.TextView) bindings[25]
            , (android.widget.LinearLayout) bindings[24]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.TextView) bindings[22]
            , (android.widget.LinearLayout) bindings[41]
            , (android.widget.ImageView) bindings[42]
            , (android.widget.TextView) bindings[12]
            , (android.widget.LinearLayout) bindings[34]
            , (android.widget.ImageView) bindings[35]
            , (android.widget.FrameLayout) bindings[32]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[8]
            , (com.easyplex.util.GridItemImageView) bindings[7]
            , (androidx.core.widget.NestedScrollView) bindings[9]
            , (android.widget.FrameLayout) bindings[47]
            , (android.widget.FrameLayout) bindings[31]
            , (android.widget.TextView) bindings[23]
            , (android.widget.TextView) bindings[16]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[6]
            , (android.widget.ProgressBar) bindings[46]
            , (androidx.appcompat.widget.AppCompatRatingBar) bindings[19]
            , (androidx.recyclerview.widget.RecyclerView) bindings[43]
            , (android.widget.LinearLayout) bindings[45]
            , (android.widget.LinearLayout) bindings[36]
            , (android.widget.ImageView) bindings[37]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.LinearLayout) bindings[29]
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.ProgressBar) bindings[15]
            , (android.widget.ProgressBar) bindings[10]
            , (android.widget.LinearLayout) bindings[38]
            , (android.widget.ImageView) bindings[39]
            , (androidx.recyclerview.widget.RecyclerView) bindings[44]
            , (android.widget.TextView) bindings[5]
            , (android.widget.LinearLayout) bindings[40]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[17]
            , (com.borjabravo.readmoretextview.ReadMoreTextView) bindings[26]
            , (android.widget.TextView) bindings[13]
            , (androidx.appcompat.widget.Toolbar) bindings[2]
            , (android.widget.RelativeLayout) bindings[53]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[20]
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