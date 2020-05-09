package p289hu.ekreta.ellenorzo.about;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p289hu.ekreta.ellenorzo.main.MainMenuItem;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/about/AboutMenuItem;", "", "id", "Lhu/ekreta/ellenorzo/main/MainMenuItem;", "imageResource", "", "text", "(Lhu/ekreta/ellenorzo/main/MainMenuItem;II)V", "getId", "()Lhu/ekreta/ellenorzo/main/MainMenuItem;", "getImageResource", "()I", "getText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.about.AboutMenuItem */
/* compiled from: AboutMenuItem.kt */
public final class AboutMenuItem {

    /* renamed from: a */
    public final MainMenuItem f11039a;

    /* renamed from: b */
    public final int f11040b;

    /* renamed from: c */
    public final int f11041c;

    public AboutMenuItem(MainMenuItem mainMenuItem, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(mainMenuItem, "id");
        this.f11039a = mainMenuItem;
        this.f11040b = i;
        this.f11041c = i2;
    }

    public static /* synthetic */ AboutMenuItem copy$default(AboutMenuItem aboutMenuItem, MainMenuItem mainMenuItem, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            mainMenuItem = aboutMenuItem.f11039a;
        }
        if ((i3 & 2) != 0) {
            i = aboutMenuItem.f11040b;
        }
        if ((i3 & 4) != 0) {
            i2 = aboutMenuItem.f11041c;
        }
        return aboutMenuItem.mo11307a(mainMenuItem, i, i2);
    }

    /* renamed from: a */
    public final AboutMenuItem mo11307a(MainMenuItem mainMenuItem, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(mainMenuItem, "id");
        return new AboutMenuItem(mainMenuItem, i, i2);
    }

    /* renamed from: a */
    public final MainMenuItem mo11308a() {
        return this.f11039a;
    }

    /* renamed from: b */
    public final int mo11309b() {
        return this.f11040b;
    }

    /* renamed from: c */
    public final int mo11310c() {
        return this.f11041c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AboutMenuItem) {
                AboutMenuItem aboutMenuItem = (AboutMenuItem) obj;
                if (Intrinsics.areEqual((Object) this.f11039a, (Object) aboutMenuItem.f11039a)) {
                    if (this.f11040b == aboutMenuItem.f11040b) {
                        if (this.f11041c == aboutMenuItem.f11041c) {
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
        MainMenuItem mainMenuItem = this.f11039a;
        return ((((mainMenuItem != null ? mainMenuItem.hashCode() : 0) * 31) + this.f11040b) * 31) + this.f11041c;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("AboutMenuItem(id=");
        a.append(this.f11039a);
        a.append(", imageResource=");
        a.append(this.f11040b);
        a.append(", text=");
        return C0082a.m105a(a, this.f11041c, ")");
    }
}
