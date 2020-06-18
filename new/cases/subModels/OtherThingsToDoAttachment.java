package hu.ekreta.ellenorzo.cases.subModels;

import a.b.a.a.a;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005J<\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0003H\u0016J\u0013\u0010\u001c\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r¨\u0006&"}, d2 = {"Lhu/ekreta/ellenorzo/cases/subModels/OtherThingsToDoAttachment;", "Landroid/os/Parcelable;", "id", "", "fileName", "", "registrationNumber", "file", "Lhu/ekreta/ellenorzo/cases/subModels/File;", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/cases/subModels/File;)V", "getFile", "()Lhu/ekreta/ellenorzo/cases/subModels/File;", "getFileName", "()Ljava/lang/String;", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRegistrationNumber", "component1", "component2", "component3", "component4", "containsTemporaryServerUid", "", "temporaryServerUid", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/cases/subModels/File;)Lhu/ekreta/ellenorzo/cases/subModels/OtherThingsToDoAttachment;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: OtherThingsToDoAttachment.kt */
public final class OtherThingsToDoAttachment implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    public final Integer c;
    public final String e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final File f5199g;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static class Creator implements Parcelable.Creator {
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: hu.ekreta.ellenorzo.cases.subModels.File} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object createFromParcel(android.os.Parcel r7) {
            /*
                r6 = this;
                java.lang.String r0 = "in"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r7, r0)
                hu.ekreta.ellenorzo.cases.subModels.OtherThingsToDoAttachment r0 = new hu.ekreta.ellenorzo.cases.subModels.OtherThingsToDoAttachment
                int r1 = r7.readInt()
                r2 = 0
                if (r1 == 0) goto L_0x0017
                int r1 = r7.readInt()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                goto L_0x0018
            L_0x0017:
                r1 = r2
            L_0x0018:
                java.lang.String r3 = r7.readString()
                java.lang.String r4 = r7.readString()
                int r5 = r7.readInt()
                if (r5 == 0) goto L_0x002f
                android.os.Parcelable$Creator r2 = hu.ekreta.ellenorzo.cases.subModels.File.CREATOR
                java.lang.Object r7 = r2.createFromParcel(r7)
                r2 = r7
                hu.ekreta.ellenorzo.cases.subModels.File r2 = (hu.ekreta.ellenorzo.cases.subModels.File) r2
            L_0x002f:
                r0.<init>(r1, r3, r4, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.cases.subModels.OtherThingsToDoAttachment.Creator.createFromParcel(android.os.Parcel):java.lang.Object");
        }

        public final Object[] newArray(int i2) {
            return new OtherThingsToDoAttachment[i2];
        }
    }

    public OtherThingsToDoAttachment(Integer num, String str, String str2, File file) {
        Intrinsics.checkParameterIsNotNull(str, "fileName");
        this.c = num;
        this.e = str;
        this.f = str2;
        this.f5199g = file;
    }

    public static /* synthetic */ OtherThingsToDoAttachment copy$default(OtherThingsToDoAttachment otherThingsToDoAttachment, Integer num, String str, String str2, File file, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = otherThingsToDoAttachment.c;
        }
        if ((i2 & 2) != 0) {
            str = otherThingsToDoAttachment.e;
        }
        if ((i2 & 4) != 0) {
            str2 = otherThingsToDoAttachment.f;
        }
        if ((i2 & 8) != 0) {
            file = otherThingsToDoAttachment.f5199g;
        }
        return otherThingsToDoAttachment.a(num, str, str2, file);
    }

    public final OtherThingsToDoAttachment a(Integer num, String str, String str2, File file) {
        Intrinsics.checkParameterIsNotNull(str, "fileName");
        return new OtherThingsToDoAttachment(num, str, str2, file);
    }

    public final boolean a(String str) {
        File file = this.f5199g;
        return Intrinsics.areEqual((Object) file != null ? file.g() : null, (Object) str);
    }

    public final File d() {
        return this.f5199g;
    }

    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OtherThingsToDoAttachment)) {
            return false;
        }
        OtherThingsToDoAttachment otherThingsToDoAttachment = (OtherThingsToDoAttachment) obj;
        return Intrinsics.areEqual((Object) this.c, (Object) otherThingsToDoAttachment.c) && Intrinsics.areEqual((Object) this.e, (Object) otherThingsToDoAttachment.e) && Intrinsics.areEqual((Object) this.f, (Object) otherThingsToDoAttachment.f) && Intrinsics.areEqual((Object) this.f5199g, (Object) otherThingsToDoAttachment.f5199g);
    }

    public final Integer f() {
        return this.c;
    }

    public final String g() {
        return this.f;
    }

    public int hashCode() {
        Integer num = this.c;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        File file = this.f5199g;
        if (file != null) {
            i2 = file.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("OtherThingsToDoAttachment(id=");
        a2.append(this.c);
        a2.append(", fileName=");
        a2.append(this.e);
        a2.append(", registrationNumber=");
        a2.append(this.f);
        a2.append(", file=");
        a2.append(this.f5199g);
        a2.append(")");
        return a2.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        Integer num = this.c;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        File file = this.f5199g;
        if (file != null) {
            parcel.writeInt(1);
            file.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }
}
