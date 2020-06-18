package hu.ekreta.ellenorzo.omission;

import hu.ekreta.ellenorzo.util.dao.ReadableByUserModelRealm;
import java.util.Date;
import k.c.f1;
import k.c.h0;
import k.c.m1.n;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b8\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\u0002\u0010\u001dR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b)\u0010\u001f\"\u0004\b*\u0010!R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010,\"\u0004\b0\u0010.R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010,\"\u0004\b4\u0010.R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010$\"\u0004\b6\u0010&R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010$\"\u0004\b8\u0010&R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010,\"\u0004\b:\u0010.R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010,\"\u0004\b<\u0010.R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010,\"\u0004\b>\u0010.R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0010\n\u0002\u0010C\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010$\"\u0004\bE\u0010&R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010,\"\u0004\bG\u0010.R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010,\"\u0004\bI\u0010.R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010,\"\u0004\bK\u0010.R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010,\"\u0004\bM\u0010.R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010,\"\u0004\bO\u0010.R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010,\"\u0004\bQ\u0010.R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010,\"\u0004\bS\u0010.¨\u0006T"}, d2 = {"Lhu/ekreta/ellenorzo/omission/OmissionRealm;", "Lio/realm/RealmObject;", "Lhu/ekreta/ellenorzo/util/dao/ReadableByUserModelRealm;", "uid", "", "profileId", "typeName", "typeDescription", "subjectName", "subjectCategoryDescription", "subjectCategoryName", "modeName", "modeDescription", "delayTimeMinutes", "", "teacher", "lessonStartTime", "Ljava/util/Date;", "lessonEndTime", "classScheduleNumber", "creatingTime", "justificationStateName", "justificationTypeDescription", "justificationTypeName", "date", "seenByTutelaryUTC", "groupUid", "readByUser", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/Integer;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/Boolean;)V", "getClassScheduleNumber", "()Ljava/lang/Integer;", "setClassScheduleNumber", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCreatingTime", "()Ljava/util/Date;", "setCreatingTime", "(Ljava/util/Date;)V", "getDate", "setDate", "getDelayTimeMinutes", "setDelayTimeMinutes", "getGroupUid", "()Ljava/lang/String;", "setGroupUid", "(Ljava/lang/String;)V", "getJustificationStateName", "setJustificationStateName", "getJustificationTypeDescription", "setJustificationTypeDescription", "getJustificationTypeName", "setJustificationTypeName", "getLessonEndTime", "setLessonEndTime", "getLessonStartTime", "setLessonStartTime", "getModeDescription", "setModeDescription", "getModeName", "setModeName", "getProfileId", "setProfileId", "getReadByUser", "()Ljava/lang/Boolean;", "setReadByUser", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getSeenByTutelaryUTC", "setSeenByTutelaryUTC", "getSubjectCategoryDescription", "setSubjectCategoryDescription", "getSubjectCategoryName", "setSubjectCategoryName", "getSubjectName", "setSubjectName", "getTeacher", "setTeacher", "getTypeDescription", "setTypeDescription", "getTypeName", "setTypeName", "getUid", "setUid", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: OmissionRealm.kt */
public class OmissionRealm extends h0 implements ReadableByUserModelRealm, f1 {
    public String c;
    public String e;
    public String f;

    /* renamed from: g  reason: collision with root package name */
    public String f5951g;

    /* renamed from: h  reason: collision with root package name */
    public String f5952h;

    /* renamed from: i  reason: collision with root package name */
    public String f5953i;

    /* renamed from: j  reason: collision with root package name */
    public String f5954j;

    /* renamed from: k  reason: collision with root package name */
    public String f5955k;

    /* renamed from: l  reason: collision with root package name */
    public String f5956l;

    /* renamed from: m  reason: collision with root package name */
    public Integer f5957m;

    /* renamed from: n  reason: collision with root package name */
    public String f5958n;

    /* renamed from: o  reason: collision with root package name */
    public Date f5959o;

    /* renamed from: p  reason: collision with root package name */
    public Date f5960p;

    /* renamed from: q  reason: collision with root package name */
    public Integer f5961q;
    public Date r;
    public String s;
    public String t;
    public String u;
    public Date v;
    public Date w;
    public String x;
    public Boolean y;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public OmissionRealm() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (Date) null, (Date) null, (Integer) null, (Date) null, (String) null, (String) null, (String) null, (Date) null, (Date) null, (String) null, (Boolean) null, 4194303, (DefaultConstructorMarker) null);
        if (this instanceof n) {
            ((n) this).K();
        }
    }

    public /* synthetic */ OmissionRealm(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, Date date, Date date2, Integer num2, Date date3, String str11, String str12, String str13, Date date4, Date date5, String str14, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        int i3 = i2;
        String str15 = (i3 & 1) != 0 ? null : str;
        String str16 = (i3 & 2) != 0 ? null : str2;
        String str17 = (i3 & 4) != 0 ? null : str3;
        String str18 = (i3 & 8) != 0 ? null : str4;
        String str19 = (i3 & 16) != 0 ? null : str5;
        String str20 = (i3 & 32) != 0 ? null : str6;
        String str21 = (i3 & 64) != 0 ? null : str7;
        String str22 = (i3 & 128) != 0 ? null : str8;
        String str23 = (i3 & 256) != 0 ? null : str9;
        Integer num3 = (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : num;
        String str24 = (i3 & 1024) != 0 ? null : str10;
        Date date6 = (i3 & 2048) != 0 ? null : date;
        Date date7 = (i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? null : date2;
        Integer num4 = (i3 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? null : num2;
        Date date8 = (i3 & 16384) != 0 ? null : date3;
        String str25 = (i3 & 32768) != 0 ? null : str11;
        String str26 = (i3 & 65536) != 0 ? null : str12;
        String str27 = (i3 & 131072) != 0 ? null : str13;
        Date date9 = (i3 & 262144) != 0 ? null : date4;
        Date date10 = (i3 & 524288) != 0 ? null : date5;
        String str28 = (i3 & 1048576) != 0 ? null : str14;
        Boolean bool2 = (i3 & 2097152) != 0 ? null : bool;
        boolean z = this instanceof n;
        if (z) {
            ((n) this).K();
        }
        b(str15);
        a(str16);
        c(str17);
        f(str18);
        h(str19);
        l(str20);
        k(str21);
        j(str22);
        m(str23);
        f(num3);
        g(str24);
        o(date6);
        g(date7);
        b(num4);
        b(date8);
        G0(str25);
        m0(str26);
        c0(str27);
        a(date9);
        c(date10);
        e(str28);
        a(bool2);
        if (z) {
            ((n) this).K();
        }
    }

    public String C0() {
        return this.t;
    }

    public void G0(String str) {
        this.s = str;
    }

    public Integer O() {
        return this.f5957m;
    }

    public String P1() {
        return this.s;
    }

    public String S() {
        return this.u;
    }

    public String a() {
        return this.e;
    }

    public void a(Boolean bool) {
        this.y = bool;
    }

    public void a(String str) {
        this.e = str;
    }

    public void a(Date date) {
        this.v = date;
    }

    public String b() {
        return this.c;
    }

    public void b(Boolean bool) {
        a(bool);
    }

    public void b(Integer num) {
        this.f5961q = num;
    }

    public void b(String str) {
        this.c = str;
    }

    public void b(Date date) {
        this.r = date;
    }

    public Date c() {
        return this.v;
    }

    public void c(String str) {
        this.f = str;
    }

    public void c(Date date) {
        this.w = date;
    }

    public void c0(String str) {
        this.u = str;
    }

    public String d() {
        return b();
    }

    public void e(String str) {
        this.x = str;
    }

    public final Integer e2() {
        return t();
    }

    public Boolean f() {
        return this.y;
    }

    public void f(Integer num) {
        this.f5957m = num;
    }

    public void f(String str) {
        this.f5951g = str;
    }

    public final Date f2() {
        return q();
    }

    public String g() {
        return this.f;
    }

    public void g(String str) {
        this.f5958n = str;
    }

    public void g(Date date) {
        this.f5960p = date;
    }

    public final Date g2() {
        return c();
    }

    public String h() {
        return this.x;
    }

    public void h(String str) {
        this.f5952h = str;
    }

    public final Integer h2() {
        return O();
    }

    public final String i2() {
        return h();
    }

    public String j() {
        return this.f5958n;
    }

    public void j(String str) {
        this.f5955k = str;
    }

    public final String j2() {
        return P1();
    }

    public String k() {
        return this.f5951g;
    }

    public void k(String str) {
        this.f5954j = str;
    }

    public final String k2() {
        return C0();
    }

    public void l(String str) {
        this.f5953i = str;
    }

    public final String l2() {
        return S();
    }

    public void m(String str) {
        this.f5956l = str;
    }

    public void m0(String str) {
        this.t = str;
    }

    public final Date m2() {
        return v1();
    }

    public String n() {
        return this.f5952h;
    }

    public final Date n2() {
        return y0();
    }

    public String o() {
        return this.f5954j;
    }

    public void o(Date date) {
        this.f5959o = date;
    }

    public final String o2() {
        return p();
    }

    public String p() {
        return this.f5956l;
    }

    public final String p2() {
        return s();
    }

    public Date q() {
        return this.r;
    }

    public String q2() {
        return a();
    }

    public Date r() {
        return this.w;
    }

    public final String r2() {
        return v();
    }

    public String s() {
        return this.f5955k;
    }

    public final String s2() {
        return o();
    }

    public Integer t() {
        return this.f5961q;
    }

    public final String t2() {
        return n();
    }

    public Boolean u() {
        return f();
    }

    public final String u2() {
        return j();
    }

    public String v() {
        return this.f5953i;
    }

    public Date v1() {
        return this.f5960p;
    }

    public final String v2() {
        return k();
    }

    public final String w2() {
        return g();
    }

    public Date y0() {
        return this.f5959o;
    }
}
