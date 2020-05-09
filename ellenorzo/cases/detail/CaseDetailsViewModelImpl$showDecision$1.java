package p289hu.ekreta.ellenorzo.cases.detail;

import android.app.Activity;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p289hu.ekreta.ellenorzo.cases.subModels.Decision;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, mo17463d2 = {"<anonymous>", "Landroid/content/Intent;", "Landroid/app/Activity;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.detail.CaseDetailsViewModelImpl$showDecision$1 */
/* compiled from: CaseDetailsViewModelImpl.kt */
public final class CaseDetailsViewModelImpl$showDecision$1 extends Lambda implements Function1<Activity, Intent> {

    /* renamed from: c */
    public final /* synthetic */ CaseDetailsViewModelImpl f11497c;

    /* renamed from: e */
    public final /* synthetic */ Decision f11498e;

    public CaseDetailsViewModelImpl$showDecision$1(CaseDetailsViewModelImpl caseDetailsViewModelImpl, Decision decision) {
        this.f11497c = caseDetailsViewModelImpl;
        this.f11498e = decision;
        super(1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        if (r0 != null) goto L_0x0023;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.Intent invoke(android.app.Activity r9) {
        /*
            r8 = this;
            java.lang.String r0 = "$receiver"
            java.lang.Class<hu.ekreta.ellenorzo.cases.decision.DecisionDetailActivity> r1 = p289hu.ekreta.ellenorzo.cases.decision.DecisionDetailActivity.class
            android.content.Intent r9 = p000a.p020b.p021a.p022a.C0082a.m88a(r9, r0, r9, r1)
            hu.ekreta.ellenorzo.cases.decision.CaseDetailParameter r7 = new hu.ekreta.ellenorzo.cases.decision.CaseDetailParameter
            hu.ekreta.ellenorzo.cases.subModels.Decision r1 = r8.f11498e
            hu.ekreta.ellenorzo.cases.detail.CaseDetailsViewModelImpl r0 = r8.f11497c
            java.lang.String r2 = r0.mo11803o()
            hu.ekreta.ellenorzo.cases.detail.CaseDetailsViewModelImpl r0 = r8.f11497c
            hu.ekreta.ellenorzo.cases.BaseCase r0 = r0.mo11794T()
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = r0.mo11585l()
            if (r0 == 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            java.lang.String r0 = ""
        L_0x0023:
            r3 = r0
            hu.ekreta.ellenorzo.cases.detail.CaseDetailsViewModelImpl r0 = r8.f11497c
            java.lang.String r4 = r0.mo11805r()
            hu.ekreta.ellenorzo.cases.detail.CaseDetailsViewModelImpl r0 = r8.f11497c
            int r5 = r0.f11458I
            hu.ekreta.ellenorzo.cases.detail.CaseDetailsViewModelImpl r0 = r8.f11497c
            hu.ekreta.ellenorzo.cases.BaseCase r0 = r0.mo11794T()
            if (r0 == 0) goto L_0x003d
            hu.ekreta.ellenorzo.cases.subModels.State$StateType r0 = r0.mo11590q()
            goto L_0x003e
        L_0x003d:
            r0 = 0
        L_0x003e:
            r6 = r0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            p289hu.ekreta.ellenorzo.util.ExtensionsKt.m14638a(r9, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.cases.detail.CaseDetailsViewModelImpl$showDecision$1.invoke(android.app.Activity):android.content.Intent");
    }
}
