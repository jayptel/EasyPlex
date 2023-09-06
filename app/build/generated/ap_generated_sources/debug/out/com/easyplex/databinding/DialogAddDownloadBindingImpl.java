package com.easyplex.databinding;
import com.easyplex.R;
import com.easyplex.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class DialogAddDownloadBindingImpl extends DialogAddDownloadBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layout_link, 16);
        sViewsWithIds.put(R.id.fetch_progress, 17);
        sViewsWithIds.put(R.id.url_clipboard_button, 18);
        sViewsWithIds.put(R.id.layout_name, 19);
        sViewsWithIds.put(R.id.layout_save_path, 20);
        sViewsWithIds.put(R.id.folder_chooser_button, 21);
        sViewsWithIds.put(R.id.after_fetch_layout, 22);
        sViewsWithIds.put(R.id.partial_support_warning, 23);
        sViewsWithIds.put(R.id.partial_support_warning_img, 24);
        sViewsWithIds.put(R.id.referer_title, 25);
        sViewsWithIds.put(R.id.layout_referer, 26);
        sViewsWithIds.put(R.id.expansion_header, 27);
        sViewsWithIds.put(R.id.advanced_layout, 28);
        sViewsWithIds.put(R.id.layout_description, 29);
        sViewsWithIds.put(R.id.pieces_number, 30);
        sViewsWithIds.put(R.id.user_agent_title, 31);
        sViewsWithIds.put(R.id.user_agent, 32);
        sViewsWithIds.put(R.id.add_user_agent, 33);
        sViewsWithIds.put(R.id.checksum_title, 34);
        sViewsWithIds.put(R.id.layout_checksum, 35);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener checksumandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.params.checksum
            //         is viewModel.params.setChecksum((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(checksum);
            // localize variables for thread safety
            // viewModel.params.checksum
            java.lang.String viewModelParamsChecksum = null;
            // viewModel.params != null
            boolean viewModelParamsJavaLangObjectNull = false;
            // viewModel.params
            com.easyplex.ui.downloadmanager.ui.adddownload.AddDownloadParams viewModelParams = null;
            // viewModel
            com.easyplex.ui.downloadmanager.ui.adddownload.AddDownloadViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelParams = viewModel.params;

                viewModelParamsJavaLangObjectNull = (viewModelParams) != (null);
                if (viewModelParamsJavaLangObjectNull) {




                    viewModelParams.setChecksum(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener descriptionandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.params.description
            //         is viewModel.params.setDescription((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(description);
            // localize variables for thread safety
            // viewModel.params != null
            boolean viewModelParamsJavaLangObjectNull = false;
            // viewModel.params
            com.easyplex.ui.downloadmanager.ui.adddownload.AddDownloadParams viewModelParams = null;
            // viewModel
            com.easyplex.ui.downloadmanager.ui.adddownload.AddDownloadViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.params.description
            java.lang.String viewModelParamsDescription = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelParams = viewModel.params;

                viewModelParamsJavaLangObjectNull = (viewModelParams) != (null);
                if (viewModelParamsJavaLangObjectNull) {




                    viewModelParams.setDescription(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener linkandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.params.url
            //         is viewModel.params.setUrl((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(link);
            // localize variables for thread safety
            // viewModel.params != null
            boolean viewModelParamsJavaLangObjectNull = false;
            // viewModel.params
            com.easyplex.ui.downloadmanager.ui.adddownload.AddDownloadParams viewModelParams = null;
            // viewModel
            com.easyplex.ui.downloadmanager.ui.adddownload.AddDownloadViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.params.url
            java.lang.String viewModelParamsUrl = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelParams = viewModel.params;

                viewModelParamsJavaLangObjectNull = (viewModelParams) != (null);
                if (viewModelParamsJavaLangObjectNull) {




                    viewModelParams.setUrl(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener nameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.params.fileName
            //         is viewModel.params.setFileName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(name);
            // localize variables for thread safety
            // viewModel.params != null
            boolean viewModelParamsJavaLangObjectNull = false;
            // viewModel.params.fileName
            java.lang.String viewModelParamsFileName = null;
            // viewModel.params
            com.easyplex.ui.downloadmanager.ui.adddownload.AddDownloadParams viewModelParams = null;
            // viewModel
            com.easyplex.ui.downloadmanager.ui.adddownload.AddDownloadViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelParams = viewModel.params;

                viewModelParamsJavaLangObjectNull = (viewModelParams) != (null);
                if (viewModelParamsJavaLangObjectNull) {




                    viewModelParams.setFileName(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener refererandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.params.referer
            //         is viewModel.params.setReferer((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(referer);
            // localize variables for thread safety
            // viewModel.params.referer
            java.lang.String viewModelParamsReferer = null;
            // viewModel.params != null
            boolean viewModelParamsJavaLangObjectNull = false;
            // viewModel.params
            com.easyplex.ui.downloadmanager.ui.adddownload.AddDownloadParams viewModelParams = null;
            // viewModel
            com.easyplex.ui.downloadmanager.ui.adddownload.AddDownloadViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelParams = viewModel.params;

                viewModelParamsJavaLangObjectNull = (viewModelParams) != (null);
                if (viewModelParamsJavaLangObjectNull) {




                    viewModelParams.setReferer(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener replaceFileandroidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.params.replaceFile
            //         is viewModel.params.setReplaceFile((boolean) callbackArg_0)
            boolean callbackArg_0 = replaceFile.isChecked();
            // localize variables for thread safety
            // viewModel.params != null
            boolean viewModelParamsJavaLangObjectNull = false;
            // viewModel.params
            com.easyplex.ui.downloadmanager.ui.adddownload.AddDownloadParams viewModelParams = null;
            // viewModel.params.replaceFile
            boolean viewModelParamsReplaceFile = false;
            // viewModel
            com.easyplex.ui.downloadmanager.ui.adddownload.AddDownloadViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelParams = viewModel.params;

                viewModelParamsJavaLangObjectNull = (viewModelParams) != (null);
                if (viewModelParamsJavaLangObjectNull) {




                    viewModelParams.setReplaceFile(((boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener retryandroidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.params.retry
            //         is viewModel.params.setRetry((boolean) callbackArg_0)
            boolean callbackArg_0 = retry.isChecked();
            // localize variables for thread safety
            // viewModel.params != null
            boolean viewModelParamsJavaLangObjectNull = false;
            // viewModel.params.retry
            boolean viewModelParamsRetry = false;
            // viewModel.params
            com.easyplex.ui.downloadmanager.ui.adddownload.AddDownloadParams viewModelParams = null;
            // viewModel
            com.easyplex.ui.downloadmanager.ui.adddownload.AddDownloadViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelParams = viewModel.params;

                viewModelParamsJavaLangObjectNull = (viewModelParams) != (null);
                if (viewModelParamsJavaLangObjectNull) {




                    viewModelParams.setRetry(((boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener unmeteredConnectionsOnlyandroidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.params.unmeteredConnectionsOnly
            //         is viewModel.params.setUnmeteredConnectionsOnly((boolean) callbackArg_0)
            boolean callbackArg_0 = unmeteredConnectionsOnly.isChecked();
            // localize variables for thread safety
            // viewModel.params != null
            boolean viewModelParamsJavaLangObjectNull = false;
            // viewModel.params.unmeteredConnectionsOnly
            boolean viewModelParamsUnmeteredConnectionsOnly = false;
            // viewModel.params
            com.easyplex.ui.downloadmanager.ui.adddownload.AddDownloadParams viewModelParams = null;
            // viewModel
            com.easyplex.ui.downloadmanager.ui.adddownload.AddDownloadViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelParams = viewModel.params;

                viewModelParamsJavaLangObjectNull = (viewModelParams) != (null);
                if (viewModelParamsJavaLangObjectNull) {




                    viewModelParams.setUnmeteredConnectionsOnly(((boolean) (callbackArg_0)));
                }
            }
        }
    };

    public DialogAddDownloadBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 36, sIncludes, sViewsWithIds));
    }
    private DialogAddDownloadBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.ImageButton) bindings[33]
            , (net.cachapa.expandablelayout.ExpandableLayout) bindings[28]
            , (android.widget.LinearLayout) bindings[22]
            , (com.easyplex.ui.downloadmanager.ui.customview.FixHintTextInputEditText) bindings[14]
            , (android.widget.ImageButton) bindings[15]
            , (android.widget.TextView) bindings[34]
            , (com.google.android.material.textfield.TextInputEditText) bindings[11]
            , (com.easyplex.ui.downloadmanager.ui.customview.ExpansionHeader) bindings[27]
            , (androidx.core.widget.ContentLoadingProgressBar) bindings[17]
            , (android.widget.ImageButton) bindings[21]
            , (android.widget.TextView) bindings[4]
            , (com.google.android.material.textfield.TextInputLayout) bindings[35]
            , (com.google.android.material.textfield.TextInputLayout) bindings[29]
            , (com.google.android.material.textfield.TextInputLayout) bindings[16]
            , (com.google.android.material.textfield.TextInputLayout) bindings[19]
            , (com.google.android.material.textfield.TextInputLayout) bindings[26]
            , (com.google.android.material.textfield.TextInputLayout) bindings[20]
            , (com.google.android.material.textfield.TextInputEditText) bindings[1]
            , (com.google.android.material.textfield.TextInputEditText) bindings[2]
            , (android.widget.RelativeLayout) bindings[23]
            , (android.widget.ImageView) bindings[24]
            , (android.widget.TextView) bindings[30]
            , (androidx.appcompat.widget.AppCompatSeekBar) bindings[12]
            , (com.google.android.material.textfield.TextInputEditText) bindings[13]
            , (com.easyplex.ui.downloadmanager.ui.customview.FixHintTextInputEditText) bindings[9]
            , (android.widget.ImageButton) bindings[10]
            , (android.widget.TextView) bindings[25]
            , (android.widget.CheckBox) bindings[7]
            , (android.widget.CheckBox) bindings[6]
            , (com.google.android.material.textfield.TextInputEditText) bindings[3]
            , (android.widget.TextView) bindings[5]
            , (android.widget.CheckBox) bindings[8]
            , (android.widget.ImageButton) bindings[18]
            , (android.widget.Spinner) bindings[32]
            , (android.widget.TextView) bindings[31]
            );
        this.checksum.setTag(null);
        this.checksumClipboardButton.setTag(null);
        this.description.setTag(null);
        this.freeSpace.setTag(null);
        this.link.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.name.setTag(null);
        this.piecesNumberSelect.setTag(null);
        this.piecesNumberValue.setTag(null);
        this.referer.setTag(null);
        this.refererClipboardButton.setTag(null);
        this.replaceFile.setTag(null);
        this.retry.setTag(null);
        this.savePath.setTag(null);
        this.size.setTag(null);
        this.unmeteredConnectionsOnly.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10000L;
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
        if (BR.viewModel == variableId) {
            setViewModel((com.easyplex.ui.downloadmanager.ui.adddownload.AddDownloadViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.easyplex.ui.downloadmanager.ui.adddownload.AddDownloadViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelParams((com.easyplex.ui.downloadmanager.ui.adddownload.AddDownloadParams) object, fieldId);
            case 1 :
                return onChangeViewModelShowClipboardButton((androidx.databinding.ObservableBoolean) object, fieldId);
            case 2 :
                return onChangeViewModelMaxNumPieces((androidx.databinding.ObservableInt) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelParams(com.easyplex.ui.downloadmanager.ui.adddownload.AddDownloadParams ViewModelParams, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.url) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        else if (fieldId == BR.fileName) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        else if (fieldId == BR.dirName) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        else if (fieldId == BR.storageFreeSpace) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        else if (fieldId == BR.totalBytes) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        else if (fieldId == BR.retry) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        else if (fieldId == BR.replaceFile) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        else if (fieldId == BR.unmeteredConnectionsOnly) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        else if (fieldId == BR.referer) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        else if (fieldId == BR.description) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000L;
            }
            return true;
        }
        else if (fieldId == BR.numPieces) {
            synchronized(this) {
                    mDirtyFlags |= 0x4000L;
            }
            return true;
        }
        else if (fieldId == BR.checksum) {
            synchronized(this) {
                    mDirtyFlags |= 0x8000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowClipboardButton(androidx.databinding.ObservableBoolean ViewModelShowClipboardButton, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMaxNumPieces(androidx.databinding.ObservableInt ViewModelMaxNumPieces, int fieldId) {
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
        int viewModelMaxNumPiecesGet = 0;
        com.easyplex.ui.downloadmanager.ui.adddownload.AddDownloadParams viewModelParams = null;
        androidx.databinding.ObservableBoolean viewModelShowClipboardButton = null;
        java.lang.String viewModelParamsUrl = null;
        java.lang.String viewModelParamsChecksum = null;
        java.lang.String viewModelParamsDirName = null;
        boolean viewModelParamsRetry = false;
        boolean viewModelParamsUnmeteredConnectionsOnly = false;
        java.lang.String viewModelParamsFileName = null;
        long viewModelParamsTotalBytes = 0;
        java.lang.String stringValueOfViewModelParamsNumPieces = null;
        int viewModelShowClipboardButtonViewVISIBLEViewGONE = 0;
        boolean viewModelShowClipboardButtonGet = false;
        int viewModelMaxNumPiecesInt1 = 0;
        long viewModelParamsStorageFreeSpace = 0;
        java.lang.String viewModelParamsDescription = null;
        androidx.databinding.ObservableInt viewModelMaxNumPieces = null;
        boolean viewModelParamsReplaceFile = false;
        java.lang.String viewModelParamsReferer = null;
        int viewModelParamsNumPieces = 0;
        com.easyplex.ui.downloadmanager.ui.adddownload.AddDownloadViewModel viewModel = mViewModel;
        int viewModelParamsNumPiecesInt1 = 0;

        if ((dirtyFlags & 0x1ffffL) != 0) {


            if ((dirtyFlags & 0x1fff9L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.params
                        viewModelParams = viewModel.params;
                    }
                    updateRegistration(0, viewModelParams);

                if ((dirtyFlags & 0x10019L) != 0) {

                        if (viewModelParams != null) {
                            // read viewModel.params.url
                            viewModelParamsUrl = viewModelParams.getUrl();
                        }
                }
                if ((dirtyFlags & 0x18009L) != 0) {

                        if (viewModelParams != null) {
                            // read viewModel.params.checksum
                            viewModelParamsChecksum = viewModelParams.getChecksum();
                        }
                }
                if ((dirtyFlags & 0x10049L) != 0) {

                        if (viewModelParams != null) {
                            // read viewModel.params.dirName
                            viewModelParamsDirName = viewModelParams.getDirName();
                        }
                }
                if ((dirtyFlags & 0x10209L) != 0) {

                        if (viewModelParams != null) {
                            // read viewModel.params.retry
                            viewModelParamsRetry = viewModelParams.isRetry();
                        }
                }
                if ((dirtyFlags & 0x10809L) != 0) {

                        if (viewModelParams != null) {
                            // read viewModel.params.unmeteredConnectionsOnly
                            viewModelParamsUnmeteredConnectionsOnly = viewModelParams.isUnmeteredConnectionsOnly();
                        }
                }
                if ((dirtyFlags & 0x10029L) != 0) {

                        if (viewModelParams != null) {
                            // read viewModel.params.fileName
                            viewModelParamsFileName = viewModelParams.getFileName();
                        }
                }
                if ((dirtyFlags & 0x10109L) != 0) {

                        if (viewModelParams != null) {
                            // read viewModel.params.totalBytes
                            viewModelParamsTotalBytes = viewModelParams.getTotalBytes();
                        }
                }
                if ((dirtyFlags & 0x10089L) != 0) {

                        if (viewModelParams != null) {
                            // read viewModel.params.storageFreeSpace
                            viewModelParamsStorageFreeSpace = viewModelParams.getStorageFreeSpace();
                        }
                }
                if ((dirtyFlags & 0x12009L) != 0) {

                        if (viewModelParams != null) {
                            // read viewModel.params.description
                            viewModelParamsDescription = viewModelParams.getDescription();
                        }
                }
                if ((dirtyFlags & 0x10409L) != 0) {

                        if (viewModelParams != null) {
                            // read viewModel.params.replaceFile
                            viewModelParamsReplaceFile = viewModelParams.isReplaceFile();
                        }
                }
                if ((dirtyFlags & 0x11009L) != 0) {

                        if (viewModelParams != null) {
                            // read viewModel.params.referer
                            viewModelParamsReferer = viewModelParams.getReferer();
                        }
                }
                if ((dirtyFlags & 0x14009L) != 0) {

                        if (viewModelParams != null) {
                            // read viewModel.params.numPieces
                            viewModelParamsNumPieces = viewModelParams.getNumPieces();
                        }


                        // read String.valueOf(viewModel.params.numPieces)
                        stringValueOfViewModelParamsNumPieces = java.lang.String.valueOf(viewModelParamsNumPieces);
                        // read (viewModel.params.numPieces) - (1)
                        viewModelParamsNumPiecesInt1 = (viewModelParamsNumPieces) - (1);
                }
            }
            if ((dirtyFlags & 0x1000aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showClipboardButton
                        viewModelShowClipboardButton = viewModel.showClipboardButton;
                    }
                    updateRegistration(1, viewModelShowClipboardButton);


                    if (viewModelShowClipboardButton != null) {
                        // read viewModel.showClipboardButton.get()
                        viewModelShowClipboardButtonGet = viewModelShowClipboardButton.get();
                    }
                if((dirtyFlags & 0x1000aL) != 0) {
                    if(viewModelShowClipboardButtonGet) {
                            dirtyFlags |= 0x40000L;
                    }
                    else {
                            dirtyFlags |= 0x20000L;
                    }
                }


                    // read viewModel.showClipboardButton.get() ? View.VISIBLE : View.GONE
                    viewModelShowClipboardButtonViewVISIBLEViewGONE = ((viewModelShowClipboardButtonGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1000cL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.maxNumPieces
                        viewModelMaxNumPieces = viewModel.maxNumPieces;
                    }
                    updateRegistration(2, viewModelMaxNumPieces);


                    if (viewModelMaxNumPieces != null) {
                        // read viewModel.maxNumPieces.get()
                        viewModelMaxNumPiecesGet = viewModelMaxNumPieces.get();
                    }


                    // read (viewModel.maxNumPieces.get()) - (1)
                    viewModelMaxNumPiecesInt1 = (viewModelMaxNumPiecesGet) - (1);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x18009L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.checksum, viewModelParamsChecksum);
        }
        if ((dirtyFlags & 0x10000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.checksum, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, checksumandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.description, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, descriptionandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.link, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, linkandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.name, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, nameandroidTextAttrChanged);
            this.referer.setHint(referer.getResources().getString(R.string.referer_description, referer.getResources().getString(R.string.referer)));
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.referer, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, refererandroidTextAttrChanged);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.replaceFile, (android.widget.CompoundButton.OnCheckedChangeListener)null, replaceFileandroidCheckedAttrChanged);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.retry, (android.widget.CompoundButton.OnCheckedChangeListener)null, retryandroidCheckedAttrChanged);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.unmeteredConnectionsOnly, (android.widget.CompoundButton.OnCheckedChangeListener)null, unmeteredConnectionsOnlyandroidCheckedAttrChanged);
        }
        if ((dirtyFlags & 0x1000aL) != 0) {
            // api target 1

            this.checksumClipboardButton.setVisibility(viewModelShowClipboardButtonViewVISIBLEViewGONE);
            this.refererClipboardButton.setVisibility(viewModelShowClipboardButtonViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x12009L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.description, viewModelParamsDescription);
        }
        if ((dirtyFlags & 0x10089L) != 0) {
            // api target 1

            com.easyplex.ui.downloadmanager.core.utils.BindingAdapterUtils.formatFileSize(this.freeSpace, viewModelParamsStorageFreeSpace, freeSpace.getResources().getString(R.string.storage_free_space));
        }
        if ((dirtyFlags & 0x10019L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.link, viewModelParamsUrl);
        }
        if ((dirtyFlags & 0x10029L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.name, viewModelParamsFileName);
        }
        if ((dirtyFlags & 0x14009L) != 0) {
            // api target 1

            androidx.databinding.adapters.SeekBarBindingAdapter.setProgress(this.piecesNumberSelect, viewModelParamsNumPiecesInt1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.piecesNumberValue, stringValueOfViewModelParamsNumPieces);
        }
        if ((dirtyFlags & 0x1000cL) != 0) {
            // api target 1

            this.piecesNumberSelect.setMax(viewModelMaxNumPiecesInt1);
        }
        if ((dirtyFlags & 0x11009L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.referer, viewModelParamsReferer);
        }
        if ((dirtyFlags & 0x10409L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.replaceFile, viewModelParamsReplaceFile);
        }
        if ((dirtyFlags & 0x10209L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.retry, viewModelParamsRetry);
        }
        if ((dirtyFlags & 0x10049L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.savePath, viewModelParamsDirName);
        }
        if ((dirtyFlags & 0x10109L) != 0) {
            // api target 1

            com.easyplex.ui.downloadmanager.core.utils.BindingAdapterUtils.formatFileSize(this.size, viewModelParamsTotalBytes, size.getResources().getString(R.string.download_size));
        }
        if ((dirtyFlags & 0x10809L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.unmeteredConnectionsOnly, viewModelParamsUnmeteredConnectionsOnly);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.params
        flag 1 (0x2L): viewModel.showClipboardButton
        flag 2 (0x3L): viewModel.maxNumPieces
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): viewModel.params.url
        flag 5 (0x6L): viewModel.params.fileName
        flag 6 (0x7L): viewModel.params.dirName
        flag 7 (0x8L): viewModel.params.storageFreeSpace
        flag 8 (0x9L): viewModel.params.totalBytes
        flag 9 (0xaL): viewModel.params.retry
        flag 10 (0xbL): viewModel.params.replaceFile
        flag 11 (0xcL): viewModel.params.unmeteredConnectionsOnly
        flag 12 (0xdL): viewModel.params.referer
        flag 13 (0xeL): viewModel.params.description
        flag 14 (0xfL): viewModel.params.numPieces
        flag 15 (0x10L): viewModel.params.checksum
        flag 16 (0x11L): null
        flag 17 (0x12L): viewModel.showClipboardButton.get() ? View.VISIBLE : View.GONE
        flag 18 (0x13L): viewModel.showClipboardButton.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}