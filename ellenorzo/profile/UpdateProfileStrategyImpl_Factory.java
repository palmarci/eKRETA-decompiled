package p289hu.ekreta.ellenorzo.profile;

import p289hu.ekreta.ellenorzo.group.GroupRepository;
import p289hu.ekreta.ellenorzo.notification.NotificationRepository;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.profile.UpdateProfileStrategyImpl_Factory */
public final class UpdateProfileStrategyImpl_Factory implements C4463c<UpdateProfileStrategyImpl> {

    /* renamed from: a */
    public final C5431a<ProfileRepository> f14559a;

    /* renamed from: b */
    public final C5431a<GroupRepository> f14560b;

    /* renamed from: c */
    public final C5431a<NotificationRepository> f14561c;

    /* renamed from: d */
    public final C5431a<DeleteProfileStrategy> f14562d;

    public UpdateProfileStrategyImpl_Factory(C5431a<ProfileRepository> aVar, C5431a<GroupRepository> aVar2, C5431a<NotificationRepository> aVar3, C5431a<DeleteProfileStrategy> aVar4) {
        this.f14559a = aVar;
        this.f14560b = aVar2;
        this.f14561c = aVar3;
        this.f14562d = aVar4;
    }

    public UpdateProfileStrategyImpl get() {
        return new UpdateProfileStrategyImpl((ProfileRepository) this.f14559a.get(), (GroupRepository) this.f14560b.get(), (NotificationRepository) this.f14561c.get(), (DeleteProfileStrategy) this.f14562d.get());
    }
}
