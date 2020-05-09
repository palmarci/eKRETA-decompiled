package p289hu.ekreta.ellenorzo.message;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.rest.EAdminApi;
import p289hu.ekreta.ellenorzo.rest.MobileApiV3Kt;
import p289hu.ekreta.ellenorzo.rest.eadminapi.SetMessageReadByUserRequestDto;
import p289hu.ekreta.ellenorzo.rest.eadminapi.SetMessageToBinByUserRequestDto;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\b\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u001c\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00160\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001c\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00160\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010H\u0016R\u0010\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001d"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/message/MessageRepositoryImpl;", "Lhu/ekreta/ellenorzo/message/MessageRepository;", "eAdminApi", "Lhu/ekreta/ellenorzo/rest/EAdminApi;", "messageDao", "Lhu/ekreta/ellenorzo/message/MessageDao;", "(Lhu/ekreta/ellenorzo/rest/EAdminApi;Lhu/ekreta/ellenorzo/message/MessageDao;)V", "adapter", "hu/ekreta/ellenorzo/message/MessageRepositoryImpl$adapter$1", "Lhu/ekreta/ellenorzo/message/MessageRepositoryImpl$adapter$1;", "getEAdminApi", "()Lhu/ekreta/ellenorzo/rest/EAdminApi;", "getMessageDao", "()Lhu/ekreta/ellenorzo/message/MessageDao;", "deleteMessagePermanently", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/message/Message;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "message", "fetchMessage", "fetchMessages", "", "getMessages", "getUnreadMessagesCount", "", "sendMessageToBin", "updateMessage", "updateMessageReadState", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.message.MessageRepositoryImpl */
/* compiled from: MessageRepositoryImpl.kt */
public final class MessageRepositoryImpl implements MessageRepository {

    /* renamed from: a */
    public final MessageRepositoryImpl$adapter$1 f13888a = new MessageRepositoryImpl$adapter$1(this);

    /* renamed from: b */
    public final EAdminApi f13889b;

    /* renamed from: c */
    public final MessageDao f13890c;

    public MessageRepositoryImpl(EAdminApi eAdminApi, MessageDao messageDao) {
        Intrinsics.checkParameterIsNotNull(eAdminApi, "eAdminApi");
        Intrinsics.checkParameterIsNotNull(messageDao, "messageDao");
        this.f13889b = eAdminApi;
        this.f13890c = messageDao;
    }

    /* renamed from: E */
    public C5027n<Integer> mo13400E(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        C5027n<Integer> c = mo13406z(profile).mo17246g(MessageRepositoryImpl$getUnreadMessagesCount$1.INSTANCE).mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new MessageRepositoryImpl$getUnreadMessagesCount$2<Object,Object>(this, profile));
        Intrinsics.checkExpressionValueIsNotNull(c, "getMessages(profile)\n   …)\n            }\n        }");
        return c;
    }

    /* renamed from: a */
    public final EAdminApi mo13407a() {
        return this.f13889b;
    }

    /* renamed from: b */
    public final MessageDao mo13409b() {
        return this.f13890c;
    }

    /* renamed from: c */
    public C5027n<Message> mo13403c(Profile profile, Message message) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        Intrinsics.checkParameterIsNotNull(message, "message");
        C5027n<Message> c = this.f13889b.deleteMessagePermanently(MobileApiV3Kt.getAsAuthorizationHeader(profile.mo14042d()), true, new Long[]{Long.valueOf(message.mo13282i())}).mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new MessageRepositoryImpl$deleteMessagePermanently$1<Object,Object>(this, message));
        Intrinsics.checkExpressionValueIsNotNull(c, "eAdminApi\n            .d…ge(message)\n            }");
        return c;
    }

    /* renamed from: d */
    public C5027n<Message> mo13404d(Profile profile, Message message) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        Intrinsics.checkParameterIsNotNull(message, "message");
        EAdminApi eAdminApi = this.f13889b;
        String asAuthorizationHeader = MobileApiV3Kt.getAsAuthorizationHeader(profile.mo14042d());
        Boolean q = message.mo13290q();
        if (q == null) {
            Intrinsics.throwNpe();
        }
        C5027n<Message> c = eAdminApi.readMessage(asAuthorizationHeader, new SetMessageReadByUserRequestDto(q.booleanValue(), new Long[]{Long.valueOf(message.mo13282i())})).mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new MessageRepositoryImpl$updateMessageReadState$1<Object,Object>(this, message));
        Intrinsics.checkExpressionValueIsNotNull(c, "eAdminApi\n        .readM… updateMessage(message) }");
        return c;
    }

    /* renamed from: w */
    public C5027n<List<Message>> mo13405w(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        C5027n<List<Message>> c = this.f13889b.getMessages(MobileApiV3Kt.getAsAuthorizationHeader(profile.mo14042d())).mo17246g(new MessageRepositoryImpl$fetchMessages$1(profile)).mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new MessageRepositoryImpl$fetchMessages$2<Object,Object>(this, profile));
        Intrinsics.checkExpressionValueIsNotNull(c, "eAdminApi\n            .g…ile.id, it)\n            }");
        return c;
    }

    /* renamed from: z */
    public C5027n<List<Message>> mo13406z(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        return this.f13888a.mo13411a(profile);
    }

    /* renamed from: a */
    public C5027n<Message> mo13408a(Message message) {
        Intrinsics.checkParameterIsNotNull(message, "message");
        return this.f13888a.mo13412b(message);
    }

    /* renamed from: b */
    public C5027n<Message> mo13402b(Profile profile, Message message) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        Intrinsics.checkParameterIsNotNull(message, "message");
        C5027n<Message> c = this.f13889b.sendMessageToBin(MobileApiV3Kt.getAsAuthorizationHeader(profile.mo14042d()), new SetMessageToBinByUserRequestDto(true, new Long[]{Long.valueOf(message.mo13282i())})).mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new MessageRepositoryImpl$sendMessageToBin$1<Object,Object>(this, message));
        Intrinsics.checkExpressionValueIsNotNull(c, "eAdminApi\n            .s…ed = true))\n            }");
        return c;
    }

    /* renamed from: a */
    public C5027n<Message> mo13401a(Profile profile, Message message) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        Intrinsics.checkParameterIsNotNull(message, "message");
        C5027n<Message> c = this.f13889b.getMessage(message.mo13282i(), MobileApiV3Kt.getAsAuthorizationHeader(profile.mo14042d())).mo17246g(new MessageRepositoryImpl$fetchMessage$1(profile)).mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new MessageRepositoryImpl$fetchMessage$2<Object,Object>(this));
        Intrinsics.checkExpressionValueIsNotNull(c, "eAdminApi\n            .g…Element(it)\n            }");
        return c;
    }
}
