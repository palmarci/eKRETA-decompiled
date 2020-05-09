package p289hu.ekreta.ellenorzo.attachment;

import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p289hu.ekreta.ellenorzo.attachment.AttachmentView.ViewHolder;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00060\u0001R\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo17463d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/attachment/AttachmentView$ViewHolder;", "Lhu/ekreta/ellenorzo/attachment/AttachmentView;", "parent", "Landroid/view/ViewGroup;", "<anonymous parameter 1>", "", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.attachment.AttachmentView$setRecyclerView$1 */
/* compiled from: AttachmentView.kt */
public final class AttachmentView$setRecyclerView$1 extends Lambda implements Function2<ViewGroup, Integer, ViewHolder> {

    /* renamed from: c */
    public final /* synthetic */ AttachmentView f11169c;

    /* renamed from: e */
    public final /* synthetic */ Function1 f11170e;

    /* renamed from: f */
    public final /* synthetic */ Function1 f11171f;

    public AttachmentView$setRecyclerView$1(AttachmentView attachmentView, Function1 function1, Function1 function12) {
        this.f11169c = attachmentView;
        this.f11170e = function1;
        this.f11171f = function12;
        super(2);
    }

    /* renamed from: a */
    public final ViewHolder mo11477a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        return new ViewHolder(this.f11169c, viewGroup, this.f11170e, this.f11171f);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj;
        ((Number) obj2).intValue();
        return mo11477a(viewGroup);
    }
}
