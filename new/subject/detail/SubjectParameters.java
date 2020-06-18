package hu.ekreta.ellenorzo.subject.detail;

import a.b.a.a.a;
import android.os.Parcel;
import android.os.Parcelable;
import hu.ekreta.ellenorzo.evaluation.Evaluation;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0014J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00103\u001a\u00020\rHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\b\u00106\u001a\u000207H\u0016J\u0013\u00108\u001a\u00020\r2\b\u00109\u001a\u0004\u0018\u00010:HÖ\u0003J\t\u0010;\u001a\u000207HÖ\u0001J\t\u0010<\u001a\u00020\u0003HÖ\u0001J\u0019\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u000207HÖ\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0017\u0010\u001d\u001a\u00020\r¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010!R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006B"}, d2 = {"Lhu/ekreta/ellenorzo/subject/detail/SubjectParameters;", "Landroid/os/Parcelable;", "subjectId", "", "evaluationType", "Lhu/ekreta/ellenorzo/evaluation/Evaluation$Type;", "toDate", "Ljava/util/Calendar;", "evaluationText", "teacherName", "averageText", "classAverageText", "isClassAverageAvailable", "", "theme", "educationTypeName", "sortedListOfAverages", "", "", "groupUid", "(Ljava/lang/String;Lhu/ekreta/ellenorzo/evaluation/Evaluation$Type;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getAverageText", "()Ljava/lang/String;", "getClassAverageText", "getEducationTypeName", "getEvaluationText", "getEvaluationType", "()Lhu/ekreta/ellenorzo/evaluation/Evaluation$Type;", "getGroupUid", "hasNote", "hasNote$annotations", "()V", "getHasNote", "()Z", "getSortedListOfAverages", "()Ljava/util/List;", "getSubjectId", "getTeacherName", "getTheme", "getToDate", "()Ljava/util/Calendar;", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: SubjectParameters.kt */
public final class SubjectParameters implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    public final boolean c;
    public final String e;
    public final Evaluation.Type f;

    /* renamed from: g  reason: collision with root package name */
    public final Calendar f6205g;

    /* renamed from: h  reason: collision with root package name */
    public final String f6206h;

    /* renamed from: i  reason: collision with root package name */
    public final String f6207i;

    /* renamed from: j  reason: collision with root package name */
    public final String f6208j;

    /* renamed from: k  reason: collision with root package name */
    public final String f6209k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f6210l;

    /* renamed from: m  reason: collision with root package name */
    public final String f6211m;

    /* renamed from: n  reason: collision with root package name */
    public final String f6212n;

    /* renamed from: o  reason: collision with root package name */
    public final List<Float> f6213o;

    /* renamed from: p  reason: collision with root package name */
    public final String f6214p;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static class Creator implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            String readString = parcel.readString();
            Evaluation.Type type = (Evaluation.Type) Enum.valueOf(Evaluation.Type.class, parcel.readString());
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
            return new SubjectParameters(readString, type, calendar, readString2, readString3, readString4, readString5, z, readString6, readString7, arrayList, parcel.readString());
        }

        public final Object[] newArray(int i2) {
            return new SubjectParameters[i2];
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0045, code lost:
        if ((r2 == null || kotlin.text.StringsKt__StringsJVMKt.isBlank(r2)) == false) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SubjectParameters(java.lang.String r2, hu.ekreta.ellenorzo.evaluation.Evaluation.Type r3, java.util.Calendar r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, boolean r9, java.lang.String r10, java.lang.String r11, java.util.List<java.lang.Float> r12, java.lang.String r13) {
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
            r1.e = r2
            r1.f = r3
            r1.f6205g = r4
            r1.f6206h = r5
            r1.f6207i = r6
            r1.f6208j = r7
            r1.f6209k = r8
            r1.f6210l = r9
            r1.f6211m = r10
            r1.f6212n = r11
            r1.f6213o = r12
            r1.f6214p = r13
            hu.ekreta.ellenorzo.evaluation.Evaluation$Type r2 = r1.f
            hu.ekreta.ellenorzo.evaluation.Evaluation$Type r3 = hu.ekreta.ellenorzo.evaluation.Evaluation.Type.MidYear
            r4 = 1
            r5 = 0
            if (r2 == r3) goto L_0x0048
            java.lang.String r2 = r1.f6211m
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
            r1.c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.subject.detail.SubjectParameters.<init>(java.lang.String, hu.ekreta.ellenorzo.evaluation.Evaluation$Type, java.util.Calendar, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.util.List, java.lang.String):void");
    }

    public static /* synthetic */ SubjectParameters copy$default(SubjectParameters subjectParameters, String str, Evaluation.Type type, Calendar calendar, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, List list, String str8, int i2, Object obj) {
        SubjectParameters subjectParameters2 = subjectParameters;
        int i3 = i2;
        return subjectParameters.a((i3 & 1) != 0 ? subjectParameters2.e : str, (i3 & 2) != 0 ? subjectParameters2.f : type, (i3 & 4) != 0 ? subjectParameters2.f6205g : calendar, (i3 & 8) != 0 ? subjectParameters2.f6206h : str2, (i3 & 16) != 0 ? subjectParameters2.f6207i : str3, (i3 & 32) != 0 ? subjectParameters2.f6208j : str4, (i3 & 64) != 0 ? subjectParameters2.f6209k : str5, (i3 & 128) != 0 ? subjectParameters2.f6210l : z, (i3 & 256) != 0 ? subjectParameters2.f6211m : str6, (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? subjectParameters2.f6212n : str7, (i3 & 1024) != 0 ? subjectParameters2.f6213o : list, (i3 & 2048) != 0 ? subjectParameters2.f6214p : str8);
    }

    public static /* synthetic */ void hasNote$annotations() {
    }

    public final SubjectParameters a(String str, Evaluation.Type type, Calendar calendar, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, List<Float> list, String str8) {
        Intrinsics.checkParameterIsNotNull(str, "subjectId");
        Evaluation.Type type2 = type;
        Intrinsics.checkParameterIsNotNull(type2, "evaluationType");
        String str9 = str7;
        Intrinsics.checkParameterIsNotNull(str9, "educationTypeName");
        List<Float> list2 = list;
        Intrinsics.checkParameterIsNotNull(list2, "sortedListOfAverages");
        return new SubjectParameters(str, type2, calendar, str2, str3, str4, str5, z, str6, str9, list2, str8);
    }

    public final String d() {
        return this.f6208j;
    }

    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f6209k;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SubjectParameters) {
                SubjectParameters subjectParameters = (SubjectParameters) obj;
                if (Intrinsics.areEqual((Object) this.e, (Object) subjectParameters.e) && Intrinsics.areEqual((Object) this.f, (Object) subjectParameters.f) && Intrinsics.areEqual((Object) this.f6205g, (Object) subjectParameters.f6205g) && Intrinsics.areEqual((Object) this.f6206h, (Object) subjectParameters.f6206h) && Intrinsics.areEqual((Object) this.f6207i, (Object) subjectParameters.f6207i) && Intrinsics.areEqual((Object) this.f6208j, (Object) subjectParameters.f6208j) && Intrinsics.areEqual((Object) this.f6209k, (Object) subjectParameters.f6209k)) {
                    if (!(this.f6210l == subjectParameters.f6210l) || !Intrinsics.areEqual((Object) this.f6211m, (Object) subjectParameters.f6211m) || !Intrinsics.areEqual((Object) this.f6212n, (Object) subjectParameters.f6212n) || !Intrinsics.areEqual((Object) this.f6213o, (Object) subjectParameters.f6213o) || !Intrinsics.areEqual((Object) this.f6214p, (Object) subjectParameters.f6214p)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String f() {
        return this.f6212n;
    }

    public final String g() {
        return this.f6206h;
    }

    public final Evaluation.Type h() {
        return this.f;
    }

    public int hashCode() {
        String str = this.e;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Evaluation.Type type = this.f;
        int hashCode2 = (hashCode + (type != null ? type.hashCode() : 0)) * 31;
        Calendar calendar = this.f6205g;
        int hashCode3 = (hashCode2 + (calendar != null ? calendar.hashCode() : 0)) * 31;
        String str2 = this.f6206h;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6207i;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f6208j;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f6209k;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        boolean z = this.f6210l;
        if (z) {
            z = true;
        }
        int i3 = (hashCode7 + (z ? 1 : 0)) * 31;
        String str6 = this.f6211m;
        int hashCode8 = (i3 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f6212n;
        int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31;
        List<Float> list = this.f6213o;
        int hashCode10 = (hashCode9 + (list != null ? list.hashCode() : 0)) * 31;
        String str8 = this.f6214p;
        if (str8 != null) {
            i2 = str8.hashCode();
        }
        return hashCode10 + i2;
    }

    public final boolean i() {
        return this.c;
    }

    public final List<Float> j() {
        return this.f6213o;
    }

    public final String k() {
        return this.e;
    }

    public final String l() {
        return this.f6207i;
    }

    public final String m() {
        return this.f6211m;
    }

    public final boolean n() {
        return this.f6210l;
    }

    public String toString() {
        StringBuilder a2 = a.a("SubjectParameters(subjectId=");
        a2.append(this.e);
        a2.append(", evaluationType=");
        a2.append(this.f);
        a2.append(", toDate=");
        a2.append(this.f6205g);
        a2.append(", evaluationText=");
        a2.append(this.f6206h);
        a2.append(", teacherName=");
        a2.append(this.f6207i);
        a2.append(", averageText=");
        a2.append(this.f6208j);
        a2.append(", classAverageText=");
        a2.append(this.f6209k);
        a2.append(", isClassAverageAvailable=");
        a2.append(this.f6210l);
        a2.append(", theme=");
        a2.append(this.f6211m);
        a2.append(", educationTypeName=");
        a2.append(this.f6212n);
        a2.append(", sortedListOfAverages=");
        a2.append(this.f6213o);
        a2.append(", groupUid=");
        return a.a(a2, this.f6214p, ")");
    }

    public void writeToParcel(Parcel parcel, int i2) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.e);
        parcel.writeString(this.f.name());
        parcel.writeSerializable(this.f6205g);
        parcel.writeString(this.f6206h);
        parcel.writeString(this.f6207i);
        parcel.writeString(this.f6208j);
        parcel.writeString(this.f6209k);
        parcel.writeInt(this.f6210l ? 1 : 0);
        parcel.writeString(this.f6211m);
        parcel.writeString(this.f6212n);
        List<Float> list = this.f6213o;
        parcel.writeInt(list.size());
        for (Float floatValue : list) {
            parcel.writeFloat(floatValue.floatValue());
        }
        parcel.writeString(this.f6214p);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SubjectParameters(java.lang.String r16, hu.ekreta.ellenorzo.evaluation.Evaluation.Type r17, java.util.Calendar r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, boolean r23, java.lang.String r24, java.lang.String r25, java.util.List r26, java.lang.String r27, int r28, kotlin.jvm.internal.DefaultConstructorMarker r29) {
        /*
            r15 = this;
            r0 = r28
            r1 = r0 & 2
            if (r1 == 0) goto L_0x000a
            hu.ekreta.ellenorzo.evaluation.Evaluation$Type r1 = hu.ekreta.ellenorzo.evaluation.Evaluation.Type.MidYear
            r4 = r1
            goto L_0x000c
        L_0x000a:
            r4 = r17
        L_0x000c:
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x0013
            r5 = r2
            goto L_0x0015
        L_0x0013:
            r5 = r18
        L_0x0015:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x001b
            r6 = r2
            goto L_0x001d
        L_0x001b:
            r6 = r19
        L_0x001d:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0023
            r7 = r2
            goto L_0x0025
        L_0x0023:
            r7 = r20
        L_0x0025:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x002b
            r8 = r2
            goto L_0x002d
        L_0x002b:
            r8 = r21
        L_0x002d:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0033
            r9 = r2
            goto L_0x0035
        L_0x0033:
            r9 = r22
        L_0x0035:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x003c
            r1 = 1
            r10 = 1
            goto L_0x003e
        L_0x003c:
            r10 = r23
        L_0x003e:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0044
            r11 = r2
            goto L_0x0046
        L_0x0044:
            r11 = r24
        L_0x0046:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0050
            java.util.List r1 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
            r13 = r1
            goto L_0x0052
        L_0x0050:
            r13 = r26
        L_0x0052:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0058
            r14 = r2
            goto L_0x005a
        L_0x0058:
            r14 = r27
        L_0x005a:
            r2 = r15
            r3 = r16
            r12 = r25
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.subject.detail.SubjectParameters.<init>(java.lang.String, hu.ekreta.ellenorzo.evaluation.Evaluation$Type, java.util.Calendar, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.util.List, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
