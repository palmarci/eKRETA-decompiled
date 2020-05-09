package p289hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding.C2867f;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout.C2948h;
import p211h.p258l.C3702f;
import p211h.p258l.C3705i;
import p289hu.ekreta.ellenorzo.generated.callback.OnRefreshListener;
import p289hu.ekreta.ellenorzo.generated.callback.OnRefreshListener.Listener;
import p289hu.ekreta.ellenorzo.reminder.RemindersViewModel;

/* renamed from: hu.ekreta.ellenorzo.databinding.FragmentRemindersBindingImpl */
public class FragmentRemindersBindingImpl extends FragmentRemindersBinding implements Listener {

    /* renamed from: G */
    public static final C2867f f12363G = null;

    /* renamed from: H */
    public static final SparseIntArray f12364H = null;

    /* renamed from: D */
    public final ConstraintLayout f12365D;

    /* renamed from: E */
    public final C2948h f12366E;

    /* renamed from: F */
    public long f12367F = -1;

    public FragmentRemindersBindingImpl(C3702f fVar, View view) {
        Object[] a = ViewDataBinding.m6046a(fVar, view, 4, f12363G, f12364H);
        super(fVar, view, 1, (TextView) a[1], (SwipeRefreshLayout) a[2], (RecyclerView) a[3]);
        this.f12362z.setTag(null);
        this.f12365D = (ConstraintLayout) a[0];
        this.f12365D.setTag(null);
        this.f12359A.setTag(null);
        this.f12360B.setTag(null);
        mo6098a(view);
        this.f12366E = new OnRefreshListener(this, 1);
        mo6095R1();
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0050  */
    /* renamed from: M1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6090M1() {
        /*
            r19 = this;
            r1 = r19
            monitor-enter(r19)
            long r2 = r1.f12367F     // Catch:{ all -> 0x0098 }
            r4 = 0
            r1.f12367F = r4     // Catch:{ all -> 0x0098 }
            monitor-exit(r19)     // Catch:{ all -> 0x0098 }
            hu.ekreta.ellenorzo.reminder.RemindersViewModel r0 = r1.f12361C
            r6 = 31
            long r6 = r6 & r2
            r8 = 25
            r10 = 21
            r12 = 19
            r14 = 0
            int r15 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r15 == 0) goto L_0x0069
            long r6 = r2 & r10
            int r15 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r15 == 0) goto L_0x0027
            if (r0 == 0) goto L_0x0027
            boolean r6 = r0.mo11494d()
            goto L_0x0028
        L_0x0027:
            r6 = 0
        L_0x0028:
            long r15 = r2 & r8
            r7 = 8
            int r17 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r17 == 0) goto L_0x0049
            if (r0 == 0) goto L_0x0037
            boolean r15 = r0.mo11497g()
            goto L_0x0038
        L_0x0037:
            r15 = 0
        L_0x0038:
            if (r17 == 0) goto L_0x0043
            if (r15 == 0) goto L_0x003f
            r16 = 256(0x100, double:1.265E-321)
            goto L_0x0041
        L_0x003f:
            r16 = 128(0x80, double:6.32E-322)
        L_0x0041:
            long r2 = r2 | r16
        L_0x0043:
            if (r15 == 0) goto L_0x0046
            goto L_0x0049
        L_0x0046:
            r15 = 8
            goto L_0x004a
        L_0x0049:
            r15 = 0
        L_0x004a:
            long r16 = r2 & r12
            int r18 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r18 == 0) goto L_0x006b
            if (r0 == 0) goto L_0x0057
            boolean r0 = r0.mo11496f()
            goto L_0x0058
        L_0x0057:
            r0 = 0
        L_0x0058:
            if (r18 == 0) goto L_0x0063
            if (r0 == 0) goto L_0x005f
            r16 = 64
            goto L_0x0061
        L_0x005f:
            r16 = 32
        L_0x0061:
            long r2 = r2 | r16
        L_0x0063:
            if (r0 == 0) goto L_0x0066
            goto L_0x006b
        L_0x0066:
            r14 = 8
            goto L_0x006b
        L_0x0069:
            r6 = 0
            r15 = 0
        L_0x006b:
            long r12 = r12 & r2
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0075
            android.widget.TextView r0 = r1.f12362z
            r0.setVisibility(r14)
        L_0x0075:
            r12 = 16
            long r12 = r12 & r2
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0083
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r0 = r1.f12359A
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout$h r7 = r1.f12366E
            r0.setOnRefreshListener(r7)
        L_0x0083:
            long r10 = r10 & r2
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x008d
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r0 = r1.f12359A
            r0.setRefreshing(r6)
        L_0x008d:
            long r2 = r2 & r8
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0097
            androidx.recyclerview.widget.RecyclerView r0 = r1.f12360B
            r0.setVisibility(r15)
        L_0x0097:
            return
        L_0x0098:
            r0 = move-exception
            monitor-exit(r19)     // Catch:{ all -> 0x0098 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.databinding.FragmentRemindersBindingImpl.mo6090M1():void");
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f12367F != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f12367F = 16;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public void mo12408a(RemindersViewModel remindersViewModel) {
        mo6103a(0, (C3705i) remindersViewModel);
        this.f12361C = remindersViewModel;
        synchronized (this) {
            this.f12367F |= 1;
        }
        mo10512c(88);
        super.mo6096S1();
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (88 != i) {
            return false;
        }
        mo12408a((RemindersViewModel) obj);
        return true;
    }

    /* renamed from: e */
    public final boolean mo12409e(int i) {
        if (i == 0) {
            synchronized (this) {
                this.f12367F |= 1;
            }
            return true;
        } else if (i == 65) {
            synchronized (this) {
                this.f12367F |= 2;
            }
            return true;
        } else if (i == 37) {
            synchronized (this) {
                this.f12367F |= 4;
            }
            return true;
        } else if (i != 3) {
            return false;
        } else {
            synchronized (this) {
                this.f12367F |= 8;
            }
            return true;
        }
    }

    /* renamed from: b */
    public final void mo12351b(int i) {
        RemindersViewModel remindersViewModel = this.f12361C;
        if (remindersViewModel != null) {
            remindersViewModel.mo11495e();
        }
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        RemindersViewModel remindersViewModel = (RemindersViewModel) obj;
        return mo12409e(i2);
    }
}
