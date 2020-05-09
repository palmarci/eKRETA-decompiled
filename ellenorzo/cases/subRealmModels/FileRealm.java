package p289hu.ekreta.ellenorzo.cases.subRealmModels;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p289hu.ekreta.ellenorzo.util.dao.ProfileSpecificModelRealm;
import p300k.p340c.C5080h0;
import p300k.p340c.C5169v0;
import p300k.p340c.p341m1.C5116n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\tR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012¨\u0006\u0017"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/subRealmModels/FileRealm;", "Lio/realm/RealmObject;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificModelRealm;", "uid", "", "id", "", "temporaryFileId", "profileId", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getProfileId", "()Ljava/lang/String;", "setProfileId", "(Ljava/lang/String;)V", "getTemporaryFileId", "setTemporaryFileId", "getUid", "setUid", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.subRealmModels.FileRealm */
/* compiled from: FileRealm.kt */
public class FileRealm extends C5080h0 implements ProfileSpecificModelRealm, C5169v0 {

    /* renamed from: c */
    public String f11665c;

    /* renamed from: e */
    public Integer f11666e;

    /* renamed from: f */
    public String f11667f;

    /* renamed from: g */
    public String f11668g;

    public FileRealm() {
        this(null, null, null, null, 15, null);
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
    }

    public /* synthetic */ FileRealm(String str, Integer num, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
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

    /* renamed from: V0 */
    public void mo12094V0(String str) {
        this.f11667f = str;
    }

    /* renamed from: a */
    public String mo12095a() {
        return this.f11668g;
    }

    /* renamed from: a */
    public void mo12096a(Integer num) {
        this.f11666e = num;
    }

    /* renamed from: a */
    public void mo12097a(String str) {
        this.f11668g = str;
    }

    /* renamed from: b */
    public String mo12098b() {
        return this.f11665c;
    }

    /* renamed from: b */
    public void mo12099b(String str) {
        this.f11665c = str;
    }

    /* renamed from: d2 */
    public final Integer mo12100d2() {
        return mo12101e();
    }

    /* renamed from: e */
    public Integer mo12101e() {
        return this.f11666e;
    }

    /* renamed from: e2 */
    public String mo12102e2() {
        return mo12095a();
    }

    /* renamed from: f2 */
    public final String mo12103f2() {
        return mo12104l1();
    }

    /* renamed from: l1 */
    public String mo12104l1() {
        return this.f11667f;
    }

    public FileRealm(String str, Integer num, String str2, String str3) {
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
        mo12099b(str);
        mo12096a(num);
        mo12094V0(str2);
        mo12097a(str3);
    }
}
