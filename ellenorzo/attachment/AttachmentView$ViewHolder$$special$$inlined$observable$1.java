package p289hu.ekreta.ellenorzo.attachment;

import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.attachment.AttachmentView.ViewHolder;
import p289hu.ekreta.ellenorzo.attachment.AttachmentView.ViewHolder.WhenMappings;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, mo17463d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.attachment.AttachmentView$ViewHolder$$special$$inlined$observable$1 */
/* compiled from: Delegates.kt */
public final class AttachmentView$ViewHolder$$special$$inlined$observable$1 extends ObservableProperty<Attachment> {

    /* renamed from: c */
    public final /* synthetic */ ViewHolder f11168c;

    public AttachmentView$ViewHolder$$special$$inlined$observable$1(Object obj, Object obj2, ViewHolder viewHolder) {
        this.f11168c = viewHolder;
        super(obj2);
    }

    public void afterChange(KProperty<?> kProperty, Attachment attachment, Attachment attachment2) {
        int i;
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        Attachment attachment3 = attachment2;
        Attachment attachment4 = attachment;
        if (attachment3 != null) {
            this.f11168c.f11160w.setText(attachment3.mo11435h());
            ImageView access$getAttachmentDownloadStatus$p = this.f11168c.f11161x;
            int i2 = WhenMappings.f11167a[attachment3.mo11433f().ordinal()];
            if (i2 == 1) {
                i = C4014R.C4015drawable.ic_downloaded_image;
            } else if (i2 == 2) {
                i = C4014R.C4015drawable.ic_download_is_needed;
            } else if (i2 == 3) {
                i = C4014R.C4015drawable.ic_download_in_progress;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            access$getAttachmentDownloadStatus$p.setImageResource(i);
        }
    }
}
