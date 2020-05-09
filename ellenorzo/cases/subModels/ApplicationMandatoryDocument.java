package p289hu.ekreta.ellenorzo.cases.subModels;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.util.mapper.ProfileSpecificModel;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0002\u0010\rJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0006JT\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010#J\b\u0010$\u001a\u00020\u0004H\u0016J\u0013\u0010%\u001a\u00020 2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\u0004HÖ\u0001J\t\u0010)\u001a\u00020\u0006HÖ\u0001J\u0019\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0004HÖ\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\f\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013¨\u0006/"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/subModels/ApplicationMandatoryDocument;", "Landroid/os/Parcelable;", "Lhu/ekreta/ellenorzo/util/mapper/ProfileSpecificModel;", "id", "", "fileName", "", "registrationNumber", "file", "Lhu/ekreta/ellenorzo/cases/subModels/File;", "applicationDocumentType", "Lhu/ekreta/ellenorzo/cases/subModels/ApplicationDocumentType;", "profileId", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/cases/subModels/File;Lhu/ekreta/ellenorzo/cases/subModels/ApplicationDocumentType;Ljava/lang/String;)V", "getApplicationDocumentType", "()Lhu/ekreta/ellenorzo/cases/subModels/ApplicationDocumentType;", "getFile", "()Lhu/ekreta/ellenorzo/cases/subModels/File;", "getFileName", "()Ljava/lang/String;", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getProfileId", "getRegistrationNumber", "component1", "component2", "component3", "component4", "component5", "component6", "containsTemporaryServerUid", "", "temporaryServerUid", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/cases/subModels/File;Lhu/ekreta/ellenorzo/cases/subModels/ApplicationDocumentType;Ljava/lang/String;)Lhu/ekreta/ellenorzo/cases/subModels/ApplicationMandatoryDocument;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.subModels.ApplicationMandatoryDocument */
/* compiled from: ApplicationMandatoryDocument.kt */
public final class ApplicationMandatoryDocument implements Parcelable, ProfileSpecificModel {
    public static final android.os.Parcelable.Creator CREATOR = new Creator();

    /* renamed from: c */
    public final Integer f11545c;

    /* renamed from: e */
    public final String f11546e;

    /* renamed from: f */
    public final String f11547f;

    /* renamed from: g */
    public final File f11548g;

    /* renamed from: h */
    public final ApplicationDocumentType f11549h;

    /* renamed from: i */
    public final String f11550i;

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.cases.subModels.ApplicationMandatoryDocument$Creator */
    public static class Creator implements android.os.Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            ApplicationMandatoryDocument applicationMandatoryDocument = new ApplicationMandatoryDocument(parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (File) File.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (ApplicationDocumentType) ApplicationDocumentType.CREATOR.createFromParcel(parcel) : null, parcel.readString());
            return applicationMandatoryDocument;
        }

        public final Object[] newArray(int i) {
            return new ApplicationMandatoryDocument[i];
        }
    }

    public ApplicationMandatoryDocument(Integer num, String str, String str2, File file, ApplicationDocumentType applicationDocumentType, String str3) {
        Intrinsics.checkParameterIsNotNull(str3, "profileId");
        this.f11545c = num;
        this.f11546e = str;
        this.f11547f = str2;
        this.f11548g = file;
        this.f11549h = applicationDocumentType;
        this.f11550i = str3;
    }

    public static /* synthetic */ ApplicationMandatoryDocument copy$default(ApplicationMandatoryDocument applicationMandatoryDocument, Integer num, String str, String str2, File file, ApplicationDocumentType applicationDocumentType, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = applicationMandatoryDocument.f11545c;
        }
        if ((i & 2) != 0) {
            str = applicationMandatoryDocument.f11546e;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = applicationMandatoryDocument.f11547f;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            file = applicationMandatoryDocument.f11548g;
        }
        File file2 = file;
        if ((i & 16) != 0) {
            applicationDocumentType = applicationMandatoryDocument.f11549h;
        }
        ApplicationDocumentType applicationDocumentType2 = applicationDocumentType;
        if ((i & 32) != 0) {
            str3 = applicationMandatoryDocument.mo11318e();
        }
        return applicationMandatoryDocument.mo11902a(num, str4, str5, file2, applicationDocumentType2, str3);
    }

    /* renamed from: a */
    public final ApplicationMandatoryDocument mo11902a(Integer num, String str, String str2, File file, ApplicationDocumentType applicationDocumentType, String str3) {
        Intrinsics.checkParameterIsNotNull(str3, "profileId");
        ApplicationMandatoryDocument applicationMandatoryDocument = new ApplicationMandatoryDocument(num, str, str2, file, applicationDocumentType, str3);
        return applicationMandatoryDocument;
    }

    /* renamed from: a */
    public String mo11903a(Object obj) {
        return C3984v.m10183a((ProfileSpecificModel) this, obj);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String mo11318e() {
        return this.f11550i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) mo11318e(), (java.lang.Object) r3.mo11318e()) != false) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x004b
            boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.cases.subModels.ApplicationMandatoryDocument
            if (r0 == 0) goto L_0x0049
            hu.ekreta.ellenorzo.cases.subModels.ApplicationMandatoryDocument r3 = (p289hu.ekreta.ellenorzo.cases.subModels.ApplicationMandatoryDocument) r3
            java.lang.Integer r0 = r2.f11545c
            java.lang.Integer r1 = r3.f11545c
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = r2.f11546e
            java.lang.String r1 = r3.f11546e
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = r2.f11547f
            java.lang.String r1 = r3.f11547f
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0049
            hu.ekreta.ellenorzo.cases.subModels.File r0 = r2.f11548g
            hu.ekreta.ellenorzo.cases.subModels.File r1 = r3.f11548g
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0049
            hu.ekreta.ellenorzo.cases.subModels.ApplicationDocumentType r0 = r2.f11549h
            hu.ekreta.ellenorzo.cases.subModels.ApplicationDocumentType r1 = r3.f11549h
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = r2.mo11318e()
            java.lang.String r3 = r3.mo11318e()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0049
            goto L_0x004b
        L_0x0049:
            r3 = 0
            return r3
        L_0x004b:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.cases.subModels.ApplicationMandatoryDocument.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final ApplicationDocumentType mo11907f() {
        return this.f11549h;
    }

    /* renamed from: g */
    public final File mo11908g() {
        return this.f11548g;
    }

    /* renamed from: h */
    public final String mo11909h() {
        return this.f11546e;
    }

    public int hashCode() {
        Integer num = this.f11545c;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.f11546e;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f11547f;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        File file = this.f11548g;
        int hashCode4 = (hashCode3 + (file != null ? file.hashCode() : 0)) * 31;
        ApplicationDocumentType applicationDocumentType = this.f11549h;
        int hashCode5 = (hashCode4 + (applicationDocumentType != null ? applicationDocumentType.hashCode() : 0)) * 31;
        String e = mo11318e();
        if (e != null) {
            i = e.hashCode();
        }
        return hashCode5 + i;
    }

    /* renamed from: i */
    public final Integer mo11911i() {
        return this.f11545c;
    }

    /* renamed from: j */
    public final String mo11912j() {
        return this.f11547f;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("ApplicationMandatoryDocument(id=");
        a.append(this.f11545c);
        a.append(", fileName=");
        a.append(this.f11546e);
        a.append(", registrationNumber=");
        a.append(this.f11547f);
        a.append(", file=");
        a.append(this.f11548g);
        a.append(", applicationDocumentType=");
        a.append(this.f11549h);
        a.append(", profileId=");
        a.append(mo11318e());
        a.append(")");
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        Integer num = this.f11545c;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f11546e);
        parcel.writeString(this.f11547f);
        File file = this.f11548g;
        if (file != null) {
            parcel.writeInt(1);
            file.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        ApplicationDocumentType applicationDocumentType = this.f11549h;
        if (applicationDocumentType != null) {
            parcel.writeInt(1);
            applicationDocumentType.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f11550i);
    }

    /* renamed from: a */
    public final boolean mo11904a(String str) {
        File file = this.f11548g;
        return Intrinsics.areEqual((Object) file != null ? file.mo11967g() : null, (Object) str);
    }
}
