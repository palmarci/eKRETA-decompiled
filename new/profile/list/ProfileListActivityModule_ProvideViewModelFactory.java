package hu.ekreta.ellenorzo.profile.list;

import h.w.v;
import i.d.c;
import l.a.a;

public final class ProfileListActivityModule_ProvideViewModelFactory implements c<ProfileListViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final ProfileListActivityModule f6046a;
    public final a<ProfileListActivity> b;
    public final a<ProfileListViewModelImpl> c;

    public ProfileListActivityModule_ProvideViewModelFactory(ProfileListActivityModule profileListActivityModule, a<ProfileListActivity> aVar, a<ProfileListViewModelImpl> aVar2) {
        this.f6046a = profileListActivityModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public ProfileListViewModel get() {
        ProfileListViewModel a2 = this.f6046a.a(this.b.get(), this.c);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
