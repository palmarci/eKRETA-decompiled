package p289hu.ekreta.ellenorzo.cases.subModels;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006#"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/subModels/Applicants;", "Landroid/os/Parcelable;", "id", "", "fileName", "", "shortName", "title", "userId", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getFileName", "()Ljava/lang/String;", "getId", "()I", "getShortName", "getTitle", "getUserId", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.subModels.Applicants */
/* compiled from: Applicants.kt */
public final class Applicants implements Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new Creator();

    /* renamed from: c */
    public final int f11532c;

    /* renamed from: e */
    public final String f11533e;

    /* renamed from: f */
    public final String f11534f;

    /* renamed from: g */
    public final String f11535g;

    /* renamed from: h */
    public final int f11536h;

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.cases.subModels.Applicants$Creator */
    public static class Creator implements android.os.Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            Applicants applicants = new Applicants(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
            return applicants;
        }

        public final Object[] newArray(int i) {
            return new Applicants[i];
        }
    }

    public Applicants(int i, String str, String str2, String str3, int i2) {
        C0082a.m114a(str, "fileName", str2, "shortName", str3, "title");
        this.f11532c = i;
        this.f11533e = str;
        this.f11534f = str2;
        this.f11535g = str3;
        this.f11536h = i2;
    }

    public static /* synthetic */ Applicants copy$default(Applicants applicants, int i, String str, String str2, String str3, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = applicants.f11532c;
        }
        if ((i3 & 2) != 0) {
            str = applicants.f11533e;
        }
        String str4 = str;
        if ((i3 & 4) != 0) {
            str2 = applicants.f11534f;
        }
        String str5 = str2;
        if ((i3 & 8) != 0) {
            str3 = applicants.f11535g;
        }
        String str6 = str3;
        if ((i3 & 16) != 0) {
            i2 = applicants.f11536h;
        }
        return applicants.mo11878a(i, str4, str5, str6, i2);
    }

    /* renamed from: a */
    public final Applicants mo11878a(int i, String str, String str2, String str3, int i2) {
        Intrinsics.checkParameterIsNotNull(str, "fileName");
        Intrinsics.checkParameterIsNotNull(str2, "shortName");
        Intrinsics.checkParameterIsNotNull(str3, "title");
        Applicants applicants = new Applicants(i, str, str2, str3, i2);
        return applicants;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Applicants) {
                Applicants applicants = (Applicants) obj;
                if ((this.f11532c == applicants.f11532c) && Intrinsics.areEqual((Object) this.f11533e, (Object) applicants.f11533e) && Intrinsics.areEqual((Object) this.f11534f, (Object) applicants.f11534f) && Intrinsics.areEqual((Object) this.f11535g, (Object) applicants.f11535g)) {
                    if (this.f11536h == applicants.f11536h) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.f11532c * 31;
        String str = this.f11533e;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f11534f;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f11535g;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return ((hashCode2 + i2) * 31) + this.f11536h;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("Applicants(id=");
        a.append(this.f11532c);
        a.append(", fileName=");
        a.append(this.f11533e);
        a.append(", shortName=");
        a.append(this.f11534f);
        a.append(", title=");
        a.append(this.f11535g);
        a.append(", userId=");
        return C0082a.m105a(a, this.f11536h, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeInt(this.f11532c);
        parcel.writeString(this.f11533e);
        parcel.writeString(this.f11534f);
        parcel.writeString(this.f11535g);
        parcel.writeInt(this.f11536h);
    }
}
