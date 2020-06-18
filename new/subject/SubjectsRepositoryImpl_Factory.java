package hu.ekreta.ellenorzo.subject;

import hu.ekreta.ellenorzo.group.GroupRepository;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.rest.MobileApiV3;
import i.d.c;
import l.a.a;

public final class SubjectsRepositoryImpl_Factory implements c<SubjectsRepositoryImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<MobileApiV3> f6152a;
    public final a<SubjectDao> b;
    public final a<ProfileRepository> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<GroupRepository> f6153d;

    public SubjectsRepositoryImpl_Factory(a<MobileApiV3> aVar, a<SubjectDao> aVar2, a<ProfileRepository> aVar3, a<GroupRepository> aVar4) {
        this.f6152a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f6153d = aVar4;
    }

    public SubjectsRepositoryImpl get() {
        return new SubjectsRepositoryImpl(this.f6152a.get(), this.b.get(), this.c.get(), this.f6153d.get());
    }
}
