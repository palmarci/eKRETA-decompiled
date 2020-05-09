package p289hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding.C2867f;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout.C2948h;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import p211h.p258l.C3702f;
import p211h.p258l.C3705i;
import p211h.p258l.C3707j;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.generated.callback.OnRefreshListener;
import p289hu.ekreta.ellenorzo.generated.callback.OnRefreshListener.Listener;
import p289hu.ekreta.ellenorzo.message.MessagesViewModel;

/* renamed from: hu.ekreta.ellenorzo.databinding.FragmentMessagesBindingImpl */
public class FragmentMessagesBindingImpl extends FragmentMessagesBinding implements Listener {

    /* renamed from: J */
    public static final C2867f f12321J = null;

    /* renamed from: K */
    public static final SparseIntArray f12322K = new SparseIntArray();

    /* renamed from: G */
    public final FrameLayout f12323G;

    /* renamed from: H */
    public final C2948h f12324H;

    /* renamed from: I */
    public long f12325I = -1;

    static {
        f12322K.put(C4014R.C4016id.message_tab_layout, 7);
        f12322K.put(C4014R.C4016id.inbox, 8);
        f12322K.put(C4014R.C4016id.sent, 9);
        f12322K.put(C4014R.C4016id.deleted, 10);
    }

    public FragmentMessagesBindingImpl(C3702f fVar, View view) {
        View view2 = view;
        Object[] a = ViewDataBinding.m6046a(fVar, view2, 11, f12321J, f12322K);
        super(fVar, view, 4, (TabItem) a[10], (TextView) a[4], (TabItem) a[8], (TabLayout) a[7], (ConstraintLayout) a[3], (TextView) a[2], (ProgressBar) a[1], (SwipeRefreshLayout) a[5], (RecyclerView) a[6], (TabItem) a[9]);
        this.f12320z.setTag(null);
        this.f12323G = (FrameLayout) a[0];
        this.f12323G.setTag(null);
        this.f12314A.setTag(null);
        this.f12315B.setTag(null);
        this.f12316C.setTag(null);
        this.f12317D.setTag(null);
        this.f12318E.setTag(null);
        mo6098a(view2);
        this.f12324H = new OnRefreshListener(this, 1);
        mo6095R1();
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c0  */
    /* renamed from: M1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6090M1() {
        /*
            r29 = this;
            r1 = r29
            monitor-enter(r29)
            long r2 = r1.f12325I     // Catch:{ all -> 0x0125 }
            r4 = 0
            r1.f12325I = r4     // Catch:{ all -> 0x0125 }
            monitor-exit(r29)     // Catch:{ all -> 0x0125 }
            hu.ekreta.ellenorzo.message.MessagesViewModel r0 = r1.f12319F
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
            boolean r6 = r0.mo11496f()
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
            boolean r7 = r0.mo11494d()
            goto L_0x004c
        L_0x004b:
            r7 = 0
        L_0x004c:
            long r22 = r2 & r10
            r24 = 0
            int r25 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            if (r25 == 0) goto L_0x0067
            if (r0 == 0) goto L_0x005d
            h.l.j r22 = r0.mo13450r0()
            r9 = r22
            goto L_0x005f
        L_0x005d:
            r9 = r24
        L_0x005f:
            r1.mo6103a(r8, r9)
            if (r9 == 0) goto L_0x0067
            boolean r9 = r9.f10170e
            goto L_0x0068
        L_0x0067:
            r9 = 0
        L_0x0068:
            long r25 = r2 & r16
            int r23 = (r25 > r4 ? 1 : (r25 == r4 ? 0 : -1))
            if (r23 == 0) goto L_0x0082
            if (r0 == 0) goto L_0x0077
            h.l.j r23 = r0.mo13447h0()
            r8 = r23
            goto L_0x0079
        L_0x0077:
            r8 = r24
        L_0x0079:
            r14 = 1
            r1.mo6103a(r14, r8)
            if (r8 == 0) goto L_0x0082
            boolean r8 = r8.f10170e
            goto L_0x0083
        L_0x0082:
            r8 = 0
        L_0x0083:
            long r14 = r2 & r12
            int r27 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r27 == 0) goto L_0x009a
            if (r0 == 0) goto L_0x008f
            h.l.j r24 = r0.mo13448j0()
        L_0x008f:
            r14 = r24
            r15 = 2
            r1.mo6103a(r15, r14)
            if (r14 == 0) goto L_0x009a
            boolean r14 = r14.f10170e
            goto L_0x009b
        L_0x009a:
            r14 = 0
        L_0x009b:
            r20 = 200(0xc8, double:9.9E-322)
            long r27 = r2 & r20
            int r15 = (r27 > r4 ? 1 : (r27 == r4 ? 0 : -1))
            if (r15 == 0) goto L_0x00c0
            if (r0 == 0) goto L_0x00aa
            boolean r0 = r0.mo11497g()
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
            android.widget.TextView r15 = r1.f12320z
            r15.setVisibility(r6)
        L_0x00d3:
            long r15 = r2 & r16
            int r6 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x00e2
            androidx.constraintlayout.widget.ConstraintLayout r6 = r1.f12314A
            int r8 = p289hu.ekreta.ellenorzo.util.binding.BindingConverters.m14795a(r8)
            r6.setVisibility(r8)
        L_0x00e2:
            long r12 = r12 & r2
            int r6 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x00f0
            android.widget.TextView r6 = r1.f12315B
            int r8 = p289hu.ekreta.ellenorzo.util.binding.BindingConverters.m14795a(r14)
            r6.setVisibility(r8)
        L_0x00f0:
            long r10 = r10 & r2
            int r6 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x00fe
            android.widget.ProgressBar r6 = r1.f12316C
            int r8 = p289hu.ekreta.ellenorzo.util.binding.BindingConverters.m14795a(r9)
            r6.setVisibility(r8)
        L_0x00fe:
            r8 = 128(0x80, double:6.32E-322)
            long r8 = r8 & r2
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x010c
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r6 = r1.f12317D
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout$h r8 = r1.f12324H
            r6.setOnRefreshListener(r8)
        L_0x010c:
            r8 = 168(0xa8, double:8.3E-322)
            long r8 = r8 & r2
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0118
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r6 = r1.f12317D
            r6.setRefreshing(r7)
        L_0x0118:
            r6 = 200(0xc8, double:9.9E-322)
            long r2 = r2 & r6
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0124
            androidx.recyclerview.widget.RecyclerView r2 = r1.f12318E
            r2.setVisibility(r0)
        L_0x0124:
            return
        L_0x0125:
            r0 = move-exception
            monitor-exit(r29)     // Catch:{ all -> 0x0125 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.databinding.FragmentMessagesBindingImpl.mo6090M1():void");
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f12325I != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f12325I = 128;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public void mo12395a(MessagesViewModel messagesViewModel) {
        mo6103a(3, (C3705i) messagesViewModel);
        this.f12319F = messagesViewModel;
        synchronized (this) {
            this.f12325I |= 8;
        }
        mo10512c(88);
        super.mo6096S1();
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (88 != i) {
            return false;
        }
        mo12395a((MessagesViewModel) obj);
        return true;
    }

    /* renamed from: e */
    public final boolean mo12396e(int i) {
        if (i == 0) {
            synchronized (this) {
                this.f12325I |= 8;
            }
            return true;
        } else if (i == 65) {
            synchronized (this) {
                this.f12325I |= 16;
            }
            return true;
        } else if (i == 37) {
            synchronized (this) {
                this.f12325I |= 32;
            }
            return true;
        } else if (i != 3) {
            return false;
        } else {
            synchronized (this) {
                this.f12325I |= 64;
            }
            return true;
        }
    }

    /* renamed from: f */
    public final boolean mo12397f(int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.f12325I |= 2;
        }
        return true;
    }

    /* renamed from: g */
    public final boolean mo12398g(int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.f12325I |= 4;
        }
        return true;
    }

    /* renamed from: h */
    public final boolean mo12399h(int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.f12325I |= 1;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo12351b(int i) {
        MessagesViewModel messagesViewModel = this.f12319F;
        if (messagesViewModel != null) {
            messagesViewModel.mo11495e();
        }
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        if (i == 0) {
            C3707j jVar = (C3707j) obj;
            return mo12399h(i2);
        } else if (i == 1) {
            C3707j jVar2 = (C3707j) obj;
            return mo12397f(i2);
        } else if (i == 2) {
            C3707j jVar3 = (C3707j) obj;
            return mo12398g(i2);
        } else if (i != 3) {
            return false;
        } else {
            MessagesViewModel messagesViewModel = (MessagesViewModel) obj;
            return mo12396e(i2);
        }
    }
}
