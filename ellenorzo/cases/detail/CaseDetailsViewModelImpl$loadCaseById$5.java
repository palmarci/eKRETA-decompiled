package p289hu.ekreta.ellenorzo.cases.detail;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p289hu.ekreta.ellenorzo.cases.BaseCase;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "", "it", "Lhu/ekreta/ellenorzo/cases/BaseCase;", "kotlin.jvm.PlatformType", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.detail.CaseDetailsViewModelImpl$loadCaseById$5 */
/* compiled from: CaseDetailsViewModelImpl.kt */
public final class CaseDetailsViewModelImpl$loadCaseById$5 extends Lambda implements Function1<BaseCase, Unit> {

    /* renamed from: c */
    public final /* synthetic */ CaseDetailsViewModelImpl f11491c;

    public CaseDetailsViewModelImpl$loadCaseById$5(CaseDetailsViewModelImpl caseDetailsViewModelImpl) {
        this.f11491c = caseDetailsViewModelImpl;
        super(1);
    }

    /* renamed from: a */
    public final void mo11845a(BaseCase baseCase) {
        this.f11491c.mo11796a(baseCase);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo11845a((BaseCase) obj);
        return Unit.INSTANCE;
    }
}
