package p289hu.ekreta.ellenorzo.timetable;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p349io.ConstantsKt;
import p289hu.ekreta.ellenorzo.util.dao.ProfileSpecificModelRealm;
import p300k.p340c.C5065d0;
import p300k.p340c.C5080h0;
import p300k.p340c.C5096l1;
import p300k.p340c.p341m1.C5116n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b>\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B§\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010 R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\"\"\u0004\b+\u0010$R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u0010\f\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010-\"\u0004\b1\u0010/R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\"\"\u0004\b3\u0010$R\u001a\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\"\"\u0004\b9\u0010$R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\"\"\u0004\b;\u0010$R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\"\"\u0004\b=\u0010$R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\"\"\u0004\b?\u0010$R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\"\"\u0004\bA\u0010$R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\"\"\u0004\bC\u0010$R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010-\"\u0004\bI\u0010/R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\"\"\u0004\bK\u0010$R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\"\"\u0004\bM\u0010$R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\"\"\u0004\bO\u0010$R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\"\"\u0004\bQ\u0010$R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\"\"\u0004\bS\u0010$R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\"\"\u0004\bU\u0010$R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\"\"\u0004\bW\u0010$R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\"\"\u0004\bY\u0010$R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010\"\"\u0004\b[\u0010$¨\u0006\\"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/timetable/TimeTableItemRealm;", "Lio/realm/RealmObject;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificModelRealm;", "uid", "", "lessonTypeName", "lessonTypeDescription", "date", "Ljava/util/Date;", "classScheduleNumber", "", "startTime", "endTime", "subjectName", "subjectCategoryName", "subjectCategoryDescription", "classroom", "classGroupName", "teacher", "supplyTeacher", "stateDescription", "stateName", "presenceTypeDescription", "presenceTypeName", "topic", "homeworkEditedByStudentEnabled", "", "name", "profileId", "reportedExamUids", "Lio/realm/RealmList;", "homeWorkUid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lio/realm/RealmList;Ljava/lang/String;)V", "getClassGroupName", "()Ljava/lang/String;", "setClassGroupName", "(Ljava/lang/String;)V", "getClassScheduleNumber", "()Ljava/lang/Integer;", "setClassScheduleNumber", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getClassroom", "setClassroom", "getDate", "()Ljava/util/Date;", "setDate", "(Ljava/util/Date;)V", "getEndTime", "setEndTime", "getHomeWorkUid", "setHomeWorkUid", "getHomeworkEditedByStudentEnabled", "()Z", "setHomeworkEditedByStudentEnabled", "(Z)V", "getLessonTypeDescription", "setLessonTypeDescription", "getLessonTypeName", "setLessonTypeName", "getName", "setName", "getPresenceTypeDescription", "setPresenceTypeDescription", "getPresenceTypeName", "setPresenceTypeName", "getProfileId", "setProfileId", "getReportedExamUids", "()Lio/realm/RealmList;", "setReportedExamUids", "(Lio/realm/RealmList;)V", "getStartTime", "setStartTime", "getStateDescription", "setStateDescription", "getStateName", "setStateName", "getSubjectCategoryDescription", "setSubjectCategoryDescription", "getSubjectCategoryName", "setSubjectCategoryName", "getSubjectName", "setSubjectName", "getSupplyTeacher", "setSupplyTeacher", "getTeacher", "setTeacher", "getTopic", "setTopic", "getUid", "setUid", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.timetable.TimeTableItemRealm */
/* compiled from: TimeTableItemRealm.kt */
public class TimeTableItemRealm extends C5080h0 implements ProfileSpecificModelRealm, C5096l1 {

    /* renamed from: A */
    public String f15151A;

    /* renamed from: c */
    public String f15152c;

    /* renamed from: e */
    public String f15153e;

    /* renamed from: f */
    public String f15154f;

    /* renamed from: g */
    public Date f15155g;

    /* renamed from: h */
    public Integer f15156h;

    /* renamed from: i */
    public Date f15157i;

    /* renamed from: j */
    public Date f15158j;

    /* renamed from: k */
    public String f15159k;

    /* renamed from: l */
    public String f15160l;

    /* renamed from: m */
    public String f15161m;

    /* renamed from: n */
    public String f15162n;

    /* renamed from: o */
    public String f15163o;

    /* renamed from: p */
    public String f15164p;

    /* renamed from: q */
    public String f15165q;

    /* renamed from: r */
    public String f15166r;

    /* renamed from: s */
    public String f15167s;

    /* renamed from: t */
    public String f15168t;

    /* renamed from: u */
    public String f15169u;

    /* renamed from: v */
    public String f15170v;

    /* renamed from: w */
    public boolean f15171w;

    /* renamed from: x */
    public String f15172x;

    /* renamed from: y */
    public String f15173y;

    /* renamed from: z */
    public C5065d0<String> f15174z;

    public TimeTableItemRealm() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 16777215, null);
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
    }

    public /* synthetic */ TimeTableItemRealm(String str, String str2, String str3, Date date, Integer num, Date date2, Date date3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, boolean z, String str16, String str17, C5065d0 d0Var, String str18, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = i;
        String str19 = (i2 & 1) != 0 ? null : str;
        this(str19, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : date, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : date2, (i2 & 64) != 0 ? null : date3, (i2 & 128) != 0 ? null : str4, (i2 & 256) != 0 ? null : str5, (i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : str6, (i2 & 1024) != 0 ? null : str7, (i2 & 2048) != 0 ? null : str8, (i2 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? null : str9, (i2 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? null : str10, (i2 & 16384) != 0 ? null : str11, (i2 & 32768) != 0 ? null : str12, (i2 & 65536) != 0 ? null : str13, (i2 & 131072) != 0 ? null : str14, (i2 & 262144) != 0 ? null : str15, (i2 & 524288) != 0 ? false : z, (i2 & 1048576) != 0 ? null : str16, (i2 & 2097152) != 0 ? null : str17, (i2 & 4194304) != 0 ? new C5065d0() : d0Var, (i2 & 8388608) != 0 ? null : str18);
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
    }

    /* renamed from: A */
    public String mo16038A() {
        return this.f15166r;
    }

    /* renamed from: A0 */
    public void mo16039A0(String str) {
        this.f15167s = str;
    }

    /* renamed from: C */
    public void mo16040C(String str) {
        this.f15169u = str;
    }

    /* renamed from: E0 */
    public String mo16041E0() {
        return this.f15153e;
    }

    /* renamed from: F */
    public void mo16042F(String str) {
        this.f15154f = str;
    }

    /* renamed from: I1 */
    public String mo16043I1() {
        return this.f15154f;
    }

    /* renamed from: L0 */
    public String mo16044L0() {
        return this.f15167s;
    }

    /* renamed from: M */
    public void mo16045M(String str) {
        this.f15153e = str;
    }

    /* renamed from: N */
    public String mo16046N() {
        return this.f15169u;
    }

    /* renamed from: P0 */
    public C5065d0 mo16047P0() {
        return this.f15174z;
    }

    /* renamed from: R0 */
    public void mo16048R0(String str) {
        this.f15162n = str;
    }

    /* renamed from: V0 */
    public String mo16049V0() {
        return this.f15170v;
    }

    /* renamed from: Y0 */
    public String mo16050Y0() {
        return this.f15165q;
    }

    /* renamed from: a */
    public String mo16051a() {
        return this.f15173y;
    }

    /* renamed from: a */
    public void mo16052a(String str) {
        this.f15173y = str;
    }

    /* renamed from: a */
    public void mo16053a(Date date) {
        this.f15155g = date;
    }

    /* renamed from: a1 */
    public Date mo16054a1() {
        return this.f15158j;
    }

    /* renamed from: b */
    public String mo16055b() {
        return this.f15152c;
    }

    /* renamed from: b */
    public void mo16056b(Integer num) {
        this.f15156h = num;
    }

    /* renamed from: b */
    public void mo16057b(String str) {
        this.f15152c = str;
    }

    /* renamed from: c */
    public Date mo16058c() {
        return this.f15155g;
    }

    /* renamed from: d */
    public final String mo16059d() {
        return mo16055b();
    }

    /* renamed from: d */
    public void mo16060d(String str) {
        this.f15172x = str;
    }

    /* renamed from: d */
    public void mo16061d(boolean z) {
        this.f15171w = z;
    }

    /* renamed from: d1 */
    public String mo16062d1() {
        return this.f15163o;
    }

    /* renamed from: d2 */
    public final String mo16063d2() {
        return mo16062d1();
    }

    /* renamed from: e2 */
    public final Integer mo16064e2() {
        return mo16097t();
    }

    /* renamed from: f2 */
    public final String mo16065f2() {
        return mo16075i1();
    }

    /* renamed from: g */
    public void mo16066g(String str) {
        this.f15164p = str;
    }

    /* renamed from: g0 */
    public String mo16067g0() {
        return this.f15168t;
    }

    /* renamed from: g2 */
    public final Date mo16068g2() {
        return mo16058c();
    }

    /* renamed from: h */
    public void mo16069h(String str) {
        this.f15159k = str;
    }

    /* renamed from: h */
    public void mo16070h(C5065d0 d0Var) {
        this.f15174z = d0Var;
    }

    /* renamed from: h0 */
    public void mo16071h0(String str) {
        this.f15168t = str;
    }

    /* renamed from: h1 */
    public String mo16072h1() {
        return this.f15151A;
    }

    /* renamed from: h2 */
    public final Date mo16073h2() {
        return mo16054a1();
    }

    /* renamed from: i */
    public String mo16074i() {
        return this.f15172x;
    }

    /* renamed from: i1 */
    public String mo16075i1() {
        return this.f15162n;
    }

    /* renamed from: i2 */
    public final String mo16076i2() {
        return mo16072h1();
    }

    /* renamed from: j */
    public String mo16077j() {
        return this.f15164p;
    }

    /* renamed from: j */
    public void mo16078j(Date date) {
        this.f15157i = date;
    }

    /* renamed from: j0 */
    public Date mo16079j0() {
        return this.f15157i;
    }

    /* renamed from: j2 */
    public final boolean mo16080j2() {
        return mo16085m1();
    }

    /* renamed from: k */
    public void mo16081k(String str) {
        this.f15160l = str;
    }

    /* renamed from: k2 */
    public final String mo16082k2() {
        return mo16043I1();
    }

    /* renamed from: l */
    public void mo16083l(String str) {
        this.f15161m = str;
    }

    /* renamed from: l2 */
    public final String mo16084l2() {
        return mo16041E0();
    }

    /* renamed from: m1 */
    public boolean mo16085m1() {
        return this.f15171w;
    }

    /* renamed from: m2 */
    public final String mo16086m2() {
        return mo16074i();
    }

    /* renamed from: n */
    public String mo16087n() {
        return this.f15159k;
    }

    /* renamed from: n0 */
    public void mo16088n0(String str) {
        this.f15165q = str;
    }

    /* renamed from: n2 */
    public final String mo16089n2() {
        return mo16067g0();
    }

    /* renamed from: o */
    public String mo16090o() {
        return this.f15160l;
    }

    /* renamed from: o2 */
    public final String mo16091o2() {
        return mo16046N();
    }

    /* renamed from: p2 */
    public String mo16092p2() {
        return mo16051a();
    }

    /* renamed from: q */
    public void mo16093q(Date date) {
        this.f15158j = date;
    }

    /* renamed from: q2 */
    public final C5065d0<String> mo16094q2() {
        return mo16047P0();
    }

    /* renamed from: r2 */
    public final Date mo16095r2() {
        return mo16079j0();
    }

    /* renamed from: s2 */
    public final String mo16096s2() {
        return mo16038A();
    }

    /* renamed from: t */
    public Integer mo16097t() {
        return this.f15156h;
    }

    /* renamed from: t */
    public void mo16098t(String str) {
        this.f15166r = str;
    }

    /* renamed from: t2 */
    public final String mo16099t2() {
        return mo16044L0();
    }

    /* renamed from: u0 */
    public void mo16100u0(String str) {
        this.f15151A = str;
    }

    /* renamed from: u2 */
    public final String mo16101u2() {
        return mo16102v();
    }

    /* renamed from: v */
    public String mo16102v() {
        return this.f15161m;
    }

    /* renamed from: v2 */
    public final String mo16103v2() {
        return mo16090o();
    }

    /* renamed from: w0 */
    public void mo16104w0(String str) {
        this.f15163o = str;
    }

    /* renamed from: w2 */
    public final String mo16105w2() {
        return mo16087n();
    }

    /* renamed from: x2 */
    public final String mo16106x2() {
        return mo16050Y0();
    }

    /* renamed from: y2 */
    public final String mo16107y2() {
        return mo16077j();
    }

    /* renamed from: z */
    public void mo16108z(String str) {
        this.f15170v = str;
    }

    /* renamed from: z2 */
    public final String mo16109z2() {
        return mo16049V0();
    }

    public TimeTableItemRealm(String str, String str2, String str3, Date date, Integer num, Date date2, Date date3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, boolean z, String str16, String str17, C5065d0<String> d0Var, String str18) {
        C5065d0<String> d0Var2 = d0Var;
        Intrinsics.checkParameterIsNotNull(d0Var2, "reportedExamUids");
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
        mo16057b(str);
        String str19 = str2;
        mo16045M(str2);
        String str20 = str3;
        mo16042F(str3);
        Date date4 = date;
        mo16053a(date);
        Integer num2 = num;
        mo16056b(num);
        Date date5 = date2;
        mo16078j(date2);
        Date date6 = date3;
        mo16093q(date3);
        String str21 = str4;
        mo16069h(str4);
        String str22 = str5;
        mo16081k(str5);
        String str23 = str6;
        mo16083l(str6);
        String str24 = str7;
        mo16048R0(str7);
        String str25 = str8;
        mo16104w0(str8);
        mo16066g(str9);
        mo16088n0(str10);
        mo16098t(str11);
        mo16039A0(str12);
        mo16071h0(str13);
        mo16040C(str14);
        mo16108z(str15);
        mo16061d(z);
        mo16060d(str16);
        mo16052a(str17);
        mo16070h((C5065d0) d0Var2);
        mo16100u0(str18);
    }
}
