package p289hu.ekreta.ellenorzo.message;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "", "it", "", "Lhu/ekreta/ellenorzo/message/Message;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.message.MessageRepositoryImpl$getUnreadMessagesCount$1 */
/* compiled from: MessageRepositoryImpl.kt */
public final class MessageRepositoryImpl$getUnreadMessagesCount$1<T, R> implements C4675h<T, R> {
    public static final MessageRepositoryImpl$getUnreadMessagesCount$1 INSTANCE = new MessageRepositoryImpl$getUnreadMessagesCount$1();

    /* renamed from: a */
    public final int mo13419a(List<Message> list) {
        Intrinsics.checkParameterIsNotNull(list, "it");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            Message message = (Message) next;
            boolean z = false;
            if (Intrinsics.areEqual((Object) message.mo13290q(), (Object) Boolean.valueOf(false)) && Intrinsics.areEqual((Object) message.mo13291r(), (Object) "BEERKEZETT") && !message.mo13299x()) {
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return arrayList.size();
    }

    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        return Integer.valueOf(mo13419a((List) obj));
    }
}
