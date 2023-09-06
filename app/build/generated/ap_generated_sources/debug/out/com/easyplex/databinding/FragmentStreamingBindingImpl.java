package com.easyplex.databinding;
import com.easyplex.R;
import com.easyplex.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentStreamingBindingImpl extends FragmentStreamingBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appbar, 1);
        sViewsWithIds.put(R.id.toolbar, 2);
        sViewsWithIds.put(R.id.logo_image_top, 3);
        sViewsWithIds.put(R.id.main_content, 4);
        sViewsWithIds.put(R.id.swipe_container, 5);
        sViewsWithIds.put(R.id.scrollView, 6);
        sViewsWithIds.put(R.id.planets_spinner, 7);
        sViewsWithIds.put(R.id.recyclerView, 8);
        sViewsWithIds.put(R.id.noMoviesFound, 9);
        sViewsWithIds.put(R.id.noResults, 10);
        sViewsWithIds.put(R.id.text_view_select_another_genre, 11);
        sViewsWithIds.put(R.id.progress_bar, 12);
        sViewsWithIds.put(R.id.filter_btn, 13);
        sViewsWithIds.put(R.id.selected_genre, 14);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentStreamingBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private FragmentStreamingBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.appbar.AppBarLayout) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.ImageView) bindings[3]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[4]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.TextView) bindings[10]
            , (com.chivorn.smartmaterialspinner.SmartMaterialSpinner) bindings[7]
            , (android.widget.ProgressBar) bindings[12]
            , (androidx.recyclerview.widget.RecyclerView) bindings[8]
            , (androidx.core.widget.NestedScrollView) bindings[6]
            , (android.widget.TextView) bindings[14]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[5]
            , (android.widget.TextView) bindings[11]
            , (androidx.appcompat.widget.Toolbar) bindings[2]
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