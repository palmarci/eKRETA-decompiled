package p289hu.ekreta.ellenorzo.notification;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000a.p020b.p021a.p022a.C0082a;
import p365o.p367b.C5620b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "", "it", "", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.notification.NotificationStrategyImpl$createNotification$2 */
/* compiled from: NotificationStrategyImpl.kt */
public final class NotificationStrategyImpl$createNotification$2 extends Lambda implements Function1<Throwable, Unit> {

    /* renamed from: c */
    public final /* synthetic */ NotificationStrategyImpl f14272c;

    /* renamed from: e */
    public final /* synthetic */ PushMessage f14273e;

    public NotificationStrategyImpl$createNotification$2(NotificationStrategyImpl notificationStrategyImpl, PushMessage pushMessage) {
        this.f14272c = notificationStrategyImpl;
        this.f14273e = pushMessage;
        super(1);
    }

    /* renamed from: a */
    public final void mo13795a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "it");
        C5620b access$getLogger$p = NotificationStrategyImpl.access$getLogger$p(this.f14272c);
        StringBuilder a = C0082a.m111a("Failed to get profile for ");
        a.append(this.f14273e);
        access$getLogger$p.mo118d(a.toString(), th);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo13795a((Throwable) obj);
        return Unit.INSTANCE;
    }
}