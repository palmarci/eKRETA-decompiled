package p289hu.ekreta.ellenorzo.notes;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.p349io.ConstantsKt;
import p289hu.ekreta.ellenorzo.util.dao.ReadableByUserModelRealm;
import p300k.p340c.C5063c1;
import p300k.p340c.C5080h0;
import p300k.p340c.p341m1.C5116n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\r\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0017\"\u0004\b$\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0013\"\u0004\b&\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0013\"\u0004\b(\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0013\"\u0004\b*\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0013\"\u0004\b,\u0010\u0015R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0013\"\u0004\b.\u0010\u0015¨\u0006/"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/notes/NoteRealm;", "Lio/realm/RealmObject;", "Lhu/ekreta/ellenorzo/util/dao/ReadableByUserModelRealm;", "uid", "", "typeName", "typeDescription", "title", "content", "seenByTutelaryUTC", "Ljava/util/Date;", "teacher", "date", "creatingTime", "profileId", "readByUser", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/Boolean;)V", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "getCreatingTime", "()Ljava/util/Date;", "setCreatingTime", "(Ljava/util/Date;)V", "getDate", "setDate", "getProfileId", "setProfileId", "getReadByUser", "()Ljava/lang/Boolean;", "setReadByUser", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getSeenByTutelaryUTC", "setSeenByTutelaryUTC", "getTeacher", "setTeacher", "getTitle", "setTitle", "getTypeDescription", "setTypeDescription", "getTypeName", "setTypeName", "getUid", "setUid", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.notes.NoteRealm */
/* compiled from: NoteRealm.kt */
public class NoteRealm extends C5080h0 implements ReadableByUserModelRealm, C5063c1 {

    /* renamed from: c */
    public String f14079c;

    /* renamed from: e */
    public String f14080e;

    /* renamed from: f */
    public String f14081f;

    /* renamed from: g */
    public String f14082g;

    /* renamed from: h */
    public String f14083h;

    /* renamed from: i */
    public Date f14084i;

    /* renamed from: j */
    public String f14085j;

    /* renamed from: k */
    public Date f14086k;

    /* renamed from: l */
    public Date f14087l;

    /* renamed from: m */
    public String f14088m;

    /* renamed from: n */
    public Boolean f14089n;

    public NoteRealm() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
    }

    public /* synthetic */ NoteRealm(String str, String str2, String str3, String str4, String str5, Date date, String str6, Date date2, Date date3, String str7, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = i;
        Boolean bool2 = null;
        String str8 = (i2 & 1) != 0 ? null : str;
        String str9 = (i2 & 2) != 0 ? null : str2;
        String str10 = (i2 & 4) != 0 ? null : str3;
        String str11 = (i2 & 8) != 0 ? null : str4;
        String str12 = (i2 & 16) != 0 ? null : str5;
        Date date4 = (i2 & 32) != 0 ? null : date;
        String str13 = (i2 & 64) != 0 ? null : str6;
        Date date5 = (i2 & 128) != 0 ? null : date2;
        Date date6 = (i2 & 256) != 0 ? null : date3;
        String str14 = (i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : str7;
        if ((i2 & 1024) == 0) {
            bool2 = bool;
        }
        this(str8, str9, str10, str11, str12, date4, str13, date5, date6, str14, bool2);
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
    }

    /* renamed from: C */
    public String mo13594C() {
        return this.f14082g;
    }

    /* renamed from: G */
    public String mo13595G() {
        return this.f14083h;
    }

    /* renamed from: a */
    public String mo13596a() {
        return this.f14088m;
    }

    /* renamed from: a */
    public void mo13597a(Boolean bool) {
        this.f14089n = bool;
    }

    /* renamed from: a */
    public void mo13598a(String str) {
        this.f14088m = str;
    }

    /* renamed from: a */
    public void mo13599a(Date date) {
        this.f14086k = date;
    }

    /* renamed from: b */
    public String mo13600b() {
        return this.f14079c;
    }

    /* renamed from: b */
    public void mo11372b(Boolean bool) {
        mo13597a(bool);
    }

    /* renamed from: b */
    public void mo13601b(String str) {
        this.f14079c = str;
    }

    /* renamed from: b */
    public void mo13602b(Date date) {
        this.f14087l = date;
    }

    /* renamed from: c */
    public Date mo13603c() {
        return this.f14086k;
    }

    /* renamed from: c */
    public void mo13604c(String str) {
        this.f14080e = str;
    }

    /* renamed from: c */
    public void mo13605c(Date date) {
        this.f14084i = date;
    }

    /* renamed from: d */
    public String mo11376d() {
        return mo13600b();
    }

    /* renamed from: d2 */
    public final String mo13606d2() {
        return mo13595G();
    }

    /* renamed from: e2 */
    public final Date mo13607e2() {
        return mo13622q();
    }

    /* renamed from: f */
    public Boolean mo13608f() {
        return this.f14089n;
    }

    /* renamed from: f */
    public void mo13609f(String str) {
        this.f14081f = str;
    }

    /* renamed from: f2 */
    public final Date mo13610f2() {
        return mo13603c();
    }

    /* renamed from: g */
    public String mo13611g() {
        return this.f14080e;
    }

    /* renamed from: g */
    public void mo13612g(String str) {
        this.f14085j = str;
    }

    /* renamed from: g2 */
    public String mo13613g2() {
        return mo13596a();
    }

    /* renamed from: h2 */
    public final Date mo13614h2() {
        return mo13623r();
    }

    /* renamed from: i2 */
    public final String mo13615i2() {
        return mo13616j();
    }

    /* renamed from: j */
    public String mo13616j() {
        return this.f14085j;
    }

    /* renamed from: j2 */
    public final String mo13617j2() {
        return mo13594C();
    }

    /* renamed from: k */
    public String mo13618k() {
        return this.f14081f;
    }

    /* renamed from: k2 */
    public final String mo13619k2() {
        return mo13618k();
    }

    /* renamed from: l2 */
    public final String mo13620l2() {
        return mo13611g();
    }

    /* renamed from: o */
    public void mo13621o(String str) {
        this.f14083h = str;
    }

    /* renamed from: q */
    public Date mo13622q() {
        return this.f14087l;
    }

    /* renamed from: r */
    public Date mo13623r() {
        return this.f14084i;
    }

    /* renamed from: u */
    public Boolean mo11399u() {
        return mo13608f();
    }

    /* renamed from: u */
    public void mo13624u(String str) {
        this.f14082g = str;
    }

    public NoteRealm(String str, String str2, String str3, String str4, String str5, Date date, String str6, Date date2, Date date3, String str7, Boolean bool) {
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
        mo13601b(str);
        mo13604c(str2);
        mo13609f(str3);
        mo13624u(str4);
        mo13621o(str5);
        mo13605c(date);
        mo13612g(str6);
        mo13599a(date2);
        mo13602b(date3);
        mo13598a(str7);
        mo13597a(bool);
    }
}
