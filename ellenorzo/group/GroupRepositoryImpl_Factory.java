package p289hu.ekreta.ellenorzo.group;

import p289hu.ekreta.ellenorzo.profile.ProfileService;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.group.GroupRepositoryImpl_Factory */
public final class GroupRepositoryImpl_Factory implements C4463c<GroupRepositoryImpl> {

    /* renamed from: a */
    public final C5431a<GroupDao> f13327a;

    /* renamed from: b */
    public final C5431a<ProfileService> f13328b;

    public GroupRepositoryImpl_Factory(C5431a<GroupDao> aVar, C5431a<ProfileService> aVar2) {
        this.f13327a = aVar;
        this.f13328b = aVar2;
    }

    public GroupRepositoryImpl get() {
        return new GroupRepositoryImpl((GroupDao) this.f13327a.get(), (ProfileService) this.f13328b.get());
    }
}
