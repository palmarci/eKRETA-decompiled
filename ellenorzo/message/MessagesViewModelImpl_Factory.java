package p289hu.ekreta.ellenorzo.message;

import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.message.MessagesViewModelImpl_Factory */
public final class MessagesViewModelImpl_Factory implements C4463c<MessagesViewModelImpl> {

    /* renamed from: a */
    public final C5431a<ObservableImpl> f13955a;

    /* renamed from: b */
    public final C5431a<ExecuteOnceUiCommandSource> f13956b;

    /* renamed from: c */
    public final C5431a<AuthenticationService> f13957c;

    /* renamed from: d */
    public final C5431a<ProfileRepository> f13958d;

    /* renamed from: e */
    public final C5431a<MessageRepository> f13959e;

    /* renamed from: f */
    public final C5431a<MessagesService> f13960f;

    public MessagesViewModelImpl_Factory(C5431a<ObservableImpl> aVar, C5431a<ExecuteOnceUiCommandSource> aVar2, C5431a<AuthenticationService> aVar3, C5431a<ProfileRepository> aVar4, C5431a<MessageRepository> aVar5, C5431a<MessagesService> aVar6) {
        this.f13955a = aVar;
        this.f13956b = aVar2;
        this.f13957c = aVar3;
        this.f13958d = aVar4;
        this.f13959e = aVar5;
        this.f13960f = aVar6;
    }

    public MessagesViewModelImpl get() {
        MessagesViewModelImpl messagesViewModelImpl = new MessagesViewModelImpl((ObservableImpl) this.f13955a.get(), (ExecuteOnceUiCommandSource) this.f13956b.get(), (AuthenticationService) this.f13957c.get(), (ProfileRepository) this.f13958d.get(), (MessageRepository) this.f13959e.get(), (MessagesService) this.f13960f.get());
        return messagesViewModelImpl;
    }
}
