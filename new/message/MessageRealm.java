package hu.ekreta.ellenorzo.message;

import hu.ekreta.ellenorzo.attachment.AttachmentRealm;
import hu.ekreta.ellenorzo.util.dao.ReadableByUserModelRealm;
import java.util.Date;
import k.c.b1;
import k.c.d0;
import k.c.h0;
import k.c.m1.n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b5\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002Bí\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0018\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u001dR \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\n\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\t\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\"\"\u0004\b%\u0010$R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010*\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001f\"\u0004\b,\u0010!R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010*\u001a\u0004\b-\u0010'\"\u0004\b.\u0010)R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00100\"\u0004\b4\u00102R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u00100\"\u0004\b:\u00102R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u00100\"\u0004\b<\u00102R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u00100\"\u0004\b>\u00102R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0010\n\u0002\u0010C\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u00100\"\u0004\bE\u00102R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u00100\"\u0004\bG\u00102R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010*\u001a\u0004\bH\u0010'\"\u0004\bI\u0010)R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u00100\"\u0004\bK\u00102R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u00100\"\u0004\bM\u00102R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u00100\"\u0004\bO\u00102¨\u0006P"}, d2 = {"Lhu/ekreta/ellenorzo/message/MessageRealm;", "Lio/realm/RealmObject;", "Lhu/ekreta/ellenorzo/util/dao/ReadableByUserModelRealm;", "uid", "", "mailboxItemId", "", "readByUser", "", "isDeleted", "isComplete", "typeId", "typeCode", "typeShortName", "typeName", "typeDescription", "messageId", "messageSentDate", "Ljava/util/Date;", "messageSenderName", "messageSenderTitle", "messageText", "messageSubject", "addresseeList", "Lio/realm/RealmList;", "Lhu/ekreta/ellenorzo/message/AddresseeRealm;", "messageAttachmentList", "Lhu/ekreta/ellenorzo/attachment/AttachmentRealm;", "profileId", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;ZZLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/realm/RealmList;Lio/realm/RealmList;Ljava/lang/String;)V", "getAddresseeList", "()Lio/realm/RealmList;", "setAddresseeList", "(Lio/realm/RealmList;)V", "()Z", "setComplete", "(Z)V", "setDeleted", "getMailboxItemId", "()Ljava/lang/Long;", "setMailboxItemId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getMessageAttachmentList", "setMessageAttachmentList", "getMessageId", "setMessageId", "getMessageSenderName", "()Ljava/lang/String;", "setMessageSenderName", "(Ljava/lang/String;)V", "getMessageSenderTitle", "setMessageSenderTitle", "getMessageSentDate", "()Ljava/util/Date;", "setMessageSentDate", "(Ljava/util/Date;)V", "getMessageSubject", "setMessageSubject", "getMessageText", "setMessageText", "getProfileId", "setProfileId", "getReadByUser", "()Ljava/lang/Boolean;", "setReadByUser", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getTypeCode", "setTypeCode", "getTypeDescription", "setTypeDescription", "getTypeId", "setTypeId", "getTypeName", "setTypeName", "getTypeShortName", "setTypeShortName", "getUid", "setUid", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: MessageRealm.kt */
public class MessageRealm extends h0 implements ReadableByUserModelRealm, b1 {
    public String c;
    public Long e;
    public Boolean f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5791g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f5792h;

    /* renamed from: i  reason: collision with root package name */
    public Long f5793i;

    /* renamed from: j  reason: collision with root package name */
    public String f5794j;

    /* renamed from: k  reason: collision with root package name */
    public String f5795k;

    /* renamed from: l  reason: collision with root package name */
    public String f5796l;

    /* renamed from: m  reason: collision with root package name */
    public String f5797m;

    /* renamed from: n  reason: collision with root package name */
    public Long f5798n;

    /* renamed from: o  reason: collision with root package name */
    public Date f5799o;

    /* renamed from: p  reason: collision with root package name */
    public String f5800p;

    /* renamed from: q  reason: collision with root package name */
    public String f5801q;
    public String r;
    public String s;
    public d0<AddresseeRealm> t;
    public d0<AttachmentRealm> u;
    public String v;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MessageRealm() {
        this((String) null, (Long) null, (Boolean) null, false, false, (Long) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (Date) null, (String) null, (String) null, (String) null, (String) null, (d0) null, (d0) null, (String) null, 524287, (DefaultConstructorMarker) null);
        if (this instanceof n) {
            ((n) this).K();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ MessageRealm(java.lang.String r21, java.lang.Long r22, java.lang.Boolean r23, boolean r24, boolean r25, java.lang.Long r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.Long r31, java.util.Date r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, k.c.d0 r37, k.c.d0 r38, java.lang.String r39, int r40, kotlin.jvm.internal.DefaultConstructorMarker r41) {
        /*
            r20 = this;
            r0 = r20
            r1 = r40
            r2 = r1 & 1
            if (r2 == 0) goto L_0x000a
            r2 = 0
            goto L_0x000c
        L_0x000a:
            r2 = r21
        L_0x000c:
            r4 = r1 & 2
            if (r4 == 0) goto L_0x0012
            r4 = 0
            goto L_0x0014
        L_0x0012:
            r4 = r22
        L_0x0014:
            r5 = r1 & 4
            r6 = 0
            if (r5 == 0) goto L_0x001e
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            goto L_0x0020
        L_0x001e:
            r5 = r23
        L_0x0020:
            r7 = r1 & 8
            if (r7 == 0) goto L_0x0026
            r7 = 0
            goto L_0x0028
        L_0x0026:
            r7 = r24
        L_0x0028:
            r8 = r1 & 16
            if (r8 == 0) goto L_0x002d
            goto L_0x002f
        L_0x002d:
            r6 = r25
        L_0x002f:
            r8 = r1 & 32
            if (r8 == 0) goto L_0x0035
            r8 = 0
            goto L_0x0037
        L_0x0035:
            r8 = r26
        L_0x0037:
            r9 = r1 & 64
            if (r9 == 0) goto L_0x003d
            r9 = 0
            goto L_0x003f
        L_0x003d:
            r9 = r27
        L_0x003f:
            r10 = r1 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0045
            r10 = 0
            goto L_0x0047
        L_0x0045:
            r10 = r28
        L_0x0047:
            r11 = r1 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x004d
            r11 = 0
            goto L_0x004f
        L_0x004d:
            r11 = r29
        L_0x004f:
            r12 = r1 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0055
            r12 = 0
            goto L_0x0057
        L_0x0055:
            r12 = r30
        L_0x0057:
            r13 = r1 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x005d
            r13 = 0
            goto L_0x005f
        L_0x005d:
            r13 = r31
        L_0x005f:
            r14 = r1 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0065
            r14 = 0
            goto L_0x0067
        L_0x0065:
            r14 = r32
        L_0x0067:
            r15 = r1 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x006d
            r15 = 0
            goto L_0x006f
        L_0x006d:
            r15 = r33
        L_0x006f:
            r3 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x0075
            r3 = 0
            goto L_0x0077
        L_0x0075:
            r3 = r34
        L_0x0077:
            r0 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x007d
            r0 = 0
            goto L_0x007f
        L_0x007d:
            r0 = r35
        L_0x007f:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r1 & r16
            if (r16 == 0) goto L_0x0089
            r16 = 0
            goto L_0x008b
        L_0x0089:
            r16 = r36
        L_0x008b:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r1 & r17
            if (r17 == 0) goto L_0x0097
            k.c.d0 r17 = new k.c.d0
            r17.<init>()
            goto L_0x0099
        L_0x0097:
            r17 = r37
        L_0x0099:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r1 & r18
            if (r18 == 0) goto L_0x00a5
            k.c.d0 r18 = new k.c.d0
            r18.<init>()
            goto L_0x00a7
        L_0x00a5:
            r18 = r38
        L_0x00a7:
            r19 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r19
            if (r1 == 0) goto L_0x00af
            r1 = 0
            goto L_0x00b1
        L_0x00af:
            r1 = r39
        L_0x00b1:
            r21 = r20
            r22 = r2
            r23 = r4
            r24 = r5
            r25 = r7
            r26 = r6
            r27 = r8
            r28 = r9
            r29 = r10
            r30 = r11
            r31 = r12
            r32 = r13
            r33 = r14
            r34 = r15
            r35 = r3
            r36 = r0
            r37 = r16
            r38 = r17
            r39 = r18
            r40 = r1
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r0 = r20
            boolean r1 = r0 instanceof k.c.m1.n
            if (r1 == 0) goto L_0x00e8
            r1 = r0
            k.c.m1.n r1 = (k.c.m1.n) r1
            r1.K()
        L_0x00e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.message.MessageRealm.<init>(java.lang.String, java.lang.Long, java.lang.Boolean, boolean, boolean, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.util.Date, java.lang.String, java.lang.String, java.lang.String, java.lang.String, k.c.d0, k.c.d0, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public boolean B0() {
        return this.f5792h;
    }

    public void E0(String str) {
        this.r = str;
    }

    public d0 G1() {
        return this.t;
    }

    public String H() {
        return this.f5795k;
    }

    public d0 H0() {
        return this.u;
    }

    public void I(String str) {
        this.f5801q = str;
    }

    public void J0(String str) {
        this.s = str;
    }

    public Long K1() {
        return this.f5798n;
    }

    public String L1() {
        return this.f5801q;
    }

    public boolean R0() {
        return this.f5791g;
    }

    public String a() {
        return this.v;
    }

    public void a(Boolean bool) {
        this.f = bool;
    }

    public void a(Long l2) {
        this.f5793i = l2;
    }

    public void a(String str) {
        this.v = str;
    }

    public Date a0() {
        return this.f5799o;
    }

    public void a0(String str) {
        this.f5800p = str;
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

    public void b(d0 d0Var) {
        this.u = d0Var;
    }

    public void b(boolean z) {
        this.f5791g = z;
    }

    public void c(Long l2) {
        this.e = l2;
    }

    public void c(String str) {
        this.f5796l = str;
    }

    public void c(boolean z) {
        this.f5792h = z;
    }

    public String d() {
        return b();
    }

    public String d2() {
        return this.s;
    }

    public void e(Long l2) {
        this.f5798n = l2;
    }

    public final d0<AddresseeRealm> e2() {
        return G1();
    }

    public Boolean f() {
        return this.f;
    }

    public void f(String str) {
        this.f5797m = str;
    }

    public final Long f2() {
        return l0();
    }

    public String g() {
        return this.f5796l;
    }

    public void g(d0 d0Var) {
        this.t = d0Var;
    }

    public final d0<AttachmentRealm> g2() {
        return H0();
    }

    public String h0() {
        return this.r;
    }

    public final Long h2() {
        return K1();
    }

    public void i(String str) {
        this.f5794j = str;
    }

    public final String i2() {
        return r0();
    }

    public final String j2() {
        return L1();
    }

    public String k() {
        return this.f5797m;
    }

    public final Date k2() {
        return a0();
    }

    public void l(Date date) {
        this.f5799o = date;
    }

    public Long l0() {
        return this.e;
    }

    public final String l2() {
        return d2();
    }

    public String m() {
        return this.f5794j;
    }

    public final String m2() {
        return h0();
    }

    public String n2() {
        return a();
    }

    public final String o2() {
        return m();
    }

    public void p(String str) {
        this.f5795k = str;
    }

    public final String p2() {
        return k();
    }

    public final Long q2() {
        return w();
    }

    public String r0() {
        return this.f5800p;
    }

    public final String r2() {
        return g();
    }

    public final String s2() {
        return H();
    }

    public final boolean t2() {
        return B0();
    }

    public Boolean u() {
        return f();
    }

    public final boolean u2() {
        return R0();
    }

    public Long w() {
        return this.f5793i;
    }

    public MessageRealm(String str, Long l2, Boolean bool, boolean z, boolean z2, Long l3, String str2, String str3, String str4, String str5, Long l4, Date date, String str6, String str7, String str8, String str9, d0<AddresseeRealm> d0Var, d0<AttachmentRealm> d0Var2, String str10) {
        d0<AddresseeRealm> d0Var3 = d0Var;
        d0<AttachmentRealm> d0Var4 = d0Var2;
        Intrinsics.checkParameterIsNotNull(d0Var3, "addresseeList");
        Intrinsics.checkParameterIsNotNull(d0Var4, "messageAttachmentList");
        if (this instanceof n) {
            ((n) this).K();
        }
        b(str);
        Long l5 = l2;
        c(l2);
        Boolean bool2 = bool;
        a(bool);
        boolean z3 = z;
        b(z);
        boolean z4 = z2;
        c(z2);
        Long l6 = l3;
        a(l3);
        String str11 = str2;
        i(str2);
        String str12 = str3;
        p(str3);
        String str13 = str4;
        c(str4);
        String str14 = str5;
        f(str5);
        Long l7 = l4;
        e(l4);
        l(date);
        a0(str6);
        I(str7);
        E0(str8);
        J0(str9);
        g(d0Var3);
        b((d0) d0Var4);
        a(str10);
    }
}
