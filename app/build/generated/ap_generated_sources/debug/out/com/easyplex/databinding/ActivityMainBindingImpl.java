package com.easyplex.databinding;
import com.easyplex.R;
import com.easyplex.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.app_bar_layout, 1);
        sViewsWithIds.put(R.id.view_pager, 2);
        sViewsWithIds.put(R.id.fragment_container, 3);
        sViewsWithIds.put(R.id.VungleBannerContainerIron, 4);
        sViewsWithIds.put(R.id.bannerAppNext, 5);
        sViewsWithIds.put(R.id.maxAdView, 6);
        sViewsWithIds.put(R.id.bannerContainerIron, 7);
        sViewsWithIds.put(R.id.unity_banner_view_container, 8);
        sViewsWithIds.put(R.id.banner_container, 9);
        sViewsWithIds.put(R.id.ad_view_container, 10);
        sViewsWithIds.put(R.id.appodealBannerView, 11);
        sViewsWithIds.put(R.id.navigation, 12);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.FrameLayout) bindings[4]
            , (android.widget.FrameLayout) bindings[10]
            , (com.google.android.material.appbar.AppBarLayout) bindings[1]
            , (com.appodeal.ads.BannerView) bindings[11]
            , (com.appnext.banners.BannerView) bindings[5]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.FrameLayout) bindings[7]
            , (android.widget.FrameLayout) bindings[3]
            , (android.widget.FrameLayout) bindings[6]
            , (com.google.android.material.bottomnavigation.BottomNavigationView) bindings[12]
            , (android.widget.RelativeLayout) bindings[8]
            , (androidx.viewpager.widget.ViewPager) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
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