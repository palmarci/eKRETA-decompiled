package p289hu.ekreta.ellenorzo.notification;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0001\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/notification/NotificationMessageType;", "", "value", "", "itemId", "(Ljava/lang/String;III)V", "getItemId", "()I", "getValue", "ALL", "EVALUATION", "OMISSION", "NOTE", "MESSAGE", "HOMEWORK", "EXAM", "Companion", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.notification.NotificationMessageType */
/* compiled from: NotificationEnums.kt */
public enum NotificationMessageType {
    ALL(1, 1),
    EVALUATION(2, 1),
    OMISSION(4, 4),
    NOTE(8, 1),
    MESSAGE(16, 1),
    HOMEWORK(32, 1),
    EXAM(64, 1);
    
    public static final Companion Companion = null;

    /* renamed from: g */
    public static final NotificationMessageType[] f14212g = null;

    /* renamed from: c */
    public final int f14213c;

    /* renamed from: e */
    public final int f14214e;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\n"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/notification/NotificationMessageType$Companion;", "", "()V", "values", "", "Lhu/ekreta/ellenorzo/notification/NotificationMessageType;", "[Lhu/ekreta/ellenorzo/notification/NotificationMessageType;", "getByValue", "value", "", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.notification.NotificationMessageType$Companion */
    /* compiled from: NotificationEnums.kt */
    public static final class Companion {
        public Companion() {
        }

        /* renamed from: a */
        public final NotificationMessageType mo13755a(int i) {
            NotificationMessageType[] access$getValues$cp;
            for (NotificationMessageType notificationMessageType : NotificationMessageType.f14212g) {
                if (notificationMessageType.mo13754b() == i) {
                    return notificationMessageType;
                }
            }
            return null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion(null);
        f14212g = values();
    }

    /* access modifiers changed from: public */
    NotificationMessageType(int i, int i2) {
        this.f14213c = i;
        this.f14214e = i2;
    }

    /* renamed from: a */
    public final int mo13753a() {
        return this.f14214e;
    }

    /* renamed from: b */
    public final int mo13754b() {
        return this.f14213c;
    }
}
