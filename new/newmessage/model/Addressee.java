package hu.ekreta.ellenorzo.newmessage.model;

import a.b.a.a.a;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bw\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010\u001e\u001a\u00020\u000eHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0001\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001¢\u0006\u0002\u0010(J\t\u0010)\u001a\u00020*HÖ\u0001J\u0013\u0010+\u001a\u00020\u000e2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020*HÖ\u0001J\t\u0010/\u001a\u00020\u0005HÖ\u0001J\u0019\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020*HÖ\u0001R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0015R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011¨\u00065"}, d2 = {"Lhu/ekreta/ellenorzo/newmessage/model/Addressee;", "Landroid/os/Parcelable;", "id", "", "name", "", "kretaId", "typeId", "typeCode", "typeShortName", "typeName", "typeDescription", "displayName", "isPlaceholder", "", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getDisplayName", "()Ljava/lang/String;", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "()Z", "getKretaId", "getName", "getTypeCode", "getTypeDescription", "getTypeId", "getTypeName", "getTypeShortName", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lhu/ekreta/ellenorzo/newmessage/model/Addressee;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: Addressee.kt */
public final class Addressee implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    public final Long c;
    public final String e;
    public final Long f;

    /* renamed from: g  reason: collision with root package name */
    public final Long f5814g;

    /* renamed from: h  reason: collision with root package name */
    public final String f5815h;

    /* renamed from: i  reason: collision with root package name */
    public final String f5816i;

    /* renamed from: j  reason: collision with root package name */
    public final String f5817j;

    /* renamed from: k  reason: collision with root package name */
    public final String f5818k;

    /* renamed from: l  reason: collision with root package name */
    public final String f5819l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f5820m;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static class Creator implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new Addressee(parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        public final Object[] newArray(int i2) {
            return new Addressee[i2];
        }
    }

    public Addressee(Long l2, String str, Long l3, Long l4, String str2, String str3, String str4, String str5, String str6, boolean z) {
        this.c = l2;
        this.e = str;
        this.f = l3;
        this.f5814g = l4;
        this.f5815h = str2;
        this.f5816i = str3;
        this.f5817j = str4;
        this.f5818k = str5;
        this.f5819l = str6;
        this.f5820m = z;
    }

    public static /* synthetic */ Addressee copy$default(Addressee addressee, Long l2, String str, Long l3, Long l4, String str2, String str3, String str4, String str5, String str6, boolean z, int i2, Object obj) {
        Addressee addressee2 = addressee;
        int i3 = i2;
        return addressee.a((i3 & 1) != 0 ? addressee2.c : l2, (i3 & 2) != 0 ? addressee2.e : str, (i3 & 4) != 0 ? addressee2.f : l3, (i3 & 8) != 0 ? addressee2.f5814g : l4, (i3 & 16) != 0 ? addressee2.f5815h : str2, (i3 & 32) != 0 ? addressee2.f5816i : str3, (i3 & 64) != 0 ? addressee2.f5817j : str4, (i3 & 128) != 0 ? addressee2.f5818k : str5, (i3 & 256) != 0 ? addressee2.f5819l : str6, (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? addressee2.f5820m : z);
    }

    public final Addressee a(Long l2, String str, Long l3, Long l4, String str2, String str3, String str4, String str5, String str6, boolean z) {
        return new Addressee(l2, str, l3, l4, str2, str3, str4, str5, str6, z);
    }

    public final String d() {
        return this.f5819l;
    }

    public int describeContents() {
        return 0;
    }

    public final Long e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Addressee) {
                Addressee addressee = (Addressee) obj;
                if (Intrinsics.areEqual((Object) this.c, (Object) addressee.c) && Intrinsics.areEqual((Object) this.e, (Object) addressee.e) && Intrinsics.areEqual((Object) this.f, (Object) addressee.f) && Intrinsics.areEqual((Object) this.f5814g, (Object) addressee.f5814g) && Intrinsics.areEqual((Object) this.f5815h, (Object) addressee.f5815h) && Intrinsics.areEqual((Object) this.f5816i, (Object) addressee.f5816i) && Intrinsics.areEqual((Object) this.f5817j, (Object) addressee.f5817j) && Intrinsics.areEqual((Object) this.f5818k, (Object) addressee.f5818k) && Intrinsics.areEqual((Object) this.f5819l, (Object) addressee.f5819l)) {
                    if (this.f5820m == addressee.f5820m) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final Long f() {
        return this.f;
    }

    public final String g() {
        return this.e;
    }

    public final String h() {
        return this.f5815h;
    }

    public int hashCode() {
        Long l2 = this.c;
        int i2 = 0;
        int hashCode = (l2 != null ? l2.hashCode() : 0) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l3 = this.f;
        int hashCode3 = (hashCode2 + (l3 != null ? l3.hashCode() : 0)) * 31;
        Long l4 = this.f5814g;
        int hashCode4 = (hashCode3 + (l4 != null ? l4.hashCode() : 0)) * 31;
        String str2 = this.f5815h;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f5816i;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f5817j;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f5818k;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f5819l;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        int i3 = (hashCode8 + i2) * 31;
        boolean z = this.f5820m;
        if (z) {
            z = true;
        }
        return i3 + (z ? 1 : 0);
    }

    public final String i() {
        return this.f5818k;
    }

    public final Long j() {
        return this.f5814g;
    }

    public final String k() {
        return this.f5817j;
    }

    public final String l() {
        return this.f5816i;
    }

    public final boolean m() {
        return this.f5820m;
    }

    public String toString() {
        StringBuilder a2 = a.a("Addressee(id=");
        a2.append(this.c);
        a2.append(", name=");
        a2.append(this.e);
        a2.append(", kretaId=");
        a2.append(this.f);
        a2.append(", typeId=");
        a2.append(this.f5814g);
        a2.append(", typeCode=");
        a2.append(this.f5815h);
        a2.append(", typeShortName=");
        a2.append(this.f5816i);
        a2.append(", typeName=");
        a2.append(this.f5817j);
        a2.append(", typeDescription=");
        a2.append(this.f5818k);
        a2.append(", displayName=");
        a2.append(this.f5819l);
        a2.append(", isPlaceholder=");
        a2.append(this.f5820m);
        a2.append(")");
        return a2.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        Long l2 = this.c;
        if (l2 != null) {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.e);
        Long l3 = this.f;
        if (l3 != null) {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        } else {
            parcel.writeInt(0);
        }
        Long l4 = this.f5814g;
        if (l4 != null) {
            parcel.writeInt(1);
            parcel.writeLong(l4.longValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f5815h);
        parcel.writeString(this.f5816i);
        parcel.writeString(this.f5817j);
        parcel.writeString(this.f5818k);
        parcel.writeString(this.f5819l);
        parcel.writeInt(this.f5820m ? 1 : 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Addressee(java.lang.Long r15, java.lang.String r16, java.lang.Long r17, java.lang.Long r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, boolean r24, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
        /*
            r14 = this;
            r0 = r25
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r6 = r2
            goto L_0x000b
        L_0x0009:
            r6 = r17
        L_0x000b:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0011
            r7 = r2
            goto L_0x0013
        L_0x0011:
            r7 = r18
        L_0x0013:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0019
            r8 = r2
            goto L_0x001b
        L_0x0019:
            r8 = r19
        L_0x001b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0021
            r9 = r2
            goto L_0x0023
        L_0x0021:
            r9 = r20
        L_0x0023:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0029
            r10 = r2
            goto L_0x002b
        L_0x0029:
            r10 = r21
        L_0x002b:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0031
            r11 = r2
            goto L_0x0033
        L_0x0031:
            r11 = r22
        L_0x0033:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0039
            r12 = r2
            goto L_0x003b
        L_0x0039:
            r12 = r23
        L_0x003b:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0042
            r0 = 0
            r13 = 0
            goto L_0x0044
        L_0x0042:
            r13 = r24
        L_0x0044:
            r3 = r14
            r4 = r15
            r5 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.newmessage.model.Addressee.<init>(java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
