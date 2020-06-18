package hu.ekreta.ellenorzo.profile;

import a.b.a.a.a;
import hu.ekreta.ellenorzo.rest.EAdminApi;
import hu.ekreta.ellenorzo.rest.MobileApiV3;
import hu.ekreta.ellenorzo.rest.MobileApiV3Kt;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.GroupDto;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.InstitutionDto;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.StudentDto;
import java.util.List;
import k.b.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J,\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J$\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\r0\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0019"}, d2 = {"Lhu/ekreta/ellenorzo/profile/ProfileServiceImpl;", "Lhu/ekreta/ellenorzo/profile/ProfileService;", "mobileApiV3", "Lhu/ekreta/ellenorzo/rest/MobileApiV3;", "eAdminApi", "Lhu/ekreta/ellenorzo/rest/EAdminApi;", "(Lhu/ekreta/ellenorzo/rest/MobileApiV3;Lhu/ekreta/ellenorzo/rest/EAdminApi;)V", "getEAdminApi", "()Lhu/ekreta/ellenorzo/rest/EAdminApi;", "getMobileApiV3", "()Lhu/ekreta/ellenorzo/rest/MobileApiV3;", "fetchClassMasters", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassMasterDto;", "instituteUrl", "", "accessToken", "uids", "fetchGroups", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/GroupDto;", "fetchInstitutes", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/InstitutionDto;", "fetchStudent", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/StudentDto;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: ProfileServiceImpl.kt */
public final class ProfileServiceImpl implements ProfileService {

    /* renamed from: a  reason: collision with root package name */
    public final MobileApiV3 f6029a;

    public ProfileServiceImpl(MobileApiV3 mobileApiV3, EAdminApi eAdminApi) {
        Intrinsics.checkParameterIsNotNull(mobileApiV3, "mobileApiV3");
        Intrinsics.checkParameterIsNotNull(eAdminApi, "eAdminApi");
        this.f6029a = mobileApiV3;
    }

    public n<List<GroupDto>> a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "instituteUrl");
        Intrinsics.checkParameterIsNotNull(str2, "accessToken");
        return this.f6029a.getGroups(a.a(str, "/ellenorzo/V3/Sajat/OsztalyCsoportok"), MobileApiV3Kt.getAsAuthorizationHeader(str2));
    }

    public n<InstitutionDto> b(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "instituteUrl");
        Intrinsics.checkParameterIsNotNull(str2, "accessToken");
        return this.f6029a.getInstitutes(a.a(str, "/ellenorzo/V3/Sajat/Intezmenyek"), MobileApiV3Kt.getAsAuthorizationHeader(str2));
    }

    public n<StudentDto> c(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "instituteUrl");
        Intrinsics.checkParameterIsNotNull(str2, "accessToken");
        return this.f6029a.getStudent(a.a(str, "/ellenorzo/V3/Sajat/TanuloAdatlap"), MobileApiV3Kt.getAsAuthorizationHeader(str2));
    }
}
