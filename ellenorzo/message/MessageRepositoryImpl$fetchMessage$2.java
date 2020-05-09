package p289hu.ekreta.ellenorzo.message;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/message/Message;", "it", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.message.MessageRepositoryImpl$fetchMessage$2 */
/* compiled from: MessageRepositoryImpl.kt */
public final class MessageRepositoryImpl$fetchMessage$2<T, R> implements C4675h<T, C5030q<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ MessageRepositoryImpl f13898c;

    public MessageRepositoryImpl$fetchMessage$2(MessageRepositoryImpl messageRepositoryImpl) {
        this.f13898c = messageRepositoryImpl;
    }

    /* renamed from: a */
    public final C5027n<Message> apply(Message message) {
        Intrinsics.checkParameterIsNotNull(message, "it");
        return this.f13898c.mo13409b().mo16319a(message);
    }
}
