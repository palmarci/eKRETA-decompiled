package hu.ekreta.ellenorzo.group;

import hu.ekreta.ellenorzo.util.dao.ProfileSpecificModelRealm;
import k.c.h0;
import k.c.m1.n;
import k.c.y0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b#\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B¡\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0010\n\u0002\u0010'\u001a\u0004\b\u0007\u0010$\"\u0004\b%\u0010&R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0015\"\u0004\b)\u0010\u0017R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0015\"\u0004\b+\u0010\u0017R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0010\n\u0002\u00100\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0015\"\u0004\b2\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0015\"\u0004\b4\u0010\u0017¨\u00065"}, d2 = {"Lhu/ekreta/ellenorzo/group/GroupRealm;", "Lio/realm/RealmObject;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificModelRealm;", "profileId", "", "uid", "name", "isActive", "", "type", "educationTypeName", "educationTypeDescription", "educationTypeUid", "classMasterUid", "classMasterAssistantUid", "categoryName", "categoryDescription", "sortIndex", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getCategoryDescription", "()Ljava/lang/String;", "setCategoryDescription", "(Ljava/lang/String;)V", "getCategoryName", "setCategoryName", "getClassMasterAssistantUid", "setClassMasterAssistantUid", "getClassMasterUid", "setClassMasterUid", "getEducationTypeDescription", "setEducationTypeDescription", "getEducationTypeName", "setEducationTypeName", "getEducationTypeUid", "setEducationTypeUid", "()Ljava/lang/Boolean;", "setActive", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getName", "setName", "getProfileId", "setProfileId", "getSortIndex", "()Ljava/lang/Integer;", "setSortIndex", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getType", "setType", "getUid", "setUid", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: GroupRealm.kt */
public class GroupRealm extends h0 implements ProfileSpecificModelRealm, y0 {
    public String c;
    public String e;
    public String f;

    /* renamed from: g  reason: collision with root package name */
    public Boolean f5610g;

    /* renamed from: h  reason: collision with root package name */
    public String f5611h;

    /* renamed from: i  reason: collision with root package name */
    public String f5612i;

    /* renamed from: j  reason: collision with root package name */
    public String f5613j;

    /* renamed from: k  reason: collision with root package name */
    public String f5614k;

    /* renamed from: l  reason: collision with root package name */
    public String f5615l;

    /* renamed from: m  reason: collision with root package name */
    public String f5616m;

    /* renamed from: n  reason: collision with root package name */
    public String f5617n;

    /* renamed from: o  reason: collision with root package name */
    public String f5618o;

    /* renamed from: p  reason: collision with root package name */
    public Integer f5619p;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GroupRealm() {
        this((String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, 8191, (DefaultConstructorMarker) null);
        if (this instanceof n) {
            ((n) this).K();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ GroupRealm(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.Boolean r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.Integer r28, int r29, kotlin.jvm.internal.DefaultConstructorMarker r30) {
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
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.group.GroupRealm.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public String D() {
        return this.f5613j;
    }

    public String J() {
        return this.f5611h;
    }

    public String J1() {
        return this.f5615l;
    }

    public String L() {
        return this.f5612i;
    }

    public void M0(String str) {
        this.f5615l = str;
    }

    public void Q0(String str) {
        this.f5614k = str;
    }

    public String R() {
        return this.f5614k;
    }

    public void R(String str) {
        this.f5618o = str;
    }

    public String R1() {
        return this.f5617n;
    }

    public String Y() {
        return this.f5618o;
    }

    public String a() {
        return this.c;
    }

    public void a(String str) {
        this.c = str;
    }

    public String b() {
        return this.e;
    }

    public void b(String str) {
        this.e = str;
    }

    public final String d() {
        return b();
    }

    public void d(Boolean bool) {
        this.f5610g = bool;
    }

    public void d(Integer num) {
        this.f5619p = num;
    }

    public void d(String str) {
        this.f = str;
    }

    public String d0() {
        return this.f5616m;
    }

    public final String e2() {
        return Y();
    }

    public final String f2() {
        return R1();
    }

    public final String g2() {
        return d0();
    }

    public final String h2() {
        return J1();
    }

    public String i() {
        return this.f;
    }

    public final String i2() {
        return D();
    }

    public final String j2() {
        return L();
    }

    public final String k2() {
        return R();
    }

    public void l0(String str) {
        this.f5616m = str;
    }

    public final String l2() {
        return i();
    }

    public Boolean m0() {
        return this.f5610g;
    }

    public String m2() {
        return a();
    }

    public void n(String str) {
        this.f5611h = str;
    }

    public final Integer n2() {
        return y();
    }

    public final String o2() {
        return J();
    }

    public final Boolean p2() {
        return m0();
    }

    public void q0(String str) {
        this.f5617n = str;
    }

    public void v(String str) {
        this.f5612i = str;
    }

    public void w(String str) {
        this.f5613j = str;
    }

    public Integer y() {
        return this.f5619p;
    }

    public GroupRealm(String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num) {
        if (this instanceof n) {
            ((n) this).K();
        }
        a(str);
        b(str2);
        d(str3);
        d(bool);
        n(str4);
        v(str5);
        w(str6);
        Q0(str7);
        M0(str8);
        l0(str9);
        q0(str10);
        R(str11);
        d(num);
    }
}
