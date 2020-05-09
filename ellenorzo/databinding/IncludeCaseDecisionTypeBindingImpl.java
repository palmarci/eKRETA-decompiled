package p289hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding.C2867f;
import p204g.p205a.p206a.p208b.C3158a;
import p211h.p258l.C3702f;

/* renamed from: hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionTypeBindingImpl */
public class IncludeCaseDecisionTypeBindingImpl extends IncludeCaseDecisionTypeBinding {

    /* renamed from: C */
    public static final C2867f f12438C = null;

    /* renamed from: D */
    public static final SparseIntArray f12439D = null;

    /* renamed from: B */
    public long f12440B = -1;

    public IncludeCaseDecisionTypeBindingImpl(C3702f fVar, View[] viewArr) {
        super(fVar, viewArr[0], 0, (TextView) ViewDataBinding.m6047a(fVar, viewArr, 1, f12438C, f12439D)[0]);
        this.f12437z.setTag(null);
        mo6101a(viewArr);
        mo6095R1();
    }

    /* renamed from: M1 */
    public void mo6090M1() {
        long j;
        synchronized (this) {
            j = this.f12440B;
            this.f12440B = 0;
        }
        String str = this.f12436A;
        if ((j & 3) != 0) {
            C3158a.m7850a(this.f12437z, (CharSequence) str);
        }
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f12440B != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f12440B = 2;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        return false;
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (59 != i) {
            return false;
        }
        mo12425q((String) obj);
        return true;
    }

    /* renamed from: q */
    public void mo12425q(String str) {
        this.f12436A = str;
        synchronized (this) {
            this.f12440B |= 1;
        }
        mo10512c(59);
        super.mo6096S1();
    }
}
