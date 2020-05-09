package p289hu.ekreta.ellenorzo.profile;

import p289hu.ekreta.ellenorzo.rest.EAdminApi;
import p289hu.ekreta.ellenorzo.rest.MobileApiV3;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.profile.ProfileServiceImpl_Factory */
public final class ProfileServiceImpl_Factory implements C4463c<ProfileServiceImpl> {

    /* renamed from: a */
    public final C5431a<MobileApiV3> f14542a;

    /* renamed from: b */
    public final C5431a<EAdminApi> f14543b;

    public ProfileServiceImpl_Factory(C5431a<MobileApiV3> aVar, C5431a<EAdminApi> aVar2) {
        this.f14542a = aVar;
        this.f14543b = aVar2;
    }

    public ProfileServiceImpl get() {
        return new ProfileServiceImpl((MobileApiV3) this.f14542a.get(), (EAdminApi) this.f14543b.get());
    }
}
