package hu.ekreta.ellenorzo.addresseeselector.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\b\u0010\u001c\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001d"}, d2 = {"Lhu/ekreta/ellenorzo/addresseeselector/model/AddresseeType;", "", "id", "", "code", "", "shortName", "name", "description", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getDescription", "getId", "()J", "getName", "getShortName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: AddresseeType.kt */
public final class AddresseeType {

    /* renamed from: a  reason: collision with root package name */
    public final long f4973a;
    public final String b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final String f4974d;
    public final String e;

    public AddresseeType(long j2, String str, String str2, String str3, String str4) {
        Intrinsics.checkParameterIsNotNull(str, "code");
        Intrinsics.checkParameterIsNotNull(str2, "shortName");
        Intrinsics.checkParameterIsNotNull(str3, "name");
        Intrinsics.checkParameterIsNotNull(str4, "description");
        this.f4973a = j2;
        this.b = str;
        this.c = str2;
        this.f4974d = str3;
        this.e = str4;
    }

    public static /* synthetic */ AddresseeType copy$default(AddresseeType addresseeType, long j2, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = addresseeType.f4973a;
        }
        long j3 = j2;
        if ((i2 & 2) != 0) {
            str = addresseeType.b;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = addresseeType.c;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = addresseeType.f4974d;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = addresseeType.e;
        }
        return addresseeType.a(j3, str5, str6, str7, str4);
    }

    public final AddresseeType a(long j2, String str, String str2, String str3, String str4) {
        Intrinsics.checkParameterIsNotNull(str, "code");
        Intrinsics.checkParameterIsNotNull(str2, "shortName");
        Intrinsics.checkParameterIsNotNull(str3, "name");
        Intrinsics.checkParameterIsNotNull(str4, "description");
        return new AddresseeType(j2, str, str2, str3, str4);
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.e;
    }

    public final long c() {
        return this.f4973a;
    }

    public final String d() {
        return this.f4974d;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AddresseeType) {
                AddresseeType addresseeType = (AddresseeType) obj;
                if (!(this.f4973a == addresseeType.f4973a) || !Intrinsics.areEqual((Object) this.b, (Object) addresseeType.b) || !Intrinsics.areEqual((Object) this.c, (Object) addresseeType.c) || !Intrinsics.areEqual((Object) this.f4974d, (Object) addresseeType.f4974d) || !Intrinsics.areEqual((Object) this.e, (Object) addresseeType.e)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j2 = this.f4973a;
        int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        String str = this.b;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f4974d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.e;
        if (str4 != null) {
            i3 = str4.hashCode();
        }
        return hashCode3 + i3;
    }

    public String toString() {
        return this.c;
    }
}
