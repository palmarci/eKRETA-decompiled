package p289hu.ekreta.ellenorzo.main;

import android.content.Context;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.message.MessageRepository;
import p289hu.ekreta.ellenorzo.omission.OmissionRepository;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.rest.EAdminApi;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.main.MainViewModelImpl_Factory */
public final class MainViewModelImpl_Factory implements C4463c<MainViewModelImpl> {

    /* renamed from: a */
    public final C5431a<ObservableImpl> f13741a;

    /* renamed from: b */
    public final C5431a<ExecuteOnceUiCommandSource> f13742b;

    /* renamed from: c */
    public final C5431a<AuthenticationService> f13743c;

    /* renamed from: d */
    public final C5431a<Context> f13744d;

    /* renamed from: e */
    public final C5431a<ProfileRepository> f13745e;

    /* renamed from: f */
    public final C5431a<OmissionRepository> f13746f;

    /* renamed from: g */
    public final C5431a<MessageRepository> f13747g;

    /* renamed from: h */
    public final C5431a<EAdminApi> f13748h;

    /* renamed from: i */
    public final C5431a<String> f13749i;

    public MainViewModelImpl_Factory(C5431a<ObservableImpl> aVar, C5431a<ExecuteOnceUiCommandSource> aVar2, C5431a<AuthenticationService> aVar3, C5431a<Context> aVar4, C5431a<ProfileRepository> aVar5, C5431a<OmissionRepository> aVar6, C5431a<MessageRepository> aVar7, C5431a<EAdminApi> aVar8, C5431a<String> aVar9) {
        this.f13741a = aVar;
        this.f13742b = aVar2;
        this.f13743c = aVar3;
        this.f13744d = aVar4;
        this.f13745e = aVar5;
        this.f13746f = aVar6;
        this.f13747g = aVar7;
        this.f13748h = aVar8;
        this.f13749i = aVar9;
    }

    /* renamed from: a */
    public static MainViewModelImpl_Factory m12839a(C5431a<ObservableImpl> aVar, C5431a<ExecuteOnceUiCommandSource> aVar2, C5431a<AuthenticationService> aVar3, C5431a<Context> aVar4, C5431a<ProfileRepository> aVar5, C5431a<OmissionRepository> aVar6, C5431a<MessageRepository> aVar7, C5431a<EAdminApi> aVar8, C5431a<String> aVar9) {
        MainViewModelImpl_Factory mainViewModelImpl_Factory = new MainViewModelImpl_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
        return mainViewModelImpl_Factory;
    }

    public MainViewModelImpl get() {
        MainViewModelImpl mainViewModelImpl = new MainViewModelImpl((ObservableImpl) this.f13741a.get(), (ExecuteOnceUiCommandSource) this.f13742b.get(), (AuthenticationService) this.f13743c.get(), (Context) this.f13744d.get(), (ProfileRepository) this.f13745e.get(), (OmissionRepository) this.f13746f.get(), (MessageRepository) this.f13747g.get(), (EAdminApi) this.f13748h.get(), (String) this.f13749i.get());
        return mainViewModelImpl;
    }
}
