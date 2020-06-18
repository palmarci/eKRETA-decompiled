package hu.ekreta.ellenorzo.cases.subModelRepositories;

import hu.ekreta.ellenorzo.rest.EAdminApi;
import i.d.c;
import l.a.a;

public final class TmgiCaseTypeRepositoryImpl_Factory implements c<TmgiCaseTypeRepositoryImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<EAdminApi> f5159a;

    public TmgiCaseTypeRepositoryImpl_Factory(a<EAdminApi> aVar) {
        this.f5159a = aVar;
    }

    public TmgiCaseTypeRepositoryImpl get() {
        return new TmgiCaseTypeRepositoryImpl(this.f5159a.get());
    }
}
