package hu.ekreta.ellenorzo.util;

import android.content.Context;
import android.content.IntentFilter;
import k.b.a0.c;
import k.b.b0.a;
import k.b.c0.b.b;
import k.b.c0.e.e.h;
import k.b.o;
import k.b.p;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/ObservableEmitter;", "", "kotlin.jvm.PlatformType", "subscribe"}, k = 3, mv = {1, 1, 15})
/* compiled from: Extensions.kt */
public final class ExtensionsKt$observeInternetConnectivity$1<T> implements p<T> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f6289a;

    public final void a(o<Boolean> oVar) {
        Intrinsics.checkParameterIsNotNull(oVar, "emitter");
        final ExtensionsKt$observeInternetConnectivity$1$broadcastReceiver$1 extensionsKt$observeInternetConnectivity$1$broadcastReceiver$1 = new ExtensionsKt$observeInternetConnectivity$1$broadcastReceiver$1(oVar);
        this.f6289a.registerReceiver(extensionsKt$observeInternetConnectivity$1$broadcastReceiver$1, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        AnonymousClass1 r1 = new a(this) {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ExtensionsKt$observeInternetConnectivity$1 f6290a;

            {
                this.f6290a = r1;
            }

            public final void run() {
                this.f6290a.f6289a.unregisterReceiver(extensionsKt$observeInternetConnectivity$1$broadcastReceiver$1);
            }
        };
        b.a(r1, "run is null");
        ((h.a) oVar).a((c) new k.b.a0.a(r1));
    }
}
