package p289hu.ekreta.ellenorzo.message;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.attachment.Attachment;
import p289hu.ekreta.ellenorzo.message.Message.MessageType;
import p289hu.ekreta.ellenorzo.rest.eadminapi.AddresseeDto;
import p289hu.ekreta.ellenorzo.rest.eadminapi.AttachmentDto;
import p289hu.ekreta.ellenorzo.rest.eadminapi.MailboxItemDto;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001c\u0010\b\u001a\u00020\t*\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\f¨\u0006\r"}, mo17463d2 = {"toAddress", "Lhu/ekreta/ellenorzo/message/Addressee;", "Lhu/ekreta/ellenorzo/rest/eadminapi/AddresseeDto;", "profileId", "", "toAttachment", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "Lhu/ekreta/ellenorzo/rest/eadminapi/AttachmentDto;", "toMessage", "Lhu/ekreta/ellenorzo/message/Message;", "Lhu/ekreta/ellenorzo/rest/eadminapi/MailboxItemDto;", "complete", "", "app_studentProdRelease"}, mo17464k = 2, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.message.MessageRepositoryImplKt */
/* compiled from: MessageRepositoryImpl.kt */
public final class MessageRepositoryImplKt {
    /* renamed from: a */
    public static final Message m13064a(MailboxItemDto mailboxItemDto, String str, boolean z) {
        String str2 = str;
        Intrinsics.checkParameterIsNotNull(mailboxItemDto, "$this$toMessage");
        String str3 = "profileId";
        Intrinsics.checkParameterIsNotNull(str2, str3);
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append('#');
        sb.append(mailboxItemDto.getUid());
        String sb2 = sb.toString();
        long uid = mailboxItemDto.getUid();
        Boolean valueOf = Boolean.valueOf(mailboxItemDto.getReadByUser());
        boolean isDeleted = mailboxItemDto.isDeleted();
        MessageType a = MessageType.Companion.mo13303a(mailboxItemDto.getTypeId());
        String typeCode = mailboxItemDto.getTypeCode();
        String typeShortName = mailboxItemDto.getTypeShortName();
        String typeName = mailboxItemDto.getTypeName();
        String typeDescription = mailboxItemDto.getTypeDescription();
        long messageId = mailboxItemDto.getMessageId();
        Calendar messageSentDate = mailboxItemDto.getMessageSentDate();
        String messageSenderName = mailboxItemDto.getMessageSenderName();
        String messageSenderTitle = mailboxItemDto.getMessageSenderTitle();
        String messageText = mailboxItemDto.getMessageText();
        String messageSubject = mailboxItemDto.getMessageSubject();
        List<AddresseeDto> addressList = mailboxItemDto.getAddressList();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(addressList, 10));
        for (AddresseeDto addresseeDto : addressList) {
            Intrinsics.checkParameterIsNotNull(addresseeDto, "$this$toAddress");
            Intrinsics.checkParameterIsNotNull(str2, str3);
            Addressee addressee = r0;
            ArrayList arrayList2 = arrayList;
            Addressee addressee2 = new Addressee(addresseeDto.getId(), addresseeDto.getKretaId(), addresseeDto.getName(), addresseeDto.getTypeId(), addresseeDto.getTypeCode(), addresseeDto.getTypeShortName(), addresseeDto.getTypeName(), addresseeDto.getTypeDescription(), str);
            arrayList2.add(addressee);
            MailboxItemDto mailboxItemDto2 = mailboxItemDto;
            arrayList = arrayList2;
            str2 = str;
        }
        ArrayList arrayList3 = arrayList;
        List<AttachmentDto> attachmentList = mailboxItemDto.getAttachmentList();
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(attachmentList, 10));
        for (AttachmentDto attachmentDto : attachmentList) {
            Intrinsics.checkParameterIsNotNull(attachmentDto, "$this$toAttachment");
            Intrinsics.checkParameterIsNotNull(str, str3);
            Attachment attachment = new Attachment(attachmentDto.getId(), attachmentDto.getFileName(), null, null, null, str, 28, null);
            arrayList4.add(attachment);
        }
        String str4 = str;
        Message message = new Message(str, sb2, uid, valueOf, isDeleted, z, a, typeCode, typeShortName, typeName, typeDescription, messageId, messageSentDate, messageSenderName, messageSenderTitle, messageText, messageSubject, arrayList3, arrayList4);
        return message;
    }

    public static /* synthetic */ Message toMessage$default(MailboxItemDto mailboxItemDto, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m13064a(mailboxItemDto, str, z);
    }
}
