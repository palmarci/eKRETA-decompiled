package p289hu.ekreta.ellenorzo.notes;

import android.content.Context;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.notes.NotesViewModelImpl_Factory */
public final class NotesViewModelImpl_Factory implements C4463c<NotesViewModelImpl> {

    /* renamed from: a */
    public final C5431a<ObservableImpl> f14125a;

    /* renamed from: b */
    public final C5431a<ExecuteOnceUiCommandSource> f14126b;

    /* renamed from: c */
    public final C5431a<AuthenticationService> f14127c;

    /* renamed from: d */
    public final C5431a<ProfileRepository> f14128d;

    /* renamed from: e */
    public final C5431a<NotesRepository> f14129e;

    /* renamed from: f */
    public final C5431a<Context> f14130f;

    public NotesViewModelImpl_Factory(C5431a<ObservableImpl> aVar, C5431a<ExecuteOnceUiCommandSource> aVar2, C5431a<AuthenticationService> aVar3, C5431a<ProfileRepository> aVar4, C5431a<NotesRepository> aVar5, C5431a<Context> aVar6) {
        this.f14125a = aVar;
        this.f14126b = aVar2;
        this.f14127c = aVar3;
        this.f14128d = aVar4;
        this.f14129e = aVar5;
        this.f14130f = aVar6;
    }

    public NotesViewModelImpl get() {
        NotesViewModelImpl notesViewModelImpl = new NotesViewModelImpl((ObservableImpl) this.f14125a.get(), (ExecuteOnceUiCommandSource) this.f14126b.get(), (AuthenticationService) this.f14127c.get(), (ProfileRepository) this.f14128d.get(), (NotesRepository) this.f14129e.get(), (Context) this.f14130f.get());
        return notesViewModelImpl;
    }
}
