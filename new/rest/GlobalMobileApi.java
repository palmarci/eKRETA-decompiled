package hu.ekreta.ellenorzo.rest;

import hu.ekreta.ellenorzo.notification.NotificationEnvironment;
import hu.ekreta.ellenorzo.notification.NotificationMessageType;
import hu.ekreta.ellenorzo.rest.globalmobile.InstituteDto;
import hu.ekreta.ellenorzo.rest.globalmobile.PushNotificationRegistrationDto;
import java.util.List;
import k.b.n;
import kotlin.Metadata;
import m.h0;
import p.t.b;
import p.t.f;
import p.t.i;
import p.t.o;
import p.t.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J@\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\f\u001a\u00020\u0006H'J\u001e\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'JT\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\u0015\u001a\u00020\u00062\b\b\u0003\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\f\u001a\u00020\u0006H'JT\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\f\u001a\u00020\u0006H'¨\u0006\u0017"}, d2 = {"Lhu/ekreta/ellenorzo/rest/GlobalMobileApi;", "", "deregisterFromPushNotifications", "Lio/reactivex/Observable;", "Lokhttp3/ResponseBody;", "apiKey", "", "registrationId", "notificationEnvironment", "Lhu/ekreta/ellenorzo/notification/NotificationEnvironment;", "notificationType", "", "notificationSource", "getInstitutes", "", "Lhu/ekreta/ellenorzo/rest/globalmobile/InstituteDto;", "registerForPushNotifications", "Lhu/ekreta/ellenorzo/rest/globalmobile/PushNotificationRegistrationDto;", "authorizationHeader", "firebaseToken", "role", "platform", "updateRegistrationForPushNotifications", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: GlobalMobileApi.kt */
public interface GlobalMobileApi {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    /* compiled from: GlobalMobileApi.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ n deregisterFromPushNotifications$default(GlobalMobileApi globalMobileApi, String str, String str2, NotificationEnvironment notificationEnvironment, int i2, String str3, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 8) != 0) {
                    i2 = NotificationMessageType.ALL.c();
                }
                int i4 = i2;
                if ((i3 & 16) != 0) {
                    str3 = "Kreta";
                }
                return globalMobileApi.deregisterFromPushNotifications(str, str2, notificationEnvironment, i4, str3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deregisterFromPushNotifications");
        }

        public static /* synthetic */ n registerForPushNotifications$default(GlobalMobileApi globalMobileApi, String str, String str2, int i2, NotificationEnvironment notificationEnvironment, String str3, int i3, String str4, int i4, Object obj) {
            if (obj == null) {
                return globalMobileApi.registerForPushNotifications(str, str2, i2, notificationEnvironment, (i4 & 16) != 0 ? "gcm" : str3, (i4 & 32) != 0 ? NotificationMessageType.ALL.c() : i3, (i4 & 64) != 0 ? "Kreta" : str4);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: registerForPushNotifications");
        }

        public static /* synthetic */ n updateRegistrationForPushNotifications$default(GlobalMobileApi globalMobileApi, String str, String str2, String str3, int i2, NotificationEnvironment notificationEnvironment, int i3, String str4, int i4, Object obj) {
            if (obj == null) {
                return globalMobileApi.updateRegistrationForPushNotifications(str, str2, str3, i2, notificationEnvironment, (i4 & 32) != 0 ? NotificationMessageType.ALL.c() : i3, (i4 & 64) != 0 ? "Kreta" : str4);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateRegistrationForPushNotifications");
        }
    }

    @b("Registration")
    n<h0> deregisterFromPushNotifications(@i("apiKey") String str, @s("RegistrationId") String str2, @s("NotificationEnvironment") NotificationEnvironment notificationEnvironment, @s("NotificationType") int i2, @s("NotificationSource") String str3);

    @f("Institute")
    n<List<InstituteDto>> getInstitutes(@i("apiKey") String str);

    @p.t.n("Registration")
    n<PushNotificationRegistrationDto> registerForPushNotifications(@i("Authorization") String str, @s("Handle") String str2, @s("NotificationRole") int i2, @s("NotificationEnvironment") NotificationEnvironment notificationEnvironment, @s("Platform") String str3, @s("NotificationType") int i3, @s("NotificationSource") String str4);

    @o("Registration")
    n<h0> updateRegistrationForPushNotifications(@i("apiKey") String str, @s("RegistrationId") String str2, @s("Handle") String str3, @s("NotificationRole") int i2, @s("NotificationEnvironment") NotificationEnvironment notificationEnvironment, @s("NotificationType") int i3, @s("NotificationSource") String str4);
}
