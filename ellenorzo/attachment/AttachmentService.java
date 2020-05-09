package p289hu.ekreta.ellenorzo.attachment;

import android.net.Uri;
import java.io.File;
import kotlin.Metadata;
import p211h.p262m.p263d.C3737d;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.util.exception.MessageThrowable;
import p300k.p313b.C5027n;
import p300k.p313b.C5036u;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0002\u0013\u0014J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH&J&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH&J\u001e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H&¨\u0006\u0015"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/attachment/AttachmentService;", "", "chooseLocalFile", "Lio/reactivex/Single;", "Landroid/net/Uri;", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "download", "Lio/reactivex/Observable;", "Ljava/io/File;", "attachment", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "url", "", "accessToken", "toFileName", "openAttachment", "", "fileSource", "NoApplicationToOpenTheAttachmentException", "PermissionDeniedException", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.attachment.AttachmentService */
/* compiled from: AttachmentService.kt */
public interface AttachmentService {

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/attachment/AttachmentService$NoApplicationToOpenTheAttachmentException;", "Lhu/ekreta/ellenorzo/util/exception/MessageThrowable;", "()V", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.attachment.AttachmentService$NoApplicationToOpenTheAttachmentException */
    /* compiled from: AttachmentService.kt */
    public static final class NoApplicationToOpenTheAttachmentException extends MessageThrowable {
        public NoApplicationToOpenTheAttachmentException() {
            super(C4014R.string.no_application_for_mimetype_message);
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/attachment/AttachmentService$PermissionDeniedException;", "Lhu/ekreta/ellenorzo/util/exception/MessageThrowable;", "()V", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.attachment.AttachmentService$PermissionDeniedException */
    /* compiled from: AttachmentService.kt */
    public static final class PermissionDeniedException extends MessageThrowable {
        public PermissionDeniedException() {
            super(C4014R.string.write_external_storage_permission_denied_message);
        }
    }

    /* renamed from: a */
    C5027n<File> mo11454a(Attachment attachment, String str, String str2);

    /* renamed from: a */
    C5027n<File> mo11455a(String str, String str2, String str3);

    /* renamed from: a */
    C5036u<Uri> mo11456a(C3737d dVar);

    /* renamed from: a */
    void mo11457a(C3737d dVar, C5036u<File> uVar);
}
