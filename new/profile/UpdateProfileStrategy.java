package hu.ekreta.ellenorzo.profile;

import hu.ekreta.ellenorzo.authentication.AuthenticationState;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.GroupDto;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.StudentDto;
import java.util.List;
import k.b.n;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&¨\u0006\f"}, d2 = {"Lhu/ekreta/ellenorzo/profile/UpdateProfileStrategy;", "", "updateProfile", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/authentication/AuthenticationState;", "newProfile", "Lhu/ekreta/ellenorzo/profile/Profile;", "studentDto", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/StudentDto;", "listOfGroupDto", "", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/GroupDto;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: UpdateProfileStrategy.kt */
public interface UpdateProfileStrategy {
    n<AuthenticationState> a(Profile profile, StudentDto studentDto, List<GroupDto> list);
}
