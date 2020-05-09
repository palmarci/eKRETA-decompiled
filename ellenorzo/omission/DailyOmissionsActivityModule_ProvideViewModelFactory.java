package p289hu.ekreta.ellenorzo.omission;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.omission.DailyOmissionsActivityModule_ProvideViewModelFactory */
public final class DailyOmissionsActivityModule_ProvideViewModelFactory implements C4463c<DailyOmissionsViewModel> {

    /* renamed from: a */
    public final DailyOmissionsActivityModule f14304a;

    /* renamed from: b */
    public final C5431a<DailyOmissionsActivity> f14305b;

    /* renamed from: c */
    public final C5431a<DailyOmissionsViewModelImpl> f14306c;

    public DailyOmissionsActivityModule_ProvideViewModelFactory(DailyOmissionsActivityModule dailyOmissionsActivityModule, C5431a<DailyOmissionsActivity> aVar, C5431a<DailyOmissionsViewModelImpl> aVar2) {
        this.f14304a = dailyOmissionsActivityModule;
        this.f14305b = aVar;
        this.f14306c = aVar2;
    }

    public DailyOmissionsViewModel get() {
        DailyOmissionsViewModel a = this.f14304a.mo13826a((DailyOmissionsActivity) this.f14305b.get(), this.f14306c);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
