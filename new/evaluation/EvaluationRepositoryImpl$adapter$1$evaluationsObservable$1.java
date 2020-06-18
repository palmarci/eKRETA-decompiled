package hu.ekreta.ellenorzo.evaluation;

import hu.ekreta.ellenorzo.profile.Profile;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty1;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
/* compiled from: EvaluationRepositoryImpl.kt */
public final /* synthetic */ class EvaluationRepositoryImpl$adapter$1$evaluationsObservable$1 extends PropertyReference1 {
    public static final KProperty1 INSTANCE = new EvaluationRepositoryImpl$adapter$1$evaluationsObservable$1();

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
