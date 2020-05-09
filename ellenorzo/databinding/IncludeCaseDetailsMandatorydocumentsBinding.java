package p289hu.ekreta.ellenorzo.databinding;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import java.util.List;
import p289hu.ekreta.ellenorzo.attachment.Attachment;
import p289hu.ekreta.ellenorzo.attachment.AttachmentView;

/* renamed from: hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsMandatorydocumentsBinding */
public abstract class IncludeCaseDetailsMandatorydocumentsBinding extends ViewDataBinding {

    /* renamed from: A */
    public String f12452A;

    /* renamed from: B */
    public List<Attachment> f12453B;

    /* renamed from: z */
    public final AttachmentView f12454z;

    public IncludeCaseDetailsMandatorydocumentsBinding(Object obj, View view, int i, AttachmentView attachmentView) {
        super(obj, view, i);
        this.f12454z = attachmentView;
    }

    /* renamed from: b */
    public abstract void mo12428b(List<Attachment> list);

    /* renamed from: q */
    public abstract void mo12429q(String str);
}
