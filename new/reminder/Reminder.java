package hu.ekreta.ellenorzo.reminder;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lhu/ekreta/ellenorzo/reminder/Reminder;", "", "()V", "type", "Lhu/ekreta/ellenorzo/reminder/Reminder$Type;", "getType", "()Lhu/ekreta/ellenorzo/reminder/Reminder$Type;", "Type", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: Reminder.kt */
public abstract class Reminder {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lhu/ekreta/ellenorzo/reminder/Reminder$Type;", "", "(Ljava/lang/String;I)V", "HOMEWORK", "ANNOUNCED_TEST", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: Reminder.kt */
    public enum Type {
        HOMEWORK,
        ANNOUNCED_TEST
    }

    public abstract Type f();
}
