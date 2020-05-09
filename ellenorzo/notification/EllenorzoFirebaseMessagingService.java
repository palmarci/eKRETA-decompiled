package p289hu.ekreta.ellenorzo.notification;

import android.app.Application;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p000a.p054h.p133b.p150n.C2306b;
import p211h.p282w.C3984v;
import p292i.p293c.C4448a;
import p292i.p293c.C4456g;
import p365o.p367b.C5620b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R#\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048FX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/notification/EllenorzoFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "()V", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "notificationStrategy", "Lhu/ekreta/ellenorzo/notification/NotificationStrategy;", "getNotificationStrategy", "()Lhu/ekreta/ellenorzo/notification/NotificationStrategy;", "setNotificationStrategy", "(Lhu/ekreta/ellenorzo/notification/NotificationStrategy;)V", "onCreate", "", "onMessageReceived", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "onNewToken", "token", "", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.notification.EllenorzoFirebaseMessagingService */
/* compiled from: EllenorzoFirebaseMessagingService.kt */
public final class EllenorzoFirebaseMessagingService extends FirebaseMessagingService {

    /* renamed from: l */
    public static final /* synthetic */ KProperty[] f14196l = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(EllenorzoFirebaseMessagingService.class), "logger", "getLogger()Lorg/slf4j/Logger;"))};

    /* renamed from: j */
    public final Lazy f14197j = LazyKt__LazyJVMKt.lazy(EllenorzoFirebaseMessagingService$logger$2.INSTANCE);

    /* renamed from: k */
    public NotificationStrategy f14198k;

    /* renamed from: a */
    public void mo8299a(C2306b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "remoteMessage");
        super.mo8299a(bVar);
        try {
            NotificationStrategy notificationStrategy = this.f14198k;
            if (notificationStrategy == null) {
                Intrinsics.throwUninitializedPropertyAccessException("notificationStrategy");
            }
            Map o = bVar.mo4369o();
            Intrinsics.checkExpressionValueIsNotNull(o, "remoteMessage.data");
            notificationStrategy.mo13790a(o);
        } catch (Exception e) {
            C5620b d = mo13741d();
            StringBuilder sb = new StringBuilder();
            sb.append("Exception occurred in parsing PushMessage. ");
            sb.append(e);
            sb.append(".message");
            d.mo118d(sb.toString(), e);
        }
    }

    /* renamed from: d */
    public final C5620b mo13741d() {
        Lazy lazy = this.f14197j;
        KProperty kProperty = f14196l[0];
        return (C5620b) lazy.getValue();
    }

    public void onCreate() {
        C3984v.m10272b(this, "service");
        Application application = getApplication();
        if (application instanceof C4456g) {
            C4448a serviceInjector = ((C4456g) application).serviceInjector();
            C3984v.m10174a(serviceInjector, "%s.serviceInjector() returned null", (Object) application.getClass());
            serviceInjector.inject(this);
            super.onCreate();
            return;
        }
        throw new RuntimeException(String.format("%s does not implement %s", new Object[]{application.getClass().getCanonicalName(), C4456g.class.getCanonicalName()}));
    }

    /* renamed from: a */
    public void mo8300a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        NotificationStrategy notificationStrategy = this.f14198k;
        if (notificationStrategy == null) {
            Intrinsics.throwUninitializedPropertyAccessException("notificationStrategy");
        }
        notificationStrategy.mo13789a(str);
    }
}
