package hu.ekreta.ellenorzo.noticeboard;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import i.b;
import l.a.a;

public final class NoticeBoardFragment_MembersInjector implements b<NoticeBoardFragment> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f5883a;
    public final a<NoticeBoardViewModel> b;

    /* renamed from: a */
    public void injectMembers(NoticeBoardFragment noticeBoardFragment) {
        noticeBoardFragment.Z = this.f5883a.get();
        noticeBoardFragment.a0 = this.b.get();
    }

    public static void a(NoticeBoardFragment noticeBoardFragment, NoticeBoardViewModel noticeBoardViewModel) {
        noticeBoardFragment.a0 = noticeBoardViewModel;
    }
}
