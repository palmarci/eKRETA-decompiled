package hu.ekreta.ellenorzo.notes;

import hu.ekreta.ellenorzo.group.GroupRepository;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import i.d.c;
import l.a.a;

public final class NoteDetailsViewModelImpl_Factory implements c<NoteDetailsViewModelImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<ObservableImpl> f5862a;
    public final a<ExecuteOnceUiCommandSource> b;
    public final a<SystemExit> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<GroupRepository> f5863d;

    public NoteDetailsViewModelImpl_Factory(a<ObservableImpl> aVar, a<ExecuteOnceUiCommandSource> aVar2, a<SystemExit> aVar3, a<GroupRepository> aVar4) {
        this.f5862a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f5863d = aVar4;
    }

    public NoteDetailsViewModelImpl get() {
        return new NoteDetailsViewModelImpl(this.f5862a.get(), this.b.get(), this.c.get(), this.f5863d.get());
    }
}
