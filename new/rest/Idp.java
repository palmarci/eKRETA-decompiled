package hu.ekreta.ellenorzo.rest;

import hu.ekreta.ellenorzo.rest.idp.AuthenticationDto;
import k.b.n;
import kotlin.Metadata;
import p.t.c;
import p.t.e;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u0006H'J@\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u0006H'¨\u0006\r"}, d2 = {"Lhu/ekreta/ellenorzo/rest/Idp;", "", "extendToken", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/rest/idp/AuthenticationDto;", "refreshToken", "", "grantType", "clientId", "login", "userName", "password", "instituteCode", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: Idp.kt */
public interface Idp {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    /* compiled from: Idp.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ n extendToken$default(Idp idp, String str, String str2, String str3, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    str2 = "refresh_token";
                }
                if ((i2 & 4) != 0) {
                    str3 = "kreta-ellenorzo-mobile";
                }
                return idp.extendToken(str, str2, str3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: extendToken");
        }

        public static /* synthetic */ n login$default(Idp idp, String str, String str2, String str3, String str4, String str5, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 8) != 0) {
                    str4 = "password";
                }
                String str6 = str4;
                if ((i2 & 16) != 0) {
                    str5 = "kreta-ellenorzo-mobile";
                }
                return idp.login(str, str2, str3, str6, str5);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: login");
        }
    }

    @e
    @p.t.n("connect/token")
    n<AuthenticationDto> extendToken(@c("refresh_token") String str, @c("grant_type") String str2, @c("client_id") String str3);

    @e
    @p.t.n("connect/token")
    n<AuthenticationDto> login(@c("userName") String str, @c("password") String str2, @c("institute_code") String str3, @c("grant_type") String str4, @c("client_id") String str5);
}
