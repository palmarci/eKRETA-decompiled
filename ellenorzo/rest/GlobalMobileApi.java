package p289hu.ekreta.ellenorzo.rest;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p000a.p054h.p159c.p166z.C2580c;
import p289hu.ekreta.ellenorzo.institute.Institute;
import p289hu.ekreta.ellenorzo.notification.NotificationEnvironment;
import p289hu.ekreta.ellenorzo.notification.NotificationMessageType;
import p300k.p313b.C5027n;
import p353m.C5456h0;
import p380p.p385t.C5812b;
import p380p.p385t.C5816f;
import p380p.p385t.C5819i;
import p380p.p385t.C5824n;
import p380p.p385t.C5825o;
import p380p.p385t.C5829s;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0001\u0017J@\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\f\u001a\u00020\u0006H'J\u001e\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'JT\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\u0015\u001a\u00020\u00062\b\b\u0003\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\f\u001a\u00020\u0006H'JT\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\f\u001a\u00020\u0006H'¨\u0006\u0018"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/GlobalMobileApi;", "", "deregisterFromPushNotifications", "Lio/reactivex/Observable;", "Lokhttp3/ResponseBody;", "apiKey", "", "registrationId", "notificationEnvironment", "Lhu/ekreta/ellenorzo/notification/NotificationEnvironment;", "notificationType", "", "notificationSource", "getInstitutes", "", "Lhu/ekreta/ellenorzo/institute/Institute;", "registerForPushNotifications", "Lhu/ekreta/ellenorzo/rest/GlobalMobileApi$PushNotificationResponse;", "authorizationHeader", "firebaseToken", "role", "platform", "updateRegistrationForPushNotifications", "PushNotificationResponse", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.rest.GlobalMobileApi */
/* compiled from: GlobalMobileApi.kt */
public interface GlobalMobileApi {

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.rest.GlobalMobileApi$DefaultImpls */
    /* compiled from: GlobalMobileApi.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ C5027n deregisterFromPushNotifications$default(GlobalMobileApi globalMobileApi, String str, String str2, NotificationEnvironment notificationEnvironment, int i, String str3, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 8) != 0) {
                    i = NotificationMessageType.ALL.mo13754b();
                }
                int i3 = i;
                if ((i2 & 16) != 0) {
                    str3 = "Kreta";
                }
                return globalMobileApi.deregisterFromPushNotifications(str, str2, notificationEnvironment, i3, str3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deregisterFromPushNotifications");
        }

        public static /* synthetic */ C5027n registerForPushNotifications$default(GlobalMobileApi globalMobileApi, String str, String str2, int i, NotificationEnvironment notificationEnvironment, String str3, int i2, String str4, int i3, Object obj) {
            if (obj == null) {
                return globalMobileApi.registerForPushNotifications(str, str2, i, notificationEnvironment, (i3 & 16) != 0 ? "gcm" : str3, (i3 & 32) != 0 ? NotificationMessageType.ALL.mo13754b() : i2, (i3 & 64) != 0 ? "Kreta" : str4);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: registerForPushNotifications");
        }

        public static /* synthetic */ C5027n updateRegistrationForPushNotifications$default(GlobalMobileApi globalMobileApi, String str, String str2, String str3, int i, NotificationEnvironment notificationEnvironment, int i2, String str4, int i3, Object obj) {
            if (obj == null) {
                return globalMobileApi.updateRegistrationForPushNotifications(str, str2, str3, i, notificationEnvironment, (i3 & 32) != 0 ? NotificationMessageType.ALL.mo13754b() : i2, (i3 & 64) != 0 ? "Kreta" : str4);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateRegistrationForPushNotifications");
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/GlobalMobileApi$PushNotificationResponse;", "", "registrationID", "", "(Ljava/lang/String;)V", "getRegistrationID", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.rest.GlobalMobileApi$PushNotificationResponse */
    /* compiled from: GlobalMobileApi.kt */
    public static final class PushNotificationResponse {
        @C2580c("registrationId")
        public final String registrationID;

        public PushNotificationResponse(String str) {
            Intrinsics.checkParameterIsNotNull(str, "registrationID");
            this.registrationID = str;
        }

        public static /* synthetic */ PushNotificationResponse copy$default(PushNotificationResponse pushNotificationResponse, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = pushNotificationResponse.registrationID;
            }
            return pushNotificationResponse.copy(str);
        }

        public final String component1() {
            return this.registrationID;
        }

        public final PushNotificationResponse copy(String str) {
            Intrinsics.checkParameterIsNotNull(str, "registrationID");
            return new PushNotificationResponse(str);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.registrationID, (java.lang.Object) ((p289hu.ekreta.ellenorzo.rest.GlobalMobileApi.PushNotificationResponse) r2).registrationID) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof p289hu.ekreta.ellenorzo.rest.GlobalMobileApi.PushNotificationResponse
                if (r0 == 0) goto L_0x0013
                hu.ekreta.ellenorzo.rest.GlobalMobileApi$PushNotificationResponse r2 = (p289hu.ekreta.ellenorzo.rest.GlobalMobileApi.PushNotificationResponse) r2
                java.lang.String r0 = r1.registrationID
                java.lang.String r2 = r2.registrationID
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                if (r2 == 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.GlobalMobileApi.PushNotificationResponse.equals(java.lang.Object):boolean");
        }

        public final String getRegistrationID() {
            return this.registrationID;
        }

        public int hashCode() {
            String str = this.registrationID;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return C0082a.m106a(C0082a.m111a("PushNotificationResponse(registrationID="), this.registrationID, ")");
        }
    }

    @C5812b("Registration")
    C5027n<C5456h0> deregisterFromPushNotifications(@C5819i("apiKey") String str, @C5829s("RegistrationId") String str2, @C5829s("NotificationEnvironment") NotificationEnvironment notificationEnvironment, @C5829s("NotificationType") int i, @C5829s("NotificationSource") String str3);

    @C5816f("Institute")
    C5027n<List<Institute>> getInstitutes(@C5819i("apiKey") String str);

    @C5824n("Registration")
    C5027n<PushNotificationResponse> registerForPushNotifications(@C5819i("Authorization") String str, @C5829s("Handle") String str2, @C5829s("NotificationRole") int i, @C5829s("NotificationEnvironment") NotificationEnvironment notificationEnvironment, @C5829s("Platform") String str3, @C5829s("NotificationType") int i2, @C5829s("NotificationSource") String str4);

    @C5825o("Registration")
    C5027n<C5456h0> updateRegistrationForPushNotifications(@C5819i("apiKey") String str, @C5829s("RegistrationId") String str2, @C5829s("Handle") String str3, @C5829s("NotificationRole") int i, @C5829s("NotificationEnvironment") NotificationEnvironment notificationEnvironment, @C5829s("NotificationType") int i2, @C5829s("NotificationSource") String str4);
}
