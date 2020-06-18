package hu.ekreta.ellenorzo.omission;

import a.b.a.a.a;
import android.os.Parcel;
import android.os.Parcelable;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import hu.ekreta.ellenorzo.util.mapper.ReadableByUserModel;
import java.util.Calendar;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b9\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0003defB½\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0013\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\u0002\u0010\u001fJ\t\u0010>\u001a\u00020\u0004HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010!J\t\u0010@\u001a\u00020\u0004HÆ\u0003J\t\u0010A\u001a\u00020\u0013HÆ\u0003J\t\u0010B\u001a\u00020\u0013HÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010!J\t\u0010D\u001a\u00020\u0013HÆ\u0003J\t\u0010E\u001a\u00020\u0018HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010H\u001a\u00020\u0013HÆ\u0003J\t\u0010I\u001a\u00020\u0004HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u00103J\t\u0010L\u001a\u00020\u0007HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010N\u001a\u00020\u0004HÆ\u0003J\t\u0010O\u001a\u00020\u0004HÆ\u0003J\t\u0010P\u001a\u00020\u0004HÆ\u0003J\t\u0010Q\u001a\u00020\rHÆ\u0003J\t\u0010R\u001a\u00020\u0004HÆ\u0003Jî\u0001\u0010S\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u00132\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÆ\u0001¢\u0006\u0002\u0010TJ\b\u0010U\u001a\u00020\u0010H\u0016J\u0013\u0010V\u001a\u00020\u001e2\b\u0010W\u001a\u0004\u0018\u00010XHÖ\u0003J\u000e\u0010Y\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020\u0004J\u000e\u0010[\u001a\u00020\u00042\u0006\u0010\\\u001a\u00020\u0004J\t\u0010]\u001a\u00020\u0010HÖ\u0001J\t\u0010^\u001a\u00020\u0004HÖ\u0001J\u0019\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u00020\u0010HÖ\u0001R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0011\u0010\u0016\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b%\u0010!R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010'R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010'R\u0011\u0010\u0014\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b,\u0010$R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b-\u0010$R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u000e\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010'R\u0014\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010'R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0004¢\u0006\n\n\u0002\u00104\u001a\u0004\b2\u00103R\u0011\u0010\u001b\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b5\u0010$R\u0011\u0010\n\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010'R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010'R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010'R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010'R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010'R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010'¨\u0006g"}, d2 = {"Lhu/ekreta/ellenorzo/omission/Omission;", "Lhu/ekreta/ellenorzo/util/mapper/ReadableByUserModel;", "Landroid/os/Parcelable;", "uid", "", "profileId", "type", "Lhu/ekreta/ellenorzo/omission/Omission$Type;", "typeDescription", "subjectName", "subjectCategoryDescription", "subjectCategoryName", "mode", "Lhu/ekreta/ellenorzo/omission/Omission$LessonType;", "modeDescription", "delayTimeMinutes", "", "teacher", "lessonStartTime", "Ljava/util/Calendar;", "lessonEndTime", "classScheduleNumber", "creatingTime", "justificationState", "Lhu/ekreta/ellenorzo/omission/Omission$JustificationState;", "justificationTypeDescription", "justificationTypeName", "recordingDate", "groupUid", "readByUser", "", "(Ljava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/omission/Omission$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/omission/Omission$LessonType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/lang/Integer;Ljava/util/Calendar;Lhu/ekreta/ellenorzo/omission/Omission$JustificationState;Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/Boolean;)V", "getClassScheduleNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCreatingTime", "()Ljava/util/Calendar;", "getDelayTimeMinutes", "getGroupUid", "()Ljava/lang/String;", "getJustificationState", "()Lhu/ekreta/ellenorzo/omission/Omission$JustificationState;", "getJustificationTypeDescription", "getJustificationTypeName", "getLessonEndTime", "getLessonStartTime", "getMode", "()Lhu/ekreta/ellenorzo/omission/Omission$LessonType;", "getModeDescription", "getProfileId", "getReadByUser", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRecordingDate", "getSubjectCategoryDescription", "getSubjectCategoryName", "getSubjectName", "getTeacher", "getType", "()Lhu/ekreta/ellenorzo/omission/Omission$Type;", "getTypeDescription", "getUid", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/omission/Omission$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/omission/Omission$LessonType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/lang/Integer;Ljava/util/Calendar;Lhu/ekreta/ellenorzo/omission/Omission$JustificationState;Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/Boolean;)Lhu/ekreta/ellenorzo/omission/Omission;", "describeContents", "equals", "other", "", "formattedDelayInMinute", "minute", "getLessonTimeFormatted", "lessonString", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "JustificationState", "LessonType", "Type", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: Omission.kt */
public final class Omission implements ReadableByUserModel, Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    public final String c;
    public final String e;
    public final Type f;

    /* renamed from: g  reason: collision with root package name */
    public final String f5934g;

    /* renamed from: h  reason: collision with root package name */
    public final String f5935h;

    /* renamed from: i  reason: collision with root package name */
    public final String f5936i;

    /* renamed from: j  reason: collision with root package name */
    public final String f5937j;

    /* renamed from: k  reason: collision with root package name */
    public final LessonType f5938k;

    /* renamed from: l  reason: collision with root package name */
    public final String f5939l;

    /* renamed from: m  reason: collision with root package name */
    public final Integer f5940m;

    /* renamed from: n  reason: collision with root package name */
    public final String f5941n;

    /* renamed from: o  reason: collision with root package name */
    public final Calendar f5942o;

    /* renamed from: p  reason: collision with root package name */
    public final Calendar f5943p;

    /* renamed from: q  reason: collision with root package name */
    public final Integer f5944q;
    public final Calendar r;
    public final JustificationState s;
    public final String t;
    public final String u;
    public final Calendar v;
    public final String w;
    public final Boolean x;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static class Creator implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Boolean bool;
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Type type = (Type) Enum.valueOf(Type.class, parcel.readString());
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            LessonType lessonType = (LessonType) Enum.valueOf(LessonType.class, parcel.readString());
            String readString7 = parcel.readString();
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            String readString8 = parcel.readString();
            Calendar calendar = (Calendar) parcel.readSerializable();
            Calendar calendar2 = (Calendar) parcel.readSerializable();
            Integer valueOf2 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            Calendar calendar3 = (Calendar) parcel.readSerializable();
            JustificationState justificationState = (JustificationState) Enum.valueOf(JustificationState.class, parcel.readString());
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            Calendar calendar4 = (Calendar) parcel.readSerializable();
            String readString11 = parcel.readString();
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool = null;
            }
            return new Omission(readString, readString2, type, readString3, readString4, readString5, readString6, lessonType, readString7, valueOf, readString8, calendar, calendar2, valueOf2, calendar3, justificationState, readString9, readString10, calendar4, readString11, bool);
        }

        public final Object[] newArray(int i2) {
            return new Omission[i2];
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lhu/ekreta/ellenorzo/omission/Omission$JustificationState;", "", "nameValue", "", "localizedNameRes", "", "(Ljava/lang/String;ILjava/lang/String;I)V", "getLocalizedNameRes", "()I", "getNameValue", "()Ljava/lang/String;", "None", "UnJustified", "Justified", "BeJustified", "Companion", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: Omission.kt */
    public enum JustificationState {
        None("None", R.string.justification_state_none),
        UnJustified("Igazolatlan", R.string.justification_state_unjustified),
        Justified("Igazolt", R.string.justification_state_justified),
        BeJustified("Igazolando", R.string.justification_state_bejustified);
        
        public static final Companion Companion = null;

        /* renamed from: g  reason: collision with root package name */
        public static final Lazy f5945g = null;
        public final String c;
        public final int e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005R'\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lhu/ekreta/ellenorzo/omission/Omission$JustificationState$Companion;", "", "()V", "map", "", "", "Lhu/ekreta/ellenorzo/omission/Omission$JustificationState;", "getMap", "()Ljava/util/Map;", "map$delegate", "Lkotlin/Lazy;", "parse", "justificationStateName", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
        /* compiled from: Omission.kt */
        public static final class Companion {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ KProperty[] f5946a = null;

            static {
                f5946a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "map", "getMap()Ljava/util/Map;"))};
            }

            public Companion() {
            }

            public final JustificationState a(String str) {
                Intrinsics.checkParameterIsNotNull(str, "justificationStateName");
                Lazy access$getMap$cp = JustificationState.f5945g;
                Companion companion = JustificationState.Companion;
                KProperty kProperty = f5946a[0];
                JustificationState justificationState = (JustificationState) ((Map) access$getMap$cp.getValue()).get(str);
                return justificationState != null ? justificationState : JustificationState.UnJustified;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new Companion((DefaultConstructorMarker) null);
            f5945g = LazyKt__LazyJVMKt.lazy(Omission$JustificationState$Companion$map$2.INSTANCE);
        }

        /* access modifiers changed from: public */
        JustificationState(String str, int i2) {
            this.c = str;
            this.e = i2;
        }

        public final int a() {
            return this.e;
        }

        public final String b() {
            return this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lhu/ekreta/ellenorzo/omission/Omission$LessonType;", "", "modeName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getModeName", "()Ljava/lang/String;", "None", "Lesson", "OutsideLesson", "Companion", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: Omission.kt */
    public enum LessonType {
        None("None"),
        Lesson("Tanorai"),
        OutsideLesson("TanoranKivuli");
        
        public static final Companion Companion = null;
        public static final Lazy f = null;
        public final String c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005R'\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lhu/ekreta/ellenorzo/omission/Omission$LessonType$Companion;", "", "()V", "map", "", "", "Lhu/ekreta/ellenorzo/omission/Omission$LessonType;", "getMap", "()Ljava/util/Map;", "map$delegate", "Lkotlin/Lazy;", "parse", "lessonMode", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
        /* compiled from: Omission.kt */
        public static final class Companion {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ KProperty[] f5947a = null;

            static {
                f5947a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "map", "getMap()Ljava/util/Map;"))};
            }

            public Companion() {
            }

            public final LessonType a(String str) {
                Intrinsics.checkParameterIsNotNull(str, "lessonMode");
                Lazy access$getMap$cp = LessonType.f;
                Companion companion = LessonType.Companion;
                KProperty kProperty = f5947a[0];
                LessonType lessonType = (LessonType) ((Map) access$getMap$cp.getValue()).get(str);
                return lessonType != null ? lessonType : LessonType.Lesson;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new Companion((DefaultConstructorMarker) null);
            f = LazyKt__LazyJVMKt.lazy(Omission$LessonType$Companion$map$2.INSTANCE);
        }

        /* access modifiers changed from: public */
        LessonType(String str) {
            this.c = str;
        }

        public final String a() {
            return this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lhu/ekreta/ellenorzo/omission/Omission$Type;", "", "typeName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getTypeName", "()Ljava/lang/String;", "Na", "Presence", "Absence", "Lateness", "Companion", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: Omission.kt */
    public enum Type {
        Na("na"),
        Presence("jelenlet"),
        Absence("hianyzas"),
        Lateness("keses");
        
        public static final Companion Companion = null;
        public static final Lazy f = null;
        public final String c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0005R)\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00048BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lhu/ekreta/ellenorzo/omission/Omission$Type$Companion;", "", "()V", "map", "", "", "Lhu/ekreta/ellenorzo/omission/Omission$Type;", "getMap", "()Ljava/util/Map;", "map$delegate", "Lkotlin/Lazy;", "parse", "typeName", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
        /* compiled from: Omission.kt */
        public static final class Companion {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ KProperty[] f5948a = null;

            static {
                f5948a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "map", "getMap()Ljava/util/Map;"))};
            }

            public Companion() {
            }

            public final Type a(String str) {
                Lazy access$getMap$cp = Type.f;
                Companion companion = Type.Companion;
                KProperty kProperty = f5948a[0];
                Type type = (Type) ((Map) access$getMap$cp.getValue()).get(str);
                return type != null ? type : Type.Absence;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new Companion((DefaultConstructorMarker) null);
            f = LazyKt__LazyJVMKt.lazy(Omission$Type$Companion$map$2.INSTANCE);
        }

        /* access modifiers changed from: public */
        Type(String str) {
            this.c = str;
        }

        public final String a() {
            return this.c;
        }
    }

    public Omission(String str, String str2, Type type, String str3, String str4, String str5, String str6, LessonType lessonType, String str7, Integer num, String str8, Calendar calendar, Calendar calendar2, Integer num2, Calendar calendar3, JustificationState justificationState, String str9, String str10, Calendar calendar4, String str11, Boolean bool) {
        String str12 = str;
        String str13 = str2;
        Type type2 = type;
        String str14 = str4;
        String str15 = str5;
        String str16 = str6;
        LessonType lessonType2 = lessonType;
        String str17 = str7;
        String str18 = str8;
        Calendar calendar5 = calendar;
        Calendar calendar6 = calendar2;
        Calendar calendar7 = calendar3;
        JustificationState justificationState2 = justificationState;
        Calendar calendar8 = calendar4;
        Intrinsics.checkParameterIsNotNull(str12, "uid");
        Intrinsics.checkParameterIsNotNull(str13, "profileId");
        Intrinsics.checkParameterIsNotNull(type2, "type");
        Intrinsics.checkParameterIsNotNull(str14, "subjectName");
        Intrinsics.checkParameterIsNotNull(str15, "subjectCategoryDescription");
        Intrinsics.checkParameterIsNotNull(str16, "subjectCategoryName");
        Intrinsics.checkParameterIsNotNull(lessonType2, "mode");
        Intrinsics.checkParameterIsNotNull(str17, "modeDescription");
        Intrinsics.checkParameterIsNotNull(str18, "teacher");
        Intrinsics.checkParameterIsNotNull(calendar5, "lessonStartTime");
        Intrinsics.checkParameterIsNotNull(calendar6, "lessonEndTime");
        Intrinsics.checkParameterIsNotNull(calendar7, "creatingTime");
        Intrinsics.checkParameterIsNotNull(justificationState2, "justificationState");
        Intrinsics.checkParameterIsNotNull(calendar8, "recordingDate");
        this.c = str12;
        this.e = str13;
        this.f = type2;
        this.f5934g = str3;
        this.f5935h = str14;
        this.f5936i = str15;
        this.f5937j = str16;
        this.f5938k = lessonType2;
        this.f5939l = str17;
        this.f5940m = num;
        this.f5941n = str18;
        this.f5942o = calendar5;
        this.f5943p = calendar6;
        this.f5944q = num2;
        this.r = calendar7;
        this.s = justificationState2;
        this.t = str9;
        this.u = str10;
        this.v = calendar8;
        this.w = str11;
        this.x = bool;
    }

    public static /* synthetic */ Omission copy$default(Omission omission, String str, String str2, Type type, String str3, String str4, String str5, String str6, LessonType lessonType, String str7, Integer num, String str8, Calendar calendar, Calendar calendar2, Integer num2, Calendar calendar3, JustificationState justificationState, String str9, String str10, Calendar calendar4, String str11, Boolean bool, int i2, Object obj) {
        Omission omission2 = omission;
        int i3 = i2;
        return omission.a((i3 & 1) != 0 ? omission.d() : str, (i3 & 2) != 0 ? omission.e() : str2, (i3 & 4) != 0 ? omission2.f : type, (i3 & 8) != 0 ? omission2.f5934g : str3, (i3 & 16) != 0 ? omission2.f5935h : str4, (i3 & 32) != 0 ? omission2.f5936i : str5, (i3 & 64) != 0 ? omission2.f5937j : str6, (i3 & 128) != 0 ? omission2.f5938k : lessonType, (i3 & 256) != 0 ? omission2.f5939l : str7, (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? omission2.f5940m : num, (i3 & 1024) != 0 ? omission2.f5941n : str8, (i3 & 2048) != 0 ? omission2.f5942o : calendar, (i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? omission2.f5943p : calendar2, (i3 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? omission2.f5944q : num2, (i3 & 16384) != 0 ? omission2.r : calendar3, (i3 & 32768) != 0 ? omission2.s : justificationState, (i3 & 65536) != 0 ? omission2.t : str9, (i3 & 131072) != 0 ? omission2.u : str10, (i3 & 262144) != 0 ? omission2.v : calendar4, (i3 & 524288) != 0 ? omission2.w : str11, (i3 & 1048576) != 0 ? omission.q() : bool);
    }

    public final Omission a(String str, String str2, Type type, String str3, String str4, String str5, String str6, LessonType lessonType, String str7, Integer num, String str8, Calendar calendar, Calendar calendar2, Integer num2, Calendar calendar3, JustificationState justificationState, String str9, String str10, Calendar calendar4, String str11, Boolean bool) {
        String str12 = str;
        Intrinsics.checkParameterIsNotNull(str12, "uid");
        Intrinsics.checkParameterIsNotNull(str2, "profileId");
        Intrinsics.checkParameterIsNotNull(type, "type");
        Intrinsics.checkParameterIsNotNull(str4, "subjectName");
        Intrinsics.checkParameterIsNotNull(str5, "subjectCategoryDescription");
        Intrinsics.checkParameterIsNotNull(str6, "subjectCategoryName");
        Intrinsics.checkParameterIsNotNull(lessonType, "mode");
        Intrinsics.checkParameterIsNotNull(str7, "modeDescription");
        Intrinsics.checkParameterIsNotNull(str8, "teacher");
        Intrinsics.checkParameterIsNotNull(calendar, "lessonStartTime");
        Intrinsics.checkParameterIsNotNull(calendar2, "lessonEndTime");
        Intrinsics.checkParameterIsNotNull(calendar3, "creatingTime");
        Intrinsics.checkParameterIsNotNull(justificationState, "justificationState");
        Intrinsics.checkParameterIsNotNull(calendar4, "recordingDate");
        return new Omission(str12, str2, type, str3, str4, str5, str6, lessonType, str7, num, str8, calendar, calendar2, num2, calendar3, justificationState, str9, str10, calendar4, str11, bool);
    }

    public final String a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "minute");
        return " (" + this.f5940m + ' ' + str + ')';
    }

    public final String b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "lessonString");
        if (this.f5944q == null) {
            return UtilsKt.d(this.f5942o) + System.lineSeparator() + UtilsKt.h(this.f5942o) + " - " + UtilsKt.h(this.f5943p);
        }
        return UtilsKt.d(this.f5942o) + System.lineSeparator() + '(' + this.f5944q + str + ") " + UtilsKt.h(this.f5942o) + " - " + UtilsKt.h(this.f5943p);
    }

    public String d() {
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
        if (!(obj instanceof Omission)) {
            return false;
        }
        Omission omission = (Omission) obj;
        return Intrinsics.areEqual((Object) d(), (Object) omission.d()) && Intrinsics.areEqual((Object) e(), (Object) omission.e()) && Intrinsics.areEqual((Object) this.f, (Object) omission.f) && Intrinsics.areEqual((Object) this.f5934g, (Object) omission.f5934g) && Intrinsics.areEqual((Object) this.f5935h, (Object) omission.f5935h) && Intrinsics.areEqual((Object) this.f5936i, (Object) omission.f5936i) && Intrinsics.areEqual((Object) this.f5937j, (Object) omission.f5937j) && Intrinsics.areEqual((Object) this.f5938k, (Object) omission.f5938k) && Intrinsics.areEqual((Object) this.f5939l, (Object) omission.f5939l) && Intrinsics.areEqual((Object) this.f5940m, (Object) omission.f5940m) && Intrinsics.areEqual((Object) this.f5941n, (Object) omission.f5941n) && Intrinsics.areEqual((Object) this.f5942o, (Object) omission.f5942o) && Intrinsics.areEqual((Object) this.f5943p, (Object) omission.f5943p) && Intrinsics.areEqual((Object) this.f5944q, (Object) omission.f5944q) && Intrinsics.areEqual((Object) this.r, (Object) omission.r) && Intrinsics.areEqual((Object) this.s, (Object) omission.s) && Intrinsics.areEqual((Object) this.t, (Object) omission.t) && Intrinsics.areEqual((Object) this.u, (Object) omission.u) && Intrinsics.areEqual((Object) this.v, (Object) omission.v) && Intrinsics.areEqual((Object) this.w, (Object) omission.w) && Intrinsics.areEqual((Object) q(), (Object) omission.q());
    }

    public final Integer f() {
        return this.f5944q;
    }

    public final Calendar g() {
        return this.r;
    }

    public final Integer h() {
        return this.f5940m;
    }

    public int hashCode() {
        String d2 = d();
        int i2 = 0;
        int hashCode = (d2 != null ? d2.hashCode() : 0) * 31;
        String e2 = e();
        int hashCode2 = (hashCode + (e2 != null ? e2.hashCode() : 0)) * 31;
        Type type = this.f;
        int hashCode3 = (hashCode2 + (type != null ? type.hashCode() : 0)) * 31;
        String str = this.f5934g;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5935h;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f5936i;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f5937j;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        LessonType lessonType = this.f5938k;
        int hashCode8 = (hashCode7 + (lessonType != null ? lessonType.hashCode() : 0)) * 31;
        String str5 = this.f5939l;
        int hashCode9 = (hashCode8 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Integer num = this.f5940m;
        int hashCode10 = (hashCode9 + (num != null ? num.hashCode() : 0)) * 31;
        String str6 = this.f5941n;
        int hashCode11 = (hashCode10 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Calendar calendar = this.f5942o;
        int hashCode12 = (hashCode11 + (calendar != null ? calendar.hashCode() : 0)) * 31;
        Calendar calendar2 = this.f5943p;
        int hashCode13 = (hashCode12 + (calendar2 != null ? calendar2.hashCode() : 0)) * 31;
        Integer num2 = this.f5944q;
        int hashCode14 = (hashCode13 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Calendar calendar3 = this.r;
        int hashCode15 = (hashCode14 + (calendar3 != null ? calendar3.hashCode() : 0)) * 31;
        JustificationState justificationState = this.s;
        int hashCode16 = (hashCode15 + (justificationState != null ? justificationState.hashCode() : 0)) * 31;
        String str7 = this.t;
        int hashCode17 = (hashCode16 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.u;
        int hashCode18 = (hashCode17 + (str8 != null ? str8.hashCode() : 0)) * 31;
        Calendar calendar4 = this.v;
        int hashCode19 = (hashCode18 + (calendar4 != null ? calendar4.hashCode() : 0)) * 31;
        String str9 = this.w;
        int hashCode20 = (hashCode19 + (str9 != null ? str9.hashCode() : 0)) * 31;
        Boolean q2 = q();
        if (q2 != null) {
            i2 = q2.hashCode();
        }
        return hashCode20 + i2;
    }

    public final String i() {
        return this.w;
    }

    public final JustificationState j() {
        return this.s;
    }

    public final String k() {
        return this.t;
    }

    public final String l() {
        return this.u;
    }

    public final Calendar m() {
        return this.f5943p;
    }

    public final Calendar n() {
        return this.f5942o;
    }

    public final LessonType o() {
        return this.f5938k;
    }

    public final String p() {
        return this.f5939l;
    }

    public Boolean q() {
        return this.x;
    }

    public final Calendar r() {
        return this.v;
    }

    public final String s() {
        return this.f5936i;
    }

    public final String t() {
        return this.f5937j;
    }

    public String toString() {
        StringBuilder a2 = a.a("Omission(uid=");
        a2.append(d());
        a2.append(", profileId=");
        a2.append(e());
        a2.append(", type=");
        a2.append(this.f);
        a2.append(", typeDescription=");
        a2.append(this.f5934g);
        a2.append(", subjectName=");
        a2.append(this.f5935h);
        a2.append(", subjectCategoryDescription=");
        a2.append(this.f5936i);
        a2.append(", subjectCategoryName=");
        a2.append(this.f5937j);
        a2.append(", mode=");
        a2.append(this.f5938k);
        a2.append(", modeDescription=");
        a2.append(this.f5939l);
        a2.append(", delayTimeMinutes=");
        a2.append(this.f5940m);
        a2.append(", teacher=");
        a2.append(this.f5941n);
        a2.append(", lessonStartTime=");
        a2.append(this.f5942o);
        a2.append(", lessonEndTime=");
        a2.append(this.f5943p);
        a2.append(", classScheduleNumber=");
        a2.append(this.f5944q);
        a2.append(", creatingTime=");
        a2.append(this.r);
        a2.append(", justificationState=");
        a2.append(this.s);
        a2.append(", justificationTypeDescription=");
        a2.append(this.t);
        a2.append(", justificationTypeName=");
        a2.append(this.u);
        a2.append(", recordingDate=");
        a2.append(this.v);
        a2.append(", groupUid=");
        a2.append(this.w);
        a2.append(", readByUser=");
        a2.append(q());
        a2.append(")");
        return a2.toString();
    }

    public final String u() {
        return this.f5935h;
    }

    public final String v() {
        return this.f5941n;
    }

    public final Type w() {
        return this.f;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.c);
        parcel.writeString(this.e);
        parcel.writeString(this.f.name());
        parcel.writeString(this.f5934g);
        parcel.writeString(this.f5935h);
        parcel.writeString(this.f5936i);
        parcel.writeString(this.f5937j);
        parcel.writeString(this.f5938k.name());
        parcel.writeString(this.f5939l);
        Integer num = this.f5940m;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f5941n);
        parcel.writeSerializable(this.f5942o);
        parcel.writeSerializable(this.f5943p);
        Integer num2 = this.f5944q;
        if (num2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeSerializable(this.r);
        parcel.writeString(this.s.name());
        parcel.writeString(this.t);
        parcel.writeString(this.u);
        parcel.writeSerializable(this.v);
        parcel.writeString(this.w);
        Boolean bool = this.x;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
            return;
        }
        parcel.writeInt(0);
    }

    public final String x() {
        return this.f5934g;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Omission(String str, String str2, Type type, String str3, String str4, String str5, String str6, LessonType lessonType, String str7, Integer num, String str8, Calendar calendar, Calendar calendar2, Integer num2, Calendar calendar3, JustificationState justificationState, String str9, String str10, Calendar calendar4, String str11, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, type, str3, str4, str5, str6, lessonType, str7, num, str8, calendar, calendar2, num2, calendar3, justificationState, str9, str10, calendar4, str11, (i2 & 1048576) != 0 ? null : bool);
    }
}
