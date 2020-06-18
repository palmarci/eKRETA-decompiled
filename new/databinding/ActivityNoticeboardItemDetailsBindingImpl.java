package hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import g.a.a.b.a;
import h.l.i;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.noticeboard.detail.NoticeBoardItemDetailViewModel;

public class ActivityNoticeboardItemDetailsBindingImpl extends ActivityNoticeboardItemDetailsBinding {
    public static final ViewDataBinding.f E = null;
    public static final SparseIntArray F = new SparseIntArray();
    public final CoordinatorLayout C;
    public long D = -1;

    static {
        F.put(R.id.app_bar_layout, 3);
        F.put(R.id.toolbar, 4);
        F.put(R.id.nested_scroll_view, 5);
        F.put(R.id.constraint_layout, 6);
        F.put(R.id.title_caption, 7);
        F.put(R.id.title_divider, 8);
        F.put(R.id.content_caption, 9);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActivityNoticeboardItemDetailsBindingImpl(h.l.f r18, android.view.View r19) {
        /*
            r17 = this;
            r13 = r17
            r14 = r19
            androidx.databinding.ViewDataBinding$f r0 = E
            android.util.SparseIntArray r1 = F
            r2 = 10
            r3 = r18
            java.lang.Object[] r15 = androidx.databinding.ViewDataBinding.a((h.l.f) r3, (android.view.View) r14, (int) r2, (androidx.databinding.ViewDataBinding.f) r0, (android.util.SparseIntArray) r1)
            r0 = 3
            r0 = r15[r0]
            r4 = r0
            com.google.android.material.appbar.AppBarLayout r4 = (com.google.android.material.appbar.AppBarLayout) r4
            r0 = 6
            r0 = r15[r0]
            r5 = r0
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            r0 = 9
            r0 = r15[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 2
            r0 = r15[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 5
            r0 = r15[r0]
            r8 = r0
            androidx.core.widget.NestedScrollView r8 = (androidx.core.widget.NestedScrollView) r8
            r0 = 7
            r0 = r15[r0]
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = 8
            r0 = r15[r0]
            r10 = r0
            android.view.View r10 = (android.view.View) r10
            r0 = 1
            r0 = r15[r0]
            r11 = r0
            android.widget.TextView r11 = (android.widget.TextView) r11
            r0 = 4
            r0 = r15[r0]
            r12 = r0
            androidx.appcompat.widget.Toolbar r12 = (androidx.appcompat.widget.Toolbar) r12
            r16 = 1
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = -1
            r13.D = r0
            android.widget.TextView r0 = r13.z
            r1 = 0
            r0.setTag(r1)
            r0 = 0
            r0 = r15[r0]
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r13.C = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r13.C
            r0.setTag(r1)
            android.widget.TextView r0 = r13.A
            r0.setTag(r1)
            r13.a((android.view.View) r14)
            r17.a2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.ActivityNoticeboardItemDetailsBindingImpl.<init>(h.l.f, android.view.View):void");
    }

    public void V1() {
        long j2;
        String str;
        synchronized (this) {
            j2 = this.D;
            this.D = 0;
        }
        NoticeBoardItemDetailViewModel noticeBoardItemDetailViewModel = this.B;
        String str2 = null;
        if ((15 & j2) != 0) {
            str = ((j2 & 13) == 0 || noticeBoardItemDetailViewModel == null) ? null : noticeBoardItemDetailViewModel.x0();
            if (!((j2 & 11) == 0 || noticeBoardItemDetailViewModel == null)) {
                str2 = noticeBoardItemDetailViewModel.getTitle();
            }
        } else {
            str = null;
        }
        if ((13 & j2) != 0) {
            a.a(this.z, (CharSequence) str);
        }
        if ((j2 & 11) != 0) {
            a.a(this.A, (CharSequence) str2);
        }
    }

    public boolean Z1() {
        synchronized (this) {
            if (this.D != 0) {
                return true;
            }
            return false;
        }
    }

    public void a(NoticeBoardItemDetailViewModel noticeBoardItemDetailViewModel) {
        a(0, (i) noticeBoardItemDetailViewModel);
        this.B = noticeBoardItemDetailViewModel;
        synchronized (this) {
            this.D |= 1;
        }
        c(88);
        super.b2();
    }

    public void a2() {
        synchronized (this) {
            this.D = 8;
        }
        b2();
    }

    public boolean c(int i2, Object obj) {
        if (88 != i2) {
            return false;
        }
        a((NoticeBoardItemDetailViewModel) obj);
        return true;
    }

    public final boolean e(int i2) {
        if (i2 == 0) {
            synchronized (this) {
                this.D |= 1;
            }
            return true;
        } else if (i2 == 97) {
            synchronized (this) {
                this.D |= 2;
            }
            return true;
        } else if (i2 != 98) {
            return false;
        } else {
            synchronized (this) {
                this.D |= 4;
            }
            return true;
        }
    }

    public boolean a(int i2, Object obj, int i3) {
        if (i2 != 0) {
            return false;
        }
        NoticeBoardItemDetailViewModel noticeBoardItemDetailViewModel = (NoticeBoardItemDetailViewModel) obj;
        return e(i3);
    }
}
