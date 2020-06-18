package hu.ekreta.ellenorzo.databinding;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import hu.ekreta.ellenorzo.attachment.Attachment;
import hu.ekreta.ellenorzo.attachment.AttachmentView;
import java.util.List;

public abstract class IncludeCaseDetailsMandatorydocumentsBinding extends ViewDataBinding {
    public String A;
    public List<Attachment> B;
    public final AttachmentView z;

    public IncludeCaseDetailsMandatorydocumentsBinding(Object obj, View view, int i2, AttachmentView attachmentView) {
        super(obj, view, i2);
        this.z = attachmentView;
    }

    public abstract void b(List<Attachment> list);

    public abstract void p(String str);
}
