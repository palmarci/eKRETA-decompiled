package hu.ekreta.ellenorzo.profile;

import hu.ekreta.ellenorzo.rest.mobileapi.v3.GroupDto;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.InstitutionDto;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.StudentDto;
import java.util.List;
import k.b.n;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H&J$\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\u0010"}, d2 = {"Lhu/ekreta/ellenorzo/profile/ProfileService;", "", "fetchClassMasters", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassMasterDto;", "instituteUrl", "", "accessToken", "uids", "fetchGroups", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/GroupDto;", "fetchInstitutes", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/InstitutionDto;", "fetchStudent", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/StudentDto;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: ProfileService.kt */
public interface ProfileService {
    n<List<GroupDto>> a(String str, String str2);

    n<InstitutionDto> b(String str, String str2);

    n<StudentDto> c(String str, String str2);
}
