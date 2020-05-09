package p289hu.ekreta.ellenorzo.classmaster;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.util.dao.ProfileSpecificModelRealm;
import p300k.p340c.C5065d0;
import p300k.p340c.C5080h0;
import p300k.p340c.C5173w0;
import p300k.p340c.p341m1.C5116n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0017\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002Ba\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006#"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/classmaster/ClassMasterRealm;", "Lio/realm/RealmObject;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificModelRealm;", "profileId", "", "name", "emails", "Lio/realm/RealmList;", "phoneNumbers", "educationTypeDescription", "groupName", "typeCode", "", "(Ljava/lang/String;Ljava/lang/String;Lio/realm/RealmList;Lio/realm/RealmList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getEducationTypeDescription", "()Ljava/lang/String;", "setEducationTypeDescription", "(Ljava/lang/String;)V", "getEmails", "()Lio/realm/RealmList;", "setEmails", "(Lio/realm/RealmList;)V", "getGroupName", "setGroupName", "getName", "setName", "getPhoneNumbers", "setPhoneNumbers", "getProfileId", "setProfileId", "getTypeCode", "()Ljava/lang/Integer;", "setTypeCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.classmaster.ClassMasterRealm */
/* compiled from: ClassMasterRealm.kt */
public class ClassMasterRealm extends C5080h0 implements ProfileSpecificModelRealm, C5173w0 {

    /* renamed from: c */
    public String f11807c;

    /* renamed from: e */
    public String f11808e;

    /* renamed from: f */
    public C5065d0<String> f11809f;

    /* renamed from: g */
    public C5065d0<String> f11810g;

    /* renamed from: h */
    public String f11811h;

    /* renamed from: i */
    public String f11812i;

    /* renamed from: j */
    public Integer f11813j;

    public ClassMasterRealm() {
        this(null, null, null, null, null, null, null, 127, null);
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
    }

    public /* synthetic */ ClassMasterRealm(String str, String str2, C5065d0 d0Var, C5065d0 d0Var2, String str3, String str4, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str5 = (i & 1) != 0 ? null : str;
        String str6 = (i & 2) != 0 ? null : str2;
        if ((i & 4) != 0) {
            d0Var = new C5065d0();
        }
        C5065d0 d0Var3 = d0Var;
        if ((i & 8) != 0) {
            d0Var2 = new C5065d0();
        }
        this(str5, str6, d0Var3, d0Var2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : num);
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
    }

    /* renamed from: D */
    public String mo12236D() {
        return this.f11811h;
    }

    /* renamed from: M */
    public C5065d0 mo12237M() {
        return this.f11809f;
    }

    /* renamed from: a */
    public String mo12238a() {
        return this.f11807c;
    }

    /* renamed from: a */
    public void mo12239a(String str) {
        this.f11807c = str;
    }

    /* renamed from: a */
    public void mo12240a(C5065d0 d0Var) {
        this.f11810g = d0Var;
    }

    /* renamed from: d */
    public void mo12241d(String str) {
        this.f11808e = str;
    }

    /* renamed from: d2 */
    public final String mo12242d2() {
        return mo12236D();
    }

    /* renamed from: e */
    public void mo12243e(Integer num) {
        this.f11813j = num;
    }

    /* renamed from: e2 */
    public final C5065d0<String> mo12244e2() {
        return mo12237M();
    }

    /* renamed from: f */
    public void mo12245f(C5065d0 d0Var) {
        this.f11809f = d0Var;
    }

    /* renamed from: f2 */
    public final String mo12246f2() {
        return mo12253n0();
    }

    /* renamed from: g2 */
    public final String mo12247g2() {
        return mo12249i();
    }

    /* renamed from: h2 */
    public final C5065d0<String> mo12248h2() {
        return mo12255s0();
    }

    /* renamed from: i */
    public String mo12249i() {
        return this.f11808e;
    }

    /* renamed from: i2 */
    public String mo12250i2() {
        return mo12238a();
    }

    /* renamed from: j2 */
    public final Integer mo12251j2() {
        return mo12252l();
    }

    /* renamed from: l */
    public Integer mo12252l() {
        return this.f11813j;
    }

    /* renamed from: n0 */
    public String mo12253n0() {
        return this.f11812i;
    }

    /* renamed from: o0 */
    public void mo12254o0(String str) {
        this.f11812i = str;
    }

    /* renamed from: s0 */
    public C5065d0 mo12255s0() {
        return this.f11810g;
    }

    /* renamed from: w */
    public void mo12256w(String str) {
        this.f11811h = str;
    }

    public ClassMasterRealm(String str, String str2, C5065d0<String> d0Var, C5065d0<String> d0Var2, String str3, String str4, Integer num) {
        Intrinsics.checkParameterIsNotNull(d0Var, "emails");
        Intrinsics.checkParameterIsNotNull(d0Var2, "phoneNumbers");
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
        mo12239a(str);
        mo12241d(str2);
        mo12245f(d0Var);
        mo12240a((C5065d0) d0Var2);
        mo12256w(str3);
        mo12254o0(str4);
        mo12243e(num);
    }
}
