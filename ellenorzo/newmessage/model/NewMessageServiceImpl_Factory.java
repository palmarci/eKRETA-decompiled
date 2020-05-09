package p289hu.ekreta.ellenorzo.newmessage.model;

import p289hu.ekreta.ellenorzo.rest.EAdminApi;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.newmessage.model.NewMessageServiceImpl_Factory */
public final class NewMessageServiceImpl_Factory implements C4463c<NewMessageServiceImpl> {

    /* renamed from: a */
    public final C5431a<EAdminApi> f13981a;

    public NewMessageServiceImpl_Factory(C5431a<EAdminApi> aVar) {
        this.f13981a = aVar;
    }

    public NewMessageServiceImpl get() {
        return new NewMessageServiceImpl((EAdminApi) this.f13981a.get());
    }
}
