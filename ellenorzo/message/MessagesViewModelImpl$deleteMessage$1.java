package p289hu.ekreta.ellenorzo.message;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/message/Message;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.message.MessagesViewModelImpl$deleteMessage$1 */
/* compiled from: MessagesViewModelImpl.kt */
public final class MessagesViewModelImpl$deleteMessage$1<T, R> implements C4675h<T, C5030q<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ MessagesViewModelImpl f13940c;

    /* renamed from: e */
    public final /* synthetic */ Message f13941e;

    public MessagesViewModelImpl$deleteMessage$1(MessagesViewModelImpl messagesViewModelImpl, Message message) {
        this.f13940c = messagesViewModelImpl;
        this.f13941e = message;
    }

    /* renamed from: a */
    public final C5027n<Message> apply(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        if (this.f13941e.mo13299x()) {
            return this.f13940c.f13938y.mo13403c(profile, this.f13941e);
        }
        return this.f13940c.f13938y.mo13402b(profile, this.f13941e);
    }
}
