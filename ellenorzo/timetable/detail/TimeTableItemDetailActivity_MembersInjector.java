package p289hu.ekreta.ellenorzo.timetable.detail;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.timetable.detail.TimeTableItemDetailActivity_MembersInjector */
public final class TimeTableItemDetailActivity_MembersInjector implements C4447b<TimeTableItemDetailActivity> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f15218a;

    /* renamed from: b */
    public final C5431a<DispatchingAndroidInjector<android.app.Fragment>> f15219b;

    /* renamed from: c */
    public final C5431a<TimeTableItemDetailViewModel> f15220c;

    /* renamed from: a */
    public void injectMembers(TimeTableItemDetailActivity timeTableItemDetailActivity) {
        timeTableItemDetailActivity.f15496v = (DispatchingAndroidInjector) this.f15218a.get();
        timeTableItemDetailActivity.f15497w = (DispatchingAndroidInjector) this.f15219b.get();
        timeTableItemDetailActivity.f15211x = (TimeTableItemDetailViewModel) this.f15220c.get();
    }

    /* renamed from: a */
    public static void m14567a(TimeTableItemDetailActivity timeTableItemDetailActivity, TimeTableItemDetailViewModel timeTableItemDetailViewModel) {
        timeTableItemDetailActivity.f15211x = timeTableItemDetailViewModel;
    }
}
