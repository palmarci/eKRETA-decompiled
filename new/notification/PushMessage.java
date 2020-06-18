package hu.ekreta.ellenorzo.notification;

import a.b.a.a.a;
import hu.ekreta.ellenorzo.notification.NotificationMessageRole;
import hu.ekreta.ellenorzo.notification.NotificationMessageSource;
import hu.ekreta.ellenorzo.notification.NotificationMessageType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u0000 +2\u00020\u0001:\u0001+BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003JY\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0005HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013¨\u0006,"}, d2 = {"Lhu/ekreta/ellenorzo/notification/PushMessage;", "", "instituteCode", "", "userId", "", "notificationType", "Lhu/ekreta/ellenorzo/notification/NotificationMessageType;", "notificationRole", "Lhu/ekreta/ellenorzo/notification/NotificationMessageRole;", "notificationSource", "Lhu/ekreta/ellenorzo/notification/NotificationMessageSource;", "itemId", "message", "messageId", "(Ljava/lang/String;ILhu/ekreta/ellenorzo/notification/NotificationMessageType;Lhu/ekreta/ellenorzo/notification/NotificationMessageRole;Lhu/ekreta/ellenorzo/notification/NotificationMessageSource;ILjava/lang/String;Ljava/lang/String;)V", "getInstituteCode", "()Ljava/lang/String;", "getItemId", "()I", "getMessage", "getMessageId", "getNotificationRole", "()Lhu/ekreta/ellenorzo/notification/NotificationMessageRole;", "getNotificationSource", "()Lhu/ekreta/ellenorzo/notification/NotificationMessageSource;", "getNotificationType", "()Lhu/ekreta/ellenorzo/notification/NotificationMessageType;", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: PushMessage.kt */
public final class PushMessage {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f5929a;
    public final int b;
    public final NotificationMessageType c;

    /* renamed from: d  reason: collision with root package name */
    public final NotificationMessageRole f5930d;
    public final NotificationMessageSource e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final String f5931g;

    /* renamed from: h  reason: collision with root package name */
    public final String f5932h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\b"}, d2 = {"Lhu/ekreta/ellenorzo/notification/PushMessage$Companion;", "", "()V", "from", "Lhu/ekreta/ellenorzo/notification/PushMessage;", "map", "", "", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: PushMessage.kt */
    public static final class Companion {
        public Companion() {
        }

        public final PushMessage a(Map<String, String> map) {
            Intrinsics.checkParameterIsNotNull(map, "map");
            String str = map.get("InstituteCode");
            if (str != null) {
                String str2 = map.get("UserId");
                if (str2 != null) {
                    int parseInt = Integer.parseInt(str2);
                    NotificationMessageType.Companion companion = NotificationMessageType.Companion;
                    String str3 = map.get("NotificationType");
                    if (str3 != null) {
                        NotificationMessageType a2 = companion.a(Integer.parseInt(str3));
                        if (a2 == null) {
                            Intrinsics.throwNpe();
                        }
                        NotificationMessageRole.Companion companion2 = NotificationMessageRole.Companion;
                        String str4 = map.get("NotificationRole");
                        if (str4 != null) {
                            NotificationMessageRole a3 = companion2.a(Integer.parseInt(str4));
                            NotificationMessageSource.Companion companion3 = NotificationMessageSource.Companion;
                            String str5 = map.get("NotificationSource");
                            if (str5 != null) {
                                NotificationMessageSource a4 = companion3.a(str5);
                                if (a4 == null) {
                                    Intrinsics.throwNpe();
                                }
                                String str6 = map.get("ItemId");
                                if (str6 != null) {
                                    int parseInt2 = Integer.parseInt(str6);
                                    String str7 = map.get("Message");
                                    if (str7 != null) {
                                        String str8 = map.get("MessageId");
                                        if (str8 != null) {
                                            return new PushMessage(str, parseInt, a2, a3, a4, parseInt2, str7, str8);
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

    public PushMessage(String str, int i2, NotificationMessageType notificationMessageType, NotificationMessageRole notificationMessageRole, NotificationMessageSource notificationMessageSource, int i3, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "instituteCode");
        Intrinsics.checkParameterIsNotNull(notificationMessageType, "notificationType");
        Intrinsics.checkParameterIsNotNull(notificationMessageRole, "notificationRole");
        Intrinsics.checkParameterIsNotNull(notificationMessageSource, "notificationSource");
        Intrinsics.checkParameterIsNotNull(str2, "message");
        Intrinsics.checkParameterIsNotNull(str3, "messageId");
        this.f5929a = str;
        this.b = i2;
        this.c = notificationMessageType;
        this.f5930d = notificationMessageRole;
        this.e = notificationMessageSource;
        this.f = i3;
        this.f5931g = str2;
        this.f5932h = str3;
    }

    public static /* synthetic */ PushMessage copy$default(PushMessage pushMessage, String str, int i2, NotificationMessageType notificationMessageType, NotificationMessageRole notificationMessageRole, NotificationMessageSource notificationMessageSource, int i3, String str2, String str3, int i4, Object obj) {
        PushMessage pushMessage2 = pushMessage;
        int i5 = i4;
        return pushMessage.a((i5 & 1) != 0 ? pushMessage2.f5929a : str, (i5 & 2) != 0 ? pushMessage2.b : i2, (i5 & 4) != 0 ? pushMessage2.c : notificationMessageType, (i5 & 8) != 0 ? pushMessage2.f5930d : notificationMessageRole, (i5 & 16) != 0 ? pushMessage2.e : notificationMessageSource, (i5 & 32) != 0 ? pushMessage2.f : i3, (i5 & 64) != 0 ? pushMessage2.f5931g : str2, (i5 & 128) != 0 ? pushMessage2.f5932h : str3);
    }

    public final PushMessage a(String str, int i2, NotificationMessageType notificationMessageType, NotificationMessageRole notificationMessageRole, NotificationMessageSource notificationMessageSource, int i3, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "instituteCode");
        Intrinsics.checkParameterIsNotNull(notificationMessageType, "notificationType");
        Intrinsics.checkParameterIsNotNull(notificationMessageRole, "notificationRole");
        Intrinsics.checkParameterIsNotNull(notificationMessageSource, "notificationSource");
        String str4 = str2;
        Intrinsics.checkParameterIsNotNull(str4, "message");
        String str5 = str3;
        Intrinsics.checkParameterIsNotNull(str5, "messageId");
        return new PushMessage(str, i2, notificationMessageType, notificationMessageRole, notificationMessageSource, i3, str4, str5);
    }

    public final String a() {
        return this.f5929a;
    }

    public final String b() {
        return this.f5931g;
    }

    public final NotificationMessageRole c() {
        return this.f5930d;
    }

    public final NotificationMessageType d() {
        return this.c;
    }

    public final int e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PushMessage) {
                PushMessage pushMessage = (PushMessage) obj;
                if (Intrinsics.areEqual((Object) this.f5929a, (Object) pushMessage.f5929a)) {
                    if ((this.b == pushMessage.b) && Intrinsics.areEqual((Object) this.c, (Object) pushMessage.c) && Intrinsics.areEqual((Object) this.f5930d, (Object) pushMessage.f5930d) && Intrinsics.areEqual((Object) this.e, (Object) pushMessage.e)) {
                        if (!(this.f == pushMessage.f) || !Intrinsics.areEqual((Object) this.f5931g, (Object) pushMessage.f5931g) || !Intrinsics.areEqual((Object) this.f5932h, (Object) pushMessage.f5932h)) {
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
        String str = this.f5929a;
        int i2 = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.b) * 31;
        NotificationMessageType notificationMessageType = this.c;
        int hashCode2 = (hashCode + (notificationMessageType != null ? notificationMessageType.hashCode() : 0)) * 31;
        NotificationMessageRole notificationMessageRole = this.f5930d;
        int hashCode3 = (hashCode2 + (notificationMessageRole != null ? notificationMessageRole.hashCode() : 0)) * 31;
        NotificationMessageSource notificationMessageSource = this.e;
        int hashCode4 = (((hashCode3 + (notificationMessageSource != null ? notificationMessageSource.hashCode() : 0)) * 31) + this.f) * 31;
        String str2 = this.f5931g;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f5932h;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode5 + i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("PushMessage(instituteCode=");
        a2.append(this.f5929a);
        a2.append(", userId=");
        a2.append(this.b);
        a2.append(", notificationType=");
        a2.append(this.c);
        a2.append(", notificationRole=");
        a2.append(this.f5930d);
        a2.append(", notificationSource=");
        a2.append(this.e);
        a2.append(", itemId=");
        a2.append(this.f);
        a2.append(", message=");
        a2.append(this.f5931g);
        a2.append(", messageId=");
        return a.a(a2, this.f5932h, ")");
    }
}
