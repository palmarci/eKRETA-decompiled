package hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import h.l.i;
import hu.ekreta.ellenorzo.generated.callback.OnRefreshListener;
import hu.ekreta.ellenorzo.notes.NotesViewModel;

public class FragmentNotesBindingImpl extends FragmentNotesBinding implements OnRefreshListener.Listener {
    public static final ViewDataBinding.f G = null;
    public static final SparseIntArray H = null;
    public final ConstraintLayout D;
    public final SwipeRefreshLayout.h E;
    public long F = -1;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FragmentNotesBindingImpl(h.l.f r11, android.view.View r12) {
        /*
            r10 = this;
            androidx.databinding.ViewDataBinding$f r0 = G
            android.util.SparseIntArray r1 = H
            r2 = 4
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.a((h.l.f) r11, (android.view.View) r12, (int) r2, (androidx.databinding.ViewDataBinding.f) r0, (android.util.SparseIntArray) r1)
            r1 = 1
            r2 = r0[r1]
            r7 = r2
            android.widget.TextView r7 = (android.widget.TextView) r7
            r2 = 2
            r2 = r0[r2]
            r8 = r2
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r8 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r8
            r2 = 3
            r2 = r0[r2]
            r9 = r2
            androidx.recyclerview.widget.RecyclerView r9 = (androidx.recyclerview.widget.RecyclerView) r9
            r6 = 1
            r3 = r10
            r4 = r11
            r5 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r2 = -1
            r10.F = r2
            android.widget.TextView r11 = r10.z
            r2 = 0
            r11.setTag(r2)
            r11 = 0
            r11 = r0[r11]
            androidx.constraintlayout.widget.ConstraintLayout r11 = (androidx.constraintlayout.widget.ConstraintLayout) r11
            r10.D = r11
            androidx.constraintlayout.widget.ConstraintLayout r11 = r10.D
            r11.setTag(r2)
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r11 = r10.A
            r11.setTag(r2)
            androidx.recyclerview.widget.RecyclerView r11 = r10.B
            r11.setTag(r2)
            r10.a((android.view.View) r12)
            hu.ekreta.ellenorzo.generated.callback.OnRefreshListener r11 = new hu.ekreta.ellenorzo.generated.callback.OnRefreshListener
            r11.<init>(r10, r1)
            r10.E = r11
            r10.a2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.FragmentNotesBindingImpl.<init>(h.l.f, android.view.View):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void V1() {
        /*
            r19 = this;
            r1 = r19
            monitor-enter(r19)
            long r2 = r1.F     // Catch:{ all -> 0x0098 }
            r4 = 0
            r1.F = r4     // Catch:{ all -> 0x0098 }
            monitor-exit(r19)     // Catch:{ all -> 0x0098 }
            hu.ekreta.ellenorzo.notes.NotesViewModel r0 = r1.C
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
            boolean r6 = r0.d()
            goto L_0x0028
        L_0x0027:
            r6 = 0
        L_0x0028:
            long r15 = r2 & r8
            r7 = 8
            int r17 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r17 == 0) goto L_0x0049
            if (r0 == 0) goto L_0x0037
            boolean r15 = r0.g()
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
            boolean r0 = r0.f()
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
            android.widget.TextView r0 = r1.z
            r0.setVisibility(r14)
        L_0x0075:
            r12 = 16
            long r12 = r12 & r2
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0083
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r0 = r1.A
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout$h r7 = r1.E
            r0.setOnRefreshListener(r7)
        L_0x0083:
            long r10 = r10 & r2
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x008d
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r0 = r1.A
            r0.setRefreshing(r6)
        L_0x008d:
            long r2 = r2 & r8
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0097
            androidx.recyclerview.widget.RecyclerView r0 = r1.B
            r0.setVisibility(r15)
        L_0x0097:
            return
        L_0x0098:
            r0 = move-exception
            monitor-exit(r19)     // Catch:{ all -> 0x0098 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.FragmentNotesBindingImpl.V1():void");
    }

    public boolean Z1() {
        synchronized (this) {
            if (this.F != 0) {
                return true;
            }
            return false;
        }
    }

    public void a(NotesViewModel notesViewModel) {
        a(0, (i) notesViewModel);
        this.C = notesViewModel;
        synchronized (this) {
            this.F |= 1;
        }
        c(88);
        super.b2();
    }

    public void a2() {
        synchronized (this) {
            this.F = 16;
        }
        b2();
    }

    public final void b(int i2) {
        NotesViewModel notesViewModel = this.C;
        if (notesViewModel != null) {
            notesViewModel.e();
        }
    }

    public boolean c(int i2, Object obj) {
        if (88 != i2) {
            return false;
        }
        a((NotesViewModel) obj);
        return true;
    }

    public final boolean e(int i2) {
        if (i2 == 0) {
            synchronized (this) {
                this.F |= 1;
            }
            return true;
        } else if (i2 == 65) {
            synchronized (this) {
                this.F |= 2;
            }
            return true;
        } else if (i2 == 37) {
            synchronized (this) {
                this.F |= 4;
            }
            return true;
        } else if (i2 != 3) {
            return false;
        } else {
            synchronized (this) {
                this.F |= 8;
            }
            return true;
        }
    }

    public boolean a(int i2, Object obj, int i3) {
        if (i2 != 0) {
            return false;
        }
        NotesViewModel notesViewModel = (NotesViewModel) obj;
        return e(i3);
    }
}
