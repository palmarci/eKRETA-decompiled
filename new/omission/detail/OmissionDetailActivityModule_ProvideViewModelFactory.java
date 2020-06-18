package hu.ekreta.ellenorzo.omission.detail;

import h.w.v;
import i.d.c;
import l.a.a;

public final class OmissionDetailActivityModule_ProvideViewModelFactory implements c<OmissionDetailViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final OmissionDetailActivityModule f5978a;
    public final a<OmissionDetailActivity> b;
    public final a<OmissionDetailViewModelImpl> c;

    public OmissionDetailActivityModule_ProvideViewModelFactory(OmissionDetailActivityModule omissionDetailActivityModule, a<OmissionDetailActivity> aVar, a<OmissionDetailViewModelImpl> aVar2) {
        this.f5978a = omissionDetailActivityModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public OmissionDetailViewModel get() {
        OmissionDetailViewModel a2 = this.f5978a.a(this.b.get(), this.c);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
