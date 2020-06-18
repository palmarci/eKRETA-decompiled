package hu.ekreta.ellenorzo.main.more;

import a.b.a.a.a;
import hu.ekreta.ellenorzo.main.MainMenuItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001b"}, d2 = {"Lhu/ekreta/ellenorzo/main/more/MoreMenuItem;", "", "id", "Lhu/ekreta/ellenorzo/main/MainMenuItem;", "imageResource", "", "text", "badgeCount", "", "(Lhu/ekreta/ellenorzo/main/MainMenuItem;IILjava/lang/String;)V", "getBadgeCount", "()Ljava/lang/String;", "getId", "()Lhu/ekreta/ellenorzo/main/MainMenuItem;", "getImageResource", "()I", "getText", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: MoreMenuItem.kt */
public final class MoreMenuItem {

    /* renamed from: a  reason: collision with root package name */
    public final MainMenuItem f5754a;
    public final int b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final String f5755d;

    public /* synthetic */ MoreMenuItem(MainMenuItem mainMenuItem, int i2, int i3, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i4 & 8) != 0 ? "" : str;
        Intrinsics.checkParameterIsNotNull(mainMenuItem, "id");
        Intrinsics.checkParameterIsNotNull(str, "badgeCount");
        this.f5754a = mainMenuItem;
        this.b = i2;
        this.c = i3;
        this.f5755d = str;
    }

    public static /* synthetic */ MoreMenuItem copy$default(MoreMenuItem moreMenuItem, MainMenuItem mainMenuItem, int i2, int i3, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            mainMenuItem = moreMenuItem.f5754a;
        }
        if ((i4 & 2) != 0) {
            i2 = moreMenuItem.b;
        }
        if ((i4 & 4) != 0) {
            i3 = moreMenuItem.c;
        }
        if ((i4 & 8) != 0) {
            str = moreMenuItem.f5755d;
        }
        return moreMenuItem.a(mainMenuItem, i2, i3, str);
    }

    public final MoreMenuItem a(MainMenuItem mainMenuItem, int i2, int i3, String str) {
        Intrinsics.checkParameterIsNotNull(mainMenuItem, "id");
        Intrinsics.checkParameterIsNotNull(str, "badgeCount");
        return new MoreMenuItem(mainMenuItem, i2, i3, str);
    }

    public final String a() {
        return this.f5755d;
    }

    public final MainMenuItem b() {
        return this.f5754a;
    }

    public final int c() {
        return this.b;
    }

    public final int d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MoreMenuItem) {
                MoreMenuItem moreMenuItem = (MoreMenuItem) obj;
                if (Intrinsics.areEqual((Object) this.f5754a, (Object) moreMenuItem.f5754a)) {
                    if (this.b == moreMenuItem.b) {
                        if (!(this.c == moreMenuItem.c) || !Intrinsics.areEqual((Object) this.f5755d, (Object) moreMenuItem.f5755d)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        MainMenuItem mainMenuItem = this.f5754a;
        int i2 = 0;
        int hashCode = (((((mainMenuItem != null ? mainMenuItem.hashCode() : 0) * 31) + this.b) * 31) + this.c) * 31;
        String str = this.f5755d;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("MoreMenuItem(id=");
        a2.append(this.f5754a);
        a2.append(", imageResource=");
        a2.append(this.b);
        a2.append(", text=");
        a2.append(this.c);
        a2.append(", badgeCount=");
        return a.a(a2, this.f5755d, ")");
    }

    public MoreMenuItem(MainMenuItem mainMenuItem, int i2, int i3, String str) {
        Intrinsics.checkParameterIsNotNull(mainMenuItem, "id");
        Intrinsics.checkParameterIsNotNull(str, "badgeCount");
        this.f5754a = mainMenuItem;
        this.b = i2;
        this.c = i3;
        this.f5755d = str;
    }
}
