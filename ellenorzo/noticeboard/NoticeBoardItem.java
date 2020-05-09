package p289hu.ekreta.ellenorzo.noticeboard;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p289hu.ekreta.ellenorzo.parceler.CalendarParceler;
import p289hu.ekreta.ellenorzo.util.mapper.ReadableByUserModel;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002BA\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0004HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0015JV\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020#H\u0016J\u0013\u0010$\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020#HÖ\u0001J\t\u0010(\u001a\u00020\u0004HÖ\u0001J\u0019\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020#HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0014\u0010\n\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006."}, mo17463d2 = {"Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;", "Lhu/ekreta/ellenorzo/util/mapper/ReadableByUserModel;", "Landroid/os/Parcelable;", "uid", "", "expireStartTime", "Ljava/util/Calendar;", "expireEndTime", "content", "title", "profileId", "readByUser", "", "(Ljava/lang/String;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getContent", "()Ljava/lang/String;", "getExpireEndTime", "()Ljava/util/Calendar;", "getExpireStartTime", "getProfileId", "getReadByUser", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTitle", "getUid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.noticeboard.NoticeBoardItem */
/* compiled from: NoticeBoardItem.kt */
public final class NoticeBoardItem implements ReadableByUserModel, Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new Creator();

    /* renamed from: c */
    public final String f14145c;

    /* renamed from: e */
    public final Calendar f14146e;

    /* renamed from: f */
    public final Calendar f14147f;

    /* renamed from: g */
    public final String f14148g;

    /* renamed from: h */
    public final String f14149h;

    /* renamed from: i */
    public final String f14150i;

    /* renamed from: j */
    public final Boolean f14151j;

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.noticeboard.NoticeBoardItem$Creator */
    public static class Creator implements android.os.Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Boolean bool;
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            String readString = parcel.readString();
            Calendar calendar = (Calendar) CalendarParceler.INSTANCE.create(parcel);
            Calendar calendar2 = (Calendar) CalendarParceler.INSTANCE.create(parcel);
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool = null;
            }
            NoticeBoardItem noticeBoardItem = new NoticeBoardItem(readString, calendar, calendar2, readString2, readString3, readString4, bool);
            return noticeBoardItem;
        }

        public final Object[] newArray(int i) {
            return new NoticeBoardItem[i];
        }
    }

    public NoticeBoardItem(String str, Calendar calendar, Calendar calendar2, String str2, String str3, String str4, Boolean bool) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(calendar, "expireStartTime");
        Intrinsics.checkParameterIsNotNull(calendar2, "expireEndTime");
        Intrinsics.checkParameterIsNotNull(str2, "content");
        Intrinsics.checkParameterIsNotNull(str3, "title");
        Intrinsics.checkParameterIsNotNull(str4, "profileId");
        this.f14145c = str;
        this.f14146e = calendar;
        this.f14147f = calendar2;
        this.f14148g = str2;
        this.f14149h = str3;
        this.f14150i = str4;
        this.f14151j = bool;
    }

    public static /* synthetic */ NoticeBoardItem copy$default(NoticeBoardItem noticeBoardItem, String str, Calendar calendar, Calendar calendar2, String str2, String str3, String str4, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = noticeBoardItem.mo11316d();
        }
        if ((i & 2) != 0) {
            calendar = noticeBoardItem.f14146e;
        }
        Calendar calendar3 = calendar;
        if ((i & 4) != 0) {
            calendar2 = noticeBoardItem.f14147f;
        }
        Calendar calendar4 = calendar2;
        if ((i & 8) != 0) {
            str2 = noticeBoardItem.f14148g;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = noticeBoardItem.f14149h;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            str4 = noticeBoardItem.mo11318e();
        }
        String str7 = str4;
        if ((i & 64) != 0) {
            bool = noticeBoardItem.mo13680i();
        }
        return noticeBoardItem.mo13673a(str, calendar3, calendar4, str5, str6, str7, bool);
    }

    /* renamed from: a */
    public final NoticeBoardItem mo13673a(String str, Calendar calendar, Calendar calendar2, String str2, String str3, String str4, Boolean bool) {
        String str5 = str;
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Calendar calendar3 = calendar;
        Intrinsics.checkParameterIsNotNull(calendar, "expireStartTime");
        Calendar calendar4 = calendar2;
        Intrinsics.checkParameterIsNotNull(calendar2, "expireEndTime");
        String str6 = str2;
        Intrinsics.checkParameterIsNotNull(str2, "content");
        String str7 = str3;
        Intrinsics.checkParameterIsNotNull(str3, "title");
        String str8 = str4;
        Intrinsics.checkParameterIsNotNull(str4, "profileId");
        NoticeBoardItem noticeBoardItem = new NoticeBoardItem(str5, calendar3, calendar4, str6, str7, str8, bool);
        return noticeBoardItem;
    }

    /* renamed from: d */
    public String mo11316d() {
        return this.f14145c;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String mo11318e() {
        return this.f14150i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0058, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) mo13680i(), (java.lang.Object) r3.mo13680i()) != false) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x005d
            boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.noticeboard.NoticeBoardItem
            if (r0 == 0) goto L_0x005b
            hu.ekreta.ellenorzo.noticeboard.NoticeBoardItem r3 = (p289hu.ekreta.ellenorzo.noticeboard.NoticeBoardItem) r3
            java.lang.String r0 = r2.mo11316d()
            java.lang.String r1 = r3.mo11316d()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x005b
            java.util.Calendar r0 = r2.f14146e
            java.util.Calendar r1 = r3.f14146e
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x005b
            java.util.Calendar r0 = r2.f14147f
            java.util.Calendar r1 = r3.f14147f
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x005b
            java.lang.String r0 = r2.f14148g
            java.lang.String r1 = r3.f14148g
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x005b
            java.lang.String r0 = r2.f14149h
            java.lang.String r1 = r3.f14149h
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x005b
            java.lang.String r0 = r2.mo11318e()
            java.lang.String r1 = r3.mo11318e()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x005b
            java.lang.Boolean r0 = r2.mo13680i()
            java.lang.Boolean r3 = r3.mo13680i()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            r3 = 0
            return r3
        L_0x005d:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.noticeboard.NoticeBoardItem.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final String mo13676f() {
        return this.f14148g;
    }

    /* renamed from: g */
    public final Calendar mo13677g() {
        return this.f14147f;
    }

    /* renamed from: h */
    public final Calendar mo13678h() {
        return this.f14146e;
    }

    public int hashCode() {
        String d = mo11316d();
        int i = 0;
        int hashCode = (d != null ? d.hashCode() : 0) * 31;
        Calendar calendar = this.f14146e;
        int hashCode2 = (hashCode + (calendar != null ? calendar.hashCode() : 0)) * 31;
        Calendar calendar2 = this.f14147f;
        int hashCode3 = (hashCode2 + (calendar2 != null ? calendar2.hashCode() : 0)) * 31;
        String str = this.f14148g;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f14149h;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String e = mo11318e();
        int hashCode6 = (hashCode5 + (e != null ? e.hashCode() : 0)) * 31;
        Boolean i2 = mo13680i();
        if (i2 != null) {
            i = i2.hashCode();
        }
        return hashCode6 + i;
    }

    /* renamed from: i */
    public Boolean mo13680i() {
        return this.f14151j;
    }

    /* renamed from: j */
    public final String mo13681j() {
        return this.f14149h;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("NoticeBoardItem(uid=");
        a.append(mo11316d());
        a.append(", expireStartTime=");
        a.append(this.f14146e);
        a.append(", expireEndTime=");
        a.append(this.f14147f);
        a.append(", content=");
        a.append(this.f14148g);
        a.append(", title=");
        a.append(this.f14149h);
        a.append(", profileId=");
        a.append(mo11318e());
        a.append(", readByUser=");
        a.append(mo13680i());
        a.append(")");
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.f14145c);
        CalendarParceler.INSTANCE.write(this.f14146e, parcel, i);
        CalendarParceler.INSTANCE.write(this.f14147f, parcel, i);
        parcel.writeString(this.f14148g);
        parcel.writeString(this.f14149h);
        parcel.writeString(this.f14150i);
        Boolean bool = this.f14151j;
        if (bool != null) {
            parcel.writeInt(1);
            z = bool.booleanValue();
        } else {
            z = false;
        }
        parcel.writeInt(z ? 1 : 0);
    }

    public /* synthetic */ NoticeBoardItem(String str, Calendar calendar, Calendar calendar2, String str2, String str3, String str4, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, calendar, calendar2, str2, str3, str4, (i & 64) != 0 ? null : bool);
    }
}
