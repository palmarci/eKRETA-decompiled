package p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3;

import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p000a.p054h.p159c.p166z.C2580c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/CreateHomeworkPostDto;", "", "homeworkText", "", "deadline", "Ljava/util/Calendar;", "timetableElementUid", "(Ljava/lang/String;Ljava/util/Calendar;Ljava/lang/String;)V", "getDeadline", "()Ljava/util/Calendar;", "getHomeworkText", "()Ljava/lang/String;", "getTimetableElementUid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.rest.mobileapi.v3.CreateHomeworkPostDto */
/* compiled from: CreateHomeworkPostDto.kt */
public final class CreateHomeworkPostDto {
    @C2580c("Hatarido")
    public final Calendar deadline;
    @C2580c("FeladatSzovege")
    public final String homeworkText;
    @C2580c("OrarendElemUid")
    public final String timetableElementUid;

    public CreateHomeworkPostDto(String str, Calendar calendar, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "homeworkText");
        Intrinsics.checkParameterIsNotNull(calendar, "deadline");
        Intrinsics.checkParameterIsNotNull(str2, "timetableElementUid");
        this.homeworkText = str;
        this.deadline = calendar;
        this.timetableElementUid = str2;
    }

    public static /* synthetic */ CreateHomeworkPostDto copy$default(CreateHomeworkPostDto createHomeworkPostDto, String str, Calendar calendar, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createHomeworkPostDto.homeworkText;
        }
        if ((i & 2) != 0) {
            calendar = createHomeworkPostDto.deadline;
        }
        if ((i & 4) != 0) {
            str2 = createHomeworkPostDto.timetableElementUid;
        }
        return createHomeworkPostDto.copy(str, calendar, str2);
    }

    public final String component1() {
        return this.homeworkText;
    }

    public final Calendar component2() {
        return this.deadline;
    }

    public final String component3() {
        return this.timetableElementUid;
    }

    public final CreateHomeworkPostDto copy(String str, Calendar calendar, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "homeworkText");
        Intrinsics.checkParameterIsNotNull(calendar, "deadline");
        Intrinsics.checkParameterIsNotNull(str2, "timetableElementUid");
        return new CreateHomeworkPostDto(str, calendar, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.timetableElementUid, (java.lang.Object) r3.timetableElementUid) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.CreateHomeworkPostDto
            if (r0 == 0) goto L_0x0027
            hu.ekreta.ellenorzo.rest.mobileapi.v3.CreateHomeworkPostDto r3 = (p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.CreateHomeworkPostDto) r3
            java.lang.String r0 = r2.homeworkText
            java.lang.String r1 = r3.homeworkText
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.util.Calendar r0 = r2.deadline
            java.util.Calendar r1 = r3.deadline
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.timetableElementUid
            java.lang.String r3 = r3.timetableElementUid
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
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.CreateHomeworkPostDto.equals(java.lang.Object):boolean");
    }

    public final Calendar getDeadline() {
        return this.deadline;
    }

    public final String getHomeworkText() {
        return this.homeworkText;
    }

    public final String getTimetableElementUid() {
        return this.timetableElementUid;
    }

    public int hashCode() {
        String str = this.homeworkText;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Calendar calendar = this.deadline;
        int hashCode2 = (hashCode + (calendar != null ? calendar.hashCode() : 0)) * 31;
        String str2 = this.timetableElementUid;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("CreateHomeworkPostDto(homeworkText=");
        a.append(this.homeworkText);
        a.append(", deadline=");
        a.append(this.deadline);
        a.append(", timetableElementUid=");
        return C0082a.m106a(a, this.timetableElementUid, ")");
    }
}
