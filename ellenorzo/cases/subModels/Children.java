package p289hu.ekreta.ellenorzo.cases.subModels;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u001e"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/subModels/Children;", "Landroid/os/Parcelable;", "firstName", "", "lastName", "educationId", "", "(Ljava/lang/String;Ljava/lang/String;J)V", "getEducationId", "()J", "getFirstName", "()Ljava/lang/String;", "getLastName", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.subModels.Children */
/* compiled from: Children.kt */
public final class Children implements Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new Creator();

    /* renamed from: c */
    public final String f11564c;

    /* renamed from: e */
    public final String f11565e;

    /* renamed from: f */
    public final long f11566f;

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.cases.subModels.Children$Creator */
    public static class Creator implements android.os.Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new Children(parcel.readString(), parcel.readString(), parcel.readLong());
        }

        public final Object[] newArray(int i) {
            return new Children[i];
        }
    }

    public Children(String str, String str2, long j) {
        Intrinsics.checkParameterIsNotNull(str, "firstName");
        Intrinsics.checkParameterIsNotNull(str2, "lastName");
        this.f11564c = str;
        this.f11565e = str2;
        this.f11566f = j;
    }

    public static /* synthetic */ Children copy$default(Children children, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = children.f11564c;
        }
        if ((i & 2) != 0) {
            str2 = children.f11565e;
        }
        if ((i & 4) != 0) {
            j = children.f11566f;
        }
        return children.mo11934a(str, str2, j);
    }

    /* renamed from: a */
    public final Children mo11934a(String str, String str2, long j) {
        Intrinsics.checkParameterIsNotNull(str, "firstName");
        Intrinsics.checkParameterIsNotNull(str2, "lastName");
        return new Children(str, str2, j);
    }

    /* renamed from: d */
    public final long mo11935d() {
        return this.f11566f;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo11937e() {
        return this.f11564c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Children) {
                Children children = (Children) obj;
                if (Intrinsics.areEqual((Object) this.f11564c, (Object) children.f11564c) && Intrinsics.areEqual((Object) this.f11565e, (Object) children.f11565e)) {
                    if (this.f11566f == children.f11566f) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final String mo11939f() {
        return this.f11565e;
    }

    public int hashCode() {
        String str = this.f11564c;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f11565e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        long j = this.f11566f;
        return i2 + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("Children(firstName=");
        a.append(this.f11564c);
        a.append(", lastName=");
        a.append(this.f11565e);
        a.append(", educationId=");
        a.append(this.f11566f);
        a.append(")");
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.f11564c);
        parcel.writeString(this.f11565e);
        parcel.writeLong(this.f11566f);
    }
}
