package com.easyplex.databinding;
import com.easyplex.R;
import com.easyplex.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class BrowserAddressBarBindingImpl extends BrowserAddressBarBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.ImageView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener addressInputandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.url.get()
            //         is viewModel.url.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(addressInput);
            // localize variables for thread safety
            // viewModel.url.get()
            java.lang.String viewModelUrlGet = null;
            // viewModel.url
            androidx.databinding.ObservableField<java.lang.String> viewModelUrl = null;
            // viewModel.url != null
            boolean viewModelUrlJavaLangObjectNull = false;
            // viewModel
            com.easyplex.ui.downloadmanager.ui.browser.BrowserViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelUrl = viewModel.url;

                viewModelUrlJavaLangObjectNull = (viewModelUrl) != (null);
                if (viewModelUrlJavaLangObjectNull) {




                    viewModelUrl.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public BrowserAddressBarBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View[] root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private BrowserAddressBarBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View[] root, Object[] bindings) {
        super(bindingComponent, root[0], 2
            , (com.easyplex.ui.downloadmanager.ui.customview.FixHintTextInputEditText) bindings[2]
            , (com.google.android.material.textfield.TextInputLayout) bindings[1]
            );
        this.addressInput.setTag(null);
        this.addressLayout.setTag(null);
        this.mboundView0 = (android.widget.ImageView) bindings[0];
        this.mboundView0.setTag(null);
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
        if (BR.viewModel == variableId) {
            setViewModel((com.easyplex.ui.downloadmanager.ui.browser.BrowserViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.easyplex.ui.downloadmanager.ui.browser.BrowserViewModel ViewModel) {
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
                return onChangeViewModelIsSecureConnection((androidx.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeViewModelUrl((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelIsSecureConnection(androidx.databinding.ObservableBoolean ViewModelIsSecureConnection, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelUrl(androidx.databinding.ObservableField<java.lang.String> ViewModelUrl, int fieldId) {
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
        int viewModelIsSecureConnectionViewVISIBLEViewGONE = 0;
        androidx.databinding.ObservableBoolean viewModelIsSecureConnection = null;
        java.lang.String viewModelUrlGet = null;
        boolean viewModelIsSecureConnectionGet = false;
        androidx.databinding.ObservableField<java.lang.String> viewModelUrl = null;
        com.easyplex.ui.downloadmanager.ui.browser.BrowserViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isSecureConnection
                        viewModelIsSecureConnection = viewModel.isSecureConnection;
                    }
                    updateRegistration(0, viewModelIsSecureConnection);


                    if (viewModelIsSecureConnection != null) {
                        // read viewModel.isSecureConnection.get()
                        viewModelIsSecureConnectionGet = viewModelIsSecureConnection.get();
                    }
                if((dirtyFlags & 0xdL) != 0) {
                    if(viewModelIsSecureConnectionGet) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }


                    // read viewModel.isSecureConnection.get() ? View.VISIBLE : View.GONE
                    viewModelIsSecureConnectionViewVISIBLEViewGONE = ((viewModelIsSecureConnectionGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.url
                        viewModelUrl = viewModel.url;
                    }
                    updateRegistration(1, viewModelUrl);


                    if (viewModelUrl != null) {
                        // read viewModel.url.get()
                        viewModelUrlGet = viewModelUrl.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.addressInput, viewModelUrlGet);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.addressInput, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, addressInputandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.mboundView0.setVisibility(viewModelIsSecureConnectionViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.isSecureConnection
        flag 1 (0x2L): viewModel.url
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): viewModel.isSecureConnection.get() ? View.VISIBLE : View.GONE
        flag 5 (0x6L): viewModel.isSecureConnection.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}