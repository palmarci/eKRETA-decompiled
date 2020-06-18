package hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CompoundButton;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import h.l.i;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.generated.callback.OnCheckedChangeListener;
import hu.ekreta.ellenorzo.generated.callback.OnClickListener;
import hu.ekreta.ellenorzo.generated.callback.OnRefreshListener;
import hu.ekreta.ellenorzo.homework.HomeworkDetailViewModel;

public class ActivityHomeworkDetailBindingImpl extends ActivityHomeworkDetailBinding implements OnCheckedChangeListener.Listener, OnClickListener.Listener, OnRefreshListener.Listener {
    public static final ViewDataBinding.f S = null;
    public static final SparseIntArray T = new SparseIntArray();
    public final CoordinatorLayout M;
    public final CompoundButton.OnCheckedChangeListener N;
    public final View.OnClickListener O;
    public final View.OnClickListener P;
    public final SwipeRefreshLayout.h Q;
    public long R = -1;

    static {
        T.put(R.id.app_bar_layout, 13);
        T.put(R.id.toolbar, 14);
        T.put(R.id.nested_scroll_view, 15);
        T.put(R.id.subject_caption, 16);
        T.put(R.id.subject_divider, 17);
        T.put(R.id.record_date_caption, 18);
        T.put(R.id.record_date_divider, 19);
        T.put(R.id.deadline_caption, 20);
        T.put(R.id.deadline_divider, 21);
        T.put(R.id.homework_caption, 22);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActivityHomeworkDetailBindingImpl(h.l.f r29, android.view.View r30) {
        /*
            r28 = this;
            r2 = r28
            r1 = r30
            androidx.databinding.ViewDataBinding$f r0 = S
            android.util.SparseIntArray r3 = T
            r4 = 23
            r15 = r29
            java.lang.Object[] r26 = androidx.databinding.ViewDataBinding.a((h.l.f) r15, (android.view.View) r1, (int) r4, (androidx.databinding.ViewDataBinding.f) r0, (android.util.SparseIntArray) r3)
            r0 = 13
            r0 = r26[r0]
            r4 = r0
            com.google.android.material.appbar.AppBarLayout r4 = (com.google.android.material.appbar.AppBarLayout) r4
            r0 = 9
            r0 = r26[r0]
            r5 = r0
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            r0 = 12
            r0 = r26[r0]
            r6 = r0
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            r0 = 20
            r0 = r26[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 21
            r0 = r26[r0]
            r8 = r0
            android.view.View r8 = (android.view.View) r8
            r0 = 7
            r0 = r26[r0]
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = 2
            r3 = r26[r0]
            r10 = r3
            android.widget.TextView r10 = (android.widget.TextView) r10
            r3 = 4
            r11 = r26[r3]
            android.view.View r11 = (android.view.View) r11
            r14 = 3
            r12 = r26[r14]
            android.widget.TextView r12 = (android.widget.TextView) r12
            r13 = 22
            r13 = r26[r13]
            android.widget.TextView r13 = (android.widget.TextView) r13
            r16 = 10
            r16 = r26[r16]
            android.widget.TextView r16 = (android.widget.TextView) r16
            r14 = r16
            r16 = 11
            r16 = r26[r16]
            com.google.android.material.switchmaterial.SwitchMaterial r16 = (com.google.android.material.switchmaterial.SwitchMaterial) r16
            r15 = r16
            r16 = 8
            r16 = r26[r16]
            android.webkit.WebView r16 = (android.webkit.WebView) r16
            r17 = 15
            r17 = r26[r17]
            androidx.core.widget.NestedScrollView r17 = (androidx.core.widget.NestedScrollView) r17
            r3 = 1
            r18 = r26[r3]
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r18 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r18
            r19 = 18
            r19 = r26[r19]
            android.widget.TextView r19 = (android.widget.TextView) r19
            r20 = 19
            r20 = r26[r20]
            android.view.View r20 = (android.view.View) r20
            r21 = 6
            r21 = r26[r21]
            android.widget.TextView r21 = (android.widget.TextView) r21
            r22 = 16
            r22 = r26[r22]
            android.widget.TextView r22 = (android.widget.TextView) r22
            r23 = 17
            r23 = r26[r23]
            android.view.View r23 = (android.view.View) r23
            r24 = 5
            r24 = r26[r24]
            android.widget.TextView r24 = (android.widget.TextView) r24
            r25 = 14
            r25 = r26[r25]
            androidx.appcompat.widget.Toolbar r25 = (androidx.appcompat.widget.Toolbar) r25
            r27 = 1
            r3 = r27
            r0 = r28
            r1 = r29
            r2 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r0 = -1
            r2 = r28
            r2.R = r0
            com.google.android.material.button.MaterialButton r0 = r2.z
            r1 = 0
            r0.setTag(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r2.A
            r0.setTag(r1)
            android.widget.TextView r0 = r2.B
            r0.setTag(r1)
            android.widget.TextView r0 = r2.C
            r0.setTag(r1)
            android.view.View r0 = r2.D
            r0.setTag(r1)
            android.widget.TextView r0 = r2.E
            r0.setTag(r1)
            android.widget.TextView r0 = r2.F
            r0.setTag(r1)
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r2.G
            r0.setTag(r1)
            android.webkit.WebView r0 = r2.H
            r0.setTag(r1)
            r0 = 0
            r0 = r26[r0]
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r2.M = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r2.M
            r0.setTag(r1)
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r0 = r2.I
            r0.setTag(r1)
            android.widget.TextView r0 = r2.J
            r0.setTag(r1)
            android.widget.TextView r0 = r2.K
            r0.setTag(r1)
            r0 = r30
            r2.a((android.view.View) r0)
            hu.ekreta.ellenorzo.generated.callback.OnCheckedChangeListener r0 = new hu.ekreta.ellenorzo.generated.callback.OnCheckedChangeListener
            r1 = 4
            r0.<init>(r2, r1)
            r2.N = r0
            hu.ekreta.ellenorzo.generated.callback.OnClickListener r0 = new hu.ekreta.ellenorzo.generated.callback.OnClickListener
            r1 = 2
            r0.<init>(r2, r1)
            r2.O = r0
            hu.ekreta.ellenorzo.generated.callback.OnClickListener r0 = new hu.ekreta.ellenorzo.generated.callback.OnClickListener
            r1 = 3
            r0.<init>(r2, r1)
            r2.P = r0
            hu.ekreta.ellenorzo.generated.callback.OnRefreshListener r0 = new hu.ekreta.ellenorzo.generated.callback.OnRefreshListener
            r1 = 1
            r0.<init>(r2, r1)
            r2.Q = r0
            r28.a2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.ActivityHomeworkDetailBindingImpl.<init>(h.l.f, android.view.View):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00d5, code lost:
        if (r39 != false) goto L_0x00d7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void V1() {
        /*
            r47 = this;
            r1 = r47
            monitor-enter(r47)
            long r2 = r1.R     // Catch:{ all -> 0x0201 }
            r4 = 0
            r1.R = r4     // Catch:{ all -> 0x0201 }
            monitor-exit(r47)     // Catch:{ all -> 0x0201 }
            hu.ekreta.ellenorzo.homework.HomeworkDetailViewModel r0 = r1.L
            r6 = 8191(0x1fff, double:4.047E-320)
            long r6 = r6 & r2
            r8 = 4113(0x1011, double:2.032E-320)
            r10 = 4129(0x1021, double:2.04E-320)
            r12 = 4101(0x1005, double:2.026E-320)
            r14 = 6145(0x1801, double:3.036E-320)
            r16 = 5121(0x1401, double:2.53E-320)
            r18 = 4225(0x1081, double:2.0874E-320)
            r20 = 4609(0x1201, double:2.277E-320)
            r22 = 0
            r23 = 4353(0x1101, double:2.1507E-320)
            r25 = 4099(0x1003, double:2.025E-320)
            r27 = 4161(0x1041, double:2.056E-320)
            r29 = 4105(0x1009, double:2.028E-320)
            r31 = 0
            int r32 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r32 == 0) goto L_0x011c
            long r6 = r2 & r20
            int r32 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r32 == 0) goto L_0x003a
            if (r0 == 0) goto L_0x003a
            java.lang.String r6 = r0.i1()
            goto L_0x003c
        L_0x003a:
            r6 = r22
        L_0x003c:
            long r32 = r2 & r16
            int r7 = (r32 > r4 ? 1 : (r32 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x0049
            if (r0 == 0) goto L_0x0049
            boolean r7 = r0.A0()
            goto L_0x004a
        L_0x0049:
            r7 = 0
        L_0x004a:
            long r32 = r2 & r12
            int r34 = (r32 > r4 ? 1 : (r32 == r4 ? 0 : -1))
            if (r34 == 0) goto L_0x0057
            if (r0 == 0) goto L_0x0057
            java.lang.String r32 = r0.p()
            goto L_0x0059
        L_0x0057:
            r32 = r22
        L_0x0059:
            long r33 = r2 & r8
            int r35 = (r33 > r4 ? 1 : (r33 == r4 ? 0 : -1))
            if (r35 == 0) goto L_0x0066
            if (r0 == 0) goto L_0x0066
            java.lang.String r33 = r0.T0()
            goto L_0x0068
        L_0x0066:
            r33 = r22
        L_0x0068:
            long r34 = r2 & r18
            r36 = 8
            int r37 = (r34 > r4 ? 1 : (r34 == r4 ? 0 : -1))
            if (r37 == 0) goto L_0x008c
            if (r0 == 0) goto L_0x0077
            boolean r34 = r0.Q0()
            goto L_0x0079
        L_0x0077:
            r34 = 0
        L_0x0079:
            if (r37 == 0) goto L_0x0086
            if (r34 == 0) goto L_0x0081
            r37 = 65536(0x10000, double:3.2379E-319)
            goto L_0x0084
        L_0x0081:
            r37 = 32768(0x8000, double:1.61895E-319)
        L_0x0084:
            long r2 = r2 | r37
        L_0x0086:
            if (r34 == 0) goto L_0x0089
            goto L_0x008c
        L_0x0089:
            r34 = 8
            goto L_0x008e
        L_0x008c:
            r34 = 0
        L_0x008e:
            long r37 = r2 & r10
            int r35 = (r37 > r4 ? 1 : (r37 == r4 ? 0 : -1))
            if (r35 == 0) goto L_0x009b
            if (r0 == 0) goto L_0x009b
            java.lang.String r35 = r0.O1()
            goto L_0x009d
        L_0x009b:
            r35 = r22
        L_0x009d:
            long r37 = r2 & r25
            int r39 = (r37 > r4 ? 1 : (r37 == r4 ? 0 : -1))
            if (r39 == 0) goto L_0x00aa
            if (r0 == 0) goto L_0x00aa
            boolean r37 = r0.d()
            goto L_0x00ac
        L_0x00aa:
            r37 = 0
        L_0x00ac:
            long r38 = r2 & r27
            int r40 = (r38 > r4 ? 1 : (r38 == r4 ? 0 : -1))
            if (r40 == 0) goto L_0x00b9
            if (r0 == 0) goto L_0x00b9
            java.lang.String r38 = r0.J0()
            goto L_0x00bb
        L_0x00b9:
            r38 = r22
        L_0x00bb:
            long r39 = r2 & r14
            int r41 = (r39 > r4 ? 1 : (r39 == r4 ? 0 : -1))
            if (r41 == 0) goto L_0x00d7
            if (r0 == 0) goto L_0x00c8
            boolean r39 = r0.F1()
            goto L_0x00ca
        L_0x00c8:
            r39 = 0
        L_0x00ca:
            if (r41 == 0) goto L_0x00d5
            if (r39 == 0) goto L_0x00d1
            r40 = 16384(0x4000, double:8.0948E-320)
            goto L_0x00d3
        L_0x00d1:
            r40 = 8192(0x2000, double:4.0474E-320)
        L_0x00d3:
            long r2 = r2 | r40
        L_0x00d5:
            if (r39 == 0) goto L_0x00d9
        L_0x00d7:
            r36 = 0
        L_0x00d9:
            long r39 = r2 & r29
            int r41 = (r39 > r4 ? 1 : (r39 == r4 ? 0 : -1))
            if (r41 == 0) goto L_0x00e5
            if (r0 == 0) goto L_0x00e5
            java.lang.String r22 = r0.j()
        L_0x00e5:
            long r39 = r2 & r23
            int r41 = (r39 > r4 ? 1 : (r39 == r4 ? 0 : -1))
            if (r41 == 0) goto L_0x0107
            if (r0 == 0) goto L_0x0107
            boolean r31 = r0.K0()
            r8 = r6
            r42 = r7
            r46 = r22
            r9 = r31
            r22 = r32
            r45 = r33
            r0 = r34
            r7 = r35
            r6 = r36
            r44 = r37
            r43 = r38
            goto L_0x012c
        L_0x0107:
            r8 = r6
            r42 = r7
            r46 = r22
            r22 = r32
            r45 = r33
            r0 = r34
            r7 = r35
            r6 = r36
            r44 = r37
            r43 = r38
            r9 = 0
            goto L_0x012c
        L_0x011c:
            r7 = r22
            r8 = r7
            r43 = r8
            r45 = r43
            r46 = r45
            r0 = 0
            r6 = 0
            r9 = 0
            r42 = 0
            r44 = 0
        L_0x012c:
            r33 = 4096(0x1000, double:2.0237E-320)
            long r33 = r2 & r33
            int r35 = (r33 > r4 ? 1 : (r33 == r4 ? 0 : -1))
            if (r35 == 0) goto L_0x0149
            com.google.android.material.button.MaterialButton r12 = r1.z
            android.view.View$OnClickListener r13 = r1.O
            r12.setOnClickListener(r13)
            com.google.android.material.switchmaterial.SwitchMaterial r12 = r1.G
            android.widget.CompoundButton$OnCheckedChangeListener r13 = r1.N
            r12.setOnCheckedChangeListener(r13)
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r12 = r1.I
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout$h r13 = r1.Q
            r12.setOnRefreshListener(r13)
        L_0x0149:
            long r12 = r2 & r18
            int r18 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r18 == 0) goto L_0x0154
            com.google.android.material.button.MaterialButton r12 = r1.z
            r12.setVisibility(r0)
        L_0x0154:
            long r12 = r2 & r14
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x015f
            androidx.recyclerview.widget.RecyclerView r0 = r1.A
            r0.setVisibility(r6)
        L_0x015f:
            long r10 = r10 & r2
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0169
            android.widget.TextView r0 = r1.B
            g.a.a.b.a.a((android.widget.TextView) r0, (java.lang.CharSequence) r7)
        L_0x0169:
            r6 = 4101(0x1005, double:2.026E-320)
            long r6 = r6 & r2
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0192
            android.widget.TextView r0 = r1.C
            int r6 = hu.ekreta.ellenorzo.util.binding.BindingConverters.a((java.lang.String) r22)
            r0.setVisibility(r6)
            android.view.View r0 = r1.D
            int r6 = hu.ekreta.ellenorzo.util.binding.BindingConverters.a((java.lang.String) r22)
            r0.setVisibility(r6)
            android.widget.TextView r0 = r1.E
            r6 = r22
            g.a.a.b.a.a((android.widget.TextView) r0, (java.lang.CharSequence) r6)
            android.widget.TextView r0 = r1.E
            int r6 = hu.ekreta.ellenorzo.util.binding.BindingConverters.a((java.lang.String) r6)
            r0.setVisibility(r6)
        L_0x0192:
            long r6 = r2 & r20
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x019d
            android.widget.TextView r0 = r1.F
            g.a.a.b.a.a((android.widget.TextView) r0, (java.lang.CharSequence) r8)
        L_0x019d:
            long r6 = r2 & r23
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x01b6
            android.widget.TextView r0 = r1.F
            android.view.View$OnClickListener r6 = r1.P
            r0.setOnClickListener(r6)
            r0.setClickable(r9)
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r1.G
            int r6 = hu.ekreta.ellenorzo.util.binding.BindingConverters.a((boolean) r9)
            r0.setVisibility(r6)
        L_0x01b6:
            long r6 = r2 & r16
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x01c9
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r1.G
            boolean r6 = r0.isChecked()
            r7 = r42
            if (r6 == r7) goto L_0x01c9
            r0.setChecked(r7)
        L_0x01c9:
            long r6 = r2 & r27
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x01d8
            android.webkit.WebView r0 = r1.H
            hu.ekreta.ellenorzo.util.binding.WebViewBindings$Companion r6 = hu.ekreta.ellenorzo.util.binding.WebViewBindings.Companion
            r7 = r43
            r6.a(r0, r7)
        L_0x01d8:
            long r6 = r2 & r25
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x01e5
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r0 = r1.I
            r6 = r44
            r0.setRefreshing(r6)
        L_0x01e5:
            r6 = 4113(0x1011, double:2.032E-320)
            long r6 = r6 & r2
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x01f3
            android.widget.TextView r0 = r1.J
            r6 = r45
            g.a.a.b.a.a((android.widget.TextView) r0, (java.lang.CharSequence) r6)
        L_0x01f3:
            long r2 = r2 & r29
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0200
            android.widget.TextView r0 = r1.K
            r2 = r46
            g.a.a.b.a.a((android.widget.TextView) r0, (java.lang.CharSequence) r2)
        L_0x0200:
            return
        L_0x0201:
            r0 = move-exception
            monitor-exit(r47)     // Catch:{ all -> 0x0201 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.ActivityHomeworkDetailBindingImpl.V1():void");
    }

    public boolean Z1() {
        synchronized (this) {
            if (this.R != 0) {
                return true;
            }
            return false;
        }
    }

    public void a(HomeworkDetailViewModel homeworkDetailViewModel) {
        a(0, (i) homeworkDetailViewModel);
        this.L = homeworkDetailViewModel;
        synchronized (this) {
            this.R |= 1;
        }
        c(88);
        super.b2();
    }

    public void a2() {
        synchronized (this) {
            this.R = 4096;
        }
        b2();
    }

    public final void b(int i2) {
        HomeworkDetailViewModel homeworkDetailViewModel = this.L;
        if (homeworkDetailViewModel != null) {
            homeworkDetailViewModel.e();
        }
    }

    public boolean c(int i2, Object obj) {
        if (88 != i2) {
            return false;
        }
        a((HomeworkDetailViewModel) obj);
        return true;
    }

    public final boolean e(int i2) {
        if (i2 == 0) {
            synchronized (this) {
                this.R |= 1;
            }
            return true;
        } else if (i2 == 37) {
            synchronized (this) {
                this.R |= 2;
            }
            return true;
        } else if (i2 == 79) {
            synchronized (this) {
                this.R |= 4;
            }
            return true;
        } else if (i2 == 70) {
            synchronized (this) {
                this.R |= 8;
            }
            return true;
        } else if (i2 == 55) {
            synchronized (this) {
                this.R |= 16;
            }
            return true;
        } else if (i2 == 54) {
            synchronized (this) {
                this.R |= 32;
            }
            return true;
        } else if (i2 == 14) {
            synchronized (this) {
                this.R |= 64;
            }
            return true;
        } else if (i2 == 96) {
            synchronized (this) {
                this.R |= 128;
            }
            return true;
        } else if (i2 == 107) {
            synchronized (this) {
                this.R |= 256;
            }
            return true;
        } else if (i2 == 117) {
            synchronized (this) {
                this.R |= 512;
            }
            return true;
        } else if (i2 == 86) {
            synchronized (this) {
                this.R |= 1024;
            }
            return true;
        } else if (i2 != 81) {
            return false;
        } else {
            synchronized (this) {
                this.R |= 2048;
            }
            return true;
        }
    }

    public boolean a(int i2, Object obj, int i3) {
        if (i2 != 0) {
            return false;
        }
        HomeworkDetailViewModel homeworkDetailViewModel = (HomeworkDetailViewModel) obj;
        return e(i3);
    }

    public final void a(int i2, CompoundButton compoundButton, boolean z) {
        HomeworkDetailViewModel homeworkDetailViewModel = this.L;
        if (homeworkDetailViewModel != null) {
            homeworkDetailViewModel.b(z);
        }
    }

    public final void a(int i2, View view) {
        boolean z = false;
        if (i2 == 2) {
            HomeworkDetailViewModel homeworkDetailViewModel = this.L;
            if (homeworkDetailViewModel != null) {
                z = true;
            }
            if (z) {
                homeworkDetailViewModel.o0();
            }
        } else if (i2 == 3) {
            HomeworkDetailViewModel homeworkDetailViewModel2 = this.L;
            if (homeworkDetailViewModel2 != null) {
                z = true;
            }
            if (z) {
                homeworkDetailViewModel2.b(!homeworkDetailViewModel2.A0());
            }
        }
    }
}
