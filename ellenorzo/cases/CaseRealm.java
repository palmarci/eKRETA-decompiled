package p289hu.ekreta.ellenorzo.cases;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p349io.ConstantsKt;
import p289hu.ekreta.ellenorzo.attachment.AttachmentRealm;
import p289hu.ekreta.ellenorzo.cases.subRealmModels.ApplicationMandatoryDocumentRealm;
import p289hu.ekreta.ellenorzo.util.dao.ProfileSpecificModelRealm;
import p300k.p340c.C5065d0;
import p300k.p340c.C5080h0;
import p300k.p340c.C5147s0;
import p300k.p340c.p341m1.C5116n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b3\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002Bý\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u001cR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001e\"\u0004\b(\u0010 R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001e\"\u0004\b*\u0010 R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001e\"\u0004\b,\u0010 R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001e\"\u0004\b2\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001e\"\u0004\b4\u0010 R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001e\"\u0004\b6\u0010 R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010.\"\u0004\b8\u00100R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010.\"\u0004\b:\u00100R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010.\"\u0004\b<\u00100R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001e\"\u0004\b>\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u001e\"\u0004\b@\u0010 R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u001e\"\u0004\bB\u0010 R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u001e\"\u0004\bD\u0010 R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u001e\"\u0004\bF\u0010 R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u001e\"\u0004\bH\u0010 R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u001e\"\u0004\bJ\u0010 ¨\u0006K"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/CaseRealm;", "Lio/realm/RealmObject;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificModelRealm;", "id", "", "profileId", "sentDate", "Ljava/util/Date;", "stateCode", "stateDescription", "registrationNumber", "reason", "studentFamilyName", "studentFirstName", "studentEducationId", "administratorName", "typeCode", "typeName", "documentNumber", "lastModificationDate", "caseAttachmentRealmList", "Lio/realm/RealmList;", "Lhu/ekreta/ellenorzo/attachment/AttachmentRealm;", "applicationMandatoryDocumentRealmList", "Lhu/ekreta/ellenorzo/cases/subRealmModels/ApplicationMandatoryDocumentRealm;", "justificationType", "requestedAbsenceStart", "requestedAbsenceEnd", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Lio/realm/RealmList;Lio/realm/RealmList;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V", "getAdministratorName", "()Ljava/lang/String;", "setAdministratorName", "(Ljava/lang/String;)V", "getApplicationMandatoryDocumentRealmList", "()Lio/realm/RealmList;", "setApplicationMandatoryDocumentRealmList", "(Lio/realm/RealmList;)V", "getCaseAttachmentRealmList", "setCaseAttachmentRealmList", "getDocumentNumber", "setDocumentNumber", "getId", "setId", "getJustificationType", "setJustificationType", "getLastModificationDate", "()Ljava/util/Date;", "setLastModificationDate", "(Ljava/util/Date;)V", "getProfileId", "setProfileId", "getReason", "setReason", "getRegistrationNumber", "setRegistrationNumber", "getRequestedAbsenceEnd", "setRequestedAbsenceEnd", "getRequestedAbsenceStart", "setRequestedAbsenceStart", "getSentDate", "setSentDate", "getStateCode", "setStateCode", "getStateDescription", "setStateDescription", "getStudentEducationId", "setStudentEducationId", "getStudentFamilyName", "setStudentFamilyName", "getStudentFirstName", "setStudentFirstName", "getTypeCode", "setTypeCode", "getTypeName", "setTypeName", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.CaseRealm */
/* compiled from: CaseRealm.kt */
public class CaseRealm extends C5080h0 implements ProfileSpecificModelRealm, C5147s0 {

    /* renamed from: c */
    public String f11291c;

    /* renamed from: e */
    public String f11292e;

    /* renamed from: f */
    public Date f11293f;

    /* renamed from: g */
    public String f11294g;

    /* renamed from: h */
    public String f11295h;

    /* renamed from: i */
    public String f11296i;

    /* renamed from: j */
    public String f11297j;

    /* renamed from: k */
    public String f11298k;

    /* renamed from: l */
    public String f11299l;

    /* renamed from: m */
    public String f11300m;

    /* renamed from: n */
    public String f11301n;

    /* renamed from: o */
    public String f11302o;

    /* renamed from: p */
    public String f11303p;

    /* renamed from: q */
    public String f11304q;

    /* renamed from: r */
    public Date f11305r;

    /* renamed from: s */
    public C5065d0<AttachmentRealm> f11306s;

    /* renamed from: t */
    public C5065d0<ApplicationMandatoryDocumentRealm> f11307t;

    /* renamed from: u */
    public String f11308u;

    /* renamed from: v */
    public Date f11309v;

    /* renamed from: w */
    public Date f11310w;

    public CaseRealm() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
    }

    public /* synthetic */ CaseRealm(String str, String str2, Date date, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Date date2, C5065d0 d0Var, C5065d0 d0Var2, String str14, Date date3, Date date4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Date date5;
        C5065d0 d0Var3;
        String str15;
        C5065d0 d0Var4;
        int i2 = i;
        String str16 = (i2 & 1) != 0 ? null : str;
        String str17 = (i2 & 2) != 0 ? null : str2;
        Date date6 = (i2 & 4) != 0 ? null : date;
        String str18 = (i2 & 8) != 0 ? null : str3;
        String str19 = (i2 & 16) != 0 ? null : str4;
        String str20 = (i2 & 32) != 0 ? null : str5;
        String str21 = (i2 & 64) != 0 ? null : str6;
        String str22 = (i2 & 128) != 0 ? null : str7;
        String str23 = (i2 & 256) != 0 ? null : str8;
        String str24 = (i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : str9;
        String str25 = (i2 & 1024) != 0 ? null : str10;
        String str26 = (i2 & 2048) != 0 ? null : str11;
        String str27 = (i2 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? null : str12;
        String str28 = (i2 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? null : str13;
        Date date7 = (i2 & 16384) != 0 ? null : date2;
        if ((i2 & 32768) != 0) {
            C5065d0 d0Var5 = new C5065d0();
            date5 = date7;
            d0Var3 = d0Var5;
        } else {
            date5 = date7;
            d0Var3 = d0Var;
        }
        if ((i2 & 65536) != 0) {
            C5065d0 d0Var6 = new C5065d0();
            str15 = str27;
            d0Var4 = d0Var6;
        } else {
            str15 = str27;
            d0Var4 = d0Var2;
        }
        String str29 = (i2 & 131072) != 0 ? null : str14;
        Date date8 = (i2 & 262144) != 0 ? null : date3;
        Date date9 = (i2 & 524288) != 0 ? null : date4;
        Intrinsics.checkParameterIsNotNull(d0Var3, "caseAttachmentRealmList");
        Intrinsics.checkParameterIsNotNull(d0Var4, "applicationMandatoryDocumentRealmList");
        boolean z = this instanceof C5116n;
        if (z) {
            ((C5116n) this).mo16468K();
        }
        mo11664x(str16);
        mo11623a(str17);
        mo11628d(date6);
        mo11615S(str18);
        mo11658t(str19);
        mo11653r(str20);
        mo11617U0(str21);
        mo11610L0(str22);
        mo11606A(str23);
        mo11612N0(str24);
        mo11619X(str25);
        mo11639i(str26);
        mo11626c(str15);
        mo11616T0(str28);
        mo11655s(date5);
        mo11629d(d0Var3);
        mo11632e(d0Var4);
        mo11614P0(str29);
        mo11646n(date8);
        mo11634f(date9);
        if (z) {
            ((C5116n) this).mo16468K();
        }
    }

    /* renamed from: A */
    public String mo11605A() {
        return this.f11295h;
    }

    /* renamed from: A */
    public void mo11606A(String str) {
        this.f11299l = str;
    }

    /* renamed from: A0 */
    public String mo11607A0() {
        return this.f11301n;
    }

    /* renamed from: F1 */
    public Date mo11608F1() {
        return this.f11310w;
    }

    /* renamed from: J0 */
    public String mo11609J0() {
        return this.f11299l;
    }

    /* renamed from: L0 */
    public void mo11610L0(String str) {
        this.f11298k = str;
    }

    /* renamed from: M0 */
    public String mo11611M0() {
        return this.f11297j;
    }

    /* renamed from: N0 */
    public void mo11612N0(String str) {
        this.f11300m = str;
    }

    /* renamed from: P */
    public String mo11613P() {
        return this.f11308u;
    }

    /* renamed from: P0 */
    public void mo11614P0(String str) {
        this.f11308u = str;
    }

    /* renamed from: S */
    public void mo11615S(String str) {
        this.f11294g = str;
    }

    /* renamed from: T0 */
    public void mo11616T0(String str) {
        this.f11304q = str;
    }

    /* renamed from: U0 */
    public void mo11617U0(String str) {
        this.f11297j = str;
    }

    /* renamed from: U1 */
    public C5065d0 mo11618U1() {
        return this.f11306s;
    }

    /* renamed from: X */
    public void mo11619X(String str) {
        this.f11301n = str;
    }

    /* renamed from: X0 */
    public final void mo11620X0(String str) {
        mo11614P0(str);
    }

    /* renamed from: Z */
    public String mo11621Z() {
        return this.f11304q;
    }

    /* renamed from: a */
    public String mo11622a() {
        return this.f11292e;
    }

    /* renamed from: a */
    public void mo11623a(String str) {
        this.f11292e = str;
    }

    /* renamed from: a2 */
    public Date mo11624a2() {
        return this.f11293f;
    }

    /* renamed from: b1 */
    public String mo11625b1() {
        return this.f11294g;
    }

    /* renamed from: c */
    public void mo11626c(String str) {
        this.f11303p = str;
    }

    /* renamed from: c1 */
    public String mo11627c1() {
        return this.f11300m;
    }

    /* renamed from: d */
    public void mo11628d(Date date) {
        this.f11293f = date;
    }

    /* renamed from: d */
    public void mo11629d(C5065d0 d0Var) {
        this.f11306s = d0Var;
    }

    /* renamed from: d2 */
    public final String mo11630d2() {
        return mo11607A0();
    }

    /* renamed from: e */
    public String mo11631e() {
        return this.f11291c;
    }

    /* renamed from: e */
    public void mo11632e(C5065d0 d0Var) {
        this.f11307t = d0Var;
    }

    /* renamed from: e2 */
    public final C5065d0<ApplicationMandatoryDocumentRealm> mo11633e2() {
        return mo11666z0();
    }

    /* renamed from: f */
    public void mo11634f(Date date) {
        this.f11310w = date;
    }

    /* renamed from: f2 */
    public final C5065d0<AttachmentRealm> mo11635f2() {
        return mo11618U1();
    }

    /* renamed from: g */
    public String mo11636g() {
        return this.f11303p;
    }

    /* renamed from: g2 */
    public final String mo11637g2() {
        return mo11621Z();
    }

    /* renamed from: h2 */
    public final String mo11638h2() {
        return mo11631e();
    }

    /* renamed from: i */
    public void mo11639i(String str) {
        this.f11302o = str;
    }

    /* renamed from: i2 */
    public final String mo11640i2() {
        return mo11613P();
    }

    /* renamed from: j2 */
    public final Date mo11641j2() {
        return mo11656s1();
    }

    /* renamed from: k2 */
    public String mo11642k2() {
        return mo11622a();
    }

    /* renamed from: l */
    public String mo11643l() {
        return this.f11302o;
    }

    /* renamed from: l2 */
    public final String mo11644l2() {
        return mo11611M0();
    }

    /* renamed from: m2 */
    public final Date mo11645m2() {
        return mo11608F1();
    }

    /* renamed from: n */
    public void mo11646n(Date date) {
        this.f11309v = date;
    }

    /* renamed from: n2 */
    public final Date mo11647n2() {
        return mo11648o0();
    }

    /* renamed from: o0 */
    public Date mo11648o0() {
        return this.f11309v;
    }

    /* renamed from: o1 */
    public String mo11649o1() {
        return this.f11298k;
    }

    /* renamed from: o2 */
    public final Date mo11650o2() {
        return mo11624a2();
    }

    /* renamed from: p2 */
    public final String mo11651p2() {
        return mo11625b1();
    }

    /* renamed from: q2 */
    public final String mo11652q2() {
        return mo11605A();
    }

    /* renamed from: r */
    public void mo11653r(String str) {
        this.f11296i = str;
    }

    /* renamed from: r2 */
    public final String mo11654r2() {
        return mo11627c1();
    }

    /* renamed from: s */
    public void mo11655s(Date date) {
        this.f11305r = date;
    }

    /* renamed from: s1 */
    public Date mo11656s1() {
        return this.f11305r;
    }

    /* renamed from: s2 */
    public final String mo11657s2() {
        return mo11649o1();
    }

    /* renamed from: t */
    public void mo11658t(String str) {
        this.f11295h = str;
    }

    /* renamed from: t2 */
    public final String mo11659t2() {
        return mo11609J0();
    }

    /* renamed from: u */
    public final void mo11660u(Date date) {
        mo11634f(date);
    }

    /* renamed from: u2 */
    public final String mo11661u2() {
        return mo11643l();
    }

    /* renamed from: v */
    public final void mo11662v(Date date) {
        mo11646n(date);
    }

    /* renamed from: v2 */
    public final String mo11663v2() {
        return mo11636g();
    }

    /* renamed from: x */
    public void mo11664x(String str) {
        this.f11291c = str;
    }

    /* renamed from: z */
    public String mo11665z() {
        return this.f11296i;
    }

    /* renamed from: z0 */
    public C5065d0 mo11666z0() {
        return this.f11307t;
    }
}
