package p289hu.ekreta.ellenorzo.notification;

import p289hu.ekreta.ellenorzo.rest.GlobalMobileApi;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.notification.NotificationRepositoryImpl_Factory */
public final class NotificationRepositoryImpl_Factory implements C4463c<NotificationRepositoryImpl> {

    /* renamed from: a */
    public final C5431a<GlobalMobileApi> f14253a;

    /* renamed from: b */
    public final C5431a<NotificationDao> f14254b;

    /* renamed from: c */
    public final C5431a<FirebaseContainer> f14255c;

    /* renamed from: d */
    public final C5431a<String> f14256d;

    public NotificationRepositoryImpl_Factory(C5431a<GlobalMobileApi> aVar, C5431a<NotificationDao> aVar2, C5431a<FirebaseContainer> aVar3, C5431a<String> aVar4) {
        this.f14253a = aVar;
        this.f14254b = aVar2;
        this.f14255c = aVar3;
        this.f14256d = aVar4;
    }

    public NotificationRepositoryImpl get() {
        return new NotificationRepositoryImpl((GlobalMobileApi) this.f14253a.get(), (NotificationDao) this.f14254b.get(), (FirebaseContainer) this.f14255c.get(), (String) this.f14256d.get());
    }
}
