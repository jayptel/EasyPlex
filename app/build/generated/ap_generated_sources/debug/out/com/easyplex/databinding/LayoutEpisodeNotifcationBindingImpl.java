package com.easyplex.databinding;
import com.easyplex.R;
import com.easyplex.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class LayoutEpisodeNotifcationBindingImpl extends LayoutEpisodeNotifcationBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.next_cover_media, 1);
        sViewsWithIds.put(R.id.progress_bar, 2);
        sViewsWithIds.put(R.id.left_info, 3);
        sViewsWithIds.put(R.id.text_view_video_next_name, 4);
        sViewsWithIds.put(R.id.rating_bar, 5);
        sViewsWithIds.put(R.id.view_movie_rating, 6);
        sViewsWithIds.put(R.id.textViewVideoRelease, 7);
        sViewsWithIds.put(R.id.text_view_video_next_release_date, 8);
        sViewsWithIds.put(R.id.text_overview_label, 9);
        sViewsWithIds.put(R.id.close_media_ended, 10);
        sViewsWithIds.put(R.id.nextPlayLayout, 11);
        sViewsWithIds.put(R.id.text_view_video_time_remaining, 12);
        sViewsWithIds.put(R.id.cardView, 13);
        sViewsWithIds.put(R.id.image_view_movie_next, 14);
        sViewsWithIds.put(R.id.miniPlay, 15);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutEpisodeNotifcationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private LayoutEpisodeNotifcationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.FrameLayout) bindings[13]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.FrameLayout) bindings[0]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.FrameLayout) bindings[11]
            , (android.widget.ProgressBar) bindings[2]
            , (android.widget.RatingBar) bindings[5]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[6]
            );
        this.framlayoutMediaEnded.setTag(null);
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