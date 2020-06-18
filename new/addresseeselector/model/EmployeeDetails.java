package hu.ekreta.ellenorzo.addresseeselector.model;

import a.b.a.a.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003JV\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0004\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0006\u0010\u000eR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0013\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006\""}, d2 = {"Lhu/ekreta/ellenorzo/addresseeselector/model/EmployeeDetails;", "", "kretaId", "", "isClassMaster", "", "isDeputyClassMaster", "educationClass", "", "name", "title", "(Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEducationClass", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getKretaId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getName", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lhu/ekreta/ellenorzo/addresseeselector/model/EmployeeDetails;", "equals", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: EmployeeDetails.kt */
public final class EmployeeDetails {

    /* renamed from: a  reason: collision with root package name */
    public final Long f4975a;
    public final Boolean b;
    public final Boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final String f4976d;
    public final String e;
    public final String f;

    public EmployeeDetails(Long l2, Boolean bool, Boolean bool2, String str, String str2, String str3) {
        this.f4975a = l2;
        this.b = bool;
        this.c = bool2;
        this.f4976d = str;
        this.e = str2;
        this.f = str3;
    }

    public static /* synthetic */ EmployeeDetails copy$default(EmployeeDetails employeeDetails, Long l2, Boolean bool, Boolean bool2, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            l2 = employeeDetails.f4975a;
        }
        if ((i2 & 2) != 0) {
            bool = employeeDetails.b;
        }
        Boolean bool3 = bool;
        if ((i2 & 4) != 0) {
            bool2 = employeeDetails.c;
        }
        Boolean bool4 = bool2;
        if ((i2 & 8) != 0) {
            str = employeeDetails.f4976d;
        }
        String str4 = str;
        if ((i2 & 16) != 0) {
            str2 = employeeDetails.e;
        }
        String str5 = str2;
        if ((i2 & 32) != 0) {
            str3 = employeeDetails.f;
        }
        return employeeDetails.a(l2, bool3, bool4, str4, str5, str3);
    }

    public final EmployeeDetails a(Long l2, Boolean bool, Boolean bool2, String str, String str2, String str3) {
        return new EmployeeDetails(l2, bool, bool2, str, str2, str3);
    }

    public final String a() {
        return this.f4976d;
    }

    public final Long b() {
        return this.f4975a;
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.f;
    }

    public final Boolean e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmployeeDetails)) {
            return false;
        }
        EmployeeDetails employeeDetails = (EmployeeDetails) obj;
        return Intrinsics.areEqual((Object) this.f4975a, (Object) employeeDetails.f4975a) && Intrinsics.areEqual((Object) this.b, (Object) employeeDetails.b) && Intrinsics.areEqual((Object) this.c, (Object) employeeDetails.c) && Intrinsics.areEqual((Object) this.f4976d, (Object) employeeDetails.f4976d) && Intrinsics.areEqual((Object) this.e, (Object) employeeDetails.e) && Intrinsics.areEqual((Object) this.f, (Object) employeeDetails.f);
    }

    public final Boolean f() {
        return this.c;
    }

    public int hashCode() {
        Long l2 = this.f4975a;
        int i2 = 0;
        int hashCode = (l2 != null ? l2.hashCode() : 0) * 31;
        Boolean bool = this.b;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.c;
        int hashCode3 = (hashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        String str = this.f4976d;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.e;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode5 + i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("EmployeeDetails(kretaId=");
        a2.append(this.f4975a);
        a2.append(", isClassMaster=");
        a2.append(this.b);
        a2.append(", isDeputyClassMaster=");
        a2.append(this.c);
        a2.append(", educationClass=");
        a2.append(this.f4976d);
        a2.append(", name=");
        a2.append(this.e);
        a2.append(", title=");
        return a.a(a2, this.f, ")");
    }
}
