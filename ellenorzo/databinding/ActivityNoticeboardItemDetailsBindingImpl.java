package p289hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding.C2867f;
import com.google.android.material.appbar.AppBarLayout;
import p204g.p205a.p206a.p208b.C3158a;
import p211h.p258l.C3702f;
import p211h.p258l.C3705i;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.noticeboard.detail.NoticeBoardItemDetailViewModel;

/* renamed from: hu.ekreta.ellenorzo.databinding.ActivityNoticeboardItemDetailsBindingImpl */
public class ActivityNoticeboardItemDetailsBindingImpl extends ActivityNoticeboardItemDetailsBinding {

    /* renamed from: E */
    public static final C2867f f12182E = null;

    /* renamed from: F */
    public static final SparseIntArray f12183F = new SparseIntArray();

    /* renamed from: C */
    public final CoordinatorLayout f12184C;

    /* renamed from: D */
    public long f12185D = -1;

    static {
        f12183F.put(C4014R.C4016id.app_bar_layout, 3);
        f12183F.put(C4014R.C4016id.toolbar, 4);
        f12183F.put(C4014R.C4016id.nested_scroll_view, 5);
        f12183F.put(C4014R.C4016id.constraint_layout, 6);
        f12183F.put(C4014R.C4016id.title_caption, 7);
        f12183F.put(C4014R.C4016id.title_divider, 8);
        f12183F.put(C4014R.C4016id.content_caption, 9);
    }

    public ActivityNoticeboardItemDetailsBindingImpl(C3702f fVar, View view) {
        View view2 = view;
        Object[] a = ViewDataBinding.m6046a(fVar, view2, 10, f12182E, f12183F);
        super(fVar, view, 1, (AppBarLayout) a[3], (ConstraintLayout) a[6], (TextView) a[9], (TextView) a[2], (NestedScrollView) a[5], (TextView) a[7], (View) a[8], (TextView) a[1], (Toolbar) a[4]);
        this.f12181z.setTag(null);
        this.f12184C = (CoordinatorLayout) a[0];
        this.f12184C.setTag(null);
        this.f12179A.setTag(null);
        mo6098a(view2);
        mo6095R1();
    }

    /* renamed from: M1 */
    public void mo6090M1() {
        long j;
        CharSequence charSequence;
        synchronized (this) {
            j = this.f12185D;
            this.f12185D = 0;
        }
        NoticeBoardItemDetailViewModel noticeBoardItemDetailViewModel = this.f12180B;
        String str = null;
        if ((15 & j) != 0) {
            charSequence = ((j & 13) == 0 || noticeBoardItemDetailViewModel == null) ? null : noticeBoardItemDetailViewModel.mo13737x0();
            if (!((j & 11) == 0 || noticeBoardItemDetailViewModel == null)) {
                str = noticeBoardItemDetailViewModel.getTitle();
            }
        } else {
            charSequence = null;
        }
        if ((13 & j) != 0) {
            C3158a.m7850a(this.f12181z, charSequence);
        }
        if ((j & 11) != 0) {
            C3158a.m7850a(this.f12179A, (CharSequence) str);
        }
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f12185D != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f12185D = 8;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public void mo12368a(NoticeBoardItemDetailViewModel noticeBoardItemDetailViewModel) {
        mo6103a(0, (C3705i) noticeBoardItemDetailViewModel);
        this.f12180B = noticeBoardItemDetailViewModel;
        synchronized (this) {
            this.f12185D |= 1;
        }
        mo10512c(88);
        super.mo6096S1();
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (88 != i) {
            return false;
        }
        mo12368a((NoticeBoardItemDetailViewModel) obj);
        return true;
    }

    /* renamed from: e */
    public final boolean mo12369e(int i) {
        if (i == 0) {
            synchronized (this) {
                this.f12185D |= 1;
            }
            return true;
        } else if (i == 95) {
            synchronized (this) {
                this.f12185D |= 2;
            }
            return true;
        } else if (i != 96) {
            return false;
        } else {
            synchronized (this) {
                this.f12185D |= 4;
            }
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        NoticeBoardItemDetailViewModel noticeBoardItemDetailViewModel = (NoticeBoardItemDetailViewModel) obj;
        return mo12369e(i2);
    }
}
