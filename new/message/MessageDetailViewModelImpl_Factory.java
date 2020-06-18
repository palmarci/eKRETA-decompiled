package hu.ekreta.ellenorzo.message;

import hu.ekreta.ellenorzo.attachment.AttachmentService;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import i.d.c;
import l.a.a;

public final class MessageDetailViewModelImpl_Factory implements c<MessageDetailViewModelImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<ObservableImpl> f5788a;
    public final a<ExecuteOnceUiCommandSource> b;
    public final a<SystemExit> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<AuthenticationService> f5789d;
    public final a<AttachmentService> e;
    public final a<MessageRepository> f;

    /* renamed from: g  reason: collision with root package name */
    public final a<ProfileRepository> f5790g;

    public MessageDetailViewModelImpl_Factory(a<ObservableImpl> aVar, a<ExecuteOnceUiCommandSource> aVar2, a<SystemExit> aVar3, a<AuthenticationService> aVar4, a<AttachmentService> aVar5, a<MessageRepository> aVar6, a<ProfileRepository> aVar7) {
        this.f5788a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f5789d = aVar4;
        this.e = aVar5;
        this.f = aVar6;
        this.f5790g = aVar7;
    }

    public MessageDetailViewModelImpl get() {
        return new MessageDetailViewModelImpl(this.f5788a.get(), this.b.get(), this.c.get(), this.f5789d.get(), this.e.get(), this.f.get(), this.f5790g.get());
    }
}
