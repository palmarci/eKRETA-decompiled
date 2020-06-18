package hu.ekreta.ellenorzo.profile.detail;

import h.w.v;
import i.d.c;
import l.a.a;

public final class ProfileDetailActivityModule_ProvideViewModelFactory implements c<ProfileDetailViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final ProfileDetailActivityModule f6035a;
    public final a<ProfileDetailActivity> b;
    public final a<ProfileDetailViewModelImpl> c;

    public ProfileDetailActivityModule_ProvideViewModelFactory(ProfileDetailActivityModule profileDetailActivityModule, a<ProfileDetailActivity> aVar, a<ProfileDetailViewModelImpl> aVar2) {
        this.f6035a = profileDetailActivityModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public ProfileDetailViewModel get() {
        ProfileDetailViewModel a2 = this.f6035a.a(this.b.get(), this.c);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
