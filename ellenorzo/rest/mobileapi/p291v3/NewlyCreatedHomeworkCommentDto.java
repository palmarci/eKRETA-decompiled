package p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3;

import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p000a.p054h.p159c.p166z.C2580c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/NewlyCreatedHomeworkCommentDto;", "", "teacherHomeWorkUid", "", "studentHomeworkUid", "date", "Ljava/util/Calendar;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;)V", "getDate", "()Ljava/util/Calendar;", "getStudentHomeworkUid", "()Ljava/lang/String;", "getTeacherHomeWorkUid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.rest.mobileapi.v3.NewlyCreatedHomeworkCommentDto */
/* compiled from: NewlyCreatedHomeworkCommentDto.kt */
public final class NewlyCreatedHomeworkCommentDto {
    @C2580c("KommentRogzitesenekDatuma")
    public final Calendar date;
    @C2580c("UjonnanLetrejottKommentUid")
    public final String studentHomeworkUid;
    @C2580c("UjonnanLetrejottHaziFeladatUid")
    public final String teacherHomeWorkUid;

    public NewlyCreatedHomeworkCommentDto(String str, String str2, Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(str, "teacherHomeWorkUid");
        Intrinsics.checkParameterIsNotNull(str2, "studentHomeworkUid");
        Intrinsics.checkParameterIsNotNull(calendar, "date");
        this.teacherHomeWorkUid = str;
        this.studentHomeworkUid = str2;
        this.date = calendar;
    }

    public static /* synthetic */ NewlyCreatedHomeworkCommentDto copy$default(NewlyCreatedHomeworkCommentDto newlyCreatedHomeworkCommentDto, String str, String str2, Calendar calendar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = newlyCreatedHomeworkCommentDto.teacherHomeWorkUid;
        }
        if ((i & 2) != 0) {
            str2 = newlyCreatedHomeworkCommentDto.studentHomeworkUid;
        }
        if ((i & 4) != 0) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.date, (java.lang.Object) r3.date) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.NewlyCreatedHomeworkCommentDto
            if (r0 == 0) goto L_0x0027
            hu.ekreta.ellenorzo.rest.mobileapi.v3.NewlyCreatedHomeworkCommentDto r3 = (p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.NewlyCreatedHomeworkCommentDto) r3
            java.lang.String r0 = r2.teacherHomeWorkUid
            java.lang.String r1 = r3.teacherHomeWorkUid
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.studentHomeworkUid
            java.lang.String r1 = r3.studentHomeworkUid
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.util.Calendar r0 = r2.date
            java.util.Calendar r3 = r3.date
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
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.NewlyCreatedHomeworkCommentDto.equals(java.lang.Object):boolean");
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
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.studentHomeworkUid;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Calendar calendar = this.date;
        if (calendar != null) {
            i = calendar.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("NewlyCreatedHomeworkCommentDto(teacherHomeWorkUid=");
        a.append(this.teacherHomeWorkUid);
        a.append(", studentHomeworkUid=");
        a.append(this.studentHomeworkUid);
        a.append(", date=");
        a.append(this.date);
        a.append(")");
        return a.toString();
    }
}
