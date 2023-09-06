package com.easyplex.databinding;
import com.easyplex.R;
import com.easyplex.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class MainToolbarBindingImpl extends MainToolbarBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.logo_image_top, 2);
        sViewsWithIds.put(R.id.NavigationTabLayout, 3);
        sViewsWithIds.put(R.id.settings, 4);
        sViewsWithIds.put(R.id.settingsImage, 5);
        sViewsWithIds.put(R.id.userImg, 6);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MainToolbarBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private MainToolbarBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.ImageView) bindings[5]
            , (androidx.appcompat.widget.Toolbar) bindings[0]
            , (com.mikhaellopez.circularimageview.CircularImageView) bindings[6]
            , (android.widget.LinearLayout) bindings[1]
            );
        this.toolbar.setTag(null);
        this.userProfile.setTag(null);
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
                return onChangeControllerIsProfileSettingEnabled((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeControllerIsProfileSettingEnabled(androidx.databinding.ObservableField<java.lang.Boolean> ControllerIsProfileSettingEnabled, int fieldId) {
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
        androidx.databinding.ObservableField<java.lang.Boolean> controllerIsProfileSettingEnabled = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxControllerIsProfileSettingEnabledGet = false;
        java.lang.Boolean controllerIsProfileSettingEnabledGet = null;
        com.easyplex.ui.users.MenuHandler controller = mController;
        int controllerIsProfileSettingEnabledViewVISIBLEViewGONE = 0;

        if ((dirtyFlags & 0x7L) != 0) {



                if (controller != null) {
                    // read controller.isProfileSettingEnabled
                    controllerIsProfileSettingEnabled = controller.isProfileSettingEnabled;
                }
                updateRegistration(0, controllerIsProfileSettingEnabled);


                if (controllerIsProfileSettingEnabled != null) {
                    // read controller.isProfileSettingEnabled.get()
                    controllerIsProfileSettingEnabledGet = controllerIsProfileSettingEnabled.get();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controller.isProfileSettingEnabled.get())
                androidxDatabindingViewDataBindingSafeUnboxControllerIsProfileSettingEnabledGet = androidx.databinding.ViewDataBinding.safeUnbox(controllerIsProfileSettingEnabledGet);
            if((dirtyFlags & 0x7L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxControllerIsProfileSettingEnabledGet) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controller.isProfileSettingEnabled.get()) ? View.VISIBLE : View.GONE
                controllerIsProfileSettingEnabledViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxControllerIsProfileSettingEnabledGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.userProfile.setVisibility(controllerIsProfileSettingEnabledViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): controller.isProfileSettingEnabled
        flag 1 (0x2L): controller
        flag 2 (0x3L): null
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(controller.isProfileSettingEnabled.get()) ? View.VISIBLE : View.GONE
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(controller.isProfileSettingEnabled.get()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}