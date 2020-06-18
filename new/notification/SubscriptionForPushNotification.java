package hu.ekreta.ellenorzo.notification;

import a.b.a.a.a;
import hu.ekreta.ellenorzo.util.mapper.ProfileSpecificModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\t\u001a\u00020\nXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013¨\u0006#"}, d2 = {"Lhu/ekreta/ellenorzo/notification/SubscriptionForPushNotification;", "Lhu/ekreta/ellenorzo/util/mapper/ProfileSpecificModel;", "profileId", "", "notificationRole", "Lhu/ekreta/ellenorzo/notification/NotificationMessageRole;", "registrationId", "token", "(Ljava/lang/String;Lhu/ekreta/ellenorzo/notification/NotificationMessageRole;Ljava/lang/String;Ljava/lang/String;)V", "isRegistered", "", "()Z", "getNotificationRole", "()Lhu/ekreta/ellenorzo/notification/NotificationMessageRole;", "setNotificationRole", "(Lhu/ekreta/ellenorzo/notification/NotificationMessageRole;)V", "getProfileId", "()Ljava/lang/String;", "setProfileId", "(Ljava/lang/String;)V", "getRegistrationId", "setRegistrationId", "getToken", "setToken", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: SubscriptionForPushNotification.kt */
public final class SubscriptionForPushNotification implements ProfileSpecificModel {
    public String c;
    public NotificationMessageRole e;
    public String f;

    /* renamed from: g  reason: collision with root package name */
    public String f5933g;

    public SubscriptionForPushNotification(String str, NotificationMessageRole notificationMessageRole, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "profileId");
        Intrinsics.checkParameterIsNotNull(notificationMessageRole, "notificationRole");
        Intrinsics.checkParameterIsNotNull(str2, "registrationId");
        Intrinsics.checkParameterIsNotNull(str3, "token");
        this.c = str;
        this.e = notificationMessageRole;
        this.f = str2;
        this.f5933g = str3;
    }

    public static /* synthetic */ SubscriptionForPushNotification copy$default(SubscriptionForPushNotification subscriptionForPushNotification, String str, NotificationMessageRole notificationMessageRole, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = subscriptionForPushNotification.e();
        }
        if ((i2 & 2) != 0) {
            notificationMessageRole = subscriptionForPushNotification.e;
        }
        if ((i2 & 4) != 0) {
            str2 = subscriptionForPushNotification.f;
        }
        if ((i2 & 8) != 0) {
            str3 = subscriptionForPushNotification.f5933g;
        }
        return subscriptionForPushNotification.a(str, notificationMessageRole, str2, str3);
    }

    public final NotificationMessageRole a() {
        return this.e;
    }

    public final SubscriptionForPushNotification a(String str, NotificationMessageRole notificationMessageRole, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "profileId");
        Intrinsics.checkParameterIsNotNull(notificationMessageRole, "notificationRole");
        Intrinsics.checkParameterIsNotNull(str2, "registrationId");
        Intrinsics.checkParameterIsNotNull(str3, "token");
        return new SubscriptionForPushNotification(str, notificationMessageRole, str2, str3);
    }

    public final String b() {
        return this.f;
    }

    public final String c() {
        return this.f5933g;
    }

    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionForPushNotification)) {
            return false;
        }
        SubscriptionForPushNotification subscriptionForPushNotification = (SubscriptionForPushNotification) obj;
        return Intrinsics.areEqual((Object) e(), (Object) subscriptionForPushNotification.e()) && Intrinsics.areEqual((Object) this.e, (Object) subscriptionForPushNotification.e) && Intrinsics.areEqual((Object) this.f, (Object) subscriptionForPushNotification.f) && Intrinsics.areEqual((Object) this.f5933g, (Object) subscriptionForPushNotification.f5933g);
    }

    public int hashCode() {
        String e2 = e();
        int i2 = 0;
        int hashCode = (e2 != null ? e2.hashCode() : 0) * 31;
        NotificationMessageRole notificationMessageRole = this.e;
        int hashCode2 = (hashCode + (notificationMessageRole != null ? notificationMessageRole.hashCode() : 0)) * 31;
        String str = this.f;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5933g;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("SubscriptionForPushNotification(profileId=");
        a2.append(e());
        a2.append(", notificationRole=");
        a2.append(this.e);
        a2.append(", registrationId=");
        a2.append(this.f);
        a2.append(", token=");
        return a.a(a2, this.f5933g, ")");
    }
}
