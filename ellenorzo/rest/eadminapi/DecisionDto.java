package p289hu.ekreta.ellenorzo.rest.eadminapi;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p349io.ConstantsKt;
import p000a.p020b.p021a.p022a.C0082a;
import p000a.p054h.p159c.p166z.C2580c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\b\b\u0018\u00002\u00020\u0001B§\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014¢\u0006\u0002\u0010\u0018J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010:\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010(J\u000b\u0010;\u001a\u0004\u0018\u00010\u000eHÆ\u0003J²\u0001\u0010<\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014HÆ\u0001¢\u0006\u0002\u0010=J\u0013\u0010>\u001a\u00020\f2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020\bHÖ\u0001J\t\u0010A\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00148\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001aR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001aR\u001a\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\n\n\u0002\u0010#\u001a\u0004\b.\u0010\"¨\u0006B"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/eadminapi/DecisionDto;", "", "requestedAbsenceStart", "", "requestedAbsenceEnd", "adjudication", "justification", "id", "", "decisionDate", "signerId", "needToBeSendDigitally", "", "judgement", "Lhu/ekreta/ellenorzo/rest/eadminapi/JudgementDto;", "filedDecision", "Lhu/ekreta/ellenorzo/rest/eadminapi/FiledDecisionDto;", "postState", "Lhu/ekreta/ellenorzo/rest/eadminapi/PostStateDto;", "attachments", "", "Lhu/ekreta/ellenorzo/rest/eadminapi/AttachmentDto;", "applicationMandatoryDocuments", "Lhu/ekreta/ellenorzo/rest/eadminapi/ApplicationMandatoryDocumentDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Lhu/ekreta/ellenorzo/rest/eadminapi/JudgementDto;Lhu/ekreta/ellenorzo/rest/eadminapi/FiledDecisionDto;Lhu/ekreta/ellenorzo/rest/eadminapi/PostStateDto;Ljava/util/List;Ljava/util/List;)V", "getAdjudication", "()Ljava/lang/String;", "getApplicationMandatoryDocuments", "()Ljava/util/List;", "getAttachments", "getDecisionDate", "getFiledDecision", "()Lhu/ekreta/ellenorzo/rest/eadminapi/FiledDecisionDto;", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getJudgement", "()Lhu/ekreta/ellenorzo/rest/eadminapi/JudgementDto;", "getJustification", "getNeedToBeSendDigitally", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPostState", "()Lhu/ekreta/ellenorzo/rest/eadminapi/PostStateDto;", "getRequestedAbsenceEnd", "getRequestedAbsenceStart", "getSignerId", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Lhu/ekreta/ellenorzo/rest/eadminapi/JudgementDto;Lhu/ekreta/ellenorzo/rest/eadminapi/FiledDecisionDto;Lhu/ekreta/ellenorzo/rest/eadminapi/PostStateDto;Ljava/util/List;Ljava/util/List;)Lhu/ekreta/ellenorzo/rest/eadminapi/DecisionDto;", "equals", "other", "hashCode", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.rest.eadminapi.DecisionDto */
/* compiled from: DecisionDto.kt */
public final class DecisionDto {
    @C2580c("dontesSzovege")
    public final String adjudication;
    @C2580c("hatarozatKotelezoDokumentumLista")
    public final List<ApplicationMandatoryDocumentDto> applicationMandatoryDocuments;
    @C2580c("csatolmanyok")
    public final List<AttachmentDto> attachments;
    @C2580c("hatarozatDatum")
    public final String decisionDate;
    @C2580c("iktatottHatarozat")
    public final FiledDecisionDto filedDecision;
    @C2580c("azonosito")

    /* renamed from: id */
    public final Integer f14689id;
    @C2580c("dontes")
    public final JudgementDto judgement;
    @C2580c("indoklas")
    public final String justification;
    @C2580c("isDigitalisanKikuldendo")
    public final Boolean needToBeSendDigitally;
    @C2580c("postazasiStatusz")
    public final PostStateDto postState;
    @C2580c("igazoltTavolletVegeDatum")
    public final String requestedAbsenceEnd;
    @C2580c("igazoltTavolletKezdeteDatum")
    public final String requestedAbsenceStart;
    @C2580c("alairoKretaAzonosito")
    public final Integer signerId;

    public DecisionDto(String str, String str2, String str3, String str4, Integer num, String str5, Integer num2, Boolean bool, JudgementDto judgementDto, FiledDecisionDto filedDecisionDto, PostStateDto postStateDto, List<AttachmentDto> list, List<ApplicationMandatoryDocumentDto> list2) {
        Intrinsics.checkParameterIsNotNull(list, "attachments");
        Intrinsics.checkParameterIsNotNull(list2, "applicationMandatoryDocuments");
        this.requestedAbsenceStart = str;
        this.requestedAbsenceEnd = str2;
        this.adjudication = str3;
        this.justification = str4;
        this.f14689id = num;
        this.decisionDate = str5;
        this.signerId = num2;
        this.needToBeSendDigitally = bool;
        this.judgement = judgementDto;
        this.filedDecision = filedDecisionDto;
        this.postState = postStateDto;
        this.attachments = list;
        this.applicationMandatoryDocuments = list2;
    }

    public static /* synthetic */ DecisionDto copy$default(DecisionDto decisionDto, String str, String str2, String str3, String str4, Integer num, String str5, Integer num2, Boolean bool, JudgementDto judgementDto, FiledDecisionDto filedDecisionDto, PostStateDto postStateDto, List list, List list2, int i, Object obj) {
        DecisionDto decisionDto2 = decisionDto;
        int i2 = i;
        return decisionDto.copy((i2 & 1) != 0 ? decisionDto2.requestedAbsenceStart : str, (i2 & 2) != 0 ? decisionDto2.requestedAbsenceEnd : str2, (i2 & 4) != 0 ? decisionDto2.adjudication : str3, (i2 & 8) != 0 ? decisionDto2.justification : str4, (i2 & 16) != 0 ? decisionDto2.f14689id : num, (i2 & 32) != 0 ? decisionDto2.decisionDate : str5, (i2 & 64) != 0 ? decisionDto2.signerId : num2, (i2 & 128) != 0 ? decisionDto2.needToBeSendDigitally : bool, (i2 & 256) != 0 ? decisionDto2.judgement : judgementDto, (i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? decisionDto2.filedDecision : filedDecisionDto, (i2 & 1024) != 0 ? decisionDto2.postState : postStateDto, (i2 & 2048) != 0 ? decisionDto2.attachments : list, (i2 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? decisionDto2.applicationMandatoryDocuments : list2);
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
        return this.f14689id;
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
        DecisionDto decisionDto = new DecisionDto(str, str2, str3, str4, num, str5, num2, bool, judgementDto, filedDecisionDto, postStateDto, list3, list4);
        return decisionDto;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0088, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.applicationMandatoryDocuments, (java.lang.Object) r3.applicationMandatoryDocuments) != false) goto L_0x008d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x008d
            boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.rest.eadminapi.DecisionDto
            if (r0 == 0) goto L_0x008b
            hu.ekreta.ellenorzo.rest.eadminapi.DecisionDto r3 = (p289hu.ekreta.ellenorzo.rest.eadminapi.DecisionDto) r3
            java.lang.String r0 = r2.requestedAbsenceStart
            java.lang.String r1 = r3.requestedAbsenceStart
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008b
            java.lang.String r0 = r2.requestedAbsenceEnd
            java.lang.String r1 = r3.requestedAbsenceEnd
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008b
            java.lang.String r0 = r2.adjudication
            java.lang.String r1 = r3.adjudication
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008b
            java.lang.String r0 = r2.justification
            java.lang.String r1 = r3.justification
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008b
            java.lang.Integer r0 = r2.f14689id
            java.lang.Integer r1 = r3.f14689id
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008b
            java.lang.String r0 = r2.decisionDate
            java.lang.String r1 = r3.decisionDate
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008b
            java.lang.Integer r0 = r2.signerId
            java.lang.Integer r1 = r3.signerId
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008b
            java.lang.Boolean r0 = r2.needToBeSendDigitally
            java.lang.Boolean r1 = r3.needToBeSendDigitally
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008b
            hu.ekreta.ellenorzo.rest.eadminapi.JudgementDto r0 = r2.judgement
            hu.ekreta.ellenorzo.rest.eadminapi.JudgementDto r1 = r3.judgement
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008b
            hu.ekreta.ellenorzo.rest.eadminapi.FiledDecisionDto r0 = r2.filedDecision
            hu.ekreta.ellenorzo.rest.eadminapi.FiledDecisionDto r1 = r3.filedDecision
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008b
            hu.ekreta.ellenorzo.rest.eadminapi.PostStateDto r0 = r2.postState
            hu.ekreta.ellenorzo.rest.eadminapi.PostStateDto r1 = r3.postState
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008b
            java.util.List<hu.ekreta.ellenorzo.rest.eadminapi.AttachmentDto> r0 = r2.attachments
            java.util.List<hu.ekreta.ellenorzo.rest.eadminapi.AttachmentDto> r1 = r3.attachments
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008b
            java.util.List<hu.ekreta.ellenorzo.rest.eadminapi.ApplicationMandatoryDocumentDto> r0 = r2.applicationMandatoryDocuments
            java.util.List<hu.ekreta.ellenorzo.rest.eadminapi.ApplicationMandatoryDocumentDto> r3 = r3.applicationMandatoryDocuments
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x008b
            goto L_0x008d
        L_0x008b:
            r3 = 0
            return r3
        L_0x008d:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.eadminapi.DecisionDto.equals(java.lang.Object):boolean");
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
        return this.f14689id;
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
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.requestedAbsenceEnd;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.adjudication;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.justification;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Integer num = this.f14689id;
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
            i = list2.hashCode();
        }
        return hashCode12 + i;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("DecisionDto(requestedAbsenceStart=");
        a.append(this.requestedAbsenceStart);
        a.append(", requestedAbsenceEnd=");
        a.append(this.requestedAbsenceEnd);
        a.append(", adjudication=");
        a.append(this.adjudication);
        a.append(", justification=");
        a.append(this.justification);
        a.append(", id=");
        a.append(this.f14689id);
        a.append(", decisionDate=");
        a.append(this.decisionDate);
        a.append(", signerId=");
        a.append(this.signerId);
        a.append(", needToBeSendDigitally=");
        a.append(this.needToBeSendDigitally);
        a.append(", judgement=");
        a.append(this.judgement);
        a.append(", filedDecision=");
        a.append(this.filedDecision);
        a.append(", postState=");
        a.append(this.postState);
        a.append(", attachments=");
        a.append(this.attachments);
        a.append(", applicationMandatoryDocuments=");
        return C0082a.m108a(a, (List) this.applicationMandatoryDocuments, ")");
    }

    public /* synthetic */ DecisionDto(String str, String str2, String str3, String str4, Integer num, String str5, Integer num2, Boolean bool, JudgementDto judgementDto, FiledDecisionDto filedDecisionDto, PostStateDto postStateDto, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = i;
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, num, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : num2, (i2 & 128) != 0 ? null : bool, (i2 & 256) != 0 ? null : judgementDto, (i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : filedDecisionDto, (i2 & 1024) != 0 ? null : postStateDto, (i2 & 2048) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2);
    }
}
