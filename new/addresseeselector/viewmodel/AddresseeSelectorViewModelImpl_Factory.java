package hu.ekreta.ellenorzo.addresseeselector.viewmodel;

import android.content.Context;
import hu.ekreta.ellenorzo.addresseeselector.model.AddresseeSelectorService;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import i.d.c;
import l.a.a;

public final class AddresseeSelectorViewModelImpl_Factory implements c<AddresseeSelectorViewModelImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<ObservableImpl> f5000a;
    public final a<ExecuteOnceUiCommandSource> b;
    public final a<SystemExit> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<AuthenticationService> f5001d;
    public final a<ProfileRepository> e;
    public final a<AddresseeSelectorService> f;

    /* renamed from: g  reason: collision with root package name */
    public final a<Context> f5002g;

    public AddresseeSelectorViewModelImpl_Factory(a<ObservableImpl> aVar, a<ExecuteOnceUiCommandSource> aVar2, a<SystemExit> aVar3, a<AuthenticationService> aVar4, a<ProfileRepository> aVar5, a<AddresseeSelectorService> aVar6, a<Context> aVar7) {
        this.f5000a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f5001d = aVar4;
        this.e = aVar5;
        this.f = aVar6;
        this.f5002g = aVar7;
    }

    public AddresseeSelectorViewModelImpl get() {
        return new AddresseeSelectorViewModelImpl(this.f5000a.get(), this.b.get(), this.c.get(), this.f5001d.get(), this.e.get(), this.f.get(), this.f5002g.get());
    }
}
