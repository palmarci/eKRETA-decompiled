package hu.ekreta.ellenorzo.cases.detail;

import hu.ekreta.ellenorzo.cases.BaseCase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lhu/ekreta/ellenorzo/cases/BaseCase;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: CaseDetailsViewModelImpl.kt */
public final class CaseDetailsViewModelImpl$loadCaseById$5 extends Lambda implements Function1<BaseCase, Unit> {
    public final /* synthetic */ CaseDetailsViewModelImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CaseDetailsViewModelImpl$loadCaseById$5(CaseDetailsViewModelImpl caseDetailsViewModelImpl) {
        super(1);
        this.c = caseDetailsViewModelImpl;
    }

    public final void a(BaseCase baseCase) {
        this.c.a(baseCase);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((BaseCase) obj);
        return Unit.INSTANCE;
    }
}
