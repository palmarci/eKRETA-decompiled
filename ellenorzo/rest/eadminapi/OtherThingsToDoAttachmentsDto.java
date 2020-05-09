package p289hu.ekreta.ellenorzo.rest.eadminapi;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000a.p020b.p021a.p022a.C0082a;
import p000a.p054h.p159c.p166z.C2580c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J>\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r¨\u0006\u001d"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/eadminapi/OtherThingsToDoAttachmentsDto;", "", "id", "", "fileName", "", "registrationNumber", "file", "Lhu/ekreta/ellenorzo/rest/eadminapi/FileDto;", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/rest/eadminapi/FileDto;)V", "getFile", "()Lhu/ekreta/ellenorzo/rest/eadminapi/FileDto;", "getFileName", "()Ljava/lang/String;", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRegistrationNumber", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/rest/eadminapi/FileDto;)Lhu/ekreta/ellenorzo/rest/eadminapi/OtherThingsToDoAttachmentsDto;", "equals", "", "other", "hashCode", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.rest.eadminapi.OtherThingsToDoAttachmentsDto */
/* compiled from: OtherThingsToDoAttachmentsDto.kt */
public final class OtherThingsToDoAttachmentsDto {
    @C2580c("fajl")
    public final FileDto file;
    @C2580c("fajlNev")
    public final String fileName;
    @C2580c("azonosito")

    /* renamed from: id */
    public final Integer f14694id;
    @C2580c("iktatoszam")
    public final String registrationNumber;

    public OtherThingsToDoAttachmentsDto(Integer num, String str, String str2, FileDto fileDto) {
        this.f14694id = num;
        this.fileName = str;
        this.registrationNumber = str2;
        this.file = fileDto;
    }

    public static /* synthetic */ OtherThingsToDoAttachmentsDto copy$default(OtherThingsToDoAttachmentsDto otherThingsToDoAttachmentsDto, Integer num, String str, String str2, FileDto fileDto, int i, Object obj) {
        if ((i & 1) != 0) {
            num = otherThingsToDoAttachmentsDto.f14694id;
        }
        if ((i & 2) != 0) {
            str = otherThingsToDoAttachmentsDto.fileName;
        }
        if ((i & 4) != 0) {
            str2 = otherThingsToDoAttachmentsDto.registrationNumber;
        }
        if ((i & 8) != 0) {
            fileDto = otherThingsToDoAttachmentsDto.file;
        }
        return otherThingsToDoAttachmentsDto.copy(num, str, str2, fileDto);
    }

    public final Integer component1() {
        return this.f14694id;
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

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.file, (java.lang.Object) r3.file) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.rest.eadminapi.OtherThingsToDoAttachmentsDto
            if (r0 == 0) goto L_0x0031
            hu.ekreta.ellenorzo.rest.eadminapi.OtherThingsToDoAttachmentsDto r3 = (p289hu.ekreta.ellenorzo.rest.eadminapi.OtherThingsToDoAttachmentsDto) r3
            java.lang.Integer r0 = r2.f14694id
            java.lang.Integer r1 = r3.f14694id
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.fileName
            java.lang.String r1 = r3.fileName
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.registrationNumber
            java.lang.String r1 = r3.registrationNumber
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            hu.ekreta.ellenorzo.rest.eadminapi.FileDto r0 = r2.file
            hu.ekreta.ellenorzo.rest.eadminapi.FileDto r3 = r3.file
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
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.eadminapi.OtherThingsToDoAttachmentsDto.equals(java.lang.Object):boolean");
    }

    public final FileDto getFile() {
        return this.file;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final Integer getId() {
        return this.f14694id;
    }

    public final String getRegistrationNumber() {
        return this.registrationNumber;
    }

    public int hashCode() {
        Integer num = this.f14694id;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.fileName;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.registrationNumber;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        FileDto fileDto = this.file;
        if (fileDto != null) {
            i = fileDto.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("OtherThingsToDoAttachmentsDto(id=");
        a.append(this.f14694id);
        a.append(", fileName=");
        a.append(this.fileName);
        a.append(", registrationNumber=");
        a.append(this.registrationNumber);
        a.append(", file=");
        a.append(this.file);
        a.append(")");
        return a.toString();
    }

    public /* synthetic */ OtherThingsToDoAttachmentsDto(Integer num, String str, String str2, FileDto fileDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 8) != 0) {
            fileDto = null;
        }
        this(num, str, str2, fileDto);
    }
}
