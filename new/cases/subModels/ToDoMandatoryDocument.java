package hu.ekreta.ellenorzo.cases.subModels;

import a.b.a.a.a;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, d2 = {"Lhu/ekreta/ellenorzo/cases/subModels/ToDoMandatoryDocument;", "Landroid/os/Parcelable;", "id", "", "fileName", "", "documentNumber", "file", "Lhu/ekreta/ellenorzo/cases/subModels/File;", "(ILjava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/cases/subModels/File;)V", "getDocumentNumber", "()Ljava/lang/String;", "getFile", "()Lhu/ekreta/ellenorzo/cases/subModels/File;", "getFileName", "getId", "()I", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: ToDoMandatoryDocument.kt */
public final class ToDoMandatoryDocument implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    public final int c;
    public final String e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final File f5227g;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static class Creator implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new ToDoMandatoryDocument(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (File) File.CREATOR.createFromParcel(parcel) : null);
        }

        public final Object[] newArray(int i2) {
            return new ToDoMandatoryDocument[i2];
        }
    }

    public ToDoMandatoryDocument(int i2, String str, String str2, File file) {
        Intrinsics.checkParameterIsNotNull(str, "fileName");
        Intrinsics.checkParameterIsNotNull(str2, "documentNumber");
        this.c = i2;
        this.e = str;
        this.f = str2;
        this.f5227g = file;
    }

    public static /* synthetic */ ToDoMandatoryDocument copy$default(ToDoMandatoryDocument toDoMandatoryDocument, int i2, String str, String str2, File file, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = toDoMandatoryDocument.c;
        }
        if ((i3 & 2) != 0) {
            str = toDoMandatoryDocument.e;
        }
        if ((i3 & 4) != 0) {
            str2 = toDoMandatoryDocument.f;
        }
        if ((i3 & 8) != 0) {
            file = toDoMandatoryDocument.f5227g;
        }
        return toDoMandatoryDocument.a(i2, str, str2, file);
    }

    public final ToDoMandatoryDocument a(int i2, String str, String str2, File file) {
        Intrinsics.checkParameterIsNotNull(str, "fileName");
        Intrinsics.checkParameterIsNotNull(str2, "documentNumber");
        return new ToDoMandatoryDocument(i2, str, str2, file);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ToDoMandatoryDocument) {
                ToDoMandatoryDocument toDoMandatoryDocument = (ToDoMandatoryDocument) obj;
                if (!(this.c == toDoMandatoryDocument.c) || !Intrinsics.areEqual((Object) this.e, (Object) toDoMandatoryDocument.e) || !Intrinsics.areEqual((Object) this.f, (Object) toDoMandatoryDocument.f) || !Intrinsics.areEqual((Object) this.f5227g, (Object) toDoMandatoryDocument.f5227g)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i2 = this.c * 31;
        String str = this.e;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        File file = this.f5227g;
        if (file != null) {
            i3 = file.hashCode();
        }
        return hashCode2 + i3;
    }

    public String toString() {
        StringBuilder a2 = a.a("ToDoMandatoryDocument(id=");
        a2.append(this.c);
        a2.append(", fileName=");
        a2.append(this.e);
        a2.append(", documentNumber=");
        a2.append(this.f);
        a2.append(", file=");
        a2.append(this.f5227g);
        a2.append(")");
        return a2.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeInt(this.c);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        File file = this.f5227g;
        if (file != null) {
            parcel.writeInt(1);
            file.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }
}
