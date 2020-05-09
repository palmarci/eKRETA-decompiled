package p289hu.ekreta.ellenorzo.profile;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p289hu.ekreta.ellenorzo.util.dao.ProfileSpecificModelRealm;
import p300k.p340c.C5078g1;
import p300k.p340c.C5080h0;
import p300k.p340c.p341m1.C5116n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\tR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\r¨\u0006\u0016"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/profile/GuardianRealm;", "Lio/realm/RealmObject;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificModelRealm;", "profileId", "", "uid", "name", "email", "phoneNumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "getName", "setName", "getPhoneNumber", "setPhoneNumber", "getProfileId", "setProfileId", "getUid", "setUid", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.profile.GuardianRealm */
/* compiled from: GuardianRealm.kt */
public class GuardianRealm extends C5080h0 implements ProfileSpecificModelRealm, C5078g1 {

    /* renamed from: c */
    public String f14460c;

    /* renamed from: e */
    public String f14461e;

    /* renamed from: f */
    public String f14462f;

    /* renamed from: g */
    public String f14463g;

    /* renamed from: h */
    public String f14464h;

    public GuardianRealm() {
        this(null, null, null, null, null, 31, null);
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
    }

    public /* synthetic */ GuardianRealm(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str6 = (i & 1) != 0 ? null : str;
        this(str6, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
    }

    /* renamed from: D0 */
    public void mo14022D0(String str) {
        this.f14463g = str;
    }

    /* renamed from: O */
    public void mo14023O(String str) {
        this.f14464h = str;
    }

    /* renamed from: a */
    public String mo14024a() {
        return this.f14460c;
    }

    /* renamed from: a */
    public void mo14025a(String str) {
        this.f14460c = str;
    }

    /* renamed from: b */
    public String mo14026b() {
        return this.f14461e;
    }

    /* renamed from: b */
    public void mo14027b(String str) {
        this.f14461e = str;
    }

    /* renamed from: b0 */
    public String mo14028b0() {
        return this.f14463g;
    }

    /* renamed from: d */
    public final String mo14029d() {
        return mo14026b();
    }

    /* renamed from: d */
    public void mo14030d(String str) {
        this.f14462f = str;
    }

    /* renamed from: d2 */
    public final String mo14031d2() {
        return mo14028b0();
    }

    /* renamed from: e2 */
    public final String mo14032e2() {
        return mo14035i();
    }

    /* renamed from: f2 */
    public final String mo14033f2() {
        return mo14036p0();
    }

    /* renamed from: g2 */
    public String mo14034g2() {
        return mo14024a();
    }

    /* renamed from: i */
    public String mo14035i() {
        return this.f14462f;
    }

    /* renamed from: p0 */
    public String mo14036p0() {
        return this.f14464h;
    }

    public GuardianRealm(String str, String str2, String str3, String str4, String str5) {
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
        mo14025a(str);
        mo14027b(str2);
        mo14030d(str3);
        mo14022D0(str4);
        mo14023O(str5);
    }
}
