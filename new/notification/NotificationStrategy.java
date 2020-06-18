package hu.ekreta.ellenorzo.notification;

import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H&¨\u0006\t"}, d2 = {"Lhu/ekreta/ellenorzo/notification/NotificationStrategy;", "", "handleIncomingNotification", "", "messageMap", "", "", "updateFirebaseToken", "newToken", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: NotificationStrategy.kt */
public interface NotificationStrategy {
    void a(String str);

    void a(Map<String, String> map);
}
