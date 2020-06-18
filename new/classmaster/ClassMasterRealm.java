package hu.ekreta.ellenorzo.classmaster;

import hu.ekreta.ellenorzo.util.dao.ProfileSpecificModelRealm;
import k.c.d0;
import k.c.h0;
import k.c.m1.n;
import k.c.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0017\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002Ba\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006#"}, d2 = {"Lhu/ekreta/ellenorzo/classmaster/ClassMasterRealm;", "Lio/realm/RealmObject;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificModelRealm;", "profileId", "", "name", "emails", "Lio/realm/RealmList;", "phoneNumbers", "educationTypeDescription", "groupName", "typeCode", "", "(Ljava/lang/String;Ljava/lang/String;Lio/realm/RealmList;Lio/realm/RealmList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getEducationTypeDescription", "()Ljava/lang/String;", "setEducationTypeDescription", "(Ljava/lang/String;)V", "getEmails", "()Lio/realm/RealmList;", "setEmails", "(Lio/realm/RealmList;)V", "getGroupName", "setGroupName", "getName", "setName", "getPhoneNumbers", "setPhoneNumbers", "getProfileId", "setProfileId", "getTypeCode", "()Ljava/lang/Integer;", "setTypeCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: ClassMasterRealm.kt */
public class ClassMasterRealm extends h0 implements ProfileSpecificModelRealm, w0 {
    public String c;
    public String e;
    public d0<String> f;

    /* renamed from: g  reason: collision with root package name */
    public d0<String> f5272g;

    /* renamed from: h  reason: collision with root package name */
    public String f5273h;

    /* renamed from: i  reason: collision with root package name */
    public String f5274i;

    /* renamed from: j  reason: collision with root package name */
    public Integer f5275j;

    public ClassMasterRealm() {
        this((String) null, (String) null, (d0) null, (d0) null, (String) null, (String) null, (Integer) null, 127, (DefaultConstructorMarker) null);
        if (this instanceof n) {
            ((n) this).K();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ClassMasterRealm(java.lang.String r7, java.lang.String r8, k.c.d0 r9, k.c.d0 r10, java.lang.String r11, java.lang.String r12, java.lang.Integer r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
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
            if (r7 == 0) goto L_0x0018
            k.c.d0 r9 = new k.c.d0
            r9.<init>()
        L_0x0018:
            r2 = r9
            r7 = r14 & 8
            if (r7 == 0) goto L_0x0022
            k.c.d0 r10 = new k.c.d0
            r10.<init>()
        L_0x0022:
            r3 = r10
            r7 = r14 & 16
            if (r7 == 0) goto L_0x0029
            r4 = r0
            goto L_0x002a
        L_0x0029:
            r4 = r11
        L_0x002a:
            r7 = r14 & 32
            if (r7 == 0) goto L_0x0030
            r5 = r0
            goto L_0x0031
        L_0x0030:
            r5 = r12
        L_0x0031:
            r7 = r14 & 64
            if (r7 == 0) goto L_0x0037
            r14 = r0
            goto L_0x0038
        L_0x0037:
            r14 = r13
        L_0x0038:
            r7 = r6
            r8 = r15
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r4
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            boolean r7 = r6 instanceof k.c.m1.n
            if (r7 == 0) goto L_0x004c
            r7 = r6
            k.c.m1.n r7 = (k.c.m1.n) r7
            r7.K()
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.classmaster.ClassMasterRealm.<init>(java.lang.String, java.lang.String, k.c.d0, k.c.d0, java.lang.String, java.lang.String, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public String D() {
        return this.f5273h;
    }

    public d0 M() {
        return this.f;
    }

    public String a() {
        return this.c;
    }

    public void a(String str) {
        this.c = str;
    }

    public void a(d0 d0Var) {
        this.f5272g = d0Var;
    }

    public void d(String str) {
        this.e = str;
    }

    public void e(Integer num) {
        this.f5275j = num;
    }

    public final String e2() {
        return D();
    }

    public void f(d0 d0Var) {
        this.f = d0Var;
    }

    public final d0<String> f2() {
        return M();
    }

    public final String g2() {
        return n0();
    }

    public final String h2() {
        return i();
    }

    public String i() {
        return this.e;
    }

    public final d0<String> i2() {
        return s0();
    }

    public String j2() {
        return a();
    }

    public final Integer k2() {
        return m();
    }

    public Integer m() {
        return this.f5275j;
    }

    public String n0() {
        return this.f5274i;
    }

    public void o0(String str) {
        this.f5274i = str;
    }

    public d0 s0() {
        return this.f5272g;
    }

    public void w(String str) {
        this.f5273h = str;
    }

    public ClassMasterRealm(String str, String str2, d0<String> d0Var, d0<String> d0Var2, String str3, String str4, Integer num) {
        Intrinsics.checkParameterIsNotNull(d0Var, "emails");
        Intrinsics.checkParameterIsNotNull(d0Var2, "phoneNumbers");
        if (this instanceof n) {
            ((n) this).K();
        }
        a(str);
        d(str2);
        f(d0Var);
        a((d0) d0Var2);
        w(str3);
        o0(str4);
        e(num);
    }
}
