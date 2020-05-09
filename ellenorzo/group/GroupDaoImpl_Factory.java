package p289hu.ekreta.ellenorzo.group;

import p292i.p295d.C4463c;
import p300k.p340c.C5061c0;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.group.GroupDaoImpl_Factory */
public final class GroupDaoImpl_Factory implements C4463c<GroupDaoImpl> {

    /* renamed from: a */
    public final C5431a<C5061c0> f13308a;

    public GroupDaoImpl_Factory(C5431a<C5061c0> aVar) {
        this.f13308a = aVar;
    }

    public GroupDaoImpl get() {
        return new GroupDaoImpl((C5061c0) this.f13308a.get());
    }
}
