package hu.ekreta.ellenorzo.announcedTest;

import android.content.Context;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.group.GroupRepository;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import i.d.c;
import l.a.a;

public final class AnnouncedTestDetailViewModelImpl_Factory implements c<AnnouncedTestDetailViewModelImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<ObservableImpl> f5020a;
    public final a<ExecuteOnceUiCommandSource> b;
    public final a<SystemExit> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<AuthenticationService> f5021d;
    public final a<Context> e;
    public final a<GroupRepository> f;

    public AnnouncedTestDetailViewModelImpl_Factory(a<ObservableImpl> aVar, a<ExecuteOnceUiCommandSource> aVar2, a<SystemExit> aVar3, a<AuthenticationService> aVar4, a<Context> aVar5, a<GroupRepository> aVar6) {
        this.f5020a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f5021d = aVar4;
        this.e = aVar5;
        this.f = aVar6;
    }

    public AnnouncedTestDetailViewModelImpl get() {
        return new AnnouncedTestDetailViewModelImpl(this.f5020a.get(), this.b.get(), this.c.get(), this.f5021d.get(), this.e.get(), this.f.get());
    }
}
