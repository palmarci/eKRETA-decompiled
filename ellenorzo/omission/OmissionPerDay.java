package p289hu.ekreta.ellenorzo.omission;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p365o.p372c.p373a.C5639d;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/omission/OmissionPerDay;", "", "calendar", "Lorg/threeten/bp/LocalDate;", "omissions", "", "Lhu/ekreta/ellenorzo/omission/Omission;", "(Lorg/threeten/bp/LocalDate;Ljava/util/List;)V", "getCalendar", "()Lorg/threeten/bp/LocalDate;", "getOmissions", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.omission.OmissionPerDay */
/* compiled from: Omission.kt */
public final class OmissionPerDay {

    /* renamed from: a */
    public final C5639d f14390a;

    /* renamed from: b */
    public final List<Omission> f14391b;

    public OmissionPerDay(C5639d dVar, List<Omission> list) {
        Intrinsics.checkParameterIsNotNull(dVar, "calendar");
        Intrinsics.checkParameterIsNotNull(list, "omissions");
        this.f14390a = dVar;
        this.f14391b = list;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<hu.ekreta.ellenorzo.omission.Omission>, for r2v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ p289hu.ekreta.ellenorzo.omission.OmissionPerDay copy$default(p289hu.ekreta.ellenorzo.omission.OmissionPerDay r0, p365o.p372c.p373a.C5639d r1, java.util.List<p289hu.ekreta.ellenorzo.omission.Omission> r2, int r3, java.lang.Object r4) {
        /*
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0006
            o.c.a.d r1 = r0.f14390a
        L_0x0006:
            r3 = r3 & 2
            if (r3 == 0) goto L_0x000c
            java.util.List<hu.ekreta.ellenorzo.omission.Omission> r2 = r0.f14391b
        L_0x000c:
            hu.ekreta.ellenorzo.omission.OmissionPerDay r0 = r0.mo13900a(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.omission.OmissionPerDay.copy$default(hu.ekreta.ellenorzo.omission.OmissionPerDay, o.c.a.d, java.util.List, int, java.lang.Object):hu.ekreta.ellenorzo.omission.OmissionPerDay");
    }

    /* renamed from: a */
    public final OmissionPerDay mo13900a(C5639d dVar, List<Omission> list) {
        Intrinsics.checkParameterIsNotNull(dVar, "calendar");
        Intrinsics.checkParameterIsNotNull(list, "omissions");
        return new OmissionPerDay(dVar, list);
    }

    /* renamed from: a */
    public final C5639d mo13901a() {
        return this.f14390a;
    }

    /* renamed from: b */
    public final List<Omission> mo13902b() {
        return this.f14391b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f14391b, (java.lang.Object) r3.f14391b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.omission.OmissionPerDay
            if (r0 == 0) goto L_0x001d
            hu.ekreta.ellenorzo.omission.OmissionPerDay r3 = (p289hu.ekreta.ellenorzo.omission.OmissionPerDay) r3
            o.c.a.d r0 = r2.f14390a
            o.c.a.d r1 = r3.f14390a
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.util.List<hu.ekreta.ellenorzo.omission.Omission> r0 = r2.f14391b
            java.util.List<hu.ekreta.ellenorzo.omission.Omission> r3 = r3.f14391b
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
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.omission.OmissionPerDay.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        C5639d dVar = this.f14390a;
        int i = 0;
        int hashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
        List<Omission> list = this.f14391b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("OmissionPerDay(calendar=");
        a.append(this.f14390a);
        a.append(", omissions=");
        return C0082a.m108a(a, (List) this.f14391b, ")");
    }
}
