package hu.ekreta.ellenorzo.message;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 1, 15})
/* compiled from: MessagesFragment.kt */
public final class MessagesFragment$createTabSelectedListener$1 extends Lambda implements Function1<Integer, Unit> {
    public final /* synthetic */ MessagesFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessagesFragment$createTabSelectedListener$1(MessagesFragment messagesFragment) {
        super(1);
        this.c = messagesFragment;
    }

    public final void a(Integer num) {
        this.c.C0().a(num != null ? num.intValue() : 0);
        this.c.C0().e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Integer) obj);
        return Unit.INSTANCE;
    }
}
