package p289hu.ekreta.ellenorzo.reminder;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.reminder.RemindersFragment_MembersInjector */
public final class RemindersFragment_MembersInjector implements C4447b<RemindersFragment> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f14668a;

    /* renamed from: b */
    public final C5431a<RemindersViewModel> f14669b;

    /* renamed from: a */
    public void injectMembers(RemindersFragment remindersFragment) {
        remindersFragment.f15499Z = (DispatchingAndroidInjector) this.f14668a.get();
        remindersFragment.f14651a0 = (RemindersViewModel) this.f14669b.get();
    }

    /* renamed from: a */
    public static void m13994a(RemindersFragment remindersFragment, RemindersViewModel remindersViewModel) {
        remindersFragment.f14651a0 = remindersViewModel;
    }
}
