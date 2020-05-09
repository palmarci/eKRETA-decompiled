package p289hu.ekreta.ellenorzo.cases.subModels;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.util.mapper.ProfileSpecificModel;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J0\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0004HÖ\u0001R\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006 "}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/subModels/File;", "Landroid/os/Parcelable;", "Lhu/ekreta/ellenorzo/util/mapper/ProfileSpecificModel;", "id", "", "temporaryFileId", "", "profileId", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getProfileId", "()Ljava/lang/String;", "getTemporaryFileId", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lhu/ekreta/ellenorzo/cases/subModels/File;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.subModels.File */
/* compiled from: File.kt */
public final class File implements Parcelable, ProfileSpecificModel {
    public static final android.os.Parcelable.Creator CREATOR = new Creator();

    /* renamed from: c */
    public final Integer f11580c;

    /* renamed from: e */
    public final String f11581e;

    /* renamed from: f */
    public final String f11582f;

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.cases.subModels.File$Creator */
    public static class Creator implements android.os.Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new File(parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new File[i];
        }
    }

    public File(Integer num, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str2, "profileId");
        this.f11580c = num;
        this.f11581e = str;
        this.f11582f = str2;
    }

    public static /* synthetic */ File copy$default(File file, Integer num, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = file.f11580c;
        }
        if ((i & 2) != 0) {
            str = file.f11581e;
        }
        if ((i & 4) != 0) {
            str2 = file.mo11318e();
        }
        return file.mo11962a(num, str, str2);
    }

    /* renamed from: a */
    public final File mo11962a(Integer num, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str2, "profileId");
        return new File(num, str, str2);
    }

    /* renamed from: a */
    public String mo11963a(Object obj) {
        return C3984v.m10183a((ProfileSpecificModel) this, obj);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String mo11318e() {
        return this.f11582f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) mo11318e(), (java.lang.Object) r3.mo11318e()) != false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x002d
            boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.cases.subModels.File
            if (r0 == 0) goto L_0x002b
            hu.ekreta.ellenorzo.cases.subModels.File r3 = (p289hu.ekreta.ellenorzo.cases.subModels.File) r3
            java.lang.Integer r0 = r2.f11580c
            java.lang.Integer r1 = r3.f11580c
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = r2.f11581e
            java.lang.String r1 = r3.f11581e
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = r2.mo11318e()
            java.lang.String r3 = r3.mo11318e()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r3 = 0
            return r3
        L_0x002d:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.cases.subModels.File.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final Integer mo11966f() {
        return this.f11580c;
    }

    /* renamed from: g */
    public final String mo11967g() {
        return this.f11581e;
    }

    public int hashCode() {
        Integer num = this.f11580c;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.f11581e;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String e = mo11318e();
        if (e != null) {
            i = e.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("File(id=");
        a.append(this.f11580c);
        a.append(", temporaryFileId=");
        a.append(this.f11581e);
        a.append(", profileId=");
        a.append(mo11318e());
        a.append(")");
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        Integer num = this.f11580c;
        if (num != null) {
            parcel.writeInt(1);
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        parcel.writeString(this.f11581e);
        parcel.writeString(this.f11582f);
    }
}
