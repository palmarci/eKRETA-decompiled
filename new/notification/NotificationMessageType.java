package hu.ekreta.ellenorzo.notification;

import hu.ekreta.ellenorzo.main.MainMenuItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B#\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0015"}, d2 = {"Lhu/ekreta/ellenorzo/notification/NotificationMessageType;", "", "value", "", "itemId", "secondaryMenuItem", "Lhu/ekreta/ellenorzo/main/MainMenuItem;", "(Ljava/lang/String;IIILhu/ekreta/ellenorzo/main/MainMenuItem;)V", "getItemId", "()I", "getSecondaryMenuItem", "()Lhu/ekreta/ellenorzo/main/MainMenuItem;", "getValue", "ALL", "EVALUATION", "OMISSION", "NOTE", "MESSAGE", "HOMEWORK", "EXAM", "Companion", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: NotificationEnums.kt */
public enum NotificationMessageType {
    ALL(1, 1, (int) null, 4),
    EVALUATION(2, 1, (int) null, 4),
    OMISSION(4, 1, (int) null, 4),
    NOTE(8, 1, (int) null, 4),
    MESSAGE(16, 5, MainMenuItem.MESSAGES),
    HOMEWORK(32, 1, (int) null, 4),
    EXAM(64, 1, (int) null, 4);
    
    public static final Companion Companion = null;

    /* renamed from: h  reason: collision with root package name */
    public static final NotificationMessageType[] f5913h = null;
    public final int c;
    public final int e;
    public final MainMenuItem f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\n"}, d2 = {"Lhu/ekreta/ellenorzo/notification/NotificationMessageType$Companion;", "", "()V", "values", "", "Lhu/ekreta/ellenorzo/notification/NotificationMessageType;", "[Lhu/ekreta/ellenorzo/notification/NotificationMessageType;", "getByValue", "value", "", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: NotificationEnums.kt */
    public static final class Companion {
        public Companion() {
        }

        public final NotificationMessageType a(int i2) {
            for (NotificationMessageType notificationMessageType : NotificationMessageType.f5913h) {
                if (notificationMessageType.c() == i2) {
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
        Companion = new Companion((DefaultConstructorMarker) null);
        f5913h = values();
    }

    /* access modifiers changed from: public */
    NotificationMessageType(int i2, int i3, MainMenuItem mainMenuItem) {
        this.c = i2;
        this.e = i3;
        this.f = mainMenuItem;
    }

    public final int a() {
        return this.e;
    }

    public final MainMenuItem b() {
        return this.f;
    }

    public final int c() {
        return this.c;
    }
}
