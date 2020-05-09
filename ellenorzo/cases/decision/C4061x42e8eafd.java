package p289hu.ekreta.ellenorzo.cases.decision;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.cases.subModels.Signer;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/cases/subModels/Signer;", "it", "Lhu/ekreta/ellenorzo/profile/Profile;", "apply", "hu/ekreta/ellenorzo/cases/decision/DecisionDetailViewModelImpl$loadRectification$1$3"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.decision.DecisionDetailViewModelImpl$loadRectification$$inlined$let$lambda$1 */
/* compiled from: DecisionDetailViewModelImpl.kt */
public final class C4061x42e8eafd<T, R> implements C4675h<T, C5030q<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ CaseDetailParameter f11400c;

    /* renamed from: e */
    public final /* synthetic */ DecisionDetailViewModelImpl f11401e;

    public C4061x42e8eafd(CaseDetailParameter caseDetailParameter, DecisionDetailViewModelImpl decisionDetailViewModelImpl) {
        this.f11400c = caseDetailParameter;
        this.f11401e = decisionDetailViewModelImpl;
    }

    /* renamed from: a */
    public final C5027n<Signer> apply(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, "it");
        if ((this.f11400c.mo11698d().length() > 0) && this.f11400c.mo11700e().mo11957l() != null) {
            return this.f11401e.f11378G.mo11865a(profile, Integer.parseInt(this.f11400c.mo11698d()), this.f11400c.mo11700e().mo11957l().intValue());
        }
        C5027n<Signer> b = C5027n.m16896b((Throwable) new InvalidRectificationException());
        Intrinsics.checkExpressionValueIsNotNull(b, "Observable.error(InvalidRectificationException())");
        return b;
    }
}
