package p289hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding.C2867f;
import p204g.p205a.p206a.p208b.C3158a;
import p211h.p258l.C3702f;
import p289hu.ekreta.ellenorzo.util.binding.BindingConverters;

/* renamed from: hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionDateBindingImpl */
public class IncludeCaseDecisionDateBindingImpl extends IncludeCaseDecisionDateBinding {

    /* renamed from: C */
    public static final C2867f f12427C = null;

    /* renamed from: D */
    public static final SparseIntArray f12428D = null;

    /* renamed from: B */
    public long f12429B = -1;

    public IncludeCaseDecisionDateBindingImpl(C3702f fVar, View[] viewArr) {
        super(fVar, viewArr[0], 0, (TextView) ViewDataBinding.m6047a(fVar, viewArr, 1, f12427C, f12428D)[0]);
        this.f12426z.setTag(null);
        mo6101a(viewArr);
        mo6095R1();
    }

    /* renamed from: M1 */
    public void mo6090M1() {
        long j;
        synchronized (this) {
            j = this.f12429B;
            this.f12429B = 0;
        }
        String str = this.f12425A;
        if ((j & 3) != 0) {
            C3158a.m7850a(this.f12426z, (CharSequence) str);
            this.f12426z.setVisibility(BindingConverters.m14793a(str));
        }
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f12429B != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f12429B = 2;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        return false;
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (109 != i) {
            return false;
        }
        mo12423q((String) obj);
        return true;
    }

    /* renamed from: q */
    public void mo12423q(String str) {
        this.f12425A = str;
        synchronized (this) {
            this.f12429B |= 1;
        }
        mo10512c(109);
        super.mo6096S1();
    }
}
