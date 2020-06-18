package hu.ekreta.ellenorzo.reminder;

import a.b.a.a.a;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import hu.ekreta.ellenorzo.homework.Homework;
import hu.ekreta.ellenorzo.homework.HomeworkDetailActivity;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001a"}, d2 = {"Lhu/ekreta/ellenorzo/reminder/ReminderItemHomework;", "Lhu/ekreta/ellenorzo/reminder/ReminderItem;", "model", "Lhu/ekreta/ellenorzo/homework/Homework;", "res", "Landroid/content/res/Resources;", "(Lhu/ekreta/ellenorzo/homework/Homework;Landroid/content/res/Resources;)V", "getModel", "()Lhu/ekreta/ellenorzo/homework/Homework;", "getRes", "()Landroid/content/res/Resources;", "component1", "component2", "copy", "equals", "", "other", "", "getDetailIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "hashCode", "", "toString", "", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: ReminderListItem.kt */
public final class ReminderItemHomework extends ReminderItem {
    public final Homework f;

    /* renamed from: g  reason: collision with root package name */
    public final Resources f6060g;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ReminderItemHomework(hu.ekreta.ellenorzo.homework.Homework r8, android.content.res.Resources r9) {
        /*
            r7 = this;
            java.lang.String r0 = "model"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
            java.lang.String r0 = "res"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r9, r0)
            r0 = 2131689616(0x7f0f0090, float:1.9008252E38)
            java.lang.String r2 = r9.getString(r0)
            java.lang.String r0 = "res.getString(R.string.HomeworkDetail_Page_Title)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r0)
            java.lang.String r3 = r8.m()
            java.util.Calendar r4 = r8.h()
            r5 = 2131165352(0x7f0700a8, float:1.7944919E38)
            r6 = 0
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r7.f = r8
            r7.f6060g = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.reminder.ReminderItemHomework.<init>(hu.ekreta.ellenorzo.homework.Homework, android.content.res.Resources):void");
    }

    public static /* synthetic */ ReminderItemHomework copy$default(ReminderItemHomework reminderItemHomework, Homework homework, Resources resources, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            homework = reminderItemHomework.f;
        }
        if ((i2 & 2) != 0) {
            resources = reminderItemHomework.f6060g;
        }
        return reminderItemHomework.a(homework, resources);
    }

    public Intent a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intent intent = new Intent(context, HomeworkDetailActivity.class);
        ExtensionsKt.a(intent, this.f);
        return intent;
    }

    public final ReminderItemHomework a(Homework homework, Resources resources) {
        Intrinsics.checkParameterIsNotNull(homework, "model");
        Intrinsics.checkParameterIsNotNull(resources, "res");
        return new ReminderItemHomework(homework, resources);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReminderItemHomework)) {
            return false;
        }
        ReminderItemHomework reminderItemHomework = (ReminderItemHomework) obj;
        return Intrinsics.areEqual((Object) this.f, (Object) reminderItemHomework.f) && Intrinsics.areEqual((Object) this.f6060g, (Object) reminderItemHomework.f6060g);
    }

    public final Homework f() {
        return this.f;
    }

    public int hashCode() {
        Homework homework = this.f;
        int i2 = 0;
        int hashCode = (homework != null ? homework.hashCode() : 0) * 31;
        Resources resources = this.f6060g;
        if (resources != null) {
            i2 = resources.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("ReminderItemHomework(model=");
        a2.append(this.f);
        a2.append(", res=");
        a2.append(this.f6060g);
        a2.append(")");
        return a2.toString();
    }
}
