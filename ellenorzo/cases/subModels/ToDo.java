package p289hu.ekreta.ellenorzo.cases.subModels;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p349io.ConstantsKt;
import p000a.p020b.p021a.p022a.C0082a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\b¢\u0006\u0002\u0010\u0014J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\bHÆ\u0003J\t\u0010,\u001a\u00020\bHÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\bHÆ\u0001J\b\u00102\u001a\u00020\u0003H\u0016J\u0013\u00103\u001a\u00020\u00062\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u00020\u0003HÖ\u0001J\t\u00107\u001a\u00020\bHÖ\u0001J\u0019\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001dR\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001dR\u0011\u0010\u0013\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\u0010\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006="}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/subModels/ToDo;", "Landroid/os/Parcelable;", "id", "", "documentTemplateId", "isReady", "", "appellation", "", "help", "helpUrl", "executiveId", "sequence", "isOnline", "isAutomatic", "isSystemReady", "systemReadyText", "toDoMandatoryDocumentsList", "Lhu/ekreta/ellenorzo/cases/subModels/ToDoMandatoryDocument;", "label", "(IIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZZZLjava/lang/String;Lhu/ekreta/ellenorzo/cases/subModels/ToDoMandatoryDocument;Ljava/lang/String;)V", "getAppellation", "()Ljava/lang/String;", "getDocumentTemplateId", "()I", "getExecutiveId", "getHelp", "getHelpUrl", "getId", "()Z", "getLabel", "getSequence", "getSystemReadyText", "getToDoMandatoryDocumentsList", "()Lhu/ekreta/ellenorzo/cases/subModels/ToDoMandatoryDocument;", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.subModels.ToDo */
/* compiled from: ToDo.kt */
public final class ToDo implements Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new Creator();

    /* renamed from: c */
    public final int f11631c;

    /* renamed from: e */
    public final int f11632e;

    /* renamed from: f */
    public final boolean f11633f;

    /* renamed from: g */
    public final String f11634g;

    /* renamed from: h */
    public final String f11635h;

    /* renamed from: i */
    public final String f11636i;

    /* renamed from: j */
    public final int f11637j;

    /* renamed from: k */
    public final String f11638k;

    /* renamed from: l */
    public final boolean f11639l;

    /* renamed from: m */
    public final boolean f11640m;

    /* renamed from: n */
    public final boolean f11641n;

    /* renamed from: o */
    public final String f11642o;

    /* renamed from: p */
    public final ToDoMandatoryDocument f11643p;

    /* renamed from: q */
    public final String f11644q;

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.cases.subModels.ToDo$Creator */
    public static class Creator implements android.os.Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            Intrinsics.checkParameterIsNotNull(parcel2, "in");
            ToDo toDo = new ToDo(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0 ? (ToDoMandatoryDocument) ToDoMandatoryDocument.CREATOR.createFromParcel(parcel2) : null, parcel.readString());
            return toDo;
        }

        public final Object[] newArray(int i) {
            return new ToDo[i];
        }
    }

    public ToDo(int i, int i2, boolean z, String str, String str2, String str3, int i3, String str4, boolean z2, boolean z3, boolean z4, String str5, ToDoMandatoryDocument toDoMandatoryDocument, String str6) {
        Intrinsics.checkParameterIsNotNull(str, "appellation");
        Intrinsics.checkParameterIsNotNull(str2, "help");
        Intrinsics.checkParameterIsNotNull(str3, "helpUrl");
        Intrinsics.checkParameterIsNotNull(str4, "sequence");
        Intrinsics.checkParameterIsNotNull(str5, "systemReadyText");
        Intrinsics.checkParameterIsNotNull(str6, "label");
        this.f11631c = i;
        this.f11632e = i2;
        this.f11633f = z;
        this.f11634g = str;
        this.f11635h = str2;
        this.f11636i = str3;
        this.f11637j = i3;
        this.f11638k = str4;
        this.f11639l = z2;
        this.f11640m = z3;
        this.f11641n = z4;
        this.f11642o = str5;
        this.f11643p = toDoMandatoryDocument;
        this.f11644q = str6;
    }

    public static /* synthetic */ ToDo copy$default(ToDo toDo, int i, int i2, boolean z, String str, String str2, String str3, int i3, String str4, boolean z2, boolean z3, boolean z4, String str5, ToDoMandatoryDocument toDoMandatoryDocument, String str6, int i4, Object obj) {
        ToDo toDo2 = toDo;
        int i5 = i4;
        return toDo.mo12032a((i5 & 1) != 0 ? toDo2.f11631c : i, (i5 & 2) != 0 ? toDo2.f11632e : i2, (i5 & 4) != 0 ? toDo2.f11633f : z, (i5 & 8) != 0 ? toDo2.f11634g : str, (i5 & 16) != 0 ? toDo2.f11635h : str2, (i5 & 32) != 0 ? toDo2.f11636i : str3, (i5 & 64) != 0 ? toDo2.f11637j : i3, (i5 & 128) != 0 ? toDo2.f11638k : str4, (i5 & 256) != 0 ? toDo2.f11639l : z2, (i5 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? toDo2.f11640m : z3, (i5 & 1024) != 0 ? toDo2.f11641n : z4, (i5 & 2048) != 0 ? toDo2.f11642o : str5, (i5 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? toDo2.f11643p : toDoMandatoryDocument, (i5 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? toDo2.f11644q : str6);
    }

    /* renamed from: a */
    public final ToDo mo12032a(int i, int i2, boolean z, String str, String str2, String str3, int i3, String str4, boolean z2, boolean z3, boolean z4, String str5, ToDoMandatoryDocument toDoMandatoryDocument, String str6) {
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
        ToDo toDo = new ToDo(i, i2, z, str7, str8, str9, i3, str10, z2, z3, z4, str11, toDoMandatoryDocument, str12);
        return toDo;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ToDo) {
                ToDo toDo = (ToDo) obj;
                if (this.f11631c == toDo.f11631c) {
                    if (this.f11632e == toDo.f11632e) {
                        if ((this.f11633f == toDo.f11633f) && Intrinsics.areEqual((Object) this.f11634g, (Object) toDo.f11634g) && Intrinsics.areEqual((Object) this.f11635h, (Object) toDo.f11635h) && Intrinsics.areEqual((Object) this.f11636i, (Object) toDo.f11636i)) {
                            if ((this.f11637j == toDo.f11637j) && Intrinsics.areEqual((Object) this.f11638k, (Object) toDo.f11638k)) {
                                if (this.f11639l == toDo.f11639l) {
                                    if (this.f11640m == toDo.f11640m) {
                                        if (!(this.f11641n == toDo.f11641n) || !Intrinsics.areEqual((Object) this.f11642o, (Object) toDo.f11642o) || !Intrinsics.areEqual((Object) this.f11643p, (Object) toDo.f11643p) || !Intrinsics.areEqual((Object) this.f11644q, (Object) toDo.f11644q)) {
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
        int i = ((this.f11631c * 31) + this.f11632e) * 31;
        boolean z = this.f11633f;
        if (z) {
            z = true;
        }
        int i2 = (i + (z ? 1 : 0)) * 31;
        String str = this.f11634g;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f11635h;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f11636i;
        int hashCode3 = (((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f11637j) * 31;
        String str4 = this.f11638k;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z2 = this.f11639l;
        if (z2) {
            z2 = true;
        }
        int i4 = (hashCode4 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.f11640m;
        if (z3) {
            z3 = true;
        }
        int i5 = (i4 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f11641n;
        if (z4) {
            z4 = true;
        }
        int i6 = (i5 + (z4 ? 1 : 0)) * 31;
        String str5 = this.f11642o;
        int hashCode5 = (i6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        ToDoMandatoryDocument toDoMandatoryDocument = this.f11643p;
        int hashCode6 = (hashCode5 + (toDoMandatoryDocument != null ? toDoMandatoryDocument.hashCode() : 0)) * 31;
        String str6 = this.f11644q;
        if (str6 != null) {
            i3 = str6.hashCode();
        }
        return hashCode6 + i3;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("ToDo(id=");
        a.append(this.f11631c);
        a.append(", documentTemplateId=");
        a.append(this.f11632e);
        a.append(", isReady=");
        a.append(this.f11633f);
        a.append(", appellation=");
        a.append(this.f11634g);
        a.append(", help=");
        a.append(this.f11635h);
        a.append(", helpUrl=");
        a.append(this.f11636i);
        a.append(", executiveId=");
        a.append(this.f11637j);
        a.append(", sequence=");
        a.append(this.f11638k);
        a.append(", isOnline=");
        a.append(this.f11639l);
        a.append(", isAutomatic=");
        a.append(this.f11640m);
        a.append(", isSystemReady=");
        a.append(this.f11641n);
        a.append(", systemReadyText=");
        a.append(this.f11642o);
        a.append(", toDoMandatoryDocumentsList=");
        a.append(this.f11643p);
        a.append(", label=");
        return C0082a.m106a(a, this.f11644q, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeInt(this.f11631c);
        parcel.writeInt(this.f11632e);
        parcel.writeInt(this.f11633f ? 1 : 0);
        parcel.writeString(this.f11634g);
        parcel.writeString(this.f11635h);
        parcel.writeString(this.f11636i);
        parcel.writeInt(this.f11637j);
        parcel.writeString(this.f11638k);
        parcel.writeInt(this.f11639l ? 1 : 0);
        parcel.writeInt(this.f11640m ? 1 : 0);
        parcel.writeInt(this.f11641n ? 1 : 0);
        parcel.writeString(this.f11642o);
        ToDoMandatoryDocument toDoMandatoryDocument = this.f11643p;
        if (toDoMandatoryDocument != null) {
            parcel.writeInt(1);
            toDoMandatoryDocument.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f11644q);
    }
}
