package hu.ekreta.ellenorzo.homework;

import android.content.Context;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.group.GroupRepository;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import i.d.c;
import l.a.a;

public final class HomeworkDetailViewModelImpl_Factory implements c<HomeworkDetailViewModelImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<ObservableImpl> f5666a;
    public final a<ExecuteOnceUiCommandSource> b;
    public final a<SystemExit> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<AuthenticationService> f5667d;
    public final a<ProfileRepository> e;
    public final a<HomeworkRepository> f;

    /* renamed from: g  reason: collision with root package name */
    public final a<Context> f5668g;

    /* renamed from: h  reason: collision with root package name */
    public final a<GroupRepository> f5669h;

    public HomeworkDetailViewModelImpl_Factory(a<ObservableImpl> aVar, a<ExecuteOnceUiCommandSource> aVar2, a<SystemExit> aVar3, a<AuthenticationService> aVar4, a<ProfileRepository> aVar5, a<HomeworkRepository> aVar6, a<Context> aVar7, a<GroupRepository> aVar8) {
        this.f5666a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f5667d = aVar4;
        this.e = aVar5;
        this.f = aVar6;
        this.f5668g = aVar7;
        this.f5669h = aVar8;
    }

    public HomeworkDetailViewModelImpl get() {
        return new HomeworkDetailViewModelImpl(this.f5666a.get(), this.b.get(), this.c.get(), this.f5667d.get(), this.e.get(), this.f.get(), this.f5668g.get(), this.f5669h.get());
    }
}
