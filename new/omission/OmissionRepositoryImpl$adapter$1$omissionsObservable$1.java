package hu.ekreta.ellenorzo.omission;

import hu.ekreta.ellenorzo.profile.Profile;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty1;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
/* compiled from: OmissionRepositoryImpl.kt */
public final /* synthetic */ class OmissionRepositoryImpl$adapter$1$omissionsObservable$1 extends PropertyReference1 {
    public static final KProperty1 INSTANCE = new OmissionRepositoryImpl$adapter$1$omissionsObservable$1();

    public Object get(Object obj) {
        return ((Profile) obj).m();
    }

    public String getName() {
        return "id";
    }

    public KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(Profile.class);
    }

    public String getSignature() {
        return "getId()Ljava/lang/String;";
    }
}
