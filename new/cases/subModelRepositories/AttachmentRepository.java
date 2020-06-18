package hu.ekreta.ellenorzo.cases.subModelRepositories;

import hu.ekreta.ellenorzo.cases.subModels.TemporaryFile;
import hu.ekreta.ellenorzo.profile.Profile;
import k.b.n;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH&¨\u0006\r"}, d2 = {"Lhu/ekreta/ellenorzo/cases/subModelRepositories/AttachmentRepository;", "", "uploadAttachment", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/cases/subModels/TemporaryFile;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "byteArray", "", "fileName", "", "purpose", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/AttachmentPurpose;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: AttachmentRepository.kt */
public interface AttachmentRepository {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    /* compiled from: AttachmentRepository.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ n uploadAttachment$default(AttachmentRepository attachmentRepository, Profile profile, byte[] bArr, String str, AttachmentPurpose attachmentPurpose, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 8) != 0) {
                    attachmentPurpose = null;
                }
                return attachmentRepository.a(profile, bArr, str, attachmentPurpose);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uploadAttachment");
        }
    }

    n<TemporaryFile> a(Profile profile, byte[] bArr, String str, AttachmentPurpose attachmentPurpose);
}
