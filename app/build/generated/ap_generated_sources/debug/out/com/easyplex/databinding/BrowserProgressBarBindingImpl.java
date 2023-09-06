package com.easyplex.databinding;
import com.easyplex.R;
import com.easyplex.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class BrowserProgressBarBindingImpl extends BrowserProgressBarBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public BrowserProgressBarBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 1, sIncludes, sViewsWithIds));
    }
    private BrowserProgressBarBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ProgressBar) bindings[0]
            );
        this.progress.setTag(null);
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
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelObserveUrlFetchState((androidx.lifecycle.LiveData<com.easyplex.ui.downloadmanager.ui.browser.BrowserViewModel.UrlFetchState>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelObserveUrlFetchState(androidx.lifecycle.LiveData<com.easyplex.ui.downloadmanager.ui.browser.BrowserViewModel.UrlFetchState> ViewModelObserveUrlFetchState, int fieldId) {
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
        int viewModelObserveUrlFetchStateUrlFetchStateFETCHINGViewVISIBLEViewGONE = 0;
        androidx.lifecycle.LiveData<com.easyplex.ui.downloadmanager.ui.browser.BrowserViewModel.UrlFetchState> viewModelObserveUrlFetchState = null;
        boolean viewModelObserveUrlFetchStateUrlFetchStateFETCHING = false;
        com.easyplex.ui.downloadmanager.ui.browser.BrowserViewModel.UrlFetchState viewModelObserveUrlFetchStateGetValue = null;
        int viewModelObserveUrlFetchStateProgress = 0;
        com.easyplex.ui.downloadmanager.ui.browser.BrowserViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.observeUrlFetchState
                    viewModelObserveUrlFetchState = viewModel.observeUrlFetchState();
                }
                updateLiveDataRegistration(0, viewModelObserveUrlFetchState);


                if (viewModelObserveUrlFetchState != null) {
                    // read viewModel.observeUrlFetchState.getValue()
                    viewModelObserveUrlFetchStateGetValue = viewModelObserveUrlFetchState.getValue();
                }


                // read viewModel.observeUrlFetchState.getValue() == UrlFetchState.FETCHING
                viewModelObserveUrlFetchStateUrlFetchStateFETCHING = (viewModelObserveUrlFetchStateGetValue) == (com.easyplex.ui.downloadmanager.ui.browser.BrowserViewModel.UrlFetchState.FETCHING);
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelObserveUrlFetchStateUrlFetchStateFETCHING) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
                if (viewModelObserveUrlFetchStateGetValue != null) {
                    // read viewModel.observeUrlFetchState.getValue().progress
                    viewModelObserveUrlFetchStateProgress = viewModelObserveUrlFetchStateGetValue.progress();
                }


                // read viewModel.observeUrlFetchState.getValue() == UrlFetchState.FETCHING ? View.VISIBLE : View.GONE
                viewModelObserveUrlFetchStateUrlFetchStateFETCHINGViewVISIBLEViewGONE = ((viewModelObserveUrlFetchStateUrlFetchStateFETCHING) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.progress.setProgress(viewModelObserveUrlFetchStateProgress);
            this.progress.setVisibility(viewModelObserveUrlFetchStateUrlFetchStateFETCHINGViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.observeUrlFetchState
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
        flag 3 (0x4L): viewModel.observeUrlFetchState.getValue() == UrlFetchState.FETCHING ? View.VISIBLE : View.GONE
        flag 4 (0x5L): viewModel.observeUrlFetchState.getValue() == UrlFetchState.FETCHING ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}