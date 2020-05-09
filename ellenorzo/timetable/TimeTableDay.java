package p289hu.ekreta.ellenorzo.timetable;

import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001a"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/timetable/TimeTableDay;", "", "calendar", "Ljava/util/Calendar;", "hasLessons", "", "profileId", "", "(Ljava/util/Calendar;ZLjava/lang/String;)V", "getCalendar", "()Ljava/util/Calendar;", "getHasLessons", "()Z", "id", "getId", "()Ljava/lang/String;", "getProfileId", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.timetable.TimeTableDay */
/* compiled from: TimeTableDay.kt */
public final class TimeTableDay {

    /* renamed from: a */
    public final String f15092a;

    /* renamed from: b */
    public final Calendar f15093b;

    /* renamed from: c */
    public final boolean f15094c;

    /* renamed from: d */
    public final String f15095d;

    public TimeTableDay(Calendar calendar, boolean z, String str) {
        Intrinsics.checkParameterIsNotNull(calendar, "calendar");
        Intrinsics.checkParameterIsNotNull(str, "profileId");
        this.f15093b = calendar;
        this.f15094c = z;
        this.f15095d = str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15093b.getTimeInMillis());
        sb.append(this.f15095d);
        this.f15092a = sb.toString();
    }

    public static /* synthetic */ TimeTableDay copy$default(TimeTableDay timeTableDay, Calendar calendar, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            calendar = timeTableDay.f15093b;
        }
        if ((i & 2) != 0) {
            z = timeTableDay.f15094c;
        }
        if ((i & 4) != 0) {
            str = timeTableDay.f15095d;
        }
        return timeTableDay.mo15965a(calendar, z, str);
    }

    /* renamed from: a */
    public final TimeTableDay mo15965a(Calendar calendar, boolean z, String str) {
        Intrinsics.checkParameterIsNotNull(calendar, "calendar");
        Intrinsics.checkParameterIsNotNull(str, "profileId");
        return new TimeTableDay(calendar, z, str);
    }

    /* renamed from: a */
    public final Calendar mo15966a() {
        return this.f15093b;
    }

    /* renamed from: b */
    public final boolean mo15967b() {
        return this.f15094c;
    }

    /* renamed from: c */
    public final String mo15968c() {
        return this.f15092a;
    }

    /* renamed from: d */
    public final String mo15969d() {
        return this.f15095d;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TimeTableDay) {
                TimeTableDay timeTableDay = (TimeTableDay) obj;
                if (Intrinsics.areEqual((Object) this.f15093b, (Object) timeTableDay.f15093b)) {
                    if (!(this.f15094c == timeTableDay.f15094c) || !Intrinsics.areEqual((Object) this.f15095d, (Object) timeTableDay.f15095d)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Calendar calendar = this.f15093b;
        int i = 0;
        int hashCode = (calendar != null ? calendar.hashCode() : 0) * 31;
        boolean z = this.f15094c;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        String str = this.f15095d;
        if (str != null) {
            i = str.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("TimeTableDay(calendar=");
        a.append(this.f15093b);
        a.append(", hasLessons=");
        a.append(this.f15094c);
        a.append(", profileId=");
        return C0082a.m106a(a, this.f15095d, ")");
    }
}
