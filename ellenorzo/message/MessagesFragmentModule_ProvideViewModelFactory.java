package p289hu.ekreta.ellenorzo.message;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.message.MessagesFragmentModule_ProvideViewModelFactory */
public final class MessagesFragmentModule_ProvideViewModelFactory implements C4463c<MessagesViewModel> {

    /* renamed from: a */
    public final MessagesFragmentModule f13925a;

    /* renamed from: b */
    public final C5431a<MessagesFragment> f13926b;

    /* renamed from: c */
    public final C5431a<MessagesViewModelImpl> f13927c;

    public MessagesFragmentModule_ProvideViewModelFactory(MessagesFragmentModule messagesFragmentModule, C5431a<MessagesFragment> aVar, C5431a<MessagesViewModelImpl> aVar2) {
        this.f13925a = messagesFragmentModule;
        this.f13926b = aVar;
        this.f13927c = aVar2;
    }

    public MessagesViewModel get() {
        MessagesViewModel a = this.f13925a.mo13440a((MessagesFragment) this.f13926b.get(), this.f13927c);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
