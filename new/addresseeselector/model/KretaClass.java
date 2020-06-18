package hu.ekreta.ellenorzo.addresseeselector.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\b\u0010\u0015\u001a\u00020\u0005H\u0016J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, d2 = {"Lhu/ekreta/ellenorzo/addresseeselector/model/KretaClass;", "Landroid/os/Parcelable;", "id", "", "name", "", "(JLjava/lang/String;)V", "getId", "()J", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: KretaClass.kt */
public final class KretaClass implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    public final long c;
    public final String e;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static class Creator implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new KretaClass(parcel.readLong(), parcel.readString());
        }

        public final Object[] newArray(int i2) {
            return new KretaClass[i2];
        }
    }

    public KretaClass(long j2, String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        this.c = j2;
        this.e = str;
    }

    public static /* synthetic */ KretaClass copy$default(KretaClass kretaClass, long j2, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = kretaClass.c;
        }
        if ((i2 & 2) != 0) {
            str = kretaClass.e;
        }
        return kretaClass.a(j2, str);
    }

    public final KretaClass a(long j2, String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        return new KretaClass(j2, str);
    }

    public final long d() {
        return this.c;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KretaClass) {
                KretaClass kretaClass = (KretaClass) obj;
                if (!(this.c == kretaClass.c) || !Intrinsics.areEqual((Object) this.e, (Object) kretaClass.e)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j2 = this.c;
        int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        String str = this.e;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return this.e;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeLong(this.c);
        parcel.writeString(this.e);
    }
}
