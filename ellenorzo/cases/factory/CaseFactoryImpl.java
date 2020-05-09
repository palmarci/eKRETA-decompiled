package p289hu.ekreta.ellenorzo.cases.factory;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.attachment.Attachment;
import p289hu.ekreta.ellenorzo.attachment.AttachmentRealm;
import p289hu.ekreta.ellenorzo.cases.BaseCase;
import p289hu.ekreta.ellenorzo.cases.CaseRealm;
import p289hu.ekreta.ellenorzo.cases.subModels.ApplicationDocumentType;
import p289hu.ekreta.ellenorzo.cases.subModels.ApplicationMandatoryDocument;
import p289hu.ekreta.ellenorzo.cases.subModels.ApplicationMandatoryDocumentKt;
import p289hu.ekreta.ellenorzo.cases.subModels.CaseType.Code;
import p289hu.ekreta.ellenorzo.cases.subModels.CaseType.Code.Companion;
import p289hu.ekreta.ellenorzo.cases.subModels.File;
import p289hu.ekreta.ellenorzo.cases.subModels.State.StateType;
import p289hu.ekreta.ellenorzo.cases.subRealmModels.ApplicationDocumentTypeRealm;
import p289hu.ekreta.ellenorzo.cases.subRealmModels.ApplicationMandatoryDocumentRealm;
import p289hu.ekreta.ellenorzo.cases.subRealmModels.ApplicationMandatoryDocumentRealmKt;
import p289hu.ekreta.ellenorzo.cases.subRealmModels.FileRealm;
import p289hu.ekreta.ellenorzo.cases.tmgi.TmgiCase;
import p289hu.ekreta.ellenorzo.rest.eadminapi.AdministratorDto;
import p289hu.ekreta.ellenorzo.rest.eadminapi.ApplicationMandatoryDocumentDto;
import p289hu.ekreta.ellenorzo.rest.eadminapi.AttachmentDto;
import p289hu.ekreta.ellenorzo.rest.eadminapi.CaseDto;
import p289hu.ekreta.ellenorzo.rest.eadminapi.DecisionDto;
import p289hu.ekreta.ellenorzo.rest.eadminapi.FiledApplicationDto;
import p289hu.ekreta.ellenorzo.rest.eadminapi.TypeDto;
import p289hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import p300k.p340c.C5065d0;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0016J;\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00100\u000f\"\u0004\b\u0000\u0010\u0011\"\u0006\b\u0001\u0010\u0010\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00110\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u00100\u0014H\bJ \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016*\b\u0012\u0004\u0012\u00020\u00180\u00122\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0016*\b\u0012\u0004\u0012\u00020\u001b0\u00122\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u001c"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/factory/CaseFactoryImpl;", "Lhu/ekreta/ellenorzo/cases/factory/CaseFactory;", "()V", "fromApiModel", "Lhu/ekreta/ellenorzo/cases/BaseCase;", "profileId", "", "caseDto", "Lhu/ekreta/ellenorzo/rest/eadminapi/CaseDto;", "fromRealmModel", "caseRealm", "Lhu/ekreta/ellenorzo/cases/CaseRealm;", "toRealmModel", "model", "asRealmList", "Lio/realm/RealmList;", "R", "T", "", "transform", "Lkotlin/Function1;", "toApplicationMandatoryDocuments", "", "Lhu/ekreta/ellenorzo/cases/subModels/ApplicationMandatoryDocument;", "Lhu/ekreta/ellenorzo/rest/eadminapi/ApplicationMandatoryDocumentDto;", "toAttachments", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "Lhu/ekreta/ellenorzo/rest/eadminapi/AttachmentDto;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.factory.CaseFactoryImpl */
/* compiled from: CaseFactoryImpl.kt */
public final class CaseFactoryImpl implements CaseFactory {

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.cases.factory.CaseFactoryImpl$WhenMappings */
    public final /* synthetic */ class WhenMappings {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11511a = new int[Code.values().length];

        /* renamed from: b */
        public static final /* synthetic */ int[] f11512b = new int[Code.values().length];

        static {
            f11511a[Code.VERIFICATION_BY_PARENT.ordinal()] = 1;
            f11512b[Code.VERIFICATION_BY_PARENT.ordinal()] = 1;
        }
    }

    /* renamed from: a */
    public BaseCase mo11851a(CaseRealm caseRealm) {
        Intrinsics.checkParameterIsNotNull(caseRealm, "caseRealm");
        Companion companion = Code.Companion;
        String u2 = caseRealm.mo11661u2();
        if (u2 == null) {
            u2 = "";
        }
        if (WhenMappings.f11511a[companion.mo11931a(u2).ordinal()] != 1) {
            String k2 = caseRealm.mo11642k2();
            if (k2 == null) {
                Intrinsics.throwNpe();
            }
            String h2 = caseRealm.mo11638h2();
            if (h2 == null) {
                Intrinsics.throwNpe();
            }
            Calendar b = UtilsKt.m14838b(caseRealm.mo11650o2());
            if (b == null) {
                Intrinsics.throwNpe();
            }
            Calendar b2 = UtilsKt.m14838b(caseRealm.mo11641j2());
            StateType.Companion companion2 = StateType.Companion;
            String p2 = caseRealm.mo11651p2();
            if (p2 == null) {
                Intrinsics.throwNpe();
            }
            StateType a = companion2.mo12022a(p2);
            String q2 = caseRealm.mo11652q2();
            if (q2 == null) {
                Intrinsics.throwNpe();
            }
            String u22 = caseRealm.mo11661u2();
            if (u22 == null) {
                Intrinsics.throwNpe();
            }
            String v2 = caseRealm.mo11663v2();
            if (v2 == null) {
                Intrinsics.throwNpe();
            }
            String g2 = caseRealm.mo11637g2();
            String s2 = caseRealm.mo11657s2();
            String t2 = caseRealm.mo11659t2();
            String r2 = caseRealm.mo11654r2();
            String d2 = caseRealm.mo11630d2();
            String l2 = caseRealm.mo11644l2();
            C5065d0<AttachmentRealm> f2 = caseRealm.mo11635f2();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(f2, 10));
            for (AttachmentRealm a2 : f2) {
                arrayList.add(C3984v.m10153a(a2));
            }
            C5065d0<ApplicationMandatoryDocumentRealm> e2 = caseRealm.mo11633e2();
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(e2, 10));
            for (ApplicationMandatoryDocumentRealm a3 : e2) {
                arrayList2.add(ApplicationMandatoryDocumentRealmKt.m11168a(a3));
            }
            BaseCase baseCase = new BaseCase(k2, h2, b, b2, a, q2, u22, v2, g2, s2, t2, r2, d2, l2, null, arrayList, arrayList2, null, 131072, null);
            return baseCase;
        }
        String k22 = caseRealm.mo11642k2();
        if (k22 == null) {
            Intrinsics.throwNpe();
        }
        String h22 = caseRealm.mo11638h2();
        if (h22 == null) {
            Intrinsics.throwNpe();
        }
        Calendar b3 = UtilsKt.m14838b(caseRealm.mo11650o2());
        if (b3 == null) {
            Intrinsics.throwNpe();
        }
        Calendar b4 = UtilsKt.m14838b(caseRealm.mo11641j2());
        StateType.Companion companion3 = StateType.Companion;
        String p22 = caseRealm.mo11651p2();
        if (p22 == null) {
            Intrinsics.throwNpe();
        }
        StateType a4 = companion3.mo12022a(p22);
        String q22 = caseRealm.mo11652q2();
        if (q22 == null) {
            Intrinsics.throwNpe();
        }
        String u23 = caseRealm.mo11661u2();
        if (u23 == null) {
            Intrinsics.throwNpe();
        }
        String v22 = caseRealm.mo11663v2();
        if (v22 == null) {
            Intrinsics.throwNpe();
        }
        String g22 = caseRealm.mo11637g2();
        String s22 = caseRealm.mo11657s2();
        String t22 = caseRealm.mo11659t2();
        String r22 = caseRealm.mo11654r2();
        String d22 = caseRealm.mo11630d2();
        String l22 = caseRealm.mo11644l2();
        C5065d0<AttachmentRealm> f22 = caseRealm.mo11635f2();
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(f22, 10));
        for (AttachmentRealm a5 : f22) {
            arrayList3.add(C3984v.m10153a(a5));
        }
        String i2 = caseRealm.mo11640i2();
        Calendar b5 = UtilsKt.m14838b(caseRealm.mo11647n2());
        Calendar b6 = UtilsKt.m14838b(caseRealm.mo11645m2());
        C5065d0<ApplicationMandatoryDocumentRealm> e22 = caseRealm.mo11633e2();
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(e22, 10));
        for (ApplicationMandatoryDocumentRealm a6 : e22) {
            arrayList4.add(ApplicationMandatoryDocumentRealmKt.m11168a(a6));
        }
        TmgiCase tmgiCase = new TmgiCase(k22, h22, b3, b4, a4, q22, u23, v22, g22, s22, t22, r22, d22, l22, null, arrayList3, i2, b5, b6, arrayList4, null, 1048576, null);
        return tmgiCase;
    }

    /* renamed from: b */
    public final List<Attachment> mo11855b(Collection<AttachmentDto> collection, String str) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10));
        for (AttachmentDto a : collection) {
            arrayList.add(C3984v.m10154a(a, str));
        }
        return arrayList;
    }

    /* renamed from: a */
    public BaseCase mo11852a(String str, CaseDto caseDto) {
        List list;
        List list2;
        String str2 = str;
        Intrinsics.checkParameterIsNotNull(str2, "profileId");
        Intrinsics.checkParameterIsNotNull(caseDto, "caseDto");
        Integer num = null;
        if (WhenMappings.f11512b[Code.Companion.mo11931a(caseDto.getType().getCode()).ordinal()] != 1) {
            String valueOf = String.valueOf(caseDto.getId());
            Calendar sentDate = caseDto.getSentDate();
            Calendar lastModificationDate = caseDto.getLastModificationDate();
            StateType a = StateType.Companion.mo12022a(caseDto.getState().getCode());
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
            List attachments = caseDto.getAttachments();
            List b = attachments != null ? mo11855b(attachments, str2) : CollectionsKt__CollectionsKt.emptyList();
            List applicationMandatoryDocument = caseDto.getApplicationMandatoryDocument();
            List a2 = applicationMandatoryDocument != null ? mo11854a((Collection<ApplicationMandatoryDocumentDto>) applicationMandatoryDocument, str2) : CollectionsKt__CollectionsKt.emptyList();
            List<DecisionDto> decisions = caseDto.getDecisions();
            if (decisions != null) {
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(decisions, 10));
                for (DecisionDto a3 : decisions) {
                    arrayList.add(C3984v.m10156a(a3, str2));
                }
                list2 = arrayList;
            } else {
                list2 = CollectionsKt__CollectionsKt.emptyList();
            }
            BaseCase baseCase = new BaseCase(str, valueOf, sentDate, lastModificationDate, a, description, code, name, documentNumber, studentFamilyName, studentFirstName, studentEducationId, shortName, reason, valueOf2, b, a2, list2);
            return baseCase;
        }
        String valueOf3 = String.valueOf(caseDto.getId());
        Calendar sentDate2 = caseDto.getSentDate();
        Calendar lastModificationDate2 = caseDto.getLastModificationDate();
        StateType a4 = StateType.Companion.mo12022a(caseDto.getState().getCode());
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
        List attachments2 = caseDto.getAttachments();
        List b2 = attachments2 != null ? mo11855b(attachments2, str2) : CollectionsKt__CollectionsKt.emptyList();
        TypeDto justificationType = caseDto.getJustificationType();
        String name3 = justificationType != null ? justificationType.getName() : null;
        Calendar requestedAbsenceStart = caseDto.getRequestedAbsenceStart();
        Calendar requestedAbsenceEnd = caseDto.getRequestedAbsenceEnd();
        List applicationMandatoryDocument2 = caseDto.getApplicationMandatoryDocument();
        List a5 = applicationMandatoryDocument2 != null ? mo11854a((Collection<ApplicationMandatoryDocumentDto>) applicationMandatoryDocument2, str2) : CollectionsKt__CollectionsKt.emptyList();
        List<DecisionDto> decisions2 = caseDto.getDecisions();
        if (decisions2 != null) {
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(decisions2, 10));
            for (DecisionDto a6 : decisions2) {
                arrayList2.add(C3984v.m10156a(a6, str2));
            }
            list = arrayList2;
        } else {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        TmgiCase tmgiCase = new TmgiCase(str, valueOf3, sentDate2, lastModificationDate2, a4, description2, code2, name2, documentNumber2, studentFamilyName2, studentFirstName2, studentEducationId2, shortName2, reason2, valueOf4, b2, name3, requestedAbsenceStart, requestedAbsenceEnd, a5, list);
        return tmgiCase;
    }

    /* renamed from: a */
    public CaseRealm mo11853a(BaseCase baseCase) {
        String str;
        String str2;
        String str3;
        String str4;
        FileRealm fileRealm;
        ApplicationDocumentTypeRealm applicationDocumentTypeRealm;
        Intrinsics.checkParameterIsNotNull(baseCase, "model");
        String e = baseCase.mo11318e();
        String l = baseCase.mo11585l();
        Date time = baseCase.mo11588o().getTime();
        Calendar m = baseCase.mo11586m();
        Date date = null;
        Date time2 = m != null ? m.getTime() : null;
        String a = baseCase.mo11590q().mo12021a();
        String p = baseCase.mo11589p();
        String j = baseCase.mo11583j();
        String u = baseCase.mo11594u();
        String v = baseCase.mo11595v();
        String s = baseCase.mo11592s();
        String t = baseCase.mo11593t();
        String r = baseCase.mo11591r();
        String f = baseCase.mo11578f();
        String n = baseCase.mo11587n();
        List<Attachment> h = baseCase.mo11580h();
        C5065d0 d0Var = new C5065d0();
        String str5 = v;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(h, 10));
        for (Attachment a2 : h) {
            arrayList.add(C3984v.m10155a(a2));
        }
        d0Var.addAll(arrayList);
        List g = baseCase.mo11579g();
        C5065d0 d0Var2 = new C5065d0();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(g, 10));
        Iterator it = g.iterator();
        while (it.hasNext()) {
            ApplicationMandatoryDocument applicationMandatoryDocument = (ApplicationMandatoryDocument) it.next();
            Iterator it2 = it;
            Intrinsics.checkParameterIsNotNull(applicationMandatoryDocument, "$this$toApplicationMandatoryDocumentRealm");
            C5065d0 d0Var3 = d0Var;
            String a3 = applicationMandatoryDocument.mo11903a((Object) applicationMandatoryDocument.mo11911i());
            Integer i = applicationMandatoryDocument.mo11911i();
            String h2 = applicationMandatoryDocument.mo11909h();
            String j2 = applicationMandatoryDocument.mo11912j();
            File g2 = applicationMandatoryDocument.mo11908g();
            if (g2 != null) {
                str4 = u;
                Intrinsics.checkParameterIsNotNull(g2, "$this$toFileRealm");
                str3 = f;
                str2 = r;
                str = t;
                fileRealm = new FileRealm(g2.mo11963a(g2.mo11966f()), g2.mo11966f(), g2.mo11967g(), g2.mo11318e());
            } else {
                str = t;
                str2 = r;
                str3 = f;
                str4 = u;
                fileRealm = null;
            }
            ApplicationDocumentType f2 = applicationMandatoryDocument.mo11907f();
            if (f2 != null) {
                Intrinsics.checkParameterIsNotNull(f2, "$this$toApplicationDocumentTypeRealm");
                ApplicationDocumentTypeRealm applicationDocumentTypeRealm2 = new ApplicationDocumentTypeRealm(f2.mo11887a(f2.mo11895j()), f2.mo11895j(), f2.mo11890f(), f2.mo11897l(), f2.mo11896k(), f2.mo11891g(), f2.mo11892h(), f2.mo11894i(), f2.mo11318e());
                applicationDocumentTypeRealm = applicationDocumentTypeRealm2;
            } else {
                applicationDocumentTypeRealm = null;
            }
            ApplicationMandatoryDocumentRealm applicationMandatoryDocumentRealm = new ApplicationMandatoryDocumentRealm(a3, i, h2, j2, fileRealm, applicationDocumentTypeRealm, applicationMandatoryDocument.mo11318e());
            arrayList2.add(applicationMandatoryDocumentRealm);
            it = it2;
            d0Var = d0Var3;
            u = str4;
            f = str3;
            r = str2;
            t = str;
        }
        C5065d0 d0Var4 = d0Var;
        String str6 = t;
        String str7 = r;
        String str8 = f;
        String str9 = u;
        d0Var2.addAll(arrayList2);
        CaseRealm caseRealm = new CaseRealm(l, e, time, a, p, null, n, s, t, r, f, u, str5, j, time2, d0Var4, d0Var2, null, null, null, 917536, null);
        BaseCase baseCase2 = baseCase;
        if (baseCase2 instanceof TmgiCase) {
            TmgiCase tmgiCase = (TmgiCase) baseCase2;
            caseRealm.mo11620X0(tmgiCase.mo12107w());
            Calendar y = tmgiCase.mo12109y();
            caseRealm.mo11662v(y != null ? y.getTime() : null);
            Calendar x = tmgiCase.mo12108x();
            if (x != null) {
                date = x.getTime();
            }
            caseRealm.mo11660u(date);
        }
        return caseRealm;
    }

    /* renamed from: a */
    public final List<ApplicationMandatoryDocument> mo11854a(Collection<ApplicationMandatoryDocumentDto> collection, String str) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10));
        for (ApplicationMandatoryDocumentDto a : collection) {
            arrayList.add(ApplicationMandatoryDocumentKt.m11059a(a, str));
        }
        return arrayList;
    }
}
