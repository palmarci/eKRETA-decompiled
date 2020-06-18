package hu.ekreta.ellenorzo.cases;

import hu.ekreta.ellenorzo.attachment.AttachmentRealm;
import hu.ekreta.ellenorzo.cases.subRealmModels.ApplicationMandatoryDocumentRealm;
import hu.ekreta.ellenorzo.util.dao.ProfileSpecificModelRealm;
import java.util.Date;
import k.c.d0;
import k.c.h0;
import k.c.m1.n;
import k.c.s0;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b3\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002Bý\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u001cR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001e\"\u0004\b(\u0010 R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001e\"\u0004\b*\u0010 R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001e\"\u0004\b,\u0010 R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001e\"\u0004\b2\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001e\"\u0004\b4\u0010 R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001e\"\u0004\b6\u0010 R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010.\"\u0004\b8\u00100R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010.\"\u0004\b:\u00100R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010.\"\u0004\b<\u00100R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001e\"\u0004\b>\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u001e\"\u0004\b@\u0010 R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u001e\"\u0004\bB\u0010 R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u001e\"\u0004\bD\u0010 R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u001e\"\u0004\bF\u0010 R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u001e\"\u0004\bH\u0010 R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u001e\"\u0004\bJ\u0010 ¨\u0006K"}, d2 = {"Lhu/ekreta/ellenorzo/cases/CaseRealm;", "Lio/realm/RealmObject;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificModelRealm;", "id", "", "profileId", "sentDate", "Ljava/util/Date;", "stateCode", "stateDescription", "registrationNumber", "reason", "studentFamilyName", "studentFirstName", "studentEducationId", "administratorName", "typeCode", "typeName", "documentNumber", "lastModificationDate", "caseAttachmentRealmList", "Lio/realm/RealmList;", "Lhu/ekreta/ellenorzo/attachment/AttachmentRealm;", "applicationMandatoryDocumentRealmList", "Lhu/ekreta/ellenorzo/cases/subRealmModels/ApplicationMandatoryDocumentRealm;", "justificationType", "requestedAbsenceStart", "requestedAbsenceEnd", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Lio/realm/RealmList;Lio/realm/RealmList;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V", "getAdministratorName", "()Ljava/lang/String;", "setAdministratorName", "(Ljava/lang/String;)V", "getApplicationMandatoryDocumentRealmList", "()Lio/realm/RealmList;", "setApplicationMandatoryDocumentRealmList", "(Lio/realm/RealmList;)V", "getCaseAttachmentRealmList", "setCaseAttachmentRealmList", "getDocumentNumber", "setDocumentNumber", "getId", "setId", "getJustificationType", "setJustificationType", "getLastModificationDate", "()Ljava/util/Date;", "setLastModificationDate", "(Ljava/util/Date;)V", "getProfileId", "setProfileId", "getReason", "setReason", "getRegistrationNumber", "setRegistrationNumber", "getRequestedAbsenceEnd", "setRequestedAbsenceEnd", "getRequestedAbsenceStart", "setRequestedAbsenceStart", "getSentDate", "setSentDate", "getStateCode", "setStateCode", "getStateDescription", "setStateDescription", "getStudentEducationId", "setStudentEducationId", "getStudentFamilyName", "setStudentFamilyName", "getStudentFirstName", "setStudentFirstName", "getTypeCode", "setTypeCode", "getTypeName", "setTypeName", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: CaseRealm.kt */
public class CaseRealm extends h0 implements ProfileSpecificModelRealm, s0 {
    public String c;
    public String e;
    public Date f;

    /* renamed from: g  reason: collision with root package name */
    public String f5089g;

    /* renamed from: h  reason: collision with root package name */
    public String f5090h;

    /* renamed from: i  reason: collision with root package name */
    public String f5091i;

    /* renamed from: j  reason: collision with root package name */
    public String f5092j;

    /* renamed from: k  reason: collision with root package name */
    public String f5093k;

    /* renamed from: l  reason: collision with root package name */
    public String f5094l;

    /* renamed from: m  reason: collision with root package name */
    public String f5095m;

    /* renamed from: n  reason: collision with root package name */
    public String f5096n;

    /* renamed from: o  reason: collision with root package name */
    public String f5097o;

    /* renamed from: p  reason: collision with root package name */
    public String f5098p;

    /* renamed from: q  reason: collision with root package name */
    public String f5099q;
    public Date r;
    public d0<AttachmentRealm> s;
    public d0<ApplicationMandatoryDocumentRealm> t;
    public String u;
    public Date v;
    public Date w;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CaseRealm() {
        this((String) null, (String) null, (Date) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Date) null, (d0) null, (d0) null, (String) null, (Date) null, (Date) null, 1048575, (DefaultConstructorMarker) null);
        if (this instanceof n) {
            ((n) this).K();
        }
    }

    public /* synthetic */ CaseRealm(String str, String str2, Date date, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Date date2, d0 d0Var, d0 d0Var2, String str14, Date date3, Date date4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        Date date5;
        d0 d0Var3;
        String str15;
        d0 d0Var4;
        int i3 = i2;
        String str16 = (i3 & 1) != 0 ? null : str;
        String str17 = (i3 & 2) != 0 ? null : str2;
        Date date6 = (i3 & 4) != 0 ? null : date;
        String str18 = (i3 & 8) != 0 ? null : str3;
        String str19 = (i3 & 16) != 0 ? null : str4;
        String str20 = (i3 & 32) != 0 ? null : str5;
        String str21 = (i3 & 64) != 0 ? null : str6;
        String str22 = (i3 & 128) != 0 ? null : str7;
        String str23 = (i3 & 256) != 0 ? null : str8;
        String str24 = (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : str9;
        String str25 = (i3 & 1024) != 0 ? null : str10;
        String str26 = (i3 & 2048) != 0 ? null : str11;
        String str27 = (i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? null : str12;
        String str28 = (i3 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? null : str13;
        Date date7 = (i3 & 16384) != 0 ? null : date2;
        if ((i3 & 32768) != 0) {
            date5 = date7;
            d0Var3 = new d0();
        } else {
            date5 = date7;
            d0Var3 = d0Var;
        }
        if ((i3 & 65536) != 0) {
            str15 = str27;
            d0Var4 = new d0();
        } else {
            str15 = str27;
            d0Var4 = d0Var2;
        }
        String str29 = (i3 & 131072) != 0 ? null : str14;
        Date date8 = (i3 & 262144) != 0 ? null : date3;
        Date date9 = (i3 & 524288) != 0 ? null : date4;
        Intrinsics.checkParameterIsNotNull(d0Var3, "caseAttachmentRealmList");
        Intrinsics.checkParameterIsNotNull(d0Var4, "applicationMandatoryDocumentRealmList");
        boolean z = this instanceof n;
        if (z) {
            ((n) this).K();
        }
        x(str16);
        a(str17);
        d(date6);
        S(str18);
        t(str19);
        r(str20);
        U0(str21);
        L0(str22);
        A(str23);
        N0(str24);
        X(str25);
        i(str26);
        c(str15);
        T0(str28);
        s(date5);
        d(d0Var3);
        e(d0Var4);
        P0(str29);
        n(date8);
        f(date9);
        if (z) {
            ((n) this).K();
        }
    }

    public String A() {
        return this.f5090h;
    }

    public void A(String str) {
        this.f5094l = str;
    }

    public String A0() {
        return this.f5096n;
    }

    public Date F1() {
        return this.w;
    }

    public String J0() {
        return this.f5094l;
    }

    public void L0(String str) {
        this.f5093k = str;
    }

    public String M0() {
        return this.f5092j;
    }

    public void N0(String str) {
        this.f5095m = str;
    }

    public String P() {
        return this.u;
    }

    public void P0(String str) {
        this.u = str;
    }

    public void S(String str) {
        this.f5089g = str;
    }

    public void T0(String str) {
        this.f5099q = str;
    }

    public void U0(String str) {
        this.f5092j = str;
    }

    public d0 U1() {
        return this.s;
    }

    public void X(String str) {
        this.f5096n = str;
    }

    public final void X0(String str) {
        P0(str);
    }

    public String Z() {
        return this.f5099q;
    }

    public String a() {
        return this.e;
    }

    public void a(String str) {
        this.e = str;
    }

    public String b1() {
        return this.f5089g;
    }

    public Date b2() {
        return this.f;
    }

    public void c(String str) {
        this.f5098p = str;
    }

    public String c1() {
        return this.f5095m;
    }

    public void d(Date date) {
        this.f = date;
    }

    public void d(d0 d0Var) {
        this.s = d0Var;
    }

    public String e() {
        return this.c;
    }

    public void e(d0 d0Var) {
        this.t = d0Var;
    }

    public final String e2() {
        return A0();
    }

    public void f(Date date) {
        this.w = date;
    }

    public final d0<ApplicationMandatoryDocumentRealm> f2() {
        return z0();
    }

    public String g() {
        return this.f5098p;
    }

    public final d0<AttachmentRealm> g2() {
        return U1();
    }

    public final String h2() {
        return Z();
    }

    public void i(String str) {
        this.f5097o = str;
    }

    public final String i2() {
        return e();
    }

    public final String j2() {
        return P();
    }

    public final Date k2() {
        return s1();
    }

    public String l2() {
        return a();
    }

    public String m() {
        return this.f5097o;
    }

    public final String m2() {
        return M0();
    }

    public void n(Date date) {
        this.v = date;
    }

    public final Date n2() {
        return F1();
    }

    public Date o0() {
        return this.v;
    }

    public String o1() {
        return this.f5093k;
    }

    public final Date o2() {
        return o0();
    }

    public final Date p2() {
        return b2();
    }

    public final String q2() {
        return b1();
    }

    public void r(String str) {
        this.f5091i = str;
    }

    public final String r2() {
        return A();
    }

    public void s(Date date) {
        this.r = date;
    }

    public Date s1() {
        return this.r;
    }

    public final String s2() {
        return c1();
    }

    public void t(String str) {
        this.f5090h = str;
    }

    public final String t2() {
        return o1();
    }

    public final void u(Date date) {
        f(date);
    }

    public final String u2() {
        return J0();
    }

    public final void v(Date date) {
        n(date);
    }

    public final String v2() {
        return m();
    }

    public final String w2() {
        return g();
    }

    public void x(String str) {
        this.c = str;
    }

    public String z() {
        return this.f5091i;
    }

    public d0 z0() {
        return this.t;
    }
}
