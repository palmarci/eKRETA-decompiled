package hu.ekreta.ellenorzo.institute;

import hu.ekreta.ellenorzo.rest.GlobalMobileApi;
import i.d.c;
import l.a.a;

public final class InstituteRepositoryImpl_Factory implements c<InstituteRepositoryImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<GlobalMobileApi> f5709a;
    public final a<String> b;

    public InstituteRepositoryImpl_Factory(a<GlobalMobileApi> aVar, a<String> aVar2) {
        this.f5709a = aVar;
        this.b = aVar2;
    }

    public InstituteRepositoryImpl get() {
        return new InstituteRepositoryImpl(this.f5709a.get(), this.b.get());
    }
}
