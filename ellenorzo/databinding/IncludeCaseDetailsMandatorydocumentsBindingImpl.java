package p289hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding.C2867f;
import java.util.List;
import p211h.p258l.C3702f;
import p289hu.ekreta.ellenorzo.attachment.Attachment;
import p289hu.ekreta.ellenorzo.attachment.AttachmentView;
import p289hu.ekreta.ellenorzo.util.binding.BindingConverters;

/* renamed from: hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsMandatorydocumentsBindingImpl */
public class IncludeCaseDetailsMandatorydocumentsBindingImpl extends IncludeCaseDetailsMandatorydocumentsBinding {

    /* renamed from: D */
    public static final C2867f f12455D = null;

    /* renamed from: E */
    public static final SparseIntArray f12456E = null;

    /* renamed from: C */
    public long f12457C = -1;

    public IncludeCaseDetailsMandatorydocumentsBindingImpl(C3702f fVar, View view) {
        super(fVar, view, 0, (AttachmentView) ViewDataBinding.m6046a(fVar, view, 1, f12455D, f12456E)[0]);
        this.f12454z.setTag(null);
        mo6098a(view);
        mo6095R1();
    }

    /* renamed from: M1 */
    public void mo6090M1() {
        long j;
        synchronized (this) {
            j = this.f12457C;
            this.f12457C = 0;
        }
        String str = this.f12452A;
        List<Attachment> list = this.f12453B;
        int i = ((5 & j) > 0 ? 1 : ((5 & j) == 0 ? 0 : -1));
        if ((j & 6) != 0) {
            this.f12454z.setVisibility(BindingConverters.m14794a(list));
        }
        if (i != 0) {
            this.f12454z.setLabel(str);
        }
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f12457C != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f12457C = 4;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        return false;
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (48 == i) {
            mo12429q((String) obj);
        } else if (46 != i) {
            return false;
        } else {
            mo12428b((List) obj);
        }
        return true;
    }

    /* renamed from: q */
    public void mo12429q(String str) {
        this.f12452A = str;
        synchronized (this) {
            this.f12457C |= 1;
        }
        mo10512c(48);
        super.mo6096S1();
    }

    /* renamed from: b */
    public void mo12428b(List<Attachment> list) {
        this.f12453B = list;
        synchronized (this) {
            this.f12457C |= 2;
        }
        mo10512c(46);
        super.mo6096S1();
    }
}
