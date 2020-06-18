package hu.ekreta.ellenorzo.homework.comment;

import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.homework.HomeworkRepository;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.util.datetime.DateTimeFactory;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import i.d.c;
import l.a.a;

public final class HomeworkCommentFormViewModelImpl_Factory implements c<HomeworkCommentFormViewModelImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<ObservableImpl> f5695a;
    public final a<ExecuteOnceUiCommandSource> b;
    public final a<SystemExit> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<AuthenticationService> f5696d;
    public final a<ProfileRepository> e;
    public final a<HomeworkRepository> f;

    /* renamed from: g  reason: collision with root package name */
    public final a<DateTimeFactory> f5697g;

    public HomeworkCommentFormViewModelImpl_Factory(a<ObservableImpl> aVar, a<ExecuteOnceUiCommandSource> aVar2, a<SystemExit> aVar3, a<AuthenticationService> aVar4, a<ProfileRepository> aVar5, a<HomeworkRepository> aVar6, a<DateTimeFactory> aVar7) {
        this.f5695a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f5696d = aVar4;
        this.e = aVar5;
        this.f = aVar6;
        this.f5697g = aVar7;
    }

    public HomeworkCommentFormViewModelImpl get() {
        return new HomeworkCommentFormViewModelImpl(this.f5695a.get(), this.b.get(), this.c.get(), this.f5696d.get(), this.e.get(), this.f.get(), this.f5697g.get());
    }
}
