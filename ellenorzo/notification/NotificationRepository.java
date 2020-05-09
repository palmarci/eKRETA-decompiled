package p289hu.ekreta.ellenorzo.notification;

import java.util.List;
import kotlin.Metadata;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.util.Repository;
import p300k.p313b.C4667b;
import p300k.p313b.C5027n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0014\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0004H&J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH&J\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\bH&J&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u0013"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/notification/NotificationRepository;", "Lhu/ekreta/ellenorzo/util/Repository;", "Lhu/ekreta/ellenorzo/notification/SubscriptionForPushNotification;", "getAllSubscriptions", "Lio/reactivex/Observable;", "", "subscribe", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "token", "", "subscribeIfSubscriptionIsMissingOrObsolete", "unsubscribe", "Lio/reactivex/Completable;", "subscriptions", "", "unsubscribeIfSubscribed", "updateSubscription", "oldSubscription", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.notification.NotificationRepository */
/* compiled from: NotificationRepository.kt */
public interface NotificationRepository extends Repository<SubscriptionForPushNotification> {
    /* renamed from: a */
    C5027n<SubscriptionForPushNotification> mo13756a(Profile profile, SubscriptionForPushNotification subscriptionForPushNotification, String str);

    /* renamed from: f */
    C5027n<List<SubscriptionForPushNotification>> mo13757f();

    /* renamed from: s */
    C5027n<SubscriptionForPushNotification> mo13758s(Profile profile);

    /* renamed from: u */
    C4667b mo13759u(Profile profile);
}
