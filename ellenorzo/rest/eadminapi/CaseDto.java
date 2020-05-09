package p289hu.ekreta.ellenorzo.rest.eadminapi;

import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p349io.ConstantsKt;
import p000a.p020b.p021a.p022a.C0082a;
import p000a.p054h.p159c.p166z.C2580c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bN\b\b\u0018\u00002\u00020\u0001B½\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"\u0012\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\"\u0012\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\"\u0012\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\"\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\"¢\u0006\u0002\u0010/J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010_\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010TJ\t\u0010`\u001a\u00020\u0016HÆ\u0003J\t\u0010a\u001a\u00020\u0018HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\t\u0010d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010 HÆ\u0003J\u0011\u0010g\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"HÆ\u0003J\u0011\u0010h\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\"HÆ\u0003J\u0011\u0010i\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\"HÆ\u0003J\u0011\u0010j\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\"HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010n\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\"HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0003\u0010v\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\"2\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\"2\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\"2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\"HÆ\u0001¢\u0006\u0002\u0010wJ\u0013\u0010x\u001a\u00020\u00142\b\u0010y\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010z\u001a\u00020\u0003HÖ\u0001J\t\u0010{\u001a\u00020\bHÖ\u0001R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u001e\u0010(\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\"8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00105R\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\"8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00105R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0018\u0010\u001f\u001a\u0004\u0018\u00010 8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u00109R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u00109R\u0018\u0010*\u001a\u0004\u0018\u00010\u00168\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010@R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\"8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u00105R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u00109R\u0018\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u00109R\u0018\u0010,\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010@R\u0018\u0010+\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010@R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010@R\u0016\u0010\u0017\u001a\u00020\u00188\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u00109R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u00109R\u0018\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u00109R\u0018\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u00109R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0004¢\u0006\n\n\u0002\u0010U\u001a\u0004\bS\u0010TR\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\"8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u00105R\u0016\u0010\u0015\u001a\u00020\u00168\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010CR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u00109¨\u0006|"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/eadminapi/CaseDto;", "", "id", "", "sentDate", "Ljava/util/Calendar;", "internalDeadlineDate", "internalNote", "", "historyFileNumber", "registrationNumber", "reason", "studentFamilyName", "studentFirstName", "studentEducationId", "studentClass", "typeCode", "documentNumber", "lastModificationDate", "submittedDigitally", "", "type", "Lhu/ekreta/ellenorzo/rest/eadminapi/TypeDto;", "state", "Lhu/ekreta/ellenorzo/rest/eadminapi/StateDto;", "postState", "Lhu/ekreta/ellenorzo/rest/eadminapi/PostStateDto;", "applicants", "Lhu/ekreta/ellenorzo/rest/eadminapi/ApplicantsDto;", "administrator", "Lhu/ekreta/ellenorzo/rest/eadminapi/AdministratorDto;", "filedApplication", "Lhu/ekreta/ellenorzo/rest/eadminapi/FiledApplicationDto;", "attachments", "", "Lhu/ekreta/ellenorzo/rest/eadminapi/AttachmentDto;", "otherThingsToDoAttachments", "Lhu/ekreta/ellenorzo/rest/eadminapi/OtherThingsToDoAttachmentsDto;", "toDoItem", "Lhu/ekreta/ellenorzo/rest/eadminapi/ToDoItemDto;", "applicationMandatoryDocument", "Lhu/ekreta/ellenorzo/rest/eadminapi/ApplicationMandatoryDocumentDto;", "justificationType", "requestedAbsenceStart", "requestedAbsenceEnd", "decisions", "Lhu/ekreta/ellenorzo/rest/eadminapi/DecisionDto;", "(ILjava/util/Calendar;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;Ljava/lang/Boolean;Lhu/ekreta/ellenorzo/rest/eadminapi/TypeDto;Lhu/ekreta/ellenorzo/rest/eadminapi/StateDto;Lhu/ekreta/ellenorzo/rest/eadminapi/PostStateDto;Lhu/ekreta/ellenorzo/rest/eadminapi/ApplicantsDto;Lhu/ekreta/ellenorzo/rest/eadminapi/AdministratorDto;Lhu/ekreta/ellenorzo/rest/eadminapi/FiledApplicationDto;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lhu/ekreta/ellenorzo/rest/eadminapi/TypeDto;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/util/List;)V", "getAdministrator", "()Lhu/ekreta/ellenorzo/rest/eadminapi/AdministratorDto;", "getApplicants", "()Lhu/ekreta/ellenorzo/rest/eadminapi/ApplicantsDto;", "getApplicationMandatoryDocument", "()Ljava/util/List;", "getAttachments", "getDecisions", "getDocumentNumber", "()Ljava/lang/String;", "getFiledApplication", "()Lhu/ekreta/ellenorzo/rest/eadminapi/FiledApplicationDto;", "getHistoryFileNumber", "getId", "()I", "getInternalDeadlineDate", "()Ljava/util/Calendar;", "getInternalNote", "getJustificationType", "()Lhu/ekreta/ellenorzo/rest/eadminapi/TypeDto;", "getLastModificationDate", "getOtherThingsToDoAttachments", "getPostState", "()Lhu/ekreta/ellenorzo/rest/eadminapi/PostStateDto;", "getReason", "getRegistrationNumber", "getRequestedAbsenceEnd", "getRequestedAbsenceStart", "getSentDate", "getState", "()Lhu/ekreta/ellenorzo/rest/eadminapi/StateDto;", "getStudentClass", "getStudentEducationId", "getStudentFamilyName", "getStudentFirstName", "getSubmittedDigitally", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getToDoItem", "getType", "getTypeCode", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/util/Calendar;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;Ljava/lang/Boolean;Lhu/ekreta/ellenorzo/rest/eadminapi/TypeDto;Lhu/ekreta/ellenorzo/rest/eadminapi/StateDto;Lhu/ekreta/ellenorzo/rest/eadminapi/PostStateDto;Lhu/ekreta/ellenorzo/rest/eadminapi/ApplicantsDto;Lhu/ekreta/ellenorzo/rest/eadminapi/AdministratorDto;Lhu/ekreta/ellenorzo/rest/eadminapi/FiledApplicationDto;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lhu/ekreta/ellenorzo/rest/eadminapi/TypeDto;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/util/List;)Lhu/ekreta/ellenorzo/rest/eadminapi/CaseDto;", "equals", "other", "hashCode", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.rest.eadminapi.CaseDto */
/* compiled from: CaseDto.kt */
public final class CaseDto {
    @C2580c("ugyintezo")
    public final AdministratorDto administrator;
    @C2580c("kerelmezo")
    public final ApplicantsDto applicants;
    @C2580c("kerelemKotelezoDokumentumLista")
    public final List<ApplicationMandatoryDocumentDto> applicationMandatoryDocument;
    @C2580c("csatolmanyok")
    public final List<AttachmentDto> attachments;
    @C2580c("hatarozatLista")
    public final List<DecisionDto> decisions;
    @C2580c("ugyiratszam")
    public final String documentNumber;
    @C2580c("iktatottKerelem")
    public final FiledApplicationDto filedApplication;
    @C2580c("elozmenyUgyiratszam")
    public final String historyFileNumber;
    @C2580c("azonosito")

    /* renamed from: id */
    public final int f14687id;
    @C2580c("belsoHataridoDatum")
    public final Calendar internalDeadlineDate;
    @C2580c("belsoMegjegyzes")
    public final String internalNote;
    @C2580c("igazolasTipus")
    public final TypeDto justificationType;
    @C2580c("utolsoModositasDatum")
    public final Calendar lastModificationDate;
    @C2580c("teendoEgyebCsatolmanyok")
    public final List<OtherThingsToDoAttachmentsDto> otherThingsToDoAttachments;
    @C2580c("postazasiStatusz")
    public final PostStateDto postState;
    @C2580c("indoklas")
    public final String reason;
    @C2580c("iktatoszam")
    public final String registrationNumber;
    @C2580c("igazoltTavolletVegeDatum")
    public final Calendar requestedAbsenceEnd;
    @C2580c("igazoltTavolletKezdeteDatum")
    public final Calendar requestedAbsenceStart;
    @C2580c("bekuldesDatum")
    public final Calendar sentDate;
    @C2580c("statusz")
    public final StateDto state;
    @C2580c("tanuloOsztaly")
    public final String studentClass;
    @C2580c("tanuloOktatasiAzonosito")
    public final String studentEducationId;
    @C2580c("tanuloCsaladiNev")
    public final String studentFamilyName;
    @C2580c("tanuloKeresztNev")
    public final String studentFirstName;
    @C2580c("isDigitalisanBekuldve")
    public final Boolean submittedDigitally;
    @C2580c("teendoLista")
    public final List<ToDoItemDto> toDoItem;
    @C2580c("tipus")
    public final TypeDto type;
    @C2580c("tipusKod")
    public final String typeCode;

    public CaseDto(int i, Calendar calendar, Calendar calendar2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Calendar calendar3, Boolean bool, TypeDto typeDto, StateDto stateDto, PostStateDto postStateDto, ApplicantsDto applicantsDto, AdministratorDto administratorDto, FiledApplicationDto filedApplicationDto, List<AttachmentDto> list, List<OtherThingsToDoAttachmentsDto> list2, List<ToDoItemDto> list3, List<ApplicationMandatoryDocumentDto> list4, TypeDto typeDto2, Calendar calendar4, Calendar calendar5, List<DecisionDto> list5) {
        Calendar calendar6 = calendar;
        TypeDto typeDto3 = typeDto;
        StateDto stateDto2 = stateDto;
        Intrinsics.checkParameterIsNotNull(calendar, "sentDate");
        Intrinsics.checkParameterIsNotNull(typeDto3, "type");
        Intrinsics.checkParameterIsNotNull(stateDto2, "state");
        this.f14687id = i;
        this.sentDate = calendar6;
        this.internalDeadlineDate = calendar2;
        this.internalNote = str;
        this.historyFileNumber = str2;
        this.registrationNumber = str3;
        this.reason = str4;
        this.studentFamilyName = str5;
        this.studentFirstName = str6;
        this.studentEducationId = str7;
        this.studentClass = str8;
        this.typeCode = str9;
        this.documentNumber = str10;
        this.lastModificationDate = calendar3;
        this.submittedDigitally = bool;
        this.type = typeDto3;
        this.state = stateDto2;
        this.postState = postStateDto;
        this.applicants = applicantsDto;
        this.administrator = administratorDto;
        this.filedApplication = filedApplicationDto;
        this.attachments = list;
        this.otherThingsToDoAttachments = list2;
        this.toDoItem = list3;
        this.applicationMandatoryDocument = list4;
        this.justificationType = typeDto2;
        this.requestedAbsenceStart = calendar4;
        this.requestedAbsenceEnd = calendar5;
        this.decisions = list5;
    }

    public static /* synthetic */ CaseDto copy$default(CaseDto caseDto, int i, Calendar calendar, Calendar calendar2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Calendar calendar3, Boolean bool, TypeDto typeDto, StateDto stateDto, PostStateDto postStateDto, ApplicantsDto applicantsDto, AdministratorDto administratorDto, FiledApplicationDto filedApplicationDto, List list, List list2, List list3, List list4, TypeDto typeDto2, Calendar calendar4, Calendar calendar5, List list5, int i2, Object obj) {
        CaseDto caseDto2 = caseDto;
        int i3 = i2;
        return caseDto.copy((i3 & 1) != 0 ? caseDto2.f14687id : i, (i3 & 2) != 0 ? caseDto2.sentDate : calendar, (i3 & 4) != 0 ? caseDto2.internalDeadlineDate : calendar2, (i3 & 8) != 0 ? caseDto2.internalNote : str, (i3 & 16) != 0 ? caseDto2.historyFileNumber : str2, (i3 & 32) != 0 ? caseDto2.registrationNumber : str3, (i3 & 64) != 0 ? caseDto2.reason : str4, (i3 & 128) != 0 ? caseDto2.studentFamilyName : str5, (i3 & 256) != 0 ? caseDto2.studentFirstName : str6, (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? caseDto2.studentEducationId : str7, (i3 & 1024) != 0 ? caseDto2.studentClass : str8, (i3 & 2048) != 0 ? caseDto2.typeCode : str9, (i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? caseDto2.documentNumber : str10, (i3 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? caseDto2.lastModificationDate : calendar3, (i3 & 16384) != 0 ? caseDto2.submittedDigitally : bool, (i3 & 32768) != 0 ? caseDto2.type : typeDto, (i3 & 65536) != 0 ? caseDto2.state : stateDto, (i3 & 131072) != 0 ? caseDto2.postState : postStateDto, (i3 & 262144) != 0 ? caseDto2.applicants : applicantsDto, (i3 & 524288) != 0 ? caseDto2.administrator : administratorDto, (i3 & 1048576) != 0 ? caseDto2.filedApplication : filedApplicationDto, (i3 & 2097152) != 0 ? caseDto2.attachments : list, (i3 & 4194304) != 0 ? caseDto2.otherThingsToDoAttachments : list2, (i3 & 8388608) != 0 ? caseDto2.toDoItem : list3, (i3 & 16777216) != 0 ? caseDto2.applicationMandatoryDocument : list4, (i3 & 33554432) != 0 ? caseDto2.justificationType : typeDto2, (i3 & 67108864) != 0 ? caseDto2.requestedAbsenceStart : calendar4, (i3 & 134217728) != 0 ? caseDto2.requestedAbsenceEnd : calendar5, (i3 & 268435456) != 0 ? caseDto2.decisions : list5);
    }

    public final int component1() {
        return this.f14687id;
    }

    public final String component10() {
        return this.studentEducationId;
    }

    public final String component11() {
        return this.studentClass;
    }

    public final String component12() {
        return this.typeCode;
    }

    public final String component13() {
        return this.documentNumber;
    }

    public final Calendar component14() {
        return this.lastModificationDate;
    }

    public final Boolean component15() {
        return this.submittedDigitally;
    }

    public final TypeDto component16() {
        return this.type;
    }

    public final StateDto component17() {
        return this.state;
    }

    public final PostStateDto component18() {
        return this.postState;
    }

    public final ApplicantsDto component19() {
        return this.applicants;
    }

    public final Calendar component2() {
        return this.sentDate;
    }

    public final AdministratorDto component20() {
        return this.administrator;
    }

    public final FiledApplicationDto component21() {
        return this.filedApplication;
    }

    public final List<AttachmentDto> component22() {
        return this.attachments;
    }

    public final List<OtherThingsToDoAttachmentsDto> component23() {
        return this.otherThingsToDoAttachments;
    }

    public final List<ToDoItemDto> component24() {
        return this.toDoItem;
    }

    public final List<ApplicationMandatoryDocumentDto> component25() {
        return this.applicationMandatoryDocument;
    }

    public final TypeDto component26() {
        return this.justificationType;
    }

    public final Calendar component27() {
        return this.requestedAbsenceStart;
    }

    public final Calendar component28() {
        return this.requestedAbsenceEnd;
    }

    public final List<DecisionDto> component29() {
        return this.decisions;
    }

    public final Calendar component3() {
        return this.internalDeadlineDate;
    }

    public final String component4() {
        return this.internalNote;
    }

    public final String component5() {
        return this.historyFileNumber;
    }

    public final String component6() {
        return this.registrationNumber;
    }

    public final String component7() {
        return this.reason;
    }

    public final String component8() {
        return this.studentFamilyName;
    }

    public final String component9() {
        return this.studentFirstName;
    }

    public final CaseDto copy(int i, Calendar calendar, Calendar calendar2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Calendar calendar3, Boolean bool, TypeDto typeDto, StateDto stateDto, PostStateDto postStateDto, ApplicantsDto applicantsDto, AdministratorDto administratorDto, FiledApplicationDto filedApplicationDto, List<AttachmentDto> list, List<OtherThingsToDoAttachmentsDto> list2, List<ToDoItemDto> list3, List<ApplicationMandatoryDocumentDto> list4, TypeDto typeDto2, Calendar calendar4, Calendar calendar5, List<DecisionDto> list5) {
        int i2 = i;
        Calendar calendar6 = calendar;
        Calendar calendar7 = calendar2;
        String str11 = str;
        String str12 = str2;
        String str13 = str3;
        String str14 = str4;
        String str15 = str5;
        String str16 = str6;
        String str17 = str7;
        String str18 = str8;
        String str19 = str9;
        String str20 = str10;
        Calendar calendar8 = calendar3;
        Boolean bool2 = bool;
        TypeDto typeDto3 = typeDto;
        StateDto stateDto2 = stateDto;
        PostStateDto postStateDto2 = postStateDto;
        ApplicantsDto applicantsDto2 = applicantsDto;
        AdministratorDto administratorDto2 = administratorDto;
        FiledApplicationDto filedApplicationDto2 = filedApplicationDto;
        List<AttachmentDto> list6 = list;
        List<OtherThingsToDoAttachmentsDto> list7 = list2;
        List<ToDoItemDto> list8 = list3;
        List<ApplicationMandatoryDocumentDto> list9 = list4;
        TypeDto typeDto4 = typeDto2;
        Calendar calendar9 = calendar4;
        Calendar calendar10 = calendar5;
        List<DecisionDto> list10 = list5;
        Intrinsics.checkParameterIsNotNull(calendar, "sentDate");
        Intrinsics.checkParameterIsNotNull(typeDto, "type");
        Intrinsics.checkParameterIsNotNull(stateDto, "state");
        CaseDto caseDto = new CaseDto(i, calendar6, calendar7, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, calendar8, bool2, typeDto3, stateDto2, postStateDto2, applicantsDto2, administratorDto2, filedApplicationDto2, list6, list7, list8, list9, typeDto4, calendar9, calendar10, list10);
        return caseDto;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CaseDto) {
                CaseDto caseDto = (CaseDto) obj;
                if (!(this.f14687id == caseDto.f14687id) || !Intrinsics.areEqual((Object) this.sentDate, (Object) caseDto.sentDate) || !Intrinsics.areEqual((Object) this.internalDeadlineDate, (Object) caseDto.internalDeadlineDate) || !Intrinsics.areEqual((Object) this.internalNote, (Object) caseDto.internalNote) || !Intrinsics.areEqual((Object) this.historyFileNumber, (Object) caseDto.historyFileNumber) || !Intrinsics.areEqual((Object) this.registrationNumber, (Object) caseDto.registrationNumber) || !Intrinsics.areEqual((Object) this.reason, (Object) caseDto.reason) || !Intrinsics.areEqual((Object) this.studentFamilyName, (Object) caseDto.studentFamilyName) || !Intrinsics.areEqual((Object) this.studentFirstName, (Object) caseDto.studentFirstName) || !Intrinsics.areEqual((Object) this.studentEducationId, (Object) caseDto.studentEducationId) || !Intrinsics.areEqual((Object) this.studentClass, (Object) caseDto.studentClass) || !Intrinsics.areEqual((Object) this.typeCode, (Object) caseDto.typeCode) || !Intrinsics.areEqual((Object) this.documentNumber, (Object) caseDto.documentNumber) || !Intrinsics.areEqual((Object) this.lastModificationDate, (Object) caseDto.lastModificationDate) || !Intrinsics.areEqual((Object) this.submittedDigitally, (Object) caseDto.submittedDigitally) || !Intrinsics.areEqual((Object) this.type, (Object) caseDto.type) || !Intrinsics.areEqual((Object) this.state, (Object) caseDto.state) || !Intrinsics.areEqual((Object) this.postState, (Object) caseDto.postState) || !Intrinsics.areEqual((Object) this.applicants, (Object) caseDto.applicants) || !Intrinsics.areEqual((Object) this.administrator, (Object) caseDto.administrator) || !Intrinsics.areEqual((Object) this.filedApplication, (Object) caseDto.filedApplication) || !Intrinsics.areEqual((Object) this.attachments, (Object) caseDto.attachments) || !Intrinsics.areEqual((Object) this.otherThingsToDoAttachments, (Object) caseDto.otherThingsToDoAttachments) || !Intrinsics.areEqual((Object) this.toDoItem, (Object) caseDto.toDoItem) || !Intrinsics.areEqual((Object) this.applicationMandatoryDocument, (Object) caseDto.applicationMandatoryDocument) || !Intrinsics.areEqual((Object) this.justificationType, (Object) caseDto.justificationType) || !Intrinsics.areEqual((Object) this.requestedAbsenceStart, (Object) caseDto.requestedAbsenceStart) || !Intrinsics.areEqual((Object) this.requestedAbsenceEnd, (Object) caseDto.requestedAbsenceEnd) || !Intrinsics.areEqual((Object) this.decisions, (Object) caseDto.decisions)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final AdministratorDto getAdministrator() {
        return this.administrator;
    }

    public final ApplicantsDto getApplicants() {
        return this.applicants;
    }

    public final List<ApplicationMandatoryDocumentDto> getApplicationMandatoryDocument() {
        return this.applicationMandatoryDocument;
    }

    public final List<AttachmentDto> getAttachments() {
        return this.attachments;
    }

    public final List<DecisionDto> getDecisions() {
        return this.decisions;
    }

    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    public final FiledApplicationDto getFiledApplication() {
        return this.filedApplication;
    }

    public final String getHistoryFileNumber() {
        return this.historyFileNumber;
    }

    public final int getId() {
        return this.f14687id;
    }

    public final Calendar getInternalDeadlineDate() {
        return this.internalDeadlineDate;
    }

    public final String getInternalNote() {
        return this.internalNote;
    }

    public final TypeDto getJustificationType() {
        return this.justificationType;
    }

    public final Calendar getLastModificationDate() {
        return this.lastModificationDate;
    }

    public final List<OtherThingsToDoAttachmentsDto> getOtherThingsToDoAttachments() {
        return this.otherThingsToDoAttachments;
    }

    public final PostStateDto getPostState() {
        return this.postState;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getRegistrationNumber() {
        return this.registrationNumber;
    }

    public final Calendar getRequestedAbsenceEnd() {
        return this.requestedAbsenceEnd;
    }

    public final Calendar getRequestedAbsenceStart() {
        return this.requestedAbsenceStart;
    }

    public final Calendar getSentDate() {
        return this.sentDate;
    }

    public final StateDto getState() {
        return this.state;
    }

    public final String getStudentClass() {
        return this.studentClass;
    }

    public final String getStudentEducationId() {
        return this.studentEducationId;
    }

    public final String getStudentFamilyName() {
        return this.studentFamilyName;
    }

    public final String getStudentFirstName() {
        return this.studentFirstName;
    }

    public final Boolean getSubmittedDigitally() {
        return this.submittedDigitally;
    }

    public final List<ToDoItemDto> getToDoItem() {
        return this.toDoItem;
    }

    public final TypeDto getType() {
        return this.type;
    }

    public final String getTypeCode() {
        return this.typeCode;
    }

    public int hashCode() {
        int i = this.f14687id * 31;
        Calendar calendar = this.sentDate;
        int i2 = 0;
        int hashCode = (i + (calendar != null ? calendar.hashCode() : 0)) * 31;
        Calendar calendar2 = this.internalDeadlineDate;
        int hashCode2 = (hashCode + (calendar2 != null ? calendar2.hashCode() : 0)) * 31;
        String str = this.internalNote;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.historyFileNumber;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.registrationNumber;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.reason;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.studentFamilyName;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.studentFirstName;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.studentEducationId;
        int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.studentClass;
        int hashCode10 = (hashCode9 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.typeCode;
        int hashCode11 = (hashCode10 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.documentNumber;
        int hashCode12 = (hashCode11 + (str10 != null ? str10.hashCode() : 0)) * 31;
        Calendar calendar3 = this.lastModificationDate;
        int hashCode13 = (hashCode12 + (calendar3 != null ? calendar3.hashCode() : 0)) * 31;
        Boolean bool = this.submittedDigitally;
        int hashCode14 = (hashCode13 + (bool != null ? bool.hashCode() : 0)) * 31;
        TypeDto typeDto = this.type;
        int hashCode15 = (hashCode14 + (typeDto != null ? typeDto.hashCode() : 0)) * 31;
        StateDto stateDto = this.state;
        int hashCode16 = (hashCode15 + (stateDto != null ? stateDto.hashCode() : 0)) * 31;
        PostStateDto postStateDto = this.postState;
        int hashCode17 = (hashCode16 + (postStateDto != null ? postStateDto.hashCode() : 0)) * 31;
        ApplicantsDto applicantsDto = this.applicants;
        int hashCode18 = (hashCode17 + (applicantsDto != null ? applicantsDto.hashCode() : 0)) * 31;
        AdministratorDto administratorDto = this.administrator;
        int hashCode19 = (hashCode18 + (administratorDto != null ? administratorDto.hashCode() : 0)) * 31;
        FiledApplicationDto filedApplicationDto = this.filedApplication;
        int hashCode20 = (hashCode19 + (filedApplicationDto != null ? filedApplicationDto.hashCode() : 0)) * 31;
        List<AttachmentDto> list = this.attachments;
        int hashCode21 = (hashCode20 + (list != null ? list.hashCode() : 0)) * 31;
        List<OtherThingsToDoAttachmentsDto> list2 = this.otherThingsToDoAttachments;
        int hashCode22 = (hashCode21 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<ToDoItemDto> list3 = this.toDoItem;
        int hashCode23 = (hashCode22 + (list3 != null ? list3.hashCode() : 0)) * 31;
        List<ApplicationMandatoryDocumentDto> list4 = this.applicationMandatoryDocument;
        int hashCode24 = (hashCode23 + (list4 != null ? list4.hashCode() : 0)) * 31;
        TypeDto typeDto2 = this.justificationType;
        int hashCode25 = (hashCode24 + (typeDto2 != null ? typeDto2.hashCode() : 0)) * 31;
        Calendar calendar4 = this.requestedAbsenceStart;
        int hashCode26 = (hashCode25 + (calendar4 != null ? calendar4.hashCode() : 0)) * 31;
        Calendar calendar5 = this.requestedAbsenceEnd;
        int hashCode27 = (hashCode26 + (calendar5 != null ? calendar5.hashCode() : 0)) * 31;
        List<DecisionDto> list5 = this.decisions;
        if (list5 != null) {
            i2 = list5.hashCode();
        }
        return hashCode27 + i2;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("CaseDto(id=");
        a.append(this.f14687id);
        a.append(", sentDate=");
        a.append(this.sentDate);
        a.append(", internalDeadlineDate=");
        a.append(this.internalDeadlineDate);
        a.append(", internalNote=");
        a.append(this.internalNote);
        a.append(", historyFileNumber=");
        a.append(this.historyFileNumber);
        a.append(", registrationNumber=");
        a.append(this.registrationNumber);
        a.append(", reason=");
        a.append(this.reason);
        a.append(", studentFamilyName=");
        a.append(this.studentFamilyName);
        a.append(", studentFirstName=");
        a.append(this.studentFirstName);
        a.append(", studentEducationId=");
        a.append(this.studentEducationId);
        a.append(", studentClass=");
        a.append(this.studentClass);
        a.append(", typeCode=");
        a.append(this.typeCode);
        a.append(", documentNumber=");
        a.append(this.documentNumber);
        a.append(", lastModificationDate=");
        a.append(this.lastModificationDate);
        a.append(", submittedDigitally=");
        a.append(this.submittedDigitally);
        a.append(", type=");
        a.append(this.type);
        a.append(", state=");
        a.append(this.state);
        a.append(", postState=");
        a.append(this.postState);
        a.append(", applicants=");
        a.append(this.applicants);
        a.append(", administrator=");
        a.append(this.administrator);
        a.append(", filedApplication=");
        a.append(this.filedApplication);
        a.append(", attachments=");
        a.append(this.attachments);
        a.append(", otherThingsToDoAttachments=");
        a.append(this.otherThingsToDoAttachments);
        a.append(", toDoItem=");
        a.append(this.toDoItem);
        a.append(", applicationMandatoryDocument=");
        a.append(this.applicationMandatoryDocument);
        a.append(", justificationType=");
        a.append(this.justificationType);
        a.append(", requestedAbsenceStart=");
        a.append(this.requestedAbsenceStart);
        a.append(", requestedAbsenceEnd=");
        a.append(this.requestedAbsenceEnd);
        a.append(", decisions=");
        return C0082a.m108a(a, (List) this.decisions, ")");
    }
}
