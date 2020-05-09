package p289hu.ekreta.ellenorzo.notes;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p349io.ConstantsKt;
import p000a.p020b.p021a.p022a.C0082a;
import p289hu.ekreta.ellenorzo.parceler.CalendarParceler;
import p289hu.ekreta.ellenorzo.util.mapper.ReadableByUserModel;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0004HÆ\u0003J\t\u0010$\u001a\u00020\u0004HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010'\u001a\u00020\u0004HÆ\u0003J\t\u0010(\u001a\u00020\u0004HÆ\u0003J\t\u0010)\u001a\u00020\u0004HÆ\u0003J\t\u0010*\u001a\u00020\u0004HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010,\u001a\u00020\u0004HÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003J\t\u0010.\u001a\u00020\nHÆ\u0003J\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u00100J\b\u00101\u001a\u000202H\u0016J\u0013\u00103\u001a\u00020\u00112\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u000202HÖ\u0001J\t\u00107\u001a\u00020\u0004HÖ\u0001J\u0019\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u000202HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0014\u0010\u000e\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014¨\u0006="}, mo17463d2 = {"Lhu/ekreta/ellenorzo/notes/Note;", "Lhu/ekreta/ellenorzo/util/mapper/ReadableByUserModel;", "Landroid/os/Parcelable;", "uid", "", "typeName", "typeDescription", "title", "content", "seenByTutelaryUTC", "Ljava/util/Calendar;", "teacher", "recordingDate", "creatingTime", "profileId", "groupUid", "readByUser", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;Ljava/lang/String;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getContent", "()Ljava/lang/String;", "getCreatingTime", "()Ljava/util/Calendar;", "getGroupUid", "getProfileId", "getReadByUser", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRecordingDate", "getSeenByTutelaryUTC", "getTeacher", "getTitle", "getTypeDescription", "getTypeName", "getUid", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;Ljava/lang/String;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lhu/ekreta/ellenorzo/notes/Note;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.notes.Note */
/* compiled from: Note.kt */
public final class Note implements ReadableByUserModel, Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new Creator();

    /* renamed from: c */
    public final String f14043c;

    /* renamed from: e */
    public final String f14044e;

    /* renamed from: f */
    public final String f14045f;

    /* renamed from: g */
    public final String f14046g;

    /* renamed from: h */
    public final String f14047h;

    /* renamed from: i */
    public final Calendar f14048i;

    /* renamed from: j */
    public final String f14049j;

    /* renamed from: k */
    public final Calendar f14050k;

    /* renamed from: l */
    public final Calendar f14051l;

    /* renamed from: m */
    public final String f14052m;

    /* renamed from: n */
    public final String f14053n;

    /* renamed from: o */
    public final Boolean f14054o;

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.notes.Note$Creator */
    public static class Creator implements android.os.Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Boolean bool;
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            Calendar calendar = (Calendar) parcel.readSerializable();
            String readString6 = parcel.readString();
            Calendar calendar2 = (Calendar) CalendarParceler.INSTANCE.create(parcel);
            Calendar calendar3 = (Calendar) CalendarParceler.INSTANCE.create(parcel);
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool = null;
            }
            Note note = new Note(readString, readString2, readString3, readString4, readString5, calendar, readString6, calendar2, calendar3, readString7, readString8, bool);
            return note;
        }

        public final Object[] newArray(int i) {
            return new Note[i];
        }
    }

    public Note(String str, String str2, String str3, String str4, String str5, Calendar calendar, String str6, Calendar calendar2, Calendar calendar3, String str7, String str8, Boolean bool) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(str2, "typeName");
        Intrinsics.checkParameterIsNotNull(str3, "typeDescription");
        Intrinsics.checkParameterIsNotNull(str4, "title");
        Intrinsics.checkParameterIsNotNull(str5, "content");
        Intrinsics.checkParameterIsNotNull(str6, "teacher");
        Intrinsics.checkParameterIsNotNull(calendar2, "recordingDate");
        Intrinsics.checkParameterIsNotNull(calendar3, "creatingTime");
        Intrinsics.checkParameterIsNotNull(str7, "profileId");
        this.f14043c = str;
        this.f14044e = str2;
        this.f14045f = str3;
        this.f14046g = str4;
        this.f14047h = str5;
        this.f14048i = calendar;
        this.f14049j = str6;
        this.f14050k = calendar2;
        this.f14051l = calendar3;
        this.f14052m = str7;
        this.f14053n = str8;
        this.f14054o = bool;
    }

    public static /* synthetic */ Note copy$default(Note note, String str, String str2, String str3, String str4, String str5, Calendar calendar, String str6, Calendar calendar2, Calendar calendar3, String str7, String str8, Boolean bool, int i, Object obj) {
        Note note2 = note;
        int i2 = i;
        return note.mo13553a((i2 & 1) != 0 ? note.mo11316d() : str, (i2 & 2) != 0 ? note2.f14044e : str2, (i2 & 4) != 0 ? note2.f14045f : str3, (i2 & 8) != 0 ? note2.f14046g : str4, (i2 & 16) != 0 ? note2.f14047h : str5, (i2 & 32) != 0 ? note2.f14048i : calendar, (i2 & 64) != 0 ? note2.f14049j : str6, (i2 & 128) != 0 ? note2.f14050k : calendar2, (i2 & 256) != 0 ? note2.f14051l : calendar3, (i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? note.mo11318e() : str7, (i2 & 1024) != 0 ? note2.f14053n : str8, (i2 & 2048) != 0 ? note.mo13560i() : bool);
    }

    /* renamed from: a */
    public final Note mo13553a(String str, String str2, String str3, String str4, String str5, Calendar calendar, String str6, Calendar calendar2, Calendar calendar3, String str7, String str8, Boolean bool) {
        String str9 = str;
        Intrinsics.checkParameterIsNotNull(str, "uid");
        String str10 = str2;
        Intrinsics.checkParameterIsNotNull(str10, "typeName");
        String str11 = str3;
        Intrinsics.checkParameterIsNotNull(str11, "typeDescription");
        String str12 = str4;
        Intrinsics.checkParameterIsNotNull(str12, "title");
        String str13 = str5;
        Intrinsics.checkParameterIsNotNull(str13, "content");
        String str14 = str6;
        Intrinsics.checkParameterIsNotNull(str14, "teacher");
        Calendar calendar4 = calendar2;
        Intrinsics.checkParameterIsNotNull(calendar4, "recordingDate");
        Calendar calendar5 = calendar3;
        Intrinsics.checkParameterIsNotNull(calendar5, "creatingTime");
        String str15 = str7;
        Intrinsics.checkParameterIsNotNull(str15, "profileId");
        Note note = new Note(str9, str10, str11, str12, str13, calendar, str14, calendar4, calendar5, str15, str8, bool);
        return note;
    }

    /* renamed from: d */
    public String mo11316d() {
        return this.f14043c;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String mo11318e() {
        return this.f14052m;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008a, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) mo13560i(), (java.lang.Object) r3.mo13560i()) != false) goto L_0x008f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x008f
            boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.notes.Note
            if (r0 == 0) goto L_0x008d
            hu.ekreta.ellenorzo.notes.Note r3 = (p289hu.ekreta.ellenorzo.notes.Note) r3
            java.lang.String r0 = r2.mo11316d()
            java.lang.String r1 = r3.mo11316d()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008d
            java.lang.String r0 = r2.f14044e
            java.lang.String r1 = r3.f14044e
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008d
            java.lang.String r0 = r2.f14045f
            java.lang.String r1 = r3.f14045f
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008d
            java.lang.String r0 = r2.f14046g
            java.lang.String r1 = r3.f14046g
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008d
            java.lang.String r0 = r2.f14047h
            java.lang.String r1 = r3.f14047h
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008d
            java.util.Calendar r0 = r2.f14048i
            java.util.Calendar r1 = r3.f14048i
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008d
            java.lang.String r0 = r2.f14049j
            java.lang.String r1 = r3.f14049j
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008d
            java.util.Calendar r0 = r2.f14050k
            java.util.Calendar r1 = r3.f14050k
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008d
            java.util.Calendar r0 = r2.f14051l
            java.util.Calendar r1 = r3.f14051l
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008d
            java.lang.String r0 = r2.mo11318e()
            java.lang.String r1 = r3.mo11318e()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008d
            java.lang.String r0 = r2.f14053n
            java.lang.String r1 = r3.f14053n
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008d
            java.lang.Boolean r0 = r2.mo13560i()
            java.lang.Boolean r3 = r3.mo13560i()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x008d
            goto L_0x008f
        L_0x008d:
            r3 = 0
            return r3
        L_0x008f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.notes.Note.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final String mo13556f() {
        return this.f14047h;
    }

    /* renamed from: g */
    public final Calendar mo13557g() {
        return this.f14051l;
    }

    /* renamed from: h */
    public final String mo13558h() {
        return this.f14053n;
    }

    public int hashCode() {
        String d = mo11316d();
        int i = 0;
        int hashCode = (d != null ? d.hashCode() : 0) * 31;
        String str = this.f14044e;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f14045f;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f14046g;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f14047h;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Calendar calendar = this.f14048i;
        int hashCode6 = (hashCode5 + (calendar != null ? calendar.hashCode() : 0)) * 31;
        String str5 = this.f14049j;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Calendar calendar2 = this.f14050k;
        int hashCode8 = (hashCode7 + (calendar2 != null ? calendar2.hashCode() : 0)) * 31;
        Calendar calendar3 = this.f14051l;
        int hashCode9 = (hashCode8 + (calendar3 != null ? calendar3.hashCode() : 0)) * 31;
        String e = mo11318e();
        int hashCode10 = (hashCode9 + (e != null ? e.hashCode() : 0)) * 31;
        String str6 = this.f14053n;
        int hashCode11 = (hashCode10 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Boolean i2 = mo13560i();
        if (i2 != null) {
            i = i2.hashCode();
        }
        return hashCode11 + i;
    }

    /* renamed from: i */
    public Boolean mo13560i() {
        return this.f14054o;
    }

    /* renamed from: j */
    public final Calendar mo13561j() {
        return this.f14050k;
    }

    /* renamed from: k */
    public final Calendar mo13562k() {
        return this.f14048i;
    }

    /* renamed from: l */
    public final String mo13563l() {
        return this.f14049j;
    }

    /* renamed from: m */
    public final String mo13564m() {
        return this.f14046g;
    }

    /* renamed from: n */
    public final String mo13565n() {
        return this.f14045f;
    }

    /* renamed from: o */
    public final String mo13566o() {
        return this.f14044e;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("Note(uid=");
        a.append(mo11316d());
        a.append(", typeName=");
        a.append(this.f14044e);
        a.append(", typeDescription=");
        a.append(this.f14045f);
        a.append(", title=");
        a.append(this.f14046g);
        a.append(", content=");
        a.append(this.f14047h);
        a.append(", seenByTutelaryUTC=");
        a.append(this.f14048i);
        a.append(", teacher=");
        a.append(this.f14049j);
        a.append(", recordingDate=");
        a.append(this.f14050k);
        a.append(", creatingTime=");
        a.append(this.f14051l);
        a.append(", profileId=");
        a.append(mo11318e());
        a.append(", groupUid=");
        a.append(this.f14053n);
        a.append(", readByUser=");
        a.append(mo13560i());
        a.append(")");
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.f14043c);
        parcel.writeString(this.f14044e);
        parcel.writeString(this.f14045f);
        parcel.writeString(this.f14046g);
        parcel.writeString(this.f14047h);
        parcel.writeSerializable(this.f14048i);
        parcel.writeString(this.f14049j);
        CalendarParceler.INSTANCE.write(this.f14050k, parcel, i);
        CalendarParceler.INSTANCE.write(this.f14051l, parcel, i);
        parcel.writeString(this.f14052m);
        parcel.writeString(this.f14053n);
        Boolean bool = this.f14054o;
        if (bool != null) {
            parcel.writeInt(1);
            z = bool.booleanValue();
        } else {
            z = false;
        }
        parcel.writeInt(z ? 1 : 0);
    }

    public /* synthetic */ Note(String str, String str2, String str3, String str4, String str5, Calendar calendar, String str6, Calendar calendar2, Calendar calendar3, String str7, String str8, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = i;
        this(str, str2, str3, str4, str5, (i2 & 32) != 0 ? null : calendar, str6, calendar2, calendar3, str7, (i2 & 1024) != 0 ? null : str8, (i2 & 2048) != 0 ? null : bool);
    }
}
