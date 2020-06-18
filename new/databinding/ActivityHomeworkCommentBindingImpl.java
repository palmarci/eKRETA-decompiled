package hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import g.a.a.b.a;
import h.l.h;
import h.l.i;
import h.l.o.d;
import h.l.o.e;
import h.l.o.f;
import hu.ekreta.ellenorzo.generated.callback.OnClickListener;
import hu.ekreta.ellenorzo.homework.comment.HomeworkCommentFormViewModel;

public class ActivityHomeworkCommentBindingImpl extends ActivityHomeworkCommentBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.f G = null;
    public static final SparseIntArray H = null;
    public final View.OnClickListener D;
    public h E = new h() {
        public void a() {
            String d2 = a.d((TextView) ActivityHomeworkCommentBindingImpl.this.A);
            HomeworkCommentFormViewModel homeworkCommentFormViewModel = ActivityHomeworkCommentBindingImpl.this.C;
            if (homeworkCommentFormViewModel != null) {
                homeworkCommentFormViewModel.j(d2);
            }
        }
    };
    public long F = -1;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActivityHomeworkCommentBindingImpl(h.l.f r10, android.view.View r11) {
        /*
            r9 = this;
            androidx.databinding.ViewDataBinding$f r0 = G
            android.util.SparseIntArray r1 = H
            r2 = 3
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.a((h.l.f) r10, (android.view.View) r11, (int) r2, (androidx.databinding.ViewDataBinding.f) r0, (android.util.SparseIntArray) r1)
            r1 = 2
            r1 = r0[r1]
            r6 = r1
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            r1 = 1
            r2 = r0[r1]
            r7 = r2
            android.widget.EditText r7 = (android.widget.EditText) r7
            r2 = 0
            r0 = r0[r2]
            r8 = r0
            androidx.constraintlayout.widget.ConstraintLayout r8 = (androidx.constraintlayout.widget.ConstraintLayout) r8
            r5 = 1
            r2 = r9
            r3 = r10
            r4 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            hu.ekreta.ellenorzo.databinding.ActivityHomeworkCommentBindingImpl$1 r10 = new hu.ekreta.ellenorzo.databinding.ActivityHomeworkCommentBindingImpl$1
            r10.<init>()
            r9.E = r10
            r2 = -1
            r9.F = r2
            com.google.android.material.button.MaterialButton r10 = r9.z
            r0 = 0
            r10.setTag(r0)
            android.widget.EditText r10 = r9.A
            r10.setTag(r0)
            androidx.constraintlayout.widget.ConstraintLayout r10 = r9.B
            r10.setTag(r0)
            r9.a((android.view.View) r11)
            hu.ekreta.ellenorzo.generated.callback.OnClickListener r10 = new hu.ekreta.ellenorzo.generated.callback.OnClickListener
            r10.<init>(r9, r1)
            r9.D = r10
            r9.a2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.ActivityHomeworkCommentBindingImpl.<init>(h.l.f, android.view.View):void");
    }

    public void V1() {
        long j2;
        String str;
        synchronized (this) {
            j2 = this.F;
            this.F = 0;
        }
        HomeworkCommentFormViewModel homeworkCommentFormViewModel = this.C;
        boolean z = false;
        if ((15 & j2) != 0) {
            str = ((j2 & 11) == 0 || homeworkCommentFormViewModel == null) ? null : homeworkCommentFormViewModel.M0();
            if (!((j2 & 13) == 0 || homeworkCommentFormViewModel == null)) {
                z = homeworkCommentFormViewModel.Y0();
            }
        } else {
            str = null;
        }
        if ((13 & j2) != 0) {
            this.z.setEnabled(z);
        }
        if ((8 & j2) != 0) {
            this.z.setOnClickListener(this.D);
            a.a((TextView) this.A, (e) null, (f) null, (d) null, this.E);
        }
        if ((j2 & 11) != 0) {
            a.a((TextView) this.A, (CharSequence) str);
        }
    }

    public boolean Z1() {
        synchronized (this) {
            if (this.F != 0) {
                return true;
            }
            return false;
        }
    }

    public void a(HomeworkCommentFormViewModel homeworkCommentFormViewModel) {
        a(0, (i) homeworkCommentFormViewModel);
        this.C = homeworkCommentFormViewModel;
        synchronized (this) {
            this.F |= 1;
        }
        c(88);
        super.b2();
    }

    public void a2() {
        synchronized (this) {
            this.F = 8;
        }
        b2();
    }

    public boolean c(int i2, Object obj) {
        if (88 != i2) {
            return false;
        }
        a((HomeworkCommentFormViewModel) obj);
        return true;
    }

    public final boolean e(int i2) {
        if (i2 == 0) {
            synchronized (this) {
                this.F |= 1;
            }
            return true;
        } else if (i2 == 39) {
            synchronized (this) {
                this.F |= 2;
            }
            return true;
        } else if (i2 != 7) {
            return false;
        } else {
            synchronized (this) {
                this.F |= 4;
            }
            return true;
        }
    }

    public boolean a(int i2, Object obj, int i3) {
        if (i2 != 0) {
            return false;
        }
        HomeworkCommentFormViewModel homeworkCommentFormViewModel = (HomeworkCommentFormViewModel) obj;
        return e(i3);
    }

    public final void a(int i2, View view) {
        HomeworkCommentFormViewModel homeworkCommentFormViewModel = this.C;
        if (homeworkCommentFormViewModel != null) {
            homeworkCommentFormViewModel.o0();
        }
    }
}
