package hu.ekreta.ellenorzo.group;

import i.d.c;
import k.c.c0;
import l.a.a;

public final class GroupDaoImpl_Factory implements c<GroupDaoImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<c0> f5609a;

    public GroupDaoImpl_Factory(a<c0> aVar) {
        this.f5609a = aVar;
    }

    public GroupDaoImpl get() {
        return new GroupDaoImpl(this.f5609a.get());
    }
}
