package p289hu.ekreta.ellenorzo.profile.list;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.profile.list.ProfileListActivityModule_ProvideViewModelFactory */
public final class ProfileListActivityModule_ProvideViewModelFactory implements C4463c<ProfileListViewModel> {

    /* renamed from: a */
    public final ProfileListActivityModule f14608a;

    /* renamed from: b */
    public final C5431a<ProfileListActivity> f14609b;

    /* renamed from: c */
    public final C5431a<ProfileListViewModelImpl> f14610c;

    public ProfileListActivityModule_ProvideViewModelFactory(ProfileListActivityModule profileListActivityModule, C5431a<ProfileListActivity> aVar, C5431a<ProfileListViewModelImpl> aVar2) {
        this.f14608a = profileListActivityModule;
        this.f14609b = aVar;
        this.f14610c = aVar2;
    }

    public ProfileListViewModel get() {
        ProfileListViewModel a = this.f14608a.mo14253a((ProfileListActivity) this.f14609b.get(), this.f14610c);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
