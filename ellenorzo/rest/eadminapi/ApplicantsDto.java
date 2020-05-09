package p289hu.ekreta.ellenorzo.rest.eadminapi;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p000a.p054h.p159c.p166z.C2580c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001c"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/eadminapi/ApplicantsDto;", "", "id", "", "fileName", "", "shortName", "title", "userId", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getFileName", "()Ljava/lang/String;", "getId", "()I", "getShortName", "getTitle", "getUserId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.rest.eadminapi.ApplicantsDto */
/* compiled from: ApplicantsDto.kt */
public final class ApplicantsDto {
    @C2580c("felhasznaloNev")
    public final String fileName;
    @C2580c("azonosito")

    /* renamed from: id */
    public final int f14683id;
    @C2580c("nev")
    public final String shortName;
    @C2580c("titulus")
    public final String title;
    @C2580c("kretaFelhasznaloAzonosito")
    public final int userId;

    public ApplicantsDto() {
        this(0, null, null, null, 0, 31, null);
    }

    public ApplicantsDto(int i, String str, String str2, String str3, int i2) {
        C0082a.m114a(str, "fileName", str2, "shortName", str3, "title");
        this.f14683id = i;
        this.fileName = str;
        this.shortName = str2;
        this.title = str3;
        this.userId = i2;
    }

    public static /* synthetic */ ApplicantsDto copy$default(ApplicantsDto applicantsDto, int i, String str, String str2, String str3, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = applicantsDto.f14683id;
        }
        if ((i3 & 2) != 0) {
            str = applicantsDto.fileName;
        }
        String str4 = str;
        if ((i3 & 4) != 0) {
            str2 = applicantsDto.shortName;
        }
        String str5 = str2;
        if ((i3 & 8) != 0) {
            str3 = applicantsDto.title;
        }
        String str6 = str3;
        if ((i3 & 16) != 0) {
            i2 = applicantsDto.userId;
        }
        return applicantsDto.copy(i, str4, str5, str6, i2);
    }

    public final int component1() {
        return this.f14683id;
    }

    public final String component2() {
        return this.fileName;
    }

    public final String component3() {
        return this.shortName;
    }

    public final String component4() {
        return this.title;
    }

    public final int component5() {
        return this.userId;
    }

    public final ApplicantsDto copy(int i, String str, String str2, String str3, int i2) {
        Intrinsics.checkParameterIsNotNull(str, "fileName");
        Intrinsics.checkParameterIsNotNull(str2, "shortName");
        Intrinsics.checkParameterIsNotNull(str3, "title");
        ApplicantsDto applicantsDto = new ApplicantsDto(i, str, str2, str3, i2);
        return applicantsDto;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApplicantsDto) {
                ApplicantsDto applicantsDto = (ApplicantsDto) obj;
                if ((this.f14683id == applicantsDto.f14683id) && Intrinsics.areEqual((Object) this.fileName, (Object) applicantsDto.fileName) && Intrinsics.areEqual((Object) this.shortName, (Object) applicantsDto.shortName) && Intrinsics.areEqual((Object) this.title, (Object) applicantsDto.title)) {
                    if (this.userId == applicantsDto.userId) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final int getId() {
        return this.f14683id;
    }

    public final String getShortName() {
        return this.shortName;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int i = this.f14683id * 31;
        String str = this.fileName;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.shortName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.title;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return ((hashCode2 + i2) * 31) + this.userId;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("ApplicantsDto(id=");
        a.append(this.f14683id);
        a.append(", fileName=");
        a.append(this.fileName);
        a.append(", shortName=");
        a.append(this.shortName);
        a.append(", title=");
        a.append(this.title);
        a.append(", userId=");
        return C0082a.m105a(a, this.userId, ")");
    }

    public /* synthetic */ ApplicantsDto(int i, String str, String str2, String str3, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        String str4 = "";
        String str5 = (i3 & 2) != 0 ? str4 : str;
        String str6 = (i3 & 4) != 0 ? str4 : str2;
        if ((i3 & 8) == 0) {
            str4 = str3;
        }
        this(i4, str5, str6, str4, (i3 & 16) != 0 ? 0 : i2);
    }
}
