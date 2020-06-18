package hu.ekreta.ellenorzo.message;

import h.w.v;
import i.d.c;
import l.a.a;

public final class MessageDetailActivityModule_ProvideViewModelFactory implements c<MessageDetailViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final MessageDetailActivityModule f5782a;
    public final a<MessageDetailActivity> b;
    public final a<MessageDetailViewModelImpl> c;

    public MessageDetailActivityModule_ProvideViewModelFactory(MessageDetailActivityModule messageDetailActivityModule, a<MessageDetailActivity> aVar, a<MessageDetailViewModelImpl> aVar2) {
        this.f5782a = messageDetailActivityModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public MessageDetailViewModel get() {
        MessageDetailViewModel a2 = this.f5782a.a(this.b.get(), this.c);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
