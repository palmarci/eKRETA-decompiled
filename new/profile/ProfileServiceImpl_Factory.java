package hu.ekreta.ellenorzo.profile;

import hu.ekreta.ellenorzo.rest.EAdminApi;
import hu.ekreta.ellenorzo.rest.MobileApiV3;
import i.d.c;
import l.a.a;

public final class ProfileServiceImpl_Factory implements c<ProfileServiceImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<MobileApiV3> f6030a;
    public final a<EAdminApi> b;

    public ProfileServiceImpl_Factory(a<MobileApiV3> aVar, a<EAdminApi> aVar2) {
        this.f6030a = aVar;
        this.b = aVar2;
    }

    public ProfileServiceImpl get() {
        return new ProfileServiceImpl(this.f6030a.get(), this.b.get());
    }
}
