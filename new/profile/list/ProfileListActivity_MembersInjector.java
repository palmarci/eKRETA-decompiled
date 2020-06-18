package hu.ekreta.ellenorzo.profile.list;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import i.b;
import l.a.a;

public final class ProfileListActivity_MembersInjector implements b<ProfileListActivity> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f6047a;
    public final a<DispatchingAndroidInjector<android.app.Fragment>> b;
    public final a<ProfileListViewModel> c;

    /* renamed from: a */
    public void injectMembers(ProfileListActivity profileListActivity) {
        profileListActivity.v = this.f6047a.get();
        profileListActivity.w = this.b.get();
        profileListActivity.x = this.c.get();
    }

    public static void a(ProfileListActivity profileListActivity, ProfileListViewModel profileListViewModel) {
        profileListActivity.x = profileListViewModel;
    }
}
