package hu.ekreta.ellenorzo.rest.mobileapi.v3;

import a.b.a.a.a;
import a.h.c.z.c;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bJ\b\b\u0018\u00002\u00020\u0001:\u0004`abcB¯\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u001cJ\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0010HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u000eHÂ\u0003J\t\u0010O\u001a\u00020\u0018HÂ\u0003J\t\u0010P\u001a\u00020\u001aHÂ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u000eHÂ\u0003J\u0010\u0010R\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001eJ\t\u0010S\u001a\u00020\u0007HÆ\u0003J\t\u0010T\u001a\u00020\u0007HÆ\u0003J\t\u0010U\u001a\u00020\u0007HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u000eHÆ\u0003JØ\u0001\u0010Z\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u000e2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010[J\u0013\u0010\\\u001a\u00020\u00102\b\u0010]\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010^\u001a\u00020\u0005HÖ\u0001J\t\u0010_\u001a\u00020\u0003HÖ\u0001R\u0010\u0010\u0019\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0013\u0010%\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b&\u0010!R\u0013\u0010'\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b(\u0010!R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010,\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b-\u0010!R\u0011\u0010.\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b/\u0010!R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010!R\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u000e8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0013\u00101\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b2\u0010!R\u0013\u00103\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b4\u0010!R\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00148\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010#R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010:\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b;\u0010!R\u0011\u0010<\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b=\u0010!R\u0010\u0010\u0017\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010>\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b?\u0010!R\u0011\u0010@\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bA\u0010!R\u0011\u0010B\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bC\u0010!R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010!R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010!R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010!R\u0010\u0010\u0016\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010!¨\u0006d"}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto;", "", "uid", "", "classScheduleNumber", "", "date", "Ljava/util/Calendar;", "startTime", "endTime", "classroom", "teacher", "supplyTeacher", "state", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto$ValueDescriptor;", "homeworkEditedByStudentEnabled", "", "topic", "name", "reportedExamUids", "", "homeWorkUid", "type", "subject", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto$Subject;", "classGroup", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto$UidNameStructure;", "presence", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto$ValueDescriptor;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto$ValueDescriptor;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto$Subject;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto$UidNameStructure;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto$ValueDescriptor;)V", "getClassScheduleNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getClassroom", "()Ljava/lang/String;", "getDate", "()Ljava/util/Calendar;", "getEndTime", "groupName", "getGroupName", "groupUid", "getGroupUid", "getHomeWorkUid", "getHomeworkEditedByStudentEnabled", "()Z", "lessonTypeDescription", "getLessonTypeDescription", "lessonTypeName", "getLessonTypeName", "getName", "presenceTypeDescription", "getPresenceTypeDescription", "presenceTypeName", "getPresenceTypeName", "getReportedExamUids", "()Ljava/util/List;", "getStartTime", "getState", "()Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto$ValueDescriptor;", "stateDescription", "getStateDescription", "stateName", "getStateName", "subjectCategoryDescription", "getSubjectCategoryDescription", "subjectCategoryName", "getSubjectCategoryName", "subjectName", "getSubjectName", "getSupplyTeacher", "getTeacher", "getTopic", "getUid", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto$ValueDescriptor;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto$ValueDescriptor;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto$Subject;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto$UidNameStructure;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto$ValueDescriptor;)Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto;", "equals", "other", "hashCode", "toString", "Subject", "UidNameStructure", "UidStructure", "ValueDescriptor", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: LessonDto.kt */
public final class LessonDto {
    @c("OsztalyCsoport")
    public final UidNameStructure classGroup;
    @c("Oraszam")
    public final Integer classScheduleNumber;
    @c("TeremNeve")
    public final String classroom;
    @c("Datum")
    public final Calendar date;
    @c("VegIdopont")
    public final Calendar endTime;
    @c("HaziFeladatUid")
    public final String homeWorkUid;
    @c("IsTanuloHaziFeladatEnabled")
    public final boolean homeworkEditedByStudentEnabled;
    @c("Nev")
    public final String name;
    @c("TanuloJelenlet")
    public final ValueDescriptor presence;
    @c("BejelentettSzamonkeresUids")
    public final List<String> reportedExamUids;
    @c("KezdetIdopont")
    public final Calendar startTime;
    @c("Allapot")
    public final ValueDescriptor state;
    @c("Tantargy")
    public final Subject subject;
    @c("HelyettesTanarNeve")
    public final String supplyTeacher;
    @c("TanarNeve")
    public final String teacher;
    @c("Tema")
    public final String topic;
    @c("Tipus")
    public final ValueDescriptor type;
    @c("Uid")
    public final String uid;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto$Subject;", "", "uid", "", "subjectCategory", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto$ValueDescriptor;", "name", "(Ljava/lang/String;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto$ValueDescriptor;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getSubjectCategory", "()Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto$ValueDescriptor;", "getUid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: LessonDto.kt */
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto$UidNameStructure;", "", "uid", "", "name", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getUid", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: LessonDto.kt */
    public static final class UidNameStructure {
        @c("Nev")
        public final String name;
        @c("Uid")
        public final String uid;

        public UidNameStructure(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "uid");
            Intrinsics.checkParameterIsNotNull(str2, "name");
            this.uid = str;
            this.name = str2;
        }

        public static /* synthetic */ UidNameStructure copy$default(UidNameStructure uidNameStructure, String str, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = uidNameStructure.uid;
            }
            if ((i2 & 2) != 0) {
                str2 = uidNameStructure.name;
            }
            return uidNameStructure.copy(str, str2);
        }

        public final String component1() {
            return this.uid;
        }

        public final String component2() {
            return this.name;
        }

        public final UidNameStructure copy(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "uid");
            Intrinsics.checkParameterIsNotNull(str2, "name");
            return new UidNameStructure(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UidNameStructure)) {
                return false;
            }
            UidNameStructure uidNameStructure = (UidNameStructure) obj;
            return Intrinsics.areEqual((Object) this.uid, (Object) uidNameStructure.uid) && Intrinsics.areEqual((Object) this.name, (Object) uidNameStructure.name);
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
            String str2 = this.name;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            StringBuilder a2 = a.a("UidNameStructure(uid=");
            a2.append(this.uid);
            a2.append(", name=");
            return a.a(a2, this.name, ")");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto$UidStructure;", "", "uid", "", "(Ljava/lang/String;)V", "getUid", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: LessonDto.kt */
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto$ValueDescriptor;", "", "uid", "", "description", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getName", "getUid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: LessonDto.kt */
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

    public LessonDto(String str, Integer num, Calendar calendar, Calendar calendar2, Calendar calendar3, String str2, String str3, String str4, ValueDescriptor valueDescriptor, boolean z, String str5, String str6, List<String> list, String str7, ValueDescriptor valueDescriptor2, Subject subject2, UidNameStructure uidNameStructure, ValueDescriptor valueDescriptor3) {
        Calendar calendar4 = calendar3;
        ValueDescriptor valueDescriptor4 = valueDescriptor;
        List<String> list2 = list;
        ValueDescriptor valueDescriptor5 = valueDescriptor2;
        Subject subject3 = subject2;
        UidNameStructure uidNameStructure2 = uidNameStructure;
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(calendar, "date");
        Intrinsics.checkParameterIsNotNull(calendar2, "startTime");
        Intrinsics.checkParameterIsNotNull(calendar4, "endTime");
        Intrinsics.checkParameterIsNotNull(valueDescriptor4, "state");
        Intrinsics.checkParameterIsNotNull(list2, "reportedExamUids");
        Intrinsics.checkParameterIsNotNull(valueDescriptor5, "type");
        Intrinsics.checkParameterIsNotNull(subject3, "subject");
        Intrinsics.checkParameterIsNotNull(uidNameStructure2, "classGroup");
        this.uid = str;
        this.classScheduleNumber = num;
        this.date = calendar;
        this.startTime = calendar2;
        this.endTime = calendar4;
        this.classroom = str2;
        this.teacher = str3;
        this.supplyTeacher = str4;
        this.state = valueDescriptor4;
        this.homeworkEditedByStudentEnabled = z;
        this.topic = str5;
        this.name = str6;
        this.reportedExamUids = list2;
        this.homeWorkUid = str7;
        this.type = valueDescriptor5;
        this.subject = subject3;
        this.classGroup = uidNameStructure2;
        this.presence = valueDescriptor3;
    }

    private final ValueDescriptor component15() {
        return this.type;
    }

    private final Subject component16() {
        return this.subject;
    }

    private final UidNameStructure component17() {
        return this.classGroup;
    }

    private final ValueDescriptor component18() {
        return this.presence;
    }

    public static /* synthetic */ LessonDto copy$default(LessonDto lessonDto, String str, Integer num, Calendar calendar, Calendar calendar2, Calendar calendar3, String str2, String str3, String str4, ValueDescriptor valueDescriptor, boolean z, String str5, String str6, List list, String str7, ValueDescriptor valueDescriptor2, Subject subject2, UidNameStructure uidNameStructure, ValueDescriptor valueDescriptor3, int i2, Object obj) {
        LessonDto lessonDto2 = lessonDto;
        int i3 = i2;
        return lessonDto.copy((i3 & 1) != 0 ? lessonDto2.uid : str, (i3 & 2) != 0 ? lessonDto2.classScheduleNumber : num, (i3 & 4) != 0 ? lessonDto2.date : calendar, (i3 & 8) != 0 ? lessonDto2.startTime : calendar2, (i3 & 16) != 0 ? lessonDto2.endTime : calendar3, (i3 & 32) != 0 ? lessonDto2.classroom : str2, (i3 & 64) != 0 ? lessonDto2.teacher : str3, (i3 & 128) != 0 ? lessonDto2.supplyTeacher : str4, (i3 & 256) != 0 ? lessonDto2.state : valueDescriptor, (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? lessonDto2.homeworkEditedByStudentEnabled : z, (i3 & 1024) != 0 ? lessonDto2.topic : str5, (i3 & 2048) != 0 ? lessonDto2.name : str6, (i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? lessonDto2.reportedExamUids : list, (i3 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? lessonDto2.homeWorkUid : str7, (i3 & 16384) != 0 ? lessonDto2.type : valueDescriptor2, (i3 & 32768) != 0 ? lessonDto2.subject : subject2, (i3 & 65536) != 0 ? lessonDto2.classGroup : uidNameStructure, (i3 & 131072) != 0 ? lessonDto2.presence : valueDescriptor3);
    }

    public final String component1() {
        return this.uid;
    }

    public final boolean component10() {
        return this.homeworkEditedByStudentEnabled;
    }

    public final String component11() {
        return this.topic;
    }

    public final String component12() {
        return this.name;
    }

    public final List<String> component13() {
        return this.reportedExamUids;
    }

    public final String component14() {
        return this.homeWorkUid;
    }

    public final Integer component2() {
        return this.classScheduleNumber;
    }

    public final Calendar component3() {
        return this.date;
    }

    public final Calendar component4() {
        return this.startTime;
    }

    public final Calendar component5() {
        return this.endTime;
    }

    public final String component6() {
        return this.classroom;
    }

    public final String component7() {
        return this.teacher;
    }

    public final String component8() {
        return this.supplyTeacher;
    }

    public final ValueDescriptor component9() {
        return this.state;
    }

    public final LessonDto copy(String str, Integer num, Calendar calendar, Calendar calendar2, Calendar calendar3, String str2, String str3, String str4, ValueDescriptor valueDescriptor, boolean z, String str5, String str6, List<String> list, String str7, ValueDescriptor valueDescriptor2, Subject subject2, UidNameStructure uidNameStructure, ValueDescriptor valueDescriptor3) {
        String str8 = str;
        Intrinsics.checkParameterIsNotNull(str8, "uid");
        Intrinsics.checkParameterIsNotNull(calendar, "date");
        Intrinsics.checkParameterIsNotNull(calendar2, "startTime");
        Intrinsics.checkParameterIsNotNull(calendar3, "endTime");
        Intrinsics.checkParameterIsNotNull(valueDescriptor, "state");
        Intrinsics.checkParameterIsNotNull(list, "reportedExamUids");
        Intrinsics.checkParameterIsNotNull(valueDescriptor2, "type");
        Intrinsics.checkParameterIsNotNull(subject2, "subject");
        Intrinsics.checkParameterIsNotNull(uidNameStructure, "classGroup");
        return new LessonDto(str8, num, calendar, calendar2, calendar3, str2, str3, str4, valueDescriptor, z, str5, str6, list, str7, valueDescriptor2, subject2, uidNameStructure, valueDescriptor3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LessonDto) {
                LessonDto lessonDto = (LessonDto) obj;
                if (Intrinsics.areEqual((Object) this.uid, (Object) lessonDto.uid) && Intrinsics.areEqual((Object) this.classScheduleNumber, (Object) lessonDto.classScheduleNumber) && Intrinsics.areEqual((Object) this.date, (Object) lessonDto.date) && Intrinsics.areEqual((Object) this.startTime, (Object) lessonDto.startTime) && Intrinsics.areEqual((Object) this.endTime, (Object) lessonDto.endTime) && Intrinsics.areEqual((Object) this.classroom, (Object) lessonDto.classroom) && Intrinsics.areEqual((Object) this.teacher, (Object) lessonDto.teacher) && Intrinsics.areEqual((Object) this.supplyTeacher, (Object) lessonDto.supplyTeacher) && Intrinsics.areEqual((Object) this.state, (Object) lessonDto.state)) {
                    if (!(this.homeworkEditedByStudentEnabled == lessonDto.homeworkEditedByStudentEnabled) || !Intrinsics.areEqual((Object) this.topic, (Object) lessonDto.topic) || !Intrinsics.areEqual((Object) this.name, (Object) lessonDto.name) || !Intrinsics.areEqual((Object) this.reportedExamUids, (Object) lessonDto.reportedExamUids) || !Intrinsics.areEqual((Object) this.homeWorkUid, (Object) lessonDto.homeWorkUid) || !Intrinsics.areEqual((Object) this.type, (Object) lessonDto.type) || !Intrinsics.areEqual((Object) this.subject, (Object) lessonDto.subject) || !Intrinsics.areEqual((Object) this.classGroup, (Object) lessonDto.classGroup) || !Intrinsics.areEqual((Object) this.presence, (Object) lessonDto.presence)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final Integer getClassScheduleNumber() {
        return this.classScheduleNumber;
    }

    public final String getClassroom() {
        return this.classroom;
    }

    public final Calendar getDate() {
        return this.date;
    }

    public final Calendar getEndTime() {
        return this.endTime;
    }

    public final String getGroupName() {
        return this.classGroup.getName();
    }

    public final String getGroupUid() {
        return this.classGroup.getUid();
    }

    public final String getHomeWorkUid() {
        return this.homeWorkUid;
    }

    public final boolean getHomeworkEditedByStudentEnabled() {
        return this.homeworkEditedByStudentEnabled;
    }

    public final String getLessonTypeDescription() {
        return this.type.getDescription();
    }

    public final String getLessonTypeName() {
        return this.type.getName();
    }

    public final String getName() {
        return this.name;
    }

    public final String getPresenceTypeDescription() {
        ValueDescriptor valueDescriptor = this.presence;
        if (valueDescriptor != null) {
            return valueDescriptor.getDescription();
        }
        return null;
    }

    public final String getPresenceTypeName() {
        ValueDescriptor valueDescriptor = this.presence;
        if (valueDescriptor != null) {
            return valueDescriptor.getName();
        }
        return null;
    }

    public final List<String> getReportedExamUids() {
        return this.reportedExamUids;
    }

    public final Calendar getStartTime() {
        return this.startTime;
    }

    public final ValueDescriptor getState() {
        return this.state;
    }

    public final String getStateDescription() {
        return this.state.getDescription();
    }

    public final String getStateName() {
        return this.state.getName();
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

    public final String getSupplyTeacher() {
        return this.supplyTeacher;
    }

    public final String getTeacher() {
        return this.teacher;
    }

    public final String getTopic() {
        return this.topic;
    }

    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        String str = this.uid;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.classScheduleNumber;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        Calendar calendar = this.date;
        int hashCode3 = (hashCode2 + (calendar != null ? calendar.hashCode() : 0)) * 31;
        Calendar calendar2 = this.startTime;
        int hashCode4 = (hashCode3 + (calendar2 != null ? calendar2.hashCode() : 0)) * 31;
        Calendar calendar3 = this.endTime;
        int hashCode5 = (hashCode4 + (calendar3 != null ? calendar3.hashCode() : 0)) * 31;
        String str2 = this.classroom;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.teacher;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.supplyTeacher;
        int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31;
        ValueDescriptor valueDescriptor = this.state;
        int hashCode9 = (hashCode8 + (valueDescriptor != null ? valueDescriptor.hashCode() : 0)) * 31;
        boolean z = this.homeworkEditedByStudentEnabled;
        if (z) {
            z = true;
        }
        int i3 = (hashCode9 + (z ? 1 : 0)) * 31;
        String str5 = this.topic;
        int hashCode10 = (i3 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.name;
        int hashCode11 = (hashCode10 + (str6 != null ? str6.hashCode() : 0)) * 31;
        List<String> list = this.reportedExamUids;
        int hashCode12 = (hashCode11 + (list != null ? list.hashCode() : 0)) * 31;
        String str7 = this.homeWorkUid;
        int hashCode13 = (hashCode12 + (str7 != null ? str7.hashCode() : 0)) * 31;
        ValueDescriptor valueDescriptor2 = this.type;
        int hashCode14 = (hashCode13 + (valueDescriptor2 != null ? valueDescriptor2.hashCode() : 0)) * 31;
        Subject subject2 = this.subject;
        int hashCode15 = (hashCode14 + (subject2 != null ? subject2.hashCode() : 0)) * 31;
        UidNameStructure uidNameStructure = this.classGroup;
        int hashCode16 = (hashCode15 + (uidNameStructure != null ? uidNameStructure.hashCode() : 0)) * 31;
        ValueDescriptor valueDescriptor3 = this.presence;
        if (valueDescriptor3 != null) {
            i2 = valueDescriptor3.hashCode();
        }
        return hashCode16 + i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("LessonDto(uid=");
        a2.append(this.uid);
        a2.append(", classScheduleNumber=");
        a2.append(this.classScheduleNumber);
        a2.append(", date=");
        a2.append(this.date);
        a2.append(", startTime=");
        a2.append(this.startTime);
        a2.append(", endTime=");
        a2.append(this.endTime);
        a2.append(", classroom=");
        a2.append(this.classroom);
        a2.append(", teacher=");
        a2.append(this.teacher);
        a2.append(", supplyTeacher=");
        a2.append(this.supplyTeacher);
        a2.append(", state=");
        a2.append(this.state);
        a2.append(", homeworkEditedByStudentEnabled=");
        a2.append(this.homeworkEditedByStudentEnabled);
        a2.append(", topic=");
        a2.append(this.topic);
        a2.append(", name=");
        a2.append(this.name);
        a2.append(", reportedExamUids=");
        a2.append(this.reportedExamUids);
        a2.append(", homeWorkUid=");
        a2.append(this.homeWorkUid);
        a2.append(", type=");
        a2.append(this.type);
        a2.append(", subject=");
        a2.append(this.subject);
        a2.append(", classGroup=");
        a2.append(this.classGroup);
        a2.append(", presence=");
        a2.append(this.presence);
        a2.append(")");
        return a2.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ LessonDto(java.lang.String r22, java.lang.Integer r23, java.util.Calendar r24, java.util.Calendar r25, java.util.Calendar r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, hu.ekreta.ellenorzo.rest.mobileapi.v3.LessonDto.ValueDescriptor r30, boolean r31, java.lang.String r32, java.lang.String r33, java.util.List r34, java.lang.String r35, hu.ekreta.ellenorzo.rest.mobileapi.v3.LessonDto.ValueDescriptor r36, hu.ekreta.ellenorzo.rest.mobileapi.v3.LessonDto.Subject r37, hu.ekreta.ellenorzo.rest.mobileapi.v3.LessonDto.UidNameStructure r38, hu.ekreta.ellenorzo.rest.mobileapi.v3.LessonDto.ValueDescriptor r39, int r40, kotlin.jvm.internal.DefaultConstructorMarker r41) {
        /*
            r21 = this;
            r0 = r40
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x000c
            java.util.List r1 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
            r15 = r1
            goto L_0x000e
        L_0x000c:
            r15 = r34
        L_0x000e:
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0017
            r0 = 0
            r20 = r0
            goto L_0x0019
        L_0x0017:
            r20 = r39
        L_0x0019:
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r30
            r12 = r31
            r13 = r32
            r14 = r33
            r16 = r35
            r17 = r36
            r18 = r37
            r19 = r38
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.rest.mobileapi.v3.LessonDto.<init>(java.lang.String, java.lang.Integer, java.util.Calendar, java.util.Calendar, java.util.Calendar, java.lang.String, java.lang.String, java.lang.String, hu.ekreta.ellenorzo.rest.mobileapi.v3.LessonDto$ValueDescriptor, boolean, java.lang.String, java.lang.String, java.util.List, java.lang.String, hu.ekreta.ellenorzo.rest.mobileapi.v3.LessonDto$ValueDescriptor, hu.ekreta.ellenorzo.rest.mobileapi.v3.LessonDto$Subject, hu.ekreta.ellenorzo.rest.mobileapi.v3.LessonDto$UidNameStructure, hu.ekreta.ellenorzo.rest.mobileapi.v3.LessonDto$ValueDescriptor, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
