package p289hu.ekreta.ellenorzo.rootedDeviceDetected;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p180n.p181a.C2723b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rootedDeviceDetected/DetectRootedDeviceImpl;", "Lhu/ekreta/ellenorzo/rootedDeviceDetected/DetectRootedDevice;", "rootBeer", "Lcom/scottyab/rootbeer/RootBeer;", "(Lcom/scottyab/rootbeer/RootBeer;)V", "getRootBeer", "()Lcom/scottyab/rootbeer/RootBeer;", "rooted", "", "getRooted", "()Z", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.rootedDeviceDetected.DetectRootedDeviceImpl */
/* compiled from: DetectRootedDeviceImpl.kt */
public final class DetectRootedDeviceImpl implements DetectRootedDevice {

    /* renamed from: a */
    public final C2723b f14701a;

    public DetectRootedDeviceImpl(C2723b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "rootBeer");
        this.f14701a = bVar;
    }

    /* renamed from: a */
    public boolean mo15580a() {
        return this.f14701a.mo5146a();
    }
}
