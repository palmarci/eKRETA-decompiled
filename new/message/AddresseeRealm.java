package hu.ekreta.ellenorzo.message;

import hu.ekreta.ellenorzo.util.dao.ProfileSpecificModelRealm;
import k.c.a1;
import k.c.h0;
import k.c.m1.n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b#\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B}\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u000fR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001e\u0010\t\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0018\"\u0004\b(\u0010\u001a¨\u0006)"}, d2 = {"Lhu/ekreta/ellenorzo/message/AddresseeRealm;", "Lio/realm/RealmObject;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificModelRealm;", "uid", "", "id", "", "kretaId", "name", "typeId", "typeCode", "typeShortName", "typeName", "typeDescription", "profileId", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getKretaId", "setKretaId", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getProfileId", "setProfileId", "getTypeCode", "setTypeCode", "getTypeDescription", "setTypeDescription", "getTypeId", "setTypeId", "getTypeName", "setTypeName", "getTypeShortName", "setTypeShortName", "getUid", "setUid", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: AddresseeRealm.kt */
public class AddresseeRealm extends h0 implements ProfileSpecificModelRealm, a1 {
    public String c;
    public Long e;
    public Long f;

    /* renamed from: g  reason: collision with root package name */
    public String f5762g;

    /* renamed from: h  reason: collision with root package name */
    public Long f5763h;

    /* renamed from: i  reason: collision with root package name */
    public String f5764i;

    /* renamed from: j  reason: collision with root package name */
    public String f5765j;

    /* renamed from: k  reason: collision with root package name */
    public String f5766k;

    /* renamed from: l  reason: collision with root package name */
    public String f5767l;

    /* renamed from: m  reason: collision with root package name */
    public String f5768m;

    public AddresseeRealm() {
        this((String) null, (Long) null, (Long) null, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
        if (this instanceof n) {
            ((n) this).K();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AddresseeRealm(java.lang.String r13, java.lang.Long r14, java.lang.Long r15, java.lang.String r16, java.lang.Long r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
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
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.message.AddresseeRealm.<init>(java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public Long A1() {
        return this.f;
    }

    public String H() {
        return this.f5765j;
    }

    public String a() {
        return this.f5768m;
    }

    public void a(Long l2) {
        this.f5763h = l2;
    }

    public void a(String str) {
        this.f5768m = str;
    }

    public String b() {
        return this.c;
    }

    public void b(Long l2) {
        this.f = l2;
    }

    public void b(String str) {
        this.c = str;
    }

    public void c(String str) {
        this.f5766k = str;
    }

    public void d(Long l2) {
        this.e = l2;
    }

    public void d(String str) {
        this.f5762g = str;
    }

    public Long e() {
        return this.e;
    }

    public final Long e2() {
        return e();
    }

    public void f(String str) {
        this.f5767l = str;
    }

    public final Long f2() {
        return A1();
    }

    public String g() {
        return this.f5766k;
    }

    public final String g2() {
        return i();
    }

    public String h2() {
        return a();
    }

    public String i() {
        return this.f5762g;
    }

    public void i(String str) {
        this.f5764i = str;
    }

    public final String i2() {
        return m();
    }

    public final String j2() {
        return k();
    }

    public String k() {
        return this.f5767l;
    }

    public final Long k2() {
        return w();
    }

    public final String l2() {
        return g();
    }

    public String m() {
        return this.f5764i;
    }

    public final String m2() {
        return H();
    }

    public void p(String str) {
        this.f5765j = str;
    }

    public Long w() {
        return this.f5763h;
    }

    public AddresseeRealm(String str, Long l2, Long l3, String str2, Long l4, String str3, String str4, String str5, String str6, String str7) {
        if (this instanceof n) {
            ((n) this).K();
        }
        b(str);
        d(l2);
        b(l3);
        d(str2);
        a(l4);
        i(str3);
        p(str4);
        c(str5);
        f(str6);
        a(str7);
    }
}
