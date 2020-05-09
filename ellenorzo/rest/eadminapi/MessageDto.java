package p289hu.ekreta.ellenorzo.rest.eadminapi;

import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p000a.p054h.p159c.p166z.C2580c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000f0\fHÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJv\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0007HÖ\u0001R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001f¨\u00062"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/eadminapi/MessageDto;", "", "messageId", "", "messageSentDate", "Ljava/util/Calendar;", "messageSenderName", "", "messageSenderTitle", "messageText", "messageSubject", "addressList", "", "Lhu/ekreta/ellenorzo/rest/eadminapi/AddresseeDto;", "attachmentList", "Lhu/ekreta/ellenorzo/rest/eadminapi/AttachmentDto;", "previousMessageId", "(JLjava/util/Calendar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;)V", "getAddressList", "()Ljava/util/List;", "getAttachmentList", "getMessageId", "()J", "getMessageSenderName", "()Ljava/lang/String;", "getMessageSenderTitle", "getMessageSentDate", "()Ljava/util/Calendar;", "getMessageSubject", "getMessageText", "getPreviousMessageId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JLjava/util/Calendar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;)Lhu/ekreta/ellenorzo/rest/eadminapi/MessageDto;", "equals", "", "other", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.rest.eadminapi.MessageDto */
/* compiled from: MessageDto.kt */
public final class MessageDto {
    @C2580c("cimzettLista")
    public final List<AddresseeDto> addressList;
    @C2580c("csatolmanyok")
    public final List<AttachmentDto> attachmentList;
    @C2580c("azonosito")
    public final long messageId;
    @C2580c("feladoNev")
    public final String messageSenderName;
    @C2580c("feladoTitulus")
    public final String messageSenderTitle;
    @C2580c("kuldesDatum")
    public final Calendar messageSentDate;
    @C2580c("targy")
    public final String messageSubject;
    @C2580c("szoveg")
    public final String messageText;
    @C2580c("elozoUzenetAzonosito")
    public final Long previousMessageId;

    public MessageDto(long j, Calendar calendar, String str, String str2, String str3, String str4, List<AddresseeDto> list, List<AttachmentDto> list2, Long l) {
        Intrinsics.checkParameterIsNotNull(calendar, "messageSentDate");
        Intrinsics.checkParameterIsNotNull(str, "messageSenderName");
        Intrinsics.checkParameterIsNotNull(str2, "messageSenderTitle");
        Intrinsics.checkParameterIsNotNull(str3, "messageText");
        Intrinsics.checkParameterIsNotNull(str4, "messageSubject");
        Intrinsics.checkParameterIsNotNull(list, "addressList");
        Intrinsics.checkParameterIsNotNull(list2, "attachmentList");
        this.messageId = j;
        this.messageSentDate = calendar;
        this.messageSenderName = str;
        this.messageSenderTitle = str2;
        this.messageText = str3;
        this.messageSubject = str4;
        this.addressList = list;
        this.attachmentList = list2;
        this.previousMessageId = l;
    }

    public static /* synthetic */ MessageDto copy$default(MessageDto messageDto, long j, Calendar calendar, String str, String str2, String str3, String str4, List list, List list2, Long l, int i, Object obj) {
        MessageDto messageDto2 = messageDto;
        int i2 = i;
        return messageDto.copy((i2 & 1) != 0 ? messageDto2.messageId : j, (i2 & 2) != 0 ? messageDto2.messageSentDate : calendar, (i2 & 4) != 0 ? messageDto2.messageSenderName : str, (i2 & 8) != 0 ? messageDto2.messageSenderTitle : str2, (i2 & 16) != 0 ? messageDto2.messageText : str3, (i2 & 32) != 0 ? messageDto2.messageSubject : str4, (i2 & 64) != 0 ? messageDto2.addressList : list, (i2 & 128) != 0 ? messageDto2.attachmentList : list2, (i2 & 256) != 0 ? messageDto2.previousMessageId : l);
    }

    public final long component1() {
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

    public final MessageDto copy(long j, Calendar calendar, String str, String str2, String str3, String str4, List<AddresseeDto> list, List<AttachmentDto> list2, Long l) {
        Calendar calendar2 = calendar;
        Intrinsics.checkParameterIsNotNull(calendar, "messageSentDate");
        String str5 = str;
        Intrinsics.checkParameterIsNotNull(str5, "messageSenderName");
        String str6 = str2;
        Intrinsics.checkParameterIsNotNull(str6, "messageSenderTitle");
        String str7 = str3;
        Intrinsics.checkParameterIsNotNull(str7, "messageText");
        String str8 = str4;
        Intrinsics.checkParameterIsNotNull(str8, "messageSubject");
        List<AddresseeDto> list3 = list;
        Intrinsics.checkParameterIsNotNull(list3, "addressList");
        List<AttachmentDto> list4 = list2;
        Intrinsics.checkParameterIsNotNull(list4, "attachmentList");
        MessageDto messageDto = new MessageDto(j, calendar2, str5, str6, str7, str8, list3, list4, l);
        return messageDto;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MessageDto) {
                MessageDto messageDto = (MessageDto) obj;
                if (!(this.messageId == messageDto.messageId) || !Intrinsics.areEqual((Object) this.messageSentDate, (Object) messageDto.messageSentDate) || !Intrinsics.areEqual((Object) this.messageSenderName, (Object) messageDto.messageSenderName) || !Intrinsics.areEqual((Object) this.messageSenderTitle, (Object) messageDto.messageSenderTitle) || !Intrinsics.areEqual((Object) this.messageText, (Object) messageDto.messageText) || !Intrinsics.areEqual((Object) this.messageSubject, (Object) messageDto.messageSubject) || !Intrinsics.areEqual((Object) this.addressList, (Object) messageDto.addressList) || !Intrinsics.areEqual((Object) this.attachmentList, (Object) messageDto.attachmentList) || !Intrinsics.areEqual((Object) this.previousMessageId, (Object) messageDto.previousMessageId)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final List<AddresseeDto> getAddressList() {
        return this.addressList;
    }

    public final List<AttachmentDto> getAttachmentList() {
        return this.attachmentList;
    }

    public final long getMessageId() {
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
        long j = this.messageId;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        Calendar calendar = this.messageSentDate;
        int i2 = 0;
        int hashCode = (i + (calendar != null ? calendar.hashCode() : 0)) * 31;
        String str = this.messageSenderName;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.messageSenderTitle;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.messageText;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.messageSubject;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        List<AddresseeDto> list = this.addressList;
        int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        List<AttachmentDto> list2 = this.attachmentList;
        int hashCode7 = (hashCode6 + (list2 != null ? list2.hashCode() : 0)) * 31;
        Long l = this.previousMessageId;
        if (l != null) {
            i2 = l.hashCode();
        }
        return hashCode7 + i2;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("MessageDto(messageId=");
        a.append(this.messageId);
        a.append(", messageSentDate=");
        a.append(this.messageSentDate);
        a.append(", messageSenderName=");
        a.append(this.messageSenderName);
        a.append(", messageSenderTitle=");
        a.append(this.messageSenderTitle);
        a.append(", messageText=");
        a.append(this.messageText);
        a.append(", messageSubject=");
        a.append(this.messageSubject);
        a.append(", addressList=");
        a.append(this.addressList);
        a.append(", attachmentList=");
        a.append(this.attachmentList);
        a.append(", previousMessageId=");
        a.append(this.previousMessageId);
        a.append(")");
        return a.toString();
    }
}
