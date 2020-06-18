package hu.ekreta.ellenorzo.evaluation;

import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
/* compiled from: EvaluationDetailsViewModelImpl.kt */
public final /* synthetic */ class EvaluationDetailsViewModelImpl$$special$$inlined$observable$1$lambda$2 extends MutablePropertyReference0 {
    public EvaluationDetailsViewModelImpl$$special$$inlined$observable$1$lambda$2(EvaluationDetailsViewModelImpl evaluationDetailsViewModelImpl) {
        super(evaluationDetailsViewModelImpl);
    }

    public Object get() {
        return ((EvaluationDetailsViewModelImpl) this.receiver).p();
    }

    public String getName() {
        return "group";
    }

    public KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(EvaluationDetailsViewModelImpl.class);
    }

    public String getSignature() {
        return "getGroup()Ljava/lang/String;";
    }

    public void set(Object obj) {
        ((EvaluationDetailsViewModelImpl) this.receiver).t((String) obj);
    }
}
