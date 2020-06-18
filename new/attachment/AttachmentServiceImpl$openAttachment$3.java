package hu.ekreta.ellenorzo.attachment;

import android.content.Intent;
import h.m.d.d;
import hu.ekreta.ellenorzo.attachment.AttachmentService;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/content/Intent;", "intent", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: AttachmentServiceImpl.kt */
public final class AttachmentServiceImpl$openAttachment$3<T, R> implements h<T, R> {
    public final /* synthetic */ d c;

    public AttachmentServiceImpl$openAttachment$3(d dVar) {
        this.c = dVar;
    }

    /* renamed from: a */
    public final Intent apply(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        if (intent.resolveActivity(this.c.getPackageManager()) != null) {
            return intent;
        }
        throw new AttachmentService.NoApplicationToOpenTheAttachmentException();
    }
}
