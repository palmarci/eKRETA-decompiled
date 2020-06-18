package hu.ekreta.ellenorzo.rest.mobileapi.v3;

import a.b.a.a.a;
import a.h.c.z.c;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/CreateHomeworkPostDto;", "", "homeworkText", "", "deadline", "Ljava/util/Calendar;", "timetableElementUid", "(Ljava/lang/String;Ljava/util/Calendar;Ljava/lang/String;)V", "getDeadline", "()Ljava/util/Calendar;", "getHomeworkText", "()Ljava/lang/String;", "getTimetableElementUid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: CreateHomeworkPostDto.kt */
public final class CreateHomeworkPostDto {
    @c("Hatarido")
    public final Calendar deadline;
    @c("FeladatSzovege")
    public final String homeworkText;
    @c("OrarendElemUid")
    public final String timetableElementUid;

    public CreateHomeworkPostDto(String str, Calendar calendar, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "homeworkText");
        Intrinsics.checkParameterIsNotNull(calendar, "deadline");
        Intrinsics.checkParameterIsNotNull(str2, "timetableElementUid");
        this.homeworkText = str;
        this.deadline = calendar;
        this.timetableElementUid = str2;
    }

    public static /* synthetic */ CreateHomeworkPostDto copy$default(CreateHomeworkPostDto createHomeworkPostDto, String str, Calendar calendar, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = createHomeworkPostDto.homeworkText;
        }
        if ((i2 & 2) != 0) {
            calendar = createHomeworkPostDto.deadline;
        }
        if ((i2 & 4) != 0) {
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateHomeworkPostDto)) {
            return false;
        }
        CreateHomeworkPostDto createHomeworkPostDto = (CreateHomeworkPostDto) obj;
        return Intrinsics.areEqual((Object) this.homeworkText, (Object) createHomeworkPostDto.homeworkText) && Intrinsics.areEqual((Object) this.deadline, (Object) createHomeworkPostDto.deadline) && Intrinsics.areEqual((Object) this.timetableElementUid, (Object) createHomeworkPostDto.timetableElementUid);
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
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Calendar calendar = this.deadline;
        int hashCode2 = (hashCode + (calendar != null ? calendar.hashCode() : 0)) * 31;
        String str2 = this.timetableElementUid;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("CreateHomeworkPostDto(homeworkText=");
        a2.append(this.homeworkText);
        a2.append(", deadline=");
        a2.append(this.deadline);
        a2.append(", timetableElementUid=");
        return a.a(a2, this.timetableElementUid, ")");
    }
}
