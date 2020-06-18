package hu.ekreta.ellenorzo.evaluation;

import h.m.d.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0005"}, d2 = {"<anonymous>", "", "Landroidx/fragment/app/FragmentActivity;", "invoke", "hu/ekreta/ellenorzo/evaluation/EvaluationDetailsViewModelImpl$evaluation$2$1$1", "hu/ekreta/ellenorzo/evaluation/EvaluationDetailsViewModelImpl$$special$$inlined$also$lambda$1"}, k = 3, mv = {1, 1, 15})
/* compiled from: EvaluationDetailsViewModelImpl.kt */
public final class EvaluationDetailsViewModelImpl$$special$$inlined$observable$1$lambda$1 extends Lambda implements Function1<d, Unit> {
    public final /* synthetic */ EvaluationDetailsViewModelImpl$$special$$inlined$observable$1 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EvaluationDetailsViewModelImpl$$special$$inlined$observable$1$lambda$1(EvaluationDetailsViewModelImpl$$special$$inlined$observable$1 evaluationDetailsViewModelImpl$$special$$inlined$observable$1) {
        super(1);
        this.c = evaluationDetailsViewModelImpl$$special$$inlined$observable$1;
    }

    public final void a(d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
        String type = this.c.c.getType();
        if (!(type == null || StringsKt__StringsJVMKt.isBlank(type))) {
            dVar.setTitle(this.c.c.getType());
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((d) obj);
        return Unit.INSTANCE;
    }
}
