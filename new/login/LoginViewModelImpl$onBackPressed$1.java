package hu.ekreta.ellenorzo.login;

import hu.ekreta.ellenorzo.profile.Profile;
import k.b.b0.h;
import k.b.j;
import k.b.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/Maybe;", "Lhu/ekreta/ellenorzo/profile/Profile;", "kotlin.jvm.PlatformType", "it", "", "apply", "(Ljava/lang/Boolean;)Lio/reactivex/Maybe;"}, k = 3, mv = {1, 1, 15})
/* compiled from: LoginViewModelImpl.kt */
public final class LoginViewModelImpl$onBackPressed$1<T, R> implements h<T, l<? extends R>> {
    public final /* synthetic */ LoginViewModelImpl c;

    public LoginViewModelImpl$onBackPressed$1(LoginViewModelImpl loginViewModelImpl) {
        this.c = loginViewModelImpl;
    }

    /* renamed from: a */
    public final j<Profile> apply(Boolean bool) {
        Intrinsics.checkParameterIsNotNull(bool, "it");
        if (bool.booleanValue()) {
            return this.c.v.b().c();
        }
        return j.c();
    }
}
