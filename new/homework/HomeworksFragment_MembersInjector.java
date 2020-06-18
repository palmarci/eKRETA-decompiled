package hu.ekreta.ellenorzo.homework;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import hu.ekreta.ellenorzo.reminder.RemindersViewModel;
import i.b;
import l.a.a;

public final class HomeworksFragment_MembersInjector implements b<HomeworksFragment> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f5684a;
    public final a<RemindersViewModel> b;

    /* renamed from: a */
    public void injectMembers(HomeworksFragment homeworksFragment) {
        homeworksFragment.Z = this.f5684a.get();
        homeworksFragment.a0 = this.b.get();
    }

    public static void a(HomeworksFragment homeworksFragment, RemindersViewModel remindersViewModel) {
        homeworksFragment.a0 = remindersViewModel;
    }
}
