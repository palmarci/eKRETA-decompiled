package p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3;

import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p349io.ConstantsKt;
import p000a.p020b.p021a.p022a.C0082a;
import p000a.p054h.p159c.p166z.C2580c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001:\u0004MNOPBi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0011HÂ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\fHÂ\u0003J\t\u0010=\u001a\u00020\u0014HÂ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0018J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\bHÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\bHÆ\u0003J\t\u0010C\u001a\u00020\fHÂ\u0003J\t\u0010D\u001a\u00020\u000eHÂ\u0003J\t\u0010E\u001a\u00020\fHÂ\u0003J\u0001\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0013\u001a\u00020\u0014HÆ\u0001¢\u0006\u0002\u0010GJ\u0013\u0010H\u001a\u00020I2\b\u0010J\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010K\u001a\u00020\u0005HÖ\u0001J\t\u0010L\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\n\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001c\u0010\u0018R\u0010\u0010\u0013\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\"\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b#\u0010 R\u0013\u0010$\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b%\u0010 R\u0010\u0010\u0010\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010&\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b'\u0010\u001aR\u0011\u0010(\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u001aR\u0010\u0010\u000f\u001a\u00020\f8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010*\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b+\u0010 R\u0011\u0010,\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b-\u0010 R\u0010\u0010\r\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010.\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b/\u0010 R\u0011\u00100\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b1\u0010 R\u0011\u00102\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b3\u0010 R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010 R\u0010\u0010\u000b\u001a\u00020\f8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0011\u00105\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b6\u0010 R\u0011\u00107\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b8\u0010 R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010 ¨\u0006Q"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto;", "", "uid", "", "delayTimeMinutes", "", "teacher", "creatingTime", "Ljava/util/Calendar;", "justificationState", "date", "type", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$ValueDescriptor;", "subject", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$Subject;", "mode", "lesson", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$Lesson;", "justificationType", "group", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$UidStructure;", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Calendar;Ljava/lang/String;Ljava/util/Calendar;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$ValueDescriptor;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$Subject;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$ValueDescriptor;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$Lesson;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$ValueDescriptor;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$UidStructure;)V", "classScheduleNumber", "getClassScheduleNumber", "()Ljava/lang/Integer;", "getCreatingTime", "()Ljava/util/Calendar;", "getDate", "getDelayTimeMinutes", "Ljava/lang/Integer;", "groupUid", "getGroupUid", "()Ljava/lang/String;", "getJustificationState", "justificationTypeDescription", "getJustificationTypeDescription", "justificationTypeName", "getJustificationTypeName", "lessonEndTime", "getLessonEndTime", "lessonStartTime", "getLessonStartTime", "modeDescription", "getModeDescription", "modeName", "getModeName", "subjectCategoryDescription", "getSubjectCategoryDescription", "subjectCategoryName", "getSubjectCategoryName", "subjectName", "getSubjectName", "getTeacher", "typeDescription", "getTypeDescription", "typeName", "getTypeName", "getUid", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Calendar;Ljava/lang/String;Ljava/util/Calendar;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$ValueDescriptor;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$Subject;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$ValueDescriptor;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$Lesson;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$ValueDescriptor;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$UidStructure;)Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto;", "equals", "", "other", "hashCode", "toString", "Lesson", "Subject", "UidStructure", "ValueDescriptor", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.rest.mobileapi.v3.OmissionDto */
/* compiled from: OmissionDto.kt */
public final class OmissionDto {
    @C2580c("KeszitesDatuma")
    public final Calendar creatingTime;
    @C2580c("Datum")
    public final Calendar date;
    @C2580c("KesesPercben")
    public final Integer delayTimeMinutes;
    @C2580c("OsztalyCsoport")
    public final UidStructure group;
    @C2580c("IgazolasAllapota")
    public final String justificationState;
    @C2580c("IgazolasTipusa")
    public final ValueDescriptor justificationType;
    @C2580c("Ora")
    public final Lesson lesson;
    @C2580c("Mod")
    public final ValueDescriptor mode;
    @C2580c("Tantargy")
    public final Subject subject;
    @C2580c("RogzitoTanarNeve")
    public final String teacher;
    @C2580c("Tipus")
    public final ValueDescriptor type;
    @C2580c("Uid")
    public final String uid;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000bJ.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006\u0019"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$Lesson;", "", "startTime", "Ljava/util/Calendar;", "endTime", "scheduleNumber", "", "(Ljava/util/Calendar;Ljava/util/Calendar;Ljava/lang/Integer;)V", "getEndTime", "()Ljava/util/Calendar;", "getScheduleNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStartTime", "component1", "component2", "component3", "copy", "(Ljava/util/Calendar;Ljava/util/Calendar;Ljava/lang/Integer;)Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$Lesson;", "equals", "", "other", "hashCode", "toString", "", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.rest.mobileapi.v3.OmissionDto$Lesson */
    /* compiled from: OmissionDto.kt */
    public static final class Lesson {
        @C2580c("VegDatum")
        public final Calendar endTime;
        @C2580c("Oraszam")
        public final Integer scheduleNumber;
        @C2580c("KezdoDatum")
        public final Calendar startTime;

        public Lesson(Calendar calendar, Calendar calendar2, Integer num) {
            Intrinsics.checkParameterIsNotNull(calendar, "startTime");
            Intrinsics.checkParameterIsNotNull(calendar2, "endTime");
            this.startTime = calendar;
            this.endTime = calendar2;
            this.scheduleNumber = num;
        }

        public static /* synthetic */ Lesson copy$default(Lesson lesson, Calendar calendar, Calendar calendar2, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                calendar = lesson.startTime;
            }
            if ((i & 2) != 0) {
                calendar2 = lesson.endTime;
            }
            if ((i & 4) != 0) {
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

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.scheduleNumber, (java.lang.Object) r3.scheduleNumber) != false) goto L_0x0029;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x0029
                boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.OmissionDto.Lesson
                if (r0 == 0) goto L_0x0027
                hu.ekreta.ellenorzo.rest.mobileapi.v3.OmissionDto$Lesson r3 = (p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.OmissionDto.Lesson) r3
                java.util.Calendar r0 = r2.startTime
                java.util.Calendar r1 = r3.startTime
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x0027
                java.util.Calendar r0 = r2.endTime
                java.util.Calendar r1 = r3.endTime
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x0027
                java.lang.Integer r0 = r2.scheduleNumber
                java.lang.Integer r3 = r3.scheduleNumber
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
            throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.OmissionDto.Lesson.equals(java.lang.Object):boolean");
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
            int i = 0;
            int hashCode = (calendar != null ? calendar.hashCode() : 0) * 31;
            Calendar calendar2 = this.endTime;
            int hashCode2 = (hashCode + (calendar2 != null ? calendar2.hashCode() : 0)) * 31;
            Integer num = this.scheduleNumber;
            if (num != null) {
                i = num.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder a = C0082a.m111a("Lesson(startTime=");
            a.append(this.startTime);
            a.append(", endTime=");
            a.append(this.endTime);
            a.append(", scheduleNumber=");
            a.append(this.scheduleNumber);
            a.append(")");
            return a.toString();
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$Subject;", "", "uid", "", "subjectCategory", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$ValueDescriptor;", "name", "(Ljava/lang/String;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$ValueDescriptor;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getSubjectCategory", "()Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$ValueDescriptor;", "getUid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.rest.mobileapi.v3.OmissionDto$Subject */
    /* compiled from: OmissionDto.kt */
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
                boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.OmissionDto.Subject
                if (r0 == 0) goto L_0x0027
                hu.ekreta.ellenorzo.rest.mobileapi.v3.OmissionDto$Subject r3 = (p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.OmissionDto.Subject) r3
                java.lang.String r0 = r2.uid
                java.lang.String r1 = r3.uid
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x0027
                hu.ekreta.ellenorzo.rest.mobileapi.v3.OmissionDto$ValueDescriptor r0 = r2.subjectCategory
                hu.ekreta.ellenorzo.rest.mobileapi.v3.OmissionDto$ValueDescriptor r1 = r3.subjectCategory
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
            throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.OmissionDto.Subject.equals(java.lang.Object):boolean");
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

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$UidStructure;", "", "uid", "", "(Ljava/lang/String;)V", "getUid", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.rest.mobileapi.v3.OmissionDto$UidStructure */
    /* compiled from: OmissionDto.kt */
    public static final class UidStructure {
        @C2580c("Uid")
        public final String uid;

        public UidStructure(String str) {
            Intrinsics.checkParameterIsNotNull(str, "uid");
            this.uid = str;
        }

        public static /* synthetic */ UidStructure copy$default(UidStructure uidStructure, String str, int i, Object obj) {
            if ((i & 1) != 0) {
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

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.uid, (java.lang.Object) ((p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.OmissionDto.UidStructure) r2).uid) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.OmissionDto.UidStructure
                if (r0 == 0) goto L_0x0013
                hu.ekreta.ellenorzo.rest.mobileapi.v3.OmissionDto$UidStructure r2 = (p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.OmissionDto.UidStructure) r2
                java.lang.String r0 = r1.uid
                java.lang.String r2 = r2.uid
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                if (r2 == 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.OmissionDto.UidStructure.equals(java.lang.Object):boolean");
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
            return C0082a.m106a(C0082a.m111a("UidStructure(uid="), this.uid, ")");
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto$ValueDescriptor;", "", "uid", "", "description", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getName", "getUid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.rest.mobileapi.v3.OmissionDto$ValueDescriptor */
    /* compiled from: OmissionDto.kt */
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
                boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.OmissionDto.ValueDescriptor
                if (r0 == 0) goto L_0x0027
                hu.ekreta.ellenorzo.rest.mobileapi.v3.OmissionDto$ValueDescriptor r3 = (p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.OmissionDto.ValueDescriptor) r3
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
            throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.OmissionDto.ValueDescriptor.equals(java.lang.Object):boolean");
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

    public static /* synthetic */ OmissionDto copy$default(OmissionDto omissionDto, String str, Integer num, String str2, Calendar calendar, String str3, Calendar calendar2, ValueDescriptor valueDescriptor, Subject subject2, ValueDescriptor valueDescriptor2, Lesson lesson2, ValueDescriptor valueDescriptor3, UidStructure uidStructure, int i, Object obj) {
        OmissionDto omissionDto2 = omissionDto;
        int i2 = i;
        return omissionDto.copy((i2 & 1) != 0 ? omissionDto2.uid : str, (i2 & 2) != 0 ? omissionDto2.delayTimeMinutes : num, (i2 & 4) != 0 ? omissionDto2.teacher : str2, (i2 & 8) != 0 ? omissionDto2.creatingTime : calendar, (i2 & 16) != 0 ? omissionDto2.justificationState : str3, (i2 & 32) != 0 ? omissionDto2.date : calendar2, (i2 & 64) != 0 ? omissionDto2.type : valueDescriptor, (i2 & 128) != 0 ? omissionDto2.subject : subject2, (i2 & 256) != 0 ? omissionDto2.mode : valueDescriptor2, (i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? omissionDto2.lesson : lesson2, (i2 & 1024) != 0 ? omissionDto2.justificationType : valueDescriptor3, (i2 & 2048) != 0 ? omissionDto2.group : uidStructure);
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
        String str4 = str;
        Intrinsics.checkParameterIsNotNull(str, "uid");
        String str5 = str2;
        Intrinsics.checkParameterIsNotNull(str5, "teacher");
        Calendar calendar3 = calendar;
        Intrinsics.checkParameterIsNotNull(calendar3, "creatingTime");
        String str6 = str3;
        Intrinsics.checkParameterIsNotNull(str6, "justificationState");
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
        OmissionDto omissionDto = new OmissionDto(str4, num, str5, calendar3, str6, calendar4, valueDescriptor4, subject3, valueDescriptor5, lesson3, valueDescriptor3, uidStructure2);
        return omissionDto;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007e, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.group, (java.lang.Object) r3.group) != false) goto L_0x0083;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0083
            boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.OmissionDto
            if (r0 == 0) goto L_0x0081
            hu.ekreta.ellenorzo.rest.mobileapi.v3.OmissionDto r3 = (p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.OmissionDto) r3
            java.lang.String r0 = r2.uid
            java.lang.String r1 = r3.uid
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0081
            java.lang.Integer r0 = r2.delayTimeMinutes
            java.lang.Integer r1 = r3.delayTimeMinutes
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0081
            java.lang.String r0 = r2.teacher
            java.lang.String r1 = r3.teacher
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0081
            java.util.Calendar r0 = r2.creatingTime
            java.util.Calendar r1 = r3.creatingTime
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0081
            java.lang.String r0 = r2.justificationState
            java.lang.String r1 = r3.justificationState
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0081
            java.util.Calendar r0 = r2.date
            java.util.Calendar r1 = r3.date
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0081
            hu.ekreta.ellenorzo.rest.mobileapi.v3.OmissionDto$ValueDescriptor r0 = r2.type
            hu.ekreta.ellenorzo.rest.mobileapi.v3.OmissionDto$ValueDescriptor r1 = r3.type
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0081
            hu.ekreta.ellenorzo.rest.mobileapi.v3.OmissionDto$Subject r0 = r2.subject
            hu.ekreta.ellenorzo.rest.mobileapi.v3.OmissionDto$Subject r1 = r3.subject
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0081
            hu.ekreta.ellenorzo.rest.mobileapi.v3.OmissionDto$ValueDescriptor r0 = r2.mode
            hu.ekreta.ellenorzo.rest.mobileapi.v3.OmissionDto$ValueDescriptor r1 = r3.mode
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0081
            hu.ekreta.ellenorzo.rest.mobileapi.v3.OmissionDto$Lesson r0 = r2.lesson
            hu.ekreta.ellenorzo.rest.mobileapi.v3.OmissionDto$Lesson r1 = r3.lesson
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0081
            hu.ekreta.ellenorzo.rest.mobileapi.v3.OmissionDto$ValueDescriptor r0 = r2.justificationType
            hu.ekreta.ellenorzo.rest.mobileapi.v3.OmissionDto$ValueDescriptor r1 = r3.justificationType
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0081
            hu.ekreta.ellenorzo.rest.mobileapi.v3.OmissionDto$UidStructure r0 = r2.group
            hu.ekreta.ellenorzo.rest.mobileapi.v3.OmissionDto$UidStructure r3 = r3.group
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0081
            goto L_0x0083
        L_0x0081:
            r3 = 0
            return r3
        L_0x0083:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.OmissionDto.equals(java.lang.Object):boolean");
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
        int i = 0;
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
            i = uidStructure.hashCode();
        }
        return hashCode11 + i;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("OmissionDto(uid=");
        a.append(this.uid);
        a.append(", delayTimeMinutes=");
        a.append(this.delayTimeMinutes);
        a.append(", teacher=");
        a.append(this.teacher);
        a.append(", creatingTime=");
        a.append(this.creatingTime);
        a.append(", justificationState=");
        a.append(this.justificationState);
        a.append(", date=");
        a.append(this.date);
        a.append(", type=");
        a.append(this.type);
        a.append(", subject=");
        a.append(this.subject);
        a.append(", mode=");
        a.append(this.mode);
        a.append(", lesson=");
        a.append(this.lesson);
        a.append(", justificationType=");
        a.append(this.justificationType);
        a.append(", group=");
        a.append(this.group);
        a.append(")");
        return a.toString();
    }
}
