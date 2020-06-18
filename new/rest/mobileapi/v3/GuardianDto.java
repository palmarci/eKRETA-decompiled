package hu.ekreta.ellenorzo.rest.mobileapi.v3;

import a.b.a.a.a;
import a.h.c.z.c;
import hu.ekreta.ellenorzo.profile.Guardian;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.util.dto.ProfileSpecificDto;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import hu.ekreta.ellenorzo.util.mapper.ProfileSpecificModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u001f\u0010\u0019\u001a\u0002H\u001a\"\b\b\u0000\u0010\u001a*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016¢\u0006\u0002\u0010\u001eJ\t\u0010\u001f\u001a\u00020\u0004HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/GuardianDto;", "Lhu/ekreta/ellenorzo/util/dto/ProfileSpecificDto;", "Lhu/ekreta/ellenorzo/profile/Guardian;", "uid", "", "name", "email", "phoneNumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getName", "getPhoneNumber", "getUid", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toModel", "TModel", "Lhu/ekreta/ellenorzo/util/mapper/ProfileSpecificModel;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "(Lhu/ekreta/ellenorzo/profile/Profile;)Lhu/ekreta/ellenorzo/util/mapper/ProfileSpecificModel;", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: GuardianDto.kt */
public final class GuardianDto implements ProfileSpecificDto<Guardian> {
    @c("EmailCim")
    public final String email;
    @c("Nev")
    public final String name;
    @c("Telefonszam")
    public final String phoneNumber;
    @c("Uid")
    public final String uid;

    public GuardianDto(String str, String str2, String str3, String str4) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        this.uid = str;
        this.name = str2;
        this.email = str3;
        this.phoneNumber = str4;
    }

    public static /* synthetic */ GuardianDto copy$default(GuardianDto guardianDto, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = guardianDto.uid;
        }
        if ((i2 & 2) != 0) {
            str2 = guardianDto.name;
        }
        if ((i2 & 4) != 0) {
            str3 = guardianDto.email;
        }
        if ((i2 & 8) != 0) {
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GuardianDto)) {
            return false;
        }
        GuardianDto guardianDto = (GuardianDto) obj;
        return Intrinsics.areEqual((Object) this.uid, (Object) guardianDto.uid) && Intrinsics.areEqual((Object) this.name, (Object) guardianDto.name) && Intrinsics.areEqual((Object) this.email, (Object) guardianDto.email) && Intrinsics.areEqual((Object) this.phoneNumber, (Object) guardianDto.phoneNumber);
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
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.email;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.phoneNumber;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode3 + i2;
    }

    public <TModel extends ProfileSpecificModel> TModel toModel(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        String str = this.uid;
        return new Guardian(profile.m(), str, this.name, this.email, this.phoneNumber);
    }

    public String toString() {
        StringBuilder a2 = a.a("GuardianDto(uid=");
        a2.append(this.uid);
        a2.append(", name=");
        a2.append(this.name);
        a2.append(", email=");
        a2.append(this.email);
        a2.append(", phoneNumber=");
        return a.a(a2, this.phoneNumber, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GuardianDto(String str, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4);
    }
}
