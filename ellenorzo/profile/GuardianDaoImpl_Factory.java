package p289hu.ekreta.ellenorzo.profile;

import p292i.p295d.C4463c;
import p300k.p340c.C5061c0;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.profile.GuardianDaoImpl_Factory */
public final class GuardianDaoImpl_Factory implements C4463c<GuardianDaoImpl> {

    /* renamed from: a */
    public final C5431a<C5061c0> f14459a;

    public GuardianDaoImpl_Factory(C5431a<C5061c0> aVar) {
        this.f14459a = aVar;
    }

    public GuardianDaoImpl get() {
        return new GuardianDaoImpl((C5061c0) this.f14459a.get());
    }
}
