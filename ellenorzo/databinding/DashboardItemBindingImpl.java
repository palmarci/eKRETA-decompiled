package p289hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding.C2867f;
import p211h.p258l.C3702f;
import p289hu.ekreta.ellenorzo.C4014R;
import p388ru.rambler.libs.swipe_layout.SwipeLayout;

/* renamed from: hu.ekreta.ellenorzo.databinding.DashboardItemBindingImpl */
public class DashboardItemBindingImpl extends DashboardItemBinding {

    /* renamed from: C */
    public static final C2867f f12256C = null;

    /* renamed from: D */
    public static final SparseIntArray f12257D = new SparseIntArray();

    /* renamed from: B */
    public long f12258B = -1;

    static {
        f12257D.put(C4014R.C4016id.valueTitleLabel, 2);
        f12257D.put(C4014R.C4016id.valueDescLabel, 3);
        f12257D.put(C4014R.C4016id.titleLabel, 4);
        f12257D.put(C4014R.C4016id.detailLabel, 5);
        f12257D.put(C4014R.C4016id.dateLabel, 6);
        f12257D.put(C4014R.C4016id.left_view, 7);
        f12257D.put(C4014R.C4016id.readStateText, 8);
        f12257D.put(C4014R.C4016id.readStateIcon, 9);
    }

    public DashboardItemBindingImpl(C3702f fVar, View view) {
        View view2 = view;
        Object[] a = ViewDataBinding.m6046a(fVar, view2, 10, f12256C, f12257D);
        super(fVar, view, 0, (SwipeLayout) a[0], (TextView) a[6], (TextView) a[5], (ConstraintLayout) a[1], (LinearLayout) a[7], (ImageView) a[9], (TextView) a[8], (TextView) a[4], (TextView) a[3], (TextView) a[2]);
        this.f12255z.setTag(null);
        this.f12254A.setTag(null);
        mo6098a(view2);
        mo6095R1();
    }

    /* renamed from: M1 */
    public void mo6090M1() {
        synchronized (this) {
            this.f12258B = 0;
        }
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f12258B != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f12258B = 1;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        return false;
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        return true;
    }
}
