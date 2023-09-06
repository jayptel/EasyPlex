package com.easyplex.databinding;
import com.easyplex.R;
import com.easyplex.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ActivityLoginBindingImpl extends ActivityLoginBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.splash_image, 1);
        sViewsWithIds.put(R.id.textViewCheckingAuth, 2);
        sViewsWithIds.put(R.id.loader, 3);
        sViewsWithIds.put(R.id.code_access_enable, 4);
        sViewsWithIds.put(R.id.til_password_code, 5);
        sViewsWithIds.put(R.id.btn_enter_password_access, 6);
        sViewsWithIds.put(R.id.text_get_code, 7);
        sViewsWithIds.put(R.id.form_container, 8);
        sViewsWithIds.put(R.id.logo_image_top, 9);
        sViewsWithIds.put(R.id.til_email, 10);
        sViewsWithIds.put(R.id.til_password, 11);
        sViewsWithIds.put(R.id.btn_facebook, 12);
        sViewsWithIds.put(R.id.btn_google, 13);
        sViewsWithIds.put(R.id.btn_login, 14);
        sViewsWithIds.put(R.id.login_button, 15);
        sViewsWithIds.put(R.id.sign_in_button, 16);
        sViewsWithIds.put(R.id.btn_skip, 17);
        sViewsWithIds.put(R.id.go_to_register, 18);
        sViewsWithIds.put(R.id.forget_password, 19);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_top, 20);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_left, 21);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_right, 22);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_bottom, 23);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_seek_left, 24);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_seek_right, 25);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityLoginBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 26, sIncludes, sViewsWithIds));
    }
    private ActivityLoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[6]
            , (android.widget.ImageButton) bindings[12]
            , (android.widget.ImageButton) bindings[13]
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.LinearLayout) bindings[17]
            , (android.widget.LinearLayout) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.TextView) bindings[19]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.TextView) bindings[18]
            , (android.widget.ProgressBar) bindings[3]
            , (com.facebook.login.widget.LoginButton) bindings[15]
            , (android.widget.ImageView) bindings[9]
            , (com.google.android.gms.common.SignInButton) bindings[16]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.Button) bindings[7]
            , (android.widget.TextView) bindings[2]
            , (com.google.android.material.textfield.TextInputLayout) bindings[10]
            , (com.google.android.material.textfield.TextInputLayout) bindings[11]
            , (com.google.android.material.textfield.TextInputLayout) bindings[5]
            , (androidx.constraintlayout.widget.Guideline) bindings[23]
            , (androidx.constraintlayout.widget.Guideline) bindings[21]
            , (androidx.constraintlayout.widget.Guideline) bindings[22]
            , (androidx.constraintlayout.widget.Guideline) bindings[24]
            , (androidx.constraintlayout.widget.Guideline) bindings[25]
            , (androidx.constraintlayout.widget.Guideline) bindings[20]
            );
        this.constraintLayout.setTag(null);
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