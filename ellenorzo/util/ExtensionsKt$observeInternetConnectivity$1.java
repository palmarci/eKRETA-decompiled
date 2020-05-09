package p289hu.ekreta.ellenorzo.util;

import android.content.Context;
import android.content.IntentFilter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p300k.p313b.C5028o;
import p300k.p313b.C5029p;
import p300k.p313b.p314a0.C4661a;
import p300k.p313b.p314a0.C4663c;
import p300k.p313b.p315b0.C4668a;
import p300k.p313b.p316c0.p318b.C4704b;
import p300k.p313b.p316c0.p321e.p326e.C4827h.C4828a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, mo17463d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/ObservableEmitter;", "", "kotlin.jvm.PlatformType", "subscribe"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.ExtensionsKt$observeInternetConnectivity$1 */
/* compiled from: Extensions.kt */
public final class ExtensionsKt$observeInternetConnectivity$1<T> implements C5029p<T> {

    /* renamed from: a */
    public final /* synthetic */ Context f15346a;

    /* renamed from: a */
    public final void mo12747a(C5028o<Boolean> oVar) {
        Intrinsics.checkParameterIsNotNull(oVar, "emitter");
        final ExtensionsKt$observeInternetConnectivity$1$broadcastReceiver$1 extensionsKt$observeInternetConnectivity$1$broadcastReceiver$1 = new ExtensionsKt$observeInternetConnectivity$1$broadcastReceiver$1(oVar);
        this.f15346a.registerReceiver(extensionsKt$observeInternetConnectivity$1$broadcastReceiver$1, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        C44271 r1 = new C4668a(this) {

            /* renamed from: a */
            public final /* synthetic */ ExtensionsKt$observeInternetConnectivity$1 f15347a;

            {
                this.f15347a = r1;
            }

            public final void run() {
                this.f15347a.f15346a.unregisterReceiver(extensionsKt$observeInternetConnectivity$1$broadcastReceiver$1);
            }
        };
        C4704b.m16116a(r1, "run is null");
        ((C4828a) oVar).mo17069a((C4663c) new C4661a(r1));
    }
}
