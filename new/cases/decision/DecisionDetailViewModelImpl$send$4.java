package hu.ekreta.ellenorzo.cases.decision;

import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: DecisionDetailViewModelImpl.kt */
public final class DecisionDetailViewModelImpl$send$4 extends Lambda implements Function1<Throwable, Unit> {
    public final /* synthetic */ DecisionDetailViewModelImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DecisionDetailViewModelImpl$send$4(DecisionDetailViewModelImpl decisionDetailViewModelImpl) {
        super(1);
        this.c = decisionDetailViewModelImpl;
    }

    public final void a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "it");
        DataBindingViewModel.showError$default(this.c, th, Integer.valueOf(R.string.attention), (Function1) null, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return Unit.INSTANCE;
    }
}
