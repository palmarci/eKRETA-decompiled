package p289hu.ekreta.ellenorzo.rest.eadminapi;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p000a.p054h.p159c.p166z.C2580c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\b\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003JF\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0004\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001e"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/eadminapi/SignerDto;", "", "id", "", "isSigner", "", "educationId", "", "name", "title", "(ILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEducationId", "()Ljava/lang/String;", "getId", "()I", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getName", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "(ILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lhu/ekreta/ellenorzo/rest/eadminapi/SignerDto;", "equals", "other", "hashCode", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.rest.eadminapi.SignerDto */
/* compiled from: SignerDto.kt */
public final class SignerDto {
    @C2580c("oktatasiAzonosito")
    public final String educationId;
    @C2580c("kretaAzonosito")

    /* renamed from: id */
    public final int f14696id;
    @C2580c("isAlairo")
    public final Boolean isSigner;
    @C2580c("nev")
    public final String name;
    @C2580c("titulus")
    public final String title;

    public SignerDto(int i, Boolean bool, String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str3, "title");
        this.f14696id = i;
        this.isSigner = bool;
        this.educationId = str;
        this.name = str2;
        this.title = str3;
    }

    public static /* synthetic */ SignerDto copy$default(SignerDto signerDto, int i, Boolean bool, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = signerDto.f14696id;
        }
        if ((i2 & 2) != 0) {
            bool = signerDto.isSigner;
        }
        Boolean bool2 = bool;
        if ((i2 & 4) != 0) {
            str = signerDto.educationId;
        }
        String str4 = str;
        if ((i2 & 8) != 0) {
            str2 = signerDto.name;
        }
        String str5 = str2;
        if ((i2 & 16) != 0) {
            str3 = signerDto.title;
        }
        return signerDto.copy(i, bool2, str4, str5, str3);
    }

    public final int component1() {
        return this.f14696id;
    }

    public final Boolean component2() {
        return this.isSigner;
    }

    public final String component3() {
        return this.educationId;
    }

    public final String component4() {
        return this.name;
    }

    public final String component5() {
        return this.title;
    }

    public final SignerDto copy(int i, Boolean bool, String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str3, "title");
        SignerDto signerDto = new SignerDto(i, bool, str, str2, str3);
        return signerDto;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SignerDto) {
                SignerDto signerDto = (SignerDto) obj;
                if (!(this.f14696id == signerDto.f14696id) || !Intrinsics.areEqual((Object) this.isSigner, (Object) signerDto.isSigner) || !Intrinsics.areEqual((Object) this.educationId, (Object) signerDto.educationId) || !Intrinsics.areEqual((Object) this.name, (Object) signerDto.name) || !Intrinsics.areEqual((Object) this.title, (Object) signerDto.title)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String getEducationId() {
        return this.educationId;
    }

    public final int getId() {
        return this.f14696id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int i = this.f14696id * 31;
        Boolean bool = this.isSigner;
        int i2 = 0;
        int hashCode = (i + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.educationId;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.title;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode3 + i2;
    }

    public final Boolean isSigner() {
        return this.isSigner;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("SignerDto(id=");
        a.append(this.f14696id);
        a.append(", isSigner=");
        a.append(this.isSigner);
        a.append(", educationId=");
        a.append(this.educationId);
        a.append(", name=");
        a.append(this.name);
        a.append(", title=");
        return C0082a.m106a(a, this.title, ")");
    }
}
