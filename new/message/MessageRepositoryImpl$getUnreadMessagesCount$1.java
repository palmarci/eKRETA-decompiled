package hu.ekreta.ellenorzo.message;

import java.util.ArrayList;
import java.util.List;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lhu/ekreta/ellenorzo/message/Message;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: MessageRepositoryImpl.kt */
public final class MessageRepositoryImpl$getUnreadMessagesCount$1<T, R> implements h<T, R> {
    public static final MessageRepositoryImpl$getUnreadMessagesCount$1 INSTANCE = new MessageRepositoryImpl$getUnreadMessagesCount$1();

    public final int a(List<Message> list) {
        Intrinsics.checkParameterIsNotNull(list, "it");
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            Message message = (Message) next;
            boolean z = false;
            if (Intrinsics.areEqual((Object) message.q(), (Object) false) && Intrinsics.areEqual((Object) message.r(), (Object) "BEERKEZETT") && !message.x()) {
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return arrayList.size();
    }

    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        return Integer.valueOf(a((List) obj));
    }
}
