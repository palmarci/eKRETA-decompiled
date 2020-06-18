package hu.ekreta.ellenorzo.notes;

import hu.ekreta.ellenorzo.util.dao.ReadableByUserModelRealm;
import java.util.Date;
import k.c.c1;
import k.c.h0;
import k.c.m1.n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\r\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0017\"\u0004\b$\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0013\"\u0004\b&\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0013\"\u0004\b(\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0013\"\u0004\b*\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0013\"\u0004\b,\u0010\u0015R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0013\"\u0004\b.\u0010\u0015¨\u0006/"}, d2 = {"Lhu/ekreta/ellenorzo/notes/NoteRealm;", "Lio/realm/RealmObject;", "Lhu/ekreta/ellenorzo/util/dao/ReadableByUserModelRealm;", "uid", "", "typeName", "typeDescription", "title", "content", "seenByTutelaryUTC", "Ljava/util/Date;", "teacher", "date", "creatingTime", "profileId", "readByUser", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/Boolean;)V", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "getCreatingTime", "()Ljava/util/Date;", "setCreatingTime", "(Ljava/util/Date;)V", "getDate", "setDate", "getProfileId", "setProfileId", "getReadByUser", "()Ljava/lang/Boolean;", "setReadByUser", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getSeenByTutelaryUTC", "setSeenByTutelaryUTC", "getTeacher", "setTeacher", "getTitle", "setTitle", "getTypeDescription", "setTypeDescription", "getTypeName", "setTypeName", "getUid", "setUid", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: NoteRealm.kt */
public class NoteRealm extends h0 implements ReadableByUserModelRealm, c1 {
    public String c;
    public String e;
    public String f;

    /* renamed from: g  reason: collision with root package name */
    public String f5864g;

    /* renamed from: h  reason: collision with root package name */
    public String f5865h;

    /* renamed from: i  reason: collision with root package name */
    public Date f5866i;

    /* renamed from: j  reason: collision with root package name */
    public String f5867j;

    /* renamed from: k  reason: collision with root package name */
    public Date f5868k;

    /* renamed from: l  reason: collision with root package name */
    public Date f5869l;

    /* renamed from: m  reason: collision with root package name */
    public String f5870m;

    /* renamed from: n  reason: collision with root package name */
    public Boolean f5871n;

    public NoteRealm() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (Date) null, (String) null, (Date) null, (Date) null, (String) null, (Boolean) null, 2047, (DefaultConstructorMarker) null);
        if (this instanceof n) {
            ((n) this).K();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ NoteRealm(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.util.Date r19, java.lang.String r20, java.util.Date r21, java.util.Date r22, java.lang.String r23, java.lang.Boolean r24, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
        /*
            r13 = this;
            r0 = r13
            r1 = r25
            r2 = r1 & 1
            r3 = 0
            if (r2 == 0) goto L_0x000a
            r2 = r3
            goto L_0x000b
        L_0x000a:
            r2 = r14
        L_0x000b:
            r4 = r1 & 2
            if (r4 == 0) goto L_0x0011
            r4 = r3
            goto L_0x0012
        L_0x0011:
            r4 = r15
        L_0x0012:
            r5 = r1 & 4
            if (r5 == 0) goto L_0x0018
            r5 = r3
            goto L_0x001a
        L_0x0018:
            r5 = r16
        L_0x001a:
            r6 = r1 & 8
            if (r6 == 0) goto L_0x0020
            r6 = r3
            goto L_0x0022
        L_0x0020:
            r6 = r17
        L_0x0022:
            r7 = r1 & 16
            if (r7 == 0) goto L_0x0028
            r7 = r3
            goto L_0x002a
        L_0x0028:
            r7 = r18
        L_0x002a:
            r8 = r1 & 32
            if (r8 == 0) goto L_0x0030
            r8 = r3
            goto L_0x0032
        L_0x0030:
            r8 = r19
        L_0x0032:
            r9 = r1 & 64
            if (r9 == 0) goto L_0x0038
            r9 = r3
            goto L_0x003a
        L_0x0038:
            r9 = r20
        L_0x003a:
            r10 = r1 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0040
            r10 = r3
            goto L_0x0042
        L_0x0040:
            r10 = r21
        L_0x0042:
            r11 = r1 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x0048
            r11 = r3
            goto L_0x004a
        L_0x0048:
            r11 = r22
        L_0x004a:
            r12 = r1 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0050
            r12 = r3
            goto L_0x0052
        L_0x0050:
            r12 = r23
        L_0x0052:
            r1 = r1 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0057
            goto L_0x0059
        L_0x0057:
            r3 = r24
        L_0x0059:
            r14 = r13
            r15 = r2
            r16 = r4
            r17 = r5
            r18 = r6
            r19 = r7
            r20 = r8
            r21 = r9
            r22 = r10
            r23 = r11
            r24 = r12
            r25 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            boolean r1 = r0 instanceof k.c.m1.n
            if (r1 == 0) goto L_0x007c
            r1 = r0
            k.c.m1.n r1 = (k.c.m1.n) r1
            r1.K()
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.notes.NoteRealm.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Date, java.lang.String, java.util.Date, java.util.Date, java.lang.String, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public String C() {
        return this.f5864g;
    }

    public String G() {
        return this.f5865h;
    }

    public String a() {
        return this.f5870m;
    }

    public void a(Boolean bool) {
        this.f5871n = bool;
    }

    public void a(String str) {
        this.f5870m = str;
    }

    public void a(Date date) {
        this.f5868k = date;
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

    public void b(Date date) {
        this.f5869l = date;
    }

    public Date c() {
        return this.f5868k;
    }

    public void c(String str) {
        this.e = str;
    }

    public void c(Date date) {
        this.f5866i = date;
    }

    public String d() {
        return b();
    }

    public final String e2() {
        return G();
    }

    public Boolean f() {
        return this.f5871n;
    }

    public void f(String str) {
        this.f = str;
    }

    public final Date f2() {
        return q();
    }

    public String g() {
        return this.e;
    }

    public void g(String str) {
        this.f5867j = str;
    }

    public final Date g2() {
        return c();
    }

    public String h2() {
        return a();
    }

    public final Date i2() {
        return r();
    }

    public String j() {
        return this.f5867j;
    }

    public final String j2() {
        return j();
    }

    public String k() {
        return this.f;
    }

    public final String k2() {
        return C();
    }

    public final String l2() {
        return k();
    }

    public final String m2() {
        return g();
    }

    public void o(String str) {
        this.f5865h = str;
    }

    public Date q() {
        return this.f5869l;
    }

    public Date r() {
        return this.f5866i;
    }

    public Boolean u() {
        return f();
    }

    public void u(String str) {
        this.f5864g = str;
    }

    public NoteRealm(String str, String str2, String str3, String str4, String str5, Date date, String str6, Date date2, Date date3, String str7, Boolean bool) {
        if (this instanceof n) {
            ((n) this).K();
        }
        b(str);
        c(str2);
        f(str3);
        u(str4);
        o(str5);
        c(date);
        g(str6);
        a(date2);
        b(date3);
        a(str7);
        a(bool);
    }
}
