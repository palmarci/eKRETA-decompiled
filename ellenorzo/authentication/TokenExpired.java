package p289hu.ekreta.ellenorzo.authentication;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/authentication/TokenExpired;", "Lhu/ekreta/ellenorzo/authentication/AuthenticationState;", "Lhu/ekreta/ellenorzo/authentication/WithProfile;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "(Lhu/ekreta/ellenorzo/profile/Profile;)V", "getProfile", "()Lhu/ekreta/ellenorzo/profile/Profile;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.authentication.TokenExpired */
/* compiled from: AuthenticationState.kt */
public final class TokenExpired extends AuthenticationState implements WithProfile {

    /* renamed from: c */
    public final Profile f11264c;

    public TokenExpired(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        super(false, false, null);
        this.f11264c = profile;
    }

    public static /* synthetic */ TokenExpired copy$default(TokenExpired tokenExpired, Profile profile, int i, Object obj) {
        if ((i & 1) != 0) {
            profile = tokenExpired.mo11553a();
        }
        return tokenExpired.mo11570a(profile);
    }

    /* renamed from: a */
    public final TokenExpired mo11570a(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        return new TokenExpired(profile);
    }

    /* renamed from: a */
    public Profile mo11553a() {
        return this.f11264c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) mo11553a(), (java.lang.Object) ((p289hu.ekreta.ellenorzo.authentication.TokenExpired) r2).mo11553a()) != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0019
            boolean r0 = r2 instanceof p289hu.ekreta.ellenorzo.authentication.TokenExpired
            if (r0 == 0) goto L_0x0017
            hu.ekreta.ellenorzo.authentication.TokenExpired r2 = (p289hu.ekreta.ellenorzo.authentication.TokenExpired) r2
            hu.ekreta.ellenorzo.profile.Profile r0 = r1.mo11553a()
            hu.ekreta.ellenorzo.profile.Profile r2 = r2.mo11553a()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r2 == 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r2 = 0
            return r2
        L_0x0019:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.authentication.TokenExpired.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Profile a = mo11553a();
        if (a != null) {
            return a.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("TokenExpired(profile=");
        a.append(mo11553a());
        a.append(")");
        return a.toString();
    }
}
