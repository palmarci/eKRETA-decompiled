package p289hu.ekreta.ellenorzo.subject.certificate.halfyear;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p289hu.ekreta.ellenorzo.evaluation.Evaluation;
import p289hu.ekreta.ellenorzo.evaluation.Evaluation.Type;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "", "it", "Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.subject.certificate.halfyear.HalfYearViewModelImpl$Companion$filter$1 */
/* compiled from: HalfYearViewModelImpl.kt */
public final class HalfYearViewModelImpl$Companion$filter$1 extends Lambda implements Function1<Evaluation, Boolean> {
    public static final HalfYearViewModelImpl$Companion$filter$1 INSTANCE = new HalfYearViewModelImpl$Companion$filter$1();

    public HalfYearViewModelImpl$Companion$filter$1() {
        super(1);
    }

    /* renamed from: a */
    public final boolean mo15851a(Evaluation evaluation) {
        Intrinsics.checkParameterIsNotNull(evaluation, "it");
        return evaluation.mo12586B() == Type.HalfYear;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(mo15851a((Evaluation) obj));
    }
}
