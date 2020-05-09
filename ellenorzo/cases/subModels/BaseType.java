package p289hu.ekreta.ellenorzo.cases.subModels;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0003H\u0016J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0007\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/subModels/BaseType;", "Landroid/os/Parcelable;", "id", "", "shortName", "", "name", "description", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getId", "()I", "getName", "getShortName", "describeContents", "equals", "", "other", "", "hashCode", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.subModels.BaseType */
/* compiled from: BaseType.kt */
public class BaseType implements Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new Creator();

    /* renamed from: c */
    public final int f11551c;

    /* renamed from: e */
    public final String f11552e;

    /* renamed from: f */
    public final String f11553f;

    /* renamed from: g */
    public final String f11554g;

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.cases.subModels.BaseType$Creator */
    public static class Creator implements android.os.Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new BaseType(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new BaseType[i];
        }
    }

    public BaseType(int i, String str, String str2, String str3) {
        C0082a.m114a(str, "shortName", str2, "name", str3, "description");
        this.f11551c = i;
        this.f11552e = str;
        this.f11553f = str2;
        this.f11554g = str3;
    }

    /* renamed from: d */
    public String mo11917d() {
        return this.f11554g;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public int mo11919e() {
        return this.f11551c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual((Object) getClass(), (Object) obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            BaseType baseType = (BaseType) obj;
            return mo11919e() == baseType.mo11919e() && !(Intrinsics.areEqual((Object) mo11922g(), (Object) baseType.mo11922g()) ^ true) && !(Intrinsics.areEqual((Object) mo11921f(), (Object) baseType.mo11921f()) ^ true) && !(Intrinsics.areEqual((Object) mo11917d(), (Object) baseType.mo11917d()) ^ true);
        }
        throw new TypeCastException("null cannot be cast to non-null type hu.ekreta.ellenorzo.cases.subModels.BaseType");
    }

    /* renamed from: f */
    public String mo11921f() {
        return this.f11553f;
    }

    /* renamed from: g */
    public String mo11922g() {
        return this.f11552e;
    }

    public int hashCode() {
        return mo11922g().hashCode() + (Integer.valueOf(mo11919e()).hashCode() * 31);
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeInt(this.f11551c);
        parcel.writeString(this.f11552e);
        parcel.writeString(this.f11553f);
        parcel.writeString(this.f11554g);
    }
}
