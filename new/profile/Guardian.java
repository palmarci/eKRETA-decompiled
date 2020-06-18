package hu.ekreta.ellenorzo.profile;

import a.b.a.a.a;
import hu.ekreta.ellenorzo.util.mapper.ProfileSpecificModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001c"}, d2 = {"Lhu/ekreta/ellenorzo/profile/Guardian;", "Lhu/ekreta/ellenorzo/util/mapper/ProfileSpecificModel;", "profileId", "", "uid", "name", "email", "phoneNumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getName", "getPhoneNumber", "getProfileId", "getUid", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: Guardian.kt */
public final class Guardian implements ProfileSpecificModel {
    public final String c;
    public final String e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final String f5996g;

    /* renamed from: h  reason: collision with root package name */
    public final String f5997h;

    public Guardian(String str, String str2, String str3, String str4, String str5) {
        a.a(str, "profileId", str2, "uid", str3, "name");
        this.c = str;
        this.e = str2;
        this.f = str3;
        this.f5996g = str4;
        this.f5997h = str5;
    }

    public static /* synthetic */ Guardian copy$default(Guardian guardian, String str, String str2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = guardian.e();
        }
        if ((i2 & 2) != 0) {
            str2 = guardian.e;
        }
        String str6 = str2;
        if ((i2 & 4) != 0) {
            str3 = guardian.f;
        }
        String str7 = str3;
        if ((i2 & 8) != 0) {
            str4 = guardian.f5996g;
        }
        String str8 = str4;
        if ((i2 & 16) != 0) {
            str5 = guardian.f5997h;
        }
        return guardian.a(str, str6, str7, str8, str5);
    }

    public final Guardian a(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkParameterIsNotNull(str, "profileId");
        Intrinsics.checkParameterIsNotNull(str2, "uid");
        Intrinsics.checkParameterIsNotNull(str3, "name");
        return new Guardian(str, str2, str3, str4, str5);
    }

    public final String a() {
        return this.f5996g;
    }

    public final String b() {
        return this.f;
    }

    public final String c() {
        return this.f5997h;
    }

    public final String d() {
        return this.e;
    }

    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Guardian)) {
            return false;
        }
        Guardian guardian = (Guardian) obj;
        return Intrinsics.areEqual((Object) e(), (Object) guardian.e()) && Intrinsics.areEqual((Object) this.e, (Object) guardian.e) && Intrinsics.areEqual((Object) this.f, (Object) guardian.f) && Intrinsics.areEqual((Object) this.f5996g, (Object) guardian.f5996g) && Intrinsics.areEqual((Object) this.f5997h, (Object) guardian.f5997h);
    }

    public int hashCode() {
        String e2 = e();
        int i2 = 0;
        int hashCode = (e2 != null ? e2.hashCode() : 0) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f5996g;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f5997h;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode4 + i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("Guardian(profileId=");
        a2.append(e());
        a2.append(", uid=");
        a2.append(this.e);
        a2.append(", name=");
        a2.append(this.f);
        a2.append(", email=");
        a2.append(this.f5996g);
        a2.append(", phoneNumber=");
        return a.a(a2, this.f5997h, ")");
    }
}
