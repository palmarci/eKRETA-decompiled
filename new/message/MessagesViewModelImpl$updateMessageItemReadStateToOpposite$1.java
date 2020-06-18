package hu.ekreta.ellenorzo.message;

import hu.ekreta.ellenorzo.message.Message;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import java.util.Calendar;
import java.util.List;
import k.b.b0.h;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/message/Message;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: MessagesViewModelImpl.kt */
public final class MessagesViewModelImpl$updateMessageItemReadStateToOpposite$1<T, R> implements h<T, q<? extends R>> {
    public final /* synthetic */ MessagesViewModelImpl c;
    public final /* synthetic */ Message e;

    public MessagesViewModelImpl$updateMessageItemReadStateToOpposite$1(MessagesViewModelImpl messagesViewModelImpl, Message message) {
        this.c = messagesViewModelImpl;
        this.e = message;
    }

    /* renamed from: a */
    public final n<Message> apply(Profile profile) {
        Profile profile2 = profile;
        Intrinsics.checkParameterIsNotNull(profile2, FirebaseContainer.Param.PROFILE);
        MessageRepository access$getMessageRepository$p = this.c.z;
        Message message = this.e;
        return access$getMessageRepository$p.d(profile2, Message.copy$default(message, (String) null, (String) null, 0, Boolean.valueOf(Intrinsics.areEqual((Object) message.q(), (Object) false)), false, false, (Message.MessageType) null, (String) null, (String) null, (String) null, (String) null, 0, (Calendar) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, 524279, (Object) null));
    }
}
