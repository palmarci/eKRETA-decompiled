package p289hu.ekreta.ellenorzo.homework.comment;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.homework.comment.HomeworkCommentFormActivity_MembersInjector */
public final class HomeworkCommentFormActivity_MembersInjector implements C4447b<HomeworkCommentFormActivity> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f13547a;

    /* renamed from: b */
    public final C5431a<DispatchingAndroidInjector<android.app.Fragment>> f13548b;

    /* renamed from: c */
    public final C5431a<HomeworkCommentFormViewModel> f13549c;

    /* renamed from: a */
    public void injectMembers(HomeworkCommentFormActivity homeworkCommentFormActivity) {
        homeworkCommentFormActivity.f15496v = (DispatchingAndroidInjector) this.f13547a.get();
        homeworkCommentFormActivity.f15497w = (DispatchingAndroidInjector) this.f13548b.get();
        homeworkCommentFormActivity.f13546x = (HomeworkCommentFormViewModel) this.f13549c.get();
    }

    /* renamed from: a */
    public static void m12655a(HomeworkCommentFormActivity homeworkCommentFormActivity, HomeworkCommentFormViewModel homeworkCommentFormViewModel) {
        homeworkCommentFormActivity.f13546x = homeworkCommentFormViewModel;
    }
}
