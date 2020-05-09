package p289hu.ekreta.ellenorzo.login;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p289hu.ekreta.ellenorzo.institute.Institute;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/login/LoginRequest;", "", "institute", "Lhu/ekreta/ellenorzo/institute/Institute;", "userName", "", "password", "(Lhu/ekreta/ellenorzo/institute/Institute;Ljava/lang/String;Ljava/lang/String;)V", "getInstitute", "()Lhu/ekreta/ellenorzo/institute/Institute;", "getPassword", "()Ljava/lang/String;", "getUserName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.login.LoginRequest */
/* compiled from: LoginRequest.kt */
public final class LoginRequest {

    /* renamed from: a */
    public final Institute f13628a;

    /* renamed from: b */
    public final String f13629b;

    /* renamed from: c */
    public final String f13630c;

    public LoginRequest(Institute institute, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(institute, "institute");
        Intrinsics.checkParameterIsNotNull(str, "userName");
        Intrinsics.checkParameterIsNotNull(str2, "password");
        this.f13628a = institute;
        this.f13629b = str;
        this.f13630c = str2;
    }

    public static /* synthetic */ LoginRequest copy$default(LoginRequest loginRequest, Institute institute, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            institute = loginRequest.f13628a;
        }
        if ((i & 2) != 0) {
            str = loginRequest.f13629b;
        }
        if ((i & 4) != 0) {
            str2 = loginRequest.f13630c;
        }
        return loginRequest.mo13106a(institute, str, str2);
    }

    /* renamed from: a */
    public final Institute mo13105a() {
        return this.f13628a;
    }

    /* renamed from: a */
    public final LoginRequest mo13106a(Institute institute, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(institute, "institute");
        Intrinsics.checkParameterIsNotNull(str, "userName");
        Intrinsics.checkParameterIsNotNull(str2, "password");
        return new LoginRequest(institute, str, str2);
    }

    /* renamed from: b */
    public final String mo13107b() {
        return this.f13630c;
    }

    /* renamed from: c */
    public final String mo13108c() {
        return this.f13629b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f13630c, (java.lang.Object) r3.f13630c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.login.LoginRequest
            if (r0 == 0) goto L_0x0027
            hu.ekreta.ellenorzo.login.LoginRequest r3 = (p289hu.ekreta.ellenorzo.login.LoginRequest) r3
            hu.ekreta.ellenorzo.institute.Institute r0 = r2.f13628a
            hu.ekreta.ellenorzo.institute.Institute r1 = r3.f13628a
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f13629b
            java.lang.String r1 = r3.f13629b
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f13630c
            java.lang.String r3 = r3.f13630c
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.login.LoginRequest.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Institute institute = this.f13628a;
        int i = 0;
        int hashCode = (institute != null ? institute.hashCode() : 0) * 31;
        String str = this.f13629b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f13630c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("LoginRequest(institute=");
        a.append(this.f13628a);
        a.append(", userName=");
        a.append(this.f13629b);
        a.append(", password=");
        return C0082a.m106a(a, this.f13630c, ")");
    }
}
