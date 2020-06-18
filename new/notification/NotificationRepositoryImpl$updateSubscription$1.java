package hu.ekreta.ellenorzo.notification;

import k.b.b0.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m.h0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/notification/SubscriptionForPushNotification;", "it", "Lokhttp3/ResponseBody;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: NotificationRepositoryImpl.kt */
public final class NotificationRepositoryImpl$updateSubscription$1<T, R> implements h<T, R> {
    public final /* synthetic */ SubscriptionForPushNotification c;
    public final /* synthetic */ String e;

    public NotificationRepositoryImpl$updateSubscription$1(SubscriptionForPushNotification subscriptionForPushNotification, String str) {
        this.c = subscriptionForPushNotification;
        this.e = str;
    }

    /* renamed from: a */
    public final SubscriptionForPushNotification apply(h0 h0Var) {
        Intrinsics.checkParameterIsNotNull(h0Var, "it");
        return SubscriptionForPushNotification.copy$default(this.c, (String) null, (NotificationMessageRole) null, (String) null, this.e, 7, (Object) null);
    }
}
