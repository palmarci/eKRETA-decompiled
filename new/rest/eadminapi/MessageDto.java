package hu.ekreta.ellenorzo.rest.eadminapi;

import a.b.a.a.a;
import a.h.c.z.c;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fHÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0007HÖ\u0001R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001f\u0010\u0016¨\u00061"}, d2 = {"Lhu/ekreta/ellenorzo/rest/eadminapi/MessageDto;", "", "messageId", "", "messageSentDate", "Ljava/util/Calendar;", "messageSenderName", "", "messageSenderTitle", "messageText", "messageSubject", "addressList", "", "Lhu/ekreta/ellenorzo/rest/eadminapi/AddresseeDto;", "attachmentList", "Lhu/ekreta/ellenorzo/rest/eadminapi/AttachmentDto;", "previousMessageId", "(Ljava/lang/Long;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;)V", "getAddressList", "()Ljava/util/List;", "getAttachmentList", "getMessageId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMessageSenderName", "()Ljava/lang/String;", "getMessageSenderTitle", "getMessageSentDate", "()Ljava/util/Calendar;", "getMessageSubject", "getMessageText", "getPreviousMessageId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;)Lhu/ekreta/ellenorzo/rest/eadminapi/MessageDto;", "equals", "", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: MessageDto.kt */
public final class MessageDto {
    @c("cimzettLista")
    public final List<AddresseeDto> addressList;
    @c("csatolmanyok")
    public final List<AttachmentDto> attachmentList;
    @c("azonosito")
    public final Long messageId;
    @c("feladoNev")
    public final String messageSenderName;
    @c("feladoTitulus")
    public final String messageSenderTitle;
    @c("kuldesDatum")
    public final Calendar messageSentDate;
    @c("targy")
    public final String messageSubject;
    @c("szoveg")
    public final String messageText;
    @c("elozoUzenetAzonosito")
    public final Long previousMessageId;

    public MessageDto(Long l2, Calendar calendar, String str, String str2, String str3, String str4, List<AddresseeDto> list, List<AttachmentDto> list2, Long l3) {
        this.messageId = l2;
        this.messageSentDate = calendar;
        this.messageSenderName = str;
        this.messageSenderTitle = str2;
        this.messageText = str3;
        this.messageSubject = str4;
        this.addressList = list;
        this.attachmentList = list2;
        this.previousMessageId = l3;
    }

    public static /* synthetic */ MessageDto copy$default(MessageDto messageDto, Long l2, Calendar calendar, String str, String str2, String str3, String str4, List list, List list2, Long l3, int i2, Object obj) {
        MessageDto messageDto2 = messageDto;
        int i3 = i2;
        return messageDto.copy((i3 & 1) != 0 ? messageDto2.messageId : l2, (i3 & 2) != 0 ? messageDto2.messageSentDate : calendar, (i3 & 4) != 0 ? messageDto2.messageSenderName : str, (i3 & 8) != 0 ? messageDto2.messageSenderTitle : str2, (i3 & 16) != 0 ? messageDto2.messageText : str3, (i3 & 32) != 0 ? messageDto2.messageSubject : str4, (i3 & 64) != 0 ? messageDto2.addressList : list, (i3 & 128) != 0 ? messageDto2.attachmentList : list2, (i3 & 256) != 0 ? messageDto2.previousMessageId : l3);
    }

    public final Long component1() {
        return this.messageId;
    }

    public final Calendar component2() {
        return this.messageSentDate;
    }

    public final String component3() {
        return this.messageSenderName;
    }

    public final String component4() {
        return this.messageSenderTitle;
    }

    public final String component5() {
        return this.messageText;
    }

    public final String component6() {
        return this.messageSubject;
    }

    public final List<AddresseeDto> component7() {
        return this.addressList;
    }

    public final List<AttachmentDto> component8() {
        return this.attachmentList;
    }

    public final Long component9() {
        return this.previousMessageId;
    }

    public final MessageDto copy(Long l2, Calendar calendar, String str, String str2, String str3, String str4, List<AddresseeDto> list, List<AttachmentDto> list2, Long l3) {
        return new MessageDto(l2, calendar, str, str2, str3, str4, list, list2, l3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageDto)) {
            return false;
        }
        MessageDto messageDto = (MessageDto) obj;
        return Intrinsics.areEqual((Object) this.messageId, (Object) messageDto.messageId) && Intrinsics.areEqual((Object) this.messageSentDate, (Object) messageDto.messageSentDate) && Intrinsics.areEqual((Object) this.messageSenderName, (Object) messageDto.messageSenderName) && Intrinsics.areEqual((Object) this.messageSenderTitle, (Object) messageDto.messageSenderTitle) && Intrinsics.areEqual((Object) this.messageText, (Object) messageDto.messageText) && Intrinsics.areEqual((Object) this.messageSubject, (Object) messageDto.messageSubject) && Intrinsics.areEqual((Object) this.addressList, (Object) messageDto.addressList) && Intrinsics.areEqual((Object) this.attachmentList, (Object) messageDto.attachmentList) && Intrinsics.areEqual((Object) this.previousMessageId, (Object) messageDto.previousMessageId);
    }

    public final List<AddresseeDto> getAddressList() {
        return this.addressList;
    }

    public final List<AttachmentDto> getAttachmentList() {
        return this.attachmentList;
    }

    public final Long getMessageId() {
        return this.messageId;
    }

    public final String getMessageSenderName() {
        return this.messageSenderName;
    }

    public final String getMessageSenderTitle() {
        return this.messageSenderTitle;
    }

    public final Calendar getMessageSentDate() {
        return this.messageSentDate;
    }

    public final String getMessageSubject() {
        return this.messageSubject;
    }

    public final String getMessageText() {
        return this.messageText;
    }

    public final Long getPreviousMessageId() {
        return this.previousMessageId;
    }

    public int hashCode() {
        Long l2 = this.messageId;
        int i2 = 0;
        int hashCode = (l2 != null ? l2.hashCode() : 0) * 31;
        Calendar calendar = this.messageSentDate;
        int hashCode2 = (hashCode + (calendar != null ? calendar.hashCode() : 0)) * 31;
        String str = this.messageSenderName;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.messageSenderTitle;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.messageText;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.messageSubject;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        List<AddresseeDto> list = this.addressList;
        int hashCode7 = (hashCode6 + (list != null ? list.hashCode() : 0)) * 31;
        List<AttachmentDto> list2 = this.attachmentList;
        int hashCode8 = (hashCode7 + (list2 != null ? list2.hashCode() : 0)) * 31;
        Long l3 = this.previousMessageId;
        if (l3 != null) {
            i2 = l3.hashCode();
        }
        return hashCode8 + i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("MessageDto(messageId=");
        a2.append(this.messageId);
        a2.append(", messageSentDate=");
        a2.append(this.messageSentDate);
        a2.append(", messageSenderName=");
        a2.append(this.messageSenderName);
        a2.append(", messageSenderTitle=");
        a2.append(this.messageSenderTitle);
        a2.append(", messageText=");
        a2.append(this.messageText);
        a2.append(", messageSubject=");
        a2.append(this.messageSubject);
        a2.append(", addressList=");
        a2.append(this.addressList);
        a2.append(", attachmentList=");
        a2.append(this.attachmentList);
        a2.append(", previousMessageId=");
        a2.append(this.previousMessageId);
        a2.append(")");
        return a2.toString();
    }
}
