package hu.ekreta.ellenorzo.subject.detail;

import h.w.v;
import i.d.c;
import l.a.a;

public final class SubjectDetailActivityModule_ProvideViewModelFactory implements c<SubjectDetailViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final SubjectDetailActivityModule f6186a;
    public final a<SubjectDetailActivity> b;
    public final a<SubjectDetailViewModelImpl> c;

    public SubjectDetailActivityModule_ProvideViewModelFactory(SubjectDetailActivityModule subjectDetailActivityModule, a<SubjectDetailActivity> aVar, a<SubjectDetailViewModelImpl> aVar2) {
        this.f6186a = subjectDetailActivityModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public SubjectDetailViewModel get() {
        SubjectDetailViewModel a2 = this.f6186a.a(this.b.get(), this.c);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
