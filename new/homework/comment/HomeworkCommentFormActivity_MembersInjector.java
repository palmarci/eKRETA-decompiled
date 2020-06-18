package hu.ekreta.ellenorzo.homework.comment;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import i.b;
import l.a.a;

public final class HomeworkCommentFormActivity_MembersInjector implements b<HomeworkCommentFormActivity> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f5689a;
    public final a<DispatchingAndroidInjector<android.app.Fragment>> b;
    public final a<HomeworkCommentFormViewModel> c;

    /* renamed from: a */
    public void injectMembers(HomeworkCommentFormActivity homeworkCommentFormActivity) {
        homeworkCommentFormActivity.v = this.f5689a.get();
        homeworkCommentFormActivity.w = this.b.get();
        homeworkCommentFormActivity.x = this.c.get();
    }

    public static void a(HomeworkCommentFormActivity homeworkCommentFormActivity, HomeworkCommentFormViewModel homeworkCommentFormViewModel) {
        homeworkCommentFormActivity.x = homeworkCommentFormViewModel;
    }
}
