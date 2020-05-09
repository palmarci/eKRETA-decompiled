package p289hu.ekreta.ellenorzo.notification;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p289hu.ekreta.ellenorzo.util.mapper.ProfileSpecificModel;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\t\u001a\u00020\nXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013¨\u0006#"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/notification/SubscriptionForPushNotification;", "Lhu/ekreta/ellenorzo/util/mapper/ProfileSpecificModel;", "profileId", "", "notificationRole", "Lhu/ekreta/ellenorzo/notification/NotificationMessageRole;", "registrationId", "token", "(Ljava/lang/String;Lhu/ekreta/ellenorzo/notification/NotificationMessageRole;Ljava/lang/String;Ljava/lang/String;)V", "isRegistered", "", "()Z", "getNotificationRole", "()Lhu/ekreta/ellenorzo/notification/NotificationMessageRole;", "setNotificationRole", "(Lhu/ekreta/ellenorzo/notification/NotificationMessageRole;)V", "getProfileId", "()Ljava/lang/String;", "setProfileId", "(Ljava/lang/String;)V", "getRegistrationId", "setRegistrationId", "getToken", "setToken", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.notification.SubscriptionForPushNotification */
/* compiled from: SubscriptionForPushNotification.kt */
public final class SubscriptionForPushNotification implements ProfileSpecificModel {

    /* renamed from: c */
    public String f14292c;

    /* renamed from: e */
    public NotificationMessageRole f14293e;

    /* renamed from: f */
    public String f14294f;

    /* renamed from: g */
    public String f14295g;

    public SubscriptionForPushNotification(String str, NotificationMessageRole notificationMessageRole, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "profileId");
        Intrinsics.checkParameterIsNotNull(notificationMessageRole, "notificationRole");
        Intrinsics.checkParameterIsNotNull(str2, "registrationId");
        Intrinsics.checkParameterIsNotNull(str3, "token");
        this.f14292c = str;
        this.f14293e = notificationMessageRole;
        this.f14294f = str2;
        this.f14295g = str3;
    }

    public static /* synthetic */ SubscriptionForPushNotification copy$default(SubscriptionForPushNotification subscriptionForPushNotification, String str, NotificationMessageRole notificationMessageRole, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subscriptionForPushNotification.mo11318e();
        }
        if ((i & 2) != 0) {
            notificationMessageRole = subscriptionForPushNotification.f14293e;
        }
        if ((i & 4) != 0) {
            str2 = subscriptionForPushNotification.f14294f;
        }
        if ((i & 8) != 0) {
            str3 = subscriptionForPushNotification.f14295g;
        }
        return subscriptionForPushNotification.mo13813a(str, notificationMessageRole, str2, str3);
    }

    /* renamed from: a */
    public final NotificationMessageRole mo13812a() {
        return this.f14293e;
    }

    /* renamed from: a */
    public final SubscriptionForPushNotification mo13813a(String str, NotificationMessageRole notificationMessageRole, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "profileId");
        Intrinsics.checkParameterIsNotNull(notificationMessageRole, "notificationRole");
        Intrinsics.checkParameterIsNotNull(str2, "registrationId");
        Intrinsics.checkParameterIsNotNull(str3, "token");
        return new SubscriptionForPushNotification(str, notificationMessageRole, str2, str3);
    }

    /* renamed from: b */
    public final String mo13814b() {
        return this.f14294f;
    }

    /* renamed from: c */
    public final String mo13815c() {
        return this.f14295g;
    }

    /* renamed from: e */
    public String mo11318e() {
        return this.f14292c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f14295g, (java.lang.Object) r3.f14295g) != false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0037
            boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.notification.SubscriptionForPushNotification
            if (r0 == 0) goto L_0x0035
            hu.ekreta.ellenorzo.notification.SubscriptionForPushNotification r3 = (p289hu.ekreta.ellenorzo.notification.SubscriptionForPushNotification) r3
            java.lang.String r0 = r2.mo11318e()
            java.lang.String r1 = r3.mo11318e()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0035
            hu.ekreta.ellenorzo.notification.NotificationMessageRole r0 = r2.f14293e
            hu.ekreta.ellenorzo.notification.NotificationMessageRole r1 = r3.f14293e
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = r2.f14294f
            java.lang.String r1 = r3.f14294f
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = r2.f14295g
            java.lang.String r3 = r3.f14295g
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r3 = 0
            return r3
        L_0x0037:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.notification.SubscriptionForPushNotification.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String e = mo11318e();
        int i = 0;
        int hashCode = (e != null ? e.hashCode() : 0) * 31;
        NotificationMessageRole notificationMessageRole = this.f14293e;
        int hashCode2 = (hashCode + (notificationMessageRole != null ? notificationMessageRole.hashCode() : 0)) * 31;
        String str = this.f14294f;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f14295g;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("SubscriptionForPushNotification(profileId=");
        a.append(mo11318e());
        a.append(", notificationRole=");
        a.append(this.f14293e);
        a.append(", registrationId=");
        a.append(this.f14294f);
        a.append(", token=");
        return C0082a.m106a(a, this.f14295g, ")");
    }
}
