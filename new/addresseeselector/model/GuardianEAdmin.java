package hu.ekreta.ellenorzo.addresseeselector.model;

import a.b.a.a.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003JJ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001f"}, d2 = {"Lhu/ekreta/ellenorzo/addresseeselector/model/GuardianEAdmin;", "", "kretaId", "", "guardianName", "", "studentName", "studentClass", "relationType", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getGuardianName", "()Ljava/lang/String;", "getKretaId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRelationType", "getStudentClass", "getStudentName", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lhu/ekreta/ellenorzo/addresseeselector/model/GuardianEAdmin;", "equals", "", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: GuardianEAdmin.kt */
public final class GuardianEAdmin {

    /* renamed from: a  reason: collision with root package name */
    public final Long f4977a;
    public final String b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final String f4978d;
    public final String e;

    public GuardianEAdmin(Long l2, String str, String str2, String str3, String str4) {
        this.f4977a = l2;
        this.b = str;
        this.c = str2;
        this.f4978d = str3;
        this.e = str4;
    }

    public static /* synthetic */ GuardianEAdmin copy$default(GuardianEAdmin guardianEAdmin, Long l2, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            l2 = guardianEAdmin.f4977a;
        }
        if ((i2 & 2) != 0) {
            str = guardianEAdmin.b;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = guardianEAdmin.c;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = guardianEAdmin.f4978d;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = guardianEAdmin.e;
        }
        return guardianEAdmin.a(l2, str5, str6, str7, str4);
    }

    public final GuardianEAdmin a(Long l2, String str, String str2, String str3, String str4) {
        return new GuardianEAdmin(l2, str, str2, str3, str4);
    }

    public final String a() {
        return this.b;
    }

    public final Long b() {
        return this.f4977a;
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.f4978d;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GuardianEAdmin)) {
            return false;
        }
        GuardianEAdmin guardianEAdmin = (GuardianEAdmin) obj;
        return Intrinsics.areEqual((Object) this.f4977a, (Object) guardianEAdmin.f4977a) && Intrinsics.areEqual((Object) this.b, (Object) guardianEAdmin.b) && Intrinsics.areEqual((Object) this.c, (Object) guardianEAdmin.c) && Intrinsics.areEqual((Object) this.f4978d, (Object) guardianEAdmin.f4978d) && Intrinsics.areEqual((Object) this.e, (Object) guardianEAdmin.e);
    }

    public int hashCode() {
        Long l2 = this.f4977a;
        int i2 = 0;
        int hashCode = (l2 != null ? l2.hashCode() : 0) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f4978d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.e;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode4 + i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("GuardianEAdmin(kretaId=");
        a2.append(this.f4977a);
        a2.append(", guardianName=");
        a2.append(this.b);
        a2.append(", studentName=");
        a2.append(this.c);
        a2.append(", studentClass=");
        a2.append(this.f4978d);
        a2.append(", relationType=");
        return a.a(a2, this.e, ")");
    }
}
