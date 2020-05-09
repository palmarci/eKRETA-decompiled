package p289hu.ekreta.ellenorzo.message;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "", "it", "Lhu/ekreta/ellenorzo/message/Message;", "kotlin.jvm.PlatformType", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.message.MessagesViewModelImpl$updateMessageItemReadStateToOpposite$2 */
/* compiled from: MessagesViewModelImpl.kt */
public final class MessagesViewModelImpl$updateMessageItemReadStateToOpposite$2 extends Lambda implements Function1<Message, Unit> {

    /* renamed from: c */
    public final /* synthetic */ MessagesViewModelImpl f13953c;

    public MessagesViewModelImpl$updateMessageItemReadStateToOpposite$2(MessagesViewModelImpl messagesViewModelImpl) {
        this.f13953c = messagesViewModelImpl;
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Message message = (Message) obj;
        invoke();
        return Unit.INSTANCE;
    }

    public final void invoke() {
        this.f13953c.mo13449k0().mo10529b(true);
        this.f13953c.mo16412M1().mo115b("Message item read property set to opposite successfully");
    }
}
