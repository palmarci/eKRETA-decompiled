package p289hu.ekreta.ellenorzo.message;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p349io.ConstantsKt;
import p289hu.ekreta.ellenorzo.attachment.AttachmentRealm;
import p289hu.ekreta.ellenorzo.util.dao.ReadableByUserModelRealm;
import p300k.p340c.C5059b1;
import p300k.p340c.C5065d0;
import p300k.p340c.C5080h0;
import p300k.p340c.p341m1.C5116n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b5\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002Bí\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0018\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u001dR \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\n\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\t\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\"\"\u0004\b%\u0010$R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010*\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001f\"\u0004\b,\u0010!R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010*\u001a\u0004\b-\u0010'\"\u0004\b.\u0010)R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00100\"\u0004\b4\u00102R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u00100\"\u0004\b:\u00102R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u00100\"\u0004\b<\u00102R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u00100\"\u0004\b>\u00102R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0010\n\u0002\u0010C\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u00100\"\u0004\bE\u00102R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u00100\"\u0004\bG\u00102R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010*\u001a\u0004\bH\u0010'\"\u0004\bI\u0010)R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u00100\"\u0004\bK\u00102R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u00100\"\u0004\bM\u00102R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u00100\"\u0004\bO\u00102¨\u0006P"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/message/MessageRealm;", "Lio/realm/RealmObject;", "Lhu/ekreta/ellenorzo/util/dao/ReadableByUserModelRealm;", "uid", "", "mailboxItemId", "", "readByUser", "", "isDeleted", "isComplete", "typeId", "typeCode", "typeShortName", "typeName", "typeDescription", "messageId", "messageSentDate", "Ljava/util/Date;", "messageSenderName", "messageSenderTitle", "messageText", "messageSubject", "addresseeList", "Lio/realm/RealmList;", "Lhu/ekreta/ellenorzo/message/AddresseeRealm;", "messageAttachmentList", "Lhu/ekreta/ellenorzo/attachment/AttachmentRealm;", "profileId", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;ZZLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/realm/RealmList;Lio/realm/RealmList;Ljava/lang/String;)V", "getAddresseeList", "()Lio/realm/RealmList;", "setAddresseeList", "(Lio/realm/RealmList;)V", "()Z", "setComplete", "(Z)V", "setDeleted", "getMailboxItemId", "()Ljava/lang/Long;", "setMailboxItemId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getMessageAttachmentList", "setMessageAttachmentList", "getMessageId", "setMessageId", "getMessageSenderName", "()Ljava/lang/String;", "setMessageSenderName", "(Ljava/lang/String;)V", "getMessageSenderTitle", "setMessageSenderTitle", "getMessageSentDate", "()Ljava/util/Date;", "setMessageSentDate", "(Ljava/util/Date;)V", "getMessageSubject", "setMessageSubject", "getMessageText", "setMessageText", "getProfileId", "setProfileId", "getReadByUser", "()Ljava/lang/Boolean;", "setReadByUser", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getTypeCode", "setTypeCode", "getTypeDescription", "setTypeDescription", "getTypeId", "setTypeId", "getTypeName", "setTypeName", "getTypeShortName", "setTypeShortName", "getUid", "setUid", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.message.MessageRealm */
/* compiled from: MessageRealm.kt */
public class MessageRealm extends C5080h0 implements ReadableByUserModelRealm, C5059b1 {

    /* renamed from: c */
    public String f13869c;

    /* renamed from: e */
    public Long f13870e;

    /* renamed from: f */
    public Boolean f13871f;

    /* renamed from: g */
    public boolean f13872g;

    /* renamed from: h */
    public boolean f13873h;

    /* renamed from: i */
    public Long f13874i;

    /* renamed from: j */
    public String f13875j;

    /* renamed from: k */
    public String f13876k;

    /* renamed from: l */
    public String f13877l;

    /* renamed from: m */
    public String f13878m;

    /* renamed from: n */
    public Long f13879n;

    /* renamed from: o */
    public Date f13880o;

    /* renamed from: p */
    public String f13881p;

    /* renamed from: q */
    public String f13882q;

    /* renamed from: r */
    public String f13883r;

    /* renamed from: s */
    public String f13884s;

    /* renamed from: t */
    public C5065d0<AddresseeRealm> f13885t;

    /* renamed from: u */
    public C5065d0<AttachmentRealm> f13886u;

    /* renamed from: v */
    public String f13887v;

    public MessageRealm() {
        this(null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
    }

    public /* synthetic */ MessageRealm(String str, Long l, Boolean bool, boolean z, boolean z2, Long l2, String str2, String str3, String str4, String str5, Long l3, Date date, String str6, String str7, String str8, String str9, C5065d0 d0Var, C5065d0 d0Var2, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = i;
        String str11 = (i2 & 1) != 0 ? null : str;
        Long l4 = (i2 & 2) != 0 ? null : l;
        boolean z3 = false;
        Boolean valueOf = (i2 & 4) != 0 ? Boolean.valueOf(false) : bool;
        boolean z4 = (i2 & 8) != 0 ? false : z;
        if ((i2 & 16) == 0) {
            z3 = z2;
        }
        this(str11, l4, valueOf, z4, z3, (i2 & 32) != 0 ? null : l2, (i2 & 64) != 0 ? null : str2, (i2 & 128) != 0 ? null : str3, (i2 & 256) != 0 ? null : str4, (i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : str5, (i2 & 1024) != 0 ? null : l3, (i2 & 2048) != 0 ? null : date, (i2 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? null : str6, (i2 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? null : str7, (i2 & 16384) != 0 ? null : str8, (i2 & 32768) != 0 ? null : str9, (i2 & 65536) != 0 ? new C5065d0() : d0Var, (i2 & 131072) != 0 ? new C5065d0() : d0Var2, (i2 & 262144) != 0 ? null : str10);
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
    }

    /* renamed from: B0 */
    public boolean mo13345B0() {
        return this.f13873h;
    }

    /* renamed from: E0 */
    public void mo13346E0(String str) {
        this.f13883r = str;
    }

    /* renamed from: G1 */
    public C5065d0 mo13347G1() {
        return this.f13885t;
    }

    /* renamed from: H */
    public String mo13348H() {
        return this.f13876k;
    }

    /* renamed from: H0 */
    public C5065d0 mo13349H0() {
        return this.f13886u;
    }

    /* renamed from: I */
    public void mo13350I(String str) {
        this.f13882q = str;
    }

    /* renamed from: J0 */
    public void mo13351J0(String str) {
        this.f13884s = str;
    }

    /* renamed from: K1 */
    public Long mo13352K1() {
        return this.f13879n;
    }

    /* renamed from: L1 */
    public String mo13353L1() {
        return this.f13882q;
    }

    /* renamed from: R0 */
    public boolean mo13354R0() {
        return this.f13872g;
    }

    /* renamed from: a */
    public String mo13355a() {
        return this.f13887v;
    }

    /* renamed from: a */
    public void mo13356a(Boolean bool) {
        this.f13871f = bool;
    }

    /* renamed from: a */
    public void mo13357a(Long l) {
        this.f13874i = l;
    }

    /* renamed from: a */
    public void mo13358a(String str) {
        this.f13887v = str;
    }

    /* renamed from: a0 */
    public Date mo13359a0() {
        return this.f13880o;
    }

    /* renamed from: a0 */
    public void mo13360a0(String str) {
        this.f13881p = str;
    }

    /* renamed from: b */
    public String mo13361b() {
        return this.f13869c;
    }

    /* renamed from: b */
    public void mo11372b(Boolean bool) {
        mo13356a(bool);
    }

    /* renamed from: b */
    public void mo13362b(String str) {
        this.f13869c = str;
    }

    /* renamed from: b */
    public void mo13363b(C5065d0 d0Var) {
        this.f13886u = d0Var;
    }

    /* renamed from: b */
    public void mo13364b(boolean z) {
        this.f13872g = z;
    }

    /* renamed from: c */
    public void mo13365c(Long l) {
        this.f13870e = l;
    }

    /* renamed from: c */
    public void mo13366c(String str) {
        this.f13877l = str;
    }

    /* renamed from: c */
    public void mo13367c(boolean z) {
        this.f13873h = z;
    }

    /* renamed from: c2 */
    public String mo13368c2() {
        return this.f13884s;
    }

    /* renamed from: d */
    public String mo11376d() {
        return mo13361b();
    }

    /* renamed from: d2 */
    public final C5065d0<AddresseeRealm> mo13369d2() {
        return mo13347G1();
    }

    /* renamed from: e */
    public void mo13370e(Long l) {
        this.f13879n = l;
    }

    /* renamed from: e2 */
    public final Long mo13371e2() {
        return mo13387l0();
    }

    /* renamed from: f */
    public Boolean mo13372f() {
        return this.f13871f;
    }

    /* renamed from: f */
    public void mo13373f(String str) {
        this.f13878m = str;
    }

    /* renamed from: f2 */
    public final C5065d0<AttachmentRealm> mo13374f2() {
        return mo13349H0();
    }

    /* renamed from: g */
    public String mo13375g() {
        return this.f13877l;
    }

    /* renamed from: g */
    public void mo13376g(C5065d0 d0Var) {
        this.f13885t = d0Var;
    }

    /* renamed from: g2 */
    public final Long mo13377g2() {
        return mo13352K1();
    }

    /* renamed from: h0 */
    public String mo13378h0() {
        return this.f13883r;
    }

    /* renamed from: h2 */
    public final String mo13379h2() {
        return mo13395r0();
    }

    /* renamed from: i */
    public void mo13380i(String str) {
        this.f13875j = str;
    }

    /* renamed from: i2 */
    public final String mo13381i2() {
        return mo13353L1();
    }

    /* renamed from: j2 */
    public final Date mo13382j2() {
        return mo13359a0();
    }

    /* renamed from: k */
    public String mo13383k() {
        return this.f13878m;
    }

    /* renamed from: k2 */
    public final String mo13384k2() {
        return mo13368c2();
    }

    /* renamed from: l */
    public String mo13385l() {
        return this.f13875j;
    }

    /* renamed from: l */
    public void mo13386l(Date date) {
        this.f13880o = date;
    }

    /* renamed from: l0 */
    public Long mo13387l0() {
        return this.f13870e;
    }

    /* renamed from: l2 */
    public final String mo13388l2() {
        return mo13378h0();
    }

    /* renamed from: m2 */
    public String mo13389m2() {
        return mo13355a();
    }

    /* renamed from: n2 */
    public final String mo13390n2() {
        return mo13385l();
    }

    /* renamed from: o2 */
    public final String mo13391o2() {
        return mo13383k();
    }

    /* renamed from: p */
    public void mo13392p(String str) {
        this.f13876k = str;
    }

    /* renamed from: p2 */
    public final Long mo13393p2() {
        return mo13399w();
    }

    /* renamed from: q2 */
    public final String mo13394q2() {
        return mo13375g();
    }

    /* renamed from: r0 */
    public String mo13395r0() {
        return this.f13881p;
    }

    /* renamed from: r2 */
    public final String mo13396r2() {
        return mo13348H();
    }

    /* renamed from: s2 */
    public final boolean mo13397s2() {
        return mo13345B0();
    }

    /* renamed from: t2 */
    public final boolean mo13398t2() {
        return mo13354R0();
    }

    /* renamed from: u */
    public Boolean mo11399u() {
        return mo13372f();
    }

    /* renamed from: w */
    public Long mo13399w() {
        return this.f13874i;
    }

    public MessageRealm(String str, Long l, Boolean bool, boolean z, boolean z2, Long l2, String str2, String str3, String str4, String str5, Long l3, Date date, String str6, String str7, String str8, String str9, C5065d0<AddresseeRealm> d0Var, C5065d0<AttachmentRealm> d0Var2, String str10) {
        C5065d0<AddresseeRealm> d0Var3 = d0Var;
        C5065d0<AttachmentRealm> d0Var4 = d0Var2;
        Intrinsics.checkParameterIsNotNull(d0Var3, "addresseeList");
        Intrinsics.checkParameterIsNotNull(d0Var4, "messageAttachmentList");
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
        mo13362b(str);
        Long l4 = l;
        mo13365c(l);
        Boolean bool2 = bool;
        mo13356a(bool);
        boolean z3 = z;
        mo13364b(z);
        boolean z4 = z2;
        mo13367c(z2);
        Long l5 = l2;
        mo13357a(l2);
        String str11 = str2;
        mo13380i(str2);
        String str12 = str3;
        mo13392p(str3);
        String str13 = str4;
        mo13366c(str4);
        String str14 = str5;
        mo13373f(str5);
        Long l6 = l3;
        mo13370e(l3);
        mo13386l(date);
        mo13360a0(str6);
        mo13350I(str7);
        mo13346E0(str8);
        mo13351J0(str9);
        mo13376g(d0Var3);
        mo13363b((C5065d0) d0Var4);
        mo13358a(str10);
    }
}
