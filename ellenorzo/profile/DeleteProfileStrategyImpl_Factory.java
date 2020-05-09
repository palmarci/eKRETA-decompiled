package p289hu.ekreta.ellenorzo.profile;

import p289hu.ekreta.ellenorzo.notification.NotificationRepository;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.profile.DeleteProfileStrategyImpl_Factory */
public final class DeleteProfileStrategyImpl_Factory implements C4463c<DeleteProfileStrategyImpl> {

    /* renamed from: a */
    public final C5431a<NotificationRepository> f14452a;

    /* renamed from: b */
    public final C5431a<ProfileDao> f14453b;

    public DeleteProfileStrategyImpl_Factory(C5431a<NotificationRepository> aVar, C5431a<ProfileDao> aVar2) {
        this.f14452a = aVar;
        this.f14453b = aVar2;
    }

    public DeleteProfileStrategyImpl get() {
        return new DeleteProfileStrategyImpl((NotificationRepository) this.f14452a.get(), (ProfileDao) this.f14453b.get());
    }
}
