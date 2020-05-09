package p289hu.ekreta.ellenorzo.subject;

import p292i.p295d.C4463c;
import p300k.p340c.C5061c0;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.subject.SubjectDaoImpl_Factory */
public final class SubjectDaoImpl_Factory implements C4463c<SubjectDaoImpl> {

    /* renamed from: a */
    public final C5431a<C5061c0> f14838a;

    public SubjectDaoImpl_Factory(C5431a<C5061c0> aVar) {
        this.f14838a = aVar;
    }

    public SubjectDaoImpl get() {
        return new SubjectDaoImpl((C5061c0) this.f14838a.get());
    }
}
