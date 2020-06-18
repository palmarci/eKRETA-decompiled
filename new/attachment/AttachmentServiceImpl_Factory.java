package hu.ekreta.ellenorzo.attachment;

import hu.ekreta.ellenorzo.file.FileAdapter;
import hu.ekreta.ellenorzo.rest.EAdminApi;
import i.d.c;
import l.a.a;

public final class AttachmentServiceImpl_Factory implements c<AttachmentServiceImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<FileAdapter> f5045a;
    public final a<EAdminApi> b;

    public AttachmentServiceImpl_Factory(a<FileAdapter> aVar, a<EAdminApi> aVar2) {
        this.f5045a = aVar;
        this.b = aVar2;
    }

    public AttachmentServiceImpl get() {
        return new AttachmentServiceImpl(this.f5045a.get(), this.b.get());
    }
}
