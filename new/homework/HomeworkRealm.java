package hu.ekreta.ellenorzo.homework;

import hu.ekreta.ellenorzo.util.dao.ReadableByUserModelRealm;
import java.util.Date;
import k.c.h0;
import k.c.m1.n;
import k.c.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B¡\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0013R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\r\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u0010\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u000f\u0010\u001e\"\u0004\b\"\u0010 R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\b\u0010\u001e\"\u0004\b#\u0010 R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010\u001dR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b&\u0010\u001e\"\u0004\b'\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0015\"\u0004\b)\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001b\"\u0004\b+\u0010\u001dR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001b\"\u0004\b-\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u0010\u001dR \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001b\"\u0004\b1\u0010\u001d¨\u00062"}, d2 = {"Lhu/ekreta/ellenorzo/homework/HomeworkRealm;", "Lio/realm/RealmObject;", "Lhu/ekreta/ellenorzo/util/dao/ReadableByUserModelRealm;", "uid", "", "profileId", "subjectName", "recorderTeacherName", "isTeacherRecorded", "", "text", "recordDate", "Ljava/util/Date;", "deadlineDate", "createDate", "isStudentHomeworkEnabled", "isDone", "readByUser", "groupUid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "getCreateDate", "()Ljava/util/Date;", "setCreateDate", "(Ljava/util/Date;)V", "getDeadlineDate", "setDeadlineDate", "getGroupUid", "()Ljava/lang/String;", "setGroupUid", "(Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "setDone", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "setStudentHomeworkEnabled", "setTeacherRecorded", "getProfileId", "setProfileId", "getReadByUser", "setReadByUser", "getRecordDate", "setRecordDate", "getRecorderTeacherName", "setRecorderTeacherName", "getSubjectName", "setSubjectName", "getText", "setText", "getUid", "setUid", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: HomeworkRealm.kt */
public class HomeworkRealm extends h0 implements ReadableByUserModelRealm, z0 {
    public String c;
    public String e;
    public String f;

    /* renamed from: g  reason: collision with root package name */
    public String f5670g;

    /* renamed from: h  reason: collision with root package name */
    public Boolean f5671h;

    /* renamed from: i  reason: collision with root package name */
    public String f5672i;

    /* renamed from: j  reason: collision with root package name */
    public Date f5673j;

    /* renamed from: k  reason: collision with root package name */
    public Date f5674k;

    /* renamed from: l  reason: collision with root package name */
    public Date f5675l;

    /* renamed from: m  reason: collision with root package name */
    public Boolean f5676m;

    /* renamed from: n  reason: collision with root package name */
    public Boolean f5677n;

    /* renamed from: o  reason: collision with root package name */
    public Boolean f5678o;

    /* renamed from: p  reason: collision with root package name */
    public String f5679p;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public HomeworkRealm() {
        this((String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (Date) null, (Date) null, (Date) null, (Boolean) null, (Boolean) null, (Boolean) null, (String) null, 8191, (DefaultConstructorMarker) null);
        if (this instanceof n) {
            ((n) this).K();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ HomeworkRealm(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.Boolean r20, java.lang.String r21, java.util.Date r22, java.util.Date r23, java.util.Date r24, java.lang.Boolean r25, java.lang.Boolean r26, java.lang.Boolean r27, java.lang.String r28, int r29, kotlin.jvm.internal.DefaultConstructorMarker r30) {
        /*
            r15 = this;
            r0 = r15
            r1 = r29
            r2 = r1 & 1
            r3 = 0
            if (r2 == 0) goto L_0x000a
            r2 = r3
            goto L_0x000c
        L_0x000a:
            r2 = r16
        L_0x000c:
            r4 = r1 & 2
            if (r4 == 0) goto L_0x0012
            r4 = r3
            goto L_0x0014
        L_0x0012:
            r4 = r17
        L_0x0014:
            r5 = r1 & 4
            if (r5 == 0) goto L_0x001a
            r5 = r3
            goto L_0x001c
        L_0x001a:
            r5 = r18
        L_0x001c:
            r6 = r1 & 8
            if (r6 == 0) goto L_0x0022
            r6 = r3
            goto L_0x0024
        L_0x0022:
            r6 = r19
        L_0x0024:
            r7 = r1 & 16
            if (r7 == 0) goto L_0x002a
            r7 = r3
            goto L_0x002c
        L_0x002a:
            r7 = r20
        L_0x002c:
            r8 = r1 & 32
            if (r8 == 0) goto L_0x0032
            r8 = r3
            goto L_0x0034
        L_0x0032:
            r8 = r21
        L_0x0034:
            r9 = r1 & 64
            if (r9 == 0) goto L_0x003a
            r9 = r3
            goto L_0x003c
        L_0x003a:
            r9 = r22
        L_0x003c:
            r10 = r1 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0042
            r10 = r3
            goto L_0x0044
        L_0x0042:
            r10 = r23
        L_0x0044:
            r11 = r1 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x004a
            r11 = r3
            goto L_0x004c
        L_0x004a:
            r11 = r24
        L_0x004c:
            r12 = r1 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0052
            r12 = r3
            goto L_0x0054
        L_0x0052:
            r12 = r25
        L_0x0054:
            r13 = r1 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x005a
            r13 = r3
            goto L_0x005c
        L_0x005a:
            r13 = r26
        L_0x005c:
            r14 = r1 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0062
            r14 = r3
            goto L_0x0064
        L_0x0062:
            r14 = r27
        L_0x0064:
            r1 = r1 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0069
            goto L_0x006b
        L_0x0069:
            r3 = r28
        L_0x006b:
            r16 = r15
            r17 = r2
            r18 = r4
            r19 = r5
            r20 = r6
            r21 = r7
            r22 = r8
            r23 = r9
            r24 = r10
            r25 = r11
            r26 = r12
            r27 = r13
            r28 = r14
            r29 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            boolean r1 = r0 instanceof k.c.m1.n
            if (r1 == 0) goto L_0x0094
            r1 = r0
            k.c.m1.n r1 = (k.c.m1.n) r1
            r1.K()
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.homework.HomeworkRealm.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.util.Date, java.util.Date, java.util.Date, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public String D1() {
        return this.f5672i;
    }

    public Date G0() {
        return this.f5674k;
    }

    public Date Q0() {
        return this.f5673j;
    }

    public Date X() {
        return this.f5675l;
    }

    public String a() {
        return this.e;
    }

    public void a(Boolean bool) {
        this.f5678o = bool;
    }

    public void a(String str) {
        this.e = str;
    }

    public Boolean a2() {
        return this.f5677n;
    }

    public String b() {
        return this.c;
    }

    public void b(Boolean bool) {
        a(bool);
    }

    public void b(String str) {
        this.c = str;
    }

    public void c(Boolean bool) {
        this.f5671h = bool;
    }

    public Boolean c0() {
        return this.f5676m;
    }

    public String d() {
        return b();
    }

    public void e(Boolean bool) {
        this.f5676m = bool;
    }

    public void e(String str) {
        this.f5679p = str;
    }

    public void e(Date date) {
        this.f5673j = date;
    }

    public final Date e2() {
        return X();
    }

    public Boolean f() {
        return this.f5678o;
    }

    public void f(Boolean bool) {
        this.f5677n = bool;
    }

    public final Date f2() {
        return G0();
    }

    public final String g2() {
        return h();
    }

    public String h() {
        return this.f5679p;
    }

    public void h(String str) {
        this.f = str;
    }

    public String h2() {
        return a();
    }

    public final Date i2() {
        return Q0();
    }

    public Boolean j1() {
        return this.f5671h;
    }

    public final String j2() {
        return r1();
    }

    public final String k2() {
        return n();
    }

    public final String l2() {
        return D1();
    }

    public final Boolean m2() {
        return a2();
    }

    public String n() {
        return this.f;
    }

    public final Boolean n2() {
        return c0();
    }

    public final Boolean o2() {
        return j1();
    }

    public void r(Date date) {
        this.f5674k = date;
    }

    public String r1() {
        return this.f5670g;
    }

    public void t(Date date) {
        this.f5675l = date;
    }

    public void t0(String str) {
        this.f5672i = str;
    }

    public Boolean u() {
        return f();
    }

    public void z0(String str) {
        this.f5670g = str;
    }

    public HomeworkRealm(String str, String str2, String str3, String str4, Boolean bool, String str5, Date date, Date date2, Date date3, Boolean bool2, Boolean bool3, Boolean bool4, String str6) {
        if (this instanceof n) {
            ((n) this).K();
        }
        b(str);
        a(str2);
        h(str3);
        z0(str4);
        c(bool);
        t0(str5);
        e(date);
        r(date2);
        t(date3);
        e(bool2);
        f(bool3);
        a(bool4);
        e(str6);
    }
}
