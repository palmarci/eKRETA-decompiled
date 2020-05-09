package p289hu.ekreta.ellenorzo.login;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.login.LoginActivity_MembersInjector */
public final class LoginActivity_MembersInjector implements C4447b<LoginActivity> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f13625a;

    /* renamed from: b */
    public final C5431a<DispatchingAndroidInjector<android.app.Fragment>> f13626b;

    /* renamed from: c */
    public final C5431a<LoginViewModel> f13627c;

    /* renamed from: a */
    public void injectMembers(LoginActivity loginActivity) {
        loginActivity.f15496v = (DispatchingAndroidInjector) this.f13625a.get();
        loginActivity.f15497w = (DispatchingAndroidInjector) this.f13626b.get();
        loginActivity.f13617x = (LoginViewModel) this.f13627c.get();
    }

    /* renamed from: a */
    public static void m12715a(LoginActivity loginActivity, LoginViewModel loginViewModel) {
        loginActivity.f13617x = loginViewModel;
    }
}
