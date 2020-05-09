package p289hu.ekreta.ellenorzo.subject.averages;

import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.subject.SubjectsRepository;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.subject.averages.AveragesViewModelImpl_Factory */
public final class AveragesViewModelImpl_Factory implements C4463c<AveragesViewModelImpl> {

    /* renamed from: a */
    public final C5431a<ObservableImpl> f14928a;

    /* renamed from: b */
    public final C5431a<ExecuteOnceUiCommandSource> f14929b;

    /* renamed from: c */
    public final C5431a<AuthenticationService> f14930c;

    /* renamed from: d */
    public final C5431a<ProfileRepository> f14931d;

    /* renamed from: e */
    public final C5431a<SubjectsRepository> f14932e;

    public AveragesViewModelImpl_Factory(C5431a<ObservableImpl> aVar, C5431a<ExecuteOnceUiCommandSource> aVar2, C5431a<AuthenticationService> aVar3, C5431a<ProfileRepository> aVar4, C5431a<SubjectsRepository> aVar5) {
        this.f14928a = aVar;
        this.f14929b = aVar2;
        this.f14930c = aVar3;
        this.f14931d = aVar4;
        this.f14932e = aVar5;
    }

    public AveragesViewModelImpl get() {
        AveragesViewModelImpl averagesViewModelImpl = new AveragesViewModelImpl((ObservableImpl) this.f14928a.get(), (ExecuteOnceUiCommandSource) this.f14929b.get(), (AuthenticationService) this.f14930c.get(), (ProfileRepository) this.f14931d.get(), (SubjectsRepository) this.f14932e.get());
        return averagesViewModelImpl;
    }
}
