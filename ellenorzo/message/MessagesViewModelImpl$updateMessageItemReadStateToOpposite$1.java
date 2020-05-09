package p289hu.ekreta.ellenorzo.message;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/message/Message;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.message.MessagesViewModelImpl$updateMessageItemReadStateToOpposite$1 */
/* compiled from: MessagesViewModelImpl.kt */
public final class MessagesViewModelImpl$updateMessageItemReadStateToOpposite$1<T, R> implements C4675h<T, C5030q<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ MessagesViewModelImpl f13951c;

    /* renamed from: e */
    public final /* synthetic */ Message f13952e;

    public MessagesViewModelImpl$updateMessageItemReadStateToOpposite$1(MessagesViewModelImpl messagesViewModelImpl, Message message) {
        this.f13951c = messagesViewModelImpl;
        this.f13952e = message;
    }

    /* renamed from: a */
    public final C5027n<Message> apply(Profile profile) {
        Profile profile2 = profile;
        Intrinsics.checkParameterIsNotNull(profile2, Param.PROFILE);
        MessageRepository access$getMessageRepository$p = this.f13951c.f13938y;
        Message message = this.f13952e;
        return access$getMessageRepository$p.mo13404d(profile2, Message.copy$default(message, null, null, 0, Boolean.valueOf(Intrinsics.areEqual((Object) message.mo13290q(), (Object) Boolean.valueOf(false))), false, false, null, null, null, null, null, 0, null, null, null, null, null, null, null, 524279, null));
    }
}
