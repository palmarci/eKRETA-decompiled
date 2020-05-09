package p289hu.ekreta.ellenorzo.message;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo17463d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Integer;)V"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.message.MessagesFragment$createTabSelectedListener$1 */
/* compiled from: MessagesFragment.kt */
public final class MessagesFragment$createTabSelectedListener$1 extends Lambda implements Function1<Integer, Unit> {

    /* renamed from: c */
    public final /* synthetic */ MessagesFragment f13924c;

    public MessagesFragment$createTabSelectedListener$1(MessagesFragment messagesFragment) {
        this.f13924c = messagesFragment;
        super(1);
    }

    /* renamed from: a */
    public final void mo13439a(Integer num) {
        this.f13924c.mo13428C0().mo13444a(num != null ? num.intValue() : 0);
        this.f13924c.mo13428C0().mo11495e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo13439a((Integer) obj);
        return Unit.INSTANCE;
    }
}
