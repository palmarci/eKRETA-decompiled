package hu.ekreta.ellenorzo.evaluation;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import i.b;
import l.a.a;

public final class EvaluationDetailsActivity_MembersInjector implements b<EvaluationDetailsActivity> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f5569a;
    public final a<DispatchingAndroidInjector<android.app.Fragment>> b;
    public final a<EvaluationDetailsViewModel> c;

    /* renamed from: a */
    public void injectMembers(EvaluationDetailsActivity evaluationDetailsActivity) {
        evaluationDetailsActivity.v = this.f5569a.get();
        evaluationDetailsActivity.w = this.b.get();
        evaluationDetailsActivity.x = this.c.get();
    }

    public static void a(EvaluationDetailsActivity evaluationDetailsActivity, EvaluationDetailsViewModel evaluationDetailsViewModel) {
        evaluationDetailsActivity.x = evaluationDetailsViewModel;
    }
}
