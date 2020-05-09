package p289hu.ekreta.ellenorzo.message;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, mo17463d2 = {"<anonymous>", "", "it", "Lhu/ekreta/ellenorzo/message/Message;", "kotlin.jvm.PlatformType", "invoke", "hu/ekreta/ellenorzo/message/MessageDetailViewModelImpl$message$2$1$5", "hu/ekreta/ellenorzo/message/MessageDetailViewModelImpl$$special$$inlined$also$lambda$5"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.message.MessageDetailViewModelImpl$$special$$inlined$observable$1$lambda$5 */
/* compiled from: MessageDetailViewModelImpl.kt */
public final class C4258x8dfe5c66 extends Lambda implements Function1<Message, Unit> {

    /* renamed from: c */
    public final /* synthetic */ MessageDetailViewModelImpl$$special$$inlined$observable$1 f13855c;

    public C4258x8dfe5c66(MessageDetailViewModelImpl$$special$$inlined$observable$1 messageDetailViewModelImpl$$special$$inlined$observable$1) {
        this.f13855c = messageDetailViewModelImpl$$special$$inlined$observable$1;
        super(1);
    }

    /* renamed from: a */
    public final void mo13340a(Message message) {
        MessageDetailViewModelImpl messageDetailViewModelImpl = this.f13855c.f13847c;
        Intrinsics.checkExpressionValueIsNotNull(message, "it");
        messageDetailViewModelImpl.mo13329e(message);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo13340a((Message) obj);
        return Unit.INSTANCE;
    }
}
