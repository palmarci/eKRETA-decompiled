package p289hu.ekreta.ellenorzo.authentication;

import kotlin.Metadata;
import p289hu.ekreta.ellenorzo.login.LoginRequest;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p300k.p313b.C4667b;
import p300k.p313b.C5027n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H&J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H&J\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H&J\b\u0010\u0015\u001a\u00020\u000bH&R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006¨\u0006\u0016"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "", "loggedInProfileObservable", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/profile/Profile;", "getLoggedInProfileObservable", "()Lio/reactivex/Observable;", "state", "Lhu/ekreta/ellenorzo/authentication/AuthenticationState;", "getState", "extendToken", "", "profile", "killRefreshToken", "Lio/reactivex/Completable;", "it", "login", "loginRequest", "Lhu/ekreta/ellenorzo/login/LoginRequest;", "savePassword", "", "logout", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.authentication.AuthenticationService */
/* compiled from: AuthenticationService.kt */
public interface AuthenticationService {

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.authentication.AuthenticationService$DefaultImpls */
    /* compiled from: AuthenticationService.kt */
    public static final class DefaultImpls {
    }

    /* renamed from: a */
    C4667b mo11511a(Profile profile);

    /* renamed from: a */
    void mo11512a(LoginRequest loginRequest, boolean z);

    /* renamed from: b */
    void mo11513b(Profile profile);

    /* renamed from: c */
    void mo11514c(Profile profile);

    /* renamed from: l */
    C5027n<AuthenticationState> mo11515l();

    /* renamed from: m */
    C5027n<Profile> mo11516m();
}
