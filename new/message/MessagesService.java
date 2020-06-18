package hu.ekreta.ellenorzo.message;

import hu.ekreta.ellenorzo.rest.eadminapi.CurrentInstitutionDetailsDto;
import k.b.n;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lhu/ekreta/ellenorzo/message/MessagesService;", "", "fetchCurrentInstitutionDetails", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/rest/eadminapi/CurrentInstitutionDetailsDto;", "accessToken", "", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: MessagesService.kt */
public interface MessagesService {
    n<CurrentInstitutionDetailsDto> a(String str);
}
