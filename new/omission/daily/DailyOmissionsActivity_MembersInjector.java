package hu.ekreta.ellenorzo.omission.daily;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import i.b;
import l.a.a;

public final class DailyOmissionsActivity_MembersInjector implements b<DailyOmissionsActivity> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f5968a;
    public final a<DispatchingAndroidInjector<android.app.Fragment>> b;
    public final a<DailyOmissionsViewModel> c;

    /* renamed from: a */
    public void injectMembers(DailyOmissionsActivity dailyOmissionsActivity) {
        dailyOmissionsActivity.v = this.f5968a.get();
        dailyOmissionsActivity.w = this.b.get();
        dailyOmissionsActivity.x = this.c.get();
    }

    public static void a(DailyOmissionsActivity dailyOmissionsActivity, DailyOmissionsViewModel dailyOmissionsViewModel) {
        dailyOmissionsActivity.x = dailyOmissionsViewModel;
    }
}
