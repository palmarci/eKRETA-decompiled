package p289hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.webkit.WebView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding.C2867f;
import p211h.p258l.C3702f;
import p289hu.ekreta.ellenorzo.util.binding.BindingConverters;
import p289hu.ekreta.ellenorzo.util.binding.WebViewBindings;

/* renamed from: hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionAdjudicationBindingImpl */
public class IncludeCaseDecisionAdjudicationBindingImpl extends IncludeCaseDecisionAdjudicationBinding {

    /* renamed from: C */
    public static final C2867f f12422C = null;

    /* renamed from: D */
    public static final SparseIntArray f12423D = null;

    /* renamed from: B */
    public long f12424B = -1;

    public IncludeCaseDecisionAdjudicationBindingImpl(C3702f fVar, View[] viewArr) {
        super(fVar, viewArr[0], 0, (WebView) ViewDataBinding.m6047a(fVar, viewArr, 1, f12422C, f12423D)[0]);
        this.f12421z.setTag(null);
        mo6101a(viewArr);
        mo6095R1();
    }

    /* renamed from: M1 */
    public void mo6090M1() {
        long j;
        synchronized (this) {
            j = this.f12424B;
            this.f12424B = 0;
        }
        String str = this.f12420A;
        if ((j & 3) != 0) {
            this.f12421z.setVisibility(BindingConverters.m14793a(str));
            WebViewBindings.Companion.mo16308a(this.f12421z, str);
        }
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f12424B != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f12424B = 2;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        return false;
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (97 != i) {
            return false;
        }
        mo12422q((String) obj);
        return true;
    }

    /* renamed from: q */
    public void mo12422q(String str) {
        this.f12420A = str;
        synchronized (this) {
            this.f12424B |= 1;
        }
        mo10512c(97);
        super.mo6096S1();
    }
}
