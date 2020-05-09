package p289hu.ekreta.ellenorzo.rest.eadminapi;

import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p000a.p054h.p159c.p166z.C2580c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001=B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\bHÂ\u0003J\t\u00106\u001a\u00020\nHÂ\u0003J;\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u00108\u001a\u00020\u00052\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\t\u0010<\u001a\u00020\u0019HÖ\u0001R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\r8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0014R\u0010\u0010\t\u001a\u00020\n8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b#\u0010\u001bR\u0011\u0010$\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b%\u0010\u001bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0014R\u0010\u0010\u0007\u001a\u00020\b8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010'\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b(\u0010\u001bR\u0011\u0010)\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b*\u0010\u001bR\u0011\u0010+\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b,\u0010\u0017R\u0011\u0010-\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b.\u0010\u001bR\u0011\u0010/\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b0\u0010\u001bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0017¨\u0006>"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/eadminapi/MailboxItemDto;", "", "uid", "", "readByUser", "", "isDeleted", "type", "Lhu/ekreta/ellenorzo/rest/eadminapi/MailboxItemDto$Type;", "message", "Lhu/ekreta/ellenorzo/rest/eadminapi/MessageDto;", "(JZZLhu/ekreta/ellenorzo/rest/eadminapi/MailboxItemDto$Type;Lhu/ekreta/ellenorzo/rest/eadminapi/MessageDto;)V", "addressList", "", "Lhu/ekreta/ellenorzo/rest/eadminapi/AddresseeDto;", "getAddressList", "()Ljava/util/List;", "attachmentList", "Lhu/ekreta/ellenorzo/rest/eadminapi/AttachmentDto;", "getAttachmentList", "()Z", "messageId", "getMessageId", "()J", "messageSenderName", "", "getMessageSenderName", "()Ljava/lang/String;", "messageSenderTitle", "getMessageSenderTitle", "messageSentDate", "Ljava/util/Calendar;", "getMessageSentDate", "()Ljava/util/Calendar;", "messageSubject", "getMessageSubject", "messageText", "getMessageText", "getReadByUser", "typeCode", "getTypeCode", "typeDescription", "getTypeDescription", "typeId", "getTypeId", "typeName", "getTypeName", "typeShortName", "getTypeShortName", "getUid", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "Type", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.rest.eadminapi.MailboxItemDto */
/* compiled from: MailboxItemDto.kt */
public final class MailboxItemDto {
    @C2580c("isToroltElem")
    public final boolean isDeleted;
    @C2580c("uzenet")
    public final MessageDto message;
    @C2580c("isElolvasva")
    public final boolean readByUser;
    @C2580c("tipus")
    public final Type type;
    @C2580c("azonosito")
    public final long uid;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001d"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/eadminapi/MailboxItemDto$Type;", "", "typeId", "", "typeCode", "", "typeShortName", "typeName", "typeDescription", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTypeCode", "()Ljava/lang/String;", "getTypeDescription", "getTypeId", "()J", "getTypeName", "getTypeShortName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.rest.eadminapi.MailboxItemDto$Type */
    /* compiled from: MailboxItemDto.kt */
    public static final class Type {
        @C2580c("kod")
        public final String typeCode;
        @C2580c("leiras")
        public final String typeDescription;
        @C2580c("azonosito")
        public final long typeId;
        @C2580c("nev")
        public final String typeName;
        @C2580c("rovidNev")
        public final String typeShortName;

        public Type(long j, String str, String str2, String str3, String str4) {
            Intrinsics.checkParameterIsNotNull(str, "typeCode");
            Intrinsics.checkParameterIsNotNull(str2, "typeShortName");
            Intrinsics.checkParameterIsNotNull(str3, "typeName");
            Intrinsics.checkParameterIsNotNull(str4, "typeDescription");
            this.typeId = j;
            this.typeCode = str;
            this.typeShortName = str2;
            this.typeName = str3;
            this.typeDescription = str4;
        }

        public static /* synthetic */ Type copy$default(Type type, long j, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                j = type.typeId;
            }
            long j2 = j;
            if ((i & 2) != 0) {
                str = type.typeCode;
            }
            String str5 = str;
            if ((i & 4) != 0) {
                str2 = type.typeShortName;
            }
            String str6 = str2;
            if ((i & 8) != 0) {
                str3 = type.typeName;
            }
            String str7 = str3;
            if ((i & 16) != 0) {
                str4 = type.typeDescription;
            }
            return type.copy(j2, str5, str6, str7, str4);
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

        public final Type copy(long j, String str, String str2, String str3, String str4) {
            Intrinsics.checkParameterIsNotNull(str, "typeCode");
            Intrinsics.checkParameterIsNotNull(str2, "typeShortName");
            Intrinsics.checkParameterIsNotNull(str3, "typeName");
            Intrinsics.checkParameterIsNotNull(str4, "typeDescription");
            Type type = new Type(j, str, str2, str3, str4);
            return type;
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
            long j = this.typeId;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            String str = this.typeCode;
            int i2 = 0;
            int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.typeShortName;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.typeName;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.typeDescription;
            if (str4 != null) {
                i2 = str4.hashCode();
            }
            return hashCode3 + i2;
        }

        public String toString() {
            StringBuilder a = C0082a.m111a("Type(typeId=");
            a.append(this.typeId);
            a.append(", typeCode=");
            a.append(this.typeCode);
            a.append(", typeShortName=");
            a.append(this.typeShortName);
            a.append(", typeName=");
            a.append(this.typeName);
            a.append(", typeDescription=");
            return C0082a.m106a(a, this.typeDescription, ")");
        }
    }

    public MailboxItemDto(long j, boolean z, boolean z2, Type type2, MessageDto messageDto) {
        Intrinsics.checkParameterIsNotNull(type2, "type");
        Intrinsics.checkParameterIsNotNull(messageDto, "message");
        this.uid = j;
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

    public static /* synthetic */ MailboxItemDto copy$default(MailboxItemDto mailboxItemDto, long j, boolean z, boolean z2, Type type2, MessageDto messageDto, int i, Object obj) {
        if ((i & 1) != 0) {
            j = mailboxItemDto.uid;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            z = mailboxItemDto.readByUser;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            z2 = mailboxItemDto.isDeleted;
        }
        boolean z4 = z2;
        if ((i & 8) != 0) {
            type2 = mailboxItemDto.type;
        }
        Type type3 = type2;
        if ((i & 16) != 0) {
            messageDto = mailboxItemDto.message;
        }
        return mailboxItemDto.copy(j2, z3, z4, type3, messageDto);
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

    public final MailboxItemDto copy(long j, boolean z, boolean z2, Type type2, MessageDto messageDto) {
        Intrinsics.checkParameterIsNotNull(type2, "type");
        Intrinsics.checkParameterIsNotNull(messageDto, "message");
        MailboxItemDto mailboxItemDto = new MailboxItemDto(j, z, z2, type2, messageDto);
        return mailboxItemDto;
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
        return this.message.getAddressList();
    }

    public final List<AttachmentDto> getAttachmentList() {
        return this.message.getAttachmentList();
    }

    public final long getMessageId() {
        return this.message.getMessageId();
    }

    public final String getMessageSenderName() {
        return this.message.getMessageSenderName();
    }

    public final String getMessageSenderTitle() {
        return this.message.getMessageSenderTitle();
    }

    public final Calendar getMessageSentDate() {
        return this.message.getMessageSentDate();
    }

    public final String getMessageSubject() {
        return this.message.getMessageSubject();
    }

    public final String getMessageText() {
        return this.message.getMessageText();
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
        long j = this.uid;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        boolean z = this.readByUser;
        if (z) {
            z = true;
        }
        int i2 = (i + (z ? 1 : 0)) * 31;
        boolean z2 = this.isDeleted;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        Type type2 = this.type;
        int i4 = 0;
        int hashCode = (i3 + (type2 != null ? type2.hashCode() : 0)) * 31;
        MessageDto messageDto = this.message;
        if (messageDto != null) {
            i4 = messageDto.hashCode();
        }
        return hashCode + i4;
    }

    public final boolean isDeleted() {
        return this.isDeleted;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("MailboxItemDto(uid=");
        a.append(this.uid);
        a.append(", readByUser=");
        a.append(this.readByUser);
        a.append(", isDeleted=");
        a.append(this.isDeleted);
        a.append(", type=");
        a.append(this.type);
        a.append(", message=");
        a.append(this.message);
        a.append(")");
        return a.toString();
    }
}
