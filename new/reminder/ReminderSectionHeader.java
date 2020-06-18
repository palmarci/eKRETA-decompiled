package hu.ekreta.ellenorzo.reminder;

import a.b.a.a.a;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\t\u0010\u0015\u001a\u00020\bHÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lhu/ekreta/ellenorzo/reminder/ReminderSectionHeader;", "Lhu/ekreta/ellenorzo/reminder/ReminderListItem;", "title", "", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "viewType", "", "getViewType", "()I", "component1", "copy", "equals", "", "other", "", "getDetailIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "hashCode", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: ReminderListItem.kt */
public final class ReminderSectionHeader extends ReminderListItem {

    /* renamed from: a  reason: collision with root package name */
    public final int f6061a;
    public final String b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReminderSectionHeader(String str) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkParameterIsNotNull(str, "title");
        this.b = str;
    }

    public static /* synthetic */ ReminderSectionHeader copy$default(ReminderSectionHeader reminderSectionHeader, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = reminderSectionHeader.b;
        }
        return reminderSectionHeader.a(str);
    }

    public int a() {
        return this.f6061a;
    }

    public Intent a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return null;
    }

    public final ReminderSectionHeader a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "title");
        return new ReminderSectionHeader(str);
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ReminderSectionHeader) && Intrinsics.areEqual((Object) this.b, (Object) ((ReminderSectionHeader) obj).b);
        }
        return true;
    }

    public int hashCode() {
        String str = this.b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return a.a(a.a("ReminderSectionHeader(title="), this.b, ")");
    }
}
