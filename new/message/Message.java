package hu.ekreta.ellenorzo.message;

import a.b.a.a.a;
import android.os.Parcel;
import android.os.Parcelable;
import hu.ekreta.ellenorzo.attachment.Attachment;
import hu.ekreta.ellenorzo.util.mapper.ReadableByUserModel;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001]B±\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001a¢\u0006\u0002\u0010\u001eJ\t\u0010<\u001a\u00020\u0004HÆ\u0003J\t\u0010=\u001a\u00020\u0004HÆ\u0003J\t\u0010>\u001a\u00020\u0004HÆ\u0003J\t\u0010?\u001a\u00020\u0007HÆ\u0003J\t\u0010@\u001a\u00020\u0014HÆ\u0003J\t\u0010A\u001a\u00020\u0004HÆ\u0003J\t\u0010B\u001a\u00020\u0004HÆ\u0003J\t\u0010C\u001a\u00020\u0004HÆ\u0003J\t\u0010D\u001a\u00020\u0004HÆ\u0003J\u000f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aHÆ\u0003J\u000f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001aHÆ\u0003J\t\u0010G\u001a\u00020\u0004HÆ\u0003J\t\u0010H\u001a\u00020\u0007HÆ\u0003J\u0010\u0010I\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u00103J\t\u0010J\u001a\u00020\tHÆ\u0003J\t\u0010K\u001a\u00020\tHÆ\u0003J\t\u0010L\u001a\u00020\rHÆ\u0003J\t\u0010M\u001a\u00020\u0004HÆ\u0003J\t\u0010N\u001a\u00020\u0004HÆ\u0003JÚ\u0001\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00042\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001aHÆ\u0001¢\u0006\u0002\u0010PJ\b\u0010Q\u001a\u00020RH\u0016J\u0013\u0010S\u001a\u00020\t2\b\u0010T\u001a\u0004\u0018\u00010UHÖ\u0003J\t\u0010V\u001a\u00020RHÖ\u0001J\t\u0010W\u001a\u00020\u0004HÖ\u0001J\u0019\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020RHÖ\u0001R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001a¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010%R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010%R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0012\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0011\u0010\u0015\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010#R\u0011\u0010*\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010#R\u0011\u0010\u0016\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010#R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0018\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0011\u0010\u0017\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010#R\u0018\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\n\n\u0002\u00104\u001a\u0004\b2\u00103R\u0011\u0010\u000e\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010#R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010#R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u0010\u0010\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010#R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010#R\u0014\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010#¨\u0006^"}, d2 = {"Lhu/ekreta/ellenorzo/message/Message;", "Lhu/ekreta/ellenorzo/util/mapper/ReadableByUserModel;", "Landroid/os/Parcelable;", "profileId", "", "uid", "mailboxItemId", "", "readByUser", "", "isDeleted", "isComplete", "typeId", "Lhu/ekreta/ellenorzo/message/Message$MessageType;", "typeCode", "typeShortName", "typeName", "typeDescription", "messageId", "messageSentDate", "Ljava/util/Calendar;", "messageSenderName", "messageSenderTitle", "messageText", "messageSubject", "addresseeList", "", "Lhu/ekreta/ellenorzo/message/Addressee;", "attachmentList", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Boolean;ZZLhu/ekreta/ellenorzo/message/Message$MessageType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/Calendar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getAddresseeList", "()Ljava/util/List;", "addresseeNames", "getAddresseeNames", "()Ljava/lang/String;", "getAttachmentList", "()Z", "getMailboxItemId", "()J", "getMessageId", "getMessageSenderName", "messageSenderNameAndType", "getMessageSenderNameAndType", "getMessageSenderTitle", "getMessageSentDate", "()Ljava/util/Calendar;", "getMessageSubject", "getMessageText", "getProfileId", "getReadByUser", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTypeCode", "getTypeDescription", "getTypeId", "()Lhu/ekreta/ellenorzo/message/Message$MessageType;", "getTypeName", "getTypeShortName", "getUid", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Boolean;ZZLhu/ekreta/ellenorzo/message/Message$MessageType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/Calendar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lhu/ekreta/ellenorzo/message/Message;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "MessageType", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: Message.kt */
public final class Message implements ReadableByUserModel, Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    public final String c;
    public final String e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final String f5769g;

    /* renamed from: h  reason: collision with root package name */
    public final long f5770h;

    /* renamed from: i  reason: collision with root package name */
    public final Boolean f5771i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f5772j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f5773k;

    /* renamed from: l  reason: collision with root package name */
    public final MessageType f5774l;

    /* renamed from: m  reason: collision with root package name */
    public final String f5775m;

    /* renamed from: n  reason: collision with root package name */
    public final String f5776n;

    /* renamed from: o  reason: collision with root package name */
    public final String f5777o;

    /* renamed from: p  reason: collision with root package name */
    public final String f5778p;

    /* renamed from: q  reason: collision with root package name */
    public final long f5779q;
    public final Calendar r;
    public final String s;
    public final String t;
    public final String u;
    public final String v;
    public final List<Addressee> w;
    public final List<Attachment> x;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static class Creator implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Boolean bool;
            Parcel parcel2 = parcel;
            Intrinsics.checkParameterIsNotNull(parcel2, "in");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            long readLong = parcel.readLong();
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool = null;
            }
            Boolean bool2 = bool;
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            MessageType messageType = (MessageType) Enum.valueOf(MessageType.class, parcel.readString());
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            long readLong2 = parcel.readLong();
            Calendar calendar = (Calendar) parcel.readSerializable();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((Addressee) Addressee.CREATOR.createFromParcel(parcel2));
                readInt--;
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (true) {
                ArrayList arrayList3 = arrayList;
                if (readInt2 != 0) {
                    arrayList2.add((Attachment) Attachment.CREATOR.createFromParcel(parcel2));
                    readInt2--;
                    arrayList = arrayList3;
                } else {
                    return new Message(readString, readString2, readLong, bool2, z, z2, messageType, readString3, readString4, readString5, readString6, readLong2, calendar, readString7, readString8, readString9, readString10, arrayList3, arrayList2);
                }
            }
        }

        public final Object[] newArray(int i2) {
            return new Message[i2];
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lhu/ekreta/ellenorzo/message/Message$MessageType;", "", "value", "", "(Ljava/lang/String;IJ)V", "getValue", "()J", "INCOMING", "OUTGOING", "Companion", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: Message.kt */
    public enum MessageType {
        INCOMING(1),
        OUTGOING(2);
        
        public static final Companion Companion = null;
        public static final Lazy f = null;
        public final long c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005R'\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lhu/ekreta/ellenorzo/message/Message$MessageType$Companion;", "", "()V", "map", "", "", "Lhu/ekreta/ellenorzo/message/Message$MessageType;", "getMap", "()Ljava/util/Map;", "map$delegate", "Lkotlin/Lazy;", "parse", "value", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
        /* compiled from: Message.kt */
        public static final class Companion {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ KProperty[] f5780a = null;

            static {
                f5780a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "map", "getMap()Ljava/util/Map;"))};
            }

            public Companion() {
            }

            public final MessageType a(long j2) {
                Lazy access$getMap$cp = MessageType.f;
                Companion companion = MessageType.Companion;
                KProperty kProperty = f5780a[0];
                MessageType messageType = (MessageType) ((Map) access$getMap$cp.getValue()).get(Long.valueOf(j2));
                return messageType != null ? messageType : MessageType.INCOMING;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new Companion((DefaultConstructorMarker) null);
            f = LazyKt__LazyJVMKt.lazy(Message$MessageType$Companion$map$2.INSTANCE);
        }

        /* access modifiers changed from: public */
        MessageType(long j2) {
            this.c = j2;
        }

        public final long a() {
            return this.c;
        }
    }

    public Message(String str, String str2, long j2, Boolean bool, boolean z, boolean z2, MessageType messageType, String str3, String str4, String str5, String str6, long j3, Calendar calendar, String str7, String str8, String str9, String str10, List<Addressee> list, List<Attachment> list2) {
        String str11 = str;
        String str12 = str2;
        MessageType messageType2 = messageType;
        String str13 = str3;
        String str14 = str4;
        String str15 = str5;
        String str16 = str6;
        Calendar calendar2 = calendar;
        String str17 = str7;
        String str18 = str8;
        String str19 = str9;
        String str20 = str10;
        List<Addressee> list3 = list;
        List<Attachment> list4 = list2;
        Intrinsics.checkParameterIsNotNull(str11, "profileId");
        Intrinsics.checkParameterIsNotNull(str12, "uid");
        Intrinsics.checkParameterIsNotNull(messageType2, "typeId");
        Intrinsics.checkParameterIsNotNull(str13, "typeCode");
        Intrinsics.checkParameterIsNotNull(str14, "typeShortName");
        Intrinsics.checkParameterIsNotNull(str15, "typeName");
        Intrinsics.checkParameterIsNotNull(str16, "typeDescription");
        Intrinsics.checkParameterIsNotNull(calendar2, "messageSentDate");
        Intrinsics.checkParameterIsNotNull(str17, "messageSenderName");
        Intrinsics.checkParameterIsNotNull(str18, "messageSenderTitle");
        Intrinsics.checkParameterIsNotNull(str19, "messageText");
        Intrinsics.checkParameterIsNotNull(str20, "messageSubject");
        Intrinsics.checkParameterIsNotNull(list3, "addresseeList");
        Intrinsics.checkParameterIsNotNull(list4, "attachmentList");
        this.f = str11;
        this.f5769g = str12;
        this.f5770h = j2;
        this.f5771i = bool;
        this.f5772j = z;
        this.f5773k = z2;
        this.f5774l = messageType2;
        this.f5775m = str13;
        this.f5776n = str14;
        this.f5777o = str15;
        this.f5778p = str16;
        this.f5779q = j3;
        this.r = calendar2;
        this.s = str17;
        this.t = str18;
        this.u = str19;
        this.v = str20;
        this.w = list3;
        this.x = list4;
        this.c = this.s + " (" + this.t + ')';
        this.e = CollectionsKt___CollectionsKt.joinToString$default(this.w, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, Message$addresseeNames$1.INSTANCE, 31, (Object) null);
    }

    public static /* synthetic */ Message copy$default(Message message, String str, String str2, long j2, Boolean bool, boolean z, boolean z2, MessageType messageType, String str3, String str4, String str5, String str6, long j3, Calendar calendar, String str7, String str8, String str9, String str10, List list, List list2, int i2, Object obj) {
        Message message2 = message;
        int i3 = i2;
        return message.a((i3 & 1) != 0 ? message.e() : str, (i3 & 2) != 0 ? message.d() : str2, (i3 & 4) != 0 ? message2.f5770h : j2, (i3 & 8) != 0 ? message.q() : bool, (i3 & 16) != 0 ? message2.f5772j : z, (i3 & 32) != 0 ? message2.f5773k : z2, (i3 & 64) != 0 ? message2.f5774l : messageType, (i3 & 128) != 0 ? message2.f5775m : str3, (i3 & 256) != 0 ? message2.f5776n : str4, (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? message2.f5777o : str5, (i3 & 1024) != 0 ? message2.f5778p : str6, (i3 & 2048) != 0 ? message2.f5779q : j3, (i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? message2.r : calendar, (i3 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? message2.s : str7, (i3 & 16384) != 0 ? message2.t : str8, (i3 & 32768) != 0 ? message2.u : str9, (i3 & 65536) != 0 ? message2.v : str10, (i3 & 131072) != 0 ? message2.w : list, (i3 & 262144) != 0 ? message2.x : list2);
    }

    public final Message a(String str, String str2, long j2, Boolean bool, boolean z, boolean z2, MessageType messageType, String str3, String str4, String str5, String str6, long j3, Calendar calendar, String str7, String str8, String str9, String str10, List<Addressee> list, List<Attachment> list2) {
        String str11 = str;
        Intrinsics.checkParameterIsNotNull(str11, "profileId");
        Intrinsics.checkParameterIsNotNull(str2, "uid");
        Intrinsics.checkParameterIsNotNull(messageType, "typeId");
        Intrinsics.checkParameterIsNotNull(str3, "typeCode");
        Intrinsics.checkParameterIsNotNull(str4, "typeShortName");
        Intrinsics.checkParameterIsNotNull(str5, "typeName");
        Intrinsics.checkParameterIsNotNull(str6, "typeDescription");
        Intrinsics.checkParameterIsNotNull(calendar, "messageSentDate");
        Intrinsics.checkParameterIsNotNull(str7, "messageSenderName");
        Intrinsics.checkParameterIsNotNull(str8, "messageSenderTitle");
        Intrinsics.checkParameterIsNotNull(str9, "messageText");
        Intrinsics.checkParameterIsNotNull(str10, "messageSubject");
        Intrinsics.checkParameterIsNotNull(list, "addresseeList");
        Intrinsics.checkParameterIsNotNull(list2, "attachmentList");
        return new Message(str11, str2, j2, bool, z, z2, messageType, str3, str4, str5, str6, j3, calendar, str7, str8, str9, str10, list, list2);
    }

    public String d() {
        return this.f5769g;
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Message) {
                Message message = (Message) obj;
                if (Intrinsics.areEqual((Object) e(), (Object) message.e()) && Intrinsics.areEqual((Object) d(), (Object) message.d())) {
                    if ((this.f5770h == message.f5770h) && Intrinsics.areEqual((Object) q(), (Object) message.q())) {
                        if (this.f5772j == message.f5772j) {
                            if ((this.f5773k == message.f5773k) && Intrinsics.areEqual((Object) this.f5774l, (Object) message.f5774l) && Intrinsics.areEqual((Object) this.f5775m, (Object) message.f5775m) && Intrinsics.areEqual((Object) this.f5776n, (Object) message.f5776n) && Intrinsics.areEqual((Object) this.f5777o, (Object) message.f5777o) && Intrinsics.areEqual((Object) this.f5778p, (Object) message.f5778p)) {
                                if (!(this.f5779q == message.f5779q) || !Intrinsics.areEqual((Object) this.r, (Object) message.r) || !Intrinsics.areEqual((Object) this.s, (Object) message.s) || !Intrinsics.areEqual((Object) this.t, (Object) message.t) || !Intrinsics.areEqual((Object) this.u, (Object) message.u) || !Intrinsics.areEqual((Object) this.v, (Object) message.v) || !Intrinsics.areEqual((Object) this.w, (Object) message.w) || !Intrinsics.areEqual((Object) this.x, (Object) message.x)) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final List<Addressee> f() {
        return this.w;
    }

    public final String g() {
        return this.e;
    }

    public final List<Attachment> h() {
        return this.x;
    }

    public int hashCode() {
        String e2 = e();
        int i2 = 0;
        int hashCode = (e2 != null ? e2.hashCode() : 0) * 31;
        String d2 = d();
        int hashCode2 = d2 != null ? d2.hashCode() : 0;
        long j2 = this.f5770h;
        int i3 = (((hashCode + hashCode2) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        Boolean q2 = q();
        int hashCode3 = (i3 + (q2 != null ? q2.hashCode() : 0)) * 31;
        boolean z = this.f5772j;
        if (z) {
            z = true;
        }
        int i4 = (hashCode3 + (z ? 1 : 0)) * 31;
        boolean z2 = this.f5773k;
        if (z2) {
            z2 = true;
        }
        int i5 = (i4 + (z2 ? 1 : 0)) * 31;
        MessageType messageType = this.f5774l;
        int hashCode4 = (i5 + (messageType != null ? messageType.hashCode() : 0)) * 31;
        String str = this.f5775m;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5776n;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f5777o;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f5778p;
        int hashCode8 = str4 != null ? str4.hashCode() : 0;
        long j3 = this.f5779q;
        int i6 = (((hashCode7 + hashCode8) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        Calendar calendar = this.r;
        int hashCode9 = (i6 + (calendar != null ? calendar.hashCode() : 0)) * 31;
        String str5 = this.s;
        int hashCode10 = (hashCode9 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.t;
        int hashCode11 = (hashCode10 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.u;
        int hashCode12 = (hashCode11 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.v;
        int hashCode13 = (hashCode12 + (str8 != null ? str8.hashCode() : 0)) * 31;
        List<Addressee> list = this.w;
        int hashCode14 = (hashCode13 + (list != null ? list.hashCode() : 0)) * 31;
        List<Attachment> list2 = this.x;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode14 + i2;
    }

    public final long i() {
        return this.f5770h;
    }

    public final long j() {
        return this.f5779q;
    }

    public final String k() {
        return this.s;
    }

    public final String l() {
        return this.c;
    }

    public final String m() {
        return this.t;
    }

    public final Calendar n() {
        return this.r;
    }

    public final String o() {
        return this.v;
    }

    public final String p() {
        return this.u;
    }

    public Boolean q() {
        return this.f5771i;
    }

    public final String r() {
        return this.f5775m;
    }

    public final String s() {
        return this.f5778p;
    }

    public final MessageType t() {
        return this.f5774l;
    }

    public String toString() {
        StringBuilder a2 = a.a("Message(profileId=");
        a2.append(e());
        a2.append(", uid=");
        a2.append(d());
        a2.append(", mailboxItemId=");
        a2.append(this.f5770h);
        a2.append(", readByUser=");
        a2.append(q());
        a2.append(", isDeleted=");
        a2.append(this.f5772j);
        a2.append(", isComplete=");
        a2.append(this.f5773k);
        a2.append(", typeId=");
        a2.append(this.f5774l);
        a2.append(", typeCode=");
        a2.append(this.f5775m);
        a2.append(", typeShortName=");
        a2.append(this.f5776n);
        a2.append(", typeName=");
        a2.append(this.f5777o);
        a2.append(", typeDescription=");
        a2.append(this.f5778p);
        a2.append(", messageId=");
        a2.append(this.f5779q);
        a2.append(", messageSentDate=");
        a2.append(this.r);
        a2.append(", messageSenderName=");
        a2.append(this.s);
        a2.append(", messageSenderTitle=");
        a2.append(this.t);
        a2.append(", messageText=");
        a2.append(this.u);
        a2.append(", messageSubject=");
        a2.append(this.v);
        a2.append(", addresseeList=");
        a2.append(this.w);
        a2.append(", attachmentList=");
        return a.a(a2, (List) this.x, ")");
    }

    public final String u() {
        return this.f5777o;
    }

    public final String v() {
        return this.f5776n;
    }

    public final boolean w() {
        return this.f5773k;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.f);
        parcel.writeString(this.f5769g);
        parcel.writeLong(this.f5770h);
        Boolean bool = this.f5771i;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.f5772j ? 1 : 0);
        parcel.writeInt(this.f5773k ? 1 : 0);
        parcel.writeString(this.f5774l.name());
        parcel.writeString(this.f5775m);
        parcel.writeString(this.f5776n);
        parcel.writeString(this.f5777o);
        parcel.writeString(this.f5778p);
        parcel.writeLong(this.f5779q);
        parcel.writeSerializable(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeString(this.u);
        parcel.writeString(this.v);
        List<Addressee> list = this.w;
        parcel.writeInt(list.size());
        for (Addressee writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
        List<Attachment> list2 = this.x;
        parcel.writeInt(list2.size());
        for (Attachment writeToParcel2 : list2) {
            writeToParcel2.writeToParcel(parcel, 0);
        }
    }

    public final boolean x() {
        return this.f5772j;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Message(String str, String str2, long j2, Boolean bool, boolean z, boolean z2, MessageType messageType, String str3, String str4, String str5, String str6, long j3, Calendar calendar, String str7, String str8, String str9, String str10, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j2, (i2 & 8) != 0 ? false : bool, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? false : z2, messageType, str3, str4, str5, str6, j3, calendar, str7, str8, str9, str10, list, list2);
    }
}
