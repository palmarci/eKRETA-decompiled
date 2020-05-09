package p289hu.ekreta.ellenorzo.homework;

import p292i.p295d.C4463c;
import p300k.p340c.C5061c0;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.homework.HomeworkDaoImpl_Factory */
public final class HomeworkDaoImpl_Factory implements C4463c<HomeworkDaoImpl> {

    /* renamed from: a */
    public final C5431a<C5061c0> f13436a;

    public HomeworkDaoImpl_Factory(C5431a<C5061c0> aVar) {
        this.f13436a = aVar;
    }

    public HomeworkDaoImpl get() {
        return new HomeworkDaoImpl((C5061c0) this.f13436a.get());
    }
}
