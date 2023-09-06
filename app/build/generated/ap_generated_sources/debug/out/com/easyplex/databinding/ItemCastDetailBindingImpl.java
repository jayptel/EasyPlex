package com.easyplex.databinding;
import com.easyplex.R;
import com.easyplex.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ItemCastDetailBindingImpl extends ItemCastDetailBinding  {

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
        sViewsWithIds.put(R.id.movie_premuim, 7);
        sViewsWithIds.put(R.id.text_movie_title, 8);
        sViewsWithIds.put(R.id.view_movie_views, 9);
        sViewsWithIds.put(R.id.actor_type, 10);
        sViewsWithIds.put(R.id.birthday, 11);
        sViewsWithIds.put(R.id.text_overview_label, 12);
        sViewsWithIds.put(R.id.twitter, 13);
        sViewsWithIds.put(R.id.facebook, 14);
        sViewsWithIds.put(R.id.instagram, 15);
        sViewsWithIds.put(R.id.filmographieTotal, 16);
        sViewsWithIds.put(R.id.recyclerViewCastMovieDetail, 17);
        sViewsWithIds.put(R.id.progress_bar, 18);
        sViewsWithIds.put(R.id.ad_view_container, 19);
        sViewsWithIds.put(R.id.bannerContainerIron, 20);
        sViewsWithIds.put(R.id.banner_container, 21);
        sViewsWithIds.put(R.id.unity_banner_view_container, 22);
        sViewsWithIds.put(R.id.appodealBannerView, 23);
        sViewsWithIds.put(R.id.bottom_sheet, 24);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemCastDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 25, sIncludes, sViewsWithIds));
    }
    private ItemCastDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[10]
            , (android.widget.FrameLayout) bindings[19]
            , (com.appodeal.ads.BannerView) bindings[23]
            , (android.widget.LinearLayout) bindings[21]
            , (android.widget.FrameLayout) bindings[20]
            , (android.widget.TextView) bindings[11]
            , (android.widget.FrameLayout) bindings[24]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.TextView) bindings[5]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.TextView) bindings[16]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[15]
            , (androidx.core.widget.NestedScrollView) bindings[3]
            , (android.widget.TextView) bindings[7]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[1]
            , (android.widget.ProgressBar) bindings[18]
            , (androidx.recyclerview.widget.RecyclerView) bindings[17]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[6]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.RelativeLayout) bindings[22]
            , (android.widget.TextView) bindings[9]
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