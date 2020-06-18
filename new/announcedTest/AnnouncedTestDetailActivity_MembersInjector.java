package hu.ekreta.ellenorzo.announcedTest;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import i.b;
import l.a.a;

public final class AnnouncedTestDetailActivity_MembersInjector implements b<AnnouncedTestDetailActivity> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f5015a;
    public final a<DispatchingAndroidInjector<android.app.Fragment>> b;
    public final a<AnnouncedTestDetailViewModel> c;

    /* renamed from: a */
    public void injectMembers(AnnouncedTestDetailActivity announcedTestDetailActivity) {
        announcedTestDetailActivity.v = this.f5015a.get();
        announcedTestDetailActivity.w = this.b.get();
        announcedTestDetailActivity.x = this.c.get();
    }

    public static void a(AnnouncedTestDetailActivity announcedTestDetailActivity, AnnouncedTestDetailViewModel announcedTestDetailViewModel) {
        announcedTestDetailActivity.x = announcedTestDetailViewModel;
    }
}
