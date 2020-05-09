package p289hu.ekreta.ellenorzo.evaluation;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.evaluation.EvaluationDetailsActivity_MembersInjector */
public final class EvaluationDetailsActivity_MembersInjector implements C4447b<EvaluationDetailsActivity> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f13215a;

    /* renamed from: b */
    public final C5431a<DispatchingAndroidInjector<android.app.Fragment>> f13216b;

    /* renamed from: c */
    public final C5431a<EvaluationDetailsViewModel> f13217c;

    /* renamed from: a */
    public void injectMembers(EvaluationDetailsActivity evaluationDetailsActivity) {
        evaluationDetailsActivity.f15496v = (DispatchingAndroidInjector) this.f13215a.get();
        evaluationDetailsActivity.f15497w = (DispatchingAndroidInjector) this.f13216b.get();
        evaluationDetailsActivity.f13210x = (EvaluationDetailsViewModel) this.f13217c.get();
    }

    /* renamed from: a */
    public static void m12171a(EvaluationDetailsActivity evaluationDetailsActivity, EvaluationDetailsViewModel evaluationDetailsViewModel) {
        evaluationDetailsActivity.f13210x = evaluationDetailsViewModel;
    }
}
