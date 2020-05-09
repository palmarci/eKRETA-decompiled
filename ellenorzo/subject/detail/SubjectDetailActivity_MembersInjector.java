package p289hu.ekreta.ellenorzo.subject.detail;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.subject.detail.SubjectDetailActivity_MembersInjector */
public final class SubjectDetailActivity_MembersInjector implements C4447b<SubjectDetailActivity> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f15011a;

    /* renamed from: b */
    public final C5431a<DispatchingAndroidInjector<android.app.Fragment>> f15012b;

    /* renamed from: c */
    public final C5431a<SubjectDetailViewModel> f15013c;

    /* renamed from: a */
    public void injectMembers(SubjectDetailActivity subjectDetailActivity) {
        subjectDetailActivity.f15496v = (DispatchingAndroidInjector) this.f15011a.get();
        subjectDetailActivity.f15497w = (DispatchingAndroidInjector) this.f15012b.get();
        subjectDetailActivity.f15005x = (SubjectDetailViewModel) this.f15013c.get();
    }

    /* renamed from: a */
    public static void m14319a(SubjectDetailActivity subjectDetailActivity, SubjectDetailViewModel subjectDetailViewModel) {
        subjectDetailActivity.f15005x = subjectDetailViewModel;
    }
}
