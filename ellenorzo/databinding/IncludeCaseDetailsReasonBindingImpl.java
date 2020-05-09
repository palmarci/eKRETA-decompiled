package p289hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding.C2867f;
import p211h.p258l.C3702f;
import p289hu.ekreta.ellenorzo.util.binding.BindingConverters;
import p289hu.ekreta.ellenorzo.util.binding.WebViewBindings;

/* renamed from: hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsReasonBindingImpl */
public class IncludeCaseDetailsReasonBindingImpl extends IncludeCaseDetailsReasonBinding {

    /* renamed from: D */
    public static final C2867f f12477D = null;

    /* renamed from: E */
    public static final SparseIntArray f12478E = null;

    /* renamed from: C */
    public long f12479C = -1;

    public IncludeCaseDetailsReasonBindingImpl(C3702f fVar, View[] viewArr) {
        Object[] a = ViewDataBinding.m6047a(fVar, viewArr, 2, f12477D, f12478E);
        super(fVar, viewArr[0], 0, (TextView) a[0], (WebView) a[1]);
        this.f12476z.setTag(null);
        this.f12474A.setTag(null);
        mo6101a(viewArr);
        mo6095R1();
    }

    /* renamed from: M1 */
    public void mo6090M1() {
        long j;
        synchronized (this) {
            j = this.f12479C;
            this.f12479C = 0;
        }
        String str = this.f12475B;
        if ((j & 3) != 0) {
            this.f12476z.setVisibility(BindingConverters.m14793a(str));
            this.f12474A.setVisibility(BindingConverters.m14793a(str));
            WebViewBindings.Companion.mo16308a(this.f12474A, str);
        }
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f12479C != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f12479C = 2;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        return false;
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (1 != i) {
            return false;
        }
        mo12436q((String) obj);
        return true;
    }

    /* renamed from: q */
    public void mo12436q(String str) {
        this.f12475B = str;
        synchronized (this) {
            this.f12479C |= 1;
        }
        mo10512c(1);
        super.mo6096S1();
    }
}
