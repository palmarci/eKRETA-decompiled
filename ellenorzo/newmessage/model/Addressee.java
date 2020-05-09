package p289hu.ekreta.ellenorzo.newmessage.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jn\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010!J\t\u0010\"\u001a\u00020#HÖ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020#HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001J\u0019\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020#HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0015\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012¨\u0006/"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/newmessage/model/Addressee;", "Landroid/os/Parcelable;", "id", "", "name", "", "kretaId", "typeId", "typeCode", "typeShortName", "typeName", "typeDescription", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getKretaId", "getName", "()Ljava/lang/String;", "getTypeCode", "getTypeDescription", "getTypeId", "getTypeName", "getTypeShortName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lhu/ekreta/ellenorzo/newmessage/model/Addressee;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.newmessage.model.Addressee */
/* compiled from: Addressee.kt */
public final class Addressee implements Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new Creator();

    /* renamed from: c */
    public final Long f13962c;

    /* renamed from: e */
    public final String f13963e;

    /* renamed from: f */
    public final Long f13964f;

    /* renamed from: g */
    public final Long f13965g;

    /* renamed from: h */
    public final String f13966h;

    /* renamed from: i */
    public final String f13967i;

    /* renamed from: j */
    public final String f13968j;

    /* renamed from: k */
    public final String f13969k;

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.newmessage.model.Addressee$Creator */
    public static class Creator implements android.os.Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            Addressee addressee = new Addressee(parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            return addressee;
        }

        public final Object[] newArray(int i) {
            return new Addressee[i];
        }
    }

    public Addressee(Long l, String str, Long l2, Long l3, String str2, String str3, String str4, String str5) {
        this.f13962c = l;
        this.f13963e = str;
        this.f13964f = l2;
        this.f13965g = l3;
        this.f13966h = str2;
        this.f13967i = str3;
        this.f13968j = str4;
        this.f13969k = str5;
    }

    public static /* synthetic */ Addressee copy$default(Addressee addressee, Long l, String str, Long l2, Long l3, String str2, String str3, String str4, String str5, int i, Object obj) {
        Addressee addressee2 = addressee;
        int i2 = i;
        return addressee.mo13471a((i2 & 1) != 0 ? addressee2.f13962c : l, (i2 & 2) != 0 ? addressee2.f13963e : str, (i2 & 4) != 0 ? addressee2.f13964f : l2, (i2 & 8) != 0 ? addressee2.f13965g : l3, (i2 & 16) != 0 ? addressee2.f13966h : str2, (i2 & 32) != 0 ? addressee2.f13967i : str3, (i2 & 64) != 0 ? addressee2.f13968j : str4, (i2 & 128) != 0 ? addressee2.f13969k : str5);
    }

    /* renamed from: a */
    public final Addressee mo13471a(Long l, String str, Long l2, Long l3, String str2, String str3, String str4, String str5) {
        Addressee addressee = new Addressee(l, str, l2, l3, str2, str3, str4, str5);
        return addressee;
    }

    /* renamed from: d */
    public final Long mo13472d() {
        return this.f13962c;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final Long mo13474e() {
        return this.f13964f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f13969k, (java.lang.Object) r3.f13969k) != false) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x005b
            boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.newmessage.model.Addressee
            if (r0 == 0) goto L_0x0059
            hu.ekreta.ellenorzo.newmessage.model.Addressee r3 = (p289hu.ekreta.ellenorzo.newmessage.model.Addressee) r3
            java.lang.Long r0 = r2.f13962c
            java.lang.Long r1 = r3.f13962c
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0059
            java.lang.String r0 = r2.f13963e
            java.lang.String r1 = r3.f13963e
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0059
            java.lang.Long r0 = r2.f13964f
            java.lang.Long r1 = r3.f13964f
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0059
            java.lang.Long r0 = r2.f13965g
            java.lang.Long r1 = r3.f13965g
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0059
            java.lang.String r0 = r2.f13966h
            java.lang.String r1 = r3.f13966h
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0059
            java.lang.String r0 = r2.f13967i
            java.lang.String r1 = r3.f13967i
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0059
            java.lang.String r0 = r2.f13968j
            java.lang.String r1 = r3.f13968j
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0059
            java.lang.String r0 = r2.f13969k
            java.lang.String r3 = r3.f13969k
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r3 = 0
            return r3
        L_0x005b:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.newmessage.model.Addressee.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final String mo13476f() {
        return this.f13963e;
    }

    /* renamed from: g */
    public final String mo13477g() {
        return this.f13966h;
    }

    /* renamed from: h */
    public final String mo13478h() {
        return this.f13969k;
    }

    public int hashCode() {
        Long l = this.f13962c;
        int i = 0;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        String str = this.f13963e;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l2 = this.f13964f;
        int hashCode3 = (hashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31;
        Long l3 = this.f13965g;
        int hashCode4 = (hashCode3 + (l3 != null ? l3.hashCode() : 0)) * 31;
        String str2 = this.f13966h;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f13967i;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f13968j;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f13969k;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode7 + i;
    }

    /* renamed from: i */
    public final Long mo13480i() {
        return this.f13965g;
    }

    /* renamed from: j */
    public final String mo13481j() {
        return this.f13968j;
    }

    /* renamed from: k */
    public final String mo13482k() {
        return this.f13967i;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("Addressee(id=");
        a.append(this.f13962c);
        a.append(", name=");
        a.append(this.f13963e);
        a.append(", kretaId=");
        a.append(this.f13964f);
        a.append(", typeId=");
        a.append(this.f13965g);
        a.append(", typeCode=");
        a.append(this.f13966h);
        a.append(", typeShortName=");
        a.append(this.f13967i);
        a.append(", typeName=");
        a.append(this.f13968j);
        a.append(", typeDescription=");
        return C0082a.m106a(a, this.f13969k, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        Long l = this.f13962c;
        if (l != null) {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f13963e);
        Long l2 = this.f13964f;
        if (l2 != null) {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        } else {
            parcel.writeInt(0);
        }
        Long l3 = this.f13965g;
        if (l3 != null) {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f13966h);
        parcel.writeString(this.f13967i);
        parcel.writeString(this.f13968j);
        parcel.writeString(this.f13969k);
    }
}
