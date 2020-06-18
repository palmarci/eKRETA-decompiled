package hu.ekreta.ellenorzo.attachment;

import android.view.ViewGroup;
import hu.ekreta.ellenorzo.attachment.AttachmentView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00060\u0001R\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/attachment/AttachmentView$ViewHolder;", "Lhu/ekreta/ellenorzo/attachment/AttachmentView;", "parent", "Landroid/view/ViewGroup;", "<anonymous parameter 1>", "", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: AttachmentView.kt */
public final class AttachmentView$setRecyclerView$1 extends Lambda implements Function2<ViewGroup, Integer, AttachmentView.ViewHolder> {
    public final /* synthetic */ AttachmentView c;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ Function1 f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AttachmentView$setRecyclerView$1(AttachmentView attachmentView, Function1 function1, Function1 function12) {
        super(2);
        this.c = attachmentView;
        this.e = function1;
        this.f = function12;
    }

    public final AttachmentView.ViewHolder a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        return new AttachmentView.ViewHolder(this.c, viewGroup, this.e, this.f);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        return a((ViewGroup) obj);
    }
}
