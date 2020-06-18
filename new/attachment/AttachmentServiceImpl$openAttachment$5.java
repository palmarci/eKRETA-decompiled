package hu.ekreta.ellenorzo.attachment;

import android.content.Intent;
import h.m.d.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "chooser", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: AttachmentServiceImpl.kt */
public final class AttachmentServiceImpl$openAttachment$5 extends Lambda implements Function1<Intent, Unit> {
    public final /* synthetic */ d c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AttachmentServiceImpl$openAttachment$5(d dVar) {
        super(1);
        this.c = dVar;
    }

    public final void a(Intent intent) {
        this.c.startActivity(intent);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Intent) obj);
        return Unit.INSTANCE;
    }
}
