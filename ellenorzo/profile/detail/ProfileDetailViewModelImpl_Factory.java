package p289hu.ekreta.ellenorzo.profile.detail;

import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.profile.detail.ProfileDetailViewModelImpl_Factory */
public final class ProfileDetailViewModelImpl_Factory implements C4463c<ProfileDetailViewModelImpl> {

    /* renamed from: a */
    public final C5431a<ObservableImpl> f14596a;

    /* renamed from: b */
    public final C5431a<ExecuteOnceUiCommandSource> f14597b;

    /* renamed from: c */
    public final C5431a<AuthenticationService> f14598c;

    /* renamed from: d */
    public final C5431a<ProfileRepository> f14599d;

    public ProfileDetailViewModelImpl_Factory(C5431a<ObservableImpl> aVar, C5431a<ExecuteOnceUiCommandSource> aVar2, C5431a<AuthenticationService> aVar3, C5431a<ProfileRepository> aVar4) {
        this.f14596a = aVar;
        this.f14597b = aVar2;
        this.f14598c = aVar3;
        this.f14599d = aVar4;
    }

    public ProfileDetailViewModelImpl get() {
        return new ProfileDetailViewModelImpl((ObservableImpl) this.f14596a.get(), (ExecuteOnceUiCommandSource) this.f14597b.get(), (AuthenticationService) this.f14598c.get(), (ProfileRepository) this.f14599d.get());
    }
}
