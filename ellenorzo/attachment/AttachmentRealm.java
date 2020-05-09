package p289hu.ekreta.ellenorzo.attachment;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p289hu.ekreta.ellenorzo.util.dao.ProfileSpecificModelRealm;
import p300k.p340c.C5080h0;
import p300k.p340c.C5145r0;
import p300k.p340c.p341m1.C5116n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\tR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000b\"\u0004\b\u0014\u0010\rR \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\r¨\u0006\u0017"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/attachment/AttachmentRealm;", "Lio/realm/RealmObject;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificModelRealm;", "uid", "", "id", "", "fileName", "profileId", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getFileName", "()Ljava/lang/String;", "setFileName", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getProfileId", "setProfileId", "getUid", "setUid", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.attachment.AttachmentRealm */
/* compiled from: AttachmentRealm.kt */
public class AttachmentRealm extends C5080h0 implements ProfileSpecificModelRealm, C5145r0 {

    /* renamed from: c */
    public String f11136c;

    /* renamed from: e */
    public Integer f11137e;

    /* renamed from: f */
    public String f11138f;

    /* renamed from: g */
    public String f11139g;

    public AttachmentRealm() {
        this(null, null, null, null, 15, null);
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
    }

    public /* synthetic */ AttachmentRealm(String str, Integer num, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
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

    /* renamed from: F */
    public String mo11443F() {
        return this.f11138f;
    }

    /* renamed from: a */
    public String mo11444a() {
        return this.f11139g;
    }

    /* renamed from: a */
    public void mo11445a(Integer num) {
        this.f11137e = num;
    }

    /* renamed from: a */
    public void mo11446a(String str) {
        this.f11139g = str;
    }

    /* renamed from: b */
    public String mo11447b() {
        return this.f11136c;
    }

    /* renamed from: b */
    public void mo11448b(String str) {
        this.f11136c = str;
    }

    /* renamed from: d2 */
    public final String mo11449d2() {
        return mo11443F();
    }

    /* renamed from: e */
    public Integer mo11450e() {
        return this.f11137e;
    }

    /* renamed from: e2 */
    public final Integer mo11451e2() {
        return mo11450e();
    }

    /* renamed from: f2 */
    public String mo11452f2() {
        return mo11444a();
    }

    /* renamed from: s */
    public void mo11453s(String str) {
        this.f11138f = str;
    }

    public AttachmentRealm(String str, Integer num, String str2, String str3) {
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
        mo11448b(str);
        mo11445a(num);
        mo11453s(str2);
        mo11446a(str3);
    }
}
