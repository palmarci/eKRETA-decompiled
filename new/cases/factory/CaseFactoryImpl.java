package hu.ekreta.ellenorzo.cases.factory;

import h.w.v;
import hu.ekreta.ellenorzo.attachment.Attachment;
import hu.ekreta.ellenorzo.attachment.AttachmentRealm;
import hu.ekreta.ellenorzo.cases.BaseCase;
import hu.ekreta.ellenorzo.cases.CaseRealm;
import hu.ekreta.ellenorzo.cases.subModels.ApplicationDocumentType;
import hu.ekreta.ellenorzo.cases.subModels.ApplicationMandatoryDocument;
import hu.ekreta.ellenorzo.cases.subModels.ApplicationMandatoryDocumentKt;
import hu.ekreta.ellenorzo.cases.subModels.CaseType;
import hu.ekreta.ellenorzo.cases.subModels.File;
import hu.ekreta.ellenorzo.cases.subModels.State;
import hu.ekreta.ellenorzo.cases.subRealmModels.ApplicationDocumentTypeRealm;
import hu.ekreta.ellenorzo.cases.subRealmModels.ApplicationMandatoryDocumentRealm;
import hu.ekreta.ellenorzo.cases.subRealmModels.ApplicationMandatoryDocumentRealmKt;
import hu.ekreta.ellenorzo.cases.subRealmModels.FileRealm;
import hu.ekreta.ellenorzo.cases.tmgi.TmgiCase;
import hu.ekreta.ellenorzo.rest.eadminapi.AdministratorDto;
import hu.ekreta.ellenorzo.rest.eadminapi.ApplicationMandatoryDocumentDto;
import hu.ekreta.ellenorzo.rest.eadminapi.AttachmentDto;
import hu.ekreta.ellenorzo.rest.eadminapi.CaseDto;
import hu.ekreta.ellenorzo.rest.eadminapi.DecisionDto;
import hu.ekreta.ellenorzo.rest.eadminapi.FiledApplicationDto;
import hu.ekreta.ellenorzo.rest.eadminapi.TypeDto;
import hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import k.c.d0;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0016J;\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00100\u000f\"\u0004\b\u0000\u0010\u0011\"\u0006\b\u0001\u0010\u0010\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00110\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u00100\u0014H\bJ \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016*\b\u0012\u0004\u0012\u00020\u00180\u00122\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0016*\b\u0012\u0004\u0012\u00020\u001b0\u00122\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u001c"}, d2 = {"Lhu/ekreta/ellenorzo/cases/factory/CaseFactoryImpl;", "Lhu/ekreta/ellenorzo/cases/factory/CaseFactory;", "()V", "fromApiModel", "Lhu/ekreta/ellenorzo/cases/BaseCase;", "profileId", "", "caseDto", "Lhu/ekreta/ellenorzo/rest/eadminapi/CaseDto;", "fromRealmModel", "caseRealm", "Lhu/ekreta/ellenorzo/cases/CaseRealm;", "toRealmModel", "model", "asRealmList", "Lio/realm/RealmList;", "R", "T", "", "transform", "Lkotlin/Function1;", "toApplicationMandatoryDocuments", "", "Lhu/ekreta/ellenorzo/cases/subModels/ApplicationMandatoryDocument;", "Lhu/ekreta/ellenorzo/rest/eadminapi/ApplicationMandatoryDocumentDto;", "toAttachments", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "Lhu/ekreta/ellenorzo/rest/eadminapi/AttachmentDto;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: CaseFactoryImpl.kt */
public final class CaseFactoryImpl implements CaseFactory {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5145a = new int[CaseType.Code.values().length];
        public static final /* synthetic */ int[] b = new int[CaseType.Code.values().length];

        static {
            f5145a[CaseType.Code.VERIFICATION_BY_PARENT.ordinal()] = 1;
            b[CaseType.Code.VERIFICATION_BY_PARENT.ordinal()] = 1;
        }
    }

    public BaseCase a(CaseRealm caseRealm) {
        Intrinsics.checkParameterIsNotNull(caseRealm, "caseRealm");
        CaseType.Code.Companion companion = CaseType.Code.Companion;
        String v2 = caseRealm.v2();
        if (v2 == null) {
            v2 = "";
        }
        if (WhenMappings.f5145a[companion.a(v2).ordinal()] != 1) {
            String l2 = caseRealm.l2();
            if (l2 == null) {
                Intrinsics.throwNpe();
            }
            String i2 = caseRealm.i2();
            if (i2 == null) {
                Intrinsics.throwNpe();
            }
            Calendar b = UtilsKt.b(caseRealm.p2());
            if (b == null) {
                Intrinsics.throwNpe();
            }
            Calendar b2 = UtilsKt.b(caseRealm.k2());
            State.StateType.Companion companion2 = State.StateType.Companion;
            String q2 = caseRealm.q2();
            if (q2 == null) {
                Intrinsics.throwNpe();
            }
            State.StateType a2 = companion2.a(q2);
            String r2 = caseRealm.r2();
            if (r2 == null) {
                Intrinsics.throwNpe();
            }
            String v22 = caseRealm.v2();
            if (v22 == null) {
                Intrinsics.throwNpe();
            }
            String w2 = caseRealm.w2();
            if (w2 == null) {
                Intrinsics.throwNpe();
            }
            String h2 = caseRealm.h2();
            String t2 = caseRealm.t2();
            String u2 = caseRealm.u2();
            String s2 = caseRealm.s2();
            String e2 = caseRealm.e2();
            String m2 = caseRealm.m2();
            d0<AttachmentRealm> g2 = caseRealm.g2();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(g2, 10));
            for (AttachmentRealm a3 : g2) {
                arrayList.add(v.a(a3));
            }
            d0<ApplicationMandatoryDocumentRealm> f2 = caseRealm.f2();
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(f2, 10));
            for (ApplicationMandatoryDocumentRealm a4 : f2) {
                arrayList2.add(ApplicationMandatoryDocumentRealmKt.a(a4));
            }
            return new BaseCase(l2, i2, b, b2, a2, r2, v22, w2, h2, t2, u2, s2, e2, m2, (String) null, arrayList, arrayList2, (List) null, 131072, (DefaultConstructorMarker) null);
        }
        String l22 = caseRealm.l2();
        if (l22 == null) {
            Intrinsics.throwNpe();
        }
        String i22 = caseRealm.i2();
        if (i22 == null) {
            Intrinsics.throwNpe();
        }
        Calendar b3 = UtilsKt.b(caseRealm.p2());
        if (b3 == null) {
            Intrinsics.throwNpe();
        }
        Calendar b4 = UtilsKt.b(caseRealm.k2());
        State.StateType.Companion companion3 = State.StateType.Companion;
        String q22 = caseRealm.q2();
        if (q22 == null) {
            Intrinsics.throwNpe();
        }
        State.StateType a5 = companion3.a(q22);
        String r22 = caseRealm.r2();
        if (r22 == null) {
            Intrinsics.throwNpe();
        }
        String v23 = caseRealm.v2();
        if (v23 == null) {
            Intrinsics.throwNpe();
        }
        String w22 = caseRealm.w2();
        if (w22 == null) {
            Intrinsics.throwNpe();
        }
        String h22 = caseRealm.h2();
        String t22 = caseRealm.t2();
        String u22 = caseRealm.u2();
        String s22 = caseRealm.s2();
        String e22 = caseRealm.e2();
        String m22 = caseRealm.m2();
        d0<AttachmentRealm> g22 = caseRealm.g2();
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(g22, 10));
        for (AttachmentRealm a6 : g22) {
            arrayList3.add(v.a(a6));
        }
        String j2 = caseRealm.j2();
        Calendar b5 = UtilsKt.b(caseRealm.o2());
        Calendar b6 = UtilsKt.b(caseRealm.n2());
        d0<ApplicationMandatoryDocumentRealm> f22 = caseRealm.f2();
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(f22, 10));
        for (ApplicationMandatoryDocumentRealm a7 : f22) {
            arrayList4.add(ApplicationMandatoryDocumentRealmKt.a(a7));
        }
        return new TmgiCase(l22, i22, b3, b4, a5, r22, v23, w22, h22, t22, u22, s22, e22, m22, (String) null, arrayList3, j2, b5, b6, arrayList4, (List) null, 1048576, (DefaultConstructorMarker) null);
    }

    public final List<Attachment> b(Collection<AttachmentDto> collection, String str) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10));
        for (AttachmentDto a2 : collection) {
            arrayList.add(v.a(a2, str));
        }
        return arrayList;
    }

    public BaseCase a(String str, CaseDto caseDto) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2 = str;
        Intrinsics.checkParameterIsNotNull(str2, "profileId");
        Intrinsics.checkParameterIsNotNull(caseDto, "caseDto");
        Integer num = null;
        if (WhenMappings.b[CaseType.Code.Companion.a(caseDto.getType().getCode()).ordinal()] != 1) {
            String valueOf = String.valueOf(caseDto.getId());
            Calendar sentDate = caseDto.getSentDate();
            Calendar lastModificationDate = caseDto.getLastModificationDate();
            State.StateType a2 = State.StateType.Companion.a(caseDto.getState().getCode());
            String description = caseDto.getState().getDescription();
            String code = caseDto.getType().getCode();
            String name = caseDto.getType().getName();
            String documentNumber = caseDto.getDocumentNumber();
            String studentFamilyName = caseDto.getStudentFamilyName();
            String studentFirstName = caseDto.getStudentFirstName();
            String studentEducationId = caseDto.getStudentEducationId();
            AdministratorDto administrator = caseDto.getAdministrator();
            String shortName = administrator != null ? administrator.getShortName() : null;
            String reason = caseDto.getReason();
            FiledApplicationDto filedApplication = caseDto.getFiledApplication();
            if (filedApplication != null) {
                num = Integer.valueOf(filedApplication.getId());
            }
            String valueOf2 = String.valueOf(num);
            List<AttachmentDto> attachments = caseDto.getAttachments();
            List<Attachment> b = attachments != null ? b(attachments, str2) : CollectionsKt__CollectionsKt.emptyList();
            List<ApplicationMandatoryDocumentDto> applicationMandatoryDocument = caseDto.getApplicationMandatoryDocument();
            List<ApplicationMandatoryDocument> a3 = applicationMandatoryDocument != null ? a((Collection<ApplicationMandatoryDocumentDto>) applicationMandatoryDocument, str2) : CollectionsKt__CollectionsKt.emptyList();
            List<DecisionDto> decisions = caseDto.getDecisions();
            if (decisions != null) {
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(decisions, 10));
                for (DecisionDto a4 : decisions) {
                    arrayList3.add(v.a(a4, str2));
                }
                arrayList2 = arrayList3;
            } else {
                arrayList2 = CollectionsKt__CollectionsKt.emptyList();
            }
            return new BaseCase(str, valueOf, sentDate, lastModificationDate, a2, description, code, name, documentNumber, studentFamilyName, studentFirstName, studentEducationId, shortName, reason, valueOf2, b, a3, arrayList2);
        }
        String valueOf3 = String.valueOf(caseDto.getId());
        Calendar sentDate2 = caseDto.getSentDate();
        Calendar lastModificationDate2 = caseDto.getLastModificationDate();
        State.StateType a5 = State.StateType.Companion.a(caseDto.getState().getCode());
        String description2 = caseDto.getState().getDescription();
        String code2 = caseDto.getType().getCode();
        String name2 = caseDto.getType().getName();
        String documentNumber2 = caseDto.getDocumentNumber();
        String studentFamilyName2 = caseDto.getStudentFamilyName();
        String studentFirstName2 = caseDto.getStudentFirstName();
        String studentEducationId2 = caseDto.getStudentEducationId();
        AdministratorDto administrator2 = caseDto.getAdministrator();
        String shortName2 = administrator2 != null ? administrator2.getShortName() : null;
        String reason2 = caseDto.getReason();
        FiledApplicationDto filedApplication2 = caseDto.getFiledApplication();
        String valueOf4 = String.valueOf(filedApplication2 != null ? Integer.valueOf(filedApplication2.getId()) : null);
        List<AttachmentDto> attachments2 = caseDto.getAttachments();
        List<Attachment> b2 = attachments2 != null ? b(attachments2, str2) : CollectionsKt__CollectionsKt.emptyList();
        TypeDto justificationType = caseDto.getJustificationType();
        String name3 = justificationType != null ? justificationType.getName() : null;
        Calendar requestedAbsenceStart = caseDto.getRequestedAbsenceStart();
        Calendar requestedAbsenceEnd = caseDto.getRequestedAbsenceEnd();
        List<ApplicationMandatoryDocumentDto> applicationMandatoryDocument2 = caseDto.getApplicationMandatoryDocument();
        List<ApplicationMandatoryDocument> a6 = applicationMandatoryDocument2 != null ? a((Collection<ApplicationMandatoryDocumentDto>) applicationMandatoryDocument2, str2) : CollectionsKt__CollectionsKt.emptyList();
        List<DecisionDto> decisions2 = caseDto.getDecisions();
        if (decisions2 != null) {
            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(decisions2, 10));
            for (DecisionDto a7 : decisions2) {
                arrayList4.add(v.a(a7, str2));
            }
            arrayList = arrayList4;
        } else {
            arrayList = CollectionsKt__CollectionsKt.emptyList();
        }
        return new TmgiCase(str, valueOf3, sentDate2, lastModificationDate2, a5, description2, code2, name2, documentNumber2, studentFamilyName2, studentFirstName2, studentEducationId2, shortName2, reason2, valueOf4, b2, name3, requestedAbsenceStart, requestedAbsenceEnd, a6, arrayList);
    }

    public CaseRealm a(BaseCase baseCase) {
        String str;
        String str2;
        String str3;
        String str4;
        FileRealm fileRealm;
        ApplicationDocumentTypeRealm applicationDocumentTypeRealm;
        Intrinsics.checkParameterIsNotNull(baseCase, "model");
        String e = baseCase.e();
        String l2 = baseCase.l();
        Date time = baseCase.o().getTime();
        Calendar m2 = baseCase.m();
        Date date = null;
        Date time2 = m2 != null ? m2.getTime() : null;
        String a2 = baseCase.q().a();
        String p2 = baseCase.p();
        String j2 = baseCase.j();
        String u = baseCase.u();
        String v = baseCase.v();
        String s = baseCase.s();
        String t = baseCase.t();
        String r = baseCase.r();
        String f = baseCase.f();
        String n2 = baseCase.n();
        List<Attachment> h2 = baseCase.h();
        d0 d0Var = new d0();
        String str5 = v;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(h2, 10));
        for (Attachment a3 : h2) {
            arrayList.add(v.a(a3));
        }
        d0Var.addAll(arrayList);
        List<ApplicationMandatoryDocument> g2 = baseCase.g();
        d0 d0Var2 = new d0();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(g2, 10));
        Iterator<T> it = g2.iterator();
        while (it.hasNext()) {
            ApplicationMandatoryDocument applicationMandatoryDocument = (ApplicationMandatoryDocument) it.next();
            Iterator<T> it2 = it;
            Intrinsics.checkParameterIsNotNull(applicationMandatoryDocument, "$this$toApplicationMandatoryDocumentRealm");
            d0 d0Var3 = d0Var;
            String a4 = applicationMandatoryDocument.a((Object) applicationMandatoryDocument.i());
            Integer i2 = applicationMandatoryDocument.i();
            String h3 = applicationMandatoryDocument.h();
            String j3 = applicationMandatoryDocument.j();
            File g3 = applicationMandatoryDocument.g();
            if (g3 != null) {
                str4 = u;
                Intrinsics.checkParameterIsNotNull(g3, "$this$toFileRealm");
                str3 = f;
                str2 = r;
                str = t;
                fileRealm = new FileRealm(g3.a(g3.f()), g3.f(), g3.g(), g3.e());
            } else {
                str = t;
                str2 = r;
                str3 = f;
                str4 = u;
                fileRealm = null;
            }
            ApplicationDocumentType f2 = applicationMandatoryDocument.f();
            if (f2 != null) {
                Intrinsics.checkParameterIsNotNull(f2, "$this$toApplicationDocumentTypeRealm");
                applicationDocumentTypeRealm = new ApplicationDocumentTypeRealm(f2.a(f2.j()), f2.j(), f2.f(), f2.l(), f2.k(), f2.g(), f2.h(), f2.i(), f2.e());
            } else {
                applicationDocumentTypeRealm = null;
            }
            arrayList2.add(new ApplicationMandatoryDocumentRealm(a4, i2, h3, j3, fileRealm, applicationDocumentTypeRealm, applicationMandatoryDocument.e()));
            it = it2;
            d0Var = d0Var3;
            u = str4;
            f = str3;
            r = str2;
            t = str;
        }
        String str6 = t;
        String str7 = r;
        String str8 = f;
        String str9 = u;
        d0Var2.addAll(arrayList2);
        CaseRealm caseRealm = new CaseRealm(l2, e, time, a2, p2, (String) null, n2, s, t, r, f, u, str5, j2, time2, d0Var, d0Var2, (String) null, (Date) null, (Date) null, 917536, (DefaultConstructorMarker) null);
        BaseCase baseCase2 = baseCase;
        if (baseCase2 instanceof TmgiCase) {
            TmgiCase tmgiCase = (TmgiCase) baseCase2;
            caseRealm.X0(tmgiCase.w());
            Calendar y = tmgiCase.y();
            caseRealm.v(y != null ? y.getTime() : null);
            Calendar x = tmgiCase.x();
            if (x != null) {
                date = x.getTime();
            }
            caseRealm.u(date);
        }
        return caseRealm;
    }

    public final List<ApplicationMandatoryDocument> a(Collection<ApplicationMandatoryDocumentDto> collection, String str) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10));
        for (ApplicationMandatoryDocumentDto a2 : collection) {
            arrayList.add(ApplicationMandatoryDocumentKt.a(a2, str));
        }
        return arrayList;
    }
}
