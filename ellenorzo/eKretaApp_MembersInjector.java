package p289hu.ekreta.ellenorzo;

import android.app.Activity;
import android.app.Fragment;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import dagger.android.DispatchingAndroidInjector;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.eKretaApp_MembersInjector */
public final class eKretaApp_MembersInjector implements C4447b<eKretaApp> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Activity>> f13165a;

    /* renamed from: b */
    public final C5431a<DispatchingAndroidInjector<BroadcastReceiver>> f13166b;

    /* renamed from: c */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f13167c;

    /* renamed from: d */
    public final C5431a<DispatchingAndroidInjector<Service>> f13168d;

    /* renamed from: e */
    public final C5431a<DispatchingAndroidInjector<ContentProvider>> f13169e;

    /* renamed from: f */
    public final C5431a<DispatchingAndroidInjector<androidx.fragment.app.Fragment>> f13170f;

    /* renamed from: a */
    public void injectMembers(eKretaApp ekretaapp) {
        ekretaapp.f15490c = (DispatchingAndroidInjector) this.f13165a.get();
        ekretaapp.f15491e = (DispatchingAndroidInjector) this.f13166b.get();
        ekretaapp.f15492f = (DispatchingAndroidInjector) this.f13167c.get();
        ekretaapp.f15493g = (DispatchingAndroidInjector) this.f13168d.get();
        ekretaapp.f15494h = (DispatchingAndroidInjector) this.f13169e.get();
        ekretaapp.mo16422c();
        ekretaapp.f15498j = (DispatchingAndroidInjector) this.f13170f.get();
    }
}
