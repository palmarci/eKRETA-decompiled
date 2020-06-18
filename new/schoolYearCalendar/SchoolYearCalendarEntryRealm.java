package hu.ekreta.ellenorzo.schoolYearCalendar;

import hu.ekreta.ellenorzo.util.dao.ProfileSpecificModelRealm;
import java.util.Date;
import k.c.h0;
import k.c.i1;
import k.c.m1.n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B}\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0015\"\u0004\b%\u0010\u0017R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0015\"\u0004\b'\u0010\u0017¨\u0006("}, d2 = {"Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntryRealm;", "Lio/realm/RealmObject;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificModelRealm;", "uid", "", "profileId", "date", "Ljava/util/Date;", "type", "typeDesc", "irregularDayType", "irregularDayTypeDesc", "weekType", "weekTypeDesc", "groupUid", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDate", "()Ljava/util/Date;", "setDate", "(Ljava/util/Date;)V", "getGroupUid", "()Ljava/lang/String;", "setGroupUid", "(Ljava/lang/String;)V", "getIrregularDayType", "setIrregularDayType", "getIrregularDayTypeDesc", "setIrregularDayTypeDesc", "getProfileId", "setProfileId", "getType", "setType", "getTypeDesc", "setTypeDesc", "getUid", "setUid", "getWeekType", "setWeekType", "getWeekTypeDesc", "setWeekTypeDesc", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: SchoolYearCalendarEntryRealm.kt */
public class SchoolYearCalendarEntryRealm extends h0 implements ProfileSpecificModelRealm, i1 {
    public String c;
    public String e;
    public Date f;

    /* renamed from: g  reason: collision with root package name */
    public String f6086g;

    /* renamed from: h  reason: collision with root package name */
    public String f6087h;

    /* renamed from: i  reason: collision with root package name */
    public String f6088i;

    /* renamed from: j  reason: collision with root package name */
    public String f6089j;

    /* renamed from: k  reason: collision with root package name */
    public String f6090k;

    /* renamed from: l  reason: collision with root package name */
    public String f6091l;

    /* renamed from: m  reason: collision with root package name */
    public String f6092m;

    public SchoolYearCalendarEntryRealm() {
        this((String) null, (String) null, (Date) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
        if (this instanceof n) {
            ((n) this).K();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SchoolYearCalendarEntryRealm(java.lang.String r13, java.lang.String r14, java.util.Date r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
        /*
            r12 = this;
            r0 = r12
            r1 = r23
            r2 = r1 & 1
            r3 = 0
            if (r2 == 0) goto L_0x000a
            r2 = r3
            goto L_0x000b
        L_0x000a:
            r2 = r13
        L_0x000b:
            r4 = r1 & 2
            if (r4 == 0) goto L_0x0011
            r4 = r3
            goto L_0x0012
        L_0x0011:
            r4 = r14
        L_0x0012:
            r5 = r1 & 4
            if (r5 == 0) goto L_0x0018
            r5 = r3
            goto L_0x0019
        L_0x0018:
            r5 = r15
        L_0x0019:
            r6 = r1 & 8
            if (r6 == 0) goto L_0x001f
            r6 = r3
            goto L_0x0021
        L_0x001f:
            r6 = r16
        L_0x0021:
            r7 = r1 & 16
            if (r7 == 0) goto L_0x0027
            r7 = r3
            goto L_0x0029
        L_0x0027:
            r7 = r17
        L_0x0029:
            r8 = r1 & 32
            if (r8 == 0) goto L_0x002f
            r8 = r3
            goto L_0x0031
        L_0x002f:
            r8 = r18
        L_0x0031:
            r9 = r1 & 64
            if (r9 == 0) goto L_0x0037
            r9 = r3
            goto L_0x0039
        L_0x0037:
            r9 = r19
        L_0x0039:
            r10 = r1 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x003f
            r10 = r3
            goto L_0x0041
        L_0x003f:
            r10 = r20
        L_0x0041:
            r11 = r1 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x0047
            r11 = r3
            goto L_0x0049
        L_0x0047:
            r11 = r21
        L_0x0049:
            r1 = r1 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            r3 = r22
        L_0x0050:
            r13 = r12
            r14 = r2
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r10
            r22 = r11
            r23 = r3
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            boolean r1 = r0 instanceof k.c.m1.n
            if (r1 == 0) goto L_0x0070
            r1 = r0
            k.c.m1.n r1 = (k.c.m1.n) r1
            r1.K()
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarEntryRealm.<init>(java.lang.String, java.lang.String, java.util.Date, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public String E1() {
        return this.f6089j;
    }

    public void G(String str) {
        this.f6088i = str;
    }

    public String J() {
        return this.f6086g;
    }

    public void P(String str) {
        this.f6091l = str;
    }

    public String T() {
        return this.f6091l;
    }

    public void T(String str) {
        this.f6090k = str;
    }

    public String U0() {
        return this.f6090k;
    }

    public String V1() {
        return this.f6087h;
    }

    public String a() {
        return this.e;
    }

    public void a(String str) {
        this.e = str;
    }

    public void a(Date date) {
        this.f = date;
    }

    public String b() {
        return this.c;
    }

    public void b(String str) {
        this.c = str;
    }

    public Date c() {
        return this.f;
    }

    public final String d() {
        return b();
    }

    public void d0(String str) {
        this.f6089j = str;
    }

    public void e(String str) {
        this.f6092m = str;
    }

    public final Date e2() {
        return c();
    }

    public final String f2() {
        return h();
    }

    public final String g2() {
        return k0();
    }

    public String h() {
        return this.f6092m;
    }

    public final String h2() {
        return E1();
    }

    public String i2() {
        return a();
    }

    public void j0(String str) {
        this.f6087h = str;
    }

    public final String j2() {
        return J();
    }

    public String k0() {
        return this.f6088i;
    }

    public final String k2() {
        return V1();
    }

    public final String l2() {
        return U0();
    }

    public final String m2() {
        return T();
    }

    public void n(String str) {
        this.f6086g = str;
    }

    public SchoolYearCalendarEntryRealm(String str, String str2, Date date, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        if (this instanceof n) {
            ((n) this).K();
        }
        b(str);
        a(str2);
        a(date);
        n(str3);
        j0(str4);
        G(str5);
        d0(str6);
        T(str7);
        P(str8);
        e(str9);
    }
}
