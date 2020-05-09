package p289hu.ekreta.ellenorzo.noticeboard;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p289hu.ekreta.ellenorzo.util.dao.ReadableByUserModelRealm;
import p300k.p340c.C5069d1;
import p300k.p340c.C5080h0;
import p300k.p340c.p341m1.C5116n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002BY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000f\"\u0004\b\"\u0010\u0011¨\u0006#"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItemRealm;", "Lio/realm/RealmObject;", "Lhu/ekreta/ellenorzo/util/dao/ReadableByUserModelRealm;", "uid", "", "expireStartTime", "Ljava/util/Date;", "expireEndTime", "content", "title", "profileId", "readByUser", "", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "getExpireEndTime", "()Ljava/util/Date;", "setExpireEndTime", "(Ljava/util/Date;)V", "getExpireStartTime", "setExpireStartTime", "getProfileId", "setProfileId", "getReadByUser", "()Ljava/lang/Boolean;", "setReadByUser", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getTitle", "setTitle", "getUid", "setUid", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.noticeboard.NoticeBoardItemRealm */
/* compiled from: NoticeBoardRealm.kt */
public class NoticeBoardItemRealm extends C5080h0 implements ReadableByUserModelRealm, C5069d1 {

    /* renamed from: c */
    public String f14153c;

    /* renamed from: e */
    public Date f14154e;

    /* renamed from: f */
    public Date f14155f;

    /* renamed from: g */
    public String f14156g;

    /* renamed from: h */
    public String f14157h;

    /* renamed from: i */
    public String f14158i;

    /* renamed from: j */
    public Boolean f14159j;

    public NoticeBoardItemRealm() {
        this(null, null, null, null, null, null, null, 127, null);
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
    }

    public /* synthetic */ NoticeBoardItemRealm(String str, Date date, Date date2, String str2, String str3, String str4, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str5 = (i & 1) != 0 ? null : str;
        this(str5, (i & 2) != 0 ? null : date, (i & 4) != 0 ? null : date2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : bool);
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
    }

    /* renamed from: C */
    public String mo13688C() {
        return this.f14157h;
    }

    /* renamed from: D0 */
    public Date mo13689D0() {
        return this.f14155f;
    }

    /* renamed from: G */
    public String mo13690G() {
        return this.f14156g;
    }

    /* renamed from: H1 */
    public Date mo13691H1() {
        return this.f14154e;
    }

    /* renamed from: a */
    public String mo13692a() {
        return this.f14158i;
    }

    /* renamed from: a */
    public void mo13693a(Boolean bool) {
        this.f14159j = bool;
    }

    /* renamed from: a */
    public void mo13694a(String str) {
        this.f14158i = str;
    }

    /* renamed from: b */
    public String mo13695b() {
        return this.f14153c;
    }

    /* renamed from: b */
    public void mo11372b(Boolean bool) {
        mo13693a(bool);
    }

    /* renamed from: b */
    public void mo13696b(String str) {
        this.f14153c = str;
    }

    /* renamed from: d */
    public String mo11376d() {
        return mo13695b();
    }

    /* renamed from: d2 */
    public final String mo13697d2() {
        return mo13690G();
    }

    /* renamed from: e2 */
    public final Date mo13698e2() {
        return mo13689D0();
    }

    /* renamed from: f */
    public Boolean mo13699f() {
        return this.f14159j;
    }

    /* renamed from: f2 */
    public final Date mo13700f2() {
        return mo13691H1();
    }

    /* renamed from: g2 */
    public String mo13701g2() {
        return mo13692a();
    }

    /* renamed from: h */
    public void mo13702h(Date date) {
        this.f14154e = date;
    }

    /* renamed from: h2 */
    public final String mo13703h2() {
        return mo13688C();
    }

    /* renamed from: m */
    public void mo13704m(Date date) {
        this.f14155f = date;
    }

    /* renamed from: o */
    public void mo13705o(String str) {
        this.f14156g = str;
    }

    /* renamed from: u */
    public Boolean mo11399u() {
        return mo13699f();
    }

    /* renamed from: u */
    public void mo13706u(String str) {
        this.f14157h = str;
    }

    public NoticeBoardItemRealm(String str, Date date, Date date2, String str2, String str3, String str4, Boolean bool) {
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
        mo13696b(str);
        mo13702h(date);
        mo13704m(date2);
        mo13705o(str2);
        mo13706u(str3);
        mo13694a(str4);
        mo13693a(bool);
    }
}
