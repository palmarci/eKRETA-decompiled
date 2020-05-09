package p289hu.ekreta.ellenorzo.rest.eadminapi;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p349io.ConstantsKt;
import p000a.p020b.p021a.p022a.C0082a;
import p000a.p054h.p159c.p166z.C2580c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e¢\u0006\u0002\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eHÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eHÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016¨\u00063"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/eadminapi/TmgiCasePostDto;", "", "studentFirstName", "", "studentLastName", "educationId", "type", "Lhu/ekreta/ellenorzo/rest/eadminapi/TypeDto;", "caseType", "typeCode", "startDate", "endDate", "reason", "mandatoryAttachments", "", "Lhu/ekreta/ellenorzo/rest/eadminapi/ApplicationMandatoryDocumentDto;", "optionalAttachments", "Lhu/ekreta/ellenorzo/rest/eadminapi/OtherThingsToDoAttachmentsDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/rest/eadminapi/TypeDto;Lhu/ekreta/ellenorzo/rest/eadminapi/TypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getCaseType", "()Lhu/ekreta/ellenorzo/rest/eadminapi/TypeDto;", "getEducationId", "()Ljava/lang/String;", "getEndDate", "getMandatoryAttachments", "()Ljava/util/List;", "getOptionalAttachments", "getReason", "getStartDate", "getStudentFirstName", "getStudentLastName", "getType", "getTypeCode", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.rest.eadminapi.TmgiCasePostDto */
/* compiled from: TmgiCasePostDto.kt */
public final class TmgiCasePostDto {
    @C2580c("igazolasTipus")
    public final TypeDto caseType;
    @C2580c("tanuloOktatasiAzonosito")
    public final String educationId;
    @C2580c("igazoltTavolletVegeDatum")
    public final String endDate;
    @C2580c("kerelemKotelezoDokumentumLista")
    public final List<ApplicationMandatoryDocumentDto> mandatoryAttachments;
    @C2580c("csatolmanyok")
    public final List<OtherThingsToDoAttachmentsDto> optionalAttachments;
    @C2580c("indoklas")
    public final String reason;
    @C2580c("igazoltTavolletKezdeteDatum")
    public final String startDate;
    @C2580c("tanuloCsaladiNev")
    public final String studentFirstName;
    @C2580c("tanuloKeresztNev")
    public final String studentLastName;
    @C2580c("tipus")
    public final TypeDto type;
    @C2580c("tipusKod")
    public final String typeCode;

    public TmgiCasePostDto(String str, String str2, String str3, TypeDto typeDto, TypeDto typeDto2, String str4, String str5, String str6, String str7, List<ApplicationMandatoryDocumentDto> list, List<OtherThingsToDoAttachmentsDto> list2) {
        Intrinsics.checkParameterIsNotNull(str, "studentFirstName");
        Intrinsics.checkParameterIsNotNull(str2, "studentLastName");
        Intrinsics.checkParameterIsNotNull(str3, "educationId");
        Intrinsics.checkParameterIsNotNull(typeDto, "type");
        Intrinsics.checkParameterIsNotNull(typeDto2, "caseType");
        Intrinsics.checkParameterIsNotNull(str4, "typeCode");
        Intrinsics.checkParameterIsNotNull(str5, "startDate");
        Intrinsics.checkParameterIsNotNull(str6, "endDate");
        Intrinsics.checkParameterIsNotNull(list, "mandatoryAttachments");
        Intrinsics.checkParameterIsNotNull(list2, "optionalAttachments");
        this.studentFirstName = str;
        this.studentLastName = str2;
        this.educationId = str3;
        this.type = typeDto;
        this.caseType = typeDto2;
        this.typeCode = str4;
        this.startDate = str5;
        this.endDate = str6;
        this.reason = str7;
        this.mandatoryAttachments = list;
        this.optionalAttachments = list2;
    }

    public static /* synthetic */ TmgiCasePostDto copy$default(TmgiCasePostDto tmgiCasePostDto, String str, String str2, String str3, TypeDto typeDto, TypeDto typeDto2, String str4, String str5, String str6, String str7, List list, List list2, int i, Object obj) {
        TmgiCasePostDto tmgiCasePostDto2 = tmgiCasePostDto;
        int i2 = i;
        return tmgiCasePostDto.copy((i2 & 1) != 0 ? tmgiCasePostDto2.studentFirstName : str, (i2 & 2) != 0 ? tmgiCasePostDto2.studentLastName : str2, (i2 & 4) != 0 ? tmgiCasePostDto2.educationId : str3, (i2 & 8) != 0 ? tmgiCasePostDto2.type : typeDto, (i2 & 16) != 0 ? tmgiCasePostDto2.caseType : typeDto2, (i2 & 32) != 0 ? tmgiCasePostDto2.typeCode : str4, (i2 & 64) != 0 ? tmgiCasePostDto2.startDate : str5, (i2 & 128) != 0 ? tmgiCasePostDto2.endDate : str6, (i2 & 256) != 0 ? tmgiCasePostDto2.reason : str7, (i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? tmgiCasePostDto2.mandatoryAttachments : list, (i2 & 1024) != 0 ? tmgiCasePostDto2.optionalAttachments : list2);
    }

    public final String component1() {
        return this.studentFirstName;
    }

    public final List<ApplicationMandatoryDocumentDto> component10() {
        return this.mandatoryAttachments;
    }

    public final List<OtherThingsToDoAttachmentsDto> component11() {
        return this.optionalAttachments;
    }

    public final String component2() {
        return this.studentLastName;
    }

    public final String component3() {
        return this.educationId;
    }

    public final TypeDto component4() {
        return this.type;
    }

    public final TypeDto component5() {
        return this.caseType;
    }

    public final String component6() {
        return this.typeCode;
    }

    public final String component7() {
        return this.startDate;
    }

    public final String component8() {
        return this.endDate;
    }

    public final String component9() {
        return this.reason;
    }

    public final TmgiCasePostDto copy(String str, String str2, String str3, TypeDto typeDto, TypeDto typeDto2, String str4, String str5, String str6, String str7, List<ApplicationMandatoryDocumentDto> list, List<OtherThingsToDoAttachmentsDto> list2) {
        String str8 = str;
        Intrinsics.checkParameterIsNotNull(str, "studentFirstName");
        String str9 = str2;
        Intrinsics.checkParameterIsNotNull(str2, "studentLastName");
        String str10 = str3;
        Intrinsics.checkParameterIsNotNull(str10, "educationId");
        TypeDto typeDto3 = typeDto;
        Intrinsics.checkParameterIsNotNull(typeDto3, "type");
        TypeDto typeDto4 = typeDto2;
        Intrinsics.checkParameterIsNotNull(typeDto4, "caseType");
        String str11 = str4;
        Intrinsics.checkParameterIsNotNull(str11, "typeCode");
        String str12 = str5;
        Intrinsics.checkParameterIsNotNull(str12, "startDate");
        String str13 = str6;
        Intrinsics.checkParameterIsNotNull(str13, "endDate");
        List<ApplicationMandatoryDocumentDto> list3 = list;
        Intrinsics.checkParameterIsNotNull(list3, "mandatoryAttachments");
        List<OtherThingsToDoAttachmentsDto> list4 = list2;
        Intrinsics.checkParameterIsNotNull(list4, "optionalAttachments");
        TmgiCasePostDto tmgiCasePostDto = new TmgiCasePostDto(str8, str9, str10, typeDto3, typeDto4, str11, str12, str13, str7, list3, list4);
        return tmgiCasePostDto;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0074, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.optionalAttachments, (java.lang.Object) r3.optionalAttachments) != false) goto L_0x0079;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0079
            boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.rest.eadminapi.TmgiCasePostDto
            if (r0 == 0) goto L_0x0077
            hu.ekreta.ellenorzo.rest.eadminapi.TmgiCasePostDto r3 = (p289hu.ekreta.ellenorzo.rest.eadminapi.TmgiCasePostDto) r3
            java.lang.String r0 = r2.studentFirstName
            java.lang.String r1 = r3.studentFirstName
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = r2.studentLastName
            java.lang.String r1 = r3.studentLastName
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = r2.educationId
            java.lang.String r1 = r3.educationId
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0077
            hu.ekreta.ellenorzo.rest.eadminapi.TypeDto r0 = r2.type
            hu.ekreta.ellenorzo.rest.eadminapi.TypeDto r1 = r3.type
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0077
            hu.ekreta.ellenorzo.rest.eadminapi.TypeDto r0 = r2.caseType
            hu.ekreta.ellenorzo.rest.eadminapi.TypeDto r1 = r3.caseType
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = r2.typeCode
            java.lang.String r1 = r3.typeCode
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = r2.startDate
            java.lang.String r1 = r3.startDate
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = r2.endDate
            java.lang.String r1 = r3.endDate
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = r2.reason
            java.lang.String r1 = r3.reason
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0077
            java.util.List<hu.ekreta.ellenorzo.rest.eadminapi.ApplicationMandatoryDocumentDto> r0 = r2.mandatoryAttachments
            java.util.List<hu.ekreta.ellenorzo.rest.eadminapi.ApplicationMandatoryDocumentDto> r1 = r3.mandatoryAttachments
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0077
            java.util.List<hu.ekreta.ellenorzo.rest.eadminapi.OtherThingsToDoAttachmentsDto> r0 = r2.optionalAttachments
            java.util.List<hu.ekreta.ellenorzo.rest.eadminapi.OtherThingsToDoAttachmentsDto> r3 = r3.optionalAttachments
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0077
            goto L_0x0079
        L_0x0077:
            r3 = 0
            return r3
        L_0x0079:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.eadminapi.TmgiCasePostDto.equals(java.lang.Object):boolean");
    }

    public final TypeDto getCaseType() {
        return this.caseType;
    }

    public final String getEducationId() {
        return this.educationId;
    }

    public final String getEndDate() {
        return this.endDate;
    }

    public final List<ApplicationMandatoryDocumentDto> getMandatoryAttachments() {
        return this.mandatoryAttachments;
    }

    public final List<OtherThingsToDoAttachmentsDto> getOptionalAttachments() {
        return this.optionalAttachments;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getStartDate() {
        return this.startDate;
    }

    public final String getStudentFirstName() {
        return this.studentFirstName;
    }

    public final String getStudentLastName() {
        return this.studentLastName;
    }

    public final TypeDto getType() {
        return this.type;
    }

    public final String getTypeCode() {
        return this.typeCode;
    }

    public int hashCode() {
        String str = this.studentFirstName;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.studentLastName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.educationId;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        TypeDto typeDto = this.type;
        int hashCode4 = (hashCode3 + (typeDto != null ? typeDto.hashCode() : 0)) * 31;
        TypeDto typeDto2 = this.caseType;
        int hashCode5 = (hashCode4 + (typeDto2 != null ? typeDto2.hashCode() : 0)) * 31;
        String str4 = this.typeCode;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.startDate;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.endDate;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.reason;
        int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31;
        List<ApplicationMandatoryDocumentDto> list = this.mandatoryAttachments;
        int hashCode10 = (hashCode9 + (list != null ? list.hashCode() : 0)) * 31;
        List<OtherThingsToDoAttachmentsDto> list2 = this.optionalAttachments;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode10 + i;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("TmgiCasePostDto(studentFirstName=");
        a.append(this.studentFirstName);
        a.append(", studentLastName=");
        a.append(this.studentLastName);
        a.append(", educationId=");
        a.append(this.educationId);
        a.append(", type=");
        a.append(this.type);
        a.append(", caseType=");
        a.append(this.caseType);
        a.append(", typeCode=");
        a.append(this.typeCode);
        a.append(", startDate=");
        a.append(this.startDate);
        a.append(", endDate=");
        a.append(this.endDate);
        a.append(", reason=");
        a.append(this.reason);
        a.append(", mandatoryAttachments=");
        a.append(this.mandatoryAttachments);
        a.append(", optionalAttachments=");
        return C0082a.m108a(a, (List) this.optionalAttachments, ")");
    }
}
