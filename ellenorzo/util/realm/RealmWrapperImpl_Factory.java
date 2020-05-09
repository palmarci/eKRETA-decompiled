package p289hu.ekreta.ellenorzo.util.realm;

import p292i.p295d.C4463c;
import p300k.p340c.C5061c0;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.util.realm.RealmWrapperImpl_Factory */
public final class RealmWrapperImpl_Factory implements C4463c<RealmWrapperImpl> {

    /* renamed from: a */
    public final C5431a<C5061c0> f15433a;

    public RealmWrapperImpl_Factory(C5431a<C5061c0> aVar) {
        this.f15433a = aVar;
    }

    public RealmWrapperImpl get() {
        return new RealmWrapperImpl((C5061c0) this.f15433a.get());
    }
}
