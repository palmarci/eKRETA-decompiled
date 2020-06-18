package hu.ekreta.ellenorzo.subject.detail;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import i.b;
import l.a.a;

public final class SubjectDetailActivity_MembersInjector implements b<SubjectDetailActivity> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f6187a;
    public final a<DispatchingAndroidInjector<android.app.Fragment>> b;
    public final a<SubjectDetailViewModel> c;

    /* renamed from: a */
    public void injectMembers(SubjectDetailActivity subjectDetailActivity) {
        subjectDetailActivity.v = this.f6187a.get();
        subjectDetailActivity.w = this.b.get();
        subjectDetailActivity.x = this.c.get();
    }

    public static void a(SubjectDetailActivity subjectDetailActivity, SubjectDetailViewModel subjectDetailViewModel) {
        subjectDetailActivity.x = subjectDetailViewModel;
    }
}
