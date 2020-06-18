package hu.ekreta.ellenorzo.cases.tmgi;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import i.b;
import l.a.a;

public final class TmgiFormFragment_MembersInjector implements b<TmgiFormFragment> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f5242a;
    public final a<TmgiFormViewModel> b;

    /* renamed from: a */
    public void injectMembers(TmgiFormFragment tmgiFormFragment) {
        tmgiFormFragment.Z = this.f5242a.get();
        tmgiFormFragment.a0 = this.b.get();
    }

    public static void a(TmgiFormFragment tmgiFormFragment, TmgiFormViewModel tmgiFormViewModel) {
        tmgiFormFragment.a0 = tmgiFormViewModel;
    }
}
