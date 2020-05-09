package p289hu.ekreta.ellenorzo.evaluation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import p211h.p262m.p263d.C3737d;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0005"}, mo17463d2 = {"<anonymous>", "", "Landroidx/fragment/app/FragmentActivity;", "invoke", "hu/ekreta/ellenorzo/evaluation/EvaluationDetailsViewModelImpl$evaluation$2$1$1", "hu/ekreta/ellenorzo/evaluation/EvaluationDetailsViewModelImpl$$special$$inlined$also$lambda$1"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.evaluation.EvaluationDetailsViewModelImpl$$special$$inlined$observable$1$lambda$1 */
/* compiled from: EvaluationDetailsViewModelImpl.kt */
public final class C4189xbe7e08f4 extends Lambda implements Function1<C3737d, Unit> {

    /* renamed from: c */
    public final /* synthetic */ EvaluationDetailsViewModelImpl$$special$$inlined$observable$1 f13237c;

    public C4189xbe7e08f4(EvaluationDetailsViewModelImpl$$special$$inlined$observable$1 evaluationDetailsViewModelImpl$$special$$inlined$observable$1) {
        this.f13237c = evaluationDetailsViewModelImpl$$special$$inlined$observable$1;
        super(1);
    }

    /* renamed from: a */
    public final void mo12661a(C3737d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
        String type = this.f13237c.f13234c.getType();
        if (!(type == null || StringsKt__StringsJVMKt.isBlank(type))) {
            dVar.setTitle(this.f13237c.f13234c.getType());
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo12661a((C3737d) obj);
        return Unit.INSTANCE;
    }
}
