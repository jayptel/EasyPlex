package com.easyplex.databinding;
import com.easyplex.R;
import com.easyplex.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ItemUserDetailBindingImpl extends ItemUserDetailBinding  {

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
        sViewsWithIds.put(R.id.cast_name, 5);
        sViewsWithIds.put(R.id.myCoordinatorLayout, 6);
        sViewsWithIds.put(R.id.image_movie_poster, 7);
        sViewsWithIds.put(R.id.item_detail_container, 8);
        sViewsWithIds.put(R.id.rootLayout, 9);
        sViewsWithIds.put(R.id.userProfileImage, 10);
        sViewsWithIds.put(R.id.resumeLinear, 11);
        sViewsWithIds.put(R.id.epResumeTitle, 12);
        sViewsWithIds.put(R.id.timeRemaning, 13);
        sViewsWithIds.put(R.id.movie_premuim, 14);
        sViewsWithIds.put(R.id.userName, 15);
        sViewsWithIds.put(R.id.birthday, 16);
        sViewsWithIds.put(R.id.userBio, 17);
        sViewsWithIds.put(R.id.filmographieTotal, 18);
        sViewsWithIds.put(R.id.recyclerViewCastMovieDetail, 19);
        sViewsWithIds.put(R.id.progress_bar, 20);
        sViewsWithIds.put(R.id.ad_view_container, 21);
        sViewsWithIds.put(R.id.bannerContainerIron, 22);
        sViewsWithIds.put(R.id.banner_container, 23);
        sViewsWithIds.put(R.id.unity_banner_view_container, 24);
        sViewsWithIds.put(R.id.appodealBannerView, 25);
        sViewsWithIds.put(R.id.bottom_sheet, 26);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemUserDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 27, sIncludes, sViewsWithIds));
    }
    private ItemUserDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.FrameLayout) bindings[21]
            , (com.google.android.material.appbar.AppBarLayout) bindings[1]
            , (com.appodeal.ads.BannerView) bindings[25]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.LinearLayout) bindings[23]
            , (android.widget.FrameLayout) bindings[22]
            , (android.widget.TextView) bindings[16]
            , (android.widget.FrameLayout) bindings[26]
            , (android.widget.TextView) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[18]
            , (android.widget.ImageView) bindings[7]
            , (androidx.core.widget.NestedScrollView) bindings[8]
            , (android.widget.TextView) bindings[14]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[6]
            , (android.widget.ProgressBar) bindings[20]
            , (androidx.recyclerview.widget.RecyclerView) bindings[19]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.TextView) bindings[13]
            , (androidx.appcompat.widget.Toolbar) bindings[2]
            , (android.widget.RelativeLayout) bindings[24]
            , (com.borjabravo.readmoretextview.ReadMoreTextView) bindings[17]
            , (android.widget.TextView) bindings[15]
            , (com.mikhaellopez.circularimageview.CircularImageView) bindings[10]
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