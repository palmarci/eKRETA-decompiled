package p289hu.ekreta.ellenorzo.cases;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/cases/BaseCase;", "cases", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.CaseRepositoryImpl$fetchCasesByProfile$2 */
/* compiled from: CaseRepositoryImpl.kt */
public final class CaseRepositoryImpl$fetchCasesByProfile$2<T, R> implements C4675h<T, C5030q<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ CaseRepositoryImpl f11324c;

    /* renamed from: e */
    public final /* synthetic */ Profile f11325e;

    public CaseRepositoryImpl$fetchCasesByProfile$2(CaseRepositoryImpl caseRepositoryImpl, Profile profile) {
        this.f11324c = caseRepositoryImpl;
        this.f11325e = profile;
    }

    /* renamed from: a */
    public final C5027n<List<BaseCase>> apply(List<? extends BaseCase> list) {
        Intrinsics.checkParameterIsNotNull(list, "cases");
        return this.f11324c.mo11671a().mo13307a(this.f11325e.mo14054m(), list);
    }
}
