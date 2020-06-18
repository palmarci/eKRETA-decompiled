package hu.ekreta.ellenorzo.homework;

import a.b.a.a.a;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.parceler.CalendarParceler;
import hu.ekreta.ellenorzo.reminder.Reminder;
import hu.ekreta.ellenorzo.util.mapper.ReadableByUserModel;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003Bu\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0014J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\nHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00104\u001a\u00020\rHÆ\u0003J\t\u00105\u001a\u00020\rHÆ\u0003J\t\u00106\u001a\u00020\rHÆ\u0003J\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u00108J\b\u00109\u001a\u00020:H\u0016J\u0013\u0010;\u001a\u00020\n2\b\u0010<\u001a\u0004\u0018\u00010=HÖ\u0003J\u000e\u0010>\u001a\u00020\u00052\u0006\u0010?\u001a\u00020@J\t\u0010A\u001a\u00020:HÖ\u0001J\t\u0010B\u001a\u00020\u0005HÖ\u0001J\u0019\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020:HÖ\u0001R\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u001aR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\nX\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u001a\u0010#\u001a\u00020$X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019¨\u0006H"}, d2 = {"Lhu/ekreta/ellenorzo/homework/Homework;", "Lhu/ekreta/ellenorzo/reminder/Reminder;", "Lhu/ekreta/ellenorzo/util/mapper/ReadableByUserModel;", "Landroid/os/Parcelable;", "uid", "", "profileId", "subjectName", "recorderTeacherName", "isTeacherRecorded", "", "text", "recordDate", "Ljava/util/Calendar;", "deadlineDate", "createDate", "isStudentHomeworkEnabled", "isDone", "readByUser", "groupUid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/util/Calendar;ZZLjava/lang/Boolean;Ljava/lang/String;)V", "getCreateDate", "()Ljava/util/Calendar;", "getDeadlineDate", "getGroupUid", "()Ljava/lang/String;", "()Z", "getProfileId", "getReadByUser", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRecordDate", "getRecorderTeacherName", "getSubjectName", "getText", "type", "Lhu/ekreta/ellenorzo/reminder/Reminder$Type;", "type$annotations", "()V", "getType", "()Lhu/ekreta/ellenorzo/reminder/Reminder$Type;", "getUid", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/util/Calendar;ZZLjava/lang/Boolean;Ljava/lang/String;)Lhu/ekreta/ellenorzo/homework/Homework;", "describeContents", "", "equals", "other", "", "getTitle", "ctx", "Landroid/content/Context;", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: Homework.kt */
public final class Homework extends Reminder implements ReadableByUserModel, Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    public final Reminder.Type c;
    public final String e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final String f5646g;

    /* renamed from: h  reason: collision with root package name */
    public final String f5647h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f5648i;

    /* renamed from: j  reason: collision with root package name */
    public final String f5649j;

    /* renamed from: k  reason: collision with root package name */
    public final Calendar f5650k;

    /* renamed from: l  reason: collision with root package name */
    public final Calendar f5651l;

    /* renamed from: m  reason: collision with root package name */
    public final Calendar f5652m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f5653n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f5654o;

    /* renamed from: p  reason: collision with root package name */
    public final Boolean f5655p;

    /* renamed from: q  reason: collision with root package name */
    public final String f5656q;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static class Creator implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Boolean bool;
            Parcel parcel2 = parcel;
            Intrinsics.checkParameterIsNotNull(parcel2, "in");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            boolean z = true;
            boolean z2 = parcel.readInt() != 0;
            String readString5 = parcel.readString();
            Calendar calendar = (Calendar) CalendarParceler.INSTANCE.create(parcel2);
            Calendar calendar2 = (Calendar) CalendarParceler.INSTANCE.create(parcel2);
            Calendar calendar3 = (Calendar) CalendarParceler.INSTANCE.create(parcel2);
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z = false;
                }
                bool = Boolean.valueOf(z);
            } else {
                bool = null;
            }
            return new Homework(readString, readString2, readString3, readString4, z2, readString5, calendar, calendar2, calendar3, z3, z4, bool, parcel.readString());
        }

        public final Object[] newArray(int i2) {
            return new Homework[i2];
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Homework(String str, String str2, String str3, String str4, boolean z, String str5, Calendar calendar, Calendar calendar2, Calendar calendar3, boolean z2, boolean z3, Boolean bool, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, z, str5, calendar, calendar2, calendar3, z2, z3, (i2 & 2048) != 0 ? null : bool, str6);
    }

    public static /* synthetic */ Homework copy$default(Homework homework, String str, String str2, String str3, String str4, boolean z, String str5, Calendar calendar, Calendar calendar2, Calendar calendar3, boolean z2, boolean z3, Boolean bool, String str6, int i2, Object obj) {
        Homework homework2 = homework;
        int i3 = i2;
        return homework.a((i3 & 1) != 0 ? homework.d() : str, (i3 & 2) != 0 ? homework.e() : str2, (i3 & 4) != 0 ? homework2.f5646g : str3, (i3 & 8) != 0 ? homework2.f5647h : str4, (i3 & 16) != 0 ? homework2.f5648i : z, (i3 & 32) != 0 ? homework2.f5649j : str5, (i3 & 64) != 0 ? homework2.f5650k : calendar, (i3 & 128) != 0 ? homework2.f5651l : calendar2, (i3 & 256) != 0 ? homework2.f5652m : calendar3, (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? homework2.f5653n : z2, (i3 & 1024) != 0 ? homework2.f5654o : z3, (i3 & 2048) != 0 ? homework.j() : bool, (i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? homework2.f5656q : str6);
    }

    public static /* synthetic */ void type$annotations() {
    }

    public final Homework a(String str, String str2, String str3, String str4, boolean z, String str5, Calendar calendar, Calendar calendar2, Calendar calendar3, boolean z2, boolean z3, Boolean bool, String str6) {
        String str7 = str;
        Intrinsics.checkParameterIsNotNull(str7, "uid");
        String str8 = str2;
        Intrinsics.checkParameterIsNotNull(str8, "profileId");
        String str9 = str3;
        Intrinsics.checkParameterIsNotNull(str9, "subjectName");
        String str10 = str4;
        Intrinsics.checkParameterIsNotNull(str10, "recorderTeacherName");
        Calendar calendar4 = calendar;
        Intrinsics.checkParameterIsNotNull(calendar4, "recordDate");
        Calendar calendar5 = calendar2;
        Intrinsics.checkParameterIsNotNull(calendar5, "deadlineDate");
        Calendar calendar6 = calendar3;
        Intrinsics.checkParameterIsNotNull(calendar6, "createDate");
        return new Homework(str7, str8, str9, str10, z, str5, calendar4, calendar5, calendar6, z2, z3, bool, str6);
    }

    public final String a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "ctx");
        String string = context.getString(R.string.HomeworkDetail_Page_Title);
        Intrinsics.checkExpressionValueIsNotNull(string, "ctx.getString(R.string.HomeworkDetail_Page_Title)");
        return string;
    }

    public String d() {
        return this.e;
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Homework) {
                Homework homework = (Homework) obj;
                if (Intrinsics.areEqual((Object) d(), (Object) homework.d()) && Intrinsics.areEqual((Object) e(), (Object) homework.e()) && Intrinsics.areEqual((Object) this.f5646g, (Object) homework.f5646g) && Intrinsics.areEqual((Object) this.f5647h, (Object) homework.f5647h)) {
                    if ((this.f5648i == homework.f5648i) && Intrinsics.areEqual((Object) this.f5649j, (Object) homework.f5649j) && Intrinsics.areEqual((Object) this.f5650k, (Object) homework.f5650k) && Intrinsics.areEqual((Object) this.f5651l, (Object) homework.f5651l) && Intrinsics.areEqual((Object) this.f5652m, (Object) homework.f5652m)) {
                        if (this.f5653n == homework.f5653n) {
                            if (!(this.f5654o == homework.f5654o) || !Intrinsics.areEqual((Object) j(), (Object) homework.j()) || !Intrinsics.areEqual((Object) this.f5656q, (Object) homework.f5656q)) {
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public Reminder.Type f() {
        return this.c;
    }

    public final Calendar g() {
        return this.f5652m;
    }

    public final Calendar h() {
        return this.f5651l;
    }

    public int hashCode() {
        String d2 = d();
        int i2 = 0;
        int hashCode = (d2 != null ? d2.hashCode() : 0) * 31;
        String e2 = e();
        int hashCode2 = (hashCode + (e2 != null ? e2.hashCode() : 0)) * 31;
        String str = this.f5646g;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5647h;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.f5648i;
        if (z) {
            z = true;
        }
        int i3 = (hashCode4 + (z ? 1 : 0)) * 31;
        String str3 = this.f5649j;
        int hashCode5 = (i3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Calendar calendar = this.f5650k;
        int hashCode6 = (hashCode5 + (calendar != null ? calendar.hashCode() : 0)) * 31;
        Calendar calendar2 = this.f5651l;
        int hashCode7 = (hashCode6 + (calendar2 != null ? calendar2.hashCode() : 0)) * 31;
        Calendar calendar3 = this.f5652m;
        int hashCode8 = (hashCode7 + (calendar3 != null ? calendar3.hashCode() : 0)) * 31;
        boolean z2 = this.f5653n;
        if (z2) {
            z2 = true;
        }
        int i4 = (hashCode8 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.f5654o;
        if (z3) {
            z3 = true;
        }
        int i5 = (i4 + (z3 ? 1 : 0)) * 31;
        Boolean j2 = j();
        int hashCode9 = (i5 + (j2 != null ? j2.hashCode() : 0)) * 31;
        String str4 = this.f5656q;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode9 + i2;
    }

    public final String i() {
        return this.f5656q;
    }

    public Boolean j() {
        return this.f5655p;
    }

    public final Calendar k() {
        return this.f5650k;
    }

    public final String l() {
        return this.f5647h;
    }

    public final String m() {
        return this.f5646g;
    }

    public final String n() {
        return this.f5649j;
    }

    public final boolean o() {
        return this.f5654o;
    }

    public final boolean p() {
        return this.f5653n;
    }

    public final boolean q() {
        return this.f5648i;
    }

    public String toString() {
        StringBuilder a2 = a.a("Homework(uid=");
        a2.append(d());
        a2.append(", profileId=");
        a2.append(e());
        a2.append(", subjectName=");
        a2.append(this.f5646g);
        a2.append(", recorderTeacherName=");
        a2.append(this.f5647h);
        a2.append(", isTeacherRecorded=");
        a2.append(this.f5648i);
        a2.append(", text=");
        a2.append(this.f5649j);
        a2.append(", recordDate=");
        a2.append(this.f5650k);
        a2.append(", deadlineDate=");
        a2.append(this.f5651l);
        a2.append(", createDate=");
        a2.append(this.f5652m);
        a2.append(", isStudentHomeworkEnabled=");
        a2.append(this.f5653n);
        a2.append(", isDone=");
        a2.append(this.f5654o);
        a2.append(", readByUser=");
        a2.append(j());
        a2.append(", groupUid=");
        return a.a(a2, this.f5656q, ")");
    }

    public void writeToParcel(Parcel parcel, int i2) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.f5646g);
        parcel.writeString(this.f5647h);
        parcel.writeInt(this.f5648i ? 1 : 0);
        parcel.writeString(this.f5649j);
        CalendarParceler.INSTANCE.write(this.f5650k, parcel, i2);
        CalendarParceler.INSTANCE.write(this.f5651l, parcel, i2);
        CalendarParceler.INSTANCE.write(this.f5652m, parcel, i2);
        parcel.writeInt(this.f5653n ? 1 : 0);
        parcel.writeInt(this.f5654o ? 1 : 0);
        Boolean bool = this.f5655p;
        if (bool != null) {
            parcel.writeInt(1);
            z = bool.booleanValue();
        } else {
            z = false;
        }
        parcel.writeInt(z ? 1 : 0);
        parcel.writeString(this.f5656q);
    }

    public Homework(String str, String str2, String str3, String str4, boolean z, String str5, Calendar calendar, Calendar calendar2, Calendar calendar3, boolean z2, boolean z3, Boolean bool, String str6) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(str2, "profileId");
        Intrinsics.checkParameterIsNotNull(str3, "subjectName");
        Intrinsics.checkParameterIsNotNull(str4, "recorderTeacherName");
        Intrinsics.checkParameterIsNotNull(calendar, "recordDate");
        Intrinsics.checkParameterIsNotNull(calendar2, "deadlineDate");
        Intrinsics.checkParameterIsNotNull(calendar3, "createDate");
        this.e = str;
        this.f = str2;
        this.f5646g = str3;
        this.f5647h = str4;
        this.f5648i = z;
        this.f5649j = str5;
        this.f5650k = calendar;
        this.f5651l = calendar2;
        this.f5652m = calendar3;
        this.f5653n = z2;
        this.f5654o = z3;
        this.f5655p = bool;
        this.f5656q = str6;
        this.c = Reminder.Type.HOMEWORK;
    }
}
