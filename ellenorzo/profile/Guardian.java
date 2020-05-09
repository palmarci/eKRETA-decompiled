package p289hu.ekreta.ellenorzo.profile;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p289hu.ekreta.ellenorzo.util.mapper.ProfileSpecificModel;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001c"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/profile/Guardian;", "Lhu/ekreta/ellenorzo/util/mapper/ProfileSpecificModel;", "profileId", "", "uid", "name", "email", "phoneNumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getName", "getPhoneNumber", "getProfileId", "getUid", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.profile.Guardian */
/* compiled from: Guardian.kt */
public final class Guardian implements ProfileSpecificModel {

    /* renamed from: c */
    public final String f14454c;

    /* renamed from: e */
    public final String f14455e;

    /* renamed from: f */
    public final String f14456f;

    /* renamed from: g */
    public final String f14457g;

    /* renamed from: h */
    public final String f14458h;

    public Guardian(String str, String str2, String str3, String str4, String str5) {
        C0082a.m114a(str, "profileId", str2, "uid", str3, "name");
        this.f14454c = str;
        this.f14455e = str2;
        this.f14456f = str3;
        this.f14457g = str4;
        this.f14458h = str5;
    }

    public static /* synthetic */ Guardian copy$default(Guardian guardian, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = guardian.mo11318e();
        }
        if ((i & 2) != 0) {
            str2 = guardian.f14455e;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = guardian.f14456f;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = guardian.f14457g;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = guardian.f14458h;
        }
        return guardian.mo14012a(str, str6, str7, str8, str5);
    }

    /* renamed from: a */
    public final Guardian mo14012a(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkParameterIsNotNull(str, "profileId");
        Intrinsics.checkParameterIsNotNull(str2, "uid");
        Intrinsics.checkParameterIsNotNull(str3, "name");
        Guardian guardian = new Guardian(str, str2, str3, str4, str5);
        return guardian;
    }

    /* renamed from: a */
    public final String mo14013a() {
        return this.f14457g;
    }

    /* renamed from: b */
    public final String mo14014b() {
        return this.f14456f;
    }

    /* renamed from: c */
    public final String mo14015c() {
        return this.f14458h;
    }

    /* renamed from: d */
    public final String mo14016d() {
        return this.f14455e;
    }

    /* renamed from: e */
    public String mo11318e() {
        return this.f14454c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f14458h, (java.lang.Object) r3.f14458h) != false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0041
            boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.profile.Guardian
            if (r0 == 0) goto L_0x003f
            hu.ekreta.ellenorzo.profile.Guardian r3 = (p289hu.ekreta.ellenorzo.profile.Guardian) r3
            java.lang.String r0 = r2.mo11318e()
            java.lang.String r1 = r3.mo11318e()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = r2.f14455e
            java.lang.String r1 = r3.f14455e
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = r2.f14456f
            java.lang.String r1 = r3.f14456f
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = r2.f14457g
            java.lang.String r1 = r3.f14457g
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = r2.f14458h
            java.lang.String r3 = r3.f14458h
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r3 = 0
            return r3
        L_0x0041:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.profile.Guardian.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String e = mo11318e();
        int i = 0;
        int hashCode = (e != null ? e.hashCode() : 0) * 31;
        String str = this.f14455e;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f14456f;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f14457g;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f14458h;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("Guardian(profileId=");
        a.append(mo11318e());
        a.append(", uid=");
        a.append(this.f14455e);
        a.append(", name=");
        a.append(this.f14456f);
        a.append(", email=");
        a.append(this.f14457g);
        a.append(", phoneNumber=");
        return C0082a.m106a(a, this.f14458h, ")");
    }
}
