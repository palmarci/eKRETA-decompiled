package p289hu.ekreta.ellenorzo.cases.tmgi;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.cases.tmgi.TmgiFormActivity_MembersInjector */
public final class TmgiFormActivity_MembersInjector implements C4447b<TmgiFormActivity> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f11693a;

    /* renamed from: b */
    public final C5431a<DispatchingAndroidInjector<android.app.Fragment>> f11694b;

    /* renamed from: a */
    public void injectMembers(TmgiFormActivity tmgiFormActivity) {
        tmgiFormActivity.f15496v = (DispatchingAndroidInjector) this.f11693a.get();
        tmgiFormActivity.f15497w = (DispatchingAndroidInjector) this.f11694b.get();
    }
}
