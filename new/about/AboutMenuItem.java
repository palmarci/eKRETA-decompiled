package hu.ekreta.ellenorzo.about;

import a.b.a.a.a;
import hu.ekreta.ellenorzo.main.MainMenuItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lhu/ekreta/ellenorzo/about/AboutMenuItem;", "", "id", "Lhu/ekreta/ellenorzo/main/MainMenuItem;", "imageResource", "", "text", "(Lhu/ekreta/ellenorzo/main/MainMenuItem;II)V", "getId", "()Lhu/ekreta/ellenorzo/main/MainMenuItem;", "getImageResource", "()I", "getText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: AboutMenuItem.kt */
public final class AboutMenuItem {

    /* renamed from: a  reason: collision with root package name */
    public final MainMenuItem f4970a;
    public final int b;
    public final int c;

    public AboutMenuItem(MainMenuItem mainMenuItem, int i2, int i3) {
        Intrinsics.checkParameterIsNotNull(mainMenuItem, "id");
        this.f4970a = mainMenuItem;
        this.b = i2;
        this.c = i3;
    }

    public static /* synthetic */ AboutMenuItem copy$default(AboutMenuItem aboutMenuItem, MainMenuItem mainMenuItem, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            mainMenuItem = aboutMenuItem.f4970a;
        }
        if ((i4 & 2) != 0) {
            i2 = aboutMenuItem.b;
        }
        if ((i4 & 4) != 0) {
            i3 = aboutMenuItem.c;
        }
        return aboutMenuItem.a(mainMenuItem, i2, i3);
    }

    public final AboutMenuItem a(MainMenuItem mainMenuItem, int i2, int i3) {
        Intrinsics.checkParameterIsNotNull(mainMenuItem, "id");
        return new AboutMenuItem(mainMenuItem, i2, i3);
    }

    public final MainMenuItem a() {
        return this.f4970a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AboutMenuItem) {
                AboutMenuItem aboutMenuItem = (AboutMenuItem) obj;
                if (Intrinsics.areEqual((Object) this.f4970a, (Object) aboutMenuItem.f4970a)) {
                    if (this.b == aboutMenuItem.b) {
                        if (this.c == aboutMenuItem.c) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        MainMenuItem mainMenuItem = this.f4970a;
        return ((((mainMenuItem != null ? mainMenuItem.hashCode() : 0) * 31) + this.b) * 31) + this.c;
    }

    public String toString() {
        StringBuilder a2 = a.a("AboutMenuItem(id=");
        a2.append(this.f4970a);
        a2.append(", imageResource=");
        a2.append(this.b);
        a2.append(", text=");
        return a.a(a2, this.c, ")");
    }
}
