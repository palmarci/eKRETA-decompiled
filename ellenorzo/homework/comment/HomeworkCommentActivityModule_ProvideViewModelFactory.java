package p289hu.ekreta.ellenorzo.homework.comment;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.homework.comment.HomeworkCommentActivityModule_ProvideViewModelFactory */
public final class HomeworkCommentActivityModule_ProvideViewModelFactory implements C4463c<HomeworkCommentFormViewModel> {

    /* renamed from: a */
    public final HomeworkCommentActivityModule f13543a;

    /* renamed from: b */
    public final C5431a<HomeworkCommentFormActivity> f13544b;

    /* renamed from: c */
    public final C5431a<HomeworkCommentFormViewModelImpl> f13545c;

    public HomeworkCommentActivityModule_ProvideViewModelFactory(HomeworkCommentActivityModule homeworkCommentActivityModule, C5431a<HomeworkCommentFormActivity> aVar, C5431a<HomeworkCommentFormViewModelImpl> aVar2) {
        this.f13543a = homeworkCommentActivityModule;
        this.f13544b = aVar;
        this.f13545c = aVar2;
    }

    public HomeworkCommentFormViewModel get() {
        HomeworkCommentFormViewModel a = this.f13543a.mo13043a((HomeworkCommentFormActivity) this.f13544b.get(), this.f13545c);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
