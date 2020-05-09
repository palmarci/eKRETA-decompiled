package p289hu.ekreta.ellenorzo.message;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/message/Message;", "messageList", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.message.MessagesViewModelImpl$observeLocalData$1 */
/* compiled from: MessagesViewModelImpl.kt */
public final class MessagesViewModelImpl$observeLocalData$1<T, R> implements C4675h<T, R> {
    public static final MessagesViewModelImpl$observeLocalData$1 INSTANCE = new MessagesViewModelImpl$observeLocalData$1();

    /* renamed from: a */
    public final List<Message> apply(List<Message> list) {
        Intrinsics.checkParameterIsNotNull(list, "messageList");
        return CollectionsKt___CollectionsKt.sortedWith(list, new C4267xec357bb9());
    }
}
