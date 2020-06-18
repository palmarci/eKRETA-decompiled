package hu.ekreta.ellenorzo.timetable;

import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import i.d.c;
import l.a.a;

public final class TimeTableViewModelImpl_Factory implements c<TimeTableViewModelImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<ObservableImpl> f6252a;
    public final a<ExecuteOnceUiCommandSource> b;
    public final a<SystemExit> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<AuthenticationService> f6253d;
    public final a<ProfileRepository> e;
    public final a<TimeTableItemRepository> f;

    public TimeTableViewModelImpl_Factory(a<ObservableImpl> aVar, a<ExecuteOnceUiCommandSource> aVar2, a<SystemExit> aVar3, a<AuthenticationService> aVar4, a<ProfileRepository> aVar5, a<TimeTableItemRepository> aVar6) {
        this.f6252a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f6253d = aVar4;
        this.e = aVar5;
        this.f = aVar6;
    }

    public TimeTableViewModelImpl get() {
        return new TimeTableViewModelImpl(this.f6252a.get(), this.b.get(), this.c.get(), this.f6253d.get(), this.e.get(), this.f.get());
    }
}
