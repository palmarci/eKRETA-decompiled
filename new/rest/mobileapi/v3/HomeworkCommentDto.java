package hu.ekreta.ellenorzo.rest.mobileapi.v3;

import a.b.a.a.a;
import a.h.c.z.c;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013¨\u0006$"}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/HomeworkCommentDto;", "", "uid", "", "recorderStudentName", "recordDate", "Ljava/util/Calendar;", "text", "recorderStudentId", "deletedByStudent", "", "deletedByTeacher", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getDeletedByStudent", "()Z", "getDeletedByTeacher", "getRecordDate", "()Ljava/util/Calendar;", "getRecorderStudentId", "()Ljava/lang/String;", "getRecorderStudentName", "getText", "getUid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: HomeworkCommentDto.kt */
public final class HomeworkCommentDto {
    @c("IsTanuloAltalTorolt")
    public final boolean deletedByStudent;
    @c("IsTanarAltalTorolt")
    public final boolean deletedByTeacher;
    @c("FeladasDatuma")
    public final Calendar recordDate;
    @c("RogzitoTanuloUid")
    public final String recorderStudentId;
    @c("RogzitoTanuloNeve")
    public final String recorderStudentName;
    @c("FeladatSzovege")
    public final String text;
    @c("Uid")
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

    public static /* synthetic */ HomeworkCommentDto copy$default(HomeworkCommentDto homeworkCommentDto, String str, String str2, Calendar calendar, String str3, String str4, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = homeworkCommentDto.uid;
        }
        if ((i2 & 2) != 0) {
            str2 = homeworkCommentDto.recorderStudentName;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            calendar = homeworkCommentDto.recordDate;
        }
        Calendar calendar2 = calendar;
        if ((i2 & 8) != 0) {
            str3 = homeworkCommentDto.text;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            str4 = homeworkCommentDto.recorderStudentId;
        }
        String str7 = str4;
        if ((i2 & 32) != 0) {
            z = homeworkCommentDto.deletedByStudent;
        }
        boolean z3 = z;
        if ((i2 & 64) != 0) {
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
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(str2, "recorderStudentName");
        Intrinsics.checkParameterIsNotNull(calendar, "recordDate");
        Intrinsics.checkParameterIsNotNull(str3, "text");
        Intrinsics.checkParameterIsNotNull(str4, "recorderStudentId");
        return new HomeworkCommentDto(str, str2, calendar, str3, str4, z, z2);
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
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.recorderStudentName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Calendar calendar = this.recordDate;
        int hashCode3 = (hashCode2 + (calendar != null ? calendar.hashCode() : 0)) * 31;
        String str3 = this.text;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.recorderStudentId;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        int i3 = (hashCode4 + i2) * 31;
        boolean z = this.deletedByStudent;
        if (z) {
            z = true;
        }
        int i4 = (i3 + (z ? 1 : 0)) * 31;
        boolean z2 = this.deletedByTeacher;
        if (z2) {
            z2 = true;
        }
        return i4 + (z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder a2 = a.a("HomeworkCommentDto(uid=");
        a2.append(this.uid);
        a2.append(", recorderStudentName=");
        a2.append(this.recorderStudentName);
        a2.append(", recordDate=");
        a2.append(this.recordDate);
        a2.append(", text=");
        a2.append(this.text);
        a2.append(", recorderStudentId=");
        a2.append(this.recorderStudentId);
        a2.append(", deletedByStudent=");
        a2.append(this.deletedByStudent);
        a2.append(", deletedByTeacher=");
        a2.append(this.deletedByTeacher);
        a2.append(")");
        return a2.toString();
    }
}
