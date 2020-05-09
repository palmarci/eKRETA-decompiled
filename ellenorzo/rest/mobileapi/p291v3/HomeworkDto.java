package p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3;

import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p349io.ConstantsKt;
import p000a.p020b.p021a.p022a.C0082a;
import p000a.p054h.p159c.p166z.C2580c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001-BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000fHÂ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003Jq\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010(\u001a\u00020\u00072\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\f\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0014\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\r\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0017R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0017R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016¨\u0006."}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/HomeworkDto;", "", "uid", "", "subjectName", "recorderTeacherName", "isTeacherRecorded", "", "text", "recordDate", "Ljava/util/Calendar;", "deadlineDate", "createDate", "isStudentHomeworkEnabled", "group", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/HomeworkDto$UidStructure;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/util/Calendar;ZLhu/ekreta/ellenorzo/rest/mobileapi/v3/HomeworkDto$UidStructure;)V", "getCreateDate", "()Ljava/util/Calendar;", "getDeadlineDate", "groupUid", "getGroupUid", "()Ljava/lang/String;", "()Z", "getRecordDate", "getRecorderTeacherName", "getSubjectName", "getText", "getUid", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "UidStructure", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.rest.mobileapi.v3.HomeworkDto */
/* compiled from: HomeworkDto.kt */
public final class HomeworkDto {
    @C2580c("RogzitesIdopontja")
    public final Calendar createDate;
    @C2580c("HataridoDatuma")
    public final Calendar deadlineDate;
    @C2580c("OsztalyCsoport")
    public final UidStructure group;
    @C2580c("IsTanuloHaziFeladatEnabled")
    public final boolean isStudentHomeworkEnabled;
    @C2580c("IsTanarRogzitette")
    public final boolean isTeacherRecorded;
    @C2580c("FeladasDatuma")
    public final Calendar recordDate;
    @C2580c("RogzitoTanarNeve")
    public final String recorderTeacherName;
    @C2580c("TantargyNeve")
    public final String subjectName;
    @C2580c("Szoveg")
    public final String text;
    @C2580c("Uid")
    public final String uid;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/HomeworkDto$UidStructure;", "", "uid", "", "(Ljava/lang/String;)V", "getUid", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.rest.mobileapi.v3.HomeworkDto$UidStructure */
    /* compiled from: HomeworkDto.kt */
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
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.uid, (java.lang.Object) ((p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.HomeworkDto.UidStructure) r2).uid) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.HomeworkDto.UidStructure
                if (r0 == 0) goto L_0x0013
                hu.ekreta.ellenorzo.rest.mobileapi.v3.HomeworkDto$UidStructure r2 = (p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.HomeworkDto.UidStructure) r2
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
            throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.HomeworkDto.UidStructure.equals(java.lang.Object):boolean");
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

    public HomeworkDto(String str, String str2, String str3, boolean z, String str4, Calendar calendar, Calendar calendar2, Calendar calendar3, boolean z2, UidStructure uidStructure) {
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
        this.group = uidStructure;
    }

    private final UidStructure component10() {
        return this.group;
    }

    public static /* synthetic */ HomeworkDto copy$default(HomeworkDto homeworkDto, String str, String str2, String str3, boolean z, String str4, Calendar calendar, Calendar calendar2, Calendar calendar3, boolean z2, UidStructure uidStructure, int i, Object obj) {
        HomeworkDto homeworkDto2 = homeworkDto;
        int i2 = i;
        return homeworkDto.copy((i2 & 1) != 0 ? homeworkDto2.uid : str, (i2 & 2) != 0 ? homeworkDto2.subjectName : str2, (i2 & 4) != 0 ? homeworkDto2.recorderTeacherName : str3, (i2 & 8) != 0 ? homeworkDto2.isTeacherRecorded : z, (i2 & 16) != 0 ? homeworkDto2.text : str4, (i2 & 32) != 0 ? homeworkDto2.recordDate : calendar, (i2 & 64) != 0 ? homeworkDto2.deadlineDate : calendar2, (i2 & 128) != 0 ? homeworkDto2.createDate : calendar3, (i2 & 256) != 0 ? homeworkDto2.isStudentHomeworkEnabled : z2, (i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? homeworkDto2.group : uidStructure);
    }

    public final String component1() {
        return this.uid;
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

    public final HomeworkDto copy(String str, String str2, String str3, boolean z, String str4, Calendar calendar, Calendar calendar2, Calendar calendar3, boolean z2, UidStructure uidStructure) {
        String str5 = str;
        Intrinsics.checkParameterIsNotNull(str, "uid");
        String str6 = str2;
        Intrinsics.checkParameterIsNotNull(str2, "subjectName");
        String str7 = str3;
        Intrinsics.checkParameterIsNotNull(str3, "recorderTeacherName");
        Calendar calendar4 = calendar;
        Intrinsics.checkParameterIsNotNull(calendar4, "recordDate");
        Calendar calendar5 = calendar2;
        Intrinsics.checkParameterIsNotNull(calendar5, "deadlineDate");
        Calendar calendar6 = calendar3;
        Intrinsics.checkParameterIsNotNull(calendar6, "createDate");
        HomeworkDto homeworkDto = new HomeworkDto(str5, str6, str7, z, str4, calendar4, calendar5, calendar6, z2, uidStructure);
        return homeworkDto;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HomeworkDto) {
                HomeworkDto homeworkDto = (HomeworkDto) obj;
                if (Intrinsics.areEqual((Object) this.uid, (Object) homeworkDto.uid) && Intrinsics.areEqual((Object) this.subjectName, (Object) homeworkDto.subjectName) && Intrinsics.areEqual((Object) this.recorderTeacherName, (Object) homeworkDto.recorderTeacherName)) {
                    if ((this.isTeacherRecorded == homeworkDto.isTeacherRecorded) && Intrinsics.areEqual((Object) this.text, (Object) homeworkDto.text) && Intrinsics.areEqual((Object) this.recordDate, (Object) homeworkDto.recordDate) && Intrinsics.areEqual((Object) this.deadlineDate, (Object) homeworkDto.deadlineDate) && Intrinsics.areEqual((Object) this.createDate, (Object) homeworkDto.createDate)) {
                        if (!(this.isStudentHomeworkEnabled == homeworkDto.isStudentHomeworkEnabled) || !Intrinsics.areEqual((Object) this.group, (Object) homeworkDto.group)) {
                            return false;
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

    public final String getGroupUid() {
        UidStructure uidStructure = this.group;
        if (uidStructure != null) {
            String uid2 = uidStructure.getUid();
            if (uid2 != null) {
                return uid2;
            }
        }
        return "";
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
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.subjectName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.recorderTeacherName;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.isTeacherRecorded;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        String str4 = this.text;
        int hashCode4 = (i2 + (str4 != null ? str4.hashCode() : 0)) * 31;
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
        int i3 = (hashCode7 + (z2 ? 1 : 0)) * 31;
        UidStructure uidStructure = this.group;
        if (uidStructure != null) {
            i = uidStructure.hashCode();
        }
        return i3 + i;
    }

    public final boolean isStudentHomeworkEnabled() {
        return this.isStudentHomeworkEnabled;
    }

    public final boolean isTeacherRecorded() {
        return this.isTeacherRecorded;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("HomeworkDto(uid=");
        a.append(this.uid);
        a.append(", subjectName=");
        a.append(this.subjectName);
        a.append(", recorderTeacherName=");
        a.append(this.recorderTeacherName);
        a.append(", isTeacherRecorded=");
        a.append(this.isTeacherRecorded);
        a.append(", text=");
        a.append(this.text);
        a.append(", recordDate=");
        a.append(this.recordDate);
        a.append(", deadlineDate=");
        a.append(this.deadlineDate);
        a.append(", createDate=");
        a.append(this.createDate);
        a.append(", isStudentHomeworkEnabled=");
        a.append(this.isStudentHomeworkEnabled);
        a.append(", group=");
        a.append(this.group);
        a.append(")");
        return a.toString();
    }
}
