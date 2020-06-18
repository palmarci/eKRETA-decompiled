package hu.ekreta.ellenorzo.message;

import a.b.a.a.a;
import android.os.Parcel;
import android.os.Parcelable;
import h.w.v;
import hu.ekreta.ellenorzo.util.mapper.ProfileSpecificModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002BM\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0002\u0010\u000eJ\t\u0010\u001f\u001a\u00020\u0004HÆ\u0003J\t\u0010 \u001a\u00020\u0004HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0004HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003Jc\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0007HÆ\u0001J\b\u0010)\u001a\u00020*H\u0016J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020*HÖ\u0001J\t\u00100\u001a\u00020\u0007HÖ\u0001J\u0019\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020*HÖ\u0001R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\r\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016¨\u00066"}, d2 = {"Lhu/ekreta/ellenorzo/message/Addressee;", "Landroid/os/Parcelable;", "Lhu/ekreta/ellenorzo/util/mapper/ProfileSpecificModel;", "id", "", "kretaId", "name", "", "typeId", "typeCode", "typeShortName", "typeName", "typeDescription", "profileId", "(JJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()J", "setId", "(J)V", "getKretaId", "setKretaId", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getProfileId", "getTypeCode", "getTypeDescription", "getTypeId", "getTypeName", "getTypeShortName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: Message.kt */
public final class Addressee implements Parcelable, ProfileSpecificModel {
    public static final Parcelable.Creator CREATOR = new Creator();
    public long c;
    public long e;
    public String f;

    /* renamed from: g  reason: collision with root package name */
    public final long f5756g;

    /* renamed from: h  reason: collision with root package name */
    public final String f5757h;

    /* renamed from: i  reason: collision with root package name */
    public final String f5758i;

    /* renamed from: j  reason: collision with root package name */
    public final String f5759j;

    /* renamed from: k  reason: collision with root package name */
    public final String f5760k;

    /* renamed from: l  reason: collision with root package name */
    public final String f5761l;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static class Creator implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new Addressee(parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i2) {
            return new Addressee[i2];
        }
    }

    public Addressee(long j2, long j3, String str, long j4, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(str2, "typeCode");
        Intrinsics.checkParameterIsNotNull(str3, "typeShortName");
        Intrinsics.checkParameterIsNotNull(str4, "typeName");
        Intrinsics.checkParameterIsNotNull(str5, "typeDescription");
        Intrinsics.checkParameterIsNotNull(str6, "profileId");
        this.c = j2;
        this.e = j3;
        this.f = str;
        this.f5756g = j4;
        this.f5757h = str2;
        this.f5758i = str3;
        this.f5759j = str4;
        this.f5760k = str5;
        this.f5761l = str6;
    }

    public static /* synthetic */ Addressee copy$default(Addressee addressee, long j2, long j3, String str, long j4, String str2, String str3, String str4, String str5, String str6, int i2, Object obj) {
        Addressee addressee2 = addressee;
        int i3 = i2;
        return addressee.a((i3 & 1) != 0 ? addressee2.c : j2, (i3 & 2) != 0 ? addressee2.e : j3, (i3 & 4) != 0 ? addressee2.f : str, (i3 & 8) != 0 ? addressee2.f5756g : j4, (i3 & 16) != 0 ? addressee2.f5757h : str2, (i3 & 32) != 0 ? addressee2.f5758i : str3, (i3 & 64) != 0 ? addressee2.f5759j : str4, (i3 & 128) != 0 ? addressee2.f5760k : str5, (i3 & 256) != 0 ? addressee.e() : str6);
    }

    public final Addressee a(long j2, long j3, String str, long j4, String str2, String str3, String str4, String str5, String str6) {
        String str7 = str;
        Intrinsics.checkParameterIsNotNull(str7, "name");
        String str8 = str2;
        Intrinsics.checkParameterIsNotNull(str8, "typeCode");
        String str9 = str3;
        Intrinsics.checkParameterIsNotNull(str9, "typeShortName");
        String str10 = str4;
        Intrinsics.checkParameterIsNotNull(str10, "typeName");
        String str11 = str5;
        Intrinsics.checkParameterIsNotNull(str11, "typeDescription");
        String str12 = str6;
        Intrinsics.checkParameterIsNotNull(str12, "profileId");
        return new Addressee(j2, j3, str7, j4, str8, str9, str10, str11, str12);
    }

    public String a(Object obj) {
        return v.a((ProfileSpecificModel) this, obj);
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.f5761l;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Addressee) {
                Addressee addressee = (Addressee) obj;
                if (this.c == addressee.c) {
                    if ((this.e == addressee.e) && Intrinsics.areEqual((Object) this.f, (Object) addressee.f)) {
                        if (!(this.f5756g == addressee.f5756g) || !Intrinsics.areEqual((Object) this.f5757h, (Object) addressee.f5757h) || !Intrinsics.areEqual((Object) this.f5758i, (Object) addressee.f5758i) || !Intrinsics.areEqual((Object) this.f5759j, (Object) addressee.f5759j) || !Intrinsics.areEqual((Object) this.f5760k, (Object) addressee.f5760k) || !Intrinsics.areEqual((Object) e(), (Object) addressee.e())) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final long f() {
        return this.c;
    }

    public final long g() {
        return this.e;
    }

    public final String h() {
        return this.f;
    }

    public int hashCode() {
        long j2 = this.c;
        long j3 = this.e;
        int i2 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        String str = this.f;
        int i3 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        long j4 = this.f5756g;
        int i4 = (((i2 + hashCode) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        String str2 = this.f5757h;
        int hashCode2 = (i4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f5758i;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f5759j;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f5760k;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String e2 = e();
        if (e2 != null) {
            i3 = e2.hashCode();
        }
        return hashCode5 + i3;
    }

    public final String i() {
        return this.f5757h;
    }

    public final String j() {
        return this.f5760k;
    }

    public final long k() {
        return this.f5756g;
    }

    public final String l() {
        return this.f5759j;
    }

    public final String m() {
        return this.f5758i;
    }

    public String toString() {
        StringBuilder a2 = a.a("Addressee(id=");
        a2.append(this.c);
        a2.append(", kretaId=");
        a2.append(this.e);
        a2.append(", name=");
        a2.append(this.f);
        a2.append(", typeId=");
        a2.append(this.f5756g);
        a2.append(", typeCode=");
        a2.append(this.f5757h);
        a2.append(", typeShortName=");
        a2.append(this.f5758i);
        a2.append(", typeName=");
        a2.append(this.f5759j);
        a2.append(", typeDescription=");
        a2.append(this.f5760k);
        a2.append(", profileId=");
        a2.append(e());
        a2.append(")");
        return a2.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeLong(this.c);
        parcel.writeLong(this.e);
        parcel.writeString(this.f);
        parcel.writeLong(this.f5756g);
        parcel.writeString(this.f5757h);
        parcel.writeString(this.f5758i);
        parcel.writeString(this.f5759j);
        parcel.writeString(this.f5760k);
        parcel.writeString(this.f5761l);
    }
}
