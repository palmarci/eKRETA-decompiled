package p289hu.ekreta.ellenorzo.subject.detail;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p349io.ConstantsKt;
import p000a.p020b.p021a.p022a.C0082a;
import p289hu.ekreta.ellenorzo.evaluation.Evaluation.Type;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0014J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00103\u001a\u00020\rHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\b\u00106\u001a\u000207H\u0016J\u0013\u00108\u001a\u00020\r2\b\u00109\u001a\u0004\u0018\u00010:HÖ\u0003J\t\u0010;\u001a\u000207HÖ\u0001J\t\u0010<\u001a\u00020\u0003HÖ\u0001J\u0019\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u000207HÖ\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0017\u0010\u001d\u001a\u00020\r¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010!R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006B"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/subject/detail/SubjectParameters;", "Landroid/os/Parcelable;", "subjectId", "", "evaluationType", "Lhu/ekreta/ellenorzo/evaluation/Evaluation$Type;", "toDate", "Ljava/util/Calendar;", "evaluationText", "teacherName", "averageText", "classAverageText", "isClassAverageAvailable", "", "theme", "educationTypeName", "sortedListOfAverages", "", "", "groupUid", "(Ljava/lang/String;Lhu/ekreta/ellenorzo/evaluation/Evaluation$Type;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getAverageText", "()Ljava/lang/String;", "getClassAverageText", "getEducationTypeName", "getEvaluationText", "getEvaluationType", "()Lhu/ekreta/ellenorzo/evaluation/Evaluation$Type;", "getGroupUid", "hasNote", "hasNote$annotations", "()V", "getHasNote", "()Z", "getSortedListOfAverages", "()Ljava/util/List;", "getSubjectId", "getTeacherName", "getTheme", "getToDate", "()Ljava/util/Calendar;", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.subject.detail.SubjectParameters */
/* compiled from: SubjectParameters.kt */
public final class SubjectParameters implements Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new Creator();

    /* renamed from: c */
    public final boolean f15073c;

    /* renamed from: e */
    public final String f15074e;

    /* renamed from: f */
    public final Type f15075f;

    /* renamed from: g */
    public final Calendar f15076g;

    /* renamed from: h */
    public final String f15077h;

    /* renamed from: i */
    public final String f15078i;

    /* renamed from: j */
    public final String f15079j;

    /* renamed from: k */
    public final String f15080k;

    /* renamed from: l */
    public final boolean f15081l;

    /* renamed from: m */
    public final String f15082m;

    /* renamed from: n */
    public final String f15083n;

    /* renamed from: o */
    public final List<Float> f15084o;

    /* renamed from: p */
    public final String f15085p;

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.subject.detail.SubjectParameters$Creator */
    public static class Creator implements android.os.Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            String readString = parcel.readString();
            Type type = (Type) Enum.valueOf(Type.class, parcel.readString());
            Calendar calendar = (Calendar) parcel.readSerializable();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add(Float.valueOf(parcel.readFloat()));
                readInt--;
            }
            SubjectParameters subjectParameters = new SubjectParameters(readString, type, calendar, readString2, readString3, readString4, readString5, z, readString6, readString7, arrayList, parcel.readString());
            return subjectParameters;
        }

        public final Object[] newArray(int i) {
            return new SubjectParameters[i];
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0045, code lost:
        if ((r2 == null || kotlin.text.StringsKt__StringsJVMKt.isBlank(r2)) == false) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SubjectParameters(java.lang.String r2, p289hu.ekreta.ellenorzo.evaluation.Evaluation.Type r3, java.util.Calendar r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, boolean r9, java.lang.String r10, java.lang.String r11, java.util.List<java.lang.Float> r12, java.lang.String r13) {
        /*
            r1 = this;
            java.lang.String r0 = "subjectId"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r0)
            java.lang.String r0 = "evaluationType"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r0)
            java.lang.String r0 = "educationTypeName"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r11, r0)
            java.lang.String r0 = "sortedListOfAverages"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r12, r0)
            r1.<init>()
            r1.f15074e = r2
            r1.f15075f = r3
            r1.f15076g = r4
            r1.f15077h = r5
            r1.f15078i = r6
            r1.f15079j = r7
            r1.f15080k = r8
            r1.f15081l = r9
            r1.f15082m = r10
            r1.f15083n = r11
            r1.f15084o = r12
            r1.f15085p = r13
            hu.ekreta.ellenorzo.evaluation.Evaluation$Type r2 = r1.f15075f
            hu.ekreta.ellenorzo.evaluation.Evaluation$Type r3 = p289hu.ekreta.ellenorzo.evaluation.Evaluation.Type.MidYear
            r4 = 1
            r5 = 0
            if (r2 == r3) goto L_0x0048
            java.lang.String r2 = r1.f15082m
            if (r2 == 0) goto L_0x0044
            boolean r2 = kotlin.text.StringsKt__StringsJVMKt.isBlank(r2)
            if (r2 == 0) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r2 = 0
            goto L_0x0045
        L_0x0044:
            r2 = 1
        L_0x0045:
            if (r2 != 0) goto L_0x0048
            goto L_0x0049
        L_0x0048:
            r4 = 0
        L_0x0049:
            r1.f15073c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.subject.detail.SubjectParameters.<init>(java.lang.String, hu.ekreta.ellenorzo.evaluation.Evaluation$Type, java.util.Calendar, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.util.List, java.lang.String):void");
    }

    public static /* synthetic */ SubjectParameters copy$default(SubjectParameters subjectParameters, String str, Type type, Calendar calendar, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, List list, String str8, int i, Object obj) {
        SubjectParameters subjectParameters2 = subjectParameters;
        int i2 = i;
        return subjectParameters.mo15939a((i2 & 1) != 0 ? subjectParameters2.f15074e : str, (i2 & 2) != 0 ? subjectParameters2.f15075f : type, (i2 & 4) != 0 ? subjectParameters2.f15076g : calendar, (i2 & 8) != 0 ? subjectParameters2.f15077h : str2, (i2 & 16) != 0 ? subjectParameters2.f15078i : str3, (i2 & 32) != 0 ? subjectParameters2.f15079j : str4, (i2 & 64) != 0 ? subjectParameters2.f15080k : str5, (i2 & 128) != 0 ? subjectParameters2.f15081l : z, (i2 & 256) != 0 ? subjectParameters2.f15082m : str6, (i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? subjectParameters2.f15083n : str7, (i2 & 1024) != 0 ? subjectParameters2.f15084o : list, (i2 & 2048) != 0 ? subjectParameters2.f15085p : str8);
    }

    public static /* synthetic */ void hasNote$annotations() {
    }

    /* renamed from: a */
    public final SubjectParameters mo15939a(String str, Type type, Calendar calendar, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, List<Float> list, String str8) {
        String str9 = str;
        Intrinsics.checkParameterIsNotNull(str, "subjectId");
        Type type2 = type;
        Intrinsics.checkParameterIsNotNull(type2, "evaluationType");
        String str10 = str7;
        Intrinsics.checkParameterIsNotNull(str10, "educationTypeName");
        List<Float> list2 = list;
        Intrinsics.checkParameterIsNotNull(list2, "sortedListOfAverages");
        SubjectParameters subjectParameters = new SubjectParameters(str9, type2, calendar, str2, str3, str4, str5, z, str6, str10, list2, str8);
        return subjectParameters;
    }

    /* renamed from: d */
    public final String mo15940d() {
        return this.f15079j;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo15942e() {
        return this.f15080k;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SubjectParameters) {
                SubjectParameters subjectParameters = (SubjectParameters) obj;
                if (Intrinsics.areEqual((Object) this.f15074e, (Object) subjectParameters.f15074e) && Intrinsics.areEqual((Object) this.f15075f, (Object) subjectParameters.f15075f) && Intrinsics.areEqual((Object) this.f15076g, (Object) subjectParameters.f15076g) && Intrinsics.areEqual((Object) this.f15077h, (Object) subjectParameters.f15077h) && Intrinsics.areEqual((Object) this.f15078i, (Object) subjectParameters.f15078i) && Intrinsics.areEqual((Object) this.f15079j, (Object) subjectParameters.f15079j) && Intrinsics.areEqual((Object) this.f15080k, (Object) subjectParameters.f15080k)) {
                    if (!(this.f15081l == subjectParameters.f15081l) || !Intrinsics.areEqual((Object) this.f15082m, (Object) subjectParameters.f15082m) || !Intrinsics.areEqual((Object) this.f15083n, (Object) subjectParameters.f15083n) || !Intrinsics.areEqual((Object) this.f15084o, (Object) subjectParameters.f15084o) || !Intrinsics.areEqual((Object) this.f15085p, (Object) subjectParameters.f15085p)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final String mo15944f() {
        return this.f15083n;
    }

    /* renamed from: g */
    public final String mo15945g() {
        return this.f15077h;
    }

    /* renamed from: h */
    public final Type mo15946h() {
        return this.f15075f;
    }

    public int hashCode() {
        String str = this.f15074e;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Type type = this.f15075f;
        int hashCode2 = (hashCode + (type != null ? type.hashCode() : 0)) * 31;
        Calendar calendar = this.f15076g;
        int hashCode3 = (hashCode2 + (calendar != null ? calendar.hashCode() : 0)) * 31;
        String str2 = this.f15077h;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f15078i;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f15079j;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f15080k;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        boolean z = this.f15081l;
        if (z) {
            z = true;
        }
        int i2 = (hashCode7 + (z ? 1 : 0)) * 31;
        String str6 = this.f15082m;
        int hashCode8 = (i2 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f15083n;
        int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31;
        List<Float> list = this.f15084o;
        int hashCode10 = (hashCode9 + (list != null ? list.hashCode() : 0)) * 31;
        String str8 = this.f15085p;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return hashCode10 + i;
    }

    /* renamed from: i */
    public final boolean mo15948i() {
        return this.f15073c;
    }

    /* renamed from: j */
    public final List<Float> mo15949j() {
        return this.f15084o;
    }

    /* renamed from: k */
    public final String mo15950k() {
        return this.f15074e;
    }

    /* renamed from: l */
    public final String mo15951l() {
        return this.f15078i;
    }

    /* renamed from: m */
    public final String mo15952m() {
        return this.f15082m;
    }

    /* renamed from: n */
    public final boolean mo15953n() {
        return this.f15081l;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("SubjectParameters(subjectId=");
        a.append(this.f15074e);
        a.append(", evaluationType=");
        a.append(this.f15075f);
        a.append(", toDate=");
        a.append(this.f15076g);
        a.append(", evaluationText=");
        a.append(this.f15077h);
        a.append(", teacherName=");
        a.append(this.f15078i);
        a.append(", averageText=");
        a.append(this.f15079j);
        a.append(", classAverageText=");
        a.append(this.f15080k);
        a.append(", isClassAverageAvailable=");
        a.append(this.f15081l);
        a.append(", theme=");
        a.append(this.f15082m);
        a.append(", educationTypeName=");
        a.append(this.f15083n);
        a.append(", sortedListOfAverages=");
        a.append(this.f15084o);
        a.append(", groupUid=");
        return C0082a.m106a(a, this.f15085p, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.f15074e);
        parcel.writeString(this.f15075f.name());
        parcel.writeSerializable(this.f15076g);
        parcel.writeString(this.f15077h);
        parcel.writeString(this.f15078i);
        parcel.writeString(this.f15079j);
        parcel.writeString(this.f15080k);
        parcel.writeInt(this.f15081l ? 1 : 0);
        parcel.writeString(this.f15082m);
        parcel.writeString(this.f15083n);
        List<Float> list = this.f15084o;
        parcel.writeInt(list.size());
        for (Float floatValue : list) {
            parcel.writeFloat(floatValue.floatValue());
        }
        parcel.writeString(this.f15085p);
    }

    public /* synthetic */ SubjectParameters(String str, Type type, Calendar calendar, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, List list, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = i;
        this(str, (i2 & 2) != 0 ? Type.MidYear : type, (i2 & 4) != 0 ? null : calendar, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : str5, (i2 & 128) != 0 ? true : z, (i2 & 256) != 0 ? null : str6, str7, (i2 & 1024) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 2048) != 0 ? null : str8);
    }
}
