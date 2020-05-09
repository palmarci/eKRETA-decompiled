package p289hu.ekreta.ellenorzo.util.datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;
import p365o.p372c.p373a.C5639d;
import p365o.p372c.p373a.p375p.C5664a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0018\u0010H\u001a\u0004\u0018\u00010$*\u0004\u0018\u00010%2\u0006\u0010I\u001a\u00020 H\u0002\u001a\u0016\u0010J\u001a\u0004\u0018\u00010%*\u00020 2\b\u0010K\u001a\u0004\u0018\u00010D\u001a\u0016\u0010L\u001a\u0004\u0018\u00010D*\u00020 2\b\u0010M\u001a\u0004\u0018\u00010%\u001a\u000e\u0010N\u001a\u0004\u0018\u00010$*\u0004\u0018\u00010D\"\u0014\u0010\u0000\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003\"\u0014\u0010\u0006\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0003\"\u0014\u0010\b\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0003\"\u0014\u0010\n\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0003\"\u0014\u0010\f\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0003\"\u0014\u0010\u000e\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0003\"\u0014\u0010\u0010\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0003\"\u001c\u0010\u0012\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138BX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\"\u001c\u0010\u0017\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138BX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016\"\u001c\u0010\u0019\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138BX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016\"\u0014\u0010\u001b\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0003\"\u0014\u0010\u001d\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0003\"\u0019\u0010\u001f\u001a\n \u0014*\u0004\u0018\u00010 0 ¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"\" \u0010#\u001a\u00020$*\u0004\u0018\u00010%8FX\u0004¢\u0006\f\u0012\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0019\u0010*\u001a\u0004\u0018\u00010$*\u0004\u0018\u00010%8F¢\u0006\u0006\u001a\u0004\b+\u0010)\"\u0017\u0010,\u001a\u00020$*\u0004\u0018\u00010%8F¢\u0006\u0006\u001a\u0004\b-\u0010)\"\u0015\u0010.\u001a\u00020%*\u00020$8F¢\u0006\u0006\u001a\u0004\b/\u00100\"\u0015\u00101\u001a\u00020%*\u00020$8F¢\u0006\u0006\u001a\u0004\b2\u00100\"\u0015\u00103\u001a\u00020%*\u00020$8F¢\u0006\u0006\u001a\u0004\b4\u00100\"\u0015\u00105\u001a\u00020%*\u00020$8F¢\u0006\u0006\u001a\u0004\b6\u00100\"\u0015\u00105\u001a\u00020%*\u0002078F¢\u0006\u0006\u001a\u0004\b6\u00108\"\u0015\u00109\u001a\u00020%*\u00020$8F¢\u0006\u0006\u001a\u0004\b:\u00100\"\u0015\u00109\u001a\u00020%*\u0002078F¢\u0006\u0006\u001a\u0004\b:\u00108\"\u0015\u0010;\u001a\u00020%*\u00020$8F¢\u0006\u0006\u001a\u0004\b<\u00100\"\u0015\u0010=\u001a\u00020%*\u0002078F¢\u0006\u0006\u001a\u0004\b>\u00108\"\u0015\u0010?\u001a\u00020%*\u00020$8F¢\u0006\u0006\u001a\u0004\b@\u00100\"\u0018\u0010\u001d\u001a\u00020\u0001*\u00020 8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010A\"\u0015\u0010B\u001a\u00020%*\u00020$8F¢\u0006\u0006\u001a\u0004\bC\u00100\"\u0015\u0010B\u001a\u00020%*\u00020D8F¢\u0006\u0006\u001a\u0004\bC\u0010E\"\u0015\u0010F\u001a\u00020%*\u00020$8F¢\u0006\u0006\u001a\u0004\bG\u00100¨\u0006O"}, mo17463d2 = {"dateFormat", "Ljava/text/SimpleDateFormat;", "getDateFormat", "()Ljava/text/SimpleDateFormat;", "dateFormatDay", "getDateFormatDay", "dateFormatDayAndDate", "getDateFormatDayAndDate", "dateFormatISO8601", "getDateFormatISO8601", "dateFormatWithHourAndMinute", "getDateFormatWithHourAndMinute", "dateFormatWithMonthName", "getDateFormatWithMonthName", "dateFormatWithMonthNameAndDayName", "getDateFormatWithMonthNameAndDayName", "dateFormatWithMonthNameAndHourAndMinute", "getDateFormatWithMonthNameAndHourAndMinute", "dateTimeFormatterWithMonthName", "Lorg/threeten/bp/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "getDateTimeFormatterWithMonthName", "()Lorg/threeten/bp/format/DateTimeFormatter;", "dateTimeFormatterWithMonthNameAndDayName", "getDateTimeFormatterWithMonthNameAndDayName", "dateTimeFormatterWithWeekdayNameAndDate", "getDateTimeFormatterWithWeekdayNameAndDate", "timeFormat", "getTimeFormat", "timeFormatISO8601", "getTimeFormatISO8601", "timeZoneUtc", "Ljava/util/TimeZone;", "getTimeZoneUtc", "()Ljava/util/TimeZone;", "asLocalDate", "Ljava/util/Calendar;", "", "asLocalDate$annotations", "(Ljava/lang/String;)V", "getAsLocalDate", "(Ljava/lang/String;)Ljava/util/Calendar;", "asNullableUtcDate", "getAsNullableUtcDate", "asUtcDate", "getAsUtcDate", "dateString", "getDateString", "(Ljava/util/Calendar;)Ljava/lang/String;", "dateStringDayAndDate", "getDateStringDayAndDate", "dateStringISO8601", "getDateStringISO8601", "dateStringWithMonthName", "getDateStringWithMonthName", "Lorg/threeten/bp/LocalDate;", "(Lorg/threeten/bp/LocalDate;)Ljava/lang/String;", "dateStringWithMonthNameAndDayName", "getDateStringWithMonthNameAndDayName", "dateStringWithMonthNameAndHourAndMinute", "getDateStringWithMonthNameAndHourAndMinute", "dateStringWithWeekdayNameAndDate", "getDateStringWithWeekdayNameAndDate", "dayOfWeek", "getDayOfWeek", "(Ljava/util/TimeZone;)Ljava/text/SimpleDateFormat;", "timeString", "getTimeString", "Ljava/util/Date;", "(Ljava/util/Date;)Ljava/lang/String;", "timeStringISO8601", "getTimeStringISO8601", "asCalendarFromISO8601", "timeZone", "format", "date", "parse", "source", "toCalendar", "app_studentProdRelease"}, mo17464k = 2, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.datetime.UtilsKt */
/* compiled from: Utils.kt */
public final class UtilsKt {

    /* renamed from: a */
    public static final TimeZone f15407a = TimeZone.getTimeZone("UTC");

    /* renamed from: a */
    public static final SimpleDateFormat m14831a(TimeZone timeZone) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());
        simpleDateFormat.setTimeZone(timeZone);
        return simpleDateFormat;
    }

    @Deprecated(message = "use asUtcDate or asNullableUtcDate instead")
    public static /* synthetic */ void asLocalDate$annotations(String str) {
    }

    /* renamed from: b */
    public static final String m14835b(Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(calendar, "$this$dateStringDayAndDate");
        String format = new SimpleDateFormat("EEEE - yyyy. MM. dd.", Locale.getDefault()).format(calendar.getTime());
        Intrinsics.checkExpressionValueIsNotNull(format, "dateFormatDayAndDate.format(time)");
        return format;
    }

    /* renamed from: c */
    public static final String m14839c(Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(calendar, "$this$dateStringISO8601");
        String format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(calendar.getTime());
        Intrinsics.checkExpressionValueIsNotNull(format, "dateFormatISO8601.format(time)");
        return format;
    }

    /* renamed from: d */
    public static final String m14841d(Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(calendar, "$this$dateStringWithMonthName");
        String format = new SimpleDateFormat("yyyy. LLLL. d.", Locale.getDefault()).format(calendar.getTime());
        Intrinsics.checkExpressionValueIsNotNull(format, "dateFormatWithMonthName.format(time)");
        return format;
    }

    /* renamed from: e */
    public static final String m14842e(Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(calendar, "$this$dateStringWithMonthNameAndDayName");
        String format = new SimpleDateFormat("yyyy. LLLL. d., EEEE", Locale.getDefault()).format(calendar.getTime());
        Intrinsics.checkExpressionValueIsNotNull(format, "dateFormatWithMonthNameAndDayName.format(time)");
        return format;
    }

    /* renamed from: f */
    public static final String m14843f(Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(calendar, "$this$dateStringWithMonthNameAndHourAndMinute");
        String format = new SimpleDateFormat("yyyy. LLLL. d. HH:mm", Locale.getDefault()).format(calendar.getTime());
        Intrinsics.checkExpressionValueIsNotNull(format, "dateFormatWithMonthNameA…ourAndMinute.format(time)");
        return format;
    }

    /* renamed from: g */
    public static final String m14844g(Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(calendar, "$this$timeString");
        String format = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(calendar.getTime());
        Intrinsics.checkExpressionValueIsNotNull(format, "timeFormat.format(time)");
        return format;
    }

    /* renamed from: a */
    public static final Date m14834a(TimeZone timeZone, String str) {
        Intrinsics.checkParameterIsNotNull(timeZone, "$this$parse");
        if (str == null) {
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());
        simpleDateFormat.setTimeZone(timeZone);
        return simpleDateFormat.parse(str);
    }

    /* renamed from: b */
    public static final String m14836b(C5639d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "$this$dateStringWithMonthNameAndDayName");
        String a = dVar.mo22046a(C5664a.m18958a("yyyy. MM. dd., EEEE", Locale.getDefault()));
        Intrinsics.checkExpressionValueIsNotNull(a, "this.format(dateTimeForm…rWithMonthNameAndDayName)");
        return a;
    }

    /* renamed from: c */
    public static final String m14840c(C5639d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "$this$dateStringWithWeekdayNameAndDate");
        String a = dVar.mo22046a(C5664a.m18958a("E\nd", Locale.getDefault()));
        Intrinsics.checkExpressionValueIsNotNull(a, "this.format(dateTimeForm…erWithWeekdayNameAndDate)");
        return a;
    }

    /* renamed from: b */
    public static final Calendar m14837b(String str) {
        TimeZone timeZone = f15407a;
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "timeZoneUtc");
        Calendar a = m14833a(str, timeZone);
        if (a == null) {
            Intrinsics.throwNpe();
        }
        return a;
    }

    /* renamed from: a */
    public static final String m14828a(Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(calendar, "$this$dateString");
        String format = new SimpleDateFormat("yyyy. MM. dd.", Locale.getDefault()).format(calendar.getTime());
        Intrinsics.checkExpressionValueIsNotNull(format, "dateFormat.format(time)");
        return format;
    }

    /* renamed from: b */
    public static final Calendar m14838b(Date date) {
        if (date == null) {
            return null;
        }
        Calendar instance = Calendar.getInstance();
        Intrinsics.checkExpressionValueIsNotNull(instance, "it");
        instance.setTime(date);
        return instance;
    }

    /* renamed from: a */
    public static final String m14830a(C5639d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "$this$dateStringWithMonthName");
        String a = dVar.mo22046a(C5664a.m18958a("yyyy. LLLL", Locale.getDefault()));
        Intrinsics.checkExpressionValueIsNotNull(a, "this.format(dateTimeFormatterWithMonthName)");
        return a;
    }

    /* renamed from: a */
    public static final Calendar m14833a(String str, TimeZone timeZone) {
        Date date;
        String str2 = "Z";
        if (str != null) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                if (!(true ^ Intrinsics.areEqual((Object) StringsKt___StringsKt.takeLast(str, 1), (Object) str2))) {
                    str2 = "";
                }
                sb.append(str2);
                date = m14834a(timeZone, sb.toString());
            } catch (Throwable unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("T0:00:00Z");
                date = m14834a(timeZone, sb2.toString());
            }
            if (date != null) {
                Calendar instance = Calendar.getInstance(timeZone);
                instance.setTime(date);
                return instance;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final Calendar m14832a(String str) {
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
        Calendar a = m14833a(str, timeZone);
        if (a == null) {
            Intrinsics.throwNpe();
        }
        return a;
    }

    /* renamed from: a */
    public static final String m14829a(Date date) {
        Intrinsics.checkParameterIsNotNull(date, "$this$timeString");
        Calendar b = m14838b(date);
        if (b == null) {
            Intrinsics.throwNpe();
        }
        return m14844g(b);
    }
}
