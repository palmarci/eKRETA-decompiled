package hu.ekreta.ellenorzo.evaluation;

import hu.ekreta.ellenorzo.rest.MobileApiV3;
import i.d.c;
import l.a.a;

public final class EvaluationRepositoryImpl_Factory implements c<EvaluationRepositoryImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<MobileApiV3> f5592a;
    public final a<EvaluationDao> b;

    public EvaluationRepositoryImpl_Factory(a<MobileApiV3> aVar, a<EvaluationDao> aVar2) {
        this.f5592a = aVar;
        this.b = aVar2;
    }

    public EvaluationRepositoryImpl get() {
        return new EvaluationRepositoryImpl(this.f5592a.get(), this.b.get());
    }
}
