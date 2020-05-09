package p289hu.ekreta.ellenorzo.about;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import p289hu.ekreta.ellenorzo.main.MainViewModel;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.about.AboutFragment_MembersInjector */
public final class AboutFragment_MembersInjector implements C4447b<AboutFragment> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f11037a;

    /* renamed from: b */
    public final C5431a<MainViewModel> f11038b;

    /* renamed from: a */
    public void injectMembers(AboutFragment aboutFragment) {
        aboutFragment.f15499Z = (DispatchingAndroidInjector) this.f11037a.get();
        aboutFragment.f11025a0 = (MainViewModel) this.f11038b.get();
    }

    /* renamed from: a */
    public static void m10451a(AboutFragment aboutFragment, MainViewModel mainViewModel) {
        aboutFragment.f11025a0 = mainViewModel;
    }
}
