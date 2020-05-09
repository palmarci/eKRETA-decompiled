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

/* renamed from: hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAttachmentsBindingImpl */
public class IncludeCaseDetailsAttachmentsBindingImpl extends IncludeCaseDetailsAttachmentsBinding {

    /* renamed from: C */
    public static final C2867f f12449C = null;

    /* renamed from: D */
    public static final SparseIntArray f12450D = null;

    /* renamed from: B */
    public long f12451B = -1;

    public IncludeCaseDetailsAttachmentsBindingImpl(C3702f fVar, View view) {
        super(fVar, view, 0, (AttachmentView) ViewDataBinding.m6046a(fVar, view, 1, f12449C, f12450D)[0]);
        this.f12448z.setTag(null);
        mo6098a(view);
        mo6095R1();
    }

    /* renamed from: M1 */
    public void mo6090M1() {
        long j;
        synchronized (this) {
            j = this.f12451B;
            this.f12451B = 0;
        }
        List<Attachment> list = this.f12447A;
        if ((j & 3) != 0) {
            this.f12448z.setVisibility(BindingConverters.m14794a(list));
        }
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f12451B != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f12451B = 2;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        return false;
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (34 != i) {
            return false;
        }
        mo12427b((List) obj);
        return true;
    }

    /* renamed from: b */
    public void mo12427b(List<Attachment> list) {
        this.f12447A = list;
        synchronized (this) {
            this.f12451B |= 1;
        }
        mo10512c(34);
        super.mo6096S1();
    }
}
