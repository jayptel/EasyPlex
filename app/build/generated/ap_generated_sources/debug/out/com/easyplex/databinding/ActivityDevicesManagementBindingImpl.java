package com.easyplex.databinding;
import com.easyplex.R;
import com.easyplex.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ActivityDevicesManagementBindingImpl extends ActivityDevicesManagementBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(16);
        sIncludes.setIncludes(1, 
            new String[] {"main_toolbar"},
            new int[] {2},
            new int[] {com.easyplex.R.layout.main_toolbar});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scrollView, 3);
        sViewsWithIds.put(R.id.rv_linear, 4);
        sViewsWithIds.put(R.id.rv_profiles, 5);
        sViewsWithIds.put(R.id.view_plans, 6);
        sViewsWithIds.put(R.id.movie_image, 7);
        sViewsWithIds.put(R.id.recycler_view_plans, 8);
        sViewsWithIds.put(R.id.close_plans, 9);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_top, 10);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_left, 11);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_right, 12);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_bottom, 13);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_seek_left, 14);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_seek_right, 15);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityDevicesManagementBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private ActivityDevicesManagementBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.appbar.AppBarLayout) bindings[1]
            , (android.widget.ImageView) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ImageView) bindings[7]
            , (androidx.recyclerview.widget.RecyclerView) bindings[8]
            , (android.widget.LinearLayout) bindings[4]
            , (com.easyplex.ui.downloadmanager.ui.customview.EmptyRecyclerView) bindings[5]
            , (androidx.core.widget.NestedScrollView) bindings[3]
            , (com.easyplex.databinding.MainToolbarBinding) bindings[2]
            , (androidx.constraintlayout.widget.Guideline) bindings[13]
            , (androidx.constraintlayout.widget.Guideline) bindings[11]
            , (androidx.constraintlayout.widget.Guideline) bindings[12]
            , (androidx.constraintlayout.widget.Guideline) bindings[14]
            , (androidx.constraintlayout.widget.Guideline) bindings[15]
            , (androidx.constraintlayout.widget.Guideline) bindings[10]
            , (android.widget.FrameLayout) bindings[6]
            );
        this.appBarLayout.setTag(null);
        this.coordinator.setTag(null);
        setContainedBinding(this.toolbar);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
            return variableSet;
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
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}