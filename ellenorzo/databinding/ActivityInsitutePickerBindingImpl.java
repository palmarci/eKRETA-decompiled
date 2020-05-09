package p289hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding.C2867f;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import p204g.p205a.p206a.p208b.C3158a;
import p211h.p258l.C3702f;
import p211h.p258l.C3704h;
import p211h.p258l.C3705i;
import p211h.p258l.p259o.C3718d;
import p211h.p258l.p259o.C3719e;
import p211h.p258l.p259o.C3720f;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.institute.InstitutePickerViewModel;

/* renamed from: hu.ekreta.ellenorzo.databinding.ActivityInsitutePickerBindingImpl */
public class ActivityInsitutePickerBindingImpl extends ActivityInsitutePickerBinding {

    /* renamed from: E */
    public static final C2867f f12066E = null;

    /* renamed from: F */
    public static final SparseIntArray f12067F = new SparseIntArray();

    /* renamed from: A */
    public final ConstraintLayout f12068A;

    /* renamed from: B */
    public final TextInputEditText f12069B;

    /* renamed from: C */
    public C3704h f12070C = new C3704h() {
        /* renamed from: a */
        public void mo10528a() {
            String d = C3158a.m7893d((TextView) ActivityInsitutePickerBindingImpl.this.f12069B);
            InstitutePickerViewModel institutePickerViewModel = ActivityInsitutePickerBindingImpl.this.f12065z;
            if (institutePickerViewModel != null) {
                institutePickerViewModel.mo13085o(d);
            }
        }
    };

    /* renamed from: D */
    public long f12071D = -1;

    static {
        f12067F.put(C4014R.C4016id.search_textinputlayout, 2);
        f12067F.put(C4014R.C4016id.institutes_recyclerview, 3);
    }

    public ActivityInsitutePickerBindingImpl(C3702f fVar, View view) {
        Object[] a = ViewDataBinding.m6046a(fVar, view, 4, f12066E, f12067F);
        super(fVar, view, 1, (RecyclerView) a[3], (TextInputLayout) a[2]);
        this.f12068A = (ConstraintLayout) a[0];
        this.f12068A.setTag(null);
        this.f12069B = (TextInputEditText) a[1];
        this.f12069B.setTag(null);
        mo6098a(view);
        mo6095R1();
    }

    /* renamed from: M1 */
    public void mo6090M1() {
        long j;
        synchronized (this) {
            j = this.f12071D;
            this.f12071D = 0;
        }
        InstitutePickerViewModel institutePickerViewModel = this.f12065z;
        int i = ((7 & j) > 0 ? 1 : ((7 & j) == 0 ? 0 : -1));
        CharSequence F0 = (i == 0 || institutePickerViewModel == null) ? null : institutePickerViewModel.mo13082F0();
        if (i != 0) {
            C3158a.m7850a((TextView) this.f12069B, F0);
        }
        if ((j & 4) != 0) {
            C3158a.m7849a((TextView) this.f12069B, (C3719e) null, (C3720f) null, (C3718d) null, this.f12070C);
        }
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f12071D != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f12071D = 4;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public void mo12353a(InstitutePickerViewModel institutePickerViewModel) {
        mo6103a(0, (C3705i) institutePickerViewModel);
        this.f12065z = institutePickerViewModel;
        synchronized (this) {
            this.f12071D |= 1;
        }
        mo10512c(88);
        super.mo6096S1();
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (88 != i) {
            return false;
        }
        mo12353a((InstitutePickerViewModel) obj);
        return true;
    }

    /* renamed from: e */
    public final boolean mo12354e(int i) {
        if (i == 0) {
            synchronized (this) {
                this.f12071D |= 1;
            }
            return true;
        } else if (i != 76) {
            return false;
        } else {
            synchronized (this) {
                this.f12071D |= 2;
            }
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        InstitutePickerViewModel institutePickerViewModel = (InstitutePickerViewModel) obj;
        return mo12354e(i2);
    }
}
