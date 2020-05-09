package p289hu.ekreta.ellenorzo.attachment;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p211h.p262m.p263d.C3737d;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "", "chooser", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.attachment.AttachmentServiceImpl$openAttachment$5 */
/* compiled from: AttachmentServiceImpl.kt */
public final class AttachmentServiceImpl$openAttachment$5 extends Lambda implements Function1<Intent, Unit> {

    /* renamed from: c */
    public final /* synthetic */ C3737d f11151c;

    public AttachmentServiceImpl$openAttachment$5(C3737d dVar) {
        this.f11151c = dVar;
        super(1);
    }

    /* renamed from: a */
    public final void mo11467a(Intent intent) {
        this.f11151c.startActivity(intent);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo11467a((Intent) obj);
        return Unit.INSTANCE;
    }
}
