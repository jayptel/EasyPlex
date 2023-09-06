package com.easyplex.databinding;
import com.easyplex.R;
import com.easyplex.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ActivityProfilesSelectionBindingImpl extends ActivityProfilesSelectionBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.splash_image, 7);
        sViewsWithIds.put(R.id.loader, 8);
        sViewsWithIds.put(R.id.logo_image_top, 9);
        sViewsWithIds.put(R.id.closeProfile, 10);
        sViewsWithIds.put(R.id.text_movie_title, 11);
        sViewsWithIds.put(R.id.rv_profiles, 12);
        sViewsWithIds.put(R.id.addProfileLinear, 13);
        sViewsWithIds.put(R.id.manageProfileLinear, 14);
        sViewsWithIds.put(R.id.LinearLayout, 15);
        sViewsWithIds.put(R.id.bt_close, 16);
        sViewsWithIds.put(R.id.userProfileImage, 17);
        sViewsWithIds.put(R.id.userProfileName, 18);
        sViewsWithIds.put(R.id.addProfile, 19);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_top, 20);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_left, 21);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_right, 22);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_bottom, 23);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_seek_left, 24);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_seek_right, 25);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView4;
    @NonNull
    private final android.widget.RelativeLayout mboundView6;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityProfilesSelectionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 26, sIncludes, sViewsWithIds));
    }
    private ActivityProfilesSelectionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.ImageButton) bindings[16]
            , (android.widget.TextView) bindings[5]
            , (android.widget.ImageButton) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[1]
            , (android.widget.ProgressBar) bindings[8]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.ProgressBar) bindings[3]
            , (android.widget.LinearLayout) bindings[2]
            , (com.easyplex.ui.downloadmanager.ui.customview.EmptyRecyclerView) bindings[12]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.TextView) bindings[11]
            , (androidx.constraintlayout.widget.Guideline) bindings[23]
            , (androidx.constraintlayout.widget.Guideline) bindings[21]
            , (androidx.constraintlayout.widget.Guideline) bindings[22]
            , (androidx.constraintlayout.widget.Guideline) bindings[24]
            , (androidx.constraintlayout.widget.Guideline) bindings[25]
            , (androidx.constraintlayout.widget.Guideline) bindings[20]
            , (com.mikhaellopez.circularimageview.CircularImageView) bindings[17]
            , (com.google.android.material.textfield.TextInputLayout) bindings[18]
            );
        this.clodeModetProfile.setTag(null);
        this.constraintLayout.setTag(null);
        this.formContainer.setTag(null);
        this.mboundView4 = (android.widget.LinearLayout) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView6 = (android.widget.RelativeLayout) bindings[6];
        this.mboundView6.setTag(null);
        this.progressBar.setTag(null);
        this.rvLinear.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.controller);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeControllerIsUserCreatingProfile((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeControllerManageProfileText((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeControllerIsDataLoaded((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeControllerIsUserCreatingProfile(androidx.databinding.ObservableField<java.lang.Boolean> ControllerIsUserCreatingProfile, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerManageProfileText(androidx.databinding.ObservableField<java.lang.String> ControllerManageProfileText, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerIsDataLoaded(androidx.databinding.ObservableField<java.lang.Boolean> ControllerIsDataLoaded, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        boolean controllerIsUserCreatingProfile = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxControllerIsDataLoadedGet = false;
        java.lang.String controllerManageProfileTextGet = null;
        boolean controllerIsDataLoaded = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxControllerIsUserCreatingProfileGet = false;
        int controllerIsUserCreatingProfileViewVISIBLEViewGONE = 0;
        java.lang.Boolean controllerIsDataLoadedGet = null;
        int controllerIsDataLoadedViewVISIBLEViewGONE = 0;
        androidx.databinding.ObservableField<java.lang.Boolean> ControllerIsUserCreatingProfile1 = null;
        androidx.databinding.ObservableField<java.lang.String> controllerManageProfileText = null;
        int ControllerIsUserCreatingProfileViewVISIBLEViewGONE1 = 0;
        com.easyplex.ui.users.MenuHandler controller = mController;
        androidx.databinding.ObservableField<java.lang.Boolean> ControllerIsDataLoaded1 = null;
        java.lang.Boolean controllerIsUserCreatingProfileGet = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (controller != null) {
                        // read controller.isUserCreatingProfile
                        ControllerIsUserCreatingProfile1 = controller.isUserCreatingProfile;
                    }
                    updateRegistration(0, ControllerIsUserCreatingProfile1);


                    if (ControllerIsUserCreatingProfile1 != null) {
                        // read controller.isUserCreatingProfile.get()
                        controllerIsUserCreatingProfileGet = ControllerIsUserCreatingProfile1.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controller.isUserCreatingProfile.get())
                    androidxDatabindingViewDataBindingSafeUnboxControllerIsUserCreatingProfileGet = androidx.databinding.ViewDataBinding.safeUnbox(controllerIsUserCreatingProfileGet);
                if((dirtyFlags & 0x19L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControllerIsUserCreatingProfileGet) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(controller.isUserCreatingProfile.get())
                    controllerIsUserCreatingProfile = !androidxDatabindingViewDataBindingSafeUnboxControllerIsUserCreatingProfileGet;
                    // read androidx.databinding.ViewDataBinding.safeUnbox(controller.isUserCreatingProfile.get()) ? View.VISIBLE : View.GONE
                    ControllerIsUserCreatingProfileViewVISIBLEViewGONE1 = ((androidxDatabindingViewDataBindingSafeUnboxControllerIsUserCreatingProfileGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                if((dirtyFlags & 0x19L) != 0) {
                    if(controllerIsUserCreatingProfile) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(controller.isUserCreatingProfile.get()) ? View.VISIBLE : View.GONE
                    controllerIsUserCreatingProfileViewVISIBLEViewGONE = ((controllerIsUserCreatingProfile) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (controller != null) {
                        // read controller.manageProfileText
                        controllerManageProfileText = controller.manageProfileText;
                    }
                    updateRegistration(1, controllerManageProfileText);


                    if (controllerManageProfileText != null) {
                        // read controller.manageProfileText.get()
                        controllerManageProfileTextGet = controllerManageProfileText.get();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (controller != null) {
                        // read controller.isDataLoaded
                        ControllerIsDataLoaded1 = controller.isDataLoaded;
                    }
                    updateRegistration(2, ControllerIsDataLoaded1);


                    if (ControllerIsDataLoaded1 != null) {
                        // read controller.isDataLoaded.get()
                        controllerIsDataLoadedGet = ControllerIsDataLoaded1.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controller.isDataLoaded.get())
                    androidxDatabindingViewDataBindingSafeUnboxControllerIsDataLoadedGet = androidx.databinding.ViewDataBinding.safeUnbox(controllerIsDataLoadedGet);


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(controller.isDataLoaded.get())
                    controllerIsDataLoaded = !androidxDatabindingViewDataBindingSafeUnboxControllerIsDataLoadedGet;
                if((dirtyFlags & 0x1cL) != 0) {
                    if(controllerIsDataLoaded) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(controller.isDataLoaded.get()) ? View.VISIBLE : View.GONE
                    controllerIsDataLoadedViewVISIBLEViewGONE = ((controllerIsDataLoaded) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.clodeModetProfile, controllerManageProfileTextGet);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            this.formContainer.setVisibility(controllerIsUserCreatingProfileViewVISIBLEViewGONE);
            this.mboundView4.setVisibility(controllerIsUserCreatingProfileViewVISIBLEViewGONE);
            this.mboundView6.setVisibility(ControllerIsUserCreatingProfileViewVISIBLEViewGONE1);
            this.rvLinear.setVisibility(controllerIsUserCreatingProfileViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            this.progressBar.setVisibility(controllerIsDataLoadedViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): controller.isUserCreatingProfile
        flag 1 (0x2L): controller.manageProfileText
        flag 2 (0x3L): controller.isDataLoaded
        flag 3 (0x4L): controller
        flag 4 (0x5L): null
        flag 5 (0x6L): !androidx.databinding.ViewDataBinding.safeUnbox(controller.isUserCreatingProfile.get()) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): !androidx.databinding.ViewDataBinding.safeUnbox(controller.isUserCreatingProfile.get()) ? View.VISIBLE : View.GONE
        flag 7 (0x8L): !androidx.databinding.ViewDataBinding.safeUnbox(controller.isDataLoaded.get()) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): !androidx.databinding.ViewDataBinding.safeUnbox(controller.isDataLoaded.get()) ? View.VISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(controller.isUserCreatingProfile.get()) ? View.VISIBLE : View.GONE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(controller.isUserCreatingProfile.get()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}