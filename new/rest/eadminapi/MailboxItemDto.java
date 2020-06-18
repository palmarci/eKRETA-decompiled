package hu.ekreta.ellenorzo.rest.eadminapi;

import a.b.a.a.a;
import a.h.c.z.c;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001=B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\bHÂ\u0003J\t\u00106\u001a\u00020\nHÂ\u0003J;\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u00108\u001a\u00020\u00052\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\t\u0010<\u001a\u00020\u0019HÖ\u0001R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\r8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0014R\u0010\u0010\t\u001a\u00020\n8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b#\u0010\u001bR\u0011\u0010$\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b%\u0010\u001bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0014R\u0010\u0010\u0007\u001a\u00020\b8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010'\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b(\u0010\u001bR\u0011\u0010)\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b*\u0010\u001bR\u0011\u0010+\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b,\u0010\u0017R\u0011\u0010-\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b.\u0010\u001bR\u0011\u0010/\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b0\u0010\u001bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0017¨\u0006>"}, d2 = {"Lhu/ekreta/ellenorzo/rest/eadminapi/MailboxItemDto;", "", "uid", "", "readByUser", "", "isDeleted", "type", "Lhu/ekreta/ellenorzo/rest/eadminapi/MailboxItemDto$Type;", "message", "Lhu/ekreta/ellenorzo/rest/eadminapi/MessageDto;", "(JZZLhu/ekreta/ellenorzo/rest/eadminapi/MailboxItemDto$Type;Lhu/ekreta/ellenorzo/rest/eadminapi/MessageDto;)V", "addressList", "", "Lhu/ekreta/ellenorzo/rest/eadminapi/AddresseeDto;", "getAddressList", "()Ljava/util/List;", "attachmentList", "Lhu/ekreta/ellenorzo/rest/eadminapi/AttachmentDto;", "getAttachmentList", "()Z", "messageId", "getMessageId", "()J", "messageSenderName", "", "getMessageSenderName", "()Ljava/lang/String;", "messageSenderTitle", "getMessageSenderTitle", "messageSentDate", "Ljava/util/Calendar;", "getMessageSentDate", "()Ljava/util/Calendar;", "messageSubject", "getMessageSubject", "messageText", "getMessageText", "getReadByUser", "typeCode", "getTypeCode", "typeDescription", "getTypeDescription", "typeId", "getTypeId", "typeName", "getTypeName", "typeShortName", "getTypeShortName", "getUid", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "Type", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: MailboxItemDto.kt */
public final class MailboxItemDto {
    @c("isToroltElem")
    public final boolean isDeleted;
    @c("uzenet")
    public final MessageDto message;
    @c("isElolvasva")
    public final boolean readByUser;
    @c("tipus")
    public final Type type;
    @c("azonosito")
    public final long uid;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001d"}, d2 = {"Lhu/ekreta/ellenorzo/rest/eadminapi/MailboxItemDto$Type;", "", "typeId", "", "typeCode", "", "typeShortName", "typeName", "typeDescription", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTypeCode", "()Ljava/lang/String;", "getTypeDescription", "getTypeId", "()J", "getTypeName", "getTypeShortName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: MailboxItemDto.kt */
    public static final class Type {
        @c("kod")
        public final String typeCode;
        @c("leiras")
        public final String typeDescription;
        @c("azonosito")
        public final long typeId;
        @c("nev")
        public final String typeName;
        @c("rovidNev")
        public final String typeShortName;

        public Type(long j2, String str, String str2, String str3, String str4) {
            Intrinsics.checkParameterIsNotNull(str, "typeCode");
            Intrinsics.checkParameterIsNotNull(str2, "typeShortName");
            Intrinsics.checkParameterIsNotNull(str3, "typeName");
            Intrinsics.checkParameterIsNotNull(str4, "typeDescription");
            this.typeId = j2;
            this.typeCode = str;
            this.typeShortName = str2;
            this.typeName = str3;
            this.typeDescription = str4;
        }

        public static /* synthetic */ Type copy$default(Type type, long j2, String str, String str2, String str3, String str4, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                j2 = type.typeId;
            }
            long j3 = j2;
            if ((i2 & 2) != 0) {
                str = type.typeCode;
            }
            String str5 = str;
            if ((i2 & 4) != 0) {
                str2 = type.typeShortName;
            }
            String str6 = str2;
            if ((i2 & 8) != 0) {
                str3 = type.typeName;
            }
            String str7 = str3;
            if ((i2 & 16) != 0) {
                str4 = type.typeDescription;
            }
            return type.copy(j3, str5, str6, str7, str4);
        }

        public final long component1() {
            return this.typeId;
        }

        public final String component2() {
            return this.typeCode;
        }

        public final String component3() {
            return this.typeShortName;
        }

        public final String component4() {
            return this.typeName;
        }

        public final String component5() {
            return this.typeDescription;
        }

        public final Type copy(long j2, String str, String str2, String str3, String str4) {
            Intrinsics.checkParameterIsNotNull(str, "typeCode");
            Intrinsics.checkParameterIsNotNull(str2, "typeShortName");
            Intrinsics.checkParameterIsNotNull(str3, "typeName");
            Intrinsics.checkParameterIsNotNull(str4, "typeDescription");
            return new Type(j2, str, str2, str3, str4);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Type) {
                    Type type = (Type) obj;
                    if (!(this.typeId == type.typeId) || !Intrinsics.areEqual((Object) this.typeCode, (Object) type.typeCode) || !Intrinsics.areEqual((Object) this.typeShortName, (Object) type.typeShortName) || !Intrinsics.areEqual((Object) this.typeName, (Object) type.typeName) || !Intrinsics.areEqual((Object) this.typeDescription, (Object) type.typeDescription)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final String getTypeCode() {
            return this.typeCode;
        }

        public final String getTypeDescription() {
            return this.typeDescription;
        }

        public final long getTypeId() {
            return this.typeId;
        }

        public final String getTypeName() {
            return this.typeName;
        }

        public final String getTypeShortName() {
            return this.typeShortName;
        }

        public int hashCode() {
            long j2 = this.typeId;
            int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
            String str = this.typeCode;
            int i3 = 0;
            int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.typeShortName;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.typeName;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.typeDescription;
            if (str4 != null) {
                i3 = str4.hashCode();
            }
            return hashCode3 + i3;
        }

        public String toString() {
            StringBuilder a2 = a.a("Type(typeId=");
            a2.append(this.typeId);
            a2.append(", typeCode=");
            a2.append(this.typeCode);
            a2.append(", typeShortName=");
            a2.append(this.typeShortName);
            a2.append(", typeName=");
            a2.append(this.typeName);
            a2.append(", typeDescription=");
            return a.a(a2, this.typeDescription, ")");
        }
    }

    public MailboxItemDto(long j2, boolean z, boolean z2, Type type2, MessageDto messageDto) {
        Intrinsics.checkParameterIsNotNull(type2, "type");
        Intrinsics.checkParameterIsNotNull(messageDto, "message");
        this.uid = j2;
        this.readByUser = z;
        this.isDeleted = z2;
        this.type = type2;
        this.message = messageDto;
    }

    private final Type component4() {
        return this.type;
    }

    private final MessageDto component5() {
        return this.message;
    }

    public static /* synthetic */ MailboxItemDto copy$default(MailboxItemDto mailboxItemDto, long j2, boolean z, boolean z2, Type type2, MessageDto messageDto, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = mailboxItemDto.uid;
        }
        long j3 = j2;
        if ((i2 & 2) != 0) {
            z = mailboxItemDto.readByUser;
        }
        boolean z3 = z;
        if ((i2 & 4) != 0) {
            z2 = mailboxItemDto.isDeleted;
        }
        boolean z4 = z2;
        if ((i2 & 8) != 0) {
            type2 = mailboxItemDto.type;
        }
        Type type3 = type2;
        if ((i2 & 16) != 0) {
            messageDto = mailboxItemDto.message;
        }
        return mailboxItemDto.copy(j3, z3, z4, type3, messageDto);
    }

    public final long component1() {
        return this.uid;
    }

    public final boolean component2() {
        return this.readByUser;
    }

    public final boolean component3() {
        return this.isDeleted;
    }

    public final MailboxItemDto copy(long j2, boolean z, boolean z2, Type type2, MessageDto messageDto) {
        Intrinsics.checkParameterIsNotNull(type2, "type");
        Intrinsics.checkParameterIsNotNull(messageDto, "message");
        return new MailboxItemDto(j2, z, z2, type2, messageDto);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MailboxItemDto) {
                MailboxItemDto mailboxItemDto = (MailboxItemDto) obj;
                if (this.uid == mailboxItemDto.uid) {
                    if (this.readByUser == mailboxItemDto.readByUser) {
                        if (!(this.isDeleted == mailboxItemDto.isDeleted) || !Intrinsics.areEqual((Object) this.type, (Object) mailboxItemDto.type) || !Intrinsics.areEqual((Object) this.message, (Object) mailboxItemDto.message)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final List<AddresseeDto> getAddressList() {
        List<AddresseeDto> addressList = this.message.getAddressList();
        return addressList != null ? addressList : CollectionsKt__CollectionsKt.emptyList();
    }

    public final List<AttachmentDto> getAttachmentList() {
        List<AttachmentDto> attachmentList = this.message.getAttachmentList();
        return attachmentList != null ? attachmentList : CollectionsKt__CollectionsKt.emptyList();
    }

    public final long getMessageId() {
        Long messageId = this.message.getMessageId();
        if (messageId != null) {
            return messageId.longValue();
        }
        return -1;
    }

    public final String getMessageSenderName() {
        String messageSenderName = this.message.getMessageSenderName();
        return messageSenderName != null ? messageSenderName : "";
    }

    public final String getMessageSenderTitle() {
        String messageSenderTitle = this.message.getMessageSenderTitle();
        return messageSenderTitle != null ? messageSenderTitle : "";
    }

    public final Calendar getMessageSentDate() {
        Calendar messageSentDate = this.message.getMessageSentDate();
        if (messageSentDate != null) {
            return messageSentDate;
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(0);
        Intrinsics.checkExpressionValueIsNotNull(instance, "Calendar.getInstance().apply { timeInMillis = 0 }");
        return instance;
    }

    public final String getMessageSubject() {
        String messageSubject = this.message.getMessageSubject();
        return messageSubject != null ? messageSubject : "";
    }

    public final String getMessageText() {
        String messageText = this.message.getMessageText();
        return messageText != null ? messageText : "";
    }

    public final boolean getReadByUser() {
        return this.readByUser;
    }

    public final String getTypeCode() {
        return this.type.getTypeCode();
    }

    public final String getTypeDescription() {
        return this.type.getTypeDescription();
    }

    public final long getTypeId() {
        return this.type.getTypeId();
    }

    public final String getTypeName() {
        return this.type.getTypeName();
    }

    public final String getTypeShortName() {
        return this.type.getTypeShortName();
    }

    public final long getUid() {
        return this.uid;
    }

    public int hashCode() {
        long j2 = this.uid;
        int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        boolean z = this.readByUser;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z2 = this.isDeleted;
        if (z2) {
            z2 = true;
        }
        int i4 = (i3 + (z2 ? 1 : 0)) * 31;
        Type type2 = this.type;
        int i5 = 0;
        int hashCode = (i4 + (type2 != null ? type2.hashCode() : 0)) * 31;
        MessageDto messageDto = this.message;
        if (messageDto != null) {
            i5 = messageDto.hashCode();
        }
        return hashCode + i5;
    }

    public final boolean isDeleted() {
        return this.isDeleted;
    }

    public String toString() {
        StringBuilder a2 = a.a("MailboxItemDto(uid=");
        a2.append(this.uid);
        a2.append(", readByUser=");
        a2.append(this.readByUser);
        a2.append(", isDeleted=");
        a2.append(this.isDeleted);
        a2.append(", type=");
        a2.append(this.type);
        a2.append(", message=");
        a2.append(this.message);
        a2.append(")");
        return a2.toString();
    }
}
