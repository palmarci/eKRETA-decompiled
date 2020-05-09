package p289hu.ekreta.ellenorzo.omission;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.omission.OmissionFragmentModule_ProvideViewModelFactory */
public final class OmissionFragmentModule_ProvideViewModelFactory implements C4463c<OmissionsPerDayViewModel> {

    /* renamed from: a */
    public final OmissionFragmentModule f14387a;

    /* renamed from: b */
    public final C5431a<OmissionsPerDayFragment> f14388b;

    /* renamed from: c */
    public final C5431a<OmissionsPerDayViewModelImpl> f14389c;

    public OmissionFragmentModule_ProvideViewModelFactory(OmissionFragmentModule omissionFragmentModule, C5431a<OmissionsPerDayFragment> aVar, C5431a<OmissionsPerDayViewModelImpl> aVar2) {
        this.f14387a = omissionFragmentModule;
        this.f14388b = aVar;
        this.f14389c = aVar2;
    }

    public OmissionsPerDayViewModel get() {
        OmissionsPerDayViewModel a = this.f14387a.mo13899a((OmissionsPerDayFragment) this.f14388b.get(), this.f14389c);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
