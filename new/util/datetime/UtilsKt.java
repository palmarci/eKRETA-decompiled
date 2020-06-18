package hu.ekreta.ellenorzo.util.datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;
import o.c.a.d;
import o.c.a.p.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\u001a\u0018\u0010K\u001a\u0004\u0018\u00010$*\u0004\u0018\u00010%2\u0006\u0010L\u001a\u00020 H\u0002\u001a\u0016\u0010M\u001a\u0004\u0018\u00010%*\u00020 2\b\u0010N\u001a\u0004\u0018\u00010G\u001a\u001c\u0010O\u001a\u00020$*\u00020$2\u0006\u0010P\u001a\u00020Q2\b\b\u0002\u0010R\u001a\u00020Q\u001a\u0016\u0010S\u001a\u0004\u0018\u00010G*\u00020 2\b\u0010T\u001a\u0004\u0018\u00010%\u001a\u001c\u0010U\u001a\u00020$*\u00020$2\u0006\u0010P\u001a\u00020Q2\b\b\u0002\u0010R\u001a\u00020Q\u001a\u000e\u0010V\u001a\u0004\u0018\u00010$*\u0004\u0018\u00010G\"\u0014\u0010\u0000\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003\"\u0014\u0010\u0006\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0003\"\u0014\u0010\b\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0003\"\u0014\u0010\n\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0003\"\u0014\u0010\f\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0003\"\u0014\u0010\u000e\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0003\"\u0014\u0010\u0010\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0003\"\u001c\u0010\u0012\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138BX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\"\u001c\u0010\u0017\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138BX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016\"\u001c\u0010\u0019\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138BX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016\"\u0014\u0010\u001b\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0003\"\u0014\u0010\u001d\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0003\"\u0019\u0010\u001f\u001a\n \u0014*\u0004\u0018\u00010 0 ¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"\" \u0010#\u001a\u00020$*\u0004\u0018\u00010%8FX\u0004¢\u0006\f\u0012\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0019\u0010*\u001a\u0004\u0018\u00010$*\u0004\u0018\u00010%8F¢\u0006\u0006\u001a\u0004\b+\u0010)\"\u0017\u0010,\u001a\u00020$*\u0004\u0018\u00010%8F¢\u0006\u0006\u001a\u0004\b-\u0010)\"\u0015\u0010.\u001a\u00020%*\u00020$8F¢\u0006\u0006\u001a\u0004\b/\u00100\"\u0015\u00101\u001a\u00020%*\u00020$8F¢\u0006\u0006\u001a\u0004\b2\u00100\"\u0015\u00103\u001a\u00020%*\u00020$8F¢\u0006\u0006\u001a\u0004\b4\u00100\"\u0015\u00105\u001a\u00020%*\u00020$8F¢\u0006\u0006\u001a\u0004\b6\u00100\"\u0015\u00105\u001a\u00020%*\u0002078F¢\u0006\u0006\u001a\u0004\b6\u00108\"\u0015\u00109\u001a\u00020%*\u00020$8F¢\u0006\u0006\u001a\u0004\b:\u00100\"\u0015\u00109\u001a\u00020%*\u0002078F¢\u0006\u0006\u001a\u0004\b:\u00108\"\u0015\u0010;\u001a\u00020%*\u00020$8F¢\u0006\u0006\u001a\u0004\b<\u00100\"\u0015\u0010=\u001a\u00020%*\u0002078F¢\u0006\u0006\u001a\u0004\b>\u00108\"\u0015\u0010?\u001a\u00020%*\u00020$8F¢\u0006\u0006\u001a\u0004\b@\u00100\"\u0015\u0010A\u001a\u00020$*\u00020$8F¢\u0006\u0006\u001a\u0004\bB\u0010C\"\u0018\u0010\u001d\u001a\u00020\u0001*\u00020 8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010D\"\u0015\u0010E\u001a\u00020%*\u00020$8F¢\u0006\u0006\u001a\u0004\bF\u00100\"\u0015\u0010E\u001a\u00020%*\u00020G8F¢\u0006\u0006\u001a\u0004\bF\u0010H\"\u0015\u0010I\u001a\u00020%*\u00020$8F¢\u0006\u0006\u001a\u0004\bJ\u00100¨\u0006W"}, d2 = {"dateFormat", "Ljava/text/SimpleDateFormat;", "getDateFormat", "()Ljava/text/SimpleDateFormat;", "dateFormatDay", "getDateFormatDay", "dateFormatDayAndDate", "getDateFormatDayAndDate", "dateFormatISO8601", "getDateFormatISO8601", "dateFormatWithHourAndMinute", "getDateFormatWithHourAndMinute", "dateFormatWithMonthName", "getDateFormatWithMonthName", "dateFormatWithMonthNameAndDayName", "getDateFormatWithMonthNameAndDayName", "dateFormatWithMonthNameAndHourAndMinute", "getDateFormatWithMonthNameAndHourAndMinute", "dateTimeFormatterWithMonthName", "Lorg/threeten/bp/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "getDateTimeFormatterWithMonthName", "()Lorg/threeten/bp/format/DateTimeFormatter;", "dateTimeFormatterWithMonthNameAndDayName", "getDateTimeFormatterWithMonthNameAndDayName", "dateTimeFormatterWithWeekdayNameAndDate", "getDateTimeFormatterWithWeekdayNameAndDate", "timeFormat", "getTimeFormat", "timeFormatISO8601", "getTimeFormatISO8601", "timeZoneUtc", "Ljava/util/TimeZone;", "getTimeZoneUtc", "()Ljava/util/TimeZone;", "asLocalDate", "Ljava/util/Calendar;", "", "asLocalDate$annotations", "(Ljava/lang/String;)V", "getAsLocalDate", "(Ljava/lang/String;)Ljava/util/Calendar;", "asNullableUtcDate", "getAsNullableUtcDate", "asUtcDate", "getAsUtcDate", "dateString", "getDateString", "(Ljava/util/Calendar;)Ljava/lang/String;", "dateStringDayAndDate", "getDateStringDayAndDate", "dateStringISO8601", "getDateStringISO8601", "dateStringWithMonthName", "getDateStringWithMonthName", "Lorg/threeten/bp/LocalDate;", "(Lorg/threeten/bp/LocalDate;)Ljava/lang/String;", "dateStringWithMonthNameAndDayName", "getDateStringWithMonthNameAndDayName", "dateStringWithMonthNameAndHourAndMinute", "getDateStringWithMonthNameAndHourAndMinute", "dateStringWithWeekdayNameAndDate", "getDateStringWithWeekdayNameAndDate", "dayOfWeek", "getDayOfWeek", "midnight", "getMidnight", "(Ljava/util/Calendar;)Ljava/util/Calendar;", "(Ljava/util/TimeZone;)Ljava/text/SimpleDateFormat;", "timeString", "getTimeString", "Ljava/util/Date;", "(Ljava/util/Date;)Ljava/lang/String;", "timeStringISO8601", "getTimeStringISO8601", "asCalendarFromISO8601", "timeZone", "format", "date", "minus", "amount", "", "type", "parse", "source", "plus", "toCalendar", "app_guardianProdRelease"}, k = 2, mv = {1, 1, 15})
/* compiled from: Utils.kt */
public final class UtilsKt {

    /* renamed from: a  reason: collision with root package name */
    public static final TimeZone f6309a = TimeZone.getTimeZone("UTC");

    public static final SimpleDateFormat a(TimeZone timeZone) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());
        simpleDateFormat.setTimeZone(timeZone);
        return simpleDateFormat;
    }

    @Deprecated(message = "use asUtcDate or asNullableUtcDate instead")
    public static /* synthetic */ void asLocalDate$annotations(String str) {
    }

    public static final String b(Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(calendar, "$this$dateStringDayAndDate");
        String format = new SimpleDateFormat("EEEE - yyyy. MM. dd.", Locale.getDefault()).format(calendar.getTime());
        Intrinsics.checkExpressionValueIsNotNull(format, "dateFormatDayAndDate.format(time)");
        return format;
    }

    public static final String c(Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(calendar, "$this$dateStringISO8601");
        String format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(calendar.getTime());
        Intrinsics.checkExpressionValueIsNotNull(format, "dateFormatISO8601.format(time)");
        return format;
    }

    public static final String d(Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(calendar, "$this$dateStringWithMonthName");
        String format = new SimpleDateFormat("yyyy. LLLL d.", Locale.getDefault()).format(calendar.getTime());
        Intrinsics.checkExpressionValueIsNotNull(format, "dateFormatWithMonthName.format(time)");
        return format;
    }

    public static final String e(Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(calendar, "$this$dateStringWithMonthNameAndDayName");
        String format = new SimpleDateFormat("yyyy. LLLL d., EEEE", Locale.getDefault()).format(calendar.getTime());
        Intrinsics.checkExpressionValueIsNotNull(format, "dateFormatWithMonthNameAndDayName.format(time)");
        return format;
    }

    public static final String f(Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(calendar, "$this$dateStringWithMonthNameAndHourAndMinute");
        String format = new SimpleDateFormat("yyyy. LLLL d. HH:mm", Locale.getDefault()).format(calendar.getTime());
        Intrinsics.checkExpressionValueIsNotNull(format, "dateFormatWithMonthNameA…ourAndMinute.format(time)");
        return format;
    }

    public static final Calendar g(Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(calendar, "$this$midnight");
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    public static final String h(Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(calendar, "$this$timeString");
        String format = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(calendar.getTime());
        Intrinsics.checkExpressionValueIsNotNull(format, "timeFormat.format(time)");
        return format;
    }

    public static /* synthetic */ Calendar minus$default(Calendar calendar, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 5;
        }
        Intrinsics.checkParameterIsNotNull(calendar, "$this$minus");
        calendar.add(i3, -i2);
        return calendar;
    }

    public static /* synthetic */ Calendar plus$default(Calendar calendar, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 5;
        }
        Intrinsics.checkParameterIsNotNull(calendar, "$this$plus");
        calendar.add(i3, i2);
        return calendar;
    }

    public static final Date a(TimeZone timeZone, String str) {
        Intrinsics.checkParameterIsNotNull(timeZone, "$this$parse");
        if (str == null) {
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());
        simpleDateFormat.setTimeZone(timeZone);
        return simpleDateFormat.parse(str);
    }

    public static final String b(d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "$this$dateStringWithMonthNameAndDayName");
        String a2 = dVar.a(a.a("yyyy. MM. dd., EEEE", Locale.getDefault()));
        Intrinsics.checkExpressionValueIsNotNull(a2, "this.format(dateTimeForm…rWithMonthNameAndDayName)");
        return a2;
    }

    public static final String c(d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "$this$dateStringWithWeekdayNameAndDate");
        String a2 = dVar.a(a.a("E\nd", Locale.getDefault()));
        Intrinsics.checkExpressionValueIsNotNull(a2, "this.format(dateTimeForm…erWithWeekdayNameAndDate)");
        return a2;
    }

    public static final Calendar b(String str) {
        TimeZone timeZone = f6309a;
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "timeZoneUtc");
        Calendar a2 = a(str, timeZone);
        if (a2 == null) {
            Intrinsics.throwNpe();
        }
        return a2;
    }

    public static final String a(Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(calendar, "$this$dateString");
        String format = new SimpleDateFormat("yyyy. MM. dd.", Locale.getDefault()).format(calendar.getTime());
        Intrinsics.checkExpressionValueIsNotNull(format, "dateFormat.format(time)");
        return format;
    }

    public static final Calendar b(Date date) {
        if (date == null) {
            return null;
        }
        Calendar instance = Calendar.getInstance();
        Intrinsics.checkExpressionValueIsNotNull(instance, "it");
        instance.setTime(date);
        return instance;
    }

    public static final String a(d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "$this$dateStringWithMonthName");
        String a2 = dVar.a(a.a("yyyy. LLLL", Locale.getDefault()));
        Intrinsics.checkExpressionValueIsNotNull(a2, "this.format(dateTimeFormatterWithMonthName)");
        return a2;
    }

    public static final Calendar a(String str, TimeZone timeZone) {
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
                date = a(timeZone, sb.toString());
            } catch (Throwable unused) {
                date = a(timeZone, str + "T0:00:00Z");
            }
            if (date != null) {
                Calendar instance = Calendar.getInstance(timeZone);
                instance.setTime(date);
                return instance;
            }
        }
        return null;
    }

    public static final Calendar a(String str) {
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
        Calendar a2 = a(str, timeZone);
        if (a2 == null) {
            Intrinsics.throwNpe();
        }
        return a2;
    }

    public static final String a(Date date) {
        Intrinsics.checkParameterIsNotNull(date, "$this$timeString");
        Calendar b = b(date);
        if (b == null) {
            Intrinsics.throwNpe();
        }
        return h(b);
    }

    public static final Calendar a(Calendar calendar, int i2, int i3) {
        Intrinsics.checkParameterIsNotNull(calendar, "$this$minus");
        calendar.add(i3, -i2);
        return calendar;
    }
}
