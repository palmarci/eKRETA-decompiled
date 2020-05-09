package p289hu.ekreta.ellenorzo.notification;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p300k.p313b.p315b0.C4675h;
import p353m.C5456h0;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/notification/SubscriptionForPushNotification;", "it", "Lokhttp3/ResponseBody;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.notification.NotificationRepositoryImpl$updateSubscription$1 */
/* compiled from: NotificationRepositoryImpl.kt */
public final class NotificationRepositoryImpl$updateSubscription$1<T, R> implements C4675h<T, R> {

    /* renamed from: c */
    public final /* synthetic */ SubscriptionForPushNotification f14244c;

    /* renamed from: e */
    public final /* synthetic */ String f14245e;

    public NotificationRepositoryImpl$updateSubscription$1(SubscriptionForPushNotification subscriptionForPushNotification, String str) {
        this.f14244c = subscriptionForPushNotification;
        this.f14245e = str;
    }

    /* renamed from: a */
    public final SubscriptionForPushNotification apply(C5456h0 h0Var) {
        Intrinsics.checkParameterIsNotNull(h0Var, "it");
        return SubscriptionForPushNotification.copy$default(this.f14244c, null, null, null, this.f14245e, 7, null);
    }
}
