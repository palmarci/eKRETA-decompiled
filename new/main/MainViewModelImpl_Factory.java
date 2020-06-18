package hu.ekreta.ellenorzo.main;

import android.content.Context;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.message.MessageRepository;
import hu.ekreta.ellenorzo.omission.OmissionRepository;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.rest.EAdminApi;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import i.d.c;
import l.a.a;

public final class MainViewModelImpl_Factory implements c<MainViewModelImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<ObservableImpl> f5745a;
    public final a<ExecuteOnceUiCommandSource> b;
    public final a<SystemExit> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<AuthenticationService> f5746d;
    public final a<Context> e;
    public final a<ProfileRepository> f;

    /* renamed from: g  reason: collision with root package name */
    public final a<OmissionRepository> f5747g;

    /* renamed from: h  reason: collision with root package name */
    public final a<MessageRepository> f5748h;

    /* renamed from: i  reason: collision with root package name */
    public final a<EAdminApi> f5749i;

    /* renamed from: j  reason: collision with root package name */
    public final a<String> f5750j;

    public MainViewModelImpl_Factory(a<ObservableImpl> aVar, a<ExecuteOnceUiCommandSource> aVar2, a<SystemExit> aVar3, a<AuthenticationService> aVar4, a<Context> aVar5, a<ProfileRepository> aVar6, a<OmissionRepository> aVar7, a<MessageRepository> aVar8, a<EAdminApi> aVar9, a<String> aVar10) {
        this.f5745a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f5746d = aVar4;
        this.e = aVar5;
        this.f = aVar6;
        this.f5747g = aVar7;
        this.f5748h = aVar8;
        this.f5749i = aVar9;
        this.f5750j = aVar10;
    }

    public static MainViewModelImpl_Factory a(a<ObservableImpl> aVar, a<ExecuteOnceUiCommandSource> aVar2, a<SystemExit> aVar3, a<AuthenticationService> aVar4, a<Context> aVar5, a<ProfileRepository> aVar6, a<OmissionRepository> aVar7, a<MessageRepository> aVar8, a<EAdminApi> aVar9, a<String> aVar10) {
        return new MainViewModelImpl_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10);
    }

    public MainViewModelImpl get() {
        return new MainViewModelImpl(this.f5745a.get(), this.b.get(), this.c.get(), this.f5746d.get(), this.e.get(), this.f.get(), this.f5747g.get(), this.f5748h.get(), this.f5749i.get(), this.f5750j.get());
    }
}
