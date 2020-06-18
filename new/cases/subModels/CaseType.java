package hu.ekreta.ellenorzo.cases.subModels;

import a.b.a.a.a;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001&B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001J\b\u0010\u001a\u001a\u00020\u0004H\u0016J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0004HÖ\u0001J\t\u0010 \u001a\u00020\bHÖ\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\n\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006'"}, d2 = {"Lhu/ekreta/ellenorzo/cases/subModels/CaseType;", "Lhu/ekreta/ellenorzo/cases/subModels/BaseType;", "Landroid/os/Parcelable;", "id", "", "code", "Lhu/ekreta/ellenorzo/cases/subModels/CaseType$Code;", "shortName", "", "name", "description", "(ILhu/ekreta/ellenorzo/cases/subModels/CaseType$Code;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Lhu/ekreta/ellenorzo/cases/subModels/CaseType$Code;", "getDescription", "()Ljava/lang/String;", "getId", "()I", "getName", "getShortName", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Code", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: CaseType.kt */
public final class CaseType extends BaseType implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();

    /* renamed from: h  reason: collision with root package name */
    public final int f5174h;

    /* renamed from: i  reason: collision with root package name */
    public final Code f5175i;

    /* renamed from: j  reason: collision with root package name */
    public final String f5176j;

    /* renamed from: k  reason: collision with root package name */
    public final String f5177k;

    /* renamed from: l  reason: collision with root package name */
    public final String f5178l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0001\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0019B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u001a"}, d2 = {"Lhu/ekreta/ellenorzo/cases/subModels/CaseType$Code;", "", "shortName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getShortName", "()Ljava/lang/String;", "ENROLLMENT_TO_ELEMENTARY_SCHOOL", "ENROLLMENT_TO_PRIMARY_SCHOOL", "ENROLLMENT_TO_PUBLIC_EDUCATION", "ENROLLMENT_WITHOUT_COMPULSORY_SCHOOLING", "SWITCHING_SCHOOL", "QUIT_FROM_PUBLIC_EDUCATION", "QUIT_WITHOUT_COMPULSORY_SCHOOLING", "ANNOUNCE_STUDY_ABROAD", "PRIVATE_STUDENT_REQUEST", "GUEST_STUDENT_REQUEST", "CHANGE_CLASS_REQUEST", "DIRECTOR_PERMISSION_FOR_PARENT_TO_GIVE_VERIFICATION", "ACQUITTAL_FOR_STUDENT_BY_PARENT", "VERIFICATION_BY_PARENT", "VERIFICATION_FOR_COMMUNITY_SERVICE", "PRACTICE_AREA", "CERTIFICATION_DUPLICATE", "PERSONAL_DATA_CHANGE", "Companion", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
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
        public static final Lazy f = null;
        public final String c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005R'\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lhu/ekreta/ellenorzo/cases/subModels/CaseType$Code$Companion;", "", "()V", "map", "", "", "Lhu/ekreta/ellenorzo/cases/subModels/CaseType$Code;", "getMap", "()Ljava/util/Map;", "map$delegate", "Lkotlin/Lazy;", "parse", "shortName", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
        /* compiled from: CaseType.kt */
        public static final class Companion {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ KProperty[] f5179a = null;

            static {
                f5179a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "map", "getMap()Ljava/util/Map;"))};
            }

            public Companion() {
            }

            public final Code a(String str) {
                Intrinsics.checkParameterIsNotNull(str, "shortName");
                Lazy access$getMap$cp = Code.f;
                Companion companion = Code.Companion;
                KProperty kProperty = f5179a[0];
                Code code = (Code) ((Map) access$getMap$cp.getValue()).get(str);
                return code != null ? code : Code.ENROLLMENT_TO_ELEMENTARY_SCHOOL;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new Companion((DefaultConstructorMarker) null);
            f = LazyKt__LazyJVMKt.lazy(CaseType$Code$Companion$map$2.INSTANCE);
        }

        /* access modifiers changed from: public */
        Code(String str) {
            this.c = str;
        }

        public final String a() {
            return this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static class Creator implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new CaseType(parcel.readInt(), (Code) Enum.valueOf(Code.class, parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i2) {
            return new CaseType[i2];
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CaseType(int i2, Code code, String str, String str2, String str3) {
        super(i2, str, str2, str3);
        Intrinsics.checkParameterIsNotNull(code, "code");
        Intrinsics.checkParameterIsNotNull(str, "shortName");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        Intrinsics.checkParameterIsNotNull(str3, "description");
        this.f5174h = i2;
        this.f5175i = code;
        this.f5176j = str;
        this.f5177k = str2;
        this.f5178l = str3;
    }

    public static /* synthetic */ CaseType copy$default(CaseType caseType, int i2, Code code, String str, String str2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = caseType.e();
        }
        if ((i3 & 2) != 0) {
            code = caseType.f5175i;
        }
        Code code2 = code;
        if ((i3 & 4) != 0) {
            str = caseType.g();
        }
        String str4 = str;
        if ((i3 & 8) != 0) {
            str2 = caseType.f();
        }
        String str5 = str2;
        if ((i3 & 16) != 0) {
            str3 = caseType.d();
        }
        return caseType.a(i2, code2, str4, str5, str3);
    }

    public final CaseType a(int i2, Code code, String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(code, "code");
        Intrinsics.checkParameterIsNotNull(str, "shortName");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        Intrinsics.checkParameterIsNotNull(str3, "description");
        return new CaseType(i2, code, str, str2, str3);
    }

    public String d() {
        return this.f5178l;
    }

    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.f5174h;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CaseType) {
                CaseType caseType = (CaseType) obj;
                if (!(e() == caseType.e()) || !Intrinsics.areEqual((Object) this.f5175i, (Object) caseType.f5175i) || !Intrinsics.areEqual((Object) g(), (Object) caseType.g()) || !Intrinsics.areEqual((Object) f(), (Object) caseType.f()) || !Intrinsics.areEqual((Object) d(), (Object) caseType.d())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public String f() {
        return this.f5177k;
    }

    public String g() {
        return this.f5176j;
    }

    public final Code h() {
        return this.f5175i;
    }

    public int hashCode() {
        int e = e() * 31;
        Code code = this.f5175i;
        int i2 = 0;
        int hashCode = (e + (code != null ? code.hashCode() : 0)) * 31;
        String g2 = g();
        int hashCode2 = (hashCode + (g2 != null ? g2.hashCode() : 0)) * 31;
        String f = f();
        int hashCode3 = (hashCode2 + (f != null ? f.hashCode() : 0)) * 31;
        String d2 = d();
        if (d2 != null) {
            i2 = d2.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("CaseType(id=");
        a2.append(e());
        a2.append(", code=");
        a2.append(this.f5175i);
        a2.append(", shortName=");
        a2.append(g());
        a2.append(", name=");
        a2.append(f());
        a2.append(", description=");
        a2.append(d());
        a2.append(")");
        return a2.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeInt(this.f5174h);
        parcel.writeString(this.f5175i.name());
        parcel.writeString(this.f5176j);
        parcel.writeString(this.f5177k);
        parcel.writeString(this.f5178l);
    }
}
