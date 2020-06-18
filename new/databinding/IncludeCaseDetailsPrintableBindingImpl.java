package hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import g.a.a.b.a;
import hu.ekreta.ellenorzo.util.binding.BindingConverters;

public class IncludeCaseDetailsPrintableBindingImpl extends IncludeCaseDetailsPrintableBinding {
    public static final ViewDataBinding.f F = null;
    public static final SparseIntArray G = null;
    public OnClickListenerImpl D;
    public long E = -1;

    public static class OnClickListenerImpl implements View.OnClickListener {
        public View.OnClickListener c;

        public OnClickListenerImpl a(View.OnClickListener onClickListener) {
            this.c = onClickListener;
            if (onClickListener == null) {
                return null;
            }
            return this;
        }

        public void onClick(View view) {
            this.c.onClick(view);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IncludeCaseDetailsPrintableBindingImpl(h.l.f r9, android.view.View[] r10) {
        /*
            r8 = this;
            androidx.databinding.ViewDataBinding$f r0 = F
            android.util.SparseIntArray r1 = G
            r2 = 2
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.a((h.l.f) r9, (android.view.View[]) r10, (int) r2, (androidx.databinding.ViewDataBinding.f) r0, (android.util.SparseIntArray) r1)
            r1 = 0
            r4 = r10[r1]
            r1 = r0[r1]
            r6 = r1
            android.widget.TextView r6 = (android.widget.TextView) r6
            r1 = 1
            r0 = r0[r1]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r5 = 0
            r2 = r8
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            r0 = -1
            r8.E = r0
            android.widget.TextView r9 = r8.z
            r0 = 0
            r9.setTag(r0)
            android.widget.TextView r9 = r8.A
            r9.setTag(r0)
            r8.a((android.view.View[]) r10)
            r8.a2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsPrintableBindingImpl.<init>(h.l.f, android.view.View[]):void");
    }

    public void V1() {
        long j2;
        synchronized (this) {
            j2 = this.E;
            this.E = 0;
        }
        OnClickListenerImpl onClickListenerImpl = null;
        String str = this.B;
        View.OnClickListener onClickListener = this.C;
        int i2 = ((5 & j2) > 0 ? 1 : ((5 & j2) == 0 ? 0 : -1));
        int i3 = ((j2 & 6) > 0 ? 1 : ((j2 & 6) == 0 ? 0 : -1));
        if (!(i3 == 0 || onClickListener == null)) {
            OnClickListenerImpl onClickListenerImpl2 = this.D;
            if (onClickListenerImpl2 == null) {
                onClickListenerImpl2 = new OnClickListenerImpl();
                this.D = onClickListenerImpl2;
            }
            onClickListenerImpl = onClickListenerImpl2.a(onClickListener);
        }
        if (i2 != 0) {
            this.z.setVisibility(BindingConverters.a(str));
            a.a(this.A, (CharSequence) str);
            this.A.setVisibility(BindingConverters.a(str));
        }
        if (i3 != 0) {
            this.A.setOnClickListener(onClickListenerImpl);
        }
    }

    public boolean Z1() {
        synchronized (this) {
            if (this.E != 0) {
                return true;
            }
            return false;
        }
    }

    public void a(View.OnClickListener onClickListener) {
        this.C = onClickListener;
        synchronized (this) {
            this.E |= 2;
        }
        c(67);
        super.b2();
    }

    public boolean a(int i2, Object obj, int i3) {
        return false;
    }

    public void a2() {
        synchronized (this) {
            this.E = 4;
        }
        b2();
    }

    public boolean c(int i2, Object obj) {
        if (29 == i2) {
            p((String) obj);
        } else if (67 != i2) {
            return false;
        } else {
            a((View.OnClickListener) obj);
        }
        return true;
    }

    public void p(String str) {
        this.B = str;
        synchronized (this) {
            this.E |= 1;
        }
        c(29);
        super.b2();
    }
}
