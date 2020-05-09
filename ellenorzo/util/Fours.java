package p289hu.ekreta.ellenorzo.util;

import java.io.Serializable;
import kotlin.Metadata;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u0001*\u0006\b\u0003\u0010\u0004 \u00012\u00020\u0005B%\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00028\u0001\u0012\u0006\u0010\b\u001a\u00028\u0002\u0012\u0006\u0010\t\u001a\u00028\u0003¢\u0006\u0002\u0010\nJ\u000e\u0010\u0011\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\fJ\u000e\u0010\u0012\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\fJ\u000e\u0010\u0013\u001a\u00028\u0002HÆ\u0003¢\u0006\u0002\u0010\fJ\u000e\u0010\u0014\u001a\u00028\u0003HÆ\u0003¢\u0006\u0002\u0010\fJN\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u00002\b\b\u0002\u0010\u0007\u001a\u00028\u00012\b\b\u0002\u0010\b\u001a\u00028\u00022\b\b\u0002\u0010\t\u001a\u00028\u0003HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u0013\u0010\u0006\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\t\u001a\u00028\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0007\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\b\u001a\u00028\u0002¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0010\u0010\f¨\u0006\u001f"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/util/Fours;", "A", "B", "C", "D", "Ljava/io/Serializable;", "first", "second", "third", "fourth", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "getFirst", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getFourth", "getSecond", "getThird", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lhu/ekreta/ellenorzo/util/Fours;", "equals", "", "other", "", "hashCode", "", "toString", "", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.Fours */
/* compiled from: Fours.kt */
public final class Fours<A, B, C, D> implements Serializable {

    /* renamed from: c */
    public final A f15355c;

    /* renamed from: e */
    public final B f15356e;

    /* renamed from: f */
    public final C f15357f;

    /* renamed from: g */
    public final D f15358g;

    public Fours(A a, B b, C c, D d) {
        this.f15355c = a;
        this.f15356e = b;
        this.f15357f = c;
        this.f15358g = d;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Object, code=A, for r1v0, types: [java.lang.Object] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Object, code=B, for r2v0, types: [java.lang.Object] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Object, code=C, for r3v0, types: [java.lang.Object] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Object, code=D, for r4v0, types: [java.lang.Object] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ p289hu.ekreta.ellenorzo.util.Fours copy$default(p289hu.ekreta.ellenorzo.util.Fours r0, A r1, B r2, C r3, D r4, int r5, java.lang.Object r6) {
        /*
            r6 = r5 & 1
            if (r6 == 0) goto L_0x0006
            A r1 = r0.f15355c
        L_0x0006:
            r6 = r5 & 2
            if (r6 == 0) goto L_0x000c
            B r2 = r0.f15356e
        L_0x000c:
            r6 = r5 & 4
            if (r6 == 0) goto L_0x0012
            C r3 = r0.f15357f
        L_0x0012:
            r5 = r5 & 8
            if (r5 == 0) goto L_0x0018
            D r4 = r0.f15358g
        L_0x0018:
            hu.ekreta.ellenorzo.util.Fours r0 = r0.mo16285a(r1, r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.util.Fours.copy$default(hu.ekreta.ellenorzo.util.Fours, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, int, java.lang.Object):hu.ekreta.ellenorzo.util.Fours");
    }

    /* renamed from: a */
    public final Fours<A, B, C, D> mo16285a(A a, B b, C c, D d) {
        return new Fours<>(a, b, c, d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f15358g, (java.lang.Object) r3.f15358g) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.util.Fours
            if (r0 == 0) goto L_0x0031
            hu.ekreta.ellenorzo.util.Fours r3 = (p289hu.ekreta.ellenorzo.util.Fours) r3
            A r0 = r2.f15355c
            A r1 = r3.f15355c
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            B r0 = r2.f15356e
            B r1 = r3.f15356e
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            C r0 = r2.f15357f
            C r1 = r3.f15357f
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            D r0 = r2.f15358g
            D r3 = r3.f15358g
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.util.Fours.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        A a = this.f15355c;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f15356e;
        int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
        C c = this.f15357f;
        int hashCode3 = (hashCode2 + (c != null ? c.hashCode() : 0)) * 31;
        D d = this.f15358g;
        if (d != null) {
            i = d.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(this.f15355c);
        String str = ", ";
        sb.append(str);
        sb.append(this.f15356e);
        sb.append(str);
        sb.append(this.f15357f);
        sb.append(str);
        sb.append(this.f15358g);
        sb.append(')');
        return sb.toString();
    }
}
