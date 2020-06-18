package hu.ekreta.ellenorzo.profile.detail;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import i.b;
import l.a.a;

public final class ProfileDetailActivity_MembersInjector implements b<ProfileDetailActivity> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f6036a;
    public final a<DispatchingAndroidInjector<android.app.Fragment>> b;
    public final a<ProfileDetailViewModel> c;

    /* renamed from: a */
    public void injectMembers(ProfileDetailActivity profileDetailActivity) {
        profileDetailActivity.v = this.f6036a.get();
        profileDetailActivity.w = this.b.get();
        profileDetailActivity.x = this.c.get();
    }

    public static void a(ProfileDetailActivity profileDetailActivity, ProfileDetailViewModel profileDetailViewModel) {
        profileDetailActivity.x = profileDetailViewModel;
    }
}
