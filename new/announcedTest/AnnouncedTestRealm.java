package hu.ekreta.ellenorzo.announcedTest;

import hu.ekreta.ellenorzo.util.dao.ReadableByUserModelRealm;
import java.util.Date;
import k.c.h0;
import k.c.m1.n;
import k.c.q0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b%\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0013R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0015\"\u0004\b\u001e\u0010\u0017R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0010\n\u0002\u0010-\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010 \"\u0004\b/\u0010\"R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010 \"\u0004\b1\u0010\"R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010 \"\u0004\b3\u0010\"R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010 \"\u0004\b5\u0010\"¨\u00066"}, d2 = {"Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestRealm;", "Lio/realm/RealmObject;", "Lhu/ekreta/ellenorzo/util/dao/ReadableByUserModelRealm;", "uid", "", "date", "Ljava/util/Date;", "classScheduleNumber", "", "subject", "teacher", "theme", "modeName", "modeDescription", "announcedAtUTC", "profileId", "readByUser", "", "groupUid", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getAnnouncedAtUTC", "()Ljava/util/Date;", "setAnnouncedAtUTC", "(Ljava/util/Date;)V", "getClassScheduleNumber", "()Ljava/lang/Integer;", "setClassScheduleNumber", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getDate", "setDate", "getGroupUid", "()Ljava/lang/String;", "setGroupUid", "(Ljava/lang/String;)V", "getModeDescription", "setModeDescription", "getModeName", "setModeName", "getProfileId", "setProfileId", "getReadByUser", "()Ljava/lang/Boolean;", "setReadByUser", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getSubject", "setSubject", "getTeacher", "setTeacher", "getTheme", "setTheme", "getUid", "setUid", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: AnnouncedTestRealm.kt */
public class AnnouncedTestRealm extends h0 implements ReadableByUserModelRealm, q0 {
    public String c;
    public Date e;
    public Integer f;

    /* renamed from: g  reason: collision with root package name */
    public String f5022g;

    /* renamed from: h  reason: collision with root package name */
    public String f5023h;

    /* renamed from: i  reason: collision with root package name */
    public String f5024i;

    /* renamed from: j  reason: collision with root package name */
    public String f5025j;

    /* renamed from: k  reason: collision with root package name */
    public String f5026k;

    /* renamed from: l  reason: collision with root package name */
    public Date f5027l;

    /* renamed from: m  reason: collision with root package name */
    public String f5028m;

    /* renamed from: n  reason: collision with root package name */
    public Boolean f5029n;

    /* renamed from: o  reason: collision with root package name */
    public String f5030o;

    public AnnouncedTestRealm() {
        this((String) null, (Date) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Date) null, (String) null, (Boolean) null, (String) null, 4095, (DefaultConstructorMarker) null);
        if (this instanceof n) {
            ((n) this).K();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AnnouncedTestRealm(java.lang.String r15, java.util.Date r16, java.lang.Integer r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.util.Date r23, java.lang.String r24, java.lang.Boolean r25, java.lang.String r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
        /*
            r14 = this;
            r0 = r14
            r1 = r27
            r2 = r1 & 1
            r3 = 0
            if (r2 == 0) goto L_0x000a
            r2 = r3
            goto L_0x000b
        L_0x000a:
            r2 = r15
        L_0x000b:
            r4 = r1 & 2
            if (r4 == 0) goto L_0x0011
            r4 = r3
            goto L_0x0013
        L_0x0011:
            r4 = r16
        L_0x0013:
            r5 = r1 & 4
            if (r5 == 0) goto L_0x0019
            r5 = r3
            goto L_0x001b
        L_0x0019:
            r5 = r17
        L_0x001b:
            r6 = r1 & 8
            if (r6 == 0) goto L_0x0021
            r6 = r3
            goto L_0x0023
        L_0x0021:
            r6 = r18
        L_0x0023:
            r7 = r1 & 16
            if (r7 == 0) goto L_0x0029
            r7 = r3
            goto L_0x002b
        L_0x0029:
            r7 = r19
        L_0x002b:
            r8 = r1 & 32
            if (r8 == 0) goto L_0x0031
            r8 = r3
            goto L_0x0033
        L_0x0031:
            r8 = r20
        L_0x0033:
            r9 = r1 & 64
            if (r9 == 0) goto L_0x0039
            r9 = r3
            goto L_0x003b
        L_0x0039:
            r9 = r21
        L_0x003b:
            r10 = r1 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0041
            r10 = r3
            goto L_0x0043
        L_0x0041:
            r10 = r22
        L_0x0043:
            r11 = r1 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x0049
            r11 = r3
            goto L_0x004b
        L_0x0049:
            r11 = r23
        L_0x004b:
            r12 = r1 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0051
            r12 = r3
            goto L_0x0053
        L_0x0051:
            r12 = r24
        L_0x0053:
            r13 = r1 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x0059
            r13 = r3
            goto L_0x005b
        L_0x0059:
            r13 = r25
        L_0x005b:
            r1 = r1 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0060
            goto L_0x0062
        L_0x0060:
            r3 = r26
        L_0x0062:
            r15 = r14
            r16 = r2
            r17 = r4
            r18 = r5
            r19 = r6
            r20 = r7
            r21 = r8
            r22 = r9
            r23 = r10
            r24 = r11
            r25 = r12
            r26 = r13
            r27 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            boolean r1 = r0 instanceof k.c.m1.n
            if (r1 == 0) goto L_0x0088
            r1 = r0
            k.c.m1.n r1 = (k.c.m1.n) r1
            r1.K()
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.announcedTest.AnnouncedTestRealm.<init>(java.lang.String, java.util.Date, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Date, java.lang.String, java.lang.Boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public String B() {
        return this.f5022g;
    }

    public Date S0() {
        return this.f5027l;
    }

    public String a() {
        return this.f5028m;
    }

    public void a(Boolean bool) {
        this.f5029n = bool;
    }

    public void a(String str) {
        this.f5028m = str;
    }

    public void a(Date date) {
        this.e = date;
    }

    public String b() {
        return this.c;
    }

    public void b(Boolean bool) {
        a(bool);
    }

    public void b(Integer num) {
        this.f = num;
    }

    public void b(String str) {
        this.c = str;
    }

    public Date c() {
        return this.e;
    }

    public String d() {
        return b();
    }

    public void e(String str) {
        this.f5030o = str;
    }

    public final Date e2() {
        return S0();
    }

    public Boolean f() {
        return this.f5029n;
    }

    public final Integer f2() {
        return t();
    }

    public void g(String str) {
        this.f5023h = str;
    }

    public final Date g2() {
        return c();
    }

    public String h() {
        return this.f5030o;
    }

    public final String h2() {
        return h();
    }

    public final String i2() {
        return p();
    }

    public String j() {
        return this.f5023h;
    }

    public void j(String str) {
        this.f5025j = str;
    }

    public final String j2() {
        return s();
    }

    public void k(Date date) {
        this.f5027l = date;
    }

    public String k2() {
        return a();
    }

    public final String l2() {
        return B();
    }

    public void m(String str) {
        this.f5026k = str;
    }

    public final String m2() {
        return j();
    }

    public final String n2() {
        return x();
    }

    public String p() {
        return this.f5026k;
    }

    public void q(String str) {
        this.f5024i = str;
    }

    public String s() {
        return this.f5025j;
    }

    public Integer t() {
        return this.f;
    }

    public Boolean u() {
        return f();
    }

    public String x() {
        return this.f5024i;
    }

    public void y(String str) {
        this.f5022g = str;
    }

    public AnnouncedTestRealm(String str, Date date, Integer num, String str2, String str3, String str4, String str5, String str6, Date date2, String str7, Boolean bool, String str8) {
        if (this instanceof n) {
            ((n) this).K();
        }
        b(str);
        a(date);
        b(num);
        y(str2);
        g(str3);
        q(str4);
        j(str5);
        m(str6);
        k(date2);
        a(str7);
        a(bool);
        e(str8);
    }
}
