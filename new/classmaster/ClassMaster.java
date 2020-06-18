package hu.ekreta.ellenorzo.classmaster;

import a.b.a.a.a;
import hu.ekreta.ellenorzo.util.mapper.ProfileSpecificModel;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001&BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003J_\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006'"}, d2 = {"Lhu/ekreta/ellenorzo/classmaster/ClassMaster;", "Lhu/ekreta/ellenorzo/util/mapper/ProfileSpecificModel;", "profileId", "", "name", "emails", "", "phoneNumbers", "educationTypeDescription", "groupName", "type", "Lhu/ekreta/ellenorzo/classmaster/ClassMaster$ClassMasterType;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/classmaster/ClassMaster$ClassMasterType;)V", "getEducationTypeDescription", "()Ljava/lang/String;", "getEmails", "()Ljava/util/List;", "getGroupName", "getName", "getPhoneNumbers", "getProfileId", "getType", "()Lhu/ekreta/ellenorzo/classmaster/ClassMaster$ClassMasterType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ClassMasterType", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: ClassMaster.kt */
public final class ClassMaster implements ProfileSpecificModel {
    public final String c;
    public final String e;
    public final List<String> f;

    /* renamed from: g  reason: collision with root package name */
    public final List<String> f5264g;

    /* renamed from: h  reason: collision with root package name */
    public final String f5265h;

    /* renamed from: i  reason: collision with root package name */
    public final String f5266i;

    /* renamed from: j  reason: collision with root package name */
    public final ClassMasterType f5267j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lhu/ekreta/ellenorzo/classmaster/ClassMaster$ClassMasterType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "CLASSMASTER", "ASSISTANT", "Companion", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: ClassMaster.kt */
    public enum ClassMasterType {
        CLASSMASTER(1),
        ASSISTANT(2);
        
        public static final Companion Companion = null;
        public static final Lazy f = null;
        public final int c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005R'\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lhu/ekreta/ellenorzo/classmaster/ClassMaster$ClassMasterType$Companion;", "", "()V", "map", "", "", "Lhu/ekreta/ellenorzo/classmaster/ClassMaster$ClassMasterType;", "getMap", "()Ljava/util/Map;", "map$delegate", "Lkotlin/Lazy;", "parse", "value", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
        /* compiled from: ClassMaster.kt */
        public static final class Companion {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ KProperty[] f5268a = null;

            static {
                f5268a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "map", "getMap()Ljava/util/Map;"))};
            }

            public Companion() {
            }

            public final ClassMasterType a(int i2) {
                Lazy access$getMap$cp = ClassMasterType.f;
                Companion companion = ClassMasterType.Companion;
                KProperty kProperty = f5268a[0];
                ClassMasterType classMasterType = (ClassMasterType) ((Map) access$getMap$cp.getValue()).get(Integer.valueOf(i2));
                return classMasterType != null ? classMasterType : ClassMasterType.CLASSMASTER;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new Companion((DefaultConstructorMarker) null);
            f = LazyKt__LazyJVMKt.lazy(ClassMaster$ClassMasterType$Companion$map$2.INSTANCE);
        }

        /* access modifiers changed from: public */
        ClassMasterType(int i2) {
            this.c = i2;
        }

        public final int a() {
            return this.c;
        }
    }

    public ClassMaster(String str, String str2, List<String> list, List<String> list2, String str3, String str4, ClassMasterType classMasterType) {
        Intrinsics.checkParameterIsNotNull(str, "profileId");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        Intrinsics.checkParameterIsNotNull(list, "emails");
        Intrinsics.checkParameterIsNotNull(list2, "phoneNumbers");
        Intrinsics.checkParameterIsNotNull(classMasterType, "type");
        this.c = str;
        this.e = str2;
        this.f = list;
        this.f5264g = list2;
        this.f5265h = str3;
        this.f5266i = str4;
        this.f5267j = classMasterType;
    }

    public static /* synthetic */ ClassMaster copy$default(ClassMaster classMaster, String str, String str2, List<String> list, List<String> list2, String str3, String str4, ClassMasterType classMasterType, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = classMaster.e();
        }
        if ((i2 & 2) != 0) {
            str2 = classMaster.e;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            list = classMaster.f;
        }
        List<String> list3 = list;
        if ((i2 & 8) != 0) {
            list2 = classMaster.f5264g;
        }
        List<String> list4 = list2;
        if ((i2 & 16) != 0) {
            str3 = classMaster.f5265h;
        }
        String str6 = str3;
        if ((i2 & 32) != 0) {
            str4 = classMaster.f5266i;
        }
        String str7 = str4;
        if ((i2 & 64) != 0) {
            classMasterType = classMaster.f5267j;
        }
        return classMaster.a(str, str5, list3, list4, str6, str7, classMasterType);
    }

    public final ClassMaster a(String str, String str2, List<String> list, List<String> list2, String str3, String str4, ClassMasterType classMasterType) {
        Intrinsics.checkParameterIsNotNull(str, "profileId");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        Intrinsics.checkParameterIsNotNull(list, "emails");
        Intrinsics.checkParameterIsNotNull(list2, "phoneNumbers");
        ClassMasterType classMasterType2 = classMasterType;
        Intrinsics.checkParameterIsNotNull(classMasterType2, "type");
        return new ClassMaster(str, str2, list, list2, str3, str4, classMasterType2);
    }

    public final String a() {
        return this.f5265h;
    }

    public final List<String> b() {
        return this.f;
    }

    public final String c() {
        return this.f5266i;
    }

    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassMaster)) {
            return false;
        }
        ClassMaster classMaster = (ClassMaster) obj;
        return Intrinsics.areEqual((Object) e(), (Object) classMaster.e()) && Intrinsics.areEqual((Object) this.e, (Object) classMaster.e) && Intrinsics.areEqual((Object) this.f, (Object) classMaster.f) && Intrinsics.areEqual((Object) this.f5264g, (Object) classMaster.f5264g) && Intrinsics.areEqual((Object) this.f5265h, (Object) classMaster.f5265h) && Intrinsics.areEqual((Object) this.f5266i, (Object) classMaster.f5266i) && Intrinsics.areEqual((Object) this.f5267j, (Object) classMaster.f5267j);
    }

    public final String f() {
        return this.e;
    }

    public final List<String> g() {
        return this.f5264g;
    }

    public final ClassMasterType h() {
        return this.f5267j;
    }

    public int hashCode() {
        String e2 = e();
        int i2 = 0;
        int hashCode = (e2 != null ? e2.hashCode() : 0) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<String> list = this.f;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.f5264g;
        int hashCode4 = (hashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str2 = this.f5265h;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f5266i;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        ClassMasterType classMasterType = this.f5267j;
        if (classMasterType != null) {
            i2 = classMasterType.hashCode();
        }
        return hashCode6 + i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("ClassMaster(profileId=");
        a2.append(e());
        a2.append(", name=");
        a2.append(this.e);
        a2.append(", emails=");
        a2.append(this.f);
        a2.append(", phoneNumbers=");
        a2.append(this.f5264g);
        a2.append(", educationTypeDescription=");
        a2.append(this.f5265h);
        a2.append(", groupName=");
        a2.append(this.f5266i);
        a2.append(", type=");
        a2.append(this.f5267j);
        a2.append(")");
        return a2.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ClassMaster(String str, String str2, List list, List list2, String str3, String str4, ClassMasterType classMasterType, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, list2, str3, str4, (i2 & 64) != 0 ? ClassMasterType.CLASSMASTER : classMasterType);
    }
}
