package p289hu.ekreta.ellenorzo.message;

import java.util.List;
import kotlin.Metadata;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.util.Repository;
import p300k.p313b.C5027n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H&J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H&J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n0\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n0\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H&J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H&J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H&¨\u0006\u0011"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/message/MessageRepository;", "Lhu/ekreta/ellenorzo/util/Repository;", "Lhu/ekreta/ellenorzo/message/Message;", "deleteMessagePermanently", "Lio/reactivex/Observable;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "message", "fetchMessage", "fetchMessages", "", "getMessages", "getUnreadMessagesCount", "", "sendMessageToBin", "updateMessage", "updateMessageReadState", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.message.MessageRepository */
/* compiled from: MessageRepository.kt */
public interface MessageRepository extends Repository<Message> {
    /* renamed from: E */
    C5027n<Integer> mo13400E(Profile profile);

    /* renamed from: a */
    C5027n<Message> mo13401a(Profile profile, Message message);

    /* renamed from: b */
    C5027n<Message> mo13402b(Profile profile, Message message);

    /* renamed from: c */
    C5027n<Message> mo13403c(Profile profile, Message message);

    /* renamed from: d */
    C5027n<Message> mo13404d(Profile profile, Message message);

    /* renamed from: w */
    C5027n<List<Message>> mo13405w(Profile profile);

    /* renamed from: z */
    C5027n<List<Message>> mo13406z(Profile profile);
}
