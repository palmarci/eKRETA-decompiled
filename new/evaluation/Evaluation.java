package hu.ekreta.ellenorzo.evaluation;

import a.b.a.a.a;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.util.mapper.ReadableByUserModel;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\bI\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002uvBÿ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010 \u001a\u00020\u0004\u0012\u0006\u0010!\u001a\u00020\u0015¢\u0006\u0002\u0010\"J\t\u0010J\u001a\u00020\u0004HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010Q\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u00104J\u000b\u0010R\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\t\u0010S\u001a\u00020\u0004HÆ\u0003J\t\u0010T\u001a\u00020\u0017HÆ\u0003J\t\u0010U\u001a\u00020\u0004HÆ\u0003J\t\u0010V\u001a\u00020\u0017HÆ\u0003J\t\u0010W\u001a\u00020\u001cHÆ\u0003J\u0010\u0010X\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010:J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010Z\u001a\u00020\u0004HÆ\u0003J\t\u0010[\u001a\u00020\u0015HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010^\u001a\u00020\u0004HÆ\u0003J\t\u0010_\u001a\u00020\nHÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J¦\u0002\u0010c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u0015HÆ\u0001¢\u0006\u0002\u0010dJ\b\u0010e\u001a\u00020\u0015H\u0016J\u0013\u0010f\u001a\u00020\u001e2\b\u0010g\u001a\u0004\u0018\u00010hHÖ\u0003J\b\u0010i\u001a\u0004\u0018\u00010\u0004J\u000e\u0010j\u001a\u00020\u00042\u0006\u0010k\u001a\u00020lJ\b\u0010m\u001a\u0004\u0018\u00010\u0004J\t\u0010n\u001a\u00020\u0015HÖ\u0001J\t\u0010o\u001a\u00020\u0004HÖ\u0001J\u0019\u0010p\u001a\u00020q2\u0006\u0010r\u001a\u00020s2\u0006\u0010t\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u001a\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010 \u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010!\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010&R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010&R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010&R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010&R\u0011\u0010/\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010&R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u00105\u001a\u0004\b3\u00104R\u0011\u00106\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b7\u0010&R\u0014\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010&R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0004¢\u0006\n\n\u0002\u0010;\u001a\u0004\b9\u0010:R\u0011\u0010\u0019\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b<\u0010$R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b=\u0010$R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010&R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010&R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010&R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010&R\u0011\u0010\u0018\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010&R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010&R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010&R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010&R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010&R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010&¨\u0006w"}, d2 = {"Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "Lhu/ekreta/ellenorzo/util/mapper/ReadableByUserModel;", "Landroid/os/Parcelable;", "uid", "", "profileId", "form", "typeDescription", "formTypeDescription", "type", "Lhu/ekreta/ellenorzo/evaluation/Evaluation$Type;", "subjectName", "subjectCategoryDescription", "subjectCategoryName", "theme", "modeName", "modeDescription", "weight", "value", "shortValue", "numberValue", "", "seenByTutelaryUTC", "Ljava/util/Calendar;", "teacher", "recordingDate", "creatingTime", "formType", "Lhu/ekreta/ellenorzo/evaluation/Evaluation$FormType;", "readByUser", "", "groupUid", "educationTypeDisplayName", "educationTypeSortIndex", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/evaluation/Evaluation$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Calendar;Ljava/lang/String;Ljava/util/Calendar;Ljava/util/Calendar;Lhu/ekreta/ellenorzo/evaluation/Evaluation$FormType;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;I)V", "getCreatingTime", "()Ljava/util/Calendar;", "getEducationTypeDisplayName", "()Ljava/lang/String;", "getEducationTypeSortIndex", "()I", "getForm", "getFormType", "()Lhu/ekreta/ellenorzo/evaluation/Evaluation$FormType;", "getFormTypeDescription", "getGroupUid", "getModeDescription", "modeDescriptionIsNotFilled", "getModeDescriptionIsNotFilled", "()Z", "getModeName", "getNumberValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "priority", "getPriority", "getProfileId", "getReadByUser", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRecordingDate", "getSeenByTutelaryUTC", "getShortValue", "getSubjectCategoryDescription", "getSubjectCategoryName", "getSubjectName", "getTeacher", "getTheme", "getType", "()Lhu/ekreta/ellenorzo/evaluation/Evaluation$Type;", "getTypeDescription", "getUid", "getValue", "getWeight", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/evaluation/Evaluation$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Calendar;Ljava/lang/String;Ljava/util/Calendar;Ljava/util/Calendar;Lhu/ekreta/ellenorzo/evaluation/Evaluation$FormType;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;I)Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "describeContents", "equals", "other", "", "getLongText", "getSubjectString", "ctx", "Landroid/content/Context;", "getValueString", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "FormType", "Type", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: Evaluation.kt */
public final class Evaluation implements ReadableByUserModel, Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    public final String A;
    public final String B;
    public final int C;
    public final boolean c;
    public final String e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final String f5551g;

    /* renamed from: h  reason: collision with root package name */
    public final String f5552h;

    /* renamed from: i  reason: collision with root package name */
    public final String f5553i;

    /* renamed from: j  reason: collision with root package name */
    public final Type f5554j;

    /* renamed from: k  reason: collision with root package name */
    public final String f5555k;

    /* renamed from: l  reason: collision with root package name */
    public final String f5556l;

    /* renamed from: m  reason: collision with root package name */
    public final String f5557m;

    /* renamed from: n  reason: collision with root package name */
    public final String f5558n;

    /* renamed from: o  reason: collision with root package name */
    public final String f5559o;

    /* renamed from: p  reason: collision with root package name */
    public final String f5560p;

    /* renamed from: q  reason: collision with root package name */
    public final String f5561q;
    public final String r;
    public final String s;
    public final Integer t;
    public final Calendar u;
    public final String v;
    public final Calendar w;
    public final Calendar x;
    public final FormType y;
    public final Boolean z;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static class Creator implements Parcelable.Creator {
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
            return new Evaluation(readString, readString2, readString3, readString4, readString5, type, readString6, readString7, readString8, readString9, readString10, readString11, readString12, readString13, readString14, valueOf, calendar, readString15, calendar2, calendar3, formType, bool, parcel.readString(), parcel.readString(), parcel.readInt());
        }

        public final Object[] newArray(int i2) {
            return new Evaluation[i2];
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lhu/ekreta/ellenorzo/evaluation/Evaluation$FormType;", "", "typeName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getTypeName", "()Ljava/lang/String;", "PERCENT", "MARK", "ATTITUDE_TEXT", "DILIGENCE_TEXT", "LONG_TEXT", "Companion", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: Evaluation.kt */
    public enum FormType {
        PERCENT("Szazalekos"),
        MARK("Osztalyzat"),
        ATTITUDE_TEXT("MagatartasErtek"),
        DILIGENCE_TEXT("SzorgalomErtek"),
        LONG_TEXT("Szoveges");
        
        public static final Companion Companion = null;
        public static final Lazy f = null;
        public final String c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005R'\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lhu/ekreta/ellenorzo/evaluation/Evaluation$FormType$Companion;", "", "()V", "map", "", "", "Lhu/ekreta/ellenorzo/evaluation/Evaluation$FormType;", "getMap", "()Ljava/util/Map;", "map$delegate", "Lkotlin/Lazy;", "parse", "typeName", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
        /* compiled from: Evaluation.kt */
        public static final class Companion {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ KProperty[] f5562a = null;

            static {
                f5562a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "map", "getMap()Ljava/util/Map;"))};
            }

            public Companion() {
            }

            public final FormType a(String str) {
                Intrinsics.checkParameterIsNotNull(str, "typeName");
                Lazy access$getMap$cp = FormType.f;
                Companion companion = FormType.Companion;
                KProperty kProperty = f5562a[0];
                FormType formType = (FormType) ((Map) access$getMap$cp.getValue()).get(str);
                return formType != null ? formType : FormType.ATTITUDE_TEXT;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new Companion((DefaultConstructorMarker) null);
            f = LazyKt__LazyJVMKt.lazy(Evaluation$FormType$Companion$map$2.INSTANCE);
        }

        /* access modifiers changed from: public */
        FormType(String str) {
            this.c = str;
        }

        public final String a() {
            return this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0001\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B!\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0018"}, d2 = {"Lhu/ekreta/ellenorzo/evaluation/Evaluation$Type;", "", "rawType", "", "quarterly", "", "quarterSortIndex", "", "(Ljava/lang/String;ILjava/lang/String;ZI)V", "getQuarterSortIndex", "()I", "getQuarterly", "()Z", "getRawType", "()Ljava/lang/String;", "MidYear", "FirstQuarter", "SecondQuarter", "ThirdQuarter", "FourthQuarter", "HalfYear", "EndOfYear", "Other", "Companion", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
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

        /* renamed from: h  reason: collision with root package name */
        public static final Lazy f5564h = null;
        public final String c;
        public final boolean e;
        public final int f;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005R)\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00048BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lhu/ekreta/ellenorzo/evaluation/Evaluation$Type$Companion;", "", "()V", "map", "", "", "Lhu/ekreta/ellenorzo/evaluation/Evaluation$Type;", "getMap", "()Ljava/util/Map;", "map$delegate", "Lkotlin/Lazy;", "parse", "rawType", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
        /* compiled from: Evaluation.kt */
        public static final class Companion {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ KProperty[] f5565a = null;

            static {
                f5565a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "map", "getMap()Ljava/util/Map;"))};
            }

            public Companion() {
            }

            public final Type a(String str) {
                Intrinsics.checkParameterIsNotNull(str, "rawType");
                Lazy access$getMap$cp = Type.f5564h;
                Companion companion = Type.Companion;
                KProperty kProperty = f5565a[0];
                Type type = (Type) ((Map) access$getMap$cp.getValue()).get(str);
                return type != null ? type : Type.Other;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new Companion((DefaultConstructorMarker) null);
            f5564h = LazyKt__LazyJVMKt.lazy(Evaluation$Type$Companion$map$2.INSTANCE);
        }

        /* access modifiers changed from: public */
        Type(String str, boolean z, int i2) {
            this.c = str;
            this.e = z;
            this.f = i2;
        }

        public final int a() {
            return this.f;
        }

        public final boolean b() {
            return this.e;
        }

        public final String c() {
            return this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5566a = new int[FormType.values().length];
        public static final /* synthetic */ int[] b = new int[FormType.values().length];

        static {
            f5566a[FormType.PERCENT.ordinal()] = 1;
            f5566a[FormType.MARK.ordinal()] = 2;
            f5566a[FormType.ATTITUDE_TEXT.ordinal()] = 3;
            f5566a[FormType.DILIGENCE_TEXT.ordinal()] = 4;
            f5566a[FormType.LONG_TEXT.ordinal()] = 5;
            b[FormType.LONG_TEXT.ordinal()] = 1;
        }
    }

    public Evaluation(String str, String str2, String str3, String str4, String str5, Type type, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Integer num, Calendar calendar, String str15, Calendar calendar2, Calendar calendar3, FormType formType, Boolean bool, String str16, String str17, int i2) {
        String str18 = str5;
        Type type2 = type;
        String str19 = str15;
        Calendar calendar4 = calendar2;
        Calendar calendar5 = calendar3;
        FormType formType2 = formType;
        String str20 = str17;
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(str2, "profileId");
        Intrinsics.checkParameterIsNotNull(str18, "formTypeDescription");
        Intrinsics.checkParameterIsNotNull(type2, "type");
        Intrinsics.checkParameterIsNotNull(str19, "teacher");
        Intrinsics.checkParameterIsNotNull(calendar4, "recordingDate");
        Intrinsics.checkParameterIsNotNull(calendar5, "creatingTime");
        Intrinsics.checkParameterIsNotNull(formType2, "formType");
        Intrinsics.checkParameterIsNotNull(str20, "educationTypeDisplayName");
        this.e = str;
        this.f = str2;
        this.f5551g = str3;
        this.f5552h = str4;
        this.f5553i = str18;
        this.f5554j = type2;
        this.f5555k = str6;
        this.f5556l = str7;
        this.f5557m = str8;
        this.f5558n = str9;
        this.f5559o = str10;
        this.f5560p = str11;
        this.f5561q = str12;
        this.r = str13;
        this.s = str14;
        this.t = num;
        this.u = calendar;
        this.v = str19;
        this.w = calendar4;
        this.x = calendar5;
        this.y = formType2;
        this.z = bool;
        this.A = str16;
        this.B = str20;
        this.C = i2;
        String str21 = this.f5560p;
        boolean z2 = false;
        this.c = ((str21 == null || str21.length() == 0) || Intrinsics.areEqual((Object) this.f5560p, (Object) "Na")) ? true : z2;
    }

    public static /* synthetic */ Evaluation copy$default(Evaluation evaluation, String str, String str2, String str3, String str4, String str5, Type type, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Integer num, Calendar calendar, String str15, Calendar calendar2, Calendar calendar3, FormType formType, Boolean bool, String str16, String str17, int i2, int i3, Object obj) {
        Evaluation evaluation2 = evaluation;
        int i4 = i3;
        return evaluation.a((i4 & 1) != 0 ? evaluation.d() : str, (i4 & 2) != 0 ? evaluation.e() : str2, (i4 & 4) != 0 ? evaluation2.f5551g : str3, (i4 & 8) != 0 ? evaluation2.f5552h : str4, (i4 & 16) != 0 ? evaluation2.f5553i : str5, (i4 & 32) != 0 ? evaluation2.f5554j : type, (i4 & 64) != 0 ? evaluation2.f5555k : str6, (i4 & 128) != 0 ? evaluation2.f5556l : str7, (i4 & 256) != 0 ? evaluation2.f5557m : str8, (i4 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? evaluation2.f5558n : str9, (i4 & 1024) != 0 ? evaluation2.f5559o : str10, (i4 & 2048) != 0 ? evaluation2.f5560p : str11, (i4 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? evaluation2.f5561q : str12, (i4 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? evaluation2.r : str13, (i4 & 16384) != 0 ? evaluation2.s : str14, (i4 & 32768) != 0 ? evaluation2.t : num, (i4 & 65536) != 0 ? evaluation2.u : calendar, (i4 & 131072) != 0 ? evaluation2.v : str15, (i4 & 262144) != 0 ? evaluation2.w : calendar2, (i4 & 524288) != 0 ? evaluation2.x : calendar3, (i4 & 1048576) != 0 ? evaluation2.y : formType, (i4 & 2097152) != 0 ? evaluation.s() : bool, (i4 & 4194304) != 0 ? evaluation2.A : str16, (i4 & 8388608) != 0 ? evaluation2.B : str17, (i4 & 16777216) != 0 ? evaluation2.C : i2);
    }

    public final String A() {
        return this.f5558n;
    }

    public final Type B() {
        return this.f5554j;
    }

    public final String C() {
        return this.f5552h;
    }

    public final String D() {
        return this.r;
    }

    public final String E() {
        int i2 = WhenMappings.f5566a[this.y.ordinal()];
        if (i2 == 1) {
            return this.r;
        }
        if (i2 == 2) {
            return String.valueOf(this.t);
        }
        if (i2 == 3) {
            return this.r;
        }
        if (i2 == 4) {
            return this.r;
        }
        if (i2 == 5) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String F() {
        return this.f5561q;
    }

    public final Evaluation a(String str, String str2, String str3, String str4, String str5, Type type, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Integer num, Calendar calendar, String str15, Calendar calendar2, Calendar calendar3, FormType formType, Boolean bool, String str16, String str17, int i2) {
        String str18 = str;
        Intrinsics.checkParameterIsNotNull(str18, "uid");
        Intrinsics.checkParameterIsNotNull(str2, "profileId");
        Intrinsics.checkParameterIsNotNull(str5, "formTypeDescription");
        Intrinsics.checkParameterIsNotNull(type, "type");
        Intrinsics.checkParameterIsNotNull(str15, "teacher");
        Intrinsics.checkParameterIsNotNull(calendar2, "recordingDate");
        Intrinsics.checkParameterIsNotNull(calendar3, "creatingTime");
        Intrinsics.checkParameterIsNotNull(formType, "formType");
        Intrinsics.checkParameterIsNotNull(str17, "educationTypeDisplayName");
        return new Evaluation(str18, str2, str3, str4, str5, type, str6, str7, str8, str9, str10, str11, str12, str13, str14, num, calendar, str15, calendar2, calendar3, formType, bool, str16, str17, i2);
    }

    public final String a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "ctx");
        String str = this.f5555k;
        if (str != null) {
            return str;
        }
        String string = context.getString(R.string.not_available);
        Intrinsics.checkExpressionValueIsNotNull(string, "ctx.getString(R.string.not_available)");
        return string;
    }

    public String d() {
        return this.e;
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Evaluation) {
                Evaluation evaluation = (Evaluation) obj;
                if (Intrinsics.areEqual((Object) d(), (Object) evaluation.d()) && Intrinsics.areEqual((Object) e(), (Object) evaluation.e()) && Intrinsics.areEqual((Object) this.f5551g, (Object) evaluation.f5551g) && Intrinsics.areEqual((Object) this.f5552h, (Object) evaluation.f5552h) && Intrinsics.areEqual((Object) this.f5553i, (Object) evaluation.f5553i) && Intrinsics.areEqual((Object) this.f5554j, (Object) evaluation.f5554j) && Intrinsics.areEqual((Object) this.f5555k, (Object) evaluation.f5555k) && Intrinsics.areEqual((Object) this.f5556l, (Object) evaluation.f5556l) && Intrinsics.areEqual((Object) this.f5557m, (Object) evaluation.f5557m) && Intrinsics.areEqual((Object) this.f5558n, (Object) evaluation.f5558n) && Intrinsics.areEqual((Object) this.f5559o, (Object) evaluation.f5559o) && Intrinsics.areEqual((Object) this.f5560p, (Object) evaluation.f5560p) && Intrinsics.areEqual((Object) this.f5561q, (Object) evaluation.f5561q) && Intrinsics.areEqual((Object) this.r, (Object) evaluation.r) && Intrinsics.areEqual((Object) this.s, (Object) evaluation.s) && Intrinsics.areEqual((Object) this.t, (Object) evaluation.t) && Intrinsics.areEqual((Object) this.u, (Object) evaluation.u) && Intrinsics.areEqual((Object) this.v, (Object) evaluation.v) && Intrinsics.areEqual((Object) this.w, (Object) evaluation.w) && Intrinsics.areEqual((Object) this.x, (Object) evaluation.x) && Intrinsics.areEqual((Object) this.y, (Object) evaluation.y) && Intrinsics.areEqual((Object) s(), (Object) evaluation.s()) && Intrinsics.areEqual((Object) this.A, (Object) evaluation.A) && Intrinsics.areEqual((Object) this.B, (Object) evaluation.B)) {
                    if (this.C == evaluation.C) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final Calendar f() {
        return this.x;
    }

    public final String g() {
        return this.B;
    }

    public final int h() {
        return this.C;
    }

    public int hashCode() {
        String d2 = d();
        int i2 = 0;
        int hashCode = (d2 != null ? d2.hashCode() : 0) * 31;
        String e2 = e();
        int hashCode2 = (hashCode + (e2 != null ? e2.hashCode() : 0)) * 31;
        String str = this.f5551g;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5552h;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f5553i;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Type type = this.f5554j;
        int hashCode6 = (hashCode5 + (type != null ? type.hashCode() : 0)) * 31;
        String str4 = this.f5555k;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f5556l;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f5557m;
        int hashCode9 = (hashCode8 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f5558n;
        int hashCode10 = (hashCode9 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f5559o;
        int hashCode11 = (hashCode10 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f5560p;
        int hashCode12 = (hashCode11 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.f5561q;
        int hashCode13 = (hashCode12 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.r;
        int hashCode14 = (hashCode13 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.s;
        int hashCode15 = (hashCode14 + (str12 != null ? str12.hashCode() : 0)) * 31;
        Integer num = this.t;
        int hashCode16 = (hashCode15 + (num != null ? num.hashCode() : 0)) * 31;
        Calendar calendar = this.u;
        int hashCode17 = (hashCode16 + (calendar != null ? calendar.hashCode() : 0)) * 31;
        String str13 = this.v;
        int hashCode18 = (hashCode17 + (str13 != null ? str13.hashCode() : 0)) * 31;
        Calendar calendar2 = this.w;
        int hashCode19 = (hashCode18 + (calendar2 != null ? calendar2.hashCode() : 0)) * 31;
        Calendar calendar3 = this.x;
        int hashCode20 = (hashCode19 + (calendar3 != null ? calendar3.hashCode() : 0)) * 31;
        FormType formType = this.y;
        int hashCode21 = (hashCode20 + (formType != null ? formType.hashCode() : 0)) * 31;
        Boolean s2 = s();
        int hashCode22 = (hashCode21 + (s2 != null ? s2.hashCode() : 0)) * 31;
        String str14 = this.A;
        int hashCode23 = (hashCode22 + (str14 != null ? str14.hashCode() : 0)) * 31;
        String str15 = this.B;
        if (str15 != null) {
            i2 = str15.hashCode();
        }
        return ((hashCode23 + i2) * 31) + this.C;
    }

    public final String i() {
        return this.f5551g;
    }

    public final FormType j() {
        return this.y;
    }

    public final String k() {
        return this.f5553i;
    }

    public final String l() {
        return this.A;
    }

    public final String m() {
        if (WhenMappings.b[this.y.ordinal()] != 1) {
            return null;
        }
        return this.r;
    }

    public final String n() {
        return this.f5560p;
    }

    public final boolean o() {
        return this.c;
    }

    public final String p() {
        return this.f5559o;
    }

    public final Integer q() {
        return this.t;
    }

    public final String r() {
        if (this.f5555k != null) {
            StringBuilder sb = new StringBuilder();
            sb.append('2');
            String str = this.f5555k;
            Locale locale = Locale.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.getDefault()");
            if (str != null) {
                String lowerCase = str.toLowerCase(locale);
                Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                StringBuilder sb2 = new StringBuilder();
                int length = lowerCase.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char charAt = lowerCase.charAt(i2);
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

    public Boolean s() {
        return this.z;
    }

    public final Calendar t() {
        return this.w;
    }

    public String toString() {
        StringBuilder a2 = a.a("Evaluation(uid=");
        a2.append(d());
        a2.append(", profileId=");
        a2.append(e());
        a2.append(", form=");
        a2.append(this.f5551g);
        a2.append(", typeDescription=");
        a2.append(this.f5552h);
        a2.append(", formTypeDescription=");
        a2.append(this.f5553i);
        a2.append(", type=");
        a2.append(this.f5554j);
        a2.append(", subjectName=");
        a2.append(this.f5555k);
        a2.append(", subjectCategoryDescription=");
        a2.append(this.f5556l);
        a2.append(", subjectCategoryName=");
        a2.append(this.f5557m);
        a2.append(", theme=");
        a2.append(this.f5558n);
        a2.append(", modeName=");
        a2.append(this.f5559o);
        a2.append(", modeDescription=");
        a2.append(this.f5560p);
        a2.append(", weight=");
        a2.append(this.f5561q);
        a2.append(", value=");
        a2.append(this.r);
        a2.append(", shortValue=");
        a2.append(this.s);
        a2.append(", numberValue=");
        a2.append(this.t);
        a2.append(", seenByTutelaryUTC=");
        a2.append(this.u);
        a2.append(", teacher=");
        a2.append(this.v);
        a2.append(", recordingDate=");
        a2.append(this.w);
        a2.append(", creatingTime=");
        a2.append(this.x);
        a2.append(", formType=");
        a2.append(this.y);
        a2.append(", readByUser=");
        a2.append(s());
        a2.append(", groupUid=");
        a2.append(this.A);
        a2.append(", educationTypeDisplayName=");
        a2.append(this.B);
        a2.append(", educationTypeSortIndex=");
        return a.a(a2, this.C, ")");
    }

    public final Calendar u() {
        return this.u;
    }

    public final String v() {
        return this.s;
    }

    public final String w() {
        return this.f5556l;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.f5551g);
        parcel.writeString(this.f5552h);
        parcel.writeString(this.f5553i);
        parcel.writeString(this.f5554j.name());
        parcel.writeString(this.f5555k);
        parcel.writeString(this.f5556l);
        parcel.writeString(this.f5557m);
        parcel.writeString(this.f5558n);
        parcel.writeString(this.f5559o);
        parcel.writeString(this.f5560p);
        parcel.writeString(this.f5561q);
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        Integer num = this.t;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeSerializable(this.u);
        parcel.writeString(this.v);
        parcel.writeSerializable(this.w);
        parcel.writeSerializable(this.x);
        parcel.writeString(this.y.name());
        Boolean bool = this.z;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.A);
        parcel.writeString(this.B);
        parcel.writeInt(this.C);
    }

    public final String x() {
        return this.f5557m;
    }

    public final String y() {
        return this.f5555k;
    }

    public final String z() {
        return this.v;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Evaluation(java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, hu.ekreta.ellenorzo.evaluation.Evaluation.Type r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.lang.Integer r45, java.util.Calendar r46, java.lang.String r47, java.util.Calendar r48, java.util.Calendar r49, hu.ekreta.ellenorzo.evaluation.Evaluation.FormType r50, java.lang.Boolean r51, java.lang.String r52, java.lang.String r53, int r54, int r55, kotlin.jvm.internal.DefaultConstructorMarker r56) {
        /*
            r29 = this;
            r0 = r55
            r1 = r0 & 128(0x80, float:1.794E-43)
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r11 = r2
            goto L_0x000b
        L_0x0009:
            r11 = r37
        L_0x000b:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0011
            r12 = r2
            goto L_0x0013
        L_0x0011:
            r12 = r38
        L_0x0013:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0019
            r13 = r2
            goto L_0x001b
        L_0x0019:
            r13 = r39
        L_0x001b:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0021
            r14 = r2
            goto L_0x0023
        L_0x0021:
            r14 = r40
        L_0x0023:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0029
            r15 = r2
            goto L_0x002b
        L_0x0029:
            r15 = r41
        L_0x002b:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0032
            r16 = r2
            goto L_0x0034
        L_0x0032:
            r16 = r42
        L_0x0034:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x003b
            r18 = r2
            goto L_0x003d
        L_0x003b:
            r18 = r44
        L_0x003d:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0045
            r20 = r2
            goto L_0x0047
        L_0x0045:
            r20 = r46
        L_0x0047:
            r1 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x004f
            r25 = r2
            goto L_0x0051
        L_0x004f:
            r25 = r51
        L_0x0051:
            r1 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0059
            r26 = r2
            goto L_0x005b
        L_0x0059:
            r26 = r52
        L_0x005b:
            r3 = r29
            r4 = r30
            r5 = r31
            r6 = r32
            r7 = r33
            r8 = r34
            r9 = r35
            r10 = r36
            r17 = r43
            r19 = r45
            r21 = r47
            r22 = r48
            r23 = r49
            r24 = r50
            r27 = r53
            r28 = r54
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.evaluation.Evaluation.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, hu.ekreta.ellenorzo.evaluation.Evaluation$Type, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.util.Calendar, java.lang.String, java.util.Calendar, java.util.Calendar, hu.ekreta.ellenorzo.evaluation.Evaluation$FormType, java.lang.Boolean, java.lang.String, java.lang.String, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
