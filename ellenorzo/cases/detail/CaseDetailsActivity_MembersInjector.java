package p289hu.ekreta.ellenorzo.cases.detail;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.cases.detail.CaseDetailsActivity_MembersInjector */
public final class CaseDetailsActivity_MembersInjector implements C4447b<CaseDetailsActivity> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f11446a;

    /* renamed from: b */
    public final C5431a<DispatchingAndroidInjector<android.app.Fragment>> f11447b;

    /* renamed from: c */
    public final C5431a<CaseDetailsViewModel> f11448c;

    /* renamed from: a */
    public void injectMembers(CaseDetailsActivity caseDetailsActivity) {
        caseDetailsActivity.f15496v = (DispatchingAndroidInjector) this.f11446a.get();
        caseDetailsActivity.f15497w = (DispatchingAndroidInjector) this.f11447b.get();
        caseDetailsActivity.f11441x = (CaseDetailsViewModel) this.f11448c.get();
    }

    /* renamed from: a */
    public static void m10919a(CaseDetailsActivity caseDetailsActivity, CaseDetailsViewModel caseDetailsViewModel) {
        caseDetailsActivity.f11441x = caseDetailsViewModel;
    }
}
