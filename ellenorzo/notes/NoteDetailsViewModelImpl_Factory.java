package p289hu.ekreta.ellenorzo.notes;

import p289hu.ekreta.ellenorzo.group.GroupRepository;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.notes.NoteDetailsViewModelImpl_Factory */
public final class NoteDetailsViewModelImpl_Factory implements C4463c<NoteDetailsViewModelImpl> {

    /* renamed from: a */
    public final C5431a<ObservableImpl> f14076a;

    /* renamed from: b */
    public final C5431a<ExecuteOnceUiCommandSource> f14077b;

    /* renamed from: c */
    public final C5431a<GroupRepository> f14078c;

    public NoteDetailsViewModelImpl_Factory(C5431a<ObservableImpl> aVar, C5431a<ExecuteOnceUiCommandSource> aVar2, C5431a<GroupRepository> aVar3) {
        this.f14076a = aVar;
        this.f14077b = aVar2;
        this.f14078c = aVar3;
    }

    public NoteDetailsViewModelImpl get() {
        return new NoteDetailsViewModelImpl((ObservableImpl) this.f14076a.get(), (ExecuteOnceUiCommandSource) this.f14077b.get(), (GroupRepository) this.f14078c.get());
    }
}
