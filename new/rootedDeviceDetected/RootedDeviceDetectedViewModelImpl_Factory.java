package hu.ekreta.ellenorzo.rootedDeviceDetected;

import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import i.d.c;
import l.a.a;

public final class RootedDeviceDetectedViewModelImpl_Factory implements c<RootedDeviceDetectedViewModelImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<ObservableImpl> f6073a;
    public final a<ExecuteOnceUiCommandSource> b;
    public final a<SystemExit> c;

    public RootedDeviceDetectedViewModelImpl_Factory(a<ObservableImpl> aVar, a<ExecuteOnceUiCommandSource> aVar2, a<SystemExit> aVar3) {
        this.f6073a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }

    public RootedDeviceDetectedViewModelImpl get() {
        return new RootedDeviceDetectedViewModelImpl(this.f6073a.get(), this.b.get(), this.c.get());
    }
}
