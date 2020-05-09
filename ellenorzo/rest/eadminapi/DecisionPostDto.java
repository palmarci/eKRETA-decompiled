package p289hu.ekreta.ellenorzo.rest.eadminapi;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p000a.p054h.p159c.p166z.C2580c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/eadminapi/DecisionPostDto;", "", "caseId", "", "caseTypeCode", "caseType", "Lhu/ekreta/ellenorzo/rest/eadminapi/TypeDto;", "optionalAttachments", "", "Lhu/ekreta/ellenorzo/rest/eadminapi/OtherThingsToDoAttachmentsDto;", "(Ljava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/rest/eadminapi/TypeDto;Ljava/util/List;)V", "getCaseId", "()Ljava/lang/String;", "getCaseType", "()Lhu/ekreta/ellenorzo/rest/eadminapi/TypeDto;", "getCaseTypeCode", "getOptionalAttachments", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.rest.eadminapi.DecisionPostDto */
/* compiled from: DecisionPostDto.kt */
public final class DecisionPostDto {
    @C2580c("azonosito")
    public final String caseId;
    @C2580c("tipus")
    public final TypeDto caseType;
    @C2580c("tipusKod")
    public final String caseTypeCode;
    @C2580c("csatolmanyok")
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

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<hu.ekreta.ellenorzo.rest.eadminapi.OtherThingsToDoAttachmentsDto>, for r4v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ p289hu.ekreta.ellenorzo.rest.eadminapi.DecisionPostDto copy$default(p289hu.ekreta.ellenorzo.rest.eadminapi.DecisionPostDto r0, java.lang.String r1, java.lang.String r2, p289hu.ekreta.ellenorzo.rest.eadminapi.TypeDto r3, java.util.List<p289hu.ekreta.ellenorzo.rest.eadminapi.OtherThingsToDoAttachmentsDto> r4, int r5, java.lang.Object r6) {
        /*
            r6 = r5 & 1
            if (r6 == 0) goto L_0x0006
            java.lang.String r1 = r0.caseId
        L_0x0006:
            r6 = r5 & 2
            if (r6 == 0) goto L_0x000c
            java.lang.String r2 = r0.caseTypeCode
        L_0x000c:
            r6 = r5 & 4
            if (r6 == 0) goto L_0x0012
            hu.ekreta.ellenorzo.rest.eadminapi.TypeDto r3 = r0.caseType
        L_0x0012:
            r5 = r5 & 8
            if (r5 == 0) goto L_0x0018
            java.util.List<hu.ekreta.ellenorzo.rest.eadminapi.OtherThingsToDoAttachmentsDto> r4 = r0.optionalAttachments
        L_0x0018:
            hu.ekreta.ellenorzo.rest.eadminapi.DecisionPostDto r0 = r0.copy(r1, r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.eadminapi.DecisionPostDto.copy$default(hu.ekreta.ellenorzo.rest.eadminapi.DecisionPostDto, java.lang.String, java.lang.String, hu.ekreta.ellenorzo.rest.eadminapi.TypeDto, java.util.List, int, java.lang.Object):hu.ekreta.ellenorzo.rest.eadminapi.DecisionPostDto");
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

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.optionalAttachments, (java.lang.Object) r3.optionalAttachments) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.rest.eadminapi.DecisionPostDto
            if (r0 == 0) goto L_0x0031
            hu.ekreta.ellenorzo.rest.eadminapi.DecisionPostDto r3 = (p289hu.ekreta.ellenorzo.rest.eadminapi.DecisionPostDto) r3
            java.lang.String r0 = r2.caseId
            java.lang.String r1 = r3.caseId
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.caseTypeCode
            java.lang.String r1 = r3.caseTypeCode
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            hu.ekreta.ellenorzo.rest.eadminapi.TypeDto r0 = r2.caseType
            hu.ekreta.ellenorzo.rest.eadminapi.TypeDto r1 = r3.caseType
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.util.List<hu.ekreta.ellenorzo.rest.eadminapi.OtherThingsToDoAttachmentsDto> r0 = r2.optionalAttachments
            java.util.List<hu.ekreta.ellenorzo.rest.eadminapi.OtherThingsToDoAttachmentsDto> r3 = r3.optionalAttachments
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
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.eadminapi.DecisionPostDto.equals(java.lang.Object):boolean");
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
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.caseTypeCode;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        TypeDto typeDto = this.caseType;
        int hashCode3 = (hashCode2 + (typeDto != null ? typeDto.hashCode() : 0)) * 31;
        List<OtherThingsToDoAttachmentsDto> list = this.optionalAttachments;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("DecisionPostDto(caseId=");
        a.append(this.caseId);
        a.append(", caseTypeCode=");
        a.append(this.caseTypeCode);
        a.append(", caseType=");
        a.append(this.caseType);
        a.append(", optionalAttachments=");
        return C0082a.m108a(a, (List) this.optionalAttachments, ")");
    }
}
