package p289hu.ekreta.ellenorzo.authentication;

import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty1;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;

@Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.authentication.AuthenticationService$loggedInProfileObservable$1 */
/* compiled from: AuthenticationService.kt */
public final /* synthetic */ class AuthenticationService$loggedInProfileObservable$1 extends PropertyReference1 {
    public static final KProperty1 INSTANCE = new AuthenticationService$loggedInProfileObservable$1();

    public Object get(Object obj) {
        return ((LoggedIn) obj).mo11553a();
    }

    public String getName() {
        return Param.PROFILE;
    }

    public KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(LoggedIn.class);
    }

    public String getSignature() {
        return "getProfile()Lhu/ekreta/ellenorzo/profile/Profile;";
    }
}
