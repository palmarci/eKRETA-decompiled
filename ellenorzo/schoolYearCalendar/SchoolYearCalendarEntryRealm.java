package p289hu.ekreta.ellenorzo.schoolYearCalendar;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.p349io.ConstantsKt;
import p289hu.ekreta.ellenorzo.util.dao.ProfileSpecificModelRealm;
import p300k.p340c.C5080h0;
import p300k.p340c.C5085i1;
import p300k.p340c.p341m1.C5116n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B}\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0015\"\u0004\b%\u0010\u0017R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0015\"\u0004\b'\u0010\u0017¨\u0006("}, mo17463d2 = {"Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntryRealm;", "Lio/realm/RealmObject;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificModelRealm;", "uid", "", "profileId", "date", "Ljava/util/Date;", "type", "typeDesc", "irregularDayType", "irregularDayTypeDesc", "weekType", "weekTypeDesc", "groupUid", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDate", "()Ljava/util/Date;", "setDate", "(Ljava/util/Date;)V", "getGroupUid", "()Ljava/lang/String;", "setGroupUid", "(Ljava/lang/String;)V", "getIrregularDayType", "setIrregularDayType", "getIrregularDayTypeDesc", "setIrregularDayTypeDesc", "getProfileId", "setProfileId", "getType", "setType", "getTypeDesc", "setTypeDesc", "getUid", "setUid", "getWeekType", "setWeekType", "getWeekTypeDesc", "setWeekTypeDesc", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarEntryRealm */
/* compiled from: SchoolYearCalendarEntryRealm.kt */
public class SchoolYearCalendarEntryRealm extends C5080h0 implements ProfileSpecificModelRealm, C5085i1 {

    /* renamed from: c */
    public String f14736c;

    /* renamed from: e */
    public String f14737e;

    /* renamed from: f */
    public Date f14738f;

    /* renamed from: g */
    public String f14739g;

    /* renamed from: h */
    public String f14740h;

    /* renamed from: i */
    public String f14741i;

    /* renamed from: j */
    public String f14742j;

    /* renamed from: k */
    public String f14743k;

    /* renamed from: l */
    public String f14744l;

    /* renamed from: m */
    public String f14745m;

    public SchoolYearCalendarEntryRealm() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
    }

    public /* synthetic */ SchoolYearCalendarEntryRealm(String str, String str2, Date date, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = i;
        String str10 = null;
        String str11 = (i2 & 1) != 0 ? null : str;
        String str12 = (i2 & 2) != 0 ? null : str2;
        Date date2 = (i2 & 4) != 0 ? null : date;
        String str13 = (i2 & 8) != 0 ? null : str3;
        String str14 = (i2 & 16) != 0 ? null : str4;
        String str15 = (i2 & 32) != 0 ? null : str5;
        String str16 = (i2 & 64) != 0 ? null : str6;
        String str17 = (i2 & 128) != 0 ? null : str7;
        String str18 = (i2 & 256) != 0 ? null : str8;
        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0) {
            str10 = str9;
        }
        this(str11, str12, date2, str13, str14, str15, str16, str17, str18, str10);
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
    }

    /* renamed from: E1 */
    public String mo15612E1() {
        return this.f14742j;
    }

    /* renamed from: G */
    public void mo15613G(String str) {
        this.f14741i = str;
    }

    /* renamed from: J */
    public String mo15614J() {
        return this.f14739g;
    }

    /* renamed from: P */
    public void mo15615P(String str) {
        this.f14744l = str;
    }

    /* renamed from: T */
    public String mo15616T() {
        return this.f14744l;
    }

    /* renamed from: T */
    public void mo15617T(String str) {
        this.f14743k = str;
    }

    /* renamed from: U0 */
    public String mo15618U0() {
        return this.f14743k;
    }

    /* renamed from: V1 */
    public String mo15619V1() {
        return this.f14740h;
    }

    /* renamed from: a */
    public String mo15620a() {
        return this.f14737e;
    }

    /* renamed from: a */
    public void mo15621a(String str) {
        this.f14737e = str;
    }

    /* renamed from: a */
    public void mo15622a(Date date) {
        this.f14738f = date;
    }

    /* renamed from: b */
    public String mo15623b() {
        return this.f14736c;
    }

    /* renamed from: b */
    public void mo15624b(String str) {
        this.f14736c = str;
    }

    /* renamed from: c */
    public Date mo15625c() {
        return this.f14738f;
    }

    /* renamed from: d */
    public final String mo15626d() {
        return mo15623b();
    }

    /* renamed from: d0 */
    public void mo15627d0(String str) {
        this.f14742j = str;
    }

    /* renamed from: d2 */
    public final Date mo15628d2() {
        return mo15625c();
    }

    /* renamed from: e */
    public void mo15629e(String str) {
        this.f14745m = str;
    }

    /* renamed from: e2 */
    public final String mo15630e2() {
        return mo15633h();
    }

    /* renamed from: f2 */
    public final String mo15631f2() {
        return mo15638k0();
    }

    /* renamed from: g2 */
    public final String mo15632g2() {
        return mo15612E1();
    }

    /* renamed from: h */
    public String mo15633h() {
        return this.f14745m;
    }

    /* renamed from: h2 */
    public String mo15634h2() {
        return mo15620a();
    }

    /* renamed from: i2 */
    public final String mo15635i2() {
        return mo15614J();
    }

    /* renamed from: j0 */
    public void mo15636j0(String str) {
        this.f14740h = str;
    }

    /* renamed from: j2 */
    public final String mo15637j2() {
        return mo15619V1();
    }

    /* renamed from: k0 */
    public String mo15638k0() {
        return this.f14741i;
    }

    /* renamed from: k2 */
    public final String mo15639k2() {
        return mo15618U0();
    }

    /* renamed from: l2 */
    public final String mo15640l2() {
        return mo15616T();
    }

    /* renamed from: n */
    public void mo15641n(String str) {
        this.f14739g = str;
    }

    public SchoolYearCalendarEntryRealm(String str, String str2, Date date, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
        mo15624b(str);
        mo15621a(str2);
        mo15622a(date);
        mo15641n(str3);
        mo15636j0(str4);
        mo15613G(str5);
        mo15627d0(str6);
        mo15617T(str7);
        mo15615P(str8);
        mo15629e(str9);
    }
}
