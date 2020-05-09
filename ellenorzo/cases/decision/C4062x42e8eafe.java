package p289hu.ekreta.ellenorzo.cases.decision;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p289hu.ekreta.ellenorzo.cases.subModels.Signer;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo17463d2 = {"<anonymous>", "", "it", "Lhu/ekreta/ellenorzo/cases/subModels/Signer;", "kotlin.jvm.PlatformType", "invoke", "hu/ekreta/ellenorzo/cases/decision/DecisionDetailViewModelImpl$loadRectification$1$4"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.decision.DecisionDetailViewModelImpl$loadRectification$$inlined$let$lambda$2 */
/* compiled from: DecisionDetailViewModelImpl.kt */
public final class C4062x42e8eafe extends Lambda implements Function1<Signer, Unit> {

    /* renamed from: c */
    public final /* synthetic */ DecisionDetailViewModelImpl f11402c;

    public C4062x42e8eafe(DecisionDetailViewModelImpl decisionDetailViewModelImpl) {
        this.f11402c = decisionDetailViewModelImpl;
        super(1);
    }

    /* renamed from: a */
    public final void mo11760a(Signer signer) {
        DecisionDetailViewModelImpl decisionDetailViewModelImpl = this.f11402c;
        String a = signer.mo12009a();
        if (a == null) {
            a = "";
        }
        decisionDetailViewModelImpl.mo11757z(a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo11760a((Signer) obj);
        return Unit.INSTANCE;
    }
}
