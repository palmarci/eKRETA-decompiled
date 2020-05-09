package p289hu.ekreta.ellenorzo.attachment;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p211h.p262m.p263d.C3737d;
import p289hu.ekreta.ellenorzo.C4014R;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "intent", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.attachment.AttachmentServiceImpl$openAttachment$4 */
/* compiled from: AttachmentServiceImpl.kt */
public final class AttachmentServiceImpl$openAttachment$4<T, R> implements C4675h<T, R> {

    /* renamed from: c */
    public final /* synthetic */ C3737d f11150c;

    public AttachmentServiceImpl$openAttachment$4(C3737d dVar) {
        this.f11150c = dVar;
    }

    /* renamed from: a */
    public final Intent apply(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        return Intent.createChooser(intent, this.f11150c.getString(C4014R.string.PushNotification_Snackbar_Open));
    }
}
