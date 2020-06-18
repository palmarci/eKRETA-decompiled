package hu.ekreta.ellenorzo.rootedDeviceDetected;

import a.n.a.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lhu/ekreta/ellenorzo/rootedDeviceDetected/DetectRootedDeviceImpl;", "Lhu/ekreta/ellenorzo/rootedDeviceDetected/DetectRootedDevice;", "rootBeer", "Lcom/scottyab/rootbeer/RootBeer;", "(Lcom/scottyab/rootbeer/RootBeer;)V", "getRootBeer", "()Lcom/scottyab/rootbeer/RootBeer;", "rooted", "", "getRooted", "()Z", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: DetectRootedDeviceImpl.kt */
public final class DetectRootedDeviceImpl implements DetectRootedDevice {

    /* renamed from: a  reason: collision with root package name */
    public final b f6069a;

    public DetectRootedDeviceImpl(b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "rootBeer");
        this.f6069a = bVar;
    }

    public boolean a() {
        return this.f6069a.a();
    }
}
