package hu.ekreta.ellenorzo.subject.averages;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import i.b;
import l.a.a;

public final class AveragesFragment_MembersInjector implements b<AveragesFragment> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f6162a;
    public final a<AveragesViewModel> b;

    /* renamed from: a */
    public void injectMembers(AveragesFragment averagesFragment) {
        averagesFragment.Z = this.f6162a.get();
        averagesFragment.a0 = this.b.get();
    }

    public static void a(AveragesFragment averagesFragment, AveragesViewModel averagesViewModel) {
        averagesFragment.a0 = averagesViewModel;
    }
}
