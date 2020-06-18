package hu.ekreta.ellenorzo.util.view;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingListViewModel;
import i.b;
import l.a.a;

public final class ListFragment_MembersInjector<T> implements b<ListFragment<T>> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f6325a;
    public final a<DataBindingListViewModel<T>> b;

    /* renamed from: a */
    public void injectMembers(ListFragment<T> listFragment) {
        listFragment.Z = this.f6325a.get();
        listFragment.a0 = this.b.get();
    }
}
