package hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import h.l.i;
import h.p.m;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.cases.decision.DecisionDetailViewModel;
import hu.ekreta.ellenorzo.generated.callback.OnClickListener;

public class ActivityDecisionDetailBindingImpl extends ActivityDecisionDetailBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.f S = new ViewDataBinding.f(18);
    public static final SparseIntArray T = new SparseIntArray();
    public final CoordinatorLayout D;
    public final LinearLayout E;
    public final IncludeCaseDetailsNameBinding F;
    public final IncludeCaseDetailsPrintableBinding G;
    public final IncludeCaseDecisionTypeBinding H;
    public final IncludeProvenAbsenceBinding I;
    public final IncludeCaseDecisionAdjudicationBinding J;
    public final IncludeCaseDetailsReasonBinding K;
    public final IncludeCaseDecisionSignerBinding L;
    public final IncludeCaseDecisionDateBinding M;
    public final IncludeCaseDetailsAttachmentsBinding N;
    public final IncludeCaseDecisionAddAttachmentBinding O;
    public final View.OnClickListener P;
    public final View.OnClickListener Q;
    public long R = -1;

    static {
        S.a(2, new String[]{"include_case_details_name", "include_case_decision_type", "include_proven_absence", "include_case_decision_adjudication", "include_case_details_reason", "include_case_decision_signer", "include_case_decision_date", "include_case_details_attachments", "include_case_decision_add_attachment", "include_case_details_printable"}, new int[]{5, 6, 7, 8, 9, 10, 11, 12, 13, 14}, new int[]{R.layout.include_case_details_name, R.layout.include_case_decision_type, R.layout.include_proven_absence, R.layout.include_case_decision_adjudication, R.layout.include_case_details_reason, R.layout.include_case_decision_signer, R.layout.include_case_decision_date, R.layout.include_case_details_attachments, R.layout.include_case_decision_add_attachment, R.layout.include_case_details_printable});
        T.put(R.id.app_bar_layout, 15);
        T.put(R.id.toolbar, 16);
        T.put(R.id.progressBar, 17);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActivityDecisionDetailBindingImpl(h.l.f r13, android.view.View r14) {
        /*
            r12 = this;
            androidx.databinding.ViewDataBinding$f r0 = S
            android.util.SparseIntArray r1 = T
            r2 = 18
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.a((h.l.f) r13, (android.view.View) r14, (int) r2, (androidx.databinding.ViewDataBinding.f) r0, (android.util.SparseIntArray) r1)
            r1 = 15
            r1 = r0[r1]
            r6 = r1
            com.google.android.material.appbar.AppBarLayout r6 = (com.google.android.material.appbar.AppBarLayout) r6
            r1 = 1
            r2 = r0[r1]
            r7 = r2
            androidx.core.widget.NestedScrollView r7 = (androidx.core.widget.NestedScrollView) r7
            r2 = 17
            r2 = r0[r2]
            r8 = r2
            android.widget.ProgressBar r8 = (android.widget.ProgressBar) r8
            r2 = 4
            r2 = r0[r2]
            r9 = r2
            android.widget.FrameLayout r9 = (android.widget.FrameLayout) r9
            r2 = 3
            r2 = r0[r2]
            r10 = r2
            android.widget.Button r10 = (android.widget.Button) r10
            r2 = 16
            r2 = r0[r2]
            r11 = r2
            androidx.appcompat.widget.Toolbar r11 = (androidx.appcompat.widget.Toolbar) r11
            r5 = 2
            r2 = r12
            r3 = r13
            r4 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r2 = -1
            r12.R = r2
            androidx.core.widget.NestedScrollView r13 = r12.z
            r2 = 0
            r13.setTag(r2)
            r13 = 0
            r13 = r0[r13]
            androidx.coordinatorlayout.widget.CoordinatorLayout r13 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r13
            r12.D = r13
            androidx.coordinatorlayout.widget.CoordinatorLayout r13 = r12.D
            r13.setTag(r2)
            r13 = 2
            r3 = r0[r13]
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r12.E = r3
            android.widget.LinearLayout r3 = r12.E
            r3.setTag(r2)
            r3 = 5
            r3 = r0[r3]
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsNameBinding r3 = (hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsNameBinding) r3
            r12.F = r3
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsNameBinding r3 = r12.F
            r12.a((androidx.databinding.ViewDataBinding) r3)
            r3 = 14
            r3 = r0[r3]
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsPrintableBinding r3 = (hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsPrintableBinding) r3
            r12.G = r3
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsPrintableBinding r3 = r12.G
            r12.a((androidx.databinding.ViewDataBinding) r3)
            r3 = 6
            r3 = r0[r3]
            hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionTypeBinding r3 = (hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionTypeBinding) r3
            r12.H = r3
            hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionTypeBinding r3 = r12.H
            r12.a((androidx.databinding.ViewDataBinding) r3)
            r3 = 7
            r3 = r0[r3]
            hu.ekreta.ellenorzo.databinding.IncludeProvenAbsenceBinding r3 = (hu.ekreta.ellenorzo.databinding.IncludeProvenAbsenceBinding) r3
            r12.I = r3
            hu.ekreta.ellenorzo.databinding.IncludeProvenAbsenceBinding r3 = r12.I
            r12.a((androidx.databinding.ViewDataBinding) r3)
            r3 = 8
            r3 = r0[r3]
            hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionAdjudicationBinding r3 = (hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionAdjudicationBinding) r3
            r12.J = r3
            hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionAdjudicationBinding r3 = r12.J
            r12.a((androidx.databinding.ViewDataBinding) r3)
            r3 = 9
            r3 = r0[r3]
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsReasonBinding r3 = (hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsReasonBinding) r3
            r12.K = r3
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsReasonBinding r3 = r12.K
            r12.a((androidx.databinding.ViewDataBinding) r3)
            r3 = 10
            r3 = r0[r3]
            hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionSignerBinding r3 = (hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionSignerBinding) r3
            r12.L = r3
            hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionSignerBinding r3 = r12.L
            r12.a((androidx.databinding.ViewDataBinding) r3)
            r3 = 11
            r3 = r0[r3]
            hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionDateBinding r3 = (hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionDateBinding) r3
            r12.M = r3
            hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionDateBinding r3 = r12.M
            r12.a((androidx.databinding.ViewDataBinding) r3)
            r3 = 12
            r3 = r0[r3]
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAttachmentsBinding r3 = (hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAttachmentsBinding) r3
            r12.N = r3
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAttachmentsBinding r3 = r12.N
            r12.a((androidx.databinding.ViewDataBinding) r3)
            r3 = 13
            r0 = r0[r3]
            hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionAddAttachmentBinding r0 = (hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionAddAttachmentBinding) r0
            r12.O = r0
            hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionAddAttachmentBinding r0 = r12.O
            r12.a((androidx.databinding.ViewDataBinding) r0)
            android.widget.FrameLayout r0 = r12.A
            r0.setTag(r2)
            android.widget.Button r0 = r12.B
            r0.setTag(r2)
            r12.a((android.view.View) r14)
            hu.ekreta.ellenorzo.generated.callback.OnClickListener r14 = new hu.ekreta.ellenorzo.generated.callback.OnClickListener
            r14.<init>(r12, r13)
            r12.P = r14
            hu.ekreta.ellenorzo.generated.callback.OnClickListener r13 = new hu.ekreta.ellenorzo.generated.callback.OnClickListener
            r13.<init>(r12, r1)
            r12.Q = r13
            r12.a2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.ActivityDecisionDetailBindingImpl.<init>(h.l.f, android.view.View):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v2, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void V1() {
        /*
            r46 = this;
            r1 = r46
            monitor-enter(r46)
            long r2 = r1.R     // Catch:{ all -> 0x0211 }
            r4 = 0
            r1.R = r4     // Catch:{ all -> 0x0211 }
            monitor-exit(r46)     // Catch:{ all -> 0x0211 }
            hu.ekreta.ellenorzo.cases.decision.DecisionDetailViewModel r0 = r1.C
            r6 = 16383(0x3fff, double:8.0943E-320)
            long r6 = r6 & r2
            r8 = 12289(0x3001, double:6.0716E-320)
            r10 = 9217(0x2401, double:4.554E-320)
            r12 = 8225(0x2021, double:4.0637E-320)
            r14 = 8705(0x2201, double:4.301E-320)
            r16 = 10241(0x2801, double:5.0597E-320)
            r18 = 8449(0x2101, double:4.1744E-320)
            r20 = 8209(0x2011, double:4.056E-320)
            r22 = 8321(0x2081, double:4.111E-320)
            r24 = 8201(0x2009, double:4.052E-320)
            r26 = 8257(0x2041, double:4.0795E-320)
            r28 = 8197(0x2005, double:4.05E-320)
            r30 = 0
            r31 = 0
            int r32 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r32 == 0) goto L_0x010c
            long r6 = r2 & r26
            int r32 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r32 == 0) goto L_0x003a
            if (r0 == 0) goto L_0x003a
            java.lang.String r6 = r0.e0()
            goto L_0x003c
        L_0x003a:
            r6 = r31
        L_0x003c:
            long r32 = r2 & r22
            int r7 = (r32 > r4 ? 1 : (r32 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x0049
            if (r0 == 0) goto L_0x0049
            java.lang.String r7 = r0.f0()
            goto L_0x004b
        L_0x0049:
            r7 = r31
        L_0x004b:
            long r32 = r2 & r18
            int r34 = (r32 > r4 ? 1 : (r32 == r4 ? 0 : -1))
            if (r34 == 0) goto L_0x0058
            if (r0 == 0) goto L_0x0058
            java.lang.String r32 = r0.m0()
            goto L_0x005a
        L_0x0058:
            r32 = r31
        L_0x005a:
            long r33 = r2 & r16
            int r35 = (r33 > r4 ? 1 : (r33 == r4 ? 0 : -1))
            if (r35 == 0) goto L_0x0067
            if (r0 == 0) goto L_0x0067
            java.lang.String r33 = r0.i()
            goto L_0x0069
        L_0x0067:
            r33 = r31
        L_0x0069:
            long r34 = r2 & r14
            int r36 = (r34 > r4 ? 1 : (r34 == r4 ? 0 : -1))
            if (r36 == 0) goto L_0x0076
            if (r0 == 0) goto L_0x0076
            java.lang.String r34 = r0.Y()
            goto L_0x0078
        L_0x0076:
            r34 = r31
        L_0x0078:
            long r35 = r2 & r28
            int r37 = (r35 > r4 ? 1 : (r35 == r4 ? 0 : -1))
            if (r37 == 0) goto L_0x008a
            if (r0 == 0) goto L_0x0085
            boolean r35 = r0.d()
            goto L_0x0087
        L_0x0085:
            r35 = 0
        L_0x0087:
            r36 = r35 ^ 1
            goto L_0x008e
        L_0x008a:
            r35 = 0
            r36 = 0
        L_0x008e:
            long r37 = r2 & r24
            int r39 = (r37 > r4 ? 1 : (r37 == r4 ? 0 : -1))
            if (r39 == 0) goto L_0x009b
            if (r0 == 0) goto L_0x009b
            java.lang.String r37 = r0.r()
            goto L_0x009d
        L_0x009b:
            r37 = r31
        L_0x009d:
            long r38 = r2 & r10
            int r40 = (r38 > r4 ? 1 : (r38 == r4 ? 0 : -1))
            if (r40 == 0) goto L_0x00aa
            if (r0 == 0) goto L_0x00aa
            java.lang.String r38 = r0.Z()
            goto L_0x00ac
        L_0x00aa:
            r38 = r31
        L_0x00ac:
            long r39 = r2 & r8
            int r41 = (r39 > r4 ? 1 : (r39 == r4 ? 0 : -1))
            if (r41 == 0) goto L_0x00b8
            if (r0 == 0) goto L_0x00b8
            boolean r30 = r0.w0()
        L_0x00b8:
            long r39 = r2 & r20
            int r41 = (r39 > r4 ? 1 : (r39 == r4 ? 0 : -1))
            if (r41 == 0) goto L_0x00c5
            if (r0 == 0) goto L_0x00c5
            java.lang.String r39 = r0.o()
            goto L_0x00c7
        L_0x00c5:
            r39 = r31
        L_0x00c7:
            long r40 = r2 & r12
            int r42 = (r40 > r4 ? 1 : (r40 == r4 ? 0 : -1))
            if (r42 == 0) goto L_0x00d4
            if (r0 == 0) goto L_0x00d4
            java.lang.String r40 = r0.W()
            goto L_0x00d6
        L_0x00d4:
            r40 = r31
        L_0x00d6:
            r41 = 8195(0x2003, double:4.049E-320)
            long r41 = r2 & r41
            int r43 = (r41 > r4 ? 1 : (r41 == r4 ? 0 : -1))
            if (r43 == 0) goto L_0x00f7
            if (r0 == 0) goto L_0x00e7
            androidx.lifecycle.LiveData r41 = r0.getItems()
            r8 = r41
            goto L_0x00e9
        L_0x00e7:
            r8 = r31
        L_0x00e9:
            r9 = 1
            r1.a((int) r9, (androidx.lifecycle.LiveData<?>) r8)
            if (r8 == 0) goto L_0x00f7
            java.lang.Object r8 = r8.a()
            r31 = r8
            java.util.List r31 = (java.util.List) r31
        L_0x00f7:
            r10 = r6
            r11 = r7
            r45 = r31
            r14 = r32
            r8 = r33
            r15 = r34
            r6 = r37
            r44 = r38
            r7 = r39
            r9 = r40
            r34 = r30
            goto L_0x011f
        L_0x010c:
            r6 = r31
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r14 = r11
            r15 = r14
            r44 = r15
            r45 = r44
            r34 = 0
            r35 = 0
            r36 = 0
        L_0x011f:
            long r28 = r2 & r28
            int r37 = (r28 > r4 ? 1 : (r28 == r4 ? 0 : -1))
            if (r37 == 0) goto L_0x0137
            androidx.core.widget.NestedScrollView r12 = r1.z
            int r13 = hu.ekreta.ellenorzo.util.binding.BindingConverters.a((boolean) r36)
            r12.setVisibility(r13)
            android.widget.FrameLayout r12 = r1.A
            int r13 = hu.ekreta.ellenorzo.util.binding.BindingConverters.a((boolean) r35)
            r12.setVisibility(r13)
        L_0x0137:
            long r12 = r2 & r24
            int r24 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r24 == 0) goto L_0x0142
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsNameBinding r12 = r1.F
            r12.p(r6)
        L_0x0142:
            long r12 = r2 & r20
            int r6 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x014d
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsNameBinding r6 = r1.F
            r6.q(r7)
        L_0x014d:
            r6 = 8192(0x2000, double:4.0474E-320)
            long r6 = r6 & r2
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r12 == 0) goto L_0x0162
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsPrintableBinding r6 = r1.G
            android.view.View$OnClickListener r7 = r1.Q
            r6.a(r7)
            android.widget.Button r6 = r1.B
            android.view.View$OnClickListener r7 = r1.P
            r6.setOnClickListener(r7)
        L_0x0162:
            long r6 = r2 & r16
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r12 == 0) goto L_0x016d
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsPrintableBinding r6 = r1.G
            r6.p(r8)
        L_0x016d:
            r6 = 8225(0x2021, double:4.0637E-320)
            long r6 = r6 & r2
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x0179
            hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionTypeBinding r6 = r1.H
            r6.p(r9)
        L_0x0179:
            long r6 = r2 & r26
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x0184
            hu.ekreta.ellenorzo.databinding.IncludeProvenAbsenceBinding r6 = r1.I
            r6.p(r10)
        L_0x0184:
            long r6 = r2 & r22
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x018f
            hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionAdjudicationBinding r6 = r1.J
            r6.p(r11)
        L_0x018f:
            long r6 = r2 & r18
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x019a
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsReasonBinding r6 = r1.K
            r6.p(r14)
        L_0x019a:
            r6 = 8705(0x2201, double:4.301E-320)
            long r6 = r6 & r2
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x01a6
            hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionSignerBinding r6 = r1.L
            r6.p(r15)
        L_0x01a6:
            r6 = 9217(0x2401, double:4.554E-320)
            long r6 = r6 & r2
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x01b4
            hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionDateBinding r6 = r1.M
            r7 = r44
            r6.p(r7)
        L_0x01b4:
            r6 = 8195(0x2003, double:4.049E-320)
            long r6 = r6 & r2
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAttachmentsBinding r6 = r1.N
            r7 = r45
            r6.b(r7)
        L_0x01c2:
            r6 = 8193(0x2001, double:4.048E-320)
            long r6 = r6 & r2
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x01ce
            hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionAddAttachmentBinding r6 = r1.O
            r6.a(r0)
        L_0x01ce:
            r6 = 12289(0x3001, double:6.0716E-320)
            long r2 = r2 & r6
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x01de
            android.widget.Button r0 = r1.B
            int r2 = hu.ekreta.ellenorzo.util.binding.BindingConverters.a((boolean) r34)
            r0.setVisibility(r2)
        L_0x01de:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsNameBinding r0 = r1.F
            r0.W1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionTypeBinding r0 = r1.H
            r0.W1()
            hu.ekreta.ellenorzo.databinding.IncludeProvenAbsenceBinding r0 = r1.I
            r0.W1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionAdjudicationBinding r0 = r1.J
            r0.W1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsReasonBinding r0 = r1.K
            r0.W1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionSignerBinding r0 = r1.L
            r0.W1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionDateBinding r0 = r1.M
            r0.W1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAttachmentsBinding r0 = r1.N
            r0.W1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionAddAttachmentBinding r0 = r1.O
            r0.W1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsPrintableBinding r0 = r1.G
            r0.W1()
            return
        L_0x0211:
            r0 = move-exception
            monitor-exit(r46)     // Catch:{ all -> 0x0211 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.ActivityDecisionDetailBindingImpl.V1():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r6.H.Z1() == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        if (r6.I.Z1() == false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        if (r6.J.Z1() == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        if (r6.K.Z1() == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        if (r6.L.Z1() == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        if (r6.M.Z1() == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004b, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0052, code lost:
        if (r6.N.Z1() == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0054, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005b, code lost:
        if (r6.O.Z1() == false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005d, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0064, code lost:
        if (r6.G.Z1() == false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0066, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0067, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r6.F.Z1() == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Z1() {
        /*
            r6 = this;
            monitor-enter(r6)
            long r0 = r6.R     // Catch:{ all -> 0x0069 }
            r2 = 0
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x000c
            monitor-exit(r6)     // Catch:{ all -> 0x0069 }
            return r4
        L_0x000c:
            monitor-exit(r6)     // Catch:{ all -> 0x0069 }
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsNameBinding r0 = r6.F
            boolean r0 = r0.Z1()
            if (r0 == 0) goto L_0x0016
            return r4
        L_0x0016:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionTypeBinding r0 = r6.H
            boolean r0 = r0.Z1()
            if (r0 == 0) goto L_0x001f
            return r4
        L_0x001f:
            hu.ekreta.ellenorzo.databinding.IncludeProvenAbsenceBinding r0 = r6.I
            boolean r0 = r0.Z1()
            if (r0 == 0) goto L_0x0028
            return r4
        L_0x0028:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionAdjudicationBinding r0 = r6.J
            boolean r0 = r0.Z1()
            if (r0 == 0) goto L_0x0031
            return r4
        L_0x0031:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsReasonBinding r0 = r6.K
            boolean r0 = r0.Z1()
            if (r0 == 0) goto L_0x003a
            return r4
        L_0x003a:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionSignerBinding r0 = r6.L
            boolean r0 = r0.Z1()
            if (r0 == 0) goto L_0x0043
            return r4
        L_0x0043:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionDateBinding r0 = r6.M
            boolean r0 = r0.Z1()
            if (r0 == 0) goto L_0x004c
            return r4
        L_0x004c:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAttachmentsBinding r0 = r6.N
            boolean r0 = r0.Z1()
            if (r0 == 0) goto L_0x0055
            return r4
        L_0x0055:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionAddAttachmentBinding r0 = r6.O
            boolean r0 = r0.Z1()
            if (r0 == 0) goto L_0x005e
            return r4
        L_0x005e:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsPrintableBinding r0 = r6.G
            boolean r0 = r0.Z1()
            if (r0 == 0) goto L_0x0067
            return r4
        L_0x0067:
            r0 = 0
            return r0
        L_0x0069:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0069 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.ActivityDecisionDetailBindingImpl.Z1():boolean");
    }

    public void a(DecisionDetailViewModel decisionDetailViewModel) {
        a(0, (i) decisionDetailViewModel);
        this.C = decisionDetailViewModel;
        synchronized (this) {
            this.R |= 1;
        }
        c(88);
        super.b2();
    }

    public void a2() {
        synchronized (this) {
            this.R = 8192;
        }
        this.F.a2();
        this.H.a2();
        this.I.a2();
        this.J.a2();
        this.K.a2();
        this.L.a2();
        this.M.a2();
        this.N.a2();
        this.O.a2();
        this.G.a2();
        b2();
    }

    public boolean c(int i2, Object obj) {
        if (88 != i2) {
            return false;
        }
        a((DecisionDetailViewModel) obj);
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
                this.R |= 4;
            }
            return true;
        } else if (i2 == 71) {
            synchronized (this) {
                this.R |= 8;
            }
            return true;
        } else if (i2 == 63) {
            synchronized (this) {
                this.R |= 16;
            }
            return true;
        } else if (i2 == 59) {
            synchronized (this) {
                this.R |= 32;
            }
            return true;
        } else if (i2 == 80) {
            synchronized (this) {
                this.R |= 64;
            }
            return true;
        } else if (i2 == 99) {
            synchronized (this) {
                this.R |= 128;
            }
            return true;
        } else if (i2 == 103) {
            synchronized (this) {
                this.R |= 256;
            }
            return true;
        } else if (i2 == 17) {
            synchronized (this) {
                this.R |= 512;
            }
            return true;
        } else if (i2 == 112) {
            synchronized (this) {
                this.R |= 1024;
            }
            return true;
        } else if (i2 == 29) {
            synchronized (this) {
                this.R |= 2048;
            }
            return true;
        } else if (i2 != 78) {
            return false;
        } else {
            synchronized (this) {
                this.R |= 4096;
            }
            return true;
        }
    }

    public final boolean f(int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.R |= 2;
        }
        return true;
    }

    public void a(m mVar) {
        super.a(mVar);
        this.F.a(mVar);
        this.H.a(mVar);
        this.I.a(mVar);
        this.J.a(mVar);
        this.K.a(mVar);
        this.L.a(mVar);
        this.M.a(mVar);
        this.N.a(mVar);
        this.O.a(mVar);
        this.G.a(mVar);
    }

    public boolean a(int i2, Object obj, int i3) {
        if (i2 == 0) {
            DecisionDetailViewModel decisionDetailViewModel = (DecisionDetailViewModel) obj;
            return e(i3);
        } else if (i2 != 1) {
            return false;
        } else {
            LiveData liveData = (LiveData) obj;
            return f(i3);
        }
    }

    public final void a(int i2, View view) {
        boolean z = false;
        if (i2 == 1) {
            DecisionDetailViewModel decisionDetailViewModel = this.C;
            if (decisionDetailViewModel != null) {
                z = true;
            }
            if (z) {
                decisionDetailViewModel.k();
            }
        } else if (i2 == 2) {
            DecisionDetailViewModel decisionDetailViewModel2 = this.C;
            if (decisionDetailViewModel2 != null) {
                z = true;
            }
            if (z) {
                decisionDetailViewModel2.x();
            }
        }
    }
}
