package p289hu.ekreta.ellenorzo.message;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.util.mapper.ProfileSpecificModel;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002BM\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0002\u0010\u000eJ\t\u0010\u001f\u001a\u00020\u0004HÆ\u0003J\t\u0010 \u001a\u00020\u0004HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0004HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003Jc\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0007HÆ\u0001J\b\u0010)\u001a\u00020*H\u0016J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020*HÖ\u0001J\t\u00100\u001a\u00020\u0007HÖ\u0001J\u0019\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020*HÖ\u0001R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\r\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016¨\u00066"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/message/Addressee;", "Landroid/os/Parcelable;", "Lhu/ekreta/ellenorzo/util/mapper/ProfileSpecificModel;", "id", "", "kretaId", "name", "", "typeId", "typeCode", "typeShortName", "typeName", "typeDescription", "profileId", "(JJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()J", "setId", "(J)V", "getKretaId", "setKretaId", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getProfileId", "getTypeCode", "getTypeDescription", "getTypeId", "getTypeName", "getTypeShortName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.message.Addressee */
/* compiled from: Message.kt */
public final class Addressee implements Parcelable, ProfileSpecificModel {
    public static final android.os.Parcelable.Creator CREATOR = new Creator();

    /* renamed from: c */
    public long f13774c;

    /* renamed from: e */
    public long f13775e;

    /* renamed from: f */
    public String f13776f;

    /* renamed from: g */
    public final long f13777g;

    /* renamed from: h */
    public final String f13778h;

    /* renamed from: i */
    public final String f13779i;

    /* renamed from: j */
    public final String f13780j;

    /* renamed from: k */
    public final String f13781k;

    /* renamed from: l */
    public final String f13782l;

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.message.Addressee$Creator */
    public static class Creator implements android.os.Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            Addressee addressee = new Addressee(parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            return addressee;
        }

        public final Object[] newArray(int i) {
            return new Addressee[i];
        }
    }

    public Addressee(long j, long j2, String str, long j3, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(str2, "typeCode");
        Intrinsics.checkParameterIsNotNull(str3, "typeShortName");
        Intrinsics.checkParameterIsNotNull(str4, "typeName");
        Intrinsics.checkParameterIsNotNull(str5, "typeDescription");
        Intrinsics.checkParameterIsNotNull(str6, "profileId");
        this.f13774c = j;
        this.f13775e = j2;
        this.f13776f = str;
        this.f13777g = j3;
        this.f13778h = str2;
        this.f13779i = str3;
        this.f13780j = str4;
        this.f13781k = str5;
        this.f13782l = str6;
    }

    public static /* synthetic */ Addressee copy$default(Addressee addressee, long j, long j2, String str, long j3, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        Addressee addressee2 = addressee;
        int i2 = i;
        return addressee.mo13229a((i2 & 1) != 0 ? addressee2.f13774c : j, (i2 & 2) != 0 ? addressee2.f13775e : j2, (i2 & 4) != 0 ? addressee2.f13776f : str, (i2 & 8) != 0 ? addressee2.f13777g : j3, (i2 & 16) != 0 ? addressee2.f13778h : str2, (i2 & 32) != 0 ? addressee2.f13779i : str3, (i2 & 64) != 0 ? addressee2.f13780j : str4, (i2 & 128) != 0 ? addressee2.f13781k : str5, (i2 & 256) != 0 ? addressee.mo11318e() : str6);
    }

    /* renamed from: a */
    public final Addressee mo13229a(long j, long j2, String str, long j3, String str2, String str3, String str4, String str5, String str6) {
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
        Addressee addressee = new Addressee(j, j2, str7, j3, str8, str9, str10, str11, str12);
        return addressee;
    }

    /* renamed from: a */
    public String mo13230a(Object obj) {
        return C3984v.m10183a((ProfileSpecificModel) this, obj);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String mo11318e() {
        return this.f13782l;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Addressee) {
                Addressee addressee = (Addressee) obj;
                if (this.f13774c == addressee.f13774c) {
                    if ((this.f13775e == addressee.f13775e) && Intrinsics.areEqual((Object) this.f13776f, (Object) addressee.f13776f)) {
                        if (!(this.f13777g == addressee.f13777g) || !Intrinsics.areEqual((Object) this.f13778h, (Object) addressee.f13778h) || !Intrinsics.areEqual((Object) this.f13779i, (Object) addressee.f13779i) || !Intrinsics.areEqual((Object) this.f13780j, (Object) addressee.f13780j) || !Intrinsics.areEqual((Object) this.f13781k, (Object) addressee.f13781k) || !Intrinsics.areEqual((Object) mo11318e(), (Object) addressee.mo11318e())) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final long mo13233f() {
        return this.f13774c;
    }

    /* renamed from: g */
    public final long mo13234g() {
        return this.f13775e;
    }

    /* renamed from: h */
    public final String mo13235h() {
        return this.f13776f;
    }

    public int hashCode() {
        long j = this.f13774c;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f13775e;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str = this.f13776f;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        long j3 = this.f13777g;
        int i4 = (hashCode + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        String str2 = this.f13778h;
        int hashCode2 = (i4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f13779i;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f13780j;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f13781k;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String e = mo11318e();
        if (e != null) {
            i3 = e.hashCode();
        }
        return hashCode5 + i3;
    }

    /* renamed from: i */
    public final String mo13237i() {
        return this.f13778h;
    }

    /* renamed from: j */
    public final String mo13238j() {
        return this.f13781k;
    }

    /* renamed from: k */
    public final long mo13239k() {
        return this.f13777g;
    }

    /* renamed from: l */
    public final String mo13240l() {
        return this.f13780j;
    }

    /* renamed from: m */
    public final String mo13241m() {
        return this.f13779i;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("Addressee(id=");
        a.append(this.f13774c);
        a.append(", kretaId=");
        a.append(this.f13775e);
        a.append(", name=");
        a.append(this.f13776f);
        a.append(", typeId=");
        a.append(this.f13777g);
        a.append(", typeCode=");
        a.append(this.f13778h);
        a.append(", typeShortName=");
        a.append(this.f13779i);
        a.append(", typeName=");
        a.append(this.f13780j);
        a.append(", typeDescription=");
        a.append(this.f13781k);
        a.append(", profileId=");
        a.append(mo11318e());
        a.append(")");
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeLong(this.f13774c);
        parcel.writeLong(this.f13775e);
        parcel.writeString(this.f13776f);
        parcel.writeLong(this.f13777g);
        parcel.writeString(this.f13778h);
        parcel.writeString(this.f13779i);
        parcel.writeString(this.f13780j);
        parcel.writeString(this.f13781k);
        parcel.writeString(this.f13782l);
    }
}
