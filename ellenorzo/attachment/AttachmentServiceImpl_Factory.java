package p289hu.ekreta.ellenorzo.attachment;

import p289hu.ekreta.ellenorzo.file.FileAdapter;
import p289hu.ekreta.ellenorzo.rest.EAdminApi;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.attachment.AttachmentServiceImpl_Factory */
public final class AttachmentServiceImpl_Factory implements C4463c<AttachmentServiceImpl> {

    /* renamed from: a */
    public final C5431a<FileAdapter> f11154a;

    /* renamed from: b */
    public final C5431a<EAdminApi> f11155b;

    public AttachmentServiceImpl_Factory(C5431a<FileAdapter> aVar, C5431a<EAdminApi> aVar2) {
        this.f11154a = aVar;
        this.f11155b = aVar2;
    }

    public AttachmentServiceImpl get() {
        return new AttachmentServiceImpl((FileAdapter) this.f11154a.get(), (EAdminApi) this.f11155b.get());
    }
}
