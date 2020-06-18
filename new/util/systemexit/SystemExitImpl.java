package hu.ekreta.ellenorzo.util.systemexit;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lhu/ekreta/ellenorzo/util/systemexit/SystemExitImpl;", "Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;", "()V", "exit", "", "status", "", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: SystemExitImpl.kt */
public final class SystemExitImpl implements SystemExit {
    public void a(int i2) {
        Runtime.getRuntime().exit(0);
    }
}
