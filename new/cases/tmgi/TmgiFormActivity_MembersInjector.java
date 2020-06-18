package hu.ekreta.ellenorzo.cases.tmgi;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import i.b;
import l.a.a;

public final class TmgiFormActivity_MembersInjector implements b<TmgiFormActivity> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f5240a;
    public final a<DispatchingAndroidInjector<android.app.Fragment>> b;

    /* renamed from: a */
    public void injectMembers(TmgiFormActivity tmgiFormActivity) {
        tmgiFormActivity.v = this.f5240a.get();
        tmgiFormActivity.w = this.b.get();
    }
}
