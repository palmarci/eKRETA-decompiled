package hu.ekreta.ellenorzo.cases.detail;

import hu.ekreta.ellenorzo.cases.BaseCase;
import hu.ekreta.ellenorzo.cases.CaseRepository;
import hu.ekreta.ellenorzo.profile.Profile;
import k.b.b0.h;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0004H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/cases/BaseCase;", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lhu/ekreta/ellenorzo/profile/Profile;", "", "kotlin.jvm.PlatformType", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: CaseDetailsViewModelImpl.kt */
public final class CaseDetailsViewModelImpl$loadCaseById$1<T, R> implements h<T, q<? extends R>> {
    public final /* synthetic */ CaseDetailsViewModelImpl c;

    public CaseDetailsViewModelImpl$loadCaseById$1(CaseDetailsViewModelImpl caseDetailsViewModelImpl) {
        this.c = caseDetailsViewModelImpl;
    }

    /* renamed from: a */
    public final n<BaseCase> apply(Pair<Profile, String> pair) {
        Intrinsics.checkParameterIsNotNull(pair, "<name for destructuring parameter 0>");
        String component2 = pair.component2();
        CaseRepository access$getCaseRepository$p = this.c.O;
        Intrinsics.checkExpressionValueIsNotNull(component2, "caseId");
        return access$getCaseRepository$p.a(component2, pair.component1());
    }
}
