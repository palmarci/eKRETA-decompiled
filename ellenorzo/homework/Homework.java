package p289hu.ekreta.ellenorzo.homework;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p349io.ConstantsKt;
import p000a.p020b.p021a.p022a.C0082a;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.parceler.CalendarParceler;
import p289hu.ekreta.ellenorzo.reminder.Reminder;
import p289hu.ekreta.ellenorzo.reminder.Reminder.Type;
import p289hu.ekreta.ellenorzo.util.mapper.ReadableByUserModel;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003Bm\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0013J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\nHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00102\u001a\u00020\rHÆ\u0003J\t\u00103\u001a\u00020\rHÆ\u0003J\t\u00104\u001a\u00020\rHÆ\u0003J\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u00106J\b\u00107\u001a\u000208H\u0016J\u0013\u00109\u001a\u00020\n2\b\u0010:\u001a\u0004\u0018\u00010;HÖ\u0003J\u000e\u0010<\u001a\u00020\u00052\u0006\u0010=\u001a\u00020>J\t\u0010?\u001a\u000208HÖ\u0001J\t\u0010@\u001a\u00020\u0005HÖ\u0001J\u0019\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u000208HÖ\u0001R\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0019R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\nX\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u001a\u0010\"\u001a\u00020#X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018¨\u0006F"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/homework/Homework;", "Lhu/ekreta/ellenorzo/reminder/Reminder;", "Lhu/ekreta/ellenorzo/util/mapper/ReadableByUserModel;", "Landroid/os/Parcelable;", "uid", "", "profileId", "subjectName", "recorderTeacherName", "isTeacherRecorded", "", "text", "recordDate", "Ljava/util/Calendar;", "deadlineDate", "createDate", "isStudentHomeworkEnabled", "readByUser", "groupUid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/util/Calendar;ZLjava/lang/Boolean;Ljava/lang/String;)V", "getCreateDate", "()Ljava/util/Calendar;", "getDeadlineDate", "getGroupUid", "()Ljava/lang/String;", "()Z", "getProfileId", "getReadByUser", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRecordDate", "getRecorderTeacherName", "getSubjectName", "getText", "type", "Lhu/ekreta/ellenorzo/reminder/Reminder$Type;", "type$annotations", "()V", "getType", "()Lhu/ekreta/ellenorzo/reminder/Reminder$Type;", "getUid", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/util/Calendar;ZLjava/lang/Boolean;Ljava/lang/String;)Lhu/ekreta/ellenorzo/homework/Homework;", "describeContents", "", "equals", "other", "", "getTitle", "ctx", "Landroid/content/Context;", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.homework.Homework */
/* compiled from: Homework.kt */
public final class Homework extends Reminder implements ReadableByUserModel, Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new Creator();

    /* renamed from: c */
    public final Type f13423c;

    /* renamed from: e */
    public final String f13424e;

    /* renamed from: f */
    public final String f13425f;

    /* renamed from: g */
    public final String f13426g;

    /* renamed from: h */
    public final String f13427h;

    /* renamed from: i */
    public final boolean f13428i;

    /* renamed from: j */
    public final String f13429j;

    /* renamed from: k */
    public final Calendar f13430k;

    /* renamed from: l */
    public final Calendar f13431l;

    /* renamed from: m */
    public final Calendar f13432m;

    /* renamed from: n */
    public final boolean f13433n;

    /* renamed from: o */
    public final Boolean f13434o;

    /* renamed from: p */
    public final String f13435p;

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.homework.Homework$Creator */
    public static class Creator implements android.os.Parcelable.Creator {
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
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z = false;
                }
                bool = Boolean.valueOf(z);
            } else {
                bool = null;
            }
            Homework homework = new Homework(readString, readString2, readString3, readString4, z2, readString5, calendar, calendar2, calendar3, z3, bool, parcel.readString());
            return homework;
        }

        public final Object[] newArray(int i) {
            return new Homework[i];
        }
    }

    public /* synthetic */ Homework(String str, String str2, String str3, String str4, boolean z, String str5, Calendar calendar, Calendar calendar2, Calendar calendar3, boolean z2, Boolean bool, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, z, str5, calendar, calendar2, calendar3, z2, (i & 1024) != 0 ? null : bool, str6);
    }

    public static /* synthetic */ Homework copy$default(Homework homework, String str, String str2, String str3, String str4, boolean z, String str5, Calendar calendar, Calendar calendar2, Calendar calendar3, boolean z2, Boolean bool, String str6, int i, Object obj) {
        Homework homework2 = homework;
        int i2 = i;
        return homework.mo12903a((i2 & 1) != 0 ? homework.mo11316d() : str, (i2 & 2) != 0 ? homework.mo11318e() : str2, (i2 & 4) != 0 ? homework2.f13426g : str3, (i2 & 8) != 0 ? homework2.f13427h : str4, (i2 & 16) != 0 ? homework2.f13428i : z, (i2 & 32) != 0 ? homework2.f13429j : str5, (i2 & 64) != 0 ? homework2.f13430k : calendar, (i2 & 128) != 0 ? homework2.f13431l : calendar2, (i2 & 256) != 0 ? homework2.f13432m : calendar3, (i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? homework2.f13433n : z2, (i2 & 1024) != 0 ? homework.mo12911j() : bool, (i2 & 2048) != 0 ? homework2.f13435p : str6);
    }

    public static /* synthetic */ void type$annotations() {
    }

    /* renamed from: a */
    public final Homework mo12903a(String str, String str2, String str3, String str4, boolean z, String str5, Calendar calendar, Calendar calendar2, Calendar calendar3, boolean z2, Boolean bool, String str6) {
        String str7 = str;
        Intrinsics.checkParameterIsNotNull(str, "uid");
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
        Homework homework = new Homework(str7, str8, str9, str10, z, str5, calendar4, calendar5, calendar6, z2, bool, str6);
        return homework;
    }

    /* renamed from: a */
    public final String mo12904a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "ctx");
        String string = context.getString(C4014R.string.HomeworkDetail_Page_Title);
        Intrinsics.checkExpressionValueIsNotNull(string, "ctx.getString(R.string.HomeworkDetail_Page_Title)");
        return string;
    }

    /* renamed from: d */
    public String mo11316d() {
        return this.f13424e;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String mo11318e() {
        return this.f13425f;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Homework) {
                Homework homework = (Homework) obj;
                if (Intrinsics.areEqual((Object) mo11316d(), (Object) homework.mo11316d()) && Intrinsics.areEqual((Object) mo11318e(), (Object) homework.mo11318e()) && Intrinsics.areEqual((Object) this.f13426g, (Object) homework.f13426g) && Intrinsics.areEqual((Object) this.f13427h, (Object) homework.f13427h)) {
                    if ((this.f13428i == homework.f13428i) && Intrinsics.areEqual((Object) this.f13429j, (Object) homework.f13429j) && Intrinsics.areEqual((Object) this.f13430k, (Object) homework.f13430k) && Intrinsics.areEqual((Object) this.f13431l, (Object) homework.f13431l) && Intrinsics.areEqual((Object) this.f13432m, (Object) homework.f13432m)) {
                        if (!(this.f13433n == homework.f13433n) || !Intrinsics.areEqual((Object) mo12911j(), (Object) homework.mo12911j()) || !Intrinsics.areEqual((Object) this.f13435p, (Object) homework.f13435p)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public Type mo11320f() {
        return this.f13423c;
    }

    /* renamed from: g */
    public final Calendar mo12907g() {
        return this.f13432m;
    }

    /* renamed from: h */
    public final Calendar mo12908h() {
        return this.f13431l;
    }

    public int hashCode() {
        String d = mo11316d();
        int i = 0;
        int hashCode = (d != null ? d.hashCode() : 0) * 31;
        String e = mo11318e();
        int hashCode2 = (hashCode + (e != null ? e.hashCode() : 0)) * 31;
        String str = this.f13426g;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f13427h;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.f13428i;
        if (z) {
            z = true;
        }
        int i2 = (hashCode4 + (z ? 1 : 0)) * 31;
        String str3 = this.f13429j;
        int hashCode5 = (i2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Calendar calendar = this.f13430k;
        int hashCode6 = (hashCode5 + (calendar != null ? calendar.hashCode() : 0)) * 31;
        Calendar calendar2 = this.f13431l;
        int hashCode7 = (hashCode6 + (calendar2 != null ? calendar2.hashCode() : 0)) * 31;
        Calendar calendar3 = this.f13432m;
        int hashCode8 = (hashCode7 + (calendar3 != null ? calendar3.hashCode() : 0)) * 31;
        boolean z2 = this.f13433n;
        if (z2) {
            z2 = true;
        }
        int i3 = (hashCode8 + (z2 ? 1 : 0)) * 31;
        Boolean j = mo12911j();
        int hashCode9 = (i3 + (j != null ? j.hashCode() : 0)) * 31;
        String str4 = this.f13435p;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode9 + i;
    }

    /* renamed from: i */
    public final String mo12910i() {
        return this.f13435p;
    }

    /* renamed from: j */
    public Boolean mo12911j() {
        return this.f13434o;
    }

    /* renamed from: k */
    public final Calendar mo12912k() {
        return this.f13430k;
    }

    /* renamed from: l */
    public final String mo12913l() {
        return this.f13427h;
    }

    /* renamed from: m */
    public final String mo12914m() {
        return this.f13426g;
    }

    /* renamed from: n */
    public final String mo12915n() {
        return this.f13429j;
    }

    /* renamed from: o */
    public final boolean mo12916o() {
        return this.f13433n;
    }

    /* renamed from: p */
    public final boolean mo12917p() {
        return this.f13428i;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("Homework(uid=");
        a.append(mo11316d());
        a.append(", profileId=");
        a.append(mo11318e());
        a.append(", subjectName=");
        a.append(this.f13426g);
        a.append(", recorderTeacherName=");
        a.append(this.f13427h);
        a.append(", isTeacherRecorded=");
        a.append(this.f13428i);
        a.append(", text=");
        a.append(this.f13429j);
        a.append(", recordDate=");
        a.append(this.f13430k);
        a.append(", deadlineDate=");
        a.append(this.f13431l);
        a.append(", createDate=");
        a.append(this.f13432m);
        a.append(", isStudentHomeworkEnabled=");
        a.append(this.f13433n);
        a.append(", readByUser=");
        a.append(mo12911j());
        a.append(", groupUid=");
        return C0082a.m106a(a, this.f13435p, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.f13424e);
        parcel.writeString(this.f13425f);
        parcel.writeString(this.f13426g);
        parcel.writeString(this.f13427h);
        parcel.writeInt(this.f13428i ? 1 : 0);
        parcel.writeString(this.f13429j);
        CalendarParceler.INSTANCE.write(this.f13430k, parcel, i);
        CalendarParceler.INSTANCE.write(this.f13431l, parcel, i);
        CalendarParceler.INSTANCE.write(this.f13432m, parcel, i);
        parcel.writeInt(this.f13433n ? 1 : 0);
        Boolean bool = this.f13434o;
        if (bool != null) {
            parcel.writeInt(1);
            z = bool.booleanValue();
        } else {
            z = false;
        }
        parcel.writeInt(z ? 1 : 0);
        parcel.writeString(this.f13435p);
    }

    public Homework(String str, String str2, String str3, String str4, boolean z, String str5, Calendar calendar, Calendar calendar2, Calendar calendar3, boolean z2, Boolean bool, String str6) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(str2, "profileId");
        Intrinsics.checkParameterIsNotNull(str3, "subjectName");
        Intrinsics.checkParameterIsNotNull(str4, "recorderTeacherName");
        Intrinsics.checkParameterIsNotNull(calendar, "recordDate");
        Intrinsics.checkParameterIsNotNull(calendar2, "deadlineDate");
        Intrinsics.checkParameterIsNotNull(calendar3, "createDate");
        this.f13424e = str;
        this.f13425f = str2;
        this.f13426g = str3;
        this.f13427h = str4;
        this.f13428i = z;
        this.f13429j = str5;
        this.f13430k = calendar;
        this.f13431l = calendar2;
        this.f13432m = calendar3;
        this.f13433n = z2;
        this.f13434o = bool;
        this.f13435p = str6;
        this.f13423c = Type.HOMEWORK;
    }
}
