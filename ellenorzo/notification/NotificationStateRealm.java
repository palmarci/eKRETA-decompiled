package p289hu.ekreta.ellenorzo.notification;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p289hu.ekreta.ellenorzo.util.dao.ProfileSpecificModelRealm;
import p300k.p340c.C5072e1;
import p300k.p340c.C5080h0;
import p300k.p340c.p341m1.C5116n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\tR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012¨\u0006\u0017"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/notification/NotificationStateRealm;", "Lio/realm/RealmObject;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificModelRealm;", "profileId", "", "notificationRole", "", "registrationId", "token", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getNotificationRole", "()Ljava/lang/Integer;", "setNotificationRole", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getProfileId", "()Ljava/lang/String;", "setProfileId", "(Ljava/lang/String;)V", "getRegistrationId", "setRegistrationId", "getToken", "setToken", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.notification.NotificationStateRealm */
/* compiled from: NotificationStateRealm.kt */
public class NotificationStateRealm extends C5080h0 implements ProfileSpecificModelRealm, C5072e1 {

    /* renamed from: c */
    public String f14257c;

    /* renamed from: e */
    public Integer f14258e;

    /* renamed from: f */
    public String f14259f;

    /* renamed from: g */
    public String f14260g;

    public NotificationStateRealm() {
        this(null, null, null, null, 15, null);
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
    }

    public /* synthetic */ NotificationStateRealm(String str, Integer num, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        this(str, num, str2, str3);
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
    }

    /* renamed from: C1 */
    public Integer mo13777C1() {
        return this.f14258e;
    }

    /* renamed from: H */
    public void mo13778H(String str) {
        this.f14260g = str;
    }

    /* renamed from: a */
    public String mo13779a() {
        return this.f14257c;
    }

    /* renamed from: a */
    public void mo13780a(String str) {
        this.f14257c = str;
    }

    /* renamed from: d2 */
    public final Integer mo13781d2() {
        return mo13777C1();
    }

    /* renamed from: e2 */
    public String mo13782e2() {
        return mo13779a();
    }

    /* renamed from: f2 */
    public final String mo13783f2() {
        return mo13786k1();
    }

    /* renamed from: g2 */
    public final String mo13784g2() {
        return mo13787v0();
    }

    /* renamed from: h */
    public void mo13785h(Integer num) {
        this.f14258e = num;
    }

    /* renamed from: k1 */
    public String mo13786k1() {
        return this.f14259f;
    }

    /* renamed from: v0 */
    public String mo13787v0() {
        return this.f14260g;
    }

    /* renamed from: x0 */
    public void mo13788x0(String str) {
        this.f14259f = str;
    }

    public NotificationStateRealm(String str, Integer num, String str2, String str3) {
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
        mo13780a(str);
        mo13785h(num);
        mo13788x0(str2);
        mo13778H(str3);
    }
}
