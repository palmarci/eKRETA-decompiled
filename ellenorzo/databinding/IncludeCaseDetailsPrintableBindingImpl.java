package p289hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding.C2867f;
import p204g.p205a.p206a.p208b.C3158a;
import p211h.p258l.C3702f;
import p289hu.ekreta.ellenorzo.util.binding.BindingConverters;

/* renamed from: hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsPrintableBindingImpl */
public class IncludeCaseDetailsPrintableBindingImpl extends IncludeCaseDetailsPrintableBinding {

    /* renamed from: F */
    public static final C2867f f12469F = null;

    /* renamed from: G */
    public static final SparseIntArray f12470G = null;

    /* renamed from: D */
    public OnClickListenerImpl f12471D;

    /* renamed from: E */
    public long f12472E = -1;

    /* renamed from: hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsPrintableBindingImpl$OnClickListenerImpl */
    public static class OnClickListenerImpl implements OnClickListener {

        /* renamed from: c */
        public OnClickListener f12473c;

        /* renamed from: a */
        public OnClickListenerImpl mo12434a(OnClickListener onClickListener) {
            this.f12473c = onClickListener;
            if (onClickListener == null) {
                return null;
            }
            return this;
        }

        public void onClick(View view) {
            this.f12473c.onClick(view);
        }
    }

    public IncludeCaseDetailsPrintableBindingImpl(C3702f fVar, View[] viewArr) {
        Object[] a = ViewDataBinding.m6047a(fVar, viewArr, 2, f12469F, f12470G);
        super(fVar, viewArr[0], 0, (TextView) a[0], (TextView) a[1]);
        this.f12468z.setTag(null);
        this.f12465A.setTag(null);
        mo6101a(viewArr);
        mo6095R1();
    }

    /* renamed from: M1 */
    public void mo6090M1() {
        long j;
        synchronized (this) {
            j = this.f12472E;
            this.f12472E = 0;
        }
        OnClickListenerImpl onClickListenerImpl = null;
        String str = this.f12466B;
        OnClickListener onClickListener = this.f12467C;
        int i = ((5 & j) > 0 ? 1 : ((5 & j) == 0 ? 0 : -1));
        int i2 = ((j & 6) > 0 ? 1 : ((j & 6) == 0 ? 0 : -1));
        if (!(i2 == 0 || onClickListener == null)) {
            OnClickListenerImpl onClickListenerImpl2 = this.f12471D;
            if (onClickListenerImpl2 == null) {
                onClickListenerImpl2 = new OnClickListenerImpl();
                this.f12471D = onClickListenerImpl2;
            }
            onClickListenerImpl = onClickListenerImpl2.mo12434a(onClickListener);
        }
        if (i != 0) {
            this.f12468z.setVisibility(BindingConverters.m14793a(str));
            C3158a.m7850a(this.f12465A, (CharSequence) str);
            this.f12465A.setVisibility(BindingConverters.m14793a(str));
        }
        if (i2 != 0) {
            this.f12465A.setOnClickListener(onClickListenerImpl);
        }
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f12472E != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f12472E = 4;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public void mo12432a(OnClickListener onClickListener) {
        this.f12467C = onClickListener;
        synchronized (this) {
            this.f12472E |= 2;
        }
        mo10512c(67);
        super.mo6096S1();
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        return false;
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (29 == i) {
            mo12433q((String) obj);
        } else if (67 != i) {
            return false;
        } else {
            mo12432a((OnClickListener) obj);
        }
        return true;
    }

    /* renamed from: q */
    public void mo12433q(String str) {
        this.f12466B = str;
        synchronized (this) {
            this.f12472E |= 1;
        }
        mo10512c(29);
        super.mo6096S1();
    }
}
