package hu.ekreta.ellenorzo.profile;

import hu.ekreta.ellenorzo.util.dao.ProfileSpecificModelRealm;
import java.util.Date;
import k.c.d0;
import k.c.h0;
import k.c.h1;
import k.c.m1.n;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bI\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B½\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\"R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010$\"\u0004\b4\u0010&R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00100\"\u0004\b6\u00102R\u001e\u0010 \u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0010\n\u0002\u0010;\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0010\n\u0002\u0010@\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010$\"\u0004\bB\u0010&R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010$\"\u0004\bD\u0010&R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010$\"\u0004\bF\u0010&R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010$\"\u0004\bH\u0010&R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010$\"\u0004\bJ\u0010&R\u001e\u0010!\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0010\n\u0002\u0010;\u001a\u0004\bK\u00108\"\u0004\bL\u0010:R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010$\"\u0004\bN\u0010&R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010$\"\u0004\bP\u0010&R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010$\"\u0004\bR\u0010&R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010$\"\u0004\bT\u0010&R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010$\"\u0004\bV\u0010&R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010$\"\u0004\bX\u0010&R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010$\"\u0004\bZ\u0010&R\u001a\u0010\u0014\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010$\"\u0004\b\\\u0010&R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010$\"\u0004\b^\u0010&R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010$\"\u0004\b`\u0010&R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010$\"\u0004\bb\u0010&R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010$\"\u0004\bd\u0010&¨\u0006e"}, d2 = {"Lhu/ekreta/ellenorzo/profile/ProfileRealm;", "Lio/realm/RealmObject;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificModelRealm;", "profileId", "", "userName", "fullName", "active", "", "accessToken", "tokenType", "expiresIn", "", "refreshToken", "studentName", "role", "instituteName", "instituteCode", "instituteUserId", "instituteUrl", "studentId", "schoolYearId", "birthName", "birthDate", "Ljava/util/Date;", "placeOfBirth", "mothersName", "address", "Lio/realm/RealmList;", "creationTime", "subNumber", "password", "eAdministrationIsActive", "messageIsActive", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Lio/realm/RealmList;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getAccessToken", "()Ljava/lang/String;", "setAccessToken", "(Ljava/lang/String;)V", "getActive", "()Z", "setActive", "(Z)V", "getAddress", "()Lio/realm/RealmList;", "setAddress", "(Lio/realm/RealmList;)V", "getBirthDate", "()Ljava/util/Date;", "setBirthDate", "(Ljava/util/Date;)V", "getBirthName", "setBirthName", "getCreationTime", "setCreationTime", "getEAdministrationIsActive", "()Ljava/lang/Boolean;", "setEAdministrationIsActive", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getExpiresIn", "()Ljava/lang/Integer;", "setExpiresIn", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getFullName", "setFullName", "getInstituteCode", "setInstituteCode", "getInstituteName", "setInstituteName", "getInstituteUrl", "setInstituteUrl", "getInstituteUserId", "setInstituteUserId", "getMessageIsActive", "setMessageIsActive", "getMothersName", "setMothersName", "getPassword", "setPassword", "getPlaceOfBirth", "setPlaceOfBirth", "getProfileId", "setProfileId", "getRefreshToken", "setRefreshToken", "getRole", "setRole", "getSchoolYearId", "setSchoolYearId", "getStudentId", "setStudentId", "getStudentName", "setStudentName", "getSubNumber", "setSubNumber", "getTokenType", "setTokenType", "getUserName", "setUserName", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: ProfileRealm.kt */
public class ProfileRealm extends h0 implements ProfileSpecificModelRealm, h1 {
    public String A;
    public Boolean B;
    public Boolean C;
    public String c;
    public String e;
    public String f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f6015g;

    /* renamed from: h  reason: collision with root package name */
    public String f6016h;

    /* renamed from: i  reason: collision with root package name */
    public String f6017i;

    /* renamed from: j  reason: collision with root package name */
    public Integer f6018j;

    /* renamed from: k  reason: collision with root package name */
    public String f6019k;

    /* renamed from: l  reason: collision with root package name */
    public String f6020l;

    /* renamed from: m  reason: collision with root package name */
    public String f6021m;

    /* renamed from: n  reason: collision with root package name */
    public String f6022n;

    /* renamed from: o  reason: collision with root package name */
    public String f6023o;

    /* renamed from: p  reason: collision with root package name */
    public String f6024p;

    /* renamed from: q  reason: collision with root package name */
    public String f6025q;
    public String r;
    public String s;
    public String t;
    public Date u;
    public String v;
    public String w;
    public d0<String> x;
    public Date y;
    public String z;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ProfileRealm() {
        this((String) null, (String) null, (String) null, false, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Date) null, (String) null, (String) null, (d0) null, (Date) null, (String) null, (String) null, (Boolean) null, (Boolean) null, 67108863, (DefaultConstructorMarker) null);
        if (this instanceof n) {
            ((n) this).K();
        }
    }

    public /* synthetic */ ProfileRealm(String str, String str2, String str3, boolean z2, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Date date, String str16, String str17, d0 d0Var, Date date2, String str18, String str19, Boolean bool, Boolean bool2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str20;
        d0 d0Var2;
        int i3 = i2;
        String str21 = (i3 & 1) != 0 ? null : str;
        String str22 = (i3 & 2) != 0 ? null : str2;
        String str23 = (i3 & 4) != 0 ? null : str3;
        boolean z3 = (i3 & 8) != 0 ? false : z2;
        String str24 = (i3 & 16) != 0 ? null : str4;
        String str25 = (i3 & 32) != 0 ? null : str5;
        Integer num2 = (i3 & 64) != 0 ? null : num;
        String str26 = (i3 & 128) != 0 ? null : str6;
        String str27 = (i3 & 256) != 0 ? null : str7;
        String str28 = (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : str8;
        String str29 = (i3 & 1024) != 0 ? null : str9;
        String str30 = (i3 & 2048) != 0 ? null : str10;
        String str31 = (i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? null : str11;
        String str32 = (i3 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? null : str12;
        String str33 = (i3 & 16384) != 0 ? "" : str13;
        String str34 = (i3 & 32768) != 0 ? null : str14;
        String str35 = (i3 & 65536) != 0 ? null : str15;
        Date date3 = (i3 & 131072) != 0 ? null : date;
        String str36 = (i3 & 262144) != 0 ? null : str16;
        String str37 = (i3 & 524288) != 0 ? null : str17;
        if ((i3 & 1048576) != 0) {
            str20 = str31;
            d0Var2 = new d0();
        } else {
            str20 = str31;
            d0Var2 = d0Var;
        }
        Date date4 = (i3 & 2097152) != 0 ? null : date2;
        String str38 = (i3 & 4194304) != 0 ? null : str18;
        String str39 = (i3 & 8388608) != 0 ? null : str19;
        Boolean bool3 = (i3 & 16777216) != 0 ? null : bool;
        Boolean bool4 = (i3 & 33554432) != 0 ? null : bool2;
        Intrinsics.checkParameterIsNotNull(str33, "studentId");
        Intrinsics.checkParameterIsNotNull(d0Var2, "address");
        boolean z4 = this instanceof n;
        if (z4) {
            ((n) this).K();
        }
        a(str21);
        V(str22);
        W0(str23);
        a(z3);
        I0(str24);
        B0(str25);
        g(num2);
        L(str26);
        r0(str27);
        g0(str28);
        O0(str29);
        H0(str30);
        B(str20);
        K0(str32);
        i0(str33);
        Z(str34);
        k0(str35);
        p(date3);
        K(str36);
        C0(str37);
        c(d0Var2);
        i(date4);
        S0(str38);
        U(str39);
        h(bool3);
        i(bool4);
        if (z4) {
            ((n) this).K();
        }
    }

    public final String A2() {
        return e0();
    }

    public void B(String str) {
        this.f6024p = str;
    }

    public void B0(String str) {
        this.f6017i = str;
    }

    public String B1() {
        return this.t;
    }

    public final String B2() {
        return Y1();
    }

    public void C0(String str) {
        this.w = str;
    }

    public final String C2() {
        return Z0();
    }

    public void H0(String str) {
        this.f6023o = str;
    }

    public void I0(String str) {
        this.f6016h = str;
    }

    public void K(String str) {
        this.v = str;
    }

    public void K0(String str) {
        this.f6025q = str;
    }

    public void L(String str) {
        this.f6019k = str;
    }

    public String M1() {
        return this.f6022n;
    }

    public String N0() {
        return this.f6025q;
    }

    public void O0(String str) {
        this.f6022n = str;
    }

    public String Q1() {
        return this.f6023o;
    }

    public void S0(String str) {
        this.z = str;
    }

    public String T0() {
        return this.A;
    }

    public void U(String str) {
        this.A = str;
    }

    public void V(String str) {
        this.e = str;
    }

    public String W() {
        return this.f6019k;
    }

    public void W0(String str) {
        this.f = str;
    }

    public boolean W0() {
        return this.f6015g;
    }

    public Boolean X0() {
        return this.C;
    }

    public final void X0(String str) {
        I0(str);
    }

    public final void Y0(String str) {
        H0(str);
    }

    public String Y1() {
        return this.f6017i;
    }

    public void Z(String str) {
        this.s = str;
    }

    public String Z0() {
        return this.e;
    }

    public final void Z0(String str) {
        O0(str);
    }

    public String Z1() {
        return this.f6020l;
    }

    public String a() {
        return this.c;
    }

    public void a(String str) {
        this.c = str;
    }

    public void a(boolean z2) {
        this.f6015g = z2;
    }

    public final void a1(String str) {
        K0(str);
    }

    public final void b1(String str) {
        B(str);
    }

    public void c(d0 d0Var) {
        this.x = d0Var;
    }

    public final void c1(String str) {
        U(str);
    }

    public Date c2() {
        return this.y;
    }

    public final void d1(String str) {
        L(str);
    }

    public String e0() {
        return this.z;
    }

    public String e1() {
        return this.w;
    }

    public final void e1(String str) {
        g0(str);
    }

    public final String e2() {
        return q1();
    }

    public final void f(boolean z2) {
        a(z2);
    }

    public d0 f0() {
        return this.x;
    }

    public final void f1(String str) {
        Z(str);
    }

    public final boolean f2() {
        return W0();
    }

    public void g(Integer num) {
        this.f6018j = num;
    }

    public void g0(String str) {
        this.f6021m = str;
    }

    public String g1() {
        return this.f6024p;
    }

    public final void g1(String str) {
        r0(str);
    }

    public final d0<String> g2() {
        return f0();
    }

    public void h(Boolean bool) {
        this.B = bool;
    }

    public final void h1(String str) {
        B0(str);
    }

    public final Date h2() {
        return w0();
    }

    public void i(Boolean bool) {
        this.C = bool;
    }

    public void i(Date date) {
        this.y = date;
    }

    public void i0(String str) {
        this.r = str;
    }

    public final void i1(String str) {
        V(str);
    }

    public final String i2() {
        return B1();
    }

    public final void j(Integer num) {
        g(num);
    }

    public final Date j2() {
        return c2();
    }

    public void k0(String str) {
        this.t = str;
    }

    public final Boolean k2() {
        return u1();
    }

    public final Integer l2() {
        return t1();
    }

    public final String m2() {
        return p1();
    }

    public final String n2() {
        return Q1();
    }

    public final String o2() {
        return M1();
    }

    public void p(Date date) {
        this.u = date;
    }

    public String p1() {
        return this.f;
    }

    public final String p2() {
        return N0();
    }

    public String q1() {
        return this.f6016h;
    }

    public final String q2() {
        return g1();
    }

    public void r0(String str) {
        this.f6020l = str;
    }

    public final String r2() {
        return e1();
    }

    public final String s2() {
        return T0();
    }

    public String t0() {
        return this.r;
    }

    public Integer t1() {
        return this.f6018j;
    }

    public final String t2() {
        return y1();
    }

    public Boolean u1() {
        return this.B;
    }

    public String u2() {
        return a();
    }

    public final String v2() {
        return W();
    }

    public Date w0() {
        return this.u;
    }

    public String w1() {
        return this.s;
    }

    public final String w2() {
        return z1();
    }

    public final String x2() {
        return w1();
    }

    public String y1() {
        return this.v;
    }

    public final String y2() {
        return t0();
    }

    public String z1() {
        return this.f6021m;
    }

    public final String z2() {
        return Z1();
    }

    public final void j(Boolean bool) {
        h(bool);
    }
}
