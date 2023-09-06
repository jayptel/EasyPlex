// Generated code from Butter Knife. Do not modify!
package com.easyplex.ui.login;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.easyplex.R;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PasswordForget_ViewBinding implements Unbinder {
  private PasswordForget target;

  private View view7f0a0208;

  private View view7f0a0181;

  private View view7f0a0188;

  @UiThread
  public PasswordForget_ViewBinding(PasswordForget target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public PasswordForget_ViewBinding(final PasswordForget target, View source) {
    this.target = target;

    View view;
    target.tilEmail = Utils.findRequiredViewAsType(source, R.id.til_email, "field 'tilEmail'", TextInputLayout.class);
    target.logoimagetop = Utils.findRequiredViewAsType(source, R.id.logo_image_top, "field 'logoimagetop'", ImageView.class);
    target.splashImage = Utils.findRequiredViewAsType(source, R.id.splash_image, "field 'splashImage'", ImageView.class);
    target.formContainer = Utils.findRequiredViewAsType(source, R.id.form_container, "field 'formContainer'", LinearLayout.class);
    target.loader = Utils.findRequiredViewAsType(source, R.id.loader, "field 'loader'", ProgressBar.class);
    target.emailForget = Utils.findRequiredViewAsType(source, R.id.emailForget, "field 'emailForget'", LinearLayout.class);
    target.tokenEnter = Utils.findRequiredViewAsType(source, R.id.tokenEnter, "field 'tokenEnter'", LinearLayout.class);
    target.tokenUser = Utils.findRequiredViewAsType(source, R.id.token_user, "field 'tokenUser'", TextInputLayout.class);
    target.tokenUserEmail = Utils.findRequiredViewAsType(source, R.id.token_user_email, "field 'tokenUserEmail'", TextInputLayout.class);
    target.tokenUserPassword = Utils.findRequiredViewAsType(source, R.id.token_user_password, "field 'tokenUserPassword'", TextInputLayout.class);
    target.tokenUserPasswordConfirmation = Utils.findRequiredViewAsType(source, R.id.token_user_password_confirmation, "field 'tokenUserPasswordConfirmation'", TextInputLayout.class);
    view = Utils.findRequiredView(source, R.id.close, "field 'close' and method 'uclose'");
    target.close = Utils.castView(view, R.id.close, "field 'close'", ImageView.class);
    view7f0a0208 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.uclose();
      }
    });
    view = Utils.findRequiredView(source, R.id.btn_login, "method 'sendEmail'");
    view7f0a0181 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.sendEmail();
      }
    });
    view = Utils.findRequiredView(source, R.id.btn_update_password, "method 'updatePassword'");
    view7f0a0188 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.updatePassword();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    PasswordForget target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tilEmail = null;
    target.logoimagetop = null;
    target.splashImage = null;
    target.formContainer = null;
    target.loader = null;
    target.emailForget = null;
    target.tokenEnter = null;
    target.tokenUser = null;
    target.tokenUserEmail = null;
    target.tokenUserPassword = null;
    target.tokenUserPasswordConfirmation = null;
    target.close = null;

    view7f0a0208.setOnClickListener(null);
    view7f0a0208 = null;
    view7f0a0181.setOnClickListener(null);
    view7f0a0181 = null;
    view7f0a0188.setOnClickListener(null);
    view7f0a0188 = null;
  }
}
