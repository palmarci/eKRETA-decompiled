package hu.ekreta.ellenorzo.cases.subModels;

import a.b.a.a.a;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u001e"}, d2 = {"Lhu/ekreta/ellenorzo/cases/subModels/Children;", "Landroid/os/Parcelable;", "firstName", "", "lastName", "educationId", "", "(Ljava/lang/String;Ljava/lang/String;J)V", "getEducationId", "()J", "getFirstName", "()Ljava/lang/String;", "getLastName", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: Children.kt */
public final class Children implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    public final String c;
    public final String e;
    public final long f;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static class Creator implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new Children(parcel.readString(), parcel.readString(), parcel.readLong());
        }

        public final Object[] newArray(int i2) {
            return new Children[i2];
        }
    }

    public Children(String str, String str2, long j2) {
        Intrinsics.checkParameterIsNotNull(str, "firstName");
        Intrinsics.checkParameterIsNotNull(str2, "lastName");
        this.c = str;
        this.e = str2;
        this.f = j2;
    }

    public static /* synthetic */ Children copy$default(Children children, String str, String str2, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = children.c;
        }
        if ((i2 & 2) != 0) {
            str2 = children.e;
        }
        if ((i2 & 4) != 0) {
            j2 = children.f;
        }
        return children.a(str, str2, j2);
    }

    public final Children a(String str, String str2, long j2) {
        Intrinsics.checkParameterIsNotNull(str, "firstName");
        Intrinsics.checkParameterIsNotNull(str2, "lastName");
        return new Children(str, str2, j2);
    }

    public final long d() {
        return this.f;
    }

    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Children) {
                Children children = (Children) obj;
                if (Intrinsics.areEqual((Object) this.c, (Object) children.c) && Intrinsics.areEqual((Object) this.e, (Object) children.e)) {
                    if (this.f == children.f) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String f() {
        return this.e;
    }

    public int hashCode() {
        String str = this.c;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.e;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        long j2 = this.f;
        return ((hashCode + i2) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder a2 = a.a("Children(firstName=");
        a2.append(this.c);
        a2.append(", lastName=");
        a2.append(this.e);
        a2.append(", educationId=");
        a2.append(this.f);
        a2.append(")");
        return a2.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.c);
        parcel.writeString(this.e);
        parcel.writeLong(this.f);
    }
}
