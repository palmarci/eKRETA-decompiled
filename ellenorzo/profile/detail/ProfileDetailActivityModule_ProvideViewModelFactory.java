package p289hu.ekreta.ellenorzo.profile.detail;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.profile.detail.ProfileDetailActivityModule_ProvideViewModelFactory */
public final class ProfileDetailActivityModule_ProvideViewModelFactory implements C4463c<ProfileDetailViewModel> {

    /* renamed from: a */
    public final ProfileDetailActivityModule f14572a;

    /* renamed from: b */
    public final C5431a<ProfileDetailActivity> f14573b;

    /* renamed from: c */
    public final C5431a<ProfileDetailViewModelImpl> f14574c;

    public ProfileDetailActivityModule_ProvideViewModelFactory(ProfileDetailActivityModule profileDetailActivityModule, C5431a<ProfileDetailActivity> aVar, C5431a<ProfileDetailViewModelImpl> aVar2) {
        this.f14572a = profileDetailActivityModule;
        this.f14573b = aVar;
        this.f14574c = aVar2;
    }

    public ProfileDetailViewModel get() {
        ProfileDetailViewModel a = this.f14572a.mo14221a((ProfileDetailActivity) this.f14573b.get(), this.f14574c);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
