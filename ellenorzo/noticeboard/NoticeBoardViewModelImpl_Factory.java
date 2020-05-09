package p289hu.ekreta.ellenorzo.noticeboard;

import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.noticeboard.NoticeBoardViewModelImpl_Factory */
public final class NoticeBoardViewModelImpl_Factory implements C4463c<NoticeBoardViewModelImpl> {

    /* renamed from: a */
    public final C5431a<ObservableImpl> f14176a;

    /* renamed from: b */
    public final C5431a<ExecuteOnceUiCommandSource> f14177b;

    /* renamed from: c */
    public final C5431a<AuthenticationService> f14178c;

    /* renamed from: d */
    public final C5431a<ProfileRepository> f14179d;

    /* renamed from: e */
    public final C5431a<NoticeBoardItemRepository> f14180e;

    public NoticeBoardViewModelImpl_Factory(C5431a<ObservableImpl> aVar, C5431a<ExecuteOnceUiCommandSource> aVar2, C5431a<AuthenticationService> aVar3, C5431a<ProfileRepository> aVar4, C5431a<NoticeBoardItemRepository> aVar5) {
        this.f14176a = aVar;
        this.f14177b = aVar2;
        this.f14178c = aVar3;
        this.f14179d = aVar4;
        this.f14180e = aVar5;
    }

    public NoticeBoardViewModelImpl get() {
        NoticeBoardViewModelImpl noticeBoardViewModelImpl = new NoticeBoardViewModelImpl((ObservableImpl) this.f14176a.get(), (ExecuteOnceUiCommandSource) this.f14177b.get(), (AuthenticationService) this.f14178c.get(), (ProfileRepository) this.f14179d.get(), (NoticeBoardItemRepository) this.f14180e.get());
        return noticeBoardViewModelImpl;
    }
}
