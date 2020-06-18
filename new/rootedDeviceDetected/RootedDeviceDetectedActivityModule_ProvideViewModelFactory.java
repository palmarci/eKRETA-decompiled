package hu.ekreta.ellenorzo.rootedDeviceDetected;

import h.w.v;
import i.d.c;
import l.a.a;

public final class RootedDeviceDetectedActivityModule_ProvideViewModelFactory implements c<RootedDeviceDetectedViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final RootedDeviceDetectedActivityModule f6071a;
    public final a<RootedDeviceDetectedActivity> b;
    public final a<RootedDeviceDetectedViewModelImpl> c;

    public RootedDeviceDetectedActivityModule_ProvideViewModelFactory(RootedDeviceDetectedActivityModule rootedDeviceDetectedActivityModule, a<RootedDeviceDetectedActivity> aVar, a<RootedDeviceDetectedViewModelImpl> aVar2) {
        this.f6071a = rootedDeviceDetectedActivityModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public RootedDeviceDetectedViewModel get() {
        RootedDeviceDetectedViewModel a2 = this.f6071a.a(this.b.get(), this.c);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
