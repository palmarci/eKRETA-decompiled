package p289hu.ekreta.ellenorzo.profile;

import p292i.p295d.C4463c;
import p300k.p340c.C5061c0;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.profile.ProfileDaoImpl_Factory */
public final class ProfileDaoImpl_Factory implements C4463c<ProfileDaoImpl> {

    /* renamed from: a */
    public final C5431a<C5061c0> f14506a;

    public ProfileDaoImpl_Factory(C5431a<C5061c0> aVar) {
        this.f14506a = aVar;
    }

    public ProfileDaoImpl get() {
        return new ProfileDaoImpl((C5061c0) this.f14506a.get());
    }
}
