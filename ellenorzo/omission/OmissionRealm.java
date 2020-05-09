package p289hu.ekreta.ellenorzo.omission;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.p349io.ConstantsKt;
import p289hu.ekreta.ellenorzo.util.dao.ReadableByUserModelRealm;
import p300k.p340c.C5075f1;
import p300k.p340c.C5080h0;
import p300k.p340c.p341m1.C5116n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b8\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\u0002\u0010\u001dR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b)\u0010\u001f\"\u0004\b*\u0010!R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010,\"\u0004\b0\u0010.R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010,\"\u0004\b4\u0010.R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010$\"\u0004\b6\u0010&R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010$\"\u0004\b8\u0010&R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010,\"\u0004\b:\u0010.R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010,\"\u0004\b<\u0010.R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010,\"\u0004\b>\u0010.R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0010\n\u0002\u0010C\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010$\"\u0004\bE\u0010&R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010,\"\u0004\bG\u0010.R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010,\"\u0004\bI\u0010.R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010,\"\u0004\bK\u0010.R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010,\"\u0004\bM\u0010.R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010,\"\u0004\bO\u0010.R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010,\"\u0004\bQ\u0010.R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010,\"\u0004\bS\u0010.¨\u0006T"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/omission/OmissionRealm;", "Lio/realm/RealmObject;", "Lhu/ekreta/ellenorzo/util/dao/ReadableByUserModelRealm;", "uid", "", "profileId", "typeName", "typeDescription", "subjectName", "subjectCategoryDescription", "subjectCategoryName", "modeName", "modeDescription", "delayTimeMinutes", "", "teacher", "lessonStartTime", "Ljava/util/Date;", "lessonEndTime", "classScheduleNumber", "creatingTime", "justificationStateName", "justificationTypeDescription", "justificationTypeName", "date", "seenByTutelaryUTC", "groupUid", "readByUser", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/Integer;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/Boolean;)V", "getClassScheduleNumber", "()Ljava/lang/Integer;", "setClassScheduleNumber", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCreatingTime", "()Ljava/util/Date;", "setCreatingTime", "(Ljava/util/Date;)V", "getDate", "setDate", "getDelayTimeMinutes", "setDelayTimeMinutes", "getGroupUid", "()Ljava/lang/String;", "setGroupUid", "(Ljava/lang/String;)V", "getJustificationStateName", "setJustificationStateName", "getJustificationTypeDescription", "setJustificationTypeDescription", "getJustificationTypeName", "setJustificationTypeName", "getLessonEndTime", "setLessonEndTime", "getLessonStartTime", "setLessonStartTime", "getModeDescription", "setModeDescription", "getModeName", "setModeName", "getProfileId", "setProfileId", "getReadByUser", "()Ljava/lang/Boolean;", "setReadByUser", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getSeenByTutelaryUTC", "setSeenByTutelaryUTC", "getSubjectCategoryDescription", "setSubjectCategoryDescription", "getSubjectCategoryName", "setSubjectCategoryName", "getSubjectName", "setSubjectName", "getTeacher", "setTeacher", "getTypeDescription", "setTypeDescription", "getTypeName", "setTypeName", "getUid", "setUid", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.omission.OmissionRealm */
/* compiled from: OmissionRealm.kt */
public class OmissionRealm extends C5080h0 implements ReadableByUserModelRealm, C5075f1 {

    /* renamed from: c */
    public String f14392c;

    /* renamed from: e */
    public String f14393e;

    /* renamed from: f */
    public String f14394f;

    /* renamed from: g */
    public String f14395g;

    /* renamed from: h */
    public String f14396h;

    /* renamed from: i */
    public String f14397i;

    /* renamed from: j */
    public String f14398j;

    /* renamed from: k */
    public String f14399k;

    /* renamed from: l */
    public String f14400l;

    /* renamed from: m */
    public Integer f14401m;

    /* renamed from: n */
    public String f14402n;

    /* renamed from: o */
    public Date f14403o;

    /* renamed from: p */
    public Date f14404p;

    /* renamed from: q */
    public Integer f14405q;

    /* renamed from: r */
    public Date f14406r;

    /* renamed from: s */
    public String f14407s;

    /* renamed from: t */
    public String f14408t;

    /* renamed from: u */
    public String f14409u;

    /* renamed from: v */
    public Date f14410v;

    /* renamed from: w */
    public Date f14411w;

    /* renamed from: x */
    public String f14412x;

    /* renamed from: y */
    public Boolean f14413y;

    public OmissionRealm() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194303, null);
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
    }

    public /* synthetic */ OmissionRealm(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, Date date, Date date2, Integer num2, Date date3, String str11, String str12, String str13, Date date4, Date date5, String str14, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = i;
        String str15 = (i2 & 1) != 0 ? null : str;
        String str16 = (i2 & 2) != 0 ? null : str2;
        String str17 = (i2 & 4) != 0 ? null : str3;
        String str18 = (i2 & 8) != 0 ? null : str4;
        String str19 = (i2 & 16) != 0 ? null : str5;
        String str20 = (i2 & 32) != 0 ? null : str6;
        String str21 = (i2 & 64) != 0 ? null : str7;
        String str22 = (i2 & 128) != 0 ? null : str8;
        String str23 = (i2 & 256) != 0 ? null : str9;
        Integer num3 = (i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : num;
        String str24 = (i2 & 1024) != 0 ? null : str10;
        Date date6 = (i2 & 2048) != 0 ? null : date;
        Date date7 = (i2 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? null : date2;
        Integer num4 = (i2 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? null : num2;
        Date date8 = (i2 & 16384) != 0 ? null : date3;
        String str25 = (i2 & 32768) != 0 ? null : str11;
        String str26 = (i2 & 65536) != 0 ? null : str12;
        String str27 = (i2 & 131072) != 0 ? null : str13;
        Date date9 = (i2 & 262144) != 0 ? null : date4;
        Date date10 = (i2 & 524288) != 0 ? null : date5;
        String str28 = (i2 & 1048576) != 0 ? null : str14;
        Boolean bool2 = (i2 & 2097152) != 0 ? null : bool;
        boolean z = this instanceof C5116n;
        if (z) {
            ((C5116n) this).mo16468K();
        }
        mo13917b(str15);
        mo13913a(str16);
        mo13920c(str17);
        mo13928f(str18);
        mo13935h(str19);
        mo13944l(str20);
        mo13942k(str21);
        mo13939j(str22);
        mo13946m(str23);
        mo13927f(num3);
        mo13931g(str24);
        mo13952o(date6);
        mo13932g(date7);
        mo13916b(num4);
        mo13918b(date8);
        mo13907G0(str25);
        mo13947m0(str26);
        mo13922c0(str27);
        mo13914a(date9);
        mo13921c(date10);
        mo13924e(str28);
        mo13912a(bool2);
        if (z) {
            ((C5116n) this).mo16468K();
        }
    }

    /* renamed from: C0 */
    public String mo13906C0() {
        return this.f14408t;
    }

    /* renamed from: G0 */
    public void mo13907G0(String str) {
        this.f14407s = str;
    }

    /* renamed from: O */
    public Integer mo13908O() {
        return this.f14401m;
    }

    /* renamed from: P1 */
    public String mo13909P1() {
        return this.f14407s;
    }

    /* renamed from: S */
    public String mo13910S() {
        return this.f14409u;
    }

    /* renamed from: a */
    public String mo13911a() {
        return this.f14393e;
    }

    /* renamed from: a */
    public void mo13912a(Boolean bool) {
        this.f14413y = bool;
    }

    /* renamed from: a */
    public void mo13913a(String str) {
        this.f14393e = str;
    }

    /* renamed from: a */
    public void mo13914a(Date date) {
        this.f14410v = date;
    }

    /* renamed from: b */
    public String mo13915b() {
        return this.f14392c;
    }

    /* renamed from: b */
    public void mo11372b(Boolean bool) {
        mo13912a(bool);
    }

    /* renamed from: b */
    public void mo13916b(Integer num) {
        this.f14405q = num;
    }

    /* renamed from: b */
    public void mo13917b(String str) {
        this.f14392c = str;
    }

    /* renamed from: b */
    public void mo13918b(Date date) {
        this.f14406r = date;
    }

    /* renamed from: c */
    public Date mo13919c() {
        return this.f14410v;
    }

    /* renamed from: c */
    public void mo13920c(String str) {
        this.f14394f = str;
    }

    /* renamed from: c */
    public void mo13921c(Date date) {
        this.f14411w = date;
    }

    /* renamed from: c0 */
    public void mo13922c0(String str) {
        this.f14409u = str;
    }

    /* renamed from: d */
    public String mo11376d() {
        return mo13915b();
    }

    /* renamed from: d2 */
    public final Integer mo13923d2() {
        return mo13962t();
    }

    /* renamed from: e */
    public void mo13924e(String str) {
        this.f14412x = str;
    }

    /* renamed from: e2 */
    public final Date mo13925e2() {
        return mo13956q();
    }

    /* renamed from: f */
    public Boolean mo13926f() {
        return this.f14413y;
    }

    /* renamed from: f */
    public void mo13927f(Integer num) {
        this.f14401m = num;
    }

    /* renamed from: f */
    public void mo13928f(String str) {
        this.f14395g = str;
    }

    /* renamed from: f2 */
    public final Date mo13929f2() {
        return mo13919c();
    }

    /* renamed from: g */
    public String mo13930g() {
        return this.f14394f;
    }

    /* renamed from: g */
    public void mo13931g(String str) {
        this.f14402n = str;
    }

    /* renamed from: g */
    public void mo13932g(Date date) {
        this.f14404p = date;
    }

    /* renamed from: g2 */
    public final Integer mo13933g2() {
        return mo13908O();
    }

    /* renamed from: h */
    public String mo13934h() {
        return this.f14412x;
    }

    /* renamed from: h */
    public void mo13935h(String str) {
        this.f14396h = str;
    }

    /* renamed from: h2 */
    public final String mo13936h2() {
        return mo13934h();
    }

    /* renamed from: i2 */
    public final String mo13937i2() {
        return mo13909P1();
    }

    /* renamed from: j */
    public String mo13938j() {
        return this.f14402n;
    }

    /* renamed from: j */
    public void mo13939j(String str) {
        this.f14399k = str;
    }

    /* renamed from: j2 */
    public final String mo13940j2() {
        return mo13906C0();
    }

    /* renamed from: k */
    public String mo13941k() {
        return this.f14395g;
    }

    /* renamed from: k */
    public void mo13942k(String str) {
        this.f14398j = str;
    }

    /* renamed from: k2 */
    public final String mo13943k2() {
        return mo13910S();
    }

    /* renamed from: l */
    public void mo13944l(String str) {
        this.f14397i = str;
    }

    /* renamed from: l2 */
    public final Date mo13945l2() {
        return mo13966v1();
    }

    /* renamed from: m */
    public void mo13946m(String str) {
        this.f14400l = str;
    }

    /* renamed from: m0 */
    public void mo13947m0(String str) {
        this.f14408t = str;
    }

    /* renamed from: m2 */
    public final Date mo13948m2() {
        return mo13968y0();
    }

    /* renamed from: n */
    public String mo13949n() {
        return this.f14396h;
    }

    /* renamed from: n2 */
    public final String mo13950n2() {
        return mo13954p();
    }

    /* renamed from: o */
    public String mo13951o() {
        return this.f14398j;
    }

    /* renamed from: o */
    public void mo13952o(Date date) {
        this.f14403o = date;
    }

    /* renamed from: o2 */
    public final String mo13953o2() {
        return mo13960s();
    }

    /* renamed from: p */
    public String mo13954p() {
        return this.f14400l;
    }

    /* renamed from: p2 */
    public String mo13955p2() {
        return mo13911a();
    }

    /* renamed from: q */
    public Date mo13956q() {
        return this.f14406r;
    }

    /* renamed from: q2 */
    public final String mo13957q2() {
        return mo13965v();
    }

    /* renamed from: r */
    public Date mo13958r() {
        return this.f14411w;
    }

    /* renamed from: r2 */
    public final String mo13959r2() {
        return mo13951o();
    }

    /* renamed from: s */
    public String mo13960s() {
        return this.f14399k;
    }

    /* renamed from: s2 */
    public final String mo13961s2() {
        return mo13949n();
    }

    /* renamed from: t */
    public Integer mo13962t() {
        return this.f14405q;
    }

    /* renamed from: t2 */
    public final String mo13963t2() {
        return mo13938j();
    }

    /* renamed from: u */
    public Boolean mo11399u() {
        return mo13926f();
    }

    /* renamed from: u2 */
    public final String mo13964u2() {
        return mo13941k();
    }

    /* renamed from: v */
    public String mo13965v() {
        return this.f14397i;
    }

    /* renamed from: v1 */
    public Date mo13966v1() {
        return this.f14404p;
    }

    /* renamed from: v2 */
    public final String mo13967v2() {
        return mo13930g();
    }

    /* renamed from: y0 */
    public Date mo13968y0() {
        return this.f14403o;
    }
}
