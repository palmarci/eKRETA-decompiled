package hu.ekreta.ellenorzo.classmaster;

import i.d.c;
import k.c.c0;
import l.a.a;

public final class ClassMasterDaoImpl_Factory implements c<ClassMasterDaoImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<c0> f5271a;

    public ClassMasterDaoImpl_Factory(a<c0> aVar) {
        this.f5271a = aVar;
    }

    public ClassMasterDaoImpl get() {
        return new ClassMasterDaoImpl(this.f5271a.get());
    }
}
