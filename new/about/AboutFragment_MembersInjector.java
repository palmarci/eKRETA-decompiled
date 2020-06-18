package hu.ekreta.ellenorzo.about;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import hu.ekreta.ellenorzo.main.MainViewModel;
import i.b;
import l.a.a;

public final class AboutFragment_MembersInjector implements b<AboutFragment> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f4969a;
    public final a<MainViewModel> b;

    /* renamed from: a */
    public void injectMembers(AboutFragment aboutFragment) {
        aboutFragment.Z = this.f4969a.get();
        aboutFragment.a0 = this.b.get();
    }

    public static void a(AboutFragment aboutFragment, MainViewModel mainViewModel) {
        aboutFragment.a0 = mainViewModel;
    }
}
