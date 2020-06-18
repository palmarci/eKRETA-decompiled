package hu.ekreta.ellenorzo.login;

import a.b.a.a.a;
import hu.ekreta.ellenorzo.rest.globalmobile.InstituteDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lhu/ekreta/ellenorzo/login/LoginRequest;", "", "institute", "Lhu/ekreta/ellenorzo/rest/globalmobile/InstituteDto;", "userName", "", "password", "(Lhu/ekreta/ellenorzo/rest/globalmobile/InstituteDto;Ljava/lang/String;Ljava/lang/String;)V", "getInstitute", "()Lhu/ekreta/ellenorzo/rest/globalmobile/InstituteDto;", "getPassword", "()Ljava/lang/String;", "getUserName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: LoginRequest.kt */
public final class LoginRequest {

    /* renamed from: a  reason: collision with root package name */
    public final InstituteDto f5714a;
    public final String b;
    public final String c;

    public LoginRequest(InstituteDto instituteDto, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(instituteDto, "institute");
        Intrinsics.checkParameterIsNotNull(str, "userName");
        Intrinsics.checkParameterIsNotNull(str2, "password");
        this.f5714a = instituteDto;
        this.b = str;
        this.c = str2;
    }

    public static /* synthetic */ LoginRequest copy$default(LoginRequest loginRequest, InstituteDto instituteDto, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            instituteDto = loginRequest.f5714a;
        }
        if ((i2 & 2) != 0) {
            str = loginRequest.b;
        }
        if ((i2 & 4) != 0) {
            str2 = loginRequest.c;
        }
        return loginRequest.a(instituteDto, str, str2);
    }

    public final LoginRequest a(InstituteDto instituteDto, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(instituteDto, "institute");
        Intrinsics.checkParameterIsNotNull(str, "userName");
        Intrinsics.checkParameterIsNotNull(str2, "password");
        return new LoginRequest(instituteDto, str, str2);
    }

    public final InstituteDto a() {
        return this.f5714a;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginRequest)) {
            return false;
        }
        LoginRequest loginRequest = (LoginRequest) obj;
        return Intrinsics.areEqual((Object) this.f5714a, (Object) loginRequest.f5714a) && Intrinsics.areEqual((Object) this.b, (Object) loginRequest.b) && Intrinsics.areEqual((Object) this.c, (Object) loginRequest.c);
    }

    public int hashCode() {
        InstituteDto instituteDto = this.f5714a;
        int i2 = 0;
        int hashCode = (instituteDto != null ? instituteDto.hashCode() : 0) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("LoginRequest(institute=");
        a2.append(this.f5714a);
        a2.append(", userName=");
        a2.append(this.b);
        a2.append(", password=");
        return a.a(a2, this.c, ")");
    }
}
