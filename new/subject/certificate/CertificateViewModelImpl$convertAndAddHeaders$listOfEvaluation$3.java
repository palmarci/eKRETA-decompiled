package hu.ekreta.ellenorzo.subject.certificate;

import hu.ekreta.ellenorzo.evaluation.Evaluation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: CertificateViewModelImpl.kt */
public final class CertificateViewModelImpl$convertAndAddHeaders$listOfEvaluation$3 extends Lambda implements Function1<Evaluation, String> {
    public static final CertificateViewModelImpl$convertAndAddHeaders$listOfEvaluation$3 INSTANCE = new CertificateViewModelImpl$convertAndAddHeaders$listOfEvaluation$3();

    public CertificateViewModelImpl$convertAndAddHeaders$listOfEvaluation$3() {
        super(1);
    }

    /* renamed from: a */
    public final String invoke(Evaluation evaluation) {
        Intrinsics.checkParameterIsNotNull(evaluation, "it");
        return evaluation.r();
    }
}
