package hu.ekreta.ellenorzo.cases.subRealmModels;

import hu.ekreta.ellenorzo.cases.subModels.ApplicationDocumentType;
import hu.ekreta.ellenorzo.cases.subModels.ApplicationMandatoryDocument;
import hu.ekreta.ellenorzo.cases.subModels.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0001¨\u0006\u0006"}, d2 = {"toApplicationMandatoryDocument", "Lhu/ekreta/ellenorzo/cases/subModels/ApplicationMandatoryDocument;", "Lhu/ekreta/ellenorzo/cases/subRealmModels/ApplicationMandatoryDocumentRealm;", "toApplicationMandatoryDocumentRealm", "toAttachment", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "app_guardianProdRelease"}, k = 2, mv = {1, 1, 15})
/* compiled from: ApplicationMandatoryDocumentRealm.kt */
public final class ApplicationMandatoryDocumentRealmKt {
    public static final ApplicationMandatoryDocument a(ApplicationMandatoryDocumentRealm applicationMandatoryDocumentRealm) {
        File file;
        Intrinsics.checkParameterIsNotNull(applicationMandatoryDocumentRealm, "$this$toApplicationMandatoryDocument");
        Integer h2 = applicationMandatoryDocumentRealm.h2();
        if (h2 == null) {
            Intrinsics.throwNpe();
        }
        String g2 = applicationMandatoryDocumentRealm.g2();
        if (g2 == null) {
            Intrinsics.throwNpe();
        }
        String j2 = applicationMandatoryDocumentRealm.j2();
        if (j2 == null) {
            Intrinsics.throwNpe();
        }
        FileRealm f2 = applicationMandatoryDocumentRealm.f2();
        ApplicationDocumentType applicationDocumentType = null;
        if (f2 != null) {
            Intrinsics.checkParameterIsNotNull(f2, "$this$toFile");
            Integer e2 = f2.e2();
            if (e2 == null) {
                Intrinsics.throwNpe();
            }
            String g22 = f2.g2();
            if (g22 == null) {
                Intrinsics.throwNpe();
            }
            String f22 = f2.f2();
            if (f22 == null) {
                Intrinsics.throwNpe();
            }
            file = new File(e2, g22, f22);
        } else {
            file = null;
        }
        ApplicationDocumentTypeRealm e22 = applicationMandatoryDocumentRealm.e2();
        if (e22 != null) {
            Intrinsics.checkParameterIsNotNull(e22, "$this$toApplicationDocumentType");
            Integer i2 = e22.i2();
            String e23 = e22.e2();
            String l2 = e22.l2();
            String j22 = e22.j2();
            String f23 = e22.f2();
            String g23 = e22.g2();
            String h22 = e22.h2();
            String k2 = e22.k2();
            if (k2 == null) {
                Intrinsics.throwNpe();
            }
            applicationDocumentType = new ApplicationDocumentType(i2, e23, l2, j22, f23, g23, h22, k2);
        }
        String i22 = applicationMandatoryDocumentRealm.i2();
        if (i22 == null) {
            Intrinsics.throwNpe();
        }
        return new ApplicationMandatoryDocument(h2, g2, j2, file, applicationDocumentType, i22);
    }
}
