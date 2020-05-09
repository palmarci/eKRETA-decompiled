package p289hu.ekreta.ellenorzo.institute;

import p289hu.ekreta.ellenorzo.rest.GlobalMobileApi;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.institute.InstituteRepositoryImpl_Factory */
public final class InstituteRepositoryImpl_Factory implements C4463c<InstituteRepositoryImpl> {

    /* renamed from: a */
    public final C5431a<GlobalMobileApi> f13615a;

    /* renamed from: b */
    public final C5431a<String> f13616b;

    public InstituteRepositoryImpl_Factory(C5431a<GlobalMobileApi> aVar, C5431a<String> aVar2) {
        this.f13615a = aVar;
        this.f13616b = aVar2;
    }

    public InstituteRepositoryImpl get() {
        return new InstituteRepositoryImpl((GlobalMobileApi) this.f13615a.get(), (String) this.f13616b.get());
    }
}
