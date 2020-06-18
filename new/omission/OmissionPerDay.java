package hu.ekreta.ellenorzo.omission;

import a.b.a.a.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.c.a.d;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lhu/ekreta/ellenorzo/omission/OmissionPerDay;", "", "calendar", "Lorg/threeten/bp/LocalDate;", "omissions", "", "Lhu/ekreta/ellenorzo/omission/Omission;", "(Lorg/threeten/bp/LocalDate;Ljava/util/List;)V", "getCalendar", "()Lorg/threeten/bp/LocalDate;", "getOmissions", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: Omission.kt */
public final class OmissionPerDay {

    /* renamed from: a  reason: collision with root package name */
    public final d f5950a;
    public final List<Omission> b;

    public OmissionPerDay(d dVar, List<Omission> list) {
        Intrinsics.checkParameterIsNotNull(dVar, "calendar");
        Intrinsics.checkParameterIsNotNull(list, "omissions");
        this.f5950a = dVar;
        this.b = list;
    }

    public static /* synthetic */ OmissionPerDay copy$default(OmissionPerDay omissionPerDay, d dVar, List<Omission> list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            dVar = omissionPerDay.f5950a;
        }
        if ((i2 & 2) != 0) {
            list = omissionPerDay.b;
        }
        return omissionPerDay.a(dVar, list);
    }

    public final OmissionPerDay a(d dVar, List<Omission> list) {
        Intrinsics.checkParameterIsNotNull(dVar, "calendar");
        Intrinsics.checkParameterIsNotNull(list, "omissions");
        return new OmissionPerDay(dVar, list);
    }

    public final d a() {
        return this.f5950a;
    }

    public final List<Omission> b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OmissionPerDay)) {
            return false;
        }
        OmissionPerDay omissionPerDay = (OmissionPerDay) obj;
        return Intrinsics.areEqual((Object) this.f5950a, (Object) omissionPerDay.f5950a) && Intrinsics.areEqual((Object) this.b, (Object) omissionPerDay.b);
    }

    public int hashCode() {
        d dVar = this.f5950a;
        int i2 = 0;
        int hashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
        List<Omission> list = this.b;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("OmissionPerDay(calendar=");
        a2.append(this.f5950a);
        a2.append(", omissions=");
        return a.a(a2, (List) this.b, ")");
    }
}
