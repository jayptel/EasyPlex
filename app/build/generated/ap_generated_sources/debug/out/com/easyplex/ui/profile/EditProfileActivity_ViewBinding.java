// Generated code from Butter Knife. Do not modify!
package com.easyplex.ui.profile;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.easyplex.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.mikhaellopez.circularimageview.CircularImageView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class EditProfileActivity_ViewBinding implements Unbinder {
  private EditProfileActivity target;

  private View view7f0a0189;

  private View view7f0a0187;

  @UiThread
  public EditProfileActivity_ViewBinding(EditProfileActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public EditProfileActivity_ViewBinding(final EditProfileActivity target, View source) {
    this.target = target;

    View view;
    target.userImaveAvatar = Utils.findRequiredViewAsType(source, R.id.user_avatar, "field 'userImaveAvatar'", CircularImageView.class);
    target.tilName = Utils.findRequiredViewAsType(source, R.id.til_name, "field 'tilName'", TextInputLayout.class);
    target.tilEmail = Utils.findRequiredViewAsType(source, R.id.til_email, "field 'tilEmail'", TextInputLayout.class);
    target.tilPassword = Utils.findRequiredViewAsType(source, R.id.til_password, "field 'tilPassword'", TextInputLayout.class);
    target.editTextName = Utils.findRequiredViewAsType(source, R.id.editText_name, "field 'editTextName'", TextInputEditText.class);
    target.editTextEmail = Utils.findRequiredViewAsType(source, R.id.editText_email, "field 'editTextEmail'", TextInputEditText.class);
    target.closeProfileActivity = Utils.findRequiredViewAsType(source, R.id.close_profile_fragment, "field 'closeProfileActivity'", ImageView.class);
    target.container = Utils.findRequiredViewAsType(source, R.id.container, "field 'container'", ConstraintLayout.class);
    target.formContainer = Utils.findRequiredViewAsType(source, R.id.form_container, "field 'formContainer'", LinearLayout.class);
    target.loader = Utils.findRequiredViewAsType(source, R.id.loader, "field 'loader'", ProgressBar.class);
    target.splashImage = Utils.findRequiredViewAsType(source, R.id.splash_image, "field 'splashImage'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.btn_upload_avatar, "method 'pickProfileImage'");
    view7f0a0189 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.pickProfileImage();
      }
    });
    view = Utils.findRequiredView(source, R.id.btn_update, "method 'register'");
    view7f0a0187 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.register();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    EditProfileActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.userImaveAvatar = null;
    target.tilName = null;
    target.tilEmail = null;
    target.tilPassword = null;
    target.editTextName = null;
    target.editTextEmail = null;
    target.closeProfileActivity = null;
    target.container = null;
    target.formContainer = null;
    target.loader = null;
    target.splashImage = null;

    view7f0a0189.setOnClickListener(null);
    view7f0a0189 = null;
    view7f0a0187.setOnClickListener(null);
    view7f0a0187 = null;
  }
}
