package hu.ekreta.ellenorzo.announcedTest;

import a.b.a.a.a;
import android.os.Parcel;
import android.os.Parcelable;
import hu.ekreta.ellenorzo.parceler.CalendarParceler;
import hu.ekreta.ellenorzo.reminder.Reminder;
import hu.ekreta.ellenorzo.util.mapper.ReadableByUserModel;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003Bm\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0014J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0007HÆ\u0003J\t\u00101\u001a\u00020\tHÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0007HÆ\u0003J\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u00109J\b\u0010:\u001a\u00020\tH\u0016J\u0013\u0010;\u001a\u00020\u00122\b\u0010<\u001a\u0004\u0018\u00010=HÖ\u0003J\u000e\u0010>\u001a\u00020\u00052\u0006\u0010?\u001a\u00020\u0005J\t\u0010@\u001a\u00020\tHÖ\u0001J\t\u0010A\u001a\u00020\u0005HÖ\u0001J\u0019\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\tHÖ\u0001R\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0014\u0010\u0010\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u001a\u0010%\u001a\u00020&X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001a¨\u0006G"}, d2 = {"Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;", "Lhu/ekreta/ellenorzo/reminder/Reminder;", "Lhu/ekreta/ellenorzo/util/mapper/ReadableByUserModel;", "Landroid/os/Parcelable;", "uid", "", "recordingDate", "Ljava/util/Calendar;", "classScheduleNumber", "", "subject", "teacher", "theme", "modeName", "modeDescription", "announcedAtUTC", "profileId", "readByUser", "", "groupUid", "(Ljava/lang/String;Ljava/util/Calendar;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getAnnouncedAtUTC", "()Ljava/util/Calendar;", "getClassScheduleNumber", "()I", "getGroupUid", "()Ljava/lang/String;", "getModeDescription", "getModeName", "getProfileId", "getReadByUser", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRecordingDate", "getSubject", "getTeacher", "getTheme", "type", "Lhu/ekreta/ellenorzo/reminder/Reminder$Type;", "type$annotations", "()V", "getType", "()Lhu/ekreta/ellenorzo/reminder/Reminder$Type;", "getUid", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/util/Calendar;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;", "describeContents", "equals", "other", "", "formattedNumberOfLesson", "lesson", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: AnnouncedTest.kt */
public final class AnnouncedTest extends Reminder implements ReadableByUserModel, Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    public final Reminder.Type c;
    public final String e;
    public final Calendar f;

    /* renamed from: g  reason: collision with root package name */
    public final int f5003g;

    /* renamed from: h  reason: collision with root package name */
    public final String f5004h;

    /* renamed from: i  reason: collision with root package name */
    public final String f5005i;

    /* renamed from: j  reason: collision with root package name */
    public final String f5006j;

    /* renamed from: k  reason: collision with root package name */
    public final String f5007k;

    /* renamed from: l  reason: collision with root package name */
    public final String f5008l;

    /* renamed from: m  reason: collision with root package name */
    public final Calendar f5009m;

    /* renamed from: n  reason: collision with root package name */
    public final String f5010n;

    /* renamed from: o  reason: collision with root package name */
    public final Boolean f5011o;

    /* renamed from: p  reason: collision with root package name */
    public final String f5012p;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static class Creator implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Boolean bool;
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            String readString = parcel.readString();
            Calendar calendar = (Calendar) CalendarParceler.INSTANCE.create(parcel);
            int readInt = parcel.readInt();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            Calendar calendar2 = (Calendar) CalendarParceler.INSTANCE.create(parcel);
            String readString7 = parcel.readString();
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool = null;
            }
            return new AnnouncedTest(readString, calendar, readInt, readString2, readString3, readString4, readString5, readString6, calendar2, readString7, bool, parcel.readString());
        }

        public final Object[] newArray(int i2) {
            return new AnnouncedTest[i2];
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AnnouncedTest(String str, Calendar calendar, int i2, String str2, String str3, String str4, String str5, String str6, Calendar calendar2, String str7, Boolean bool, String str8, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, calendar, i2, str2, str3, str4, str5, str6, calendar2, str7, (i3 & 1024) != 0 ? null : bool, str8);
    }

    public static /* synthetic */ AnnouncedTest copy$default(AnnouncedTest announcedTest, String str, Calendar calendar, int i2, String str2, String str3, String str4, String str5, String str6, Calendar calendar2, String str7, Boolean bool, String str8, int i3, Object obj) {
        AnnouncedTest announcedTest2 = announcedTest;
        int i4 = i3;
        return announcedTest.a((i4 & 1) != 0 ? announcedTest.d() : str, (i4 & 2) != 0 ? announcedTest2.f : calendar, (i4 & 4) != 0 ? announcedTest2.f5003g : i2, (i4 & 8) != 0 ? announcedTest2.f5004h : str2, (i4 & 16) != 0 ? announcedTest2.f5005i : str3, (i4 & 32) != 0 ? announcedTest2.f5006j : str4, (i4 & 64) != 0 ? announcedTest2.f5007k : str5, (i4 & 128) != 0 ? announcedTest2.f5008l : str6, (i4 & 256) != 0 ? announcedTest2.f5009m : calendar2, (i4 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? announcedTest.e() : str7, (i4 & 1024) != 0 ? announcedTest.l() : bool, (i4 & 2048) != 0 ? announcedTest2.f5012p : str8);
    }

    public static /* synthetic */ void type$annotations() {
    }

    public final AnnouncedTest a(String str, Calendar calendar, int i2, String str2, String str3, String str4, String str5, String str6, Calendar calendar2, String str7, Boolean bool, String str8) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Calendar calendar3 = calendar;
        Intrinsics.checkParameterIsNotNull(calendar3, "recordingDate");
        String str9 = str2;
        Intrinsics.checkParameterIsNotNull(str9, "subject");
        String str10 = str3;
        Intrinsics.checkParameterIsNotNull(str10, "teacher");
        String str11 = str5;
        Intrinsics.checkParameterIsNotNull(str11, "modeName");
        String str12 = str6;
        Intrinsics.checkParameterIsNotNull(str12, "modeDescription");
        Calendar calendar4 = calendar2;
        Intrinsics.checkParameterIsNotNull(calendar4, "announcedAtUTC");
        String str13 = str7;
        Intrinsics.checkParameterIsNotNull(str13, "profileId");
        return new AnnouncedTest(str, calendar3, i2, str9, str10, str4, str11, str12, calendar4, str13, bool, str8);
    }

    public final String a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "lesson");
        return " (" + this.f5003g + str + ')';
    }

    public String d() {
        return this.e;
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.f5010n;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnnouncedTest) {
                AnnouncedTest announcedTest = (AnnouncedTest) obj;
                if (Intrinsics.areEqual((Object) d(), (Object) announcedTest.d()) && Intrinsics.areEqual((Object) this.f, (Object) announcedTest.f)) {
                    if (!(this.f5003g == announcedTest.f5003g) || !Intrinsics.areEqual((Object) this.f5004h, (Object) announcedTest.f5004h) || !Intrinsics.areEqual((Object) this.f5005i, (Object) announcedTest.f5005i) || !Intrinsics.areEqual((Object) this.f5006j, (Object) announcedTest.f5006j) || !Intrinsics.areEqual((Object) this.f5007k, (Object) announcedTest.f5007k) || !Intrinsics.areEqual((Object) this.f5008l, (Object) announcedTest.f5008l) || !Intrinsics.areEqual((Object) this.f5009m, (Object) announcedTest.f5009m) || !Intrinsics.areEqual((Object) e(), (Object) announcedTest.e()) || !Intrinsics.areEqual((Object) l(), (Object) announcedTest.l()) || !Intrinsics.areEqual((Object) this.f5012p, (Object) announcedTest.f5012p)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public Reminder.Type f() {
        return this.c;
    }

    public final Calendar g() {
        return this.f5009m;
    }

    public final int h() {
        return this.f5003g;
    }

    public int hashCode() {
        String d2 = d();
        int i2 = 0;
        int hashCode = (d2 != null ? d2.hashCode() : 0) * 31;
        Calendar calendar = this.f;
        int hashCode2 = (((hashCode + (calendar != null ? calendar.hashCode() : 0)) * 31) + this.f5003g) * 31;
        String str = this.f5004h;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5005i;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f5006j;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f5007k;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f5008l;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Calendar calendar2 = this.f5009m;
        int hashCode8 = (hashCode7 + (calendar2 != null ? calendar2.hashCode() : 0)) * 31;
        String e2 = e();
        int hashCode9 = (hashCode8 + (e2 != null ? e2.hashCode() : 0)) * 31;
        Boolean l2 = l();
        int hashCode10 = (hashCode9 + (l2 != null ? l2.hashCode() : 0)) * 31;
        String str6 = this.f5012p;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        return hashCode10 + i2;
    }

    public final String i() {
        return this.f5012p;
    }

    public final String j() {
        return this.f5008l;
    }

    public final String k() {
        return this.f5007k;
    }

    public Boolean l() {
        return this.f5011o;
    }

    public final Calendar m() {
        return this.f;
    }

    public final String n() {
        return this.f5004h;
    }

    public final String o() {
        return this.f5005i;
    }

    public final String p() {
        return this.f5006j;
    }

    public String toString() {
        StringBuilder a2 = a.a("AnnouncedTest(uid=");
        a2.append(d());
        a2.append(", recordingDate=");
        a2.append(this.f);
        a2.append(", classScheduleNumber=");
        a2.append(this.f5003g);
        a2.append(", subject=");
        a2.append(this.f5004h);
        a2.append(", teacher=");
        a2.append(this.f5005i);
        a2.append(", theme=");
        a2.append(this.f5006j);
        a2.append(", modeName=");
        a2.append(this.f5007k);
        a2.append(", modeDescription=");
        a2.append(this.f5008l);
        a2.append(", announcedAtUTC=");
        a2.append(this.f5009m);
        a2.append(", profileId=");
        a2.append(e());
        a2.append(", readByUser=");
        a2.append(l());
        a2.append(", groupUid=");
        return a.a(a2, this.f5012p, ")");
    }

    public void writeToParcel(Parcel parcel, int i2) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.e);
        CalendarParceler.INSTANCE.write(this.f, parcel, i2);
        parcel.writeInt(this.f5003g);
        parcel.writeString(this.f5004h);
        parcel.writeString(this.f5005i);
        parcel.writeString(this.f5006j);
        parcel.writeString(this.f5007k);
        parcel.writeString(this.f5008l);
        CalendarParceler.INSTANCE.write(this.f5009m, parcel, i2);
        parcel.writeString(this.f5010n);
        Boolean bool = this.f5011o;
        if (bool != null) {
            parcel.writeInt(1);
            z = bool.booleanValue();
        } else {
            z = false;
        }
        parcel.writeInt(z ? 1 : 0);
        parcel.writeString(this.f5012p);
    }

    public AnnouncedTest(String str, Calendar calendar, int i2, String str2, String str3, String str4, String str5, String str6, Calendar calendar2, String str7, Boolean bool, String str8) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(calendar, "recordingDate");
        Intrinsics.checkParameterIsNotNull(str2, "subject");
        Intrinsics.checkParameterIsNotNull(str3, "teacher");
        Intrinsics.checkParameterIsNotNull(str5, "modeName");
        Intrinsics.checkParameterIsNotNull(str6, "modeDescription");
        Intrinsics.checkParameterIsNotNull(calendar2, "announcedAtUTC");
        Intrinsics.checkParameterIsNotNull(str7, "profileId");
        this.e = str;
        this.f = calendar;
        this.f5003g = i2;
        this.f5004h = str2;
        this.f5005i = str3;
        this.f5006j = str4;
        this.f5007k = str5;
        this.f5008l = str6;
        this.f5009m = calendar2;
        this.f5010n = str7;
        this.f5011o = bool;
        this.f5012p = str8;
        this.c = Reminder.Type.ANNOUNCED_TEST;
    }
}
