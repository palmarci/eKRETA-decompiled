package hu.ekreta.ellenorzo.attachment;

import h.p.r;
import hu.ekreta.ellenorzo.authentication.AuthenticatedViewModel;
import hu.ekreta.ellenorzo.cases.subModelRepositories.AttachmentPurpose;
import hu.ekreta.ellenorzo.cases.subModelRepositories.AttachmentRepository;
import hu.ekreta.ellenorzo.cases.subModels.TemporaryFile;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import java.io.File;
import java.util.List;
import k.b.h0.d;
import k.b.n;
import k.b.z.a.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aP\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e\u001a4\u0010\u0011\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e\u001a>\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000f*\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d¨\u0006\u001e"}, d2 = {"downloadAndOpenAttachment", "", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedViewModel;", "attachmentService", "Lhu/ekreta/ellenorzo/attachment/AttachmentService;", "progress", "Lio/reactivex/subjects/Subject;", "", "attachments", "Landroidx/lifecycle/MutableLiveData;", "", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "attachment", "download", "Lkotlin/Function0;", "Lio/reactivex/Observable;", "Ljava/io/File;", "downloadAndOpenFile", "uploadAttachment", "Lhu/ekreta/ellenorzo/cases/subModels/TemporaryFile;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "fileName", "", "fileInByteArray", "", "attachmentRepository", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/AttachmentRepository;", "purpose", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/AttachmentPurpose;", "app_guardianProdRelease"}, k = 2, mv = {1, 1, 15})
/* compiled from: ViewModelExtensions.kt */
public final class ViewModelExtensionsKt {
    public static final void a(AuthenticatedViewModel authenticatedViewModel, AttachmentService attachmentService, d<Boolean> dVar, Function0<? extends n<File>> function0) {
        Intrinsics.checkParameterIsNotNull(authenticatedViewModel, "$this$downloadAndOpenFile");
        Intrinsics.checkParameterIsNotNull(attachmentService, "attachmentService");
        Intrinsics.checkParameterIsNotNull(dVar, "progress");
        Intrinsics.checkParameterIsNotNull(function0, "download");
        authenticatedViewModel.a((Function1<? super h.m.d.d, Unit>) new ViewModelExtensionsKt$downloadAndOpenFile$1(authenticatedViewModel, attachmentService, function0, dVar));
    }

    public static /* synthetic */ n uploadAttachment$default(AuthenticatedViewModel authenticatedViewModel, Profile profile, String str, byte[] bArr, AttachmentRepository attachmentRepository, AttachmentPurpose attachmentPurpose, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            attachmentPurpose = null;
        }
        return a(authenticatedViewModel, profile, str, bArr, attachmentRepository, attachmentPurpose);
    }

    public static final void a(AuthenticatedViewModel authenticatedViewModel, AttachmentService attachmentService, d<Boolean> dVar, r<List<Attachment>> rVar, Attachment attachment, Function0<? extends n<File>> function0) {
        Intrinsics.checkParameterIsNotNull(authenticatedViewModel, "$this$downloadAndOpenAttachment");
        Intrinsics.checkParameterIsNotNull(attachmentService, "attachmentService");
        Intrinsics.checkParameterIsNotNull(dVar, "progress");
        Intrinsics.checkParameterIsNotNull(rVar, "attachments");
        Intrinsics.checkParameterIsNotNull(attachment, "attachment");
        Intrinsics.checkParameterIsNotNull(function0, "download");
        authenticatedViewModel.a((Function1<? super h.m.d.d, Unit>) new ViewModelExtensionsKt$downloadAndOpenAttachment$1(authenticatedViewModel, attachmentService, function0, rVar, attachment, dVar));
    }

    public static final n<TemporaryFile> a(AuthenticatedViewModel authenticatedViewModel, Profile profile, String str, byte[] bArr, AttachmentRepository attachmentRepository, AttachmentPurpose attachmentPurpose) {
        Intrinsics.checkParameterIsNotNull(authenticatedViewModel, "$this$uploadAttachment");
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        Intrinsics.checkParameterIsNotNull(str, "fileName");
        Intrinsics.checkParameterIsNotNull(attachmentRepository, "attachmentRepository");
        n<TemporaryFile> j2 = attachmentRepository.a(profile, bArr, str, attachmentPurpose).a(a.a()).j(new ViewModelExtensionsKt$uploadAttachment$1(authenticatedViewModel));
        Intrinsics.checkExpressionValueIsNotNull(j2, "attachmentRepository\n   …}\n            }\n        }");
        return j2;
    }
}
