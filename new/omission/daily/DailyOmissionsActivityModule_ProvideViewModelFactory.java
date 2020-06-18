package hu.ekreta.ellenorzo.omission.daily;

import h.w.v;
import i.d.c;
import l.a.a;

public final class DailyOmissionsActivityModule_ProvideViewModelFactory implements c<DailyOmissionsViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final DailyOmissionsActivityModule f5967a;
    public final a<DailyOmissionsActivity> b;
    public final a<DailyOmissionsViewModelImpl> c;

    public DailyOmissionsActivityModule_ProvideViewModelFactory(DailyOmissionsActivityModule dailyOmissionsActivityModule, a<DailyOmissionsActivity> aVar, a<DailyOmissionsViewModelImpl> aVar2) {
        this.f5967a = dailyOmissionsActivityModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public DailyOmissionsViewModel get() {
        DailyOmissionsViewModel a2 = this.f5967a.a(this.b.get(), this.c);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
