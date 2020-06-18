package hu.ekreta.ellenorzo.rest.mobileapi.v3;

import a.b.a.a.a;
import a.h.c.z.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/HomeworkStatePostDto;", "", "teacherHomeworkUid", "", "isDone", "", "(Ljava/lang/String;Z)V", "()Z", "getTeacherHomeworkUid", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: HomeworkStatePostDto.kt */
public final class HomeworkStatePostDto {
    @c("IsMegoldva")
    public final boolean isDone;
    @c("TanarHaziFeladatUid")
    public final String teacherHomeworkUid;

    public HomeworkStatePostDto(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "teacherHomeworkUid");
        this.teacherHomeworkUid = str;
        this.isDone = z;
    }

    public static /* synthetic */ HomeworkStatePostDto copy$default(HomeworkStatePostDto homeworkStatePostDto, String str, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = homeworkStatePostDto.teacherHomeworkUid;
        }
        if ((i2 & 2) != 0) {
            z = homeworkStatePostDto.isDone;
        }
        return homeworkStatePostDto.copy(str, z);
    }

    public final String component1() {
        return this.teacherHomeworkUid;
    }

    public final boolean component2() {
        return this.isDone;
    }

    public final HomeworkStatePostDto copy(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "teacherHomeworkUid");
        return new HomeworkStatePostDto(str, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HomeworkStatePostDto) {
                HomeworkStatePostDto homeworkStatePostDto = (HomeworkStatePostDto) obj;
                if (Intrinsics.areEqual((Object) this.teacherHomeworkUid, (Object) homeworkStatePostDto.teacherHomeworkUid)) {
                    if (this.isDone == homeworkStatePostDto.isDone) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String getTeacherHomeworkUid() {
        return this.teacherHomeworkUid;
    }

    public int hashCode() {
        String str = this.teacherHomeworkUid;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.isDone;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final boolean isDone() {
        return this.isDone;
    }

    public String toString() {
        StringBuilder a2 = a.a("HomeworkStatePostDto(teacherHomeworkUid=");
        a2.append(this.teacherHomeworkUid);
        a2.append(", isDone=");
        a2.append(this.isDone);
        a2.append(")");
        return a2.toString();
    }
}
