package p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3;

import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p000a.p054h.p159c.p166z.C2580c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001d"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/NoticeBoardItemDto;", "", "uid", "", "expireStartTime", "Ljava/util/Calendar;", "expireEndTime", "content", "title", "(Ljava/lang/String;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getExpireEndTime", "()Ljava/util/Calendar;", "getExpireStartTime", "getTitle", "getUid", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.rest.mobileapi.v3.NoticeBoardItemDto */
/* compiled from: NoticeBoardItemDto.kt */
public final class NoticeBoardItemDto {
    @C2580c("Tartalom")
    public final String content;
    @C2580c("ErvenyessegVege")
    public final Calendar expireEndTime;
    @C2580c("ErvenyessegKezdete")
    public final Calendar expireStartTime;
    @C2580c("Cim")
    public final String title;
    @C2580c("Uid")
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

    public static /* synthetic */ NoticeBoardItemDto copy$default(NoticeBoardItemDto noticeBoardItemDto, String str, Calendar calendar, Calendar calendar2, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = noticeBoardItemDto.uid;
        }
        if ((i & 2) != 0) {
            calendar = noticeBoardItemDto.expireStartTime;
        }
        Calendar calendar3 = calendar;
        if ((i & 4) != 0) {
            calendar2 = noticeBoardItemDto.expireEndTime;
        }
        Calendar calendar4 = calendar2;
        if ((i & 8) != 0) {
            str2 = noticeBoardItemDto.content;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
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
        NoticeBoardItemDto noticeBoardItemDto = new NoticeBoardItemDto(str, calendar, calendar2, str2, str3);
        return noticeBoardItemDto;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.title, (java.lang.Object) r3.title) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003d
            boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.NoticeBoardItemDto
            if (r0 == 0) goto L_0x003b
            hu.ekreta.ellenorzo.rest.mobileapi.v3.NoticeBoardItemDto r3 = (p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.NoticeBoardItemDto) r3
            java.lang.String r0 = r2.uid
            java.lang.String r1 = r3.uid
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.util.Calendar r0 = r2.expireStartTime
            java.util.Calendar r1 = r3.expireStartTime
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.util.Calendar r0 = r2.expireEndTime
            java.util.Calendar r1 = r3.expireEndTime
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.content
            java.lang.String r1 = r3.content
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.title
            java.lang.String r3 = r3.title
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r3 = 0
            return r3
        L_0x003d:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.NoticeBoardItemDto.equals(java.lang.Object):boolean");
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
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Calendar calendar = this.expireStartTime;
        int hashCode2 = (hashCode + (calendar != null ? calendar.hashCode() : 0)) * 31;
        Calendar calendar2 = this.expireEndTime;
        int hashCode3 = (hashCode2 + (calendar2 != null ? calendar2.hashCode() : 0)) * 31;
        String str2 = this.content;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.title;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("NoticeBoardItemDto(uid=");
        a.append(this.uid);
        a.append(", expireStartTime=");
        a.append(this.expireStartTime);
        a.append(", expireEndTime=");
        a.append(this.expireEndTime);
        a.append(", content=");
        a.append(this.content);
        a.append(", title=");
        return C0082a.m106a(a, this.title, ")");
    }
}
