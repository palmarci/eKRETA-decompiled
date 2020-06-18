package hu.ekreta.ellenorzo.noticeboard;

import a.b.a.a.a;
import android.os.Parcel;
import android.os.Parcelable;
import hu.ekreta.ellenorzo.parceler.CalendarParceler;
import hu.ekreta.ellenorzo.util.mapper.ReadableByUserModel;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002BA\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0004HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0015JV\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020#H\u0016J\u0013\u0010$\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020#HÖ\u0001J\t\u0010(\u001a\u00020\u0004HÖ\u0001J\u0019\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020#HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0014\u0010\n\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006."}, d2 = {"Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;", "Lhu/ekreta/ellenorzo/util/mapper/ReadableByUserModel;", "Landroid/os/Parcelable;", "uid", "", "expireStartTime", "Ljava/util/Calendar;", "expireEndTime", "content", "title", "profileId", "readByUser", "", "(Ljava/lang/String;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getContent", "()Ljava/lang/String;", "getExpireEndTime", "()Ljava/util/Calendar;", "getExpireStartTime", "getProfileId", "getReadByUser", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTitle", "getUid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: NoticeBoardItem.kt */
public final class NoticeBoardItem implements ReadableByUserModel, Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    public final String c;
    public final Calendar e;
    public final Calendar f;

    /* renamed from: g  reason: collision with root package name */
    public final String f5884g;

    /* renamed from: h  reason: collision with root package name */
    public final String f5885h;

    /* renamed from: i  reason: collision with root package name */
    public final String f5886i;

    /* renamed from: j  reason: collision with root package name */
    public final Boolean f5887j;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static class Creator implements Parcelable.Creator {
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
            return new NoticeBoardItem(readString, calendar, calendar2, readString2, readString3, readString4, bool);
        }

        public final Object[] newArray(int i2) {
            return new NoticeBoardItem[i2];
        }
    }

    public NoticeBoardItem(String str, Calendar calendar, Calendar calendar2, String str2, String str3, String str4, Boolean bool) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(calendar, "expireStartTime");
        Intrinsics.checkParameterIsNotNull(calendar2, "expireEndTime");
        Intrinsics.checkParameterIsNotNull(str2, "content");
        Intrinsics.checkParameterIsNotNull(str3, "title");
        Intrinsics.checkParameterIsNotNull(str4, "profileId");
        this.c = str;
        this.e = calendar;
        this.f = calendar2;
        this.f5884g = str2;
        this.f5885h = str3;
        this.f5886i = str4;
        this.f5887j = bool;
    }

    public static /* synthetic */ NoticeBoardItem copy$default(NoticeBoardItem noticeBoardItem, String str, Calendar calendar, Calendar calendar2, String str2, String str3, String str4, Boolean bool, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = noticeBoardItem.d();
        }
        if ((i2 & 2) != 0) {
            calendar = noticeBoardItem.e;
        }
        Calendar calendar3 = calendar;
        if ((i2 & 4) != 0) {
            calendar2 = noticeBoardItem.f;
        }
        Calendar calendar4 = calendar2;
        if ((i2 & 8) != 0) {
            str2 = noticeBoardItem.f5884g;
        }
        String str5 = str2;
        if ((i2 & 16) != 0) {
            str3 = noticeBoardItem.f5885h;
        }
        String str6 = str3;
        if ((i2 & 32) != 0) {
            str4 = noticeBoardItem.e();
        }
        String str7 = str4;
        if ((i2 & 64) != 0) {
            bool = noticeBoardItem.i();
        }
        return noticeBoardItem.a(str, calendar3, calendar4, str5, str6, str7, bool);
    }

    public final NoticeBoardItem a(String str, Calendar calendar, Calendar calendar2, String str2, String str3, String str4, Boolean bool) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(calendar, "expireStartTime");
        Intrinsics.checkParameterIsNotNull(calendar2, "expireEndTime");
        Intrinsics.checkParameterIsNotNull(str2, "content");
        Intrinsics.checkParameterIsNotNull(str3, "title");
        Intrinsics.checkParameterIsNotNull(str4, "profileId");
        return new NoticeBoardItem(str, calendar, calendar2, str2, str3, str4, bool);
    }

    public String d() {
        return this.c;
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.f5886i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeBoardItem)) {
            return false;
        }
        NoticeBoardItem noticeBoardItem = (NoticeBoardItem) obj;
        return Intrinsics.areEqual((Object) d(), (Object) noticeBoardItem.d()) && Intrinsics.areEqual((Object) this.e, (Object) noticeBoardItem.e) && Intrinsics.areEqual((Object) this.f, (Object) noticeBoardItem.f) && Intrinsics.areEqual((Object) this.f5884g, (Object) noticeBoardItem.f5884g) && Intrinsics.areEqual((Object) this.f5885h, (Object) noticeBoardItem.f5885h) && Intrinsics.areEqual((Object) e(), (Object) noticeBoardItem.e()) && Intrinsics.areEqual((Object) i(), (Object) noticeBoardItem.i());
    }

    public final String f() {
        return this.f5884g;
    }

    public final Calendar g() {
        return this.f;
    }

    public final Calendar h() {
        return this.e;
    }

    public int hashCode() {
        String d2 = d();
        int i2 = 0;
        int hashCode = (d2 != null ? d2.hashCode() : 0) * 31;
        Calendar calendar = this.e;
        int hashCode2 = (hashCode + (calendar != null ? calendar.hashCode() : 0)) * 31;
        Calendar calendar2 = this.f;
        int hashCode3 = (hashCode2 + (calendar2 != null ? calendar2.hashCode() : 0)) * 31;
        String str = this.f5884g;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5885h;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String e2 = e();
        int hashCode6 = (hashCode5 + (e2 != null ? e2.hashCode() : 0)) * 31;
        Boolean i3 = i();
        if (i3 != null) {
            i2 = i3.hashCode();
        }
        return hashCode6 + i2;
    }

    public Boolean i() {
        return this.f5887j;
    }

    public final String j() {
        return this.f5885h;
    }

    public String toString() {
        StringBuilder a2 = a.a("NoticeBoardItem(uid=");
        a2.append(d());
        a2.append(", expireStartTime=");
        a2.append(this.e);
        a2.append(", expireEndTime=");
        a2.append(this.f);
        a2.append(", content=");
        a2.append(this.f5884g);
        a2.append(", title=");
        a2.append(this.f5885h);
        a2.append(", profileId=");
        a2.append(e());
        a2.append(", readByUser=");
        a2.append(i());
        a2.append(")");
        return a2.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.c);
        CalendarParceler.INSTANCE.write(this.e, parcel, i2);
        CalendarParceler.INSTANCE.write(this.f, parcel, i2);
        parcel.writeString(this.f5884g);
        parcel.writeString(this.f5885h);
        parcel.writeString(this.f5886i);
        Boolean bool = this.f5887j;
        if (bool != null) {
            parcel.writeInt(1);
            z = bool.booleanValue();
        } else {
            z = false;
        }
        parcel.writeInt(z ? 1 : 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NoticeBoardItem(String str, Calendar calendar, Calendar calendar2, String str2, String str3, String str4, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, calendar, calendar2, str2, str3, str4, (i2 & 64) != 0 ? null : bool);
    }
}
