package p289hu.ekreta.ellenorzo.institute;

import java.text.Collator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000a.p054h.p159c.p166z.C2580c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\u0011\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0000H\u0002J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u0011\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0010HÖ\u0001J\b\u0010\u001c\u001a\u00020\u0003H\u0016R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001d"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/institute/Institute;", "", "instituteCode", "", "name", "url", "city", "advertisingUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdvertisingUrl", "()Ljava/lang/String;", "getCity", "getInstituteCode", "getName", "getUrl", "compareTo", "", "other", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "", "hashCode", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.institute.Institute */
/* compiled from: Institutes.kt */
public final class Institute implements Comparable<Institute> {
    @C2580c("instituteCode")

    /* renamed from: c */
    public final String f13575c;
    @C2580c("name")

    /* renamed from: e */
    public final String f13576e;
    @C2580c("url")

    /* renamed from: f */
    public final String f13577f;
    @C2580c("city")

    /* renamed from: g */
    public final String f13578g;
    @C2580c("advertisingUrl")

    /* renamed from: h */
    public final String f13579h;

    public Institute(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkParameterIsNotNull(str, "instituteCode");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        Intrinsics.checkParameterIsNotNull(str3, "url");
        Intrinsics.checkParameterIsNotNull(str4, "city");
        Intrinsics.checkParameterIsNotNull(str5, "advertisingUrl");
        this.f13575c = str;
        this.f13576e = str2;
        this.f13577f = str3;
        this.f13578g = str4;
        this.f13579h = str5;
    }

    public static /* synthetic */ Institute copy$default(Institute institute, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = institute.f13575c;
        }
        if ((i & 2) != 0) {
            str2 = institute.f13576e;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = institute.f13577f;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = institute.f13578g;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = institute.f13579h;
        }
        return institute.mo13064a(str, str6, str7, str8, str5);
    }

    /* renamed from: a */
    public final Institute mo13064a(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkParameterIsNotNull(str, "instituteCode");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        Intrinsics.checkParameterIsNotNull(str3, "url");
        Intrinsics.checkParameterIsNotNull(str4, "city");
        Intrinsics.checkParameterIsNotNull(str5, "advertisingUrl");
        Institute institute = new Institute(str, str2, str3, str4, str5);
        return institute;
    }

    /* renamed from: a */
    public final String mo13065a() {
        return this.f13578g;
    }

    /* renamed from: b */
    public final String mo13066b() {
        return this.f13575c;
    }

    /* renamed from: c */
    public final String mo13067c() {
        return this.f13576e;
    }

    /* renamed from: e */
    public final String mo13069e() {
        return this.f13577f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f13579h, (java.lang.Object) r3.f13579h) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003d
            boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.institute.Institute
            if (r0 == 0) goto L_0x003b
            hu.ekreta.ellenorzo.institute.Institute r3 = (p289hu.ekreta.ellenorzo.institute.Institute) r3
            java.lang.String r0 = r2.f13575c
            java.lang.String r1 = r3.f13575c
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.f13576e
            java.lang.String r1 = r3.f13576e
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.f13577f
            java.lang.String r1 = r3.f13577f
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.f13578g
            java.lang.String r1 = r3.f13578g
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.f13579h
            java.lang.String r3 = r3.f13579h
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r3 = 0
            return r3
        L_0x003d:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.institute.Institute.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.f13575c;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f13576e;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f13577f;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f13578g;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f13579h;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13576e);
        sb.append(' ');
        sb.append(this.f13578g);
        sb.append(' ');
        sb.append(this.f13575c);
        return sb.toString();
    }

    public /* synthetic */ Institute(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 8) != 0) {
            str4 = "";
        }
        this(str, str2, str3, str4, str5);
    }

    /* renamed from: a */
    public int compareTo(Institute institute) {
        Intrinsics.checkParameterIsNotNull(institute, "other");
        return Collator.getInstance(new Locale("hu")).compare(this.f13576e, institute.f13576e);
    }
}
