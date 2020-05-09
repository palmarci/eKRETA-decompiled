package p289hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding.C2867f;
import androidx.lifecycle.LiveData;
import com.google.android.material.appbar.AppBarLayout;
import java.util.List;
import p211h.p258l.C3702f;
import p211h.p258l.C3705i;
import p211h.p271p.C3818m;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.cases.decision.DecisionDetailViewModel;
import p289hu.ekreta.ellenorzo.generated.callback.OnClickListener.Listener;
import p289hu.ekreta.ellenorzo.util.binding.BindingConverters;

/* renamed from: hu.ekreta.ellenorzo.databinding.ActivityDecisionDetailBindingImpl */
public class ActivityDecisionDetailBindingImpl extends ActivityDecisionDetailBinding implements Listener {

    /* renamed from: S */
    public static final C2867f f11996S = new C2867f(18);

    /* renamed from: T */
    public static final SparseIntArray f11997T = new SparseIntArray();

    /* renamed from: D */
    public final CoordinatorLayout f11998D;

    /* renamed from: E */
    public final LinearLayout f11999E;

    /* renamed from: F */
    public final IncludeCaseDetailsNameBinding f12000F;

    /* renamed from: G */
    public final IncludeCaseDetailsPrintableBinding f12001G;

    /* renamed from: H */
    public final IncludeCaseDecisionTypeBinding f12002H;

    /* renamed from: I */
    public final IncludeProvenAbsenceBinding f12003I;

    /* renamed from: J */
    public final IncludeCaseDecisionAdjudicationBinding f12004J;

    /* renamed from: K */
    public final IncludeCaseDetailsReasonBinding f12005K;

    /* renamed from: L */
    public final IncludeCaseDecisionSignerBinding f12006L;

    /* renamed from: M */
    public final IncludeCaseDecisionDateBinding f12007M;

    /* renamed from: N */
    public final IncludeCaseDetailsAttachmentsBinding f12008N;

    /* renamed from: O */
    public final IncludeCaseDecisionAddAttachmentBinding f12009O;

    /* renamed from: P */
    public final OnClickListener f12010P;

    /* renamed from: Q */
    public final OnClickListener f12011Q;

    /* renamed from: R */
    public long f12012R = -1;

    static {
        f11996S.mo6113a(2, new String[]{"include_case_details_name", "include_case_decision_type", "include_proven_absence", "include_case_decision_adjudication", "include_case_details_reason", "include_case_decision_signer", "include_case_decision_date", "include_case_details_attachments", "include_case_decision_add_attachment", "include_case_details_printable"}, new int[]{5, 6, 7, 8, 9, 10, 11, 12, 13, 14}, new int[]{C4014R.layout.include_case_details_name, C4014R.layout.include_case_decision_type, C4014R.layout.include_proven_absence, C4014R.layout.include_case_decision_adjudication, C4014R.layout.include_case_details_reason, C4014R.layout.include_case_decision_signer, C4014R.layout.include_case_decision_date, C4014R.layout.include_case_details_attachments, C4014R.layout.include_case_decision_add_attachment, C4014R.layout.include_case_details_printable});
        f11997T.put(C4014R.C4016id.app_bar_layout, 15);
        f11997T.put(C4014R.C4016id.toolbar, 16);
        f11997T.put(C4014R.C4016id.progressBar, 17);
    }

    public ActivityDecisionDetailBindingImpl(C3702f fVar, View view) {
        Object[] a = ViewDataBinding.m6046a(fVar, view, 18, f11996S, f11997T);
        super(fVar, view, 2, (AppBarLayout) a[15], (NestedScrollView) a[1], (ProgressBar) a[17], (FrameLayout) a[4], (Button) a[3], (Toolbar) a[16]);
        this.f11995z.setTag(null);
        this.f11998D = (CoordinatorLayout) a[0];
        this.f11998D.setTag(null);
        this.f11999E = (LinearLayout) a[2];
        this.f11999E.setTag(null);
        this.f12000F = (IncludeCaseDetailsNameBinding) a[5];
        mo6099a((ViewDataBinding) this.f12000F);
        this.f12001G = (IncludeCaseDetailsPrintableBinding) a[14];
        mo6099a((ViewDataBinding) this.f12001G);
        this.f12002H = (IncludeCaseDecisionTypeBinding) a[6];
        mo6099a((ViewDataBinding) this.f12002H);
        this.f12003I = (IncludeProvenAbsenceBinding) a[7];
        mo6099a((ViewDataBinding) this.f12003I);
        this.f12004J = (IncludeCaseDecisionAdjudicationBinding) a[8];
        mo6099a((ViewDataBinding) this.f12004J);
        this.f12005K = (IncludeCaseDetailsReasonBinding) a[9];
        mo6099a((ViewDataBinding) this.f12005K);
        this.f12006L = (IncludeCaseDecisionSignerBinding) a[10];
        mo6099a((ViewDataBinding) this.f12006L);
        this.f12007M = (IncludeCaseDecisionDateBinding) a[11];
        mo6099a((ViewDataBinding) this.f12007M);
        this.f12008N = (IncludeCaseDetailsAttachmentsBinding) a[12];
        mo6099a((ViewDataBinding) this.f12008N);
        this.f12009O = (IncludeCaseDecisionAddAttachmentBinding) a[13];
        mo6099a((ViewDataBinding) this.f12009O);
        this.f11992A.setTag(null);
        this.f11993B.setTag(null);
        mo6098a(view);
        this.f12010P = new p289hu.ekreta.ellenorzo.generated.callback.OnClickListener(this, 1);
        this.f12011Q = new p289hu.ekreta.ellenorzo.generated.callback.OnClickListener(this, 2);
        mo6095R1();
    }

    /* renamed from: M1 */
    public void mo6090M1() {
        long j;
        List list;
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        synchronized (this) {
            j = this.f12012R;
            this.f12012R = 0;
        }
        DecisionDetailViewModel decisionDetailViewModel = this.f11994C;
        boolean z4 = false;
        List list2 = null;
        if ((16383 & j) != 0) {
            String e0 = ((j & 8257) == 0 || decisionDetailViewModel == null) ? null : decisionDetailViewModel.mo11733e0();
            String f0 = ((j & 8321) == 0 || decisionDetailViewModel == null) ? null : decisionDetailViewModel.mo11734f0();
            String m0 = ((j & 8449) == 0 || decisionDetailViewModel == null) ? null : decisionDetailViewModel.mo11737m0();
            String i = ((j & 10241) == 0 || decisionDetailViewModel == null) ? null : decisionDetailViewModel.mo11735i();
            String Y = ((j & 8705) == 0 || decisionDetailViewModel == null) ? null : decisionDetailViewModel.mo11728Y();
            if ((j & 8197) != 0) {
                z2 = decisionDetailViewModel != null ? decisionDetailViewModel.mo11494d() : false;
                z = !z2;
            } else {
                z2 = false;
                z = false;
            }
            String r = ((j & 8201) == 0 || decisionDetailViewModel == null) ? null : decisionDetailViewModel.mo11739r();
            String Z = ((j & 9217) == 0 || decisionDetailViewModel == null) ? null : decisionDetailViewModel.mo11729Z();
            if (!((j & 12289) == 0 || decisionDetailViewModel == null)) {
                z4 = decisionDetailViewModel.mo11740w0();
            }
            String o = ((j & 8209) == 0 || decisionDetailViewModel == null) ? null : decisionDetailViewModel.mo11738o();
            String W = ((j & 8225) == 0 || decisionDetailViewModel == null) ? null : decisionDetailViewModel.mo11727W();
            if ((j & 8195) != 0) {
                LiveData items = decisionDetailViewModel != null ? decisionDetailViewModel.getItems() : null;
                mo6102a(1, items);
                if (items != null) {
                    list2 = (List) items.mo6263a();
                }
            }
            str5 = e0;
            str4 = f0;
            list = list2;
            str3 = m0;
            str7 = i;
            str2 = Y;
            str9 = r;
            str = Z;
            str8 = o;
            str6 = W;
            z3 = z4;
        } else {
            str9 = null;
            str8 = null;
            str7 = null;
            str6 = null;
            str5 = null;
            str4 = null;
            str3 = null;
            str2 = null;
            str = null;
            list = null;
            z3 = false;
            z2 = false;
            z = false;
        }
        if ((j & 8197) != 0) {
            this.f11995z.setVisibility(BindingConverters.m14795a(z));
            this.f11992A.setVisibility(BindingConverters.m14795a(z2));
        }
        if ((j & 8201) != 0) {
            this.f12000F.mo12430q(str9);
        }
        if ((j & 8209) != 0) {
            this.f12000F.mo12431r(str8);
        }
        if ((8192 & j) != 0) {
            this.f12001G.mo12432a(this.f12010P);
            this.f11993B.setOnClickListener(this.f12011Q);
        }
        if ((j & 10241) != 0) {
            this.f12001G.mo12433q(str7);
        }
        if ((8225 & j) != 0) {
            this.f12002H.mo12425q(str6);
        }
        if ((j & 8257) != 0) {
            this.f12003I.mo12445q(str5);
        }
        if ((j & 8321) != 0) {
            this.f12004J.mo12422q(str4);
        }
        if ((j & 8449) != 0) {
            this.f12005K.mo12436q(str3);
        }
        if ((8705 & j) != 0) {
            this.f12006L.mo12424q(str2);
        }
        if ((9217 & j) != 0) {
            this.f12007M.mo12423q(str);
        }
        if ((8195 & j) != 0) {
            this.f12008N.mo12427b(list);
        }
        if ((8193 & j) != 0) {
            this.f12009O.mo12420a(decisionDetailViewModel);
        }
        if ((j & 12289) != 0) {
            this.f11993B.setVisibility(BindingConverters.m14795a(z3));
        }
        this.f12000F.mo6091N1();
        this.f12002H.mo6091N1();
        this.f12003I.mo6091N1();
        this.f12004J.mo6091N1();
        this.f12005K.mo6091N1();
        this.f12006L.mo6091N1();
        this.f12007M.mo6091N1();
        this.f12008N.mo6091N1();
        this.f12009O.mo6091N1();
        this.f12001G.mo6091N1();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r6.f12002H.mo6094Q1() == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        if (r6.f12003I.mo6094Q1() == false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        if (r6.f12004J.mo6094Q1() == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        if (r6.f12005K.mo6094Q1() == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        if (r6.f12006L.mo6094Q1() == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        if (r6.f12007M.mo6094Q1() == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004b, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0052, code lost:
        if (r6.f12008N.mo6094Q1() == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0054, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005b, code lost:
        if (r6.f12009O.mo6094Q1() == false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005d, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0064, code lost:
        if (r6.f12001G.mo6094Q1() == false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0066, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0068, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r6.f12000F.mo6094Q1() == false) goto L_0x0016;
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
            long r0 = r6.f12012R     // Catch:{ all -> 0x0069 }
            r2 = 0
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x000c
            monitor-exit(r6)     // Catch:{ all -> 0x0069 }
            return r4
        L_0x000c:
            monitor-exit(r6)     // Catch:{ all -> 0x0069 }
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsNameBinding r0 = r6.f12000F
            boolean r0 = r0.mo6094Q1()
            if (r0 == 0) goto L_0x0016
            return r4
        L_0x0016:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionTypeBinding r0 = r6.f12002H
            boolean r0 = r0.mo6094Q1()
            if (r0 == 0) goto L_0x001f
            return r4
        L_0x001f:
            hu.ekreta.ellenorzo.databinding.IncludeProvenAbsenceBinding r0 = r6.f12003I
            boolean r0 = r0.mo6094Q1()
            if (r0 == 0) goto L_0x0028
            return r4
        L_0x0028:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionAdjudicationBinding r0 = r6.f12004J
            boolean r0 = r0.mo6094Q1()
            if (r0 == 0) goto L_0x0031
            return r4
        L_0x0031:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsReasonBinding r0 = r6.f12005K
            boolean r0 = r0.mo6094Q1()
            if (r0 == 0) goto L_0x003a
            return r4
        L_0x003a:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionSignerBinding r0 = r6.f12006L
            boolean r0 = r0.mo6094Q1()
            if (r0 == 0) goto L_0x0043
            return r4
        L_0x0043:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionDateBinding r0 = r6.f12007M
            boolean r0 = r0.mo6094Q1()
            if (r0 == 0) goto L_0x004c
            return r4
        L_0x004c:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsAttachmentsBinding r0 = r6.f12008N
            boolean r0 = r0.mo6094Q1()
            if (r0 == 0) goto L_0x0055
            return r4
        L_0x0055:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDecisionAddAttachmentBinding r0 = r6.f12009O
            boolean r0 = r0.mo6094Q1()
            if (r0 == 0) goto L_0x005e
            return r4
        L_0x005e:
            hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsPrintableBinding r0 = r6.f12001G
            boolean r0 = r0.mo6094Q1()
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
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.databinding.ActivityDecisionDetailBindingImpl.mo6094Q1():boolean");
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f12012R = 8192;
        }
        this.f12000F.mo6095R1();
        this.f12002H.mo6095R1();
        this.f12003I.mo6095R1();
        this.f12004J.mo6095R1();
        this.f12005K.mo6095R1();
        this.f12006L.mo6095R1();
        this.f12007M.mo6095R1();
        this.f12008N.mo6095R1();
        this.f12009O.mo6095R1();
        this.f12001G.mo6095R1();
        mo6096S1();
    }

    /* renamed from: a */
    public void mo12343a(DecisionDetailViewModel decisionDetailViewModel) {
        mo6103a(0, (C3705i) decisionDetailViewModel);
        this.f11994C = decisionDetailViewModel;
        synchronized (this) {
            this.f12012R |= 1;
        }
        mo10512c(88);
        super.mo6096S1();
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (88 != i) {
            return false;
        }
        mo12343a((DecisionDetailViewModel) obj);
        return true;
    }

    /* renamed from: e */
    public final boolean mo12344e(int i) {
        if (i == 0) {
            synchronized (this) {
                this.f12012R |= 1;
            }
            return true;
        } else if (i == 37) {
            synchronized (this) {
                this.f12012R |= 4;
            }
            return true;
        } else if (i == 71) {
            synchronized (this) {
                this.f12012R |= 8;
            }
            return true;
        } else if (i == 63) {
            synchronized (this) {
                this.f12012R |= 16;
            }
            return true;
        } else if (i == 59) {
            synchronized (this) {
                this.f12012R |= 32;
            }
            return true;
        } else if (i == 80) {
            synchronized (this) {
                this.f12012R |= 64;
            }
            return true;
        } else if (i == 97) {
            synchronized (this) {
                this.f12012R |= 128;
            }
            return true;
        } else if (i == 101) {
            synchronized (this) {
                this.f12012R |= 256;
            }
            return true;
        } else if (i == 17) {
            synchronized (this) {
                this.f12012R |= 512;
            }
            return true;
        } else if (i == 109) {
            synchronized (this) {
                this.f12012R |= 1024;
            }
            return true;
        } else if (i == 29) {
            synchronized (this) {
                this.f12012R |= 2048;
            }
            return true;
        } else if (i != 78) {
            return false;
        } else {
            synchronized (this) {
                this.f12012R |= 4096;
            }
            return true;
        }
    }

    /* renamed from: f */
    public final boolean mo12345f(int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.f12012R |= 2;
        }
        return true;
    }

    /* renamed from: a */
    public void mo6100a(C3818m mVar) {
        super.mo6100a(mVar);
        this.f12000F.mo6100a(mVar);
        this.f12002H.mo6100a(mVar);
        this.f12003I.mo6100a(mVar);
        this.f12004J.mo6100a(mVar);
        this.f12005K.mo6100a(mVar);
        this.f12006L.mo6100a(mVar);
        this.f12007M.mo6100a(mVar);
        this.f12008N.mo6100a(mVar);
        this.f12009O.mo6100a(mVar);
        this.f12001G.mo6100a(mVar);
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        if (i == 0) {
            DecisionDetailViewModel decisionDetailViewModel = (DecisionDetailViewModel) obj;
            return mo12344e(i2);
        } else if (i != 1) {
            return false;
        } else {
            LiveData liveData = (LiveData) obj;
            return mo12345f(i2);
        }
    }

    /* renamed from: a */
    public final void mo12329a(int i, View view) {
        boolean z = false;
        if (i == 1) {
            DecisionDetailViewModel decisionDetailViewModel = this.f11994C;
            if (decisionDetailViewModel != null) {
                z = true;
            }
            if (z) {
                decisionDetailViewModel.mo11736k();
            }
        } else if (i == 2) {
            DecisionDetailViewModel decisionDetailViewModel2 = this.f11994C;
            if (decisionDetailViewModel2 != null) {
                z = true;
            }
            if (z) {
                decisionDetailViewModel2.mo11741x();
            }
        }
    }
}
