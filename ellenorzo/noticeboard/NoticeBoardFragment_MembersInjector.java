package p289hu.ekreta.ellenorzo.noticeboard;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.noticeboard.NoticeBoardFragment_MembersInjector */
public final class NoticeBoardFragment_MembersInjector implements C4447b<NoticeBoardFragment> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f14143a;

    /* renamed from: b */
    public final C5431a<NoticeBoardViewModel> f14144b;

    /* renamed from: a */
    public void injectMembers(NoticeBoardFragment noticeBoardFragment) {
        noticeBoardFragment.f15499Z = (DispatchingAndroidInjector) this.f14143a.get();
        noticeBoardFragment.f14131a0 = (NoticeBoardViewModel) this.f14144b.get();
    }

    /* renamed from: a */
    public static void m13329a(NoticeBoardFragment noticeBoardFragment, NoticeBoardViewModel noticeBoardViewModel) {
        noticeBoardFragment.f14131a0 = noticeBoardViewModel;
    }
}
