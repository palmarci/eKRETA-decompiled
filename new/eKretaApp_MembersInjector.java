package hu.ekreta.ellenorzo;

import android.app.Activity;
import android.app.Fragment;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import dagger.android.DispatchingAndroidInjector;
import i.b;
import l.a.a;

public final class eKretaApp_MembersInjector implements b<eKretaApp> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Activity>> f5549a;
    public final a<DispatchingAndroidInjector<BroadcastReceiver>> b;
    public final a<DispatchingAndroidInjector<Fragment>> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Service>> f5550d;
    public final a<DispatchingAndroidInjector<ContentProvider>> e;
    public final a<DispatchingAndroidInjector<androidx.fragment.app.Fragment>> f;

    /* renamed from: a */
    public void injectMembers(eKretaApp ekretaapp) {
        ekretaapp.c = this.f5549a.get();
        ekretaapp.e = this.b.get();
        ekretaapp.f = this.c.get();
        ekretaapp.f6341g = this.f5550d.get();
        ekretaapp.f6342h = this.e.get();
        ekretaapp.c();
        ekretaapp.f6344j = this.f.get();
    }
}
