package hu.ekreta.ellenorzo.reminder;

import a.b.a.a.a;
import android.content.Context;
import android.content.Intent;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.announcedTest.AnnouncedTest;
import hu.ekreta.ellenorzo.announcedTest.AnnouncedTestDetailActivity;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0015"}, d2 = {"Lhu/ekreta/ellenorzo/reminder/ReminderItemAnnouncedTest;", "Lhu/ekreta/ellenorzo/reminder/ReminderItem;", "model", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;", "(Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;)V", "getModel", "()Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;", "component1", "copy", "equals", "", "other", "", "getDetailIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "hashCode", "", "toString", "", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: ReminderListItem.kt */
public final class ReminderItemAnnouncedTest extends ReminderItem {
    public final AnnouncedTest f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReminderItemAnnouncedTest(AnnouncedTest announcedTest) {
        super(announcedTest.j(), announcedTest.n(), announcedTest.m(), R.drawable.ic_announced_test_40dp, (DefaultConstructorMarker) null);
        Intrinsics.checkParameterIsNotNull(announcedTest, "model");
        this.f = announcedTest;
    }

    public static /* synthetic */ ReminderItemAnnouncedTest copy$default(ReminderItemAnnouncedTest reminderItemAnnouncedTest, AnnouncedTest announcedTest, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            announcedTest = reminderItemAnnouncedTest.f;
        }
        return reminderItemAnnouncedTest.a(announcedTest);
    }

    public Intent a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intent intent = new Intent(context, AnnouncedTestDetailActivity.class);
        ExtensionsKt.a(intent, this.f);
        return intent;
    }

    public final ReminderItemAnnouncedTest a(AnnouncedTest announcedTest) {
        Intrinsics.checkParameterIsNotNull(announcedTest, "model");
        return new ReminderItemAnnouncedTest(announcedTest);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ReminderItemAnnouncedTest) && Intrinsics.areEqual((Object) this.f, (Object) ((ReminderItemAnnouncedTest) obj).f);
        }
        return true;
    }

    public int hashCode() {
        AnnouncedTest announcedTest = this.f;
        if (announcedTest != null) {
            return announcedTest.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder a2 = a.a("ReminderItemAnnouncedTest(model=");
        a2.append(this.f);
        a2.append(")");
        return a2.toString();
    }
}
