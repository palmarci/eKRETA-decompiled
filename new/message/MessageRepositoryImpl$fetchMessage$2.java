package hu.ekreta.ellenorzo.message;

import k.b.b0.h;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/message/Message;", "it", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: MessageRepositoryImpl.kt */
public final class MessageRepositoryImpl$fetchMessage$2<T, R> implements h<T, q<? extends R>> {
    public final /* synthetic */ MessageRepositoryImpl c;

    public MessageRepositoryImpl$fetchMessage$2(MessageRepositoryImpl messageRepositoryImpl) {
        this.c = messageRepositoryImpl;
    }

    /* renamed from: a */
    public final n<Message> apply(Message message) {
        Intrinsics.checkParameterIsNotNull(message, "it");
        return this.c.b().a(message);
    }
}
