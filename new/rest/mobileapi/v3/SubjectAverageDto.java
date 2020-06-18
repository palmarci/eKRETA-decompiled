package hu.ekreta.ellenorzo.rest.mobileapi.v3;

import a.b.a.a.a;
import a.h.c.z.c;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u0000 .2\u00020\u0001:\u0004-./0B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\u0010\rJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÂ\u0003J\t\u0010#\u001a\u00020\tHÂ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÂ\u0003J\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00140\u000b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002JC\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0005HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0002X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000b8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\b\u001a\u00020\t8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\u0019\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0010R\u0011\u0010\u001b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010R\u0011\u0010\u001d\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0010¨\u00061"}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SubjectAverageDto;", "", "uid", "", "sortIndex", "", "averageNumber", "Ljava/math/BigDecimal;", "subject", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SubjectAverageDto$Subject;", "averagesInTime", "", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SubjectAverageDto$AverageWithTime;", "(Ljava/lang/String;ILjava/math/BigDecimal;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SubjectAverageDto$Subject;Ljava/util/List;)V", "average", "getAverage", "()Ljava/lang/String;", "getSortIndex", "()I", "sortedListOfAverages", "", "getSortedListOfAverages", "()Ljava/util/List;", "subjectCategoryDescription", "getSubjectCategoryDescription", "subjectCategoryName", "getSubjectCategoryName", "subjectName", "getSubjectName", "subjectUid", "getSubjectUid", "getUid", "component1", "component2", "component3", "component4", "component5", "convertToSortedAverageList", "inputList", "copy", "equals", "", "other", "hashCode", "toString", "AverageWithTime", "Companion", "Subject", "ValueDescriptor", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: SubjectAverageDto.kt */
public final class SubjectAverageDto {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final DecimalFormat decimalFormat;
    @c("Atlag")
    public final BigDecimal averageNumber;
    @c("AtlagAlakulasaIdoFuggvenyeben")
    public final List<AverageWithTime> averagesInTime;
    @c("SortIndex")
    public final int sortIndex;
    @c("Tantargy")
    public final Subject subject;
    @c("Uid")
    public final String uid;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SubjectAverageDto$AverageWithTime;", "", "average", "", "date", "Ljava/util/Calendar;", "(FLjava/util/Calendar;)V", "getAverage", "()F", "getDate", "()Ljava/util/Calendar;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: SubjectAverageDto.kt */
    public static final class AverageWithTime {
        @c("Atlag")
        public final float average;
        @c("Datum")
        public final Calendar date;

        public AverageWithTime(float f, Calendar calendar) {
            Intrinsics.checkParameterIsNotNull(calendar, "date");
            this.average = f;
            this.date = calendar;
        }

        public static /* synthetic */ AverageWithTime copy$default(AverageWithTime averageWithTime, float f, Calendar calendar, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                f = averageWithTime.average;
            }
            if ((i2 & 2) != 0) {
                calendar = averageWithTime.date;
            }
            return averageWithTime.copy(f, calendar);
        }

        public final float component1() {
            return this.average;
        }

        public final Calendar component2() {
            return this.date;
        }

        public final AverageWithTime copy(float f, Calendar calendar) {
            Intrinsics.checkParameterIsNotNull(calendar, "date");
            return new AverageWithTime(f, calendar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AverageWithTime)) {
                return false;
            }
            AverageWithTime averageWithTime = (AverageWithTime) obj;
            return Float.compare(this.average, averageWithTime.average) == 0 && Intrinsics.areEqual((Object) this.date, (Object) averageWithTime.date);
        }

        public final float getAverage() {
            return this.average;
        }

        public final Calendar getDate() {
            return this.date;
        }

        public int hashCode() {
            int floatToIntBits = Float.floatToIntBits(this.average) * 31;
            Calendar calendar = this.date;
            return floatToIntBits + (calendar != null ? calendar.hashCode() : 0);
        }

        public String toString() {
            StringBuilder a2 = a.a("AverageWithTime(average=");
            a2.append(this.average);
            a2.append(", date=");
            a2.append(this.date);
            a2.append(")");
            return a2.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SubjectAverageDto$Companion;", "", "()V", "decimalFormat", "Ljava/text/DecimalFormat;", "bigDecimalToFormattedString", "", "kotlin.jvm.PlatformType", "bd", "Ljava/math/BigDecimal;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: SubjectAverageDto.kt */
    public static final class Companion {
        public Companion() {
        }

        /* access modifiers changed from: private */
        public final String bigDecimalToFormattedString(BigDecimal bigDecimal) {
            return bigDecimal != null ? SubjectAverageDto.decimalFormat.format(bigDecimal) : "";
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SubjectAverageDto$Subject;", "", "uid", "", "subjectCategory", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SubjectAverageDto$ValueDescriptor;", "name", "(Ljava/lang/String;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SubjectAverageDto$ValueDescriptor;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getSubjectCategory", "()Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SubjectAverageDto$ValueDescriptor;", "getUid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: SubjectAverageDto.kt */
    public static final class Subject {
        @c("Nev")
        public final String name;
        @c("Kategoria")
        public final ValueDescriptor subjectCategory;
        @c("Uid")
        public final String uid;

        public Subject(String str, ValueDescriptor valueDescriptor, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "uid");
            Intrinsics.checkParameterIsNotNull(valueDescriptor, "subjectCategory");
            Intrinsics.checkParameterIsNotNull(str2, "name");
            this.uid = str;
            this.subjectCategory = valueDescriptor;
            this.name = str2;
        }

        public static /* synthetic */ Subject copy$default(Subject subject, String str, ValueDescriptor valueDescriptor, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = subject.uid;
            }
            if ((i2 & 2) != 0) {
                valueDescriptor = subject.subjectCategory;
            }
            if ((i2 & 4) != 0) {
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

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Subject)) {
                return false;
            }
            Subject subject = (Subject) obj;
            return Intrinsics.areEqual((Object) this.uid, (Object) subject.uid) && Intrinsics.areEqual((Object) this.subjectCategory, (Object) subject.subjectCategory) && Intrinsics.areEqual((Object) this.name, (Object) subject.name);
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
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            ValueDescriptor valueDescriptor = this.subjectCategory;
            int hashCode2 = (hashCode + (valueDescriptor != null ? valueDescriptor.hashCode() : 0)) * 31;
            String str2 = this.name;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode2 + i2;
        }

        public String toString() {
            StringBuilder a2 = a.a("Subject(uid=");
            a2.append(this.uid);
            a2.append(", subjectCategory=");
            a2.append(this.subjectCategory);
            a2.append(", name=");
            return a.a(a2, this.name, ")");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SubjectAverageDto$ValueDescriptor;", "", "uid", "", "description", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getName", "getUid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: SubjectAverageDto.kt */
    public static final class ValueDescriptor {
        @c("Leiras")
        public final String description;
        @c("Nev")
        public final String name;
        @c("Uid")
        public final String uid;

        public ValueDescriptor(String str, String str2, String str3) {
            a.a(str, "uid", str2, "description", str3, "name");
            this.uid = str;
            this.description = str2;
            this.name = str3;
        }

        public static /* synthetic */ ValueDescriptor copy$default(ValueDescriptor valueDescriptor, String str, String str2, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = valueDescriptor.uid;
            }
            if ((i2 & 2) != 0) {
                str2 = valueDescriptor.description;
            }
            if ((i2 & 4) != 0) {
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

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ValueDescriptor)) {
                return false;
            }
            ValueDescriptor valueDescriptor = (ValueDescriptor) obj;
            return Intrinsics.areEqual((Object) this.uid, (Object) valueDescriptor.uid) && Intrinsics.areEqual((Object) this.description, (Object) valueDescriptor.description) && Intrinsics.areEqual((Object) this.name, (Object) valueDescriptor.name);
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
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.description;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.name;
            if (str3 != null) {
                i2 = str3.hashCode();
            }
            return hashCode2 + i2;
        }

        public String toString() {
            StringBuilder a2 = a.a("ValueDescriptor(uid=");
            a2.append(this.uid);
            a2.append(", description=");
            a2.append(this.description);
            a2.append(", name=");
            return a.a(a2, this.name, ")");
        }
    }

    static {
        DecimalFormat decimalFormat2 = new DecimalFormat("#.##");
        decimalFormat2.setRoundingMode(RoundingMode.FLOOR);
        decimalFormat = decimalFormat2;
    }

    public SubjectAverageDto(String str, int i2, BigDecimal bigDecimal, Subject subject2, List<AverageWithTime> list) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(subject2, "subject");
        Intrinsics.checkParameterIsNotNull(list, "averagesInTime");
        this.uid = str;
        this.sortIndex = i2;
        this.averageNumber = bigDecimal;
        this.subject = subject2;
        this.averagesInTime = list;
    }

    private final BigDecimal component3() {
        return this.averageNumber;
    }

    private final Subject component4() {
        return this.subject;
    }

    private final List<AverageWithTime> component5() {
        return this.averagesInTime;
    }

    private final List<Float> convertToSortedAverageList(List<AverageWithTime> list) {
        List<T> sortedWith = CollectionsKt___CollectionsKt.sortedWith(list, new SubjectAverageDto$convertToSortedAverageList$$inlined$compareBy$1());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedWith, 10));
        for (T average : sortedWith) {
            arrayList.add(Float.valueOf(average.getAverage()));
        }
        return arrayList;
    }

    public static /* synthetic */ SubjectAverageDto copy$default(SubjectAverageDto subjectAverageDto, String str, int i2, BigDecimal bigDecimal, Subject subject2, List<AverageWithTime> list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = subjectAverageDto.uid;
        }
        if ((i3 & 2) != 0) {
            i2 = subjectAverageDto.sortIndex;
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            bigDecimal = subjectAverageDto.averageNumber;
        }
        BigDecimal bigDecimal2 = bigDecimal;
        if ((i3 & 8) != 0) {
            subject2 = subjectAverageDto.subject;
        }
        Subject subject3 = subject2;
        if ((i3 & 16) != 0) {
            list = subjectAverageDto.averagesInTime;
        }
        return subjectAverageDto.copy(str, i4, bigDecimal2, subject3, list);
    }

    public final String component1() {
        return this.uid;
    }

    public final int component2() {
        return this.sortIndex;
    }

    public final SubjectAverageDto copy(String str, int i2, BigDecimal bigDecimal, Subject subject2, List<AverageWithTime> list) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(subject2, "subject");
        Intrinsics.checkParameterIsNotNull(list, "averagesInTime");
        return new SubjectAverageDto(str, i2, bigDecimal, subject2, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SubjectAverageDto) {
                SubjectAverageDto subjectAverageDto = (SubjectAverageDto) obj;
                if (Intrinsics.areEqual((Object) this.uid, (Object) subjectAverageDto.uid)) {
                    if (!(this.sortIndex == subjectAverageDto.sortIndex) || !Intrinsics.areEqual((Object) this.averageNumber, (Object) subjectAverageDto.averageNumber) || !Intrinsics.areEqual((Object) this.subject, (Object) subjectAverageDto.subject) || !Intrinsics.areEqual((Object) this.averagesInTime, (Object) subjectAverageDto.averagesInTime)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String getAverage() {
        String access$bigDecimalToFormattedString = Companion.bigDecimalToFormattedString(this.averageNumber);
        Intrinsics.checkExpressionValueIsNotNull(access$bigDecimalToFormattedString, "bigDecimalToFormattedString(averageNumber)");
        return access$bigDecimalToFormattedString;
    }

    public final int getSortIndex() {
        return this.sortIndex;
    }

    public final List<Float> getSortedListOfAverages() {
        return convertToSortedAverageList(this.averagesInTime);
    }

    public final String getSubjectCategoryDescription() {
        return this.subject.getSubjectCategory().getDescription();
    }

    public final String getSubjectCategoryName() {
        return this.subject.getSubjectCategory().getName();
    }

    public final String getSubjectName() {
        return this.subject.getName();
    }

    public final String getSubjectUid() {
        return this.subject.getUid();
    }

    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        String str = this.uid;
        int i2 = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.sortIndex) * 31;
        BigDecimal bigDecimal = this.averageNumber;
        int hashCode2 = (hashCode + (bigDecimal != null ? bigDecimal.hashCode() : 0)) * 31;
        Subject subject2 = this.subject;
        int hashCode3 = (hashCode2 + (subject2 != null ? subject2.hashCode() : 0)) * 31;
        List<AverageWithTime> list = this.averagesInTime;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("SubjectAverageDto(uid=");
        a2.append(this.uid);
        a2.append(", sortIndex=");
        a2.append(this.sortIndex);
        a2.append(", averageNumber=");
        a2.append(this.averageNumber);
        a2.append(", subject=");
        a2.append(this.subject);
        a2.append(", averagesInTime=");
        return a.a(a2, (List) this.averagesInTime, ")");
    }
}
