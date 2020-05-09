package p289hu.ekreta.ellenorzo.cases.subRealmModels;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p289hu.ekreta.ellenorzo.util.dao.ProfileSpecificModelRealm;
import p300k.p340c.C5080h0;
import p300k.p340c.C5165u0;
import p300k.p340c.p341m1.C5116n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002BY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u000eR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0018\"\u0004\b!\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aR \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0018\"\u0004\b%\u0010\u001a¨\u0006&"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/subRealmModels/ApplicationMandatoryDocumentRealm;", "Lio/realm/RealmObject;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificModelRealm;", "uid", "", "id", "", "fileName", "registrationNumber", "file", "Lhu/ekreta/ellenorzo/cases/subRealmModels/FileRealm;", "applicationDocumentType", "Lhu/ekreta/ellenorzo/cases/subRealmModels/ApplicationDocumentTypeRealm;", "profileId", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/cases/subRealmModels/FileRealm;Lhu/ekreta/ellenorzo/cases/subRealmModels/ApplicationDocumentTypeRealm;Ljava/lang/String;)V", "getApplicationDocumentType", "()Lhu/ekreta/ellenorzo/cases/subRealmModels/ApplicationDocumentTypeRealm;", "setApplicationDocumentType", "(Lhu/ekreta/ellenorzo/cases/subRealmModels/ApplicationDocumentTypeRealm;)V", "getFile", "()Lhu/ekreta/ellenorzo/cases/subRealmModels/FileRealm;", "setFile", "(Lhu/ekreta/ellenorzo/cases/subRealmModels/FileRealm;)V", "getFileName", "()Ljava/lang/String;", "setFileName", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getProfileId", "setProfileId", "getRegistrationNumber", "setRegistrationNumber", "getUid", "setUid", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.subRealmModels.ApplicationMandatoryDocumentRealm */
/* compiled from: ApplicationMandatoryDocumentRealm.kt */
public class ApplicationMandatoryDocumentRealm extends C5080h0 implements ProfileSpecificModelRealm, C5165u0 {

    /* renamed from: c */
    public String f11658c;

    /* renamed from: e */
    public Integer f11659e;

    /* renamed from: f */
    public String f11660f;

    /* renamed from: g */
    public String f11661g;

    /* renamed from: h */
    public FileRealm f11662h;

    /* renamed from: i */
    public ApplicationDocumentTypeRealm f11663i;

    /* renamed from: j */
    public String f11664j;

    public ApplicationMandatoryDocumentRealm() {
        this(null, null, null, null, null, null, null, 127, null);
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
    }

    public /* synthetic */ ApplicationMandatoryDocumentRealm(String str, Integer num, String str2, String str3, FileRealm fileRealm, ApplicationDocumentTypeRealm applicationDocumentTypeRealm, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str5 = (i & 1) != 0 ? null : str;
        this(str5, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : fileRealm, (i & 32) != 0 ? null : applicationDocumentTypeRealm, (i & 64) != 0 ? null : str4);
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
    }

    /* renamed from: F */
    public String mo12074F() {
        return this.f11660f;
    }

    /* renamed from: a */
    public String mo12075a() {
        return this.f11664j;
    }

    /* renamed from: a */
    public void mo12076a(ApplicationDocumentTypeRealm applicationDocumentTypeRealm) {
        this.f11663i = applicationDocumentTypeRealm;
    }

    /* renamed from: a */
    public void mo12077a(FileRealm fileRealm) {
        this.f11662h = fileRealm;
    }

    /* renamed from: a */
    public void mo12078a(Integer num) {
        this.f11659e = num;
    }

    /* renamed from: a */
    public void mo12079a(String str) {
        this.f11664j = str;
    }

    /* renamed from: b */
    public String mo12080b() {
        return this.f11658c;
    }

    /* renamed from: b */
    public void mo12081b(String str) {
        this.f11658c = str;
    }

    /* renamed from: d2 */
    public final ApplicationDocumentTypeRealm mo12082d2() {
        return mo12092u0();
    }

    /* renamed from: e */
    public Integer mo12083e() {
        return this.f11659e;
    }

    /* renamed from: e2 */
    public final FileRealm mo12084e2() {
        return mo12088i0();
    }

    /* renamed from: f2 */
    public final String mo12085f2() {
        return mo12074F();
    }

    /* renamed from: g2 */
    public final Integer mo12086g2() {
        return mo12083e();
    }

    /* renamed from: h2 */
    public String mo12087h2() {
        return mo12075a();
    }

    /* renamed from: i0 */
    public FileRealm mo12088i0() {
        return this.f11662h;
    }

    /* renamed from: i2 */
    public final String mo12089i2() {
        return mo12093z();
    }

    /* renamed from: r */
    public void mo12090r(String str) {
        this.f11661g = str;
    }

    /* renamed from: s */
    public void mo12091s(String str) {
        this.f11660f = str;
    }

    /* renamed from: u0 */
    public ApplicationDocumentTypeRealm mo12092u0() {
        return this.f11663i;
    }

    /* renamed from: z */
    public String mo12093z() {
        return this.f11661g;
    }

    public ApplicationMandatoryDocumentRealm(String str, Integer num, String str2, String str3, FileRealm fileRealm, ApplicationDocumentTypeRealm applicationDocumentTypeRealm, String str4) {
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
        mo12081b(str);
        mo12078a(num);
        mo12091s(str2);
        mo12090r(str3);
        mo12077a(fileRealm);
        mo12076a(applicationDocumentTypeRealm);
        mo12079a(str4);
    }
}
