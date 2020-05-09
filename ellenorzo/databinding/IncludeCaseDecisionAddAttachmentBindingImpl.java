package p289hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding.C2867f;
import p211h.p258l.C3702f;
import p211h.p258l.C3705i;
import p289hu.ekreta.ellenorzo.cases.decision.DecisionDetailViewModel;
import p289hu.ekreta.ellenorzo.generated.callback.OnClickListener.Listener;
import p289hu.ekreta.ellenorzo.util.binding.BindingConverters;

/* renamed from: hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionAddAttachmentBindingImpl */
public class IncludeCaseDecisionAddAttachmentBindingImpl extends IncludeCaseDecisionAddAttachmentBinding implements Listener {

    /* renamed from: D */
    public static final C2867f f12416D = null;

    /* renamed from: E */
    public static final SparseIntArray f12417E = null;

    /* renamed from: B */
    public final OnClickListener f12418B;

    /* renamed from: C */
    public long f12419C = -1;

    public IncludeCaseDecisionAddAttachmentBindingImpl(C3702f fVar, View[] viewArr) {
        super(fVar, viewArr[0], 1, (Button) ViewDataBinding.m6047a(fVar, viewArr, 1, f12416D, f12417E)[0]);
        this.f12415z.setTag(null);
        mo6101a(viewArr);
        this.f12418B = new p289hu.ekreta.ellenorzo.generated.callback.OnClickListener(this, 1);
        mo6095R1();
    }

    /* renamed from: M1 */
    public void mo6090M1() {
        long j;
        synchronized (this) {
            j = this.f12419C;
            this.f12419C = 0;
        }
        DecisionDetailViewModel decisionDetailViewModel = this.f12414A;
        boolean z = false;
        int i = ((7 & j) > 0 ? 1 : ((7 & j) == 0 ? 0 : -1));
        if (!(i == 0 || decisionDetailViewModel == null)) {
            z = decisionDetailViewModel.mo11740w0();
        }
        if ((j & 4) != 0) {
            this.f12415z.setOnClickListener(this.f12418B);
        }
        if (i != 0) {
            this.f12415z.setVisibility(BindingConverters.m14795a(z));
        }
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f12419C != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f12419C = 4;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public void mo12420a(DecisionDetailViewModel decisionDetailViewModel) {
        mo6103a(0, (C3705i) decisionDetailViewModel);
        this.f12414A = decisionDetailViewModel;
        synchronized (this) {
            this.f12419C |= 1;
        }
        mo10512c(88);
        super.mo6096S1();
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (88 != i) {
            return false;
        }
        mo12420a((DecisionDetailViewModel) obj);
        return true;
    }

    /* renamed from: e */
    public final boolean mo12421e(int i) {
        if (i == 0) {
            synchronized (this) {
                this.f12419C |= 1;
            }
            return true;
        } else if (i != 78) {
            return false;
        } else {
            synchronized (this) {
                this.f12419C |= 2;
            }
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        DecisionDetailViewModel decisionDetailViewModel = (DecisionDetailViewModel) obj;
        return mo12421e(i2);
    }

    /* renamed from: a */
    public final void mo12329a(int i, View view) {
        DecisionDetailViewModel decisionDetailViewModel = this.f12414A;
        if (decisionDetailViewModel != null) {
            decisionDetailViewModel.mo11726U();
        }
    }
}
