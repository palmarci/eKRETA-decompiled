package p289hu.ekreta.ellenorzo.omission;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.omission.OmissionDetailActivity_MembersInjector */
public final class OmissionDetailActivity_MembersInjector implements C4447b<OmissionDetailActivity> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f14365a;

    /* renamed from: b */
    public final C5431a<DispatchingAndroidInjector<android.app.Fragment>> f14366b;

    /* renamed from: c */
    public final C5431a<OmissionDetailViewModel> f14367c;

    /* renamed from: a */
    public void injectMembers(OmissionDetailActivity omissionDetailActivity) {
        omissionDetailActivity.f15496v = (DispatchingAndroidInjector) this.f14365a.get();
        omissionDetailActivity.f15497w = (DispatchingAndroidInjector) this.f14366b.get();
        omissionDetailActivity.f14360x = (OmissionDetailViewModel) this.f14367c.get();
    }

    /* renamed from: a */
    public static void m13523a(OmissionDetailActivity omissionDetailActivity, OmissionDetailViewModel omissionDetailViewModel) {
        omissionDetailActivity.f14360x = omissionDetailViewModel;
    }
}
