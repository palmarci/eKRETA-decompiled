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

/* renamed from: hu.ekreta.ellenorzo.databinding.MessageItemBindingImpl */
public class MessageItemBindingImpl extends MessageItemBinding {

    /* renamed from: C */
    public static final C2867f f12532C = null;

    /* renamed from: D */
    public static final SparseIntArray f12533D = new SparseIntArray();

    /* renamed from: B */
    public long f12534B = -1;

    static {
        f12533D.put(C4014R.C4016id.attachmentIcon, 2);
        f12533D.put(C4014R.C4016id.senderNameLabel, 3);
        f12533D.put(C4014R.C4016id.subjectLabel, 4);
        f12533D.put(C4014R.C4016id.sentDateLabel, 5);
        f12533D.put(C4014R.C4016id.right_view, 6);
        f12533D.put(C4014R.C4016id.deleteIcon, 7);
        f12533D.put(C4014R.C4016id.deleteText, 8);
        f12533D.put(C4014R.C4016id.left_view, 9);
        f12533D.put(C4014R.C4016id.readStateText, 10);
        f12533D.put(C4014R.C4016id.readStateIcon, 11);
    }

    public MessageItemBindingImpl(C3702f fVar, View view) {
        Object[] a = ViewDataBinding.m6046a(fVar, view, 12, f12532C, f12533D);
        ImageView imageView = (ImageView) a[2];
        ImageView imageView2 = (ImageView) a[7];
        TextView textView = (TextView) a[8];
        ConstraintLayout constraintLayout = (ConstraintLayout) a[1];
        LinearLayout linearLayout = (LinearLayout) a[9];
        SwipeLayout swipeLayout = (SwipeLayout) a[0];
        ImageView imageView3 = (ImageView) a[11];
        TextView textView2 = (TextView) a[10];
        LinearLayout linearLayout2 = (LinearLayout) a[6];
        TextView textView3 = (TextView) a[3];
        TextView textView4 = (TextView) a[5];
        super(fVar, view, 0, imageView, imageView2, textView, constraintLayout, linearLayout, swipeLayout, imageView3, textView2, linearLayout2, textView3, textView4, (TextView) a[4]);
        this.f12531z.setTag(null);
        this.f12530A.setTag(null);
        mo6098a(view);
        mo6095R1();
    }

    /* renamed from: M1 */
    public void mo6090M1() {
        synchronized (this) {
            this.f12534B = 0;
        }
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f12534B != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f12534B = 1;
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
