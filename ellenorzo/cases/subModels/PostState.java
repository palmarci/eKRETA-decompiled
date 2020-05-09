package p289hu.ekreta.ellenorzo.cases.subModels;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006#"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/subModels/PostState;", "Landroid/os/Parcelable;", "id", "", "code", "", "shortName", "name", "description", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getDescription", "getId", "()I", "getName", "getShortName", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.subModels.PostState */
/* compiled from: PostState.kt */
public final class PostState implements Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new Creator();

    /* renamed from: c */
    public final int f11602c;

    /* renamed from: e */
    public final String f11603e;

    /* renamed from: f */
    public final String f11604f;

    /* renamed from: g */
    public final String f11605g;

    /* renamed from: h */
    public final String f11606h;

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.cases.subModels.PostState$Creator */
    public static class Creator implements android.os.Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            PostState postState = new PostState(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            return postState;
        }

        public final Object[] newArray(int i) {
            return new PostState[i];
        }
    }

    public PostState(int i, String str, String str2, String str3, String str4) {
        Intrinsics.checkParameterIsNotNull(str, "code");
        Intrinsics.checkParameterIsNotNull(str2, "shortName");
        Intrinsics.checkParameterIsNotNull(str3, "name");
        Intrinsics.checkParameterIsNotNull(str4, "description");
        this.f11602c = i;
        this.f11603e = str;
        this.f11604f = str2;
        this.f11605g = str3;
        this.f11606h = str4;
    }

    public static /* synthetic */ PostState copy$default(PostState postState, int i, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = postState.f11602c;
        }
        if ((i2 & 2) != 0) {
            str = postState.f11603e;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = postState.f11604f;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = postState.f11605g;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = postState.f11606h;
        }
        return postState.mo12000a(i, str5, str6, str7, str4);
    }

    /* renamed from: a */
    public final PostState mo12000a(int i, String str, String str2, String str3, String str4) {
        Intrinsics.checkParameterIsNotNull(str, "code");
        Intrinsics.checkParameterIsNotNull(str2, "shortName");
        Intrinsics.checkParameterIsNotNull(str3, "name");
        Intrinsics.checkParameterIsNotNull(str4, "description");
        PostState postState = new PostState(i, str, str2, str3, str4);
        return postState;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PostState) {
                PostState postState = (PostState) obj;
                if (!(this.f11602c == postState.f11602c) || !Intrinsics.areEqual((Object) this.f11603e, (Object) postState.f11603e) || !Intrinsics.areEqual((Object) this.f11604f, (Object) postState.f11604f) || !Intrinsics.areEqual((Object) this.f11605g, (Object) postState.f11605g) || !Intrinsics.areEqual((Object) this.f11606h, (Object) postState.f11606h)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.f11602c * 31;
        String str = this.f11603e;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f11604f;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f11605g;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f11606h;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("PostState(id=");
        a.append(this.f11602c);
        a.append(", code=");
        a.append(this.f11603e);
        a.append(", shortName=");
        a.append(this.f11604f);
        a.append(", name=");
        a.append(this.f11605g);
        a.append(", description=");
        return C0082a.m106a(a, this.f11606h, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeInt(this.f11602c);
        parcel.writeString(this.f11603e);
        parcel.writeString(this.f11604f);
        parcel.writeString(this.f11605g);
        parcel.writeString(this.f11606h);
    }
}
