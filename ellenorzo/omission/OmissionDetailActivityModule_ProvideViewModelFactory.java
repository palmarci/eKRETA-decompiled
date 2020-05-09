package p289hu.ekreta.ellenorzo.omission;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.omission.OmissionDetailActivityModule_ProvideViewModelFactory */
public final class OmissionDetailActivityModule_ProvideViewModelFactory implements C4463c<OmissionDetailViewModel> {

    /* renamed from: a */
    public final OmissionDetailActivityModule f14362a;

    /* renamed from: b */
    public final C5431a<OmissionDetailActivity> f14363b;

    /* renamed from: c */
    public final C5431a<OmissionDetailViewModelImpl> f14364c;

    public OmissionDetailActivityModule_ProvideViewModelFactory(OmissionDetailActivityModule omissionDetailActivityModule, C5431a<OmissionDetailActivity> aVar, C5431a<OmissionDetailViewModelImpl> aVar2) {
        this.f14362a = omissionDetailActivityModule;
        this.f14363b = aVar;
        this.f14364c = aVar2;
    }

    public OmissionDetailViewModel get() {
        OmissionDetailViewModel a = this.f14362a.mo13877a((OmissionDetailActivity) this.f14363b.get(), this.f14364c);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
