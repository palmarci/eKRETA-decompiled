package p289hu.ekreta.ellenorzo.reminder;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.announcedTest.AnnouncedTest;
import p289hu.ekreta.ellenorzo.announcedTest.AnnouncedTestDetailActivity;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0015"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/reminder/ReminderItemAnnouncedTest;", "Lhu/ekreta/ellenorzo/reminder/ReminderItem;", "model", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;", "(Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;)V", "getModel", "()Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;", "component1", "copy", "equals", "", "other", "", "getDetailIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "hashCode", "", "toString", "", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.reminder.ReminderItemAnnouncedTest */
/* compiled from: ReminderListItem.kt */
public final class ReminderItemAnnouncedTest extends ReminderItem {

    /* renamed from: f */
    public final AnnouncedTest f14646f;

    public ReminderItemAnnouncedTest(AnnouncedTest announcedTest) {
        Intrinsics.checkParameterIsNotNull(announcedTest, "model");
        super(announcedTest.mo11325j(), announcedTest.mo11329n(), announcedTest.mo11328m(), C4014R.C4015drawable.szamonkeres_icon, null);
        this.f14646f = announcedTest;
    }

    public static /* synthetic */ ReminderItemAnnouncedTest copy$default(ReminderItemAnnouncedTest reminderItemAnnouncedTest, AnnouncedTest announcedTest, int i, Object obj) {
        if ((i & 1) != 0) {
            announcedTest = reminderItemAnnouncedTest.f14646f;
        }
        return reminderItemAnnouncedTest.mo14292a(announcedTest);
    }

    /* renamed from: a */
    public Intent mo14291a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intent intent = new Intent(context, AnnouncedTestDetailActivity.class);
        ExtensionsKt.m14636a(intent, this.f14646f);
        return intent;
    }

    /* renamed from: a */
    public final ReminderItemAnnouncedTest mo14292a(AnnouncedTest announcedTest) {
        Intrinsics.checkParameterIsNotNull(announcedTest, "model");
        return new ReminderItemAnnouncedTest(announcedTest);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f14646f, (java.lang.Object) ((p289hu.ekreta.ellenorzo.reminder.ReminderItemAnnouncedTest) r2).f14646f) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof p289hu.ekreta.ellenorzo.reminder.ReminderItemAnnouncedTest
            if (r0 == 0) goto L_0x0013
            hu.ekreta.ellenorzo.reminder.ReminderItemAnnouncedTest r2 = (p289hu.ekreta.ellenorzo.reminder.ReminderItemAnnouncedTest) r2
            hu.ekreta.ellenorzo.announcedTest.AnnouncedTest r0 = r1.f14646f
            hu.ekreta.ellenorzo.announcedTest.AnnouncedTest r2 = r2.f14646f
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.reminder.ReminderItemAnnouncedTest.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        AnnouncedTest announcedTest = this.f14646f;
        if (announcedTest != null) {
            return announcedTest.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("ReminderItemAnnouncedTest(model=");
        a.append(this.f14646f);
        a.append(")");
        return a.toString();
    }
}
