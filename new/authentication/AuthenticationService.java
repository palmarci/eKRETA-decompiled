package hu.ekreta.ellenorzo.authentication;

import hu.ekreta.ellenorzo.login.LoginRequest;
import hu.ekreta.ellenorzo.profile.Profile;
import k.b.b;
import k.b.n;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H&J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H&J\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H&J\b\u0010\u0015\u001a\u00020\u000bH&R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006¨\u0006\u0016"}, d2 = {"Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "", "loggedInProfileObservable", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/profile/Profile;", "getLoggedInProfileObservable", "()Lio/reactivex/Observable;", "state", "Lhu/ekreta/ellenorzo/authentication/AuthenticationState;", "getState", "extendToken", "", "profile", "killRefreshToken", "Lio/reactivex/Completable;", "it", "login", "loginRequest", "Lhu/ekreta/ellenorzo/login/LoginRequest;", "savePassword", "", "logout", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: AuthenticationService.kt */
public interface AuthenticationService {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    /* compiled from: AuthenticationService.kt */
    public static final class DefaultImpls {
    }

    b a(Profile profile);

    void a(LoginRequest loginRequest, boolean z);

    void b(Profile profile);

    n<AuthenticationState> l();

    n<Profile> m();
}
