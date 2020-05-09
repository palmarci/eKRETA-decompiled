package p289hu.ekreta.ellenorzo.homework.comment;

import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.homework.HomeworkRepository;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.util.datetime.DateTimeFactory;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.homework.comment.HomeworkCommentFormViewModelImpl_Factory */
public final class HomeworkCommentFormViewModelImpl_Factory implements C4463c<HomeworkCommentFormViewModelImpl> {

    /* renamed from: a */
    public final C5431a<ObservableImpl> f13569a;

    /* renamed from: b */
    public final C5431a<ExecuteOnceUiCommandSource> f13570b;

    /* renamed from: c */
    public final C5431a<AuthenticationService> f13571c;

    /* renamed from: d */
    public final C5431a<ProfileRepository> f13572d;

    /* renamed from: e */
    public final C5431a<HomeworkRepository> f13573e;

    /* renamed from: f */
    public final C5431a<DateTimeFactory> f13574f;

    public HomeworkCommentFormViewModelImpl_Factory(C5431a<ObservableImpl> aVar, C5431a<ExecuteOnceUiCommandSource> aVar2, C5431a<AuthenticationService> aVar3, C5431a<ProfileRepository> aVar4, C5431a<HomeworkRepository> aVar5, C5431a<DateTimeFactory> aVar6) {
        this.f13569a = aVar;
        this.f13570b = aVar2;
        this.f13571c = aVar3;
        this.f13572d = aVar4;
        this.f13573e = aVar5;
        this.f13574f = aVar6;
    }

    public HomeworkCommentFormViewModelImpl get() {
        HomeworkCommentFormViewModelImpl homeworkCommentFormViewModelImpl = new HomeworkCommentFormViewModelImpl((ObservableImpl) this.f13569a.get(), (ExecuteOnceUiCommandSource) this.f13570b.get(), (AuthenticationService) this.f13571c.get(), (ProfileRepository) this.f13572d.get(), (HomeworkRepository) this.f13573e.get(), (DateTimeFactory) this.f13574f.get());
        return homeworkCommentFormViewModelImpl;
    }
}
