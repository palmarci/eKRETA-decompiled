package hu.ekreta.ellenorzo.reminder;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import i.b;
import l.a.a;

public final class RemindersFragment_MembersInjector implements b<RemindersFragment> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f6064a;
    public final a<RemindersViewModel> b;

    /* renamed from: a */
    public void injectMembers(RemindersFragment remindersFragment) {
        remindersFragment.Z = this.f6064a.get();
        remindersFragment.a0 = this.b.get();
    }

    public static void a(RemindersFragment remindersFragment, RemindersViewModel remindersViewModel) {
        remindersFragment.a0 = remindersViewModel;
    }
}
