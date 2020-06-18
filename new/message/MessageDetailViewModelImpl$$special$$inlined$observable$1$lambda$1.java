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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/message/Message;", "kotlin.jvm.PlatformType", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "apply", "hu/ekreta/ellenorzo/message/MessageDetailViewModelImpl$message$2$1$1", "hu/ekreta/ellenorzo/message/MessageDetailViewModelImpl$$special$$inlined$also$lambda$1"}, k = 3, mv = {1, 1, 15})
/* compiled from: MessageDetailViewModelImpl.kt */
public final class MessageDetailViewModelImpl$$special$$inlined$observable$1$lambda$1<T, R> implements h<T, q<? extends R>> {
    public final /* synthetic */ Message c;
    public final /* synthetic */ MessageDetailViewModelImpl$$special$$inlined$observable$1 e;

    public MessageDetailViewModelImpl$$special$$inlined$observable$1$lambda$1(Message message, MessageDetailViewModelImpl$$special$$inlined$observable$1 messageDetailViewModelImpl$$special$$inlined$observable$1) {
        this.c = message;
        this.e = messageDetailViewModelImpl$$special$$inlined$observable$1;
    }

    /* renamed from: a */
    public final n<Message> apply(final Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        MessageDetailViewModelImpl messageDetailViewModelImpl = this.e.c;
        return messageDetailViewModelImpl.a(messageDetailViewModelImpl.z.a(profile, this.c)).c(new h<T, q<? extends R>>(this) {
            public final /* synthetic */ MessageDetailViewModelImpl$$special$$inlined$observable$1$lambda$1 c;

            {
                this.c = r1;
            }

            /* renamed from: a */
            public final n<Message> apply(Message message) {
                Intrinsics.checkParameterIsNotNull(message, "it");
                if (Intrinsics.areEqual((Object) message.q(), (Object) false)) {
                    MessageDetailViewModelImpl messageDetailViewModelImpl = this.c.e.c;
                    MessageRepository access$getMessageRepository$p = messageDetailViewModelImpl.z;
                    Profile profile = profile;
                    Intrinsics.checkExpressionValueIsNotNull(profile, FirebaseContainer.Param.PROFILE);
                    return messageDetailViewModelImpl.a(access$getMessageRepository$p.d(profile, Message.copy$default(this.c.c, (String) null, (String) null, 0, true, false, false, (Message.MessageType) null, (String) null, (String) null, (String) null, (String) null, 0, (Calendar) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, 524279, (Object) null)));
                }
                n<Message> d2 = n.d(message);
                Intrinsics.checkExpressionValueIsNotNull(d2, "Observable.just(it)");
                return d2;
            }
        });
    }
}
