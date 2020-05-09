package p289hu.ekreta.ellenorzo.cases.subModels;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/subModels/ToDoMandatoryDocument;", "Landroid/os/Parcelable;", "id", "", "fileName", "", "documentNumber", "file", "Lhu/ekreta/ellenorzo/cases/subModels/File;", "(ILjava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/cases/subModels/File;)V", "getDocumentNumber", "()Ljava/lang/String;", "getFile", "()Lhu/ekreta/ellenorzo/cases/subModels/File;", "getFileName", "getId", "()I", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.subModels.ToDoMandatoryDocument */
/* compiled from: ToDoMandatoryDocument.kt */
public final class ToDoMandatoryDocument implements Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new Creator();

    /* renamed from: c */
    public final int f11645c;

    /* renamed from: e */
    public final String f11646e;

    /* renamed from: f */
    public final String f11647f;

    /* renamed from: g */
    public final File f11648g;

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.cases.subModels.ToDoMandatoryDocument$Creator */
    public static class Creator implements android.os.Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new ToDoMandatoryDocument(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (File) File.CREATOR.createFromParcel(parcel) : null);
        }

        public final Object[] newArray(int i) {
            return new ToDoMandatoryDocument[i];
        }
    }

    public ToDoMandatoryDocument(int i, String str, String str2, File file) {
        Intrinsics.checkParameterIsNotNull(str, "fileName");
        Intrinsics.checkParameterIsNotNull(str2, "documentNumber");
        this.f11645c = i;
        this.f11646e = str;
        this.f11647f = str2;
        this.f11648g = file;
    }

    public static /* synthetic */ ToDoMandatoryDocument copy$default(ToDoMandatoryDocument toDoMandatoryDocument, int i, String str, String str2, File file, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = toDoMandatoryDocument.f11645c;
        }
        if ((i2 & 2) != 0) {
            str = toDoMandatoryDocument.f11646e;
        }
        if ((i2 & 4) != 0) {
            str2 = toDoMandatoryDocument.f11647f;
        }
        if ((i2 & 8) != 0) {
            file = toDoMandatoryDocument.f11648g;
        }
        return toDoMandatoryDocument.mo12040a(i, str, str2, file);
    }

    /* renamed from: a */
    public final ToDoMandatoryDocument mo12040a(int i, String str, String str2, File file) {
        Intrinsics.checkParameterIsNotNull(str, "fileName");
        Intrinsics.checkParameterIsNotNull(str2, "documentNumber");
        return new ToDoMandatoryDocument(i, str, str2, file);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ToDoMandatoryDocument) {
                ToDoMandatoryDocument toDoMandatoryDocument = (ToDoMandatoryDocument) obj;
                if (!(this.f11645c == toDoMandatoryDocument.f11645c) || !Intrinsics.areEqual((Object) this.f11646e, (Object) toDoMandatoryDocument.f11646e) || !Intrinsics.areEqual((Object) this.f11647f, (Object) toDoMandatoryDocument.f11647f) || !Intrinsics.areEqual((Object) this.f11648g, (Object) toDoMandatoryDocument.f11648g)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.f11645c * 31;
        String str = this.f11646e;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f11647f;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        File file = this.f11648g;
        if (file != null) {
            i2 = file.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("ToDoMandatoryDocument(id=");
        a.append(this.f11645c);
        a.append(", fileName=");
        a.append(this.f11646e);
        a.append(", documentNumber=");
        a.append(this.f11647f);
        a.append(", file=");
        a.append(this.f11648g);
        a.append(")");
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeInt(this.f11645c);
        parcel.writeString(this.f11646e);
        parcel.writeString(this.f11647f);
        File file = this.f11648g;
        if (file != null) {
            parcel.writeInt(1);
            file.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }
}
