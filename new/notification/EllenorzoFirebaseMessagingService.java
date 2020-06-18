package hu.ekreta.ellenorzo.notification;

import a.h.b.n.b;
import android.app.Application;
import android.app.Service;
import com.google.firebase.messaging.FirebaseMessagingService;
import h.w.v;
import i.c.a;
import i.c.g;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R#\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048FX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lhu/ekreta/ellenorzo/notification/EllenorzoFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "()V", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "notificationStrategy", "Lhu/ekreta/ellenorzo/notification/NotificationStrategy;", "getNotificationStrategy", "()Lhu/ekreta/ellenorzo/notification/NotificationStrategy;", "setNotificationStrategy", "(Lhu/ekreta/ellenorzo/notification/NotificationStrategy;)V", "onCreate", "", "onMessageReceived", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "onNewToken", "token", "", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: EllenorzoFirebaseMessagingService.kt */
public final class EllenorzoFirebaseMessagingService extends FirebaseMessagingService {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f5907l = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(EllenorzoFirebaseMessagingService.class), "logger", "getLogger()Lorg/slf4j/Logger;"))};

    /* renamed from: j  reason: collision with root package name */
    public final Lazy f5908j = LazyKt__LazyJVMKt.lazy(EllenorzoFirebaseMessagingService$logger$2.INSTANCE);

    /* renamed from: k  reason: collision with root package name */
    public NotificationStrategy f5909k;

    public void a(b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "remoteMessage");
        super.a(bVar);
        try {
            NotificationStrategy notificationStrategy = this.f5909k;
            if (notificationStrategy == null) {
                Intrinsics.throwUninitializedPropertyAccessException("notificationStrategy");
            }
            Map<String, String> n2 = bVar.n();
            Intrinsics.checkExpressionValueIsNotNull(n2, "remoteMessage.data");
            notificationStrategy.a(n2);
        } catch (Exception e) {
            o.b.b d2 = d();
            d2.c("Exception occurred in parsing PushMessage. " + e + ".message", e);
        }
    }

    public final o.b.b d() {
        Lazy lazy = this.f5908j;
        KProperty kProperty = f5907l[0];
        return (o.b.b) lazy.getValue();
    }

    public void onCreate() {
        v.b(this, "service");
        Application application = getApplication();
        if (application instanceof g) {
            a<Service> serviceInjector = ((g) application).serviceInjector();
            v.a(serviceInjector, "%s.serviceInjector() returned null", (Object) application.getClass());
            serviceInjector.inject(this);
            super.onCreate();
            return;
        }
        throw new RuntimeException(String.format("%s does not implement %s", new Object[]{application.getClass().getCanonicalName(), g.class.getCanonicalName()}));
    }

    public void a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        NotificationStrategy notificationStrategy = this.f5909k;
        if (notificationStrategy == null) {
            Intrinsics.throwUninitializedPropertyAccessException("notificationStrategy");
        }
        notificationStrategy.a(str);
    }
}
