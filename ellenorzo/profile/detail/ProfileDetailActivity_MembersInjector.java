package p289hu.ekreta.ellenorzo.profile.detail;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.profile.detail.ProfileDetailActivity_MembersInjector */
public final class ProfileDetailActivity_MembersInjector implements C4447b<ProfileDetailActivity> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f14575a;

    /* renamed from: b */
    public final C5431a<DispatchingAndroidInjector<android.app.Fragment>> f14576b;

    /* renamed from: c */
    public final C5431a<ProfileDetailViewModel> f14577c;

    /* renamed from: a */
    public void injectMembers(ProfileDetailActivity profileDetailActivity) {
        profileDetailActivity.f15496v = (DispatchingAndroidInjector) this.f14575a.get();
        profileDetailActivity.f15497w = (DispatchingAndroidInjector) this.f14576b.get();
        profileDetailActivity.f14563x = (ProfileDetailViewModel) this.f14577c.get();
    }

    /* renamed from: a */
    public static void m13885a(ProfileDetailActivity profileDetailActivity, ProfileDetailViewModel profileDetailViewModel) {
        profileDetailActivity.f14563x = profileDetailViewModel;
    }
}
