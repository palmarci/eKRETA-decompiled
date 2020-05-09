package p289hu.ekreta.ellenorzo.login;

import android.content.Context;
import p000a.p173k.p174a.C2676c;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.group.GroupRepository;
import p289hu.ekreta.ellenorzo.institute.InstituteRepository;
import p289hu.ekreta.ellenorzo.util.powersaver.PowerSaverChecker;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.login.LoginViewModelImpl_Factory */
public final class LoginViewModelImpl_Factory implements C4463c<LoginViewModelImpl> {

    /* renamed from: a */
    public final C5431a<ObservableImpl> f13670a;

    /* renamed from: b */
    public final C5431a<ExecuteOnceUiCommandSource> f13671b;

    /* renamed from: c */
    public final C5431a<Context> f13672c;

    /* renamed from: d */
    public final C5431a<InstituteRepository> f13673d;

    /* renamed from: e */
    public final C5431a<AuthenticationService> f13674e;

    /* renamed from: f */
    public final C5431a<String> f13675f;

    /* renamed from: g */
    public final C5431a<GroupRepository> f13676g;

    /* renamed from: h */
    public final C5431a<PowerSaverChecker> f13677h;

    /* renamed from: i */
    public final C5431a<C2676c> f13678i;

    public LoginViewModelImpl_Factory(C5431a<ObservableImpl> aVar, C5431a<ExecuteOnceUiCommandSource> aVar2, C5431a<Context> aVar3, C5431a<InstituteRepository> aVar4, C5431a<AuthenticationService> aVar5, C5431a<String> aVar6, C5431a<GroupRepository> aVar7, C5431a<PowerSaverChecker> aVar8, C5431a<C2676c> aVar9) {
        this.f13670a = aVar;
        this.f13671b = aVar2;
        this.f13672c = aVar3;
        this.f13673d = aVar4;
        this.f13674e = aVar5;
        this.f13675f = aVar6;
        this.f13676g = aVar7;
        this.f13677h = aVar8;
        this.f13678i = aVar9;
    }

    public LoginViewModelImpl get() {
        LoginViewModelImpl loginViewModelImpl = new LoginViewModelImpl((ObservableImpl) this.f13670a.get(), (ExecuteOnceUiCommandSource) this.f13671b.get(), (Context) this.f13672c.get(), (InstituteRepository) this.f13673d.get(), (AuthenticationService) this.f13674e.get(), (String) this.f13675f.get(), (GroupRepository) this.f13676g.get(), (PowerSaverChecker) this.f13677h.get(), this.f13678i);
        return loginViewModelImpl;
    }
}
