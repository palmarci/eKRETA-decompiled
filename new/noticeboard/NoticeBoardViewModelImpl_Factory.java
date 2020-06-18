package hu.ekreta.ellenorzo.noticeboard;

import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import i.d.c;
import l.a.a;

public final class NoticeBoardViewModelImpl_Factory implements c<NoticeBoardViewModelImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<ObservableImpl> f5898a;
    public final a<ExecuteOnceUiCommandSource> b;
    public final a<SystemExit> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<AuthenticationService> f5899d;
    public final a<ProfileRepository> e;
    public final a<NoticeBoardItemRepository> f;

    public NoticeBoardViewModelImpl_Factory(a<ObservableImpl> aVar, a<ExecuteOnceUiCommandSource> aVar2, a<SystemExit> aVar3, a<AuthenticationService> aVar4, a<ProfileRepository> aVar5, a<NoticeBoardItemRepository> aVar6) {
        this.f5898a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f5899d = aVar4;
        this.e = aVar5;
        this.f = aVar6;
    }

    public NoticeBoardViewModelImpl get() {
        return new NoticeBoardViewModelImpl(this.f5898a.get(), this.b.get(), this.c.get(), this.f5899d.get(), this.e.get(), this.f.get());
    }
}
