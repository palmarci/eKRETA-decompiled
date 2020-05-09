package p289hu.ekreta.ellenorzo.message;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "", "it", "Lhu/ekreta/ellenorzo/message/Addressee;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.message.Message$addresseeNames$1 */
/* compiled from: Message.kt */
public final class Message$addresseeNames$1 extends Lambda implements Function1<Addressee, String> {
    public static final Message$addresseeNames$1 INSTANCE = new Message$addresseeNames$1();

    public Message$addresseeNames$1() {
        super(1);
    }

    /* renamed from: a */
    public final String invoke(Addressee addressee) {
        Intrinsics.checkParameterIsNotNull(addressee, "it");
        StringBuilder sb = new StringBuilder();
        sb.append(addressee.mo13235h());
        sb.append(" (");
        sb.append(addressee.mo13240l());
        sb.append(')');
        return sb.toString();
    }
}
