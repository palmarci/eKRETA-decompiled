package p289hu.ekreta.ellenorzo.rootedDeviceDetected;

import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.rootedDeviceDetected.RootedDeviceDetectedViewModelImpl_Factory */
public final class RootedDeviceDetectedViewModelImpl_Factory implements C4463c<RootedDeviceDetectedViewModelImpl> {

    /* renamed from: a */
    public final C5431a<ObservableImpl> f14710a;

    /* renamed from: b */
    public final C5431a<ExecuteOnceUiCommandSource> f14711b;

    public RootedDeviceDetectedViewModelImpl_Factory(C5431a<ObservableImpl> aVar, C5431a<ExecuteOnceUiCommandSource> aVar2) {
        this.f14710a = aVar;
        this.f14711b = aVar2;
    }

    public RootedDeviceDetectedViewModelImpl get() {
        return new RootedDeviceDetectedViewModelImpl((ObservableImpl) this.f14710a.get(), (ExecuteOnceUiCommandSource) this.f14711b.get());
    }
}
