package p289hu.ekreta.ellenorzo.homework;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import p289hu.ekreta.ellenorzo.reminder.RemindersViewModel;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.homework.HomeworksFragment_MembersInjector */
public final class HomeworksFragment_MembersInjector implements C4447b<HomeworksFragment> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f13534a;

    /* renamed from: b */
    public final C5431a<RemindersViewModel> f13535b;

    /* renamed from: a */
    public void injectMembers(HomeworksFragment homeworksFragment) {
        homeworksFragment.f15499Z = (DispatchingAndroidInjector) this.f13534a.get();
        homeworksFragment.f13518a0 = (RemindersViewModel) this.f13535b.get();
    }

    /* renamed from: a */
    public static void m12644a(HomeworksFragment homeworksFragment, RemindersViewModel remindersViewModel) {
        homeworksFragment.f13518a0 = remindersViewModel;
    }
}
