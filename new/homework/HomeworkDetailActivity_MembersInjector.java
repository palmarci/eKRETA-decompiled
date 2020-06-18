package hu.ekreta.ellenorzo.homework;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import i.b;
import l.a.a;

public final class HomeworkDetailActivity_MembersInjector implements b<HomeworkDetailActivity> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f5660a;
    public final a<DispatchingAndroidInjector<android.app.Fragment>> b;
    public final a<HomeworkDetailViewModel> c;

    /* renamed from: a */
    public void injectMembers(HomeworkDetailActivity homeworkDetailActivity) {
        homeworkDetailActivity.v = this.f5660a.get();
        homeworkDetailActivity.w = this.b.get();
        homeworkDetailActivity.x = this.c.get();
    }

    public static void a(HomeworkDetailActivity homeworkDetailActivity, HomeworkDetailViewModel homeworkDetailViewModel) {
        homeworkDetailActivity.x = homeworkDetailViewModel;
    }
}
