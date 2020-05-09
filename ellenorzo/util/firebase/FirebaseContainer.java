package p289hu.ekreta.ellenorzo.util.firebase;

import android.os.Bundle;
import com.google.firebase.perf.metrics.Trace;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p300k.p313b.C5036u;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000 \u001d2\u00020\u0001:\u0003\u001d\u001e\u001fJ\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H&J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0011H&J\u001c\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00112\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H&J \u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0011H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, mo17463d2 = {"Lhu/ekreta/ellenorzo/util/firebase/FirebaseContainer;", "", "analytics", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "getAnalytics", "()Lcom/google/firebase/analytics/FirebaseAnalytics;", "instanceId", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/firebase/iid/InstanceIdResult;", "getInstanceId", "()Lcom/google/android/gms/tasks/Task;", "performance", "Lcom/google/firebase/perf/FirebasePerformance;", "getPerformance", "()Lcom/google/firebase/perf/FirebasePerformance;", "getToken", "Lio/reactivex/Single;", "", "getTrace", "Lcom/google/firebase/perf/metrics/Trace;", "traceKey", "logEvent", "", "key", "bundle", "Landroid/os/Bundle;", "eventKey", "paramKey", "value", "Companion", "Event", "Param", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.firebase.FirebaseContainer */
/* compiled from: FirebaseContainer.kt */
public interface FirebaseContainer {
    public static final Companion Companion = Companion.f15409a;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\r"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/util/firebase/FirebaseContainer$Companion;", "", "()V", "initialized", "", "getInitialized", "()Z", "instance", "Lhu/ekreta/ellenorzo/util/firebase/FirebaseContainer;", "getInstance", "()Lhu/ekreta/ellenorzo/util/firebase/FirebaseContainer;", "setInstance", "(Lhu/ekreta/ellenorzo/util/firebase/FirebaseContainer;)V", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.util.firebase.FirebaseContainer$Companion */
    /* compiled from: FirebaseContainer.kt */
    public static final class Companion {

        /* renamed from: a */
        public static final /* synthetic */ Companion f15409a = new Companion();
        public static FirebaseContainer instance;

        /* renamed from: a */
        public final void mo16334a(FirebaseContainer firebaseContainer) {
            Intrinsics.checkParameterIsNotNull(firebaseContainer, "<set-?>");
            instance = firebaseContainer;
        }

        /* renamed from: b */
        public final FirebaseContainer mo16336b() {
            FirebaseContainer firebaseContainer = instance;
            if (firebaseContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("instance");
            }
            return firebaseContainer;
        }

        /* renamed from: a */
        public final boolean mo16335a() {
            return instance != null;
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.util.firebase.FirebaseContainer$DefaultImpls */
    /* compiled from: FirebaseContainer.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ void logEvent$default(FirebaseContainer firebaseContainer, String str, Bundle bundle, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    bundle = null;
                }
                firebaseContainer.mo16332a(str, bundle);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logEvent");
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/util/firebase/FirebaseContainer$Event;", "", "()V", "FCM_AUTH_FAIL", "", "FCM_AUTH_SUCCESS", "FCM_REGISTER_FAIL", "FCM_REGISTER_SUCCESS", "GMA_REGISTER_FAIL", "GMA_REGISTER_SUCCESS", "GMA_UNREGISTER_FAIL", "GMA_UNREGISTER_SUCCESS", "GMA_UPDATE_FAIL", "GMA_UPDATE_SUCCESS", "NOTIFICATION_OPEN", "NOTIFICATION_RECEIVE", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.util.firebase.FirebaseContainer$Event */
    /* compiled from: FirebaseContainer.kt */
    public static final class Event {
        public static final String FCM_AUTH_FAIL = "push_userDidRefuseToAuthorizeRemoteNotifications";
        public static final String FCM_AUTH_SUCCESS = "push_userDidAuthorizeRemoteNotifications";
        public static final String FCM_REGISTER_FAIL = "push_appDidFailToRegisterForRemoteNotifications";
        public static final String FCM_REGISTER_SUCCESS = "push_appDidRegisterForRemoteNotifications";
        public static final String GMA_REGISTER_FAIL = "push_appDidFailToRegisterProfileWithNotificationProvider";
        public static final String GMA_REGISTER_SUCCESS = "push_appDidRegisterProfileWithNotificationProvider";
        public static final String GMA_UNREGISTER_FAIL = "push_appDidFailToUnregisterProfileFromNotificationProvider";
        public static final String GMA_UNREGISTER_SUCCESS = "push_appDidUnregisterProfileFromhNotificationProvider";
        public static final String GMA_UPDATE_FAIL = "push_appDidFailToUpdateProfileRegistrationWithNotificationProvider";
        public static final String GMA_UPDATE_SUCCESS = "push_appDidUpdateProfileRegistrationWithNotificationProvider";
        public static final Event INSTANCE = new Event();
        public static final String NOTIFICATION_OPEN = "push_userDidOpenNotification";
        public static final String NOTIFICATION_RECEIVE = "push_deviceDidReceiveNotification";
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/util/firebase/FirebaseContainer$Param;", "", "()V", "PROFILE", "", "PUSH_TYPE", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.util.firebase.FirebaseContainer$Param */
    /* compiled from: FirebaseContainer.kt */
    public static final class Param {
        public static final Param INSTANCE = new Param();
        public static final String PROFILE = "profile";
        public static final String PUSH_TYPE = "push_type";
    }

    /* renamed from: a */
    Trace mo16330a(String str);

    /* renamed from: a */
    C5036u<String> mo16331a();

    /* renamed from: a */
    void mo16332a(String str, Bundle bundle);

    /* renamed from: a */
    void mo16333a(String str, String str2, String str3);
}
