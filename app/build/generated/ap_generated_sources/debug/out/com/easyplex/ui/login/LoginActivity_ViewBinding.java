// Generated code from Butter Knife. Do not modify!
package com.easyplex.ui.login;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.easyplex.R;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.common.SignInButton;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LoginActivity_ViewBinding implements Unbinder {
  private LoginActivity target;

  private View view7f0a03eb;

  private View view7f0a03c8;

  @UiThread
  public LoginActivity_ViewBinding(LoginActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LoginActivity_ViewBinding(final LoginActivity target, View source) {
    this.target = target;

    View view;
    target.til_password_code = Utils.findRequiredViewAsType(source, R.id.til_password_code, "field 'til_password_code'", TextInputLayout.class);
    target.tilEmail = Utils.findRequiredViewAsType(source, R.id.til_email, "field 'tilEmail'", TextInputLayout.class);
    target.tilPassword = Utils.findRequiredViewAsType(source, R.id.til_password, "field 'tilPassword'", TextInputLayout.class);
    target.logoimagetop = Utils.findRequiredViewAsType(source, R.id.logo_image_top, "field 'logoimagetop'", ImageView.class);
    target.splashImage = Utils.findRequiredViewAsType(source, R.id.splash_image, "field 'splashImage'", ImageView.class);
    target.code_access_enable = Utils.findRequiredViewAsType(source, R.id.code_access_enable, "field 'code_access_enable'", LinearLayout.class);
    target.btnEnterPasswordAccess = Utils.findRequiredViewAsType(source, R.id.btn_enter_password_access, "field 'btnEnterPasswordAccess'", Button.class);
    target.skipe = Utils.findRequiredViewAsType(source, R.id.btn_skip, "field 'skipe'", LinearLayout.class);
    target.btnLogin = Utils.findRequiredViewAsType(source, R.id.btn_login, "field 'btnLogin'", LinearLayout.class);
    target.formContainer = Utils.findRequiredViewAsType(source, R.id.form_container, "field 'formContainer'", LinearLayout.class);
    target.textViewCheckingAuth = Utils.findRequiredViewAsType(source, R.id.textViewCheckingAuth, "field 'textViewCheckingAuth'", TextView.class);
    target.loader = Utils.findRequiredViewAsType(source, R.id.loader, "field 'loader'", ProgressBar.class);
    target.mLoginButton = Utils.findRequiredViewAsType(source, R.id.login_button, "field 'mLoginButton'", LoginButton.class);
    target.mLoginButtonIcon = Utils.findRequiredViewAsType(source, R.id.btn_facebook, "field 'mLoginButtonIcon'", ImageButton.class);
    target.mButtonGoogle = Utils.findRequiredViewAsType(source, R.id.btn_google, "field 'mButtonGoogle'", ImageButton.class);
    target.mSignGoogleButton = Utils.findRequiredViewAsType(source, R.id.sign_in_button, "field 'mSignGoogleButton'", SignInButton.class);
    target.get_code = Utils.findRequiredViewAsType(source, R.id.text_get_code, "field 'get_code'", TextView.class);
    view = Utils.findRequiredView(source, R.id.go_to_register, "method 'goToRegister'");
    view7f0a03eb = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.goToRegister();
      }
    });
    view = Utils.findRequiredView(source, R.id.forget_password, "method 'goToForgetPassword'");
    view7f0a03c8 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.goToForgetPassword();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    LoginActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.til_password_code = null;
    target.tilEmail = null;
    target.tilPassword = null;
    target.logoimagetop = null;
    target.splashImage = null;
    target.code_access_enable = null;
    target.btnEnterPasswordAccess = null;
    target.skipe = null;
    target.btnLogin = null;
    target.formContainer = null;
    target.textViewCheckingAuth = null;
    target.loader = null;
    target.mLoginButton = null;
    target.mLoginButtonIcon = null;
    target.mButtonGoogle = null;
    target.mSignGoogleButton = null;
    target.get_code = null;

    view7f0a03eb.setOnClickListener(null);
    view7f0a03eb = null;
    view7f0a03c8.setOnClickListener(null);
    view7f0a03c8 = null;
  }
}
