package p289hu.ekreta.ellenorzo.homework;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.homework.HomeworkDetailActivityModule_ProvideViewModelFactory */
public final class HomeworkDetailActivityModule_ProvideViewModelFactory implements C4463c<HomeworkDetailViewModel> {

    /* renamed from: a */
    public final HomeworkDetailActivityModule f13455a;

    /* renamed from: b */
    public final C5431a<HomeworkDetailActivity> f13456b;

    /* renamed from: c */
    public final C5431a<HomeworkDetailViewModelImpl> f13457c;

    public HomeworkDetailActivityModule_ProvideViewModelFactory(HomeworkDetailActivityModule homeworkDetailActivityModule, C5431a<HomeworkDetailActivity> aVar, C5431a<HomeworkDetailViewModelImpl> aVar2) {
        this.f13455a = homeworkDetailActivityModule;
        this.f13456b = aVar;
        this.f13457c = aVar2;
    }

    public HomeworkDetailViewModel get() {
        HomeworkDetailViewModel a = this.f13455a.mo12936a((HomeworkDetailActivity) this.f13456b.get(), this.f13457c);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
