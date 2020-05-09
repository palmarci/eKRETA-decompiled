package p289hu.ekreta.ellenorzo.authentication;

import kotlin.Metadata;
import p300k.p313b.p315b0.C4673f;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "", "it", "Lhu/ekreta/ellenorzo/authentication/AuthenticationState;", "kotlin.jvm.PlatformType", "accept"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$login$2 */
/* compiled from: AuthenticationServiceImpl.kt */
public final class AuthenticationServiceImpl$login$2<T> implements C4673f<AuthenticationState> {

    /* renamed from: c */
    public final /* synthetic */ AuthenticationServiceImpl f11235c;

    public AuthenticationServiceImpl$login$2(AuthenticationServiceImpl authenticationServiceImpl) {
        this.f11235c = authenticationServiceImpl;
    }

    /* renamed from: a */
    public final void accept(AuthenticationState authenticationState) {
        if (authenticationState instanceof LoggedIn) {
            this.f11235c.f11213f.mo14194d(((LoggedIn) authenticationState).mo11553a()).mo16982c();
        }
    }
}
