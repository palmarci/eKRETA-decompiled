package hu.ekreta.ellenorzo.rest.mobileapi.v3;

import a.b.a.a.a;
import a.h.c.z.c;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001d"}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/NoticeBoardItemDto;", "", "uid", "", "expireStartTime", "Ljava/util/Calendar;", "expireEndTime", "content", "title", "(Ljava/lang/String;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getExpireEndTime", "()Ljava/util/Calendar;", "getExpireStartTime", "getTitle", "getUid", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: NoticeBoardItemDto.kt */
public final class NoticeBoardItemDto {
    @c("Tartalom")
    public final String content;
    @c("ErvenyessegVege")
    public final Calendar expireEndTime;
    @c("ErvenyessegKezdete")
    public final Calendar expireStartTime;
    @c("Cim")
    public final String title;
    @c("Uid")
    public final String uid;

    public NoticeBoardItemDto(String str, Calendar calendar, Calendar calendar2, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(calendar, "expireStartTime");
        Intrinsics.checkParameterIsNotNull(calendar2, "expireEndTime");
        Intrinsics.checkParameterIsNotNull(str2, "content");
        Intrinsics.checkParameterIsNotNull(str3, "title");
        this.uid = str;
        this.expireStartTime = calendar;
        this.expireEndTime = calendar2;
        this.content = str2;
        this.title = str3;
    }

    public static /* synthetic */ NoticeBoardItemDto copy$default(NoticeBoardItemDto noticeBoardItemDto, String str, Calendar calendar, Calendar calendar2, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = noticeBoardItemDto.uid;
        }
        if ((i2 & 2) != 0) {
            calendar = noticeBoardItemDto.expireStartTime;
        }
        Calendar calendar3 = calendar;
        if ((i2 & 4) != 0) {
            calendar2 = noticeBoardItemDto.expireEndTime;
        }
        Calendar calendar4 = calendar2;
        if ((i2 & 8) != 0) {
            str2 = noticeBoardItemDto.content;
        }
        String str4 = str2;
        if ((i2 & 16) != 0) {
            str3 = noticeBoardItemDto.title;
        }
        return noticeBoardItemDto.copy(str, calendar3, calendar4, str4, str3);
    }

    public final String component1() {
        return this.uid;
    }

    public final Calendar component2() {
        return this.expireStartTime;
    }

    public final Calendar component3() {
        return this.expireEndTime;
    }

    public final String component4() {
        return this.content;
    }

    public final String component5() {
        return this.title;
    }

    public final NoticeBoardItemDto copy(String str, Calendar calendar, Calendar calendar2, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(calendar, "expireStartTime");
        Intrinsics.checkParameterIsNotNull(calendar2, "expireEndTime");
        Intrinsics.checkParameterIsNotNull(str2, "content");
        Intrinsics.checkParameterIsNotNull(str3, "title");
        return new NoticeBoardItemDto(str, calendar, calendar2, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeBoardItemDto)) {
            return false;
        }
        NoticeBoardItemDto noticeBoardItemDto = (NoticeBoardItemDto) obj;
        return Intrinsics.areEqual((Object) this.uid, (Object) noticeBoardItemDto.uid) && Intrinsics.areEqual((Object) this.expireStartTime, (Object) noticeBoardItemDto.expireStartTime) && Intrinsics.areEqual((Object) this.expireEndTime, (Object) noticeBoardItemDto.expireEndTime) && Intrinsics.areEqual((Object) this.content, (Object) noticeBoardItemDto.content) && Intrinsics.areEqual((Object) this.title, (Object) noticeBoardItemDto.title);
    }

    public final String getContent() {
        return this.content;
    }

    public final Calendar getExpireEndTime() {
        return this.expireEndTime;
    }

    public final Calendar getExpireStartTime() {
        return this.expireStartTime;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        String str = this.uid;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Calendar calendar = this.expireStartTime;
        int hashCode2 = (hashCode + (calendar != null ? calendar.hashCode() : 0)) * 31;
        Calendar calendar2 = this.expireEndTime;
        int hashCode3 = (hashCode2 + (calendar2 != null ? calendar2.hashCode() : 0)) * 31;
        String str2 = this.content;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.title;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode4 + i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("NoticeBoardItemDto(uid=");
        a2.append(this.uid);
        a2.append(", expireStartTime=");
        a2.append(this.expireStartTime);
        a2.append(", expireEndTime=");
        a2.append(this.expireEndTime);
        a2.append(", content=");
        a2.append(this.content);
        a2.append(", title=");
        return a.a(a2, this.title, ")");
    }
}
