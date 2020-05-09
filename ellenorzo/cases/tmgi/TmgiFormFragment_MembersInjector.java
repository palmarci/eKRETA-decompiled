package p289hu.ekreta.ellenorzo.cases.tmgi;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.cases.tmgi.TmgiFormFragment_MembersInjector */
public final class TmgiFormFragment_MembersInjector implements C4447b<TmgiFormFragment> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f11700a;

    /* renamed from: b */
    public final C5431a<TmgiFormViewModel> f11701b;

    /* renamed from: a */
    public void injectMembers(TmgiFormFragment tmgiFormFragment) {
        tmgiFormFragment.f15499Z = (DispatchingAndroidInjector) this.f11700a.get();
        tmgiFormFragment.f11695a0 = (TmgiFormViewModel) this.f11701b.get();
    }

    /* renamed from: a */
    public static void m11214a(TmgiFormFragment tmgiFormFragment, TmgiFormViewModel tmgiFormViewModel) {
        tmgiFormFragment.f11695a0 = tmgiFormViewModel;
    }
}
