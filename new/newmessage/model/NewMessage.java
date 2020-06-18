package hu.ekreta.ellenorzo.newmessage.model;

import a.b.a.a.a;
import hu.ekreta.ellenorzo.attachment.Attachment;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eHÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eHÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001d¨\u00065"}, d2 = {"Lhu/ekreta/ellenorzo/newmessage/model/NewMessage;", "", "id", "", "sentDate", "Ljava/util/Calendar;", "senderName", "", "senderTitle", "text", "subject", "previousMessageId", "conversationId", "listOfAttachment", "", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "listOfAddressee", "Lhu/ekreta/ellenorzo/newmessage/model/Addressee;", "(JLjava/util/Calendar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;JLjava/util/List;Ljava/util/List;)V", "getConversationId", "()J", "getId", "getListOfAddressee", "()Ljava/util/List;", "getListOfAttachment", "getPreviousMessageId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSenderName", "()Ljava/lang/String;", "getSenderTitle", "getSentDate", "()Ljava/util/Calendar;", "getSubject", "getText", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JLjava/util/Calendar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;JLjava/util/List;Ljava/util/List;)Lhu/ekreta/ellenorzo/newmessage/model/NewMessage;", "equals", "", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: NewMessage.kt */
public final class NewMessage {

    /* renamed from: a  reason: collision with root package name */
    public final long f5821a;
    public final Calendar b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final String f5822d;
    public final String e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final Long f5823g;

    /* renamed from: h  reason: collision with root package name */
    public final long f5824h;

    /* renamed from: i  reason: collision with root package name */
    public final List<Attachment> f5825i;

    /* renamed from: j  reason: collision with root package name */
    public final List<Addressee> f5826j;

    public NewMessage(long j2, Calendar calendar, String str, String str2, String str3, String str4, Long l2, long j3, List<Attachment> list, List<Addressee> list2) {
        Intrinsics.checkParameterIsNotNull(calendar, "sentDate");
        Intrinsics.checkParameterIsNotNull(str, "senderName");
        Intrinsics.checkParameterIsNotNull(str2, "senderTitle");
        Intrinsics.checkParameterIsNotNull(str3, "text");
        Intrinsics.checkParameterIsNotNull(str4, "subject");
        Intrinsics.checkParameterIsNotNull(list, "listOfAttachment");
        Intrinsics.checkParameterIsNotNull(list2, "listOfAddressee");
        this.f5821a = j2;
        this.b = calendar;
        this.c = str;
        this.f5822d = str2;
        this.e = str3;
        this.f = str4;
        this.f5823g = l2;
        this.f5824h = j3;
        this.f5825i = list;
        this.f5826j = list2;
    }

    public static /* synthetic */ NewMessage copy$default(NewMessage newMessage, long j2, Calendar calendar, String str, String str2, String str3, String str4, Long l2, long j3, List list, List list2, int i2, Object obj) {
        NewMessage newMessage2 = newMessage;
        int i3 = i2;
        return newMessage.a((i3 & 1) != 0 ? newMessage2.f5821a : j2, (i3 & 2) != 0 ? newMessage2.b : calendar, (i3 & 4) != 0 ? newMessage2.c : str, (i3 & 8) != 0 ? newMessage2.f5822d : str2, (i3 & 16) != 0 ? newMessage2.e : str3, (i3 & 32) != 0 ? newMessage2.f : str4, (i3 & 64) != 0 ? newMessage2.f5823g : l2, (i3 & 128) != 0 ? newMessage2.f5824h : j3, (i3 & 256) != 0 ? newMessage2.f5825i : list, (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? newMessage2.f5826j : list2);
    }

    public final long a() {
        return this.f5821a;
    }

    public final NewMessage a(long j2, Calendar calendar, String str, String str2, String str3, String str4, Long l2, long j3, List<Attachment> list, List<Addressee> list2) {
        Calendar calendar2 = calendar;
        Intrinsics.checkParameterIsNotNull(calendar2, "sentDate");
        String str5 = str;
        Intrinsics.checkParameterIsNotNull(str5, "senderName");
        String str6 = str2;
        Intrinsics.checkParameterIsNotNull(str6, "senderTitle");
        String str7 = str3;
        Intrinsics.checkParameterIsNotNull(str7, "text");
        String str8 = str4;
        Intrinsics.checkParameterIsNotNull(str8, "subject");
        List<Attachment> list3 = list;
        Intrinsics.checkParameterIsNotNull(list3, "listOfAttachment");
        List<Addressee> list4 = list2;
        Intrinsics.checkParameterIsNotNull(list4, "listOfAddressee");
        return new NewMessage(j2, calendar2, str5, str6, str7, str8, l2, j3, list3, list4);
    }

    public final List<Addressee> b() {
        return this.f5826j;
    }

    public final List<Attachment> c() {
        return this.f5825i;
    }

    public final Long d() {
        return this.f5823g;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NewMessage) {
                NewMessage newMessage = (NewMessage) obj;
                if ((this.f5821a == newMessage.f5821a) && Intrinsics.areEqual((Object) this.b, (Object) newMessage.b) && Intrinsics.areEqual((Object) this.c, (Object) newMessage.c) && Intrinsics.areEqual((Object) this.f5822d, (Object) newMessage.f5822d) && Intrinsics.areEqual((Object) this.e, (Object) newMessage.e) && Intrinsics.areEqual((Object) this.f, (Object) newMessage.f) && Intrinsics.areEqual((Object) this.f5823g, (Object) newMessage.f5823g)) {
                    if (!(this.f5824h == newMessage.f5824h) || !Intrinsics.areEqual((Object) this.f5825i, (Object) newMessage.f5825i) || !Intrinsics.areEqual((Object) this.f5826j, (Object) newMessage.f5826j)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String f() {
        return this.f5822d;
    }

    public final Calendar g() {
        return this.b;
    }

    public final String h() {
        return this.f;
    }

    public int hashCode() {
        long j2 = this.f5821a;
        int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        Calendar calendar = this.b;
        int i3 = 0;
        int hashCode = (i2 + (calendar != null ? calendar.hashCode() : 0)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5822d;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.e;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Long l2 = this.f5823g;
        int hashCode6 = l2 != null ? l2.hashCode() : 0;
        long j3 = this.f5824h;
        int i4 = (((hashCode5 + hashCode6) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        List<Attachment> list = this.f5825i;
        int hashCode7 = (i4 + (list != null ? list.hashCode() : 0)) * 31;
        List<Addressee> list2 = this.f5826j;
        if (list2 != null) {
            i3 = list2.hashCode();
        }
        return hashCode7 + i3;
    }

    public final String i() {
        return this.e;
    }

    public String toString() {
        StringBuilder a2 = a.a("NewMessage(id=");
        a2.append(this.f5821a);
        a2.append(", sentDate=");
        a2.append(this.b);
        a2.append(", senderName=");
        a2.append(this.c);
        a2.append(", senderTitle=");
        a2.append(this.f5822d);
        a2.append(", text=");
        a2.append(this.e);
        a2.append(", subject=");
        a2.append(this.f);
        a2.append(", previousMessageId=");
        a2.append(this.f5823g);
        a2.append(", conversationId=");
        a2.append(this.f5824h);
        a2.append(", listOfAttachment=");
        a2.append(this.f5825i);
        a2.append(", listOfAddressee=");
        return a.a(a2, (List) this.f5826j, ")");
    }
}
