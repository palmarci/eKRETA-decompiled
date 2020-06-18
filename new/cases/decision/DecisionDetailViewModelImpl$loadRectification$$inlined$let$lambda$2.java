package hu.ekreta.ellenorzo.cases.decision;

import hu.ekreta.ellenorzo.cases.subModels.Signer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Lhu/ekreta/ellenorzo/cases/subModels/Signer;", "kotlin.jvm.PlatformType", "invoke", "hu/ekreta/ellenorzo/cases/decision/DecisionDetailViewModelImpl$loadRectification$1$4"}, k = 3, mv = {1, 1, 15})
/* compiled from: DecisionDetailViewModelImpl.kt */
public final class DecisionDetailViewModelImpl$loadRectification$$inlined$let$lambda$2 extends Lambda implements Function1<Signer, Unit> {
    public final /* synthetic */ DecisionDetailViewModelImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DecisionDetailViewModelImpl$loadRectification$$inlined$let$lambda$2(DecisionDetailViewModelImpl decisionDetailViewModelImpl) {
        super(1);
        this.c = decisionDetailViewModelImpl;
    }

    public final void a(Signer signer) {
        DecisionDetailViewModelImpl decisionDetailViewModelImpl = this.c;
        String a2 = signer.a();
        if (a2 == null) {
            a2 = "";
        }
        decisionDetailViewModelImpl.y(a2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Signer) obj);
        return Unit.INSTANCE;
    }
}
