package p289hu.ekreta.ellenorzo.noticeboard.detail;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.noticeboard.detail.NoticeBoardItemDetailActivity_MembersInjector */
public final class NoticeBoardItemDetailActivity_MembersInjector implements C4447b<NoticeBoardItemDetailActivity> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f14183a;

    /* renamed from: b */
    public final C5431a<DispatchingAndroidInjector<android.app.Fragment>> f14184b;

    /* renamed from: c */
    public final C5431a<NoticeBoardItemDetailViewModel> f14185c;

    /* renamed from: a */
    public void injectMembers(NoticeBoardItemDetailActivity noticeBoardItemDetailActivity) {
        noticeBoardItemDetailActivity.f15496v = (DispatchingAndroidInjector) this.f14183a.get();
        noticeBoardItemDetailActivity.f15497w = (DispatchingAndroidInjector) this.f14184b.get();
        noticeBoardItemDetailActivity.f14181x = (NoticeBoardItemDetailViewModel) this.f14185c.get();
    }

    /* renamed from: a */
    public static void m13383a(NoticeBoardItemDetailActivity noticeBoardItemDetailActivity, NoticeBoardItemDetailViewModel noticeBoardItemDetailViewModel) {
        noticeBoardItemDetailActivity.f14181x = noticeBoardItemDetailViewModel;
    }
}
