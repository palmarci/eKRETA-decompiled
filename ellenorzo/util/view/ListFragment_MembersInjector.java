package p289hu.ekreta.ellenorzo.util.view;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingListViewModel;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.util.view.ListFragment_MembersInjector */
public final class ListFragment_MembersInjector<T> implements C4447b<ListFragment<T>> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f15439a;

    /* renamed from: b */
    public final C5431a<DataBindingListViewModel<T>> f15440b;

    /* renamed from: a */
    public void injectMembers(ListFragment<T> listFragment) {
        listFragment.f15499Z = (DispatchingAndroidInjector) this.f15439a.get();
        listFragment.f15437a0 = (DataBindingListViewModel) this.f15440b.get();
    }
}
