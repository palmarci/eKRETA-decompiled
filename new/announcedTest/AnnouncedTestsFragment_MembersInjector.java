package hu.ekreta.ellenorzo.announcedTest;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import hu.ekreta.ellenorzo.reminder.RemindersViewModel;
import i.b;
import l.a.a;

public final class AnnouncedTestsFragment_MembersInjector implements b<AnnouncedTestsFragment> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f5037a;
    public final a<RemindersViewModel> b;

    /* renamed from: a */
    public void injectMembers(AnnouncedTestsFragment announcedTestsFragment) {
        announcedTestsFragment.Z = this.f5037a.get();
        announcedTestsFragment.a0 = this.b.get();
    }

    public static void a(AnnouncedTestsFragment announcedTestsFragment, RemindersViewModel remindersViewModel) {
        announcedTestsFragment.a0 = remindersViewModel;
    }
}
