package p289hu.ekreta.ellenorzo.omission;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.omission.DailyOmissionsActivity_MembersInjector */
public final class DailyOmissionsActivity_MembersInjector implements C4447b<DailyOmissionsActivity> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f14307a;

    /* renamed from: b */
    public final C5431a<DispatchingAndroidInjector<android.app.Fragment>> f14308b;

    /* renamed from: c */
    public final C5431a<DailyOmissionsViewModel> f14309c;

    /* renamed from: a */
    public void injectMembers(DailyOmissionsActivity dailyOmissionsActivity) {
        dailyOmissionsActivity.f15496v = (DispatchingAndroidInjector) this.f14307a.get();
        dailyOmissionsActivity.f15497w = (DispatchingAndroidInjector) this.f14308b.get();
        dailyOmissionsActivity.f14296x = (DailyOmissionsViewModel) this.f14309c.get();
    }

    /* renamed from: a */
    public static void m13475a(DailyOmissionsActivity dailyOmissionsActivity, DailyOmissionsViewModel dailyOmissionsViewModel) {
        dailyOmissionsActivity.f14296x = dailyOmissionsViewModel;
    }
}
