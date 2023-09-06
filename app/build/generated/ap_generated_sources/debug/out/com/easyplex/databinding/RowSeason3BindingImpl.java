package com.easyplex.databinding;
import com.easyplex.R;
import com.easyplex.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class RowSeason3BindingImpl extends RowSeason3Binding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.main_content_episode, 1);
        sViewsWithIds.put(R.id.PlayButtonIcon, 2);
        sViewsWithIds.put(R.id.eptitle, 3);
        sViewsWithIds.put(R.id.bt_expand, 4);
        sViewsWithIds.put(R.id.downloadEpisode, 5);
        sViewsWithIds.put(R.id.lyt_expand, 6);
        sViewsWithIds.put(R.id.upcoming_relative, 7);
        sViewsWithIds.put(R.id.epcover, 8);
        sViewsWithIds.put(R.id.miniPlay, 9);
        sViewsWithIds.put(R.id.time_remaning, 10);
        sViewsWithIds.put(R.id.resume_progress_bar, 11);
        sViewsWithIds.put(R.id.eptitle_sub, 12);
        sViewsWithIds.put(R.id.eptitle2, 13);
        sViewsWithIds.put(R.id.epoverview, 14);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowSeason3BindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private RowSeason3BindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageButton) bindings[4]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[12]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.LinearLayout) bindings[1]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ProgressBar) bindings[11]
            , (android.widget.TextView) bindings[10]
            , (android.widget.RelativeLayout) bindings[7]
            );
        this.epLayout.setTag(null);
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