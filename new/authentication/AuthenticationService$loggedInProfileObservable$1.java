package hu.ekreta.ellenorzo.authentication;

import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty1;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
/* compiled from: AuthenticationService.kt */
public final /* synthetic */ class AuthenticationService$loggedInProfileObservable$1 extends PropertyReference1 {
    public static final KProperty1 INSTANCE = new AuthenticationService$loggedInProfileObservable$1();

    public Object get(Object obj) {
        return ((LoggedIn) obj).a();
    }

    public String getName() {
        return FirebaseContainer.Param.PROFILE;
    }

    public KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(LoggedIn.class);
    }

    public String getSignature() {
        return "getProfile()Lhu/ekreta/ellenorzo/profile/Profile;";
    }
}
