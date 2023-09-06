package com.easyplex.databinding;
import com.easyplex.R;
import com.easyplex.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentSearchBindingImpl extends FragmentSearchBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 1);
        sViewsWithIds.put(R.id.et_search, 2);
        sViewsWithIds.put(R.id.bt_clear, 3);
        sViewsWithIds.put(R.id.progress_bar, 4);
        sViewsWithIds.put(R.id.scrollView, 5);
        sViewsWithIds.put(R.id.noResults, 6);
        sViewsWithIds.put(R.id.movietitle, 7);
        sViewsWithIds.put(R.id.linear_movies, 8);
        sViewsWithIds.put(R.id.titlesResult, 9);
        sViewsWithIds.put(R.id.search_layout, 10);
        sViewsWithIds.put(R.id.rv_search, 11);
        sViewsWithIds.put(R.id.linear_genres, 12);
        sViewsWithIds.put(R.id.rv_genres, 13);
        sViewsWithIds.put(R.id.linear_suggested, 14);
        sViewsWithIds.put(R.id.rv_suggested, 15);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSearchBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private FragmentSearchBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageButton) bindings[3]
            , (android.widget.FrameLayout) bindings[0]
            , (android.widget.EditText) bindings[2]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.TextView) bindings[7]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.ProgressBar) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[13]
            , (androidx.recyclerview.widget.RecyclerView) bindings[11]
            , (androidx.recyclerview.widget.RecyclerView) bindings[15]
            , (androidx.core.widget.NestedScrollView) bindings[5]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.TextView) bindings[9]
            , (androidx.appcompat.widget.Toolbar) bindings[1]
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