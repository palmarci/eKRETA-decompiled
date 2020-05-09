package p289hu.ekreta.ellenorzo.main.more;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p289hu.ekreta.ellenorzo.main.MainMenuItem;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001b"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/main/more/MoreMenuItem;", "", "id", "Lhu/ekreta/ellenorzo/main/MainMenuItem;", "imageResource", "", "text", "badgeCount", "", "(Lhu/ekreta/ellenorzo/main/MainMenuItem;IILjava/lang/String;)V", "getBadgeCount", "()Ljava/lang/String;", "getId", "()Lhu/ekreta/ellenorzo/main/MainMenuItem;", "getImageResource", "()I", "getText", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.main.more.MoreMenuItem */
/* compiled from: MoreMenuItem.kt */
public final class MoreMenuItem {

    /* renamed from: a */
    public final MainMenuItem f13770a;

    /* renamed from: b */
    public final int f13771b;

    /* renamed from: c */
    public final int f13772c;

    /* renamed from: d */
    public final String f13773d;

    public /* synthetic */ MoreMenuItem(MainMenuItem mainMenuItem, int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i3 & 8) != 0) {
            str = "";
        }
        Intrinsics.checkParameterIsNotNull(mainMenuItem, "id");
        Intrinsics.checkParameterIsNotNull(str, "badgeCount");
        this.f13770a = mainMenuItem;
        this.f13771b = i;
        this.f13772c = i2;
        this.f13773d = str;
    }

    public static /* synthetic */ MoreMenuItem copy$default(MoreMenuItem moreMenuItem, MainMenuItem mainMenuItem, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            mainMenuItem = moreMenuItem.f13770a;
        }
        if ((i3 & 2) != 0) {
            i = moreMenuItem.f13771b;
        }
        if ((i3 & 4) != 0) {
            i2 = moreMenuItem.f13772c;
        }
        if ((i3 & 8) != 0) {
            str = moreMenuItem.f13773d;
        }
        return moreMenuItem.mo13221a(mainMenuItem, i, i2, str);
    }

    /* renamed from: a */
    public final MoreMenuItem mo13221a(MainMenuItem mainMenuItem, int i, int i2, String str) {
        Intrinsics.checkParameterIsNotNull(mainMenuItem, "id");
        Intrinsics.checkParameterIsNotNull(str, "badgeCount");
        return new MoreMenuItem(mainMenuItem, i, i2, str);
    }

    /* renamed from: a */
    public final String mo13222a() {
        return this.f13773d;
    }

    /* renamed from: b */
    public final MainMenuItem mo13223b() {
        return this.f13770a;
    }

    /* renamed from: c */
    public final int mo13224c() {
        return this.f13771b;
    }

    /* renamed from: d */
    public final int mo13225d() {
        return this.f13772c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MoreMenuItem) {
                MoreMenuItem moreMenuItem = (MoreMenuItem) obj;
                if (Intrinsics.areEqual((Object) this.f13770a, (Object) moreMenuItem.f13770a)) {
                    if (this.f13771b == moreMenuItem.f13771b) {
                        if (!(this.f13772c == moreMenuItem.f13772c) || !Intrinsics.areEqual((Object) this.f13773d, (Object) moreMenuItem.f13773d)) {
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
        MainMenuItem mainMenuItem = this.f13770a;
        int i = 0;
        int hashCode = (((((mainMenuItem != null ? mainMenuItem.hashCode() : 0) * 31) + this.f13771b) * 31) + this.f13772c) * 31;
        String str = this.f13773d;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("MoreMenuItem(id=");
        a.append(this.f13770a);
        a.append(", imageResource=");
        a.append(this.f13771b);
        a.append(", text=");
        a.append(this.f13772c);
        a.append(", badgeCount=");
        return C0082a.m106a(a, this.f13773d, ")");
    }

    public MoreMenuItem(MainMenuItem mainMenuItem, int i, int i2, String str) {
        Intrinsics.checkParameterIsNotNull(mainMenuItem, "id");
        Intrinsics.checkParameterIsNotNull(str, "badgeCount");
        this.f13770a = mainMenuItem;
        this.f13771b = i;
        this.f13772c = i2;
        this.f13773d = str;
    }
}
