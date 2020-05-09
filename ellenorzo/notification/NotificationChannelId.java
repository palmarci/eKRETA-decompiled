package p289hu.ekreta.ellenorzo.notification;

import kotlin.Metadata;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/notification/NotificationChannelId;", "", "id", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "EVALUTION", "OMISSION", "NOTE", "MESSAGE", "HOMEWORK", "EXAM", "GENERAL", "DEFAULT", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.notification.NotificationChannelId */
/* compiled from: NotificationEnums.kt */
public enum NotificationChannelId {
    EVALUTION("hu.ekreta.ellenorzo.evaluation"),
    OMISSION("hu.ekreta.ellenorzo.omission"),
    NOTE("hu.ekreta.ellenorzo.note"),
    MESSAGE("hu.ekreta.ellenorzo.message"),
    HOMEWORK("hu.ekreta.ellenorzo.homework"),
    EXAM("hu.ekreta.ellenorzo.exam"),
    GENERAL("hu.ekreta.ellenorzo.general"),
    DEFAULT("hu.ekreta.ellenorzo.default");
    

    /* renamed from: c */
    public final String f14201c;

    /* access modifiers changed from: public */
    NotificationChannelId(String str) {
        this.f14201c = str;
    }

    /* renamed from: a */
    public final String mo13745a() {
        return this.f14201c;
    }
}
