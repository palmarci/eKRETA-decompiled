package p289hu.ekreta.ellenorzo.message;

import p289hu.ekreta.ellenorzo.attachment.AttachmentService;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.message.MessageDetailViewModelImpl_Factory */
public final class MessageDetailViewModelImpl_Factory implements C4463c<MessageDetailViewModelImpl> {

    /* renamed from: a */
    public final C5431a<ObservableImpl> f13863a;

    /* renamed from: b */
    public final C5431a<ExecuteOnceUiCommandSource> f13864b;

    /* renamed from: c */
    public final C5431a<AuthenticationService> f13865c;

    /* renamed from: d */
    public final C5431a<AttachmentService> f13866d;

    /* renamed from: e */
    public final C5431a<MessageRepository> f13867e;

    /* renamed from: f */
    public final C5431a<ProfileRepository> f13868f;

    public MessageDetailViewModelImpl_Factory(C5431a<ObservableImpl> aVar, C5431a<ExecuteOnceUiCommandSource> aVar2, C5431a<AuthenticationService> aVar3, C5431a<AttachmentService> aVar4, C5431a<MessageRepository> aVar5, C5431a<ProfileRepository> aVar6) {
        this.f13863a = aVar;
        this.f13864b = aVar2;
        this.f13865c = aVar3;
        this.f13866d = aVar4;
        this.f13867e = aVar5;
        this.f13868f = aVar6;
    }

    public MessageDetailViewModelImpl get() {
        MessageDetailViewModelImpl messageDetailViewModelImpl = new MessageDetailViewModelImpl((ObservableImpl) this.f13863a.get(), (ExecuteOnceUiCommandSource) this.f13864b.get(), (AuthenticationService) this.f13865c.get(), (AttachmentService) this.f13866d.get(), (MessageRepository) this.f13867e.get(), (ProfileRepository) this.f13868f.get());
        return messageDetailViewModelImpl;
    }
}
