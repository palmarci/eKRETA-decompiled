package hu.ekreta.ellenorzo.subject.certificate.halfyear;

import hu.ekreta.ellenorzo.evaluation.Evaluation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: HalfYearViewModelImpl.kt */
public final class HalfYearViewModelImpl$Companion$filter$1 extends Lambda implements Function1<Evaluation, Boolean> {
    public static final HalfYearViewModelImpl$Companion$filter$1 INSTANCE = new HalfYearViewModelImpl$Companion$filter$1();

    public HalfYearViewModelImpl$Companion$filter$1() {
        super(1);
    }

    public final boolean a(Evaluation evaluation) {
        Intrinsics.checkParameterIsNotNull(evaluation, "it");
        return evaluation.B() == Evaluation.Type.HalfYear;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(a((Evaluation) obj));
    }
}
