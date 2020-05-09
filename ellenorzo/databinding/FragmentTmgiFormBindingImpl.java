package p289hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding.C2867f;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import p204g.p205a.p206a.p208b.C3158a;
import p211h.p258l.C3702f;
import p211h.p258l.C3704h;
import p211h.p258l.C3705i;
import p211h.p258l.C3709k;
import p211h.p258l.C3710l;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.attachment.AttachmentView;
import p289hu.ekreta.ellenorzo.cases.tmgi.TmgiFormViewModel;
import p289hu.ekreta.ellenorzo.generated.callback.ItemSelectedListener;
import p289hu.ekreta.ellenorzo.generated.callback.OnClickListener.Listener;

/* renamed from: hu.ekreta.ellenorzo.databinding.FragmentTmgiFormBindingImpl */
public class FragmentTmgiFormBindingImpl extends FragmentTmgiFormBinding implements Listener, ItemSelectedListener.Listener {

    /* renamed from: a0 */
    public static final C2867f f12398a0 = null;

    /* renamed from: b0 */
    public static final SparseIntArray f12399b0 = new SparseIntArray();

    /* renamed from: O */
    public final CoordinatorLayout f12400O;

    /* renamed from: P */
    public final ConstraintLayout f12401P;

    /* renamed from: Q */
    public final OnClickListener f12402Q;

    /* renamed from: R */
    public final OnClickListener f12403R;

    /* renamed from: S */
    public final OnClickListener f12404S;

    /* renamed from: T */
    public final p289hu.ekreta.ellenorzo.util.binding.ItemSelectedListener f12405T;

    /* renamed from: U */
    public final OnClickListener f12406U;

    /* renamed from: V */
    public final OnClickListener f12407V;

    /* renamed from: W */
    public final OnClickListener f12408W;

    /* renamed from: X */
    public C3704h f12409X = new C3704h() {
        /* renamed from: a */
        public void mo10528a() {
            String d = C3158a.m7893d((TextView) FragmentTmgiFormBindingImpl.this.f12387E);
            TmgiFormViewModel tmgiFormViewModel = FragmentTmgiFormBindingImpl.this.f12396N;
            if (tmgiFormViewModel != null) {
                tmgiFormViewModel.mo12157i(d);
            }
        }
    };

    /* renamed from: Y */
    public C3704h f12410Y = new C3704h() {
        /* renamed from: a */
        public void mo10528a() {
            String d = C3158a.m7893d((TextView) FragmentTmgiFormBindingImpl.this.f12389G);
            TmgiFormViewModel tmgiFormViewModel = FragmentTmgiFormBindingImpl.this.f12396N;
            if (tmgiFormViewModel != null) {
                tmgiFormViewModel.mo12160m(d);
            }
        }
    };

    /* renamed from: Z */
    public long f12411Z = -1;

    static {
        f12399b0.put(C4014R.C4016id.app_bar_layout, 16);
        f12399b0.put(C4014R.C4016id.nested_scroll_view, 17);
        f12399b0.put(C4014R.C4016id.startDatePicker_textInputLayout, 18);
        f12399b0.put(C4014R.C4016id.endDatePicker_textInputLayout, 19);
        f12399b0.put(C4014R.C4016id.caseTypeNamesTextInputLayout, 20);
        f12399b0.put(C4014R.C4016id.form_reason_title_textView, 21);
    }

    public FragmentTmgiFormBindingImpl(C3702f fVar, View view) {
        Object[] a = ViewDataBinding.m6046a(fVar, view, 22, f12398a0, f12399b0);
        super(fVar, view, 4, (Button) a[11], (TextView) a[9], (Button) a[14], (TextView) a[12], (AppBarLayout) a[16], (Button) a[8], (AutoCompleteTextView) a[5], (TextInputLayout) a[20], (TextInputLayout) a[19], (TextInputEditText) a[4], (EditText) a[6], (TextView) a[21], (AttachmentView) a[10], (NestedScrollView) a[17], (AttachmentView) a[13], (FrameLayout) a[15], (Button) a[7], (TextInputLayout) a[18], (TextInputEditText) a[3], (Toolbar) a[1]);
        this.f12397z.setTag(null);
        this.f12383A.setTag(null);
        this.f12384B.setTag(null);
        this.f12385C.setTag(null);
        this.f12386D.setTag(null);
        this.f12387E.setTag(null);
        this.f12388F.setTag(null);
        this.f12389G.setTag(null);
        this.f12390H.setTag(null);
        this.f12400O = (CoordinatorLayout) a[0];
        this.f12400O.setTag(null);
        this.f12401P = (ConstraintLayout) a[2];
        this.f12401P.setTag(null);
        this.f12391I.setTag(null);
        this.f12392J.setTag(null);
        this.f12393K.setTag(null);
        this.f12394L.setTag(null);
        this.f12395M.setTag(null);
        mo6098a(view);
        this.f12402Q = new p289hu.ekreta.ellenorzo.generated.callback.OnClickListener(this, 1);
        this.f12403R = new p289hu.ekreta.ellenorzo.generated.callback.OnClickListener(this, 5);
        this.f12404S = new p289hu.ekreta.ellenorzo.generated.callback.OnClickListener(this, 2);
        this.f12405T = new ItemSelectedListener(this, 3);
        this.f12406U = new p289hu.ekreta.ellenorzo.generated.callback.OnClickListener(this, 7);
        this.f12407V = new p289hu.ekreta.ellenorzo.generated.callback.OnClickListener(this, 6);
        this.f12408W = new p289hu.ekreta.ellenorzo.generated.callback.OnClickListener(this, 4);
        mo6095R1();
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00e0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00f3 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0103  */
    /* renamed from: M1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6090M1() {
        /*
            r44 = this;
            r1 = r44
            monitor-enter(r44)
            long r2 = r1.f12411Z     // Catch:{ all -> 0x0258 }
            r4 = 0
            r1.f12411Z = r4     // Catch:{ all -> 0x0258 }
            monitor-exit(r44)     // Catch:{ all -> 0x0258 }
            hu.ekreta.ellenorzo.cases.tmgi.TmgiFormViewModel r0 = r1.f12396N
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
            java.lang.String r6 = r0.mo12140E0()
            goto L_0x0034
        L_0x0033:
            r6 = 0
        L_0x0034:
            long r32 = r2 & r24
            int r7 = (r32 > r4 ? 1 : (r32 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x0041
            if (r0 == 0) goto L_0x0041
            boolean r7 = r0.mo12158j1()
            goto L_0x0042
        L_0x0041:
            r7 = 0
        L_0x0042:
            long r32 = r2 & r22
            int r34 = (r32 > r4 ? 1 : (r32 == r4 ? 0 : -1))
            if (r34 == 0) goto L_0x004f
            if (r0 == 0) goto L_0x004f
            java.lang.String r32 = r0.mo12138A1()
            goto L_0x0051
        L_0x004f:
            r32 = 0
        L_0x0051:
            long r33 = r2 & r18
            int r35 = (r33 > r4 ? 1 : (r33 == r4 ? 0 : -1))
            if (r35 == 0) goto L_0x006b
            if (r0 == 0) goto L_0x0060
            h.l.k r33 = r0.mo12144K1()
            r11 = r33
            goto L_0x0061
        L_0x0060:
            r11 = 0
        L_0x0061:
            r1.mo6103a(r10, r11)
            if (r11 == 0) goto L_0x006b
            T r11 = r11.f10171e
            java.util.List r11 = (java.util.List) r11
            goto L_0x006c
        L_0x006b:
            r11 = 0
        L_0x006c:
            long r34 = r2 & r16
            int r36 = (r34 > r4 ? 1 : (r34 == r4 ? 0 : -1))
            if (r36 == 0) goto L_0x0079
            if (r0 == 0) goto L_0x0079
            java.lang.String r34 = r0.mo12152e1()
            goto L_0x007b
        L_0x0079:
            r34 = 0
        L_0x007b:
            long r35 = r2 & r14
            int r37 = (r35 > r4 ? 1 : (r35 == r4 ? 0 : -1))
            if (r37 == 0) goto L_0x0088
            if (r0 == 0) goto L_0x0088
            java.lang.String r35 = r0.mo12142I1()
            goto L_0x008a
        L_0x0088:
            r35 = 0
        L_0x008a:
            long r36 = r2 & r28
            r14 = 1
            int r15 = (r36 > r4 ? 1 : (r36 == r4 ? 0 : -1))
            if (r15 == 0) goto L_0x00ad
            if (r0 == 0) goto L_0x009c
            boolean r15 = r0.mo12153f1()
            boolean r36 = r0.mo12141G1()
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
            boolean r8 = p289hu.ekreta.ellenorzo.util.binding.BindingUtil.m14796a(r8)
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
            boolean r9 = r0.mo12145O0()
            goto L_0x00bf
        L_0x00be:
            r9 = 0
        L_0x00bf:
            long r40 = r2 & r20
            int r37 = (r40 > r4 ? 1 : (r40 == r4 ? 0 : -1))
            if (r37 == 0) goto L_0x00d7
            if (r0 == 0) goto L_0x00ce
            h.l.l r37 = r0.mo12162y0()
            r10 = r37
            goto L_0x00cf
        L_0x00ce:
            r10 = 0
        L_0x00cf:
            r1.mo6103a(r14, r10)
            if (r10 == 0) goto L_0x00d7
            int r10 = r10.f10172e
            goto L_0x00d8
        L_0x00d7:
            r10 = 0
        L_0x00d8:
            r38 = 24584(0x6008, double:1.2146E-319)
            long r40 = r2 & r38
            int r14 = (r40 > r4 ? 1 : (r40 == r4 ? 0 : -1))
            if (r14 == 0) goto L_0x00e9
            if (r0 == 0) goto L_0x00e9
            boolean r14 = r0.mo12150d()
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
            java.lang.String r14 = r0.mo12151d1()
            goto L_0x00fb
        L_0x00fa:
            r14 = 0
        L_0x00fb:
            r30 = 16396(0x400c, double:8.1007E-320)
            long r40 = r2 & r30
            int r42 = (r40 > r4 ? 1 : (r40 == r4 ? 0 : -1))
            if (r42 == 0) goto L_0x012c
            if (r0 == 0) goto L_0x010a
            h.l.k r0 = r0.mo12159k1()
            goto L_0x010b
        L_0x010a:
            r0 = 0
        L_0x010b:
            r12 = 2
            r1.mo6103a(r12, r0)
            if (r0 == 0) goto L_0x0116
            T r0 = r0.f10171e
            hu.ekreta.ellenorzo.cases.subModels.TmgiCaseType r0 = (p289hu.ekreta.ellenorzo.cases.subModels.TmgiCaseType) r0
            goto L_0x0117
        L_0x0116:
            r0 = 0
        L_0x0117:
            if (r0 == 0) goto L_0x012c
            java.lang.String r0 = r0.mo11921f()
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
            android.widget.Button r4 = r1.f12397z
            r4.setEnabled(r8)
        L_0x0157:
            r4 = 16384(0x4000, double:8.0948E-320)
            long r4 = r4 & r2
            r28 = 0
            int r8 = (r4 > r28 ? 1 : (r4 == r28 ? 0 : -1))
            if (r8 == 0) goto L_0x01a2
            android.widget.Button r4 = r1.f12397z
            android.view.View$OnClickListener r5 = r1.f12407V
            r4.setOnClickListener(r5)
            android.widget.Button r4 = r1.f12384B
            android.view.View$OnClickListener r5 = r1.f12406U
            r4.setOnClickListener(r5)
            android.widget.Button r4 = r1.f12386D
            android.view.View$OnClickListener r5 = r1.f12403R
            r4.setOnClickListener(r5)
            android.widget.AutoCompleteTextView r4 = r1.f12387E
            hu.ekreta.ellenorzo.util.binding.ItemSelectedListener r5 = r1.f12405T
            hu.ekreta.ellenorzo.util.binding.AutoCompleteTextViewBindings$Companion r8 = p289hu.ekreta.ellenorzo.util.binding.AutoCompleteTextViewBindings.Companion
            r8.mo16303a(r4, r5)
            android.widget.AutoCompleteTextView r4 = r1.f12387E
            h.l.h r5 = r1.f12409X
            r8 = 0
            p204g.p205a.p206a.p208b.C3158a.m7849a(r4, r8, r8, r8, r5)
            com.google.android.material.textfield.TextInputEditText r4 = r1.f12388F
            android.view.View$OnClickListener r5 = r1.f12404S
            r4.setOnClickListener(r5)
            android.widget.EditText r4 = r1.f12389G
            h.l.h r5 = r1.f12410Y
            p204g.p205a.p206a.p208b.C3158a.m7849a(r4, r8, r8, r8, r5)
            android.widget.Button r4 = r1.f12393K
            android.view.View$OnClickListener r5 = r1.f12408W
            r4.setOnClickListener(r5)
            com.google.android.material.textfield.TextInputEditText r4 = r1.f12394L
            android.view.View$OnClickListener r5 = r1.f12402Q
            r4.setOnClickListener(r5)
        L_0x01a2:
            r4 = 17416(0x4408, double:8.6046E-320)
            long r4 = r4 & r2
            r28 = 0
            int r8 = (r4 > r28 ? 1 : (r4 == r28 ? 0 : -1))
            if (r8 == 0) goto L_0x01bd
            android.widget.Button r4 = r1.f12397z
            int r5 = p289hu.ekreta.ellenorzo.util.binding.BindingConverters.m14795a(r15)
            r4.setVisibility(r5)
            android.widget.TextView r4 = r1.f12383A
            int r5 = p289hu.ekreta.ellenorzo.util.binding.BindingConverters.m14795a(r15)
            r4.setVisibility(r5)
        L_0x01bd:
            long r4 = r2 & r20
            int r8 = (r4 > r28 ? 1 : (r4 == r28 ? 0 : -1))
            if (r8 == 0) goto L_0x01c8
            android.widget.TextView r4 = r1.f12385C
            r4.setText(r10)
        L_0x01c8:
            long r4 = r2 & r22
            int r8 = (r4 > r28 ? 1 : (r4 == r28 ? 0 : -1))
            if (r8 == 0) goto L_0x01d3
            android.widget.AutoCompleteTextView r4 = r1.f12387E
            p204g.p205a.p206a.p208b.C3158a.m7850a(r4, r0)
        L_0x01d3:
            long r4 = r2 & r18
            int r0 = (r4 > r28 ? 1 : (r4 == r28 ? 0 : -1))
            if (r0 == 0) goto L_0x01e0
            android.widget.AutoCompleteTextView r0 = r1.f12387E
            hu.ekreta.ellenorzo.util.binding.AutoCompleteTextViewBindings$Companion r4 = p289hu.ekreta.ellenorzo.util.binding.AutoCompleteTextViewBindings.Companion
            r4.mo16304a(r0, r11)
        L_0x01e0:
            long r4 = r2 & r26
            int r0 = (r4 > r28 ? 1 : (r4 == r28 ? 0 : -1))
            if (r0 == 0) goto L_0x01eb
            com.google.android.material.textfield.TextInputEditText r0 = r1.f12388F
            p204g.p205a.p206a.p208b.C3158a.m7850a(r0, r6)
        L_0x01eb:
            long r4 = r2 & r16
            int r0 = (r4 > r28 ? 1 : (r4 == r28 ? 0 : -1))
            if (r0 == 0) goto L_0x01f6
            android.widget.EditText r0 = r1.f12389G
            p204g.p205a.p206a.p208b.C3158a.m7850a(r0, r7)
        L_0x01f6:
            r4 = 18440(0x4808, double:9.1106E-320)
            long r4 = r4 & r2
            int r0 = (r4 > r28 ? 1 : (r4 == r28 ? 0 : -1))
            if (r0 == 0) goto L_0x0206
            hu.ekreta.ellenorzo.attachment.AttachmentView r0 = r1.f12390H
            int r4 = p289hu.ekreta.ellenorzo.util.binding.BindingConverters.m14795a(r36)
            r0.setVisibility(r4)
        L_0x0206:
            r4 = 16396(0x400c, double:8.1007E-320)
            long r4 = r4 & r2
            int r0 = (r4 > r28 ? 1 : (r4 == r28 ? 0 : -1))
            if (r0 == 0) goto L_0x0212
            hu.ekreta.ellenorzo.attachment.AttachmentView r0 = r1.f12390H
            r0.setLabel(r9)
        L_0x0212:
            r4 = 20488(0x5008, double:1.01224E-319)
            long r4 = r4 & r2
            int r0 = (r4 > r28 ? 1 : (r4 == r28 ? 0 : -1))
            if (r0 == 0) goto L_0x0222
            hu.ekreta.ellenorzo.attachment.AttachmentView r0 = r1.f12391I
            int r4 = p289hu.ekreta.ellenorzo.util.binding.BindingConverters.m14795a(r37)
            r0.setVisibility(r4)
        L_0x0222:
            r4 = 24584(0x6008, double:1.2146E-319)
            long r4 = r4 & r2
            int r0 = (r4 > r28 ? 1 : (r4 == r28 ? 0 : -1))
            if (r0 == 0) goto L_0x0232
            android.widget.FrameLayout r0 = r1.f12392J
            int r4 = p289hu.ekreta.ellenorzo.util.binding.BindingConverters.m14795a(r12)
            r0.setVisibility(r4)
        L_0x0232:
            long r4 = r2 & r24
            int r0 = (r4 > r28 ? 1 : (r4 == r28 ? 0 : -1))
            if (r0 == 0) goto L_0x023d
            android.widget.Button r0 = r1.f12393K
            r0.setEnabled(r13)
        L_0x023d:
            r4 = 16424(0x4028, double:8.1145E-320)
            long r4 = r4 & r2
            int r0 = (r4 > r28 ? 1 : (r4 == r28 ? 0 : -1))
            if (r0 == 0) goto L_0x0249
            com.google.android.material.textfield.TextInputEditText r0 = r1.f12394L
            p204g.p205a.p206a.p208b.C3158a.m7850a(r0, r14)
        L_0x0249:
            r4 = 16408(0x4018, double:8.1066E-320)
            long r2 = r2 & r4
            int r0 = (r2 > r28 ? 1 : (r2 == r28 ? 0 : -1))
            if (r0 == 0) goto L_0x0257
            androidx.appcompat.widget.Toolbar r0 = r1.f12395M
            r14 = r43
            r0.setSubtitle(r14)
        L_0x0257:
            return
        L_0x0258:
            r0 = move-exception
            monitor-exit(r44)     // Catch:{ all -> 0x0258 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.databinding.FragmentTmgiFormBindingImpl.mo6090M1():void");
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f12411Z != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f12411Z = 16384;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public void mo12414a(TmgiFormViewModel tmgiFormViewModel) {
        mo6103a(3, (C3705i) tmgiFormViewModel);
        this.f12396N = tmgiFormViewModel;
        synchronized (this) {
            this.f12411Z |= 8;
        }
        mo10512c(88);
        super.mo6096S1();
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (88 != i) {
            return false;
        }
        mo12414a((TmgiFormViewModel) obj);
        return true;
    }

    /* renamed from: e */
    public final boolean mo12416e(int i) {
        if (i == 0) {
            synchronized (this) {
                this.f12411Z |= 8;
            }
            return true;
        } else if (i == 25) {
            synchronized (this) {
                this.f12411Z |= 16;
            }
            return true;
        } else if (i == 32) {
            synchronized (this) {
                this.f12411Z |= 32;
            }
            return true;
        } else if (i == 5) {
            synchronized (this) {
                this.f12411Z |= 64;
            }
            return true;
        } else if (i == 23) {
            synchronized (this) {
                this.f12411Z |= 128;
            }
            return true;
        } else if (i == 85) {
            synchronized (this) {
                this.f12411Z |= 1;
            }
            return true;
        } else if (i == 69) {
            synchronized (this) {
                this.f12411Z |= 256;
            }
            return true;
        } else if (i == 52) {
            synchronized (this) {
                this.f12411Z |= 512;
            }
            return true;
        } else if (i == 93) {
            synchronized (this) {
                this.f12411Z |= 1024;
            }
            return true;
        } else if (i == 72) {
            synchronized (this) {
                this.f12411Z |= 2048;
            }
            return true;
        } else if (i == 40) {
            synchronized (this) {
                this.f12411Z |= 4;
            }
            return true;
        } else if (i == 22) {
            synchronized (this) {
                this.f12411Z |= 4096;
            }
            return true;
        } else if (i != 37) {
            return false;
        } else {
            synchronized (this) {
                this.f12411Z |= 8192;
            }
            return true;
        }
    }

    /* renamed from: f */
    public final boolean mo12417f(int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.f12411Z |= 2;
        }
        return true;
    }

    /* renamed from: g */
    public final boolean mo12418g(int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.f12411Z |= 4;
        }
        return true;
    }

    /* renamed from: h */
    public final boolean mo12419h(int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.f12411Z |= 1;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        if (i == 0) {
            C3709k kVar = (C3709k) obj;
            return mo12419h(i2);
        } else if (i == 1) {
            C3710l lVar = (C3710l) obj;
            return mo12417f(i2);
        } else if (i == 2) {
            C3709k kVar2 = (C3709k) obj;
            return mo12418g(i2);
        } else if (i != 3) {
            return false;
        } else {
            TmgiFormViewModel tmgiFormViewModel = (TmgiFormViewModel) obj;
            return mo12416e(i2);
        }
    }

    /* renamed from: a */
    public final void mo12329a(int i, View view) {
        boolean z = false;
        if (i == 1) {
            TmgiFormViewModel tmgiFormViewModel = this.f12396N;
            if (tmgiFormViewModel != null) {
                z = true;
            }
            if (z) {
                tmgiFormViewModel.mo12163z0();
            }
        } else if (i == 2) {
            TmgiFormViewModel tmgiFormViewModel2 = this.f12396N;
            if (tmgiFormViewModel2 != null) {
                z = true;
            }
            if (z) {
                tmgiFormViewModel2.mo12146Y0();
            }
        } else if (i == 4) {
            TmgiFormViewModel tmgiFormViewModel3 = this.f12396N;
            if (tmgiFormViewModel3 != null) {
                z = true;
            }
            if (z) {
                tmgiFormViewModel3.mo12161x();
            }
        } else if (i == 5) {
            TmgiFormViewModel tmgiFormViewModel4 = this.f12396N;
            if (tmgiFormViewModel4 != null) {
                z = true;
            }
            if (z) {
                tmgiFormViewModel4.cancel();
            }
        } else if (i == 6) {
            TmgiFormViewModel tmgiFormViewModel5 = this.f12396N;
            if (tmgiFormViewModel5 != null) {
                z = true;
            }
            if (z) {
                tmgiFormViewModel5.mo12143J1();
            }
        } else if (i == 7) {
            TmgiFormViewModel tmgiFormViewModel6 = this.f12396N;
            if (tmgiFormViewModel6 != null) {
                z = true;
            }
            if (z) {
                tmgiFormViewModel6.mo12139C0();
            }
        }
    }

    /* renamed from: a */
    public final void mo12415a(int i, Object obj) {
        TmgiFormViewModel tmgiFormViewModel = this.f12396N;
        if (tmgiFormViewModel != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(obj);
            tmgiFormViewModel.mo12154g(sb.toString());
        }
    }
}
