package p289hu.ekreta.ellenorzo.rest.eadminapi;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000a.p020b.p021a.p022a.C0082a;
import p000a.p054h.p159c.p166z.C2580c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003JJ\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011¨\u0006\""}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/eadminapi/ApplicationMandatoryDocumentDto;", "", "id", "", "fileName", "", "registrationNumber", "file", "Lhu/ekreta/ellenorzo/rest/eadminapi/FileDto;", "applicationDocumentType", "Lhu/ekreta/ellenorzo/rest/eadminapi/ApplicationDocumentTypeDto;", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/rest/eadminapi/FileDto;Lhu/ekreta/ellenorzo/rest/eadminapi/ApplicationDocumentTypeDto;)V", "getApplicationDocumentType", "()Lhu/ekreta/ellenorzo/rest/eadminapi/ApplicationDocumentTypeDto;", "getFile", "()Lhu/ekreta/ellenorzo/rest/eadminapi/FileDto;", "getFileName", "()Ljava/lang/String;", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRegistrationNumber", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/rest/eadminapi/FileDto;Lhu/ekreta/ellenorzo/rest/eadminapi/ApplicationDocumentTypeDto;)Lhu/ekreta/ellenorzo/rest/eadminapi/ApplicationMandatoryDocumentDto;", "equals", "", "other", "hashCode", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.rest.eadminapi.ApplicationMandatoryDocumentDto */
/* compiled from: ApplicationMandatoryDocumentDto.kt */
public final class ApplicationMandatoryDocumentDto {
    @C2580c("tipus")
    public final ApplicationDocumentTypeDto applicationDocumentType;
    @C2580c("fajl")
    public final FileDto file;
    @C2580c("fajlNev")
    public final String fileName;
    @C2580c("azonosito")

    /* renamed from: id */
    public final Integer f14685id;
    @C2580c("iktatoszam")
    public final String registrationNumber;

    public ApplicationMandatoryDocumentDto(Integer num, String str, String str2, FileDto fileDto, ApplicationDocumentTypeDto applicationDocumentTypeDto) {
        this.f14685id = num;
        this.fileName = str;
        this.registrationNumber = str2;
        this.file = fileDto;
        this.applicationDocumentType = applicationDocumentTypeDto;
    }

    public static /* synthetic */ ApplicationMandatoryDocumentDto copy$default(ApplicationMandatoryDocumentDto applicationMandatoryDocumentDto, Integer num, String str, String str2, FileDto fileDto, ApplicationDocumentTypeDto applicationDocumentTypeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            num = applicationMandatoryDocumentDto.f14685id;
        }
        if ((i & 2) != 0) {
            str = applicationMandatoryDocumentDto.fileName;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = applicationMandatoryDocumentDto.registrationNumber;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            fileDto = applicationMandatoryDocumentDto.file;
        }
        FileDto fileDto2 = fileDto;
        if ((i & 16) != 0) {
            applicationDocumentTypeDto = applicationMandatoryDocumentDto.applicationDocumentType;
        }
        return applicationMandatoryDocumentDto.copy(num, str3, str4, fileDto2, applicationDocumentTypeDto);
    }

    public final Integer component1() {
        return this.f14685id;
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
        ApplicationMandatoryDocumentDto applicationMandatoryDocumentDto = new ApplicationMandatoryDocumentDto(num, str, str2, fileDto, applicationDocumentTypeDto);
        return applicationMandatoryDocumentDto;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.applicationDocumentType, (java.lang.Object) r3.applicationDocumentType) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003d
            boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.rest.eadminapi.ApplicationMandatoryDocumentDto
            if (r0 == 0) goto L_0x003b
            hu.ekreta.ellenorzo.rest.eadminapi.ApplicationMandatoryDocumentDto r3 = (p289hu.ekreta.ellenorzo.rest.eadminapi.ApplicationMandatoryDocumentDto) r3
            java.lang.Integer r0 = r2.f14685id
            java.lang.Integer r1 = r3.f14685id
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.fileName
            java.lang.String r1 = r3.fileName
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.registrationNumber
            java.lang.String r1 = r3.registrationNumber
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x003b
            hu.ekreta.ellenorzo.rest.eadminapi.FileDto r0 = r2.file
            hu.ekreta.ellenorzo.rest.eadminapi.FileDto r1 = r3.file
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x003b
            hu.ekreta.ellenorzo.rest.eadminapi.ApplicationDocumentTypeDto r0 = r2.applicationDocumentType
            hu.ekreta.ellenorzo.rest.eadminapi.ApplicationDocumentTypeDto r3 = r3.applicationDocumentType
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
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.eadminapi.ApplicationMandatoryDocumentDto.equals(java.lang.Object):boolean");
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
        return this.f14685id;
    }

    public final String getRegistrationNumber() {
        return this.registrationNumber;
    }

    public int hashCode() {
        Integer num = this.f14685id;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.fileName;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.registrationNumber;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        FileDto fileDto = this.file;
        int hashCode4 = (hashCode3 + (fileDto != null ? fileDto.hashCode() : 0)) * 31;
        ApplicationDocumentTypeDto applicationDocumentTypeDto = this.applicationDocumentType;
        if (applicationDocumentTypeDto != null) {
            i = applicationDocumentTypeDto.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("ApplicationMandatoryDocumentDto(id=");
        a.append(this.f14685id);
        a.append(", fileName=");
        a.append(this.fileName);
        a.append(", registrationNumber=");
        a.append(this.registrationNumber);
        a.append(", file=");
        a.append(this.file);
        a.append(", applicationDocumentType=");
        a.append(this.applicationDocumentType);
        a.append(")");
        return a.toString();
    }

    public /* synthetic */ ApplicationMandatoryDocumentDto(Integer num, String str, String str2, FileDto fileDto, ApplicationDocumentTypeDto applicationDocumentTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, str, str2, (i & 8) != 0 ? null : fileDto, (i & 16) != 0 ? null : applicationDocumentTypeDto);
    }
}
