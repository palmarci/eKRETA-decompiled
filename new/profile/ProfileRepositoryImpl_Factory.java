package hu.ekreta.ellenorzo.profile;

import i.d.c;
import l.a.a;

public final class ProfileRepositoryImpl_Factory implements c<ProfileRepositoryImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<ProfileDao> f6028a;
    public final a<GuardianDao> b;
    public final a<DeleteProfileStrategy> c;

    public ProfileRepositoryImpl_Factory(a<ProfileDao> aVar, a<GuardianDao> aVar2, a<DeleteProfileStrategy> aVar3) {
        this.f6028a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }

    public ProfileRepositoryImpl get() {
        return new ProfileRepositoryImpl(this.f6028a.get(), this.b.get(), this.c.get());
    }
}
