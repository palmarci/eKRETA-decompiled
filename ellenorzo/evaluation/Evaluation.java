package p289hu.ekreta.ellenorzo.evaluation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.p349io.ConstantsKt;
import kotlin.reflect.KProperty;
import p000a.p020b.p021a.p022a.C0082a;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.util.mapper.ReadableByUserModel;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\bI\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002uvBÿ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010 \u001a\u00020\u0004\u0012\u0006\u0010!\u001a\u00020\u0015¢\u0006\u0002\u0010\"J\t\u0010J\u001a\u00020\u0004HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010Q\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u00104J\u000b\u0010R\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\t\u0010S\u001a\u00020\u0004HÆ\u0003J\t\u0010T\u001a\u00020\u0017HÆ\u0003J\t\u0010U\u001a\u00020\u0004HÆ\u0003J\t\u0010V\u001a\u00020\u0017HÆ\u0003J\t\u0010W\u001a\u00020\u001cHÆ\u0003J\u0010\u0010X\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010:J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010Z\u001a\u00020\u0004HÆ\u0003J\t\u0010[\u001a\u00020\u0015HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010^\u001a\u00020\u0004HÆ\u0003J\t\u0010_\u001a\u00020\nHÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J¦\u0002\u0010c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u0015HÆ\u0001¢\u0006\u0002\u0010dJ\b\u0010e\u001a\u00020\u0015H\u0016J\u0013\u0010f\u001a\u00020\u001e2\b\u0010g\u001a\u0004\u0018\u00010hHÖ\u0003J\b\u0010i\u001a\u0004\u0018\u00010\u0004J\u000e\u0010j\u001a\u00020\u00042\u0006\u0010k\u001a\u00020lJ\b\u0010m\u001a\u0004\u0018\u00010\u0004J\t\u0010n\u001a\u00020\u0015HÖ\u0001J\t\u0010o\u001a\u00020\u0004HÖ\u0001J\u0019\u0010p\u001a\u00020q2\u0006\u0010r\u001a\u00020s2\u0006\u0010t\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u001a\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010 \u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010!\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010&R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010&R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010&R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010&R\u0011\u0010/\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010&R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u00105\u001a\u0004\b3\u00104R\u0011\u00106\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b7\u0010&R\u0014\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010&R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0004¢\u0006\n\n\u0002\u0010;\u001a\u0004\b9\u0010:R\u0011\u0010\u0019\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b<\u0010$R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b=\u0010$R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010&R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010&R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010&R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010&R\u0011\u0010\u0018\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010&R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010&R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010&R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010&R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010&R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010&¨\u0006w"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "Lhu/ekreta/ellenorzo/util/mapper/ReadableByUserModel;", "Landroid/os/Parcelable;", "uid", "", "profileId", "form", "typeDescription", "formTypeDescription", "type", "Lhu/ekreta/ellenorzo/evaluation/Evaluation$Type;", "subjectName", "subjectCategoryDescription", "subjectCategoryName", "theme", "modeName", "modeDescription", "weight", "value", "shortValue", "numberValue", "", "seenByTutelaryUTC", "Ljava/util/Calendar;", "teacher", "recordingDate", "creatingTime", "formType", "Lhu/ekreta/ellenorzo/evaluation/Evaluation$FormType;", "readByUser", "", "groupUid", "educationTypeDisplayName", "educationTypeSortIndex", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/evaluation/Evaluation$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Calendar;Ljava/lang/String;Ljava/util/Calendar;Ljava/util/Calendar;Lhu/ekreta/ellenorzo/evaluation/Evaluation$FormType;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;I)V", "getCreatingTime", "()Ljava/util/Calendar;", "getEducationTypeDisplayName", "()Ljava/lang/String;", "getEducationTypeSortIndex", "()I", "getForm", "getFormType", "()Lhu/ekreta/ellenorzo/evaluation/Evaluation$FormType;", "getFormTypeDescription", "getGroupUid", "getModeDescription", "modeDescriptionIsNotFilled", "getModeDescriptionIsNotFilled", "()Z", "getModeName", "getNumberValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "priority", "getPriority", "getProfileId", "getReadByUser", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRecordingDate", "getSeenByTutelaryUTC", "getShortValue", "getSubjectCategoryDescription", "getSubjectCategoryName", "getSubjectName", "getTeacher", "getTheme", "getType", "()Lhu/ekreta/ellenorzo/evaluation/Evaluation$Type;", "getTypeDescription", "getUid", "getValue", "getWeight", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/evaluation/Evaluation$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Calendar;Ljava/lang/String;Ljava/util/Calendar;Ljava/util/Calendar;Lhu/ekreta/ellenorzo/evaluation/Evaluation$FormType;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;I)Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "describeContents", "equals", "other", "", "getLongText", "getSubjectString", "ctx", "Landroid/content/Context;", "getValueString", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "FormType", "Type", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.evaluation.Evaluation */
/* compiled from: Evaluation.kt */
public final class Evaluation implements ReadableByUserModel, Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new Creator();

    /* renamed from: A */
    public final String f13171A;

    /* renamed from: B */
    public final String f13172B;

    /* renamed from: C */
    public final int f13173C;

    /* renamed from: c */
    public final boolean f13174c;

    /* renamed from: e */
    public final String f13175e;

    /* renamed from: f */
    public final String f13176f;

    /* renamed from: g */
    public final String f13177g;

    /* renamed from: h */
    public final String f13178h;

    /* renamed from: i */
    public final String f13179i;

    /* renamed from: j */
    public final Type f13180j;

    /* renamed from: k */
    public final String f13181k;

    /* renamed from: l */
    public final String f13182l;

    /* renamed from: m */
    public final String f13183m;

    /* renamed from: n */
    public final String f13184n;

    /* renamed from: o */
    public final String f13185o;

    /* renamed from: p */
    public final String f13186p;

    /* renamed from: q */
    public final String f13187q;

    /* renamed from: r */
    public final String f13188r;

    /* renamed from: s */
    public final String f13189s;

    /* renamed from: t */
    public final Integer f13190t;

    /* renamed from: u */
    public final Calendar f13191u;

    /* renamed from: v */
    public final String f13192v;

    /* renamed from: w */
    public final Calendar f13193w;

    /* renamed from: x */
    public final Calendar f13194x;

    /* renamed from: y */
    public final FormType f13195y;

    /* renamed from: z */
    public final Boolean f13196z;

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.evaluation.Evaluation$Creator */
    public static class Creator implements android.os.Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Boolean bool;
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            Type type = (Type) Enum.valueOf(Type.class, parcel.readString());
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            String readString13 = parcel.readString();
            String readString14 = parcel.readString();
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            Calendar calendar = (Calendar) parcel.readSerializable();
            String readString15 = parcel.readString();
            Calendar calendar2 = (Calendar) parcel.readSerializable();
            Calendar calendar3 = (Calendar) parcel.readSerializable();
            FormType formType = (FormType) Enum.valueOf(FormType.class, parcel.readString());
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool = null;
            }
            Evaluation evaluation = new Evaluation(readString, readString2, readString3, readString4, readString5, type, readString6, readString7, readString8, readString9, readString10, readString11, readString12, readString13, readString14, valueOf, calendar, readString15, calendar2, calendar3, formType, bool, parcel.readString(), parcel.readString(), parcel.readInt());
            return evaluation;
        }

        public final Object[] newArray(int i) {
            return new Evaluation[i];
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/evaluation/Evaluation$FormType;", "", "typeName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getTypeName", "()Ljava/lang/String;", "PERCENT", "MARK", "ATTITUDE_TEXT", "DILIGENCE_TEXT", "LONG_TEXT", "Companion", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.evaluation.Evaluation$FormType */
    /* compiled from: Evaluation.kt */
    public enum FormType {
        PERCENT("Szazalekos"),
        MARK("Osztalyzat"),
        ATTITUDE_TEXT("MagatartasErtek"),
        DILIGENCE_TEXT("SzorgalomErtek"),
        LONG_TEXT("Szoveges");
        
        public static final Companion Companion = null;

        /* renamed from: f */
        public static final Lazy f13198f = null;

        /* renamed from: c */
        public final String f13199c;

        @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005R'\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/evaluation/Evaluation$FormType$Companion;", "", "()V", "map", "", "", "Lhu/ekreta/ellenorzo/evaluation/Evaluation$FormType;", "getMap", "()Ljava/util/Map;", "map$delegate", "Lkotlin/Lazy;", "parse", "typeName", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
        /* renamed from: hu.ekreta.ellenorzo.evaluation.Evaluation$FormType$Companion */
        /* compiled from: Evaluation.kt */
        public static final class Companion {

            /* renamed from: a */
            public static final /* synthetic */ KProperty[] f13200a = null;

            static {
                f13200a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "map", "getMap()Ljava/util/Map;"))};
            }

            public Companion() {
            }

            /* renamed from: a */
            public final FormType mo12622a(String str) {
                Intrinsics.checkParameterIsNotNull(str, "typeName");
                Lazy access$getMap$cp = FormType.f13198f;
                Companion companion = FormType.Companion;
                KProperty kProperty = f13200a[0];
                FormType formType = (FormType) ((Map) access$getMap$cp.getValue()).get(str);
                return formType != null ? formType : FormType.ATTITUDE_TEXT;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new Companion(null);
            f13198f = LazyKt__LazyJVMKt.lazy(Evaluation$FormType$Companion$map$2.INSTANCE);
        }

        /* access modifiers changed from: public */
        FormType(String str) {
            this.f13199c = str;
        }

        /* renamed from: a */
        public final String mo12621a() {
            return this.f13199c;
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0001\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B!\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0018"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/evaluation/Evaluation$Type;", "", "rawType", "", "quarterly", "", "quarterSortIndex", "", "(Ljava/lang/String;ILjava/lang/String;ZI)V", "getQuarterSortIndex", "()I", "getQuarterly", "()Z", "getRawType", "()Ljava/lang/String;", "MidYear", "FirstQuarter", "SecondQuarter", "ThirdQuarter", "FourthQuarter", "HalfYear", "EndOfYear", "Other", "Companion", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.evaluation.Evaluation$Type */
    /* compiled from: Evaluation.kt */
    public enum Type {
        MidYear("evkozi_jegy_ertekeles", false, 0),
        FirstQuarter("I_ne_jegy_ertekeles", true, 4),
        SecondQuarter("II_ne_jegy_ertekeles", true, 3),
        ThirdQuarter("III_ne_jegy_ertekeles", true, 2),
        FourthQuarter("IV_ne_jegy_ertekeles", true, 1),
        HalfYear("felevi_jegy_ertekeles", false, 0),
        EndOfYear("evvegi_jegy_ertekeles", false, 0),
        Other("", false, 0);
        
        public static final Companion Companion = null;

        /* renamed from: h */
        public static final Lazy f13202h = null;

        /* renamed from: c */
        public final String f13203c;

        /* renamed from: e */
        public final boolean f13204e;

        /* renamed from: f */
        public final int f13205f;

        @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005R)\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00048BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/evaluation/Evaluation$Type$Companion;", "", "()V", "map", "", "", "Lhu/ekreta/ellenorzo/evaluation/Evaluation$Type;", "getMap", "()Ljava/util/Map;", "map$delegate", "Lkotlin/Lazy;", "parse", "rawType", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
        /* renamed from: hu.ekreta.ellenorzo.evaluation.Evaluation$Type$Companion */
        /* compiled from: Evaluation.kt */
        public static final class Companion {

            /* renamed from: a */
            public static final /* synthetic */ KProperty[] f13206a = null;

            static {
                f13206a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "map", "getMap()Ljava/util/Map;"))};
            }

            public Companion() {
            }

            /* renamed from: a */
            public final Type mo12626a(String str) {
                Intrinsics.checkParameterIsNotNull(str, "rawType");
                Lazy access$getMap$cp = Type.f13202h;
                Companion companion = Type.Companion;
                KProperty kProperty = f13206a[0];
                Type type = (Type) ((Map) access$getMap$cp.getValue()).get(str);
                return type != null ? type : Type.Other;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new Companion(null);
            f13202h = LazyKt__LazyJVMKt.lazy(Evaluation$Type$Companion$map$2.INSTANCE);
        }

        /* access modifiers changed from: public */
        Type(String str, boolean z, int i) {
            this.f13203c = str;
            this.f13204e = z;
            this.f13205f = i;
        }

        /* renamed from: a */
        public final int mo12623a() {
            return this.f13205f;
        }

        /* renamed from: b */
        public final boolean mo12624b() {
            return this.f13204e;
        }

        /* renamed from: c */
        public final String mo12625c() {
            return this.f13203c;
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.evaluation.Evaluation$WhenMappings */
    public final /* synthetic */ class WhenMappings {

        /* renamed from: a */
        public static final /* synthetic */ int[] f13207a = new int[FormType.values().length];

        /* renamed from: b */
        public static final /* synthetic */ int[] f13208b = new int[FormType.values().length];

        static {
            f13207a[FormType.PERCENT.ordinal()] = 1;
            f13207a[FormType.MARK.ordinal()] = 2;
            f13207a[FormType.ATTITUDE_TEXT.ordinal()] = 3;
            f13207a[FormType.DILIGENCE_TEXT.ordinal()] = 4;
            f13207a[FormType.LONG_TEXT.ordinal()] = 5;
            f13208b[FormType.LONG_TEXT.ordinal()] = 1;
        }
    }

    public Evaluation(String str, String str2, String str3, String str4, String str5, Type type, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Integer num, Calendar calendar, String str15, Calendar calendar2, Calendar calendar3, FormType formType, Boolean bool, String str16, String str17, int i) {
        String str18 = str;
        String str19 = str2;
        String str20 = str5;
        Type type2 = type;
        String str21 = str15;
        Calendar calendar4 = calendar2;
        Calendar calendar5 = calendar3;
        FormType formType2 = formType;
        String str22 = str17;
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(str2, "profileId");
        Intrinsics.checkParameterIsNotNull(str20, "formTypeDescription");
        Intrinsics.checkParameterIsNotNull(type2, "type");
        Intrinsics.checkParameterIsNotNull(str21, "teacher");
        Intrinsics.checkParameterIsNotNull(calendar4, "recordingDate");
        Intrinsics.checkParameterIsNotNull(calendar5, "creatingTime");
        Intrinsics.checkParameterIsNotNull(formType2, "formType");
        Intrinsics.checkParameterIsNotNull(str22, "educationTypeDisplayName");
        this.f13175e = str18;
        this.f13176f = str19;
        this.f13177g = str3;
        this.f13178h = str4;
        this.f13179i = str20;
        this.f13180j = type2;
        this.f13181k = str6;
        this.f13182l = str7;
        this.f13183m = str8;
        this.f13184n = str9;
        this.f13185o = str10;
        this.f13186p = str11;
        this.f13187q = str12;
        this.f13188r = str13;
        this.f13189s = str14;
        this.f13190t = num;
        this.f13191u = calendar;
        this.f13192v = str21;
        this.f13193w = calendar4;
        this.f13194x = calendar5;
        this.f13195y = formType2;
        this.f13196z = bool;
        this.f13171A = str16;
        this.f13172B = str22;
        this.f13173C = i;
        String str23 = this.f13186p;
        boolean z = false;
        if ((str23 == null || str23.length() == 0) || Intrinsics.areEqual((Object) this.f13186p, (Object) "Na")) {
            z = true;
        }
        this.f13174c = z;
    }

    public static /* synthetic */ Evaluation copy$default(Evaluation evaluation, String str, String str2, String str3, String str4, String str5, Type type, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Integer num, Calendar calendar, String str15, Calendar calendar2, Calendar calendar3, FormType formType, Boolean bool, String str16, String str17, int i, int i2, Object obj) {
        Evaluation evaluation2 = evaluation;
        int i3 = i2;
        return evaluation.mo12591a((i3 & 1) != 0 ? evaluation.mo11316d() : str, (i3 & 2) != 0 ? evaluation.mo11318e() : str2, (i3 & 4) != 0 ? evaluation2.f13177g : str3, (i3 & 8) != 0 ? evaluation2.f13178h : str4, (i3 & 16) != 0 ? evaluation2.f13179i : str5, (i3 & 32) != 0 ? evaluation2.f13180j : type, (i3 & 64) != 0 ? evaluation2.f13181k : str6, (i3 & 128) != 0 ? evaluation2.f13182l : str7, (i3 & 256) != 0 ? evaluation2.f13183m : str8, (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? evaluation2.f13184n : str9, (i3 & 1024) != 0 ? evaluation2.f13185o : str10, (i3 & 2048) != 0 ? evaluation2.f13186p : str11, (i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? evaluation2.f13187q : str12, (i3 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? evaluation2.f13188r : str13, (i3 & 16384) != 0 ? evaluation2.f13189s : str14, (i3 & 32768) != 0 ? evaluation2.f13190t : num, (i3 & 65536) != 0 ? evaluation2.f13191u : calendar, (i3 & 131072) != 0 ? evaluation2.f13192v : str15, (i3 & 262144) != 0 ? evaluation2.f13193w : calendar2, (i3 & 524288) != 0 ? evaluation2.f13194x : calendar3, (i3 & 1048576) != 0 ? evaluation2.f13195y : formType, (i3 & 2097152) != 0 ? evaluation.mo12609s() : bool, (i3 & 4194304) != 0 ? evaluation2.f13171A : str16, (i3 & 8388608) != 0 ? evaluation2.f13172B : str17, (i3 & 16777216) != 0 ? evaluation2.f13173C : i);
    }

    /* renamed from: A */
    public final String mo12585A() {
        return this.f13184n;
    }

    /* renamed from: B */
    public final Type mo12586B() {
        return this.f13180j;
    }

    /* renamed from: C */
    public final String mo12587C() {
        return this.f13178h;
    }

    /* renamed from: D */
    public final String mo12588D() {
        return this.f13188r;
    }

    /* renamed from: E */
    public final String mo12589E() {
        int i = WhenMappings.f13207a[this.f13195y.ordinal()];
        if (i == 1) {
            return this.f13188r;
        }
        if (i == 2) {
            return String.valueOf(this.f13190t);
        }
        if (i == 3) {
            return this.f13188r;
        }
        if (i == 4) {
            return this.f13188r;
        }
        if (i == 5) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: F */
    public final String mo12590F() {
        return this.f13187q;
    }

    /* renamed from: a */
    public final Evaluation mo12591a(String str, String str2, String str3, String str4, String str5, Type type, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Integer num, Calendar calendar, String str15, Calendar calendar2, Calendar calendar3, FormType formType, Boolean bool, String str16, String str17, int i) {
        String str18 = str;
        String str19 = str2;
        String str20 = str3;
        String str21 = str4;
        String str22 = str5;
        Type type2 = type;
        String str23 = str6;
        String str24 = str7;
        String str25 = str8;
        String str26 = str9;
        String str27 = str10;
        String str28 = str11;
        String str29 = str12;
        String str30 = str13;
        String str31 = str14;
        Integer num2 = num;
        Calendar calendar4 = calendar;
        String str32 = str15;
        Calendar calendar5 = calendar2;
        Calendar calendar6 = calendar3;
        FormType formType2 = formType;
        Boolean bool2 = bool;
        String str33 = str16;
        String str34 = str17;
        int i2 = i;
        String str35 = str18;
        Intrinsics.checkParameterIsNotNull(str18, "uid");
        Intrinsics.checkParameterIsNotNull(str2, "profileId");
        Intrinsics.checkParameterIsNotNull(str5, "formTypeDescription");
        Intrinsics.checkParameterIsNotNull(type, "type");
        Intrinsics.checkParameterIsNotNull(str15, "teacher");
        Intrinsics.checkParameterIsNotNull(calendar2, "recordingDate");
        Intrinsics.checkParameterIsNotNull(calendar3, "creatingTime");
        Intrinsics.checkParameterIsNotNull(formType, "formType");
        Intrinsics.checkParameterIsNotNull(str17, "educationTypeDisplayName");
        Evaluation evaluation = new Evaluation(str35, str19, str20, str21, str22, type2, str23, str24, str25, str26, str27, str28, str29, str30, str31, num2, calendar4, str32, calendar5, calendar6, formType2, bool2, str33, str34, i2);
        return evaluation;
    }

    /* renamed from: a */
    public final String mo12592a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "ctx");
        String str = this.f13181k;
        if (str != null) {
            return str;
        }
        String string = context.getString(C4014R.string.not_available);
        Intrinsics.checkExpressionValueIsNotNull(string, "ctx.getString(R.string.not_available)");
        return string;
    }

    /* renamed from: d */
    public String mo11316d() {
        return this.f13175e;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String mo11318e() {
        return this.f13176f;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Evaluation) {
                Evaluation evaluation = (Evaluation) obj;
                if (Intrinsics.areEqual((Object) mo11316d(), (Object) evaluation.mo11316d()) && Intrinsics.areEqual((Object) mo11318e(), (Object) evaluation.mo11318e()) && Intrinsics.areEqual((Object) this.f13177g, (Object) evaluation.f13177g) && Intrinsics.areEqual((Object) this.f13178h, (Object) evaluation.f13178h) && Intrinsics.areEqual((Object) this.f13179i, (Object) evaluation.f13179i) && Intrinsics.areEqual((Object) this.f13180j, (Object) evaluation.f13180j) && Intrinsics.areEqual((Object) this.f13181k, (Object) evaluation.f13181k) && Intrinsics.areEqual((Object) this.f13182l, (Object) evaluation.f13182l) && Intrinsics.areEqual((Object) this.f13183m, (Object) evaluation.f13183m) && Intrinsics.areEqual((Object) this.f13184n, (Object) evaluation.f13184n) && Intrinsics.areEqual((Object) this.f13185o, (Object) evaluation.f13185o) && Intrinsics.areEqual((Object) this.f13186p, (Object) evaluation.f13186p) && Intrinsics.areEqual((Object) this.f13187q, (Object) evaluation.f13187q) && Intrinsics.areEqual((Object) this.f13188r, (Object) evaluation.f13188r) && Intrinsics.areEqual((Object) this.f13189s, (Object) evaluation.f13189s) && Intrinsics.areEqual((Object) this.f13190t, (Object) evaluation.f13190t) && Intrinsics.areEqual((Object) this.f13191u, (Object) evaluation.f13191u) && Intrinsics.areEqual((Object) this.f13192v, (Object) evaluation.f13192v) && Intrinsics.areEqual((Object) this.f13193w, (Object) evaluation.f13193w) && Intrinsics.areEqual((Object) this.f13194x, (Object) evaluation.f13194x) && Intrinsics.areEqual((Object) this.f13195y, (Object) evaluation.f13195y) && Intrinsics.areEqual((Object) mo12609s(), (Object) evaluation.mo12609s()) && Intrinsics.areEqual((Object) this.f13171A, (Object) evaluation.f13171A) && Intrinsics.areEqual((Object) this.f13172B, (Object) evaluation.f13172B)) {
                    if (this.f13173C == evaluation.f13173C) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final Calendar mo12595f() {
        return this.f13194x;
    }

    /* renamed from: g */
    public final String mo12596g() {
        return this.f13172B;
    }

    /* renamed from: h */
    public final int mo12597h() {
        return this.f13173C;
    }

    public int hashCode() {
        String d = mo11316d();
        int i = 0;
        int hashCode = (d != null ? d.hashCode() : 0) * 31;
        String e = mo11318e();
        int hashCode2 = (hashCode + (e != null ? e.hashCode() : 0)) * 31;
        String str = this.f13177g;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f13178h;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f13179i;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Type type = this.f13180j;
        int hashCode6 = (hashCode5 + (type != null ? type.hashCode() : 0)) * 31;
        String str4 = this.f13181k;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f13182l;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f13183m;
        int hashCode9 = (hashCode8 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f13184n;
        int hashCode10 = (hashCode9 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f13185o;
        int hashCode11 = (hashCode10 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f13186p;
        int hashCode12 = (hashCode11 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.f13187q;
        int hashCode13 = (hashCode12 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.f13188r;
        int hashCode14 = (hashCode13 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.f13189s;
        int hashCode15 = (hashCode14 + (str12 != null ? str12.hashCode() : 0)) * 31;
        Integer num = this.f13190t;
        int hashCode16 = (hashCode15 + (num != null ? num.hashCode() : 0)) * 31;
        Calendar calendar = this.f13191u;
        int hashCode17 = (hashCode16 + (calendar != null ? calendar.hashCode() : 0)) * 31;
        String str13 = this.f13192v;
        int hashCode18 = (hashCode17 + (str13 != null ? str13.hashCode() : 0)) * 31;
        Calendar calendar2 = this.f13193w;
        int hashCode19 = (hashCode18 + (calendar2 != null ? calendar2.hashCode() : 0)) * 31;
        Calendar calendar3 = this.f13194x;
        int hashCode20 = (hashCode19 + (calendar3 != null ? calendar3.hashCode() : 0)) * 31;
        FormType formType = this.f13195y;
        int hashCode21 = (hashCode20 + (formType != null ? formType.hashCode() : 0)) * 31;
        Boolean s = mo12609s();
        int hashCode22 = (hashCode21 + (s != null ? s.hashCode() : 0)) * 31;
        String str14 = this.f13171A;
        int hashCode23 = (hashCode22 + (str14 != null ? str14.hashCode() : 0)) * 31;
        String str15 = this.f13172B;
        if (str15 != null) {
            i = str15.hashCode();
        }
        return ((hashCode23 + i) * 31) + this.f13173C;
    }

    /* renamed from: i */
    public final String mo12599i() {
        return this.f13177g;
    }

    /* renamed from: j */
    public final FormType mo12600j() {
        return this.f13195y;
    }

    /* renamed from: k */
    public final String mo12601k() {
        return this.f13179i;
    }

    /* renamed from: l */
    public final String mo12602l() {
        return this.f13171A;
    }

    /* renamed from: m */
    public final String mo12603m() {
        if (WhenMappings.f13208b[this.f13195y.ordinal()] != 1) {
            return null;
        }
        return this.f13188r;
    }

    /* renamed from: n */
    public final String mo12604n() {
        return this.f13186p;
    }

    /* renamed from: o */
    public final boolean mo12605o() {
        return this.f13174c;
    }

    /* renamed from: p */
    public final String mo12606p() {
        return this.f13185o;
    }

    /* renamed from: q */
    public final Integer mo12607q() {
        return this.f13190t;
    }

    /* renamed from: r */
    public final String mo12608r() {
        if (this.f13181k != null) {
            StringBuilder sb = new StringBuilder();
            sb.append('2');
            String str = this.f13181k;
            Locale locale = Locale.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.getDefault()");
            if (str != null) {
                String lowerCase = str.toLowerCase(locale);
                Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                StringBuilder sb2 = new StringBuilder();
                int length = lowerCase.length();
                for (int i = 0; i < length; i++) {
                    char charAt = lowerCase.charAt(i);
                    if (Character.isLetterOrDigit(charAt)) {
                        sb2.append(charAt);
                    }
                }
                String sb3 = sb2.toString();
                Intrinsics.checkExpressionValueIsNotNull(sb3, "filterTo(StringBuilder(), predicate).toString()");
                sb.append(sb3);
                String sb4 = sb.toString();
                if (sb4 != null) {
                    return sb4;
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return "9";
    }

    /* renamed from: s */
    public Boolean mo12609s() {
        return this.f13196z;
    }

    /* renamed from: t */
    public final Calendar mo12610t() {
        return this.f13193w;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("Evaluation(uid=");
        a.append(mo11316d());
        a.append(", profileId=");
        a.append(mo11318e());
        a.append(", form=");
        a.append(this.f13177g);
        a.append(", typeDescription=");
        a.append(this.f13178h);
        a.append(", formTypeDescription=");
        a.append(this.f13179i);
        a.append(", type=");
        a.append(this.f13180j);
        a.append(", subjectName=");
        a.append(this.f13181k);
        a.append(", subjectCategoryDescription=");
        a.append(this.f13182l);
        a.append(", subjectCategoryName=");
        a.append(this.f13183m);
        a.append(", theme=");
        a.append(this.f13184n);
        a.append(", modeName=");
        a.append(this.f13185o);
        a.append(", modeDescription=");
        a.append(this.f13186p);
        a.append(", weight=");
        a.append(this.f13187q);
        a.append(", value=");
        a.append(this.f13188r);
        a.append(", shortValue=");
        a.append(this.f13189s);
        a.append(", numberValue=");
        a.append(this.f13190t);
        a.append(", seenByTutelaryUTC=");
        a.append(this.f13191u);
        a.append(", teacher=");
        a.append(this.f13192v);
        a.append(", recordingDate=");
        a.append(this.f13193w);
        a.append(", creatingTime=");
        a.append(this.f13194x);
        a.append(", formType=");
        a.append(this.f13195y);
        a.append(", readByUser=");
        a.append(mo12609s());
        a.append(", groupUid=");
        a.append(this.f13171A);
        a.append(", educationTypeDisplayName=");
        a.append(this.f13172B);
        a.append(", educationTypeSortIndex=");
        return C0082a.m105a(a, this.f13173C, ")");
    }

    /* renamed from: u */
    public final Calendar mo12612u() {
        return this.f13191u;
    }

    /* renamed from: v */
    public final String mo12613v() {
        return this.f13189s;
    }

    /* renamed from: w */
    public final String mo12614w() {
        return this.f13182l;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.f13175e);
        parcel.writeString(this.f13176f);
        parcel.writeString(this.f13177g);
        parcel.writeString(this.f13178h);
        parcel.writeString(this.f13179i);
        parcel.writeString(this.f13180j.name());
        parcel.writeString(this.f13181k);
        parcel.writeString(this.f13182l);
        parcel.writeString(this.f13183m);
        parcel.writeString(this.f13184n);
        parcel.writeString(this.f13185o);
        parcel.writeString(this.f13186p);
        parcel.writeString(this.f13187q);
        parcel.writeString(this.f13188r);
        parcel.writeString(this.f13189s);
        Integer num = this.f13190t;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeSerializable(this.f13191u);
        parcel.writeString(this.f13192v);
        parcel.writeSerializable(this.f13193w);
        parcel.writeSerializable(this.f13194x);
        parcel.writeString(this.f13195y.name());
        Boolean bool = this.f13196z;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f13171A);
        parcel.writeString(this.f13172B);
        parcel.writeInt(this.f13173C);
    }

    /* renamed from: x */
    public final String mo12616x() {
        return this.f13183m;
    }

    /* renamed from: y */
    public final String mo12617y() {
        return this.f13181k;
    }

    /* renamed from: z */
    public final String mo12618z() {
        return this.f13192v;
    }

    public /* synthetic */ Evaluation(String str, String str2, String str3, String str4, String str5, Type type, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Integer num, Calendar calendar, String str15, Calendar calendar2, Calendar calendar3, FormType formType, Boolean bool, String str16, String str17, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        int i3 = i2;
        this(str, str2, str3, str4, str5, type, str6, (i3 & 128) != 0 ? null : str7, (i3 & 256) != 0 ? null : str8, (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : str9, (i3 & 1024) != 0 ? null : str10, (i3 & 2048) != 0 ? null : str11, (i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? null : str12, str13, (i3 & 16384) != 0 ? null : str14, num, (65536 & i3) != 0 ? null : calendar, str15, calendar2, calendar3, formType, (2097152 & i3) != 0 ? null : bool, (i3 & 4194304) != 0 ? null : str16, str17, i);
    }
}
