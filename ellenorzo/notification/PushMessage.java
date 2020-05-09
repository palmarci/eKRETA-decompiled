package p289hu.ekreta.ellenorzo.notification;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u0000 +2\u00020\u0001:\u0001+BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003JY\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0005HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013¨\u0006,"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/notification/PushMessage;", "", "instituteCode", "", "userId", "", "notificationType", "Lhu/ekreta/ellenorzo/notification/NotificationMessageType;", "notificationRole", "Lhu/ekreta/ellenorzo/notification/NotificationMessageRole;", "notificationSource", "Lhu/ekreta/ellenorzo/notification/NotificationMessageSource;", "itemId", "message", "messageId", "(Ljava/lang/String;ILhu/ekreta/ellenorzo/notification/NotificationMessageType;Lhu/ekreta/ellenorzo/notification/NotificationMessageRole;Lhu/ekreta/ellenorzo/notification/NotificationMessageSource;ILjava/lang/String;Ljava/lang/String;)V", "getInstituteCode", "()Ljava/lang/String;", "getItemId", "()I", "getMessage", "getMessageId", "getNotificationRole", "()Lhu/ekreta/ellenorzo/notification/NotificationMessageRole;", "getNotificationSource", "()Lhu/ekreta/ellenorzo/notification/NotificationMessageSource;", "getNotificationType", "()Lhu/ekreta/ellenorzo/notification/NotificationMessageType;", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.notification.PushMessage */
/* compiled from: PushMessage.kt */
public final class PushMessage {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final String f14284a;

    /* renamed from: b */
    public final int f14285b;

    /* renamed from: c */
    public final NotificationMessageType f14286c;

    /* renamed from: d */
    public final NotificationMessageRole f14287d;

    /* renamed from: e */
    public final NotificationMessageSource f14288e;

    /* renamed from: f */
    public final int f14289f;

    /* renamed from: g */
    public final String f14290g;

    /* renamed from: h */
    public final String f14291h;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\b"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/notification/PushMessage$Companion;", "", "()V", "from", "Lhu/ekreta/ellenorzo/notification/PushMessage;", "map", "", "", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.notification.PushMessage$Companion */
    /* compiled from: PushMessage.kt */
    public static final class Companion {
        public Companion() {
        }

        /* renamed from: a */
        public final PushMessage mo13811a(Map<String, String> map) {
            Intrinsics.checkParameterIsNotNull(map, "map");
            String str = (String) map.get("InstituteCode");
            if (str != null) {
                String str2 = (String) map.get("UserId");
                if (str2 != null) {
                    int parseInt = Integer.parseInt(str2);
                    p289hu.ekreta.ellenorzo.notification.NotificationMessageType.Companion companion = NotificationMessageType.Companion;
                    String str3 = (String) map.get("NotificationType");
                    if (str3 != null) {
                        NotificationMessageType a = companion.mo13755a(Integer.parseInt(str3));
                        if (a == null) {
                            Intrinsics.throwNpe();
                        }
                        p289hu.ekreta.ellenorzo.notification.NotificationMessageRole.Companion companion2 = NotificationMessageRole.Companion;
                        String str4 = (String) map.get("NotificationRole");
                        if (str4 != null) {
                            NotificationMessageRole a2 = companion2.mo13750a(Integer.parseInt(str4));
                            p289hu.ekreta.ellenorzo.notification.NotificationMessageSource.Companion companion3 = NotificationMessageSource.Companion;
                            String str5 = (String) map.get("NotificationSource");
                            if (str5 != null) {
                                NotificationMessageSource a3 = companion3.mo13752a(str5);
                                if (a3 == null) {
                                    Intrinsics.throwNpe();
                                }
                                String str6 = (String) map.get("ItemId");
                                if (str6 != null) {
                                    int parseInt2 = Integer.parseInt(str6);
                                    String str7 = (String) map.get("Message");
                                    if (str7 != null) {
                                        String str8 = (String) map.get("MessageId");
                                        if (str8 != null) {
                                            PushMessage pushMessage = new PushMessage(str, parseInt, a, a2, a3, parseInt2, str7, str8);
                                            return pushMessage;
                                        }
                                        throw new IllegalStateException("MessageId not found".toString());
                                    }
                                    throw new IllegalStateException("Message not found".toString());
                                }
                                throw new IllegalStateException("ItemId not found".toString());
                            }
                            throw new IllegalStateException("NotificationSource not found".toString());
                        }
                        throw new IllegalStateException("NotificationRole not found".toString());
                    }
                    throw new IllegalStateException("NotificationType not found".toString());
                }
                throw new IllegalStateException("UserId not found".toString());
            }
            throw new IllegalStateException("InstituteCode not found".toString());
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public PushMessage(String str, int i, NotificationMessageType notificationMessageType, NotificationMessageRole notificationMessageRole, NotificationMessageSource notificationMessageSource, int i2, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "instituteCode");
        Intrinsics.checkParameterIsNotNull(notificationMessageType, "notificationType");
        Intrinsics.checkParameterIsNotNull(notificationMessageRole, "notificationRole");
        Intrinsics.checkParameterIsNotNull(notificationMessageSource, "notificationSource");
        Intrinsics.checkParameterIsNotNull(str2, "message");
        Intrinsics.checkParameterIsNotNull(str3, "messageId");
        this.f14284a = str;
        this.f14285b = i;
        this.f14286c = notificationMessageType;
        this.f14287d = notificationMessageRole;
        this.f14288e = notificationMessageSource;
        this.f14289f = i2;
        this.f14290g = str2;
        this.f14291h = str3;
    }

    public static /* synthetic */ PushMessage copy$default(PushMessage pushMessage, String str, int i, NotificationMessageType notificationMessageType, NotificationMessageRole notificationMessageRole, NotificationMessageSource notificationMessageSource, int i2, String str2, String str3, int i3, Object obj) {
        PushMessage pushMessage2 = pushMessage;
        int i4 = i3;
        return pushMessage.mo13802a((i4 & 1) != 0 ? pushMessage2.f14284a : str, (i4 & 2) != 0 ? pushMessage2.f14285b : i, (i4 & 4) != 0 ? pushMessage2.f14286c : notificationMessageType, (i4 & 8) != 0 ? pushMessage2.f14287d : notificationMessageRole, (i4 & 16) != 0 ? pushMessage2.f14288e : notificationMessageSource, (i4 & 32) != 0 ? pushMessage2.f14289f : i2, (i4 & 64) != 0 ? pushMessage2.f14290g : str2, (i4 & 128) != 0 ? pushMessage2.f14291h : str3);
    }

    /* renamed from: a */
    public final PushMessage mo13802a(String str, int i, NotificationMessageType notificationMessageType, NotificationMessageRole notificationMessageRole, NotificationMessageSource notificationMessageSource, int i2, String str2, String str3) {
        String str4 = str;
        Intrinsics.checkParameterIsNotNull(str, "instituteCode");
        NotificationMessageType notificationMessageType2 = notificationMessageType;
        Intrinsics.checkParameterIsNotNull(notificationMessageType, "notificationType");
        NotificationMessageRole notificationMessageRole2 = notificationMessageRole;
        Intrinsics.checkParameterIsNotNull(notificationMessageRole, "notificationRole");
        NotificationMessageSource notificationMessageSource2 = notificationMessageSource;
        Intrinsics.checkParameterIsNotNull(notificationMessageSource, "notificationSource");
        String str5 = str2;
        Intrinsics.checkParameterIsNotNull(str5, "message");
        String str6 = str3;
        Intrinsics.checkParameterIsNotNull(str6, "messageId");
        PushMessage pushMessage = new PushMessage(str4, i, notificationMessageType2, notificationMessageRole2, notificationMessageSource2, i2, str5, str6);
        return pushMessage;
    }

    /* renamed from: a */
    public final String mo13803a() {
        return this.f14284a;
    }

    /* renamed from: b */
    public final String mo13804b() {
        return this.f14290g;
    }

    /* renamed from: c */
    public final NotificationMessageRole mo13805c() {
        return this.f14287d;
    }

    /* renamed from: d */
    public final NotificationMessageType mo13806d() {
        return this.f14286c;
    }

    /* renamed from: e */
    public final int mo13807e() {
        return this.f14285b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PushMessage) {
                PushMessage pushMessage = (PushMessage) obj;
                if (Intrinsics.areEqual((Object) this.f14284a, (Object) pushMessage.f14284a)) {
                    if ((this.f14285b == pushMessage.f14285b) && Intrinsics.areEqual((Object) this.f14286c, (Object) pushMessage.f14286c) && Intrinsics.areEqual((Object) this.f14287d, (Object) pushMessage.f14287d) && Intrinsics.areEqual((Object) this.f14288e, (Object) pushMessage.f14288e)) {
                        if (!(this.f14289f == pushMessage.f14289f) || !Intrinsics.areEqual((Object) this.f14290g, (Object) pushMessage.f14290g) || !Intrinsics.areEqual((Object) this.f14291h, (Object) pushMessage.f14291h)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f14284a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f14285b) * 31;
        NotificationMessageType notificationMessageType = this.f14286c;
        int hashCode2 = (hashCode + (notificationMessageType != null ? notificationMessageType.hashCode() : 0)) * 31;
        NotificationMessageRole notificationMessageRole = this.f14287d;
        int hashCode3 = (hashCode2 + (notificationMessageRole != null ? notificationMessageRole.hashCode() : 0)) * 31;
        NotificationMessageSource notificationMessageSource = this.f14288e;
        int hashCode4 = (((hashCode3 + (notificationMessageSource != null ? notificationMessageSource.hashCode() : 0)) * 31) + this.f14289f) * 31;
        String str2 = this.f14290g;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f14291h;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("PushMessage(instituteCode=");
        a.append(this.f14284a);
        a.append(", userId=");
        a.append(this.f14285b);
        a.append(", notificationType=");
        a.append(this.f14286c);
        a.append(", notificationRole=");
        a.append(this.f14287d);
        a.append(", notificationSource=");
        a.append(this.f14288e);
        a.append(", itemId=");
        a.append(this.f14289f);
        a.append(", message=");
        a.append(this.f14290g);
        a.append(", messageId=");
        return C0082a.m106a(a, this.f14291h, ")");
    }
}
