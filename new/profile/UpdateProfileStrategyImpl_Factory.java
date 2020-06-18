package hu.ekreta.ellenorzo.profile;

import hu.ekreta.ellenorzo.group.GroupRepository;
import hu.ekreta.ellenorzo.notification.NotificationRepository;
import i.d.c;
import l.a.a;

public final class UpdateProfileStrategyImpl_Factory implements c<UpdateProfileStrategyImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<ProfileRepository> f6033a;
    public final a<GroupRepository> b;
    public final a<NotificationRepository> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<DeleteProfileStrategy> f6034d;

    public UpdateProfileStrategyImpl_Factory(a<ProfileRepository> aVar, a<GroupRepository> aVar2, a<NotificationRepository> aVar3, a<DeleteProfileStrategy> aVar4) {
        this.f6033a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f6034d = aVar4;
    }

    public UpdateProfileStrategyImpl get() {
        return new UpdateProfileStrategyImpl(this.f6033a.get(), this.b.get(), this.c.get(), this.f6034d.get());
    }
}
