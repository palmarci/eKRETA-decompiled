package hu.ekreta.ellenorzo.cases.detail;

import a.b.a.a.a;
import android.app.Activity;
import android.content.Intent;
import hu.ekreta.ellenorzo.cases.BaseCase;
import hu.ekreta.ellenorzo.cases.decision.CaseDetailParameter;
import hu.ekreta.ellenorzo.cases.decision.DecisionDetailActivity;
import hu.ekreta.ellenorzo.cases.subModels.Decision;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/content/Intent;", "Landroid/app/Activity;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: CaseDetailsViewModelImpl.kt */
public final class CaseDetailsViewModelImpl$showDecision$1 extends Lambda implements Function1<Activity, Intent> {
    public final /* synthetic */ CaseDetailsViewModelImpl c;
    public final /* synthetic */ Decision e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CaseDetailsViewModelImpl$showDecision$1(CaseDetailsViewModelImpl caseDetailsViewModelImpl, Decision decision) {
        super(1);
        this.c = caseDetailsViewModelImpl;
        this.e = decision;
    }

    /* renamed from: a */
    public final Intent invoke(Activity activity) {
        String str;
        Intent a2 = a.a(activity, "$receiver", activity, DecisionDetailActivity.class);
        Decision decision = this.e;
        String o2 = this.c.o();
        BaseCase T = this.c.T();
        if (T == null || (str = T.l()) == null) {
            str = "";
        }
        String str2 = str;
        String r = this.c.r();
        int access$getDecisionCount$p = this.c.J;
        BaseCase T2 = this.c.T();
        ExtensionsKt.a(a2, new CaseDetailParameter(decision, o2, str2, r, access$getDecisionCount$p, T2 != null ? T2.q() : null));
        return a2;
    }
}
