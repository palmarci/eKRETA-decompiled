package hu.ekreta.ellenorzo.rootedDeviceDetected;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import i.b;
import l.a.a;

public final class RootedDeviceDetectedActivity_MembersInjector implements b<RootedDeviceDetectedActivity> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f6072a;
    public final a<DispatchingAndroidInjector<android.app.Fragment>> b;
    public final a<RootedDeviceDetectedViewModel> c;

    /* renamed from: a */
    public void injectMembers(RootedDeviceDetectedActivity rootedDeviceDetectedActivity) {
        rootedDeviceDetectedActivity.v = this.f6072a.get();
        rootedDeviceDetectedActivity.w = this.b.get();
        rootedDeviceDetectedActivity.x = this.c.get();
    }

    public static void a(RootedDeviceDetectedActivity rootedDeviceDetectedActivity, RootedDeviceDetectedViewModel rootedDeviceDetectedViewModel) {
        rootedDeviceDetectedActivity.x = rootedDeviceDetectedViewModel;
    }
}
