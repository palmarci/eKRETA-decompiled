package hu.ekreta.ellenorzo.omission.perDay;

import h.w.v;
import i.d.c;
import l.a.a;

public final class OmissionsPerDayFragmentModule_ProvideViewModelFactory implements c<OmissionsPerDayViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final OmissionsPerDayFragmentModule f5990a;
    public final a<OmissionsPerDayFragment> b;
    public final a<OmissionsPerDayViewModelImpl> c;

    public OmissionsPerDayFragmentModule_ProvideViewModelFactory(OmissionsPerDayFragmentModule omissionsPerDayFragmentModule, a<OmissionsPerDayFragment> aVar, a<OmissionsPerDayViewModelImpl> aVar2) {
        this.f5990a = omissionsPerDayFragmentModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public OmissionsPerDayViewModel get() {
        OmissionsPerDayViewModel a2 = this.f5990a.a(this.b.get(), this.c);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
