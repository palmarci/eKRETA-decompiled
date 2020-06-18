package hu.ekreta.ellenorzo.notification;

import h.w.v;
import hu.ekreta.ellenorzo.authentication.SupportedRole;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.rest.GlobalMobileApi;
import hu.ekreta.ellenorzo.rest.MobileApiV3Kt;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import java.util.List;
import k.b.a0.d;
import k.b.b0.a;
import k.b.b0.f;
import k.b.b0.h;
import k.b.c0.e.e.i;
import k.b.n;
import k.b.q;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import o.b.b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013H\u0016J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\tH\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J&\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\tH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R#\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\f8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lhu/ekreta/ellenorzo/notification/NotificationRepositoryImpl;", "Lhu/ekreta/ellenorzo/notification/NotificationRepository;", "globalMobileApi", "Lhu/ekreta/ellenorzo/rest/GlobalMobileApi;", "notificationDao", "Lhu/ekreta/ellenorzo/notification/NotificationDao;", "firebaseContainer", "Lhu/ekreta/ellenorzo/util/firebase/FirebaseContainer;", "apiKey", "", "(Lhu/ekreta/ellenorzo/rest/GlobalMobileApi;Lhu/ekreta/ellenorzo/notification/NotificationDao;Lhu/ekreta/ellenorzo/util/firebase/FirebaseContainer;Ljava/lang/String;)V", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "getAllSubscriptions", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/notification/SubscriptionForPushNotification;", "subscribe", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "token", "subscribeIfSubscriptionIsMissingOrObsolete", "unsubscribe", "Lio/reactivex/Completable;", "subscriptions", "", "unsubscribeIfSubscribed", "updateSubscription", "oldSubscription", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: NotificationRepositoryImpl.kt */
public final class NotificationRepositoryImpl implements NotificationRepository {
    public static final /* synthetic */ KProperty[] f = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(NotificationRepositoryImpl.class), "logger", "getLogger()Lorg/slf4j/Logger;"))};

    /* renamed from: a  reason: collision with root package name */
    public final Lazy f5914a = LazyKt__LazyJVMKt.lazy(NotificationRepositoryImpl$logger$2.INSTANCE);
    public final GlobalMobileApi b;
    public final NotificationDao c;

    /* renamed from: d  reason: collision with root package name */
    public final FirebaseContainer f5915d;
    public final String e;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5916a = new int[SupportedRole.values().length];

        static {
            f5916a[SupportedRole.Guardian.ordinal()] = 1;
        }
    }

    public NotificationRepositoryImpl(GlobalMobileApi globalMobileApi, NotificationDao notificationDao, FirebaseContainer firebaseContainer, String str) {
        Intrinsics.checkParameterIsNotNull(globalMobileApi, "globalMobileApi");
        Intrinsics.checkParameterIsNotNull(notificationDao, "notificationDao");
        Intrinsics.checkParameterIsNotNull(firebaseContainer, "firebaseContainer");
        Intrinsics.checkParameterIsNotNull(str, "apiKey");
        this.b = globalMobileApi;
        this.c = notificationDao;
        this.f5915d = firebaseContainer;
        this.e = str;
    }

    public static final /* synthetic */ b access$getLogger$p(NotificationRepositoryImpl notificationRepositoryImpl) {
        Lazy lazy = notificationRepositoryImpl.f5914a;
        KProperty kProperty = f[0];
        return (b) lazy.getValue();
    }

    public k.b.b a(Profile profile, Iterable<SubscriptionForPushNotification> iterable) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        Intrinsics.checkParameterIsNotNull(iterable, "subscriptions");
        Intrinsics.checkParameterIsNotNull(iterable, "$receiver");
        n<SubscriptionForPushNotification> a2 = n.a(iterable);
        Intrinsics.checkExpressionValueIsNotNull(a2, "Observable.fromIterable(this)");
        k.b.b e2 = a2.c((h<? super SubscriptionForPushNotification, ? extends q<? extends R>>) new NotificationRepositoryImpl$unsubscribe$1(this, profile)).e();
        NotificationRepositoryImpl$unsubscribe$2 notificationRepositoryImpl$unsubscribe$2 = new NotificationRepositoryImpl$unsubscribe$2(this, profile);
        k.b.c0.b.b.a(notificationRepositoryImpl$unsubscribe$2, "supplier is null");
        k.b.b e3 = e2.a(d.a(new i(notificationRepositoryImpl$unsubscribe$2))).e();
        Intrinsics.checkExpressionValueIsNotNull(e3, "subscriptions.toObservab…        .ignoreElements()");
        return e3;
    }

    public n<List<SubscriptionForPushNotification>> f() {
        return this.c.a();
    }

    public n<SubscriptionForPushNotification> s(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        n<R> d2 = this.f5915d.a().d(new NotificationRepositoryImpl$subscribeIfSubscriptionIsMissingOrObsolete$1(this, profile));
        Intrinsics.checkExpressionValueIsNotNull(d2, "firebaseContainer\n      …          }\n            }");
        return d2;
    }

    public k.b.b u(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        k.b.b a2 = this.c.a(profile.m()).d().a(NotificationRepositoryImpl$unsubscribeIfSubscribed$1.INSTANCE).a(new NotificationRepositoryImpl$unsubscribeIfSubscribed$2(this, profile));
        Intrinsics.checkExpressionValueIsNotNull(a2, "notificationDao.getEleme…profile, subscriptions) }");
        return a2;
    }

    public n<SubscriptionForPushNotification> a(Profile profile, String str) {
        NotificationMessageRole notificationMessageRole;
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        Intrinsics.checkParameterIsNotNull(str, "token");
        if (WhenMappings.f5916a[profile.v().ordinal()] != 1) {
            notificationMessageRole = NotificationMessageRole.STUDENT;
        } else {
            notificationMessageRole = NotificationMessageRole.GUARDIAN;
        }
        n<SubscriptionForPushNotification> b2 = GlobalMobileApi.DefaultImpls.registerForPushNotifications$default(this.b, MobileApiV3Kt.getAsAuthorizationHeader(profile.d()), str, notificationMessageRole.a(), v.a(profile), (String) null, 0, (String) null, 112, (Object) null).g(new NotificationRepositoryImpl$subscribe$1(profile, notificationMessageRole, str)).c(new NotificationRepositoryImpl$subscribe$2(this, profile)).b((a) new NotificationRepositoryImpl$subscribe$3(this, profile)).b((f<? super Throwable>) new NotificationRepositoryImpl$subscribe$4(this, profile));
        Intrinsics.checkExpressionValueIsNotNull(b2, "globalMobileApi.register…ofile\", it)\n            }");
        return b2;
    }

    public n<SubscriptionForPushNotification> a(Profile profile, SubscriptionForPushNotification subscriptionForPushNotification, String str) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        Intrinsics.checkParameterIsNotNull(subscriptionForPushNotification, "oldSubscription");
        Intrinsics.checkParameterIsNotNull(str, "token");
        n<SubscriptionForPushNotification> c2 = GlobalMobileApi.DefaultImpls.updateRegistrationForPushNotifications$default(this.b, this.e, subscriptionForPushNotification.b(), str, subscriptionForPushNotification.a().a(), v.a(profile), 0, (String) null, 96, (Object) null).g(new NotificationRepositoryImpl$updateSubscription$1(subscriptionForPushNotification, str)).c(new NotificationRepositoryImpl$updateSubscription$2(this, profile));
        Intrinsics.checkExpressionValueIsNotNull(c2, "globalMobileApi.updateRe…          }\n            }");
        return c2;
    }
}
