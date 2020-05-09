package p289hu.ekreta.ellenorzo.classmaster;

import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.group.GroupRepository;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.classmaster.ClassMastersViewModelImpl_Factory */
public final class ClassMastersViewModelImpl_Factory implements C4463c<ClassMastersViewModelImpl> {

    /* renamed from: a */
    public final C5431a<ObservableImpl> f11873a;

    /* renamed from: b */
    public final C5431a<ExecuteOnceUiCommandSource> f11874b;

    /* renamed from: c */
    public final C5431a<AuthenticationService> f11875c;

    /* renamed from: d */
    public final C5431a<ProfileRepository> f11876d;

    /* renamed from: e */
    public final C5431a<GroupRepository> f11877e;

    /* renamed from: f */
    public final C5431a<ClassMasterRepository> f11878f;

    public ClassMastersViewModelImpl_Factory(C5431a<ObservableImpl> aVar, C5431a<ExecuteOnceUiCommandSource> aVar2, C5431a<AuthenticationService> aVar3, C5431a<ProfileRepository> aVar4, C5431a<GroupRepository> aVar5, C5431a<ClassMasterRepository> aVar6) {
        this.f11873a = aVar;
        this.f11874b = aVar2;
        this.f11875c = aVar3;
        this.f11876d = aVar4;
        this.f11877e = aVar5;
        this.f11878f = aVar6;
    }

    public ClassMastersViewModelImpl get() {
        ClassMastersViewModelImpl classMastersViewModelImpl = new ClassMastersViewModelImpl((ObservableImpl) this.f11873a.get(), (ExecuteOnceUiCommandSource) this.f11874b.get(), (AuthenticationService) this.f11875c.get(), (ProfileRepository) this.f11876d.get(), (GroupRepository) this.f11877e.get(), (ClassMasterRepository) this.f11878f.get());
        return classMastersViewModelImpl;
    }
}
