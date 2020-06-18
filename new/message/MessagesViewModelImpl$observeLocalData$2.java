package hu.ekreta.ellenorzo.message;

import k.b.b0.h;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/message/Message;", "messageList", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: MessagesViewModelImpl.kt */
public final class MessagesViewModelImpl$observeLocalData$2<T, R> implements h<T, R> {
    public final /* synthetic */ MessagesViewModelImpl c;

    public MessagesViewModelImpl$observeLocalData$2(MessagesViewModelImpl messagesViewModelImpl) {
        this.c = messagesViewModelImpl;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
        if (r2.x() == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        if (r2.x() == false) goto L_0x0049;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x000e A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<hu.ekreta.ellenorzo.message.Message> apply(java.util.List<hu.ekreta.ellenorzo.message.Message> r8) {
        /*
            r7 = this;
            java.lang.String r0 = "messageList"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x000e:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0050
            java.lang.Object r1 = r8.next()
            r2 = r1
            hu.ekreta.ellenorzo.message.Message r2 = (hu.ekreta.ellenorzo.message.Message) r2
            hu.ekreta.ellenorzo.message.MessagesViewModelImpl r3 = r7.c
            int r3 = r3.a2()
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x003b
            if (r3 == r5) goto L_0x002c
            boolean r4 = r2.x()
            goto L_0x004a
        L_0x002c:
            hu.ekreta.ellenorzo.message.Message$MessageType r3 = r2.t()
            hu.ekreta.ellenorzo.message.Message$MessageType r6 = hu.ekreta.ellenorzo.message.Message.MessageType.OUTGOING
            if (r3 != r6) goto L_0x004a
            boolean r2 = r2.x()
            if (r2 != 0) goto L_0x004a
            goto L_0x0049
        L_0x003b:
            hu.ekreta.ellenorzo.message.Message$MessageType r3 = r2.t()
            hu.ekreta.ellenorzo.message.Message$MessageType r6 = hu.ekreta.ellenorzo.message.Message.MessageType.INCOMING
            if (r3 != r6) goto L_0x004a
            boolean r2 = r2.x()
            if (r2 != 0) goto L_0x004a
        L_0x0049:
            r4 = 1
        L_0x004a:
            if (r4 == 0) goto L_0x000e
            r0.add(r1)
            goto L_0x000e
        L_0x0050:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.message.MessagesViewModelImpl$observeLocalData$2.apply(java.util.List):java.util.List");
    }
}
