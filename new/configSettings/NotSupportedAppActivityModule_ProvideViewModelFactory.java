package hu.ekreta.ellenorzo.configSettings;

import h.w.v;
import i.d.c;
import l.a.a;

public final class NotSupportedAppActivityModule_ProvideViewModelFactory implements c<NotSupportedAppViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final NotSupportedAppActivityModule f5301a;
    public final a<NotSupportedAppActivity> b;
    public final a<NotSupportedAppViewModelImpl> c;

    public NotSupportedAppActivityModule_ProvideViewModelFactory(NotSupportedAppActivityModule notSupportedAppActivityModule, a<NotSupportedAppActivity> aVar, a<NotSupportedAppViewModelImpl> aVar2) {
        this.f5301a = notSupportedAppActivityModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public NotSupportedAppViewModel get() {
        NotSupportedAppViewModel a2 = this.f5301a.a(this.b.get(), this.c);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
