package com.easyplex.databinding;
import com.easyplex.R;
import com.easyplex.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ActivitySettingBindingImpl extends ActivitySettingBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(46);
        sIncludes.setIncludes(1, 
            new String[] {"main_toolbar_others"},
            new int[] {2},
            new int[] {com.easyplex.R.layout.main_toolbar_others});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scrollView, 3);
        sViewsWithIds.put(R.id.userAvatar, 4);
        sViewsWithIds.put(R.id.auth_name, 5);
        sViewsWithIds.put(R.id.auth_email, 6);
        sViewsWithIds.put(R.id.logout, 7);
        sViewsWithIds.put(R.id.auth_free, 8);
        sViewsWithIds.put(R.id.btn_premuim, 9);
        sViewsWithIds.put(R.id.membership_expire_in, 10);
        sViewsWithIds.put(R.id.btn_login, 11);
        sViewsWithIds.put(R.id.btn_edit_profile, 12);
        sViewsWithIds.put(R.id.subcribe_button, 13);
        sViewsWithIds.put(R.id.cancel_subcription_button, 14);
        sViewsWithIds.put(R.id.myList, 15);
        sViewsWithIds.put(R.id.switch_push_extentions, 16);
        sViewsWithIds.put(R.id.switch_codec_software, 17);
        sViewsWithIds.put(R.id.switch_push_notification, 18);
        sViewsWithIds.put(R.id.wifi_switch, 19);
        sViewsWithIds.put(R.id.autoplay_switch, 20);
        sViewsWithIds.put(R.id.player_aspect_ratio, 21);
        sViewsWithIds.put(R.id.current_player_aspect_ratio, 22);
        sViewsWithIds.put(R.id.current_subs_default_linear, 23);
        sViewsWithIds.put(R.id.current_subs_default_lang, 24);
        sViewsWithIds.put(R.id.substitles_background, 25);
        sViewsWithIds.put(R.id.current_background_color, 26);
        sViewsWithIds.put(R.id.substitle_size, 27);
        sViewsWithIds.put(R.id.current_size, 28);
        sViewsWithIds.put(R.id.ClearMyList, 29);
        sViewsWithIds.put(R.id.clearMyWatchHistory, 30);
        sViewsWithIds.put(R.id.linearLayoutCleaCache, 31);
        sViewsWithIds.put(R.id.cacehSize, 32);
        sViewsWithIds.put(R.id.privacy_policy, 33);
        sViewsWithIds.put(R.id.aboutus, 34);
        sViewsWithIds.put(R.id.view_plans, 35);
        sViewsWithIds.put(R.id.movie_image, 36);
        sViewsWithIds.put(R.id.recycler_view_plans, 37);
        sViewsWithIds.put(R.id.close_plans, 38);
        sViewsWithIds.put(R.id.fragment_container, 39);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_top, 40);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_left, 41);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_right, 42);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_bottom, 43);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_seek_left, 44);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_seek_right, 45);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivitySettingBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 46, sIncludes, sViewsWithIds));
    }
    private ActivitySettingBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.LinearLayout) bindings[29]
            , (android.widget.LinearLayout) bindings[34]
            , (com.google.android.material.appbar.AppBarLayout) bindings[1]
            , (android.widget.TextView) bindings[6]
            , (android.widget.Button) bindings[8]
            , (android.widget.TextView) bindings[5]
            , (androidx.appcompat.widget.SwitchCompat) bindings[20]
            , (android.widget.Button) bindings[12]
            , (android.widget.Button) bindings[11]
            , (android.widget.Button) bindings[9]
            , (android.widget.TextView) bindings[32]
            , (android.widget.Button) bindings[14]
            , (android.widget.LinearLayout) bindings[30]
            , (android.widget.ImageView) bindings[38]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.TextView) bindings[26]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[28]
            , (android.widget.TextView) bindings[24]
            , (android.widget.LinearLayout) bindings[23]
            , (android.widget.FrameLayout) bindings[39]
            , (android.widget.LinearLayout) bindings[31]
            , (android.widget.ImageButton) bindings[7]
            , (android.widget.TextView) bindings[10]
            , (android.widget.ImageView) bindings[36]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.LinearLayout) bindings[21]
            , (android.widget.LinearLayout) bindings[33]
            , (androidx.recyclerview.widget.RecyclerView) bindings[37]
            , (androidx.core.widget.NestedScrollView) bindings[3]
            , (android.widget.Button) bindings[13]
            , (android.widget.LinearLayout) bindings[27]
            , (android.widget.LinearLayout) bindings[25]
            , (androidx.appcompat.widget.SwitchCompat) bindings[17]
            , (androidx.appcompat.widget.SwitchCompat) bindings[16]
            , (androidx.appcompat.widget.SwitchCompat) bindings[18]
            , (com.easyplex.databinding.MainToolbarOthersBinding) bindings[2]
            , (androidx.constraintlayout.widget.Guideline) bindings[43]
            , (androidx.constraintlayout.widget.Guideline) bindings[41]
            , (androidx.constraintlayout.widget.Guideline) bindings[42]
            , (androidx.constraintlayout.widget.Guideline) bindings[44]
            , (androidx.constraintlayout.widget.Guideline) bindings[45]
            , (androidx.constraintlayout.widget.Guideline) bindings[40]
            , (com.easyplex.util.GridItemImageView) bindings[4]
            , (android.widget.FrameLayout) bindings[35]
            , (androidx.appcompat.widget.SwitchCompat) bindings[19]
            );
        this.appBarLayout.setTag(null);
        this.coordinator.setTag(null);
        setContainedBinding(this.toolbar);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        toolbar.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (toolbar.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        toolbar.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeToolbar((com.easyplex.databinding.MainToolbarOthersBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeToolbar(com.easyplex.databinding.MainToolbarOthersBinding Toolbar, int fieldId) {
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
        // batch finished
        executeBindingsOn(toolbar);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): toolbar
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}