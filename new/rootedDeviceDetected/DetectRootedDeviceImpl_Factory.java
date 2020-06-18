package hu.ekreta.ellenorzo.rootedDeviceDetected;

import a.n.a.b;
import i.d.c;
import l.a.a;

public final class DetectRootedDeviceImpl_Factory implements c<DetectRootedDeviceImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<b> f6070a;

    public DetectRootedDeviceImpl_Factory(a<b> aVar) {
        this.f6070a = aVar;
    }

    public DetectRootedDeviceImpl get() {
        return new DetectRootedDeviceImpl(this.f6070a.get());
    }
}
