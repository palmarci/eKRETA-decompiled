package p289hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding.C2867f;
import androidx.lifecycle.LiveData;
import com.google.android.material.appbar.AppBarLayout;
import p211h.p258l.C3702f;
import p211h.p258l.C3705i;
import p211h.p271p.C3818m;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.cases.detail.CaseDetailsViewModel;
import p289hu.ekreta.ellenorzo.generated.callback.OnClickListener.Listener;

/* renamed from: hu.ekreta.ellenorzo.databinding.ActivityCaseDetailsBindingImpl */
public class ActivityCaseDetailsBindingImpl extends ActivityCaseDetailsBinding implements Listener {

    /* renamed from: R */
    public static final C2867f f11937R = new C2867f(17);

    /* renamed from: S */
    public static final SparseIntArray f11938S = new SparseIntArray();

    /* renamed from: C */
    public final FrameLayout f11939C;

    /* renamed from: D */
    public final LinearLayout f11940D;

    /* renamed from: E */
    public final IncludeCaseDetailsNameBinding f11941E;

    /* renamed from: F */
    public final IncludeCaseDetailsMandatorydocumentsBinding f11942F;

    /* renamed from: G */
    public final IncludeCaseDetailsAttachmentsBinding f11943G;

    /* renamed from: H */
    public final IncludeCaseDetailsRectificationbuttonBinding f11944H;

    /* renamed from: I */
    public final IncludeCaseDetailsSentdateBinding f11945I;

    /* renamed from: J */
    public final IncludeCaseDetailsStateBinding f11946J;

    /* renamed from: K */
    public final IncludeCaseDetailsAdministratornameBinding f11947K;

    /* renamed from: L */
    public final IncludeCaseDetailsStudentnameBinding f11948L;

    /* renamed from: M */
    public final IncludeCaseDetailsStudenteducationidBinding f11949M;

    /* renamed from: N */
    public final IncludeCaseDetailsReasonBinding f11950N;

    /* renamed from: O */
    public final IncludeCaseDetailsPrintableBinding f11951O;

    /* renamed from: P */
    public final OnClickListener f11952P;

    /* renamed from: Q */
    public long f11953Q = -1;

    static {
        f11937R.mo6113a(3, new String[]{"include_case_details_name", "include_case_details_rectificationbutton", "include_case_details_sentdate", "include_case_details_state", "include_case_details_administratorname", "include_case_details_studentname", "include_case_details_studenteducationid", "include_case_details_reason", "include_case_details_printable", "include_case_details_mandatorydocuments", "include_case_details_attachments"}, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14}, new int[]{C4014R.layout.include_case_details_name, C4014R.layout.include_case_details_rectificationbutton, C4014R.layout.include_case_details_sentdate, C4014R.layout.include_case_details_state, C4014R.layout.include_case_details_administratorname, C4014R.layout.include_case_details_studentname, C4014R.layout.include_case_details_studenteducationid, C4014R.layout.include_case_details_reason, C4014R.layout.include_case_details_printable, C4014R.layout.include_case_details_mandatorydocuments, C4014R.layout.include_case_details_attachments});
        f11938S.put(C4014R.C4016id.app_bar_layout, 15);
        f11938S.put(C4014R.C4016id.toolbar, 16);
    }

    public ActivityCaseDetailsBindingImpl(C3702f fVar, View view) {
        Object[] a = ViewDataBinding.m6046a(fVar, view, 17, f11937R, f11938S);
        super(fVar, view, 3, (AppBarLayout) a[15], (NestedScrollView) a[2], (ProgressBar) a[1], (Toolbar) a[16]);
        this.f11936z.setTag(null);
        this.f11939C = (FrameLayout) a[0];
        this.f11939C.setTag(null);
        this.f11940D = (LinearLayout) a[3];
        this.f11940D.setTag(null);
        this.f11941E = (IncludeCaseDetailsNameBinding) a[4];
        mo6099a((ViewDataBinding) this.f11941E);
        this.f11942F = (IncludeCaseDetailsMandatorydocumentsBinding) a[13];
        mo6099a((ViewDataBinding) this.f11942F);
        this.f11943G = (IncludeCaseDetailsAttachmentsBinding) a[14];
        mo6099a((ViewDataBinding) this.f11943G);
        this.f11944H = (IncludeCaseDetailsRectificationbuttonBinding) a[5];
        mo6099a((ViewDataBinding) this.f11944H);
        this.f11945I = (IncludeCaseDetailsSentdateBinding) a[6];
        mo6099a((ViewDataBinding) this.f11945I);
        this.f11946J = (IncludeCaseDetailsStateBinding) a[7];
        mo6099a((ViewDataBinding) this.f11946J);
        this.f11947K = (IncludeCaseDetailsAdministratornameBinding) a[8];
        mo6099a((ViewDataBinding) this.f11947K);
        this.f11948L = (IncludeCaseDetailsStudentnameBinding) a[9];
        mo6099a((ViewDataBinding) this.f11948L);
        this.f11949M = (IncludeCaseDetailsStudenteducationidBinding) a[10];
        mo6099a((ViewDataBinding) this.f11949M);
        this.f11950N = (IncludeCaseDetailsReasonBinding) a[11];
        mo6099a((ViewDataBinding) this.f11950N);
        this.f11951O = (IncludeCaseDetailsPrintableBinding) a[12];
        mo6099a((ViewDataBinding) this.f11951O);
        this.f11934A.setTag(null);
        mo6098a(view);
        this.f11952P = new p289hu.ekreta.ellenorzo.generated.callback.OnClickListener(this, 1);
        mo6095R1();
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ca A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d8 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00eb A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x010b A[ADDED_TO_REGION] */
    /* renamed from: M1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6090M1() {
        /*
            r51 = this;
            r1 = r51
            monitor-enter(r51)
            long r2 = r1.f11953Q     // Catch:{ all -> 0x024a }
            r4 = 0
            r1.f11953Q = r4     // Catch:{ all -> 0x024a }
            monitor-exit(r51)     // Catch:{ all -> 0x024a }
            hu.ekreta.ellenorzo.cases.detail.CaseDetailsViewModel r0 = r1.f11935B
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
            java.lang.String r6 = r0.mo11786E()
            goto L_0x0036
        L_0x0035:
            r6 = 0
        L_0x0036:
            long r32 = r2 & r22
            int r7 = (r32 > r4 ? 1 : (r32 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x0043
            if (r0 == 0) goto L_0x0043
            java.lang.String r7 = r0.mo11791P()
            goto L_0x0044
        L_0x0043:
            r7 = 0
        L_0x0044:
            long r32 = r2 & r28
            int r34 = (r32 > r4 ? 1 : (r32 == r4 ? 0 : -1))
            if (r34 == 0) goto L_0x0056
            if (r0 == 0) goto L_0x0051
            boolean r32 = r0.mo11797d()
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
            java.lang.String r34 = r0.mo11805r()
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
            r1.mo6102a(r8, r9)
            if (r9 == 0) goto L_0x0086
            java.lang.Object r8 = r9.mo6263a()
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
            java.lang.String r8 = r0.mo11806u()
            goto L_0x0095
        L_0x0094:
            r8 = 0
        L_0x0095:
            long r36 = r2 & r10
            int r38 = (r36 > r4 ? 1 : (r36 == r4 ? 0 : -1))
            if (r38 == 0) goto L_0x00a2
            if (r0 == 0) goto L_0x00a2
            java.lang.String r36 = r0.mo11808z()
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
            r1.mo6102a(r11, r10)
            if (r10 == 0) goto L_0x00c1
            java.lang.Object r10 = r10.mo6263a()
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
            java.lang.String r11 = r0.mo11804q()
            goto L_0x00d2
        L_0x00d1:
            r11 = 0
        L_0x00d2:
            long r39 = r2 & r18
            int r41 = (r39 > r4 ? 1 : (r39 == r4 ? 0 : -1))
            if (r41 == 0) goto L_0x00e1
            if (r0 == 0) goto L_0x00e1
            java.lang.String r39 = r0.mo11788J()
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
            java.lang.String r40 = r0.mo11802l()
            goto L_0x00f4
        L_0x00f2:
            r40 = 0
        L_0x00f4:
            r41 = 20484(0x5004, double:1.01204E-319)
            long r41 = r2 & r41
            int r43 = (r41 > r4 ? 1 : (r41 == r4 ? 0 : -1))
            if (r43 == 0) goto L_0x0103
            if (r0 == 0) goto L_0x0103
            java.lang.String r41 = r0.mo11800i()
            goto L_0x0105
        L_0x0103:
            r41 = 0
        L_0x0105:
            long r42 = r2 & r20
            int r44 = (r42 > r4 ? 1 : (r42 == r4 ? 0 : -1))
            if (r44 == 0) goto L_0x0122
            if (r0 == 0) goto L_0x0122
            java.lang.String r35 = r0.mo11803o()
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
            androidx.core.widget.NestedScrollView r12 = r1.f11936z
            int r13 = p289hu.ekreta.ellenorzo.util.binding.BindingConverters.m14795a(r33)
            r12.setVisibility(r13)
            android.widget.ProgressBar r12 = r1.f11934A
            int r13 = p289hu.ekreta.ellenorzo.util.binding.BindingConverters.m14795a(r32)
            r12.setVisibility(r13)
        L_0x0163:
            long r12 = r2 & r24
            int r24 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r24 == 0) goto L_0x016e
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsNameBinding r12 = r1.f11941E
            r12.mo12430q(r6)
        L_0x016e:
            long r12 = r2 & r20
            int r6 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0179
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsNameBinding r6 = r1.f11941E
            r6.mo12431r(r7)
        L_0x0179:
            long r6 = r2 & r18
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r12 == 0) goto L_0x0184
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsMandatorydocumentsBinding r6 = r1.f11942F
            r6.mo12429q(r8)
        L_0x0184:
            long r6 = r2 & r16
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x018f
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsMandatorydocumentsBinding r6 = r1.f11942F
            r6.mo12428b(r10)
        L_0x018f:
            long r6 = r2 & r14
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x019a
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAttachmentsBinding r6 = r1.f11943G
            r6.mo12427b(r9)
        L_0x019a:
            r6 = 16388(0x4004, double:8.0967E-320)
            long r6 = r6 & r2
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x01a6
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsRectificationbuttonBinding r6 = r1.f11944H
            r6.mo12437a(r0)
        L_0x01a6:
            r6 = 16452(0x4044, double:8.1284E-320)
            long r6 = r6 & r2
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x01b2
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsSentdateBinding r0 = r1.f11945I
            r0.mo12439q(r11)
        L_0x01b2:
            r6 = 16516(0x4084, double:8.16E-320)
            long r6 = r6 & r2
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x01c0
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStateBinding r0 = r1.f11946J
            r6 = r45
            r0.mo12440q(r6)
        L_0x01c0:
            r6 = 16644(0x4104, double:8.223E-320)
            long r6 = r6 & r2
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x01ce
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAdministratornameBinding r0 = r1.f11947K
            r6 = r46
            r0.mo12426q(r6)
        L_0x01ce:
            r6 = 16900(0x4204, double:8.3497E-320)
            long r6 = r6 & r2
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x01dc
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStudentnameBinding r0 = r1.f11948L
            r11 = r47
            r0.mo12442q(r11)
        L_0x01dc:
            long r6 = r2 & r26
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x01e9
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStudenteducationidBinding r0 = r1.f11949M
            r6 = r48
            r0.mo12441q(r6)
        L_0x01e9:
            long r6 = r2 & r22
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x01f6
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsReasonBinding r0 = r1.f11950N
            r7 = r49
            r0.mo12436q(r7)
        L_0x01f6:
            r6 = 16384(0x4000, double:8.0948E-320)
            long r6 = r6 & r2
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0204
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsPrintableBinding r0 = r1.f11951O
            android.view.View$OnClickListener r6 = r1.f11952P
            r0.mo12432a(r6)
        L_0x0204:
            r6 = 20484(0x5004, double:1.01204E-319)
            long r2 = r2 & r6
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0212
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsPrintableBinding r0 = r1.f11951O
            r2 = r50
            r0.mo12433q(r2)
        L_0x0212:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsNameBinding r0 = r1.f11941E
            r0.mo6091N1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsRectificationbuttonBinding r0 = r1.f11944H
            r0.mo6091N1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsSentdateBinding r0 = r1.f11945I
            r0.mo6091N1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStateBinding r0 = r1.f11946J
            r0.mo6091N1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAdministratornameBinding r0 = r1.f11947K
            r0.mo6091N1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStudentnameBinding r0 = r1.f11948L
            r0.mo6091N1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStudenteducationidBinding r0 = r1.f11949M
            r0.mo6091N1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsReasonBinding r0 = r1.f11950N
            r0.mo6091N1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsPrintableBinding r0 = r1.f11951O
            r0.mo6091N1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsMandatorydocumentsBinding r0 = r1.f11942F
            r0.mo6091N1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAttachmentsBinding r0 = r1.f11943G
            r0.mo6091N1()
            return
        L_0x024a:
            r0 = move-exception
            monitor-exit(r51)     // Catch:{ all -> 0x024a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.databinding.ActivityCaseDetailsBindingImpl.mo6090M1():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r6.f11944H.mo6094Q1() == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        if (r6.f11945I.mo6094Q1() == false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        if (r6.f11946J.mo6094Q1() == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        if (r6.f11947K.mo6094Q1() == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        if (r6.f11948L.mo6094Q1() == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        if (r6.f11949M.mo6094Q1() == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004b, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0052, code lost:
        if (r6.f11950N.mo6094Q1() == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0054, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005b, code lost:
        if (r6.f11951O.mo6094Q1() == false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005d, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0064, code lost:
        if (r6.f11942F.mo6094Q1() == false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0066, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006d, code lost:
        if (r6.f11943G.mo6094Q1() == false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x006f, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0071, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r6.f11941E.mo6094Q1() == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        return true;
     */
    /* renamed from: Q1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo6094Q1() {
        /*
            r6 = this;
            monitor-enter(r6)
            long r0 = r6.f11953Q     // Catch:{ all -> 0x0072 }
            r2 = 0
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x000c
            monitor-exit(r6)     // Catch:{ all -> 0x0072 }
            return r4
        L_0x000c:
            monitor-exit(r6)     // Catch:{ all -> 0x0072 }
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsNameBinding r0 = r6.f11941E
            boolean r0 = r0.mo6094Q1()
            if (r0 == 0) goto L_0x0016
            return r4
        L_0x0016:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsRectificationbuttonBinding r0 = r6.f11944H
            boolean r0 = r0.mo6094Q1()
            if (r0 == 0) goto L_0x001f
            return r4
        L_0x001f:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsSentdateBinding r0 = r6.f11945I
            boolean r0 = r0.mo6094Q1()
            if (r0 == 0) goto L_0x0028
            return r4
        L_0x0028:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStateBinding r0 = r6.f11946J
            boolean r0 = r0.mo6094Q1()
            if (r0 == 0) goto L_0x0031
            return r4
        L_0x0031:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAdministratornameBinding r0 = r6.f11947K
            boolean r0 = r0.mo6094Q1()
            if (r0 == 0) goto L_0x003a
            return r4
        L_0x003a:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStudentnameBinding r0 = r6.f11948L
            boolean r0 = r0.mo6094Q1()
            if (r0 == 0) goto L_0x0043
            return r4
        L_0x0043:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStudenteducationidBinding r0 = r6.f11949M
            boolean r0 = r0.mo6094Q1()
            if (r0 == 0) goto L_0x004c
            return r4
        L_0x004c:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsReasonBinding r0 = r6.f11950N
            boolean r0 = r0.mo6094Q1()
            if (r0 == 0) goto L_0x0055
            return r4
        L_0x0055:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsPrintableBinding r0 = r6.f11951O
            boolean r0 = r0.mo6094Q1()
            if (r0 == 0) goto L_0x005e
            return r4
        L_0x005e:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsMandatorydocumentsBinding r0 = r6.f11942F
            boolean r0 = r0.mo6094Q1()
            if (r0 == 0) goto L_0x0067
            return r4
        L_0x0067:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAttachmentsBinding r0 = r6.f11943G
            boolean r0 = r0.mo6094Q1()
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
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.databinding.ActivityCaseDetailsBindingImpl.mo6094Q1():boolean");
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f11953Q = 16384;
        }
        this.f11941E.mo6095R1();
        this.f11944H.mo6095R1();
        this.f11945I.mo6095R1();
        this.f11946J.mo6095R1();
        this.f11947K.mo6095R1();
        this.f11948L.mo6095R1();
        this.f11949M.mo6095R1();
        this.f11950N.mo6095R1();
        this.f11951O.mo6095R1();
        this.f11942F.mo6095R1();
        this.f11943G.mo6095R1();
        mo6096S1();
    }

    /* renamed from: a */
    public void mo12330a(CaseDetailsViewModel caseDetailsViewModel) {
        mo6103a(2, (C3705i) caseDetailsViewModel);
        this.f11935B = caseDetailsViewModel;
        synchronized (this) {
            this.f11953Q |= 4;
        }
        mo10512c(88);
        super.mo6096S1();
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (88 != i) {
            return false;
        }
        mo12330a((CaseDetailsViewModel) obj);
        return true;
    }

    /* renamed from: e */
    public final boolean mo12331e(int i) {
        if (i == 0) {
            synchronized (this) {
                this.f11953Q |= 4;
            }
            return true;
        } else if (i == 37) {
            synchronized (this) {
                this.f11953Q |= 8;
            }
            return true;
        } else if (i == 71) {
            synchronized (this) {
                this.f11953Q |= 16;
            }
            return true;
        } else if (i == 63) {
            synchronized (this) {
                this.f11953Q |= 32;
            }
            return true;
        } else if (i == 44) {
            synchronized (this) {
                this.f11953Q |= 64;
            }
            return true;
        } else if (i == 16) {
            synchronized (this) {
                this.f11953Q |= 128;
            }
            return true;
        } else if (i == 19) {
            synchronized (this) {
                this.f11953Q |= 256;
            }
            return true;
        } else if (i == 24) {
            synchronized (this) {
                this.f11953Q |= 512;
            }
            return true;
        } else if (i == 84) {
            synchronized (this) {
                this.f11953Q |= 1024;
            }
            return true;
        } else if (i == 1) {
            synchronized (this) {
                this.f11953Q |= 2048;
            }
            return true;
        } else if (i == 29) {
            synchronized (this) {
                this.f11953Q |= 4096;
            }
            return true;
        } else if (i != 48) {
            return false;
        } else {
            synchronized (this) {
                this.f11953Q |= 8192;
            }
            return true;
        }
    }

    /* renamed from: f */
    public final boolean mo12332f(int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.f11953Q |= 1;
        }
        return true;
    }

    /* renamed from: g */
    public final boolean mo12333g(int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.f11953Q |= 2;
        }
        return true;
    }

    /* renamed from: a */
    public void mo6100a(C3818m mVar) {
        super.mo6100a(mVar);
        this.f11941E.mo6100a(mVar);
        this.f11944H.mo6100a(mVar);
        this.f11945I.mo6100a(mVar);
        this.f11946J.mo6100a(mVar);
        this.f11947K.mo6100a(mVar);
        this.f11948L.mo6100a(mVar);
        this.f11949M.mo6100a(mVar);
        this.f11950N.mo6100a(mVar);
        this.f11951O.mo6100a(mVar);
        this.f11942F.mo6100a(mVar);
        this.f11943G.mo6100a(mVar);
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        if (i == 0) {
            LiveData liveData = (LiveData) obj;
            return mo12332f(i2);
        } else if (i == 1) {
            LiveData liveData2 = (LiveData) obj;
            return mo12333g(i2);
        } else if (i != 2) {
            return false;
        } else {
            CaseDetailsViewModel caseDetailsViewModel = (CaseDetailsViewModel) obj;
            return mo12331e(i2);
        }
    }

    /* renamed from: a */
    public final void mo12329a(int i, View view) {
        CaseDetailsViewModel caseDetailsViewModel = this.f11935B;
        if (caseDetailsViewModel != null) {
            caseDetailsViewModel.mo11801k();
        }
    }
}
