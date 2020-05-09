package p289hu.ekreta.ellenorzo.notification;

import android.content.Context;
import p211h.p238i.p239e.C3535m;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.notification.NotificationStrategyImpl_Factory */
public final class NotificationStrategyImpl_Factory implements C4463c<NotificationStrategyImpl> {

    /* renamed from: a */
    public final C5431a<ProfileRepository> f14279a;

    /* renamed from: b */
    public final C5431a<NotificationRepository> f14280b;

    /* renamed from: c */
    public final C5431a<Context> f14281c;

    /* renamed from: d */
    public final C5431a<C3535m> f14282d;

    /* renamed from: e */
    public final C5431a<FirebaseContainer> f14283e;

    public NotificationStrategyImpl_Factory(C5431a<ProfileRepository> aVar, C5431a<NotificationRepository> aVar2, C5431a<Context> aVar3, C5431a<C3535m> aVar4, C5431a<FirebaseContainer> aVar5) {
        this.f14279a = aVar;
        this.f14280b = aVar2;
        this.f14281c = aVar3;
        this.f14282d = aVar4;
        this.f14283e = aVar5;
    }

    public NotificationStrategyImpl get() {
        NotificationStrategyImpl notificationStrategyImpl = new NotificationStrategyImpl((ProfileRepository) this.f14279a.get(), (NotificationRepository) this.f14280b.get(), (Context) this.f14281c.get(), (C3535m) this.f14282d.get(), (FirebaseContainer) this.f14283e.get());
        return notificationStrategyImpl;
    }
}
