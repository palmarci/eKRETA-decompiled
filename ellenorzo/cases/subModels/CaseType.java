package p289hu.ekreta.ellenorzo.cases.subModels;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p000a.p020b.p021a.p022a.C0082a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001&B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001J\b\u0010\u001a\u001a\u00020\u0004H\u0016J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0004HÖ\u0001J\t\u0010 \u001a\u00020\bHÖ\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\n\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006'"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/subModels/CaseType;", "Lhu/ekreta/ellenorzo/cases/subModels/BaseType;", "Landroid/os/Parcelable;", "id", "", "code", "Lhu/ekreta/ellenorzo/cases/subModels/CaseType$Code;", "shortName", "", "name", "description", "(ILhu/ekreta/ellenorzo/cases/subModels/CaseType$Code;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Lhu/ekreta/ellenorzo/cases/subModels/CaseType$Code;", "getDescription", "()Ljava/lang/String;", "getId", "()I", "getName", "getShortName", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Code", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.subModels.CaseType */
/* compiled from: CaseType.kt */
public final class CaseType extends BaseType implements Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new Creator();

    /* renamed from: h */
    public final int f11555h;

    /* renamed from: i */
    public final Code f11556i;

    /* renamed from: j */
    public final String f11557j;

    /* renamed from: k */
    public final String f11558k;

    /* renamed from: l */
    public final String f11559l;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0001\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0019B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u001a"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/subModels/CaseType$Code;", "", "shortName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getShortName", "()Ljava/lang/String;", "ENROLLMENT_TO_ELEMENTARY_SCHOOL", "ENROLLMENT_TO_PRIMARY_SCHOOL", "ENROLLMENT_TO_PUBLIC_EDUCATION", "ENROLLMENT_WITHOUT_COMPULSORY_SCHOOLING", "SWITCHING_SCHOOL", "QUIT_FROM_PUBLIC_EDUCATION", "QUIT_WITHOUT_COMPULSORY_SCHOOLING", "ANNOUNCE_STUDY_ABROAD", "PRIVATE_STUDENT_REQUEST", "GUEST_STUDENT_REQUEST", "CHANGE_CLASS_REQUEST", "DIRECTOR_PERMISSION_FOR_PARENT_TO_GIVE_VERIFICATION", "ACQUITTAL_FOR_STUDENT_BY_PARENT", "VERIFICATION_BY_PARENT", "VERIFICATION_FOR_COMMUNITY_SERVICE", "PRACTICE_AREA", "CERTIFICATION_DUPLICATE", "PERSONAL_DATA_CHANGE", "Companion", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.cases.subModels.CaseType$Code */
    /* compiled from: CaseType.kt */
    public enum Code {
        ENROLLMENT_TO_ELEMENTARY_SCHOOL("BÁI"),
        ENROLLMENT_TO_PRIMARY_SCHOOL("BKI"),
        ENROLLMENT_TO_PUBLIC_EDUCATION("BMK"),
        ENROLLMENT_WITHOUT_COMPULSORY_SCHOOLING("BNTTJ"),
        SWITCHING_SCHOOL("ÁIK"),
        QUIT_FROM_PUBLIC_EDUCATION("KIK"),
        QUIT_WITHOUT_COMPULSORY_SCHOOLING("KNTTJ"),
        ANNOUNCE_STUDY_ABROAD("KTIT"),
        PRIVATE_STUDENT_REQUEST("MJIK"),
        GUEST_STUDENT_REQUEST("VJB"),
        CHANGE_CLASS_REQUEST("OTCSK"),
        DIRECTOR_PERMISSION_FOR_PARENT_TO_GIVE_VERIFICATION("IEDM"),
        ACQUITTAL_FOR_STUDENT_BY_PARENT("TFMGK"),
        VERIFICATION_BY_PARENT("TMGI"),
        VERIFICATION_FOR_COMMUNITY_SERVICE("TKST"),
        PRACTICE_AREA("TSMT"),
        CERTIFICATION_DUPLICATE("BTI"),
        PERSONAL_DATA_CHANGE("SZAV");
        
        public static final Companion Companion = null;

        /* renamed from: f */
        public static final Lazy f11561f = null;

        /* renamed from: c */
        public final String f11562c;

        @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005R'\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/subModels/CaseType$Code$Companion;", "", "()V", "map", "", "", "Lhu/ekreta/ellenorzo/cases/subModels/CaseType$Code;", "getMap", "()Ljava/util/Map;", "map$delegate", "Lkotlin/Lazy;", "parse", "shortName", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
        /* renamed from: hu.ekreta.ellenorzo.cases.subModels.CaseType$Code$Companion */
        /* compiled from: CaseType.kt */
        public static final class Companion {

            /* renamed from: a */
            public static final /* synthetic */ KProperty[] f11563a = null;

            static {
                f11563a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "map", "getMap()Ljava/util/Map;"))};
            }

            public Companion() {
            }

            /* renamed from: a */
            public final Code mo11931a(String str) {
                Intrinsics.checkParameterIsNotNull(str, "shortName");
                Lazy access$getMap$cp = Code.f11561f;
                Companion companion = Code.Companion;
                KProperty kProperty = f11563a[0];
                Code code = (Code) ((Map) access$getMap$cp.getValue()).get(str);
                return code != null ? code : Code.ENROLLMENT_TO_ELEMENTARY_SCHOOL;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new Companion(null);
            f11561f = LazyKt__LazyJVMKt.lazy(CaseType$Code$Companion$map$2.INSTANCE);
        }

        /* access modifiers changed from: public */
        Code(String str) {
            this.f11562c = str;
        }

        /* renamed from: a */
        public final String mo11930a() {
            return this.f11562c;
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.cases.subModels.CaseType$Creator */
    public static class Creator implements android.os.Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            CaseType caseType = new CaseType(parcel.readInt(), (Code) Enum.valueOf(Code.class, parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
            return caseType;
        }

        public final Object[] newArray(int i) {
            return new CaseType[i];
        }
    }

    public CaseType(int i, Code code, String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(code, "code");
        Intrinsics.checkParameterIsNotNull(str, "shortName");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        Intrinsics.checkParameterIsNotNull(str3, "description");
        super(i, str, str2, str3);
        this.f11555h = i;
        this.f11556i = code;
        this.f11557j = str;
        this.f11558k = str2;
        this.f11559l = str3;
    }

    public static /* synthetic */ CaseType copy$default(CaseType caseType, int i, Code code, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = caseType.mo11919e();
        }
        if ((i2 & 2) != 0) {
            code = caseType.f11556i;
        }
        Code code2 = code;
        if ((i2 & 4) != 0) {
            str = caseType.mo11922g();
        }
        String str4 = str;
        if ((i2 & 8) != 0) {
            str2 = caseType.mo11921f();
        }
        String str5 = str2;
        if ((i2 & 16) != 0) {
            str3 = caseType.mo11917d();
        }
        return caseType.mo11927a(i, code2, str4, str5, str3);
    }

    /* renamed from: a */
    public final CaseType mo11927a(int i, Code code, String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(code, "code");
        Intrinsics.checkParameterIsNotNull(str, "shortName");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        Intrinsics.checkParameterIsNotNull(str3, "description");
        CaseType caseType = new CaseType(i, code, str, str2, str3);
        return caseType;
    }

    /* renamed from: d */
    public String mo11917d() {
        return this.f11559l;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public int mo11919e() {
        return this.f11555h;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CaseType) {
                CaseType caseType = (CaseType) obj;
                if (!(mo11919e() == caseType.mo11919e()) || !Intrinsics.areEqual((Object) this.f11556i, (Object) caseType.f11556i) || !Intrinsics.areEqual((Object) mo11922g(), (Object) caseType.mo11922g()) || !Intrinsics.areEqual((Object) mo11921f(), (Object) caseType.mo11921f()) || !Intrinsics.areEqual((Object) mo11917d(), (Object) caseType.mo11917d())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public String mo11921f() {
        return this.f11558k;
    }

    /* renamed from: g */
    public String mo11922g() {
        return this.f11557j;
    }

    /* renamed from: h */
    public final Code mo11928h() {
        return this.f11556i;
    }

    public int hashCode() {
        int e = mo11919e() * 31;
        Code code = this.f11556i;
        int i = 0;
        int hashCode = (e + (code != null ? code.hashCode() : 0)) * 31;
        String g = mo11922g();
        int hashCode2 = (hashCode + (g != null ? g.hashCode() : 0)) * 31;
        String f = mo11921f();
        int hashCode3 = (hashCode2 + (f != null ? f.hashCode() : 0)) * 31;
        String d = mo11917d();
        if (d != null) {
            i = d.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("CaseType(id=");
        a.append(mo11919e());
        a.append(", code=");
        a.append(this.f11556i);
        a.append(", shortName=");
        a.append(mo11922g());
        a.append(", name=");
        a.append(mo11921f());
        a.append(", description=");
        a.append(mo11917d());
        a.append(")");
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeInt(this.f11555h);
        parcel.writeString(this.f11556i.name());
        parcel.writeString(this.f11557j);
        parcel.writeString(this.f11558k);
        parcel.writeString(this.f11559l);
    }
}
