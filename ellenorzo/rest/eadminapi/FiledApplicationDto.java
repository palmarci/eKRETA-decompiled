package p289hu.ekreta.ellenorzo.rest.eadminapi;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p000a.p054h.p159c.p166z.C2580c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/eadminapi/FiledApplicationDto;", "", "id", "", "fileName", "", "registrationNumber", "file", "Lhu/ekreta/ellenorzo/rest/eadminapi/FileDto;", "(ILjava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/rest/eadminapi/FileDto;)V", "getFile", "()Lhu/ekreta/ellenorzo/rest/eadminapi/FileDto;", "getFileName", "()Ljava/lang/String;", "getId", "()I", "getRegistrationNumber", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.rest.eadminapi.FiledApplicationDto */
/* compiled from: FiledApplicationDto.kt */
public final class FiledApplicationDto {
    @C2580c("fajl")
    public final FileDto file;
    @C2580c("fajlNev")
    public final String fileName;
    @C2580c("azonosito")

    /* renamed from: id */
    public final int f14691id;
    @C2580c("iktatoszam")
    public final String registrationNumber;

    public FiledApplicationDto() {
        this(0, null, null, null, 15, null);
    }

    public FiledApplicationDto(int i, String str, String str2, FileDto fileDto) {
        Intrinsics.checkParameterIsNotNull(str, "fileName");
        Intrinsics.checkParameterIsNotNull(str2, "registrationNumber");
        this.f14691id = i;
        this.fileName = str;
        this.registrationNumber = str2;
        this.file = fileDto;
    }

    public static /* synthetic */ FiledApplicationDto copy$default(FiledApplicationDto filedApplicationDto, int i, String str, String str2, FileDto fileDto, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = filedApplicationDto.f14691id;
        }
        if ((i2 & 2) != 0) {
            str = filedApplicationDto.fileName;
        }
        if ((i2 & 4) != 0) {
            str2 = filedApplicationDto.registrationNumber;
        }
        if ((i2 & 8) != 0) {
            fileDto = filedApplicationDto.file;
        }
        return filedApplicationDto.copy(i, str, str2, fileDto);
    }

    public final int component1() {
        return this.f14691id;
    }

    public final String component2() {
        return this.fileName;
    }

    public final String component3() {
        return this.registrationNumber;
    }

    public final FileDto component4() {
        return this.file;
    }

    public final FiledApplicationDto copy(int i, String str, String str2, FileDto fileDto) {
        Intrinsics.checkParameterIsNotNull(str, "fileName");
        Intrinsics.checkParameterIsNotNull(str2, "registrationNumber");
        return new FiledApplicationDto(i, str, str2, fileDto);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FiledApplicationDto) {
                FiledApplicationDto filedApplicationDto = (FiledApplicationDto) obj;
                if (!(this.f14691id == filedApplicationDto.f14691id) || !Intrinsics.areEqual((Object) this.fileName, (Object) filedApplicationDto.fileName) || !Intrinsics.areEqual((Object) this.registrationNumber, (Object) filedApplicationDto.registrationNumber) || !Intrinsics.areEqual((Object) this.file, (Object) filedApplicationDto.file)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final FileDto getFile() {
        return this.file;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final int getId() {
        return this.f14691id;
    }

    public final String getRegistrationNumber() {
        return this.registrationNumber;
    }

    public int hashCode() {
        int i = this.f14691id * 31;
        String str = this.fileName;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.registrationNumber;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        FileDto fileDto = this.file;
        if (fileDto != null) {
            i2 = fileDto.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("FiledApplicationDto(id=");
        a.append(this.f14691id);
        a.append(", fileName=");
        a.append(this.fileName);
        a.append(", registrationNumber=");
        a.append(this.registrationNumber);
        a.append(", file=");
        a.append(this.file);
        a.append(")");
        return a.toString();
    }

    public /* synthetic */ FiledApplicationDto(int i, String str, String str2, FileDto fileDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        String str3 = "";
        if ((i2 & 2) != 0) {
            str = str3;
        }
        if ((i2 & 4) != 0) {
            str2 = str3;
        }
        if ((i2 & 8) != 0) {
            fileDto = null;
        }
        this(i, str, str2, fileDto);
    }
}
