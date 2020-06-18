package hu.ekreta.ellenorzo.login;

import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: LoginViewModelImpl.kt */
public final class LoginViewModelImpl$onBackPressed$2 extends Lambda implements Function1<Profile, Unit> {
    public final /* synthetic */ LoginViewModelImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoginViewModelImpl$onBackPressed$2(LoginViewModelImpl loginViewModelImpl) {
        super(1);
        this.c = loginViewModelImpl;
    }

    public final void a(Profile profile) {
        AuthenticationService access$getAuthenticationService$p = this.c.x;
        Intrinsics.checkExpressionValueIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        access$getAuthenticationService$p.b(profile);
        this.c.W1();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Profile) obj);
        return Unit.INSTANCE;
    }
}
