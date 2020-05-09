package p289hu.ekreta.ellenorzo.message;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/message/Message;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "apply", "hu/ekreta/ellenorzo/message/MessageDetailViewModelImpl$message$2$1$7", "hu/ekreta/ellenorzo/message/MessageDetailViewModelImpl$$special$$inlined$also$lambda$7"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.message.MessageDetailViewModelImpl$$special$$inlined$observable$1$lambda$7 */
/* compiled from: MessageDetailViewModelImpl.kt */
public final class C4260x8dfe5c68<T, R> implements C4675h<T, C5030q<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ Message f13857c;

    /* renamed from: e */
    public final /* synthetic */ MessageDetailViewModelImpl$$special$$inlined$observable$1 f13858e;

    public C4260x8dfe5c68(Message message, MessageDetailViewModelImpl$$special$$inlined$observable$1 messageDetailViewModelImpl$$special$$inlined$observable$1) {
        this.f13857c = message;
        this.f13858e = messageDetailViewModelImpl$$special$$inlined$observable$1;
    }

    /* renamed from: a */
    public final C5027n<Message> apply(Profile profile) {
        Profile profile2 = profile;
        Intrinsics.checkParameterIsNotNull(profile2, Param.PROFILE);
        MessageDetailViewModelImpl messageDetailViewModelImpl = this.f13858e.f13847c;
        return messageDetailViewModelImpl.mo11505a(messageDetailViewModelImpl.f13845y.mo13404d(profile2, Message.copy$default(this.f13857c, null, null, 0, Boolean.valueOf(true), false, false, null, null, null, null, null, 0, null, null, null, null, null, null, null, 524279, null)));
    }
}
