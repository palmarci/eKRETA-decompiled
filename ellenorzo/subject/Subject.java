package p289hu.ekreta.ellenorzo.subject;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p349io.ConstantsKt;
import p000a.p020b.p021a.p022a.C0082a;
import p289hu.ekreta.ellenorzo.util.mapper.ProfileSpecificModel;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B]\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0002\u0010\u0012J\t\u0010 \u001a\u00020\u0004HÆ\u0003J\t\u0010!\u001a\u00020\u0004HÆ\u0003J\t\u0010\"\u001a\u00020\u0004HÆ\u0003J\t\u0010#\u001a\u00020\u0004HÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\u0004HÆ\u0003J\t\u0010&\u001a\u00020\u0004HÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003Js\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0004HÆ\u0001J\t\u0010+\u001a\u00020\bHÖ\u0001J\u0013\u0010,\u001a\u00020\f2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020\bHÖ\u0001J\t\u00100\u001a\u00020\u0004HÖ\u0001J\u0019\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014¨\u00066"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/subject/Subject;", "Lhu/ekreta/ellenorzo/util/mapper/ProfileSpecificModel;", "Landroid/os/Parcelable;", "profileId", "", "subject", "average", "sortIndex", "", "educationTypeName", "classAverage", "isClassAverageAvailable", "", "educationTypeSortIndex", "sortedListOfAverages", "", "", "groupUid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZILjava/util/List;Ljava/lang/String;)V", "getAverage", "()Ljava/lang/String;", "getClassAverage", "getEducationTypeName", "getEducationTypeSortIndex", "()I", "getGroupUid", "()Z", "getProfileId", "getSortIndex", "getSortedListOfAverages", "()Ljava/util/List;", "getSubject", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.subject.Subject */
/* compiled from: Subject.kt */
public final class Subject implements ProfileSpecificModel, Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new Creator();

    /* renamed from: c */
    public final String f14827c;

    /* renamed from: e */
    public final String f14828e;

    /* renamed from: f */
    public final String f14829f;

    /* renamed from: g */
    public final int f14830g;

    /* renamed from: h */
    public final String f14831h;

    /* renamed from: i */
    public final String f14832i;

    /* renamed from: j */
    public final boolean f14833j;

    /* renamed from: k */
    public final int f14834k;

    /* renamed from: l */
    public final List<Float> f14835l;

    /* renamed from: m */
    public final String f14836m;

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.subject.Subject$Creator */
    public static class Creator implements android.os.Parcelable.Creator {
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
            Subject subject = new Subject(readString, readString2, readString3, readInt, readString4, readString5, z, readInt2, arrayList, parcel.readString());
            return subject;
        }

        public final Object[] newArray(int i) {
            return new Subject[i];
        }
    }

    public Subject(String str, String str2, String str3, int i, String str4, String str5, boolean z, int i2, List<Float> list, String str6) {
        Intrinsics.checkParameterIsNotNull(str, "profileId");
        Intrinsics.checkParameterIsNotNull(str2, "subject");
        Intrinsics.checkParameterIsNotNull(str3, "average");
        Intrinsics.checkParameterIsNotNull(str4, "educationTypeName");
        Intrinsics.checkParameterIsNotNull(str5, "classAverage");
        Intrinsics.checkParameterIsNotNull(list, "sortedListOfAverages");
        Intrinsics.checkParameterIsNotNull(str6, "groupUid");
        this.f14827c = str;
        this.f14828e = str2;
        this.f14829f = str3;
        this.f14830g = i;
        this.f14831h = str4;
        this.f14832i = str5;
        this.f14833j = z;
        this.f14834k = i2;
        this.f14835l = list;
        this.f14836m = str6;
    }

    public static /* synthetic */ Subject copy$default(Subject subject, String str, String str2, String str3, int i, String str4, String str5, boolean z, int i2, List list, String str6, int i3, Object obj) {
        Subject subject2 = subject;
        int i4 = i3;
        return subject.mo15685a((i4 & 1) != 0 ? subject.mo11318e() : str, (i4 & 2) != 0 ? subject2.f14828e : str2, (i4 & 4) != 0 ? subject2.f14829f : str3, (i4 & 8) != 0 ? subject2.f14830g : i, (i4 & 16) != 0 ? subject2.f14831h : str4, (i4 & 32) != 0 ? subject2.f14832i : str5, (i4 & 64) != 0 ? subject2.f14833j : z, (i4 & 128) != 0 ? subject2.f14834k : i2, (i4 & 256) != 0 ? subject2.f14835l : list, (i4 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? subject2.f14836m : str6);
    }

    /* renamed from: a */
    public final Subject mo15685a(String str, String str2, String str3, int i, String str4, String str5, boolean z, int i2, List<Float> list, String str6) {
        String str7 = str;
        Intrinsics.checkParameterIsNotNull(str, "profileId");
        String str8 = str2;
        Intrinsics.checkParameterIsNotNull(str2, "subject");
        String str9 = str3;
        Intrinsics.checkParameterIsNotNull(str3, "average");
        String str10 = str4;
        Intrinsics.checkParameterIsNotNull(str10, "educationTypeName");
        String str11 = str5;
        Intrinsics.checkParameterIsNotNull(str11, "classAverage");
        List<Float> list2 = list;
        Intrinsics.checkParameterIsNotNull(list2, "sortedListOfAverages");
        String str12 = str6;
        Intrinsics.checkParameterIsNotNull(str12, "groupUid");
        Subject subject = new Subject(str7, str8, str9, i, str10, str11, z, i2, list2, str12);
        return subject;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String mo11318e() {
        return this.f14827c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Subject) {
                Subject subject = (Subject) obj;
                if (Intrinsics.areEqual((Object) mo11318e(), (Object) subject.mo11318e()) && Intrinsics.areEqual((Object) this.f14828e, (Object) subject.f14828e) && Intrinsics.areEqual((Object) this.f14829f, (Object) subject.f14829f)) {
                    if ((this.f14830g == subject.f14830g) && Intrinsics.areEqual((Object) this.f14831h, (Object) subject.f14831h) && Intrinsics.areEqual((Object) this.f14832i, (Object) subject.f14832i)) {
                        if (this.f14833j == subject.f14833j) {
                            if (!(this.f14834k == subject.f14834k) || !Intrinsics.areEqual((Object) this.f14835l, (Object) subject.f14835l) || !Intrinsics.areEqual((Object) this.f14836m, (Object) subject.f14836m)) {
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

    /* renamed from: f */
    public final String mo15688f() {
        return this.f14829f;
    }

    /* renamed from: g */
    public final String mo15689g() {
        return this.f14832i;
    }

    /* renamed from: h */
    public final String mo15690h() {
        return this.f14831h;
    }

    public int hashCode() {
        String e = mo11318e();
        int i = 0;
        int hashCode = (e != null ? e.hashCode() : 0) * 31;
        String str = this.f14828e;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f14829f;
        int hashCode3 = (((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f14830g) * 31;
        String str3 = this.f14831h;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f14832i;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z = this.f14833j;
        if (z) {
            z = true;
        }
        int i2 = (((hashCode5 + (z ? 1 : 0)) * 31) + this.f14834k) * 31;
        List<Float> list = this.f14835l;
        int hashCode6 = (i2 + (list != null ? list.hashCode() : 0)) * 31;
        String str5 = this.f14836m;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode6 + i;
    }

    /* renamed from: i */
    public final int mo15692i() {
        return this.f14834k;
    }

    /* renamed from: j */
    public final String mo15693j() {
        return this.f14836m;
    }

    /* renamed from: k */
    public final int mo15694k() {
        return this.f14830g;
    }

    /* renamed from: l */
    public final List<Float> mo15695l() {
        return this.f14835l;
    }

    /* renamed from: m */
    public final String mo15696m() {
        return this.f14828e;
    }

    /* renamed from: n */
    public final boolean mo15697n() {
        return this.f14833j;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("Subject(profileId=");
        a.append(mo11318e());
        a.append(", subject=");
        a.append(this.f14828e);
        a.append(", average=");
        a.append(this.f14829f);
        a.append(", sortIndex=");
        a.append(this.f14830g);
        a.append(", educationTypeName=");
        a.append(this.f14831h);
        a.append(", classAverage=");
        a.append(this.f14832i);
        a.append(", isClassAverageAvailable=");
        a.append(this.f14833j);
        a.append(", educationTypeSortIndex=");
        a.append(this.f14834k);
        a.append(", sortedListOfAverages=");
        a.append(this.f14835l);
        a.append(", groupUid=");
        return C0082a.m106a(a, this.f14836m, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.f14827c);
        parcel.writeString(this.f14828e);
        parcel.writeString(this.f14829f);
        parcel.writeInt(this.f14830g);
        parcel.writeString(this.f14831h);
        parcel.writeString(this.f14832i);
        parcel.writeInt(this.f14833j ? 1 : 0);
        parcel.writeInt(this.f14834k);
        List<Float> list = this.f14835l;
        parcel.writeInt(list.size());
        for (Float floatValue : list) {
            parcel.writeFloat(floatValue.floatValue());
        }
        parcel.writeString(this.f14836m);
    }

    public /* synthetic */ Subject(String str, String str2, String str3, int i, String str4, String str5, boolean z, int i2, List list, String str6, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, i, str4, str5, z, i2, (i3 & 256) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, str6);
    }
}
