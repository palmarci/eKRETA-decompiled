package hu.ekreta.ellenorzo.rest.eadminapi;

import a.b.a.a.a;
import a.h.c.z.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lhu/ekreta/ellenorzo/rest/eadminapi/DecisionPostDto;", "", "caseId", "", "caseTypeCode", "caseType", "Lhu/ekreta/ellenorzo/rest/eadminapi/TypeDto;", "optionalAttachments", "", "Lhu/ekreta/ellenorzo/rest/eadminapi/OtherThingsToDoAttachmentsDto;", "(Ljava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/rest/eadminapi/TypeDto;Ljava/util/List;)V", "getCaseId", "()Ljava/lang/String;", "getCaseType", "()Lhu/ekreta/ellenorzo/rest/eadminapi/TypeDto;", "getCaseTypeCode", "getOptionalAttachments", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: DecisionPostDto.kt */
public final class DecisionPostDto {
    @c("azonosito")
    public final String caseId;
    @c("tipus")
    public final TypeDto caseType;
    @c("tipusKod")
    public final String caseTypeCode;
    @c("csatolmanyok")
    public final List<OtherThingsToDoAttachmentsDto> optionalAttachments;

    public DecisionPostDto(String str, String str2, TypeDto typeDto, List<OtherThingsToDoAttachmentsDto> list) {
        Intrinsics.checkParameterIsNotNull(str, "caseId");
        Intrinsics.checkParameterIsNotNull(str2, "caseTypeCode");
        Intrinsics.checkParameterIsNotNull(typeDto, "caseType");
        Intrinsics.checkParameterIsNotNull(list, "optionalAttachments");
        this.caseId = str;
        this.caseTypeCode = str2;
        this.caseType = typeDto;
        this.optionalAttachments = list;
    }

    public static /* synthetic */ DecisionPostDto copy$default(DecisionPostDto decisionPostDto, String str, String str2, TypeDto typeDto, List<OtherThingsToDoAttachmentsDto> list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = decisionPostDto.caseId;
        }
        if ((i2 & 2) != 0) {
            str2 = decisionPostDto.caseTypeCode;
        }
        if ((i2 & 4) != 0) {
            typeDto = decisionPostDto.caseType;
        }
        if ((i2 & 8) != 0) {
            list = decisionPostDto.optionalAttachments;
        }
        return decisionPostDto.copy(str, str2, typeDto, list);
    }

    public final String component1() {
        return this.caseId;
    }

    public final String component2() {
        return this.caseTypeCode;
    }

    public final TypeDto component3() {
        return this.caseType;
    }

    public final List<OtherThingsToDoAttachmentsDto> component4() {
        return this.optionalAttachments;
    }

    public final DecisionPostDto copy(String str, String str2, TypeDto typeDto, List<OtherThingsToDoAttachmentsDto> list) {
        Intrinsics.checkParameterIsNotNull(str, "caseId");
        Intrinsics.checkParameterIsNotNull(str2, "caseTypeCode");
        Intrinsics.checkParameterIsNotNull(typeDto, "caseType");
        Intrinsics.checkParameterIsNotNull(list, "optionalAttachments");
        return new DecisionPostDto(str, str2, typeDto, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DecisionPostDto)) {
            return false;
        }
        DecisionPostDto decisionPostDto = (DecisionPostDto) obj;
        return Intrinsics.areEqual((Object) this.caseId, (Object) decisionPostDto.caseId) && Intrinsics.areEqual((Object) this.caseTypeCode, (Object) decisionPostDto.caseTypeCode) && Intrinsics.areEqual((Object) this.caseType, (Object) decisionPostDto.caseType) && Intrinsics.areEqual((Object) this.optionalAttachments, (Object) decisionPostDto.optionalAttachments);
    }

    public final String getCaseId() {
        return this.caseId;
    }

    public final TypeDto getCaseType() {
        return this.caseType;
    }

    public final String getCaseTypeCode() {
        return this.caseTypeCode;
    }

    public final List<OtherThingsToDoAttachmentsDto> getOptionalAttachments() {
        return this.optionalAttachments;
    }

    public int hashCode() {
        String str = this.caseId;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.caseTypeCode;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        TypeDto typeDto = this.caseType;
        int hashCode3 = (hashCode2 + (typeDto != null ? typeDto.hashCode() : 0)) * 31;
        List<OtherThingsToDoAttachmentsDto> list = this.optionalAttachments;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("DecisionPostDto(caseId=");
        a2.append(this.caseId);
        a2.append(", caseTypeCode=");
        a2.append(this.caseTypeCode);
        a2.append(", caseType=");
        a2.append(this.caseType);
        a2.append(", optionalAttachments=");
        return a.a(a2, (List) this.optionalAttachments, ")");
    }
}
