package hu.ekreta.ellenorzo.notes;

import android.content.Context;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import i.d.c;
import l.a.a;

public final class NotesViewModelImpl_Factory implements c<NotesViewModelImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<ObservableImpl> f5879a;
    public final a<ExecuteOnceUiCommandSource> b;
    public final a<SystemExit> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<AuthenticationService> f5880d;
    public final a<ProfileRepository> e;
    public final a<NotesRepository> f;

    /* renamed from: g  reason: collision with root package name */
    public final a<Context> f5881g;

    public NotesViewModelImpl_Factory(a<ObservableImpl> aVar, a<ExecuteOnceUiCommandSource> aVar2, a<SystemExit> aVar3, a<AuthenticationService> aVar4, a<ProfileRepository> aVar5, a<NotesRepository> aVar6, a<Context> aVar7) {
        this.f5879a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f5880d = aVar4;
        this.e = aVar5;
        this.f = aVar6;
        this.f5881g = aVar7;
    }

    public NotesViewModelImpl get() {
        return new NotesViewModelImpl(this.f5879a.get(), this.b.get(), this.c.get(), this.f5880d.get(), this.e.get(), this.f.get(), this.f5881g.get());
    }
}
