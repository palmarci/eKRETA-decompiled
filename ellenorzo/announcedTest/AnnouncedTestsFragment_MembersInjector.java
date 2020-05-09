package p289hu.ekreta.ellenorzo.announcedTest;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import p289hu.ekreta.ellenorzo.reminder.RemindersViewModel;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.announcedTest.AnnouncedTestsFragment_MembersInjector */
public final class AnnouncedTestsFragment_MembersInjector implements C4447b<AnnouncedTestsFragment> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f11127a;

    /* renamed from: b */
    public final C5431a<RemindersViewModel> f11128b;

    /* renamed from: a */
    public void injectMembers(AnnouncedTestsFragment announcedTestsFragment) {
        announcedTestsFragment.f15499Z = (DispatchingAndroidInjector) this.f11127a.get();
        announcedTestsFragment.f11111a0 = (RemindersViewModel) this.f11128b.get();
    }

    /* renamed from: a */
    public static void m10568a(AnnouncedTestsFragment announcedTestsFragment, RemindersViewModel remindersViewModel) {
        announcedTestsFragment.f11111a0 = remindersViewModel;
    }
}
