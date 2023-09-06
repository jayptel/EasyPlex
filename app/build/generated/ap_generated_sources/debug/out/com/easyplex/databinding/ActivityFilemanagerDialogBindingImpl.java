package com.easyplex.databinding;
import com.easyplex.R;
import com.easyplex.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ActivityFilemanagerDialogBindingImpl extends ActivityFilemanagerDialogBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.app_bar, 6);
        sViewsWithIds.put(R.id.toolbar, 7);
        sViewsWithIds.put(R.id.swipe_container, 8);
        sViewsWithIds.put(R.id.bottom_bar, 9);
        sViewsWithIds.put(R.id.layout_file_name, 10);
        sViewsWithIds.put(R.id.file_name, 11);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView5;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityFilemanagerDialogBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ActivityFilemanagerDialogBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[4]
            , (com.google.android.material.appbar.AppBarLayout) bindings[6]
            , (android.widget.FrameLayout) bindings[9]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (com.google.android.material.textfield.TextInputEditText) bindings[11]
            , (com.google.android.material.textfield.TextInputLayout) bindings[10]
            , (com.google.android.material.button.MaterialButton) bindings[3]
            , (com.easyplex.ui.downloadmanager.ui.customview.ThemedSwipeRefreshLayout) bindings[8]
            , (android.widget.TextView) bindings[1]
            , (androidx.appcompat.widget.Toolbar) bindings[7]
            );
        this.addFab.setTag(null);
        this.coordinatorLayout.setTag(null);
        this.fileList.setTag(null);
        this.mboundView5 = (android.widget.FrameLayout) bindings[5];
        this.mboundView5.setTag(null);
        this.openSystemFilemanagerFab.setTag(null);
        this.titleCurFolderPath.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.enableSystemManagerButton == variableId) {
            setEnableSystemManagerButton((java.lang.Boolean) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.easyplex.ui.downloadmanager.ui.filemanager.FileManagerViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setEnableSystemManagerButton(@Nullable java.lang.Boolean EnableSystemManagerButton) {
        this.mEnableSystemManagerButton = EnableSystemManagerButton;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.enableSystemManagerButton);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.easyplex.ui.downloadmanager.ui.filemanager.FileManagerViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelCurDir((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelCurDir(androidx.databinding.ObservableField<java.lang.String> ViewModelCurDir, int fieldId) {
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
        int enableSystemManagerButtonBooleanValueViewVISIBLEViewGONE = 0;
        float enableSystemManagerButtonBooleanValueFileListAndroidDimenFabSizeFileListAndroidDimenFabMarginFileListAndroidDimenPaddingZero = 0f;
        boolean viewModelConfigShowModeFileManagerConfigSAVEFILEMODE = false;
        java.lang.String viewModelCurDirGet = null;
        boolean enableSystemManagerButtonBooleanValue = false;
        com.easyplex.ui.downloadmanager.ui.filemanager.FileManagerConfig viewModelConfig = null;
        boolean viewModelConfigShowModeFileManagerConfigDIRCHOOSERMODEBooleanTrueViewModelConfigShowModeFileManagerConfigSAVEFILEMODE = false;
        java.lang.Boolean enableSystemManagerButton = mEnableSystemManagerButton;
        int viewModelConfigShowModeFileManagerConfigDIRCHOOSERMODEBooleanTrueViewModelConfigShowModeFileManagerConfigSAVEFILEMODEViewVISIBLEViewGONE = 0;
        androidx.databinding.ObservableField<java.lang.String> viewModelCurDir = null;
        int viewModelConfigShowMode = 0;
        boolean viewModelConfigShowModeFileManagerConfigDIRCHOOSERMODE = false;
        com.easyplex.ui.downloadmanager.ui.filemanager.FileManagerViewModel viewModel = mViewModel;
        int viewModelConfigShowModeFileManagerConfigSAVEFILEMODEViewVISIBLEViewGONE = 0;

        if ((dirtyFlags & 0xaL) != 0) {



                if (enableSystemManagerButton != null) {
                    // read enableSystemManagerButton.booleanValue()
                    enableSystemManagerButtonBooleanValue = enableSystemManagerButton.booleanValue();
                }
            if((dirtyFlags & 0xaL) != 0) {
                if(enableSystemManagerButtonBooleanValue) {
                        dirtyFlags |= 0x20L;
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                }
            }


                // read enableSystemManagerButton.booleanValue() ? View.VISIBLE : View.GONE
                enableSystemManagerButtonBooleanValueViewVISIBLEViewGONE = ((enableSystemManagerButtonBooleanValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read enableSystemManagerButton.booleanValue() ? (@android:dimen/fab_size) + (@android:dimen/fab_margin) : @android:dimen/padding_zero
                enableSystemManagerButtonBooleanValueFileListAndroidDimenFabSizeFileListAndroidDimenFabMarginFileListAndroidDimenPaddingZero = ((enableSystemManagerButtonBooleanValue) ? ((fileList.getResources().getDimension(R.dimen.fab_size)) + (fileList.getResources().getDimension(R.dimen.fab_margin))) : (fileList.getResources().getDimension(R.dimen.padding_zero)));
        }
        if ((dirtyFlags & 0xdL) != 0) {


            if ((dirtyFlags & 0xcL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.config
                        viewModelConfig = viewModel.config;
                    }


                    if (viewModelConfig != null) {
                        // read viewModel.config.showMode
                        viewModelConfigShowMode = viewModelConfig.showMode;
                    }


                    // read viewModel.config.showMode == FileManagerConfig.SAVE_FILE_MODE
                    viewModelConfigShowModeFileManagerConfigSAVEFILEMODE = (viewModelConfigShowMode) == (com.easyplex.ui.downloadmanager.ui.filemanager.FileManagerConfig.SAVE_FILE_MODE);
                    // read viewModel.config.showMode == FileManagerConfig.DIR_CHOOSER_MODE
                    viewModelConfigShowModeFileManagerConfigDIRCHOOSERMODE = (viewModelConfigShowMode) == (com.easyplex.ui.downloadmanager.ui.filemanager.FileManagerConfig.DIR_CHOOSER_MODE);
                if((dirtyFlags & 0xcL) != 0) {
                    if(viewModelConfigShowModeFileManagerConfigSAVEFILEMODE) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }
                if((dirtyFlags & 0xcL) != 0) {
                    if(viewModelConfigShowModeFileManagerConfigDIRCHOOSERMODE) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read viewModel.config.showMode == FileManagerConfig.SAVE_FILE_MODE ? View.VISIBLE : View.GONE
                    viewModelConfigShowModeFileManagerConfigSAVEFILEMODEViewVISIBLEViewGONE = ((viewModelConfigShowModeFileManagerConfigSAVEFILEMODE) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }

                if (viewModel != null) {
                    // read viewModel.curDir
                    viewModelCurDir = viewModel.curDir;
                }
                updateRegistration(0, viewModelCurDir);


                if (viewModelCurDir != null) {
                    // read viewModel.curDir.get()
                    viewModelCurDirGet = viewModelCurDir.get();
                }
        }
        // batch finished

        if ((dirtyFlags & 0xcL) != 0) {

                // read viewModel.config.showMode == FileManagerConfig.DIR_CHOOSER_MODE ? true : viewModel.config.showMode == FileManagerConfig.SAVE_FILE_MODE
                viewModelConfigShowModeFileManagerConfigDIRCHOOSERMODEBooleanTrueViewModelConfigShowModeFileManagerConfigSAVEFILEMODE = ((viewModelConfigShowModeFileManagerConfigDIRCHOOSERMODE) ? (true) : (viewModelConfigShowModeFileManagerConfigSAVEFILEMODE));
            if((dirtyFlags & 0xcL) != 0) {
                if(viewModelConfigShowModeFileManagerConfigDIRCHOOSERMODEBooleanTrueViewModelConfigShowModeFileManagerConfigSAVEFILEMODE) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }


                // read viewModel.config.showMode == FileManagerConfig.DIR_CHOOSER_MODE ? true : viewModel.config.showMode == FileManagerConfig.SAVE_FILE_MODE ? View.VISIBLE : View.GONE
                viewModelConfigShowModeFileManagerConfigDIRCHOOSERMODEBooleanTrueViewModelConfigShowModeFileManagerConfigSAVEFILEMODEViewVISIBLEViewGONE = ((viewModelConfigShowModeFileManagerConfigDIRCHOOSERMODEBooleanTrueViewModelConfigShowModeFileManagerConfigSAVEFILEMODE) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.addFab.setVisibility(viewModelConfigShowModeFileManagerConfigDIRCHOOSERMODEBooleanTrueViewModelConfigShowModeFileManagerConfigSAVEFILEMODEViewVISIBLEViewGONE);
            this.mboundView5.setVisibility(viewModelConfigShowModeFileManagerConfigSAVEFILEMODEViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setPaddingTop(this.fileList, enableSystemManagerButtonBooleanValueFileListAndroidDimenFabSizeFileListAndroidDimenFabMarginFileListAndroidDimenPaddingZero);
            this.openSystemFilemanagerFab.setVisibility(enableSystemManagerButtonBooleanValueViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setPaddingBottom(this.fileList, (fileList.getResources().getDimension(R.dimen.fab_size)) + (fileList.getResources().getDimension(R.dimen.fab_margin)));
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.titleCurFolderPath, viewModelCurDirGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.curDir
        flag 1 (0x2L): enableSystemManagerButton
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): enableSystemManagerButton.booleanValue() ? View.VISIBLE : View.GONE
        flag 5 (0x6L): enableSystemManagerButton.booleanValue() ? View.VISIBLE : View.GONE
        flag 6 (0x7L): enableSystemManagerButton.booleanValue() ? (@android:dimen/fab_size) + (@android:dimen/fab_margin) : @android:dimen/padding_zero
        flag 7 (0x8L): enableSystemManagerButton.booleanValue() ? (@android:dimen/fab_size) + (@android:dimen/fab_margin) : @android:dimen/padding_zero
        flag 8 (0x9L): viewModel.config.showMode == FileManagerConfig.DIR_CHOOSER_MODE ? true : viewModel.config.showMode == FileManagerConfig.SAVE_FILE_MODE
        flag 9 (0xaL): viewModel.config.showMode == FileManagerConfig.DIR_CHOOSER_MODE ? true : viewModel.config.showMode == FileManagerConfig.SAVE_FILE_MODE
        flag 10 (0xbL): viewModel.config.showMode == FileManagerConfig.DIR_CHOOSER_MODE ? true : viewModel.config.showMode == FileManagerConfig.SAVE_FILE_MODE ? View.VISIBLE : View.GONE
        flag 11 (0xcL): viewModel.config.showMode == FileManagerConfig.DIR_CHOOSER_MODE ? true : viewModel.config.showMode == FileManagerConfig.SAVE_FILE_MODE ? View.VISIBLE : View.GONE
        flag 12 (0xdL): viewModel.config.showMode == FileManagerConfig.SAVE_FILE_MODE ? View.VISIBLE : View.GONE
        flag 13 (0xeL): viewModel.config.showMode == FileManagerConfig.SAVE_FILE_MODE ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}