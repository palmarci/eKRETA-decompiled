package hu.ekreta.ellenorzo.rest;

import hu.ekreta.ellenorzo.rest.eadminapi.AddresseeTypeDto;
import hu.ekreta.ellenorzo.rest.eadminapi.CaseDto;
import hu.ekreta.ellenorzo.rest.eadminapi.ChildrenDto;
import hu.ekreta.ellenorzo.rest.eadminapi.CurrentInstitutionDetailsDto;
import hu.ekreta.ellenorzo.rest.eadminapi.DecisionPostDto;
import hu.ekreta.ellenorzo.rest.eadminapi.EmployeeDetailsDto;
import hu.ekreta.ellenorzo.rest.eadminapi.MailboxItemDto;
import hu.ekreta.ellenorzo.rest.eadminapi.MessageDto;
import hu.ekreta.ellenorzo.rest.eadminapi.SetMessageReadByUserRequestDto;
import hu.ekreta.ellenorzo.rest.eadminapi.SetMessageToBinByUserRequestDto;
import hu.ekreta.ellenorzo.rest.eadminapi.SignerDto;
import hu.ekreta.ellenorzo.rest.eadminapi.StatusDto;
import hu.ekreta.ellenorzo.rest.eadminapi.TemporaryFileDto;
import hu.ekreta.ellenorzo.rest.eadminapi.TmgiCasePostDto;
import hu.ekreta.ellenorzo.rest.eadminapi.TypeDto;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.GuardianDto;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.GuardianEAdminDto;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.KretaClassDto;
import java.util.List;
import kotlin.Metadata;
import m.h0;
import m.x;
import p.t.a;
import p.t.b;
import p.t.f;
import p.t.i;
import p.t.j;
import p.t.k;
import p.t.n;
import p.t.p;
import p.t.r;
import p.t.s;
import p.t.v;
import p.t.w;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH'J,\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\rH'J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u000fH'J7\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u00122\u000e\b\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H'¢\u0006\u0002\u0010\u0016J\"\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0018\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J(\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u001c\u001a\u00020\u0006H'J(\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001a0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u001f\u001a\u00020\u0015H'J\u001e\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001a0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u001e\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u001a0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u001e\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u001a0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u001e\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u001a0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\"\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u001e\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u001a0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J(\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u001a0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010+\u001a\u00020\u0012H'J\u0018\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u001e\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u001a0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u001e\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u001a0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J(\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u001a0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u00103\u001a\u00020\u0006H'J\"\u00104\u001a\b\u0012\u0004\u0012\u0002050\u00032\b\b\u0001\u00106\u001a\u00020\u00152\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u001e\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u001a0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J,\u00108\u001a\b\u0012\u0004\u0012\u0002090\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u00103\u001a\u00020:2\b\b\u0001\u0010;\u001a\u00020:H'J\u0018\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u001e\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0\u001a0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u001e\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u001a0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u001e\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u001a0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010B\u001a\b\u0012\u0004\u0012\u00020:0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\"\u0010C\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010D\u001a\u00020EH'J\"\u0010F\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010D\u001a\u00020GH'J\"\u0010H\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010D\u001a\u00020IH'¨\u0006J"}, d2 = {"Lhu/ekreta/ellenorzo/rest/EAdminApi;", "", "createAttachment", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/rest/eadminapi/TemporaryFileDto;", "authorizationHeader", "", "file", "Lokhttp3/MultipartBody$Part;", "createDecision", "Lokhttp3/ResponseBody;", "caseId", "body", "Lhu/ekreta/ellenorzo/rest/eadminapi/DecisionPostDto;", "createTmgiCase", "Lhu/ekreta/ellenorzo/rest/eadminapi/TmgiCasePostDto;", "deleteMessagePermanently", "isDeleted", "", "mailBoxItemId", "", "", "(Ljava/lang/String;Z[Ljava/lang/Long;)Lio/reactivex/Observable;", "downloadAttachment", "url", "getAddressableClasses", "", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/KretaClassDto;", "addressedCode", "getAddressableGuardiansForClass", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/GuardianEAdminDto;", "classId", "getAddressableSzmkRepesentative", "getAddressableType", "Lhu/ekreta/ellenorzo/rest/eadminapi/AddresseeTypeDto;", "getAddresseeType", "getAdministrators", "Lhu/ekreta/ellenorzo/rest/eadminapi/EmployeeDetailsDto;", "getCase", "Lhu/ekreta/ellenorzo/rest/eadminapi/CaseDto;", "getCaseTypes", "Lhu/ekreta/ellenorzo/rest/eadminapi/TypeDto;", "getCases", "avoidFilterClosedCases", "getChildrenData", "Lhu/ekreta/ellenorzo/rest/eadminapi/ChildrenDto;", "getClassMasters", "getCurrentInstitutionDetails", "Lhu/ekreta/ellenorzo/rest/eadminapi/CurrentInstitutionDetailsDto;", "getDirectors", "getMandatoryDocumentTypes", "typeCode", "getMessage", "Lhu/ekreta/ellenorzo/rest/eadminapi/MailboxItemDto;", "mailboxItemId", "getMessages", "getSigner", "Lhu/ekreta/ellenorzo/rest/eadminapi/SignerDto;", "", "signerId", "getStatus", "Lhu/ekreta/ellenorzo/rest/eadminapi/StatusDto;", "getSzmk", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/GuardianDto;", "getTeachers", "getTgmiCaseTypes", "getUnreadMessagesCount", "readMessage", "set", "Lhu/ekreta/ellenorzo/rest/eadminapi/SetMessageReadByUserRequestDto;", "sendMessage", "Lhu/ekreta/ellenorzo/rest/eadminapi/MessageDto;", "sendMessageToBin", "Lhu/ekreta/ellenorzo/rest/eadminapi/SetMessageToBinByUserRequestDto;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: EAdminApi.kt */
public interface EAdminApi {
    @j({"X-Uzenet-Lokalizacio:hu-HU"})
    @k
    @n("ideiglenesfajlok")
    k.b.n<TemporaryFileDto> createAttachment(@i("Authorization") String str, @p x.b bVar);

    @j({"X-Uzenet-Lokalizacio:hu-HU"})
    @n("ugy/kerelmek/{ugyId}")
    k.b.n<h0> createDecision(@i("Authorization") String str, @r("ugyId") String str2, @a DecisionPostDto decisionPostDto);

    @j({"X-Uzenet-Lokalizacio:hu-HU"})
    @n("ugy/kerelmek")
    k.b.n<h0> createTmgiCase(@i("Authorization") String str, @a TmgiCasePostDto tmgiCasePostDto);

    @b("kommunikacio/postaladaelemek/torles")
    @j({"X-Uzenet-Lokalizacio:hu-HU"})
    k.b.n<h0> deleteMessagePermanently(@i("Authorization") String str, @s("isKuka") boolean z, @s("postaladaElemAzonositok") Long[] lArr);

    @j({"X-Uzenet-Lokalizacio:hu-HU"})
    @f
    @v
    k.b.n<h0> downloadAttachment(@w String str, @i("Authorization") String str2);

    @f("kommunikacio/osztalyok/cimezheto")
    @j({"X-Uzenet-Lokalizacio:hu-HU"})
    k.b.n<List<KretaClassDto>> getAddressableClasses(@i("Authorization") String str, @s("cimzettKod") String str2);

    @f("kreta/gondviselok/osztaly/{osztalyKretaAzonosito}")
    @j({"X-Uzenet-Lokalizacio:hu-HU"})
    k.b.n<List<GuardianEAdminDto>> getAddressableGuardiansForClass(@i("Authorization") String str, @r("osztalyKretaAzonosito") long j2);

    @f("kommunikacio/szmkkepviselok/cimezheto")
    @j({"X-Uzenet-Lokalizacio:hu-HU"})
    k.b.n<List<GuardianEAdminDto>> getAddressableSzmkRepesentative(@i("Authorization") String str);

    @f("kommunikacio/cimezhetotipusok")
    @j({"X-Uzenet-Lokalizacio:hu-HU"})
    k.b.n<List<AddresseeTypeDto>> getAddressableType(@i("Authorization") String str);

    @f("adatszotarak/cimzetttipusok")
    @j({"X-Uzenet-Lokalizacio:hu-HU"})
    k.b.n<List<AddresseeTypeDto>> getAddresseeType(@i("Authorization") String str);

    @f("kreta/alkalmazottak/adminisztrator")
    @j({"X-Uzenet-Lokalizacio:hu-HU"})
    k.b.n<List<EmployeeDetailsDto>> getAdministrators(@i("Authorization") String str);

    @f("ugy/kerelmek/{ugyId}")
    @j({"X-Uzenet-Lokalizacio:hu-HU"})
    k.b.n<CaseDto> getCase(@r("ugyId") String str, @i("Authorization") String str2);

    @f("adatszotarak/kerelemtipusok")
    @j({"X-Uzenet-Lokalizacio:hu-HU"})
    k.b.n<List<TypeDto>> getCaseTypes(@i("Authorization") String str);

    @f("ugy/kerelmek")
    @j({"X-Uzenet-Lokalizacio:hu-HU"})
    k.b.n<List<CaseDto>> getCases(@i("Authorization") String str, @s("isLezartakIs") boolean z);

    @f("kreta/gyerekemadatok")
    @j({"X-Uzenet-Lokalizacio:hu-HU"})
    k.b.n<ChildrenDto> getChildrenData(@i("Authorization") String str);

    @f("kreta/alkalmazottak/oszalyfonok")
    @j({"X-Uzenet-Lokalizacio:hu-HU"})
    k.b.n<List<EmployeeDetailsDto>> getClassMasters(@i("Authorization") String str);

    @f("ugy/aktualisIntezmenyAdatok")
    @j({"X-Uzenet-Lokalizacio:hu-HU"})
    k.b.n<CurrentInstitutionDetailsDto> getCurrentInstitutionDetails(@i("Authorization") String str);

    @f("kreta/alkalmazottak/igazgatosag")
    @j({"X-Uzenet-Lokalizacio:hu-HU"})
    k.b.n<List<EmployeeDetailsDto>> getDirectors(@i("Authorization") String str);

    @f("ugy/dokumentumok/kerelemkotelezodokumentumok/{ugyTipusKod}")
    @j({"X-Uzenet-Lokalizacio:hu-HU"})
    k.b.n<List<TypeDto>> getMandatoryDocumentTypes(@i("Authorization") String str, @r("ugyTipusKod") String str2);

    @f("kommunikacio/postaladaelemek/{azonosito}")
    @j({"X-Uzenet-Lokalizacio:hu-HU"})
    k.b.n<MailboxItemDto> getMessage(@r("azonosito") long j2, @i("Authorization") String str);

    @f("kommunikacio/postaladaelemek/sajat")
    @j({"X-Uzenet-Lokalizacio:hu-HU"})
    k.b.n<List<MailboxItemDto>> getMessages(@i("Authorization") String str);

    @f("ugy/alkalmazott/{kerelemAzonosito}/{kretaAzonosito}")
    @j({"X-Uzenet-Lokalizacio:hu-HU"})
    k.b.n<SignerDto> getSigner(@i("Authorization") String str, @r("kerelemAzonosito") int i2, @r("kretaAzonosito") int i3);

    @f("status")
    @j({"X-Uzenet-Lokalizacio:hu-HU"})
    k.b.n<StatusDto> getStatus(@i("Authorization") String str);

    @f("kommunikacio/szmkkepviselok/cimezheto")
    @j({"X-Uzenet-Lokalizacio:hu-HU"})
    k.b.n<List<GuardianDto>> getSzmk(@i("Authorization") String str);

    @f("kreta/alkalmazottak/tanar")
    @j({"X-Uzenet-Lokalizacio:hu-HU"})
    k.b.n<List<EmployeeDetailsDto>> getTeachers(@i("Authorization") String str);

    @f("adatszotarak/tmgiigazolastipusok")
    @j({"X-Uzenet-Lokalizacio:hu-HU"})
    k.b.n<List<TypeDto>> getTgmiCaseTypes(@i("Authorization") String str);

    @f("kommunikacio/postaladaelemek/olvasatlanokszama")
    @j({"X-Uzenet-Lokalizacio:hu-HU"})
    k.b.n<Integer> getUnreadMessagesCount(@i("Authorization") String str);

    @j({"X-Uzenet-Lokalizacio:hu-HU"})
    @n("kommunikacio/postaladaelemek/olvasott")
    k.b.n<h0> readMessage(@i("Authorization") String str, @a SetMessageReadByUserRequestDto setMessageReadByUserRequestDto);

    @j({"X-Uzenet-Lokalizacio:hu-HU"})
    @n("kommunikacio/uzenetek")
    k.b.n<h0> sendMessage(@i("Authorization") String str, @a MessageDto messageDto);

    @j({"X-Uzenet-Lokalizacio:hu-HU"})
    @n("kommunikacio/postaladaelemek/kuka")
    k.b.n<h0> sendMessageToBin(@i("Authorization") String str, @a SetMessageToBinByUserRequestDto setMessageToBinByUserRequestDto);
}
