package p289hu.ekreta.ellenorzo.cases.decision;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.cases.decision.DecisionDetailActivity_MembersInjector */
public final class DecisionDetailActivity_MembersInjector implements C4447b<DecisionDetailActivity> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f11364a;

    /* renamed from: b */
    public final C5431a<DispatchingAndroidInjector<android.app.Fragment>> f11365b;

    /* renamed from: c */
    public final C5431a<DecisionDetailViewModel> f11366c;

    /* renamed from: a */
    public void injectMembers(DecisionDetailActivity decisionDetailActivity) {
        decisionDetailActivity.f15496v = (DispatchingAndroidInjector) this.f11364a.get();
        decisionDetailActivity.f15497w = (DispatchingAndroidInjector) this.f11365b.get();
        decisionDetailActivity.f11359x = (DecisionDetailViewModel) this.f11366c.get();
    }

    /* renamed from: a */
    public static void m10837a(DecisionDetailActivity decisionDetailActivity, DecisionDetailViewModel decisionDetailViewModel) {
        decisionDetailActivity.f11359x = decisionDetailViewModel;
    }
}
