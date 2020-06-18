package hu.ekreta.ellenorzo.notes;

import a.b.a.a.a;
import android.os.Parcel;
import android.os.Parcelable;
import hu.ekreta.ellenorzo.parceler.CalendarParceler;
import hu.ekreta.ellenorzo.util.mapper.ReadableByUserModel;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0004HÆ\u0003J\t\u0010$\u001a\u00020\u0004HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010'\u001a\u00020\u0004HÆ\u0003J\t\u0010(\u001a\u00020\u0004HÆ\u0003J\t\u0010)\u001a\u00020\u0004HÆ\u0003J\t\u0010*\u001a\u00020\u0004HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010,\u001a\u00020\u0004HÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003J\t\u0010.\u001a\u00020\nHÆ\u0003J\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u00100J\b\u00101\u001a\u000202H\u0016J\u0013\u00103\u001a\u00020\u00112\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u000202HÖ\u0001J\t\u00107\u001a\u00020\u0004HÖ\u0001J\u0019\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u000202HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0014\u0010\u000e\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014¨\u0006="}, d2 = {"Lhu/ekreta/ellenorzo/notes/Note;", "Lhu/ekreta/ellenorzo/util/mapper/ReadableByUserModel;", "Landroid/os/Parcelable;", "uid", "", "typeName", "typeDescription", "title", "content", "seenByTutelaryUTC", "Ljava/util/Calendar;", "teacher", "recordingDate", "creatingTime", "profileId", "groupUid", "readByUser", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;Ljava/lang/String;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getContent", "()Ljava/lang/String;", "getCreatingTime", "()Ljava/util/Calendar;", "getGroupUid", "getProfileId", "getReadByUser", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRecordingDate", "getSeenByTutelaryUTC", "getTeacher", "getTitle", "getTypeDescription", "getTypeName", "getUid", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;Ljava/lang/String;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lhu/ekreta/ellenorzo/notes/Note;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: Note.kt */
public final class Note implements ReadableByUserModel, Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    public final String c;
    public final String e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final String f5843g;

    /* renamed from: h  reason: collision with root package name */
    public final String f5844h;

    /* renamed from: i  reason: collision with root package name */
    public final Calendar f5845i;

    /* renamed from: j  reason: collision with root package name */
    public final String f5846j;

    /* renamed from: k  reason: collision with root package name */
    public final Calendar f5847k;

    /* renamed from: l  reason: collision with root package name */
    public final Calendar f5848l;

    /* renamed from: m  reason: collision with root package name */
    public final String f5849m;

    /* renamed from: n  reason: collision with root package name */
    public final String f5850n;

    /* renamed from: o  reason: collision with root package name */
    public final Boolean f5851o;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static class Creator implements Parcelable.Creator {
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
            return new Note(readString, readString2, readString3, readString4, readString5, calendar, readString6, calendar2, calendar3, readString7, readString8, bool);
        }

        public final Object[] newArray(int i2) {
            return new Note[i2];
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
        this.c = str;
        this.e = str2;
        this.f = str3;
        this.f5843g = str4;
        this.f5844h = str5;
        this.f5845i = calendar;
        this.f5846j = str6;
        this.f5847k = calendar2;
        this.f5848l = calendar3;
        this.f5849m = str7;
        this.f5850n = str8;
        this.f5851o = bool;
    }

    public static /* synthetic */ Note copy$default(Note note, String str, String str2, String str3, String str4, String str5, Calendar calendar, String str6, Calendar calendar2, Calendar calendar3, String str7, String str8, Boolean bool, int i2, Object obj) {
        Note note2 = note;
        int i3 = i2;
        return note.a((i3 & 1) != 0 ? note.d() : str, (i3 & 2) != 0 ? note2.e : str2, (i3 & 4) != 0 ? note2.f : str3, (i3 & 8) != 0 ? note2.f5843g : str4, (i3 & 16) != 0 ? note2.f5844h : str5, (i3 & 32) != 0 ? note2.f5845i : calendar, (i3 & 64) != 0 ? note2.f5846j : str6, (i3 & 128) != 0 ? note2.f5847k : calendar2, (i3 & 256) != 0 ? note2.f5848l : calendar3, (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? note.e() : str7, (i3 & 1024) != 0 ? note2.f5850n : str8, (i3 & 2048) != 0 ? note.i() : bool);
    }

    public final Note a(String str, String str2, String str3, String str4, String str5, Calendar calendar, String str6, Calendar calendar2, Calendar calendar3, String str7, String str8, Boolean bool) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        String str9 = str2;
        Intrinsics.checkParameterIsNotNull(str9, "typeName");
        String str10 = str3;
        Intrinsics.checkParameterIsNotNull(str10, "typeDescription");
        String str11 = str4;
        Intrinsics.checkParameterIsNotNull(str11, "title");
        String str12 = str5;
        Intrinsics.checkParameterIsNotNull(str12, "content");
        String str13 = str6;
        Intrinsics.checkParameterIsNotNull(str13, "teacher");
        Calendar calendar4 = calendar2;
        Intrinsics.checkParameterIsNotNull(calendar4, "recordingDate");
        Calendar calendar5 = calendar3;
        Intrinsics.checkParameterIsNotNull(calendar5, "creatingTime");
        String str14 = str7;
        Intrinsics.checkParameterIsNotNull(str14, "profileId");
        return new Note(str, str9, str10, str11, str12, calendar, str13, calendar4, calendar5, str14, str8, bool);
    }

    public String d() {
        return this.c;
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.f5849m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Note)) {
            return false;
        }
        Note note = (Note) obj;
        return Intrinsics.areEqual((Object) d(), (Object) note.d()) && Intrinsics.areEqual((Object) this.e, (Object) note.e) && Intrinsics.areEqual((Object) this.f, (Object) note.f) && Intrinsics.areEqual((Object) this.f5843g, (Object) note.f5843g) && Intrinsics.areEqual((Object) this.f5844h, (Object) note.f5844h) && Intrinsics.areEqual((Object) this.f5845i, (Object) note.f5845i) && Intrinsics.areEqual((Object) this.f5846j, (Object) note.f5846j) && Intrinsics.areEqual((Object) this.f5847k, (Object) note.f5847k) && Intrinsics.areEqual((Object) this.f5848l, (Object) note.f5848l) && Intrinsics.areEqual((Object) e(), (Object) note.e()) && Intrinsics.areEqual((Object) this.f5850n, (Object) note.f5850n) && Intrinsics.areEqual((Object) i(), (Object) note.i());
    }

    public final String f() {
        return this.f5844h;
    }

    public final Calendar g() {
        return this.f5848l;
    }

    public final String h() {
        return this.f5850n;
    }

    public int hashCode() {
        String d2 = d();
        int i2 = 0;
        int hashCode = (d2 != null ? d2.hashCode() : 0) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f5843g;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f5844h;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Calendar calendar = this.f5845i;
        int hashCode6 = (hashCode5 + (calendar != null ? calendar.hashCode() : 0)) * 31;
        String str5 = this.f5846j;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Calendar calendar2 = this.f5847k;
        int hashCode8 = (hashCode7 + (calendar2 != null ? calendar2.hashCode() : 0)) * 31;
        Calendar calendar3 = this.f5848l;
        int hashCode9 = (hashCode8 + (calendar3 != null ? calendar3.hashCode() : 0)) * 31;
        String e2 = e();
        int hashCode10 = (hashCode9 + (e2 != null ? e2.hashCode() : 0)) * 31;
        String str6 = this.f5850n;
        int hashCode11 = (hashCode10 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Boolean i3 = i();
        if (i3 != null) {
            i2 = i3.hashCode();
        }
        return hashCode11 + i2;
    }

    public Boolean i() {
        return this.f5851o;
    }

    public final Calendar j() {
        return this.f5847k;
    }

    public final Calendar k() {
        return this.f5845i;
    }

    public final String l() {
        return this.f5846j;
    }

    public final String m() {
        return this.f5843g;
    }

    public final String n() {
        return this.f;
    }

    public final String o() {
        return this.e;
    }

    public String toString() {
        StringBuilder a2 = a.a("Note(uid=");
        a2.append(d());
        a2.append(", typeName=");
        a2.append(this.e);
        a2.append(", typeDescription=");
        a2.append(this.f);
        a2.append(", title=");
        a2.append(this.f5843g);
        a2.append(", content=");
        a2.append(this.f5844h);
        a2.append(", seenByTutelaryUTC=");
        a2.append(this.f5845i);
        a2.append(", teacher=");
        a2.append(this.f5846j);
        a2.append(", recordingDate=");
        a2.append(this.f5847k);
        a2.append(", creatingTime=");
        a2.append(this.f5848l);
        a2.append(", profileId=");
        a2.append(e());
        a2.append(", groupUid=");
        a2.append(this.f5850n);
        a2.append(", readByUser=");
        a2.append(i());
        a2.append(")");
        return a2.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.c);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.f5843g);
        parcel.writeString(this.f5844h);
        parcel.writeSerializable(this.f5845i);
        parcel.writeString(this.f5846j);
        CalendarParceler.INSTANCE.write(this.f5847k, parcel, i2);
        CalendarParceler.INSTANCE.write(this.f5848l, parcel, i2);
        parcel.writeString(this.f5849m);
        parcel.writeString(this.f5850n);
        Boolean bool = this.f5851o;
        if (bool != null) {
            parcel.writeInt(1);
            z = bool.booleanValue();
        } else {
            z = false;
        }
        parcel.writeInt(z ? 1 : 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Note(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.util.Calendar r22, java.lang.String r23, java.util.Calendar r24, java.util.Calendar r25, java.lang.String r26, java.lang.String r27, java.lang.Boolean r28, int r29, kotlin.jvm.internal.DefaultConstructorMarker r30) {
        /*
            r16 = this;
            r0 = r29
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r9 = r2
            goto L_0x000b
        L_0x0009:
            r9 = r22
        L_0x000b:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0011
            r14 = r2
            goto L_0x0013
        L_0x0011:
            r14 = r27
        L_0x0013:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0019
            r15 = r2
            goto L_0x001b
        L_0x0019:
            r15 = r28
        L_0x001b:
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r10 = r23
            r11 = r24
            r12 = r25
            r13 = r26
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.notes.Note.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Calendar, java.lang.String, java.util.Calendar, java.util.Calendar, java.lang.String, java.lang.String, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
