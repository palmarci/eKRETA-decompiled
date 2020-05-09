package p289hu.ekreta.ellenorzo.subject.certificate;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p289hu.ekreta.ellenorzo.evaluation.Evaluation;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "", "it", "Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.subject.certificate.CertificateViewModelImpl$convertAndAddHeaders$listOfEvaluation$2 */
/* compiled from: CertificateViewModelImpl.kt */
public final class CertificateViewModelImpl$convertAndAddHeaders$listOfEvaluation$2 extends Lambda implements Function1<Evaluation, Integer> {
    public static final CertificateViewModelImpl$convertAndAddHeaders$listOfEvaluation$2 INSTANCE = new CertificateViewModelImpl$convertAndAddHeaders$listOfEvaluation$2();

    public CertificateViewModelImpl$convertAndAddHeaders$listOfEvaluation$2() {
        super(1);
    }

    /* renamed from: a */
    public final int mo15811a(Evaluation evaluation) {
        Intrinsics.checkParameterIsNotNull(evaluation, "it");
        return evaluation.mo12597h();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Integer.valueOf(mo15811a((Evaluation) obj));
    }
}
