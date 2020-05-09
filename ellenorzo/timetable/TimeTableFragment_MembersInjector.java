package p289hu.ekreta.ellenorzo.timetable;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.timetable.TimeTableFragment_MembersInjector */
public final class TimeTableFragment_MembersInjector implements C4447b<TimeTableFragment> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f15115a;

    /* renamed from: b */
    public final C5431a<TimeTableViewModel> f15116b;

    /* renamed from: a */
    public void injectMembers(TimeTableFragment timeTableFragment) {
        timeTableFragment.f15499Z = (DispatchingAndroidInjector) this.f15115a.get();
        timeTableFragment.f15100a0 = (TimeTableViewModel) this.f15116b.get();
    }

    /* renamed from: a */
    public static void m14415a(TimeTableFragment timeTableFragment, TimeTableViewModel timeTableViewModel) {
        timeTableFragment.f15100a0 = timeTableViewModel;
    }
}
