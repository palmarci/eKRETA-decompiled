package p289hu.ekreta.ellenorzo.rootedDeviceDetected;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.rootedDeviceDetected.RootedDeviceDetectedActivityModule_ProvideViewModelFactory */
public final class RootedDeviceDetectedActivityModule_ProvideViewModelFactory implements C4463c<RootedDeviceDetectedViewModel> {

    /* renamed from: a */
    public final RootedDeviceDetectedActivityModule f14704a;

    /* renamed from: b */
    public final C5431a<RootedDeviceDetectedActivity> f14705b;

    /* renamed from: c */
    public final C5431a<RootedDeviceDetectedViewModelImpl> f14706c;

    public RootedDeviceDetectedActivityModule_ProvideViewModelFactory(RootedDeviceDetectedActivityModule rootedDeviceDetectedActivityModule, C5431a<RootedDeviceDetectedActivity> aVar, C5431a<RootedDeviceDetectedViewModelImpl> aVar2) {
        this.f14704a = rootedDeviceDetectedActivityModule;
        this.f14705b = aVar;
        this.f14706c = aVar2;
    }

    public RootedDeviceDetectedViewModel get() {
        RootedDeviceDetectedViewModel a = this.f14704a.mo15581a((RootedDeviceDetectedActivity) this.f14705b.get(), this.f14706c);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
