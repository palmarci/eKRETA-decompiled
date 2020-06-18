package hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import h.l.f;
import hu.ekreta.ellenorzo.attachment.Attachment;
import hu.ekreta.ellenorzo.attachment.AttachmentView;
import hu.ekreta.ellenorzo.util.binding.BindingConverters;
import java.util.List;

public class IncludeCaseDetailsMandatorydocumentsBindingImpl extends IncludeCaseDetailsMandatorydocumentsBinding {
    public static final ViewDataBinding.f D = null;
    public static final SparseIntArray E = null;
    public long C = -1;

    public IncludeCaseDetailsMandatorydocumentsBindingImpl(f fVar, View view) {
        super(fVar, view, 0, (AttachmentView) ViewDataBinding.a(fVar, view, 1, D, E)[0]);
        this.z.setTag((Object) null);
        a(view);
        a2();
    }

    public void V1() {
        long j2;
        synchronized (this) {
            j2 = this.C;
            this.C = 0;
        }
        String str = this.A;
        List<Attachment> list = this.B;
        int i2 = ((5 & j2) > 0 ? 1 : ((5 & j2) == 0 ? 0 : -1));
        if ((j2 & 6) != 0) {
            this.z.setVisibility(BindingConverters.a((List<?>) list));
        }
        if (i2 != 0) {
            this.z.setLabel(str);
        }
    }

    public boolean Z1() {
        synchronized (this) {
            if (this.C != 0) {
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
            this.C = 4;
        }
        b2();
    }

    public void b(List<Attachment> list) {
        this.B = list;
        synchronized (this) {
            this.C |= 2;
        }
        c(47);
        super.b2();
    }

    public boolean c(int i2, Object obj) {
        if (49 == i2) {
            p((String) obj);
        } else if (47 != i2) {
            return false;
        } else {
            b((List) obj);
        }
        return true;
    }

    public void p(String str) {
        this.A = str;
        synchronized (this) {
            this.C |= 1;
        }
        c(49);
        super.b2();
    }
}
