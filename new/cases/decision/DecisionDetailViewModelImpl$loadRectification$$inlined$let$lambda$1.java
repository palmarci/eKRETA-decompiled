package hu.ekreta.ellenorzo.cases.decision;

import hu.ekreta.ellenorzo.cases.subModels.Signer;
import hu.ekreta.ellenorzo.profile.Profile;
import k.b.b0.h;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/cases/subModels/Signer;", "it", "Lhu/ekreta/ellenorzo/profile/Profile;", "apply", "hu/ekreta/ellenorzo/cases/decision/DecisionDetailViewModelImpl$loadRectification$1$3"}, k = 3, mv = {1, 1, 15})
/* compiled from: DecisionDetailViewModelImpl.kt */
public final class DecisionDetailViewModelImpl$loadRectification$$inlined$let$lambda$1<T, R> implements h<T, q<? extends R>> {
    public final /* synthetic */ CaseDetailParameter c;
    public final /* synthetic */ DecisionDetailViewModelImpl e;

    public DecisionDetailViewModelImpl$loadRectification$$inlined$let$lambda$1(CaseDetailParameter caseDetailParameter, DecisionDetailViewModelImpl decisionDetailViewModelImpl) {
        this.c = caseDetailParameter;
        this.e = decisionDetailViewModelImpl;
    }

    /* renamed from: a */
    public final n<Signer> apply(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, "it");
        if ((this.c.d().length() > 0) && this.c.e().l() != null) {
            return this.e.H.a(profile, Integer.parseInt(this.c.d()), this.c.e().l().intValue());
        }
        n<Signer> b = n.b((Throwable) new InvalidRectificationException());
        Intrinsics.checkExpressionValueIsNotNull(b, "Observable.error(InvalidRectificationException())");
        return b;
    }
}
