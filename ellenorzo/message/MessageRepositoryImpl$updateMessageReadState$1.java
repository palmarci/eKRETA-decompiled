package p289hu.ekreta.ellenorzo.message;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;
import p353m.C5456h0;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/message/Message;", "it", "Lokhttp3/ResponseBody;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.message.MessageRepositoryImpl$updateMessageReadState$1 */
/* compiled from: MessageRepositoryImpl.kt */
public final class MessageRepositoryImpl$updateMessageReadState$1<T, R> implements C4675h<T, C5030q<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ MessageRepositoryImpl f13906c;

    /* renamed from: e */
    public final /* synthetic */ Message f13907e;

    public MessageRepositoryImpl$updateMessageReadState$1(MessageRepositoryImpl messageRepositoryImpl, Message message) {
        this.f13906c = messageRepositoryImpl;
        this.f13907e = message;
    }

    /* renamed from: a */
    public final C5027n<Message> apply(C5456h0 h0Var) {
        Intrinsics.checkParameterIsNotNull(h0Var, "it");
        return this.f13906c.mo13408a(this.f13907e);
    }
}
