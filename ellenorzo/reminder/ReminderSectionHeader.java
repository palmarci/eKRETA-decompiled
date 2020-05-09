package p289hu.ekreta.ellenorzo.reminder;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\t\u0010\u0015\u001a\u00020\bHÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/reminder/ReminderSectionHeader;", "Lhu/ekreta/ellenorzo/reminder/ReminderListItem;", "title", "", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "viewType", "", "getViewType", "()I", "component1", "copy", "equals", "", "other", "", "getDetailIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "hashCode", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.reminder.ReminderSectionHeader */
/* compiled from: ReminderListItem.kt */
public final class ReminderSectionHeader extends ReminderListItem {

    /* renamed from: a */
    public final int f14649a;

    /* renamed from: b */
    public final String f14650b;

    public ReminderSectionHeader(String str) {
        Intrinsics.checkParameterIsNotNull(str, "title");
        super(null);
        this.f14650b = str;
    }

    public static /* synthetic */ ReminderSectionHeader copy$default(ReminderSectionHeader reminderSectionHeader, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reminderSectionHeader.f14650b;
        }
        return reminderSectionHeader.mo14300a(str);
    }

    /* renamed from: a */
    public int mo14285a() {
        return this.f14649a;
    }

    /* renamed from: a */
    public Intent mo14291a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return null;
    }

    /* renamed from: a */
    public final ReminderSectionHeader mo14300a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "title");
        return new ReminderSectionHeader(str);
    }

    /* renamed from: b */
    public final String mo14301b() {
        return this.f14650b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f14650b, (java.lang.Object) ((p289hu.ekreta.ellenorzo.reminder.ReminderSectionHeader) r2).f14650b) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof p289hu.ekreta.ellenorzo.reminder.ReminderSectionHeader
            if (r0 == 0) goto L_0x0013
            hu.ekreta.ellenorzo.reminder.ReminderSectionHeader r2 = (p289hu.ekreta.ellenorzo.reminder.ReminderSectionHeader) r2
            java.lang.String r0 = r1.f14650b
            java.lang.String r2 = r2.f14650b
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
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.reminder.ReminderSectionHeader.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.f14650b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return C0082a.m106a(C0082a.m111a("ReminderSectionHeader(title="), this.f14650b, ")");
    }
}
