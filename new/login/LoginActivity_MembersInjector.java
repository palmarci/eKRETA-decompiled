package hu.ekreta.ellenorzo.login;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import i.b;
import l.a.a;

public final class LoginActivity_MembersInjector implements b<LoginActivity> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f5713a;
    public final a<DispatchingAndroidInjector<android.app.Fragment>> b;
    public final a<LoginViewModel> c;

    /* renamed from: a */
    public void injectMembers(LoginActivity loginActivity) {
        loginActivity.v = this.f5713a.get();
        loginActivity.w = this.b.get();
        loginActivity.x = this.c.get();
    }

    public static void a(LoginActivity loginActivity, LoginViewModel loginViewModel) {
        loginActivity.x = loginViewModel;
    }
}
