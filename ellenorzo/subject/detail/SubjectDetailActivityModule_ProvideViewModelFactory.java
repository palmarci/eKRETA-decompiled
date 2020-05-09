package p289hu.ekreta.ellenorzo.subject.detail;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.subject.detail.SubjectDetailActivityModule_ProvideViewModelFactory */
public final class SubjectDetailActivityModule_ProvideViewModelFactory implements C4463c<SubjectDetailViewModel> {

    /* renamed from: a */
    public final SubjectDetailActivityModule f15008a;

    /* renamed from: b */
    public final C5431a<SubjectDetailActivity> f15009b;

    /* renamed from: c */
    public final C5431a<SubjectDetailViewModelImpl> f15010c;

    public SubjectDetailActivityModule_ProvideViewModelFactory(SubjectDetailActivityModule subjectDetailActivityModule, C5431a<SubjectDetailActivity> aVar, C5431a<SubjectDetailViewModelImpl> aVar2) {
        this.f15008a = subjectDetailActivityModule;
        this.f15009b = aVar;
        this.f15010c = aVar2;
    }

    public SubjectDetailViewModel get() {
        SubjectDetailViewModel a = this.f15008a.mo15878a((SubjectDetailActivity) this.f15009b.get(), this.f15010c);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
