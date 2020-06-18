package hu.ekreta.ellenorzo.rest.mobileapi.v3;

import a.b.a.a.a;
import a.h.c.z.c;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001:\u0004MNOPBi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0011HÂ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\fHÂ\u0003J\t\u0010=\u001a\u00020\u0014HÂ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0018J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\bHÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\bHÆ\u0003J\t\u0010C\u001a\u00020\fHÂ\u0003J\t\u0010D\u001a\u00020\u000eHÂ\u0003J\t\u0010E\u001a\u00020\fHÂ\u0003J\u0001\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0013\u001a\u00020\u0014HÆ\u0001¢\u0006\u0002\u0010GJ\u0013\u0010H\u001a\u00020I2\b\u0010J\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010K\u001a\u00020\u0005HÖ\u0001J\t\u0010L\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\n\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001c\u0010\u0018R\u0010\u0010\u0013\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\"\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b#\u0010 R\u0013\u0010$\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b%\u0010 R\u0010\u0010\u0010\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010&\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b'\u0010\u001aR\u0011\u0010(\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u001aR\u0010\u0010\u000f\u001a\u00020\f8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010*\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b+\u0010 R\u0011\u0010,\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b-\u0010 R\u0010\u0010\r\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010.\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b/\u0010 R\u0011\u00100\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b1\u0010 R\u0011\u00102\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b3\u0010 R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010 R\u0010\u0010\u000b\u001a\u00020\f8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0011\u00105\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b6\u0010 R\u0011\u00107\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b8\u0010 R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010 ¨\u0006Q"}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto;", "", "uid", "", "delayTimeMinutes", "", "teacher", "creatingTime", "Ljava/util/Calendar;", "justificationState", "date", "type", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$ValueDescriptor;", "subject", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$Subject;", "mode", "lesson", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$Lesson;", "justificationType", "group", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$UidStructure;", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Calendar;Ljava/lang/String;Ljava/util/Calendar;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$ValueDescriptor;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$Subject;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$ValueDescriptor;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$Lesson;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$ValueDescriptor;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$UidStructure;)V", "classScheduleNumber", "getClassScheduleNumber", "()Ljava/lang/Integer;", "getCreatingTime", "()Ljava/util/Calendar;", "getDate", "getDelayTimeMinutes", "Ljava/lang/Integer;", "groupUid", "getGroupUid", "()Ljava/lang/String;", "getJustificationState", "justificationTypeDescription", "getJustificationTypeDescription", "justificationTypeName", "getJustificationTypeName", "lessonEndTime", "getLessonEndTime", "lessonStartTime", "getLessonStartTime", "modeDescription", "getModeDescription", "modeName", "getModeName", "subjectCategoryDescription", "getSubjectCategoryDescription", "subjectCategoryName", "getSubjectCategoryName", "subjectName", "getSubjectName", "getTeacher", "typeDescription", "getTypeDescription", "typeName", "getTypeName", "getUid", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Calendar;Ljava/lang/String;Ljava/util/Calendar;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$ValueDescriptor;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$Subject;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$ValueDescriptor;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$Lesson;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$ValueDescriptor;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$UidStructure;)Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto;", "equals", "", "other", "hashCode", "toString", "Lesson", "Subject", "UidStructure", "ValueDescriptor", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: OmissionDto.kt */
public final class OmissionDto {
    @c("KeszitesDatuma")
    public final Calendar creatingTime;
    @c("Datum")
    public final Calendar date;
    @c("KesesPercben")
    public final Integer delayTimeMinutes;
    @c("OsztalyCsoport")
    public final UidStructure group;
    @c("IgazolasAllapota")
    public final String justificationState;
    @c("IgazolasTipusa")
    public final ValueDescriptor justificationType;
    @c("Ora")
    public final Lesson lesson;
    @c("Mod")
    public final ValueDescriptor mode;
    @c("Tantargy")
    public final Subject subject;
    @c("RogzitoTanarNeve")
    public final String teacher;
    @c("Tipus")
    public final ValueDescriptor type;
    @c("Uid")
    public final String uid;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000bJ.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006\u0019"}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$Lesson;", "", "startTime", "Ljava/util/Calendar;", "endTime", "scheduleNumber", "", "(Ljava/util/Calendar;Ljava/util/Calendar;Ljava/lang/Integer;)V", "getEndTime", "()Ljava/util/Calendar;", "getScheduleNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStartTime", "component1", "component2", "component3", "copy", "(Ljava/util/Calendar;Ljava/util/Calendar;Ljava/lang/Integer;)Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$Lesson;", "equals", "", "other", "hashCode", "toString", "", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: OmissionDto.kt */
    public static final class Lesson {
        @c("VegDatum")
        public final Calendar endTime;
        @c("Oraszam")
        public final Integer scheduleNumber;
        @c("KezdoDatum")
        public final Calendar startTime;

        public Lesson(Calendar calendar, Calendar calendar2, Integer num) {
            Intrinsics.checkParameterIsNotNull(calendar, "startTime");
            Intrinsics.checkParameterIsNotNull(calendar2, "endTime");
            this.startTime = calendar;
            this.endTime = calendar2;
            this.scheduleNumber = num;
        }

        public static /* synthetic */ Lesson copy$default(Lesson lesson, Calendar calendar, Calendar calendar2, Integer num, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                calendar = lesson.startTime;
            }
            if ((i2 & 2) != 0) {
                calendar2 = lesson.endTime;
            }
            if ((i2 & 4) != 0) {
                num = lesson.scheduleNumber;
            }
            return lesson.copy(calendar, calendar2, num);
        }

        public final Calendar component1() {
            return this.startTime;
        }

        public final Calendar component2() {
            return this.endTime;
        }

        public final Integer component3() {
            return this.scheduleNumber;
        }

        public final Lesson copy(Calendar calendar, Calendar calendar2, Integer num) {
            Intrinsics.checkParameterIsNotNull(calendar, "startTime");
            Intrinsics.checkParameterIsNotNull(calendar2, "endTime");
            return new Lesson(calendar, calendar2, num);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Lesson)) {
                return false;
            }
            Lesson lesson = (Lesson) obj;
            return Intrinsics.areEqual((Object) this.startTime, (Object) lesson.startTime) && Intrinsics.areEqual((Object) this.endTime, (Object) lesson.endTime) && Intrinsics.areEqual((Object) this.scheduleNumber, (Object) lesson.scheduleNumber);
        }

        public final Calendar getEndTime() {
            return this.endTime;
        }

        public final Integer getScheduleNumber() {
            return this.scheduleNumber;
        }

        public final Calendar getStartTime() {
            return this.startTime;
        }

        public int hashCode() {
            Calendar calendar = this.startTime;
            int i2 = 0;
            int hashCode = (calendar != null ? calendar.hashCode() : 0) * 31;
            Calendar calendar2 = this.endTime;
            int hashCode2 = (hashCode + (calendar2 != null ? calendar2.hashCode() : 0)) * 31;
            Integer num = this.scheduleNumber;
            if (num != null) {
                i2 = num.hashCode();
            }
            return hashCode2 + i2;
        }

        public String toString() {
            StringBuilder a2 = a.a("Lesson(startTime=");
            a2.append(this.startTime);
            a2.append(", endTime=");
            a2.append(this.endTime);
            a2.append(", scheduleNumber=");
            a2.append(this.scheduleNumber);
            a2.append(")");
            return a2.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$Subject;", "", "uid", "", "subjectCategory", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$ValueDescriptor;", "name", "(Ljava/lang/String;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$ValueDescriptor;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getSubjectCategory", "()Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$ValueDescriptor;", "getUid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: OmissionDto.kt */
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$UidStructure;", "", "uid", "", "(Ljava/lang/String;)V", "getUid", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: OmissionDto.kt */
    public static final class UidStructure {
        @c("Uid")
        public final String uid;

        public UidStructure(String str) {
            Intrinsics.checkParameterIsNotNull(str, "uid");
            this.uid = str;
        }

        public static /* synthetic */ UidStructure copy$default(UidStructure uidStructure, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = uidStructure.uid;
            }
            return uidStructure.copy(str);
        }

        public final String component1() {
            return this.uid;
        }

        public final UidStructure copy(String str) {
            Intrinsics.checkParameterIsNotNull(str, "uid");
            return new UidStructure(str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof UidStructure) && Intrinsics.areEqual((Object) this.uid, (Object) ((UidStructure) obj).uid);
            }
            return true;
        }

        public final String getUid() {
            return this.uid;
        }

        public int hashCode() {
            String str = this.uid;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return a.a(a.a("UidStructure(uid="), this.uid, ")");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$ValueDescriptor;", "", "uid", "", "description", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getName", "getUid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: OmissionDto.kt */
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

    public OmissionDto(String str, Integer num, String str2, Calendar calendar, String str3, Calendar calendar2, ValueDescriptor valueDescriptor, Subject subject2, ValueDescriptor valueDescriptor2, Lesson lesson2, ValueDescriptor valueDescriptor3, UidStructure uidStructure) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(str2, "teacher");
        Intrinsics.checkParameterIsNotNull(calendar, "creatingTime");
        Intrinsics.checkParameterIsNotNull(str3, "justificationState");
        Intrinsics.checkParameterIsNotNull(calendar2, "date");
        Intrinsics.checkParameterIsNotNull(valueDescriptor, "type");
        Intrinsics.checkParameterIsNotNull(subject2, "subject");
        Intrinsics.checkParameterIsNotNull(valueDescriptor2, "mode");
        Intrinsics.checkParameterIsNotNull(lesson2, "lesson");
        Intrinsics.checkParameterIsNotNull(uidStructure, "group");
        this.uid = str;
        this.delayTimeMinutes = num;
        this.teacher = str2;
        this.creatingTime = calendar;
        this.justificationState = str3;
        this.date = calendar2;
        this.type = valueDescriptor;
        this.subject = subject2;
        this.mode = valueDescriptor2;
        this.lesson = lesson2;
        this.justificationType = valueDescriptor3;
        this.group = uidStructure;
    }

    private final Lesson component10() {
        return this.lesson;
    }

    private final ValueDescriptor component11() {
        return this.justificationType;
    }

    private final UidStructure component12() {
        return this.group;
    }

    private final ValueDescriptor component7() {
        return this.type;
    }

    private final Subject component8() {
        return this.subject;
    }

    private final ValueDescriptor component9() {
        return this.mode;
    }

    public static /* synthetic */ OmissionDto copy$default(OmissionDto omissionDto, String str, Integer num, String str2, Calendar calendar, String str3, Calendar calendar2, ValueDescriptor valueDescriptor, Subject subject2, ValueDescriptor valueDescriptor2, Lesson lesson2, ValueDescriptor valueDescriptor3, UidStructure uidStructure, int i2, Object obj) {
        OmissionDto omissionDto2 = omissionDto;
        int i3 = i2;
        return omissionDto.copy((i3 & 1) != 0 ? omissionDto2.uid : str, (i3 & 2) != 0 ? omissionDto2.delayTimeMinutes : num, (i3 & 4) != 0 ? omissionDto2.teacher : str2, (i3 & 8) != 0 ? omissionDto2.creatingTime : calendar, (i3 & 16) != 0 ? omissionDto2.justificationState : str3, (i3 & 32) != 0 ? omissionDto2.date : calendar2, (i3 & 64) != 0 ? omissionDto2.type : valueDescriptor, (i3 & 128) != 0 ? omissionDto2.subject : subject2, (i3 & 256) != 0 ? omissionDto2.mode : valueDescriptor2, (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? omissionDto2.lesson : lesson2, (i3 & 1024) != 0 ? omissionDto2.justificationType : valueDescriptor3, (i3 & 2048) != 0 ? omissionDto2.group : uidStructure);
    }

    public final String component1() {
        return this.uid;
    }

    public final Integer component2() {
        return this.delayTimeMinutes;
    }

    public final String component3() {
        return this.teacher;
    }

    public final Calendar component4() {
        return this.creatingTime;
    }

    public final String component5() {
        return this.justificationState;
    }

    public final Calendar component6() {
        return this.date;
    }

    public final OmissionDto copy(String str, Integer num, String str2, Calendar calendar, String str3, Calendar calendar2, ValueDescriptor valueDescriptor, Subject subject2, ValueDescriptor valueDescriptor2, Lesson lesson2, ValueDescriptor valueDescriptor3, UidStructure uidStructure) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        String str4 = str2;
        Intrinsics.checkParameterIsNotNull(str4, "teacher");
        Calendar calendar3 = calendar;
        Intrinsics.checkParameterIsNotNull(calendar3, "creatingTime");
        String str5 = str3;
        Intrinsics.checkParameterIsNotNull(str5, "justificationState");
        Calendar calendar4 = calendar2;
        Intrinsics.checkParameterIsNotNull(calendar4, "date");
        ValueDescriptor valueDescriptor4 = valueDescriptor;
        Intrinsics.checkParameterIsNotNull(valueDescriptor4, "type");
        Subject subject3 = subject2;
        Intrinsics.checkParameterIsNotNull(subject3, "subject");
        ValueDescriptor valueDescriptor5 = valueDescriptor2;
        Intrinsics.checkParameterIsNotNull(valueDescriptor5, "mode");
        Lesson lesson3 = lesson2;
        Intrinsics.checkParameterIsNotNull(lesson3, "lesson");
        UidStructure uidStructure2 = uidStructure;
        Intrinsics.checkParameterIsNotNull(uidStructure2, "group");
        return new OmissionDto(str, num, str4, calendar3, str5, calendar4, valueDescriptor4, subject3, valueDescriptor5, lesson3, valueDescriptor3, uidStructure2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OmissionDto)) {
            return false;
        }
        OmissionDto omissionDto = (OmissionDto) obj;
        return Intrinsics.areEqual((Object) this.uid, (Object) omissionDto.uid) && Intrinsics.areEqual((Object) this.delayTimeMinutes, (Object) omissionDto.delayTimeMinutes) && Intrinsics.areEqual((Object) this.teacher, (Object) omissionDto.teacher) && Intrinsics.areEqual((Object) this.creatingTime, (Object) omissionDto.creatingTime) && Intrinsics.areEqual((Object) this.justificationState, (Object) omissionDto.justificationState) && Intrinsics.areEqual((Object) this.date, (Object) omissionDto.date) && Intrinsics.areEqual((Object) this.type, (Object) omissionDto.type) && Intrinsics.areEqual((Object) this.subject, (Object) omissionDto.subject) && Intrinsics.areEqual((Object) this.mode, (Object) omissionDto.mode) && Intrinsics.areEqual((Object) this.lesson, (Object) omissionDto.lesson) && Intrinsics.areEqual((Object) this.justificationType, (Object) omissionDto.justificationType) && Intrinsics.areEqual((Object) this.group, (Object) omissionDto.group);
    }

    public final Integer getClassScheduleNumber() {
        return this.lesson.getScheduleNumber();
    }

    public final Calendar getCreatingTime() {
        return this.creatingTime;
    }

    public final Calendar getDate() {
        return this.date;
    }

    public final Integer getDelayTimeMinutes() {
        return this.delayTimeMinutes;
    }

    public final String getGroupUid() {
        return this.group.getUid();
    }

    public final String getJustificationState() {
        return this.justificationState;
    }

    public final String getJustificationTypeDescription() {
        ValueDescriptor valueDescriptor = this.justificationType;
        if (valueDescriptor != null) {
            return valueDescriptor.getDescription();
        }
        return null;
    }

    public final String getJustificationTypeName() {
        ValueDescriptor valueDescriptor = this.justificationType;
        if (valueDescriptor != null) {
            return valueDescriptor.getName();
        }
        return null;
    }

    public final Calendar getLessonEndTime() {
        return this.lesson.getEndTime();
    }

    public final Calendar getLessonStartTime() {
        return this.lesson.getStartTime();
    }

    public final String getModeDescription() {
        return this.mode.getDescription();
    }

    public final String getModeName() {
        return this.mode.getName();
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

    public final String getTeacher() {
        return this.teacher;
    }

    public final String getTypeDescription() {
        return this.type.getDescription();
    }

    public final String getTypeName() {
        return this.type.getName();
    }

    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        String str = this.uid;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.delayTimeMinutes;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.teacher;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Calendar calendar = this.creatingTime;
        int hashCode4 = (hashCode3 + (calendar != null ? calendar.hashCode() : 0)) * 31;
        String str3 = this.justificationState;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Calendar calendar2 = this.date;
        int hashCode6 = (hashCode5 + (calendar2 != null ? calendar2.hashCode() : 0)) * 31;
        ValueDescriptor valueDescriptor = this.type;
        int hashCode7 = (hashCode6 + (valueDescriptor != null ? valueDescriptor.hashCode() : 0)) * 31;
        Subject subject2 = this.subject;
        int hashCode8 = (hashCode7 + (subject2 != null ? subject2.hashCode() : 0)) * 31;
        ValueDescriptor valueDescriptor2 = this.mode;
        int hashCode9 = (hashCode8 + (valueDescriptor2 != null ? valueDescriptor2.hashCode() : 0)) * 31;
        Lesson lesson2 = this.lesson;
        int hashCode10 = (hashCode9 + (lesson2 != null ? lesson2.hashCode() : 0)) * 31;
        ValueDescriptor valueDescriptor3 = this.justificationType;
        int hashCode11 = (hashCode10 + (valueDescriptor3 != null ? valueDescriptor3.hashCode() : 0)) * 31;
        UidStructure uidStructure = this.group;
        if (uidStructure != null) {
            i2 = uidStructure.hashCode();
        }
        return hashCode11 + i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("OmissionDto(uid=");
        a2.append(this.uid);
        a2.append(", delayTimeMinutes=");
        a2.append(this.delayTimeMinutes);
        a2.append(", teacher=");
        a2.append(this.teacher);
        a2.append(", creatingTime=");
        a2.append(this.creatingTime);
        a2.append(", justificationState=");
        a2.append(this.justificationState);
        a2.append(", date=");
        a2.append(this.date);
        a2.append(", type=");
        a2.append(this.type);
        a2.append(", subject=");
        a2.append(this.subject);
        a2.append(", mode=");
        a2.append(this.mode);
        a2.append(", lesson=");
        a2.append(this.lesson);
        a2.append(", justificationType=");
        a2.append(this.justificationType);
        a2.append(", group=");
        a2.append(this.group);
        a2.append(")");
        return a2.toString();
    }
}
