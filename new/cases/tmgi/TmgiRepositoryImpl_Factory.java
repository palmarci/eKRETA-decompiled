package hu.ekreta.ellenorzo.cases.tmgi;

import hu.ekreta.ellenorzo.rest.EAdminApi;
import i.d.c;
import l.a.a;

public final class TmgiRepositoryImpl_Factory implements c<TmgiRepositoryImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<EAdminApi> f5263a;

    public TmgiRepositoryImpl_Factory(a<EAdminApi> aVar) {
        this.f5263a = aVar;
    }

    public TmgiRepositoryImpl get() {
        return new TmgiRepositoryImpl(this.f5263a.get());
    }
}
