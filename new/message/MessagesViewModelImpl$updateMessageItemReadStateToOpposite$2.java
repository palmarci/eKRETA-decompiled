package hu.ekreta.ellenorzo.message;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lhu/ekreta/ellenorzo/message/Message;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: MessagesViewModelImpl.kt */
public final class MessagesViewModelImpl$updateMessageItemReadStateToOpposite$2 extends Lambda implements Function1<Message, Unit> {
    public final /* synthetic */ MessagesViewModelImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessagesViewModelImpl$updateMessageItemReadStateToOpposite$2(MessagesViewModelImpl messagesViewModelImpl) {
        super(1);
        this.c = messagesViewModelImpl;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Message message = (Message) obj;
        invoke();
        return Unit.INSTANCE;
    }

    public final void invoke() {
        this.c.k0().c(true);
        this.c.V1().d("Message item read property set to opposite successfully");
    }
}
