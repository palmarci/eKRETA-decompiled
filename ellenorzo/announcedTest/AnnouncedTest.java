package p289hu.ekreta.ellenorzo.announcedTest;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p349io.ConstantsKt;
import p000a.p020b.p021a.p022a.C0082a;
import p289hu.ekreta.ellenorzo.parceler.CalendarParceler;
import p289hu.ekreta.ellenorzo.reminder.Reminder;
import p289hu.ekreta.ellenorzo.reminder.Reminder.Type;
import p289hu.ekreta.ellenorzo.util.mapper.ReadableByUserModel;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003Bm\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0014J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0007HÆ\u0003J\t\u00101\u001a\u00020\tHÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0007HÆ\u0003J\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u00109J\b\u0010:\u001a\u00020\tH\u0016J\u0013\u0010;\u001a\u00020\u00122\b\u0010<\u001a\u0004\u0018\u00010=HÖ\u0003J\u000e\u0010>\u001a\u00020\u00052\u0006\u0010?\u001a\u00020\u0005J\t\u0010@\u001a\u00020\tHÖ\u0001J\t\u0010A\u001a\u00020\u0005HÖ\u0001J\u0019\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\tHÖ\u0001R\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0014\u0010\u0010\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u001a\u0010%\u001a\u00020&X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001a¨\u0006G"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;", "Lhu/ekreta/ellenorzo/reminder/Reminder;", "Lhu/ekreta/ellenorzo/util/mapper/ReadableByUserModel;", "Landroid/os/Parcelable;", "uid", "", "recordingDate", "Ljava/util/Calendar;", "classScheduleNumber", "", "subject", "teacher", "theme", "modeName", "modeDescription", "announcedAtUTC", "profileId", "readByUser", "", "groupUid", "(Ljava/lang/String;Ljava/util/Calendar;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getAnnouncedAtUTC", "()Ljava/util/Calendar;", "getClassScheduleNumber", "()I", "getGroupUid", "()Ljava/lang/String;", "getModeDescription", "getModeName", "getProfileId", "getReadByUser", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRecordingDate", "getSubject", "getTeacher", "getTheme", "type", "Lhu/ekreta/ellenorzo/reminder/Reminder$Type;", "type$annotations", "()V", "getType", "()Lhu/ekreta/ellenorzo/reminder/Reminder$Type;", "getUid", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/util/Calendar;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;", "describeContents", "equals", "other", "", "formattedNumberOfLesson", "lesson", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.announcedTest.AnnouncedTest */
/* compiled from: AnnouncedTest.kt */
public final class AnnouncedTest extends Reminder implements ReadableByUserModel, Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new Creator();

    /* renamed from: c */
    public final Type f11042c;

    /* renamed from: e */
    public final String f11043e;

    /* renamed from: f */
    public final Calendar f11044f;

    /* renamed from: g */
    public final int f11045g;

    /* renamed from: h */
    public final String f11046h;

    /* renamed from: i */
    public final String f11047i;

    /* renamed from: j */
    public final String f11048j;

    /* renamed from: k */
    public final String f11049k;

    /* renamed from: l */
    public final String f11050l;

    /* renamed from: m */
    public final Calendar f11051m;

    /* renamed from: n */
    public final String f11052n;

    /* renamed from: o */
    public final Boolean f11053o;

    /* renamed from: p */
    public final String f11054p;

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.announcedTest.AnnouncedTest$Creator */
    public static class Creator implements android.os.Parcelable.Creator {
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
            AnnouncedTest announcedTest = new AnnouncedTest(readString, calendar, readInt, readString2, readString3, readString4, readString5, readString6, calendar2, readString7, bool, parcel.readString());
            return announcedTest;
        }

        public final Object[] newArray(int i) {
            return new AnnouncedTest[i];
        }
    }

    public /* synthetic */ AnnouncedTest(String str, Calendar calendar, int i, String str2, String str3, String str4, String str5, String str6, Calendar calendar2, String str7, Boolean bool, String str8, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, calendar, i, str2, str3, str4, str5, str6, calendar2, str7, (i2 & 1024) != 0 ? null : bool, str8);
    }

    public static /* synthetic */ AnnouncedTest copy$default(AnnouncedTest announcedTest, String str, Calendar calendar, int i, String str2, String str3, String str4, String str5, String str6, Calendar calendar2, String str7, Boolean bool, String str8, int i2, Object obj) {
        AnnouncedTest announcedTest2 = announcedTest;
        int i3 = i2;
        return announcedTest.mo11314a((i3 & 1) != 0 ? announcedTest.mo11316d() : str, (i3 & 2) != 0 ? announcedTest2.f11044f : calendar, (i3 & 4) != 0 ? announcedTest2.f11045g : i, (i3 & 8) != 0 ? announcedTest2.f11046h : str2, (i3 & 16) != 0 ? announcedTest2.f11047i : str3, (i3 & 32) != 0 ? announcedTest2.f11048j : str4, (i3 & 64) != 0 ? announcedTest2.f11049k : str5, (i3 & 128) != 0 ? announcedTest2.f11050l : str6, (i3 & 256) != 0 ? announcedTest2.f11051m : calendar2, (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? announcedTest.mo11318e() : str7, (i3 & 1024) != 0 ? announcedTest.mo11327l() : bool, (i3 & 2048) != 0 ? announcedTest2.f11054p : str8);
    }

    public static /* synthetic */ void type$annotations() {
    }

    /* renamed from: a */
    public final AnnouncedTest mo11314a(String str, Calendar calendar, int i, String str2, String str3, String str4, String str5, String str6, Calendar calendar2, String str7, Boolean bool, String str8) {
        String str9 = str;
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Calendar calendar3 = calendar;
        Intrinsics.checkParameterIsNotNull(calendar3, "recordingDate");
        String str10 = str2;
        Intrinsics.checkParameterIsNotNull(str10, "subject");
        String str11 = str3;
        Intrinsics.checkParameterIsNotNull(str11, "teacher");
        String str12 = str5;
        Intrinsics.checkParameterIsNotNull(str12, "modeName");
        String str13 = str6;
        Intrinsics.checkParameterIsNotNull(str13, "modeDescription");
        Calendar calendar4 = calendar2;
        Intrinsics.checkParameterIsNotNull(calendar4, "announcedAtUTC");
        String str14 = str7;
        Intrinsics.checkParameterIsNotNull(str14, "profileId");
        AnnouncedTest announcedTest = new AnnouncedTest(str9, calendar3, i, str10, str11, str4, str12, str13, calendar4, str14, bool, str8);
        return announcedTest;
    }

    /* renamed from: a */
    public final String mo11315a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "lesson");
        StringBuilder sb = new StringBuilder();
        sb.append(" (");
        sb.append(this.f11045g);
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: d */
    public String mo11316d() {
        return this.f11043e;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String mo11318e() {
        return this.f11052n;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnnouncedTest) {
                AnnouncedTest announcedTest = (AnnouncedTest) obj;
                if (Intrinsics.areEqual((Object) mo11316d(), (Object) announcedTest.mo11316d()) && Intrinsics.areEqual((Object) this.f11044f, (Object) announcedTest.f11044f)) {
                    if (!(this.f11045g == announcedTest.f11045g) || !Intrinsics.areEqual((Object) this.f11046h, (Object) announcedTest.f11046h) || !Intrinsics.areEqual((Object) this.f11047i, (Object) announcedTest.f11047i) || !Intrinsics.areEqual((Object) this.f11048j, (Object) announcedTest.f11048j) || !Intrinsics.areEqual((Object) this.f11049k, (Object) announcedTest.f11049k) || !Intrinsics.areEqual((Object) this.f11050l, (Object) announcedTest.f11050l) || !Intrinsics.areEqual((Object) this.f11051m, (Object) announcedTest.f11051m) || !Intrinsics.areEqual((Object) mo11318e(), (Object) announcedTest.mo11318e()) || !Intrinsics.areEqual((Object) mo11327l(), (Object) announcedTest.mo11327l()) || !Intrinsics.areEqual((Object) this.f11054p, (Object) announcedTest.f11054p)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public Type mo11320f() {
        return this.f11042c;
    }

    /* renamed from: g */
    public final Calendar mo11321g() {
        return this.f11051m;
    }

    /* renamed from: h */
    public final int mo11322h() {
        return this.f11045g;
    }

    public int hashCode() {
        String d = mo11316d();
        int i = 0;
        int hashCode = (d != null ? d.hashCode() : 0) * 31;
        Calendar calendar = this.f11044f;
        int hashCode2 = (((hashCode + (calendar != null ? calendar.hashCode() : 0)) * 31) + this.f11045g) * 31;
        String str = this.f11046h;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f11047i;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f11048j;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f11049k;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f11050l;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Calendar calendar2 = this.f11051m;
        int hashCode8 = (hashCode7 + (calendar2 != null ? calendar2.hashCode() : 0)) * 31;
        String e = mo11318e();
        int hashCode9 = (hashCode8 + (e != null ? e.hashCode() : 0)) * 31;
        Boolean l = mo11327l();
        int hashCode10 = (hashCode9 + (l != null ? l.hashCode() : 0)) * 31;
        String str6 = this.f11054p;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode10 + i;
    }

    /* renamed from: i */
    public final String mo11324i() {
        return this.f11054p;
    }

    /* renamed from: j */
    public final String mo11325j() {
        return this.f11050l;
    }

    /* renamed from: k */
    public final String mo11326k() {
        return this.f11049k;
    }

    /* renamed from: l */
    public Boolean mo11327l() {
        return this.f11053o;
    }

    /* renamed from: m */
    public final Calendar mo11328m() {
        return this.f11044f;
    }

    /* renamed from: n */
    public final String mo11329n() {
        return this.f11046h;
    }

    /* renamed from: o */
    public final String mo11330o() {
        return this.f11047i;
    }

    /* renamed from: p */
    public final String mo11331p() {
        return this.f11048j;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("AnnouncedTest(uid=");
        a.append(mo11316d());
        a.append(", recordingDate=");
        a.append(this.f11044f);
        a.append(", classScheduleNumber=");
        a.append(this.f11045g);
        a.append(", subject=");
        a.append(this.f11046h);
        a.append(", teacher=");
        a.append(this.f11047i);
        a.append(", theme=");
        a.append(this.f11048j);
        a.append(", modeName=");
        a.append(this.f11049k);
        a.append(", modeDescription=");
        a.append(this.f11050l);
        a.append(", announcedAtUTC=");
        a.append(this.f11051m);
        a.append(", profileId=");
        a.append(mo11318e());
        a.append(", readByUser=");
        a.append(mo11327l());
        a.append(", groupUid=");
        return C0082a.m106a(a, this.f11054p, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.f11043e);
        CalendarParceler.INSTANCE.write(this.f11044f, parcel, i);
        parcel.writeInt(this.f11045g);
        parcel.writeString(this.f11046h);
        parcel.writeString(this.f11047i);
        parcel.writeString(this.f11048j);
        parcel.writeString(this.f11049k);
        parcel.writeString(this.f11050l);
        CalendarParceler.INSTANCE.write(this.f11051m, parcel, i);
        parcel.writeString(this.f11052n);
        Boolean bool = this.f11053o;
        if (bool != null) {
            parcel.writeInt(1);
            z = bool.booleanValue();
        } else {
            z = false;
        }
        parcel.writeInt(z ? 1 : 0);
        parcel.writeString(this.f11054p);
    }

    public AnnouncedTest(String str, Calendar calendar, int i, String str2, String str3, String str4, String str5, String str6, Calendar calendar2, String str7, Boolean bool, String str8) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(calendar, "recordingDate");
        Intrinsics.checkParameterIsNotNull(str2, "subject");
        Intrinsics.checkParameterIsNotNull(str3, "teacher");
        Intrinsics.checkParameterIsNotNull(str5, "modeName");
        Intrinsics.checkParameterIsNotNull(str6, "modeDescription");
        Intrinsics.checkParameterIsNotNull(calendar2, "announcedAtUTC");
        Intrinsics.checkParameterIsNotNull(str7, "profileId");
        this.f11043e = str;
        this.f11044f = calendar;
        this.f11045g = i;
        this.f11046h = str2;
        this.f11047i = str3;
        this.f11048j = str4;
        this.f11049k = str5;
        this.f11050l = str6;
        this.f11051m = calendar2;
        this.f11052n = str7;
        this.f11053o = bool;
        this.f11054p = str8;
        this.f11042c = Type.ANNOUNCED_TEST;
    }
}
