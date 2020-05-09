package p289hu.ekreta.ellenorzo.cases.tmgi;

import p289hu.ekreta.ellenorzo.rest.EAdminApi;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.cases.tmgi.TmgiRepositoryImpl_Factory */
public final class TmgiRepositoryImpl_Factory implements C4463c<TmgiRepositoryImpl> {

    /* renamed from: a */
    public final C5431a<EAdminApi> f11786a;

    public TmgiRepositoryImpl_Factory(C5431a<EAdminApi> aVar) {
        this.f11786a = aVar;
    }

    public TmgiRepositoryImpl get() {
        return new TmgiRepositoryImpl((EAdminApi) this.f11786a.get());
    }
}
