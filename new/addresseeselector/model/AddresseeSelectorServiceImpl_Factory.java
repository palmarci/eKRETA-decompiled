package hu.ekreta.ellenorzo.addresseeselector.model;

import hu.ekreta.ellenorzo.rest.EAdminApi;
import i.d.c;
import l.a.a;

public final class AddresseeSelectorServiceImpl_Factory implements c<AddresseeSelectorServiceImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<EAdminApi> f4972a;

    public AddresseeSelectorServiceImpl_Factory(a<EAdminApi> aVar) {
        this.f4972a = aVar;
    }

    public AddresseeSelectorServiceImpl get() {
        return new AddresseeSelectorServiceImpl(this.f4972a.get());
    }
}
