package p289hu.ekreta.ellenorzo.evaluation;

import p292i.p295d.C4463c;
import p300k.p340c.C5061c0;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.evaluation.EvaluationDaoImpl_Factory */
public final class EvaluationDaoImpl_Factory implements C4463c<EvaluationDaoImpl> {

    /* renamed from: a */
    public final C5431a<C5061c0> f13209a;

    public EvaluationDaoImpl_Factory(C5431a<C5061c0> aVar) {
        this.f13209a = aVar;
    }

    public EvaluationDaoImpl get() {
        return new EvaluationDaoImpl((C5061c0) this.f13209a.get());
    }
}
