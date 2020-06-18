package hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import hu.ekreta.ellenorzo.R;

public class MessageItemBindingImpl extends MessageItemBinding {
    public static final ViewDataBinding.f C = null;
    public static final SparseIntArray D = new SparseIntArray();
    public long B = -1;

    static {
        D.put(R.id.attachmentIcon, 2);
        D.put(R.id.senderNameLabel, 3);
        D.put(R.id.subjectLabel, 4);
        D.put(R.id.sentDateLabel, 5);
        D.put(R.id.right_view, 6);
        D.put(R.id.deleteIcon, 7);
        D.put(R.id.deleteText, 8);
        D.put(R.id.left_view, 9);
        D.put(R.id.readStateText, 10);
        D.put(R.id.readStateIcon, 11);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MessageItemBindingImpl(h.l.f r20, android.view.View r21) {
        /*
            r19 = this;
            r15 = r19
            r14 = r21
            androidx.databinding.ViewDataBinding$f r0 = C
            android.util.SparseIntArray r1 = D
            r2 = 12
            r3 = r20
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.a((h.l.f) r3, (android.view.View) r14, (int) r2, (androidx.databinding.ViewDataBinding.f) r0, (android.util.SparseIntArray) r1)
            r1 = 2
            r1 = r0[r1]
            r4 = r1
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r1 = 7
            r1 = r0[r1]
            r5 = r1
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r1 = 8
            r1 = r0[r1]
            r6 = r1
            android.widget.TextView r6 = (android.widget.TextView) r6
            r1 = 1
            r1 = r0[r1]
            r7 = r1
            androidx.constraintlayout.widget.ConstraintLayout r7 = (androidx.constraintlayout.widget.ConstraintLayout) r7
            r1 = 9
            r1 = r0[r1]
            r8 = r1
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            r1 = 0
            r1 = r0[r1]
            r9 = r1
            ru.rambler.libs.swipe_layout.SwipeLayout r9 = (ru.rambler.libs.swipe_layout.SwipeLayout) r9
            r1 = 11
            r1 = r0[r1]
            r10 = r1
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r1 = 10
            r1 = r0[r1]
            r11 = r1
            android.widget.TextView r11 = (android.widget.TextView) r11
            r1 = 6
            r1 = r0[r1]
            r12 = r1
            android.widget.LinearLayout r12 = (android.widget.LinearLayout) r12
            r1 = 3
            r1 = r0[r1]
            r13 = r1
            android.widget.TextView r13 = (android.widget.TextView) r13
            r1 = 5
            r1 = r0[r1]
            r16 = r1
            android.widget.TextView r16 = (android.widget.TextView) r16
            r1 = 4
            r0 = r0[r1]
            r17 = r0
            android.widget.TextView r17 = (android.widget.TextView) r17
            r18 = 0
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r18
            r14 = r16
            r15 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0 = -1
            r2 = r19
            r2.B = r0
            androidx.constraintlayout.widget.ConstraintLayout r0 = r2.z
            r1 = 0
            r0.setTag(r1)
            ru.rambler.libs.swipe_layout.SwipeLayout r0 = r2.A
            r0.setTag(r1)
            r0 = r21
            r2.a((android.view.View) r0)
            r19.a2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.MessageItemBindingImpl.<init>(h.l.f, android.view.View):void");
    }

    public void V1() {
        synchronized (this) {
            this.B = 0;
        }
    }

    public boolean Z1() {
        synchronized (this) {
            if (this.B != 0) {
                return true;
            }
            return false;
        }
    }

    public boolean a(int i2, Object obj, int i3) {
        return false;
    }

    public void a2() {
        synchronized (this) {
            this.B = 1;
        }
        b2();
    }

    public boolean c(int i2, Object obj) {
        return true;
    }
}
