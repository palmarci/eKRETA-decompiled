package hu.ekreta.ellenorzo.notification;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lhu/ekreta/ellenorzo/notification/NotificationEnvironment;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "toString", "STUDENT", "GUARDIAN", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: NotificationEnums.kt */
public enum NotificationEnvironment {
    STUDENT("Tanulo_Native"),
    GUARDIAN("Gondviselo_Native");
    
    public final String c;

    /* access modifiers changed from: public */
    NotificationEnvironment(String str) {
        this.c = str;
    }

    public String toString() {
        return this.c;
    }
}
