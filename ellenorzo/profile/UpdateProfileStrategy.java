package p289hu.ekreta.ellenorzo.profile;

import java.util.List;
import kotlin.Metadata;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationState;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.GroupDto;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.StudentDto;
import p300k.p313b.C5027n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&¨\u0006\f"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/profile/UpdateProfileStrategy;", "", "updateProfile", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/authentication/AuthenticationState;", "newProfile", "Lhu/ekreta/ellenorzo/profile/Profile;", "studentDto", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/StudentDto;", "listOfGroupDto", "", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/GroupDto;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.profile.UpdateProfileStrategy */
/* compiled from: UpdateProfileStrategy.kt */
public interface UpdateProfileStrategy {
    /* renamed from: a */
    C5027n<AuthenticationState> mo14208a(Profile profile, StudentDto studentDto, List<GroupDto> list);
}
