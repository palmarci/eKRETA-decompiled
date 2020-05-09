package p289hu.ekreta.ellenorzo.cases.subRealmModels;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.cases.subModels.ApplicationDocumentType;
import p289hu.ekreta.ellenorzo.cases.subModels.ApplicationMandatoryDocument;
import p289hu.ekreta.ellenorzo.cases.subModels.File;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0001¨\u0006\u0006"}, mo17463d2 = {"toApplicationMandatoryDocument", "Lhu/ekreta/ellenorzo/cases/subModels/ApplicationMandatoryDocument;", "Lhu/ekreta/ellenorzo/cases/subRealmModels/ApplicationMandatoryDocumentRealm;", "toApplicationMandatoryDocumentRealm", "toAttachment", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "app_studentProdRelease"}, mo17464k = 2, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.subRealmModels.ApplicationMandatoryDocumentRealmKt */
/* compiled from: ApplicationMandatoryDocumentRealm.kt */
public final class ApplicationMandatoryDocumentRealmKt {
    /* renamed from: a */
    public static final ApplicationMandatoryDocument m11168a(ApplicationMandatoryDocumentRealm applicationMandatoryDocumentRealm) {
        File file;
        Intrinsics.checkParameterIsNotNull(applicationMandatoryDocumentRealm, "$this$toApplicationMandatoryDocument");
        Integer g2 = applicationMandatoryDocumentRealm.mo12086g2();
        if (g2 == null) {
            Intrinsics.throwNpe();
        }
        String f2 = applicationMandatoryDocumentRealm.mo12085f2();
        if (f2 == null) {
            Intrinsics.throwNpe();
        }
        String i2 = applicationMandatoryDocumentRealm.mo12089i2();
        if (i2 == null) {
            Intrinsics.throwNpe();
        }
        FileRealm e2 = applicationMandatoryDocumentRealm.mo12084e2();
        ApplicationDocumentType applicationDocumentType = null;
        if (e2 != null) {
            Intrinsics.checkParameterIsNotNull(e2, "$this$toFile");
            Integer d2 = e2.mo12100d2();
            if (d2 == null) {
                Intrinsics.throwNpe();
            }
            String f22 = e2.mo12103f2();
            if (f22 == null) {
                Intrinsics.throwNpe();
            }
            String e22 = e2.mo12102e2();
            if (e22 == null) {
                Intrinsics.throwNpe();
            }
            file = new File(d2, f22, e22);
        } else {
            file = null;
        }
        ApplicationDocumentTypeRealm d22 = applicationMandatoryDocumentRealm.mo12082d2();
        if (d22 != null) {
            Intrinsics.checkParameterIsNotNull(d22, "$this$toApplicationDocumentType");
            Integer h2 = d22.mo12065h2();
            String d23 = d22.mo12059d2();
            String k2 = d22.mo12069k2();
            String i22 = d22.mo12067i2();
            String e23 = d22.mo12061e2();
            String f23 = d22.mo12063f2();
            String g22 = d22.mo12064g2();
            String j2 = d22.mo12068j2();
            if (j2 == null) {
                Intrinsics.throwNpe();
            }
            applicationDocumentType = new ApplicationDocumentType(h2, d23, k2, i22, e23, f23, g22, j2);
        }
        String h22 = applicationMandatoryDocumentRealm.mo12087h2();
        if (h22 == null) {
            Intrinsics.throwNpe();
        }
        ApplicationMandatoryDocument applicationMandatoryDocument = new ApplicationMandatoryDocument(g2, f2, i2, file, applicationDocumentType, h22);
        return applicationMandatoryDocument;
    }
}
