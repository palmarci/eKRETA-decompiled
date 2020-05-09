package p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p000a.p054h.p159c.p166z.C2580c;
import p289hu.ekreta.ellenorzo.profile.Guardian;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.util.dto.ProfileSpecificDto;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p289hu.ekreta.ellenorzo.util.mapper.ProfileSpecificModel;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u001f\u0010\u0019\u001a\u0002H\u001a\"\b\b\u0000\u0010\u001a*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016¢\u0006\u0002\u0010\u001eJ\t\u0010\u001f\u001a\u00020\u0004HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/GuardianDto;", "Lhu/ekreta/ellenorzo/util/dto/ProfileSpecificDto;", "Lhu/ekreta/ellenorzo/profile/Guardian;", "uid", "", "name", "email", "phoneNumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getName", "getPhoneNumber", "getUid", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toModel", "TModel", "Lhu/ekreta/ellenorzo/util/mapper/ProfileSpecificModel;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "(Lhu/ekreta/ellenorzo/profile/Profile;)Lhu/ekreta/ellenorzo/util/mapper/ProfileSpecificModel;", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.rest.mobileapi.v3.GuardianDto */
/* compiled from: GuardianDto.kt */
public final class GuardianDto implements ProfileSpecificDto<Guardian> {
    @C2580c("EmailCim")
    public final String email;
    @C2580c("Nev")
    public final String name;
    @C2580c("Telefonszam")
    public final String phoneNumber;
    @C2580c("Uid")
    public final String uid;

    public GuardianDto(String str, String str2, String str3, String str4) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        this.uid = str;
        this.name = str2;
        this.email = str3;
        this.phoneNumber = str4;
    }

    public static /* synthetic */ GuardianDto copy$default(GuardianDto guardianDto, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = guardianDto.uid;
        }
        if ((i & 2) != 0) {
            str2 = guardianDto.name;
        }
        if ((i & 4) != 0) {
            str3 = guardianDto.email;
        }
        if ((i & 8) != 0) {
            str4 = guardianDto.phoneNumber;
        }
        return guardianDto.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.uid;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.email;
    }

    public final String component4() {
        return this.phoneNumber;
    }

    public final GuardianDto copy(String str, String str2, String str3, String str4) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        return new GuardianDto(str, str2, str3, str4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.phoneNumber, (java.lang.Object) r3.phoneNumber) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.GuardianDto
            if (r0 == 0) goto L_0x0031
            hu.ekreta.ellenorzo.rest.mobileapi.v3.GuardianDto r3 = (p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.GuardianDto) r3
            java.lang.String r0 = r2.uid
            java.lang.String r1 = r3.uid
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.name
            java.lang.String r1 = r3.name
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.email
            java.lang.String r1 = r3.email
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.phoneNumber
            java.lang.String r3 = r3.phoneNumber
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.GuardianDto.equals(java.lang.Object):boolean");
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        String str = this.uid;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.email;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.phoneNumber;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public <TModel extends ProfileSpecificModel> TModel toModel(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        String str = this.uid;
        Guardian guardian = new Guardian(profile.mo14054m(), str, this.name, this.email, this.phoneNumber);
        return guardian;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("GuardianDto(uid=");
        a.append(this.uid);
        a.append(", name=");
        a.append(this.name);
        a.append(", email=");
        a.append(this.email);
        a.append(", phoneNumber=");
        return C0082a.m106a(a, this.phoneNumber, ")");
    }

    public /* synthetic */ GuardianDto(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        this(str, str2, str3, str4);
    }
}
