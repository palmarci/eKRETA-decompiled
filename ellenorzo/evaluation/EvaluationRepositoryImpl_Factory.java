package p289hu.ekreta.ellenorzo.evaluation;

import p289hu.ekreta.ellenorzo.rest.MobileApiV3;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.evaluation.EvaluationRepositoryImpl_Factory */
public final class EvaluationRepositoryImpl_Factory implements C4463c<EvaluationRepositoryImpl> {

    /* renamed from: a */
    public final C5431a<MobileApiV3> f13281a;

    /* renamed from: b */
    public final C5431a<EvaluationDao> f13282b;

    public EvaluationRepositoryImpl_Factory(C5431a<MobileApiV3> aVar, C5431a<EvaluationDao> aVar2) {
        this.f13281a = aVar;
        this.f13282b = aVar2;
    }

    public EvaluationRepositoryImpl get() {
        return new EvaluationRepositoryImpl((MobileApiV3) this.f13281a.get(), (EvaluationDao) this.f13282b.get());
    }
}
