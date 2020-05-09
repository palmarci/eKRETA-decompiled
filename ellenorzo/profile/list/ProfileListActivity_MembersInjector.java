package p289hu.ekreta.ellenorzo.profile.list;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.profile.list.ProfileListActivity_MembersInjector */
public final class ProfileListActivity_MembersInjector implements C4447b<ProfileListActivity> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f14611a;

    /* renamed from: b */
    public final C5431a<DispatchingAndroidInjector<android.app.Fragment>> f14612b;

    /* renamed from: c */
    public final C5431a<ProfileListViewModel> f14613c;

    /* renamed from: a */
    public void injectMembers(ProfileListActivity profileListActivity) {
        profileListActivity.f15496v = (DispatchingAndroidInjector) this.f14611a.get();
        profileListActivity.f15497w = (DispatchingAndroidInjector) this.f14612b.get();
        profileListActivity.f14600x = (ProfileListViewModel) this.f14613c.get();
    }

    /* renamed from: a */
    public static void m13922a(ProfileListActivity profileListActivity, ProfileListViewModel profileListViewModel) {
        profileListActivity.f14600x = profileListViewModel;
    }
}
