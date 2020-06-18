package hu.ekreta.ellenorzo.newmessage.viewmodel;

import h.w.v;
import hu.ekreta.ellenorzo.newmessage.view.NewMessageActivity;
import i.d.c;
import l.a.a;

public final class NewMessagesModule_ProvideViewModelFactory implements c<NewMessageViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final NewMessagesModule f5842a;
    public final a<NewMessageActivity> b;
    public final a<NewMessageViewModelImpl> c;

    public NewMessagesModule_ProvideViewModelFactory(NewMessagesModule newMessagesModule, a<NewMessageActivity> aVar, a<NewMessageViewModelImpl> aVar2) {
        this.f5842a = newMessagesModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public NewMessageViewModel get() {
        NewMessageViewModel a2 = this.f5842a.a(this.b.get(), this.c);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
