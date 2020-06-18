package hu.ekreta.ellenorzo.timetable;

import a.b.a.a.a;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001a"}, d2 = {"Lhu/ekreta/ellenorzo/timetable/TimeTableDay;", "", "calendar", "Ljava/util/Calendar;", "hasLessons", "", "profileId", "", "(Ljava/util/Calendar;ZLjava/lang/String;)V", "getCalendar", "()Ljava/util/Calendar;", "getHasLessons", "()Z", "id", "getId", "()Ljava/lang/String;", "getProfileId", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: TimeTableDay.kt */
public final class TimeTableDay {

    /* renamed from: a  reason: collision with root package name */
    public final String f6216a = (this.b.getTimeInMillis() + this.f6217d);
    public final Calendar b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final String f6217d;

    public TimeTableDay(Calendar calendar, boolean z, String str) {
        Intrinsics.checkParameterIsNotNull(calendar, "calendar");
        Intrinsics.checkParameterIsNotNull(str, "profileId");
        this.b = calendar;
        this.c = z;
        this.f6217d = str;
    }

    public static /* synthetic */ TimeTableDay copy$default(TimeTableDay timeTableDay, Calendar calendar, boolean z, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            calendar = timeTableDay.b;
        }
        if ((i2 & 2) != 0) {
            z = timeTableDay.c;
        }
        if ((i2 & 4) != 0) {
            str = timeTableDay.f6217d;
        }
        return timeTableDay.a(calendar, z, str);
    }

    public final TimeTableDay a(Calendar calendar, boolean z, String str) {
        Intrinsics.checkParameterIsNotNull(calendar, "calendar");
        Intrinsics.checkParameterIsNotNull(str, "profileId");
        return new TimeTableDay(calendar, z, str);
    }

    public final Calendar a() {
        return this.b;
    }

    public final boolean b() {
        return this.c;
    }

    public final String c() {
        return this.f6216a;
    }

    public final String d() {
        return this.f6217d;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TimeTableDay) {
                TimeTableDay timeTableDay = (TimeTableDay) obj;
                if (Intrinsics.areEqual((Object) this.b, (Object) timeTableDay.b)) {
                    if (!(this.c == timeTableDay.c) || !Intrinsics.areEqual((Object) this.f6217d, (Object) timeTableDay.f6217d)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Calendar calendar = this.b;
        int i2 = 0;
        int hashCode = (calendar != null ? calendar.hashCode() : 0) * 31;
        boolean z = this.c;
        if (z) {
            z = true;
        }
        int i3 = (hashCode + (z ? 1 : 0)) * 31;
        String str = this.f6217d;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("TimeTableDay(calendar=");
        a2.append(this.b);
        a2.append(", hasLessons=");
        a2.append(this.c);
        a2.append(", profileId=");
        return a.a(a2, this.f6217d, ")");
    }
}
