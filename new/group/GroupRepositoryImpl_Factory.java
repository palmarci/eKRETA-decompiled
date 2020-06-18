package hu.ekreta.ellenorzo.group;

import hu.ekreta.ellenorzo.profile.ProfileService;
import i.d.c;
import l.a.a;

public final class GroupRepositoryImpl_Factory implements c<GroupRepositoryImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<GroupDao> f5621a;
    public final a<ProfileService> b;

    public GroupRepositoryImpl_Factory(a<GroupDao> aVar, a<ProfileService> aVar2) {
        this.f5621a = aVar;
        this.b = aVar2;
    }

    public GroupRepositoryImpl get() {
        return new GroupRepositoryImpl(this.f5621a.get(), this.b.get());
    }
}
