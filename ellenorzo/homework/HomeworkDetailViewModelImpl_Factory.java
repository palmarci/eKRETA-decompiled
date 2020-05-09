package p289hu.ekreta.ellenorzo.homework;

import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.group.GroupRepository;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.homework.HomeworkDetailViewModelImpl_Factory */
public final class HomeworkDetailViewModelImpl_Factory implements C4463c<HomeworkDetailViewModelImpl> {

    /* renamed from: a */
    public final C5431a<ObservableImpl> f13490a;

    /* renamed from: b */
    public final C5431a<ExecuteOnceUiCommandSource> f13491b;

    /* renamed from: c */
    public final C5431a<AuthenticationService> f13492c;

    /* renamed from: d */
    public final C5431a<ProfileRepository> f13493d;

    /* renamed from: e */
    public final C5431a<HomeworkRepository> f13494e;

    /* renamed from: f */
    public final C5431a<GroupRepository> f13495f;

    public HomeworkDetailViewModelImpl_Factory(C5431a<ObservableImpl> aVar, C5431a<ExecuteOnceUiCommandSource> aVar2, C5431a<AuthenticationService> aVar3, C5431a<ProfileRepository> aVar4, C5431a<HomeworkRepository> aVar5, C5431a<GroupRepository> aVar6) {
        this.f13490a = aVar;
        this.f13491b = aVar2;
        this.f13492c = aVar3;
        this.f13493d = aVar4;
        this.f13494e = aVar5;
        this.f13495f = aVar6;
    }

    public HomeworkDetailViewModelImpl get() {
        HomeworkDetailViewModelImpl homeworkDetailViewModelImpl = new HomeworkDetailViewModelImpl((ObservableImpl) this.f13490a.get(), (ExecuteOnceUiCommandSource) this.f13491b.get(), (AuthenticationService) this.f13492c.get(), (ProfileRepository) this.f13493d.get(), (HomeworkRepository) this.f13494e.get(), (GroupRepository) this.f13495f.get());
        return homeworkDetailViewModelImpl;
    }
}
