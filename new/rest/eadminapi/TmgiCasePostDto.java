package hu.ekreta.ellenorzo.rest.eadminapi;

import a.b.a.a.a;
import a.h.c.z.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e¢\u0006\u0002\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eHÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eHÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016¨\u00063"}, d2 = {"Lhu/ekreta/ellenorzo/rest/eadminapi/TmgiCasePostDto;", "", "studentFirstName", "", "studentLastName", "educationId", "type", "Lhu/ekreta/ellenorzo/rest/eadminapi/TypeDto;", "caseType", "typeCode", "startDate", "endDate", "reason", "mandatoryAttachments", "", "Lhu/ekreta/ellenorzo/rest/eadminapi/ApplicationMandatoryDocumentDto;", "optionalAttachments", "Lhu/ekreta/ellenorzo/rest/eadminapi/OtherThingsToDoAttachmentsDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/rest/eadminapi/TypeDto;Lhu/ekreta/ellenorzo/rest/eadminapi/TypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getCaseType", "()Lhu/ekreta/ellenorzo/rest/eadminapi/TypeDto;", "getEducationId", "()Ljava/lang/String;", "getEndDate", "getMandatoryAttachments", "()Ljava/util/List;", "getOptionalAttachments", "getReason", "getStartDate", "getStudentFirstName", "getStudentLastName", "getType", "getTypeCode", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: TmgiCasePostDto.kt */
public final class TmgiCasePostDto {
    @c("igazolasTipus")
    public final TypeDto caseType;
    @c("tanuloOktatasiAzonosito")
    public final String educationId;
    @c("igazoltTavolletVegeDatum")
    public final String endDate;
    @c("kerelemKotelezoDokumentumLista")
    public final List<ApplicationMandatoryDocumentDto> mandatoryAttachments;
    @c("csatolmanyok")
    public final List<OtherThingsToDoAttachmentsDto> optionalAttachments;
    @c("indoklas")
    public final String reason;
    @c("igazoltTavolletKezdeteDatum")
    public final String startDate;
    @c("tanuloCsaladiNev")
    public final String studentFirstName;
    @c("tanuloKeresztNev")
    public final String studentLastName;
    @c("tipus")
    public final TypeDto type;
    @c("tipusKod")
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

    public static /* synthetic */ TmgiCasePostDto copy$default(TmgiCasePostDto tmgiCasePostDto, String str, String str2, String str3, TypeDto typeDto, TypeDto typeDto2, String str4, String str5, String str6, String str7, List list, List list2, int i2, Object obj) {
        TmgiCasePostDto tmgiCasePostDto2 = tmgiCasePostDto;
        int i3 = i2;
        return tmgiCasePostDto.copy((i3 & 1) != 0 ? tmgiCasePostDto2.studentFirstName : str, (i3 & 2) != 0 ? tmgiCasePostDto2.studentLastName : str2, (i3 & 4) != 0 ? tmgiCasePostDto2.educationId : str3, (i3 & 8) != 0 ? tmgiCasePostDto2.type : typeDto, (i3 & 16) != 0 ? tmgiCasePostDto2.caseType : typeDto2, (i3 & 32) != 0 ? tmgiCasePostDto2.typeCode : str4, (i3 & 64) != 0 ? tmgiCasePostDto2.startDate : str5, (i3 & 128) != 0 ? tmgiCasePostDto2.endDate : str6, (i3 & 256) != 0 ? tmgiCasePostDto2.reason : str7, (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? tmgiCasePostDto2.mandatoryAttachments : list, (i3 & 1024) != 0 ? tmgiCasePostDto2.optionalAttachments : list2);
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
        Intrinsics.checkParameterIsNotNull(str, "studentFirstName");
        Intrinsics.checkParameterIsNotNull(str2, "studentLastName");
        String str8 = str3;
        Intrinsics.checkParameterIsNotNull(str8, "educationId");
        TypeDto typeDto3 = typeDto;
        Intrinsics.checkParameterIsNotNull(typeDto3, "type");
        TypeDto typeDto4 = typeDto2;
        Intrinsics.checkParameterIsNotNull(typeDto4, "caseType");
        String str9 = str4;
        Intrinsics.checkParameterIsNotNull(str9, "typeCode");
        String str10 = str5;
        Intrinsics.checkParameterIsNotNull(str10, "startDate");
        String str11 = str6;
        Intrinsics.checkParameterIsNotNull(str11, "endDate");
        List<ApplicationMandatoryDocumentDto> list3 = list;
        Intrinsics.checkParameterIsNotNull(list3, "mandatoryAttachments");
        List<OtherThingsToDoAttachmentsDto> list4 = list2;
        Intrinsics.checkParameterIsNotNull(list4, "optionalAttachments");
        return new TmgiCasePostDto(str, str2, str8, typeDto3, typeDto4, str9, str10, str11, str7, list3, list4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TmgiCasePostDto)) {
            return false;
        }
        TmgiCasePostDto tmgiCasePostDto = (TmgiCasePostDto) obj;
        return Intrinsics.areEqual((Object) this.studentFirstName, (Object) tmgiCasePostDto.studentFirstName) && Intrinsics.areEqual((Object) this.studentLastName, (Object) tmgiCasePostDto.studentLastName) && Intrinsics.areEqual((Object) this.educationId, (Object) tmgiCasePostDto.educationId) && Intrinsics.areEqual((Object) this.type, (Object) tmgiCasePostDto.type) && Intrinsics.areEqual((Object) this.caseType, (Object) tmgiCasePostDto.caseType) && Intrinsics.areEqual((Object) this.typeCode, (Object) tmgiCasePostDto.typeCode) && Intrinsics.areEqual((Object) this.startDate, (Object) tmgiCasePostDto.startDate) && Intrinsics.areEqual((Object) this.endDate, (Object) tmgiCasePostDto.endDate) && Intrinsics.areEqual((Object) this.reason, (Object) tmgiCasePostDto.reason) && Intrinsics.areEqual((Object) this.mandatoryAttachments, (Object) tmgiCasePostDto.mandatoryAttachments) && Intrinsics.areEqual((Object) this.optionalAttachments, (Object) tmgiCasePostDto.optionalAttachments);
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
        int i2 = 0;
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
            i2 = list2.hashCode();
        }
        return hashCode10 + i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("TmgiCasePostDto(studentFirstName=");
        a2.append(this.studentFirstName);
        a2.append(", studentLastName=");
        a2.append(this.studentLastName);
        a2.append(", educationId=");
        a2.append(this.educationId);
        a2.append(", type=");
        a2.append(this.type);
        a2.append(", caseType=");
        a2.append(this.caseType);
        a2.append(", typeCode=");
        a2.append(this.typeCode);
        a2.append(", startDate=");
        a2.append(this.startDate);
        a2.append(", endDate=");
        a2.append(this.endDate);
        a2.append(", reason=");
        a2.append(this.reason);
        a2.append(", mandatoryAttachments=");
        a2.append(this.mandatoryAttachments);
        a2.append(", optionalAttachments=");
        return a.a(a2, (List) this.optionalAttachments, ")");
    }
}
