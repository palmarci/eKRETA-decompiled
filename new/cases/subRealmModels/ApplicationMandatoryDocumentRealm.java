package hu.ekreta.ellenorzo.cases.subRealmModels;

import hu.ekreta.ellenorzo.util.dao.ProfileSpecificModelRealm;
import k.c.h0;
import k.c.m1.n;
import k.c.u0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002BY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u000eR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0018\"\u0004\b!\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aR \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0018\"\u0004\b%\u0010\u001a¨\u0006&"}, d2 = {"Lhu/ekreta/ellenorzo/cases/subRealmModels/ApplicationMandatoryDocumentRealm;", "Lio/realm/RealmObject;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificModelRealm;", "uid", "", "id", "", "fileName", "registrationNumber", "file", "Lhu/ekreta/ellenorzo/cases/subRealmModels/FileRealm;", "applicationDocumentType", "Lhu/ekreta/ellenorzo/cases/subRealmModels/ApplicationDocumentTypeRealm;", "profileId", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/cases/subRealmModels/FileRealm;Lhu/ekreta/ellenorzo/cases/subRealmModels/ApplicationDocumentTypeRealm;Ljava/lang/String;)V", "getApplicationDocumentType", "()Lhu/ekreta/ellenorzo/cases/subRealmModels/ApplicationDocumentTypeRealm;", "setApplicationDocumentType", "(Lhu/ekreta/ellenorzo/cases/subRealmModels/ApplicationDocumentTypeRealm;)V", "getFile", "()Lhu/ekreta/ellenorzo/cases/subRealmModels/FileRealm;", "setFile", "(Lhu/ekreta/ellenorzo/cases/subRealmModels/FileRealm;)V", "getFileName", "()Ljava/lang/String;", "setFileName", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getProfileId", "setProfileId", "getRegistrationNumber", "setRegistrationNumber", "getUid", "setUid", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: ApplicationMandatoryDocumentRealm.kt */
public class ApplicationMandatoryDocumentRealm extends h0 implements ProfileSpecificModelRealm, u0 {
    public String c;
    public Integer e;
    public String f;

    /* renamed from: g  reason: collision with root package name */
    public String f5234g;

    /* renamed from: h  reason: collision with root package name */
    public FileRealm f5235h;

    /* renamed from: i  reason: collision with root package name */
    public ApplicationDocumentTypeRealm f5236i;

    /* renamed from: j  reason: collision with root package name */
    public String f5237j;

    public ApplicationMandatoryDocumentRealm() {
        this((String) null, (Integer) null, (String) null, (String) null, (FileRealm) null, (ApplicationDocumentTypeRealm) null, (String) null, 127, (DefaultConstructorMarker) null);
        if (this instanceof n) {
            ((n) this).K();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ApplicationMandatoryDocumentRealm(java.lang.String r7, java.lang.Integer r8, java.lang.String r9, java.lang.String r10, hu.ekreta.ellenorzo.cases.subRealmModels.FileRealm r11, hu.ekreta.ellenorzo.cases.subRealmModels.ApplicationDocumentTypeRealm r12, java.lang.String r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r6 = this;
            r15 = r14 & 1
            r0 = 0
            if (r15 == 0) goto L_0x0007
            r15 = r0
            goto L_0x0008
        L_0x0007:
            r15 = r7
        L_0x0008:
            r7 = r14 & 2
            if (r7 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r8
        L_0x000f:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r9
        L_0x0016:
            r7 = r14 & 8
            if (r7 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r10
        L_0x001d:
            r7 = r14 & 16
            if (r7 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r11
        L_0x0024:
            r7 = r14 & 32
            if (r7 == 0) goto L_0x002a
            r5 = r0
            goto L_0x002b
        L_0x002a:
            r5 = r12
        L_0x002b:
            r7 = r14 & 64
            if (r7 == 0) goto L_0x0031
            r14 = r0
            goto L_0x0032
        L_0x0031:
            r14 = r13
        L_0x0032:
            r7 = r6
            r8 = r15
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r4
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            boolean r7 = r6 instanceof k.c.m1.n
            if (r7 == 0) goto L_0x0046
            r7 = r6
            k.c.m1.n r7 = (k.c.m1.n) r7
            r7.K()
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.cases.subRealmModels.ApplicationMandatoryDocumentRealm.<init>(java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, hu.ekreta.ellenorzo.cases.subRealmModels.FileRealm, hu.ekreta.ellenorzo.cases.subRealmModels.ApplicationDocumentTypeRealm, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public String F() {
        return this.f;
    }

    public String a() {
        return this.f5237j;
    }

    public void a(ApplicationDocumentTypeRealm applicationDocumentTypeRealm) {
        this.f5236i = applicationDocumentTypeRealm;
    }

    public void a(FileRealm fileRealm) {
        this.f5235h = fileRealm;
    }

    public void a(Integer num) {
        this.e = num;
    }

    public void a(String str) {
        this.f5237j = str;
    }

    public String b() {
        return this.c;
    }

    public void b(String str) {
        this.c = str;
    }

    public Integer e() {
        return this.e;
    }

    public final ApplicationDocumentTypeRealm e2() {
        return u0();
    }

    public final FileRealm f2() {
        return i0();
    }

    public final String g2() {
        return F();
    }

    public final Integer h2() {
        return e();
    }

    public FileRealm i0() {
        return this.f5235h;
    }

    public String i2() {
        return a();
    }

    public final String j2() {
        return z();
    }

    public void r(String str) {
        this.f5234g = str;
    }

    public void s(String str) {
        this.f = str;
    }

    public ApplicationDocumentTypeRealm u0() {
        return this.f5236i;
    }

    public String z() {
        return this.f5234g;
    }

    public ApplicationMandatoryDocumentRealm(String str, Integer num, String str2, String str3, FileRealm fileRealm, ApplicationDocumentTypeRealm applicationDocumentTypeRealm, String str4) {
        if (this instanceof n) {
            ((n) this).K();
        }
        b(str);
        a(num);
        s(str2);
        r(str3);
        a(fileRealm);
        a(applicationDocumentTypeRealm);
        a(str4);
    }
}
