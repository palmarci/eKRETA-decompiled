package p289hu.ekreta.ellenorzo.message;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.p349io.ConstantsKt;
import p289hu.ekreta.ellenorzo.util.dao.ProfileSpecificModelRealm;
import p300k.p340c.C5056a1;
import p300k.p340c.C5080h0;
import p300k.p340c.p341m1.C5116n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b#\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B}\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u000fR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001e\u0010\t\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0018\"\u0004\b(\u0010\u001a¨\u0006)"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/message/AddresseeRealm;", "Lio/realm/RealmObject;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificModelRealm;", "uid", "", "id", "", "kretaId", "name", "typeId", "typeCode", "typeShortName", "typeName", "typeDescription", "profileId", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getKretaId", "setKretaId", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getProfileId", "setProfileId", "getTypeCode", "setTypeCode", "getTypeDescription", "setTypeDescription", "getTypeId", "setTypeId", "getTypeName", "setTypeName", "getTypeShortName", "setTypeShortName", "getUid", "setUid", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.message.AddresseeRealm */
/* compiled from: AddresseeRealm.kt */
public class AddresseeRealm extends C5080h0 implements ProfileSpecificModelRealm, C5056a1 {

    /* renamed from: c */
    public String f13783c;

    /* renamed from: e */
    public Long f13784e;

    /* renamed from: f */
    public Long f13785f;

    /* renamed from: g */
    public String f13786g;

    /* renamed from: h */
    public Long f13787h;

    /* renamed from: i */
    public String f13788i;

    /* renamed from: j */
    public String f13789j;

    /* renamed from: k */
    public String f13790k;

    /* renamed from: l */
    public String f13791l;

    /* renamed from: m */
    public String f13792m;

    public AddresseeRealm() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
    }

    public /* synthetic */ AddresseeRealm(String str, Long l, Long l2, String str2, Long l3, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = i;
        String str8 = null;
        String str9 = (i2 & 1) != 0 ? null : str;
        Long l4 = (i2 & 2) != 0 ? null : l;
        Long l5 = (i2 & 4) != 0 ? null : l2;
        String str10 = (i2 & 8) != 0 ? null : str2;
        Long l6 = (i2 & 16) != 0 ? null : l3;
        String str11 = (i2 & 32) != 0 ? null : str3;
        String str12 = (i2 & 64) != 0 ? null : str4;
        String str13 = (i2 & 128) != 0 ? null : str5;
        String str14 = (i2 & 256) != 0 ? null : str6;
        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0) {
            str8 = str7;
        }
        this(str9, l4, l5, str10, l6, str11, str12, str13, str14, str8);
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
    }

    /* renamed from: A1 */
    public Long mo13246A1() {
        return this.f13785f;
    }

    /* renamed from: H */
    public String mo13247H() {
        return this.f13789j;
    }

    /* renamed from: a */
    public String mo13248a() {
        return this.f13792m;
    }

    /* renamed from: a */
    public void mo13249a(Long l) {
        this.f13787h = l;
    }

    /* renamed from: a */
    public void mo13250a(String str) {
        this.f13792m = str;
    }

    /* renamed from: b */
    public String mo13251b() {
        return this.f13783c;
    }

    /* renamed from: b */
    public void mo13252b(Long l) {
        this.f13785f = l;
    }

    /* renamed from: b */
    public void mo13253b(String str) {
        this.f13783c = str;
    }

    /* renamed from: c */
    public void mo13254c(String str) {
        this.f13790k = str;
    }

    /* renamed from: d */
    public void mo13255d(Long l) {
        this.f13784e = l;
    }

    /* renamed from: d */
    public void mo13256d(String str) {
        this.f13786g = str;
    }

    /* renamed from: d2 */
    public final Long mo13257d2() {
        return mo13258e();
    }

    /* renamed from: e */
    public Long mo13258e() {
        return this.f13784e;
    }

    /* renamed from: e2 */
    public final Long mo13259e2() {
        return mo13246A1();
    }

    /* renamed from: f */
    public void mo13260f(String str) {
        this.f13791l = str;
    }

    /* renamed from: f2 */
    public final String mo13261f2() {
        return mo13265i();
    }

    /* renamed from: g */
    public String mo13262g() {
        return this.f13790k;
    }

    /* renamed from: g2 */
    public String mo13263g2() {
        return mo13248a();
    }

    /* renamed from: h2 */
    public final String mo13264h2() {
        return mo13271l();
    }

    /* renamed from: i */
    public String mo13265i() {
        return this.f13786g;
    }

    /* renamed from: i */
    public void mo13266i(String str) {
        this.f13788i = str;
    }

    /* renamed from: i2 */
    public final String mo13267i2() {
        return mo13269k();
    }

    /* renamed from: j2 */
    public final Long mo13268j2() {
        return mo13274w();
    }

    /* renamed from: k */
    public String mo13269k() {
        return this.f13791l;
    }

    /* renamed from: k2 */
    public final String mo13270k2() {
        return mo13262g();
    }

    /* renamed from: l */
    public String mo13271l() {
        return this.f13788i;
    }

    /* renamed from: l2 */
    public final String mo13272l2() {
        return mo13247H();
    }

    /* renamed from: p */
    public void mo13273p(String str) {
        this.f13789j = str;
    }

    /* renamed from: w */
    public Long mo13274w() {
        return this.f13787h;
    }

    public AddresseeRealm(String str, Long l, Long l2, String str2, Long l3, String str3, String str4, String str5, String str6, String str7) {
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
        mo13253b(str);
        mo13255d(l);
        mo13252b(l2);
        mo13256d(str2);
        mo13249a(l3);
        mo13266i(str3);
        mo13273p(str4);
        mo13254c(str5);
        mo13260f(str6);
        mo13250a(str7);
    }
}
