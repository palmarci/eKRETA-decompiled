package hu.ekreta.ellenorzo.message;

import hu.ekreta.ellenorzo.attachment.Attachment;
import hu.ekreta.ellenorzo.attachment.AttachmentDownloadState;
import hu.ekreta.ellenorzo.attachment.AttachmentType;
import hu.ekreta.ellenorzo.message.Message;
import hu.ekreta.ellenorzo.rest.eadminapi.AddresseeDto;
import hu.ekreta.ellenorzo.rest.eadminapi.AttachmentDto;
import hu.ekreta.ellenorzo.rest.eadminapi.MailboxItemDto;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001c\u0010\b\u001a\u00020\t*\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"toAddress", "Lhu/ekreta/ellenorzo/message/Addressee;", "Lhu/ekreta/ellenorzo/rest/eadminapi/AddresseeDto;", "profileId", "", "toAttachment", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "Lhu/ekreta/ellenorzo/rest/eadminapi/AttachmentDto;", "toMessage", "Lhu/ekreta/ellenorzo/message/Message;", "Lhu/ekreta/ellenorzo/rest/eadminapi/MailboxItemDto;", "complete", "", "app_guardianProdRelease"}, k = 2, mv = {1, 1, 15})
/* compiled from: MessageRepositoryImpl.kt */
public final class MessageRepositoryImplKt {
    public static final Message a(MailboxItemDto mailboxItemDto, String str, boolean z) {
        String str2 = str;
        Intrinsics.checkParameterIsNotNull(mailboxItemDto, "$this$toMessage");
        Intrinsics.checkParameterIsNotNull(str2, "profileId");
        String str3 = str2 + '#' + mailboxItemDto.getUid();
        long uid = mailboxItemDto.getUid();
        Boolean valueOf = Boolean.valueOf(mailboxItemDto.getReadByUser());
        boolean isDeleted = mailboxItemDto.isDeleted();
        Message.MessageType a2 = Message.MessageType.Companion.a(mailboxItemDto.getTypeId());
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
            Intrinsics.checkParameterIsNotNull(str2, "profileId");
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
        Iterator<T> it = attachmentList.iterator();
        while (it.hasNext()) {
            AttachmentDto attachmentDto = (AttachmentDto) it.next();
            Intrinsics.checkParameterIsNotNull(attachmentDto, "$this$toAttachment");
            Intrinsics.checkParameterIsNotNull(str, "profileId");
            Iterator<T> it2 = it;
            Attachment attachment = r0;
            Attachment attachment2 = new Attachment(attachmentDto.getId(), attachmentDto.getFileName(), (String) null, (AttachmentType) null, (AttachmentDownloadState) null, str, (String) null, (String) null, 220, (DefaultConstructorMarker) null);
            arrayList4.add(attachment);
            it = it2;
        }
        String str4 = str;
        return new Message(str, str3, uid, valueOf, isDeleted, z, a2, typeCode, typeShortName, typeName, typeDescription, messageId, messageSentDate, messageSenderName, messageSenderTitle, messageText, messageSubject, arrayList3, arrayList4);
    }

    public static /* synthetic */ Message toMessage$default(MailboxItemDto mailboxItemDto, String str, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return a(mailboxItemDto, str, z);
    }
}
