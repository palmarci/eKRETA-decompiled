package hu.ekreta.ellenorzo.noticeboard;

import hu.ekreta.ellenorzo.util.dao.ReadableByUserModelRealm;
import java.util.Date;
import k.c.d1;
import k.c.h0;
import k.c.m1.n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002BY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000f\"\u0004\b\"\u0010\u0011¨\u0006#"}, d2 = {"Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItemRealm;", "Lio/realm/RealmObject;", "Lhu/ekreta/ellenorzo/util/dao/ReadableByUserModelRealm;", "uid", "", "expireStartTime", "Ljava/util/Date;", "expireEndTime", "content", "title", "profileId", "readByUser", "", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "getExpireEndTime", "()Ljava/util/Date;", "setExpireEndTime", "(Ljava/util/Date;)V", "getExpireStartTime", "setExpireStartTime", "getProfileId", "setProfileId", "getReadByUser", "()Ljava/lang/Boolean;", "setReadByUser", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getTitle", "setTitle", "getUid", "setUid", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: NoticeBoardRealm.kt */
public class NoticeBoardItemRealm extends h0 implements ReadableByUserModelRealm, d1 {
    public String c;
    public Date e;
    public Date f;

    /* renamed from: g  reason: collision with root package name */
    public String f5889g;

    /* renamed from: h  reason: collision with root package name */
    public String f5890h;

    /* renamed from: i  reason: collision with root package name */
    public String f5891i;

    /* renamed from: j  reason: collision with root package name */
    public Boolean f5892j;

    public NoticeBoardItemRealm() {
        this((String) null, (Date) null, (Date) null, (String) null, (String) null, (String) null, (Boolean) null, 127, (DefaultConstructorMarker) null);
        if (this instanceof n) {
            ((n) this).K();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ NoticeBoardItemRealm(java.lang.String r7, java.util.Date r8, java.util.Date r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.Boolean r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r6 = this;
            r15 = r14 & 1
            r0 = 0
            if (r15 == 0) goto L_0x0007
            r15 = r0
            goto L_0x0008
        L_0x0007:
            r15 = r7
        L_0x0008:
            r7 = r14 & 2
            if (r7 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r8
        L_0x000f:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r9
        L_0x0016:
            r7 = r14 & 8
            if (r7 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r10
        L_0x001d:
            r7 = r14 & 16
            if (r7 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r11
        L_0x0024:
            r7 = r14 & 32
            if (r7 == 0) goto L_0x002a
            r5 = r0
            goto L_0x002b
        L_0x002a:
            r5 = r12
        L_0x002b:
            r7 = r14 & 64
            if (r7 == 0) goto L_0x0031
            r14 = r0
            goto L_0x0032
        L_0x0031:
            r14 = r13
        L_0x0032:
            r7 = r6
            r8 = r15
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r4
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            boolean r7 = r6 instanceof k.c.m1.n
            if (r7 == 0) goto L_0x0046
            r7 = r6
            k.c.m1.n r7 = (k.c.m1.n) r7
            r7.K()
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.noticeboard.NoticeBoardItemRealm.<init>(java.lang.String, java.util.Date, java.util.Date, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public String C() {
        return this.f5890h;
    }

    public Date D0() {
        return this.f;
    }

    public String G() {
        return this.f5889g;
    }

    public Date H1() {
        return this.e;
    }

    public String a() {
        return this.f5891i;
    }

    public void a(Boolean bool) {
        this.f5892j = bool;
    }

    public void a(String str) {
        this.f5891i = str;
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

    public String d() {
        return b();
    }

    public final String e2() {
        return G();
    }

    public Boolean f() {
        return this.f5892j;
    }

    public final Date f2() {
        return D0();
    }

    public final Date g2() {
        return H1();
    }

    public void h(Date date) {
        this.e = date;
    }

    public String h2() {
        return a();
    }

    public final String i2() {
        return C();
    }

    public void m(Date date) {
        this.f = date;
    }

    public void o(String str) {
        this.f5889g = str;
    }

    public Boolean u() {
        return f();
    }

    public void u(String str) {
        this.f5890h = str;
    }

    public NoticeBoardItemRealm(String str, Date date, Date date2, String str2, String str3, String str4, Boolean bool) {
        if (this instanceof n) {
            ((n) this).K();
        }
        b(str);
        h(date);
        m(date2);
        o(str2);
        u(str3);
        a(str4);
        a(bool);
    }
}
