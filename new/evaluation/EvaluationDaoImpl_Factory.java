package hu.ekreta.ellenorzo.evaluation;

import i.d.c;
import k.c.c0;
import l.a.a;

public final class EvaluationDaoImpl_Factory implements c<EvaluationDaoImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<c0> f5567a;

    public EvaluationDaoImpl_Factory(a<c0> aVar) {
        this.f5567a = aVar;
    }

    public EvaluationDaoImpl get() {
        return new EvaluationDaoImpl(this.f5567a.get());
    }
}
