package p289hu.ekreta.ellenorzo.evaluation;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.evaluation.EvaluationDetailsActivityModule_ProvideViewModelFactory */
public final class EvaluationDetailsActivityModule_ProvideViewModelFactory implements C4463c<EvaluationDetailsViewModel> {

    /* renamed from: a */
    public final EvaluationDetailsActivityModule f13212a;

    /* renamed from: b */
    public final C5431a<EvaluationDetailsActivity> f13213b;

    /* renamed from: c */
    public final C5431a<EvaluationDetailsViewModelImpl> f13214c;

    public EvaluationDetailsActivityModule_ProvideViewModelFactory(EvaluationDetailsActivityModule evaluationDetailsActivityModule, C5431a<EvaluationDetailsActivity> aVar, C5431a<EvaluationDetailsViewModelImpl> aVar2) {
        this.f13212a = evaluationDetailsActivityModule;
        this.f13213b = aVar;
        this.f13214c = aVar2;
    }

    public EvaluationDetailsViewModel get() {
        EvaluationDetailsViewModel a = this.f13212a.mo12631a((EvaluationDetailsActivity) this.f13213b.get(), this.f13214c);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
