package p289hu.ekreta.ellenorzo.omission;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Calendar;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.p349io.ConstantsKt;
import kotlin.reflect.KProperty;
import p000a.p020b.p021a.p022a.C0082a;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import p289hu.ekreta.ellenorzo.util.mapper.ReadableByUserModel;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b9\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0003ghiB½\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0013\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\u0002\u0010\u001fJ\t\u0010>\u001a\u00020\u0004HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010!J\t\u0010@\u001a\u00020\u0004HÆ\u0003J\t\u0010A\u001a\u00020\u0013HÆ\u0003J\t\u0010B\u001a\u00020\u0013HÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010!J\t\u0010D\u001a\u00020\u0013HÆ\u0003J\t\u0010E\u001a\u00020\u0018HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010H\u001a\u00020\u0013HÆ\u0003J\t\u0010I\u001a\u00020\u0004HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u00103J\t\u0010L\u001a\u00020\u0007HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010N\u001a\u00020\u0004HÆ\u0003J\t\u0010O\u001a\u00020\u0004HÆ\u0003J\t\u0010P\u001a\u00020\u0004HÆ\u0003J\t\u0010Q\u001a\u00020\rHÆ\u0003J\t\u0010R\u001a\u00020\u0004HÆ\u0003Jî\u0001\u0010S\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u00132\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÆ\u0001¢\u0006\u0002\u0010TJ\b\u0010U\u001a\u00020\u0010H\u0016J\u0013\u0010V\u001a\u00020\u001e2\b\u0010W\u001a\u0004\u0018\u00010XHÖ\u0003J\u000e\u0010Y\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020\u0004J\u000e\u0010[\u001a\u00020\u00042\u0006\u0010\\\u001a\u00020\u0004J\u000e\u0010]\u001a\u00020\u00042\u0006\u0010^\u001a\u00020_J\t\u0010`\u001a\u00020\u0010HÖ\u0001J\t\u0010a\u001a\u00020\u0004HÖ\u0001J\u0019\u0010b\u001a\u00020c2\u0006\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020\u0010HÖ\u0001R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0011\u0010\u0016\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b%\u0010!R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010'R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010'R\u0011\u0010\u0014\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b,\u0010$R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b-\u0010$R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u000e\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010'R\u0014\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010'R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0004¢\u0006\n\n\u0002\u00104\u001a\u0004\b2\u00103R\u0011\u0010\u001b\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b5\u0010$R\u0011\u0010\n\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010'R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010'R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010'R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010'R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010'R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010'¨\u0006j"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/omission/Omission;", "Lhu/ekreta/ellenorzo/util/mapper/ReadableByUserModel;", "Landroid/os/Parcelable;", "uid", "", "profileId", "type", "Lhu/ekreta/ellenorzo/omission/Omission$Type;", "typeDescription", "subjectName", "subjectCategoryDescription", "subjectCategoryName", "mode", "Lhu/ekreta/ellenorzo/omission/Omission$LessonType;", "modeDescription", "delayTimeMinutes", "", "teacher", "lessonStartTime", "Ljava/util/Calendar;", "lessonEndTime", "classScheduleNumber", "creatingTime", "justificationState", "Lhu/ekreta/ellenorzo/omission/Omission$JustificationState;", "justificationTypeDescription", "justificationTypeName", "recordingDate", "groupUid", "readByUser", "", "(Ljava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/omission/Omission$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/omission/Omission$LessonType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/lang/Integer;Ljava/util/Calendar;Lhu/ekreta/ellenorzo/omission/Omission$JustificationState;Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/Boolean;)V", "getClassScheduleNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCreatingTime", "()Ljava/util/Calendar;", "getDelayTimeMinutes", "getGroupUid", "()Ljava/lang/String;", "getJustificationState", "()Lhu/ekreta/ellenorzo/omission/Omission$JustificationState;", "getJustificationTypeDescription", "getJustificationTypeName", "getLessonEndTime", "getLessonStartTime", "getMode", "()Lhu/ekreta/ellenorzo/omission/Omission$LessonType;", "getModeDescription", "getProfileId", "getReadByUser", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRecordingDate", "getSubjectCategoryDescription", "getSubjectCategoryName", "getSubjectName", "getTeacher", "getType", "()Lhu/ekreta/ellenorzo/omission/Omission$Type;", "getTypeDescription", "getUid", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/omission/Omission$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/omission/Omission$LessonType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/lang/Integer;Ljava/util/Calendar;Lhu/ekreta/ellenorzo/omission/Omission$JustificationState;Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/Boolean;)Lhu/ekreta/ellenorzo/omission/Omission;", "describeContents", "equals", "other", "", "formattedDelayInMinute", "minute", "formattedNumberOfLesson", "lesson", "getLessonTimeFormatted", "context", "Landroid/content/Context;", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "JustificationState", "LessonType", "Type", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.omission.Omission */
/* compiled from: Omission.kt */
public final class Omission implements ReadableByUserModel, Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new Creator();

    /* renamed from: c */
    public final String f14323c;

    /* renamed from: e */
    public final String f14324e;

    /* renamed from: f */
    public final Type f14325f;

    /* renamed from: g */
    public final String f14326g;

    /* renamed from: h */
    public final String f14327h;

    /* renamed from: i */
    public final String f14328i;

    /* renamed from: j */
    public final String f14329j;

    /* renamed from: k */
    public final LessonType f14330k;

    /* renamed from: l */
    public final String f14331l;

    /* renamed from: m */
    public final Integer f14332m;

    /* renamed from: n */
    public final String f14333n;

    /* renamed from: o */
    public final Calendar f14334o;

    /* renamed from: p */
    public final Calendar f14335p;

    /* renamed from: q */
    public final Integer f14336q;

    /* renamed from: r */
    public final Calendar f14337r;

    /* renamed from: s */
    public final JustificationState f14338s;

    /* renamed from: t */
    public final String f14339t;

    /* renamed from: u */
    public final String f14340u;

    /* renamed from: v */
    public final Calendar f14341v;

    /* renamed from: w */
    public final String f14342w;

    /* renamed from: x */
    public final Boolean f14343x;

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.omission.Omission$Creator */
    public static class Creator implements android.os.Parcelable.Creator {
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
            Omission omission = new Omission(readString, readString2, type, readString3, readString4, readString5, readString6, lessonType, readString7, valueOf, readString8, calendar, calendar2, valueOf2, calendar3, justificationState, readString9, readString10, calendar4, readString11, bool);
            return omission;
        }

        public final Object[] newArray(int i) {
            return new Omission[i];
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/omission/Omission$JustificationState;", "", "nameValue", "", "localizedNameRes", "", "(Ljava/lang/String;ILjava/lang/String;I)V", "getLocalizedNameRes", "()I", "getNameValue", "()Ljava/lang/String;", "None", "UnJustified", "Justified", "BeJustified", "Companion", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.omission.Omission$JustificationState */
    /* compiled from: Omission.kt */
    public enum JustificationState {
        None(r2, C4014R.string.justification_state_none),
        UnJustified("Igazolatlan", C4014R.string.justification_state_unjustified),
        Justified("Igazolt", C4014R.string.justification_state_justified),
        BeJustified("Igazolando", C4014R.string.justification_state_bejustified);
        
        public static final Companion Companion = null;

        /* renamed from: g */
        public static final Lazy f14345g = null;

        /* renamed from: c */
        public final String f14346c;

        /* renamed from: e */
        public final int f14347e;

        @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005R'\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/omission/Omission$JustificationState$Companion;", "", "()V", "map", "", "", "Lhu/ekreta/ellenorzo/omission/Omission$JustificationState;", "getMap", "()Ljava/util/Map;", "map$delegate", "Lkotlin/Lazy;", "parse", "justificationStateName", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
        /* renamed from: hu.ekreta.ellenorzo.omission.Omission$JustificationState$Companion */
        /* compiled from: Omission.kt */
        public static final class Companion {

            /* renamed from: a */
            public static final /* synthetic */ KProperty[] f14348a = null;

            static {
                f14348a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "map", "getMap()Ljava/util/Map;"))};
            }

            public Companion() {
            }

            /* renamed from: a */
            public final JustificationState mo13868a(String str) {
                Intrinsics.checkParameterIsNotNull(str, "justificationStateName");
                Lazy access$getMap$cp = JustificationState.f14345g;
                Companion companion = JustificationState.Companion;
                KProperty kProperty = f14348a[0];
                JustificationState justificationState = (JustificationState) ((Map) access$getMap$cp.getValue()).get(str);
                return justificationState != null ? justificationState : JustificationState.UnJustified;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new Companion(null);
            f14345g = LazyKt__LazyJVMKt.lazy(Omission$JustificationState$Companion$map$2.INSTANCE);
        }

        /* access modifiers changed from: public */
        JustificationState(String str, int i) {
            this.f14346c = str;
            this.f14347e = i;
        }

        /* renamed from: a */
        public final int mo13866a() {
            return this.f14347e;
        }

        /* renamed from: b */
        public final String mo13867b() {
            return this.f14346c;
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/omission/Omission$LessonType;", "", "modeName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getModeName", "()Ljava/lang/String;", "None", "Lesson", "OutsideLesson", "Companion", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.omission.Omission$LessonType */
    /* compiled from: Omission.kt */
    public enum LessonType {
        None(r2),
        Lesson("Tanorai"),
        OutsideLesson("TanoranKivuli");
        
        public static final Companion Companion = null;

        /* renamed from: f */
        public static final Lazy f14350f = null;

        /* renamed from: c */
        public final String f14351c;

        @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005R'\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/omission/Omission$LessonType$Companion;", "", "()V", "map", "", "", "Lhu/ekreta/ellenorzo/omission/Omission$LessonType;", "getMap", "()Ljava/util/Map;", "map$delegate", "Lkotlin/Lazy;", "parse", "lessonMode", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
        /* renamed from: hu.ekreta.ellenorzo.omission.Omission$LessonType$Companion */
        /* compiled from: Omission.kt */
        public static final class Companion {

            /* renamed from: a */
            public static final /* synthetic */ KProperty[] f14352a = null;

            static {
                f14352a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "map", "getMap()Ljava/util/Map;"))};
            }

            public Companion() {
            }

            /* renamed from: a */
            public final LessonType mo13870a(String str) {
                Intrinsics.checkParameterIsNotNull(str, "lessonMode");
                Lazy access$getMap$cp = LessonType.f14350f;
                Companion companion = LessonType.Companion;
                KProperty kProperty = f14352a[0];
                LessonType lessonType = (LessonType) ((Map) access$getMap$cp.getValue()).get(str);
                return lessonType != null ? lessonType : LessonType.Lesson;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new Companion(null);
            f14350f = LazyKt__LazyJVMKt.lazy(Omission$LessonType$Companion$map$2.INSTANCE);
        }

        /* access modifiers changed from: public */
        LessonType(String str) {
            this.f14351c = str;
        }

        /* renamed from: a */
        public final String mo13869a() {
            return this.f14351c;
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/omission/Omission$Type;", "", "typeName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getTypeName", "()Ljava/lang/String;", "Na", "Presence", "Absence", "Lateness", "Companion", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.omission.Omission$Type */
    /* compiled from: Omission.kt */
    public enum Type {
        Na("na"),
        Presence("jelenlet"),
        Absence("hianyzas"),
        Lateness("keses");
        
        public static final Companion Companion = null;

        /* renamed from: f */
        public static final Lazy f14355f = null;

        /* renamed from: c */
        public final String f14356c;

        @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0005R)\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00048BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/omission/Omission$Type$Companion;", "", "()V", "map", "", "", "Lhu/ekreta/ellenorzo/omission/Omission$Type;", "getMap", "()Ljava/util/Map;", "map$delegate", "Lkotlin/Lazy;", "parse", "typeName", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
        /* renamed from: hu.ekreta.ellenorzo.omission.Omission$Type$Companion */
        /* compiled from: Omission.kt */
        public static final class Companion {

            /* renamed from: a */
            public static final /* synthetic */ KProperty[] f14357a = null;

            static {
                f14357a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "map", "getMap()Ljava/util/Map;"))};
            }

            public Companion() {
            }

            /* renamed from: a */
            public final Type mo13872a(String str) {
                Lazy access$getMap$cp = Type.f14355f;
                Companion companion = Type.Companion;
                KProperty kProperty = f14357a[0];
                Type type = (Type) ((Map) access$getMap$cp.getValue()).get(str);
                return type != null ? type : Type.Absence;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new Companion(null);
            f14355f = LazyKt__LazyJVMKt.lazy(Omission$Type$Companion$map$2.INSTANCE);
        }

        /* access modifiers changed from: public */
        Type(String str) {
            this.f14356c = str;
        }

        /* renamed from: a */
        public final String mo13871a() {
            return this.f14356c;
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.omission.Omission$WhenMappings */
    public final /* synthetic */ class WhenMappings {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14358a = new int[LessonType.values().length];

        static {
            f14358a[LessonType.Lesson.ordinal()] = 1;
            f14358a[LessonType.OutsideLesson.ordinal()] = 2;
            f14358a[LessonType.None.ordinal()] = 3;
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
        this.f14323c = str12;
        this.f14324e = str13;
        this.f14325f = type2;
        this.f14326g = str3;
        this.f14327h = str14;
        this.f14328i = str15;
        this.f14329j = str16;
        this.f14330k = lessonType2;
        this.f14331l = str17;
        this.f14332m = num;
        this.f14333n = str18;
        this.f14334o = calendar5;
        this.f14335p = calendar6;
        this.f14336q = num2;
        this.f14337r = calendar7;
        this.f14338s = justificationState2;
        this.f14339t = str9;
        this.f14340u = str10;
        this.f14341v = calendar8;
        this.f14342w = str11;
        this.f14343x = bool;
    }

    public static /* synthetic */ Omission copy$default(Omission omission, String str, String str2, Type type, String str3, String str4, String str5, String str6, LessonType lessonType, String str7, Integer num, String str8, Calendar calendar, Calendar calendar2, Integer num2, Calendar calendar3, JustificationState justificationState, String str9, String str10, Calendar calendar4, String str11, Boolean bool, int i, Object obj) {
        Omission omission2 = omission;
        int i2 = i;
        return omission.mo13836a((i2 & 1) != 0 ? omission.mo11316d() : str, (i2 & 2) != 0 ? omission.mo11318e() : str2, (i2 & 4) != 0 ? omission2.f14325f : type, (i2 & 8) != 0 ? omission2.f14326g : str3, (i2 & 16) != 0 ? omission2.f14327h : str4, (i2 & 32) != 0 ? omission2.f14328i : str5, (i2 & 64) != 0 ? omission2.f14329j : str6, (i2 & 128) != 0 ? omission2.f14330k : lessonType, (i2 & 256) != 0 ? omission2.f14331l : str7, (i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? omission2.f14332m : num, (i2 & 1024) != 0 ? omission2.f14333n : str8, (i2 & 2048) != 0 ? omission2.f14334o : calendar, (i2 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? omission2.f14335p : calendar2, (i2 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? omission2.f14336q : num2, (i2 & 16384) != 0 ? omission2.f14337r : calendar3, (i2 & 32768) != 0 ? omission2.f14338s : justificationState, (i2 & 65536) != 0 ? omission2.f14339t : str9, (i2 & 131072) != 0 ? omission2.f14340u : str10, (i2 & 262144) != 0 ? omission2.f14341v : calendar4, (i2 & 524288) != 0 ? omission2.f14342w : str11, (i2 & 1048576) != 0 ? omission.mo13854q() : bool);
    }

    /* renamed from: a */
    public final Omission mo13836a(String str, String str2, Type type, String str3, String str4, String str5, String str6, LessonType lessonType, String str7, Integer num, String str8, Calendar calendar, Calendar calendar2, Integer num2, Calendar calendar3, JustificationState justificationState, String str9, String str10, Calendar calendar4, String str11, Boolean bool) {
        String str12 = str;
        String str13 = str2;
        Type type2 = type;
        String str14 = str3;
        String str15 = str4;
        String str16 = str5;
        String str17 = str6;
        LessonType lessonType2 = lessonType;
        String str18 = str7;
        Integer num3 = num;
        String str19 = str8;
        Calendar calendar5 = calendar;
        Calendar calendar6 = calendar2;
        Integer num4 = num2;
        Calendar calendar7 = calendar3;
        JustificationState justificationState2 = justificationState;
        String str20 = str9;
        String str21 = str10;
        Calendar calendar8 = calendar4;
        String str22 = str11;
        Boolean bool2 = bool;
        String str23 = str12;
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
        Omission omission = new Omission(str23, str13, type2, str14, str15, str16, str17, lessonType2, str18, num3, str19, calendar5, calendar6, num4, calendar7, justificationState2, str20, str21, calendar8, str22, bool2);
        return omission;
    }

    /* renamed from: a */
    public final String mo13838a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "minute");
        StringBuilder sb = new StringBuilder();
        sb.append(" (");
        sb.append(this.f14332m);
        sb.append(' ');
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: b */
    public final String mo13839b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "lesson");
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(this.f14336q);
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: d */
    public String mo11316d() {
        return this.f14323c;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String mo11318e() {
        return this.f14324e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e4, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) mo13854q(), (java.lang.Object) r3.mo13854q()) != false) goto L_0x00e9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x00e9
            boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.omission.Omission
            if (r0 == 0) goto L_0x00e7
            hu.ekreta.ellenorzo.omission.Omission r3 = (p289hu.ekreta.ellenorzo.omission.Omission) r3
            java.lang.String r0 = r2.mo11316d()
            java.lang.String r1 = r3.mo11316d()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00e7
            java.lang.String r0 = r2.mo11318e()
            java.lang.String r1 = r3.mo11318e()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00e7
            hu.ekreta.ellenorzo.omission.Omission$Type r0 = r2.f14325f
            hu.ekreta.ellenorzo.omission.Omission$Type r1 = r3.f14325f
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00e7
            java.lang.String r0 = r2.f14326g
            java.lang.String r1 = r3.f14326g
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00e7
            java.lang.String r0 = r2.f14327h
            java.lang.String r1 = r3.f14327h
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00e7
            java.lang.String r0 = r2.f14328i
            java.lang.String r1 = r3.f14328i
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00e7
            java.lang.String r0 = r2.f14329j
            java.lang.String r1 = r3.f14329j
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00e7
            hu.ekreta.ellenorzo.omission.Omission$LessonType r0 = r2.f14330k
            hu.ekreta.ellenorzo.omission.Omission$LessonType r1 = r3.f14330k
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00e7
            java.lang.String r0 = r2.f14331l
            java.lang.String r1 = r3.f14331l
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00e7
            java.lang.Integer r0 = r2.f14332m
            java.lang.Integer r1 = r3.f14332m
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00e7
            java.lang.String r0 = r2.f14333n
            java.lang.String r1 = r3.f14333n
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00e7
            java.util.Calendar r0 = r2.f14334o
            java.util.Calendar r1 = r3.f14334o
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00e7
            java.util.Calendar r0 = r2.f14335p
            java.util.Calendar r1 = r3.f14335p
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00e7
            java.lang.Integer r0 = r2.f14336q
            java.lang.Integer r1 = r3.f14336q
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00e7
            java.util.Calendar r0 = r2.f14337r
            java.util.Calendar r1 = r3.f14337r
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00e7
            hu.ekreta.ellenorzo.omission.Omission$JustificationState r0 = r2.f14338s
            hu.ekreta.ellenorzo.omission.Omission$JustificationState r1 = r3.f14338s
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00e7
            java.lang.String r0 = r2.f14339t
            java.lang.String r1 = r3.f14339t
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00e7
            java.lang.String r0 = r2.f14340u
            java.lang.String r1 = r3.f14340u
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00e7
            java.util.Calendar r0 = r2.f14341v
            java.util.Calendar r1 = r3.f14341v
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00e7
            java.lang.String r0 = r2.f14342w
            java.lang.String r1 = r3.f14342w
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00e7
            java.lang.Boolean r0 = r2.mo13854q()
            java.lang.Boolean r3 = r3.mo13854q()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x00e7
            goto L_0x00e9
        L_0x00e7:
            r3 = 0
            return r3
        L_0x00e9:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.omission.Omission.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final Integer mo13842f() {
        return this.f14336q;
    }

    /* renamed from: g */
    public final Calendar mo13843g() {
        return this.f14337r;
    }

    /* renamed from: h */
    public final Integer mo13844h() {
        return this.f14332m;
    }

    public int hashCode() {
        String d = mo11316d();
        int i = 0;
        int hashCode = (d != null ? d.hashCode() : 0) * 31;
        String e = mo11318e();
        int hashCode2 = (hashCode + (e != null ? e.hashCode() : 0)) * 31;
        Type type = this.f14325f;
        int hashCode3 = (hashCode2 + (type != null ? type.hashCode() : 0)) * 31;
        String str = this.f14326g;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f14327h;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f14328i;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f14329j;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        LessonType lessonType = this.f14330k;
        int hashCode8 = (hashCode7 + (lessonType != null ? lessonType.hashCode() : 0)) * 31;
        String str5 = this.f14331l;
        int hashCode9 = (hashCode8 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Integer num = this.f14332m;
        int hashCode10 = (hashCode9 + (num != null ? num.hashCode() : 0)) * 31;
        String str6 = this.f14333n;
        int hashCode11 = (hashCode10 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Calendar calendar = this.f14334o;
        int hashCode12 = (hashCode11 + (calendar != null ? calendar.hashCode() : 0)) * 31;
        Calendar calendar2 = this.f14335p;
        int hashCode13 = (hashCode12 + (calendar2 != null ? calendar2.hashCode() : 0)) * 31;
        Integer num2 = this.f14336q;
        int hashCode14 = (hashCode13 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Calendar calendar3 = this.f14337r;
        int hashCode15 = (hashCode14 + (calendar3 != null ? calendar3.hashCode() : 0)) * 31;
        JustificationState justificationState = this.f14338s;
        int hashCode16 = (hashCode15 + (justificationState != null ? justificationState.hashCode() : 0)) * 31;
        String str7 = this.f14339t;
        int hashCode17 = (hashCode16 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f14340u;
        int hashCode18 = (hashCode17 + (str8 != null ? str8.hashCode() : 0)) * 31;
        Calendar calendar4 = this.f14341v;
        int hashCode19 = (hashCode18 + (calendar4 != null ? calendar4.hashCode() : 0)) * 31;
        String str9 = this.f14342w;
        int hashCode20 = (hashCode19 + (str9 != null ? str9.hashCode() : 0)) * 31;
        Boolean q = mo13854q();
        if (q != null) {
            i = q.hashCode();
        }
        return hashCode20 + i;
    }

    /* renamed from: i */
    public final String mo13846i() {
        return this.f14342w;
    }

    /* renamed from: j */
    public final JustificationState mo13847j() {
        return this.f14338s;
    }

    /* renamed from: k */
    public final String mo13848k() {
        return this.f14339t;
    }

    /* renamed from: l */
    public final String mo13849l() {
        return this.f14340u;
    }

    /* renamed from: m */
    public final Calendar mo13850m() {
        return this.f14335p;
    }

    /* renamed from: n */
    public final Calendar mo13851n() {
        return this.f14334o;
    }

    /* renamed from: o */
    public final LessonType mo13852o() {
        return this.f14330k;
    }

    /* renamed from: p */
    public final String mo13853p() {
        return this.f14331l;
    }

    /* renamed from: q */
    public Boolean mo13854q() {
        return this.f14343x;
    }

    /* renamed from: r */
    public final Calendar mo13855r() {
        return this.f14341v;
    }

    /* renamed from: s */
    public final String mo13856s() {
        return this.f14328i;
    }

    /* renamed from: t */
    public final String mo13857t() {
        return this.f14329j;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("Omission(uid=");
        a.append(mo11316d());
        a.append(", profileId=");
        a.append(mo11318e());
        a.append(", type=");
        a.append(this.f14325f);
        a.append(", typeDescription=");
        a.append(this.f14326g);
        a.append(", subjectName=");
        a.append(this.f14327h);
        a.append(", subjectCategoryDescription=");
        a.append(this.f14328i);
        a.append(", subjectCategoryName=");
        a.append(this.f14329j);
        a.append(", mode=");
        a.append(this.f14330k);
        a.append(", modeDescription=");
        a.append(this.f14331l);
        a.append(", delayTimeMinutes=");
        a.append(this.f14332m);
        a.append(", teacher=");
        a.append(this.f14333n);
        a.append(", lessonStartTime=");
        a.append(this.f14334o);
        a.append(", lessonEndTime=");
        a.append(this.f14335p);
        a.append(", classScheduleNumber=");
        a.append(this.f14336q);
        a.append(", creatingTime=");
        a.append(this.f14337r);
        a.append(", justificationState=");
        a.append(this.f14338s);
        a.append(", justificationTypeDescription=");
        a.append(this.f14339t);
        a.append(", justificationTypeName=");
        a.append(this.f14340u);
        a.append(", recordingDate=");
        a.append(this.f14341v);
        a.append(", groupUid=");
        a.append(this.f14342w);
        a.append(", readByUser=");
        a.append(mo13854q());
        a.append(")");
        return a.toString();
    }

    /* renamed from: u */
    public final String mo13859u() {
        return this.f14327h;
    }

    /* renamed from: v */
    public final String mo13860v() {
        return this.f14333n;
    }

    /* renamed from: w */
    public final Type mo13861w() {
        return this.f14325f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.f14323c);
        parcel.writeString(this.f14324e);
        parcel.writeString(this.f14325f.name());
        parcel.writeString(this.f14326g);
        parcel.writeString(this.f14327h);
        parcel.writeString(this.f14328i);
        parcel.writeString(this.f14329j);
        parcel.writeString(this.f14330k.name());
        parcel.writeString(this.f14331l);
        Integer num = this.f14332m;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f14333n);
        parcel.writeSerializable(this.f14334o);
        parcel.writeSerializable(this.f14335p);
        Integer num2 = this.f14336q;
        if (num2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeSerializable(this.f14337r);
        parcel.writeString(this.f14338s.name());
        parcel.writeString(this.f14339t);
        parcel.writeString(this.f14340u);
        parcel.writeSerializable(this.f14341v);
        parcel.writeString(this.f14342w);
        Boolean bool = this.f14343x;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
            return;
        }
        parcel.writeInt(0);
    }

    /* renamed from: x */
    public final String mo13863x() {
        return this.f14326g;
    }

    public /* synthetic */ Omission(String str, String str2, Type type, String str3, String str4, String str5, String str6, LessonType lessonType, String str7, Integer num, String str8, Calendar calendar, Calendar calendar2, Integer num2, Calendar calendar3, JustificationState justificationState, String str9, String str10, Calendar calendar4, String str11, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, type, str3, str4, str5, str6, lessonType, str7, num, str8, calendar, calendar2, num2, calendar3, justificationState, str9, str10, calendar4, str11, (i & 1048576) != 0 ? null : bool);
    }

    /* renamed from: a */
    public final String mo13837a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        int i = WhenMappings.f14358a[this.f14330k.ordinal()];
        String str = "context.getString(R.string.lesson)";
        if (i == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(UtilsKt.m14841d(this.f14334o));
            sb.append(System.lineSeparator());
            String string = context.getString(C4014R.string.lesson);
            Intrinsics.checkExpressionValueIsNotNull(string, str);
            sb.append(mo13839b(string));
            return sb.toString();
        } else if (i == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(UtilsKt.m14828a(this.f14334o));
            sb2.append(System.lineSeparator());
            String string2 = context.getString(C4014R.string.lesson);
            Intrinsics.checkExpressionValueIsNotNull(string2, str);
            sb2.append(mo13839b(string2));
            sb2.append(' ');
            sb2.append(UtilsKt.m14844g(this.f14334o));
            sb2.append(" - ");
            sb2.append(UtilsKt.m14844g(this.f14335p));
            return sb2.toString();
        } else if (i == 3) {
            return "";
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
