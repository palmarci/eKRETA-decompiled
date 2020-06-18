package hu.ekreta.ellenorzo.omission.detail;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import i.b;
import l.a.a;

public final class OmissionDetailActivity_MembersInjector implements b<OmissionDetailActivity> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f5979a;
    public final a<DispatchingAndroidInjector<android.app.Fragment>> b;
    public final a<OmissionDetailViewModel> c;

    /* renamed from: a */
    public void injectMembers(OmissionDetailActivity omissionDetailActivity) {
        omissionDetailActivity.v = this.f5979a.get();
        omissionDetailActivity.w = this.b.get();
        omissionDetailActivity.x = this.c.get();
    }

    public static void a(OmissionDetailActivity omissionDetailActivity, OmissionDetailViewModel omissionDetailViewModel) {
        omissionDetailActivity.x = omissionDetailViewModel;
    }
}
