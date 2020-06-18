package hu.ekreta.ellenorzo.evaluation;

import android.content.Context;
import h.m.d.d;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.evaluation.Evaluation;
import hu.ekreta.ellenorzo.group.GroupRepository;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt__StringsJVMKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
/* compiled from: Delegates.kt */
public final class EvaluationDetailsViewModelImpl$$special$$inlined$observable$1 extends ObservableProperty<Evaluation> {
    public final /* synthetic */ EvaluationDetailsViewModelImpl c;
    public final /* synthetic */ Context e;
    public final /* synthetic */ GroupRepository f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EvaluationDetailsViewModelImpl$$special$$inlined$observable$1(Object obj, Object obj2, EvaluationDetailsViewModelImpl evaluationDetailsViewModelImpl, Context context, GroupRepository groupRepository) {
        super(obj2);
        this.c = evaluationDetailsViewModelImpl;
        this.e = context;
        this.f = groupRepository;
    }

    public void afterChange(KProperty<?> kProperty, Evaluation evaluation, Evaluation evaluation2) {
        String str;
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        Evaluation evaluation3 = evaluation2;
        Evaluation evaluation4 = evaluation;
        if (evaluation3 != null) {
            this.c.o(evaluation3.a(this.e));
            EvaluationDetailsViewModelImpl evaluationDetailsViewModelImpl = this.c;
            String D = evaluation3.D();
            if (D == null) {
                D = "";
            }
            evaluationDetailsViewModelImpl.z(D);
            EvaluationDetailsViewModelImpl evaluationDetailsViewModelImpl2 = this.c;
            String A = evaluation3.A();
            if (A == null) {
                A = "";
            }
            evaluationDetailsViewModelImpl2.w(A);
            this.c.v(evaluation3.z());
            EvaluationDetailsViewModelImpl evaluationDetailsViewModelImpl3 = this.c;
            String C = evaluation3.C();
            if (C == null) {
                C = "";
            }
            evaluationDetailsViewModelImpl3.y(C);
            this.c.s(evaluation3.k());
            EvaluationDetailsViewModelImpl evaluationDetailsViewModelImpl4 = this.c;
            String n2 = evaluation3.n();
            if (n2 == null) {
                n2 = "";
            }
            evaluationDetailsViewModelImpl4.u(n2);
            EvaluationDetailsViewModelImpl evaluationDetailsViewModelImpl5 = this.c;
            evaluationDetailsViewModelImpl5.r(evaluationDetailsViewModelImpl5.a(evaluation3.t()));
            EvaluationDetailsViewModelImpl evaluationDetailsViewModelImpl6 = this.c;
            evaluationDetailsViewModelImpl6.q(evaluationDetailsViewModelImpl6.a(evaluation3.f()));
            boolean z = true;
            this.c.c(evaluation3.B() == Evaluation.Type.MidYear);
            EvaluationDetailsViewModelImpl evaluationDetailsViewModelImpl7 = this.c;
            if (evaluationDetailsViewModelImpl7.o1()) {
                str = this.e.getString(R.string.Evaluation_Model_Theme);
                Intrinsics.checkExpressionValueIsNotNull(str, "context.getString(R.string.Evaluation_Model_Theme)");
            } else {
                str = this.e.getString(R.string.Evaluation_Model_Note);
                Intrinsics.checkExpressionValueIsNotNull(str, "context.getString(R.string.Evaluation_Model_Note)");
            }
            evaluationDetailsViewModelImpl7.x(str);
            String F = evaluation3.F();
            if (F != null && !StringsKt__StringsJVMKt.isBlank(F)) {
                z = false;
            }
            if (!z) {
                EvaluationDetailsViewModelImpl evaluationDetailsViewModelImpl8 = this.c;
                evaluationDetailsViewModelImpl8.A(evaluation3.F() + '%');
            }
            this.c.a((Function1<? super d, Unit>) new EvaluationDetailsViewModelImpl$$special$$inlined$observable$1$lambda$1(this));
            EvaluationDetailsViewModelImpl evaluationDetailsViewModelImpl9 = this.c;
            evaluationDetailsViewModelImpl9.a(new EvaluationDetailsViewModelImpl$$special$$inlined$observable$1$lambda$2(evaluationDetailsViewModelImpl9), this.f.b(evaluation3.l()));
        }
    }
}
