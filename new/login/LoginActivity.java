package hu.ekreta.ellenorzo.login;

import android.os.Bundle;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputEditText;
import h.l.g;
import h.m.d.d;
import h.p.h;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.databinding.ActivityLoginBinding;
import hu.ekreta.ellenorzo.util.view.ExtensionsKt;
import i.c.h.a;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lhu/ekreta/ellenorzo/login/LoginActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/login/LoginViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/login/LoginViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/login/LoginViewModel;)V", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: LoginActivity.kt */
public final class LoginActivity extends a {
    public LoginViewModel x;
    public HashMap y;

    public View c(int i2) {
        if (this.y == null) {
            this.y = new HashMap();
        }
        View view = (View) this.y.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.y.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public void onBackPressed() {
        LoginViewModel loginViewModel = this.x;
        if (loginViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        loginViewModel.t();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding a2 = g.a(this, R.layout.activity_login);
        Intrinsics.checkExpressionValueIsNotNull(a2, "DataBindingUtil.setConte… R.layout.activity_login)");
        ActivityLoginBinding activityLoginBinding = (ActivityLoginBinding) a2;
        LoginViewModel loginViewModel = this.x;
        if (loginViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        activityLoginBinding.a(loginViewModel);
        h a3 = a();
        LoginViewModel loginViewModel2 = this.x;
        if (loginViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        a3.a(loginViewModel2);
        ((TextInputEditText) c(R.id.password)).setOnEditorActionListener(new LoginActivity$onCreate$1(this));
        LoginViewModel loginViewModel3 = this.x;
        if (loginViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        ExtensionsKt.a((d) this, loginViewModel3.getUiCommand());
    }

    public final LoginViewModel q() {
        LoginViewModel loginViewModel = this.x;
        if (loginViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return loginViewModel;
    }
}
