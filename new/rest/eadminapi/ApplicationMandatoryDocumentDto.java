package hu.ekreta.ellenorzo.rest.eadminapi;

import a.b.a.a.a;
import a.h.c.z.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003JJ\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011¨\u0006\""}, d2 = {"Lhu/ekreta/ellenorzo/rest/eadminapi/ApplicationMandatoryDocumentDto;", "", "id", "", "fileName", "", "registrationNumber", "file", "Lhu/ekreta/ellenorzo/rest/eadminapi/FileDto;", "applicationDocumentType", "Lhu/ekreta/ellenorzo/rest/eadminapi/ApplicationDocumentTypeDto;", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/rest/eadminapi/FileDto;Lhu/ekreta/ellenorzo/rest/eadminapi/ApplicationDocumentTypeDto;)V", "getApplicationDocumentType", "()Lhu/ekreta/ellenorzo/rest/eadminapi/ApplicationDocumentTypeDto;", "getFile", "()Lhu/ekreta/ellenorzo/rest/eadminapi/FileDto;", "getFileName", "()Ljava/lang/String;", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRegistrationNumber", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/rest/eadminapi/FileDto;Lhu/ekreta/ellenorzo/rest/eadminapi/ApplicationDocumentTypeDto;)Lhu/ekreta/ellenorzo/rest/eadminapi/ApplicationMandatoryDocumentDto;", "equals", "", "other", "hashCode", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: ApplicationMandatoryDocumentDto.kt */
public final class ApplicationMandatoryDocumentDto {
    @c("tipus")
    public final ApplicationDocumentTypeDto applicationDocumentType;
    @c("fajl")
    public final FileDto file;
    @c("fajlNev")
    public final String fileName;
    @c("azonosito")
    public final Integer id;
    @c("iktatoszam")
    public final String registrationNumber;

    public ApplicationMandatoryDocumentDto(Integer num, String str, String str2, FileDto fileDto, ApplicationDocumentTypeDto applicationDocumentTypeDto) {
        this.id = num;
        this.fileName = str;
        this.registrationNumber = str2;
        this.file = fileDto;
        this.applicationDocumentType = applicationDocumentTypeDto;
    }

    public static /* synthetic */ ApplicationMandatoryDocumentDto copy$default(ApplicationMandatoryDocumentDto applicationMandatoryDocumentDto, Integer num, String str, String str2, FileDto fileDto, ApplicationDocumentTypeDto applicationDocumentTypeDto, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = applicationMandatoryDocumentDto.id;
        }
        if ((i2 & 2) != 0) {
            str = applicationMandatoryDocumentDto.fileName;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            str2 = applicationMandatoryDocumentDto.registrationNumber;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            fileDto = applicationMandatoryDocumentDto.file;
        }
        FileDto fileDto2 = fileDto;
        if ((i2 & 16) != 0) {
            applicationDocumentTypeDto = applicationMandatoryDocumentDto.applicationDocumentType;
        }
        return applicationMandatoryDocumentDto.copy(num, str3, str4, fileDto2, applicationDocumentTypeDto);
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

    public final ApplicationDocumentTypeDto component5() {
        return this.applicationDocumentType;
    }

    public final ApplicationMandatoryDocumentDto copy(Integer num, String str, String str2, FileDto fileDto, ApplicationDocumentTypeDto applicationDocumentTypeDto) {
        return new ApplicationMandatoryDocumentDto(num, str, str2, fileDto, applicationDocumentTypeDto);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplicationMandatoryDocumentDto)) {
            return false;
        }
        ApplicationMandatoryDocumentDto applicationMandatoryDocumentDto = (ApplicationMandatoryDocumentDto) obj;
        return Intrinsics.areEqual((Object) this.id, (Object) applicationMandatoryDocumentDto.id) && Intrinsics.areEqual((Object) this.fileName, (Object) applicationMandatoryDocumentDto.fileName) && Intrinsics.areEqual((Object) this.registrationNumber, (Object) applicationMandatoryDocumentDto.registrationNumber) && Intrinsics.areEqual((Object) this.file, (Object) applicationMandatoryDocumentDto.file) && Intrinsics.areEqual((Object) this.applicationDocumentType, (Object) applicationMandatoryDocumentDto.applicationDocumentType);
    }

    public final ApplicationDocumentTypeDto getApplicationDocumentType() {
        return this.applicationDocumentType;
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
        int hashCode4 = (hashCode3 + (fileDto != null ? fileDto.hashCode() : 0)) * 31;
        ApplicationDocumentTypeDto applicationDocumentTypeDto = this.applicationDocumentType;
        if (applicationDocumentTypeDto != null) {
            i2 = applicationDocumentTypeDto.hashCode();
        }
        return hashCode4 + i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("ApplicationMandatoryDocumentDto(id=");
        a2.append(this.id);
        a2.append(", fileName=");
        a2.append(this.fileName);
        a2.append(", registrationNumber=");
        a2.append(this.registrationNumber);
        a2.append(", file=");
        a2.append(this.file);
        a2.append(", applicationDocumentType=");
        a2.append(this.applicationDocumentType);
        a2.append(")");
        return a2.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ApplicationMandatoryDocumentDto(Integer num, String str, String str2, FileDto fileDto, ApplicationDocumentTypeDto applicationDocumentTypeDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, str, str2, (i2 & 8) != 0 ? null : fileDto, (i2 & 16) != 0 ? null : applicationDocumentTypeDto);
    }
}
