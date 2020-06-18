package hu.ekreta.ellenorzo.classmaster;

import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.group.GroupRepository;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import i.d.c;
import l.a.a;

public final class ClassMastersViewModelImpl_Factory implements c<ClassMastersViewModelImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<ObservableImpl> f5288a;
    public final a<ExecuteOnceUiCommandSource> b;
    public final a<SystemExit> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<AuthenticationService> f5289d;
    public final a<ProfileRepository> e;
    public final a<GroupRepository> f;

    /* renamed from: g  reason: collision with root package name */
    public final a<ClassMasterRepository> f5290g;

    public ClassMastersViewModelImpl_Factory(a<ObservableImpl> aVar, a<ExecuteOnceUiCommandSource> aVar2, a<SystemExit> aVar3, a<AuthenticationService> aVar4, a<ProfileRepository> aVar5, a<GroupRepository> aVar6, a<ClassMasterRepository> aVar7) {
        this.f5288a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f5289d = aVar4;
        this.e = aVar5;
        this.f = aVar6;
        this.f5290g = aVar7;
    }

    public ClassMastersViewModelImpl get() {
        return new ClassMastersViewModelImpl(this.f5288a.get(), this.b.get(), this.c.get(), this.f5289d.get(), this.e.get(), this.f.get(), this.f5290g.get());
    }
}
