package hu.ekreta.ellenorzo.message;

import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import k.b.b0.h;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/message/Message;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: MessagesViewModelImpl.kt */
public final class MessagesViewModelImpl$deleteMessage$1<T, R> implements h<T, q<? extends R>> {
    public final /* synthetic */ MessagesViewModelImpl c;
    public final /* synthetic */ Message e;

    public MessagesViewModelImpl$deleteMessage$1(MessagesViewModelImpl messagesViewModelImpl, Message message) {
        this.c = messagesViewModelImpl;
        this.e = message;
    }

    /* renamed from: a */
    public final n<Message> apply(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        if (this.e.x()) {
            return this.c.z.c(profile, this.e);
        }
        return this.c.z.b(profile, this.e);
    }
}
