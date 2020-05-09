package p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3;

import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p349io.ConstantsKt;
import p000a.p020b.p021a.p022a.C0082a;
import p000a.p054h.p159c.p166z.C2580c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bJ\b\b\u0018\u00002\u00020\u0001:\u0004`abcB¯\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u001cJ\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0010HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u000eHÂ\u0003J\t\u0010O\u001a\u00020\u0018HÂ\u0003J\t\u0010P\u001a\u00020\u001aHÂ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u000eHÂ\u0003J\u0010\u0010R\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001eJ\t\u0010S\u001a\u00020\u0007HÆ\u0003J\t\u0010T\u001a\u00020\u0007HÆ\u0003J\t\u0010U\u001a\u00020\u0007HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u000eHÆ\u0003JØ\u0001\u0010Z\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u000e2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010[J\u0013\u0010\\\u001a\u00020\u00102\b\u0010]\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010^\u001a\u00020\u0005HÖ\u0001J\t\u0010_\u001a\u00020\u0003HÖ\u0001R\u0010\u0010\u0019\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0013\u0010%\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b&\u0010!R\u0013\u0010'\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b(\u0010!R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010,\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b-\u0010!R\u0011\u0010.\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b/\u0010!R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010!R\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u000e8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0013\u00101\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b2\u0010!R\u0013\u00103\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b4\u0010!R\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00148\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010#R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010:\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b;\u0010!R\u0011\u0010<\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b=\u0010!R\u0010\u0010\u0017\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010>\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b?\u0010!R\u0011\u0010@\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bA\u0010!R\u0011\u0010B\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bC\u0010!R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010!R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010!R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010!R\u0010\u0010\u0016\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010!¨\u0006d"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto;", "", "uid", "", "classScheduleNumber", "", "date", "Ljava/util/Calendar;", "startTime", "endTime", "classroom", "teacher", "supplyTeacher", "state", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto$ValueDescriptor;", "homeworkEditedByStudentEnabled", "", "topic", "name", "reportedExamUids", "", "homeWorkUid", "type", "subject", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto$Subject;", "classGroup", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto$UidNameStructure;", "presence", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto$ValueDescriptor;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto$ValueDescriptor;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto$Subject;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto$UidNameStructure;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto$ValueDescriptor;)V", "getClassScheduleNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getClassroom", "()Ljava/lang/String;", "getDate", "()Ljava/util/Calendar;", "getEndTime", "groupName", "getGroupName", "groupUid", "getGroupUid", "getHomeWorkUid", "getHomeworkEditedByStudentEnabled", "()Z", "lessonTypeDescription", "getLessonTypeDescription", "lessonTypeName", "getLessonTypeName", "getName", "presenceTypeDescription", "getPresenceTypeDescription", "presenceTypeName", "getPresenceTypeName", "getReportedExamUids", "()Ljava/util/List;", "getStartTime", "getState", "()Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto$ValueDescriptor;", "stateDescription", "getStateDescription", "stateName", "getStateName", "subjectCategoryDescription", "getSubjectCategoryDescription", "subjectCategoryName", "getSubjectCategoryName", "subjectName", "getSubjectName", "getSupplyTeacher", "getTeacher", "getTopic", "getUid", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto$ValueDescriptor;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto$ValueDescriptor;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto$Subject;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto$UidNameStructure;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto$ValueDescriptor;)Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto;", "equals", "other", "hashCode", "toString", "Subject", "UidNameStructure", "UidStructure", "ValueDescriptor", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.rest.mobileapi.v3.LessonDto */
/* compiled from: LessonDto.kt */
public final class LessonDto {
    @C2580c("OsztalyCsoport")
    public final UidNameStructure classGroup;
    @C2580c("Oraszam")
    public final Integer classScheduleNumber;
    @C2580c("TeremNeve")
    public final String classroom;
    @C2580c("Datum")
    public final Calendar date;
    @C2580c("VegIdopont")
    public final Calendar endTime;
    @C2580c("HaziFeladatUid")
    public final String homeWorkUid;
    @C2580c("IsTanuloHaziFeladatEnabled")
    public final boolean homeworkEditedByStudentEnabled;
    @C2580c("Nev")
    public final String name;
    @C2580c("TanuloJelenlet")
    public final ValueDescriptor presence;
    @C2580c("BejelentettSzamonkeresUids")
    public final List<String> reportedExamUids;
    @C2580c("KezdetIdopont")
    public final Calendar startTime;
    @C2580c("Allapot")
    public final ValueDescriptor state;
    @C2580c("Tantargy")
    public final Subject subject;
    @C2580c("HelyettesTanarNeve")
    public final String supplyTeacher;
    @C2580c("TanarNeve")
    public final String teacher;
    @C2580c("Tema")
    public final String topic;
    @C2580c("Tipus")
    public final ValueDescriptor type;
    @C2580c("Uid")
    public final String uid;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto$Subject;", "", "uid", "", "subjectCategory", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto$ValueDescriptor;", "name", "(Ljava/lang/String;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto$ValueDescriptor;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getSubjectCategory", "()Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto$ValueDescriptor;", "getUid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.rest.mobileapi.v3.LessonDto$Subject */
    /* compiled from: LessonDto.kt */
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
                boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.LessonDto.Subject
                if (r0 == 0) goto L_0x0027
                hu.ekreta.ellenorzo.rest.mobileapi.v3.LessonDto$Subject r3 = (p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.LessonDto.Subject) r3
                java.lang.String r0 = r2.uid
                java.lang.String r1 = r3.uid
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x0027
                hu.ekreta.ellenorzo.rest.mobileapi.v3.LessonDto$ValueDescriptor r0 = r2.subjectCategory
                hu.ekreta.ellenorzo.rest.mobileapi.v3.LessonDto$ValueDescriptor r1 = r3.subjectCategory
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
            throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.LessonDto.Subject.equals(java.lang.Object):boolean");
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

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto$UidNameStructure;", "", "uid", "", "name", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getUid", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.rest.mobileapi.v3.LessonDto$UidNameStructure */
    /* compiled from: LessonDto.kt */
    public static final class UidNameStructure {
        @C2580c("Nev")
        public final String name;
        @C2580c("Uid")
        public final String uid;

        public UidNameStructure(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "uid");
            Intrinsics.checkParameterIsNotNull(str2, "name");
            this.uid = str;
            this.name = str2;
        }

        public static /* synthetic */ UidNameStructure copy$default(UidNameStructure uidNameStructure, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uidNameStructure.uid;
            }
            if ((i & 2) != 0) {
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

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.name, (java.lang.Object) r3.name) != false) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x001f
                boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.LessonDto.UidNameStructure
                if (r0 == 0) goto L_0x001d
                hu.ekreta.ellenorzo.rest.mobileapi.v3.LessonDto$UidNameStructure r3 = (p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.LessonDto.UidNameStructure) r3
                java.lang.String r0 = r2.uid
                java.lang.String r1 = r3.uid
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x001d
                java.lang.String r0 = r2.name
                java.lang.String r3 = r3.name
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
                if (r3 == 0) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r3 = 0
                return r3
            L_0x001f:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.LessonDto.UidNameStructure.equals(java.lang.Object):boolean");
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
            String str2 = this.name;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder a = C0082a.m111a("UidNameStructure(uid=");
            a.append(this.uid);
            a.append(", name=");
            return C0082a.m106a(a, this.name, ")");
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto$UidStructure;", "", "uid", "", "(Ljava/lang/String;)V", "getUid", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.rest.mobileapi.v3.LessonDto$UidStructure */
    /* compiled from: LessonDto.kt */
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
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.uid, (java.lang.Object) ((p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.LessonDto.UidStructure) r2).uid) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.LessonDto.UidStructure
                if (r0 == 0) goto L_0x0013
                hu.ekreta.ellenorzo.rest.mobileapi.v3.LessonDto$UidStructure r2 = (p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.LessonDto.UidStructure) r2
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
            throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.LessonDto.UidStructure.equals(java.lang.Object):boolean");
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

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto$ValueDescriptor;", "", "uid", "", "description", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getName", "getUid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.rest.mobileapi.v3.LessonDto$ValueDescriptor */
    /* compiled from: LessonDto.kt */
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
                boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.LessonDto.ValueDescriptor
                if (r0 == 0) goto L_0x0027
                hu.ekreta.ellenorzo.rest.mobileapi.v3.LessonDto$ValueDescriptor r3 = (p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.LessonDto.ValueDescriptor) r3
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
            throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.LessonDto.ValueDescriptor.equals(java.lang.Object):boolean");
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

    public LessonDto(String str, Integer num, Calendar calendar, Calendar calendar2, Calendar calendar3, String str2, String str3, String str4, ValueDescriptor valueDescriptor, boolean z, String str5, String str6, List<String> list, String str7, ValueDescriptor valueDescriptor2, Subject subject2, UidNameStructure uidNameStructure, ValueDescriptor valueDescriptor3) {
        String str8 = str;
        Calendar calendar4 = calendar;
        Calendar calendar5 = calendar2;
        Calendar calendar6 = calendar3;
        ValueDescriptor valueDescriptor4 = valueDescriptor;
        List<String> list2 = list;
        ValueDescriptor valueDescriptor5 = valueDescriptor2;
        Subject subject3 = subject2;
        UidNameStructure uidNameStructure2 = uidNameStructure;
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(calendar, "date");
        Intrinsics.checkParameterIsNotNull(calendar2, "startTime");
        Intrinsics.checkParameterIsNotNull(calendar6, "endTime");
        Intrinsics.checkParameterIsNotNull(valueDescriptor4, "state");
        Intrinsics.checkParameterIsNotNull(list2, "reportedExamUids");
        Intrinsics.checkParameterIsNotNull(valueDescriptor5, "type");
        Intrinsics.checkParameterIsNotNull(subject3, "subject");
        Intrinsics.checkParameterIsNotNull(uidNameStructure2, "classGroup");
        this.uid = str8;
        this.classScheduleNumber = num;
        this.date = calendar4;
        this.startTime = calendar5;
        this.endTime = calendar6;
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

    public static /* synthetic */ LessonDto copy$default(LessonDto lessonDto, String str, Integer num, Calendar calendar, Calendar calendar2, Calendar calendar3, String str2, String str3, String str4, ValueDescriptor valueDescriptor, boolean z, String str5, String str6, List list, String str7, ValueDescriptor valueDescriptor2, Subject subject2, UidNameStructure uidNameStructure, ValueDescriptor valueDescriptor3, int i, Object obj) {
        LessonDto lessonDto2 = lessonDto;
        int i2 = i;
        return lessonDto.copy((i2 & 1) != 0 ? lessonDto2.uid : str, (i2 & 2) != 0 ? lessonDto2.classScheduleNumber : num, (i2 & 4) != 0 ? lessonDto2.date : calendar, (i2 & 8) != 0 ? lessonDto2.startTime : calendar2, (i2 & 16) != 0 ? lessonDto2.endTime : calendar3, (i2 & 32) != 0 ? lessonDto2.classroom : str2, (i2 & 64) != 0 ? lessonDto2.teacher : str3, (i2 & 128) != 0 ? lessonDto2.supplyTeacher : str4, (i2 & 256) != 0 ? lessonDto2.state : valueDescriptor, (i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? lessonDto2.homeworkEditedByStudentEnabled : z, (i2 & 1024) != 0 ? lessonDto2.topic : str5, (i2 & 2048) != 0 ? lessonDto2.name : str6, (i2 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? lessonDto2.reportedExamUids : list, (i2 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? lessonDto2.homeWorkUid : str7, (i2 & 16384) != 0 ? lessonDto2.type : valueDescriptor2, (i2 & 32768) != 0 ? lessonDto2.subject : subject2, (i2 & 65536) != 0 ? lessonDto2.classGroup : uidNameStructure, (i2 & 131072) != 0 ? lessonDto2.presence : valueDescriptor3);
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
        Integer num2 = num;
        Calendar calendar4 = calendar;
        Calendar calendar5 = calendar2;
        Calendar calendar6 = calendar3;
        String str9 = str2;
        String str10 = str3;
        String str11 = str4;
        ValueDescriptor valueDescriptor4 = valueDescriptor;
        boolean z2 = z;
        String str12 = str5;
        String str13 = str6;
        List<String> list2 = list;
        String str14 = str7;
        ValueDescriptor valueDescriptor5 = valueDescriptor2;
        Subject subject3 = subject2;
        UidNameStructure uidNameStructure2 = uidNameStructure;
        ValueDescriptor valueDescriptor6 = valueDescriptor3;
        String str15 = str8;
        Intrinsics.checkParameterIsNotNull(str8, "uid");
        Intrinsics.checkParameterIsNotNull(calendar, "date");
        Intrinsics.checkParameterIsNotNull(calendar2, "startTime");
        Intrinsics.checkParameterIsNotNull(calendar3, "endTime");
        Intrinsics.checkParameterIsNotNull(valueDescriptor, "state");
        Intrinsics.checkParameterIsNotNull(list, "reportedExamUids");
        Intrinsics.checkParameterIsNotNull(valueDescriptor2, "type");
        Intrinsics.checkParameterIsNotNull(subject2, "subject");
        Intrinsics.checkParameterIsNotNull(uidNameStructure, "classGroup");
        LessonDto lessonDto = new LessonDto(str15, num2, calendar4, calendar5, calendar6, str9, str10, str11, valueDescriptor4, z2, str12, str13, list2, str14, valueDescriptor5, subject3, uidNameStructure2, valueDescriptor6);
        return lessonDto;
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
        int i = 0;
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
        int i2 = (hashCode9 + (z ? 1 : 0)) * 31;
        String str5 = this.topic;
        int hashCode10 = (i2 + (str5 != null ? str5.hashCode() : 0)) * 31;
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
            i = valueDescriptor3.hashCode();
        }
        return hashCode16 + i;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("LessonDto(uid=");
        a.append(this.uid);
        a.append(", classScheduleNumber=");
        a.append(this.classScheduleNumber);
        a.append(", date=");
        a.append(this.date);
        a.append(", startTime=");
        a.append(this.startTime);
        a.append(", endTime=");
        a.append(this.endTime);
        a.append(", classroom=");
        a.append(this.classroom);
        a.append(", teacher=");
        a.append(this.teacher);
        a.append(", supplyTeacher=");
        a.append(this.supplyTeacher);
        a.append(", state=");
        a.append(this.state);
        a.append(", homeworkEditedByStudentEnabled=");
        a.append(this.homeworkEditedByStudentEnabled);
        a.append(", topic=");
        a.append(this.topic);
        a.append(", name=");
        a.append(this.name);
        a.append(", reportedExamUids=");
        a.append(this.reportedExamUids);
        a.append(", homeWorkUid=");
        a.append(this.homeWorkUid);
        a.append(", type=");
        a.append(this.type);
        a.append(", subject=");
        a.append(this.subject);
        a.append(", classGroup=");
        a.append(this.classGroup);
        a.append(", presence=");
        a.append(this.presence);
        a.append(")");
        return a.toString();
    }

    public /* synthetic */ LessonDto(String str, Integer num, Calendar calendar, Calendar calendar2, Calendar calendar3, String str2, String str3, String str4, ValueDescriptor valueDescriptor, boolean z, String str5, String str6, List list, String str7, ValueDescriptor valueDescriptor2, Subject subject2, UidNameStructure uidNameStructure, ValueDescriptor valueDescriptor3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = i;
        this(str, num, calendar, calendar2, calendar3, str2, str3, str4, valueDescriptor, z, str5, str6, (i2 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, str7, valueDescriptor2, subject2, uidNameStructure, (i2 & 131072) != 0 ? null : valueDescriptor3);
    }
}
