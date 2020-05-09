package p289hu.ekreta.ellenorzo.notification;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.authentication.SupportedRole;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.rest.GlobalMobileApi;
import p289hu.ekreta.ellenorzo.rest.GlobalMobileApi.DefaultImpls;
import p289hu.ekreta.ellenorzo.rest.MobileApiV3Kt;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C4667b;
import p300k.p313b.C4991d;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p314a0.C4664d;
import p300k.p313b.p315b0.C4668a;
import p300k.p313b.p315b0.C4673f;
import p300k.p313b.p315b0.C4675h;
import p300k.p313b.p315b0.C4676i;
import p300k.p313b.p316c0.p318b.C4704b;
import p300k.p313b.p316c0.p321e.p326e.C4830i;
import p365o.p367b.C5620b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013H\u0016J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\tH\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J&\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\tH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R#\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\f8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, mo17463d2 = {"Lhu/ekreta/ellenorzo/notification/NotificationRepositoryImpl;", "Lhu/ekreta/ellenorzo/notification/NotificationRepository;", "globalMobileApi", "Lhu/ekreta/ellenorzo/rest/GlobalMobileApi;", "notificationDao", "Lhu/ekreta/ellenorzo/notification/NotificationDao;", "firebaseContainer", "Lhu/ekreta/ellenorzo/util/firebase/FirebaseContainer;", "apiKey", "", "(Lhu/ekreta/ellenorzo/rest/GlobalMobileApi;Lhu/ekreta/ellenorzo/notification/NotificationDao;Lhu/ekreta/ellenorzo/util/firebase/FirebaseContainer;Ljava/lang/String;)V", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "getAllSubscriptions", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/notification/SubscriptionForPushNotification;", "subscribe", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "token", "subscribeIfSubscriptionIsMissingOrObsolete", "unsubscribe", "Lio/reactivex/Completable;", "subscriptions", "", "unsubscribeIfSubscribed", "updateSubscription", "oldSubscription", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.notification.NotificationRepositoryImpl */
/* compiled from: NotificationRepositoryImpl.kt */
public final class NotificationRepositoryImpl implements NotificationRepository {

    /* renamed from: f */
    public static final /* synthetic */ KProperty[] f14215f = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(NotificationRepositoryImpl.class), "logger", "getLogger()Lorg/slf4j/Logger;"))};

    /* renamed from: a */
    public final Lazy f14216a = LazyKt__LazyJVMKt.lazy(NotificationRepositoryImpl$logger$2.INSTANCE);

    /* renamed from: b */
    public final GlobalMobileApi f14217b;

    /* renamed from: c */
    public final NotificationDao f14218c;

    /* renamed from: d */
    public final FirebaseContainer f14219d;

    /* renamed from: e */
    public final String f14220e;

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.notification.NotificationRepositoryImpl$WhenMappings */
    public final /* synthetic */ class WhenMappings {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14221a = new int[SupportedRole.values().length];

        static {
            f14221a[SupportedRole.Guardian.ordinal()] = 1;
        }
    }

    public NotificationRepositoryImpl(GlobalMobileApi globalMobileApi, NotificationDao notificationDao, FirebaseContainer firebaseContainer, String str) {
        Intrinsics.checkParameterIsNotNull(globalMobileApi, "globalMobileApi");
        Intrinsics.checkParameterIsNotNull(notificationDao, "notificationDao");
        Intrinsics.checkParameterIsNotNull(firebaseContainer, "firebaseContainer");
        Intrinsics.checkParameterIsNotNull(str, "apiKey");
        this.f14217b = globalMobileApi;
        this.f14218c = notificationDao;
        this.f14219d = firebaseContainer;
        this.f14220e = str;
    }

    public static final /* synthetic */ C5620b access$getLogger$p(NotificationRepositoryImpl notificationRepositoryImpl) {
        Lazy lazy = notificationRepositoryImpl.f14216a;
        KProperty kProperty = f14215f[0];
        return (C5620b) lazy.getValue();
    }

    /* renamed from: a */
    public C4667b mo13760a(Profile profile, Iterable<SubscriptionForPushNotification> iterable) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        Intrinsics.checkParameterIsNotNull(iterable, "subscriptions");
        Intrinsics.checkParameterIsNotNull(iterable, "$receiver");
        C5027n a = C5027n.m16886a(iterable);
        Intrinsics.checkExpressionValueIsNotNull(a, "Observable.fromIterable(this)");
        C4667b e = a.mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new NotificationRepositoryImpl$unsubscribe$1<Object,Object>(this, profile)).mo17241e();
        NotificationRepositoryImpl$unsubscribe$2 notificationRepositoryImpl$unsubscribe$2 = new NotificationRepositoryImpl$unsubscribe$2(this, profile);
        C4704b.m16116a(notificationRepositoryImpl$unsubscribe$2, "supplier is null");
        C4667b e2 = e.mo16976a((C5030q<T>) C4664d.m16039a((C5027n<T>) new C4830i<T>(notificationRepositoryImpl$unsubscribe$2))).mo17241e();
        Intrinsics.checkExpressionValueIsNotNull(e2, "subscriptions.toObservab…        .ignoreElements()");
        return e2;
    }

    /* renamed from: f */
    public C5027n<List<SubscriptionForPushNotification>> mo13757f() {
        return this.f14218c.mo16311a();
    }

    /* renamed from: s */
    public C5027n<SubscriptionForPushNotification> mo13758s(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        C5027n<SubscriptionForPushNotification> d = this.f14219d.mo16331a().mo17268d(new C4294xa6dede90(this, profile));
        Intrinsics.checkExpressionValueIsNotNull(d, "firebaseContainer\n      …          }\n            }");
        return d;
    }

    /* renamed from: u */
    public C4667b mo13759u(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        C4667b a = this.f14218c.mo16312a(profile.mo14054m()).mo17239d().mo17256a((C4676i<? super T>) NotificationRepositoryImpl$unsubscribeIfSubscribed$1.INSTANCE).mo17185a((C4675h<? super T, ? extends C4991d>) new NotificationRepositoryImpl$unsubscribeIfSubscribed$2<Object,Object>(this, profile));
        Intrinsics.checkExpressionValueIsNotNull(a, "notificationDao.getEleme…profile, subscriptions) }");
        return a;
    }

    /* renamed from: a */
    public C5027n<SubscriptionForPushNotification> mo13761a(Profile profile, String str) {
        NotificationMessageRole notificationMessageRole;
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        Intrinsics.checkParameterIsNotNull(str, "token");
        if (WhenMappings.f14221a[profile.mo14064v().ordinal()] != 1) {
            notificationMessageRole = NotificationMessageRole.STUDENT;
        } else {
            notificationMessageRole = NotificationMessageRole.GUARDIAN;
        }
        C5027n<SubscriptionForPushNotification> b = DefaultImpls.registerForPushNotifications$default(this.f14217b, MobileApiV3Kt.getAsAuthorizationHeader(profile.mo14042d()), str, notificationMessageRole.mo13749a(), C3984v.m10159a(profile), null, 0, null, 112, null).mo17246g(new NotificationRepositoryImpl$subscribe$1(profile, notificationMessageRole, str)).mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new NotificationRepositoryImpl$subscribe$2<Object,Object>(this, profile)).mo17223b((C4668a) new NotificationRepositoryImpl$subscribe$3(this, profile)).mo17224b((C4673f<? super Throwable>) new NotificationRepositoryImpl$subscribe$4<Object>(this, profile));
        Intrinsics.checkExpressionValueIsNotNull(b, "globalMobileApi.register…ofile\", it)\n            }");
        return b;
    }

    /* renamed from: a */
    public C5027n<SubscriptionForPushNotification> mo13756a(Profile profile, SubscriptionForPushNotification subscriptionForPushNotification, String str) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        Intrinsics.checkParameterIsNotNull(subscriptionForPushNotification, "oldSubscription");
        Intrinsics.checkParameterIsNotNull(str, "token");
        C5027n<SubscriptionForPushNotification> c = DefaultImpls.updateRegistrationForPushNotifications$default(this.f14217b, this.f14220e, subscriptionForPushNotification.mo13814b(), str, subscriptionForPushNotification.mo13812a().mo13749a(), C3984v.m10159a(profile), 0, null, 96, null).mo17246g(new NotificationRepositoryImpl$updateSubscription$1(subscriptionForPushNotification, str)).mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new NotificationRepositoryImpl$updateSubscription$2<Object,Object>(this, profile));
        Intrinsics.checkExpressionValueIsNotNull(c, "globalMobileApi.updateRe…          }\n            }");
        return c;
    }
}
