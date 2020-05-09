package p289hu.ekreta.ellenorzo.homework;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.homework.HomeworkDetailActivity_MembersInjector */
public final class HomeworkDetailActivity_MembersInjector implements C4447b<HomeworkDetailActivity> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f13458a;

    /* renamed from: b */
    public final C5431a<DispatchingAndroidInjector<android.app.Fragment>> f13459b;

    /* renamed from: c */
    public final C5431a<HomeworkDetailViewModel> f13460c;

    /* renamed from: a */
    public void injectMembers(HomeworkDetailActivity homeworkDetailActivity) {
        homeworkDetailActivity.f15496v = (DispatchingAndroidInjector) this.f13458a.get();
        homeworkDetailActivity.f15497w = (DispatchingAndroidInjector) this.f13459b.get();
        homeworkDetailActivity.f13437x = (HomeworkDetailViewModel) this.f13460c.get();
    }

    /* renamed from: a */
    public static void m12523a(HomeworkDetailActivity homeworkDetailActivity, HomeworkDetailViewModel homeworkDetailViewModel) {
        homeworkDetailActivity.f13437x = homeworkDetailViewModel;
    }
}
