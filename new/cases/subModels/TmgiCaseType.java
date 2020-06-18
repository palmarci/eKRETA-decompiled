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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001'B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001J\u0015\u0010\u001f\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010!J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\t\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006("}, d2 = {"Lhu/ekreta/ellenorzo/cases/subModels/TmgiCaseType;", "Lhu/ekreta/ellenorzo/cases/subModels/BaseType;", "id", "", "type", "Lhu/ekreta/ellenorzo/cases/subModels/TmgiCaseType$TmgiType;", "shortName", "", "name", "description", "(ILhu/ekreta/ellenorzo/cases/subModels/TmgiCaseType$TmgiType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getId", "()I", "getName", "getShortName", "getType", "()Lhu/ekreta/ellenorzo/cases/subModels/TmgiCaseType$TmgiType;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "updateTypeIdForSuccessfulUpload", "updatedId", "(Ljava/lang/Integer;)Lhu/ekreta/ellenorzo/cases/subModels/TmgiCaseType;", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "TmgiType", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: TmgiCaseType.kt */
public final class TmgiCaseType extends BaseType {
    public static final Parcelable.Creator CREATOR = new Creator();

    /* renamed from: h  reason: collision with root package name */
    public final int f5209h;

    /* renamed from: i  reason: collision with root package name */
    public final TmgiType f5210i;

    /* renamed from: j  reason: collision with root package name */
    public final String f5211j;

    /* renamed from: k  reason: collision with root package name */
    public final String f5212k;

    /* renamed from: l  reason: collision with root package name */
    public final String f5213l;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static class Creator implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new TmgiCaseType(parcel.readInt(), (TmgiType) Enum.valueOf(TmgiType.class, parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i2) {
            return new TmgiCaseType[i2];
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0001\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0014"}, d2 = {"Lhu/ekreta/ellenorzo/cases/subModels/TmgiCaseType$TmgiType;", "", "code", "", "codeToUpload", "", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;)V", "getCode", "()Ljava/lang/String;", "getCodeToUpload", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "MEDICAL_CERTIFICATE", "GUARDIAN_CERTIFICATE", "OFFICIAL_ABSENCE", "CAREER_CHOICE_CERTIFICATE", "FIXED_BY_SCHOOL_POLICY", "SERVICE_PROVIDER_CERTIFICATE", "ESCHEW", "Companion", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: TmgiCaseType.kt */
    public enum TmgiType {
        MEDICAL_CERTIFICATE("ORVOSI", 36),
        GUARDIAN_CERTIFICATE("GONDVISELOI", (int) null),
        OFFICIAL_ABSENCE("HIVATALOS_TAVOLLET", 39),
        CAREER_CHOICE_CERTIFICATE("PALYAVALASZTASI_CELU", (int) null),
        FIXED_BY_SCHOOL_POLICY("HAZIRENDBEN_ROGZITETT_EGYEB", (int) null),
        SERVICE_PROVIDER_CERTIFICATE("SZOLGALTATOI", 40),
        ESCHEW("KIKERO", 41);
        
        public static final Companion Companion = null;

        /* renamed from: g  reason: collision with root package name */
        public static final Lazy f5214g = null;
        public final String c;
        public final Integer e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005R'\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lhu/ekreta/ellenorzo/cases/subModels/TmgiCaseType$TmgiType$Companion;", "", "()V", "map", "", "", "Lhu/ekreta/ellenorzo/cases/subModels/TmgiCaseType$TmgiType;", "getMap", "()Ljava/util/Map;", "map$delegate", "Lkotlin/Lazy;", "parse", "code", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
        /* compiled from: TmgiCaseType.kt */
        public static final class Companion {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ KProperty[] f5215a = null;

            static {
                f5215a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "map", "getMap()Ljava/util/Map;"))};
            }

            public Companion() {
            }

            public final TmgiType a(String str) {
                Intrinsics.checkParameterIsNotNull(str, "code");
                Lazy access$getMap$cp = TmgiType.f5214g;
                Companion companion = TmgiType.Companion;
                KProperty kProperty = f5215a[0];
                TmgiType tmgiType = (TmgiType) ((Map) access$getMap$cp.getValue()).get(str);
                return tmgiType != null ? tmgiType : TmgiType.CAREER_CHOICE_CERTIFICATE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new Companion((DefaultConstructorMarker) null);
            f5214g = LazyKt__LazyJVMKt.lazy(TmgiCaseType$TmgiType$Companion$map$2.INSTANCE);
        }

        /* access modifiers changed from: public */
        TmgiType(String str, Integer num) {
            this.c = str;
            this.e = num;
        }

        public final String a() {
            return this.c;
        }

        public final Integer b() {
            return this.e;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TmgiCaseType(int i2, TmgiType tmgiType, String str, String str2, String str3) {
        super(i2, str, str2, str3);
        Intrinsics.checkParameterIsNotNull(tmgiType, "type");
        Intrinsics.checkParameterIsNotNull(str, "shortName");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        Intrinsics.checkParameterIsNotNull(str3, "description");
        this.f5209h = i2;
        this.f5210i = tmgiType;
        this.f5211j = str;
        this.f5212k = str2;
        this.f5213l = str3;
    }

    public static /* synthetic */ TmgiCaseType copy$default(TmgiCaseType tmgiCaseType, int i2, TmgiType tmgiType, String str, String str2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = tmgiCaseType.e();
        }
        if ((i3 & 2) != 0) {
            tmgiType = tmgiCaseType.f5210i;
        }
        TmgiType tmgiType2 = tmgiType;
        if ((i3 & 4) != 0) {
            str = tmgiCaseType.g();
        }
        String str4 = str;
        if ((i3 & 8) != 0) {
            str2 = tmgiCaseType.f();
        }
        String str5 = str2;
        if ((i3 & 16) != 0) {
            str3 = tmgiCaseType.d();
        }
        return tmgiCaseType.a(i2, tmgiType2, str4, str5, str3);
    }

    public final TmgiCaseType a(int i2, TmgiType tmgiType, String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(tmgiType, "type");
        Intrinsics.checkParameterIsNotNull(str, "shortName");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        Intrinsics.checkParameterIsNotNull(str3, "description");
        return new TmgiCaseType(i2, tmgiType, str, str2, str3);
    }

    public final TmgiCaseType a(Integer num) {
        return copy$default(this, num != null ? num.intValue() : 0, (TmgiType) null, (String) null, (String) null, (String) null, 30, (Object) null);
    }

    public String d() {
        return this.f5213l;
    }

    public int e() {
        return this.f5209h;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TmgiCaseType) {
                TmgiCaseType tmgiCaseType = (TmgiCaseType) obj;
                if (!(e() == tmgiCaseType.e()) || !Intrinsics.areEqual((Object) this.f5210i, (Object) tmgiCaseType.f5210i) || !Intrinsics.areEqual((Object) g(), (Object) tmgiCaseType.g()) || !Intrinsics.areEqual((Object) f(), (Object) tmgiCaseType.f()) || !Intrinsics.areEqual((Object) d(), (Object) tmgiCaseType.d())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public String f() {
        return this.f5212k;
    }

    public String g() {
        return this.f5211j;
    }

    public final TmgiType h() {
        return this.f5210i;
    }

    public int hashCode() {
        int e = e() * 31;
        TmgiType tmgiType = this.f5210i;
        int i2 = 0;
        int hashCode = (e + (tmgiType != null ? tmgiType.hashCode() : 0)) * 31;
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
        StringBuilder a2 = a.a("TmgiCaseType(id=");
        a2.append(e());
        a2.append(", type=");
        a2.append(this.f5210i);
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
        parcel.writeInt(this.f5209h);
        parcel.writeString(this.f5210i.name());
        parcel.writeString(this.f5211j);
        parcel.writeString(this.f5212k);
        parcel.writeString(this.f5213l);
    }
}
