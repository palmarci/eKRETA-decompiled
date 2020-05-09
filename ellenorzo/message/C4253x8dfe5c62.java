package p289hu.ekreta.ellenorzo.message;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/message/Message;", "kotlin.jvm.PlatformType", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "apply", "hu/ekreta/ellenorzo/message/MessageDetailViewModelImpl$message$2$1$1", "hu/ekreta/ellenorzo/message/MessageDetailViewModelImpl$$special$$inlined$also$lambda$1"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.message.MessageDetailViewModelImpl$$special$$inlined$observable$1$lambda$1 */
/* compiled from: MessageDetailViewModelImpl.kt */
public final class C4253x8dfe5c62<T, R> implements C4675h<T, C5030q<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ Message f13848c;

    /* renamed from: e */
    public final /* synthetic */ MessageDetailViewModelImpl$$special$$inlined$observable$1 f13849e;

    public C4253x8dfe5c62(Message message, MessageDetailViewModelImpl$$special$$inlined$observable$1 messageDetailViewModelImpl$$special$$inlined$observable$1) {
        this.f13848c = message;
        this.f13849e = messageDetailViewModelImpl$$special$$inlined$observable$1;
    }

    /* renamed from: a */
    public final C5027n<Message> apply(final Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        MessageDetailViewModelImpl messageDetailViewModelImpl = this.f13849e.f13847c;
        return messageDetailViewModelImpl.mo11505a(messageDetailViewModelImpl.f13845y.mo13401a(profile, this.f13848c)).mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new C4675h<T, C5030q<? extends R>>(this) {

            /* renamed from: c */
            public final /* synthetic */ C4253x8dfe5c62 f13850c;

            {
                this.f13850c = r1;
            }

            /* renamed from: a */
            public final C5027n<Message> apply(Message message) {
                Intrinsics.checkParameterIsNotNull(message, "it");
                if (Intrinsics.areEqual((Object) message.mo13290q(), (Object) Boolean.valueOf(false))) {
                    MessageDetailViewModelImpl messageDetailViewModelImpl = this.f13850c.f13849e.f13847c;
                    MessageRepository access$getMessageRepository$p = messageDetailViewModelImpl.f13845y;
                    Profile profile = profile;
                    Intrinsics.checkExpressionValueIsNotNull(profile, Param.PROFILE);
                    return messageDetailViewModelImpl.mo11505a(access$getMessageRepository$p.mo13404d(profile, Message.copy$default(this.f13850c.f13848c, null, null, 0, Boolean.valueOf(true), false, false, null, null, null, null, null, 0, null, null, null, null, null, null, null, 524279, null)));
                }
                C5027n<Message> d = C5027n.m16898d(message);
                Intrinsics.checkExpressionValueIsNotNull(d, "Observable.just(it)");
                return d;
            }
        });
    }
}
