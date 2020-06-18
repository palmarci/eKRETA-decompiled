package hu.ekreta.ellenorzo.message;

import hu.ekreta.ellenorzo.rest.EAdminApi;
import hu.ekreta.ellenorzo.rest.MobileApiV3Kt;
import hu.ekreta.ellenorzo.rest.eadminapi.CurrentInstitutionDetailsDto;
import k.b.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lhu/ekreta/ellenorzo/message/MessagesServiceImpl;", "Lhu/ekreta/ellenorzo/message/MessagesService;", "eAdminApi", "Lhu/ekreta/ellenorzo/rest/EAdminApi;", "(Lhu/ekreta/ellenorzo/rest/EAdminApi;)V", "getEAdminApi", "()Lhu/ekreta/ellenorzo/rest/EAdminApi;", "fetchCurrentInstitutionDetails", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/rest/eadminapi/CurrentInstitutionDetailsDto;", "accessToken", "", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: MessagesServiceImpl.kt */
public final class MessagesServiceImpl implements MessagesService {

    /* renamed from: a  reason: collision with root package name */
    public final EAdminApi f5808a;

    public MessagesServiceImpl(EAdminApi eAdminApi) {
        Intrinsics.checkParameterIsNotNull(eAdminApi, "eAdminApi");
        this.f5808a = eAdminApi;
    }

    public n<CurrentInstitutionDetailsDto> a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "accessToken");
        return this.f5808a.getCurrentInstitutionDetails(MobileApiV3Kt.getAsAuthorizationHeader(str));
    }
}
