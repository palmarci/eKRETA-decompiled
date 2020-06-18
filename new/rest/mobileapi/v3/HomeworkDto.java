package hu.ekreta.ellenorzo.rest.mobileapi.v3;

import a.b.a.a.a;
import a.h.c.z.c;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001/Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0010HÂ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J{\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010*\u001a\u00020\u00072\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\f\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0002X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000e\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0018R\u0016\u0010\r\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0018R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0018R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017¨\u00060"}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/HomeworkDto;", "", "uid", "", "subjectName", "recorderTeacherName", "isTeacherRecorded", "", "text", "recordDate", "Ljava/util/Calendar;", "deadlineDate", "createDate", "isStudentHomeworkEnabled", "isDone", "group", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/HomeworkDto$UidStructure;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/util/Calendar;ZZLhu/ekreta/ellenorzo/rest/mobileapi/v3/HomeworkDto$UidStructure;)V", "getCreateDate", "()Ljava/util/Calendar;", "getDeadlineDate", "groupUid", "getGroupUid", "()Ljava/lang/String;", "()Z", "getRecordDate", "getRecorderTeacherName", "getSubjectName", "getText", "getUid", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "UidStructure", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: HomeworkDto.kt */
public final class HomeworkDto {
    @c("RogzitesIdopontja")
    public final Calendar createDate;
    @c("HataridoDatuma")
    public final Calendar deadlineDate;
    @c("OsztalyCsoport")
    public final UidStructure group;
    @c("IsMegoldva")
    public final boolean isDone;
    @c("IsTanuloHaziFeladatEnabled")
    public final boolean isStudentHomeworkEnabled;
    @c("IsTanarRogzitette")
    public final boolean isTeacherRecorded;
    @c("FeladasDatuma")
    public final Calendar recordDate;
    @c("RogzitoTanarNeve")
    public final String recorderTeacherName;
    @c("TantargyNeve")
    public final String subjectName;
    @c("Szoveg")
    public final String text;
    @c("Uid")
    public final String uid;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/HomeworkDto$UidStructure;", "", "uid", "", "(Ljava/lang/String;)V", "getUid", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: HomeworkDto.kt */
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

    public HomeworkDto(String str, String str2, String str3, boolean z, String str4, Calendar calendar, Calendar calendar2, Calendar calendar3, boolean z2, boolean z3, UidStructure uidStructure) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(str2, "subjectName");
        Intrinsics.checkParameterIsNotNull(str3, "recorderTeacherName");
        Intrinsics.checkParameterIsNotNull(calendar, "recordDate");
        Intrinsics.checkParameterIsNotNull(calendar2, "deadlineDate");
        Intrinsics.checkParameterIsNotNull(calendar3, "createDate");
        this.uid = str;
        this.subjectName = str2;
        this.recorderTeacherName = str3;
        this.isTeacherRecorded = z;
        this.text = str4;
        this.recordDate = calendar;
        this.deadlineDate = calendar2;
        this.createDate = calendar3;
        this.isStudentHomeworkEnabled = z2;
        this.isDone = z3;
        this.group = uidStructure;
    }

    private final UidStructure component11() {
        return this.group;
    }

    public static /* synthetic */ HomeworkDto copy$default(HomeworkDto homeworkDto, String str, String str2, String str3, boolean z, String str4, Calendar calendar, Calendar calendar2, Calendar calendar3, boolean z2, boolean z3, UidStructure uidStructure, int i2, Object obj) {
        HomeworkDto homeworkDto2 = homeworkDto;
        int i3 = i2;
        return homeworkDto.copy((i3 & 1) != 0 ? homeworkDto2.uid : str, (i3 & 2) != 0 ? homeworkDto2.subjectName : str2, (i3 & 4) != 0 ? homeworkDto2.recorderTeacherName : str3, (i3 & 8) != 0 ? homeworkDto2.isTeacherRecorded : z, (i3 & 16) != 0 ? homeworkDto2.text : str4, (i3 & 32) != 0 ? homeworkDto2.recordDate : calendar, (i3 & 64) != 0 ? homeworkDto2.deadlineDate : calendar2, (i3 & 128) != 0 ? homeworkDto2.createDate : calendar3, (i3 & 256) != 0 ? homeworkDto2.isStudentHomeworkEnabled : z2, (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? homeworkDto2.isDone : z3, (i3 & 1024) != 0 ? homeworkDto2.group : uidStructure);
    }

    public final String component1() {
        return this.uid;
    }

    public final boolean component10() {
        return this.isDone;
    }

    public final String component2() {
        return this.subjectName;
    }

    public final String component3() {
        return this.recorderTeacherName;
    }

    public final boolean component4() {
        return this.isTeacherRecorded;
    }

    public final String component5() {
        return this.text;
    }

    public final Calendar component6() {
        return this.recordDate;
    }

    public final Calendar component7() {
        return this.deadlineDate;
    }

    public final Calendar component8() {
        return this.createDate;
    }

    public final boolean component9() {
        return this.isStudentHomeworkEnabled;
    }

    public final HomeworkDto copy(String str, String str2, String str3, boolean z, String str4, Calendar calendar, Calendar calendar2, Calendar calendar3, boolean z2, boolean z3, UidStructure uidStructure) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(str2, "subjectName");
        String str5 = str3;
        Intrinsics.checkParameterIsNotNull(str5, "recorderTeacherName");
        Calendar calendar4 = calendar;
        Intrinsics.checkParameterIsNotNull(calendar4, "recordDate");
        Calendar calendar5 = calendar2;
        Intrinsics.checkParameterIsNotNull(calendar5, "deadlineDate");
        Calendar calendar6 = calendar3;
        Intrinsics.checkParameterIsNotNull(calendar6, "createDate");
        return new HomeworkDto(str, str2, str5, z, str4, calendar4, calendar5, calendar6, z2, z3, uidStructure);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HomeworkDto) {
                HomeworkDto homeworkDto = (HomeworkDto) obj;
                if (Intrinsics.areEqual((Object) this.uid, (Object) homeworkDto.uid) && Intrinsics.areEqual((Object) this.subjectName, (Object) homeworkDto.subjectName) && Intrinsics.areEqual((Object) this.recorderTeacherName, (Object) homeworkDto.recorderTeacherName)) {
                    if ((this.isTeacherRecorded == homeworkDto.isTeacherRecorded) && Intrinsics.areEqual((Object) this.text, (Object) homeworkDto.text) && Intrinsics.areEqual((Object) this.recordDate, (Object) homeworkDto.recordDate) && Intrinsics.areEqual((Object) this.deadlineDate, (Object) homeworkDto.deadlineDate) && Intrinsics.areEqual((Object) this.createDate, (Object) homeworkDto.createDate)) {
                        if (this.isStudentHomeworkEnabled == homeworkDto.isStudentHomeworkEnabled) {
                            if (!(this.isDone == homeworkDto.isDone) || !Intrinsics.areEqual((Object) this.group, (Object) homeworkDto.group)) {
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final Calendar getCreateDate() {
        return this.createDate;
    }

    public final Calendar getDeadlineDate() {
        return this.deadlineDate;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.getUid();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getGroupUid() {
        /*
            r1 = this;
            hu.ekreta.ellenorzo.rest.mobileapi.v3.HomeworkDto$UidStructure r0 = r1.group
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r0.getUid()
            if (r0 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            java.lang.String r0 = ""
        L_0x000d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.rest.mobileapi.v3.HomeworkDto.getGroupUid():java.lang.String");
    }

    public final Calendar getRecordDate() {
        return this.recordDate;
    }

    public final String getRecorderTeacherName() {
        return this.recorderTeacherName;
    }

    public final String getSubjectName() {
        return this.subjectName;
    }

    public final String getText() {
        return this.text;
    }

    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        String str = this.uid;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.subjectName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.recorderTeacherName;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.isTeacherRecorded;
        if (z) {
            z = true;
        }
        int i3 = (hashCode3 + (z ? 1 : 0)) * 31;
        String str4 = this.text;
        int hashCode4 = (i3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Calendar calendar = this.recordDate;
        int hashCode5 = (hashCode4 + (calendar != null ? calendar.hashCode() : 0)) * 31;
        Calendar calendar2 = this.deadlineDate;
        int hashCode6 = (hashCode5 + (calendar2 != null ? calendar2.hashCode() : 0)) * 31;
        Calendar calendar3 = this.createDate;
        int hashCode7 = (hashCode6 + (calendar3 != null ? calendar3.hashCode() : 0)) * 31;
        boolean z2 = this.isStudentHomeworkEnabled;
        if (z2) {
            z2 = true;
        }
        int i4 = (hashCode7 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.isDone;
        if (z3) {
            z3 = true;
        }
        int i5 = (i4 + (z3 ? 1 : 0)) * 31;
        UidStructure uidStructure = this.group;
        if (uidStructure != null) {
            i2 = uidStructure.hashCode();
        }
        return i5 + i2;
    }

    public final boolean isDone() {
        return this.isDone;
    }

    public final boolean isStudentHomeworkEnabled() {
        return this.isStudentHomeworkEnabled;
    }

    public final boolean isTeacherRecorded() {
        return this.isTeacherRecorded;
    }

    public String toString() {
        StringBuilder a2 = a.a("HomeworkDto(uid=");
        a2.append(this.uid);
        a2.append(", subjectName=");
        a2.append(this.subjectName);
        a2.append(", recorderTeacherName=");
        a2.append(this.recorderTeacherName);
        a2.append(", isTeacherRecorded=");
        a2.append(this.isTeacherRecorded);
        a2.append(", text=");
        a2.append(this.text);
        a2.append(", recordDate=");
        a2.append(this.recordDate);
        a2.append(", deadlineDate=");
        a2.append(this.deadlineDate);
        a2.append(", createDate=");
        a2.append(this.createDate);
        a2.append(", isStudentHomeworkEnabled=");
        a2.append(this.isStudentHomeworkEnabled);
        a2.append(", isDone=");
        a2.append(this.isDone);
        a2.append(", group=");
        a2.append(this.group);
        a2.append(")");
        return a2.toString();
    }
}
