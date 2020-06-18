package hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import androidx.databinding.ViewDataBinding;
import h.l.f;
import h.l.i;
import hu.ekreta.ellenorzo.cases.decision.DecisionDetailViewModel;
import hu.ekreta.ellenorzo.generated.callback.OnClickListener;
import hu.ekreta.ellenorzo.util.binding.BindingConverters;

public class IncludeCaseDecisionAddAttachmentBindingImpl extends IncludeCaseDecisionAddAttachmentBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.f D = null;
    public static final SparseIntArray E = null;
    public final View.OnClickListener B;
    public long C = -1;

    public IncludeCaseDecisionAddAttachmentBindingImpl(f fVar, View[] viewArr) {
        super(fVar, viewArr[0], 1, (Button) ViewDataBinding.a(fVar, viewArr, 1, D, E)[0]);
        this.z.setTag((Object) null);
        a(viewArr);
        this.B = new OnClickListener(this, 1);
        a2();
    }

    public void V1() {
        long j2;
        synchronized (this) {
            j2 = this.C;
            this.C = 0;
        }
        DecisionDetailViewModel decisionDetailViewModel = this.A;
        boolean z = false;
        int i2 = ((7 & j2) > 0 ? 1 : ((7 & j2) == 0 ? 0 : -1));
        if (!(i2 == 0 || decisionDetailViewModel == null)) {
            z = decisionDetailViewModel.w0();
        }
        if ((j2 & 4) != 0) {
            this.z.setOnClickListener(this.B);
        }
        if (i2 != 0) {
            this.z.setVisibility(BindingConverters.a(z));
        }
    }

    public boolean Z1() {
        synchronized (this) {
            if (this.C != 0) {
                return true;
            }
            return false;
        }
    }

    public void a(DecisionDetailViewModel decisionDetailViewModel) {
        a(0, (i) decisionDetailViewModel);
        this.A = decisionDetailViewModel;
        synchronized (this) {
            this.C |= 1;
        }
        c(88);
        super.b2();
    }

    public void a2() {
        synchronized (this) {
            this.C = 4;
        }
        b2();
    }

    public boolean c(int i2, Object obj) {
        if (88 != i2) {
            return false;
        }
        a((DecisionDetailViewModel) obj);
        return true;
    }

    public final boolean e(int i2) {
        if (i2 == 0) {
            synchronized (this) {
                this.C |= 1;
            }
            return true;
        } else if (i2 != 78) {
            return false;
        } else {
            synchronized (this) {
                this.C |= 2;
            }
            return true;
        }
    }

    public boolean a(int i2, Object obj, int i3) {
        if (i2 != 0) {
            return false;
        }
        DecisionDetailViewModel decisionDetailViewModel = (DecisionDetailViewModel) obj;
        return e(i3);
    }

    public final void a(int i2, View view) {
        DecisionDetailViewModel decisionDetailViewModel = this.A;
        if (decisionDetailViewModel != null) {
            decisionDetailViewModel.U();
        }
    }
}
