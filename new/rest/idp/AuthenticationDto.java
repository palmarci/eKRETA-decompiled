package hu.ekreta.ellenorzo.rest.idp;

import a.b.a.a.a;
import a.h.c.z.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lhu/ekreta/ellenorzo/rest/idp/AuthenticationDto;", "", "tokenType", "", "accessToken", "expiresIn", "", "refreshToken", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getExpiresIn", "()I", "getRefreshToken", "getTokenType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: AuthenticationDto.kt */
public final class AuthenticationDto {
    @c("access_token")
    public final String accessToken;
    @c("expires_in")
    public final int expiresIn;
    @c("refresh_token")
    public final String refreshToken;
    @c("token_type")
    public final String tokenType;

    public AuthenticationDto(String str, String str2, int i2, String str3) {
        a.a(str, "tokenType", str2, "accessToken", str3, "refreshToken");
        this.tokenType = str;
        this.accessToken = str2;
        this.expiresIn = i2;
        this.refreshToken = str3;
    }

    public static /* synthetic */ AuthenticationDto copy$default(AuthenticationDto authenticationDto, String str, String str2, int i2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = authenticationDto.tokenType;
        }
        if ((i3 & 2) != 0) {
            str2 = authenticationDto.accessToken;
        }
        if ((i3 & 4) != 0) {
            i2 = authenticationDto.expiresIn;
        }
        if ((i3 & 8) != 0) {
            str3 = authenticationDto.refreshToken;
        }
        return authenticationDto.copy(str, str2, i2, str3);
    }

    public final String component1() {
        return this.tokenType;
    }

    public final String component2() {
        return this.accessToken;
    }

    public final int component3() {
        return this.expiresIn;
    }

    public final String component4() {
        return this.refreshToken;
    }

    public final AuthenticationDto copy(String str, String str2, int i2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "tokenType");
        Intrinsics.checkParameterIsNotNull(str2, "accessToken");
        Intrinsics.checkParameterIsNotNull(str3, "refreshToken");
        return new AuthenticationDto(str, str2, i2, str3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthenticationDto) {
                AuthenticationDto authenticationDto = (AuthenticationDto) obj;
                if (Intrinsics.areEqual((Object) this.tokenType, (Object) authenticationDto.tokenType) && Intrinsics.areEqual((Object) this.accessToken, (Object) authenticationDto.accessToken)) {
                    if (!(this.expiresIn == authenticationDto.expiresIn) || !Intrinsics.areEqual((Object) this.refreshToken, (Object) authenticationDto.refreshToken)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final int getExpiresIn() {
        return this.expiresIn;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final String getTokenType() {
        return this.tokenType;
    }

    public int hashCode() {
        String str = this.tokenType;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.accessToken;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.expiresIn) * 31;
        String str3 = this.refreshToken;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("AuthenticationDto(tokenType=");
        a2.append(this.tokenType);
        a2.append(", accessToken=");
        a2.append(this.accessToken);
        a2.append(", expiresIn=");
        a2.append(this.expiresIn);
        a2.append(", refreshToken=");
        return a.a(a2, this.refreshToken, ")");
    }
}
