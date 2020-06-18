package hu.ekreta.ellenorzo.message;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.rambler.libs.swipe_layout.SwipeLayout;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lhu/ekreta/ellenorzo/message/MessageSwipeListener;", "Lru/rambler/libs/swipe_layout/SwipeLayout$OnSwipeListener;", "messagesViewModel", "Lhu/ekreta/ellenorzo/message/MessagesViewModel;", "message", "Lhu/ekreta/ellenorzo/message/Message;", "(Lhu/ekreta/ellenorzo/message/MessagesViewModel;Lhu/ekreta/ellenorzo/message/Message;)V", "getMessage", "()Lhu/ekreta/ellenorzo/message/Message;", "getMessagesViewModel", "()Lhu/ekreta/ellenorzo/message/MessagesViewModel;", "onBeginSwipe", "", "swipeLayout", "Lru/rambler/libs/swipe_layout/SwipeLayout;", "moveToRight", "", "onLeftStickyEdge", "onRightStickyEdge", "onSwipeClampReached", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: MessageSwipeListener.kt */
public final class MessageSwipeListener implements SwipeLayout.c {

    /* renamed from: a  reason: collision with root package name */
    public final MessagesViewModel f5805a;
    public final Message b;

    public void a(SwipeLayout swipeLayout, boolean z) {
        Intrinsics.checkParameterIsNotNull(swipeLayout, "swipeLayout");
    }

    public void b(SwipeLayout swipeLayout, boolean z) {
        Intrinsics.checkParameterIsNotNull(swipeLayout, "swipeLayout");
    }

    public void c(SwipeLayout swipeLayout, boolean z) {
        Intrinsics.checkParameterIsNotNull(swipeLayout, "swipeLayout");
        if (z) {
            this.f5805a.b(this.b);
        } else {
            this.f5805a.a(this.b);
        }
    }

    public void d(SwipeLayout swipeLayout, boolean z) {
        Intrinsics.checkParameterIsNotNull(swipeLayout, "swipeLayout");
    }
}
