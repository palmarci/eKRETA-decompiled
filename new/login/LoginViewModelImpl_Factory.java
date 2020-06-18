package hu.ekreta.ellenorzo.login;

import android.content.Context;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.institute.InstituteRepository;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.util.powersaver.PowerSaverChecker;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import i.d.c;
import l.a.a;

public final class LoginViewModelImpl_Factory implements c<LoginViewModelImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<ObservableImpl> f5723a;
    public final a<ExecuteOnceUiCommandSource> b;
    public final a<SystemExit> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<Context> f5724d;
    public final a<ProfileRepository> e;
    public final a<InstituteRepository> f;

    /* renamed from: g  reason: collision with root package name */
    public final a<AuthenticationService> f5725g;

    /* renamed from: h  reason: collision with root package name */
    public final a<String> f5726h;

    /* renamed from: i  reason: collision with root package name */
    public final a<PowerSaverChecker> f5727i;

    /* renamed from: j  reason: collision with root package name */
    public final a<a.k.a.c> f5728j;

    public LoginViewModelImpl_Factory(a<ObservableImpl> aVar, a<ExecuteOnceUiCommandSource> aVar2, a<SystemExit> aVar3, a<Context> aVar4, a<ProfileRepository> aVar5, a<InstituteRepository> aVar6, a<AuthenticationService> aVar7, a<String> aVar8, a<PowerSaverChecker> aVar9, a<a.k.a.c> aVar10) {
        this.f5723a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f5724d = aVar4;
        this.e = aVar5;
        this.f = aVar6;
        this.f5725g = aVar7;
        this.f5726h = aVar8;
        this.f5727i = aVar9;
        this.f5728j = aVar10;
    }

    public LoginViewModelImpl get() {
        return new LoginViewModelImpl(this.f5723a.get(), this.b.get(), this.c.get(), this.f5724d.get(), this.e.get(), this.f.get(), this.f5725g.get(), this.f5726h.get(), this.f5727i.get(), this.f5728j);
    }
}
