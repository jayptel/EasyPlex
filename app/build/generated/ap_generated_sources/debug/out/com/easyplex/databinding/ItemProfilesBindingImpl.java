package com.easyplex.databinding;
import com.easyplex.R;
import com.easyplex.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ItemProfilesBindingImpl extends ItemProfilesBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.itemMovieImage, 3);
        sViewsWithIds.put(R.id.profileTitle, 4);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemProfilesBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ItemProfilesBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.LinearLayout) bindings[1]
            , (android.widget.LinearLayout) bindings[2]
            , (com.mikhaellopez.circularimageview.CircularImageView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.LinearLayout) bindings[0]
            );
        this.deleteProfile.setTag(null);
        this.editProfile.setTag(null);
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
            setController((com.easyplex.ui.users.MenuHandler) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setController(@Nullable com.easyplex.ui.users.MenuHandler Controller) {
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
                return onChangeControllerIsUserEditMode((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeControllerIsUserEditMode(androidx.databinding.ObservableField<java.lang.Boolean> ControllerIsUserEditMode, int fieldId) {
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
        androidx.databinding.ObservableField<java.lang.Boolean> controllerIsUserEditMode = null;
        com.easyplex.ui.users.MenuHandler controller = mController;
        int controllerIsUserEditModeViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxControllerIsUserEditModeGet = false;
        java.lang.Boolean controllerIsUserEditModeGet = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (controller != null) {
                    // read controller.isUserEditMode
                    controllerIsUserEditMode = controller.isUserEditMode;
                }
                updateRegistration(0, controllerIsUserEditMode);


                if (controllerIsUserEditMode != null) {
                    // read controller.isUserEditMode.get()
                    controllerIsUserEditModeGet = controllerIsUserEditMode.get();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controller.isUserEditMode.get())
                androidxDatabindingViewDataBindingSafeUnboxControllerIsUserEditModeGet = androidx.databinding.ViewDataBinding.safeUnbox(controllerIsUserEditModeGet);
            if((dirtyFlags & 0x7L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxControllerIsUserEditModeGet) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controller.isUserEditMode.get()) ? View.VISIBLE : View.GONE
                controllerIsUserEditModeViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxControllerIsUserEditModeGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.deleteProfile.setVisibility(controllerIsUserEditModeViewVISIBLEViewGONE);
            this.editProfile.setVisibility(controllerIsUserEditModeViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): controller.isUserEditMode
        flag 1 (0x2L): controller
        flag 2 (0x3L): null
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(controller.isUserEditMode.get()) ? View.VISIBLE : View.GONE
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(controller.isUserEditMode.get()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}