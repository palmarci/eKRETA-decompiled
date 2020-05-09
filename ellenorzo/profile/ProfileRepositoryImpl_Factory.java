package p289hu.ekreta.ellenorzo.profile;

import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.profile.ProfileRepositoryImpl_Factory */
public final class ProfileRepositoryImpl_Factory implements C4463c<ProfileRepositoryImpl> {

    /* renamed from: a */
    public final C5431a<ProfileDao> f14538a;

    /* renamed from: b */
    public final C5431a<GuardianDao> f14539b;

    /* renamed from: c */
    public final C5431a<DeleteProfileStrategy> f14540c;

    public ProfileRepositoryImpl_Factory(C5431a<ProfileDao> aVar, C5431a<GuardianDao> aVar2, C5431a<DeleteProfileStrategy> aVar3) {
        this.f14538a = aVar;
        this.f14539b = aVar2;
        this.f14540c = aVar3;
    }

    public ProfileRepositoryImpl get() {
        return new ProfileRepositoryImpl((ProfileDao) this.f14538a.get(), (GuardianDao) this.f14539b.get(), (DeleteProfileStrategy) this.f14540c.get());
    }
}
