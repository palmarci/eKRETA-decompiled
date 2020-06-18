package hu.ekreta.ellenorzo.message;

import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.rest.EAdminApi;
import hu.ekreta.ellenorzo.rest.MobileApiV3Kt;
import hu.ekreta.ellenorzo.rest.eadminapi.SetMessageReadByUserRequestDto;
import hu.ekreta.ellenorzo.rest.eadminapi.SetMessageToBinByUserRequestDto;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import java.util.List;
import k.b.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\b\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u001c\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00160\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001c\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00160\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010H\u0016R\u0010\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001d"}, d2 = {"Lhu/ekreta/ellenorzo/message/MessageRepositoryImpl;", "Lhu/ekreta/ellenorzo/message/MessageRepository;", "eAdminApi", "Lhu/ekreta/ellenorzo/rest/EAdminApi;", "messageDao", "Lhu/ekreta/ellenorzo/message/MessageDao;", "(Lhu/ekreta/ellenorzo/rest/EAdminApi;Lhu/ekreta/ellenorzo/message/MessageDao;)V", "adapter", "hu/ekreta/ellenorzo/message/MessageRepositoryImpl$adapter$1", "Lhu/ekreta/ellenorzo/message/MessageRepositoryImpl$adapter$1;", "getEAdminApi", "()Lhu/ekreta/ellenorzo/rest/EAdminApi;", "getMessageDao", "()Lhu/ekreta/ellenorzo/message/MessageDao;", "deleteMessagePermanently", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/message/Message;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "message", "fetchMessage", "fetchMessages", "", "getMessages", "getUnreadMessagesCount", "", "sendMessageToBin", "updateMessage", "updateMessageReadState", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: MessageRepositoryImpl.kt */
public final class MessageRepositoryImpl implements MessageRepository {

    /* renamed from: a  reason: collision with root package name */
    public final MessageRepositoryImpl$adapter$1 f5802a = new MessageRepositoryImpl$adapter$1(this);
    public final EAdminApi b;
    public final MessageDao c;

    public MessageRepositoryImpl(EAdminApi eAdminApi, MessageDao messageDao) {
        Intrinsics.checkParameterIsNotNull(eAdminApi, "eAdminApi");
        Intrinsics.checkParameterIsNotNull(messageDao, "messageDao");
        this.b = eAdminApi;
        this.c = messageDao;
    }

    public n<Integer> E(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        n<R> c2 = z(profile).g(MessageRepositoryImpl$getUnreadMessagesCount$1.INSTANCE).c(new MessageRepositoryImpl$getUnreadMessagesCount$2(this, profile));
        Intrinsics.checkExpressionValueIsNotNull(c2, "getMessages(profile)\n   …)\n            }\n        }");
        return c2;
    }

    public final EAdminApi a() {
        return this.b;
    }

    public final MessageDao b() {
        return this.c;
    }

    public n<Message> c(Profile profile, Message message) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        Intrinsics.checkParameterIsNotNull(message, "message");
        n<R> c2 = this.b.deleteMessagePermanently(MobileApiV3Kt.getAsAuthorizationHeader(profile.d()), true, new Long[]{Long.valueOf(message.i())}).c(new MessageRepositoryImpl$deleteMessagePermanently$1(this, message));
        Intrinsics.checkExpressionValueIsNotNull(c2, "eAdminApi\n            .d…ge(message)\n            }");
        return c2;
    }

    public n<Message> d(Profile profile, Message message) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        Intrinsics.checkParameterIsNotNull(message, "message");
        EAdminApi eAdminApi = this.b;
        String asAuthorizationHeader = MobileApiV3Kt.getAsAuthorizationHeader(profile.d());
        Boolean q2 = message.q();
        if (q2 == null) {
            Intrinsics.throwNpe();
        }
        n<R> c2 = eAdminApi.readMessage(asAuthorizationHeader, new SetMessageReadByUserRequestDto(q2.booleanValue(), new Long[]{Long.valueOf(message.i())})).c(new MessageRepositoryImpl$updateMessageReadState$1(this, message));
        Intrinsics.checkExpressionValueIsNotNull(c2, "eAdminApi\n        .readM… updateMessage(message) }");
        return c2;
    }

    public n<List<Message>> w(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        n<R> c2 = this.b.getMessages(MobileApiV3Kt.getAsAuthorizationHeader(profile.d())).g(new MessageRepositoryImpl$fetchMessages$1(profile)).c(new MessageRepositoryImpl$fetchMessages$2(this, profile));
        Intrinsics.checkExpressionValueIsNotNull(c2, "eAdminApi\n            .g…ile.id, it)\n            }");
        return c2;
    }

    public n<List<Message>> z(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        return this.f5802a.a(profile);
    }

    public n<Message> a(Message message) {
        Intrinsics.checkParameterIsNotNull(message, "message");
        return this.f5802a.b(message);
    }

    public n<Message> b(Profile profile, Message message) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        Intrinsics.checkParameterIsNotNull(message, "message");
        n<R> c2 = this.b.sendMessageToBin(MobileApiV3Kt.getAsAuthorizationHeader(profile.d()), new SetMessageToBinByUserRequestDto(true, new Long[]{Long.valueOf(message.i())})).c(new MessageRepositoryImpl$sendMessageToBin$1(this, message));
        Intrinsics.checkExpressionValueIsNotNull(c2, "eAdminApi\n            .s…ed = true))\n            }");
        return c2;
    }

    public n<Message> a(Profile profile, Message message) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        Intrinsics.checkParameterIsNotNull(message, "message");
        n<R> c2 = this.b.getMessage(message.i(), MobileApiV3Kt.getAsAuthorizationHeader(profile.d())).g(new MessageRepositoryImpl$fetchMessage$1(profile)).c(new MessageRepositoryImpl$fetchMessage$2(this));
        Intrinsics.checkExpressionValueIsNotNull(c2, "eAdminApi\n            .g…Element(it)\n            }");
        return c2;
    }
}
