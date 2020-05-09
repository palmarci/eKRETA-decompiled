package p289hu.ekreta.ellenorzo.rest;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p000a.p054h.p159c.p166z.C2580c;
import p300k.p313b.C5027n;
import p380p.p385t.C5813c;
import p380p.p385t.C5815e;
import p380p.p385t.C5824n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0001\rJ,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u0006H'J@\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u0006H'¨\u0006\u000e"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/Idp;", "", "extendToken", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/rest/Idp$Response;", "refreshToken", "", "grantType", "clientId", "login", "userName", "password", "instituteCode", "Response", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.rest.Idp */
/* compiled from: Idp.kt */
public interface Idp {

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.rest.Idp$DefaultImpls */
    /* compiled from: Idp.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ C5027n extendToken$default(Idp idp, String str, String str2, String str3, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str2 = "refresh_token";
                }
                if ((i & 4) != 0) {
                    str3 = "kreta-ellenorzo-mobile";
                }
                return idp.extendToken(str, str2, str3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: extendToken");
        }

        public static /* synthetic */ C5027n login$default(Idp idp, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if (obj == null) {
                if ((i & 8) != 0) {
                    str4 = "password";
                }
                String str6 = str4;
                if ((i & 16) != 0) {
                    str5 = "kreta-ellenorzo-mobile";
                }
                return idp.login(str, str2, str3, str6, str5);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: login");
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/Idp$Response;", "", "tokenType", "", "accessToken", "expiresIn", "", "refreshToken", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getExpiresIn", "()I", "getRefreshToken", "getTokenType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.rest.Idp$Response */
    /* compiled from: Idp.kt */
    public static final class Response {
        @C2580c("access_token")
        public final String accessToken;
        @C2580c("expires_in")
        public final int expiresIn;
        @C2580c("refresh_token")
        public final String refreshToken;
        @C2580c("token_type")
        public final String tokenType;

        public Response(String str, String str2, int i, String str3) {
            C0082a.m114a(str, "tokenType", str2, "accessToken", str3, "refreshToken");
            this.tokenType = str;
            this.accessToken = str2;
            this.expiresIn = i;
            this.refreshToken = str3;
        }

        public static /* synthetic */ Response copy$default(Response response, String str, String str2, int i, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = response.tokenType;
            }
            if ((i2 & 2) != 0) {
                str2 = response.accessToken;
            }
            if ((i2 & 4) != 0) {
                i = response.expiresIn;
            }
            if ((i2 & 8) != 0) {
                str3 = response.refreshToken;
            }
            return response.copy(str, str2, i, str3);
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

        public final Response copy(String str, String str2, int i, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "tokenType");
            Intrinsics.checkParameterIsNotNull(str2, "accessToken");
            Intrinsics.checkParameterIsNotNull(str3, "refreshToken");
            return new Response(str, str2, i, str3);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Response) {
                    Response response = (Response) obj;
                    if (Intrinsics.areEqual((Object) this.tokenType, (Object) response.tokenType) && Intrinsics.areEqual((Object) this.accessToken, (Object) response.accessToken)) {
                        if (!(this.expiresIn == response.expiresIn) || !Intrinsics.areEqual((Object) this.refreshToken, (Object) response.refreshToken)) {
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
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.accessToken;
            int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.expiresIn) * 31;
            String str3 = this.refreshToken;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder a = C0082a.m111a("Response(tokenType=");
            a.append(this.tokenType);
            a.append(", accessToken=");
            a.append(this.accessToken);
            a.append(", expiresIn=");
            a.append(this.expiresIn);
            a.append(", refreshToken=");
            return C0082a.m106a(a, this.refreshToken, ")");
        }
    }

    @C5815e
    @C5824n("connect/token")
    C5027n<Response> extendToken(@C5813c("refresh_token") String str, @C5813c("grant_type") String str2, @C5813c("client_id") String str3);

    @C5815e
    @C5824n("connect/token")
    C5027n<Response> login(@C5813c("userName") String str, @C5813c("password") String str2, @C5813c("institute_code") String str3, @C5813c("grant_type") String str4, @C5813c("client_id") String str5);
}
