package p289hu.ekreta.ellenorzo.profile.list;

import android.content.Context;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.profile.list.ProfileListViewModelImpl_Factory */
public final class ProfileListViewModelImpl_Factory implements C4463c<ProfileListViewModelImpl> {

    /* renamed from: a */
    public final C5431a<ObservableImpl> f14634a;

    /* renamed from: b */
    public final C5431a<ExecuteOnceUiCommandSource> f14635b;

    /* renamed from: c */
    public final C5431a<AuthenticationService> f14636c;

    /* renamed from: d */
    public final C5431a<ProfileRepository> f14637d;

    /* renamed from: e */
    public final C5431a<Context> f14638e;

    public ProfileListViewModelImpl_Factory(C5431a<ObservableImpl> aVar, C5431a<ExecuteOnceUiCommandSource> aVar2, C5431a<AuthenticationService> aVar3, C5431a<ProfileRepository> aVar4, C5431a<Context> aVar5) {
        this.f14634a = aVar;
        this.f14635b = aVar2;
        this.f14636c = aVar3;
        this.f14637d = aVar4;
        this.f14638e = aVar5;
    }

    public ProfileListViewModelImpl get() {
        ProfileListViewModelImpl profileListViewModelImpl = new ProfileListViewModelImpl((ObservableImpl) this.f14634a.get(), (ExecuteOnceUiCommandSource) this.f14635b.get(), (AuthenticationService) this.f14636c.get(), (ProfileRepository) this.f14637d.get(), (Context) this.f14638e.get());
        return profileListViewModelImpl;
    }
}
