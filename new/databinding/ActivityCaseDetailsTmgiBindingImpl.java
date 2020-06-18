package hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import h.l.i;
import h.p.m;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.cases.detail.CaseDetailsViewModel;
import hu.ekreta.ellenorzo.cases.detail.TmgiCaseDetailsViewModel;
import hu.ekreta.ellenorzo.generated.callback.OnClickListener;

public class ActivityCaseDetailsTmgiBindingImpl extends ActivityCaseDetailsTmgiBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.f T = new ViewDataBinding.f(19);
    public static final SparseIntArray U = new SparseIntArray();
    public final FrameLayout C;
    public final LinearLayout D;
    public final IncludeCaseDetailsNameBinding E;
    public final IncludeCaseDetailsReasonBinding F;
    public final IncludeCaseDetailsPrintableBinding G;
    public final IncludeCaseDetailsMandatorydocumentsBinding H;
    public final IncludeCaseDetailsAttachmentsBinding I;
    public final IncludeCaseDetailsRectificationbuttonBinding J;
    public final IncludeCaseDetailsSentdateBinding K;
    public final IncludeCaseDetailsStateBinding L;
    public final IncludeCaseDetailsAdministratornameBinding M;
    public final IncludeCaseDetailsStudentnameBinding N;
    public final IncludeCaseDetailsStudenteducationidBinding O;
    public final IncludeCaseDetailsTmgiJustificationtypeBinding P;
    public final IncludeCaseDetailsTmgiRequestedabsenceintervalBinding Q;
    public final View.OnClickListener R;
    public long S = -1;

    static {
        T.a(2, new String[]{"include_case_details_name", "include_case_details_rectificationbutton", "include_case_details_sentdate", "include_case_details_state", "include_case_details_administratorname", "include_case_details_studentname", "include_case_details_studenteducationid", "include_case_details_tmgi_justificationtype", "include_case_details_tmgi_requestedabsenceinterval", "include_case_details_reason", "include_case_details_printable", "include_case_details_mandatorydocuments", "include_case_details_attachments"}, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16}, new int[]{R.layout.include_case_details_name, R.layout.include_case_details_rectificationbutton, R.layout.include_case_details_sentdate, R.layout.include_case_details_state, R.layout.include_case_details_administratorname, R.layout.include_case_details_studentname, R.layout.include_case_details_studenteducationid, R.layout.include_case_details_tmgi_justificationtype, R.layout.include_case_details_tmgi_requestedabsenceinterval, R.layout.include_case_details_reason, R.layout.include_case_details_printable, R.layout.include_case_details_mandatorydocuments, R.layout.include_case_details_attachments});
        U.put(R.id.app_bar_layout, 17);
        U.put(R.id.toolbar, 18);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActivityCaseDetailsTmgiBindingImpl(h.l.f r11, android.view.View r12) {
        /*
            r10 = this;
            androidx.databinding.ViewDataBinding$f r0 = T
            android.util.SparseIntArray r1 = U
            r2 = 19
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.a((h.l.f) r11, (android.view.View) r12, (int) r2, (androidx.databinding.ViewDataBinding.f) r0, (android.util.SparseIntArray) r1)
            r1 = 17
            r1 = r0[r1]
            r6 = r1
            com.google.android.material.appbar.AppBarLayout r6 = (com.google.android.material.appbar.AppBarLayout) r6
            r1 = 1
            r2 = r0[r1]
            r7 = r2
            androidx.core.widget.NestedScrollView r7 = (androidx.core.widget.NestedScrollView) r7
            r2 = 3
            r2 = r0[r2]
            r8 = r2
            android.widget.ProgressBar r8 = (android.widget.ProgressBar) r8
            r2 = 18
            r2 = r0[r2]
            r9 = r2
            androidx.appcompat.widget.Toolbar r9 = (androidx.appcompat.widget.Toolbar) r9
            r5 = 4
            r2 = r10
            r3 = r11
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r2 = -1
            r10.S = r2
            androidx.core.widget.NestedScrollView r11 = r10.z
            r2 = 0
            r11.setTag(r2)
            r11 = 0
            r11 = r0[r11]
            android.widget.FrameLayout r11 = (android.widget.FrameLayout) r11
            r10.C = r11
            android.widget.FrameLayout r11 = r10.C
            r11.setTag(r2)
            r11 = 2
            r11 = r0[r11]
            android.widget.LinearLayout r11 = (android.widget.LinearLayout) r11
            r10.D = r11
            android.widget.LinearLayout r11 = r10.D
            r11.setTag(r2)
            r11 = 4
            r11 = r0[r11]
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsNameBinding r11 = (hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsNameBinding) r11
            r10.E = r11
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsNameBinding r11 = r10.E
            r10.a((androidx.databinding.ViewDataBinding) r11)
            r11 = 13
            r11 = r0[r11]
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsReasonBinding r11 = (hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsReasonBinding) r11
            r10.F = r11
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsReasonBinding r11 = r10.F
            r10.a((androidx.databinding.ViewDataBinding) r11)
            r11 = 14
            r11 = r0[r11]
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsPrintableBinding r11 = (hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsPrintableBinding) r11
            r10.G = r11
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsPrintableBinding r11 = r10.G
            r10.a((androidx.databinding.ViewDataBinding) r11)
            r11 = 15
            r11 = r0[r11]
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsMandatorydocumentsBinding r11 = (hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsMandatorydocumentsBinding) r11
            r10.H = r11
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsMandatorydocumentsBinding r11 = r10.H
            r10.a((androidx.databinding.ViewDataBinding) r11)
            r11 = 16
            r11 = r0[r11]
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAttachmentsBinding r11 = (hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAttachmentsBinding) r11
            r10.I = r11
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAttachmentsBinding r11 = r10.I
            r10.a((androidx.databinding.ViewDataBinding) r11)
            r11 = 5
            r11 = r0[r11]
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsRectificationbuttonBinding r11 = (hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsRectificationbuttonBinding) r11
            r10.J = r11
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsRectificationbuttonBinding r11 = r10.J
            r10.a((androidx.databinding.ViewDataBinding) r11)
            r11 = 6
            r11 = r0[r11]
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsSentdateBinding r11 = (hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsSentdateBinding) r11
            r10.K = r11
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsSentdateBinding r11 = r10.K
            r10.a((androidx.databinding.ViewDataBinding) r11)
            r11 = 7
            r11 = r0[r11]
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStateBinding r11 = (hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStateBinding) r11
            r10.L = r11
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStateBinding r11 = r10.L
            r10.a((androidx.databinding.ViewDataBinding) r11)
            r11 = 8
            r11 = r0[r11]
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAdministratornameBinding r11 = (hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAdministratornameBinding) r11
            r10.M = r11
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAdministratornameBinding r11 = r10.M
            r10.a((androidx.databinding.ViewDataBinding) r11)
            r11 = 9
            r11 = r0[r11]
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStudentnameBinding r11 = (hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStudentnameBinding) r11
            r10.N = r11
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStudentnameBinding r11 = r10.N
            r10.a((androidx.databinding.ViewDataBinding) r11)
            r11 = 10
            r11 = r0[r11]
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStudenteducationidBinding r11 = (hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStudenteducationidBinding) r11
            r10.O = r11
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStudenteducationidBinding r11 = r10.O
            r10.a((androidx.databinding.ViewDataBinding) r11)
            r11 = 11
            r11 = r0[r11]
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsTmgiJustificationtypeBinding r11 = (hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsTmgiJustificationtypeBinding) r11
            r10.P = r11
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsTmgiJustificationtypeBinding r11 = r10.P
            r10.a((androidx.databinding.ViewDataBinding) r11)
            r11 = 12
            r11 = r0[r11]
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsTmgiRequestedabsenceintervalBinding r11 = (hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsTmgiRequestedabsenceintervalBinding) r11
            r10.Q = r11
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsTmgiRequestedabsenceintervalBinding r11 = r10.Q
            r10.a((androidx.databinding.ViewDataBinding) r11)
            android.widget.ProgressBar r11 = r10.A
            r11.setTag(r2)
            r10.a((android.view.View) r12)
            hu.ekreta.ellenorzo.generated.callback.OnClickListener r11 = new hu.ekreta.ellenorzo.generated.callback.OnClickListener
            r11.<init>(r10, r1)
            r10.R = r11
            r10.a2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.ActivityCaseDetailsTmgiBindingImpl.<init>(h.l.f, android.view.View):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:72:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0141 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x014f A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void V1() {
        /*
            r55 = this;
            r1 = r55
            monitor-enter(r55)
            long r2 = r1.S     // Catch:{ all -> 0x02bc }
            r4 = 0
            r1.S = r4     // Catch:{ all -> 0x02bc }
            monitor-exit(r55)     // Catch:{ all -> 0x02bc }
            hu.ekreta.ellenorzo.cases.detail.CaseDetailsViewModel r0 = r1.B
            r6 = 262143(0x3ffff, double:1.29516E-318)
            long r6 = r6 & r2
            r8 = 131084(0x2000c, double:6.4764E-319)
            r12 = 163848(0x28008, double:8.09517E-319)
            r14 = 132104(0x20408, double:6.5268E-319)
            r16 = 135176(0x21008, double:6.6786E-319)
            r18 = 147464(0x24008, double:7.2857E-319)
            r20 = 133128(0x20808, double:6.5774E-319)
            r22 = 131336(0x20108, double:6.48886E-319)
            r24 = 131592(0x20208, double:6.5015E-319)
            r26 = 131208(0x20088, double:6.48254E-319)
            r28 = 139272(0x22008, double:6.88095E-319)
            r30 = 131144(0x20048, double:6.47937E-319)
            r10 = 0
            int r34 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r34 == 0) goto L_0x017a
            long r6 = r2 & r28
            int r34 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r34 == 0) goto L_0x0043
            if (r0 == 0) goto L_0x0043
            java.lang.String r6 = r0.E()
            goto L_0x0044
        L_0x0043:
            r6 = 0
        L_0x0044:
            long r34 = r2 & r24
            int r7 = (r34 > r4 ? 1 : (r34 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x0051
            if (r0 == 0) goto L_0x0051
            java.lang.String r7 = r0.u()
            goto L_0x0052
        L_0x0051:
            r7 = 0
        L_0x0052:
            long r34 = r2 & r20
            int r36 = (r34 > r4 ? 1 : (r34 == r4 ? 0 : -1))
            if (r36 == 0) goto L_0x005f
            if (r0 == 0) goto L_0x005f
            java.lang.String r34 = r0.z()
            goto L_0x0061
        L_0x005f:
            r34 = 0
        L_0x0061:
            long r35 = r2 & r16
            int r37 = (r35 > r4 ? 1 : (r35 == r4 ? 0 : -1))
            if (r37 == 0) goto L_0x006e
            if (r0 == 0) goto L_0x006e
            java.lang.String r35 = r0.q()
            goto L_0x0070
        L_0x006e:
            r35 = 0
        L_0x0070:
            long r36 = r2 & r14
            int r38 = (r36 > r4 ? 1 : (r36 == r4 ? 0 : -1))
            if (r38 == 0) goto L_0x007d
            if (r0 == 0) goto L_0x007d
            java.lang.String r36 = r0.l()
            goto L_0x007f
        L_0x007d:
            r36 = 0
        L_0x007f:
            long r37 = r2 & r12
            int r39 = (r37 > r4 ? 1 : (r37 == r4 ? 0 : -1))
            if (r39 == 0) goto L_0x008c
            if (r0 == 0) goto L_0x008c
            java.lang.String r37 = r0.i()
            goto L_0x008e
        L_0x008c:
            r37 = 0
        L_0x008e:
            long r38 = r2 & r18
            int r40 = (r38 > r4 ? 1 : (r38 == r4 ? 0 : -1))
            if (r40 == 0) goto L_0x009b
            if (r0 == 0) goto L_0x009b
            java.lang.String r38 = r0.P()
            goto L_0x009d
        L_0x009b:
            r38 = 0
        L_0x009d:
            long r39 = r2 & r30
            int r41 = (r39 > r4 ? 1 : (r39 == r4 ? 0 : -1))
            if (r41 == 0) goto L_0x00af
            if (r0 == 0) goto L_0x00aa
            boolean r39 = r0.d()
            goto L_0x00ac
        L_0x00aa:
            r39 = 0
        L_0x00ac:
            r40 = r39 ^ 1
            goto L_0x00b3
        L_0x00af:
            r39 = 0
            r40 = 0
        L_0x00b3:
            long r41 = r2 & r26
            int r43 = (r41 > r4 ? 1 : (r41 == r4 ? 0 : -1))
            if (r43 == 0) goto L_0x00c0
            if (r0 == 0) goto L_0x00c0
            java.lang.String r41 = r0.r()
            goto L_0x00c2
        L_0x00c0:
            r41 = 0
        L_0x00c2:
            r42 = 131129(0x20039, double:6.47863E-319)
            long r42 = r2 & r42
            int r44 = (r42 > r4 ? 1 : (r42 == r4 ? 0 : -1))
            if (r44 == 0) goto L_0x00f9
            if (r0 == 0) goto L_0x00d4
            hu.ekreta.ellenorzo.cases.detail.TmgiCaseDetailsViewModel r42 = r0.B()
            r11 = r42
            goto L_0x00d5
        L_0x00d4:
            r11 = 0
        L_0x00d5:
            r1.a((int) r10, (h.l.i) r11)
            r43 = 131113(0x20029, double:6.47784E-319)
            long r43 = r2 & r43
            int r10 = (r43 > r4 ? 1 : (r43 == r4 ? 0 : -1))
            if (r10 == 0) goto L_0x00e8
            if (r11 == 0) goto L_0x00e8
            java.lang.String r10 = r11.g0()
            goto L_0x00e9
        L_0x00e8:
            r10 = 0
        L_0x00e9:
            r43 = 131097(0x20019, double:6.47705E-319)
            long r43 = r2 & r43
            int r45 = (r43 > r4 ? 1 : (r43 == r4 ? 0 : -1))
            if (r45 == 0) goto L_0x00fa
            if (r11 == 0) goto L_0x00fa
            java.lang.String r11 = r11.n0()
            goto L_0x00fb
        L_0x00f9:
            r10 = 0
        L_0x00fa:
            r11 = 0
        L_0x00fb:
            r43 = 131082(0x2000a, double:6.4763E-319)
            long r43 = r2 & r43
            int r45 = (r43 > r4 ? 1 : (r43 == r4 ? 0 : -1))
            if (r45 == 0) goto L_0x011b
            if (r0 == 0) goto L_0x010d
            androidx.lifecycle.LiveData r43 = r0.getAttachments()
            r14 = r43
            goto L_0x010e
        L_0x010d:
            r14 = 0
        L_0x010e:
            r15 = 1
            r1.a((int) r15, (androidx.lifecycle.LiveData<?>) r14)
            if (r14 == 0) goto L_0x011b
            java.lang.Object r14 = r14.a()
            java.util.List r14 = (java.util.List) r14
            goto L_0x011c
        L_0x011b:
            r14 = 0
        L_0x011c:
            long r45 = r2 & r8
            int r15 = (r45 > r4 ? 1 : (r45 == r4 ? 0 : -1))
            if (r15 == 0) goto L_0x0137
            if (r0 == 0) goto L_0x0129
            androidx.lifecycle.LiveData r15 = r0.getMandatoryDocuments()
            goto L_0x012a
        L_0x0129:
            r15 = 0
        L_0x012a:
            r8 = 2
            r1.a((int) r8, (androidx.lifecycle.LiveData<?>) r15)
            if (r15 == 0) goto L_0x0137
            java.lang.Object r8 = r15.a()
            java.util.List r8 = (java.util.List) r8
            goto L_0x0138
        L_0x0137:
            r8 = 0
        L_0x0138:
            r32 = 196616(0x30008, double:9.7141E-319)
            long r47 = r2 & r32
            int r9 = (r47 > r4 ? 1 : (r47 == r4 ? 0 : -1))
            if (r9 == 0) goto L_0x0148
            if (r0 == 0) goto L_0x0148
            java.lang.String r9 = r0.J()
            goto L_0x0149
        L_0x0148:
            r9 = 0
        L_0x0149:
            long r47 = r2 & r22
            int r15 = (r47 > r4 ? 1 : (r47 == r4 ? 0 : -1))
            if (r15 == 0) goto L_0x0164
            if (r0 == 0) goto L_0x0164
            java.lang.String r15 = r0.o()
            r52 = r6
            r54 = r10
            r53 = r11
            r50 = r34
            r51 = r35
            r49 = r36
            r6 = r41
            goto L_0x0173
        L_0x0164:
            r52 = r6
            r54 = r10
            r53 = r11
            r50 = r34
            r51 = r35
            r49 = r36
            r6 = r41
            r15 = 0
        L_0x0173:
            r11 = r7
            r10 = r8
            r8 = r37
            r7 = r38
            goto L_0x0192
        L_0x017a:
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r14 = 0
            r15 = 0
            r39 = 0
            r40 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            r54 = 0
        L_0x0192:
            long r30 = r2 & r30
            int r34 = (r30 > r4 ? 1 : (r30 == r4 ? 0 : -1))
            if (r34 == 0) goto L_0x01aa
            androidx.core.widget.NestedScrollView r12 = r1.z
            int r13 = hu.ekreta.ellenorzo.util.binding.BindingConverters.a((boolean) r40)
            r12.setVisibility(r13)
            android.widget.ProgressBar r12 = r1.A
            int r13 = hu.ekreta.ellenorzo.util.binding.BindingConverters.a((boolean) r39)
            r12.setVisibility(r13)
        L_0x01aa:
            long r12 = r2 & r26
            int r26 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r26 == 0) goto L_0x01b5
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsNameBinding r12 = r1.E
            r12.p(r6)
        L_0x01b5:
            long r12 = r2 & r22
            int r6 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x01c0
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsNameBinding r6 = r1.E
            r6.q(r15)
        L_0x01c0:
            long r12 = r2 & r18
            int r6 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x01cb
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsReasonBinding r6 = r1.F
            r6.p(r7)
        L_0x01cb:
            r6 = 131072(0x20000, double:6.47582E-319)
            long r6 = r6 & r2
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r12 == 0) goto L_0x01da
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsPrintableBinding r6 = r1.G
            android.view.View$OnClickListener r7 = r1.R
            r6.a(r7)
        L_0x01da:
            r6 = 163848(0x28008, double:8.09517E-319)
            long r6 = r6 & r2
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r12 == 0) goto L_0x01e7
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsPrintableBinding r6 = r1.G
            r6.p(r8)
        L_0x01e7:
            r6 = 196616(0x30008, double:9.7141E-319)
            long r6 = r6 & r2
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x01f4
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsMandatorydocumentsBinding r6 = r1.H
            r6.p(r9)
        L_0x01f4:
            r6 = 131084(0x2000c, double:6.4764E-319)
            long r6 = r6 & r2
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x0201
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsMandatorydocumentsBinding r6 = r1.H
            r6.b(r10)
        L_0x0201:
            r6 = 131082(0x2000a, double:6.4763E-319)
            long r6 = r6 & r2
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x020e
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAttachmentsBinding r6 = r1.I
            r6.b(r14)
        L_0x020e:
            r6 = 131080(0x20008, double:6.4762E-319)
            long r6 = r6 & r2
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x021b
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsRectificationbuttonBinding r6 = r1.J
            r6.a(r0)
        L_0x021b:
            long r6 = r2 & r24
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0226
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsSentdateBinding r0 = r1.K
            r0.p(r11)
        L_0x0226:
            r6 = 132104(0x20408, double:6.5268E-319)
            long r6 = r6 & r2
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0235
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStateBinding r0 = r1.L
            r6 = r49
            r0.p(r6)
        L_0x0235:
            long r6 = r2 & r20
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0242
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAdministratornameBinding r0 = r1.M
            r6 = r50
            r0.p(r6)
        L_0x0242:
            long r6 = r2 & r16
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x024f
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStudentnameBinding r0 = r1.N
            r6 = r51
            r0.p(r6)
        L_0x024f:
            long r6 = r2 & r28
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x025c
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStudenteducationidBinding r0 = r1.O
            r6 = r52
            r0.p(r6)
        L_0x025c:
            r6 = 131097(0x20019, double:6.47705E-319)
            long r6 = r6 & r2
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x026b
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsTmgiJustificationtypeBinding r0 = r1.P
            r11 = r53
            r0.p(r11)
        L_0x026b:
            r6 = 131113(0x20029, double:6.47784E-319)
            long r2 = r2 & r6
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x027a
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsTmgiRequestedabsenceintervalBinding r0 = r1.Q
            r10 = r54
            r0.p(r10)
        L_0x027a:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsNameBinding r0 = r1.E
            r0.W1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsRectificationbuttonBinding r0 = r1.J
            r0.W1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsSentdateBinding r0 = r1.K
            r0.W1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStateBinding r0 = r1.L
            r0.W1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAdministratornameBinding r0 = r1.M
            r0.W1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStudentnameBinding r0 = r1.N
            r0.W1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStudenteducationidBinding r0 = r1.O
            r0.W1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsTmgiJustificationtypeBinding r0 = r1.P
            r0.W1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsTmgiRequestedabsenceintervalBinding r0 = r1.Q
            r0.W1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsReasonBinding r0 = r1.F
            r0.W1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsPrintableBinding r0 = r1.G
            r0.W1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsMandatorydocumentsBinding r0 = r1.H
            r0.W1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAttachmentsBinding r0 = r1.I
            r0.W1()
            return
        L_0x02bc:
            r0 = move-exception
            monitor-exit(r55)     // Catch:{ all -> 0x02bc }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.ActivityCaseDetailsTmgiBindingImpl.V1():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r6.J.Z1() == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        if (r6.K.Z1() == false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        if (r6.L.Z1() == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        if (r6.M.Z1() == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        if (r6.N.Z1() == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        if (r6.O.Z1() == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004b, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0052, code lost:
        if (r6.P.Z1() == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0054, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005b, code lost:
        if (r6.Q.Z1() == false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005d, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0064, code lost:
        if (r6.F.Z1() == false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0066, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006d, code lost:
        if (r6.G.Z1() == false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x006f, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0076, code lost:
        if (r6.H.Z1() == false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0078, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x007f, code lost:
        if (r6.I.Z1() == false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0081, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0082, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r6.E.Z1() == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Z1() {
        /*
            r6 = this;
            monitor-enter(r6)
            long r0 = r6.S     // Catch:{ all -> 0x0084 }
            r2 = 0
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x000c
            monitor-exit(r6)     // Catch:{ all -> 0x0084 }
            return r4
        L_0x000c:
            monitor-exit(r6)     // Catch:{ all -> 0x0084 }
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsNameBinding r0 = r6.E
            boolean r0 = r0.Z1()
            if (r0 == 0) goto L_0x0016
            return r4
        L_0x0016:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsRectificationbuttonBinding r0 = r6.J
            boolean r0 = r0.Z1()
            if (r0 == 0) goto L_0x001f
            return r4
        L_0x001f:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsSentdateBinding r0 = r6.K
            boolean r0 = r0.Z1()
            if (r0 == 0) goto L_0x0028
            return r4
        L_0x0028:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStateBinding r0 = r6.L
            boolean r0 = r0.Z1()
            if (r0 == 0) goto L_0x0031
            return r4
        L_0x0031:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAdministratornameBinding r0 = r6.M
            boolean r0 = r0.Z1()
            if (r0 == 0) goto L_0x003a
            return r4
        L_0x003a:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStudentnameBinding r0 = r6.N
            boolean r0 = r0.Z1()
            if (r0 == 0) goto L_0x0043
            return r4
        L_0x0043:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStudenteducationidBinding r0 = r6.O
            boolean r0 = r0.Z1()
            if (r0 == 0) goto L_0x004c
            return r4
        L_0x004c:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsTmgiJustificationtypeBinding r0 = r6.P
            boolean r0 = r0.Z1()
            if (r0 == 0) goto L_0x0055
            return r4
        L_0x0055:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsTmgiRequestedabsenceintervalBinding r0 = r6.Q
            boolean r0 = r0.Z1()
            if (r0 == 0) goto L_0x005e
            return r4
        L_0x005e:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsReasonBinding r0 = r6.F
            boolean r0 = r0.Z1()
            if (r0 == 0) goto L_0x0067
            return r4
        L_0x0067:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsPrintableBinding r0 = r6.G
            boolean r0 = r0.Z1()
            if (r0 == 0) goto L_0x0070
            return r4
        L_0x0070:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsMandatorydocumentsBinding r0 = r6.H
            boolean r0 = r0.Z1()
            if (r0 == 0) goto L_0x0079
            return r4
        L_0x0079:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAttachmentsBinding r0 = r6.I
            boolean r0 = r0.Z1()
            if (r0 == 0) goto L_0x0082
            return r4
        L_0x0082:
            r0 = 0
            return r0
        L_0x0084:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0084 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.ActivityCaseDetailsTmgiBindingImpl.Z1():boolean");
    }

    public void a(CaseDetailsViewModel caseDetailsViewModel) {
        a(3, (i) caseDetailsViewModel);
        this.B = caseDetailsViewModel;
        synchronized (this) {
            this.S |= 8;
        }
        c(88);
        super.b2();
    }

    public void a2() {
        synchronized (this) {
            this.S = 131072;
        }
        this.E.a2();
        this.J.a2();
        this.K.a2();
        this.L.a2();
        this.M.a2();
        this.N.a2();
        this.O.a2();
        this.P.a2();
        this.Q.a2();
        this.F.a2();
        this.G.a2();
        this.H.a2();
        this.I.a2();
        b2();
    }

    public boolean c(int i2, Object obj) {
        if (88 != i2) {
            return false;
        }
        a((CaseDetailsViewModel) obj);
        return true;
    }

    public final boolean e(int i2) {
        if (i2 == 0) {
            synchronized (this) {
                this.S |= 8;
            }
            return true;
        } else if (i2 == 37) {
            synchronized (this) {
                this.S |= 64;
            }
            return true;
        } else if (i2 == 71) {
            synchronized (this) {
                this.S |= 128;
            }
            return true;
        } else if (i2 == 63) {
            synchronized (this) {
                this.S |= 256;
            }
            return true;
        } else if (i2 == 45) {
            synchronized (this) {
                this.S |= 512;
            }
            return true;
        } else if (i2 == 15) {
            synchronized (this) {
                this.S |= 1024;
            }
            return true;
        } else if (i2 == 20) {
            synchronized (this) {
                this.S |= 2048;
            }
            return true;
        } else if (i2 == 24) {
            synchronized (this) {
                this.S |= 4096;
            }
            return true;
        } else if (i2 == 84) {
            synchronized (this) {
                this.S |= 8192;
            }
            return true;
        } else if (i2 == 1) {
            synchronized (this) {
                this.S |= 16384;
            }
            return true;
        } else if (i2 == 29) {
            synchronized (this) {
                this.S |= 32768;
            }
            return true;
        } else if (i2 != 49) {
            return false;
        } else {
            synchronized (this) {
                this.S |= 65536;
            }
            return true;
        }
    }

    public final boolean f(int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.S |= 2;
        }
        return true;
    }

    public final boolean g(int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.S |= 4;
        }
        return true;
    }

    public final boolean h(int i2) {
        if (i2 == 0) {
            synchronized (this) {
                this.S |= 1;
            }
            return true;
        } else if (i2 == 66) {
            synchronized (this) {
                this.S |= 16;
            }
            return true;
        } else if (i2 != 11) {
            return false;
        } else {
            synchronized (this) {
                this.S |= 32;
            }
            return true;
        }
    }

    public void a(m mVar) {
        super.a(mVar);
        this.E.a(mVar);
        this.J.a(mVar);
        this.K.a(mVar);
        this.L.a(mVar);
        this.M.a(mVar);
        this.N.a(mVar);
        this.O.a(mVar);
        this.P.a(mVar);
        this.Q.a(mVar);
        this.F.a(mVar);
        this.G.a(mVar);
        this.H.a(mVar);
        this.I.a(mVar);
    }

    public boolean a(int i2, Object obj, int i3) {
        if (i2 == 0) {
            TmgiCaseDetailsViewModel tmgiCaseDetailsViewModel = (TmgiCaseDetailsViewModel) obj;
            return h(i3);
        } else if (i2 == 1) {
            LiveData liveData = (LiveData) obj;
            return f(i3);
        } else if (i2 == 2) {
            LiveData liveData2 = (LiveData) obj;
            return g(i3);
        } else if (i2 != 3) {
            return false;
        } else {
            CaseDetailsViewModel caseDetailsViewModel = (CaseDetailsViewModel) obj;
            return e(i3);
        }
    }

    public final void a(int i2, View view) {
        CaseDetailsViewModel caseDetailsViewModel = this.B;
        if (caseDetailsViewModel != null) {
            caseDetailsViewModel.k();
        }
    }
}
