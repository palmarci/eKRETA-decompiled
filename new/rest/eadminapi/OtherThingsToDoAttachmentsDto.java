package hu.ekreta.ellenorzo.rest.eadminapi;

import a.b.a.a.a;
import a.h.c.z.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J>\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r¨\u0006\u001d"}, d2 = {"Lhu/ekreta/ellenorzo/rest/eadminapi/OtherThingsToDoAttachmentsDto;", "", "id", "", "fileName", "", "registrationNumber", "file", "Lhu/ekreta/ellenorzo/rest/eadminapi/FileDto;", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/rest/eadminapi/FileDto;)V", "getFile", "()Lhu/ekreta/ellenorzo/rest/eadminapi/FileDto;", "getFileName", "()Ljava/lang/String;", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRegistrationNumber", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/rest/eadminapi/FileDto;)Lhu/ekreta/ellenorzo/rest/eadminapi/OtherThingsToDoAttachmentsDto;", "equals", "", "other", "hashCode", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: OtherThingsToDoAttachmentsDto.kt */
public final class OtherThingsToDoAttachmentsDto {
    @c("fajl")
    public final FileDto file;
    @c("fajlNev")
    public final String fileName;
    @c("azonosito")
    public final Integer id;
    @c("iktatoszam")
    public final String registrationNumber;

    public OtherThingsToDoAttachmentsDto(Integer num, String str, String str2, FileDto fileDto) {
        this.id = num;
        this.fileName = str;
        this.registrationNumber = str2;
        this.file = fileDto;
    }

    public static /* synthetic */ OtherThingsToDoAttachmentsDto copy$default(OtherThingsToDoAttachmentsDto otherThingsToDoAttachmentsDto, Integer num, String str, String str2, FileDto fileDto, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = otherThingsToDoAttachmentsDto.id;
        }
        if ((i2 & 2) != 0) {
            str = otherThingsToDoAttachmentsDto.fileName;
        }
        if ((i2 & 4) != 0) {
            str2 = otherThingsToDoAttachmentsDto.registrationNumber;
        }
        if ((i2 & 8) != 0) {
            fileDto = otherThingsToDoAttachmentsDto.file;
        }
        return otherThingsToDoAttachmentsDto.copy(num, str, str2, fileDto);
    }

    public final Integer component1() {
        return this.id;
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

    public final OtherThingsToDoAttachmentsDto copy(Integer num, String str, String str2, FileDto fileDto) {
        return new OtherThingsToDoAttachmentsDto(num, str, str2, fileDto);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OtherThingsToDoAttachmentsDto)) {
            return false;
        }
        OtherThingsToDoAttachmentsDto otherThingsToDoAttachmentsDto = (OtherThingsToDoAttachmentsDto) obj;
        return Intrinsics.areEqual((Object) this.id, (Object) otherThingsToDoAttachmentsDto.id) && Intrinsics.areEqual((Object) this.fileName, (Object) otherThingsToDoAttachmentsDto.fileName) && Intrinsics.areEqual((Object) this.registrationNumber, (Object) otherThingsToDoAttachmentsDto.registrationNumber) && Intrinsics.areEqual((Object) this.file, (Object) otherThingsToDoAttachmentsDto.file);
    }

    public final FileDto getFile() {
        return this.file;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final Integer getId() {
        return this.id;
    }

    public final String getRegistrationNumber() {
        return this.registrationNumber;
    }

    public int hashCode() {
        Integer num = this.id;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.fileName;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.registrationNumber;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        FileDto fileDto = this.file;
        if (fileDto != null) {
            i2 = fileDto.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("OtherThingsToDoAttachmentsDto(id=");
        a2.append(this.id);
        a2.append(", fileName=");
        a2.append(this.fileName);
        a2.append(", registrationNumber=");
        a2.append(this.registrationNumber);
        a2.append(", file=");
        a2.append(this.file);
        a2.append(")");
        return a2.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OtherThingsToDoAttachmentsDto(Integer num, String str, String str2, FileDto fileDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, str, str2, (i2 & 8) != 0 ? null : fileDto);
    }
}
