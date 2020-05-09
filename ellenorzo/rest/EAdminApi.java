package p289hu.ekreta.ellenorzo.rest;

import java.util.List;
import kotlin.Metadata;
import p289hu.ekreta.ellenorzo.rest.eadminapi.AddresseeTypeDto;
import p289hu.ekreta.ellenorzo.rest.eadminapi.CaseDto;
import p289hu.ekreta.ellenorzo.rest.eadminapi.ChildrenDto;
import p289hu.ekreta.ellenorzo.rest.eadminapi.CurrentInstitutionDetailsDto;
import p289hu.ekreta.ellenorzo.rest.eadminapi.DecisionPostDto;
import p289hu.ekreta.ellenorzo.rest.eadminapi.EmployeeDetailsDto;
import p289hu.ekreta.ellenorzo.rest.eadminapi.MailboxItemDto;
import p289hu.ekreta.ellenorzo.rest.eadminapi.MessageDto;
import p289hu.ekreta.ellenorzo.rest.eadminapi.SetMessageReadByUserRequestDto;
import p289hu.ekreta.ellenorzo.rest.eadminapi.SetMessageToBinByUserRequestDto;
import p289hu.ekreta.ellenorzo.rest.eadminapi.SignerDto;
import p289hu.ekreta.ellenorzo.rest.eadminapi.TmgiCasePostDto;
import p289hu.ekreta.ellenorzo.rest.eadminapi.TypeDto;
import p300k.p313b.C5027n;
import p353m.C5456h0;
import p353m.C5578x.C5580b;
import p380p.p385t.C5811a;
import p380p.p385t.C5812b;
import p380p.p385t.C5816f;
import p380p.p385t.C5819i;
import p380p.p385t.C5820j;
import p380p.p385t.C5821k;
import p380p.p385t.C5824n;
import p380p.p385t.C5826p;
import p380p.p385t.C5828r;
import p380p.p385t.C5829s;
import p380p.p385t.C5832v;
import p380p.p385t.C5833w;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH'J,\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\fH'J\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u000eH'J7\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u00112\u000e\b\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H'¢\u0006\u0002\u0010\u0015J\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0017\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u001e\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\"\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00032\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u001e\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00190\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J(\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00190\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010 \u001a\u00020\u0011H'J\u0018\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J(\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00190\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010&\u001a\u00020\u0006H'J\"\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00032\b\b\u0001\u0010)\u001a\u00020\u00142\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u001e\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00190\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J,\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010&\u001a\u00020-2\b\b\u0001\u0010.\u001a\u00020-H'J\u001e\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u00190\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u001e\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00190\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u00102\u001a\b\u0012\u0004\u0012\u00020-0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\"\u00103\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u00104\u001a\u000205H'J\"\u00106\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u00104\u001a\u000207H'J\"\u00108\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u00104\u001a\u000209H'¨\u0006:"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/EAdminApi;", "", "createAttachment", "Lio/reactivex/Observable;", "Lokhttp3/ResponseBody;", "authorizationHeader", "", "file", "Lokhttp3/MultipartBody$Part;", "createDecision", "caseId", "body", "Lhu/ekreta/ellenorzo/rest/eadminapi/DecisionPostDto;", "createTmgiCase", "Lhu/ekreta/ellenorzo/rest/eadminapi/TmgiCasePostDto;", "deleteMessagePermanently", "isDeleted", "", "mailBoxItemId", "", "", "(Ljava/lang/String;Z[Ljava/lang/Long;)Lio/reactivex/Observable;", "downloadAttachment", "url", "getAddresseeType", "", "Lhu/ekreta/ellenorzo/rest/eadminapi/AddresseeTypeDto;", "getCase", "Lhu/ekreta/ellenorzo/rest/eadminapi/CaseDto;", "getCaseTypes", "Lhu/ekreta/ellenorzo/rest/eadminapi/TypeDto;", "getCases", "avoidFilterClosedCases", "getChildrenData", "Lhu/ekreta/ellenorzo/rest/eadminapi/ChildrenDto;", "getCurrentInstitutionDetails", "Lhu/ekreta/ellenorzo/rest/eadminapi/CurrentInstitutionDetailsDto;", "getMandatoryDocumentTypes", "typeCode", "getMessage", "Lhu/ekreta/ellenorzo/rest/eadminapi/MailboxItemDto;", "mailboxItemId", "getMessages", "getSigner", "Lhu/ekreta/ellenorzo/rest/eadminapi/SignerDto;", "", "signerId", "getTeachers", "Lhu/ekreta/ellenorzo/rest/eadminapi/EmployeeDetailsDto;", "getTgmiCaseTypes", "getUnreadMessagesCount", "readMessage", "set", "Lhu/ekreta/ellenorzo/rest/eadminapi/SetMessageReadByUserRequestDto;", "sendMessage", "Lhu/ekreta/ellenorzo/rest/eadminapi/MessageDto;", "sendMessageToBin", "Lhu/ekreta/ellenorzo/rest/eadminapi/SetMessageToBinByUserRequestDto;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.rest.EAdminApi */
/* compiled from: EAdminApi.kt */
public interface EAdminApi {
    @C5820j({"X-Uzenet-Lokalizacio:hu-HU"})
    @C5821k
    @C5824n("ideiglenesfajlok")
    C5027n<C5456h0> createAttachment(@C5819i("Authorization") String str, @C5826p C5580b bVar);

    @C5820j({"X-Uzenet-Lokalizacio:hu-HU"})
    @C5824n("ugy/kerelmek/{ugyId}")
    C5027n<C5456h0> createDecision(@C5819i("Authorization") String str, @C5828r("ugyId") String str2, @C5811a DecisionPostDto decisionPostDto);

    @C5820j({"X-Uzenet-Lokalizacio:hu-HU"})
    @C5824n("ugy/kerelmek")
    C5027n<C5456h0> createTmgiCase(@C5819i("Authorization") String str, @C5811a TmgiCasePostDto tmgiCasePostDto);

    @C5812b("kommunikacio/postaladaelemek/torles")
    @C5820j({"X-Uzenet-Lokalizacio:hu-HU"})
    C5027n<C5456h0> deleteMessagePermanently(@C5819i("Authorization") String str, @C5829s("isKuka") boolean z, @C5829s("postaladaElemAzonositok") Long[] lArr);

    @C5820j({"X-Uzenet-Lokalizacio:hu-HU"})
    @C5816f
    @C5832v
    C5027n<C5456h0> downloadAttachment(@C5833w String str, @C5819i("Authorization") String str2);

    @C5816f("adatszotarak/cimzetttipusok")
    @C5820j({"X-Uzenet-Lokalizacio:hu-HU"})
    C5027n<List<AddresseeTypeDto>> getAddresseeType(@C5819i("Authorization") String str);

    @C5816f("ugy/kerelmek/{ugyId}")
    @C5820j({"X-Uzenet-Lokalizacio:hu-HU"})
    C5027n<CaseDto> getCase(@C5828r("ugyId") String str, @C5819i("Authorization") String str2);

    @C5816f("adatszotarak/kerelemtipusok")
    @C5820j({"X-Uzenet-Lokalizacio:hu-HU"})
    C5027n<List<TypeDto>> getCaseTypes(@C5819i("Authorization") String str);

    @C5816f("ugy/kerelmek")
    @C5820j({"X-Uzenet-Lokalizacio:hu-HU"})
    C5027n<List<CaseDto>> getCases(@C5819i("Authorization") String str, @C5829s("isLezartakIs") boolean z);

    @C5816f("kreta/gyerekemadatok")
    @C5820j({"X-Uzenet-Lokalizacio:hu-HU"})
    C5027n<ChildrenDto> getChildrenData(@C5819i("Authorization") String str);

    @C5816f("ugy/aktualisIntezmenyAdatok")
    @C5820j({"X-Uzenet-Lokalizacio:hu-HU"})
    C5027n<CurrentInstitutionDetailsDto> getCurrentInstitutionDetails(@C5819i("Authorization") String str);

    @C5816f("ugy/dokumentumok/kerelemkotelezodokumentumok/{ugyTipusKod}")
    @C5820j({"X-Uzenet-Lokalizacio:hu-HU"})
    C5027n<List<TypeDto>> getMandatoryDocumentTypes(@C5819i("Authorization") String str, @C5828r("ugyTipusKod") String str2);

    @C5816f("kommunikacio/postaladaelemek/{azonosito}")
    @C5820j({"X-Uzenet-Lokalizacio:hu-HU"})
    C5027n<MailboxItemDto> getMessage(@C5828r("azonosito") long j, @C5819i("Authorization") String str);

    @C5816f("kommunikacio/postaladaelemek/sajat")
    @C5820j({"X-Uzenet-Lokalizacio:hu-HU"})
    C5027n<List<MailboxItemDto>> getMessages(@C5819i("Authorization") String str);

    @C5816f("ugy/alkalmazott/{kerelemAzonosito}/{kretaAzonosito}")
    @C5820j({"X-Uzenet-Lokalizacio:hu-HU"})
    C5027n<SignerDto> getSigner(@C5819i("Authorization") String str, @C5828r("kerelemAzonosito") int i, @C5828r("kretaAzonosito") int i2);

    @C5816f("kreta/alkalmazottak/tanar")
    @C5820j({"X-Uzenet-Lokalizacio:hu-HU"})
    C5027n<List<EmployeeDetailsDto>> getTeachers(@C5819i("Authorization") String str);

    @C5816f("adatszotarak/tmgiigazolastipusok")
    @C5820j({"X-Uzenet-Lokalizacio:hu-HU"})
    C5027n<List<TypeDto>> getTgmiCaseTypes(@C5819i("Authorization") String str);

    @C5816f("kommunikacio/postaladaelemek/olvasatlanokszama")
    @C5820j({"X-Uzenet-Lokalizacio:hu-HU"})
    C5027n<Integer> getUnreadMessagesCount(@C5819i("Authorization") String str);

    @C5820j({"X-Uzenet-Lokalizacio:hu-HU"})
    @C5824n("kommunikacio/postaladaelemek/olvasott")
    C5027n<C5456h0> readMessage(@C5819i("Authorization") String str, @C5811a SetMessageReadByUserRequestDto setMessageReadByUserRequestDto);

    @C5820j({"X-Uzenet-Lokalizacio:hu-HU"})
    @C5824n("kommunikacio/uzenetek")
    C5027n<C5456h0> sendMessage(@C5819i("Authorization") String str, @C5811a MessageDto messageDto);

    @C5820j({"X-Uzenet-Lokalizacio:hu-HU"})
    @C5824n("kommunikacio/postaladaelemek/kuka")
    C5027n<C5456h0> sendMessageToBin(@C5819i("Authorization") String str, @C5811a SetMessageToBinByUserRequestDto setMessageToBinByUserRequestDto);
}
