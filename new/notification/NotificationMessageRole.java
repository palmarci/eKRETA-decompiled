package hu.ekreta.ellenorzo.notification;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lhu/ekreta/ellenorzo/notification/NotificationMessageRole;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "STUDENT", "GUARDIAN", "ALL", "Companion", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: NotificationEnums.kt */
public enum NotificationMessageRole {
    STUDENT(1),
    GUARDIAN(2),
    ALL(3);
    
    public static final Companion Companion = null;
    public static final NotificationMessageRole[] f = null;
    public final int c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\n"}, d2 = {"Lhu/ekreta/ellenorzo/notification/NotificationMessageRole$Companion;", "", "()V", "values", "", "Lhu/ekreta/ellenorzo/notification/NotificationMessageRole;", "[Lhu/ekreta/ellenorzo/notification/NotificationMessageRole;", "getByValue", "value", "", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: NotificationEnums.kt */
    public static final class Companion {
        public Companion() {
        }

        public final NotificationMessageRole a(int i2) {
            NotificationMessageRole notificationMessageRole;
            NotificationMessageRole[] access$getValues$cp = NotificationMessageRole.f;
            int length = access$getValues$cp.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    notificationMessageRole = null;
                    break;
                }
                notificationMessageRole = access$getValues$cp[i3];
                if (notificationMessageRole.a() == i2) {
                    break;
                }
                i3++;
            }
            return notificationMessageRole != null ? notificationMessageRole : NotificationMessageRole.STUDENT;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((DefaultConstructorMarker) null);
        f = values();
    }

    /* access modifiers changed from: public */
    NotificationMessageRole(int i2) {
        this.c = i2;
    }

    public final int a() {
        return this.c;
    }
}
