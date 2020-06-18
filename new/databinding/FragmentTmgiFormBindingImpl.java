package hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import g.a.a.b.a;
import h.l.h;
import h.l.i;
import h.l.k;
import h.l.l;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.cases.tmgi.TmgiFormViewModel;
import hu.ekreta.ellenorzo.generated.callback.ItemSelectedListener;
import hu.ekreta.ellenorzo.generated.callback.OnClickListener;

public class FragmentTmgiFormBindingImpl extends FragmentTmgiFormBinding implements OnClickListener.Listener, ItemSelectedListener.Listener {
    public static final ViewDataBinding.f a0 = null;
    public static final SparseIntArray b0 = new SparseIntArray();
    public final CoordinatorLayout O;
    public final ConstraintLayout P;
    public final View.OnClickListener Q;
    public final hu.ekreta.ellenorzo.util.binding.ItemSelectedListener R;
    public final View.OnClickListener S;
    public final View.OnClickListener T;
    public final View.OnClickListener U;
    public final View.OnClickListener V;
    public final View.OnClickListener W;
    public h X = new h() {
        public void a() {
            String d2 = a.d((TextView) FragmentTmgiFormBindingImpl.this.E);
            TmgiFormViewModel tmgiFormViewModel = FragmentTmgiFormBindingImpl.this.N;
            if (tmgiFormViewModel != null) {
                tmgiFormViewModel.i(d2);
            }
        }
    };
    public h Y = new h() {
        public void a() {
            String d2 = a.d((TextView) FragmentTmgiFormBindingImpl.this.G);
            TmgiFormViewModel tmgiFormViewModel = FragmentTmgiFormBindingImpl.this.N;
            if (tmgiFormViewModel != null) {
                tmgiFormViewModel.m(d2);
            }
        }
    };
    public long Z = -1;

    static {
        b0.put(R.id.app_bar_layout, 16);
        b0.put(R.id.nested_scroll_view, 17);
        b0.put(R.id.startDatePicker_textInputLayout, 18);
        b0.put(R.id.endDatePicker_textInputLayout, 19);
        b0.put(R.id.caseTypeNamesTextInputLayout, 20);
        b0.put(R.id.form_reason_title_textView, 21);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FragmentTmgiFormBindingImpl(h.l.f r27, android.view.View r28) {
        /*
            r26 = this;
            r2 = r26
            r1 = r28
            androidx.databinding.ViewDataBinding$f r0 = a0
            android.util.SparseIntArray r3 = b0
            r4 = 22
            r15 = r27
            java.lang.Object[] r24 = androidx.databinding.ViewDataBinding.a((h.l.f) r15, (android.view.View) r1, (int) r4, (androidx.databinding.ViewDataBinding.f) r0, (android.util.SparseIntArray) r3)
            r0 = 11
            r0 = r24[r0]
            r4 = r0
            android.widget.Button r4 = (android.widget.Button) r4
            r0 = 9
            r0 = r24[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 14
            r0 = r24[r0]
            r6 = r0
            android.widget.Button r6 = (android.widget.Button) r6
            r0 = 12
            r0 = r24[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 16
            r0 = r24[r0]
            r8 = r0
            com.google.android.material.appbar.AppBarLayout r8 = (com.google.android.material.appbar.AppBarLayout) r8
            r0 = 8
            r0 = r24[r0]
            r9 = r0
            android.widget.Button r9 = (android.widget.Button) r9
            r0 = 5
            r3 = r24[r0]
            r10 = r3
            android.widget.AutoCompleteTextView r10 = (android.widget.AutoCompleteTextView) r10
            r3 = 20
            r3 = r24[r3]
            r11 = r3
            com.google.android.material.textfield.TextInputLayout r11 = (com.google.android.material.textfield.TextInputLayout) r11
            r3 = 19
            r3 = r24[r3]
            r12 = r3
            com.google.android.material.textfield.TextInputLayout r12 = (com.google.android.material.textfield.TextInputLayout) r12
            r3 = 4
            r13 = r24[r3]
            com.google.android.material.textfield.TextInputEditText r13 = (com.google.android.material.textfield.TextInputEditText) r13
            r14 = 6
            r16 = r24[r14]
            android.widget.EditText r16 = (android.widget.EditText) r16
            r14 = r16
            r16 = 21
            r16 = r24[r16]
            android.widget.TextView r16 = (android.widget.TextView) r16
            r15 = r16
            r16 = 10
            r16 = r24[r16]
            hu.ekreta.ellenorzo.attachment.AttachmentView r16 = (hu.ekreta.ellenorzo.attachment.AttachmentView) r16
            r17 = 17
            r17 = r24[r17]
            androidx.core.widget.NestedScrollView r17 = (androidx.core.widget.NestedScrollView) r17
            r18 = 13
            r18 = r24[r18]
            hu.ekreta.ellenorzo.attachment.AttachmentView r18 = (hu.ekreta.ellenorzo.attachment.AttachmentView) r18
            r19 = 15
            r19 = r24[r19]
            android.widget.FrameLayout r19 = (android.widget.FrameLayout) r19
            r3 = 7
            r20 = r24[r3]
            android.widget.Button r20 = (android.widget.Button) r20
            r21 = 18
            r21 = r24[r21]
            com.google.android.material.textfield.TextInputLayout r21 = (com.google.android.material.textfield.TextInputLayout) r21
            r3 = 3
            r22 = r24[r3]
            com.google.android.material.textfield.TextInputEditText r22 = (com.google.android.material.textfield.TextInputEditText) r22
            r3 = 1
            r23 = r24[r3]
            androidx.appcompat.widget.Toolbar r23 = (androidx.appcompat.widget.Toolbar) r23
            r25 = 4
            r3 = r25
            r0 = r26
            r1 = r27
            r2 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            hu.ekreta.ellenorzo.databinding.FragmentTmgiFormBindingImpl$1 r0 = new hu.ekreta.ellenorzo.databinding.FragmentTmgiFormBindingImpl$1
            r1 = r26
            r0.<init>()
            r1.X = r0
            hu.ekreta.ellenorzo.databinding.FragmentTmgiFormBindingImpl$2 r0 = new hu.ekreta.ellenorzo.databinding.FragmentTmgiFormBindingImpl$2
            r0.<init>()
            r1.Y = r0
            r2 = -1
            r1.Z = r2
            android.widget.Button r0 = r1.z
            r2 = 0
            r0.setTag(r2)
            android.widget.TextView r0 = r1.A
            r0.setTag(r2)
            android.widget.Button r0 = r1.B
            r0.setTag(r2)
            android.widget.TextView r0 = r1.C
            r0.setTag(r2)
            android.widget.Button r0 = r1.D
            r0.setTag(r2)
            android.widget.AutoCompleteTextView r0 = r1.E
            r0.setTag(r2)
            com.google.android.material.textfield.TextInputEditText r0 = r1.F
            r0.setTag(r2)
            android.widget.EditText r0 = r1.G
            r0.setTag(r2)
            hu.ekreta.ellenorzo.attachment.AttachmentView r0 = r1.H
            r0.setTag(r2)
            r0 = 0
            r0 = r24[r0]
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r1.O = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r1.O
            r0.setTag(r2)
            r0 = 2
            r3 = r24[r0]
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r1.P = r3
            androidx.constraintlayout.widget.ConstraintLayout r3 = r1.P
            r3.setTag(r2)
            hu.ekreta.ellenorzo.attachment.AttachmentView r3 = r1.I
            r3.setTag(r2)
            android.widget.FrameLayout r3 = r1.J
            r3.setTag(r2)
            android.widget.Button r3 = r1.K
            r3.setTag(r2)
            com.google.android.material.textfield.TextInputEditText r3 = r1.L
            r3.setTag(r2)
            androidx.appcompat.widget.Toolbar r3 = r1.M
            r3.setTag(r2)
            r2 = r28
            r1.a((android.view.View) r2)
            hu.ekreta.ellenorzo.generated.callback.OnClickListener r2 = new hu.ekreta.ellenorzo.generated.callback.OnClickListener
            r3 = 7
            r2.<init>(r1, r3)
            r1.Q = r2
            hu.ekreta.ellenorzo.generated.callback.ItemSelectedListener r2 = new hu.ekreta.ellenorzo.generated.callback.ItemSelectedListener
            r3 = 3
            r2.<init>(r1, r3)
            r1.R = r2
            hu.ekreta.ellenorzo.generated.callback.OnClickListener r2 = new hu.ekreta.ellenorzo.generated.callback.OnClickListener
            r3 = 1
            r2.<init>(r1, r3)
            r1.S = r2
            hu.ekreta.ellenorzo.generated.callback.OnClickListener r2 = new hu.ekreta.ellenorzo.generated.callback.OnClickListener
            r3 = 5
            r2.<init>(r1, r3)
            r1.T = r2
            hu.ekreta.ellenorzo.generated.callback.OnClickListener r2 = new hu.ekreta.ellenorzo.generated.callback.OnClickListener
            r3 = 4
            r2.<init>(r1, r3)
            r1.U = r2
            hu.ekreta.ellenorzo.generated.callback.OnClickListener r2 = new hu.ekreta.ellenorzo.generated.callback.OnClickListener
            r3 = 6
            r2.<init>(r1, r3)
            r1.V = r2
            hu.ekreta.ellenorzo.generated.callback.OnClickListener r2 = new hu.ekreta.ellenorzo.generated.callback.OnClickListener
            r2.<init>(r1, r0)
            r1.W = r2
            r26.a2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.FragmentTmgiFormBindingImpl.<init>(h.l.f, android.view.View):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00e0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00f3 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0103  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void V1() {
        /*
            r44 = this;
            r1 = r44
            monitor-enter(r44)
            long r2 = r1.Z     // Catch:{ all -> 0x0258 }
            r4 = 0
            r1.Z = r4     // Catch:{ all -> 0x0258 }
            monitor-exit(r44)     // Catch:{ all -> 0x0258 }
            hu.ekreta.ellenorzo.cases.tmgi.TmgiFormViewModel r0 = r1.N
            r6 = 32767(0x7fff, double:1.6189E-319)
            long r6 = r6 & r2
            r12 = 20488(0x5008, double:1.01224E-319)
            r14 = 16424(0x4028, double:8.1145E-320)
            r16 = 16648(0x4108, double:8.225E-320)
            r18 = 16393(0x4009, double:8.099E-320)
            r20 = 16394(0x400a, double:8.0997E-320)
            r22 = 16520(0x4088, double:8.162E-320)
            r24 = 16904(0x4208, double:8.3517E-320)
            r26 = 16456(0x4048, double:8.1303E-320)
            r28 = 19464(0x4c08, double:9.6165E-320)
            r10 = 0
            int r32 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r32 == 0) goto L_0x013b
            long r6 = r2 & r26
            int r32 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r32 == 0) goto L_0x0033
            if (r0 == 0) goto L_0x0033
            java.lang.String r6 = r0.E0()
            goto L_0x0034
        L_0x0033:
            r6 = 0
        L_0x0034:
            long r32 = r2 & r24
            int r7 = (r32 > r4 ? 1 : (r32 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x0041
            if (r0 == 0) goto L_0x0041
            boolean r7 = r0.p1()
            goto L_0x0042
        L_0x0041:
            r7 = 0
        L_0x0042:
            long r32 = r2 & r22
            int r34 = (r32 > r4 ? 1 : (r32 == r4 ? 0 : -1))
            if (r34 == 0) goto L_0x004f
            if (r0 == 0) goto L_0x004f
            java.lang.String r32 = r0.I1()
            goto L_0x0051
        L_0x004f:
            r32 = 0
        L_0x0051:
            long r33 = r2 & r18
            int r35 = (r33 > r4 ? 1 : (r33 == r4 ? 0 : -1))
            if (r35 == 0) goto L_0x006b
            if (r0 == 0) goto L_0x0060
            h.l.k r33 = r0.T1()
            r11 = r33
            goto L_0x0061
        L_0x0060:
            r11 = 0
        L_0x0061:
            r1.a((int) r10, (h.l.i) r11)
            if (r11 == 0) goto L_0x006b
            T r11 = r11.e
            java.util.List r11 = (java.util.List) r11
            goto L_0x006c
        L_0x006b:
            r11 = 0
        L_0x006c:
            long r34 = r2 & r16
            int r36 = (r34 > r4 ? 1 : (r34 == r4 ? 0 : -1))
            if (r36 == 0) goto L_0x0079
            if (r0 == 0) goto L_0x0079
            java.lang.String r34 = r0.k1()
            goto L_0x007b
        L_0x0079:
            r34 = 0
        L_0x007b:
            long r35 = r2 & r14
            int r37 = (r35 > r4 ? 1 : (r35 == r4 ? 0 : -1))
            if (r37 == 0) goto L_0x0088
            if (r0 == 0) goto L_0x0088
            java.lang.String r35 = r0.R1()
            goto L_0x008a
        L_0x0088:
            r35 = 0
        L_0x008a:
            long r36 = r2 & r28
            r14 = 1
            int r15 = (r36 > r4 ? 1 : (r36 == r4 ? 0 : -1))
            if (r15 == 0) goto L_0x00ad
            if (r0 == 0) goto L_0x009c
            boolean r15 = r0.m1()
            boolean r36 = r0.P1()
            goto L_0x009f
        L_0x009c:
            r15 = 0
            r36 = 0
        L_0x009f:
            r37 = r36 ^ 1
            r8 = 2
            boolean[] r8 = new boolean[r8]
            r8[r10] = r15
            r8[r14] = r37
            boolean r8 = hu.ekreta.ellenorzo.util.binding.BindingUtil.a(r8)
            goto L_0x00b1
        L_0x00ad:
            r8 = 0
            r15 = 0
            r36 = 0
        L_0x00b1:
            long r40 = r2 & r12
            int r9 = (r40 > r4 ? 1 : (r40 == r4 ? 0 : -1))
            if (r9 == 0) goto L_0x00be
            if (r0 == 0) goto L_0x00be
            boolean r9 = r0.R0()
            goto L_0x00bf
        L_0x00be:
            r9 = 0
        L_0x00bf:
            long r40 = r2 & r20
            int r37 = (r40 > r4 ? 1 : (r40 == r4 ? 0 : -1))
            if (r37 == 0) goto L_0x00d7
            if (r0 == 0) goto L_0x00ce
            h.l.l r37 = r0.y0()
            r10 = r37
            goto L_0x00cf
        L_0x00ce:
            r10 = 0
        L_0x00cf:
            r1.a((int) r14, (h.l.i) r10)
            if (r10 == 0) goto L_0x00d7
            int r10 = r10.e
            goto L_0x00d8
        L_0x00d7:
            r10 = 0
        L_0x00d8:
            r38 = 24584(0x6008, double:1.2146E-319)
            long r40 = r2 & r38
            int r14 = (r40 > r4 ? 1 : (r40 == r4 ? 0 : -1))
            if (r14 == 0) goto L_0x00e9
            if (r0 == 0) goto L_0x00e9
            boolean r14 = r0.d()
            r37 = r14
            goto L_0x00eb
        L_0x00e9:
            r37 = 0
        L_0x00eb:
            r40 = 16408(0x4018, double:8.1066E-320)
            long r40 = r2 & r40
            int r14 = (r40 > r4 ? 1 : (r40 == r4 ? 0 : -1))
            if (r14 == 0) goto L_0x00fa
            if (r0 == 0) goto L_0x00fa
            java.lang.String r14 = r0.j1()
            goto L_0x00fb
        L_0x00fa:
            r14 = 0
        L_0x00fb:
            r30 = 16396(0x400c, double:8.1007E-320)
            long r40 = r2 & r30
            int r42 = (r40 > r4 ? 1 : (r40 == r4 ? 0 : -1))
            if (r42 == 0) goto L_0x012c
            if (r0 == 0) goto L_0x010a
            h.l.k r0 = r0.q1()
            goto L_0x010b
        L_0x010a:
            r0 = 0
        L_0x010b:
            r12 = 2
            r1.a((int) r12, (h.l.i) r0)
            if (r0 == 0) goto L_0x0116
            T r0 = r0.e
            hu.ekreta.ellenorzo.cases.subModels.TmgiCaseType r0 = (hu.ekreta.ellenorzo.cases.subModels.TmgiCaseType) r0
            goto L_0x0117
        L_0x0116:
            r0 = 0
        L_0x0117:
            if (r0 == 0) goto L_0x012c
            java.lang.String r0 = r0.f()
            r13 = r7
            r43 = r14
            r7 = r34
            r14 = r35
            r12 = r37
            r37 = r9
            r9 = r0
            r0 = r32
            goto L_0x014c
        L_0x012c:
            r13 = r7
            r43 = r14
            r0 = r32
            r7 = r34
            r14 = r35
            r12 = r37
            r37 = r9
            r9 = 0
            goto L_0x014c
        L_0x013b:
            r0 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r36 = 0
            r37 = 0
            r43 = 0
        L_0x014c:
            long r28 = r2 & r28
            int r32 = (r28 > r4 ? 1 : (r28 == r4 ? 0 : -1))
            if (r32 == 0) goto L_0x0157
            android.widget.Button r4 = r1.z
            r4.setEnabled(r8)
        L_0x0157:
            r4 = 16384(0x4000, double:8.0948E-320)
            long r4 = r4 & r2
            r28 = 0
            int r8 = (r4 > r28 ? 1 : (r4 == r28 ? 0 : -1))
            if (r8 == 0) goto L_0x01a2
            android.widget.Button r4 = r1.z
            android.view.View$OnClickListener r5 = r1.V
            r4.setOnClickListener(r5)
            android.widget.Button r4 = r1.B
            android.view.View$OnClickListener r5 = r1.Q
            r4.setOnClickListener(r5)
            android.widget.Button r4 = r1.D
            android.view.View$OnClickListener r5 = r1.T
            r4.setOnClickListener(r5)
            android.widget.AutoCompleteTextView r4 = r1.E
            hu.ekreta.ellenorzo.util.binding.ItemSelectedListener r5 = r1.R
            hu.ekreta.ellenorzo.util.binding.AutoCompleteTextViewBindings$Companion r8 = hu.ekreta.ellenorzo.util.binding.AutoCompleteTextViewBindings.Companion
            r8.a((android.widget.AutoCompleteTextView) r4, (hu.ekreta.ellenorzo.util.binding.ItemSelectedListener) r5)
            android.widget.AutoCompleteTextView r4 = r1.E
            h.l.h r5 = r1.X
            r8 = 0
            g.a.a.b.a.a((android.widget.TextView) r4, (h.l.o.e) r8, (h.l.o.f) r8, (h.l.o.d) r8, (h.l.h) r5)
            com.google.android.material.textfield.TextInputEditText r4 = r1.F
            android.view.View$OnClickListener r5 = r1.W
            r4.setOnClickListener(r5)
            android.widget.EditText r4 = r1.G
            h.l.h r5 = r1.Y
            g.a.a.b.a.a((android.widget.TextView) r4, (h.l.o.e) r8, (h.l.o.f) r8, (h.l.o.d) r8, (h.l.h) r5)
            android.widget.Button r4 = r1.K
            android.view.View$OnClickListener r5 = r1.U
            r4.setOnClickListener(r5)
            com.google.android.material.textfield.TextInputEditText r4 = r1.L
            android.view.View$OnClickListener r5 = r1.S
            r4.setOnClickListener(r5)
        L_0x01a2:
            r4 = 17416(0x4408, double:8.6046E-320)
            long r4 = r4 & r2
            r28 = 0
            int r8 = (r4 > r28 ? 1 : (r4 == r28 ? 0 : -1))
            if (r8 == 0) goto L_0x01bd
            android.widget.Button r4 = r1.z
            int r5 = hu.ekreta.ellenorzo.util.binding.BindingConverters.a((boolean) r15)
            r4.setVisibility(r5)
            android.widget.TextView r4 = r1.A
            int r5 = hu.ekreta.ellenorzo.util.binding.BindingConverters.a((boolean) r15)
            r4.setVisibility(r5)
        L_0x01bd:
            long r4 = r2 & r20
            int r8 = (r4 > r28 ? 1 : (r4 == r28 ? 0 : -1))
            if (r8 == 0) goto L_0x01c8
            android.widget.TextView r4 = r1.C
            r4.setText(r10)
        L_0x01c8:
            long r4 = r2 & r22
            int r8 = (r4 > r28 ? 1 : (r4 == r28 ? 0 : -1))
            if (r8 == 0) goto L_0x01d3
            android.widget.AutoCompleteTextView r4 = r1.E
            g.a.a.b.a.a((android.widget.TextView) r4, (java.lang.CharSequence) r0)
        L_0x01d3:
            long r4 = r2 & r18
            int r0 = (r4 > r28 ? 1 : (r4 == r28 ? 0 : -1))
            if (r0 == 0) goto L_0x01e0
            android.widget.AutoCompleteTextView r0 = r1.E
            hu.ekreta.ellenorzo.util.binding.AutoCompleteTextViewBindings$Companion r4 = hu.ekreta.ellenorzo.util.binding.AutoCompleteTextViewBindings.Companion
            r4.a((android.widget.AutoCompleteTextView) r0, (java.util.List<hu.ekreta.ellenorzo.cases.subModels.TmgiCaseType>) r11)
        L_0x01e0:
            long r4 = r2 & r26
            int r0 = (r4 > r28 ? 1 : (r4 == r28 ? 0 : -1))
            if (r0 == 0) goto L_0x01eb
            com.google.android.material.textfield.TextInputEditText r0 = r1.F
            g.a.a.b.a.a((android.widget.TextView) r0, (java.lang.CharSequence) r6)
        L_0x01eb:
            long r4 = r2 & r16
            int r0 = (r4 > r28 ? 1 : (r4 == r28 ? 0 : -1))
            if (r0 == 0) goto L_0x01f6
            android.widget.EditText r0 = r1.G
            g.a.a.b.a.a((android.widget.TextView) r0, (java.lang.CharSequence) r7)
        L_0x01f6:
            r4 = 18440(0x4808, double:9.1106E-320)
            long r4 = r4 & r2
            int r0 = (r4 > r28 ? 1 : (r4 == r28 ? 0 : -1))
            if (r0 == 0) goto L_0x0206
            hu.ekreta.ellenorzo.attachment.AttachmentView r0 = r1.H
            int r4 = hu.ekreta.ellenorzo.util.binding.BindingConverters.a((boolean) r36)
            r0.setVisibility(r4)
        L_0x0206:
            r4 = 16396(0x400c, double:8.1007E-320)
            long r4 = r4 & r2
            int r0 = (r4 > r28 ? 1 : (r4 == r28 ? 0 : -1))
            if (r0 == 0) goto L_0x0212
            hu.ekreta.ellenorzo.attachment.AttachmentView r0 = r1.H
            r0.setLabel(r9)
        L_0x0212:
            r4 = 20488(0x5008, double:1.01224E-319)
            long r4 = r4 & r2
            int r0 = (r4 > r28 ? 1 : (r4 == r28 ? 0 : -1))
            if (r0 == 0) goto L_0x0222
            hu.ekreta.ellenorzo.attachment.AttachmentView r0 = r1.I
            int r4 = hu.ekreta.ellenorzo.util.binding.BindingConverters.a((boolean) r37)
            r0.setVisibility(r4)
        L_0x0222:
            r4 = 24584(0x6008, double:1.2146E-319)
            long r4 = r4 & r2
            int r0 = (r4 > r28 ? 1 : (r4 == r28 ? 0 : -1))
            if (r0 == 0) goto L_0x0232
            android.widget.FrameLayout r0 = r1.J
            int r4 = hu.ekreta.ellenorzo.util.binding.BindingConverters.a((boolean) r12)
            r0.setVisibility(r4)
        L_0x0232:
            long r4 = r2 & r24
            int r0 = (r4 > r28 ? 1 : (r4 == r28 ? 0 : -1))
            if (r0 == 0) goto L_0x023d
            android.widget.Button r0 = r1.K
            r0.setEnabled(r13)
        L_0x023d:
            r4 = 16424(0x4028, double:8.1145E-320)
            long r4 = r4 & r2
            int r0 = (r4 > r28 ? 1 : (r4 == r28 ? 0 : -1))
            if (r0 == 0) goto L_0x0249
            com.google.android.material.textfield.TextInputEditText r0 = r1.L
            g.a.a.b.a.a((android.widget.TextView) r0, (java.lang.CharSequence) r14)
        L_0x0249:
            r4 = 16408(0x4018, double:8.1066E-320)
            long r2 = r2 & r4
            int r0 = (r2 > r28 ? 1 : (r2 == r28 ? 0 : -1))
            if (r0 == 0) goto L_0x0257
            androidx.appcompat.widget.Toolbar r0 = r1.M
            r14 = r43
            r0.setSubtitle((java.lang.CharSequence) r14)
        L_0x0257:
            return
        L_0x0258:
            r0 = move-exception
            monitor-exit(r44)     // Catch:{ all -> 0x0258 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.FragmentTmgiFormBindingImpl.V1():void");
    }

    public boolean Z1() {
        synchronized (this) {
            if (this.Z != 0) {
                return true;
            }
            return false;
        }
    }

    public void a(TmgiFormViewModel tmgiFormViewModel) {
        a(3, (i) tmgiFormViewModel);
        this.N = tmgiFormViewModel;
        synchronized (this) {
            this.Z |= 8;
        }
        c(88);
        super.b2();
    }

    public void a2() {
        synchronized (this) {
            this.Z = 16384;
        }
        b2();
    }

    public boolean c(int i2, Object obj) {
        if (88 != i2) {
            return false;
        }
        a((TmgiFormViewModel) obj);
        return true;
    }

    public final boolean e(int i2) {
        if (i2 == 0) {
            synchronized (this) {
                this.Z |= 8;
            }
            return true;
        } else if (i2 == 25) {
            synchronized (this) {
                this.Z |= 16;
            }
            return true;
        } else if (i2 == 32) {
            synchronized (this) {
                this.Z |= 32;
            }
            return true;
        } else if (i2 == 5) {
            synchronized (this) {
                this.Z |= 64;
            }
            return true;
        } else if (i2 == 23) {
            synchronized (this) {
                this.Z |= 128;
            }
            return true;
        } else if (i2 == 85) {
            synchronized (this) {
                this.Z |= 1;
            }
            return true;
        } else if (i2 == 69) {
            synchronized (this) {
                this.Z |= 256;
            }
            return true;
        } else if (i2 == 53) {
            synchronized (this) {
                this.Z |= 512;
            }
            return true;
        } else if (i2 == 94) {
            synchronized (this) {
                this.Z |= 1024;
            }
            return true;
        } else if (i2 == 72) {
            synchronized (this) {
                this.Z |= 2048;
            }
            return true;
        } else if (i2 == 40) {
            synchronized (this) {
                this.Z |= 4;
            }
            return true;
        } else if (i2 == 22) {
            synchronized (this) {
                this.Z |= 4096;
            }
            return true;
        } else if (i2 != 37) {
            return false;
        } else {
            synchronized (this) {
                this.Z |= 8192;
            }
            return true;
        }
    }

    public final boolean f(int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.Z |= 2;
        }
        return true;
    }

    public final boolean g(int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.Z |= 4;
        }
        return true;
    }

    public final boolean h(int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.Z |= 1;
        }
        return true;
    }

    public boolean a(int i2, Object obj, int i3) {
        if (i2 == 0) {
            k kVar = (k) obj;
            return h(i3);
        } else if (i2 == 1) {
            l lVar = (l) obj;
            return f(i3);
        } else if (i2 == 2) {
            k kVar2 = (k) obj;
            return g(i3);
        } else if (i2 != 3) {
            return false;
        } else {
            TmgiFormViewModel tmgiFormViewModel = (TmgiFormViewModel) obj;
            return e(i3);
        }
    }

    public final void a(int i2, View view) {
        boolean z = false;
        if (i2 == 1) {
            TmgiFormViewModel tmgiFormViewModel = this.N;
            if (tmgiFormViewModel != null) {
                z = true;
            }
            if (z) {
                tmgiFormViewModel.z0();
            }
        } else if (i2 == 2) {
            TmgiFormViewModel tmgiFormViewModel2 = this.N;
            if (tmgiFormViewModel2 != null) {
                z = true;
            }
            if (z) {
                tmgiFormViewModel2.c1();
            }
        } else if (i2 == 4) {
            TmgiFormViewModel tmgiFormViewModel3 = this.N;
            if (tmgiFormViewModel3 != null) {
                z = true;
            }
            if (z) {
                tmgiFormViewModel3.x();
            }
        } else if (i2 == 5) {
            TmgiFormViewModel tmgiFormViewModel4 = this.N;
            if (tmgiFormViewModel4 != null) {
                z = true;
            }
            if (z) {
                tmgiFormViewModel4.cancel();
            }
        } else if (i2 == 6) {
            TmgiFormViewModel tmgiFormViewModel5 = this.N;
            if (tmgiFormViewModel5 != null) {
                z = true;
            }
            if (z) {
                tmgiFormViewModel5.S1();
            }
        } else if (i2 == 7) {
            TmgiFormViewModel tmgiFormViewModel6 = this.N;
            if (tmgiFormViewModel6 != null) {
                z = true;
            }
            if (z) {
                tmgiFormViewModel6.C0();
            }
        }
    }

    public final void a(int i2, Object obj) {
        TmgiFormViewModel tmgiFormViewModel = this.N;
        if (tmgiFormViewModel != null) {
            tmgiFormViewModel.g("" + obj);
        }
    }
}
