package hu.ekreta.ellenorzo.attachment;

import android.widget.ImageView;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.attachment.AttachmentView;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
/* compiled from: Delegates.kt */
public final class AttachmentView$ViewHolder$$special$$inlined$observable$1 extends ObservableProperty<Attachment> {
    public final /* synthetic */ AttachmentView.ViewHolder c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AttachmentView$ViewHolder$$special$$inlined$observable$1(Object obj, Object obj2, AttachmentView.ViewHolder viewHolder) {
        super(obj2);
        this.c = viewHolder;
    }

    public void afterChange(KProperty<?> kProperty, Attachment attachment, Attachment attachment2) {
        int i2;
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        Attachment attachment3 = attachment2;
        Attachment attachment4 = attachment;
        if (attachment3 != null) {
            this.c.w.setText(attachment3.i());
            ImageView access$getAttachmentDownloadStatus$p = this.c.x;
            int i3 = AttachmentView.ViewHolder.WhenMappings.f5046a[attachment3.f().ordinal()];
            if (i3 == 1) {
                i2 = R.drawable.ic_downloaded_24dp;
            } else if (i3 == 2) {
                i2 = R.drawable.ic_download_is_needed_24dp;
            } else if (i3 == 3) {
                i2 = R.drawable.ic_download_in_progress_24dp;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            access$getAttachmentDownloadStatus$p.setImageResource(i2);
        }
    }
}
