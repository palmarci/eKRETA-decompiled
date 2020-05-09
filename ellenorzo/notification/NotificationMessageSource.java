package p289hu.ekreta.ellenorzo.notification;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/notification/NotificationMessageSource;", "", "id", "", "value", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getId", "()I", "getValue", "()Ljava/lang/String;", "KRETA", "EUGYINTEZES", "Companion", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.notification.NotificationMessageSource */
/* compiled from: NotificationEnums.kt */
public enum NotificationMessageSource {
    KRETA(1, "Kreta"),
    EUGYINTEZES(0, "EUgyintezes");
    
    public static final Companion Companion = null;

    /* renamed from: f */
    public static final NotificationMessageSource[] f14209f = null;

    /* renamed from: c */
    public final String f14210c;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\n"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/notification/NotificationMessageSource$Companion;", "", "()V", "values", "", "Lhu/ekreta/ellenorzo/notification/NotificationMessageSource;", "[Lhu/ekreta/ellenorzo/notification/NotificationMessageSource;", "getByValue", "value", "", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.notification.NotificationMessageSource$Companion */
    /* compiled from: NotificationEnums.kt */
    public static final class Companion {
        public Companion() {
        }

        /* renamed from: a */
        public final NotificationMessageSource mo13752a(String str) {
            NotificationMessageSource[] access$getValues$cp;
            Intrinsics.checkParameterIsNotNull(str, "value");
            for (NotificationMessageSource notificationMessageSource : NotificationMessageSource.f14209f) {
                if (Intrinsics.areEqual((Object) notificationMessageSource.mo13751a(), (Object) str)) {
                    return notificationMessageSource;
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
        f14209f = values();
    }

    /* access modifiers changed from: public */
    NotificationMessageSource(int i, String str) {
        this.f14210c = str;
    }

    /* renamed from: a */
    public final String mo13751a() {
        return this.f14210c;
    }
}
