package hu.ekreta.ellenorzo.noticeboard.detail;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import i.b;
import l.a.a;

public final class NoticeBoardItemDetailActivity_MembersInjector implements b<NoticeBoardItemDetailActivity> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f5900a;
    public final a<DispatchingAndroidInjector<android.app.Fragment>> b;
    public final a<NoticeBoardItemDetailViewModel> c;

    /* renamed from: a */
    public void injectMembers(NoticeBoardItemDetailActivity noticeBoardItemDetailActivity) {
        noticeBoardItemDetailActivity.v = this.f5900a.get();
        noticeBoardItemDetailActivity.w = this.b.get();
        noticeBoardItemDetailActivity.x = this.c.get();
    }

    public static void a(NoticeBoardItemDetailActivity noticeBoardItemDetailActivity, NoticeBoardItemDetailViewModel noticeBoardItemDetailViewModel) {
        noticeBoardItemDetailActivity.x = noticeBoardItemDetailViewModel;
    }
}
