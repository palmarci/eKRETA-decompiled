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
import hu.ekreta.ellenorzo.generated.callback.OnClickListener;

public class ActivityCaseDetailsBindingImpl extends ActivityCaseDetailsBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.f R = new ViewDataBinding.f(17);
    public static final SparseIntArray S = new SparseIntArray();
    public final FrameLayout C;
    public final LinearLayout D;
    public final IncludeCaseDetailsNameBinding E;
    public final IncludeCaseDetailsMandatorydocumentsBinding F;
    public final IncludeCaseDetailsAttachmentsBinding G;
    public final IncludeCaseDetailsRectificationbuttonBinding H;
    public final IncludeCaseDetailsSentdateBinding I;
    public final IncludeCaseDetailsStateBinding J;
    public final IncludeCaseDetailsAdministratornameBinding K;
    public final IncludeCaseDetailsStudentnameBinding L;
    public final IncludeCaseDetailsStudenteducationidBinding M;
    public final IncludeCaseDetailsReasonBinding N;
    public final IncludeCaseDetailsPrintableBinding O;
    public final View.OnClickListener P;
    public long Q = -1;

    static {
        R.a(3, new String[]{"include_case_details_name", "include_case_details_rectificationbutton", "include_case_details_sentdate", "include_case_details_state", "include_case_details_administratorname", "include_case_details_studentname", "include_case_details_studenteducationid", "include_case_details_reason", "include_case_details_printable", "include_case_details_mandatorydocuments", "include_case_details_attachments"}, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14}, new int[]{R.layout.include_case_details_name, R.layout.include_case_details_rectificationbutton, R.layout.include_case_details_sentdate, R.layout.include_case_details_state, R.layout.include_case_details_administratorname, R.layout.include_case_details_studentname, R.layout.include_case_details_studenteducationid, R.layout.include_case_details_reason, R.layout.include_case_details_printable, R.layout.include_case_details_mandatorydocuments, R.layout.include_case_details_attachments});
        S.put(R.id.app_bar_layout, 15);
        S.put(R.id.toolbar, 16);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActivityCaseDetailsBindingImpl(h.l.f r11, android.view.View r12) {
        /*
            r10 = this;
            androidx.databinding.ViewDataBinding$f r0 = R
            android.util.SparseIntArray r1 = S
            r2 = 17
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.a((h.l.f) r11, (android.view.View) r12, (int) r2, (androidx.databinding.ViewDataBinding.f) r0, (android.util.SparseIntArray) r1)
            r1 = 15
            r1 = r0[r1]
            r6 = r1
            com.google.android.material.appbar.AppBarLayout r6 = (com.google.android.material.appbar.AppBarLayout) r6
            r1 = 2
            r1 = r0[r1]
            r7 = r1
            androidx.core.widget.NestedScrollView r7 = (androidx.core.widget.NestedScrollView) r7
            r1 = 1
            r2 = r0[r1]
            r8 = r2
            android.widget.ProgressBar r8 = (android.widget.ProgressBar) r8
            r2 = 16
            r2 = r0[r2]
            r9 = r2
            androidx.appcompat.widget.Toolbar r9 = (androidx.appcompat.widget.Toolbar) r9
            r5 = 3
            r2 = r10
            r3 = r11
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r2 = -1
            r10.Q = r2
            androidx.core.widget.NestedScrollView r11 = r10.z
            r2 = 0
            r11.setTag(r2)
            r11 = 0
            r11 = r0[r11]
            android.widget.FrameLayout r11 = (android.widget.FrameLayout) r11
            r10.C = r11
            android.widget.FrameLayout r11 = r10.C
            r11.setTag(r2)
            r11 = 3
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
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsMandatorydocumentsBinding r11 = (hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsMandatorydocumentsBinding) r11
            r10.F = r11
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsMandatorydocumentsBinding r11 = r10.F
            r10.a((androidx.databinding.ViewDataBinding) r11)
            r11 = 14
            r11 = r0[r11]
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAttachmentsBinding r11 = (hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAttachmentsBinding) r11
            r10.G = r11
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAttachmentsBinding r11 = r10.G
            r10.a((androidx.databinding.ViewDataBinding) r11)
            r11 = 5
            r11 = r0[r11]
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsRectificationbuttonBinding r11 = (hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsRectificationbuttonBinding) r11
            r10.H = r11
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsRectificationbuttonBinding r11 = r10.H
            r10.a((androidx.databinding.ViewDataBinding) r11)
            r11 = 6
            r11 = r0[r11]
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsSentdateBinding r11 = (hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsSentdateBinding) r11
            r10.I = r11
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsSentdateBinding r11 = r10.I
            r10.a((androidx.databinding.ViewDataBinding) r11)
            r11 = 7
            r11 = r0[r11]
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStateBinding r11 = (hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStateBinding) r11
            r10.J = r11
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStateBinding r11 = r10.J
            r10.a((androidx.databinding.ViewDataBinding) r11)
            r11 = 8
            r11 = r0[r11]
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAdministratornameBinding r11 = (hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAdministratornameBinding) r11
            r10.K = r11
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAdministratornameBinding r11 = r10.K
            r10.a((androidx.databinding.ViewDataBinding) r11)
            r11 = 9
            r11 = r0[r11]
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStudentnameBinding r11 = (hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStudentnameBinding) r11
            r10.L = r11
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStudentnameBinding r11 = r10.L
            r10.a((androidx.databinding.ViewDataBinding) r11)
            r11 = 10
            r11 = r0[r11]
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStudenteducationidBinding r11 = (hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStudenteducationidBinding) r11
            r10.M = r11
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStudenteducationidBinding r11 = r10.M
            r10.a((androidx.databinding.ViewDataBinding) r11)
            r11 = 11
            r11 = r0[r11]
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsReasonBinding r11 = (hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsReasonBinding) r11
            r10.N = r11
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsReasonBinding r11 = r10.N
            r10.a((androidx.databinding.ViewDataBinding) r11)
            r11 = 12
            r11 = r0[r11]
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsPrintableBinding r11 = (hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsPrintableBinding) r11
            r10.O = r11
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsPrintableBinding r11 = r10.O
            r10.a((androidx.databinding.ViewDataBinding) r11)
            android.widget.ProgressBar r11 = r10.A
            r11.setTag(r2)
            r10.a((android.view.View) r12)
            hu.ekreta.ellenorzo.generated.callback.OnClickListener r11 = new hu.ekreta.ellenorzo.generated.callback.OnClickListener
            r11.<init>(r10, r1)
            r10.P = r11
            r10.a2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.ActivityCaseDetailsBindingImpl.<init>(h.l.f, android.view.View):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ca A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d8 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00eb A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x010b A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void V1() {
        /*
            r51 = this;
            r1 = r51
            monitor-enter(r51)
            long r2 = r1.Q     // Catch:{ all -> 0x024a }
            r4 = 0
            r1.Q = r4     // Catch:{ all -> 0x024a }
            monitor-exit(r51)     // Catch:{ all -> 0x024a }
            hu.ekreta.ellenorzo.cases.detail.CaseDetailsViewModel r0 = r1.B
            r6 = 32767(0x7fff, double:1.6189E-319)
            long r6 = r6 & r2
            r10 = 16644(0x4104, double:8.223E-320)
            r12 = 16452(0x4044, double:8.1284E-320)
            r14 = 16389(0x4005, double:8.097E-320)
            r16 = 16390(0x4006, double:8.0977E-320)
            r18 = 24580(0x6004, double:1.2144E-319)
            r20 = 16420(0x4024, double:8.1126E-320)
            r22 = 18436(0x4804, double:9.1086E-320)
            r24 = 16404(0x4014, double:8.1047E-320)
            r26 = 17412(0x4404, double:8.6027E-320)
            r28 = 16396(0x400c, double:8.1007E-320)
            r8 = 0
            int r32 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r32 == 0) goto L_0x0135
            long r6 = r2 & r26
            int r32 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r32 == 0) goto L_0x0035
            if (r0 == 0) goto L_0x0035
            java.lang.String r6 = r0.E()
            goto L_0x0036
        L_0x0035:
            r6 = 0
        L_0x0036:
            long r32 = r2 & r22
            int r7 = (r32 > r4 ? 1 : (r32 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x0043
            if (r0 == 0) goto L_0x0043
            java.lang.String r7 = r0.P()
            goto L_0x0044
        L_0x0043:
            r7 = 0
        L_0x0044:
            long r32 = r2 & r28
            int r34 = (r32 > r4 ? 1 : (r32 == r4 ? 0 : -1))
            if (r34 == 0) goto L_0x0056
            if (r0 == 0) goto L_0x0051
            boolean r32 = r0.d()
            goto L_0x0053
        L_0x0051:
            r32 = 0
        L_0x0053:
            r33 = r32 ^ 1
            goto L_0x005a
        L_0x0056:
            r32 = 0
            r33 = 0
        L_0x005a:
            long r34 = r2 & r24
            int r36 = (r34 > r4 ? 1 : (r34 == r4 ? 0 : -1))
            if (r36 == 0) goto L_0x0067
            if (r0 == 0) goto L_0x0067
            java.lang.String r34 = r0.r()
            goto L_0x0069
        L_0x0067:
            r34 = 0
        L_0x0069:
            long r35 = r2 & r14
            int r37 = (r35 > r4 ? 1 : (r35 == r4 ? 0 : -1))
            if (r37 == 0) goto L_0x0086
            if (r0 == 0) goto L_0x0078
            androidx.lifecycle.LiveData r35 = r0.getAttachments()
            r9 = r35
            goto L_0x0079
        L_0x0078:
            r9 = 0
        L_0x0079:
            r1.a((int) r8, (androidx.lifecycle.LiveData<?>) r9)
            if (r9 == 0) goto L_0x0086
            java.lang.Object r8 = r9.a()
            r9 = r8
            java.util.List r9 = (java.util.List) r9
            goto L_0x0087
        L_0x0086:
            r9 = 0
        L_0x0087:
            long r36 = r2 & r12
            int r8 = (r36 > r4 ? 1 : (r36 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x0094
            if (r0 == 0) goto L_0x0094
            java.lang.String r8 = r0.u()
            goto L_0x0095
        L_0x0094:
            r8 = 0
        L_0x0095:
            long r36 = r2 & r10
            int r38 = (r36 > r4 ? 1 : (r36 == r4 ? 0 : -1))
            if (r38 == 0) goto L_0x00a2
            if (r0 == 0) goto L_0x00a2
            java.lang.String r36 = r0.z()
            goto L_0x00a4
        L_0x00a2:
            r36 = 0
        L_0x00a4:
            long r37 = r2 & r16
            int r39 = (r37 > r4 ? 1 : (r37 == r4 ? 0 : -1))
            if (r39 == 0) goto L_0x00c1
            if (r0 == 0) goto L_0x00b3
            androidx.lifecycle.LiveData r37 = r0.getMandatoryDocuments()
            r10 = r37
            goto L_0x00b4
        L_0x00b3:
            r10 = 0
        L_0x00b4:
            r11 = 1
            r1.a((int) r11, (androidx.lifecycle.LiveData<?>) r10)
            if (r10 == 0) goto L_0x00c1
            java.lang.Object r10 = r10.a()
            java.util.List r10 = (java.util.List) r10
            goto L_0x00c2
        L_0x00c1:
            r10 = 0
        L_0x00c2:
            r39 = 16900(0x4204, double:8.3497E-320)
            long r39 = r2 & r39
            int r11 = (r39 > r4 ? 1 : (r39 == r4 ? 0 : -1))
            if (r11 == 0) goto L_0x00d1
            if (r0 == 0) goto L_0x00d1
            java.lang.String r11 = r0.q()
            goto L_0x00d2
        L_0x00d1:
            r11 = 0
        L_0x00d2:
            long r39 = r2 & r18
            int r41 = (r39 > r4 ? 1 : (r39 == r4 ? 0 : -1))
            if (r41 == 0) goto L_0x00e1
            if (r0 == 0) goto L_0x00e1
            java.lang.String r39 = r0.J()
            r30 = 16516(0x4084, double:8.16E-320)
            goto L_0x00e5
        L_0x00e1:
            r30 = 16516(0x4084, double:8.16E-320)
            r39 = 0
        L_0x00e5:
            long r40 = r2 & r30
            int r42 = (r40 > r4 ? 1 : (r40 == r4 ? 0 : -1))
            if (r42 == 0) goto L_0x00f2
            if (r0 == 0) goto L_0x00f2
            java.lang.String r40 = r0.l()
            goto L_0x00f4
        L_0x00f2:
            r40 = 0
        L_0x00f4:
            r41 = 20484(0x5004, double:1.01204E-319)
            long r41 = r2 & r41
            int r43 = (r41 > r4 ? 1 : (r41 == r4 ? 0 : -1))
            if (r43 == 0) goto L_0x0103
            if (r0 == 0) goto L_0x0103
            java.lang.String r41 = r0.i()
            goto L_0x0105
        L_0x0103:
            r41 = 0
        L_0x0105:
            long r42 = r2 & r20
            int r44 = (r42 > r4 ? 1 : (r42 == r4 ? 0 : -1))
            if (r44 == 0) goto L_0x0122
            if (r0 == 0) goto L_0x0122
            java.lang.String r35 = r0.o()
            r48 = r6
            r49 = r7
            r47 = r11
            r6 = r34
            r7 = r35
            r46 = r36
            r45 = r40
            r50 = r41
            goto L_0x0131
        L_0x0122:
            r48 = r6
            r49 = r7
            r47 = r11
            r6 = r34
            r46 = r36
            r45 = r40
            r50 = r41
            r7 = 0
        L_0x0131:
            r11 = r8
            r8 = r39
            goto L_0x014b
        L_0x0135:
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r32 = 0
            r33 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
        L_0x014b:
            long r28 = r2 & r28
            int r34 = (r28 > r4 ? 1 : (r28 == r4 ? 0 : -1))
            if (r34 == 0) goto L_0x0163
            androidx.core.widget.NestedScrollView r12 = r1.z
            int r13 = hu.ekreta.ellenorzo.util.binding.BindingConverters.a((boolean) r33)
            r12.setVisibility(r13)
            android.widget.ProgressBar r12 = r1.A
            int r13 = hu.ekreta.ellenorzo.util.binding.BindingConverters.a((boolean) r32)
            r12.setVisibility(r13)
        L_0x0163:
            long r12 = r2 & r24
            int r24 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r24 == 0) goto L_0x016e
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsNameBinding r12 = r1.E
            r12.p(r6)
        L_0x016e:
            long r12 = r2 & r20
            int r6 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0179
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsNameBinding r6 = r1.E
            r6.q(r7)
        L_0x0179:
            long r6 = r2 & r18
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r12 == 0) goto L_0x0184
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsMandatorydocumentsBinding r6 = r1.F
            r6.p(r8)
        L_0x0184:
            long r6 = r2 & r16
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x018f
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsMandatorydocumentsBinding r6 = r1.F
            r6.b(r10)
        L_0x018f:
            long r6 = r2 & r14
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x019a
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAttachmentsBinding r6 = r1.G
            r6.b(r9)
        L_0x019a:
            r6 = 16388(0x4004, double:8.0967E-320)
            long r6 = r6 & r2
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x01a6
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsRectificationbuttonBinding r6 = r1.H
            r6.a(r0)
        L_0x01a6:
            r6 = 16452(0x4044, double:8.1284E-320)
            long r6 = r6 & r2
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x01b2
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsSentdateBinding r0 = r1.I
            r0.p(r11)
        L_0x01b2:
            r6 = 16516(0x4084, double:8.16E-320)
            long r6 = r6 & r2
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x01c0
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStateBinding r0 = r1.J
            r6 = r45
            r0.p(r6)
        L_0x01c0:
            r6 = 16644(0x4104, double:8.223E-320)
            long r6 = r6 & r2
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x01ce
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAdministratornameBinding r0 = r1.K
            r6 = r46
            r0.p(r6)
        L_0x01ce:
            r6 = 16900(0x4204, double:8.3497E-320)
            long r6 = r6 & r2
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x01dc
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStudentnameBinding r0 = r1.L
            r11 = r47
            r0.p(r11)
        L_0x01dc:
            long r6 = r2 & r26
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x01e9
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStudenteducationidBinding r0 = r1.M
            r6 = r48
            r0.p(r6)
        L_0x01e9:
            long r6 = r2 & r22
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x01f6
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsReasonBinding r0 = r1.N
            r7 = r49
            r0.p(r7)
        L_0x01f6:
            r6 = 16384(0x4000, double:8.0948E-320)
            long r6 = r6 & r2
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0204
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsPrintableBinding r0 = r1.O
            android.view.View$OnClickListener r6 = r1.P
            r0.a(r6)
        L_0x0204:
            r6 = 20484(0x5004, double:1.01204E-319)
            long r2 = r2 & r6
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0212
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsPrintableBinding r0 = r1.O
            r2 = r50
            r0.p(r2)
        L_0x0212:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsNameBinding r0 = r1.E
            r0.W1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsRectificationbuttonBinding r0 = r1.H
            r0.W1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsSentdateBinding r0 = r1.I
            r0.W1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStateBinding r0 = r1.J
            r0.W1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAdministratornameBinding r0 = r1.K
            r0.W1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStudentnameBinding r0 = r1.L
            r0.W1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStudenteducationidBinding r0 = r1.M
            r0.W1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsReasonBinding r0 = r1.N
            r0.W1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsPrintableBinding r0 = r1.O
            r0.W1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsMandatorydocumentsBinding r0 = r1.F
            r0.W1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAttachmentsBinding r0 = r1.G
            r0.W1()
            return
        L_0x024a:
            r0 = move-exception
            monitor-exit(r51)     // Catch:{ all -> 0x024a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.ActivityCaseDetailsBindingImpl.V1():void");
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
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0070, code lost:
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
            long r0 = r6.Q     // Catch:{ all -> 0x0072 }
            r2 = 0
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x000c
            monitor-exit(r6)     // Catch:{ all -> 0x0072 }
            return r4
        L_0x000c:
            monitor-exit(r6)     // Catch:{ all -> 0x0072 }
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsNameBinding r0 = r6.E
            boolean r0 = r0.Z1()
            if (r0 == 0) goto L_0x0016
            return r4
        L_0x0016:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsRectificationbuttonBinding r0 = r6.H
            boolean r0 = r0.Z1()
            if (r0 == 0) goto L_0x001f
            return r4
        L_0x001f:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsSentdateBinding r0 = r6.I
            boolean r0 = r0.Z1()
            if (r0 == 0) goto L_0x0028
            return r4
        L_0x0028:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStateBinding r0 = r6.J
            boolean r0 = r0.Z1()
            if (r0 == 0) goto L_0x0031
            return r4
        L_0x0031:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAdministratornameBinding r0 = r6.K
            boolean r0 = r0.Z1()
            if (r0 == 0) goto L_0x003a
            return r4
        L_0x003a:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStudentnameBinding r0 = r6.L
            boolean r0 = r0.Z1()
            if (r0 == 0) goto L_0x0043
            return r4
        L_0x0043:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStudenteducationidBinding r0 = r6.M
            boolean r0 = r0.Z1()
            if (r0 == 0) goto L_0x004c
            return r4
        L_0x004c:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsReasonBinding r0 = r6.N
            boolean r0 = r0.Z1()
            if (r0 == 0) goto L_0x0055
            return r4
        L_0x0055:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsPrintableBinding r0 = r6.O
            boolean r0 = r0.Z1()
            if (r0 == 0) goto L_0x005e
            return r4
        L_0x005e:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsMandatorydocumentsBinding r0 = r6.F
            boolean r0 = r0.Z1()
            if (r0 == 0) goto L_0x0067
            return r4
        L_0x0067:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAttachmentsBinding r0 = r6.G
            boolean r0 = r0.Z1()
            if (r0 == 0) goto L_0x0070
            return r4
        L_0x0070:
            r0 = 0
            return r0
        L_0x0072:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0072 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.ActivityCaseDetailsBindingImpl.Z1():boolean");
    }

    public void a(CaseDetailsViewModel caseDetailsViewModel) {
        a(2, (i) caseDetailsViewModel);
        this.B = caseDetailsViewModel;
        synchronized (this) {
            this.Q |= 4;
        }
        c(88);
        super.b2();
    }

    public void a2() {
        synchronized (this) {
            this.Q = 16384;
        }
        this.E.a2();
        this.H.a2();
        this.I.a2();
        this.J.a2();
        this.K.a2();
        this.L.a2();
        this.M.a2();
        this.N.a2();
        this.O.a2();
        this.F.a2();
        this.G.a2();
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
                this.Q |= 4;
            }
            return true;
        } else if (i2 == 37) {
            synchronized (this) {
                this.Q |= 8;
            }
            return true;
        } else if (i2 == 71) {
            synchronized (this) {
                this.Q |= 16;
            }
            return true;
        } else if (i2 == 63) {
            synchronized (this) {
                this.Q |= 32;
            }
            return true;
        } else if (i2 == 45) {
            synchronized (this) {
                this.Q |= 64;
            }
            return true;
        } else if (i2 == 15) {
            synchronized (this) {
                this.Q |= 128;
            }
            return true;
        } else if (i2 == 20) {
            synchronized (this) {
                this.Q |= 256;
            }
            return true;
        } else if (i2 == 24) {
            synchronized (this) {
                this.Q |= 512;
            }
            return true;
        } else if (i2 == 84) {
            synchronized (this) {
                this.Q |= 1024;
            }
            return true;
        } else if (i2 == 1) {
            synchronized (this) {
                this.Q |= 2048;
            }
            return true;
        } else if (i2 == 29) {
            synchronized (this) {
                this.Q |= 4096;
            }
            return true;
        } else if (i2 != 49) {
            return false;
        } else {
            synchronized (this) {
                this.Q |= 8192;
            }
            return true;
        }
    }

    public final boolean f(int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.Q |= 1;
        }
        return true;
    }

    public final boolean g(int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.Q |= 2;
        }
        return true;
    }

    public void a(m mVar) {
        super.a(mVar);
        this.E.a(mVar);
        this.H.a(mVar);
        this.I.a(mVar);
        this.J.a(mVar);
        this.K.a(mVar);
        this.L.a(mVar);
        this.M.a(mVar);
        this.N.a(mVar);
        this.O.a(mVar);
        this.F.a(mVar);
        this.G.a(mVar);
    }

    public boolean a(int i2, Object obj, int i3) {
        if (i2 == 0) {
            LiveData liveData = (LiveData) obj;
            return f(i3);
        } else if (i2 == 1) {
            LiveData liveData2 = (LiveData) obj;
            return g(i3);
        } else if (i2 != 2) {
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
