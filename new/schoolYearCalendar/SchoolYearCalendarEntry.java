package hu.ekreta.ellenorzo.schoolYearCalendar;

import a.b.a.a.a;
import android.os.Parcel;
import android.os.Parcelable;
import hu.ekreta.ellenorzo.evaluation.Evaluation;
import hu.ekreta.ellenorzo.parceler.CalendarParceler;
import hu.ekreta.ellenorzo.util.mapper.ProfileSpecificModel;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0003>?@Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0012J\t\u0010\"\u001a\u00020\u0004HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010$\u001a\u00020\u0004HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\u0004HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010*\u001a\u00020\u000fHÆ\u0003J\t\u0010+\u001a\u00020\u0004HÆ\u0003Js\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\b\u0010-\u001a\u00020.H\u0016J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020.HÖ\u0001J\t\u00104\u001a\u00020\u0004HÖ\u0001J\u000e\u00105\u001a\u0002062\u0006\u00107\u001a\u000208J\u0019\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020.HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0010\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016¨\u0006A"}, d2 = {"Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry;", "Lhu/ekreta/ellenorzo/util/mapper/ProfileSpecificModel;", "Landroid/os/Parcelable;", "uid", "", "profileId", "date", "Ljava/util/Calendar;", "type", "Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry$Type;", "typeDesc", "irregularDayType", "Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry$IrregularDayType;", "irregularDayTypeDesc", "weekType", "Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry$WeekType;", "weekTypeDesc", "groupUid", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry$Type;Ljava/lang/String;Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry$IrregularDayType;Ljava/lang/String;Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry$WeekType;Ljava/lang/String;Ljava/lang/String;)V", "getDate", "()Ljava/util/Calendar;", "getGroupUid", "()Ljava/lang/String;", "getIrregularDayType", "()Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry$IrregularDayType;", "getIrregularDayTypeDesc", "getProfileId", "getType", "()Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry$Type;", "getTypeDesc", "getUid", "getWeekType", "()Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry$WeekType;", "getWeekTypeDesc", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "toTimeTableItem", "Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "IrregularDayType", "Type", "WeekType", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: SchoolYearCalendarEntry.kt */
public final class SchoolYearCalendarEntry implements ProfileSpecificModel, Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    public final String c;
    public final String e;
    public final Calendar f;

    /* renamed from: g  reason: collision with root package name */
    public final Type f6075g;

    /* renamed from: h  reason: collision with root package name */
    public final String f6076h;

    /* renamed from: i  reason: collision with root package name */
    public final IrregularDayType f6077i;

    /* renamed from: j  reason: collision with root package name */
    public final String f6078j;

    /* renamed from: k  reason: collision with root package name */
    public final WeekType f6079k;

    /* renamed from: l  reason: collision with root package name */
    public final String f6080l;

    /* renamed from: m  reason: collision with root package name */
    public final String f6081m;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static class Creator implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            IrregularDayType irregularDayType;
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Calendar calendar = (Calendar) CalendarParceler.INSTANCE.create(parcel);
            Type type = (Type) Enum.valueOf(Type.class, parcel.readString());
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                irregularDayType = (IrregularDayType) Enum.valueOf(IrregularDayType.class, parcel.readString());
            } else {
                irregularDayType = null;
            }
            return new SchoolYearCalendarEntry(readString, readString2, calendar, type, readString3, irregularDayType, parcel.readString(), (WeekType) Enum.valueOf(WeekType.class, parcel.readString()), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i2) {
            return new SchoolYearCalendarEntry[i2];
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0001\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry$IrregularDayType;", "", "rawType", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawType", "()Ljava/lang/String;", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY", "NOT_AVAILABLE", "UNKNOWN", "Companion", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: SchoolYearCalendarEntry.kt */
    public enum IrregularDayType {
        MONDAY("Hetfo"),
        TUESDAY("Kedd"),
        WEDNESDAY("Szerda"),
        THURSDAY("Csutortok"),
        FRIDAY("Pentek"),
        SATURDAY("Szombat"),
        SUNDAY("Vasarnap"),
        NOT_AVAILABLE("na"),
        UNKNOWN("unknown");
        
        public static final Companion Companion = null;
        public static final Lazy f = null;
        public final String c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0005R)\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00048BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry$IrregularDayType$Companion;", "", "()V", "map", "", "", "Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry$IrregularDayType;", "getMap", "()Ljava/util/Map;", "map$delegate", "Lkotlin/Lazy;", "parse", "rawType", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
        /* compiled from: SchoolYearCalendarEntry.kt */
        public static final class Companion {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ KProperty[] f6082a = null;

            static {
                f6082a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "map", "getMap()Ljava/util/Map;"))};
            }

            public Companion() {
            }

            public final IrregularDayType a(String str) {
                if (str == null) {
                    return null;
                }
                Lazy access$getMap$cp = IrregularDayType.f;
                Companion companion = IrregularDayType.Companion;
                KProperty kProperty = f6082a[0];
                IrregularDayType irregularDayType = (IrregularDayType) ((Map) access$getMap$cp.getValue()).get(str);
                return irregularDayType != null ? irregularDayType : IrregularDayType.UNKNOWN;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new Companion((DefaultConstructorMarker) null);
            f = LazyKt__LazyJVMKt.lazy(SchoolYearCalendarEntry$IrregularDayType$Companion$map$2.INSTANCE);
        }

        /* access modifiers changed from: public */
        IrregularDayType(String str) {
            this.c = str;
        }

        public final String a() {
            return this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\b\u0001\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001+B\u001d\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*¨\u0006,"}, d2 = {"Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry$Type;", "", "rawType", "", "evalutaionType", "Lhu/ekreta/ellenorzo/evaluation/Evaluation$Type;", "(Ljava/lang/String;ILjava/lang/String;Lhu/ekreta/ellenorzo/evaluation/Evaluation$Type;)V", "getEvalutaionType", "()Lhu/ekreta/ellenorzo/evaluation/Evaluation$Type;", "getRawType", "()Ljava/lang/String;", "SCHOOL_DAY", "HOLIDAY", "WORK_DAY", "TYPE4", "FULL_DAY_TRIP", "TYPE6", "TYPE7", "VACATION", "SHORTENED_LESSONS_SCHOOL_DAY", "FIRST_SCHOOL_DAY", "LAST_SCHOOL_DAY", "RED_LETTER_DAY", "WINTER_HOLIDAY", "SPRING_HOLIDAY", "FALL_HOLIDAY", "HALF_YEAR_END", "EXAM_DAY", "TYPE18", "END_OF_FIRST_QUARTER", "END_OF_THIRD_QUARTER", "TYPE21", "IRREGULAR_SCHOOLD_DAY", "OPEN_DAY", "WEEKEND", "TYPE25", "TYPE26", "TYPE27", "TYPE28", "TYPE29", "TYPE30", "NOT_AVAILABLE", "UNKNOWN", "Companion", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: SchoolYearCalendarEntry.kt */
    public enum Type {
        SCHOOL_DAY("tanitasi_nap", (int) null, 2),
        HOLIDAY("munkaszuneti_nap", (int) null, 2),
        WORK_DAY("tanitas_nelkuli_munkanap", (int) null, 2),
        TYPE4("szuloi_ertekezlet_tanitas_nelkul_", (int) null, 2),
        FULL_DAY_TRIP("egesz_napos_kirandulas", (int) null, 2),
        TYPE6("fogadonap_tanitas_nelkuli_", (int) null, 2),
        TYPE7("szabadnap_igazgatoi_hataskorben_", (int) null, 2),
        VACATION("tanitasi_szunet", (int) null, 2),
        SHORTENED_LESSONS_SCHOOL_DAY("roviditett_orakat_tartalmazo_tanitasi_nap", (int) null, 2),
        FIRST_SCHOOL_DAY("elso_tanitasi_nap", (int) null, 2),
        LAST_SCHOOL_DAY("utolso_tanitasi_nap", Evaluation.Type.EndOfYear),
        RED_LETTER_DAY("unnepnap", (int) null, 2),
        WINTER_HOLIDAY("teli_szunet", (int) null, 2),
        SPRING_HOLIDAY("tavaszi_szunet", (int) null, 2),
        FALL_HOLIDAY("oszi_szunet", (int) null, 2),
        HALF_YEAR_END("elso_felev_vege", Evaluation.Type.HalfYear),
        EXAM_DAY("vizsganap", (int) null, 2),
        TYPE18("utolso_tanitasi_nap_a_vegzos_evfolyamokon", Evaluation.Type.EndOfYear),
        END_OF_FIRST_QUARTER("I_negyedev_vege", Evaluation.Type.FirstQuarter),
        END_OF_THIRD_QUARTER("III_negyedev_vege", Evaluation.Type.ThirdQuarter),
        TYPE21("OsszefuggoSzakmaiGyakorlatiNap", (int) null, 2),
        IRREGULAR_SCHOOLD_DAY("RendkivuliTanitasiNap", (int) null, 2),
        OPEN_DAY("Nyilt_nap", (int) null, 2),
        WEEKEND("Pihenonap", (int) null, 2),
        TYPE25("utolso_tanitasi_nap_rendeszet", Evaluation.Type.EndOfYear),
        TYPE26("utolso_tanitasi_nap_honvedelmi", Evaluation.Type.EndOfYear),
        TYPE27("utolso_tanitasi_nap_keresztfeleves", Evaluation.Type.EndOfYear),
        TYPE28("utolso_tanitasi_nap_reszszakkepesites", Evaluation.Type.EndOfYear),
        TYPE29("elso_tanitasi_nap_keresztfeleves", (int) null, 2),
        TYPE30("elso_felev_vege_keresztfeleves", Evaluation.Type.HalfYear),
        NOT_AVAILABLE("na", (int) null, 2),
        UNKNOWN("unknown", (int) null, 2);
        
        public static final Companion Companion = null;

        /* renamed from: g  reason: collision with root package name */
        public static final Lazy f6083g = null;
        public final String c;
        public final Evaluation.Type e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0005R)\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00048BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry$Type$Companion;", "", "()V", "map", "", "", "Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry$Type;", "getMap", "()Ljava/util/Map;", "map$delegate", "Lkotlin/Lazy;", "getByEvaluationType", "type", "Lhu/ekreta/ellenorzo/evaluation/Evaluation$Type;", "parse", "rawType", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
        /* compiled from: SchoolYearCalendarEntry.kt */
        public static final class Companion {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ KProperty[] f6084a = null;

            static {
                f6084a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "map", "getMap()Ljava/util/Map;"))};
            }

            public Companion() {
            }

            public final Type a(String str) {
                Intrinsics.checkParameterIsNotNull(str, "rawType");
                Lazy access$getMap$cp = Type.f6083g;
                Companion companion = Type.Companion;
                KProperty kProperty = f6084a[0];
                Type type = (Type) ((Map) access$getMap$cp.getValue()).get(str);
                return type != null ? type : Type.UNKNOWN;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public final Type a(Evaluation.Type type) {
                Intrinsics.checkParameterIsNotNull(type, "type");
                Type[] values = Type.values();
                ArrayList arrayList = new ArrayList();
                for (Type type2 : values) {
                    if (type2.a() == type) {
                        arrayList.add(type2);
                    }
                }
                return (Type) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new Companion((DefaultConstructorMarker) null);
            f6083g = LazyKt__LazyJVMKt.lazy(SchoolYearCalendarEntry$Type$Companion$map$2.INSTANCE);
        }

        /* access modifiers changed from: public */
        Type(String str, Evaluation.Type type) {
            this.c = str;
            this.e = type;
        }

        public final Evaluation.Type a() {
            return this.e;
        }

        public final String b() {
            return this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry$WeekType;", "", "rawType", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawType", "()Ljava/lang/String;", "EVERY_WEEK", "UNKNOWN", "Companion", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: SchoolYearCalendarEntry.kt */
    public enum WeekType {
        EVERY_WEEK("MindegyikHet"),
        UNKNOWN("unknown");
        
        public static final Companion Companion = null;
        public static final Lazy f = null;
        public final String c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005R)\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00048BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry$WeekType$Companion;", "", "()V", "map", "", "", "Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry$WeekType;", "getMap", "()Ljava/util/Map;", "map$delegate", "Lkotlin/Lazy;", "parse", "rawType", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
        /* compiled from: SchoolYearCalendarEntry.kt */
        public static final class Companion {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ KProperty[] f6085a = null;

            static {
                f6085a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "map", "getMap()Ljava/util/Map;"))};
            }

            public Companion() {
            }

            public final WeekType a(String str) {
                Intrinsics.checkParameterIsNotNull(str, "rawType");
                Lazy access$getMap$cp = WeekType.f;
                Companion companion = WeekType.Companion;
                KProperty kProperty = f6085a[0];
                WeekType weekType = (WeekType) ((Map) access$getMap$cp.getValue()).get(str);
                return weekType != null ? weekType : WeekType.UNKNOWN;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new Companion((DefaultConstructorMarker) null);
            f = LazyKt__LazyJVMKt.lazy(SchoolYearCalendarEntry$WeekType$Companion$map$2.INSTANCE);
        }

        /* access modifiers changed from: public */
        WeekType(String str) {
            this.c = str;
        }

        public final String a() {
            return this.c;
        }
    }

    public SchoolYearCalendarEntry(String str, String str2, Calendar calendar, Type type, String str3, IrregularDayType irregularDayType, String str4, WeekType weekType, String str5, String str6) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(str2, "profileId");
        Intrinsics.checkParameterIsNotNull(calendar, "date");
        Intrinsics.checkParameterIsNotNull(type, "type");
        Intrinsics.checkParameterIsNotNull(str3, "typeDesc");
        Intrinsics.checkParameterIsNotNull(weekType, "weekType");
        Intrinsics.checkParameterIsNotNull(str5, "weekTypeDesc");
        this.c = str;
        this.e = str2;
        this.f = calendar;
        this.f6075g = type;
        this.f6076h = str3;
        this.f6077i = irregularDayType;
        this.f6078j = str4;
        this.f6079k = weekType;
        this.f6080l = str5;
        this.f6081m = str6;
    }

    public static /* synthetic */ SchoolYearCalendarEntry copy$default(SchoolYearCalendarEntry schoolYearCalendarEntry, String str, String str2, Calendar calendar, Type type, String str3, IrregularDayType irregularDayType, String str4, WeekType weekType, String str5, String str6, int i2, Object obj) {
        SchoolYearCalendarEntry schoolYearCalendarEntry2 = schoolYearCalendarEntry;
        int i3 = i2;
        return schoolYearCalendarEntry.a((i3 & 1) != 0 ? schoolYearCalendarEntry2.c : str, (i3 & 2) != 0 ? schoolYearCalendarEntry.e() : str2, (i3 & 4) != 0 ? schoolYearCalendarEntry2.f : calendar, (i3 & 8) != 0 ? schoolYearCalendarEntry2.f6075g : type, (i3 & 16) != 0 ? schoolYearCalendarEntry2.f6076h : str3, (i3 & 32) != 0 ? schoolYearCalendarEntry2.f6077i : irregularDayType, (i3 & 64) != 0 ? schoolYearCalendarEntry2.f6078j : str4, (i3 & 128) != 0 ? schoolYearCalendarEntry2.f6079k : weekType, (i3 & 256) != 0 ? schoolYearCalendarEntry2.f6080l : str5, (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? schoolYearCalendarEntry2.f6081m : str6);
    }

    public final SchoolYearCalendarEntry a(String str, String str2, Calendar calendar, Type type, String str3, IrregularDayType irregularDayType, String str4, WeekType weekType, String str5, String str6) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(str2, "profileId");
        Intrinsics.checkParameterIsNotNull(calendar, "date");
        Type type2 = type;
        Intrinsics.checkParameterIsNotNull(type2, "type");
        String str7 = str3;
        Intrinsics.checkParameterIsNotNull(str7, "typeDesc");
        WeekType weekType2 = weekType;
        Intrinsics.checkParameterIsNotNull(weekType2, "weekType");
        String str8 = str5;
        Intrinsics.checkParameterIsNotNull(str8, "weekTypeDesc");
        return new SchoolYearCalendarEntry(str, str2, calendar, type2, str7, irregularDayType, str4, weekType2, str8, str6);
    }

    public final String d() {
        return this.c;
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchoolYearCalendarEntry)) {
            return false;
        }
        SchoolYearCalendarEntry schoolYearCalendarEntry = (SchoolYearCalendarEntry) obj;
        return Intrinsics.areEqual((Object) this.c, (Object) schoolYearCalendarEntry.c) && Intrinsics.areEqual((Object) e(), (Object) schoolYearCalendarEntry.e()) && Intrinsics.areEqual((Object) this.f, (Object) schoolYearCalendarEntry.f) && Intrinsics.areEqual((Object) this.f6075g, (Object) schoolYearCalendarEntry.f6075g) && Intrinsics.areEqual((Object) this.f6076h, (Object) schoolYearCalendarEntry.f6076h) && Intrinsics.areEqual((Object) this.f6077i, (Object) schoolYearCalendarEntry.f6077i) && Intrinsics.areEqual((Object) this.f6078j, (Object) schoolYearCalendarEntry.f6078j) && Intrinsics.areEqual((Object) this.f6079k, (Object) schoolYearCalendarEntry.f6079k) && Intrinsics.areEqual((Object) this.f6080l, (Object) schoolYearCalendarEntry.f6080l) && Intrinsics.areEqual((Object) this.f6081m, (Object) schoolYearCalendarEntry.f6081m);
    }

    public final Calendar f() {
        return this.f;
    }

    public final String g() {
        return this.f6081m;
    }

    public final IrregularDayType h() {
        return this.f6077i;
    }

    public int hashCode() {
        String str = this.c;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String e2 = e();
        int hashCode2 = (hashCode + (e2 != null ? e2.hashCode() : 0)) * 31;
        Calendar calendar = this.f;
        int hashCode3 = (hashCode2 + (calendar != null ? calendar.hashCode() : 0)) * 31;
        Type type = this.f6075g;
        int hashCode4 = (hashCode3 + (type != null ? type.hashCode() : 0)) * 31;
        String str2 = this.f6076h;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        IrregularDayType irregularDayType = this.f6077i;
        int hashCode6 = (hashCode5 + (irregularDayType != null ? irregularDayType.hashCode() : 0)) * 31;
        String str3 = this.f6078j;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        WeekType weekType = this.f6079k;
        int hashCode8 = (hashCode7 + (weekType != null ? weekType.hashCode() : 0)) * 31;
        String str4 = this.f6080l;
        int hashCode9 = (hashCode8 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f6081m;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode9 + i2;
    }

    public final String i() {
        return this.f6078j;
    }

    public final Type j() {
        return this.f6075g;
    }

    public final String k() {
        return this.f6076h;
    }

    public final WeekType l() {
        return this.f6079k;
    }

    public final String m() {
        return this.f6080l;
    }

    public String toString() {
        StringBuilder a2 = a.a("SchoolYearCalendarEntry(uid=");
        a2.append(this.c);
        a2.append(", profileId=");
        a2.append(e());
        a2.append(", date=");
        a2.append(this.f);
        a2.append(", type=");
        a2.append(this.f6075g);
        a2.append(", typeDesc=");
        a2.append(this.f6076h);
        a2.append(", irregularDayType=");
        a2.append(this.f6077i);
        a2.append(", irregularDayTypeDesc=");
        a2.append(this.f6078j);
        a2.append(", weekType=");
        a2.append(this.f6079k);
        a2.append(", weekTypeDesc=");
        a2.append(this.f6080l);
        a2.append(", groupUid=");
        return a.a(a2, this.f6081m, ")");
    }

    public void writeToParcel(Parcel parcel, int i2) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.c);
        parcel.writeString(this.e);
        CalendarParceler.INSTANCE.write(this.f, parcel, i2);
        parcel.writeString(this.f6075g.name());
        parcel.writeString(this.f6076h);
        IrregularDayType irregularDayType = this.f6077i;
        if (irregularDayType != null) {
            parcel.writeInt(1);
            parcel.writeString(irregularDayType.name());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f6078j);
        parcel.writeString(this.f6079k.name());
        parcel.writeString(this.f6080l);
        parcel.writeString(this.f6081m);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SchoolYearCalendarEntry(java.lang.String r15, java.lang.String r16, java.util.Calendar r17, hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarEntry.Type r18, java.lang.String r19, hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarEntry.IrregularDayType r20, java.lang.String r21, hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarEntry.WeekType r22, java.lang.String r23, java.lang.String r24, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
        /*
            r14 = this;
            r0 = r25
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r9 = r2
            goto L_0x000b
        L_0x0009:
            r9 = r20
        L_0x000b:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0011
            r10 = r2
            goto L_0x0013
        L_0x0011:
            r10 = r21
        L_0x0013:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0019
            r13 = r2
            goto L_0x001b
        L_0x0019:
            r13 = r24
        L_0x001b:
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r11 = r22
            r12 = r23
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarEntry.<init>(java.lang.String, java.lang.String, java.util.Calendar, hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarEntry$Type, java.lang.String, hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarEntry$IrregularDayType, java.lang.String, hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarEntry$WeekType, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
