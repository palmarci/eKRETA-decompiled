package hu.ekreta.ellenorzo.message;

import k.b.b0.h;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m.h0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/message/Message;", "it", "Lokhttp3/ResponseBody;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: MessageRepositoryImpl.kt */
public final class MessageRepositoryImpl$deleteMessagePermanently$1<T, R> implements h<T, q<? extends R>> {
    public final /* synthetic */ MessageRepositoryImpl c;
    public final /* synthetic */ Message e;

    public MessageRepositoryImpl$deleteMessagePermanently$1(MessageRepositoryImpl messageRepositoryImpl, Message message) {
        this.c = messageRepositoryImpl;
        this.e = message;
    }

    /* renamed from: a */
    public final n<Message> apply(h0 h0Var) {
        Intrinsics.checkParameterIsNotNull(h0Var, "it");
        return this.c.f5802a.a(this.e);
    }
}
