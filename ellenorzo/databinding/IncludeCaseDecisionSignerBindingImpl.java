package p289hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding.C2867f;
import p204g.p205a.p206a.p208b.C3158a;
import p211h.p258l.C3702f;
import p289hu.ekreta.ellenorzo.util.binding.BindingConverters;

/* renamed from: hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionSignerBindingImpl */
public class IncludeCaseDecisionSignerBindingImpl extends IncludeCaseDecisionSignerBinding {

    /* renamed from: D */
    public static final C2867f f12433D = null;

    /* renamed from: E */
    public static final SparseIntArray f12434E = null;

    /* renamed from: C */
    public long f12435C = -1;

    public IncludeCaseDecisionSignerBindingImpl(C3702f fVar, View[] viewArr) {
        Object[] a = ViewDataBinding.m6047a(fVar, viewArr, 2, f12433D, f12434E);
        super(fVar, viewArr[0], 0, (TextView) a[1], (TextView) a[0]);
        this.f12432z.setTag(null);
        this.f12430A.setTag(null);
        mo6101a(viewArr);
        mo6095R1();
    }

    /* renamed from: M1 */
    public void mo6090M1() {
        long j;
        synchronized (this) {
            j = this.f12435C;
            this.f12435C = 0;
        }
        String str = this.f12431B;
        if ((j & 3) != 0) {
            C3158a.m7850a(this.f12432z, (CharSequence) str);
            this.f12430A.setVisibility(BindingConverters.m14793a(str));
        }
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f12435C != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f12435C = 2;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        return false;
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (17 != i) {
            return false;
        }
        mo12424q((String) obj);
        return true;
    }

    /* renamed from: q */
    public void mo12424q(String str) {
        this.f12431B = str;
        synchronized (this) {
            this.f12435C |= 1;
        }
        mo10512c(17);
        super.mo6096S1();
    }
}
