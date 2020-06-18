package hu.ekreta.ellenorzo.message;

import k.b.b0.f;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 15})
/* compiled from: MessagesViewModelImpl.kt */
public final class MessagesViewModelImpl$observeLocalData$3<T> implements f<Throwable> {
    public final /* synthetic */ MessagesViewModelImpl c;

    public MessagesViewModelImpl$observeLocalData$3(MessagesViewModelImpl messagesViewModelImpl) {
        this.c = messagesViewModelImpl;
    }

    /* renamed from: a */
    public final void accept(Throwable th) {
        this.c.V1().d(th.getMessage());
    }
}
