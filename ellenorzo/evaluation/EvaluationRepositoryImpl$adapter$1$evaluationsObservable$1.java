package p289hu.ekreta.ellenorzo.evaluation;

import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty1;
import p289hu.ekreta.ellenorzo.profile.Profile;

@Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.evaluation.EvaluationRepositoryImpl$adapter$1$evaluationsObservable$1 */
/* compiled from: EvaluationRepositoryImpl.kt */
public final /* synthetic */ class EvaluationRepositoryImpl$adapter$1$evaluationsObservable$1 extends PropertyReference1 {
    public static final KProperty1 INSTANCE = new EvaluationRepositoryImpl$adapter$1$evaluationsObservable$1();

    public Object get(Object obj) {
        return ((Profile) obj).mo14054m();
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
