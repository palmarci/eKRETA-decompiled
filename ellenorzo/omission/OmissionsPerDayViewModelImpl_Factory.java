package p289hu.ekreta.ellenorzo.omission;

import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.omission.OmissionsPerDayViewModelImpl_Factory */
public final class OmissionsPerDayViewModelImpl_Factory implements C4463c<OmissionsPerDayViewModelImpl> {

    /* renamed from: a */
    public final C5431a<ObservableImpl> f14445a;

    /* renamed from: b */
    public final C5431a<ExecuteOnceUiCommandSource> f14446b;

    /* renamed from: c */
    public final C5431a<AuthenticationService> f14447c;

    /* renamed from: d */
    public final C5431a<ProfileRepository> f14448d;

    /* renamed from: e */
    public final C5431a<OmissionRepository> f14449e;

    public OmissionsPerDayViewModelImpl_Factory(C5431a<ObservableImpl> aVar, C5431a<ExecuteOnceUiCommandSource> aVar2, C5431a<AuthenticationService> aVar3, C5431a<ProfileRepository> aVar4, C5431a<OmissionRepository> aVar5) {
        this.f14445a = aVar;
        this.f14446b = aVar2;
        this.f14447c = aVar3;
        this.f14448d = aVar4;
        this.f14449e = aVar5;
    }

    public OmissionsPerDayViewModelImpl get() {
        OmissionsPerDayViewModelImpl omissionsPerDayViewModelImpl = new OmissionsPerDayViewModelImpl((ObservableImpl) this.f14445a.get(), (ExecuteOnceUiCommandSource) this.f14446b.get(), (AuthenticationService) this.f14447c.get(), (ProfileRepository) this.f14448d.get(), (OmissionRepository) this.f14449e.get());
        return omissionsPerDayViewModelImpl;
    }
}
