package p289hu.ekreta.ellenorzo.classmaster;

import p292i.p295d.C4463c;
import p300k.p340c.C5061c0;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.classmaster.ClassMasterDaoImpl_Factory */
public final class ClassMasterDaoImpl_Factory implements C4463c<ClassMasterDaoImpl> {

    /* renamed from: a */
    public final C5431a<C5061c0> f11806a;

    public ClassMasterDaoImpl_Factory(C5431a<C5061c0> aVar) {
        this.f11806a = aVar;
    }

    public ClassMasterDaoImpl get() {
        return new ClassMasterDaoImpl((C5061c0) this.f11806a.get());
    }
}
