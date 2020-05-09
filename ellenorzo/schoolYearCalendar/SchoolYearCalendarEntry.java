package p289hu.ekreta.ellenorzo.schoolYearCalendar;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.p349io.ConstantsKt;
import kotlin.reflect.KProperty;
import p000a.p020b.p021a.p022a.C0082a;
import p289hu.ekreta.ellenorzo.parceler.CalendarParceler;
import p289hu.ekreta.ellenorzo.util.mapper.ProfileSpecificModel;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0003:;<Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0012J\t\u0010\"\u001a\u00020\u0004HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010$\u001a\u00020\u0004HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\u0004HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010*\u001a\u00020\u000fHÆ\u0003J\t\u0010+\u001a\u00020\u0004HÆ\u0003Js\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\b\u0010-\u001a\u00020.H\u0016J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020.HÖ\u0001J\t\u00104\u001a\u00020\u0004HÖ\u0001J\u0019\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020.HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0010\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016¨\u0006="}, mo17463d2 = {"Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry;", "Lhu/ekreta/ellenorzo/util/mapper/ProfileSpecificModel;", "Landroid/os/Parcelable;", "uid", "", "profileId", "date", "Ljava/util/Calendar;", "type", "Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry$Type;", "typeDesc", "irregularDayType", "Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry$IrregularDayType;", "irregularDayTypeDesc", "weekType", "Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry$WeekType;", "weekTypeDesc", "groupUid", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry$Type;Ljava/lang/String;Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry$IrregularDayType;Ljava/lang/String;Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry$WeekType;Ljava/lang/String;Ljava/lang/String;)V", "getDate", "()Ljava/util/Calendar;", "getGroupUid", "()Ljava/lang/String;", "getIrregularDayType", "()Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry$IrregularDayType;", "getIrregularDayTypeDesc", "getProfileId", "getType", "()Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry$Type;", "getTypeDesc", "getUid", "getWeekType", "()Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry$WeekType;", "getWeekTypeDesc", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "IrregularDayType", "Type", "WeekType", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarEntry */
/* compiled from: SchoolYearCalendarEntry.kt */
public final class SchoolYearCalendarEntry implements ProfileSpecificModel, Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new Creator();

    /* renamed from: c */
    public final String f14713c;

    /* renamed from: e */
    public final String f14714e;

    /* renamed from: f */
    public final Calendar f14715f;

    /* renamed from: g */
    public final Type f14716g;

    /* renamed from: h */
    public final String f14717h;

    /* renamed from: i */
    public final IrregularDayType f14718i;

    /* renamed from: j */
    public final String f14719j;

    /* renamed from: k */
    public final WeekType f14720k;

    /* renamed from: l */
    public final String f14721l;

    /* renamed from: m */
    public final String f14722m;

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarEntry$Creator */
    public static class Creator implements android.os.Parcelable.Creator {
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
            SchoolYearCalendarEntry schoolYearCalendarEntry = new SchoolYearCalendarEntry(readString, readString2, calendar, type, readString3, irregularDayType, parcel.readString(), (WeekType) Enum.valueOf(WeekType.class, parcel.readString()), parcel.readString(), parcel.readString());
            return schoolYearCalendarEntry;
        }

        public final Object[] newArray(int i) {
            return new SchoolYearCalendarEntry[i];
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0001\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry$IrregularDayType;", "", "rawType", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawType", "()Ljava/lang/String;", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY", "NOT_AVAILABLE", "UNKNOWN", "Companion", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarEntry$IrregularDayType */
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

        /* renamed from: f */
        public static final Lazy f14724f = null;

        /* renamed from: c */
        public final String f14725c;

        @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0005R)\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00048BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry$IrregularDayType$Companion;", "", "()V", "map", "", "", "Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry$IrregularDayType;", "getMap", "()Ljava/util/Map;", "map$delegate", "Lkotlin/Lazy;", "parse", "rawType", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
        /* renamed from: hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarEntry$IrregularDayType$Companion */
        /* compiled from: SchoolYearCalendarEntry.kt */
        public static final class Companion {

            /* renamed from: a */
            public static final /* synthetic */ KProperty[] f14726a = null;

            static {
                f14726a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "map", "getMap()Ljava/util/Map;"))};
            }

            public Companion() {
            }

            /* renamed from: a */
            public final IrregularDayType mo15605a(String str) {
                if (str == null) {
                    return null;
                }
                Lazy access$getMap$cp = IrregularDayType.f14724f;
                Companion companion = IrregularDayType.Companion;
                KProperty kProperty = f14726a[0];
                IrregularDayType irregularDayType = (IrregularDayType) ((Map) access$getMap$cp.getValue()).get(str);
                return irregularDayType != null ? irregularDayType : IrregularDayType.UNKNOWN;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new Companion(null);
            f14724f = LazyKt__LazyJVMKt.lazy(SchoolYearCalendarEntry$IrregularDayType$Companion$map$2.INSTANCE);
        }

        /* access modifiers changed from: public */
        IrregularDayType(String str) {
            this.f14725c = str;
        }

        /* renamed from: a */
        public final String mo15604a() {
            return this.f14725c;
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\b\u0001\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001+B\u001d\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*¨\u0006,"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry$Type;", "", "rawType", "", "evalutaionType", "Lhu/ekreta/ellenorzo/evaluation/Evaluation$Type;", "(Ljava/lang/String;ILjava/lang/String;Lhu/ekreta/ellenorzo/evaluation/Evaluation$Type;)V", "getEvalutaionType", "()Lhu/ekreta/ellenorzo/evaluation/Evaluation$Type;", "getRawType", "()Ljava/lang/String;", "SCHOOL_DAY", "HOLIDAY", "WORK_DAY", "TYPE4", "FULL_DAY_TRIP", "TYPE6", "TYPE7", "VACATION", "SHORTENED_LESSONS_SCHOOL_DAY", "FIRST_SCHOOL_DAY", "LAST_SCHOOL_DAY", "RED_LETTER_DAY", "WINTER_HOLIDAY", "SPRING_HOLIDAY", "FALL_HOLIDAY", "HALF_YEAR_END", "EXAM_DAY", "TYPE18", "END_OF_FIRST_QUARTER", "END_OF_THIRD_QUARTER", "TYPE21", "IRREGULAR_SCHOOLD_DAY", "OPEN_DAY", "WEEKEND", "TYPE25", "TYPE26", "TYPE27", "TYPE28", "TYPE29", "TYPE30", "NOT_AVAILABLE", "UNKNOWN", "Companion", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarEntry$Type */
    /* compiled from: SchoolYearCalendarEntry.kt */
    public enum Type {
        SCHOOL_DAY("tanitasi_nap", null, 2),
        HOLIDAY("munkaszuneti_nap", null, 2),
        WORK_DAY("tanitas_nelkuli_munkanap", null, 2),
        TYPE4("szuloi_ertekezlet_tanitas_nelkul_", null, 2),
        FULL_DAY_TRIP("egesz_napos_kirandulas", null, 2),
        TYPE6("fogadonap_tanitas_nelkuli_", null, 2),
        TYPE7("szabadnap_igazgatoi_hataskorben_", null, 2),
        VACATION("tanitasi_szunet", null, 2),
        SHORTENED_LESSONS_SCHOOL_DAY("roviditett_orakat_tartalmazo_tanitasi_nap", null, 2),
        FIRST_SCHOOL_DAY("elso_tanitasi_nap", null, 2),
        LAST_SCHOOL_DAY("utolso_tanitasi_nap", p289hu.ekreta.ellenorzo.evaluation.Evaluation.Type.EndOfYear),
        RED_LETTER_DAY("unnepnap", null, 2),
        WINTER_HOLIDAY("teli_szunet", null, 2),
        SPRING_HOLIDAY("tavaszi_szunet", null, 2),
        FALL_HOLIDAY("oszi_szunet", null, 2),
        HALF_YEAR_END("elso_felev_vege", p289hu.ekreta.ellenorzo.evaluation.Evaluation.Type.HalfYear),
        EXAM_DAY("vizsganap", null, 2),
        TYPE18("utolso_tanitasi_nap_a_vegzos_evfolyamokon", p289hu.ekreta.ellenorzo.evaluation.Evaluation.Type.EndOfYear),
        END_OF_FIRST_QUARTER("I_negyedev_vege", p289hu.ekreta.ellenorzo.evaluation.Evaluation.Type.FirstQuarter),
        END_OF_THIRD_QUARTER("III_negyedev_vege", p289hu.ekreta.ellenorzo.evaluation.Evaluation.Type.ThirdQuarter),
        TYPE21("OsszefuggoSzakmaiGyakorlatiNap", null, 2),
        IRREGULAR_SCHOOLD_DAY("RendkivuliTanitasiNap", null, 2),
        OPEN_DAY("Nyilt_nap", null, 2),
        WEEKEND("Pihenonap", null, 2),
        TYPE25("utolso_tanitasi_nap_rendeszet", p289hu.ekreta.ellenorzo.evaluation.Evaluation.Type.EndOfYear),
        TYPE26("utolso_tanitasi_nap_honvedelmi", p289hu.ekreta.ellenorzo.evaluation.Evaluation.Type.EndOfYear),
        TYPE27("utolso_tanitasi_nap_keresztfeleves", p289hu.ekreta.ellenorzo.evaluation.Evaluation.Type.EndOfYear),
        TYPE28("utolso_tanitasi_nap_reszszakkepesites", p289hu.ekreta.ellenorzo.evaluation.Evaluation.Type.EndOfYear),
        TYPE29("elso_tanitasi_nap_keresztfeleves", null, 2),
        TYPE30("elso_felev_vege_keresztfeleves", p289hu.ekreta.ellenorzo.evaluation.Evaluation.Type.HalfYear),
        NOT_AVAILABLE("na", null, 2),
        UNKNOWN("unknown", null, 2);
        
        public static final Companion Companion = null;

        /* renamed from: g */
        public static final Lazy f14728g = null;

        /* renamed from: c */
        public final String f14729c;

        /* renamed from: e */
        public final p289hu.ekreta.ellenorzo.evaluation.Evaluation.Type f14730e;

        @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0005R)\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00048BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry$Type$Companion;", "", "()V", "map", "", "", "Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry$Type;", "getMap", "()Ljava/util/Map;", "map$delegate", "Lkotlin/Lazy;", "getByEvaluationType", "type", "Lhu/ekreta/ellenorzo/evaluation/Evaluation$Type;", "parse", "rawType", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
        /* renamed from: hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarEntry$Type$Companion */
        /* compiled from: SchoolYearCalendarEntry.kt */
        public static final class Companion {

            /* renamed from: a */
            public static final /* synthetic */ KProperty[] f14731a = null;

            static {
                f14731a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "map", "getMap()Ljava/util/Map;"))};
            }

            public Companion() {
            }

            /* renamed from: a */
            public final Type mo15609a(String str) {
                Intrinsics.checkParameterIsNotNull(str, "rawType");
                Lazy access$getMap$cp = Type.f14728g;
                Companion companion = Type.Companion;
                KProperty kProperty = f14731a[0];
                Type type = (Type) ((Map) access$getMap$cp.getValue()).get(str);
                return type != null ? type : Type.UNKNOWN;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            /* renamed from: a */
            public final Type mo15608a(p289hu.ekreta.ellenorzo.evaluation.Evaluation.Type type) {
                Intrinsics.checkParameterIsNotNull(type, "type");
                Type[] values = Type.values();
                ArrayList arrayList = new ArrayList();
                for (Type type2 : values) {
                    if (type2.mo15606a() == type) {
                        arrayList.add(type2);
                    }
                }
                return (Type) CollectionsKt___CollectionsKt.firstOrNull((List<? extends T>) arrayList);
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new Companion(null);
            f14728g = LazyKt__LazyJVMKt.lazy(SchoolYearCalendarEntry$Type$Companion$map$2.INSTANCE);
        }

        /* access modifiers changed from: public */
        Type(String str, p289hu.ekreta.ellenorzo.evaluation.Evaluation.Type type) {
            this.f14729c = str;
            this.f14730e = type;
        }

        /* renamed from: a */
        public final p289hu.ekreta.ellenorzo.evaluation.Evaluation.Type mo15606a() {
            return this.f14730e;
        }

        /* renamed from: b */
        public final String mo15607b() {
            return this.f14729c;
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry$WeekType;", "", "rawType", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawType", "()Ljava/lang/String;", "EVERY_WEEK", "UNKNOWN", "Companion", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarEntry$WeekType */
    /* compiled from: SchoolYearCalendarEntry.kt */
    public enum WeekType {
        EVERY_WEEK("MindegyikHet"),
        UNKNOWN("unknown");
        
        public static final Companion Companion = null;

        /* renamed from: f */
        public static final Lazy f14733f = null;

        /* renamed from: c */
        public final String f14734c;

        @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005R)\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00048BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry$WeekType$Companion;", "", "()V", "map", "", "", "Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry$WeekType;", "getMap", "()Ljava/util/Map;", "map$delegate", "Lkotlin/Lazy;", "parse", "rawType", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
        /* renamed from: hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarEntry$WeekType$Companion */
        /* compiled from: SchoolYearCalendarEntry.kt */
        public static final class Companion {

            /* renamed from: a */
            public static final /* synthetic */ KProperty[] f14735a = null;

            static {
                f14735a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "map", "getMap()Ljava/util/Map;"))};
            }

            public Companion() {
            }

            /* renamed from: a */
            public final WeekType mo15611a(String str) {
                Intrinsics.checkParameterIsNotNull(str, "rawType");
                Lazy access$getMap$cp = WeekType.f14733f;
                Companion companion = WeekType.Companion;
                KProperty kProperty = f14735a[0];
                WeekType weekType = (WeekType) ((Map) access$getMap$cp.getValue()).get(str);
                return weekType != null ? weekType : WeekType.UNKNOWN;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new Companion(null);
            f14733f = LazyKt__LazyJVMKt.lazy(SchoolYearCalendarEntry$WeekType$Companion$map$2.INSTANCE);
        }

        /* access modifiers changed from: public */
        WeekType(String str) {
            this.f14734c = str;
        }

        /* renamed from: a */
        public final String mo15610a() {
            return this.f14734c;
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
        this.f14713c = str;
        this.f14714e = str2;
        this.f14715f = calendar;
        this.f14716g = type;
        this.f14717h = str3;
        this.f14718i = irregularDayType;
        this.f14719j = str4;
        this.f14720k = weekType;
        this.f14721l = str5;
        this.f14722m = str6;
    }

    public static /* synthetic */ SchoolYearCalendarEntry copy$default(SchoolYearCalendarEntry schoolYearCalendarEntry, String str, String str2, Calendar calendar, Type type, String str3, IrregularDayType irregularDayType, String str4, WeekType weekType, String str5, String str6, int i, Object obj) {
        SchoolYearCalendarEntry schoolYearCalendarEntry2 = schoolYearCalendarEntry;
        int i2 = i;
        return schoolYearCalendarEntry.mo15587a((i2 & 1) != 0 ? schoolYearCalendarEntry2.f14713c : str, (i2 & 2) != 0 ? schoolYearCalendarEntry.mo11318e() : str2, (i2 & 4) != 0 ? schoolYearCalendarEntry2.f14715f : calendar, (i2 & 8) != 0 ? schoolYearCalendarEntry2.f14716g : type, (i2 & 16) != 0 ? schoolYearCalendarEntry2.f14717h : str3, (i2 & 32) != 0 ? schoolYearCalendarEntry2.f14718i : irregularDayType, (i2 & 64) != 0 ? schoolYearCalendarEntry2.f14719j : str4, (i2 & 128) != 0 ? schoolYearCalendarEntry2.f14720k : weekType, (i2 & 256) != 0 ? schoolYearCalendarEntry2.f14721l : str5, (i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? schoolYearCalendarEntry2.f14722m : str6);
    }

    /* renamed from: a */
    public final SchoolYearCalendarEntry mo15587a(String str, String str2, Calendar calendar, Type type, String str3, IrregularDayType irregularDayType, String str4, WeekType weekType, String str5, String str6) {
        String str7 = str;
        Intrinsics.checkParameterIsNotNull(str, "uid");
        String str8 = str2;
        Intrinsics.checkParameterIsNotNull(str2, "profileId");
        Calendar calendar2 = calendar;
        Intrinsics.checkParameterIsNotNull(calendar, "date");
        Type type2 = type;
        Intrinsics.checkParameterIsNotNull(type2, "type");
        String str9 = str3;
        Intrinsics.checkParameterIsNotNull(str9, "typeDesc");
        WeekType weekType2 = weekType;
        Intrinsics.checkParameterIsNotNull(weekType2, "weekType");
        String str10 = str5;
        Intrinsics.checkParameterIsNotNull(str10, "weekTypeDesc");
        SchoolYearCalendarEntry schoolYearCalendarEntry = new SchoolYearCalendarEntry(str7, str8, calendar2, type2, str9, irregularDayType, str4, weekType2, str10, str6);
        return schoolYearCalendarEntry;
    }

    /* renamed from: d */
    public final String mo15588d() {
        return this.f14713c;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String mo11318e() {
        return this.f14714e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006e, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f14722m, (java.lang.Object) r3.f14722m) != false) goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0073
            boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarEntry
            if (r0 == 0) goto L_0x0071
            hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarEntry r3 = (p289hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarEntry) r3
            java.lang.String r0 = r2.f14713c
            java.lang.String r1 = r3.f14713c
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0071
            java.lang.String r0 = r2.mo11318e()
            java.lang.String r1 = r3.mo11318e()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0071
            java.util.Calendar r0 = r2.f14715f
            java.util.Calendar r1 = r3.f14715f
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0071
            hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarEntry$Type r0 = r2.f14716g
            hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarEntry$Type r1 = r3.f14716g
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0071
            java.lang.String r0 = r2.f14717h
            java.lang.String r1 = r3.f14717h
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0071
            hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarEntry$IrregularDayType r0 = r2.f14718i
            hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarEntry$IrregularDayType r1 = r3.f14718i
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0071
            java.lang.String r0 = r2.f14719j
            java.lang.String r1 = r3.f14719j
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0071
            hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarEntry$WeekType r0 = r2.f14720k
            hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarEntry$WeekType r1 = r3.f14720k
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0071
            java.lang.String r0 = r2.f14721l
            java.lang.String r1 = r3.f14721l
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0071
            java.lang.String r0 = r2.f14722m
            java.lang.String r3 = r3.f14722m
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            r3 = 0
            return r3
        L_0x0073:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarEntry.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final Calendar mo15591f() {
        return this.f14715f;
    }

    /* renamed from: g */
    public final String mo15592g() {
        return this.f14722m;
    }

    /* renamed from: h */
    public final IrregularDayType mo15593h() {
        return this.f14718i;
    }

    public int hashCode() {
        String str = this.f14713c;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String e = mo11318e();
        int hashCode2 = (hashCode + (e != null ? e.hashCode() : 0)) * 31;
        Calendar calendar = this.f14715f;
        int hashCode3 = (hashCode2 + (calendar != null ? calendar.hashCode() : 0)) * 31;
        Type type = this.f14716g;
        int hashCode4 = (hashCode3 + (type != null ? type.hashCode() : 0)) * 31;
        String str2 = this.f14717h;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        IrregularDayType irregularDayType = this.f14718i;
        int hashCode6 = (hashCode5 + (irregularDayType != null ? irregularDayType.hashCode() : 0)) * 31;
        String str3 = this.f14719j;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        WeekType weekType = this.f14720k;
        int hashCode8 = (hashCode7 + (weekType != null ? weekType.hashCode() : 0)) * 31;
        String str4 = this.f14721l;
        int hashCode9 = (hashCode8 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f14722m;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode9 + i;
    }

    /* renamed from: i */
    public final String mo15595i() {
        return this.f14719j;
    }

    /* renamed from: j */
    public final Type mo15596j() {
        return this.f14716g;
    }

    /* renamed from: k */
    public final String mo15597k() {
        return this.f14717h;
    }

    /* renamed from: l */
    public final WeekType mo15598l() {
        return this.f14720k;
    }

    /* renamed from: m */
    public final String mo15599m() {
        return this.f14721l;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("SchoolYearCalendarEntry(uid=");
        a.append(this.f14713c);
        a.append(", profileId=");
        a.append(mo11318e());
        a.append(", date=");
        a.append(this.f14715f);
        a.append(", type=");
        a.append(this.f14716g);
        a.append(", typeDesc=");
        a.append(this.f14717h);
        a.append(", irregularDayType=");
        a.append(this.f14718i);
        a.append(", irregularDayTypeDesc=");
        a.append(this.f14719j);
        a.append(", weekType=");
        a.append(this.f14720k);
        a.append(", weekTypeDesc=");
        a.append(this.f14721l);
        a.append(", groupUid=");
        return C0082a.m106a(a, this.f14722m, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.f14713c);
        parcel.writeString(this.f14714e);
        CalendarParceler.INSTANCE.write(this.f14715f, parcel, i);
        parcel.writeString(this.f14716g.name());
        parcel.writeString(this.f14717h);
        IrregularDayType irregularDayType = this.f14718i;
        if (irregularDayType != null) {
            parcel.writeInt(1);
            parcel.writeString(irregularDayType.name());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f14719j);
        parcel.writeString(this.f14720k.name());
        parcel.writeString(this.f14721l);
        parcel.writeString(this.f14722m);
    }

    public /* synthetic */ SchoolYearCalendarEntry(String str, String str2, Calendar calendar, Type type, String str3, IrregularDayType irregularDayType, String str4, WeekType weekType, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = i;
        this(str, str2, calendar, type, str3, (i2 & 32) != 0 ? null : irregularDayType, (i2 & 64) != 0 ? null : str4, weekType, str5, (i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : str6);
    }
}
