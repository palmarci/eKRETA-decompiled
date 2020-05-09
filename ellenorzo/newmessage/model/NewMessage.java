package p289hu.ekreta.ellenorzo.newmessage.model;

import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p349io.ConstantsKt;
import p000a.p020b.p021a.p022a.C0082a;
import p289hu.ekreta.ellenorzo.attachment.Attachment;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eHÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eHÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001d¨\u00065"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/newmessage/model/NewMessage;", "", "id", "", "sentDate", "Ljava/util/Calendar;", "senderName", "", "senderTitle", "text", "subject", "previousMessageId", "conversationId", "listOfAttachment", "", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "listOfAddressee", "Lhu/ekreta/ellenorzo/newmessage/model/Addressee;", "(JLjava/util/Calendar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;JLjava/util/List;Ljava/util/List;)V", "getConversationId", "()J", "getId", "getListOfAddressee", "()Ljava/util/List;", "getListOfAttachment", "getPreviousMessageId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSenderName", "()Ljava/lang/String;", "getSenderTitle", "getSentDate", "()Ljava/util/Calendar;", "getSubject", "getText", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JLjava/util/Calendar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;JLjava/util/List;Ljava/util/List;)Lhu/ekreta/ellenorzo/newmessage/model/NewMessage;", "equals", "", "other", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.newmessage.model.NewMessage */
/* compiled from: NewMessage.kt */
public final class NewMessage {

    /* renamed from: a */
    public final long f13970a;

    /* renamed from: b */
    public final Calendar f13971b;

    /* renamed from: c */
    public final String f13972c;

    /* renamed from: d */
    public final String f13973d;

    /* renamed from: e */
    public final String f13974e;

    /* renamed from: f */
    public final String f13975f;

    /* renamed from: g */
    public final Long f13976g;

    /* renamed from: h */
    public final long f13977h;

    /* renamed from: i */
    public final List<Attachment> f13978i;

    /* renamed from: j */
    public final List<Addressee> f13979j;

    public NewMessage(long j, Calendar calendar, String str, String str2, String str3, String str4, Long l, long j2, List<Attachment> list, List<Addressee> list2) {
        Intrinsics.checkParameterIsNotNull(calendar, "sentDate");
        Intrinsics.checkParameterIsNotNull(str, "senderName");
        Intrinsics.checkParameterIsNotNull(str2, "senderTitle");
        Intrinsics.checkParameterIsNotNull(str3, "text");
        Intrinsics.checkParameterIsNotNull(str4, "subject");
        Intrinsics.checkParameterIsNotNull(list, "listOfAttachment");
        Intrinsics.checkParameterIsNotNull(list2, "listOfAddressee");
        this.f13970a = j;
        this.f13971b = calendar;
        this.f13972c = str;
        this.f13973d = str2;
        this.f13974e = str3;
        this.f13975f = str4;
        this.f13976g = l;
        this.f13977h = j2;
        this.f13978i = list;
        this.f13979j = list2;
    }

    public static /* synthetic */ NewMessage copy$default(NewMessage newMessage, long j, Calendar calendar, String str, String str2, String str3, String str4, Long l, long j2, List list, List list2, int i, Object obj) {
        NewMessage newMessage2 = newMessage;
        int i2 = i;
        return newMessage.mo13488a((i2 & 1) != 0 ? newMessage2.f13970a : j, (i2 & 2) != 0 ? newMessage2.f13971b : calendar, (i2 & 4) != 0 ? newMessage2.f13972c : str, (i2 & 8) != 0 ? newMessage2.f13973d : str2, (i2 & 16) != 0 ? newMessage2.f13974e : str3, (i2 & 32) != 0 ? newMessage2.f13975f : str4, (i2 & 64) != 0 ? newMessage2.f13976g : l, (i2 & 128) != 0 ? newMessage2.f13977h : j2, (i2 & 256) != 0 ? newMessage2.f13978i : list, (i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? newMessage2.f13979j : list2);
    }

    /* renamed from: a */
    public final long mo13487a() {
        return this.f13970a;
    }

    /* renamed from: a */
    public final NewMessage mo13488a(long j, Calendar calendar, String str, String str2, String str3, String str4, Long l, long j2, List<Attachment> list, List<Addressee> list2) {
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
        NewMessage newMessage = new NewMessage(j, calendar2, str5, str6, str7, str8, l, j2, list3, list4);
        return newMessage;
    }

    /* renamed from: b */
    public final List<Addressee> mo13489b() {
        return this.f13979j;
    }

    /* renamed from: c */
    public final List<Attachment> mo13490c() {
        return this.f13978i;
    }

    /* renamed from: d */
    public final Long mo13491d() {
        return this.f13976g;
    }

    /* renamed from: e */
    public final String mo13492e() {
        return this.f13972c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NewMessage) {
                NewMessage newMessage = (NewMessage) obj;
                if ((this.f13970a == newMessage.f13970a) && Intrinsics.areEqual((Object) this.f13971b, (Object) newMessage.f13971b) && Intrinsics.areEqual((Object) this.f13972c, (Object) newMessage.f13972c) && Intrinsics.areEqual((Object) this.f13973d, (Object) newMessage.f13973d) && Intrinsics.areEqual((Object) this.f13974e, (Object) newMessage.f13974e) && Intrinsics.areEqual((Object) this.f13975f, (Object) newMessage.f13975f) && Intrinsics.areEqual((Object) this.f13976g, (Object) newMessage.f13976g)) {
                    if (!(this.f13977h == newMessage.f13977h) || !Intrinsics.areEqual((Object) this.f13978i, (Object) newMessage.f13978i) || !Intrinsics.areEqual((Object) this.f13979j, (Object) newMessage.f13979j)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final String mo13494f() {
        return this.f13973d;
    }

    /* renamed from: g */
    public final Calendar mo13495g() {
        return this.f13971b;
    }

    /* renamed from: h */
    public final String mo13496h() {
        return this.f13975f;
    }

    public int hashCode() {
        long j = this.f13970a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        Calendar calendar = this.f13971b;
        int i2 = 0;
        int hashCode = (i + (calendar != null ? calendar.hashCode() : 0)) * 31;
        String str = this.f13972c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f13973d;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f13974e;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f13975f;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Long l = this.f13976g;
        int hashCode6 = (hashCode5 + (l != null ? l.hashCode() : 0)) * 31;
        long j2 = this.f13977h;
        int i3 = (hashCode6 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        List<Attachment> list = this.f13978i;
        int hashCode7 = (i3 + (list != null ? list.hashCode() : 0)) * 31;
        List<Addressee> list2 = this.f13979j;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode7 + i2;
    }

    /* renamed from: i */
    public final String mo13498i() {
        return this.f13974e;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("NewMessage(id=");
        a.append(this.f13970a);
        a.append(", sentDate=");
        a.append(this.f13971b);
        a.append(", senderName=");
        a.append(this.f13972c);
        a.append(", senderTitle=");
        a.append(this.f13973d);
        a.append(", text=");
        a.append(this.f13974e);
        a.append(", subject=");
        a.append(this.f13975f);
        a.append(", previousMessageId=");
        a.append(this.f13976g);
        a.append(", conversationId=");
        a.append(this.f13977h);
        a.append(", listOfAttachment=");
        a.append(this.f13978i);
        a.append(", listOfAddressee=");
        return C0082a.m108a(a, (List) this.f13979j, ")");
    }
}
