package p289hu.ekreta.ellenorzo.timetable;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.util.dao.ProfileSpecificModelRealm;
import p300k.p340c.C5080h0;
import p300k.p340c.C5093k1;
import p300k.p340c.p341m1.C5116n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/timetable/TimeTableDayRealm;", "Lio/realm/RealmObject;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificModelRealm;", "id", "", "date", "Ljava/util/Date;", "hasLessons", "", "profileId", "(Ljava/lang/String;Ljava/util/Date;ZLjava/lang/String;)V", "getDate", "()Ljava/util/Date;", "setDate", "(Ljava/util/Date;)V", "getHasLessons", "()Z", "setHasLessons", "(Z)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getProfileId", "setProfileId", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.timetable.TimeTableDayRealm */
/* compiled from: TimeTableDayRealm.kt */
public class TimeTableDayRealm extends C5080h0 implements ProfileSpecificModelRealm, C5093k1 {

    /* renamed from: c */
    public String f15096c;

    /* renamed from: e */
    public Date f15097e;

    /* renamed from: f */
    public boolean f15098f;

    /* renamed from: g */
    public String f15099g;

    public TimeTableDayRealm() {
        this(null, null, false, null, 15, null);
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
    }

    public /* synthetic */ TimeTableDayRealm(String str, Date date, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            date = null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        this(str, date, z, str2);
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
    }

    /* renamed from: O0 */
    public boolean mo15973O0() {
        return this.f15098f;
    }

    /* renamed from: a */
    public String mo15974a() {
        return this.f15099g;
    }

    /* renamed from: a */
    public void mo15975a(String str) {
        this.f15099g = str;
    }

    /* renamed from: a */
    public void mo15976a(Date date) {
        this.f15097e = date;
    }

    /* renamed from: c */
    public Date mo15977c() {
        return this.f15097e;
    }

    /* renamed from: d2 */
    public final Date mo15978d2() {
        return mo15977c();
    }

    /* renamed from: e */
    public String mo15979e() {
        return this.f15096c;
    }

    /* renamed from: e */
    public void mo15980e(boolean z) {
        this.f15098f = z;
    }

    /* renamed from: e2 */
    public final boolean mo15981e2() {
        return mo15973O0();
    }

    /* renamed from: f2 */
    public String mo15982f2() {
        return mo15974a();
    }

    /* renamed from: x */
    public void mo15983x(String str) {
        this.f15096c = str;
    }

    public TimeTableDayRealm(String str, Date date, boolean z, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
        mo15983x(str);
        mo15976a(date);
        mo15980e(z);
        mo15975a(str2);
    }
}
