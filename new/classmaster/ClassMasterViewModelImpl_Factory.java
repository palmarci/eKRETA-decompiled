package hu.ekreta.ellenorzo.classmaster;

import android.content.Context;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import i.d.c;
import l.a.a;

public final class ClassMasterViewModelImpl_Factory implements c<ClassMasterViewModelImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<ObservableImpl> f5282a;
    public final a<ExecuteOnceUiCommandSource> b;
    public final a<SystemExit> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<AuthenticationService> f5283d;
    public final a<ProfileRepository> e;
    public final a<Context> f;

    /* renamed from: g  reason: collision with root package name */
    public final a<ClassMasterRepository> f5284g;

    public ClassMasterViewModelImpl_Factory(a<ObservableImpl> aVar, a<ExecuteOnceUiCommandSource> aVar2, a<SystemExit> aVar3, a<AuthenticationService> aVar4, a<ProfileRepository> aVar5, a<Context> aVar6, a<ClassMasterRepository> aVar7) {
        this.f5282a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f5283d = aVar4;
        this.e = aVar5;
        this.f = aVar6;
        this.f5284g = aVar7;
    }

    public ClassMasterViewModelImpl get() {
        return new ClassMasterViewModelImpl(this.f5282a.get(), this.b.get(), this.c.get(), this.f5283d.get(), this.e.get(), this.f.get(), this.f5284g.get());
    }
}
