package hu.ekreta.ellenorzo.rest.mobileapi.v3;

import a.b.a.a.a;
import a.h.c.z.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/HomeworkCommentPostDto;", "", "homeworkId", "", "text", "", "(JLjava/lang/String;)V", "getHomeworkId", "()J", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: HomeworkCommentPostDto.kt */
public final class HomeworkCommentPostDto {
    @c("HaziFeladatUid")
    public final long homeworkId;
    @c("FeladatSzovege")
    public final String text;

    public HomeworkCommentPostDto(long j2, String str) {
        Intrinsics.checkParameterIsNotNull(str, "text");
        this.homeworkId = j2;
        this.text = str;
    }

    public static /* synthetic */ HomeworkCommentPostDto copy$default(HomeworkCommentPostDto homeworkCommentPostDto, long j2, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = homeworkCommentPostDto.homeworkId;
        }
        if ((i2 & 2) != 0) {
            str = homeworkCommentPostDto.text;
        }
        return homeworkCommentPostDto.copy(j2, str);
    }

    public final long component1() {
        return this.homeworkId;
    }

    public final String component2() {
        return this.text;
    }

    public final HomeworkCommentPostDto copy(long j2, String str) {
        Intrinsics.checkParameterIsNotNull(str, "text");
        return new HomeworkCommentPostDto(j2, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HomeworkCommentPostDto) {
                HomeworkCommentPostDto homeworkCommentPostDto = (HomeworkCommentPostDto) obj;
                if (!(this.homeworkId == homeworkCommentPostDto.homeworkId) || !Intrinsics.areEqual((Object) this.text, (Object) homeworkCommentPostDto.text)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final long getHomeworkId() {
        return this.homeworkId;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        long j2 = this.homeworkId;
        int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        String str = this.text;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder a2 = a.a("HomeworkCommentPostDto(homeworkId=");
        a2.append(this.homeworkId);
        a2.append(", text=");
        return a.a(a2, this.text, ")");
    }
}
