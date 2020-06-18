package hu.ekreta.ellenorzo.authentication;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lhu/ekreta/ellenorzo/authentication/RoleIsNotAuthenticatedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "notAuthenticatedRole", "Lhu/ekreta/ellenorzo/authentication/SupportedRole;", "(Lhu/ekreta/ellenorzo/authentication/SupportedRole;)V", "getNotAuthenticatedRole", "()Lhu/ekreta/ellenorzo/authentication/SupportedRole;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: AuthenticationState.kt */
public final class RoleIsNotAuthenticatedException extends Exception {
    public final SupportedRole c;

    public RoleIsNotAuthenticatedException(SupportedRole supportedRole) {
        Intrinsics.checkParameterIsNotNull(supportedRole, "notAuthenticatedRole");
        this.c = supportedRole;
    }

    public final SupportedRole a() {
        return this.c;
    }
}
