package p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3;

import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p000a.p054h.p159c.p166z.C2580c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013¨\u0006$"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/HomeworkCommentDto;", "", "uid", "", "recorderStudentName", "recordDate", "Ljava/util/Calendar;", "text", "recorderStudentId", "deletedByStudent", "", "deletedByTeacher", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getDeletedByStudent", "()Z", "getDeletedByTeacher", "getRecordDate", "()Ljava/util/Calendar;", "getRecorderStudentId", "()Ljava/lang/String;", "getRecorderStudentName", "getText", "getUid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.rest.mobileapi.v3.HomeworkCommentDto */
/* compiled from: HomeworkCommentDto.kt */
public final class HomeworkCommentDto {
    @C2580c("IsTanuloAltalTorolt")
    public final boolean deletedByStudent;
    @C2580c("IsTanarAltalTorolt")
    public final boolean deletedByTeacher;
    @C2580c("FeladasDatuma")
    public final Calendar recordDate;
    @C2580c("RogzitoTanuloUid")
    public final String recorderStudentId;
    @C2580c("RogzitoTanuloNeve")
    public final String recorderStudentName;
    @C2580c("FeladatSzovege")
    public final String text;
    @C2580c("Uid")
    public final String uid;

    public HomeworkCommentDto(String str, String str2, Calendar calendar, String str3, String str4, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(str2, "recorderStudentName");
        Intrinsics.checkParameterIsNotNull(calendar, "recordDate");
        Intrinsics.checkParameterIsNotNull(str3, "text");
        Intrinsics.checkParameterIsNotNull(str4, "recorderStudentId");
        this.uid = str;
        this.recorderStudentName = str2;
        this.recordDate = calendar;
        this.text = str3;
        this.recorderStudentId = str4;
        this.deletedByStudent = z;
        this.deletedByTeacher = z2;
    }

    public static /* synthetic */ HomeworkCommentDto copy$default(HomeworkCommentDto homeworkCommentDto, String str, String str2, Calendar calendar, String str3, String str4, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = homeworkCommentDto.uid;
        }
        if ((i & 2) != 0) {
            str2 = homeworkCommentDto.recorderStudentName;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            calendar = homeworkCommentDto.recordDate;
        }
        Calendar calendar2 = calendar;
        if ((i & 8) != 0) {
            str3 = homeworkCommentDto.text;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = homeworkCommentDto.recorderStudentId;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            z = homeworkCommentDto.deletedByStudent;
        }
        boolean z3 = z;
        if ((i & 64) != 0) {
            z2 = homeworkCommentDto.deletedByTeacher;
        }
        return homeworkCommentDto.copy(str, str5, calendar2, str6, str7, z3, z2);
    }

    public final String component1() {
        return this.uid;
    }

    public final String component2() {
        return this.recorderStudentName;
    }

    public final Calendar component3() {
        return this.recordDate;
    }

    public final String component4() {
        return this.text;
    }

    public final String component5() {
        return this.recorderStudentId;
    }

    public final boolean component6() {
        return this.deletedByStudent;
    }

    public final boolean component7() {
        return this.deletedByTeacher;
    }

    public final HomeworkCommentDto copy(String str, String str2, Calendar calendar, String str3, String str4, boolean z, boolean z2) {
        String str5 = str;
        Intrinsics.checkParameterIsNotNull(str, "uid");
        String str6 = str2;
        Intrinsics.checkParameterIsNotNull(str2, "recorderStudentName");
        Calendar calendar2 = calendar;
        Intrinsics.checkParameterIsNotNull(calendar, "recordDate");
        String str7 = str3;
        Intrinsics.checkParameterIsNotNull(str3, "text");
        String str8 = str4;
        Intrinsics.checkParameterIsNotNull(str4, "recorderStudentId");
        HomeworkCommentDto homeworkCommentDto = new HomeworkCommentDto(str5, str6, calendar2, str7, str8, z, z2);
        return homeworkCommentDto;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HomeworkCommentDto) {
                HomeworkCommentDto homeworkCommentDto = (HomeworkCommentDto) obj;
                if (Intrinsics.areEqual((Object) this.uid, (Object) homeworkCommentDto.uid) && Intrinsics.areEqual((Object) this.recorderStudentName, (Object) homeworkCommentDto.recorderStudentName) && Intrinsics.areEqual((Object) this.recordDate, (Object) homeworkCommentDto.recordDate) && Intrinsics.areEqual((Object) this.text, (Object) homeworkCommentDto.text) && Intrinsics.areEqual((Object) this.recorderStudentId, (Object) homeworkCommentDto.recorderStudentId)) {
                    if (this.deletedByStudent == homeworkCommentDto.deletedByStudent) {
                        if (this.deletedByTeacher == homeworkCommentDto.deletedByTeacher) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean getDeletedByStudent() {
        return this.deletedByStudent;
    }

    public final boolean getDeletedByTeacher() {
        return this.deletedByTeacher;
    }

    public final Calendar getRecordDate() {
        return this.recordDate;
    }

    public final String getRecorderStudentId() {
        return this.recorderStudentId;
    }

    public final String getRecorderStudentName() {
        return this.recorderStudentName;
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
        String str2 = this.recorderStudentName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Calendar calendar = this.recordDate;
        int hashCode3 = (hashCode2 + (calendar != null ? calendar.hashCode() : 0)) * 31;
        String str3 = this.text;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.recorderStudentId;
        if (str4 != null) {
            i = str4.hashCode();
        }
        int i2 = (hashCode4 + i) * 31;
        boolean z = this.deletedByStudent;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z2 = this.deletedByTeacher;
        if (z2) {
            z2 = true;
        }
        return i3 + (z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("HomeworkCommentDto(uid=");
        a.append(this.uid);
        a.append(", recorderStudentName=");
        a.append(this.recorderStudentName);
        a.append(", recordDate=");
        a.append(this.recordDate);
        a.append(", text=");
        a.append(this.text);
        a.append(", recorderStudentId=");
        a.append(this.recorderStudentId);
        a.append(", deletedByStudent=");
        a.append(this.deletedByStudent);
        a.append(", deletedByTeacher=");
        a.append(this.deletedByTeacher);
        a.append(")");
        return a.toString();
    }
}
