package p289hu.ekreta.ellenorzo.configSettings;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.configSettings.NotSupportedAppActivityModule_ProvideViewModelFactory */
public final class NotSupportedAppActivityModule_ProvideViewModelFactory implements C4463c<NotSupportedAppViewModel> {

    /* renamed from: a */
    public final NotSupportedAppActivityModule f11907a;

    /* renamed from: b */
    public final C5431a<NotSupportedAppActivity> f11908b;

    /* renamed from: c */
    public final C5431a<NotSupportedAppViewModelImpl> f11909c;

    public NotSupportedAppActivityModule_ProvideViewModelFactory(NotSupportedAppActivityModule notSupportedAppActivityModule, C5431a<NotSupportedAppActivity> aVar, C5431a<NotSupportedAppViewModelImpl> aVar2) {
        this.f11907a = notSupportedAppActivityModule;
        this.f11908b = aVar;
        this.f11909c = aVar2;
    }

    public NotSupportedAppViewModel get() {
        NotSupportedAppViewModel a = this.f11907a.mo12320a((NotSupportedAppActivity) this.f11908b.get(), this.f11909c);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
