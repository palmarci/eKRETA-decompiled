package p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p000a.p054h.p159c.p166z.C2580c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\b\u0018\u0000  2\u00020\u0001:\u0003 !\"B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\t\u0010\u0018\u001a\u00020\tHÂ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0010\u0010\b\u001a\u00020\t8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006#"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassAverageDto;", "", "uid", "", "differenceFromClassAverage", "Ljava/math/BigDecimal;", "average", "classAverageNumber", "subject", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassAverageDto$Subject;", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassAverageDto$Subject;)V", "getAverage", "()Ljava/math/BigDecimal;", "classAverage", "getClassAverage", "()Ljava/lang/String;", "getDifferenceFromClassAverage", "subjectUid", "getSubjectUid", "getUid", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "Subject", "ValueDescriptor", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassAverageDto */
/* compiled from: ClassAverageDto.kt */
public final class ClassAverageDto {
    public static final Companion Companion = new Companion(null);
    public static final DecimalFormat decimalFormat;
    @C2580c("TanuloAtlag")
    public final BigDecimal average;
    @C2580c("OsztalyCsoportAtlag")
    public final BigDecimal classAverageNumber;
    @C2580c("OsztalyCsoportAtlagtolValoElteres")
    public final BigDecimal differenceFromClassAverage;
    @C2580c("Tantargy")
    public final Subject subject;
    @C2580c("Uid")
    public final String uid;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassAverageDto$Companion;", "", "()V", "decimalFormat", "Ljava/text/DecimalFormat;", "bigDecimalToFormattedString", "", "kotlin.jvm.PlatformType", "bd", "Ljava/math/BigDecimal;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassAverageDto$Companion */
    /* compiled from: ClassAverageDto.kt */
    public static final class Companion {
        public Companion() {
        }

        /* access modifiers changed from: private */
        public final String bigDecimalToFormattedString(BigDecimal bigDecimal) {
            return bigDecimal != null ? ClassAverageDto.decimalFormat.format(bigDecimal) : "";
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassAverageDto$Subject;", "", "uid", "", "subjectCategory", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassAverageDto$ValueDescriptor;", "name", "(Ljava/lang/String;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassAverageDto$ValueDescriptor;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getSubjectCategory", "()Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassAverageDto$ValueDescriptor;", "getUid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassAverageDto$Subject */
    /* compiled from: ClassAverageDto.kt */
    public static final class Subject {
        @C2580c("Nev")
        public final String name;
        @C2580c("Kategoria")
        public final ValueDescriptor subjectCategory;
        @C2580c("Uid")
        public final String uid;

        public Subject(String str, ValueDescriptor valueDescriptor, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "uid");
            Intrinsics.checkParameterIsNotNull(valueDescriptor, "subjectCategory");
            Intrinsics.checkParameterIsNotNull(str2, "name");
            this.uid = str;
            this.subjectCategory = valueDescriptor;
            this.name = str2;
        }

        public static /* synthetic */ Subject copy$default(Subject subject, String str, ValueDescriptor valueDescriptor, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = subject.uid;
            }
            if ((i & 2) != 0) {
                valueDescriptor = subject.subjectCategory;
            }
            if ((i & 4) != 0) {
                str2 = subject.name;
            }
            return subject.copy(str, valueDescriptor, str2);
        }

        public final String component1() {
            return this.uid;
        }

        public final ValueDescriptor component2() {
            return this.subjectCategory;
        }

        public final String component3() {
            return this.name;
        }

        public final Subject copy(String str, ValueDescriptor valueDescriptor, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "uid");
            Intrinsics.checkParameterIsNotNull(valueDescriptor, "subjectCategory");
            Intrinsics.checkParameterIsNotNull(str2, "name");
            return new Subject(str, valueDescriptor, str2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.name, (java.lang.Object) r3.name) != false) goto L_0x0029;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x0029
                boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.ClassAverageDto.Subject
                if (r0 == 0) goto L_0x0027
                hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassAverageDto$Subject r3 = (p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.ClassAverageDto.Subject) r3
                java.lang.String r0 = r2.uid
                java.lang.String r1 = r3.uid
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x0027
                hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassAverageDto$ValueDescriptor r0 = r2.subjectCategory
                hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassAverageDto$ValueDescriptor r1 = r3.subjectCategory
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x0027
                java.lang.String r0 = r2.name
                java.lang.String r3 = r3.name
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
                if (r3 == 0) goto L_0x0027
                goto L_0x0029
            L_0x0027:
                r3 = 0
                return r3
            L_0x0029:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.ClassAverageDto.Subject.equals(java.lang.Object):boolean");
        }

        public final String getName() {
            return this.name;
        }

        public final ValueDescriptor getSubjectCategory() {
            return this.subjectCategory;
        }

        public final String getUid() {
            return this.uid;
        }

        public int hashCode() {
            String str = this.uid;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            ValueDescriptor valueDescriptor = this.subjectCategory;
            int hashCode2 = (hashCode + (valueDescriptor != null ? valueDescriptor.hashCode() : 0)) * 31;
            String str2 = this.name;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder a = C0082a.m111a("Subject(uid=");
            a.append(this.uid);
            a.append(", subjectCategory=");
            a.append(this.subjectCategory);
            a.append(", name=");
            return C0082a.m106a(a, this.name, ")");
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassAverageDto$ValueDescriptor;", "", "uid", "", "description", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getName", "getUid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassAverageDto$ValueDescriptor */
    /* compiled from: ClassAverageDto.kt */
    public static final class ValueDescriptor {
        @C2580c("Leiras")
        public final String description;
        @C2580c("Nev")
        public final String name;
        @C2580c("Uid")
        public final String uid;

        public ValueDescriptor(String str, String str2, String str3) {
            C0082a.m114a(str, "uid", str2, "description", str3, "name");
            this.uid = str;
            this.description = str2;
            this.name = str3;
        }

        public static /* synthetic */ ValueDescriptor copy$default(ValueDescriptor valueDescriptor, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = valueDescriptor.uid;
            }
            if ((i & 2) != 0) {
                str2 = valueDescriptor.description;
            }
            if ((i & 4) != 0) {
                str3 = valueDescriptor.name;
            }
            return valueDescriptor.copy(str, str2, str3);
        }

        public final String component1() {
            return this.uid;
        }

        public final String component2() {
            return this.description;
        }

        public final String component3() {
            return this.name;
        }

        public final ValueDescriptor copy(String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "uid");
            Intrinsics.checkParameterIsNotNull(str2, "description");
            Intrinsics.checkParameterIsNotNull(str3, "name");
            return new ValueDescriptor(str, str2, str3);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.name, (java.lang.Object) r3.name) != false) goto L_0x0029;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x0029
                boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.ClassAverageDto.ValueDescriptor
                if (r0 == 0) goto L_0x0027
                hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassAverageDto$ValueDescriptor r3 = (p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.ClassAverageDto.ValueDescriptor) r3
                java.lang.String r0 = r2.uid
                java.lang.String r1 = r3.uid
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x0027
                java.lang.String r0 = r2.description
                java.lang.String r1 = r3.description
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x0027
                java.lang.String r0 = r2.name
                java.lang.String r3 = r3.name
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
                if (r3 == 0) goto L_0x0027
                goto L_0x0029
            L_0x0027:
                r3 = 0
                return r3
            L_0x0029:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.ClassAverageDto.ValueDescriptor.equals(java.lang.Object):boolean");
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getName() {
            return this.name;
        }

        public final String getUid() {
            return this.uid;
        }

        public int hashCode() {
            String str = this.uid;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.description;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.name;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder a = C0082a.m111a("ValueDescriptor(uid=");
            a.append(this.uid);
            a.append(", description=");
            a.append(this.description);
            a.append(", name=");
            return C0082a.m106a(a, this.name, ")");
        }
    }

    static {
        DecimalFormat decimalFormat2 = new DecimalFormat("#.##");
        decimalFormat2.setRoundingMode(RoundingMode.FLOOR);
        decimalFormat = decimalFormat2;
    }

    public ClassAverageDto(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, Subject subject2) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(subject2, "subject");
        this.uid = str;
        this.differenceFromClassAverage = bigDecimal;
        this.average = bigDecimal2;
        this.classAverageNumber = bigDecimal3;
        this.subject = subject2;
    }

    private final BigDecimal component4() {
        return this.classAverageNumber;
    }

    private final Subject component5() {
        return this.subject;
    }

    public static /* synthetic */ ClassAverageDto copy$default(ClassAverageDto classAverageDto, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, Subject subject2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = classAverageDto.uid;
        }
        if ((i & 2) != 0) {
            bigDecimal = classAverageDto.differenceFromClassAverage;
        }
        BigDecimal bigDecimal4 = bigDecimal;
        if ((i & 4) != 0) {
            bigDecimal2 = classAverageDto.average;
        }
        BigDecimal bigDecimal5 = bigDecimal2;
        if ((i & 8) != 0) {
            bigDecimal3 = classAverageDto.classAverageNumber;
        }
        BigDecimal bigDecimal6 = bigDecimal3;
        if ((i & 16) != 0) {
            subject2 = classAverageDto.subject;
        }
        return classAverageDto.copy(str, bigDecimal4, bigDecimal5, bigDecimal6, subject2);
    }

    public final String component1() {
        return this.uid;
    }

    public final BigDecimal component2() {
        return this.differenceFromClassAverage;
    }

    public final BigDecimal component3() {
        return this.average;
    }

    public final ClassAverageDto copy(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, Subject subject2) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(subject2, "subject");
        ClassAverageDto classAverageDto = new ClassAverageDto(str, bigDecimal, bigDecimal2, bigDecimal3, subject2);
        return classAverageDto;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.subject, (java.lang.Object) r3.subject) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003d
            boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.ClassAverageDto
            if (r0 == 0) goto L_0x003b
            hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassAverageDto r3 = (p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.ClassAverageDto) r3
            java.lang.String r0 = r2.uid
            java.lang.String r1 = r3.uid
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.math.BigDecimal r0 = r2.differenceFromClassAverage
            java.math.BigDecimal r1 = r3.differenceFromClassAverage
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.math.BigDecimal r0 = r2.average
            java.math.BigDecimal r1 = r3.average
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.math.BigDecimal r0 = r2.classAverageNumber
            java.math.BigDecimal r1 = r3.classAverageNumber
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x003b
            hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassAverageDto$Subject r0 = r2.subject
            hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassAverageDto$Subject r3 = r3.subject
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r3 = 0
            return r3
        L_0x003d:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.ClassAverageDto.equals(java.lang.Object):boolean");
    }

    public final BigDecimal getAverage() {
        return this.average;
    }

    public final String getClassAverage() {
        String access$bigDecimalToFormattedString = Companion.bigDecimalToFormattedString(this.classAverageNumber);
        Intrinsics.checkExpressionValueIsNotNull(access$bigDecimalToFormattedString, "bigDecimalToFormattedString(classAverageNumber)");
        return access$bigDecimalToFormattedString;
    }

    public final BigDecimal getDifferenceFromClassAverage() {
        return this.differenceFromClassAverage;
    }

    public final String getSubjectUid() {
        return this.subject.getUid();
    }

    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        String str = this.uid;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        BigDecimal bigDecimal = this.differenceFromClassAverage;
        int hashCode2 = (hashCode + (bigDecimal != null ? bigDecimal.hashCode() : 0)) * 31;
        BigDecimal bigDecimal2 = this.average;
        int hashCode3 = (hashCode2 + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0)) * 31;
        BigDecimal bigDecimal3 = this.classAverageNumber;
        int hashCode4 = (hashCode3 + (bigDecimal3 != null ? bigDecimal3.hashCode() : 0)) * 31;
        Subject subject2 = this.subject;
        if (subject2 != null) {
            i = subject2.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("ClassAverageDto(uid=");
        a.append(this.uid);
        a.append(", differenceFromClassAverage=");
        a.append(this.differenceFromClassAverage);
        a.append(", average=");
        a.append(this.average);
        a.append(", classAverageNumber=");
        a.append(this.classAverageNumber);
        a.append(", subject=");
        a.append(this.subject);
        a.append(")");
        return a.toString();
    }
}
