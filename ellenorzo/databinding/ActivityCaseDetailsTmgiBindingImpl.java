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
import p289hu.ekreta.ellenorzo.cases.detail.TmgiCaseDetailsViewModel;
import p289hu.ekreta.ellenorzo.generated.callback.OnClickListener.Listener;

/* renamed from: hu.ekreta.ellenorzo.databinding.ActivityCaseDetailsTmgiBindingImpl */
public class ActivityCaseDetailsTmgiBindingImpl extends ActivityCaseDetailsTmgiBinding implements Listener {

    /* renamed from: T */
    public static final C2867f f11957T = new C2867f(19);

    /* renamed from: U */
    public static final SparseIntArray f11958U = new SparseIntArray();

    /* renamed from: C */
    public final FrameLayout f11959C;

    /* renamed from: D */
    public final LinearLayout f11960D;

    /* renamed from: E */
    public final IncludeCaseDetailsNameBinding f11961E;

    /* renamed from: F */
    public final IncludeCaseDetailsReasonBinding f11962F;

    /* renamed from: G */
    public final IncludeCaseDetailsPrintableBinding f11963G;

    /* renamed from: H */
    public final IncludeCaseDetailsMandatorydocumentsBinding f11964H;

    /* renamed from: I */
    public final IncludeCaseDetailsAttachmentsBinding f11965I;

    /* renamed from: J */
    public final IncludeCaseDetailsRectificationbuttonBinding f11966J;

    /* renamed from: K */
    public final IncludeCaseDetailsSentdateBinding f11967K;

    /* renamed from: L */
    public final IncludeCaseDetailsStateBinding f11968L;

    /* renamed from: M */
    public final IncludeCaseDetailsAdministratornameBinding f11969M;

    /* renamed from: N */
    public final IncludeCaseDetailsStudentnameBinding f11970N;

    /* renamed from: O */
    public final IncludeCaseDetailsStudenteducationidBinding f11971O;

    /* renamed from: P */
    public final IncludeCaseDetailsTmgiJustificationtypeBinding f11972P;

    /* renamed from: Q */
    public final IncludeCaseDetailsTmgiRequestedabsenceintervalBinding f11973Q;

    /* renamed from: R */
    public final OnClickListener f11974R;

    /* renamed from: S */
    public long f11975S = -1;

    static {
        f11957T.mo6113a(2, new String[]{"include_case_details_name", "include_case_details_rectificationbutton", "include_case_details_sentdate", "include_case_details_state", "include_case_details_administratorname", "include_case_details_studentname", "include_case_details_studenteducationid", "include_case_details_tmgi_justificationtype", "include_case_details_tmgi_requestedabsenceinterval", "include_case_details_reason", "include_case_details_printable", "include_case_details_mandatorydocuments", "include_case_details_attachments"}, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16}, new int[]{C4014R.layout.include_case_details_name, C4014R.layout.include_case_details_rectificationbutton, C4014R.layout.include_case_details_sentdate, C4014R.layout.include_case_details_state, C4014R.layout.include_case_details_administratorname, C4014R.layout.include_case_details_studentname, C4014R.layout.include_case_details_studenteducationid, C4014R.layout.include_case_details_tmgi_justificationtype, C4014R.layout.include_case_details_tmgi_requestedabsenceinterval, C4014R.layout.include_case_details_reason, C4014R.layout.include_case_details_printable, C4014R.layout.include_case_details_mandatorydocuments, C4014R.layout.include_case_details_attachments});
        f11958U.put(C4014R.C4016id.app_bar_layout, 17);
        f11958U.put(C4014R.C4016id.toolbar, 18);
    }

    public ActivityCaseDetailsTmgiBindingImpl(C3702f fVar, View view) {
        Object[] a = ViewDataBinding.m6046a(fVar, view, 19, f11957T, f11958U);
        super(fVar, view, 4, (AppBarLayout) a[17], (NestedScrollView) a[1], (ProgressBar) a[3], (Toolbar) a[18]);
        this.f11956z.setTag(null);
        this.f11959C = (FrameLayout) a[0];
        this.f11959C.setTag(null);
        this.f11960D = (LinearLayout) a[2];
        this.f11960D.setTag(null);
        this.f11961E = (IncludeCaseDetailsNameBinding) a[4];
        mo6099a((ViewDataBinding) this.f11961E);
        this.f11962F = (IncludeCaseDetailsReasonBinding) a[13];
        mo6099a((ViewDataBinding) this.f11962F);
        this.f11963G = (IncludeCaseDetailsPrintableBinding) a[14];
        mo6099a((ViewDataBinding) this.f11963G);
        this.f11964H = (IncludeCaseDetailsMandatorydocumentsBinding) a[15];
        mo6099a((ViewDataBinding) this.f11964H);
        this.f11965I = (IncludeCaseDetailsAttachmentsBinding) a[16];
        mo6099a((ViewDataBinding) this.f11965I);
        this.f11966J = (IncludeCaseDetailsRectificationbuttonBinding) a[5];
        mo6099a((ViewDataBinding) this.f11966J);
        this.f11967K = (IncludeCaseDetailsSentdateBinding) a[6];
        mo6099a((ViewDataBinding) this.f11967K);
        this.f11968L = (IncludeCaseDetailsStateBinding) a[7];
        mo6099a((ViewDataBinding) this.f11968L);
        this.f11969M = (IncludeCaseDetailsAdministratornameBinding) a[8];
        mo6099a((ViewDataBinding) this.f11969M);
        this.f11970N = (IncludeCaseDetailsStudentnameBinding) a[9];
        mo6099a((ViewDataBinding) this.f11970N);
        this.f11971O = (IncludeCaseDetailsStudenteducationidBinding) a[10];
        mo6099a((ViewDataBinding) this.f11971O);
        this.f11972P = (IncludeCaseDetailsTmgiJustificationtypeBinding) a[11];
        mo6099a((ViewDataBinding) this.f11972P);
        this.f11973Q = (IncludeCaseDetailsTmgiRequestedabsenceintervalBinding) a[12];
        mo6099a((ViewDataBinding) this.f11973Q);
        this.f11954A.setTag(null);
        mo6098a(view);
        this.f11974R = new p289hu.ekreta.ellenorzo.generated.callback.OnClickListener(this, 1);
        mo6095R1();
    }

    /* JADX WARNING: Removed duplicated region for block: B:72:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0141 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x014f A[ADDED_TO_REGION] */
    /* renamed from: M1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6090M1() {
        /*
            r55 = this;
            r1 = r55
            monitor-enter(r55)
            long r2 = r1.f11975S     // Catch:{ all -> 0x02bc }
            r4 = 0
            r1.f11975S = r4     // Catch:{ all -> 0x02bc }
            monitor-exit(r55)     // Catch:{ all -> 0x02bc }
            hu.ekreta.ellenorzo.cases.detail.CaseDetailsViewModel r0 = r1.f11955B
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
            java.lang.String r6 = r0.mo11786E()
            goto L_0x0044
        L_0x0043:
            r6 = 0
        L_0x0044:
            long r34 = r2 & r24
            int r7 = (r34 > r4 ? 1 : (r34 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x0051
            if (r0 == 0) goto L_0x0051
            java.lang.String r7 = r0.mo11806u()
            goto L_0x0052
        L_0x0051:
            r7 = 0
        L_0x0052:
            long r34 = r2 & r20
            int r36 = (r34 > r4 ? 1 : (r34 == r4 ? 0 : -1))
            if (r36 == 0) goto L_0x005f
            if (r0 == 0) goto L_0x005f
            java.lang.String r34 = r0.mo11808z()
            goto L_0x0061
        L_0x005f:
            r34 = 0
        L_0x0061:
            long r35 = r2 & r16
            int r37 = (r35 > r4 ? 1 : (r35 == r4 ? 0 : -1))
            if (r37 == 0) goto L_0x006e
            if (r0 == 0) goto L_0x006e
            java.lang.String r35 = r0.mo11804q()
            goto L_0x0070
        L_0x006e:
            r35 = 0
        L_0x0070:
            long r36 = r2 & r14
            int r38 = (r36 > r4 ? 1 : (r36 == r4 ? 0 : -1))
            if (r38 == 0) goto L_0x007d
            if (r0 == 0) goto L_0x007d
            java.lang.String r36 = r0.mo11802l()
            goto L_0x007f
        L_0x007d:
            r36 = 0
        L_0x007f:
            long r37 = r2 & r12
            int r39 = (r37 > r4 ? 1 : (r37 == r4 ? 0 : -1))
            if (r39 == 0) goto L_0x008c
            if (r0 == 0) goto L_0x008c
            java.lang.String r37 = r0.mo11800i()
            goto L_0x008e
        L_0x008c:
            r37 = 0
        L_0x008e:
            long r38 = r2 & r18
            int r40 = (r38 > r4 ? 1 : (r38 == r4 ? 0 : -1))
            if (r40 == 0) goto L_0x009b
            if (r0 == 0) goto L_0x009b
            java.lang.String r38 = r0.mo11791P()
            goto L_0x009d
        L_0x009b:
            r38 = 0
        L_0x009d:
            long r39 = r2 & r30
            int r41 = (r39 > r4 ? 1 : (r39 == r4 ? 0 : -1))
            if (r41 == 0) goto L_0x00af
            if (r0 == 0) goto L_0x00aa
            boolean r39 = r0.mo11797d()
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
            java.lang.String r41 = r0.mo11805r()
            goto L_0x00c2
        L_0x00c0:
            r41 = 0
        L_0x00c2:
            r42 = 131129(0x20039, double:6.47863E-319)
            long r42 = r2 & r42
            int r44 = (r42 > r4 ? 1 : (r42 == r4 ? 0 : -1))
            if (r44 == 0) goto L_0x00f9
            if (r0 == 0) goto L_0x00d4
            hu.ekreta.ellenorzo.cases.detail.TmgiCaseDetailsViewModel r42 = r0.mo11785B()
            r11 = r42
            goto L_0x00d5
        L_0x00d4:
            r11 = 0
        L_0x00d5:
            r1.mo6103a(r10, r11)
            r43 = 131113(0x20029, double:6.47784E-319)
            long r43 = r2 & r43
            int r10 = (r43 > r4 ? 1 : (r43 == r4 ? 0 : -1))
            if (r10 == 0) goto L_0x00e8
            if (r11 == 0) goto L_0x00e8
            java.lang.String r10 = r11.mo11836g0()
            goto L_0x00e9
        L_0x00e8:
            r10 = 0
        L_0x00e9:
            r43 = 131097(0x20019, double:6.47705E-319)
            long r43 = r2 & r43
            int r45 = (r43 > r4 ? 1 : (r43 == r4 ? 0 : -1))
            if (r45 == 0) goto L_0x00fa
            if (r11 == 0) goto L_0x00fa
            java.lang.String r11 = r11.mo11837n0()
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
            r1.mo6102a(r15, r14)
            if (r14 == 0) goto L_0x011b
            java.lang.Object r14 = r14.mo6263a()
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
            r1.mo6102a(r8, r15)
            if (r15 == 0) goto L_0x0137
            java.lang.Object r8 = r15.mo6263a()
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
            java.lang.String r9 = r0.mo11788J()
            goto L_0x0149
        L_0x0148:
            r9 = 0
        L_0x0149:
            long r47 = r2 & r22
            int r15 = (r47 > r4 ? 1 : (r47 == r4 ? 0 : -1))
            if (r15 == 0) goto L_0x0164
            if (r0 == 0) goto L_0x0164
            java.lang.String r15 = r0.mo11803o()
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
            androidx.core.widget.NestedScrollView r12 = r1.f11956z
            int r13 = p289hu.ekreta.ellenorzo.util.binding.BindingConverters.m14795a(r40)
            r12.setVisibility(r13)
            android.widget.ProgressBar r12 = r1.f11954A
            int r13 = p289hu.ekreta.ellenorzo.util.binding.BindingConverters.m14795a(r39)
            r12.setVisibility(r13)
        L_0x01aa:
            long r12 = r2 & r26
            int r26 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r26 == 0) goto L_0x01b5
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsNameBinding r12 = r1.f11961E
            r12.mo12430q(r6)
        L_0x01b5:
            long r12 = r2 & r22
            int r6 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x01c0
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsNameBinding r6 = r1.f11961E
            r6.mo12431r(r15)
        L_0x01c0:
            long r12 = r2 & r18
            int r6 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x01cb
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsReasonBinding r6 = r1.f11962F
            r6.mo12436q(r7)
        L_0x01cb:
            r6 = 131072(0x20000, double:6.47582E-319)
            long r6 = r6 & r2
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r12 == 0) goto L_0x01da
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsPrintableBinding r6 = r1.f11963G
            android.view.View$OnClickListener r7 = r1.f11974R
            r6.mo12432a(r7)
        L_0x01da:
            r6 = 163848(0x28008, double:8.09517E-319)
            long r6 = r6 & r2
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r12 == 0) goto L_0x01e7
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsPrintableBinding r6 = r1.f11963G
            r6.mo12433q(r8)
        L_0x01e7:
            r6 = 196616(0x30008, double:9.7141E-319)
            long r6 = r6 & r2
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x01f4
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsMandatorydocumentsBinding r6 = r1.f11964H
            r6.mo12429q(r9)
        L_0x01f4:
            r6 = 131084(0x2000c, double:6.4764E-319)
            long r6 = r6 & r2
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x0201
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsMandatorydocumentsBinding r6 = r1.f11964H
            r6.mo12428b(r10)
        L_0x0201:
            r6 = 131082(0x2000a, double:6.4763E-319)
            long r6 = r6 & r2
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x020e
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAttachmentsBinding r6 = r1.f11965I
            r6.mo12427b(r14)
        L_0x020e:
            r6 = 131080(0x20008, double:6.4762E-319)
            long r6 = r6 & r2
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x021b
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsRectificationbuttonBinding r6 = r1.f11966J
            r6.mo12437a(r0)
        L_0x021b:
            long r6 = r2 & r24
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0226
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsSentdateBinding r0 = r1.f11967K
            r0.mo12439q(r11)
        L_0x0226:
            r6 = 132104(0x20408, double:6.5268E-319)
            long r6 = r6 & r2
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0235
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStateBinding r0 = r1.f11968L
            r6 = r49
            r0.mo12440q(r6)
        L_0x0235:
            long r6 = r2 & r20
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0242
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAdministratornameBinding r0 = r1.f11969M
            r6 = r50
            r0.mo12426q(r6)
        L_0x0242:
            long r6 = r2 & r16
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x024f
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStudentnameBinding r0 = r1.f11970N
            r6 = r51
            r0.mo12442q(r6)
        L_0x024f:
            long r6 = r2 & r28
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x025c
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStudenteducationidBinding r0 = r1.f11971O
            r6 = r52
            r0.mo12441q(r6)
        L_0x025c:
            r6 = 131097(0x20019, double:6.47705E-319)
            long r6 = r6 & r2
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x026b
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsTmgiJustificationtypeBinding r0 = r1.f11972P
            r11 = r53
            r0.mo12443q(r11)
        L_0x026b:
            r6 = 131113(0x20029, double:6.47784E-319)
            long r2 = r2 & r6
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x027a
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsTmgiRequestedabsenceintervalBinding r0 = r1.f11973Q
            r10 = r54
            r0.mo12444q(r10)
        L_0x027a:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsNameBinding r0 = r1.f11961E
            r0.mo6091N1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsRectificationbuttonBinding r0 = r1.f11966J
            r0.mo6091N1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsSentdateBinding r0 = r1.f11967K
            r0.mo6091N1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStateBinding r0 = r1.f11968L
            r0.mo6091N1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAdministratornameBinding r0 = r1.f11969M
            r0.mo6091N1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStudentnameBinding r0 = r1.f11970N
            r0.mo6091N1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStudenteducationidBinding r0 = r1.f11971O
            r0.mo6091N1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsTmgiJustificationtypeBinding r0 = r1.f11972P
            r0.mo6091N1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsTmgiRequestedabsenceintervalBinding r0 = r1.f11973Q
            r0.mo6091N1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsReasonBinding r0 = r1.f11962F
            r0.mo6091N1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsPrintableBinding r0 = r1.f11963G
            r0.mo6091N1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsMandatorydocumentsBinding r0 = r1.f11964H
            r0.mo6091N1()
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAttachmentsBinding r0 = r1.f11965I
            r0.mo6091N1()
            return
        L_0x02bc:
            r0 = move-exception
            monitor-exit(r55)     // Catch:{ all -> 0x02bc }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.databinding.ActivityCaseDetailsTmgiBindingImpl.mo6090M1():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r6.f11966J.mo6094Q1() == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        if (r6.f11967K.mo6094Q1() == false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        if (r6.f11968L.mo6094Q1() == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        if (r6.f11969M.mo6094Q1() == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        if (r6.f11970N.mo6094Q1() == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        if (r6.f11971O.mo6094Q1() == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004b, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0052, code lost:
        if (r6.f11972P.mo6094Q1() == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0054, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005b, code lost:
        if (r6.f11973Q.mo6094Q1() == false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005d, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0064, code lost:
        if (r6.f11962F.mo6094Q1() == false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0066, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006d, code lost:
        if (r6.f11963G.mo6094Q1() == false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x006f, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0076, code lost:
        if (r6.f11964H.mo6094Q1() == false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0078, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x007f, code lost:
        if (r6.f11965I.mo6094Q1() == false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0081, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0083, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r6.f11961E.mo6094Q1() == false) goto L_0x0016;
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
            long r0 = r6.f11975S     // Catch:{ all -> 0x0084 }
            r2 = 0
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x000c
            monitor-exit(r6)     // Catch:{ all -> 0x0084 }
            return r4
        L_0x000c:
            monitor-exit(r6)     // Catch:{ all -> 0x0084 }
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsNameBinding r0 = r6.f11961E
            boolean r0 = r0.mo6094Q1()
            if (r0 == 0) goto L_0x0016
            return r4
        L_0x0016:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsRectificationbuttonBinding r0 = r6.f11966J
            boolean r0 = r0.mo6094Q1()
            if (r0 == 0) goto L_0x001f
            return r4
        L_0x001f:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsSentdateBinding r0 = r6.f11967K
            boolean r0 = r0.mo6094Q1()
            if (r0 == 0) goto L_0x0028
            return r4
        L_0x0028:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStateBinding r0 = r6.f11968L
            boolean r0 = r0.mo6094Q1()
            if (r0 == 0) goto L_0x0031
            return r4
        L_0x0031:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAdministratornameBinding r0 = r6.f11969M
            boolean r0 = r0.mo6094Q1()
            if (r0 == 0) goto L_0x003a
            return r4
        L_0x003a:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStudentnameBinding r0 = r6.f11970N
            boolean r0 = r0.mo6094Q1()
            if (r0 == 0) goto L_0x0043
            return r4
        L_0x0043:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsStudenteducationidBinding r0 = r6.f11971O
            boolean r0 = r0.mo6094Q1()
            if (r0 == 0) goto L_0x004c
            return r4
        L_0x004c:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsTmgiJustificationtypeBinding r0 = r6.f11972P
            boolean r0 = r0.mo6094Q1()
            if (r0 == 0) goto L_0x0055
            return r4
        L_0x0055:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsTmgiRequestedabsenceintervalBinding r0 = r6.f11973Q
            boolean r0 = r0.mo6094Q1()
            if (r0 == 0) goto L_0x005e
            return r4
        L_0x005e:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsReasonBinding r0 = r6.f11962F
            boolean r0 = r0.mo6094Q1()
            if (r0 == 0) goto L_0x0067
            return r4
        L_0x0067:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsPrintableBinding r0 = r6.f11963G
            boolean r0 = r0.mo6094Q1()
            if (r0 == 0) goto L_0x0070
            return r4
        L_0x0070:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsMandatorydocumentsBinding r0 = r6.f11964H
            boolean r0 = r0.mo6094Q1()
            if (r0 == 0) goto L_0x0079
            return r4
        L_0x0079:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAttachmentsBinding r0 = r6.f11965I
            boolean r0 = r0.mo6094Q1()
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
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.databinding.ActivityCaseDetailsTmgiBindingImpl.mo6094Q1():boolean");
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f11975S = 131072;
        }
        this.f11961E.mo6095R1();
        this.f11966J.mo6095R1();
        this.f11967K.mo6095R1();
        this.f11968L.mo6095R1();
        this.f11969M.mo6095R1();
        this.f11970N.mo6095R1();
        this.f11971O.mo6095R1();
        this.f11972P.mo6095R1();
        this.f11973Q.mo6095R1();
        this.f11962F.mo6095R1();
        this.f11963G.mo6095R1();
        this.f11964H.mo6095R1();
        this.f11965I.mo6095R1();
        mo6096S1();
    }

    /* renamed from: a */
    public void mo12334a(CaseDetailsViewModel caseDetailsViewModel) {
        mo6103a(3, (C3705i) caseDetailsViewModel);
        this.f11955B = caseDetailsViewModel;
        synchronized (this) {
            this.f11975S |= 8;
        }
        mo10512c(88);
        super.mo6096S1();
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (88 != i) {
            return false;
        }
        mo12334a((CaseDetailsViewModel) obj);
        return true;
    }

    /* renamed from: e */
    public final boolean mo12335e(int i) {
        if (i == 0) {
            synchronized (this) {
                this.f11975S |= 8;
            }
            return true;
        } else if (i == 37) {
            synchronized (this) {
                this.f11975S |= 64;
            }
            return true;
        } else if (i == 71) {
            synchronized (this) {
                this.f11975S |= 128;
            }
            return true;
        } else if (i == 63) {
            synchronized (this) {
                this.f11975S |= 256;
            }
            return true;
        } else if (i == 44) {
            synchronized (this) {
                this.f11975S |= 512;
            }
            return true;
        } else if (i == 16) {
            synchronized (this) {
                this.f11975S |= 1024;
            }
            return true;
        } else if (i == 19) {
            synchronized (this) {
                this.f11975S |= 2048;
            }
            return true;
        } else if (i == 24) {
            synchronized (this) {
                this.f11975S |= 4096;
            }
            return true;
        } else if (i == 84) {
            synchronized (this) {
                this.f11975S |= 8192;
            }
            return true;
        } else if (i == 1) {
            synchronized (this) {
                this.f11975S |= 16384;
            }
            return true;
        } else if (i == 29) {
            synchronized (this) {
                this.f11975S |= 32768;
            }
            return true;
        } else if (i != 48) {
            return false;
        } else {
            synchronized (this) {
                this.f11975S |= 65536;
            }
            return true;
        }
    }

    /* renamed from: f */
    public final boolean mo12336f(int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.f11975S |= 2;
        }
        return true;
    }

    /* renamed from: g */
    public final boolean mo12337g(int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.f11975S |= 4;
        }
        return true;
    }

    /* renamed from: h */
    public final boolean mo12338h(int i) {
        if (i == 0) {
            synchronized (this) {
                this.f11975S |= 1;
            }
            return true;
        } else if (i == 66) {
            synchronized (this) {
                this.f11975S |= 16;
            }
            return true;
        } else if (i != 12) {
            return false;
        } else {
            synchronized (this) {
                this.f11975S |= 32;
            }
            return true;
        }
    }

    /* renamed from: a */
    public void mo6100a(C3818m mVar) {
        super.mo6100a(mVar);
        this.f11961E.mo6100a(mVar);
        this.f11966J.mo6100a(mVar);
        this.f11967K.mo6100a(mVar);
        this.f11968L.mo6100a(mVar);
        this.f11969M.mo6100a(mVar);
        this.f11970N.mo6100a(mVar);
        this.f11971O.mo6100a(mVar);
        this.f11972P.mo6100a(mVar);
        this.f11973Q.mo6100a(mVar);
        this.f11962F.mo6100a(mVar);
        this.f11963G.mo6100a(mVar);
        this.f11964H.mo6100a(mVar);
        this.f11965I.mo6100a(mVar);
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        if (i == 0) {
            TmgiCaseDetailsViewModel tmgiCaseDetailsViewModel = (TmgiCaseDetailsViewModel) obj;
            return mo12338h(i2);
        } else if (i == 1) {
            LiveData liveData = (LiveData) obj;
            return mo12336f(i2);
        } else if (i == 2) {
            LiveData liveData2 = (LiveData) obj;
            return mo12337g(i2);
        } else if (i != 3) {
            return false;
        } else {
            CaseDetailsViewModel caseDetailsViewModel = (CaseDetailsViewModel) obj;
            return mo12335e(i2);
        }
    }

    /* renamed from: a */
    public final void mo12329a(int i, View view) {
        CaseDetailsViewModel caseDetailsViewModel = this.f11955B;
        if (caseDetailsViewModel != null) {
            caseDetailsViewModel.mo11801k();
        }
    }
}
