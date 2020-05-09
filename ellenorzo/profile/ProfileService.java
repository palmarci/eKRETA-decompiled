package p289hu.ekreta.ellenorzo.profile;

import java.util.List;
import kotlin.Metadata;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.GroupDto;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.InstitutionDto;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.StudentDto;
import p300k.p313b.C5027n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H&J$\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\u0010"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/profile/ProfileService;", "", "getClassMasters", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassMasterDto;", "instituteUrl", "", "accessToken", "uids", "getGroups", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/GroupDto;", "getInstitutes", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/InstitutionDto;", "getStudent", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/StudentDto;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.profile.ProfileService */
/* compiled from: ProfileService.kt */
public interface ProfileService {
    C5027n<List<GroupDto>> getGroups(String str, String str2);

    C5027n<InstitutionDto> getInstitutes(String str, String str2);

    C5027n<StudentDto> getStudent(String str, String str2);
}
