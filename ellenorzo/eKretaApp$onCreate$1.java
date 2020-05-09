package p289hu.ekreta.ellenorzo;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p000a.p029e.p030a.C0094a;
import p000a.p029e.p030a.p033e.C0142b0;
import p300k.p301a.p302a.p303a.C4537f;
import p386q.p387a.C5834a.C5836b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014¨\u0006\u000b"}, mo17463d2 = {"hu/ekreta/ellenorzo/eKretaApp$onCreate$1", "Ltimber/log/Timber$Tree;", "log", "", "priority", "", "tag", "", "message", "throwable", "", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.eKretaApp$onCreate$1 */
/* compiled from: eKretaApp.kt */
public final class eKretaApp$onCreate$1 extends C5836b {
    /* renamed from: a */
    public void mo12582a(int i, String str, String str2, Throwable th) {
        Intrinsics.checkParameterIsNotNull(str2, "message");
        if (i != 2 && i != 3) {
            C0094a.m146k();
            C0094a.m147l().f200j.mo200a(i, str, str2);
            String str3 = "";
            C4537f.m15806a().mo16788a(i, C0082a.m102a(str3, str), C0082a.m102a(str3, str2), true);
            if (th != null) {
                C0094a.m146k();
                C0142b0 b0Var = C0094a.m147l().f200j;
                if (!b0Var.f335t && C0142b0.m225a("prior to logging exceptions.")) {
                    b0Var.f330o.mo278a(Thread.currentThread(), th);
                }
            }
        }
    }
}
