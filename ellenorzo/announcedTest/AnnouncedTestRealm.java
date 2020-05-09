package p289hu.ekreta.ellenorzo.announcedTest;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.p349io.ConstantsKt;
import p289hu.ekreta.ellenorzo.util.dao.ReadableByUserModelRealm;
import p300k.p340c.C5080h0;
import p300k.p340c.C5143q0;
import p300k.p340c.p341m1.C5116n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b%\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0013R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0015\"\u0004\b\u001e\u0010\u0017R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0010\n\u0002\u0010-\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010 \"\u0004\b/\u0010\"R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010 \"\u0004\b1\u0010\"R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010 \"\u0004\b3\u0010\"R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010 \"\u0004\b5\u0010\"¨\u00066"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestRealm;", "Lio/realm/RealmObject;", "Lhu/ekreta/ellenorzo/util/dao/ReadableByUserModelRealm;", "uid", "", "date", "Ljava/util/Date;", "classScheduleNumber", "", "subject", "teacher", "theme", "modeName", "modeDescription", "announcedAtUTC", "profileId", "readByUser", "", "groupUid", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getAnnouncedAtUTC", "()Ljava/util/Date;", "setAnnouncedAtUTC", "(Ljava/util/Date;)V", "getClassScheduleNumber", "()Ljava/lang/Integer;", "setClassScheduleNumber", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getDate", "setDate", "getGroupUid", "()Ljava/lang/String;", "setGroupUid", "(Ljava/lang/String;)V", "getModeDescription", "setModeDescription", "getModeName", "setModeName", "getProfileId", "setProfileId", "getReadByUser", "()Ljava/lang/Boolean;", "setReadByUser", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getSubject", "setSubject", "getTeacher", "setTeacher", "getTheme", "setTheme", "getUid", "setUid", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.announcedTest.AnnouncedTestRealm */
/* compiled from: AnnouncedTestRealm.kt */
public class AnnouncedTestRealm extends C5080h0 implements ReadableByUserModelRealm, C5143q0 {

    /* renamed from: c */
    public String f11083c;

    /* renamed from: e */
    public Date f11084e;

    /* renamed from: f */
    public Integer f11085f;

    /* renamed from: g */
    public String f11086g;

    /* renamed from: h */
    public String f11087h;

    /* renamed from: i */
    public String f11088i;

    /* renamed from: j */
    public String f11089j;

    /* renamed from: k */
    public String f11090k;

    /* renamed from: l */
    public Date f11091l;

    /* renamed from: m */
    public String f11092m;

    /* renamed from: n */
    public Boolean f11093n;

    /* renamed from: o */
    public String f11094o;

    public AnnouncedTestRealm() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
    }

    public /* synthetic */ AnnouncedTestRealm(String str, Date date, Integer num, String str2, String str3, String str4, String str5, String str6, Date date2, String str7, Boolean bool, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = i;
        String str9 = null;
        String str10 = (i2 & 1) != 0 ? null : str;
        Date date3 = (i2 & 2) != 0 ? null : date;
        Integer num2 = (i2 & 4) != 0 ? null : num;
        String str11 = (i2 & 8) != 0 ? null : str2;
        String str12 = (i2 & 16) != 0 ? null : str3;
        String str13 = (i2 & 32) != 0 ? null : str4;
        String str14 = (i2 & 64) != 0 ? null : str5;
        String str15 = (i2 & 128) != 0 ? null : str6;
        Date date4 = (i2 & 256) != 0 ? null : date2;
        String str16 = (i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : str7;
        Boolean bool2 = (i2 & 1024) != 0 ? null : bool;
        if ((i2 & 2048) == 0) {
            str9 = str8;
        }
        this(str10, date3, num2, str11, str12, str13, str14, str15, date4, str16, bool2, str9);
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
    }

    /* renamed from: B */
    public String mo11365B() {
        return this.f11086g;
    }

    /* renamed from: S0 */
    public Date mo11366S0() {
        return this.f11091l;
    }

    /* renamed from: a */
    public String mo11367a() {
        return this.f11092m;
    }

    /* renamed from: a */
    public void mo11368a(Boolean bool) {
        this.f11093n = bool;
    }

    /* renamed from: a */
    public void mo11369a(String str) {
        this.f11092m = str;
    }

    /* renamed from: a */
    public void mo11370a(Date date) {
        this.f11084e = date;
    }

    /* renamed from: b */
    public String mo11371b() {
        return this.f11083c;
    }

    /* renamed from: b */
    public void mo11372b(Boolean bool) {
        mo11368a(bool);
    }

    /* renamed from: b */
    public void mo11373b(Integer num) {
        this.f11085f = num;
    }

    /* renamed from: b */
    public void mo11374b(String str) {
        this.f11083c = str;
    }

    /* renamed from: c */
    public Date mo11375c() {
        return this.f11084e;
    }

    /* renamed from: d */
    public String mo11376d() {
        return mo11371b();
    }

    /* renamed from: d2 */
    public final Date mo11377d2() {
        return mo11366S0();
    }

    /* renamed from: e */
    public void mo11378e(String str) {
        this.f11094o = str;
    }

    /* renamed from: e2 */
    public final Integer mo11379e2() {
        return mo11398t();
    }

    /* renamed from: f */
    public Boolean mo11380f() {
        return this.f11093n;
    }

    /* renamed from: f2 */
    public final Date mo11381f2() {
        return mo11375c();
    }

    /* renamed from: g */
    public void mo11382g(String str) {
        this.f11087h = str;
    }

    /* renamed from: g2 */
    public final String mo11383g2() {
        return mo11384h();
    }

    /* renamed from: h */
    public String mo11384h() {
        return this.f11094o;
    }

    /* renamed from: h2 */
    public final String mo11385h2() {
        return mo11395p();
    }

    /* renamed from: i2 */
    public final String mo11386i2() {
        return mo11397s();
    }

    /* renamed from: j */
    public String mo11387j() {
        return this.f11087h;
    }

    /* renamed from: j */
    public void mo11388j(String str) {
        this.f11089j = str;
    }

    /* renamed from: j2 */
    public String mo11389j2() {
        return mo11367a();
    }

    /* renamed from: k */
    public void mo11390k(Date date) {
        this.f11091l = date;
    }

    /* renamed from: k2 */
    public final String mo11391k2() {
        return mo11365B();
    }

    /* renamed from: l2 */
    public final String mo11392l2() {
        return mo11387j();
    }

    /* renamed from: m */
    public void mo11393m(String str) {
        this.f11090k = str;
    }

    /* renamed from: m2 */
    public final String mo11394m2() {
        return mo11400x();
    }

    /* renamed from: p */
    public String mo11395p() {
        return this.f11090k;
    }

    /* renamed from: q */
    public void mo11396q(String str) {
        this.f11088i = str;
    }

    /* renamed from: s */
    public String mo11397s() {
        return this.f11089j;
    }

    /* renamed from: t */
    public Integer mo11398t() {
        return this.f11085f;
    }

    /* renamed from: u */
    public Boolean mo11399u() {
        return mo11380f();
    }

    /* renamed from: x */
    public String mo11400x() {
        return this.f11088i;
    }

    /* renamed from: y */
    public void mo11401y(String str) {
        this.f11086g = str;
    }

    public AnnouncedTestRealm(String str, Date date, Integer num, String str2, String str3, String str4, String str5, String str6, Date date2, String str7, Boolean bool, String str8) {
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
        mo11374b(str);
        mo11370a(date);
        mo11373b(num);
        mo11401y(str2);
        mo11382g(str3);
        mo11396q(str4);
        mo11388j(str5);
        mo11393m(str6);
        mo11390k(date2);
        mo11369a(str7);
        mo11368a(bool);
        mo11378e(str8);
    }
}
