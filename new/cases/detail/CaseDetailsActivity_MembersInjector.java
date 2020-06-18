package hu.ekreta.ellenorzo.cases.detail;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import i.b;
import l.a.a;

public final class CaseDetailsActivity_MembersInjector implements b<CaseDetailsActivity> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f5132a;
    public final a<DispatchingAndroidInjector<android.app.Fragment>> b;
    public final a<CaseDetailsViewModel> c;

    /* renamed from: a */
    public void injectMembers(CaseDetailsActivity caseDetailsActivity) {
        caseDetailsActivity.v = this.f5132a.get();
        caseDetailsActivity.w = this.b.get();
        caseDetailsActivity.x = this.c.get();
    }

    public static void a(CaseDetailsActivity caseDetailsActivity, CaseDetailsViewModel caseDetailsViewModel) {
        caseDetailsActivity.x = caseDetailsViewModel;
    }
}
