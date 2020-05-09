package p289hu.ekreta.ellenorzo.login;

import android.os.Bundle;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputEditText;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p211h.p258l.C3703g;
import p211h.p262m.p263d.C3737d;
import p211h.p271p.C3810h;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.databinding.ActivityLoginBinding;
import p289hu.ekreta.ellenorzo.util.view.ExtensionsKt;
import p292i.p293c.p294h.C4457a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000e"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/login/LoginActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/login/LoginViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/login/LoginViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/login/LoginViewModel;)V", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.login.LoginActivity */
/* compiled from: LoginActivity.kt */
public final class LoginActivity extends C4457a {

    /* renamed from: x */
    public LoginViewModel f13617x;

    /* renamed from: y */
    public HashMap f13618y;

    /* renamed from: c */
    public View mo13098c(int i) {
        if (this.f13618y == null) {
            this.f13618y = new HashMap();
        }
        View view = (View) this.f13618y.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f13618y.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void onBackPressed() {
        LoginViewModel loginViewModel = this.f13617x;
        if (loginViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        loginViewModel.mo13130t();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding a = C3703g.m9412a(this, C4014R.layout.activity_login);
        Intrinsics.checkExpressionValueIsNotNull(a, "DataBindingUtil.setConte… R.layout.activity_login)");
        ActivityLoginBinding activityLoginBinding = (ActivityLoginBinding) a;
        LoginViewModel loginViewModel = this.f13617x;
        String str = "viewModel";
        if (loginViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        activityLoginBinding.mo12357a(loginViewModel);
        C3810h a2 = mo5280a();
        LoginViewModel loginViewModel2 = this.f13617x;
        if (loginViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        a2.mo10806a(loginViewModel2);
        ((TextInputEditText) mo13098c(C4014R.C4016id.password)).setOnEditorActionListener(new LoginActivity$onCreate$1(this));
        LoginViewModel loginViewModel3 = this.f13617x;
        if (loginViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        ExtensionsKt.m14883a((C3737d) this, loginViewModel3.getUiCommand());
    }

    /* renamed from: q */
    public final LoginViewModel mo13099q() {
        LoginViewModel loginViewModel = this.f13617x;
        if (loginViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return loginViewModel;
    }
}
