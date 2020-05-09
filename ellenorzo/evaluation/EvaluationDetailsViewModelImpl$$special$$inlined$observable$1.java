package p289hu.ekreta.ellenorzo.evaluation;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt__StringsJVMKt;
import p211h.p262m.p263d.C3737d;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.evaluation.Evaluation.Type;
import p289hu.ekreta.ellenorzo.group.GroupRepository;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, mo17463d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.evaluation.EvaluationDetailsViewModelImpl$$special$$inlined$observable$1 */
/* compiled from: Delegates.kt */
public final class EvaluationDetailsViewModelImpl$$special$$inlined$observable$1 extends ObservableProperty<Evaluation> {

    /* renamed from: c */
    public final /* synthetic */ EvaluationDetailsViewModelImpl f13234c;

    /* renamed from: e */
    public final /* synthetic */ Context f13235e;

    /* renamed from: f */
    public final /* synthetic */ GroupRepository f13236f;

    public EvaluationDetailsViewModelImpl$$special$$inlined$observable$1(Object obj, Object obj2, EvaluationDetailsViewModelImpl evaluationDetailsViewModelImpl, Context context, GroupRepository groupRepository) {
        this.f13234c = evaluationDetailsViewModelImpl;
        this.f13235e = context;
        this.f13236f = groupRepository;
        super(obj2);
    }

    public void afterChange(KProperty<?> kProperty, Evaluation evaluation, Evaluation evaluation2) {
        String str;
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        Evaluation evaluation3 = evaluation2;
        Evaluation evaluation4 = evaluation;
        if (evaluation3 != null) {
            this.f13234c.mo12651p(evaluation3.mo12592a(this.f13235e));
            EvaluationDetailsViewModelImpl evaluationDetailsViewModelImpl = this.f13234c;
            String D = evaluation3.mo12588D();
            String str2 = "";
            if (D == null) {
                D = str2;
            }
            evaluationDetailsViewModelImpl.mo12646A(D);
            EvaluationDetailsViewModelImpl evaluationDetailsViewModelImpl2 = this.f13234c;
            String A = evaluation3.mo12585A();
            if (A == null) {
                A = str2;
            }
            evaluationDetailsViewModelImpl2.mo12658x(A);
            this.f13234c.mo12657w(evaluation3.mo12618z());
            EvaluationDetailsViewModelImpl evaluationDetailsViewModelImpl3 = this.f13234c;
            String C = evaluation3.mo12587C();
            if (C == null) {
                C = str2;
            }
            evaluationDetailsViewModelImpl3.mo12660z(C);
            this.f13234c.mo12654t(evaluation3.mo12601k());
            EvaluationDetailsViewModelImpl evaluationDetailsViewModelImpl4 = this.f13234c;
            String n = evaluation3.mo12604n();
            if (n == null) {
                n = str2;
            }
            evaluationDetailsViewModelImpl4.mo12656v(n);
            EvaluationDetailsViewModelImpl evaluationDetailsViewModelImpl5 = this.f13234c;
            evaluationDetailsViewModelImpl5.mo12653s(evaluationDetailsViewModelImpl5.mo12648a(evaluation3.mo12610t()));
            EvaluationDetailsViewModelImpl evaluationDetailsViewModelImpl6 = this.f13234c;
            evaluationDetailsViewModelImpl6.mo12652r(evaluationDetailsViewModelImpl6.mo12648a(evaluation3.mo12595f()));
            boolean z = true;
            this.f13234c.mo12649b(evaluation3.mo12586B() == Type.MidYear);
            EvaluationDetailsViewModelImpl evaluationDetailsViewModelImpl7 = this.f13234c;
            if (evaluationDetailsViewModelImpl7.mo12639i1()) {
                str = this.f13235e.getString(C4014R.string.Evaluation_Model_Theme);
                Intrinsics.checkExpressionValueIsNotNull(str, "context.getString(R.string.Evaluation_Model_Theme)");
            } else {
                str = this.f13235e.getString(C4014R.string.Evaluation_Model_Note);
                Intrinsics.checkExpressionValueIsNotNull(str, "context.getString(R.string.Evaluation_Model_Note)");
            }
            evaluationDetailsViewModelImpl7.mo12659y(str);
            String F = evaluation3.mo12590F();
            if (F != null && !StringsKt__StringsJVMKt.isBlank(F)) {
                z = false;
            }
            if (!z) {
                EvaluationDetailsViewModelImpl evaluationDetailsViewModelImpl8 = this.f13234c;
                StringBuilder sb = new StringBuilder();
                sb.append(evaluation3.mo12590F());
                sb.append('%');
                evaluationDetailsViewModelImpl8.mo12647B(sb.toString());
            }
            this.f13234c.mo16373a((Function1<? super C3737d, Unit>) new C4189xbe7e08f4<Object,Unit>(this));
            EvaluationDetailsViewModelImpl evaluationDetailsViewModelImpl9 = this.f13234c;
            evaluationDetailsViewModelImpl9.mo16415a((KMutableProperty0<T>) new C4190xbe7e08f5<T>(evaluationDetailsViewModelImpl9), this.f13236f.mo12812b(evaluation3.mo12602l()));
        }
    }
}
