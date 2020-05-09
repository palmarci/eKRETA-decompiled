package p289hu.ekreta.ellenorzo.message;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.message.MessageDetailActivityModule_ProvideViewModelFactory */
public final class MessageDetailActivityModule_ProvideViewModelFactory implements C4463c<MessageDetailViewModel> {

    /* renamed from: a */
    public final MessageDetailActivityModule f13826a;

    /* renamed from: b */
    public final C5431a<MessageDetailActivity> f13827b;

    /* renamed from: c */
    public final C5431a<MessageDetailViewModelImpl> f13828c;

    public MessageDetailActivityModule_ProvideViewModelFactory(MessageDetailActivityModule messageDetailActivityModule, C5431a<MessageDetailActivity> aVar, C5431a<MessageDetailViewModelImpl> aVar2) {
        this.f13826a = messageDetailActivityModule;
        this.f13827b = aVar;
        this.f13828c = aVar2;
    }

    public MessageDetailViewModel get() {
        MessageDetailViewModel a = this.f13826a.mo13315a((MessageDetailActivity) this.f13827b.get(), this.f13828c);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
