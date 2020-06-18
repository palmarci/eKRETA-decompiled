package hu.ekreta.ellenorzo.cases.subModels;

import a.b.a.a.a;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\b¢\u0006\u0002\u0010\u0014J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\bHÆ\u0003J\t\u0010,\u001a\u00020\bHÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\bHÆ\u0001J\b\u00102\u001a\u00020\u0003H\u0016J\u0013\u00103\u001a\u00020\u00062\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u00020\u0003HÖ\u0001J\t\u00107\u001a\u00020\bHÖ\u0001J\u0019\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001dR\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001dR\u0011\u0010\u0013\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\u0010\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006="}, d2 = {"Lhu/ekreta/ellenorzo/cases/subModels/ToDo;", "Landroid/os/Parcelable;", "id", "", "documentTemplateId", "isReady", "", "appellation", "", "help", "helpUrl", "executiveId", "sequence", "isOnline", "isAutomatic", "isSystemReady", "systemReadyText", "toDoMandatoryDocumentsList", "Lhu/ekreta/ellenorzo/cases/subModels/ToDoMandatoryDocument;", "label", "(IIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZZZLjava/lang/String;Lhu/ekreta/ellenorzo/cases/subModels/ToDoMandatoryDocument;Ljava/lang/String;)V", "getAppellation", "()Ljava/lang/String;", "getDocumentTemplateId", "()I", "getExecutiveId", "getHelp", "getHelpUrl", "getId", "()Z", "getLabel", "getSequence", "getSystemReadyText", "getToDoMandatoryDocumentsList", "()Lhu/ekreta/ellenorzo/cases/subModels/ToDoMandatoryDocument;", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: ToDo.kt */
public final class ToDo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    public final int c;
    public final int e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final String f5216g;

    /* renamed from: h  reason: collision with root package name */
    public final String f5217h;

    /* renamed from: i  reason: collision with root package name */
    public final String f5218i;

    /* renamed from: j  reason: collision with root package name */
    public final int f5219j;

    /* renamed from: k  reason: collision with root package name */
    public final String f5220k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f5221l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f5222m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f5223n;

    /* renamed from: o  reason: collision with root package name */
    public final String f5224o;

    /* renamed from: p  reason: collision with root package name */
    public final ToDoMandatoryDocument f5225p;

    /* renamed from: q  reason: collision with root package name */
    public final String f5226q;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static class Creator implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            Intrinsics.checkParameterIsNotNull(parcel2, "in");
            return new ToDo(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0 ? (ToDoMandatoryDocument) ToDoMandatoryDocument.CREATOR.createFromParcel(parcel2) : null, parcel.readString());
        }

        public final Object[] newArray(int i2) {
            return new ToDo[i2];
        }
    }

    public ToDo(int i2, int i3, boolean z, String str, String str2, String str3, int i4, String str4, boolean z2, boolean z3, boolean z4, String str5, ToDoMandatoryDocument toDoMandatoryDocument, String str6) {
        Intrinsics.checkParameterIsNotNull(str, "appellation");
        Intrinsics.checkParameterIsNotNull(str2, "help");
        Intrinsics.checkParameterIsNotNull(str3, "helpUrl");
        Intrinsics.checkParameterIsNotNull(str4, "sequence");
        Intrinsics.checkParameterIsNotNull(str5, "systemReadyText");
        Intrinsics.checkParameterIsNotNull(str6, "label");
        this.c = i2;
        this.e = i3;
        this.f = z;
        this.f5216g = str;
        this.f5217h = str2;
        this.f5218i = str3;
        this.f5219j = i4;
        this.f5220k = str4;
        this.f5221l = z2;
        this.f5222m = z3;
        this.f5223n = z4;
        this.f5224o = str5;
        this.f5225p = toDoMandatoryDocument;
        this.f5226q = str6;
    }

    public static /* synthetic */ ToDo copy$default(ToDo toDo, int i2, int i3, boolean z, String str, String str2, String str3, int i4, String str4, boolean z2, boolean z3, boolean z4, String str5, ToDoMandatoryDocument toDoMandatoryDocument, String str6, int i5, Object obj) {
        ToDo toDo2 = toDo;
        int i6 = i5;
        return toDo.a((i6 & 1) != 0 ? toDo2.c : i2, (i6 & 2) != 0 ? toDo2.e : i3, (i6 & 4) != 0 ? toDo2.f : z, (i6 & 8) != 0 ? toDo2.f5216g : str, (i6 & 16) != 0 ? toDo2.f5217h : str2, (i6 & 32) != 0 ? toDo2.f5218i : str3, (i6 & 64) != 0 ? toDo2.f5219j : i4, (i6 & 128) != 0 ? toDo2.f5220k : str4, (i6 & 256) != 0 ? toDo2.f5221l : z2, (i6 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? toDo2.f5222m : z3, (i6 & 1024) != 0 ? toDo2.f5223n : z4, (i6 & 2048) != 0 ? toDo2.f5224o : str5, (i6 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? toDo2.f5225p : toDoMandatoryDocument, (i6 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? toDo2.f5226q : str6);
    }

    public final ToDo a(int i2, int i3, boolean z, String str, String str2, String str3, int i4, String str4, boolean z2, boolean z3, boolean z4, String str5, ToDoMandatoryDocument toDoMandatoryDocument, String str6) {
        String str7 = str;
        Intrinsics.checkParameterIsNotNull(str7, "appellation");
        String str8 = str2;
        Intrinsics.checkParameterIsNotNull(str8, "help");
        String str9 = str3;
        Intrinsics.checkParameterIsNotNull(str9, "helpUrl");
        String str10 = str4;
        Intrinsics.checkParameterIsNotNull(str10, "sequence");
        String str11 = str5;
        Intrinsics.checkParameterIsNotNull(str11, "systemReadyText");
        String str12 = str6;
        Intrinsics.checkParameterIsNotNull(str12, "label");
        return new ToDo(i2, i3, z, str7, str8, str9, i4, str10, z2, z3, z4, str11, toDoMandatoryDocument, str12);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ToDo) {
                ToDo toDo = (ToDo) obj;
                if (this.c == toDo.c) {
                    if (this.e == toDo.e) {
                        if ((this.f == toDo.f) && Intrinsics.areEqual((Object) this.f5216g, (Object) toDo.f5216g) && Intrinsics.areEqual((Object) this.f5217h, (Object) toDo.f5217h) && Intrinsics.areEqual((Object) this.f5218i, (Object) toDo.f5218i)) {
                            if ((this.f5219j == toDo.f5219j) && Intrinsics.areEqual((Object) this.f5220k, (Object) toDo.f5220k)) {
                                if (this.f5221l == toDo.f5221l) {
                                    if (this.f5222m == toDo.f5222m) {
                                        if (!(this.f5223n == toDo.f5223n) || !Intrinsics.areEqual((Object) this.f5224o, (Object) toDo.f5224o) || !Intrinsics.areEqual((Object) this.f5225p, (Object) toDo.f5225p) || !Intrinsics.areEqual((Object) this.f5226q, (Object) toDo.f5226q)) {
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i2 = ((this.c * 31) + this.e) * 31;
        boolean z = this.f;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        String str = this.f5216g;
        int i4 = 0;
        int hashCode = (i3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5217h;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f5218i;
        int hashCode3 = (((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f5219j) * 31;
        String str4 = this.f5220k;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z2 = this.f5221l;
        if (z2) {
            z2 = true;
        }
        int i5 = (hashCode4 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.f5222m;
        if (z3) {
            z3 = true;
        }
        int i6 = (i5 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f5223n;
        if (z4) {
            z4 = true;
        }
        int i7 = (i6 + (z4 ? 1 : 0)) * 31;
        String str5 = this.f5224o;
        int hashCode5 = (i7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        ToDoMandatoryDocument toDoMandatoryDocument = this.f5225p;
        int hashCode6 = (hashCode5 + (toDoMandatoryDocument != null ? toDoMandatoryDocument.hashCode() : 0)) * 31;
        String str6 = this.f5226q;
        if (str6 != null) {
            i4 = str6.hashCode();
        }
        return hashCode6 + i4;
    }

    public String toString() {
        StringBuilder a2 = a.a("ToDo(id=");
        a2.append(this.c);
        a2.append(", documentTemplateId=");
        a2.append(this.e);
        a2.append(", isReady=");
        a2.append(this.f);
        a2.append(", appellation=");
        a2.append(this.f5216g);
        a2.append(", help=");
        a2.append(this.f5217h);
        a2.append(", helpUrl=");
        a2.append(this.f5218i);
        a2.append(", executiveId=");
        a2.append(this.f5219j);
        a2.append(", sequence=");
        a2.append(this.f5220k);
        a2.append(", isOnline=");
        a2.append(this.f5221l);
        a2.append(", isAutomatic=");
        a2.append(this.f5222m);
        a2.append(", isSystemReady=");
        a2.append(this.f5223n);
        a2.append(", systemReadyText=");
        a2.append(this.f5224o);
        a2.append(", toDoMandatoryDocumentsList=");
        a2.append(this.f5225p);
        a2.append(", label=");
        return a.a(a2, this.f5226q, ")");
    }

    public void writeToParcel(Parcel parcel, int i2) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeInt(this.c);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeString(this.f5216g);
        parcel.writeString(this.f5217h);
        parcel.writeString(this.f5218i);
        parcel.writeInt(this.f5219j);
        parcel.writeString(this.f5220k);
        parcel.writeInt(this.f5221l ? 1 : 0);
        parcel.writeInt(this.f5222m ? 1 : 0);
        parcel.writeInt(this.f5223n ? 1 : 0);
        parcel.writeString(this.f5224o);
        ToDoMandatoryDocument toDoMandatoryDocument = this.f5225p;
        if (toDoMandatoryDocument != null) {
            parcel.writeInt(1);
            toDoMandatoryDocument.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f5226q);
    }
}
