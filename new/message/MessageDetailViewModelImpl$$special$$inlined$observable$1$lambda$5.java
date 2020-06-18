package hu.ekreta.ellenorzo.message;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "Lhu/ekreta/ellenorzo/message/Message;", "kotlin.jvm.PlatformType", "invoke", "hu/ekreta/ellenorzo/message/MessageDetailViewModelImpl$message$2$1$5", "hu/ekreta/ellenorzo/message/MessageDetailViewModelImpl$$special$$inlined$also$lambda$5"}, k = 3, mv = {1, 1, 15})
/* compiled from: MessageDetailViewModelImpl.kt */
public final class MessageDetailViewModelImpl$$special$$inlined$observable$1$lambda$5 extends Lambda implements Function1<Message, Unit> {
    public final /* synthetic */ MessageDetailViewModelImpl$$special$$inlined$observable$1 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessageDetailViewModelImpl$$special$$inlined$observable$1$lambda$5(MessageDetailViewModelImpl$$special$$inlined$observable$1 messageDetailViewModelImpl$$special$$inlined$observable$1) {
        super(1);
        this.c = messageDetailViewModelImpl$$special$$inlined$observable$1;
    }

    public final void a(Message message) {
        MessageDetailViewModelImpl messageDetailViewModelImpl = this.c.c;
        Intrinsics.checkExpressionValueIsNotNull(message, "it");
        messageDetailViewModelImpl.e(message);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Message) obj);
        return Unit.INSTANCE;
    }
}
