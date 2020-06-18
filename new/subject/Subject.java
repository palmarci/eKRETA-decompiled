package hu.ekreta.ellenorzo.subject;

import a.b.a.a.a;
import android.os.Parcel;
import android.os.Parcelable;
import hu.ekreta.ellenorzo.util.mapper.ProfileSpecificModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B]\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0002\u0010\u0012J\t\u0010 \u001a\u00020\u0004HÆ\u0003J\t\u0010!\u001a\u00020\u0004HÆ\u0003J\t\u0010\"\u001a\u00020\u0004HÆ\u0003J\t\u0010#\u001a\u00020\u0004HÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\u0004HÆ\u0003J\t\u0010&\u001a\u00020\u0004HÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003Js\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0004HÆ\u0001J\t\u0010+\u001a\u00020\bHÖ\u0001J\u0013\u0010,\u001a\u00020\f2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020\bHÖ\u0001J\t\u00100\u001a\u00020\u0004HÖ\u0001J\u0019\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014¨\u00066"}, d2 = {"Lhu/ekreta/ellenorzo/subject/Subject;", "Lhu/ekreta/ellenorzo/util/mapper/ProfileSpecificModel;", "Landroid/os/Parcelable;", "profileId", "", "subject", "average", "sortIndex", "", "educationTypeName", "classAverage", "isClassAverageAvailable", "", "educationTypeSortIndex", "sortedListOfAverages", "", "", "groupUid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZILjava/util/List;Ljava/lang/String;)V", "getAverage", "()Ljava/lang/String;", "getClassAverage", "getEducationTypeName", "getEducationTypeSortIndex", "()I", "getGroupUid", "()Z", "getProfileId", "getSortIndex", "getSortedListOfAverages", "()Ljava/util/List;", "getSubject", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: Subject.kt */
public final class Subject implements ProfileSpecificModel, Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    public final String c;
    public final String e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final int f6130g;

    /* renamed from: h  reason: collision with root package name */
    public final String f6131h;

    /* renamed from: i  reason: collision with root package name */
    public final String f6132i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f6133j;

    /* renamed from: k  reason: collision with root package name */
    public final int f6134k;

    /* renamed from: l  reason: collision with root package name */
    public final List<Float> f6135l;

    /* renamed from: m  reason: collision with root package name */
    public final String f6136m;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static class Creator implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt = parcel.readInt();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            while (readInt3 != 0) {
                arrayList.add(Float.valueOf(parcel.readFloat()));
                readInt3--;
            }
            return new Subject(readString, readString2, readString3, readInt, readString4, readString5, z, readInt2, arrayList, parcel.readString());
        }

        public final Object[] newArray(int i2) {
            return new Subject[i2];
        }
    }

    public Subject(String str, String str2, String str3, int i2, String str4, String str5, boolean z, int i3, List<Float> list, String str6) {
        Intrinsics.checkParameterIsNotNull(str, "profileId");
        Intrinsics.checkParameterIsNotNull(str2, "subject");
        Intrinsics.checkParameterIsNotNull(str3, "average");
        Intrinsics.checkParameterIsNotNull(str4, "educationTypeName");
        Intrinsics.checkParameterIsNotNull(str5, "classAverage");
        Intrinsics.checkParameterIsNotNull(list, "sortedListOfAverages");
        Intrinsics.checkParameterIsNotNull(str6, "groupUid");
        this.c = str;
        this.e = str2;
        this.f = str3;
        this.f6130g = i2;
        this.f6131h = str4;
        this.f6132i = str5;
        this.f6133j = z;
        this.f6134k = i3;
        this.f6135l = list;
        this.f6136m = str6;
    }

    public static /* synthetic */ Subject copy$default(Subject subject, String str, String str2, String str3, int i2, String str4, String str5, boolean z, int i3, List list, String str6, int i4, Object obj) {
        Subject subject2 = subject;
        int i5 = i4;
        return subject.a((i5 & 1) != 0 ? subject.e() : str, (i5 & 2) != 0 ? subject2.e : str2, (i5 & 4) != 0 ? subject2.f : str3, (i5 & 8) != 0 ? subject2.f6130g : i2, (i5 & 16) != 0 ? subject2.f6131h : str4, (i5 & 32) != 0 ? subject2.f6132i : str5, (i5 & 64) != 0 ? subject2.f6133j : z, (i5 & 128) != 0 ? subject2.f6134k : i3, (i5 & 256) != 0 ? subject2.f6135l : list, (i5 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? subject2.f6136m : str6);
    }

    public final Subject a(String str, String str2, String str3, int i2, String str4, String str5, boolean z, int i3, List<Float> list, String str6) {
        Intrinsics.checkParameterIsNotNull(str, "profileId");
        Intrinsics.checkParameterIsNotNull(str2, "subject");
        Intrinsics.checkParameterIsNotNull(str3, "average");
        String str7 = str4;
        Intrinsics.checkParameterIsNotNull(str7, "educationTypeName");
        String str8 = str5;
        Intrinsics.checkParameterIsNotNull(str8, "classAverage");
        List<Float> list2 = list;
        Intrinsics.checkParameterIsNotNull(list2, "sortedListOfAverages");
        String str9 = str6;
        Intrinsics.checkParameterIsNotNull(str9, "groupUid");
        return new Subject(str, str2, str3, i2, str7, str8, z, i3, list2, str9);
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Subject) {
                Subject subject = (Subject) obj;
                if (Intrinsics.areEqual((Object) e(), (Object) subject.e()) && Intrinsics.areEqual((Object) this.e, (Object) subject.e) && Intrinsics.areEqual((Object) this.f, (Object) subject.f)) {
                    if ((this.f6130g == subject.f6130g) && Intrinsics.areEqual((Object) this.f6131h, (Object) subject.f6131h) && Intrinsics.areEqual((Object) this.f6132i, (Object) subject.f6132i)) {
                        if (this.f6133j == subject.f6133j) {
                            if (!(this.f6134k == subject.f6134k) || !Intrinsics.areEqual((Object) this.f6135l, (Object) subject.f6135l) || !Intrinsics.areEqual((Object) this.f6136m, (Object) subject.f6136m)) {
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String f() {
        return this.f;
    }

    public final String g() {
        return this.f6132i;
    }

    public final String h() {
        return this.f6131h;
    }

    public int hashCode() {
        String e2 = e();
        int i2 = 0;
        int hashCode = (e2 != null ? e2.hashCode() : 0) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f;
        int hashCode3 = (((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f6130g) * 31;
        String str3 = this.f6131h;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f6132i;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z = this.f6133j;
        if (z) {
            z = true;
        }
        int i3 = (((hashCode5 + (z ? 1 : 0)) * 31) + this.f6134k) * 31;
        List<Float> list = this.f6135l;
        int hashCode6 = (i3 + (list != null ? list.hashCode() : 0)) * 31;
        String str5 = this.f6136m;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode6 + i2;
    }

    public final int i() {
        return this.f6134k;
    }

    public final String j() {
        return this.f6136m;
    }

    public final int k() {
        return this.f6130g;
    }

    public final List<Float> l() {
        return this.f6135l;
    }

    public final String m() {
        return this.e;
    }

    public final boolean n() {
        return this.f6133j;
    }

    public String toString() {
        StringBuilder a2 = a.a("Subject(profileId=");
        a2.append(e());
        a2.append(", subject=");
        a2.append(this.e);
        a2.append(", average=");
        a2.append(this.f);
        a2.append(", sortIndex=");
        a2.append(this.f6130g);
        a2.append(", educationTypeName=");
        a2.append(this.f6131h);
        a2.append(", classAverage=");
        a2.append(this.f6132i);
        a2.append(", isClassAverageAvailable=");
        a2.append(this.f6133j);
        a2.append(", educationTypeSortIndex=");
        a2.append(this.f6134k);
        a2.append(", sortedListOfAverages=");
        a2.append(this.f6135l);
        a2.append(", groupUid=");
        return a.a(a2, this.f6136m, ")");
    }

    public void writeToParcel(Parcel parcel, int i2) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.c);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.f6130g);
        parcel.writeString(this.f6131h);
        parcel.writeString(this.f6132i);
        parcel.writeInt(this.f6133j ? 1 : 0);
        parcel.writeInt(this.f6134k);
        List<Float> list = this.f6135l;
        parcel.writeInt(list.size());
        for (Float floatValue : list) {
            parcel.writeFloat(floatValue.floatValue());
        }
        parcel.writeString(this.f6136m);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Subject(String str, String str2, String str3, int i2, String str4, String str5, boolean z, int i3, List list, String str6, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, i2, str4, str5, z, i3, (i4 & 256) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, str6);
    }
}
