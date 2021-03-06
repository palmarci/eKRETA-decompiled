package hu.ekreta.ellenorzo.message;

import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import java.util.List;
import k.b.b0.h;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/message/Message;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: MessageRepositoryImpl.kt */
public final class MessageRepositoryImpl$adapter$1$messagesObservable$2<T, R> implements h<T, q<? extends R>> {
    public final /* synthetic */ MessageRepositoryImpl$adapter$1 c;

    public MessageRepositoryImpl$adapter$1$messagesObservable$2(MessageRepositoryImpl$adapter$1 messageRepositoryImpl$adapter$1) {
        this.c = messageRepositoryImpl$adapter$1;
    }

    /* renamed from: a */
    public final n<List<Message>> apply(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        return this.c.c.b().a(profile.m());
    }
}
