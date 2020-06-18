package hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import h.l.f;
import hu.ekreta.ellenorzo.attachment.Attachment;
import hu.ekreta.ellenorzo.attachment.AttachmentView;
import hu.ekreta.ellenorzo.util.binding.BindingConverters;
import java.util.List;

public class IncludeCaseDetailsAttachmentsBindingImpl extends IncludeCaseDetailsAttachmentsBinding {
    public static final ViewDataBinding.f C = null;
    public static final SparseIntArray D = null;
    public long B = -1;

    public IncludeCaseDetailsAttachmentsBindingImpl(f fVar, View view) {
        super(fVar, view, 0, (AttachmentView) ViewDataBinding.a(fVar, view, 1, C, D)[0]);
        this.z.setTag((Object) null);
        a(view);
        a2();
    }

    public void V1() {
        long j2;
        synchronized (this) {
            j2 = this.B;
            this.B = 0;
        }
        List<Attachment> list = this.A;
        if ((j2 & 3) != 0) {
            this.z.setVisibility(BindingConverters.a((List<?>) list));
        }
    }

    public boolean Z1() {
        synchronized (this) {
            if (this.B != 0) {
                return true;
            }
            return false;
        }
    }

    public boolean a(int i2, Object obj, int i3) {
        return false;
    }

    public void a2() {
        synchronized (this) {
            this.B = 2;
        }
        b2();
    }

    public void b(List<Attachment> list) {
        this.A = list;
        synchronized (this) {
            this.B |= 1;
        }
        c(34);
        super.b2();
    }

    public boolean c(int i2, Object obj) {
        if (34 != i2) {
            return false;
        }
        b((List) obj);
        return true;
    }
}
