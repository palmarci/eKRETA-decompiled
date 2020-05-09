package p289hu.ekreta.ellenorzo.message;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.p349io.ConstantsKt;
import kotlin.reflect.KProperty;
import p000a.p020b.p021a.p022a.C0082a;
import p289hu.ekreta.ellenorzo.attachment.Attachment;
import p289hu.ekreta.ellenorzo.util.mapper.ReadableByUserModel;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001]B±\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001a¢\u0006\u0002\u0010\u001eJ\t\u0010<\u001a\u00020\u0004HÆ\u0003J\t\u0010=\u001a\u00020\u0004HÆ\u0003J\t\u0010>\u001a\u00020\u0004HÆ\u0003J\t\u0010?\u001a\u00020\u0007HÆ\u0003J\t\u0010@\u001a\u00020\u0014HÆ\u0003J\t\u0010A\u001a\u00020\u0004HÆ\u0003J\t\u0010B\u001a\u00020\u0004HÆ\u0003J\t\u0010C\u001a\u00020\u0004HÆ\u0003J\t\u0010D\u001a\u00020\u0004HÆ\u0003J\u000f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aHÆ\u0003J\u000f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001aHÆ\u0003J\t\u0010G\u001a\u00020\u0004HÆ\u0003J\t\u0010H\u001a\u00020\u0007HÆ\u0003J\u0010\u0010I\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u00103J\t\u0010J\u001a\u00020\tHÆ\u0003J\t\u0010K\u001a\u00020\tHÆ\u0003J\t\u0010L\u001a\u00020\rHÆ\u0003J\t\u0010M\u001a\u00020\u0004HÆ\u0003J\t\u0010N\u001a\u00020\u0004HÆ\u0003JÚ\u0001\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00042\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001aHÆ\u0001¢\u0006\u0002\u0010PJ\b\u0010Q\u001a\u00020RH\u0016J\u0013\u0010S\u001a\u00020\t2\b\u0010T\u001a\u0004\u0018\u00010UHÖ\u0003J\t\u0010V\u001a\u00020RHÖ\u0001J\t\u0010W\u001a\u00020\u0004HÖ\u0001J\u0019\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020RHÖ\u0001R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001a¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010%R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010%R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0012\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0011\u0010\u0015\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010#R\u0011\u0010*\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010#R\u0011\u0010\u0016\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010#R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0018\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0011\u0010\u0017\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010#R\u0018\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\n\n\u0002\u00104\u001a\u0004\b2\u00103R\u0011\u0010\u000e\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010#R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010#R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u0010\u0010\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010#R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010#R\u0014\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010#¨\u0006^"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/message/Message;", "Lhu/ekreta/ellenorzo/util/mapper/ReadableByUserModel;", "Landroid/os/Parcelable;", "profileId", "", "uid", "mailboxItemId", "", "readByUser", "", "isDeleted", "isComplete", "typeId", "Lhu/ekreta/ellenorzo/message/Message$MessageType;", "typeCode", "typeShortName", "typeName", "typeDescription", "messageId", "messageSentDate", "Ljava/util/Calendar;", "messageSenderName", "messageSenderTitle", "messageText", "messageSubject", "addresseeList", "", "Lhu/ekreta/ellenorzo/message/Addressee;", "attachmentList", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Boolean;ZZLhu/ekreta/ellenorzo/message/Message$MessageType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/Calendar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getAddresseeList", "()Ljava/util/List;", "addresseeNames", "getAddresseeNames", "()Ljava/lang/String;", "getAttachmentList", "()Z", "getMailboxItemId", "()J", "getMessageId", "getMessageSenderName", "messageSenderNameAndType", "getMessageSenderNameAndType", "getMessageSenderTitle", "getMessageSentDate", "()Ljava/util/Calendar;", "getMessageSubject", "getMessageText", "getProfileId", "getReadByUser", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTypeCode", "getTypeDescription", "getTypeId", "()Lhu/ekreta/ellenorzo/message/Message$MessageType;", "getTypeName", "getTypeShortName", "getUid", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Boolean;ZZLhu/ekreta/ellenorzo/message/Message$MessageType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/Calendar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lhu/ekreta/ellenorzo/message/Message;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "MessageType", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.message.Message */
/* compiled from: Message.kt */
public final class Message implements ReadableByUserModel, Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new Creator();

    /* renamed from: c */
    public final String f13793c;

    /* renamed from: e */
    public final String f13794e;

    /* renamed from: f */
    public final String f13795f;

    /* renamed from: g */
    public final String f13796g;

    /* renamed from: h */
    public final long f13797h;

    /* renamed from: i */
    public final Boolean f13798i;

    /* renamed from: j */
    public final boolean f13799j;

    /* renamed from: k */
    public final boolean f13800k;

    /* renamed from: l */
    public final MessageType f13801l;

    /* renamed from: m */
    public final String f13802m;

    /* renamed from: n */
    public final String f13803n;

    /* renamed from: o */
    public final String f13804o;

    /* renamed from: p */
    public final String f13805p;

    /* renamed from: q */
    public final long f13806q;

    /* renamed from: r */
    public final Calendar f13807r;

    /* renamed from: s */
    public final String f13808s;

    /* renamed from: t */
    public final String f13809t;

    /* renamed from: u */
    public final String f13810u;

    /* renamed from: v */
    public final String f13811v;

    /* renamed from: w */
    public final List<Addressee> f13812w;

    /* renamed from: x */
    public final List<Attachment> f13813x;

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.message.Message$Creator */
    public static class Creator implements android.os.Parcelable.Creator {
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
                    Message message = new Message(readString, readString2, readLong, bool2, z, z2, messageType, readString3, readString4, readString5, readString6, readLong2, calendar, readString7, readString8, readString9, readString10, arrayList3, arrayList2);
                    return message;
                }
            }
        }

        public final Object[] newArray(int i) {
            return new Message[i];
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/message/Message$MessageType;", "", "value", "", "(Ljava/lang/String;IJ)V", "getValue", "()J", "INCOMING", "OUTGOING", "Companion", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.message.Message$MessageType */
    /* compiled from: Message.kt */
    public enum MessageType {
        INCOMING(1),
        OUTGOING(2);
        
        public static final Companion Companion = null;

        /* renamed from: f */
        public static final Lazy f13815f = null;

        /* renamed from: c */
        public final long f13816c;

        @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005R'\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/message/Message$MessageType$Companion;", "", "()V", "map", "", "", "Lhu/ekreta/ellenorzo/message/Message$MessageType;", "getMap", "()Ljava/util/Map;", "map$delegate", "Lkotlin/Lazy;", "parse", "value", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
        /* renamed from: hu.ekreta.ellenorzo.message.Message$MessageType$Companion */
        /* compiled from: Message.kt */
        public static final class Companion {

            /* renamed from: a */
            public static final /* synthetic */ KProperty[] f13817a = null;

            static {
                f13817a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "map", "getMap()Ljava/util/Map;"))};
            }

            public Companion() {
            }

            /* renamed from: a */
            public final MessageType mo13303a(long j) {
                Lazy access$getMap$cp = MessageType.f13815f;
                Companion companion = MessageType.Companion;
                KProperty kProperty = f13817a[0];
                MessageType messageType = (MessageType) ((Map) access$getMap$cp.getValue()).get(Long.valueOf(j));
                return messageType != null ? messageType : MessageType.INCOMING;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new Companion(null);
            f13815f = LazyKt__LazyJVMKt.lazy(Message$MessageType$Companion$map$2.INSTANCE);
        }

        /* access modifiers changed from: public */
        MessageType(long j) {
            this.f13816c = j;
        }

        /* renamed from: a */
        public final long mo13302a() {
            return this.f13816c;
        }
    }

    public Message(String str, String str2, long j, Boolean bool, boolean z, boolean z2, MessageType messageType, String str3, String str4, String str5, String str6, long j2, Calendar calendar, String str7, String str8, String str9, String str10, List<Addressee> list, List<Attachment> list2) {
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
        this.f13795f = str11;
        this.f13796g = str12;
        this.f13797h = j;
        this.f13798i = bool;
        this.f13799j = z;
        this.f13800k = z2;
        this.f13801l = messageType2;
        this.f13802m = str13;
        this.f13803n = str14;
        this.f13804o = str15;
        this.f13805p = str16;
        this.f13806q = j2;
        this.f13807r = calendar2;
        this.f13808s = str17;
        this.f13809t = str18;
        this.f13810u = str19;
        this.f13811v = str20;
        this.f13812w = list3;
        this.f13813x = list4;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13808s);
        sb.append(" (");
        sb.append(this.f13809t);
        sb.append(')');
        this.f13793c = sb.toString();
        this.f13794e = CollectionsKt___CollectionsKt.joinToString$default(this.f13812w, null, null, null, 0, null, Message$addresseeNames$1.INSTANCE, 31, null);
    }

    public static /* synthetic */ Message copy$default(Message message, String str, String str2, long j, Boolean bool, boolean z, boolean z2, MessageType messageType, String str3, String str4, String str5, String str6, long j2, Calendar calendar, String str7, String str8, String str9, String str10, List list, List list2, int i, Object obj) {
        Message message2 = message;
        int i2 = i;
        return message.mo13275a((i2 & 1) != 0 ? message.mo11318e() : str, (i2 & 2) != 0 ? message.mo11316d() : str2, (i2 & 4) != 0 ? message2.f13797h : j, (i2 & 8) != 0 ? message.mo13290q() : bool, (i2 & 16) != 0 ? message2.f13799j : z, (i2 & 32) != 0 ? message2.f13800k : z2, (i2 & 64) != 0 ? message2.f13801l : messageType, (i2 & 128) != 0 ? message2.f13802m : str3, (i2 & 256) != 0 ? message2.f13803n : str4, (i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? message2.f13804o : str5, (i2 & 1024) != 0 ? message2.f13805p : str6, (i2 & 2048) != 0 ? message2.f13806q : j2, (i2 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? message2.f13807r : calendar, (i2 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? message2.f13808s : str7, (i2 & 16384) != 0 ? message2.f13809t : str8, (i2 & 32768) != 0 ? message2.f13810u : str9, (i2 & 65536) != 0 ? message2.f13811v : str10, (i2 & 131072) != 0 ? message2.f13812w : list, (i2 & 262144) != 0 ? message2.f13813x : list2);
    }

    /* renamed from: a */
    public final Message mo13275a(String str, String str2, long j, Boolean bool, boolean z, boolean z2, MessageType messageType, String str3, String str4, String str5, String str6, long j2, Calendar calendar, String str7, String str8, String str9, String str10, List<Addressee> list, List<Attachment> list2) {
        String str11 = str;
        String str12 = str2;
        long j3 = j;
        Boolean bool2 = bool;
        boolean z3 = z;
        boolean z4 = z2;
        MessageType messageType2 = messageType;
        String str13 = str3;
        String str14 = str4;
        String str15 = str5;
        String str16 = str6;
        long j4 = j2;
        Calendar calendar2 = calendar;
        String str17 = str7;
        String str18 = str8;
        String str19 = str9;
        String str20 = str10;
        List<Addressee> list3 = list;
        List<Attachment> list4 = list2;
        String str21 = str11;
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
        Message message = new Message(str21, str12, j3, bool2, z3, z4, messageType2, str13, str14, str15, str16, j4, calendar2, str17, str18, str19, str20, list3, list4);
        return message;
    }

    /* renamed from: d */
    public String mo11316d() {
        return this.f13796g;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String mo11318e() {
        return this.f13795f;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Message) {
                Message message = (Message) obj;
                if (Intrinsics.areEqual((Object) mo11318e(), (Object) message.mo11318e()) && Intrinsics.areEqual((Object) mo11316d(), (Object) message.mo11316d())) {
                    if ((this.f13797h == message.f13797h) && Intrinsics.areEqual((Object) mo13290q(), (Object) message.mo13290q())) {
                        if (this.f13799j == message.f13799j) {
                            if ((this.f13800k == message.f13800k) && Intrinsics.areEqual((Object) this.f13801l, (Object) message.f13801l) && Intrinsics.areEqual((Object) this.f13802m, (Object) message.f13802m) && Intrinsics.areEqual((Object) this.f13803n, (Object) message.f13803n) && Intrinsics.areEqual((Object) this.f13804o, (Object) message.f13804o) && Intrinsics.areEqual((Object) this.f13805p, (Object) message.f13805p)) {
                                if (!(this.f13806q == message.f13806q) || !Intrinsics.areEqual((Object) this.f13807r, (Object) message.f13807r) || !Intrinsics.areEqual((Object) this.f13808s, (Object) message.f13808s) || !Intrinsics.areEqual((Object) this.f13809t, (Object) message.f13809t) || !Intrinsics.areEqual((Object) this.f13810u, (Object) message.f13810u) || !Intrinsics.areEqual((Object) this.f13811v, (Object) message.f13811v) || !Intrinsics.areEqual((Object) this.f13812w, (Object) message.f13812w) || !Intrinsics.areEqual((Object) this.f13813x, (Object) message.f13813x)) {
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

    /* renamed from: f */
    public final List<Addressee> mo13278f() {
        return this.f13812w;
    }

    /* renamed from: g */
    public final String mo13279g() {
        return this.f13794e;
    }

    /* renamed from: h */
    public final List<Attachment> mo13280h() {
        return this.f13813x;
    }

    public int hashCode() {
        String e = mo11318e();
        int i = 0;
        int hashCode = (e != null ? e.hashCode() : 0) * 31;
        String d = mo11316d();
        int hashCode2 = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        long j = this.f13797h;
        int i2 = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        Boolean q = mo13290q();
        int hashCode3 = (i2 + (q != null ? q.hashCode() : 0)) * 31;
        boolean z = this.f13799j;
        if (z) {
            z = true;
        }
        int i3 = (hashCode3 + (z ? 1 : 0)) * 31;
        boolean z2 = this.f13800k;
        if (z2) {
            z2 = true;
        }
        int i4 = (i3 + (z2 ? 1 : 0)) * 31;
        MessageType messageType = this.f13801l;
        int hashCode4 = (i4 + (messageType != null ? messageType.hashCode() : 0)) * 31;
        String str = this.f13802m;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f13803n;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f13804o;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f13805p;
        int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31;
        long j2 = this.f13806q;
        int i5 = (hashCode8 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        Calendar calendar = this.f13807r;
        int hashCode9 = (i5 + (calendar != null ? calendar.hashCode() : 0)) * 31;
        String str5 = this.f13808s;
        int hashCode10 = (hashCode9 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f13809t;
        int hashCode11 = (hashCode10 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f13810u;
        int hashCode12 = (hashCode11 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f13811v;
        int hashCode13 = (hashCode12 + (str8 != null ? str8.hashCode() : 0)) * 31;
        List<Addressee> list = this.f13812w;
        int hashCode14 = (hashCode13 + (list != null ? list.hashCode() : 0)) * 31;
        List<Attachment> list2 = this.f13813x;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode14 + i;
    }

    /* renamed from: i */
    public final long mo13282i() {
        return this.f13797h;
    }

    /* renamed from: j */
    public final long mo13283j() {
        return this.f13806q;
    }

    /* renamed from: k */
    public final String mo13284k() {
        return this.f13808s;
    }

    /* renamed from: l */
    public final String mo13285l() {
        return this.f13793c;
    }

    /* renamed from: m */
    public final String mo13286m() {
        return this.f13809t;
    }

    /* renamed from: n */
    public final Calendar mo13287n() {
        return this.f13807r;
    }

    /* renamed from: o */
    public final String mo13288o() {
        return this.f13811v;
    }

    /* renamed from: p */
    public final String mo13289p() {
        return this.f13810u;
    }

    /* renamed from: q */
    public Boolean mo13290q() {
        return this.f13798i;
    }

    /* renamed from: r */
    public final String mo13291r() {
        return this.f13802m;
    }

    /* renamed from: s */
    public final String mo13292s() {
        return this.f13805p;
    }

    /* renamed from: t */
    public final MessageType mo13293t() {
        return this.f13801l;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("Message(profileId=");
        a.append(mo11318e());
        a.append(", uid=");
        a.append(mo11316d());
        a.append(", mailboxItemId=");
        a.append(this.f13797h);
        a.append(", readByUser=");
        a.append(mo13290q());
        a.append(", isDeleted=");
        a.append(this.f13799j);
        a.append(", isComplete=");
        a.append(this.f13800k);
        a.append(", typeId=");
        a.append(this.f13801l);
        a.append(", typeCode=");
        a.append(this.f13802m);
        a.append(", typeShortName=");
        a.append(this.f13803n);
        a.append(", typeName=");
        a.append(this.f13804o);
        a.append(", typeDescription=");
        a.append(this.f13805p);
        a.append(", messageId=");
        a.append(this.f13806q);
        a.append(", messageSentDate=");
        a.append(this.f13807r);
        a.append(", messageSenderName=");
        a.append(this.f13808s);
        a.append(", messageSenderTitle=");
        a.append(this.f13809t);
        a.append(", messageText=");
        a.append(this.f13810u);
        a.append(", messageSubject=");
        a.append(this.f13811v);
        a.append(", addresseeList=");
        a.append(this.f13812w);
        a.append(", attachmentList=");
        return C0082a.m108a(a, (List) this.f13813x, ")");
    }

    /* renamed from: u */
    public final String mo13295u() {
        return this.f13804o;
    }

    /* renamed from: v */
    public final String mo13296v() {
        return this.f13803n;
    }

    /* renamed from: w */
    public final boolean mo13297w() {
        return this.f13800k;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.f13795f);
        parcel.writeString(this.f13796g);
        parcel.writeLong(this.f13797h);
        Boolean bool = this.f13798i;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.f13799j ? 1 : 0);
        parcel.writeInt(this.f13800k ? 1 : 0);
        parcel.writeString(this.f13801l.name());
        parcel.writeString(this.f13802m);
        parcel.writeString(this.f13803n);
        parcel.writeString(this.f13804o);
        parcel.writeString(this.f13805p);
        parcel.writeLong(this.f13806q);
        parcel.writeSerializable(this.f13807r);
        parcel.writeString(this.f13808s);
        parcel.writeString(this.f13809t);
        parcel.writeString(this.f13810u);
        parcel.writeString(this.f13811v);
        List<Addressee> list = this.f13812w;
        parcel.writeInt(list.size());
        for (Addressee writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
        List<Attachment> list2 = this.f13813x;
        parcel.writeInt(list2.size());
        for (Attachment writeToParcel2 : list2) {
            writeToParcel2.writeToParcel(parcel, 0);
        }
    }

    /* renamed from: x */
    public final boolean mo13299x() {
        return this.f13799j;
    }

    public /* synthetic */ Message(String str, String str2, long j, Boolean bool, boolean z, boolean z2, MessageType messageType, String str3, String str4, String str5, String str6, long j2, Calendar calendar, String str7, String str8, String str9, String str10, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, (i & 8) != 0 ? Boolean.valueOf(false) : bool, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, messageType, str3, str4, str5, str6, j2, calendar, str7, str8, str9, str10, list, list2);
    }
}
