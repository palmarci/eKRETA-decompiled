package hu.ekreta.ellenorzo.cases.subModels;

import hu.ekreta.ellenorzo.rest.eadminapi.ApplicationDocumentTypeDto;
import hu.ekreta.ellenorzo.rest.eadminapi.ApplicationMandatoryDocumentDto;
import hu.ekreta.ellenorzo.rest.eadminapi.FileDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0002*\u00020\u0001¨\u0006\u0006"}, d2 = {"toApplicationMandatoryDocument", "Lhu/ekreta/ellenorzo/cases/subModels/ApplicationMandatoryDocument;", "Lhu/ekreta/ellenorzo/rest/eadminapi/ApplicationMandatoryDocumentDto;", "profileId", "", "toEAdminMandatoryDocument", "app_guardianProdRelease"}, k = 2, mv = {1, 1, 15})
/* compiled from: ApplicationMandatoryDocument.kt */
public final class ApplicationMandatoryDocumentKt {
    public static final ApplicationMandatoryDocument a(ApplicationMandatoryDocumentDto applicationMandatoryDocumentDto, String str) {
        File file;
        ApplicationDocumentType applicationDocumentType;
        String str2 = str;
        Intrinsics.checkParameterIsNotNull(applicationMandatoryDocumentDto, "$this$toApplicationMandatoryDocument");
        Intrinsics.checkParameterIsNotNull(str2, "profileId");
        Integer id = applicationMandatoryDocumentDto.getId();
        String fileName = applicationMandatoryDocumentDto.getFileName();
        String registrationNumber = applicationMandatoryDocumentDto.getRegistrationNumber();
        FileDto file2 = applicationMandatoryDocumentDto.getFile();
        if (file2 != null) {
            Intrinsics.checkParameterIsNotNull(file2, "$this$toFile");
            Intrinsics.checkParameterIsNotNull(str2, "profileId");
            file = new File(file2.getId(), file2.getTemporaryFileId(), str2);
        } else {
            file = null;
        }
        ApplicationDocumentTypeDto applicationDocumentType2 = applicationMandatoryDocumentDto.getApplicationDocumentType();
        if (applicationDocumentType2 != null) {
            Intrinsics.checkParameterIsNotNull(applicationDocumentType2, "$this$toApplicationDocumentType");
            Intrinsics.checkParameterIsNotNull(str2, "profileId");
            applicationDocumentType = new ApplicationDocumentType(applicationDocumentType2.getId(), applicationDocumentType2.getCode(), applicationDocumentType2.getShortName(), applicationDocumentType2.getName(), applicationDocumentType2.getDescription(), applicationDocumentType2.getDocumentTemplateName(), applicationDocumentType2.getDocumentTemplatePath(), str);
        } else {
            applicationDocumentType = null;
        }
        return new ApplicationMandatoryDocument(id, fileName, registrationNumber, file, applicationDocumentType, str);
    }
}
