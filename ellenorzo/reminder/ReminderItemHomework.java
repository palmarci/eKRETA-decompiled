package p289hu.ekreta.ellenorzo.reminder;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.homework.Homework;
import p289hu.ekreta.ellenorzo.homework.HomeworkDetailActivity;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001a"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/reminder/ReminderItemHomework;", "Lhu/ekreta/ellenorzo/reminder/ReminderItem;", "model", "Lhu/ekreta/ellenorzo/homework/Homework;", "res", "Landroid/content/res/Resources;", "(Lhu/ekreta/ellenorzo/homework/Homework;Landroid/content/res/Resources;)V", "getModel", "()Lhu/ekreta/ellenorzo/homework/Homework;", "getRes", "()Landroid/content/res/Resources;", "component1", "component2", "copy", "equals", "", "other", "", "getDetailIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "hashCode", "", "toString", "", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.reminder.ReminderItemHomework */
/* compiled from: ReminderListItem.kt */
public final class ReminderItemHomework extends ReminderItem {

    /* renamed from: f */
    public final Homework f14647f;

    /* renamed from: g */
    public final Resources f14648g;

    public ReminderItemHomework(Homework homework, Resources resources) {
        Intrinsics.checkParameterIsNotNull(homework, "model");
        Intrinsics.checkParameterIsNotNull(resources, "res");
        String string = resources.getString(C4014R.string.HomeworkDetail_Page_Title);
        Intrinsics.checkExpressionValueIsNotNull(string, "res.getString(R.string.HomeworkDetail_Page_Title)");
        super(string, homework.mo12914m(), homework.mo12908h(), C4014R.C4015drawable.hf_icon, null);
        this.f14647f = homework;
        this.f14648g = resources;
    }

    public static /* synthetic */ ReminderItemHomework copy$default(ReminderItemHomework reminderItemHomework, Homework homework, Resources resources, int i, Object obj) {
        if ((i & 1) != 0) {
            homework = reminderItemHomework.f14647f;
        }
        if ((i & 2) != 0) {
            resources = reminderItemHomework.f14648g;
        }
        return reminderItemHomework.mo14296a(homework, resources);
    }

    /* renamed from: a */
    public Intent mo14291a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intent intent = new Intent(context, HomeworkDetailActivity.class);
        ExtensionsKt.m14640a(intent, this.f14647f);
        return intent;
    }

    /* renamed from: a */
    public final ReminderItemHomework mo14296a(Homework homework, Resources resources) {
        Intrinsics.checkParameterIsNotNull(homework, "model");
        Intrinsics.checkParameterIsNotNull(resources, "res");
        return new ReminderItemHomework(homework, resources);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f14648g, (java.lang.Object) r3.f14648g) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.reminder.ReminderItemHomework
            if (r0 == 0) goto L_0x001d
            hu.ekreta.ellenorzo.reminder.ReminderItemHomework r3 = (p289hu.ekreta.ellenorzo.reminder.ReminderItemHomework) r3
            hu.ekreta.ellenorzo.homework.Homework r0 = r2.f14647f
            hu.ekreta.ellenorzo.homework.Homework r1 = r3.f14647f
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x001d
            android.content.res.Resources r0 = r2.f14648g
            android.content.res.Resources r3 = r3.f14648g
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.reminder.ReminderItemHomework.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Homework homework = this.f14647f;
        int i = 0;
        int hashCode = (homework != null ? homework.hashCode() : 0) * 31;
        Resources resources = this.f14648g;
        if (resources != null) {
            i = resources.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("ReminderItemHomework(model=");
        a.append(this.f14647f);
        a.append(", res=");
        a.append(this.f14648g);
        a.append(")");
        return a.toString();
    }
}
