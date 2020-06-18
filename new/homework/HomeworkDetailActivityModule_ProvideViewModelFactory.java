package hu.ekreta.ellenorzo.homework;

import h.w.v;
import i.d.c;
import l.a.a;

public final class HomeworkDetailActivityModule_ProvideViewModelFactory implements c<HomeworkDetailViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final HomeworkDetailActivityModule f5659a;
    public final a<HomeworkDetailActivity> b;
    public final a<HomeworkDetailViewModelImpl> c;

    public HomeworkDetailActivityModule_ProvideViewModelFactory(HomeworkDetailActivityModule homeworkDetailActivityModule, a<HomeworkDetailActivity> aVar, a<HomeworkDetailViewModelImpl> aVar2) {
        this.f5659a = homeworkDetailActivityModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public HomeworkDetailViewModel get() {
        HomeworkDetailViewModel a2 = this.f5659a.a(this.b.get(), this.c);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
