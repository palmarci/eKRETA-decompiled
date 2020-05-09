package p289hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding.C2867f;
import com.google.android.material.button.MaterialButton;
import p204g.p205a.p206a.p208b.C3158a;
import p211h.p258l.C3702f;
import p211h.p258l.C3704h;
import p211h.p258l.C3705i;
import p211h.p258l.p259o.C3718d;
import p211h.p258l.p259o.C3719e;
import p211h.p258l.p259o.C3720f;
import p289hu.ekreta.ellenorzo.generated.callback.OnClickListener.Listener;
import p289hu.ekreta.ellenorzo.homework.comment.HomeworkCommentFormViewModel;

/* renamed from: hu.ekreta.ellenorzo.databinding.ActivityHomeworkCommentBindingImpl */
public class ActivityHomeworkCommentBindingImpl extends ActivityHomeworkCommentBinding implements Listener {

    /* renamed from: G */
    public static final C2867f f12042G = null;

    /* renamed from: H */
    public static final SparseIntArray f12043H = null;

    /* renamed from: D */
    public final OnClickListener f12044D;

    /* renamed from: E */
    public C3704h f12045E = new C3704h() {
        /* renamed from: a */
        public void mo10528a() {
            String d = C3158a.m7893d((TextView) ActivityHomeworkCommentBindingImpl.this.f12038A);
            HomeworkCommentFormViewModel homeworkCommentFormViewModel = ActivityHomeworkCommentBindingImpl.this.f12040C;
            if (homeworkCommentFormViewModel != null) {
                homeworkCommentFormViewModel.mo13050k(d);
            }
        }
    };

    /* renamed from: F */
    public long f12046F = -1;

    public ActivityHomeworkCommentBindingImpl(C3702f fVar, View view) {
        Object[] a = ViewDataBinding.m6046a(fVar, view, 3, f12042G, f12043H);
        super(fVar, view, 1, (MaterialButton) a[2], (EditText) a[1], (ConstraintLayout) a[0]);
        this.f12041z.setTag(null);
        this.f12038A.setTag(null);
        this.f12039B.setTag(null);
        mo6098a(view);
        this.f12044D = new p289hu.ekreta.ellenorzo.generated.callback.OnClickListener(this, 1);
        mo6095R1();
    }

    /* renamed from: M1 */
    public void mo6090M1() {
        long j;
        CharSequence charSequence;
        synchronized (this) {
            j = this.f12046F;
            this.f12046F = 0;
        }
        HomeworkCommentFormViewModel homeworkCommentFormViewModel = this.f12040C;
        boolean z = false;
        if ((15 & j) != 0) {
            charSequence = ((j & 11) == 0 || homeworkCommentFormViewModel == null) ? null : homeworkCommentFormViewModel.mo13046K0();
            if (!((j & 13) == 0 || homeworkCommentFormViewModel == null)) {
                z = homeworkCommentFormViewModel.mo13047U0();
            }
        } else {
            charSequence = null;
        }
        if ((13 & j) != 0) {
            this.f12041z.setEnabled(z);
        }
        if ((8 & j) != 0) {
            this.f12041z.setOnClickListener(this.f12044D);
            C3158a.m7849a((TextView) this.f12038A, (C3719e) null, (C3720f) null, (C3718d) null, this.f12045E);
        }
        if ((j & 11) != 0) {
            C3158a.m7850a((TextView) this.f12038A, charSequence);
        }
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f12046F != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f12046F = 8;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public void mo12348a(HomeworkCommentFormViewModel homeworkCommentFormViewModel) {
        mo6103a(0, (C3705i) homeworkCommentFormViewModel);
        this.f12040C = homeworkCommentFormViewModel;
        synchronized (this) {
            this.f12046F |= 1;
        }
        mo10512c(88);
        super.mo6096S1();
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (88 != i) {
            return false;
        }
        mo12348a((HomeworkCommentFormViewModel) obj);
        return true;
    }

    /* renamed from: e */
    public final boolean mo12349e(int i) {
        if (i == 0) {
            synchronized (this) {
                this.f12046F |= 1;
            }
            return true;
        } else if (i == 39) {
            synchronized (this) {
                this.f12046F |= 2;
            }
            return true;
        } else if (i != 8) {
            return false;
        } else {
            synchronized (this) {
                this.f12046F |= 4;
            }
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        HomeworkCommentFormViewModel homeworkCommentFormViewModel = (HomeworkCommentFormViewModel) obj;
        return mo12349e(i2);
    }

    /* renamed from: a */
    public final void mo12329a(int i, View view) {
        HomeworkCommentFormViewModel homeworkCommentFormViewModel = this.f12040C;
        if (homeworkCommentFormViewModel != null) {
            homeworkCommentFormViewModel.mo13051o0();
        }
    }
}
