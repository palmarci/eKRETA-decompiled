package p289hu.ekreta.ellenorzo.classmaster;

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
import p000a.p020b.p021a.p022a.C0082a;
import p289hu.ekreta.ellenorzo.util.mapper.ProfileSpecificModel;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001&BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003J_\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006'"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/classmaster/ClassMaster;", "Lhu/ekreta/ellenorzo/util/mapper/ProfileSpecificModel;", "profileId", "", "name", "emails", "", "phoneNumbers", "educationTypeDescription", "groupName", "type", "Lhu/ekreta/ellenorzo/classmaster/ClassMaster$ClassMasterType;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/classmaster/ClassMaster$ClassMasterType;)V", "getEducationTypeDescription", "()Ljava/lang/String;", "getEmails", "()Ljava/util/List;", "getGroupName", "getName", "getPhoneNumbers", "getProfileId", "getType", "()Lhu/ekreta/ellenorzo/classmaster/ClassMaster$ClassMasterType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ClassMasterType", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.classmaster.ClassMaster */
/* compiled from: ClassMaster.kt */
public final class ClassMaster implements ProfileSpecificModel {

    /* renamed from: c */
    public final String f11787c;

    /* renamed from: e */
    public final String f11788e;

    /* renamed from: f */
    public final List<String> f11789f;

    /* renamed from: g */
    public final List<String> f11790g;

    /* renamed from: h */
    public final String f11791h;

    /* renamed from: i */
    public final String f11792i;

    /* renamed from: j */
    public final ClassMasterType f11793j;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/classmaster/ClassMaster$ClassMasterType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "CLASSMASTER", "ASSISTANT", "Companion", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.classmaster.ClassMaster$ClassMasterType */
    /* compiled from: ClassMaster.kt */
    public enum ClassMasterType {
        CLASSMASTER(1),
        ASSISTANT(2);
        
        public static final Companion Companion = null;

        /* renamed from: f */
        public static final Lazy f11795f = null;

        /* renamed from: c */
        public final int f11796c;

        @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005R'\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/classmaster/ClassMaster$ClassMasterType$Companion;", "", "()V", "map", "", "", "Lhu/ekreta/ellenorzo/classmaster/ClassMaster$ClassMasterType;", "getMap", "()Ljava/util/Map;", "map$delegate", "Lkotlin/Lazy;", "parse", "value", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
        /* renamed from: hu.ekreta.ellenorzo.classmaster.ClassMaster$ClassMasterType$Companion */
        /* compiled from: ClassMaster.kt */
        public static final class Companion {

            /* renamed from: a */
            public static final /* synthetic */ KProperty[] f11797a = null;

            static {
                f11797a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "map", "getMap()Ljava/util/Map;"))};
            }

            public Companion() {
            }

            /* renamed from: a */
            public final ClassMasterType mo12228a(int i) {
                Lazy access$getMap$cp = ClassMasterType.f11795f;
                Companion companion = ClassMasterType.Companion;
                KProperty kProperty = f11797a[0];
                ClassMasterType classMasterType = (ClassMasterType) ((Map) access$getMap$cp.getValue()).get(Integer.valueOf(i));
                return classMasterType != null ? classMasterType : ClassMasterType.CLASSMASTER;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new Companion(null);
            f11795f = LazyKt__LazyJVMKt.lazy(ClassMaster$ClassMasterType$Companion$map$2.INSTANCE);
        }

        /* access modifiers changed from: public */
        ClassMasterType(int i) {
            this.f11796c = i;
        }

        /* renamed from: a */
        public final int mo12227a() {
            return this.f11796c;
        }
    }

    public ClassMaster(String str, String str2, List<String> list, List<String> list2, String str3, String str4, ClassMasterType classMasterType) {
        Intrinsics.checkParameterIsNotNull(str, "profileId");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        Intrinsics.checkParameterIsNotNull(list, "emails");
        Intrinsics.checkParameterIsNotNull(list2, "phoneNumbers");
        Intrinsics.checkParameterIsNotNull(classMasterType, "type");
        this.f11787c = str;
        this.f11788e = str2;
        this.f11789f = list;
        this.f11790g = list2;
        this.f11791h = str3;
        this.f11792i = str4;
        this.f11793j = classMasterType;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.String>, for r8v0, types: [java.util.List] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.String>, for r9v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ p289hu.ekreta.ellenorzo.classmaster.ClassMaster copy$default(p289hu.ekreta.ellenorzo.classmaster.ClassMaster r5, java.lang.String r6, java.lang.String r7, java.util.List<java.lang.String> r8, java.util.List<java.lang.String> r9, java.lang.String r10, java.lang.String r11, p289hu.ekreta.ellenorzo.classmaster.ClassMaster.ClassMasterType r12, int r13, java.lang.Object r14) {
        /*
            r14 = r13 & 1
            if (r14 == 0) goto L_0x0008
            java.lang.String r6 = r5.mo11318e()
        L_0x0008:
            r14 = r13 & 2
            if (r14 == 0) goto L_0x000e
            java.lang.String r7 = r5.f11788e
        L_0x000e:
            r14 = r7
            r7 = r13 & 4
            if (r7 == 0) goto L_0x0015
            java.util.List<java.lang.String> r8 = r5.f11789f
        L_0x0015:
            r0 = r8
            r7 = r13 & 8
            if (r7 == 0) goto L_0x001c
            java.util.List<java.lang.String> r9 = r5.f11790g
        L_0x001c:
            r1 = r9
            r7 = r13 & 16
            if (r7 == 0) goto L_0x0023
            java.lang.String r10 = r5.f11791h
        L_0x0023:
            r2 = r10
            r7 = r13 & 32
            if (r7 == 0) goto L_0x002a
            java.lang.String r11 = r5.f11792i
        L_0x002a:
            r3 = r11
            r7 = r13 & 64
            if (r7 == 0) goto L_0x0031
            hu.ekreta.ellenorzo.classmaster.ClassMaster$ClassMasterType r12 = r5.f11793j
        L_0x0031:
            r4 = r12
            r7 = r5
            r8 = r6
            r9 = r14
            r10 = r0
            r11 = r1
            r12 = r2
            r13 = r3
            r14 = r4
            hu.ekreta.ellenorzo.classmaster.ClassMaster r5 = r7.mo12217a(r8, r9, r10, r11, r12, r13, r14)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.classmaster.ClassMaster.copy$default(hu.ekreta.ellenorzo.classmaster.ClassMaster, java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.String, java.lang.String, hu.ekreta.ellenorzo.classmaster.ClassMaster$ClassMasterType, int, java.lang.Object):hu.ekreta.ellenorzo.classmaster.ClassMaster");
    }

    /* renamed from: a */
    public final ClassMaster mo12217a(String str, String str2, List<String> list, List<String> list2, String str3, String str4, ClassMasterType classMasterType) {
        String str5 = str;
        Intrinsics.checkParameterIsNotNull(str, "profileId");
        String str6 = str2;
        Intrinsics.checkParameterIsNotNull(str2, "name");
        List<String> list3 = list;
        Intrinsics.checkParameterIsNotNull(list, "emails");
        List<String> list4 = list2;
        Intrinsics.checkParameterIsNotNull(list2, "phoneNumbers");
        ClassMasterType classMasterType2 = classMasterType;
        Intrinsics.checkParameterIsNotNull(classMasterType2, "type");
        ClassMaster classMaster = new ClassMaster(str5, str6, list3, list4, str3, str4, classMasterType2);
        return classMaster;
    }

    /* renamed from: a */
    public final String mo12218a() {
        return this.f11791h;
    }

    /* renamed from: b */
    public final List<String> mo12219b() {
        return this.f11789f;
    }

    /* renamed from: c */
    public final String mo12220c() {
        return this.f11792i;
    }

    /* renamed from: e */
    public String mo11318e() {
        return this.f11787c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f11793j, (java.lang.Object) r3.f11793j) != false) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0055
            boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.classmaster.ClassMaster
            if (r0 == 0) goto L_0x0053
            hu.ekreta.ellenorzo.classmaster.ClassMaster r3 = (p289hu.ekreta.ellenorzo.classmaster.ClassMaster) r3
            java.lang.String r0 = r2.mo11318e()
            java.lang.String r1 = r3.mo11318e()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0053
            java.lang.String r0 = r2.f11788e
            java.lang.String r1 = r3.f11788e
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0053
            java.util.List<java.lang.String> r0 = r2.f11789f
            java.util.List<java.lang.String> r1 = r3.f11789f
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0053
            java.util.List<java.lang.String> r0 = r2.f11790g
            java.util.List<java.lang.String> r1 = r3.f11790g
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0053
            java.lang.String r0 = r2.f11791h
            java.lang.String r1 = r3.f11791h
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0053
            java.lang.String r0 = r2.f11792i
            java.lang.String r1 = r3.f11792i
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0053
            hu.ekreta.ellenorzo.classmaster.ClassMaster$ClassMasterType r0 = r2.f11793j
            hu.ekreta.ellenorzo.classmaster.ClassMaster$ClassMasterType r3 = r3.f11793j
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r3 = 0
            return r3
        L_0x0055:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.classmaster.ClassMaster.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final String mo12222f() {
        return this.f11788e;
    }

    /* renamed from: g */
    public final List<String> mo12223g() {
        return this.f11790g;
    }

    /* renamed from: h */
    public final ClassMasterType mo12224h() {
        return this.f11793j;
    }

    public int hashCode() {
        String e = mo11318e();
        int i = 0;
        int hashCode = (e != null ? e.hashCode() : 0) * 31;
        String str = this.f11788e;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<String> list = this.f11789f;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.f11790g;
        int hashCode4 = (hashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str2 = this.f11791h;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f11792i;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        ClassMasterType classMasterType = this.f11793j;
        if (classMasterType != null) {
            i = classMasterType.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("ClassMaster(profileId=");
        a.append(mo11318e());
        a.append(", name=");
        a.append(this.f11788e);
        a.append(", emails=");
        a.append(this.f11789f);
        a.append(", phoneNumbers=");
        a.append(this.f11790g);
        a.append(", educationTypeDescription=");
        a.append(this.f11791h);
        a.append(", groupName=");
        a.append(this.f11792i);
        a.append(", type=");
        a.append(this.f11793j);
        a.append(")");
        return a.toString();
    }

    public /* synthetic */ ClassMaster(String str, String str2, List list, List list2, String str3, String str4, ClassMasterType classMasterType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, list2, str3, str4, (i & 64) != 0 ? ClassMasterType.CLASSMASTER : classMasterType);
    }
}
