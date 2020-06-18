package hu.ekreta.ellenorzo.cases.decision;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import i.b;
import l.a.a;

public final class DecisionDetailActivity_MembersInjector implements b<DecisionDetailActivity> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f5115a;
    public final a<DispatchingAndroidInjector<android.app.Fragment>> b;
    public final a<DecisionDetailViewModel> c;

    /* renamed from: a */
    public void injectMembers(DecisionDetailActivity decisionDetailActivity) {
        decisionDetailActivity.v = this.f5115a.get();
        decisionDetailActivity.w = this.b.get();
        decisionDetailActivity.x = this.c.get();
    }

    public static void a(DecisionDetailActivity decisionDetailActivity, DecisionDetailViewModel decisionDetailViewModel) {
        decisionDetailActivity.x = decisionDetailViewModel;
    }
}
