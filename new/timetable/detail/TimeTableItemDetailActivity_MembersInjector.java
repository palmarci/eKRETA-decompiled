package hu.ekreta.ellenorzo.timetable.detail;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import i.b;
import l.a.a;

public final class TimeTableItemDetailActivity_MembersInjector implements b<TimeTableItemDetailActivity> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f6257a;
    public final a<DispatchingAndroidInjector<android.app.Fragment>> b;
    public final a<TimeTableItemDetailViewModel> c;

    /* renamed from: a */
    public void injectMembers(TimeTableItemDetailActivity timeTableItemDetailActivity) {
        timeTableItemDetailActivity.v = this.f6257a.get();
        timeTableItemDetailActivity.w = this.b.get();
        timeTableItemDetailActivity.x = this.c.get();
    }

    public static void a(TimeTableItemDetailActivity timeTableItemDetailActivity, TimeTableItemDetailViewModel timeTableItemDetailViewModel) {
        timeTableItemDetailActivity.x = timeTableItemDetailViewModel;
    }
}
