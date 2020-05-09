package p289hu.ekreta.ellenorzo.evaluation;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.p349io.ConstantsKt;
import p289hu.ekreta.ellenorzo.util.dao.ReadableByUserModelRealm;
import p300k.p340c.C5080h0;
import p300k.p340c.C5178x0;
import p300k.p340c.p341m1.C5116n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\bA\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B±\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010 R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0010\n\u0002\u0010/\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010(\"\u0004\b1\u0010*R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010(\"\u0004\b3\u0010*R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010(\"\u0004\b5\u0010*R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010(\"\u0004\b7\u0010*R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010(\"\u0004\b9\u0010*R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010(\"\u0004\b;\u0010*R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0010\n\u0002\u0010/\u001a\u0004\b<\u0010,\"\u0004\b=\u0010.R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010(\"\u0004\b?\u0010*R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0010\n\u0002\u0010D\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\"\"\u0004\bF\u0010$R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010(\"\u0004\bH\u0010*R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010(\"\u0004\bJ\u0010*R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010(\"\u0004\bL\u0010*R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010(\"\u0004\bN\u0010*R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010(\"\u0004\bP\u0010*R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010(\"\u0004\bR\u0010*R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010(\"\u0004\bT\u0010*R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010(\"\u0004\bV\u0010*R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010(\"\u0004\bX\u0010*R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010(\"\u0004\bZ\u0010*R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010(\"\u0004\b\\\u0010*¨\u0006]"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/evaluation/EvaluationRealm;", "Lio/realm/RealmObject;", "Lhu/ekreta/ellenorzo/util/dao/ReadableByUserModelRealm;", "uid", "", "form", "typeName", "typeDescription", "formTypeName", "formTypeDescription", "subjectName", "subjectCategoryDescription", "subjectCategoryName", "theme", "modeName", "modeDescription", "weight", "value", "shortValue", "numberValue", "", "seenByTutelaryUTC", "Ljava/util/Date;", "teacher", "date", "creatingTime", "profileId", "readByUser", "", "groupUid", "educationTypeDisplayName", "educationTypeSortIndex", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getCreatingTime", "()Ljava/util/Date;", "setCreatingTime", "(Ljava/util/Date;)V", "getDate", "setDate", "getEducationTypeDisplayName", "()Ljava/lang/String;", "setEducationTypeDisplayName", "(Ljava/lang/String;)V", "getEducationTypeSortIndex", "()Ljava/lang/Integer;", "setEducationTypeSortIndex", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getForm", "setForm", "getFormTypeDescription", "setFormTypeDescription", "getFormTypeName", "setFormTypeName", "getGroupUid", "setGroupUid", "getModeDescription", "setModeDescription", "getModeName", "setModeName", "getNumberValue", "setNumberValue", "getProfileId", "setProfileId", "getReadByUser", "()Ljava/lang/Boolean;", "setReadByUser", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getSeenByTutelaryUTC", "setSeenByTutelaryUTC", "getShortValue", "setShortValue", "getSubjectCategoryDescription", "setSubjectCategoryDescription", "getSubjectCategoryName", "setSubjectCategoryName", "getSubjectName", "setSubjectName", "getTeacher", "setTeacher", "getTheme", "setTheme", "getTypeDescription", "setTypeDescription", "getTypeName", "setTypeName", "getUid", "setUid", "getValue", "setValue", "getWeight", "setWeight", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.evaluation.EvaluationRealm */
/* compiled from: EvaluationRealm.kt */
public class EvaluationRealm extends C5080h0 implements ReadableByUserModelRealm, C5178x0 {

    /* renamed from: A */
    public String f13242A;

    /* renamed from: B */
    public Integer f13243B;

    /* renamed from: c */
    public String f13244c;

    /* renamed from: e */
    public String f13245e;

    /* renamed from: f */
    public String f13246f;

    /* renamed from: g */
    public String f13247g;

    /* renamed from: h */
    public String f13248h;

    /* renamed from: i */
    public String f13249i;

    /* renamed from: j */
    public String f13250j;

    /* renamed from: k */
    public String f13251k;

    /* renamed from: l */
    public String f13252l;

    /* renamed from: m */
    public String f13253m;

    /* renamed from: n */
    public String f13254n;

    /* renamed from: o */
    public String f13255o;

    /* renamed from: p */
    public String f13256p;

    /* renamed from: q */
    public String f13257q;

    /* renamed from: r */
    public String f13258r;

    /* renamed from: s */
    public Integer f13259s;

    /* renamed from: t */
    public Date f13260t;

    /* renamed from: u */
    public String f13261u;

    /* renamed from: v */
    public Date f13262v;

    /* renamed from: w */
    public Date f13263w;

    /* renamed from: x */
    public String f13264x;

    /* renamed from: y */
    public Boolean f13265y;

    /* renamed from: z */
    public String f13266z;

    public EvaluationRealm() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554431, null);
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
    }

    public /* synthetic */ EvaluationRealm(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Integer num, Date date, String str16, Date date2, Date date3, String str17, Boolean bool, String str18, String str19, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = i;
        String str20 = (i2 & 1) != 0 ? null : str;
        this(str20, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? null : str6, (i2 & 64) != 0 ? null : str7, (i2 & 128) != 0 ? null : str8, (i2 & 256) != 0 ? null : str9, (i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : str10, (i2 & 1024) != 0 ? null : str11, (i2 & 2048) != 0 ? null : str12, (i2 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? null : str13, (i2 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? null : str14, (i2 & 16384) != 0 ? null : str15, (i2 & 32768) != 0 ? null : num, (i2 & 65536) != 0 ? null : date, (i2 & 131072) != 0 ? null : str16, (i2 & 262144) != 0 ? null : date2, (i2 & 524288) != 0 ? null : date3, (i2 & 1048576) != 0 ? null : str17, (i2 & 2097152) != 0 ? null : bool, (i2 & 4194304) != 0 ? null : str18, (i2 & 8388608) != 0 ? null : str19, (i2 & 16777216) != 0 ? null : num2);
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
    }

    /* renamed from: D */
    public void mo12662D(String str) {
        this.f13242A = str;
    }

    /* renamed from: E */
    public void mo12663E(String str) {
        this.f13248h = str;
    }

    /* renamed from: F0 */
    public String mo12664F0() {
        return this.f13242A;
    }

    /* renamed from: F0 */
    public void mo12665F0(String str) {
        this.f13249i = str;
    }

    /* renamed from: I */
    public Integer mo12666I() {
        return this.f13243B;
    }

    /* renamed from: I0 */
    public String mo12667I0() {
        return this.f13245e;
    }

    /* renamed from: Q */
    public String mo12668Q() {
        return this.f13249i;
    }

    /* renamed from: Q */
    public void mo12669Q(String str) {
        this.f13245e = str;
    }

    /* renamed from: S1 */
    public String mo12670S1() {
        return this.f13256p;
    }

    /* renamed from: V */
    public String mo12671V() {
        return this.f13248h;
    }

    /* renamed from: W1 */
    public String mo12672W1() {
        return this.f13257q;
    }

    /* renamed from: X1 */
    public String mo12673X1() {
        return this.f13258r;
    }

    /* renamed from: Y */
    public void mo12674Y(String str) {
        this.f13256p = str;
    }

    /* renamed from: a */
    public String mo12675a() {
        return this.f13264x;
    }

    /* renamed from: a */
    public void mo12676a(Boolean bool) {
        this.f13265y = bool;
    }

    /* renamed from: a */
    public void mo12677a(String str) {
        this.f13264x = str;
    }

    /* renamed from: a */
    public void mo12678a(Date date) {
        this.f13262v = date;
    }

    /* renamed from: b */
    public String mo12679b() {
        return this.f13244c;
    }

    /* renamed from: b */
    public void mo11372b(Boolean bool) {
        mo12676a(bool);
    }

    /* renamed from: b */
    public void mo12680b(String str) {
        this.f13244c = str;
    }

    /* renamed from: b */
    public void mo12681b(Date date) {
        this.f13263w = date;
    }

    /* renamed from: c */
    public Date mo12682c() {
        return this.f13262v;
    }

    /* renamed from: c */
    public void mo12683c(Integer num) {
        this.f13243B = num;
    }

    /* renamed from: c */
    public void mo12684c(String str) {
        this.f13246f = str;
    }

    /* renamed from: c */
    public void mo12685c(Date date) {
        this.f13260t = date;
    }

    /* renamed from: d */
    public String mo11376d() {
        return mo12679b();
    }

    /* renamed from: d2 */
    public final Date mo12686d2() {
        return mo12717q();
    }

    /* renamed from: e */
    public void mo12687e(String str) {
        this.f13266z = str;
    }

    /* renamed from: e2 */
    public final Date mo12688e2() {
        return mo12682c();
    }

    /* renamed from: f */
    public Boolean mo12689f() {
        return this.f13265y;
    }

    /* renamed from: f */
    public void mo12690f(String str) {
        this.f13247g = str;
    }

    /* renamed from: f2 */
    public final String mo12691f2() {
        return mo12664F0();
    }

    /* renamed from: g */
    public String mo12692g() {
        return this.f13246f;
    }

    /* renamed from: g */
    public void mo12693g(String str) {
        this.f13261u = str;
    }

    /* renamed from: g2 */
    public final Integer mo12694g2() {
        return mo12666I();
    }

    /* renamed from: h */
    public String mo12695h() {
        return this.f13266z;
    }

    /* renamed from: h */
    public void mo12696h(String str) {
        this.f13250j = str;
    }

    /* renamed from: h2 */
    public final String mo12697h2() {
        return mo12667I0();
    }

    /* renamed from: i */
    public void mo12698i(Integer num) {
        this.f13259s = num;
    }

    /* renamed from: i2 */
    public final String mo12699i2() {
        return mo12668Q();
    }

    /* renamed from: j */
    public String mo12700j() {
        return this.f13261u;
    }

    /* renamed from: j */
    public void mo12701j(String str) {
        this.f13254n = str;
    }

    /* renamed from: j2 */
    public final String mo12702j2() {
        return mo12671V();
    }

    /* renamed from: k */
    public String mo12703k() {
        return this.f13247g;
    }

    /* renamed from: k */
    public void mo12704k(String str) {
        this.f13252l = str;
    }

    /* renamed from: k2 */
    public final String mo12705k2() {
        return mo12695h();
    }

    /* renamed from: l */
    public void mo12706l(String str) {
        this.f13251k = str;
    }

    /* renamed from: l2 */
    public final String mo12707l2() {
        return mo12714p();
    }

    /* renamed from: m */
    public void mo12708m(String str) {
        this.f13255o = str;
    }

    /* renamed from: m2 */
    public final String mo12709m2() {
        return mo12723s();
    }

    /* renamed from: n */
    public String mo12710n() {
        return this.f13250j;
    }

    /* renamed from: n2 */
    public final Integer mo12711n2() {
        return mo12719q0();
    }

    /* renamed from: o */
    public String mo12712o() {
        return this.f13252l;
    }

    /* renamed from: o2 */
    public String mo12713o2() {
        return mo12675a();
    }

    /* renamed from: p */
    public String mo12714p() {
        return this.f13255o;
    }

    /* renamed from: p0 */
    public void mo12715p0(String str) {
        this.f13257q = str;
    }

    /* renamed from: p2 */
    public final Date mo12716p2() {
        return mo12721r();
    }

    /* renamed from: q */
    public Date mo12717q() {
        return this.f13263w;
    }

    /* renamed from: q */
    public void mo12718q(String str) {
        this.f13253m = str;
    }

    /* renamed from: q0 */
    public Integer mo12719q0() {
        return this.f13259s;
    }

    /* renamed from: q2 */
    public final String mo12720q2() {
        return mo12673X1();
    }

    /* renamed from: r */
    public Date mo12721r() {
        return this.f13260t;
    }

    /* renamed from: r2 */
    public final String mo12722r2() {
        return mo12727v();
    }

    /* renamed from: s */
    public String mo12723s() {
        return this.f13254n;
    }

    /* renamed from: s2 */
    public final String mo12724s2() {
        return mo12712o();
    }

    /* renamed from: t2 */
    public final String mo12725t2() {
        return mo12710n();
    }

    /* renamed from: u */
    public Boolean mo11399u() {
        return mo12689f();
    }

    /* renamed from: u2 */
    public final String mo12726u2() {
        return mo12700j();
    }

    /* renamed from: v */
    public String mo12727v() {
        return this.f13251k;
    }

    /* renamed from: v0 */
    public void mo12728v0(String str) {
        this.f13258r = str;
    }

    /* renamed from: v2 */
    public final String mo12729v2() {
        return mo12731x();
    }

    /* renamed from: w2 */
    public final String mo12730w2() {
        return mo12703k();
    }

    /* renamed from: x */
    public String mo12731x() {
        return this.f13253m;
    }

    /* renamed from: x2 */
    public final String mo12732x2() {
        return mo12692g();
    }

    /* renamed from: y2 */
    public final String mo12733y2() {
        return mo12672W1();
    }

    /* renamed from: z2 */
    public final String mo12734z2() {
        return mo12670S1();
    }

    public EvaluationRealm(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Integer num, Date date, String str16, Date date2, Date date3, String str17, Boolean bool, String str18, String str19, Integer num2) {
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
        mo12680b(str);
        String str20 = str2;
        mo12669Q(str2);
        String str21 = str3;
        mo12684c(str3);
        String str22 = str4;
        mo12690f(str4);
        String str23 = str5;
        mo12663E(str5);
        String str24 = str6;
        mo12665F0(str6);
        String str25 = str7;
        mo12696h(str7);
        String str26 = str8;
        mo12706l(str8);
        String str27 = str9;
        mo12704k(str9);
        String str28 = str10;
        mo12718q(str10);
        String str29 = str11;
        mo12701j(str11);
        String str30 = str12;
        mo12708m(str12);
        String str31 = str13;
        mo12674Y(str13);
        mo12715p0(str14);
        mo12728v0(str15);
        mo12698i(num);
        mo12685c(date);
        mo12693g(str16);
        mo12678a(date2);
        mo12681b(date3);
        mo12677a(str17);
        mo12676a(bool);
        mo12687e(str18);
        mo12662D(str19);
        mo12683c(num2);
    }
}
