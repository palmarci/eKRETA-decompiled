package hu.ekreta.ellenorzo.classmaster;

import hu.ekreta.ellenorzo.group.GroupDao;
import hu.ekreta.ellenorzo.rest.MobileApiV3;
import i.d.c;
import l.a.a;

public final class ClassMasterRepositoryImpl_Factory implements c<ClassMasterRepositoryImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<ClassMasterDao> f5277a;
    public final a<GroupDao> b;
    public final a<MobileApiV3> c;

    public ClassMasterRepositoryImpl_Factory(a<ClassMasterDao> aVar, a<GroupDao> aVar2, a<MobileApiV3> aVar3) {
        this.f5277a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }

    public ClassMasterRepositoryImpl get() {
        return new ClassMasterRepositoryImpl(this.f5277a.get(), this.b.get(), this.c.get());
    }
}
