package p289hu.ekreta.ellenorzo.login;

import kotlin.Metadata;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationState;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import p300k.p313b.p315b0.C4673f;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "", "it", "Lhu/ekreta/ellenorzo/authentication/AuthenticationState;", "kotlin.jvm.PlatformType", "accept"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.login.LoginViewModelImpl$onBackPressed$1 */
/* compiled from: LoginViewModelImpl.kt */
public final class LoginViewModelImpl$onBackPressed$1<T> implements C4673f<AuthenticationState> {

    /* renamed from: c */
    public final /* synthetic */ LoginViewModelImpl f13667c;

    public LoginViewModelImpl$onBackPressed$1(LoginViewModelImpl loginViewModelImpl) {
        this.f13667c = loginViewModelImpl;
    }

    /* renamed from: a */
    public final void accept(AuthenticationState authenticationState) {
        if (authenticationState.mo11550b() || this.f13667c.f13642s != null) {
            Profile access$getLoggedInProfile$p = this.f13667c.f13642s;
            if (access$getLoggedInProfile$p != null) {
                this.f13667c.f13646w.mo11514c(access$getLoggedInProfile$p);
            }
            this.f13667c.mo16363N1();
            return;
        }
        DataBindingViewModel.showAlert$default(this.f13667c, C4014R.string.no_active_profile_message, null, null, 6, null);
    }
}
