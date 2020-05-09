package p289hu.ekreta.ellenorzo.subject;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.p349io.ConstantsKt;
import p289hu.ekreta.ellenorzo.util.dao.ProfileSpecificModelRealm;
import p300k.p340c.C5080h0;
import p300k.p340c.C5090j1;
import p300k.p340c.p341m1.C5116n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b!\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B}\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001e\u0010\r\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0012\"\u0004\b\u001f\u0010\u0014R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\n\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0012\"\u0004\b%\u0010\u0014R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b&\u0010\u001a\"\u0004\b'\u0010\u001cR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0012\"\u0004\b)\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0012\"\u0004\b+\u0010\u0014¨\u0006,"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/subject/SubjectRealm;", "Lio/realm/RealmObject;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificModelRealm;", "profileId", "", "subject", "average", "sortIndex", "", "classAverage", "isClassAverageAvailable", "", "educationTypeName", "educationTypeSortIndex", "sortedListOfAverages", "groupUid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getAverage", "()Ljava/lang/String;", "setAverage", "(Ljava/lang/String;)V", "getClassAverage", "setClassAverage", "getEducationTypeName", "setEducationTypeName", "getEducationTypeSortIndex", "()Ljava/lang/Integer;", "setEducationTypeSortIndex", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getGroupUid", "setGroupUid", "()Ljava/lang/Boolean;", "setClassAverageAvailable", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getProfileId", "setProfileId", "getSortIndex", "setSortIndex", "getSortedListOfAverages", "setSortedListOfAverages", "getSubject", "setSubject", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.subject.SubjectRealm */
/* compiled from: SubjectRealm.kt */
public class SubjectRealm extends C5080h0 implements ProfileSpecificModelRealm, C5090j1 {

    /* renamed from: c */
    public String f14839c;

    /* renamed from: e */
    public String f14840e;

    /* renamed from: f */
    public String f14841f;

    /* renamed from: g */
    public Integer f14842g;

    /* renamed from: h */
    public String f14843h;

    /* renamed from: i */
    public Boolean f14844i;

    /* renamed from: j */
    public String f14845j;

    /* renamed from: k */
    public Integer f14846k;

    /* renamed from: l */
    public String f14847l;

    /* renamed from: m */
    public String f14848m;

    public SubjectRealm() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
    }

    public /* synthetic */ SubjectRealm(String str, String str2, String str3, Integer num, String str4, Boolean bool, String str5, Integer num2, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = i;
        String str8 = null;
        String str9 = (i2 & 1) != 0 ? null : str;
        String str10 = (i2 & 2) != 0 ? null : str2;
        String str11 = (i2 & 4) != 0 ? null : str3;
        Integer num3 = (i2 & 8) != 0 ? null : num;
        String str12 = (i2 & 16) != 0 ? null : str4;
        Boolean bool2 = (i2 & 32) != 0 ? null : bool;
        String str13 = (i2 & 64) != 0 ? null : str5;
        Integer num4 = (i2 & 128) != 0 ? null : num2;
        String str14 = (i2 & 256) != 0 ? null : str6;
        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0) {
            str8 = str7;
        }
        this(str9, str10, str11, num3, str12, bool2, str13, num4, str14, str8);
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
    }

    /* renamed from: B */
    public String mo15705B() {
        return this.f14840e;
    }

    /* renamed from: I */
    public Integer mo15706I() {
        return this.f14846k;
    }

    /* renamed from: L */
    public String mo15707L() {
        return this.f14845j;
    }

    /* renamed from: N1 */
    public String mo15708N1() {
        return this.f14843h;
    }

    /* renamed from: O1 */
    public String mo15709O1() {
        return this.f14847l;
    }

    /* renamed from: W */
    public void mo15710W(String str) {
        this.f14847l = str;
    }

    /* renamed from: a */
    public String mo15711a() {
        return this.f14839c;
    }

    /* renamed from: a */
    public void mo15712a(String str) {
        this.f14839c = str;
    }

    /* renamed from: b0 */
    public void mo15713b0(String str) {
        this.f14843h = str;
    }

    /* renamed from: c */
    public void mo15714c(Integer num) {
        this.f14846k = num;
    }

    /* renamed from: d */
    public void mo15715d(Integer num) {
        this.f14842g = num;
    }

    /* renamed from: d2 */
    public final String mo15716d2() {
        return mo15721f1();
    }

    /* renamed from: e */
    public void mo15717e(String str) {
        this.f14848m = str;
    }

    /* renamed from: e0 */
    public void mo15718e0(String str) {
        this.f14841f = str;
    }

    /* renamed from: e2 */
    public final String mo15719e2() {
        return mo15708N1();
    }

    /* renamed from: f */
    public void mo15720f(Boolean bool) {
        this.f14844i = bool;
    }

    /* renamed from: f1 */
    public String mo15721f1() {
        return this.f14841f;
    }

    /* renamed from: f2 */
    public final String mo15722f2() {
        return mo15707L();
    }

    /* renamed from: g2 */
    public final Integer mo15723g2() {
        return mo15706I();
    }

    /* renamed from: h */
    public String mo15724h() {
        return this.f14848m;
    }

    /* renamed from: h2 */
    public final String mo15725h2() {
        return mo15724h();
    }

    /* renamed from: i2 */
    public String mo15726i2() {
        return mo15711a();
    }

    /* renamed from: j2 */
    public final Integer mo15727j2() {
        return mo15733y();
    }

    /* renamed from: k2 */
    public final String mo15728k2() {
        return mo15709O1();
    }

    /* renamed from: l2 */
    public final String mo15729l2() {
        return mo15705B();
    }

    /* renamed from: m2 */
    public final Boolean mo15730m2() {
        return mo15731n1();
    }

    /* renamed from: n1 */
    public Boolean mo15731n1() {
        return this.f14844i;
    }

    /* renamed from: v */
    public void mo15732v(String str) {
        this.f14845j = str;
    }

    /* renamed from: y */
    public Integer mo15733y() {
        return this.f14842g;
    }

    /* renamed from: y */
    public void mo15734y(String str) {
        this.f14840e = str;
    }

    public SubjectRealm(String str, String str2, String str3, Integer num, String str4, Boolean bool, String str5, Integer num2, String str6, String str7) {
        if (this instanceof C5116n) {
            ((C5116n) this).mo16468K();
        }
        mo15712a(str);
        mo15734y(str2);
        mo15718e0(str3);
        mo15715d(num);
        mo15713b0(str4);
        mo15720f(bool);
        mo15732v(str5);
        mo15714c(num2);
        mo15710W(str6);
        mo15717e(str7);
    }
}
