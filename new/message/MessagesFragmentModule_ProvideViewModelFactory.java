package hu.ekreta.ellenorzo.message;

import h.w.v;
import i.d.c;
import l.a.a;

public final class MessagesFragmentModule_ProvideViewModelFactory implements c<MessagesViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final MessagesFragmentModule f5806a;
    public final a<MessagesFragment> b;
    public final a<MessagesViewModelImpl> c;

    public MessagesFragmentModule_ProvideViewModelFactory(MessagesFragmentModule messagesFragmentModule, a<MessagesFragment> aVar, a<MessagesViewModelImpl> aVar2) {
        this.f5806a = messagesFragmentModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public MessagesViewModel get() {
        MessagesViewModel a2 = this.f5806a.a(this.b.get(), this.c);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
