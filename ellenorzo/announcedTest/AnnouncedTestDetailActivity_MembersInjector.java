package p289hu.ekreta.ellenorzo.announcedTest;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.announcedTest.AnnouncedTestDetailActivity_MembersInjector */
public final class AnnouncedTestDetailActivity_MembersInjector implements C4447b<AnnouncedTestDetailActivity> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f11061a;

    /* renamed from: b */
    public final C5431a<DispatchingAndroidInjector<android.app.Fragment>> f11062b;

    /* renamed from: c */
    public final C5431a<AnnouncedTestDetailViewModel> f11063c;

    /* renamed from: a */
    public void injectMembers(AnnouncedTestDetailActivity announcedTestDetailActivity) {
        announcedTestDetailActivity.f15496v = (DispatchingAndroidInjector) this.f11061a.get();
        announcedTestDetailActivity.f15497w = (DispatchingAndroidInjector) this.f11062b.get();
        announcedTestDetailActivity.f11056x = (AnnouncedTestDetailViewModel) this.f11063c.get();
    }

    /* renamed from: a */
    public static void m10476a(AnnouncedTestDetailActivity announcedTestDetailActivity, AnnouncedTestDetailViewModel announcedTestDetailViewModel) {
        announcedTestDetailActivity.f11056x = announcedTestDetailViewModel;
    }
}
