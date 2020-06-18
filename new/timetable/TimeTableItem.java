package hu.ekreta.ellenorzo.timetable;

import a.b.a.a.a;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b?\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bé\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001fJ\t\u0010@\u001a\u00020\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0019HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\u000f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00030\u001dHÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0007HÆ\u0003J\u0010\u0010S\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010%J\t\u0010T\u001a\u00020\u0007HÆ\u0003J\t\u0010U\u001a\u00020\u0007HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¢\u0002\u0010X\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010YJ\b\u0010Z\u001a\u00020\tH\u0016J\u0013\u0010[\u001a\u00020\u00192\b\u0010\\\u001a\u0004\u0018\u00010]HÖ\u0003J\u000e\u0010^\u001a\u00020\u00032\u0006\u0010_\u001a\u00020\u0003J\u000e\u0010`\u001a\u00020\u00032\u0006\u0010a\u001a\u00020bJ\t\u0010c\u001a\u00020\tHÖ\u0001J\t\u0010d\u001a\u00020\u0003HÖ\u0001J\u0019\u0010e\u001a\u00020f2\u0006\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020\tHÖ\u0001R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010#R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010#R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010#R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010#R\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010#R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b4\u0010)R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010#R\u0011\u00106\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b7\u0010-R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010#R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010#R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010#R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010#R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010#R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010#R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010#R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010#¨\u0006j"}, d2 = {"Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "Landroid/os/Parcelable;", "uid", "", "lessonTypeName", "lessonTypeDescription", "date", "Ljava/util/Calendar;", "classScheduleNumber", "", "startTime", "endTime", "subjectName", "subjectCategoryName", "subjectCategoryDescription", "classroom", "classGroupName", "teacher", "supplyTeacher", "stateDescription", "stateName", "presenceTypeDescription", "presenceTypeName", "topic", "homeworkEditedByStudentEnabled", "", "name", "profileId", "announcedTestUids", "", "homeWorkUid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;Ljava/lang/Integer;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getAnnouncedTestUids", "()Ljava/util/List;", "getClassGroupName", "()Ljava/lang/String;", "getClassScheduleNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getClassroom", "getDate", "()Ljava/util/Calendar;", "getEndTime", "getHomeWorkUid", "getHomeworkEditedByStudentEnabled", "()Z", "getLessonTypeDescription", "getLessonTypeName", "getName", "getPresenceTypeDescription", "getPresenceTypeName", "getProfileId", "getStartTime", "getStateDescription", "stateIsSchoolYearEventType", "getStateIsSchoolYearEventType", "getStateName", "getSubjectCategoryDescription", "getSubjectCategoryName", "getSubjectName", "getSupplyTeacher", "getTeacher", "getTopic", "getUid", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;Ljava/lang/Integer;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "describeContents", "equals", "other", "", "formattedNumberOfLesson", "lesson", "getLessonTimeFormatted", "ctx", "Landroid/content/Context;", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: TimeTableItem.kt */
public final class TimeTableItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    public final List<String> A;
    public final String B;
    public final boolean c = Intrinsics.areEqual((Object) this.t, (Object) "TanevRendjeEsemeny");
    public final String e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final String f6223g;

    /* renamed from: h  reason: collision with root package name */
    public final Calendar f6224h;

    /* renamed from: i  reason: collision with root package name */
    public final Integer f6225i;

    /* renamed from: j  reason: collision with root package name */
    public final Calendar f6226j;

    /* renamed from: k  reason: collision with root package name */
    public final Calendar f6227k;

    /* renamed from: l  reason: collision with root package name */
    public final String f6228l;

    /* renamed from: m  reason: collision with root package name */
    public final String f6229m;

    /* renamed from: n  reason: collision with root package name */
    public final String f6230n;

    /* renamed from: o  reason: collision with root package name */
    public final String f6231o;

    /* renamed from: p  reason: collision with root package name */
    public final String f6232p;

    /* renamed from: q  reason: collision with root package name */
    public final String f6233q;
    public final String r;
    public final String s;
    public final String t;
    public final String u;
    public final String v;
    public final String w;
    public final boolean x;
    public final String y;
    public final String z;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static class Creator implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new TimeTableItem(parcel.readString(), parcel.readString(), parcel.readString(), (Calendar) parcel.readSerializable(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, (Calendar) parcel.readSerializable(), (Calendar) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
        }

        public final Object[] newArray(int i2) {
            return new TimeTableItem[i2];
        }
    }

    public TimeTableItem(String str, String str2, String str3, Calendar calendar, Integer num, Calendar calendar2, Calendar calendar3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, boolean z2, String str16, String str17, List<String> list, String str18) {
        Calendar calendar4 = calendar2;
        Calendar calendar5 = calendar3;
        String str19 = str11;
        String str20 = str12;
        String str21 = str17;
        List<String> list2 = list;
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(calendar, "date");
        Intrinsics.checkParameterIsNotNull(calendar4, "startTime");
        Intrinsics.checkParameterIsNotNull(calendar5, "endTime");
        Intrinsics.checkParameterIsNotNull(str19, "stateDescription");
        Intrinsics.checkParameterIsNotNull(str20, "stateName");
        Intrinsics.checkParameterIsNotNull(str21, "profileId");
        Intrinsics.checkParameterIsNotNull(list2, "announcedTestUids");
        this.e = str;
        this.f = str2;
        this.f6223g = str3;
        this.f6224h = calendar;
        this.f6225i = num;
        this.f6226j = calendar4;
        this.f6227k = calendar5;
        this.f6228l = str4;
        this.f6229m = str5;
        this.f6230n = str6;
        this.f6231o = str7;
        this.f6232p = str8;
        this.f6233q = str9;
        this.r = str10;
        this.s = str19;
        this.t = str20;
        this.u = str13;
        this.v = str14;
        this.w = str15;
        this.x = z2;
        this.y = str16;
        this.z = str21;
        this.A = list2;
        this.B = str18;
    }

    public static /* synthetic */ TimeTableItem copy$default(TimeTableItem timeTableItem, String str, String str2, String str3, Calendar calendar, Integer num, Calendar calendar2, Calendar calendar3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, boolean z2, String str16, String str17, List list, String str18, int i2, Object obj) {
        TimeTableItem timeTableItem2 = timeTableItem;
        int i3 = i2;
        return timeTableItem.a((i3 & 1) != 0 ? timeTableItem2.e : str, (i3 & 2) != 0 ? timeTableItem2.f : str2, (i3 & 4) != 0 ? timeTableItem2.f6223g : str3, (i3 & 8) != 0 ? timeTableItem2.f6224h : calendar, (i3 & 16) != 0 ? timeTableItem2.f6225i : num, (i3 & 32) != 0 ? timeTableItem2.f6226j : calendar2, (i3 & 64) != 0 ? timeTableItem2.f6227k : calendar3, (i3 & 128) != 0 ? timeTableItem2.f6228l : str4, (i3 & 256) != 0 ? timeTableItem2.f6229m : str5, (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? timeTableItem2.f6230n : str6, (i3 & 1024) != 0 ? timeTableItem2.f6231o : str7, (i3 & 2048) != 0 ? timeTableItem2.f6232p : str8, (i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? timeTableItem2.f6233q : str9, (i3 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? timeTableItem2.r : str10, (i3 & 16384) != 0 ? timeTableItem2.s : str11, (i3 & 32768) != 0 ? timeTableItem2.t : str12, (i3 & 65536) != 0 ? timeTableItem2.u : str13, (i3 & 131072) != 0 ? timeTableItem2.v : str14, (i3 & 262144) != 0 ? timeTableItem2.w : str15, (i3 & 524288) != 0 ? timeTableItem2.x : z2, (i3 & 1048576) != 0 ? timeTableItem2.y : str16, (i3 & 2097152) != 0 ? timeTableItem2.z : str17, (i3 & 4194304) != 0 ? timeTableItem2.A : list, (i3 & 8388608) != 0 ? timeTableItem2.B : str18);
    }

    public final String A() {
        return this.w;
    }

    public final String B() {
        return this.e;
    }

    public final TimeTableItem a(String str, String str2, String str3, Calendar calendar, Integer num, Calendar calendar2, Calendar calendar3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, boolean z2, String str16, String str17, List<String> list, String str18) {
        String str19 = str;
        Intrinsics.checkParameterIsNotNull(str19, "uid");
        Intrinsics.checkParameterIsNotNull(calendar, "date");
        Intrinsics.checkParameterIsNotNull(calendar2, "startTime");
        Intrinsics.checkParameterIsNotNull(calendar3, "endTime");
        Intrinsics.checkParameterIsNotNull(str11, "stateDescription");
        Intrinsics.checkParameterIsNotNull(str12, "stateName");
        Intrinsics.checkParameterIsNotNull(str17, "profileId");
        Intrinsics.checkParameterIsNotNull(list, "announcedTestUids");
        return new TimeTableItem(str19, str2, str3, calendar, num, calendar2, calendar3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, z2, str16, str17, list, str18);
    }

    public final String a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "lesson");
        return this.f6225i + str;
    }

    public final List<String> d() {
        return this.A;
    }

    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f6232p;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TimeTableItem) {
                TimeTableItem timeTableItem = (TimeTableItem) obj;
                if (Intrinsics.areEqual((Object) this.e, (Object) timeTableItem.e) && Intrinsics.areEqual((Object) this.f, (Object) timeTableItem.f) && Intrinsics.areEqual((Object) this.f6223g, (Object) timeTableItem.f6223g) && Intrinsics.areEqual((Object) this.f6224h, (Object) timeTableItem.f6224h) && Intrinsics.areEqual((Object) this.f6225i, (Object) timeTableItem.f6225i) && Intrinsics.areEqual((Object) this.f6226j, (Object) timeTableItem.f6226j) && Intrinsics.areEqual((Object) this.f6227k, (Object) timeTableItem.f6227k) && Intrinsics.areEqual((Object) this.f6228l, (Object) timeTableItem.f6228l) && Intrinsics.areEqual((Object) this.f6229m, (Object) timeTableItem.f6229m) && Intrinsics.areEqual((Object) this.f6230n, (Object) timeTableItem.f6230n) && Intrinsics.areEqual((Object) this.f6231o, (Object) timeTableItem.f6231o) && Intrinsics.areEqual((Object) this.f6232p, (Object) timeTableItem.f6232p) && Intrinsics.areEqual((Object) this.f6233q, (Object) timeTableItem.f6233q) && Intrinsics.areEqual((Object) this.r, (Object) timeTableItem.r) && Intrinsics.areEqual((Object) this.s, (Object) timeTableItem.s) && Intrinsics.areEqual((Object) this.t, (Object) timeTableItem.t) && Intrinsics.areEqual((Object) this.u, (Object) timeTableItem.u) && Intrinsics.areEqual((Object) this.v, (Object) timeTableItem.v) && Intrinsics.areEqual((Object) this.w, (Object) timeTableItem.w)) {
                    if (!(this.x == timeTableItem.x) || !Intrinsics.areEqual((Object) this.y, (Object) timeTableItem.y) || !Intrinsics.areEqual((Object) this.z, (Object) timeTableItem.z) || !Intrinsics.areEqual((Object) this.A, (Object) timeTableItem.A) || !Intrinsics.areEqual((Object) this.B, (Object) timeTableItem.B)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final Integer f() {
        return this.f6225i;
    }

    public final String g() {
        return this.f6231o;
    }

    public final Calendar h() {
        return this.f6224h;
    }

    public int hashCode() {
        String str = this.e;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6223g;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Calendar calendar = this.f6224h;
        int hashCode4 = (hashCode3 + (calendar != null ? calendar.hashCode() : 0)) * 31;
        Integer num = this.f6225i;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
        Calendar calendar2 = this.f6226j;
        int hashCode6 = (hashCode5 + (calendar2 != null ? calendar2.hashCode() : 0)) * 31;
        Calendar calendar3 = this.f6227k;
        int hashCode7 = (hashCode6 + (calendar3 != null ? calendar3.hashCode() : 0)) * 31;
        String str4 = this.f6228l;
        int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f6229m;
        int hashCode9 = (hashCode8 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f6230n;
        int hashCode10 = (hashCode9 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f6231o;
        int hashCode11 = (hashCode10 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f6232p;
        int hashCode12 = (hashCode11 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f6233q;
        int hashCode13 = (hashCode12 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.r;
        int hashCode14 = (hashCode13 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.s;
        int hashCode15 = (hashCode14 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.t;
        int hashCode16 = (hashCode15 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.u;
        int hashCode17 = (hashCode16 + (str13 != null ? str13.hashCode() : 0)) * 31;
        String str14 = this.v;
        int hashCode18 = (hashCode17 + (str14 != null ? str14.hashCode() : 0)) * 31;
        String str15 = this.w;
        int hashCode19 = (hashCode18 + (str15 != null ? str15.hashCode() : 0)) * 31;
        boolean z2 = this.x;
        if (z2) {
            z2 = true;
        }
        int i3 = (hashCode19 + (z2 ? 1 : 0)) * 31;
        String str16 = this.y;
        int hashCode20 = (i3 + (str16 != null ? str16.hashCode() : 0)) * 31;
        String str17 = this.z;
        int hashCode21 = (hashCode20 + (str17 != null ? str17.hashCode() : 0)) * 31;
        List<String> list = this.A;
        int hashCode22 = (hashCode21 + (list != null ? list.hashCode() : 0)) * 31;
        String str18 = this.B;
        if (str18 != null) {
            i2 = str18.hashCode();
        }
        return hashCode22 + i2;
    }

    public final Calendar i() {
        return this.f6227k;
    }

    public final String j() {
        return this.B;
    }

    public final boolean k() {
        return this.x;
    }

    public final String l() {
        return this.f6223g;
    }

    public final String m() {
        return this.f;
    }

    public final String n() {
        return this.y;
    }

    public final String o() {
        return this.u;
    }

    public final String p() {
        return this.v;
    }

    public final String q() {
        return this.z;
    }

    public final Calendar r() {
        return this.f6226j;
    }

    public final String s() {
        return this.s;
    }

    public final boolean t() {
        return this.c;
    }

    public String toString() {
        StringBuilder a2 = a.a("TimeTableItem(uid=");
        a2.append(this.e);
        a2.append(", lessonTypeName=");
        a2.append(this.f);
        a2.append(", lessonTypeDescription=");
        a2.append(this.f6223g);
        a2.append(", date=");
        a2.append(this.f6224h);
        a2.append(", classScheduleNumber=");
        a2.append(this.f6225i);
        a2.append(", startTime=");
        a2.append(this.f6226j);
        a2.append(", endTime=");
        a2.append(this.f6227k);
        a2.append(", subjectName=");
        a2.append(this.f6228l);
        a2.append(", subjectCategoryName=");
        a2.append(this.f6229m);
        a2.append(", subjectCategoryDescription=");
        a2.append(this.f6230n);
        a2.append(", classroom=");
        a2.append(this.f6231o);
        a2.append(", classGroupName=");
        a2.append(this.f6232p);
        a2.append(", teacher=");
        a2.append(this.f6233q);
        a2.append(", supplyTeacher=");
        a2.append(this.r);
        a2.append(", stateDescription=");
        a2.append(this.s);
        a2.append(", stateName=");
        a2.append(this.t);
        a2.append(", presenceTypeDescription=");
        a2.append(this.u);
        a2.append(", presenceTypeName=");
        a2.append(this.v);
        a2.append(", topic=");
        a2.append(this.w);
        a2.append(", homeworkEditedByStudentEnabled=");
        a2.append(this.x);
        a2.append(", name=");
        a2.append(this.y);
        a2.append(", profileId=");
        a2.append(this.z);
        a2.append(", announcedTestUids=");
        a2.append(this.A);
        a2.append(", homeWorkUid=");
        return a.a(a2, this.B, ")");
    }

    public final String u() {
        return this.t;
    }

    public final String v() {
        return this.f6230n;
    }

    public final String w() {
        return this.f6229m;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int i3;
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.f6223g);
        parcel.writeSerializable(this.f6224h);
        Integer num = this.f6225i;
        if (num != null) {
            parcel.writeInt(1);
            i3 = num.intValue();
        } else {
            i3 = 0;
        }
        parcel.writeInt(i3);
        parcel.writeSerializable(this.f6226j);
        parcel.writeSerializable(this.f6227k);
        parcel.writeString(this.f6228l);
        parcel.writeString(this.f6229m);
        parcel.writeString(this.f6230n);
        parcel.writeString(this.f6231o);
        parcel.writeString(this.f6232p);
        parcel.writeString(this.f6233q);
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeString(this.u);
        parcel.writeString(this.v);
        parcel.writeString(this.w);
        parcel.writeInt(this.x ? 1 : 0);
        parcel.writeString(this.y);
        parcel.writeString(this.z);
        parcel.writeStringList(this.A);
        parcel.writeString(this.B);
    }

    public final String x() {
        return this.f6228l;
    }

    public final String y() {
        return this.r;
    }

    public final String z() {
        return this.f6233q;
    }

    public final String a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "ctx");
        StringBuilder sb = new StringBuilder();
        sb.append(UtilsKt.d(this.f6224h));
        sb.append(System.lineSeparator());
        String string = context.getString(R.string.lesson);
        Intrinsics.checkExpressionValueIsNotNull(string, "ctx.getString(R.string.lesson)");
        sb.append(a(string));
        sb.append(' ');
        sb.append('(');
        sb.append(UtilsKt.h(this.f6226j));
        sb.append(" - ");
        sb.append(UtilsKt.h(this.f6227k));
        sb.append(')');
        return sb.toString();
    }
}
