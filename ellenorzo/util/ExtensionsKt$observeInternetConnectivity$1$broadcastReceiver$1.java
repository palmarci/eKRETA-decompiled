package p289hu.ekreta.ellenorzo.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p300k.p313b.C5028o;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, mo17463d2 = {"hu/ekreta/ellenorzo/util/ExtensionsKt$observeInternetConnectivity$1$broadcastReceiver$1", "Landroid/content/BroadcastReceiver;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.ExtensionsKt$observeInternetConnectivity$1$broadcastReceiver$1 */
/* compiled from: Extensions.kt */
public final class ExtensionsKt$observeInternetConnectivity$1$broadcastReceiver$1 extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ C5028o f15349a;

    public ExtensionsKt$observeInternetConnectivity$1$broadcastReceiver$1(C5028o oVar) {
        this.f15349a = oVar;
    }

    public void onReceive(Context context, Intent intent) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        this.f15349a.mo17031a(Boolean.valueOf(!intent.getBooleanExtra("noConnectivity", false)));
    }
}
