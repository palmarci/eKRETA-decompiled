package hu.ekreta.ellenorzo.profile.list;

import android.content.Context;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import i.d.c;
import l.a.a;

public final class ProfileListViewModelImpl_Factory implements c<ProfileListViewModelImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<ObservableImpl> f6055a;
    public final a<ExecuteOnceUiCommandSource> b;
    public final a<SystemExit> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<AuthenticationService> f6056d;
    public final a<ProfileRepository> e;
    public final a<Context> f;

    public ProfileListViewModelImpl_Factory(a<ObservableImpl> aVar, a<ExecuteOnceUiCommandSource> aVar2, a<SystemExit> aVar3, a<AuthenticationService> aVar4, a<ProfileRepository> aVar5, a<Context> aVar6) {
        this.f6055a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f6056d = aVar4;
        this.e = aVar5;
        this.f = aVar6;
    }

    public ProfileListViewModelImpl get() {
        return new ProfileListViewModelImpl(this.f6055a.get(), this.b.get(), this.c.get(), this.f6056d.get(), this.e.get(), this.f.get());
    }
}
