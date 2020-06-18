package hu.ekreta.ellenorzo;

import a.e.a.e.b0;
import k.a.a.a.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import q.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014¨\u0006\u000b"}, d2 = {"hu/ekreta/ellenorzo/eKretaApp$onCreate$1", "Ltimber/log/Timber$Tree;", "log", "", "priority", "", "tag", "", "message", "throwable", "", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: eKretaApp.kt */
public final class eKretaApp$onCreate$1 extends a.b {
    public void a(int i2, String str, String str2, Throwable th) {
        Intrinsics.checkParameterIsNotNull(str2, "message");
        if (i2 != 2 && i2 != 3) {
            a.e.a.a.k();
            a.e.a.a.l().f89j.a(i2, str, str2);
            f.a().a(i2, a.b.a.a.a.a("", str), a.b.a.a.a.a("", str2), true);
            if (th != null) {
                a.e.a.a.k();
                b0 b0Var = a.e.a.a.l().f89j;
                if (!b0Var.t && b0.a("prior to logging exceptions.")) {
                    b0Var.f156o.a(Thread.currentThread(), th);
                }
            }
        }
    }
}
