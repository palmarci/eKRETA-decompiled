package p289hu.ekreta.ellenorzo.newmessage.viewmodel;

import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.newmessage.view.NewMessageActivity;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.newmessage.viewmodel.NewMessagesModule_ProvideViewModelFactory */
public final class NewMessagesModule_ProvideViewModelFactory implements C4463c<NewMessageViewModel> {

    /* renamed from: a */
    public final NewMessagesModule f14040a;

    /* renamed from: b */
    public final C5431a<NewMessageActivity> f14041b;

    /* renamed from: c */
    public final C5431a<NewMessageViewModelImpl> f14042c;

    public NewMessagesModule_ProvideViewModelFactory(NewMessagesModule newMessagesModule, C5431a<NewMessageActivity> aVar, C5431a<NewMessageViewModelImpl> aVar2) {
        this.f14040a = newMessagesModule;
        this.f14041b = aVar;
        this.f14042c = aVar2;
    }

    public NewMessageViewModel get() {
        NewMessageViewModel a = this.f14040a.mo13552a((NewMessageActivity) this.f14041b.get(), this.f14042c);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
