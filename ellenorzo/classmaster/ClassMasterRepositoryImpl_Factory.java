package p289hu.ekreta.ellenorzo.classmaster;

import p289hu.ekreta.ellenorzo.group.GroupDao;
import p289hu.ekreta.ellenorzo.rest.MobileApiV3;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.classmaster.ClassMasterRepositoryImpl_Factory */
public final class ClassMasterRepositoryImpl_Factory implements C4463c<ClassMasterRepositoryImpl> {

    /* renamed from: a */
    public final C5431a<ClassMasterDao> f11824a;

    /* renamed from: b */
    public final C5431a<GroupDao> f11825b;

    /* renamed from: c */
    public final C5431a<MobileApiV3> f11826c;

    public ClassMasterRepositoryImpl_Factory(C5431a<ClassMasterDao> aVar, C5431a<GroupDao> aVar2, C5431a<MobileApiV3> aVar3) {
        this.f11824a = aVar;
        this.f11825b = aVar2;
        this.f11826c = aVar3;
    }

    public ClassMasterRepositoryImpl get() {
        return new ClassMasterRepositoryImpl((ClassMasterDao) this.f11824a.get(), (GroupDao) this.f11825b.get(), (MobileApiV3) this.f11826c.get());
    }
}
