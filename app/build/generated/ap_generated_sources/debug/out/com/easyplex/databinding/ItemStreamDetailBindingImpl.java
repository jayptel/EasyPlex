package com.easyplex.databinding;
import com.easyplex.R;
import com.easyplex.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ItemStreamDetailBindingImpl extends ItemStreamDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.myCoordinatorLayout, 1);
        sViewsWithIds.put(R.id.image_movie_poster, 2);
        sViewsWithIds.put(R.id.item_detail_container, 3);
        sViewsWithIds.put(R.id.resumeLinear, 4);
        sViewsWithIds.put(R.id.epResumeTitle, 5);
        sViewsWithIds.put(R.id.timeRemaning, 6);
        sViewsWithIds.put(R.id.resumePlayProgress, 7);
        sViewsWithIds.put(R.id.resume_progress_bar, 8);
        sViewsWithIds.put(R.id.movie_premuim, 9);
        sViewsWithIds.put(R.id.text_movie_title, 10);
        sViewsWithIds.put(R.id.view_movie_views, 11);
        sViewsWithIds.put(R.id.mgenres, 12);
        sViewsWithIds.put(R.id.text_overview_label, 13);
        sViewsWithIds.put(R.id.maxNativeAds, 14);
        sViewsWithIds.put(R.id.fl_adplaceholder, 15);
        sViewsWithIds.put(R.id.RecycleViewTrailerLayout, 16);
        sViewsWithIds.put(R.id.PlayButtonIcon, 17);
        sViewsWithIds.put(R.id.NavigationTabLayout, 18);
        sViewsWithIds.put(R.id.favoriteIcon, 19);
        sViewsWithIds.put(R.id.favoriteImage, 20);
        sViewsWithIds.put(R.id.report, 21);
        sViewsWithIds.put(R.id.reportImage, 22);
        sViewsWithIds.put(R.id.shareIcon, 23);
        sViewsWithIds.put(R.id.rv_mylike, 24);
        sViewsWithIds.put(R.id.related_not_found, 25);
        sViewsWithIds.put(R.id.MoreOptionsLinear, 26);
        sViewsWithIds.put(R.id.backbutton, 27);
        sViewsWithIds.put(R.id.progress_bar, 28);
        sViewsWithIds.put(R.id.maxAdView, 29);
        sViewsWithIds.put(R.id.ad_view_container, 30);
        sViewsWithIds.put(R.id.banner_container, 31);
        sViewsWithIds.put(R.id.unity_banner_view_container, 32);
        sViewsWithIds.put(R.id.appodealBannerView, 33);
        sViewsWithIds.put(R.id.VungleBannerContainerIron, 34);
        sViewsWithIds.put(R.id.bannerAppNext, 35);
        sViewsWithIds.put(R.id.bannerContainerIron, 36);
        sViewsWithIds.put(R.id.bottom_sheet, 37);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemStreamDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 38, sIncludes, sViewsWithIds));
    }
    private ItemStreamDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[26]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.LinearLayout) bindings[17]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.FrameLayout) bindings[34]
            , (android.widget.FrameLayout) bindings[30]
            , (com.appodeal.ads.BannerView) bindings[33]
            , (android.widget.ImageView) bindings[27]
            , (com.appnext.banners.BannerView) bindings[35]
            , (android.widget.LinearLayout) bindings[31]
            , (android.widget.FrameLayout) bindings[36]
            , (android.widget.FrameLayout) bindings[37]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.TextView) bindings[5]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.FrameLayout) bindings[15]
            , (com.easyplex.util.GridItemImageView) bindings[2]
            , (androidx.core.widget.NestedScrollView) bindings[3]
            , (android.widget.FrameLayout) bindings[29]
            , (android.widget.FrameLayout) bindings[14]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[9]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[1]
            , (android.widget.ProgressBar) bindings[28]
            , (android.widget.LinearLayout) bindings[25]
            , (android.widget.LinearLayout) bindings[21]
            , (android.widget.ImageView) bindings[22]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.ProgressBar) bindings[8]
            , (androidx.recyclerview.widget.RecyclerView) bindings[24]
            , (android.widget.LinearLayout) bindings[23]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[6]
            , (android.widget.RelativeLayout) bindings[32]
            , (android.widget.TextView) bindings[11]
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