package p289hu.ekreta.ellenorzo.cases.subModels;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.util.mapper.ProfileSpecificModel;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002BS\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0002\u0010\rJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003Jl\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\f\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010\"J\b\u0010#\u001a\u00020\u0004H\u0016J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\u0004HÖ\u0001J\t\u0010)\u001a\u00020\u0006HÖ\u0001J\u0019\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0004HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0014\u0010\f\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006/"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/subModels/ApplicationDocumentType;", "Landroid/os/Parcelable;", "Lhu/ekreta/ellenorzo/util/mapper/ProfileSpecificModel;", "id", "", "code", "", "shortName", "name", "description", "documentTemplateName", "documentTemplatePath", "profileId", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getDescription", "getDocumentTemplateName", "getDocumentTemplatePath", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getName", "getProfileId", "getShortName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lhu/ekreta/ellenorzo/cases/subModels/ApplicationDocumentType;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.subModels.ApplicationDocumentType */
/* compiled from: ApplicationDocumentType.kt */
public final class ApplicationDocumentType implements Parcelable, ProfileSpecificModel {
    public static final android.os.Parcelable.Creator CREATOR = new Creator();

    /* renamed from: c */
    public final Integer f11537c;

    /* renamed from: e */
    public final String f11538e;

    /* renamed from: f */
    public final String f11539f;

    /* renamed from: g */
    public final String f11540g;

    /* renamed from: h */
    public final String f11541h;

    /* renamed from: i */
    public final String f11542i;

    /* renamed from: j */
    public final String f11543j;

    /* renamed from: k */
    public final String f11544k;

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.cases.subModels.ApplicationDocumentType$Creator */
    public static class Creator implements android.os.Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            ApplicationDocumentType applicationDocumentType = new ApplicationDocumentType(parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            return applicationDocumentType;
        }

        public final Object[] newArray(int i) {
            return new ApplicationDocumentType[i];
        }
    }

    public ApplicationDocumentType(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Intrinsics.checkParameterIsNotNull(str7, "profileId");
        this.f11537c = num;
        this.f11538e = str;
        this.f11539f = str2;
        this.f11540g = str3;
        this.f11541h = str4;
        this.f11542i = str5;
        this.f11543j = str6;
        this.f11544k = str7;
    }

    public static /* synthetic */ ApplicationDocumentType copy$default(ApplicationDocumentType applicationDocumentType, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        ApplicationDocumentType applicationDocumentType2 = applicationDocumentType;
        int i2 = i;
        return applicationDocumentType.mo11886a((i2 & 1) != 0 ? applicationDocumentType2.f11537c : num, (i2 & 2) != 0 ? applicationDocumentType2.f11538e : str, (i2 & 4) != 0 ? applicationDocumentType2.f11539f : str2, (i2 & 8) != 0 ? applicationDocumentType2.f11540g : str3, (i2 & 16) != 0 ? applicationDocumentType2.f11541h : str4, (i2 & 32) != 0 ? applicationDocumentType2.f11542i : str5, (i2 & 64) != 0 ? applicationDocumentType2.f11543j : str6, (i2 & 128) != 0 ? applicationDocumentType.mo11318e() : str7);
    }

    /* renamed from: a */
    public final ApplicationDocumentType mo11886a(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String str8 = str7;
        Intrinsics.checkParameterIsNotNull(str8, "profileId");
        ApplicationDocumentType applicationDocumentType = new ApplicationDocumentType(num, str, str2, str3, str4, str5, str6, str8);
        return applicationDocumentType;
    }

    /* renamed from: a */
    public String mo11887a(Object obj) {
        return C3984v.m10183a((ProfileSpecificModel) this, obj);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String mo11318e() {
        return this.f11544k;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) mo11318e(), (java.lang.Object) r3.mo11318e()) != false) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x005f
            boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.cases.subModels.ApplicationDocumentType
            if (r0 == 0) goto L_0x005d
            hu.ekreta.ellenorzo.cases.subModels.ApplicationDocumentType r3 = (p289hu.ekreta.ellenorzo.cases.subModels.ApplicationDocumentType) r3
            java.lang.Integer r0 = r2.f11537c
            java.lang.Integer r1 = r3.f11537c
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = r2.f11538e
            java.lang.String r1 = r3.f11538e
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = r2.f11539f
            java.lang.String r1 = r3.f11539f
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = r2.f11540g
            java.lang.String r1 = r3.f11540g
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = r2.f11541h
            java.lang.String r1 = r3.f11541h
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = r2.f11542i
            java.lang.String r1 = r3.f11542i
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = r2.f11543j
            java.lang.String r1 = r3.f11543j
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = r2.mo11318e()
            java.lang.String r3 = r3.mo11318e()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x005d
            goto L_0x005f
        L_0x005d:
            r3 = 0
            return r3
        L_0x005f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.cases.subModels.ApplicationDocumentType.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final String mo11890f() {
        return this.f11538e;
    }

    /* renamed from: g */
    public final String mo11891g() {
        return this.f11541h;
    }

    /* renamed from: h */
    public final String mo11892h() {
        return this.f11542i;
    }

    public int hashCode() {
        Integer num = this.f11537c;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.f11538e;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f11539f;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f11540g;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f11541h;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f11542i;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f11543j;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String e = mo11318e();
        if (e != null) {
            i = e.hashCode();
        }
        return hashCode7 + i;
    }

    /* renamed from: i */
    public final String mo11894i() {
        return this.f11543j;
    }

    /* renamed from: j */
    public final Integer mo11895j() {
        return this.f11537c;
    }

    /* renamed from: k */
    public final String mo11896k() {
        return this.f11540g;
    }

    /* renamed from: l */
    public final String mo11897l() {
        return this.f11539f;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("ApplicationDocumentType(id=");
        a.append(this.f11537c);
        a.append(", code=");
        a.append(this.f11538e);
        a.append(", shortName=");
        a.append(this.f11539f);
        a.append(", name=");
        a.append(this.f11540g);
        a.append(", description=");
        a.append(this.f11541h);
        a.append(", documentTemplateName=");
        a.append(this.f11542i);
        a.append(", documentTemplatePath=");
        a.append(this.f11543j);
        a.append(", profileId=");
        a.append(mo11318e());
        a.append(")");
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        Integer num = this.f11537c;
        if (num != null) {
            parcel.writeInt(1);
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        parcel.writeString(this.f11538e);
        parcel.writeString(this.f11539f);
        parcel.writeString(this.f11540g);
        parcel.writeString(this.f11541h);
        parcel.writeString(this.f11542i);
        parcel.writeString(this.f11543j);
        parcel.writeString(this.f11544k);
    }
}
