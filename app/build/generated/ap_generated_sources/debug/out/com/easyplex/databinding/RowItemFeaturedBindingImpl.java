package com.easyplex.databinding;
import com.easyplex.R;
import com.easyplex.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class RowItemFeaturedBindingImpl extends RowItemFeaturedBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.item_movie_image, 1);
        sViewsWithIds.put(R.id.custom_ad_featured, 2);
        sViewsWithIds.put(R.id.selected_genre, 3);
        sViewsWithIds.put(R.id.miniPoster, 4);
        sViewsWithIds.put(R.id.view_islive, 5);
        sViewsWithIds.put(R.id.btn_premuim, 6);
        sViewsWithIds.put(R.id.movietitle, 7);
        sViewsWithIds.put(R.id.qualities, 8);
        sViewsWithIds.put(R.id.featuted_main_info, 9);
        sViewsWithIds.put(R.id.view_movie_rating, 10);
        sViewsWithIds.put(R.id.textMovieRelease, 11);
        sViewsWithIds.put(R.id.mgenres, 12);
        sViewsWithIds.put(R.id.movie_premuim, 13);
        sViewsWithIds.put(R.id.PlayButtonIconLinear, 14);
        sViewsWithIds.put(R.id.PlayButtonIcon, 15);
        sViewsWithIds.put(R.id.linearAddFavorite, 16);
        sViewsWithIds.put(R.id.addToFavorite, 17);
        sViewsWithIds.put(R.id.addToFavoriteText, 18);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowItemFeaturedBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private RowItemFeaturedBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[15]
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.TextView) bindings[18]
            , (android.widget.Button) bindings[6]
            , (android.widget.RelativeLayout) bindings[2]
            , (android.widget.LinearLayout) bindings[9]
            , (com.easyplex.util.GridItemImageView) bindings[1]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.TextView) bindings[12]
            , (com.easyplex.util.GridItemImageView) bindings[4]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.FrameLayout) bindings[0]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[10]
            );
        this.rootLayout.setTag(null);
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