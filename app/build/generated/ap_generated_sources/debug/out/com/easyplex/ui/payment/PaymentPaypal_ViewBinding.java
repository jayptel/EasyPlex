// Generated code from Butter Knife. Do not modify!
package com.easyplex.ui.payment;

import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.easyplex.R;
import com.paypal.checkout.paymentbutton.PaymentButton;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PaymentPaypal_ViewBinding implements Unbinder {
  private PaymentPaypal target;

  @UiThread
  public PaymentPaypal_ViewBinding(PaymentPaypal target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public PaymentPaypal_ViewBinding(PaymentPaypal target, View source) {
    this.target = target;

    target.payPalButton = Utils.findRequiredViewAsType(source, R.id.paypal_method, "field 'payPalButton'", PaymentButton.class);
    target.loader = Utils.findRequiredViewAsType(source, R.id.loader, "field 'loader'", ProgressBar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    PaymentPaypal target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.payPalButton = null;
    target.loader = null;
  }
}
