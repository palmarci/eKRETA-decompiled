package p289hu.ekreta.ellenorzo.subject;

import p289hu.ekreta.ellenorzo.group.GroupRepository;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.rest.MobileApiV3;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.subject.SubjectsRepositoryImpl_Factory */
public final class SubjectsRepositoryImpl_Factory implements C4463c<SubjectsRepositoryImpl> {

    /* renamed from: a */
    public final C5431a<MobileApiV3> f14874a;

    /* renamed from: b */
    public final C5431a<SubjectDao> f14875b;

    /* renamed from: c */
    public final C5431a<ProfileRepository> f14876c;

    /* renamed from: d */
    public final C5431a<GroupRepository> f14877d;

    public SubjectsRepositoryImpl_Factory(C5431a<MobileApiV3> aVar, C5431a<SubjectDao> aVar2, C5431a<ProfileRepository> aVar3, C5431a<GroupRepository> aVar4) {
        this.f14874a = aVar;
        this.f14875b = aVar2;
        this.f14876c = aVar3;
        this.f14877d = aVar4;
    }

    public SubjectsRepositoryImpl get() {
        return new SubjectsRepositoryImpl((MobileApiV3) this.f14874a.get(), (SubjectDao) this.f14875b.get(), (ProfileRepository) this.f14876c.get(), (GroupRepository) this.f14877d.get());
    }
}
