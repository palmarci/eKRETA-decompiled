package p289hu.ekreta.ellenorzo.timetable;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p349io.ConstantsKt;
import p000a.p020b.p021a.p022a.C0082a;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.util.datetime.UtilsKt;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b?\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bé\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001fJ\t\u0010@\u001a\u00020\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0019HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\u000f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00030\u001dHÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0007HÆ\u0003J\u0010\u0010S\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010%J\t\u0010T\u001a\u00020\u0007HÆ\u0003J\t\u0010U\u001a\u00020\u0007HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¢\u0002\u0010X\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010YJ\b\u0010Z\u001a\u00020\tH\u0016J\u0013\u0010[\u001a\u00020\u00192\b\u0010\\\u001a\u0004\u0018\u00010]HÖ\u0003J\u000e\u0010^\u001a\u00020\u00032\u0006\u0010_\u001a\u00020\u0003J\u000e\u0010`\u001a\u00020\u00032\u0006\u0010a\u001a\u00020bJ\t\u0010c\u001a\u00020\tHÖ\u0001J\t\u0010d\u001a\u00020\u0003HÖ\u0001J\u0019\u0010e\u001a\u00020f2\u0006\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020\tHÖ\u0001R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010#R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010#R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010#R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010#R\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010#R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b4\u0010)R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010#R\u0011\u00106\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b7\u0010-R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010#R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010#R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010#R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010#R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010#R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010#R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010#R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010#¨\u0006j"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "Landroid/os/Parcelable;", "uid", "", "lessonTypeName", "lessonTypeDescription", "date", "Ljava/util/Calendar;", "classScheduleNumber", "", "startTime", "endTime", "subjectName", "subjectCategoryName", "subjectCategoryDescription", "classroom", "classGroupName", "teacher", "supplyTeacher", "stateDescription", "stateName", "presenceTypeDescription", "presenceTypeName", "topic", "homeworkEditedByStudentEnabled", "", "name", "profileId", "announcedTestUids", "", "homeWorkUid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;Ljava/lang/Integer;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getAnnouncedTestUids", "()Ljava/util/List;", "getClassGroupName", "()Ljava/lang/String;", "getClassScheduleNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getClassroom", "getDate", "()Ljava/util/Calendar;", "getEndTime", "getHomeWorkUid", "getHomeworkEditedByStudentEnabled", "()Z", "getLessonTypeDescription", "getLessonTypeName", "getName", "getPresenceTypeDescription", "getPresenceTypeName", "getProfileId", "getStartTime", "getStateDescription", "stateIsSchoolYearEventType", "getStateIsSchoolYearEventType", "getStateName", "getSubjectCategoryDescription", "getSubjectCategoryName", "getSubjectName", "getSupplyTeacher", "getTeacher", "getTopic", "getUid", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;Ljava/lang/Integer;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "describeContents", "equals", "other", "", "formattedNumberOfLesson", "lesson", "getLessonTimeFormatted", "ctx", "Landroid/content/Context;", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.timetable.TimeTableItem */
/* compiled from: TimeTableItem.kt */
public final class TimeTableItem implements Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new Creator();

    /* renamed from: A */
    public final List<String> f15117A;

    /* renamed from: B */
    public final String f15118B;

    /* renamed from: c */
    public final boolean f15119c = Intrinsics.areEqual((Object) this.f15135t, (Object) "TanevRendjeEsemeny");

    /* renamed from: e */
    public final String f15120e;

    /* renamed from: f */
    public final String f15121f;

    /* renamed from: g */
    public final String f15122g;

    /* renamed from: h */
    public final Calendar f15123h;

    /* renamed from: i */
    public final Integer f15124i;

    /* renamed from: j */
    public final Calendar f15125j;

    /* renamed from: k */
    public final Calendar f15126k;

    /* renamed from: l */
    public final String f15127l;

    /* renamed from: m */
    public final String f15128m;

    /* renamed from: n */
    public final String f15129n;

    /* renamed from: o */
    public final String f15130o;

    /* renamed from: p */
    public final String f15131p;

    /* renamed from: q */
    public final String f15132q;

    /* renamed from: r */
    public final String f15133r;

    /* renamed from: s */
    public final String f15134s;

    /* renamed from: t */
    public final String f15135t;

    /* renamed from: u */
    public final String f15136u;

    /* renamed from: v */
    public final String f15137v;

    /* renamed from: w */
    public final String f15138w;

    /* renamed from: x */
    public final boolean f15139x;

    /* renamed from: y */
    public final String f15140y;

    /* renamed from: z */
    public final String f15141z;

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.timetable.TimeTableItem$Creator */
    public static class Creator implements android.os.Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            TimeTableItem timeTableItem = new TimeTableItem(parcel.readString(), parcel.readString(), parcel.readString(), (Calendar) parcel.readSerializable(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, (Calendar) parcel.readSerializable(), (Calendar) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
            return timeTableItem;
        }

        public final Object[] newArray(int i) {
            return new TimeTableItem[i];
        }
    }

    public TimeTableItem(String str, String str2, String str3, Calendar calendar, Integer num, Calendar calendar2, Calendar calendar3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, boolean z, String str16, String str17, List<String> list, String str18) {
        String str19 = str;
        Calendar calendar4 = calendar;
        Calendar calendar5 = calendar2;
        Calendar calendar6 = calendar3;
        String str20 = str11;
        String str21 = str12;
        String str22 = str17;
        List<String> list2 = list;
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(calendar, "date");
        Intrinsics.checkParameterIsNotNull(calendar5, "startTime");
        Intrinsics.checkParameterIsNotNull(calendar6, "endTime");
        Intrinsics.checkParameterIsNotNull(str20, "stateDescription");
        Intrinsics.checkParameterIsNotNull(str21, "stateName");
        Intrinsics.checkParameterIsNotNull(str22, "profileId");
        Intrinsics.checkParameterIsNotNull(list2, "announcedTestUids");
        this.f15120e = str19;
        this.f15121f = str2;
        this.f15122g = str3;
        this.f15123h = calendar4;
        this.f15124i = num;
        this.f15125j = calendar5;
        this.f15126k = calendar6;
        this.f15127l = str4;
        this.f15128m = str5;
        this.f15129n = str6;
        this.f15130o = str7;
        this.f15131p = str8;
        this.f15132q = str9;
        this.f15133r = str10;
        this.f15134s = str20;
        this.f15135t = str21;
        this.f15136u = str13;
        this.f15137v = str14;
        this.f15138w = str15;
        this.f15139x = z;
        this.f15140y = str16;
        this.f15141z = str22;
        this.f15117A = list2;
        this.f15118B = str18;
    }

    public static /* synthetic */ TimeTableItem copy$default(TimeTableItem timeTableItem, String str, String str2, String str3, Calendar calendar, Integer num, Calendar calendar2, Calendar calendar3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, boolean z, String str16, String str17, List list, String str18, int i, Object obj) {
        TimeTableItem timeTableItem2 = timeTableItem;
        int i2 = i;
        return timeTableItem.mo15996a((i2 & 1) != 0 ? timeTableItem2.f15120e : str, (i2 & 2) != 0 ? timeTableItem2.f15121f : str2, (i2 & 4) != 0 ? timeTableItem2.f15122g : str3, (i2 & 8) != 0 ? timeTableItem2.f15123h : calendar, (i2 & 16) != 0 ? timeTableItem2.f15124i : num, (i2 & 32) != 0 ? timeTableItem2.f15125j : calendar2, (i2 & 64) != 0 ? timeTableItem2.f15126k : calendar3, (i2 & 128) != 0 ? timeTableItem2.f15127l : str4, (i2 & 256) != 0 ? timeTableItem2.f15128m : str5, (i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? timeTableItem2.f15129n : str6, (i2 & 1024) != 0 ? timeTableItem2.f15130o : str7, (i2 & 2048) != 0 ? timeTableItem2.f15131p : str8, (i2 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? timeTableItem2.f15132q : str9, (i2 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? timeTableItem2.f15133r : str10, (i2 & 16384) != 0 ? timeTableItem2.f15134s : str11, (i2 & 32768) != 0 ? timeTableItem2.f15135t : str12, (i2 & 65536) != 0 ? timeTableItem2.f15136u : str13, (i2 & 131072) != 0 ? timeTableItem2.f15137v : str14, (i2 & 262144) != 0 ? timeTableItem2.f15138w : str15, (i2 & 524288) != 0 ? timeTableItem2.f15139x : z, (i2 & 1048576) != 0 ? timeTableItem2.f15140y : str16, (i2 & 2097152) != 0 ? timeTableItem2.f15141z : str17, (i2 & 4194304) != 0 ? timeTableItem2.f15117A : list, (i2 & 8388608) != 0 ? timeTableItem2.f15118B : str18);
    }

    /* renamed from: A */
    public final String mo15994A() {
        return this.f15138w;
    }

    /* renamed from: B */
    public final String mo15995B() {
        return this.f15120e;
    }

    /* renamed from: a */
    public final TimeTableItem mo15996a(String str, String str2, String str3, Calendar calendar, Integer num, Calendar calendar2, Calendar calendar3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, boolean z, String str16, String str17, List<String> list, String str18) {
        String str19 = str;
        String str20 = str2;
        String str21 = str3;
        Calendar calendar4 = calendar;
        Integer num2 = num;
        Calendar calendar5 = calendar2;
        Calendar calendar6 = calendar3;
        String str22 = str4;
        String str23 = str5;
        String str24 = str6;
        String str25 = str7;
        String str26 = str8;
        String str27 = str9;
        String str28 = str10;
        String str29 = str11;
        String str30 = str12;
        String str31 = str13;
        String str32 = str14;
        String str33 = str15;
        boolean z2 = z;
        String str34 = str16;
        String str35 = str17;
        List<String> list2 = list;
        String str36 = str18;
        String str37 = str19;
        Intrinsics.checkParameterIsNotNull(str19, "uid");
        Intrinsics.checkParameterIsNotNull(calendar, "date");
        Intrinsics.checkParameterIsNotNull(calendar2, "startTime");
        Intrinsics.checkParameterIsNotNull(calendar3, "endTime");
        Intrinsics.checkParameterIsNotNull(str11, "stateDescription");
        Intrinsics.checkParameterIsNotNull(str12, "stateName");
        Intrinsics.checkParameterIsNotNull(str17, "profileId");
        Intrinsics.checkParameterIsNotNull(list, "announcedTestUids");
        TimeTableItem timeTableItem = new TimeTableItem(str37, str20, str21, calendar4, num2, calendar5, calendar6, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, z2, str34, str35, list2, str36);
        return timeTableItem;
    }

    /* renamed from: a */
    public final String mo15998a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "lesson");
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15124i);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: d */
    public final List<String> mo15999d() {
        return this.f15117A;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo16001e() {
        return this.f15131p;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TimeTableItem) {
                TimeTableItem timeTableItem = (TimeTableItem) obj;
                if (Intrinsics.areEqual((Object) this.f15120e, (Object) timeTableItem.f15120e) && Intrinsics.areEqual((Object) this.f15121f, (Object) timeTableItem.f15121f) && Intrinsics.areEqual((Object) this.f15122g, (Object) timeTableItem.f15122g) && Intrinsics.areEqual((Object) this.f15123h, (Object) timeTableItem.f15123h) && Intrinsics.areEqual((Object) this.f15124i, (Object) timeTableItem.f15124i) && Intrinsics.areEqual((Object) this.f15125j, (Object) timeTableItem.f15125j) && Intrinsics.areEqual((Object) this.f15126k, (Object) timeTableItem.f15126k) && Intrinsics.areEqual((Object) this.f15127l, (Object) timeTableItem.f15127l) && Intrinsics.areEqual((Object) this.f15128m, (Object) timeTableItem.f15128m) && Intrinsics.areEqual((Object) this.f15129n, (Object) timeTableItem.f15129n) && Intrinsics.areEqual((Object) this.f15130o, (Object) timeTableItem.f15130o) && Intrinsics.areEqual((Object) this.f15131p, (Object) timeTableItem.f15131p) && Intrinsics.areEqual((Object) this.f15132q, (Object) timeTableItem.f15132q) && Intrinsics.areEqual((Object) this.f15133r, (Object) timeTableItem.f15133r) && Intrinsics.areEqual((Object) this.f15134s, (Object) timeTableItem.f15134s) && Intrinsics.areEqual((Object) this.f15135t, (Object) timeTableItem.f15135t) && Intrinsics.areEqual((Object) this.f15136u, (Object) timeTableItem.f15136u) && Intrinsics.areEqual((Object) this.f15137v, (Object) timeTableItem.f15137v) && Intrinsics.areEqual((Object) this.f15138w, (Object) timeTableItem.f15138w)) {
                    if (!(this.f15139x == timeTableItem.f15139x) || !Intrinsics.areEqual((Object) this.f15140y, (Object) timeTableItem.f15140y) || !Intrinsics.areEqual((Object) this.f15141z, (Object) timeTableItem.f15141z) || !Intrinsics.areEqual((Object) this.f15117A, (Object) timeTableItem.f15117A) || !Intrinsics.areEqual((Object) this.f15118B, (Object) timeTableItem.f15118B)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final Integer mo16003f() {
        return this.f15124i;
    }

    /* renamed from: g */
    public final String mo16004g() {
        return this.f15130o;
    }

    /* renamed from: h */
    public final Calendar mo16005h() {
        return this.f15123h;
    }

    public int hashCode() {
        String str = this.f15120e;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f15121f;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f15122g;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Calendar calendar = this.f15123h;
        int hashCode4 = (hashCode3 + (calendar != null ? calendar.hashCode() : 0)) * 31;
        Integer num = this.f15124i;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
        Calendar calendar2 = this.f15125j;
        int hashCode6 = (hashCode5 + (calendar2 != null ? calendar2.hashCode() : 0)) * 31;
        Calendar calendar3 = this.f15126k;
        int hashCode7 = (hashCode6 + (calendar3 != null ? calendar3.hashCode() : 0)) * 31;
        String str4 = this.f15127l;
        int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f15128m;
        int hashCode9 = (hashCode8 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f15129n;
        int hashCode10 = (hashCode9 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f15130o;
        int hashCode11 = (hashCode10 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f15131p;
        int hashCode12 = (hashCode11 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f15132q;
        int hashCode13 = (hashCode12 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.f15133r;
        int hashCode14 = (hashCode13 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.f15134s;
        int hashCode15 = (hashCode14 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.f15135t;
        int hashCode16 = (hashCode15 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.f15136u;
        int hashCode17 = (hashCode16 + (str13 != null ? str13.hashCode() : 0)) * 31;
        String str14 = this.f15137v;
        int hashCode18 = (hashCode17 + (str14 != null ? str14.hashCode() : 0)) * 31;
        String str15 = this.f15138w;
        int hashCode19 = (hashCode18 + (str15 != null ? str15.hashCode() : 0)) * 31;
        boolean z = this.f15139x;
        if (z) {
            z = true;
        }
        int i2 = (hashCode19 + (z ? 1 : 0)) * 31;
        String str16 = this.f15140y;
        int hashCode20 = (i2 + (str16 != null ? str16.hashCode() : 0)) * 31;
        String str17 = this.f15141z;
        int hashCode21 = (hashCode20 + (str17 != null ? str17.hashCode() : 0)) * 31;
        List<String> list = this.f15117A;
        int hashCode22 = (hashCode21 + (list != null ? list.hashCode() : 0)) * 31;
        String str18 = this.f15118B;
        if (str18 != null) {
            i = str18.hashCode();
        }
        return hashCode22 + i;
    }

    /* renamed from: i */
    public final Calendar mo16007i() {
        return this.f15126k;
    }

    /* renamed from: j */
    public final String mo16008j() {
        return this.f15118B;
    }

    /* renamed from: k */
    public final boolean mo16009k() {
        return this.f15139x;
    }

    /* renamed from: l */
    public final String mo16010l() {
        return this.f15122g;
    }

    /* renamed from: m */
    public final String mo16011m() {
        return this.f15121f;
    }

    /* renamed from: n */
    public final String mo16012n() {
        return this.f15140y;
    }

    /* renamed from: o */
    public final String mo16013o() {
        return this.f15136u;
    }

    /* renamed from: p */
    public final String mo16014p() {
        return this.f15137v;
    }

    /* renamed from: q */
    public final String mo16015q() {
        return this.f15141z;
    }

    /* renamed from: r */
    public final Calendar mo16016r() {
        return this.f15125j;
    }

    /* renamed from: s */
    public final String mo16017s() {
        return this.f15134s;
    }

    /* renamed from: t */
    public final boolean mo16018t() {
        return this.f15119c;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("TimeTableItem(uid=");
        a.append(this.f15120e);
        a.append(", lessonTypeName=");
        a.append(this.f15121f);
        a.append(", lessonTypeDescription=");
        a.append(this.f15122g);
        a.append(", date=");
        a.append(this.f15123h);
        a.append(", classScheduleNumber=");
        a.append(this.f15124i);
        a.append(", startTime=");
        a.append(this.f15125j);
        a.append(", endTime=");
        a.append(this.f15126k);
        a.append(", subjectName=");
        a.append(this.f15127l);
        a.append(", subjectCategoryName=");
        a.append(this.f15128m);
        a.append(", subjectCategoryDescription=");
        a.append(this.f15129n);
        a.append(", classroom=");
        a.append(this.f15130o);
        a.append(", classGroupName=");
        a.append(this.f15131p);
        a.append(", teacher=");
        a.append(this.f15132q);
        a.append(", supplyTeacher=");
        a.append(this.f15133r);
        a.append(", stateDescription=");
        a.append(this.f15134s);
        a.append(", stateName=");
        a.append(this.f15135t);
        a.append(", presenceTypeDescription=");
        a.append(this.f15136u);
        a.append(", presenceTypeName=");
        a.append(this.f15137v);
        a.append(", topic=");
        a.append(this.f15138w);
        a.append(", homeworkEditedByStudentEnabled=");
        a.append(this.f15139x);
        a.append(", name=");
        a.append(this.f15140y);
        a.append(", profileId=");
        a.append(this.f15141z);
        a.append(", announcedTestUids=");
        a.append(this.f15117A);
        a.append(", homeWorkUid=");
        return C0082a.m106a(a, this.f15118B, ")");
    }

    /* renamed from: u */
    public final String mo16020u() {
        return this.f15135t;
    }

    /* renamed from: v */
    public final String mo16021v() {
        return this.f15129n;
    }

    /* renamed from: w */
    public final String mo16022w() {
        return this.f15128m;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.f15120e);
        parcel.writeString(this.f15121f);
        parcel.writeString(this.f15122g);
        parcel.writeSerializable(this.f15123h);
        Integer num = this.f15124i;
        if (num != null) {
            parcel.writeInt(1);
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        parcel.writeSerializable(this.f15125j);
        parcel.writeSerializable(this.f15126k);
        parcel.writeString(this.f15127l);
        parcel.writeString(this.f15128m);
        parcel.writeString(this.f15129n);
        parcel.writeString(this.f15130o);
        parcel.writeString(this.f15131p);
        parcel.writeString(this.f15132q);
        parcel.writeString(this.f15133r);
        parcel.writeString(this.f15134s);
        parcel.writeString(this.f15135t);
        parcel.writeString(this.f15136u);
        parcel.writeString(this.f15137v);
        parcel.writeString(this.f15138w);
        parcel.writeInt(this.f15139x ? 1 : 0);
        parcel.writeString(this.f15140y);
        parcel.writeString(this.f15141z);
        parcel.writeStringList(this.f15117A);
        parcel.writeString(this.f15118B);
    }

    /* renamed from: x */
    public final String mo16024x() {
        return this.f15127l;
    }

    /* renamed from: y */
    public final String mo16025y() {
        return this.f15133r;
    }

    /* renamed from: z */
    public final String mo16026z() {
        return this.f15132q;
    }

    /* renamed from: a */
    public final String mo15997a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "ctx");
        StringBuilder sb = new StringBuilder();
        sb.append(UtilsKt.m14841d(this.f15123h));
        sb.append(System.lineSeparator());
        String string = context.getString(C4014R.string.lesson);
        Intrinsics.checkExpressionValueIsNotNull(string, "ctx.getString(R.string.lesson)");
        sb.append(mo15998a(string));
        sb.append(' ');
        sb.append('(');
        sb.append(UtilsKt.m14844g(this.f15125j));
        sb.append(" - ");
        sb.append(UtilsKt.m14844g(this.f15126k));
        sb.append(')');
        return sb.toString();
    }
}
