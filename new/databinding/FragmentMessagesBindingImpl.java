package hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import h.l.i;
import h.l.j;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.generated.callback.OnRefreshListener;
import hu.ekreta.ellenorzo.message.MessagesViewModel;

public class FragmentMessagesBindingImpl extends FragmentMessagesBinding implements OnRefreshListener.Listener {
    public static final ViewDataBinding.f J = null;
    public static final SparseIntArray K = new SparseIntArray();
    public final FrameLayout G;
    public final SwipeRefreshLayout.h H;
    public long I = -1;

    static {
        K.put(R.id.message_tab_layout, 7);
        K.put(R.id.inbox, 8);
        K.put(R.id.sent, 9);
        K.put(R.id.deleted, 10);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FragmentMessagesBindingImpl(h.l.f r20, android.view.View r21) {
        /*
            r19 = this;
            r14 = r19
            r15 = r21
            androidx.databinding.ViewDataBinding$f r0 = J
            android.util.SparseIntArray r1 = K
            r2 = 11
            r3 = r20
            java.lang.Object[] r16 = androidx.databinding.ViewDataBinding.a((h.l.f) r3, (android.view.View) r15, (int) r2, (androidx.databinding.ViewDataBinding.f) r0, (android.util.SparseIntArray) r1)
            r0 = 10
            r0 = r16[r0]
            r4 = r0
            com.google.android.material.tabs.TabItem r4 = (com.google.android.material.tabs.TabItem) r4
            r0 = 4
            r0 = r16[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 8
            r0 = r16[r0]
            r6 = r0
            com.google.android.material.tabs.TabItem r6 = (com.google.android.material.tabs.TabItem) r6
            r0 = 7
            r0 = r16[r0]
            r7 = r0
            com.google.android.material.tabs.TabLayout r7 = (com.google.android.material.tabs.TabLayout) r7
            r0 = 3
            r0 = r16[r0]
            r8 = r0
            androidx.constraintlayout.widget.ConstraintLayout r8 = (androidx.constraintlayout.widget.ConstraintLayout) r8
            r0 = 2
            r0 = r16[r0]
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r13 = 1
            r0 = r16[r13]
            r10 = r0
            android.widget.ProgressBar r10 = (android.widget.ProgressBar) r10
            r0 = 5
            r0 = r16[r0]
            r11 = r0
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r11 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r11
            r0 = 6
            r0 = r16[r0]
            r12 = r0
            androidx.recyclerview.widget.RecyclerView r12 = (androidx.recyclerview.widget.RecyclerView) r12
            r0 = 9
            r0 = r16[r0]
            r17 = r0
            com.google.android.material.tabs.TabItem r17 = (com.google.android.material.tabs.TabItem) r17
            r18 = 4
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r18
            r13 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r0 = -1
            r14.I = r0
            android.widget.TextView r0 = r14.z
            r1 = 0
            r0.setTag(r1)
            r0 = 0
            r0 = r16[r0]
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r14.G = r0
            android.widget.FrameLayout r0 = r14.G
            r0.setTag(r1)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r14.A
            r0.setTag(r1)
            android.widget.TextView r0 = r14.B
            r0.setTag(r1)
            android.widget.ProgressBar r0 = r14.C
            r0.setTag(r1)
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r0 = r14.D
            r0.setTag(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r14.E
            r0.setTag(r1)
            r14.a((android.view.View) r15)
            hu.ekreta.ellenorzo.generated.callback.OnRefreshListener r0 = new hu.ekreta.ellenorzo.generated.callback.OnRefreshListener
            r1 = 1
            r0.<init>(r14, r1)
            r14.H = r0
            r19.a2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.FragmentMessagesBindingImpl.<init>(h.l.f, android.view.View):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void V1() {
        /*
            r29 = this;
            r1 = r29
            monitor-enter(r29)
            long r2 = r1.I     // Catch:{ all -> 0x0125 }
            r4 = 0
            r1.I = r4     // Catch:{ all -> 0x0125 }
            monitor-exit(r29)     // Catch:{ all -> 0x0125 }
            hu.ekreta.ellenorzo.message.MessagesViewModel r0 = r1.F
            r6 = 255(0xff, double:1.26E-321)
            long r6 = r6 & r2
            r10 = 137(0x89, double:6.77E-322)
            r12 = 140(0x8c, double:6.9E-322)
            r14 = 168(0xa8, double:8.3E-322)
            r16 = 138(0x8a, double:6.8E-322)
            r18 = 152(0x98, double:7.5E-322)
            r8 = 0
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 == 0) goto L_0x00c2
            long r6 = r2 & r18
            int r22 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r22 == 0) goto L_0x003d
            if (r0 == 0) goto L_0x002b
            boolean r6 = r0.f()
            goto L_0x002c
        L_0x002b:
            r6 = 0
        L_0x002c:
            if (r22 == 0) goto L_0x0037
            if (r6 == 0) goto L_0x0033
            r22 = 512(0x200, double:2.53E-321)
            goto L_0x0035
        L_0x0033:
            r22 = 256(0x100, double:1.265E-321)
        L_0x0035:
            long r2 = r2 | r22
        L_0x0037:
            if (r6 == 0) goto L_0x003a
            goto L_0x003d
        L_0x003a:
            r6 = 8
            goto L_0x003e
        L_0x003d:
            r6 = 0
        L_0x003e:
            long r22 = r2 & r14
            int r7 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x004b
            if (r0 == 0) goto L_0x004b
            boolean r7 = r0.d()
            goto L_0x004c
        L_0x004b:
            r7 = 0
        L_0x004c:
            long r22 = r2 & r10
            r24 = 0
            int r25 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            if (r25 == 0) goto L_0x0067
            if (r0 == 0) goto L_0x005d
            h.l.j r22 = r0.r0()
            r9 = r22
            goto L_0x005f
        L_0x005d:
            r9 = r24
        L_0x005f:
            r1.a((int) r8, (h.l.i) r9)
            if (r9 == 0) goto L_0x0067
            boolean r9 = r9.e
            goto L_0x0068
        L_0x0067:
            r9 = 0
        L_0x0068:
            long r25 = r2 & r16
            int r23 = (r25 > r4 ? 1 : (r25 == r4 ? 0 : -1))
            if (r23 == 0) goto L_0x0082
            if (r0 == 0) goto L_0x0077
            h.l.j r23 = r0.h0()
            r8 = r23
            goto L_0x0079
        L_0x0077:
            r8 = r24
        L_0x0079:
            r14 = 1
            r1.a((int) r14, (h.l.i) r8)
            if (r8 == 0) goto L_0x0082
            boolean r8 = r8.e
            goto L_0x0083
        L_0x0082:
            r8 = 0
        L_0x0083:
            long r14 = r2 & r12
            int r27 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r27 == 0) goto L_0x009a
            if (r0 == 0) goto L_0x008f
            h.l.j r24 = r0.j0()
        L_0x008f:
            r14 = r24
            r15 = 2
            r1.a((int) r15, (h.l.i) r14)
            if (r14 == 0) goto L_0x009a
            boolean r14 = r14.e
            goto L_0x009b
        L_0x009a:
            r14 = 0
        L_0x009b:
            r20 = 200(0xc8, double:9.9E-322)
            long r27 = r2 & r20
            int r15 = (r27 > r4 ? 1 : (r27 == r4 ? 0 : -1))
            if (r15 == 0) goto L_0x00c0
            if (r0 == 0) goto L_0x00aa
            boolean r0 = r0.g()
            goto L_0x00ab
        L_0x00aa:
            r0 = 0
        L_0x00ab:
            if (r15 == 0) goto L_0x00b6
            if (r0 == 0) goto L_0x00b2
            r27 = 2048(0x800, double:1.0118E-320)
            goto L_0x00b4
        L_0x00b2:
            r27 = 1024(0x400, double:5.06E-321)
        L_0x00b4:
            long r2 = r2 | r27
        L_0x00b6:
            if (r0 == 0) goto L_0x00bb
            r22 = 0
            goto L_0x00bd
        L_0x00bb:
            r22 = 8
        L_0x00bd:
            r0 = r22
            goto L_0x00c8
        L_0x00c0:
            r0 = 0
            goto L_0x00c8
        L_0x00c2:
            r0 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r14 = 0
        L_0x00c8:
            long r18 = r2 & r18
            int r15 = (r18 > r4 ? 1 : (r18 == r4 ? 0 : -1))
            if (r15 == 0) goto L_0x00d3
            android.widget.TextView r15 = r1.z
            r15.setVisibility(r6)
        L_0x00d3:
            long r15 = r2 & r16
            int r6 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x00e2
            androidx.constraintlayout.widget.ConstraintLayout r6 = r1.A
            int r8 = hu.ekreta.ellenorzo.util.binding.BindingConverters.a((boolean) r8)
            r6.setVisibility(r8)
        L_0x00e2:
            long r12 = r12 & r2
            int r6 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x00f0
            android.widget.TextView r6 = r1.B
            int r8 = hu.ekreta.ellenorzo.util.binding.BindingConverters.a((boolean) r14)
            r6.setVisibility(r8)
        L_0x00f0:
            long r10 = r10 & r2
            int r6 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x00fe
            android.widget.ProgressBar r6 = r1.C
            int r8 = hu.ekreta.ellenorzo.util.binding.BindingConverters.a((boolean) r9)
            r6.setVisibility(r8)
        L_0x00fe:
            r8 = 128(0x80, double:6.32E-322)
            long r8 = r8 & r2
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x010c
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r6 = r1.D
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout$h r8 = r1.H
            r6.setOnRefreshListener(r8)
        L_0x010c:
            r8 = 168(0xa8, double:8.3E-322)
            long r8 = r8 & r2
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0118
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r6 = r1.D
            r6.setRefreshing(r7)
        L_0x0118:
            r6 = 200(0xc8, double:9.9E-322)
            long r2 = r2 & r6
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0124
            androidx.recyclerview.widget.RecyclerView r2 = r1.E
            r2.setVisibility(r0)
        L_0x0124:
            return
        L_0x0125:
            r0 = move-exception
            monitor-exit(r29)     // Catch:{ all -> 0x0125 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.FragmentMessagesBindingImpl.V1():void");
    }

    public boolean Z1() {
        synchronized (this) {
            if (this.I != 0) {
                return true;
            }
            return false;
        }
    }

    public void a(MessagesViewModel messagesViewModel) {
        a(3, (i) messagesViewModel);
        this.F = messagesViewModel;
        synchronized (this) {
            this.I |= 8;
        }
        c(88);
        super.b2();
    }

    public void a2() {
        synchronized (this) {
            this.I = 128;
        }
        b2();
    }

    public final void b(int i2) {
        MessagesViewModel messagesViewModel = this.F;
        if (messagesViewModel != null) {
            messagesViewModel.e();
        }
    }

    public boolean c(int i2, Object obj) {
        if (88 != i2) {
            return false;
        }
        a((MessagesViewModel) obj);
        return true;
    }

    public final boolean e(int i2) {
        if (i2 == 0) {
            synchronized (this) {
                this.I |= 8;
            }
            return true;
        } else if (i2 == 65) {
            synchronized (this) {
                this.I |= 16;
            }
            return true;
        } else if (i2 == 37) {
            synchronized (this) {
                this.I |= 32;
            }
            return true;
        } else if (i2 != 3) {
            return false;
        } else {
            synchronized (this) {
                this.I |= 64;
            }
            return true;
        }
    }

    public final boolean f(int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.I |= 2;
        }
        return true;
    }

    public final boolean g(int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.I |= 4;
        }
        return true;
    }

    public final boolean h(int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.I |= 1;
        }
        return true;
    }

    public boolean a(int i2, Object obj, int i3) {
        if (i2 == 0) {
            j jVar = (j) obj;
            return h(i3);
        } else if (i2 == 1) {
            j jVar2 = (j) obj;
            return f(i3);
        } else if (i2 == 2) {
            j jVar3 = (j) obj;
            return g(i3);
        } else if (i2 != 3) {
            return false;
        } else {
            MessagesViewModel messagesViewModel = (MessagesViewModel) obj;
            return e(i3);
        }
    }
}
