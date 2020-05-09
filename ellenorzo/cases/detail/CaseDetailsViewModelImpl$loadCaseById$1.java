package p289hu.ekreta.ellenorzo.cases.detail;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.cases.BaseCase;
import p289hu.ekreta.ellenorzo.cases.CaseRepository;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0004H\n¢\u0006\u0002\b\b"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/cases/BaseCase;", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lhu/ekreta/ellenorzo/profile/Profile;", "", "kotlin.jvm.PlatformType", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.detail.CaseDetailsViewModelImpl$loadCaseById$1 */
/* compiled from: CaseDetailsViewModelImpl.kt */
public final class CaseDetailsViewModelImpl$loadCaseById$1<T, R> implements C4675h<T, C5030q<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ CaseDetailsViewModelImpl f11487c;

    public CaseDetailsViewModelImpl$loadCaseById$1(CaseDetailsViewModelImpl caseDetailsViewModelImpl) {
        this.f11487c = caseDetailsViewModelImpl;
    }

    /* renamed from: a */
    public final C5027n<BaseCase> apply(Pair<Profile, String> pair) {
        Intrinsics.checkParameterIsNotNull(pair, "<name for destructuring parameter 0>");
        Profile profile = (Profile) pair.component1();
        String str = (String) pair.component2();
        CaseRepository access$getCaseRepository$p = this.f11487c.f11463N;
        Intrinsics.checkExpressionValueIsNotNull(str, "caseId");
        return access$getCaseRepository$p.mo11668a(str, profile);
    }
}
