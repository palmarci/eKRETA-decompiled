package hu.ekreta.ellenorzo.cases.decision;

import a.a.a.f;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "success", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 15})
/* compiled from: DecisionDetailViewModelImpl.kt */
public final class DecisionDetailViewModelImpl$send$3 extends Lambda implements Function1<Boolean, Unit> {
    public final /* synthetic */ DecisionDetailViewModelImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DecisionDetailViewModelImpl$send$3(DecisionDetailViewModelImpl decisionDetailViewModelImpl) {
        super(1);
        this.c = decisionDetailViewModelImpl;
    }

    public final void a(Boolean bool) {
        this.c.e(false);
        Intrinsics.checkExpressionValueIsNotNull(bool, "success");
        if (bool.booleanValue()) {
            DataBindingViewModel.showAlert$default(this.c, R.string.Successful_case_send, Integer.valueOf(R.string.Successful_dialog_title), new Function1<f, Unit>(this) {
                public final /* synthetic */ DecisionDetailViewModelImpl$send$3 c;

                {
                    this.c = r1;
                }

                public final void a(f fVar) {
                    Intrinsics.checkParameterIsNotNull(fVar, "it");
                    this.c.c.W1();
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((f) obj);
                    return Unit.INSTANCE;
                }
            }, (Integer) null, (Function1) null, 24, (Object) null);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Boolean) obj);
        return Unit.INSTANCE;
    }
}
