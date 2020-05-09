package p289hu.ekreta.ellenorzo.message;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.rest.eadminapi.MailboxItemDto;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/message/Message;", "it", "Lhu/ekreta/ellenorzo/rest/eadminapi/MailboxItemDto;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.message.MessageRepositoryImpl$fetchMessage$1 */
/* compiled from: MessageRepositoryImpl.kt */
public final class MessageRepositoryImpl$fetchMessage$1<T, R> implements C4675h<T, R> {

    /* renamed from: c */
    public final /* synthetic */ Profile f13897c;

    public MessageRepositoryImpl$fetchMessage$1(Profile profile) {
        this.f13897c = profile;
    }

    /* renamed from: a */
    public final Message apply(MailboxItemDto mailboxItemDto) {
        Intrinsics.checkParameterIsNotNull(mailboxItemDto, "it");
        return MessageRepositoryImplKt.m13064a(mailboxItemDto, this.f13897c.mo14054m(), true);
    }
}
