package hu.ekreta.ellenorzo.databinding;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import hu.ekreta.ellenorzo.attachment.Attachment;
import hu.ekreta.ellenorzo.attachment.AttachmentView;
import java.util.List;

public abstract class IncludeCaseDetailsAttachmentsBinding extends ViewDataBinding {
    public List<Attachment> A;
    public final AttachmentView z;

    public IncludeCaseDetailsAttachmentsBinding(Object obj, View view, int i2, AttachmentView attachmentView) {
        super(obj, view, i2);
        this.z = attachmentView;
    }

    public abstract void b(List<Attachment> list);
}
