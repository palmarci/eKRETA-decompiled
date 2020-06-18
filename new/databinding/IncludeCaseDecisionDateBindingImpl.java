package hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import g.a.a.b.a;
import h.l.f;
import hu.ekreta.ellenorzo.util.binding.BindingConverters;

public class IncludeCaseDecisionDateBindingImpl extends IncludeCaseDecisionDateBinding {
    public static final ViewDataBinding.f C = null;
    public static final SparseIntArray D = null;
    public long B = -1;

    public IncludeCaseDecisionDateBindingImpl(f fVar, View[] viewArr) {
        super(fVar, viewArr[0], 0, (TextView) ViewDataBinding.a(fVar, viewArr, 1, C, D)[0]);
        this.z.setTag((Object) null);
        a(viewArr);
        a2();
    }

    public void V1() {
        long j2;
        synchronized (this) {
            j2 = this.B;
            this.B = 0;
        }
        String str = this.A;
        if ((j2 & 3) != 0) {
            a.a(this.z, (CharSequence) str);
            this.z.setVisibility(BindingConverters.a(str));
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

    public boolean c(int i2, Object obj) {
        if (112 != i2) {
            return false;
        }
        p((String) obj);
        return true;
    }

    public void p(String str) {
        this.A = str;
        synchronized (this) {
            this.B |= 1;
        }
        c(112);
        super.b2();
    }
}
