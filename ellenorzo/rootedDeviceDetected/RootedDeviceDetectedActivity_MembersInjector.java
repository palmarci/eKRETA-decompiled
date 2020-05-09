package p289hu.ekreta.ellenorzo.rootedDeviceDetected;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.rootedDeviceDetected.RootedDeviceDetectedActivity_MembersInjector */
public final class RootedDeviceDetectedActivity_MembersInjector implements C4447b<RootedDeviceDetectedActivity> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f14707a;

    /* renamed from: b */
    public final C5431a<DispatchingAndroidInjector<android.app.Fragment>> f14708b;

    /* renamed from: c */
    public final C5431a<RootedDeviceDetectedViewModel> f14709c;

    /* renamed from: a */
    public void injectMembers(RootedDeviceDetectedActivity rootedDeviceDetectedActivity) {
        rootedDeviceDetectedActivity.f15496v = (DispatchingAndroidInjector) this.f14707a.get();
        rootedDeviceDetectedActivity.f15497w = (DispatchingAndroidInjector) this.f14708b.get();
        rootedDeviceDetectedActivity.f14703x = (RootedDeviceDetectedViewModel) this.f14709c.get();
    }

    /* renamed from: a */
    public static void m14009a(RootedDeviceDetectedActivity rootedDeviceDetectedActivity, RootedDeviceDetectedViewModel rootedDeviceDetectedViewModel) {
        rootedDeviceDetectedActivity.f14703x = rootedDeviceDetectedViewModel;
    }
}
