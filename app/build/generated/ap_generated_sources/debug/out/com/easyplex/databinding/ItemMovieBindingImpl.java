package com.easyplex.databinding;
import com.easyplex.R;
import com.easyplex.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ItemMovieBindingImpl extends ItemMovieBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cardView, 3);
        sViewsWithIds.put(R.id.itemMovieImage, 4);
        sViewsWithIds.put(R.id.movie_premuim, 5);
        sViewsWithIds.put(R.id.substitle, 6);
        sViewsWithIds.put(R.id.hasNewEpisodes, 7);
        sViewsWithIds.put(R.id.movietitle, 8);
        sViewsWithIds.put(R.id.mgenres, 9);
        sViewsWithIds.put(R.id.rating_bar, 10);
        sViewsWithIds.put(R.id.view_movie_rating, 11);
    }
    // views
    @NonNull
    private final com.easyplex.util.GridItemImageView mboundView1;
    @NonNull
    private final com.easyplex.util.GridItemImageView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemMovieBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ItemMovieBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.FrameLayout) bindings[3]
            , (android.widget.LinearLayout) bindings[7]
            , (com.easyplex.util.GridItemImageView) bindings[4]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[8]
            , (android.widget.RatingBar) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[11]
            );
        this.mboundView1 = (com.easyplex.util.GridItemImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (com.easyplex.util.GridItemImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.rootLayout.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.controller == variableId) {
            setController((com.easyplex.util.AppController) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setController(@Nullable com.easyplex.util.AppController Controller) {
        updateRegistration(1, Controller);
        this.mController = Controller;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.controller);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeControllerIsShadowEnabled((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeController((com.easyplex.util.AppController) object, fieldId);
        }
        return false;
    }
    private boolean onChangeControllerIsShadowEnabled(androidx.databinding.ObservableField<java.lang.Boolean> ControllerIsShadowEnabled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeController(com.easyplex.util.AppController Controller, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        androidx.databinding.ObservableField<java.lang.Boolean> controllerIsShadowEnabled = null;
        int controllerIsShadowEnabledViewGONEViewVISIBLE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxControllerIsShadowEnabledGet = false;
        java.lang.Boolean controllerIsShadowEnabledGet = null;
        com.easyplex.util.AppController controller = mController;

        if ((dirtyFlags & 0x7L) != 0) {



                if (controller != null) {
                    // read controller.isShadowEnabled
                    controllerIsShadowEnabled = controller.isShadowEnabled;
                }
                updateRegistration(0, controllerIsShadowEnabled);


                if (controllerIsShadowEnabled != null) {
                    // read controller.isShadowEnabled.get()
                    controllerIsShadowEnabledGet = controllerIsShadowEnabled.get();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controller.isShadowEnabled.get())
                androidxDatabindingViewDataBindingSafeUnboxControllerIsShadowEnabledGet = androidx.databinding.ViewDataBinding.safeUnbox(controllerIsShadowEnabledGet);
            if((dirtyFlags & 0x7L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxControllerIsShadowEnabledGet) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controller.isShadowEnabled.get()) ? View.GONE : View.VISIBLE
                controllerIsShadowEnabledViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxControllerIsShadowEnabledGet) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(controllerIsShadowEnabledViewGONEViewVISIBLE);
            this.mboundView2.setVisibility(controllerIsShadowEnabledViewGONEViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): controller.isShadowEnabled
        flag 1 (0x2L): controller
        flag 2 (0x3L): null
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(controller.isShadowEnabled.get()) ? View.GONE : View.VISIBLE
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(controller.isShadowEnabled.get()) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}