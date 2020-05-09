package p289hu.ekreta.ellenorzo.homework;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.p349io.ConstantsKt;
import p289hu.ekreta.ellenorzo.util.dao.ReadableByUserModelRealm;
import p300k.p340c.C5080h0;
import p300k.p340c.C5185z0;
import p300k.p340c.p341m1.C5116n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0012R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\r\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u000f\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\b\u0010\u001d\"\u0004\b!\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001a\"\u0004\b#\u0010\u001cR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0014\"\u0004\b'\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001a\"\u0004\b)\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001a\"\u0004\b+\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001a\"\u0004\b-\u0010\u001cR \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001a\"\u0004\b/\u0010\u001c¨\u00060"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/homework/HomeworkRealm;", "Lio/realm/RealmObject;", "Lhu/ekreta/ellenorzo/util/dao/ReadableByUserModelRealm;", "uid", "", "profileId", "subjectName", "recorderTeacherName", "isTeacherRecorded", "", "text", "recordDate", "Ljava/util/Date;", "deadlineDate", "createDate", "isStudentHomeworkEnabled", "readByUser", "groupUid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "getCreateDate", "()Ljava/util/Date;", "setCreateDate", "(Ljava/util/Date;)V", "getDeadlineDate", "setDeadlineDate", "getGroupUid", "()Ljava/lang/String;", "setGroupUid", "(Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "setStudentHomeworkEnabled", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "setTeacherRecorded", "getProfileId", "setProfileId", "getReadByUser", "setReadByUser", "getRecordDate", "setRecordDate", "getRecorderTeacherName", "setRecorderTeacherName", "getSubjectName", "setSubjectName", "getText", "setText", "getUid", "setUid", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.homework.HomeworkRealm */
/* compiled from: HomeworkRealm.kt */
public class HomeworkRealm extends C5080h0 implements ReadableByUserModelRealm, C5185z0 {

    /* renamed from: c */
    public String f13496c;

    /* renamed from: e */
    public String f13497e;

    /* renamed from: f */
    public String f13498f;

    /* renamed from: g */
    public String f13499g;

    /* renamed from: h */
    public Boolean f13500h;

    /* renamed from: i */
    public String f13501i;

    /* renamed from: j */
    public Date f13502j;

    /* renamed from: k */
    public Date f13503k;

    /* renamed from: l */
    public Date f13504l;

    /* renamed from: m */
    public Boolean f13505m;

    /* renamed from: n */
    public Boolean f13506n;

    /* renamed from: o */
    public String f13507o;

    public HomeworkRealm() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
    }

    public /* synthetic */ HomeworkRealm(String str, String str2, String str3, String str4, Boolean bool, String str5, Date date, Date date2, Date date3, Boolean bool2, Boolean bool3, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = i;
        String str7 = null;
        String str8 = (i2 & 1) != 0 ? null : str;
        String str9 = (i2 & 2) != 0 ? null : str2;
        String str10 = (i2 & 4) != 0 ? null : str3;
        String str11 = (i2 & 8) != 0 ? null : str4;
        Boolean bool4 = (i2 & 16) != 0 ? null : bool;
        String str12 = (i2 & 32) != 0 ? null : str5;
        Date date4 = (i2 & 64) != 0 ? null : date;
        Date date5 = (i2 & 128) != 0 ? null : date2;
        Date date6 = (i2 & 256) != 0 ? null : date3;
        Boolean bool5 = (i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : bool2;
        Boolean bool6 = (i2 & 1024) != 0 ? null : bool3;
        if ((i2 & 2048) == 0) {
            str7 = str6;
        }
        this(str8, str9, str10, str11, bool4, str12, date4, date5, date6, bool5, bool6, str7);
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
    }

    /* renamed from: D1 */
    public String mo12973D1() {
        return this.f13501i;
    }

    /* renamed from: G0 */
    public Date mo12974G0() {
        return this.f13503k;
    }

    /* renamed from: Q0 */
    public Date mo12975Q0() {
        return this.f13502j;
    }

    /* renamed from: X */
    public Date mo12976X() {
        return this.f13504l;
    }

    /* renamed from: a */
    public String mo12977a() {
        return this.f13497e;
    }

    /* renamed from: a */
    public void mo12978a(Boolean bool) {
        this.f13506n = bool;
    }

    /* renamed from: a */
    public void mo12979a(String str) {
        this.f13497e = str;
    }

    /* renamed from: b */
    public String mo12980b() {
        return this.f13496c;
    }

    /* renamed from: b */
    public void mo11372b(Boolean bool) {
        mo12978a(bool);
    }

    /* renamed from: b */
    public void mo12981b(String str) {
        this.f13496c = str;
    }

    /* renamed from: c */
    public void mo12982c(Boolean bool) {
        this.f13500h = bool;
    }

    /* renamed from: c0 */
    public Boolean mo12983c0() {
        return this.f13505m;
    }

    /* renamed from: d */
    public String mo11376d() {
        return mo12980b();
    }

    /* renamed from: d2 */
    public final Date mo12984d2() {
        return mo12976X();
    }

    /* renamed from: e */
    public void mo12985e(Boolean bool) {
        this.f13505m = bool;
    }

    /* renamed from: e */
    public void mo12986e(String str) {
        this.f13507o = str;
    }

    /* renamed from: e */
    public void mo12987e(Date date) {
        this.f13502j = date;
    }

    /* renamed from: e2 */
    public final Date mo12988e2() {
        return mo12974G0();
    }

    /* renamed from: f */
    public Boolean mo12989f() {
        return this.f13506n;
    }

    /* renamed from: f2 */
    public final String mo12990f2() {
        return mo12992h();
    }

    /* renamed from: g2 */
    public String mo12991g2() {
        return mo12977a();
    }

    /* renamed from: h */
    public String mo12992h() {
        return this.f13507o;
    }

    /* renamed from: h */
    public void mo12993h(String str) {
        this.f13498f = str;
    }

    /* renamed from: h2 */
    public final Date mo12994h2() {
        return mo12975Q0();
    }

    /* renamed from: i2 */
    public final String mo12995i2() {
        return mo13003r1();
    }

    /* renamed from: j1 */
    public Boolean mo12996j1() {
        return this.f13500h;
    }

    /* renamed from: j2 */
    public final String mo12997j2() {
        return mo13001n();
    }

    /* renamed from: k2 */
    public final String mo12998k2() {
        return mo12973D1();
    }

    /* renamed from: l2 */
    public final Boolean mo12999l2() {
        return mo12983c0();
    }

    /* renamed from: m2 */
    public final Boolean mo13000m2() {
        return mo12996j1();
    }

    /* renamed from: n */
    public String mo13001n() {
        return this.f13498f;
    }

    /* renamed from: r */
    public void mo13002r(Date date) {
        this.f13503k = date;
    }

    /* renamed from: r1 */
    public String mo13003r1() {
        return this.f13499g;
    }

    /* renamed from: t */
    public void mo13004t(Date date) {
        this.f13504l = date;
    }

    /* renamed from: t0 */
    public void mo13005t0(String str) {
        this.f13501i = str;
    }

    /* renamed from: u */
    public Boolean mo11399u() {
        return mo12989f();
    }

    /* renamed from: z0 */
    public void mo13006z0(String str) {
        this.f13499g = str;
    }

    public HomeworkRealm(String str, String str2, String str3, String str4, Boolean bool, String str5, Date date, Date date2, Date date3, Boolean bool2, Boolean bool3, String str6) {
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
        mo12981b(str);
        mo12979a(str2);
        mo12993h(str3);
        mo13006z0(str4);
        mo12982c(bool);
        mo13005t0(str5);
        mo12987e(date);
        mo13002r(date2);
        mo13004t(date3);
        mo12985e(bool2);
        mo12978a(bool3);
        mo12986e(str6);
    }
}
