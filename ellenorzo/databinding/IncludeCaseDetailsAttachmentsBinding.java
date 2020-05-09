package p289hu.ekreta.ellenorzo.databinding;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import java.util.List;
import p289hu.ekreta.ellenorzo.attachment.Attachment;
import p289hu.ekreta.ellenorzo.attachment.AttachmentView;

/* renamed from: hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAttachmentsBinding */
public abstract class IncludeCaseDetailsAttachmentsBinding extends ViewDataBinding {

    /* renamed from: A */
    public List<Attachment> f12447A;

    /* renamed from: z */
    public final AttachmentView f12448z;

    public IncludeCaseDetailsAttachmentsBinding(Object obj, View view, int i, AttachmentView attachmentView) {
        super(obj, view, i);
        this.f12448z = attachmentView;
    }

    /* renamed from: b */
    public abstract void mo12427b(List<Attachment> list);
}
