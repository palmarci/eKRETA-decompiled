package hu.ekreta.ellenorzo.rest.eadminapi;

import a.b.a.a.a;
import a.h.c.z.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\b\b\u0018\u00002\u00020\u0001B§\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014¢\u0006\u0002\u0010\u0018J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010:\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010(J\u000b\u0010;\u001a\u0004\u0018\u00010\u000eHÆ\u0003J²\u0001\u0010<\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014HÆ\u0001¢\u0006\u0002\u0010=J\u0013\u0010>\u001a\u00020\f2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020\bHÖ\u0001J\t\u0010A\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00148\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001aR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001aR\u001a\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\n\n\u0002\u0010#\u001a\u0004\b.\u0010\"¨\u0006B"}, d2 = {"Lhu/ekreta/ellenorzo/rest/eadminapi/DecisionDto;", "", "requestedAbsenceStart", "", "requestedAbsenceEnd", "adjudication", "justification", "id", "", "decisionDate", "signerId", "needToBeSendDigitally", "", "judgement", "Lhu/ekreta/ellenorzo/rest/eadminapi/JudgementDto;", "filedDecision", "Lhu/ekreta/ellenorzo/rest/eadminapi/FiledDecisionDto;", "postState", "Lhu/ekreta/ellenorzo/rest/eadminapi/PostStateDto;", "attachments", "", "Lhu/ekreta/ellenorzo/rest/eadminapi/AttachmentDto;", "applicationMandatoryDocuments", "Lhu/ekreta/ellenorzo/rest/eadminapi/ApplicationMandatoryDocumentDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Lhu/ekreta/ellenorzo/rest/eadminapi/JudgementDto;Lhu/ekreta/ellenorzo/rest/eadminapi/FiledDecisionDto;Lhu/ekreta/ellenorzo/rest/eadminapi/PostStateDto;Ljava/util/List;Ljava/util/List;)V", "getAdjudication", "()Ljava/lang/String;", "getApplicationMandatoryDocuments", "()Ljava/util/List;", "getAttachments", "getDecisionDate", "getFiledDecision", "()Lhu/ekreta/ellenorzo/rest/eadminapi/FiledDecisionDto;", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getJudgement", "()Lhu/ekreta/ellenorzo/rest/eadminapi/JudgementDto;", "getJustification", "getNeedToBeSendDigitally", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPostState", "()Lhu/ekreta/ellenorzo/rest/eadminapi/PostStateDto;", "getRequestedAbsenceEnd", "getRequestedAbsenceStart", "getSignerId", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Lhu/ekreta/ellenorzo/rest/eadminapi/JudgementDto;Lhu/ekreta/ellenorzo/rest/eadminapi/FiledDecisionDto;Lhu/ekreta/ellenorzo/rest/eadminapi/PostStateDto;Ljava/util/List;Ljava/util/List;)Lhu/ekreta/ellenorzo/rest/eadminapi/DecisionDto;", "equals", "other", "hashCode", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: DecisionDto.kt */
public final class DecisionDto {
    @c("dontesSzovege")
    public final String adjudication;
    @c("hatarozatKotelezoDokumentumLista")
    public final List<ApplicationMandatoryDocumentDto> applicationMandatoryDocuments;
    @c("csatolmanyok")
    public final List<AttachmentDto> attachments;
    @c("hatarozatDatum")
    public final String decisionDate;
    @c("iktatottHatarozat")
    public final FiledDecisionDto filedDecision;
    @c("azonosito")
    public final Integer id;
    @c("dontes")
    public final JudgementDto judgement;
    @c("indoklas")
    public final String justification;
    @c("isDigitalisanKikuldendo")
    public final Boolean needToBeSendDigitally;
    @c("postazasiStatusz")
    public final PostStateDto postState;
    @c("igazoltTavolletVegeDatum")
    public final String requestedAbsenceEnd;
    @c("igazoltTavolletKezdeteDatum")
    public final String requestedAbsenceStart;
    @c("alairoKretaAzonosito")
    public final Integer signerId;

    public DecisionDto(String str, String str2, String str3, String str4, Integer num, String str5, Integer num2, Boolean bool, JudgementDto judgementDto, FiledDecisionDto filedDecisionDto, PostStateDto postStateDto, List<AttachmentDto> list, List<ApplicationMandatoryDocumentDto> list2) {
        Intrinsics.checkParameterIsNotNull(list, "attachments");
        Intrinsics.checkParameterIsNotNull(list2, "applicationMandatoryDocuments");
        this.requestedAbsenceStart = str;
        this.requestedAbsenceEnd = str2;
        this.adjudication = str3;
        this.justification = str4;
        this.id = num;
        this.decisionDate = str5;
        this.signerId = num2;
        this.needToBeSendDigitally = bool;
        this.judgement = judgementDto;
        this.filedDecision = filedDecisionDto;
        this.postState = postStateDto;
        this.attachments = list;
        this.applicationMandatoryDocuments = list2;
    }

    public static /* synthetic */ DecisionDto copy$default(DecisionDto decisionDto, String str, String str2, String str3, String str4, Integer num, String str5, Integer num2, Boolean bool, JudgementDto judgementDto, FiledDecisionDto filedDecisionDto, PostStateDto postStateDto, List list, List list2, int i2, Object obj) {
        DecisionDto decisionDto2 = decisionDto;
        int i3 = i2;
        return decisionDto.copy((i3 & 1) != 0 ? decisionDto2.requestedAbsenceStart : str, (i3 & 2) != 0 ? decisionDto2.requestedAbsenceEnd : str2, (i3 & 4) != 0 ? decisionDto2.adjudication : str3, (i3 & 8) != 0 ? decisionDto2.justification : str4, (i3 & 16) != 0 ? decisionDto2.id : num, (i3 & 32) != 0 ? decisionDto2.decisionDate : str5, (i3 & 64) != 0 ? decisionDto2.signerId : num2, (i3 & 128) != 0 ? decisionDto2.needToBeSendDigitally : bool, (i3 & 256) != 0 ? decisionDto2.judgement : judgementDto, (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? decisionDto2.filedDecision : filedDecisionDto, (i3 & 1024) != 0 ? decisionDto2.postState : postStateDto, (i3 & 2048) != 0 ? decisionDto2.attachments : list, (i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? decisionDto2.applicationMandatoryDocuments : list2);
    }

    public final String component1() {
        return this.requestedAbsenceStart;
    }

    public final FiledDecisionDto component10() {
        return this.filedDecision;
    }

    public final PostStateDto component11() {
        return this.postState;
    }

    public final List<AttachmentDto> component12() {
        return this.attachments;
    }

    public final List<ApplicationMandatoryDocumentDto> component13() {
        return this.applicationMandatoryDocuments;
    }

    public final String component2() {
        return this.requestedAbsenceEnd;
    }

    public final String component3() {
        return this.adjudication;
    }

    public final String component4() {
        return this.justification;
    }

    public final Integer component5() {
        return this.id;
    }

    public final String component6() {
        return this.decisionDate;
    }

    public final Integer component7() {
        return this.signerId;
    }

    public final Boolean component8() {
        return this.needToBeSendDigitally;
    }

    public final JudgementDto component9() {
        return this.judgement;
    }

    public final DecisionDto copy(String str, String str2, String str3, String str4, Integer num, String str5, Integer num2, Boolean bool, JudgementDto judgementDto, FiledDecisionDto filedDecisionDto, PostStateDto postStateDto, List<AttachmentDto> list, List<ApplicationMandatoryDocumentDto> list2) {
        List<AttachmentDto> list3 = list;
        Intrinsics.checkParameterIsNotNull(list3, "attachments");
        List<ApplicationMandatoryDocumentDto> list4 = list2;
        Intrinsics.checkParameterIsNotNull(list4, "applicationMandatoryDocuments");
        return new DecisionDto(str, str2, str3, str4, num, str5, num2, bool, judgementDto, filedDecisionDto, postStateDto, list3, list4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DecisionDto)) {
            return false;
        }
        DecisionDto decisionDto = (DecisionDto) obj;
        return Intrinsics.areEqual((Object) this.requestedAbsenceStart, (Object) decisionDto.requestedAbsenceStart) && Intrinsics.areEqual((Object) this.requestedAbsenceEnd, (Object) decisionDto.requestedAbsenceEnd) && Intrinsics.areEqual((Object) this.adjudication, (Object) decisionDto.adjudication) && Intrinsics.areEqual((Object) this.justification, (Object) decisionDto.justification) && Intrinsics.areEqual((Object) this.id, (Object) decisionDto.id) && Intrinsics.areEqual((Object) this.decisionDate, (Object) decisionDto.decisionDate) && Intrinsics.areEqual((Object) this.signerId, (Object) decisionDto.signerId) && Intrinsics.areEqual((Object) this.needToBeSendDigitally, (Object) decisionDto.needToBeSendDigitally) && Intrinsics.areEqual((Object) this.judgement, (Object) decisionDto.judgement) && Intrinsics.areEqual((Object) this.filedDecision, (Object) decisionDto.filedDecision) && Intrinsics.areEqual((Object) this.postState, (Object) decisionDto.postState) && Intrinsics.areEqual((Object) this.attachments, (Object) decisionDto.attachments) && Intrinsics.areEqual((Object) this.applicationMandatoryDocuments, (Object) decisionDto.applicationMandatoryDocuments);
    }

    public final String getAdjudication() {
        return this.adjudication;
    }

    public final List<ApplicationMandatoryDocumentDto> getApplicationMandatoryDocuments() {
        return this.applicationMandatoryDocuments;
    }

    public final List<AttachmentDto> getAttachments() {
        return this.attachments;
    }

    public final String getDecisionDate() {
        return this.decisionDate;
    }

    public final FiledDecisionDto getFiledDecision() {
        return this.filedDecision;
    }

    public final Integer getId() {
        return this.id;
    }

    public final JudgementDto getJudgement() {
        return this.judgement;
    }

    public final String getJustification() {
        return this.justification;
    }

    public final Boolean getNeedToBeSendDigitally() {
        return this.needToBeSendDigitally;
    }

    public final PostStateDto getPostState() {
        return this.postState;
    }

    public final String getRequestedAbsenceEnd() {
        return this.requestedAbsenceEnd;
    }

    public final String getRequestedAbsenceStart() {
        return this.requestedAbsenceStart;
    }

    public final Integer getSignerId() {
        return this.signerId;
    }

    public int hashCode() {
        String str = this.requestedAbsenceStart;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.requestedAbsenceEnd;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.adjudication;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.justification;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Integer num = this.id;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
        String str5 = this.decisionDate;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Integer num2 = this.signerId;
        int hashCode7 = (hashCode6 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Boolean bool = this.needToBeSendDigitally;
        int hashCode8 = (hashCode7 + (bool != null ? bool.hashCode() : 0)) * 31;
        JudgementDto judgementDto = this.judgement;
        int hashCode9 = (hashCode8 + (judgementDto != null ? judgementDto.hashCode() : 0)) * 31;
        FiledDecisionDto filedDecisionDto = this.filedDecision;
        int hashCode10 = (hashCode9 + (filedDecisionDto != null ? filedDecisionDto.hashCode() : 0)) * 31;
        PostStateDto postStateDto = this.postState;
        int hashCode11 = (hashCode10 + (postStateDto != null ? postStateDto.hashCode() : 0)) * 31;
        List<AttachmentDto> list = this.attachments;
        int hashCode12 = (hashCode11 + (list != null ? list.hashCode() : 0)) * 31;
        List<ApplicationMandatoryDocumentDto> list2 = this.applicationMandatoryDocuments;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode12 + i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("DecisionDto(requestedAbsenceStart=");
        a2.append(this.requestedAbsenceStart);
        a2.append(", requestedAbsenceEnd=");
        a2.append(this.requestedAbsenceEnd);
        a2.append(", adjudication=");
        a2.append(this.adjudication);
        a2.append(", justification=");
        a2.append(this.justification);
        a2.append(", id=");
        a2.append(this.id);
        a2.append(", decisionDate=");
        a2.append(this.decisionDate);
        a2.append(", signerId=");
        a2.append(this.signerId);
        a2.append(", needToBeSendDigitally=");
        a2.append(this.needToBeSendDigitally);
        a2.append(", judgement=");
        a2.append(this.judgement);
        a2.append(", filedDecision=");
        a2.append(this.filedDecision);
        a2.append(", postState=");
        a2.append(this.postState);
        a2.append(", attachments=");
        a2.append(this.attachments);
        a2.append(", applicationMandatoryDocuments=");
        return a.a(a2, (List) this.applicationMandatoryDocuments, ")");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DecisionDto(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.Integer r22, java.lang.String r23, java.lang.Integer r24, java.lang.Boolean r25, hu.ekreta.ellenorzo.rest.eadminapi.JudgementDto r26, hu.ekreta.ellenorzo.rest.eadminapi.FiledDecisionDto r27, hu.ekreta.ellenorzo.rest.eadminapi.PostStateDto r28, java.util.List r29, java.util.List r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
        /*
            r17 = this;
            r0 = r31
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r4 = r2
            goto L_0x000b
        L_0x0009:
            r4 = r18
        L_0x000b:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0011
            r5 = r2
            goto L_0x0013
        L_0x0011:
            r5 = r19
        L_0x0013:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0019
            r6 = r2
            goto L_0x001b
        L_0x0019:
            r6 = r20
        L_0x001b:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0021
            r7 = r2
            goto L_0x0023
        L_0x0021:
            r7 = r21
        L_0x0023:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0029
            r9 = r2
            goto L_0x002b
        L_0x0029:
            r9 = r23
        L_0x002b:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0031
            r10 = r2
            goto L_0x0033
        L_0x0031:
            r10 = r24
        L_0x0033:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0039
            r11 = r2
            goto L_0x003b
        L_0x0039:
            r11 = r25
        L_0x003b:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0041
            r12 = r2
            goto L_0x0043
        L_0x0041:
            r12 = r26
        L_0x0043:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0049
            r13 = r2
            goto L_0x004b
        L_0x0049:
            r13 = r27
        L_0x004b:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0051
            r14 = r2
            goto L_0x0053
        L_0x0051:
            r14 = r28
        L_0x0053:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x005d
            java.util.List r1 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
            r15 = r1
            goto L_0x005f
        L_0x005d:
            r15 = r29
        L_0x005f:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x006a
            java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
            r16 = r0
            goto L_0x006c
        L_0x006a:
            r16 = r30
        L_0x006c:
            r3 = r17
            r8 = r22
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.rest.eadminapi.DecisionDto.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Boolean, hu.ekreta.ellenorzo.rest.eadminapi.JudgementDto, hu.ekreta.ellenorzo.rest.eadminapi.FiledDecisionDto, hu.ekreta.ellenorzo.rest.eadminapi.PostStateDto, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
