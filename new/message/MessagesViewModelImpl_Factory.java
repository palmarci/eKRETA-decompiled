package hu.ekreta.ellenorzo.message;

import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import i.d.c;
import l.a.a;

public final class MessagesViewModelImpl_Factory implements c<MessagesViewModelImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<ObservableImpl> f5810a;
    public final a<ExecuteOnceUiCommandSource> b;
    public final a<SystemExit> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<AuthenticationService> f5811d;
    public final a<ProfileRepository> e;
    public final a<MessageRepository> f;

    /* renamed from: g  reason: collision with root package name */
    public final a<MessagesService> f5812g;

    public MessagesViewModelImpl_Factory(a<ObservableImpl> aVar, a<ExecuteOnceUiCommandSource> aVar2, a<SystemExit> aVar3, a<AuthenticationService> aVar4, a<ProfileRepository> aVar5, a<MessageRepository> aVar6, a<MessagesService> aVar7) {
        this.f5810a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f5811d = aVar4;
        this.e = aVar5;
        this.f = aVar6;
        this.f5812g = aVar7;
    }

    public MessagesViewModelImpl get() {
        return new MessagesViewModelImpl(this.f5810a.get(), this.b.get(), this.c.get(), this.f5811d.get(), this.e.get(), this.f.get(), this.f5812g.get());
    }
}
