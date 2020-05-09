package p289hu.ekreta.ellenorzo.cases.subModels;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005J<\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0003H\u0016J\u0013\u0010\u001c\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r¨\u0006&"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/subModels/OtherThingsToDoAttachment;", "Landroid/os/Parcelable;", "id", "", "fileName", "", "registrationNumber", "file", "Lhu/ekreta/ellenorzo/cases/subModels/File;", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/cases/subModels/File;)V", "getFile", "()Lhu/ekreta/ellenorzo/cases/subModels/File;", "getFileName", "()Ljava/lang/String;", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRegistrationNumber", "component1", "component2", "component3", "component4", "containsTemporaryServerUid", "", "temporaryServerUid", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/cases/subModels/File;)Lhu/ekreta/ellenorzo/cases/subModels/OtherThingsToDoAttachment;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.subModels.OtherThingsToDoAttachment */
/* compiled from: OtherThingsToDoAttachment.kt */
public final class OtherThingsToDoAttachment implements Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new Creator();

    /* renamed from: c */
    public final Integer f11598c;

    /* renamed from: e */
    public final String f11599e;

    /* renamed from: f */
    public final String f11600f;

    /* renamed from: g */
    public final File f11601g;

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.cases.subModels.OtherThingsToDoAttachment$Creator */
    public static class Creator implements android.os.Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            File file = null;
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                file = (File) File.CREATOR.createFromParcel(parcel);
            }
            return new OtherThingsToDoAttachment(valueOf, readString, readString2, file);
        }

        public final Object[] newArray(int i) {
            return new OtherThingsToDoAttachment[i];
        }
    }

    public OtherThingsToDoAttachment(Integer num, String str, String str2, File file) {
        Intrinsics.checkParameterIsNotNull(str, "fileName");
        this.f11598c = num;
        this.f11599e = str;
        this.f11600f = str2;
        this.f11601g = file;
    }

    public static /* synthetic */ OtherThingsToDoAttachment copy$default(OtherThingsToDoAttachment otherThingsToDoAttachment, Integer num, String str, String str2, File file, int i, Object obj) {
        if ((i & 1) != 0) {
            num = otherThingsToDoAttachment.f11598c;
        }
        if ((i & 2) != 0) {
            str = otherThingsToDoAttachment.f11599e;
        }
        if ((i & 4) != 0) {
            str2 = otherThingsToDoAttachment.f11600f;
        }
        if ((i & 8) != 0) {
            file = otherThingsToDoAttachment.f11601g;
        }
        return otherThingsToDoAttachment.mo11987a(num, str, str2, file);
    }

    /* renamed from: a */
    public final OtherThingsToDoAttachment mo11987a(Integer num, String str, String str2, File file) {
        Intrinsics.checkParameterIsNotNull(str, "fileName");
        return new OtherThingsToDoAttachment(num, str, str2, file);
    }

    /* renamed from: a */
    public final boolean mo11988a(String str) {
        File file = this.f11601g;
        return Intrinsics.areEqual((Object) file != null ? file.mo11967g() : null, (Object) str);
    }

    /* renamed from: d */
    public final File mo11989d() {
        return this.f11601g;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo11991e() {
        return this.f11599e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f11601g, (java.lang.Object) r3.f11601g) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.cases.subModels.OtherThingsToDoAttachment
            if (r0 == 0) goto L_0x0031
            hu.ekreta.ellenorzo.cases.subModels.OtherThingsToDoAttachment r3 = (p289hu.ekreta.ellenorzo.cases.subModels.OtherThingsToDoAttachment) r3
            java.lang.Integer r0 = r2.f11598c
            java.lang.Integer r1 = r3.f11598c
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f11599e
            java.lang.String r1 = r3.f11599e
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f11600f
            java.lang.String r1 = r3.f11600f
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            hu.ekreta.ellenorzo.cases.subModels.File r0 = r2.f11601g
            hu.ekreta.ellenorzo.cases.subModels.File r3 = r3.f11601g
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.cases.subModels.OtherThingsToDoAttachment.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final Integer mo11993f() {
        return this.f11598c;
    }

    /* renamed from: g */
    public final String mo11994g() {
        return this.f11600f;
    }

    public int hashCode() {
        Integer num = this.f11598c;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.f11599e;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f11600f;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        File file = this.f11601g;
        if (file != null) {
            i = file.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("OtherThingsToDoAttachment(id=");
        a.append(this.f11598c);
        a.append(", fileName=");
        a.append(this.f11599e);
        a.append(", registrationNumber=");
        a.append(this.f11600f);
        a.append(", file=");
        a.append(this.f11601g);
        a.append(")");
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        Integer num = this.f11598c;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f11599e);
        parcel.writeString(this.f11600f);
        File file = this.f11601g;
        if (file != null) {
            parcel.writeInt(1);
            file.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }
}
