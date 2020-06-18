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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/message/Message;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "apply", "hu/ekreta/ellenorzo/message/MessageDetailViewModelImpl$message$2$1$7", "hu/ekreta/ellenorzo/message/MessageDetailViewModelImpl$$special$$inlined$also$lambda$7"}, k = 3, mv = {1, 1, 15})
/* compiled from: MessageDetailViewModelImpl.kt */
public final class MessageDetailViewModelImpl$$special$$inlined$observable$1$lambda$7<T, R> implements h<T, q<? extends R>> {
    public final /* synthetic */ Message c;
    public final /* synthetic */ MessageDetailViewModelImpl$$special$$inlined$observable$1 e;

    public MessageDetailViewModelImpl$$special$$inlined$observable$1$lambda$7(Message message, MessageDetailViewModelImpl$$special$$inlined$observable$1 messageDetailViewModelImpl$$special$$inlined$observable$1) {
        this.c = message;
        this.e = messageDetailViewModelImpl$$special$$inlined$observable$1;
    }

    /* renamed from: a */
    public final n<Message> apply(Profile profile) {
        Profile profile2 = profile;
        Intrinsics.checkParameterIsNotNull(profile2, FirebaseContainer.Param.PROFILE);
        MessageDetailViewModelImpl messageDetailViewModelImpl = this.e.c;
        return messageDetailViewModelImpl.a(messageDetailViewModelImpl.z.d(profile2, Message.copy$default(this.c, (String) null, (String) null, 0, true, false, false, (Message.MessageType) null, (String) null, (String) null, (String) null, (String) null, 0, (Calendar) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, 524279, (Object) null)));
    }
}
