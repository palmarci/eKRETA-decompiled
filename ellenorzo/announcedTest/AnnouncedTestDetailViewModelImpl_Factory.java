package p289hu.ekreta.ellenorzo.announcedTest;

import android.content.Context;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.group.GroupRepository;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.announcedTest.AnnouncedTestDetailViewModelImpl_Factory */
public final class AnnouncedTestDetailViewModelImpl_Factory implements C4463c<AnnouncedTestDetailViewModelImpl> {

    /* renamed from: a */
    public final C5431a<ObservableImpl> f11078a;

    /* renamed from: b */
    public final C5431a<ExecuteOnceUiCommandSource> f11079b;

    /* renamed from: c */
    public final C5431a<AuthenticationService> f11080c;

    /* renamed from: d */
    public final C5431a<Context> f11081d;

    /* renamed from: e */
    public final C5431a<GroupRepository> f11082e;

    public AnnouncedTestDetailViewModelImpl_Factory(C5431a<ObservableImpl> aVar, C5431a<ExecuteOnceUiCommandSource> aVar2, C5431a<AuthenticationService> aVar3, C5431a<Context> aVar4, C5431a<GroupRepository> aVar5) {
        this.f11078a = aVar;
        this.f11079b = aVar2;
        this.f11080c = aVar3;
        this.f11081d = aVar4;
        this.f11082e = aVar5;
    }

    public AnnouncedTestDetailViewModelImpl get() {
        AnnouncedTestDetailViewModelImpl announcedTestDetailViewModelImpl = new AnnouncedTestDetailViewModelImpl((ObservableImpl) this.f11078a.get(), (ExecuteOnceUiCommandSource) this.f11079b.get(), (AuthenticationService) this.f11080c.get(), (Context) this.f11081d.get(), (GroupRepository) this.f11082e.get());
        return announcedTestDetailViewModelImpl;
    }
}
