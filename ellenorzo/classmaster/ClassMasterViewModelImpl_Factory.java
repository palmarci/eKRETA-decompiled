package p289hu.ekreta.ellenorzo.classmaster;

import android.content.Context;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.classmaster.ClassMasterViewModelImpl_Factory */
public final class ClassMasterViewModelImpl_Factory implements C4463c<ClassMasterViewModelImpl> {

    /* renamed from: a */
    public final C5431a<ObservableImpl> f11840a;

    /* renamed from: b */
    public final C5431a<ExecuteOnceUiCommandSource> f11841b;

    /* renamed from: c */
    public final C5431a<AuthenticationService> f11842c;

    /* renamed from: d */
    public final C5431a<ProfileRepository> f11843d;

    /* renamed from: e */
    public final C5431a<Context> f11844e;

    /* renamed from: f */
    public final C5431a<ClassMasterRepository> f11845f;

    public ClassMasterViewModelImpl_Factory(C5431a<ObservableImpl> aVar, C5431a<ExecuteOnceUiCommandSource> aVar2, C5431a<AuthenticationService> aVar3, C5431a<ProfileRepository> aVar4, C5431a<Context> aVar5, C5431a<ClassMasterRepository> aVar6) {
        this.f11840a = aVar;
        this.f11841b = aVar2;
        this.f11842c = aVar3;
        this.f11843d = aVar4;
        this.f11844e = aVar5;
        this.f11845f = aVar6;
    }

    public ClassMasterViewModelImpl get() {
        ClassMasterViewModelImpl classMasterViewModelImpl = new ClassMasterViewModelImpl((ObservableImpl) this.f11840a.get(), (ExecuteOnceUiCommandSource) this.f11841b.get(), (AuthenticationService) this.f11842c.get(), (ProfileRepository) this.f11843d.get(), (Context) this.f11844e.get(), (ClassMasterRepository) this.f11845f.get());
        return classMasterViewModelImpl;
    }
}
