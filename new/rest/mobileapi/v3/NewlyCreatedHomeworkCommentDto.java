package hu.ekreta.ellenorzo.rest.mobileapi.v3;

import a.b.a.a.a;
import a.h.c.z.c;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/NewlyCreatedHomeworkCommentDto;", "", "teacherHomeWorkUid", "", "studentHomeworkUid", "date", "Ljava/util/Calendar;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;)V", "getDate", "()Ljava/util/Calendar;", "getStudentHomeworkUid", "()Ljava/lang/String;", "getTeacherHomeWorkUid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: NewlyCreatedHomeworkCommentDto.kt */
public final class NewlyCreatedHomeworkCommentDto {
    @c("KommentRogzitesenekDatuma")
    public final Calendar date;
    @c("UjonnanLetrejottKommentUid")
    public final String studentHomeworkUid;
    @c("UjonnanLetrejottHaziFeladatUid")
    public final String teacherHomeWorkUid;

    public NewlyCreatedHomeworkCommentDto(String str, String str2, Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(str, "teacherHomeWorkUid");
        Intrinsics.checkParameterIsNotNull(str2, "studentHomeworkUid");
        Intrinsics.checkParameterIsNotNull(calendar, "date");
        this.teacherHomeWorkUid = str;
        this.studentHomeworkUid = str2;
        this.date = calendar;
    }

    public static /* synthetic */ NewlyCreatedHomeworkCommentDto copy$default(NewlyCreatedHomeworkCommentDto newlyCreatedHomeworkCommentDto, String str, String str2, Calendar calendar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = newlyCreatedHomeworkCommentDto.teacherHomeWorkUid;
        }
        if ((i2 & 2) != 0) {
            str2 = newlyCreatedHomeworkCommentDto.studentHomeworkUid;
        }
        if ((i2 & 4) != 0) {
            calendar = newlyCreatedHomeworkCommentDto.date;
        }
        return newlyCreatedHomeworkCommentDto.copy(str, str2, calendar);
    }

    public final String component1() {
        return this.teacherHomeWorkUid;
    }

    public final String component2() {
        return this.studentHomeworkUid;
    }

    public final Calendar component3() {
        return this.date;
    }

    public final NewlyCreatedHomeworkCommentDto copy(String str, String str2, Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(str, "teacherHomeWorkUid");
        Intrinsics.checkParameterIsNotNull(str2, "studentHomeworkUid");
        Intrinsics.checkParameterIsNotNull(calendar, "date");
        return new NewlyCreatedHomeworkCommentDto(str, str2, calendar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewlyCreatedHomeworkCommentDto)) {
            return false;
        }
        NewlyCreatedHomeworkCommentDto newlyCreatedHomeworkCommentDto = (NewlyCreatedHomeworkCommentDto) obj;
        return Intrinsics.areEqual((Object) this.teacherHomeWorkUid, (Object) newlyCreatedHomeworkCommentDto.teacherHomeWorkUid) && Intrinsics.areEqual((Object) this.studentHomeworkUid, (Object) newlyCreatedHomeworkCommentDto.studentHomeworkUid) && Intrinsics.areEqual((Object) this.date, (Object) newlyCreatedHomeworkCommentDto.date);
    }

    public final Calendar getDate() {
        return this.date;
    }

    public final String getStudentHomeworkUid() {
        return this.studentHomeworkUid;
    }

    public final String getTeacherHomeWorkUid() {
        return this.teacherHomeWorkUid;
    }

    public int hashCode() {
        String str = this.teacherHomeWorkUid;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.studentHomeworkUid;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Calendar calendar = this.date;
        if (calendar != null) {
            i2 = calendar.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("NewlyCreatedHomeworkCommentDto(teacherHomeWorkUid=");
        a2.append(this.teacherHomeWorkUid);
        a2.append(", studentHomeworkUid=");
        a2.append(this.studentHomeworkUid);
        a2.append(", date=");
        a2.append(this.date);
        a2.append(")");
        return a2.toString();
    }
}
