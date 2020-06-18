package hu.ekreta.ellenorzo.util;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u0001*\u0006\b\u0003\u0010\u0004 \u00012\u00020\u0005B%\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00028\u0001\u0012\u0006\u0010\b\u001a\u00028\u0002\u0012\u0006\u0010\t\u001a\u00028\u0003¢\u0006\u0002\u0010\nJ\u000e\u0010\u0011\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\fJ\u000e\u0010\u0012\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\fJ\u000e\u0010\u0013\u001a\u00028\u0002HÆ\u0003¢\u0006\u0002\u0010\fJ\u000e\u0010\u0014\u001a\u00028\u0003HÆ\u0003¢\u0006\u0002\u0010\fJN\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u00002\b\b\u0002\u0010\u0007\u001a\u00028\u00012\b\b\u0002\u0010\b\u001a\u00028\u00022\b\b\u0002\u0010\t\u001a\u00028\u0003HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u0013\u0010\u0006\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\t\u001a\u00028\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0007\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\b\u001a\u00028\u0002¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0010\u0010\f¨\u0006\u001f"}, d2 = {"Lhu/ekreta/ellenorzo/util/Fours;", "A", "B", "C", "D", "Ljava/io/Serializable;", "first", "second", "third", "fourth", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "getFirst", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getFourth", "getSecond", "getThird", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lhu/ekreta/ellenorzo/util/Fours;", "equals", "", "other", "", "hashCode", "", "toString", "", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: Fours.kt */
public final class Fours<A, B, C, D> implements Serializable {
    public final A c;
    public final B e;
    public final C f;

    /* renamed from: g  reason: collision with root package name */
    public final D f6292g;

    public Fours(A a2, B b, C c2, D d2) {
        this.c = a2;
        this.e = b;
        this.f = c2;
        this.f6292g = d2;
    }

    public static /* synthetic */ Fours copy$default(Fours fours, A a2, B b, C c2, D d2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            a2 = fours.c;
        }
        if ((i2 & 2) != 0) {
            b = fours.e;
        }
        if ((i2 & 4) != 0) {
            c2 = fours.f;
        }
        if ((i2 & 8) != 0) {
            d2 = fours.f6292g;
        }
        return fours.a(a2, b, c2, d2);
    }

    public final Fours<A, B, C, D> a(A a2, B b, C c2, D d2) {
        return new Fours<>(a2, b, c2, d2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fours)) {
            return false;
        }
        Fours fours = (Fours) obj;
        return Intrinsics.areEqual((Object) this.c, (Object) fours.c) && Intrinsics.areEqual((Object) this.e, (Object) fours.e) && Intrinsics.areEqual((Object) this.f, (Object) fours.f) && Intrinsics.areEqual((Object) this.f6292g, (Object) fours.f6292g);
    }

    public int hashCode() {
        A a2 = this.c;
        int i2 = 0;
        int hashCode = (a2 != null ? a2.hashCode() : 0) * 31;
        B b = this.e;
        int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
        C c2 = this.f;
        int hashCode3 = (hashCode2 + (c2 != null ? c2.hashCode() : 0)) * 31;
        D d2 = this.f6292g;
        if (d2 != null) {
            i2 = d2.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        return '(' + this.c + ", " + this.e + ", " + this.f + ", " + this.f6292g + ')';
    }
}
