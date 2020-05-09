package p289hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding.C2867f;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout.C2948h;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import p211h.p258l.C3702f;
import p211h.p258l.C3705i;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.generated.callback.OnClickListener.Listener;
import p289hu.ekreta.ellenorzo.generated.callback.OnRefreshListener;
import p289hu.ekreta.ellenorzo.homework.HomeworkDetailViewModel;

/* renamed from: hu.ekreta.ellenorzo.databinding.ActivityHomeworkDetailBindingImpl */
public class ActivityHomeworkDetailBindingImpl extends ActivityHomeworkDetailBinding implements Listener, OnRefreshListener.Listener {

    /* renamed from: O */
    public static final C2867f f12059O = null;

    /* renamed from: P */
    public static final SparseIntArray f12060P = new SparseIntArray();

    /* renamed from: K */
    public final CoordinatorLayout f12061K;

    /* renamed from: L */
    public final OnClickListener f12062L;

    /* renamed from: M */
    public final C2948h f12063M;

    /* renamed from: N */
    public long f12064N = -1;

    static {
        f12060P.put(C4014R.C4016id.app_bar_layout, 11);
        f12060P.put(C4014R.C4016id.toolbar, 12);
        f12060P.put(C4014R.C4016id.nested_scroll_view, 13);
        f12060P.put(C4014R.C4016id.subject_caption, 14);
        f12060P.put(C4014R.C4016id.subject_divider, 15);
        f12060P.put(C4014R.C4016id.record_date_caption, 16);
        f12060P.put(C4014R.C4016id.record_date_divider, 17);
        f12060P.put(C4014R.C4016id.deadline_caption, 18);
        f12060P.put(C4014R.C4016id.deadline_divider, 19);
        f12060P.put(C4014R.C4016id.homework_caption, 20);
    }

    public ActivityHomeworkDetailBindingImpl(C3702f fVar, View view) {
        Object[] a = ViewDataBinding.m6046a(fVar, view, 21, f12059O, f12060P);
        super(fVar, view, 1, (AppBarLayout) a[11], (MaterialButton) a[9], (RecyclerView) a[10], (TextView) a[18], (View) a[19], (TextView) a[7], (TextView) a[2], (View) a[4], (TextView) a[3], (TextView) a[20], (WebView) a[8], (NestedScrollView) a[13], (SwipeRefreshLayout) a[1], (TextView) a[16], (View) a[17], (TextView) a[6], (TextView) a[14], (View) a[15], (TextView) a[5], (Toolbar) a[12]);
        this.f12058z.setTag(null);
        this.f12048A.setTag(null);
        this.f12049B.setTag(null);
        this.f12050C.setTag(null);
        this.f12051D.setTag(null);
        this.f12052E.setTag(null);
        this.f12053F.setTag(null);
        this.f12061K = (CoordinatorLayout) a[0];
        this.f12061K.setTag(null);
        this.f12054G.setTag(null);
        this.f12055H.setTag(null);
        this.f12056I.setTag(null);
        mo6098a(view);
        this.f12062L = new p289hu.ekreta.ellenorzo.generated.callback.OnClickListener(this, 2);
        this.f12063M = new OnRefreshListener(this, 1);
        mo6095R1();
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x009c  */
    /* renamed from: M1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6090M1() {
        /*
            r36 = this;
            r1 = r36
            monitor-enter(r36)
            long r2 = r1.f12064N     // Catch:{ all -> 0x0170 }
            r4 = 0
            r1.f12064N = r4     // Catch:{ all -> 0x0170 }
            monitor-exit(r36)     // Catch:{ all -> 0x0170 }
            hu.ekreta.ellenorzo.homework.HomeworkDetailViewModel r0 = r1.f12057J
            r6 = 1023(0x3ff, double:5.054E-321)
            long r6 = r6 & r2
            r8 = 521(0x209, double:2.574E-321)
            r10 = 577(0x241, double:2.85E-321)
            r12 = 515(0x203, double:2.544E-321)
            r14 = 545(0x221, double:2.693E-321)
            r16 = 769(0x301, double:3.8E-321)
            r18 = 529(0x211, double:2.614E-321)
            r20 = 641(0x281, double:3.167E-321)
            r22 = 517(0x205, double:2.554E-321)
            r24 = 0
            r25 = 0
            int r26 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r26 == 0) goto L_0x00d2
            long r6 = r2 & r22
            int r26 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r26 == 0) goto L_0x0034
            if (r0 == 0) goto L_0x0034
            java.lang.String r6 = r0.mo12952p()
            goto L_0x0036
        L_0x0034:
            r6 = r24
        L_0x0036:
            long r26 = r2 & r18
            int r7 = (r26 > r4 ? 1 : (r26 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x0043
            if (r0 == 0) goto L_0x0043
            java.lang.String r7 = r0.mo12942Q0()
            goto L_0x0045
        L_0x0043:
            r7 = r24
        L_0x0045:
            long r26 = r2 & r20
            r28 = 8
            int r29 = (r26 > r4 ? 1 : (r26 == r4 ? 0 : -1))
            if (r29 == 0) goto L_0x0067
            if (r0 == 0) goto L_0x0054
            boolean r26 = r0.mo12941N0()
            goto L_0x0056
        L_0x0054:
            r26 = 0
        L_0x0056:
            if (r29 == 0) goto L_0x0061
            if (r26 == 0) goto L_0x005d
            r29 = 8192(0x2000, double:4.0474E-320)
            goto L_0x005f
        L_0x005d:
            r29 = 4096(0x1000, double:2.0237E-320)
        L_0x005f:
            long r2 = r2 | r29
        L_0x0061:
            if (r26 == 0) goto L_0x0064
            goto L_0x0067
        L_0x0064:
            r26 = 8
            goto L_0x0069
        L_0x0067:
            r26 = 0
        L_0x0069:
            long r29 = r2 & r14
            int r27 = (r29 > r4 ? 1 : (r29 == r4 ? 0 : -1))
            if (r27 == 0) goto L_0x0076
            if (r0 == 0) goto L_0x0076
            java.lang.String r27 = r0.mo12939F1()
            goto L_0x0078
        L_0x0076:
            r27 = r24
        L_0x0078:
            long r29 = r2 & r12
            int r31 = (r29 > r4 ? 1 : (r29 == r4 ? 0 : -1))
            if (r31 == 0) goto L_0x0085
            if (r0 == 0) goto L_0x0085
            boolean r29 = r0.mo12946d()
            goto L_0x0087
        L_0x0085:
            r29 = 0
        L_0x0087:
            long r30 = r2 & r10
            int r32 = (r30 > r4 ? 1 : (r30 == r4 ? 0 : -1))
            if (r32 == 0) goto L_0x0094
            if (r0 == 0) goto L_0x0094
            java.lang.String r30 = r0.mo12940I0()
            goto L_0x0096
        L_0x0094:
            r30 = r24
        L_0x0096:
            long r31 = r2 & r16
            int r33 = (r31 > r4 ? 1 : (r31 == r4 ? 0 : -1))
            if (r33 == 0) goto L_0x00b5
            if (r0 == 0) goto L_0x00a3
            boolean r31 = r0.mo12953x1()
            goto L_0x00a5
        L_0x00a3:
            r31 = 0
        L_0x00a5:
            if (r33 == 0) goto L_0x00b0
            if (r31 == 0) goto L_0x00ac
            r32 = 2048(0x800, double:1.0118E-320)
            goto L_0x00ae
        L_0x00ac:
            r32 = 1024(0x400, double:5.06E-321)
        L_0x00ae:
            long r2 = r2 | r32
        L_0x00b0:
            if (r31 == 0) goto L_0x00b3
            goto L_0x00b5
        L_0x00b3:
            r25 = 8
        L_0x00b5:
            long r31 = r2 & r8
            int r28 = (r31 > r4 ? 1 : (r31 == r4 ? 0 : -1))
            if (r28 == 0) goto L_0x00c1
            if (r0 == 0) goto L_0x00c1
            java.lang.String r24 = r0.mo12949j()
        L_0x00c1:
            r34 = r7
            r35 = r24
            r0 = r26
            r7 = r27
            r9 = r29
            r8 = r30
            r24 = r6
            r6 = r25
            goto L_0x00dc
        L_0x00d2:
            r7 = r24
            r8 = r7
            r34 = r8
            r35 = r34
            r0 = 0
            r6 = 0
            r9 = 0
        L_0x00dc:
            r27 = 512(0x200, double:2.53E-321)
            long r27 = r2 & r27
            int r29 = (r27 > r4 ? 1 : (r27 == r4 ? 0 : -1))
            if (r29 == 0) goto L_0x00f2
            com.google.android.material.button.MaterialButton r12 = r1.f12058z
            android.view.View$OnClickListener r13 = r1.f12062L
            r12.setOnClickListener(r13)
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r12 = r1.f12054G
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout$h r13 = r1.f12063M
            r12.setOnRefreshListener(r13)
        L_0x00f2:
            long r12 = r2 & r20
            int r20 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r20 == 0) goto L_0x00fd
            com.google.android.material.button.MaterialButton r12 = r1.f12058z
            r12.setVisibility(r0)
        L_0x00fd:
            long r12 = r2 & r16
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0108
            androidx.recyclerview.widget.RecyclerView r0 = r1.f12048A
            r0.setVisibility(r6)
        L_0x0108:
            long r12 = r2 & r14
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0113
            android.widget.TextView r0 = r1.f12049B
            p204g.p205a.p206a.p208b.C3158a.m7850a(r0, r7)
        L_0x0113:
            long r6 = r2 & r22
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x013b
            android.widget.TextView r0 = r1.f12050C
            int r6 = p289hu.ekreta.ellenorzo.util.binding.BindingConverters.m14793a(r24)
            r0.setVisibility(r6)
            android.view.View r0 = r1.f12051D
            int r6 = p289hu.ekreta.ellenorzo.util.binding.BindingConverters.m14793a(r24)
            r0.setVisibility(r6)
            android.widget.TextView r0 = r1.f12052E
            r6 = r24
            p204g.p205a.p206a.p208b.C3158a.m7850a(r0, r6)
            android.widget.TextView r0 = r1.f12052E
            int r6 = p289hu.ekreta.ellenorzo.util.binding.BindingConverters.m14793a(r6)
            r0.setVisibility(r6)
        L_0x013b:
            long r6 = r2 & r10
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0148
            android.webkit.WebView r0 = r1.f12053F
            hu.ekreta.ellenorzo.util.binding.WebViewBindings$Companion r6 = p289hu.ekreta.ellenorzo.util.binding.WebViewBindings.Companion
            r6.mo16308a(r0, r8)
        L_0x0148:
            r6 = 515(0x203, double:2.544E-321)
            long r6 = r6 & r2
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0154
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r0 = r1.f12054G
            r0.setRefreshing(r9)
        L_0x0154:
            long r6 = r2 & r18
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0161
            android.widget.TextView r0 = r1.f12055H
            r7 = r34
            p204g.p205a.p206a.p208b.C3158a.m7850a(r0, r7)
        L_0x0161:
            r6 = 521(0x209, double:2.574E-321)
            long r2 = r2 & r6
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x016f
            android.widget.TextView r0 = r1.f12056I
            r2 = r35
            p204g.p205a.p206a.p208b.C3158a.m7850a(r0, r2)
        L_0x016f:
            return
        L_0x0170:
            r0 = move-exception
            monitor-exit(r36)     // Catch:{ all -> 0x0170 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.databinding.ActivityHomeworkDetailBindingImpl.mo6090M1():void");
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f12064N != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f12064N = 512;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public void mo12350a(HomeworkDetailViewModel homeworkDetailViewModel) {
        mo6103a(0, (C3705i) homeworkDetailViewModel);
        this.f12057J = homeworkDetailViewModel;
        synchronized (this) {
            this.f12064N |= 1;
        }
        mo10512c(88);
        super.mo6096S1();
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (88 != i) {
            return false;
        }
        mo12350a((HomeworkDetailViewModel) obj);
        return true;
    }

    /* renamed from: e */
    public final boolean mo12352e(int i) {
        if (i == 0) {
            synchronized (this) {
                this.f12064N |= 1;
            }
            return true;
        } else if (i == 37) {
            synchronized (this) {
                this.f12064N |= 2;
            }
            return true;
        } else if (i == 79) {
            synchronized (this) {
                this.f12064N |= 4;
            }
            return true;
        } else if (i == 70) {
            synchronized (this) {
                this.f12064N |= 8;
            }
            return true;
        } else if (i == 54) {
            synchronized (this) {
                this.f12064N |= 16;
            }
            return true;
        } else if (i == 53) {
            synchronized (this) {
                this.f12064N |= 32;
            }
            return true;
        } else if (i == 15) {
            synchronized (this) {
                this.f12064N |= 64;
            }
            return true;
        } else if (i == 94) {
            synchronized (this) {
                this.f12064N |= 128;
            }
            return true;
        } else if (i != 81) {
            return false;
        } else {
            synchronized (this) {
                this.f12064N |= 256;
            }
            return true;
        }
    }

    /* renamed from: b */
    public final void mo12351b(int i) {
        HomeworkDetailViewModel homeworkDetailViewModel = this.f12057J;
        if (homeworkDetailViewModel != null) {
            homeworkDetailViewModel.mo12947e();
        }
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        HomeworkDetailViewModel homeworkDetailViewModel = (HomeworkDetailViewModel) obj;
        return mo12352e(i2);
    }

    /* renamed from: a */
    public final void mo12329a(int i, View view) {
        HomeworkDetailViewModel homeworkDetailViewModel = this.f12057J;
        if (homeworkDetailViewModel != null) {
            homeworkDetailViewModel.mo12951o0();
        }
    }
}
