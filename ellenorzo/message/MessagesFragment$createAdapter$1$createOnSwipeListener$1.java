package p289hu.ekreta.ellenorzo.message;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, mo17463d2 = {"<anonymous>", "", "p1", "Lhu/ekreta/ellenorzo/message/Message;", "Lkotlin/ParameterName;", "name", "message", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.message.MessagesFragment$createAdapter$1$createOnSwipeListener$1 */
/* compiled from: MessagesFragment.kt */
public final /* synthetic */ class MessagesFragment$createAdapter$1$createOnSwipeListener$1 extends FunctionReference implements Function1<Message, Unit> {
    public MessagesFragment$createAdapter$1$createOnSwipeListener$1(MessagesViewModel messagesViewModel) {
        super(1, messagesViewModel);
    }

    /* renamed from: a */
    public final void mo13436a(Message message) {
        Intrinsics.checkParameterIsNotNull(message, "p1");
        ((MessagesViewModel) this.receiver).mo13446b(message);
    }

    public final String getName() {
        return "updateMessageItemReadStateToOpposite";
    }

    public final KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(MessagesViewModel.class);
    }

    public final String getSignature() {
        return "updateMessageItemReadStateToOpposite(Lhu/ekreta/ellenorzo/message/Message;)V";
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo13436a((Message) obj);
        return Unit.INSTANCE;
    }
}
