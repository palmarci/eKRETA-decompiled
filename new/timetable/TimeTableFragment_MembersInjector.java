package hu.ekreta.ellenorzo.timetable;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import i.b;
import l.a.a;

public final class TimeTableFragment_MembersInjector implements b<TimeTableFragment> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f6222a;
    public final a<TimeTableViewModel> b;

    /* renamed from: a */
    public void injectMembers(TimeTableFragment timeTableFragment) {
        timeTableFragment.Z = this.f6222a.get();
        timeTableFragment.a0 = this.b.get();
    }

    public static void a(TimeTableFragment timeTableFragment, TimeTableViewModel timeTableViewModel) {
        timeTableFragment.a0 = timeTableViewModel;
    }
}
