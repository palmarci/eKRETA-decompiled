package hu.ekreta.ellenorzo.cases.subModels;

import a.b.a.a.a;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006#"}, d2 = {"Lhu/ekreta/ellenorzo/cases/subModels/Administrator;", "Landroid/os/Parcelable;", "id", "", "userName", "", "shortName", "title", "userId", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getId", "()I", "getShortName", "()Ljava/lang/String;", "getTitle", "getUserId", "getUserName", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: Administrator.kt */
public final class Administrator implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    public final int c;
    public final String e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final String f5161g;

    /* renamed from: h  reason: collision with root package name */
    public final int f5162h;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static class Creator implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new Administrator(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        public final Object[] newArray(int i2) {
            return new Administrator[i2];
        }
    }

    public Administrator(int i2, String str, String str2, String str3, int i3) {
        Intrinsics.checkParameterIsNotNull(str, "userName");
        Intrinsics.checkParameterIsNotNull(str2, "shortName");
        this.c = i2;
        this.e = str;
        this.f = str2;
        this.f5161g = str3;
        this.f5162h = i3;
    }

    public static /* synthetic */ Administrator copy$default(Administrator administrator, int i2, String str, String str2, String str3, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = administrator.c;
        }
        if ((i4 & 2) != 0) {
            str = administrator.e;
        }
        String str4 = str;
        if ((i4 & 4) != 0) {
            str2 = administrator.f;
        }
        String str5 = str2;
        if ((i4 & 8) != 0) {
            str3 = administrator.f5161g;
        }
        String str6 = str3;
        if ((i4 & 16) != 0) {
            i3 = administrator.f5162h;
        }
        return administrator.a(i2, str4, str5, str6, i3);
    }

    public final Administrator a(int i2, String str, String str2, String str3, int i3) {
        Intrinsics.checkParameterIsNotNull(str, "userName");
        Intrinsics.checkParameterIsNotNull(str2, "shortName");
        return new Administrator(i2, str, str2, str3, i3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Administrator) {
                Administrator administrator = (Administrator) obj;
                if ((this.c == administrator.c) && Intrinsics.areEqual((Object) this.e, (Object) administrator.e) && Intrinsics.areEqual((Object) this.f, (Object) administrator.f) && Intrinsics.areEqual((Object) this.f5161g, (Object) administrator.f5161g)) {
                    if (this.f5162h == administrator.f5162h) {
                        return true;
                    }
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
        String str3 = this.f5161g;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return ((hashCode2 + i3) * 31) + this.f5162h;
    }

    public String toString() {
        StringBuilder a2 = a.a("Administrator(id=");
        a2.append(this.c);
        a2.append(", userName=");
        a2.append(this.e);
        a2.append(", shortName=");
        a2.append(this.f);
        a2.append(", title=");
        a2.append(this.f5161g);
        a2.append(", userId=");
        return a.a(a2, this.f5162h, ")");
    }

    public void writeToParcel(Parcel parcel, int i2) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeInt(this.c);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.f5161g);
        parcel.writeInt(this.f5162h);
    }
}
