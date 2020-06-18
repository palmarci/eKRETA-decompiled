package hu.ekreta.ellenorzo.homework.comment;

import h.w.v;
import i.d.c;
import l.a.a;

public final class HomeworkCommentActivityModule_ProvideViewModelFactory implements c<HomeworkCommentFormViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final HomeworkCommentActivityModule f5688a;
    public final a<HomeworkCommentFormActivity> b;
    public final a<HomeworkCommentFormViewModelImpl> c;

    public HomeworkCommentActivityModule_ProvideViewModelFactory(HomeworkCommentActivityModule homeworkCommentActivityModule, a<HomeworkCommentFormActivity> aVar, a<HomeworkCommentFormViewModelImpl> aVar2) {
        this.f5688a = homeworkCommentActivityModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public HomeworkCommentFormViewModel get() {
        HomeworkCommentFormViewModel a2 = this.f5688a.a(this.b.get(), this.c);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
