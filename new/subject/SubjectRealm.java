package hu.ekreta.ellenorzo.subject;

import hu.ekreta.ellenorzo.util.dao.ProfileSpecificModelRealm;
import k.c.h0;
import k.c.j1;
import k.c.m1.n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b!\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B}\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001e\u0010\r\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0012\"\u0004\b\u001f\u0010\u0014R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\n\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0012\"\u0004\b%\u0010\u0014R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b&\u0010\u001a\"\u0004\b'\u0010\u001cR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0012\"\u0004\b)\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0012\"\u0004\b+\u0010\u0014¨\u0006,"}, d2 = {"Lhu/ekreta/ellenorzo/subject/SubjectRealm;", "Lio/realm/RealmObject;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificModelRealm;", "profileId", "", "subject", "average", "sortIndex", "", "classAverage", "isClassAverageAvailable", "", "educationTypeName", "educationTypeSortIndex", "sortedListOfAverages", "groupUid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getAverage", "()Ljava/lang/String;", "setAverage", "(Ljava/lang/String;)V", "getClassAverage", "setClassAverage", "getEducationTypeName", "setEducationTypeName", "getEducationTypeSortIndex", "()Ljava/lang/Integer;", "setEducationTypeSortIndex", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getGroupUid", "setGroupUid", "()Ljava/lang/Boolean;", "setClassAverageAvailable", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getProfileId", "setProfileId", "getSortIndex", "setSortIndex", "getSortedListOfAverages", "setSortedListOfAverages", "getSubject", "setSubject", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: SubjectRealm.kt */
public class SubjectRealm extends h0 implements ProfileSpecificModelRealm, j1 {
    public String c;
    public String e;
    public String f;

    /* renamed from: g  reason: collision with root package name */
    public Integer f6138g;

    /* renamed from: h  reason: collision with root package name */
    public String f6139h;

    /* renamed from: i  reason: collision with root package name */
    public Boolean f6140i;

    /* renamed from: j  reason: collision with root package name */
    public String f6141j;

    /* renamed from: k  reason: collision with root package name */
    public Integer f6142k;

    /* renamed from: l  reason: collision with root package name */
    public String f6143l;

    /* renamed from: m  reason: collision with root package name */
    public String f6144m;

    public SubjectRealm() {
        this((String) null, (String) null, (String) null, (Integer) null, (String) null, (Boolean) null, (String) null, (Integer) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
        if (this instanceof n) {
            ((n) this).K();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SubjectRealm(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.Integer r16, java.lang.String r17, java.lang.Boolean r18, java.lang.String r19, java.lang.Integer r20, java.lang.String r21, java.lang.String r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
        /*
            r12 = this;
            r0 = r12
            r1 = r23
            r2 = r1 & 1
            r3 = 0
            if (r2 == 0) goto L_0x000a
            r2 = r3
            goto L_0x000b
        L_0x000a:
            r2 = r13
        L_0x000b:
            r4 = r1 & 2
            if (r4 == 0) goto L_0x0011
            r4 = r3
            goto L_0x0012
        L_0x0011:
            r4 = r14
        L_0x0012:
            r5 = r1 & 4
            if (r5 == 0) goto L_0x0018
            r5 = r3
            goto L_0x0019
        L_0x0018:
            r5 = r15
        L_0x0019:
            r6 = r1 & 8
            if (r6 == 0) goto L_0x001f
            r6 = r3
            goto L_0x0021
        L_0x001f:
            r6 = r16
        L_0x0021:
            r7 = r1 & 16
            if (r7 == 0) goto L_0x0027
            r7 = r3
            goto L_0x0029
        L_0x0027:
            r7 = r17
        L_0x0029:
            r8 = r1 & 32
            if (r8 == 0) goto L_0x002f
            r8 = r3
            goto L_0x0031
        L_0x002f:
            r8 = r18
        L_0x0031:
            r9 = r1 & 64
            if (r9 == 0) goto L_0x0037
            r9 = r3
            goto L_0x0039
        L_0x0037:
            r9 = r19
        L_0x0039:
            r10 = r1 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x003f
            r10 = r3
            goto L_0x0041
        L_0x003f:
            r10 = r20
        L_0x0041:
            r11 = r1 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x0047
            r11 = r3
            goto L_0x0049
        L_0x0047:
            r11 = r21
        L_0x0049:
            r1 = r1 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            r3 = r22
        L_0x0050:
            r13 = r12
            r14 = r2
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r10
            r22 = r11
            r23 = r3
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            boolean r1 = r0 instanceof k.c.m1.n
            if (r1 == 0) goto L_0x0070
            r1 = r0
            k.c.m1.n r1 = (k.c.m1.n) r1
            r1.K()
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.subject.SubjectRealm.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public String B() {
        return this.e;
    }

    public Integer I() {
        return this.f6142k;
    }

    public String L() {
        return this.f6141j;
    }

    public String N1() {
        return this.f6139h;
    }

    public String O1() {
        return this.f6143l;
    }

    public void W(String str) {
        this.f6143l = str;
    }

    public String a() {
        return this.c;
    }

    public void a(String str) {
        this.c = str;
    }

    public void b0(String str) {
        this.f6139h = str;
    }

    public void c(Integer num) {
        this.f6142k = num;
    }

    public void d(Integer num) {
        this.f6138g = num;
    }

    public void e(String str) {
        this.f6144m = str;
    }

    public void e0(String str) {
        this.f = str;
    }

    public final String e2() {
        return f1();
    }

    public String f1() {
        return this.f;
    }

    public final String f2() {
        return N1();
    }

    public void g(Boolean bool) {
        this.f6140i = bool;
    }

    public final String g2() {
        return L();
    }

    public String h() {
        return this.f6144m;
    }

    public final Integer h2() {
        return I();
    }

    public final String i2() {
        return h();
    }

    public String j2() {
        return a();
    }

    public final Integer k2() {
        return y();
    }

    public final String l2() {
        return O1();
    }

    public final String m2() {
        return B();
    }

    public Boolean n1() {
        return this.f6140i;
    }

    public final Boolean n2() {
        return n1();
    }

    public void v(String str) {
        this.f6141j = str;
    }

    public Integer y() {
        return this.f6138g;
    }

    public void y(String str) {
        this.e = str;
    }

    public SubjectRealm(String str, String str2, String str3, Integer num, String str4, Boolean bool, String str5, Integer num2, String str6, String str7) {
        if (this instanceof n) {
            ((n) this).K();
        }
        a(str);
        y(str2);
        e0(str3);
        d(num);
        b0(str4);
        g(bool);
        v(str5);
        c(num2);
        W(str6);
        e(str7);
    }
}
